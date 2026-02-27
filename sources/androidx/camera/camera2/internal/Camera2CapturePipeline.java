package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture;
import androidx.camera.camera2.internal.compat.workaround.UseFlashModeTorchFor3aUpdate;
import androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraCaptureResults;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ConvergenceUtils;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
class Camera2CapturePipeline {
    private static final String TAG = "Camera2CapturePipeline";

    @NonNull
    private final Camera2CameraControlImpl mCameraControl;

    @NonNull
    private final Quirks mCameraQuirk;

    @NonNull
    private final Executor mExecutor;
    private final boolean mHasFlashUnit;
    private final boolean mIsLegacyDevice;

    @NonNull
    private final ScheduledExecutorService mScheduler;
    private int mTemplate = 1;

    @NonNull
    private final UseTorchAsFlash mUseTorchAsFlash;

    public static class AePreCaptureTask implements PipelineTask {
        private final Camera2CameraControlImpl mCameraControl;
        private final int mFlashMode;
        private boolean mIsExecuted = false;
        private final OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;

        public AePreCaptureTask(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, int i, @NonNull OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mFlashMode = i;
            this.mOverrideAeModeForStillCapture = overrideAeModeForStillCapture;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$preCapture$0(CallbackToFutureAdapter.Completer completer) throws Exception {
            this.mCameraControl.getFocusMeteringControl().lambda$triggerAePrecapture$2(completer);
            this.mOverrideAeModeForStillCapture.onAePrecaptureStarted();
            return "AePreCapture";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean lambda$preCapture$1(Void r02) {
            return Boolean.TRUE;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return this.mFlashMode == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                Logger.d(Camera2CapturePipeline.TAG, "cancel TriggerAePreCapture");
                this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
                this.mOverrideAeModeForStillCapture.onAePrecaptureFinished();
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        @NonNull
        public S1.y preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
            if (!Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult)) {
                return Futures.immediateFuture(Boolean.FALSE);
            }
            Logger.d(Camera2CapturePipeline.TAG, "Trigger AE");
            this.mIsExecuted = true;
            return FutureChain.from(CallbackToFutureAdapter.getFuture(new C0736t(this, 0))).transform(new C0737u(0), CameraXExecutors.directExecutor());
        }
    }

    public static class AfTask implements PipelineTask {
        private final Camera2CameraControlImpl mCameraControl;
        private boolean mIsExecuted = false;

        public AfTask(@NonNull Camera2CameraControlImpl camera2CameraControlImpl) {
            this.mCameraControl = camera2CameraControlImpl;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return true;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                Logger.d(Camera2CapturePipeline.TAG, "cancel TriggerAF");
                this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(true, false);
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        @NonNull
        public S1.y preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
            Integer num;
            int iIntValue;
            S1.y yVarImmediateFuture = Futures.immediateFuture(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
                Logger.d(Camera2CapturePipeline.TAG, "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    Logger.d(Camera2CapturePipeline.TAG, "Trigger AF");
                    this.mIsExecuted = true;
                    this.mCameraControl.getFocusMeteringControl().triggerAf(null, false);
                }
            }
            return yVarImmediateFuture;
        }
    }

    public static class CameraCapturePipelineImpl implements CameraCapturePipeline {
        private final Executor mExecutor;
        private int mFlashMode;
        private final Pipeline mPipelineDelegate;

        public CameraCapturePipelineImpl(Pipeline pipeline, Executor executor, int i) {
            this.mPipelineDelegate = pipeline;
            this.mExecutor = executor;
            this.mFlashMode = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$invokePostCapture$1(CallbackToFutureAdapter.Completer completer) throws Exception {
            this.mPipelineDelegate.executePostCapture();
            completer.set(null);
            return "invokePostCaptureFuture";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Void lambda$invokePreCapture$0(TotalCaptureResult totalCaptureResult) {
            return null;
        }

        @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
        @NonNull
        public S1.y invokePostCapture() {
            return CallbackToFutureAdapter.getFuture(new C0736t(this, 1));
        }

        @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
        @NonNull
        public S1.y invokePreCapture() {
            Logger.d(Camera2CapturePipeline.TAG, "invokePreCapture");
            return FutureChain.from(this.mPipelineDelegate.executePreCapture(this.mFlashMode)).transform(new C0737u(1), this.mExecutor);
        }
    }

    @VisibleForTesting
    public static class Pipeline {
        private static final long CHECK_3A_TIMEOUT_IN_NS;
        private static final long CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS;
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final boolean mIsLegacyDevice;
        private final OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;
        private final ScheduledExecutorService mScheduler;
        private final int mTemplate;
        private long mTimeout3A = CHECK_3A_TIMEOUT_IN_NS;
        final List<PipelineTask> mTasks = new ArrayList();
        private final PipelineTask mPipelineSubTask = new AnonymousClass1();

        /* JADX INFO: renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$1, reason: invalid class name */
        public class AnonymousClass1 implements PipelineTask {
            public AnonymousClass1() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ Boolean lambda$preCapture$0(List list) {
                return Boolean.valueOf(list.contains(Boolean.TRUE));
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public boolean isCaptureResultNeeded() {
                Iterator<PipelineTask> it = Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    if (it.next().isCaptureResultNeeded()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public void postCapture() {
                Iterator<PipelineTask> it = Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    it.next().postCapture();
                }
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            @NonNull
            public S1.y preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<PipelineTask> it = Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().preCapture(totalCaptureResult));
                }
                return Futures.transform(Futures.allAsList(arrayList), new C0737u(2), CameraXExecutors.directExecutor());
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            CHECK_3A_TIMEOUT_IN_NS = timeUnit.toNanos(1L);
            CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS = timeUnit.toNanos(5L);
        }

        public Pipeline(int i, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Camera2CameraControlImpl camera2CameraControlImpl, boolean z4, @NonNull OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.mTemplate = i;
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mCameraControl = camera2CameraControlImpl;
            this.mIsLegacyDevice = z4;
            this.mOverrideAeModeForStillCapture = overrideAeModeForStillCapture;
        }

        @OptIn(markerClass = {ExperimentalCamera2Interop.class})
        private void applyAeModeQuirk(@NonNull CaptureConfig.Builder builder) {
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, 3);
            builder.addImplementationOptions(builder2.build());
        }

        private void applyStillCaptureTemplate(@NonNull CaptureConfig.Builder builder, @NonNull CaptureConfig captureConfig) {
            int i = (this.mTemplate != 3 || this.mIsLegacyDevice) ? (captureConfig.getTemplateType() == -1 || captureConfig.getTemplateType() == 5) ? 2 : -1 : 4;
            if (i != -1) {
                builder.setTemplateType(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ S1.y lambda$executeCapture$0(List list, int i, TotalCaptureResult totalCaptureResult) throws Exception {
            return submitConfigsInternal(list, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ S1.y lambda$executePreCapture$1(int i, TotalCaptureResult totalCaptureResult) throws Exception {
            if (Camera2CapturePipeline.isFlashRequired(i, totalCaptureResult)) {
                setTimeout3A(CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS);
            }
            return this.mPipelineSubTask.preCapture(totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$executePreCapture$2(TotalCaptureResult totalCaptureResult) {
            return Camera2CapturePipeline.is3AConverged(totalCaptureResult, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ S1.y lambda$executePreCapture$3(Boolean bool) throws Exception {
            return Boolean.TRUE.equals(bool) ? Camera2CapturePipeline.waitForResult(this.mTimeout3A, this.mScheduler, this.mCameraControl, new C0740x(0)) : Futures.immediateFuture(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$submitConfigsInternal$4(CaptureConfig.Builder builder, final CallbackToFutureAdapter.Completer completer) throws Exception {
            builder.addCameraCaptureCallback(new CameraCaptureCallback() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.2
                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureCancelled(int i) {
                    completer.setException(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
                }

                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureCompleted(int i, @NonNull CameraCaptureResult cameraCaptureResult) {
                    completer.set(null);
                }

                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureFailed(int i, @NonNull CameraCaptureFailure cameraCaptureFailure) {
                    completer.setException(new ImageCaptureException(2, "Capture request failed with reason " + cameraCaptureFailure.getReason(), null));
                }
            });
            return "submitStillCapture";
        }

        private void setTimeout3A(long j) {
            this.mTimeout3A = j;
        }

        public void addTask(@NonNull PipelineTask pipelineTask) {
            this.mTasks.add(pipelineTask);
        }

        @NonNull
        public S1.y executeCapture(@NonNull final List<CaptureConfig> list, final int i) {
            FutureChain futureChainTransformAsync = FutureChain.from(executePreCapture(i)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.v
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final S1.y apply(Object obj) {
                    return this.f7484a.lambda$executeCapture$0(list, i, (TotalCaptureResult) obj);
                }
            }, this.mExecutor);
            futureChainTransformAsync.addListener(new r(this, 1), this.mExecutor);
            return futureChainTransformAsync;
        }

        public void executePostCapture() {
            this.mPipelineSubTask.postCapture();
        }

        @NonNull
        public S1.y executePreCapture(final int i) {
            S1.y yVarImmediateFuture = Futures.immediateFuture(null);
            if (this.mTasks.isEmpty()) {
                return yVarImmediateFuture;
            }
            return FutureChain.from(this.mPipelineSubTask.isCaptureResultNeeded() ? Camera2CapturePipeline.waitForResult(this.mCameraControl, null) : Futures.immediateFuture(null)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.w
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final S1.y apply(Object obj) {
                    return this.f7486a.lambda$executePreCapture$1(i, (TotalCaptureResult) obj);
                }
            }, this.mExecutor).transformAsync(new B(this, 2), this.mExecutor);
        }

        @NonNull
        public S1.y submitConfigsInternal(@NonNull List<CaptureConfig> list, int i) {
            ImageProxy imageProxyDequeueImageFromBuffer;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (CaptureConfig captureConfig : list) {
                CaptureConfig.Builder builderFrom = CaptureConfig.Builder.from(captureConfig);
                CameraCaptureResult cameraCaptureResultRetrieveCameraCaptureResult = (captureConfig.getTemplateType() != 5 || this.mCameraControl.getZslControl().isZslDisabledByFlashMode() || this.mCameraControl.getZslControl().isZslDisabledByUserCaseConfig() || (imageProxyDequeueImageFromBuffer = this.mCameraControl.getZslControl().dequeueImageFromBuffer()) == null || !this.mCameraControl.getZslControl().enqueueImageToImageWriter(imageProxyDequeueImageFromBuffer)) ? null : CameraCaptureResults.retrieveCameraCaptureResult(imageProxyDequeueImageFromBuffer.getImageInfo());
                if (cameraCaptureResultRetrieveCameraCaptureResult != null) {
                    builderFrom.setCameraCaptureResult(cameraCaptureResultRetrieveCameraCaptureResult);
                } else {
                    applyStillCaptureTemplate(builderFrom, captureConfig);
                }
                if (this.mOverrideAeModeForStillCapture.shouldSetAeModeAlwaysFlash(i)) {
                    applyAeModeQuirk(builderFrom);
                }
                arrayList.add(CallbackToFutureAdapter.getFuture(new C0727j(1, this, builderFrom)));
                arrayList2.add(builderFrom.build());
            }
            this.mCameraControl.submitCaptureRequestsInternal(arrayList2);
            return Futures.allAsList(arrayList);
        }
    }

    public interface PipelineTask {
        boolean isCaptureResultNeeded();

        void postCapture();

        @NonNull
        S1.y preCapture(@Nullable TotalCaptureResult totalCaptureResult);
    }

    public static class ResultListener implements Camera2CameraControlImpl.CaptureResultListener {
        private final Checker mChecker;
        private CallbackToFutureAdapter.Completer<TotalCaptureResult> mCompleter;
        private final S1.y mFuture = CallbackToFutureAdapter.getFuture(new C0736t(this, 2));

        public interface Checker {
            boolean check(@NonNull TotalCaptureResult totalCaptureResult);
        }

        public ResultListener(@Nullable Checker checker) {
            this.mChecker = checker;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$new$0(CallbackToFutureAdapter.Completer completer) throws Exception {
            this.mCompleter = completer;
            return "waitFor3AResult";
        }

        @NonNull
        public S1.y getFuture() {
            return this.mFuture;
        }

        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public boolean onCaptureResult(@NonNull TotalCaptureResult totalCaptureResult) {
            Checker checker = this.mChecker;
            if (checker != null && !checker.check(totalCaptureResult)) {
                return false;
            }
            this.mCompleter.set(totalCaptureResult);
            return true;
        }
    }

    public static class ScreenFlashTask implements PipelineTask {
        private static final long CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS = TimeUnit.SECONDS.toNanos(2);
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final ScheduledExecutorService mScheduler;
        private final ImageCapture.ScreenFlash mScreenFlash;
        private final UseFlashModeTorchFor3aUpdate mUseFlashModeTorchFor3aUpdate;

        public ScreenFlashTask(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull UseFlashModeTorchFor3aUpdate useFlashModeTorchFor3aUpdate) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mUseFlashModeTorchFor3aUpdate = useFlashModeTorchFor3aUpdate;
            ImageCapture.ScreenFlash screenFlash = camera2CameraControlImpl.getScreenFlash();
            Objects.requireNonNull(screenFlash);
            this.mScreenFlash = screenFlash;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$preCapture$0(CallbackToFutureAdapter.Completer completer) {
            Logger.d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture: UI change applied");
            completer.set(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object lambda$preCapture$1(AtomicReference atomicReference, final CallbackToFutureAdapter.Completer completer) throws Exception {
            atomicReference.set(new ImageCapture.ScreenFlashListener() { // from class: androidx.camera.camera2.internal.A
                @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
                public final void onCompleted() {
                    Camera2CapturePipeline.ScreenFlashTask.lambda$preCapture$0(completer);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ S1.y lambda$preCapture$10(Void r62) throws Exception {
            return Camera2CapturePipeline.waitForResult(CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS, this.mScheduler, this.mCameraControl, new C0740x(1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean lambda$preCapture$11(TotalCaptureResult totalCaptureResult) {
            return Boolean.FALSE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$preCapture$2(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
            Logger.d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            this.mScreenFlash.apply(TimeUnit.SECONDS.toMillis(3L) + System.currentTimeMillis(), (ImageCapture.ScreenFlashListener) atomicReference.get());
            completer.set(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$preCapture$3(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) throws Exception {
            CameraXExecutors.mainThreadExecutor().execute(new RunnableC0731n(this, atomicReference, completer));
            return "OnScreenFlashStart";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ S1.y lambda$preCapture$4(Void r22) throws Exception {
            return this.mCameraControl.getFocusMeteringControl().enableExternalFlashAeMode(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$preCapture$5(CallbackToFutureAdapter.Completer completer) throws Exception {
            if (!this.mUseFlashModeTorchFor3aUpdate.shouldUseFlashModeTorch()) {
                completer.set(null);
                return "EnableTorchInternal";
            }
            Logger.d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture: enable torch");
            this.mCameraControl.enableTorchInternal(true);
            completer.set(null);
            return "EnableTorchInternal";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ S1.y lambda$preCapture$6(Void r22) throws Exception {
            return CallbackToFutureAdapter.getFuture(new C0736t(this, 3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ S1.y lambda$preCapture$7(S1.y yVar, Object obj) throws Exception {
            return Futures.makeTimeoutFuture(TimeUnit.SECONDS.toMillis(3L), this.mScheduler, null, true, yVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ S1.y lambda$preCapture$8(Void r1) throws Exception {
            return this.mCameraControl.getFocusMeteringControl().triggerAePrecapture();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$preCapture$9(TotalCaptureResult totalCaptureResult) {
            return Camera2CapturePipeline.is3AConverged(totalCaptureResult, false);
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return false;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            Logger.d(Camera2CapturePipeline.TAG, "ScreenFlashTask#postCapture");
            if (this.mUseFlashModeTorchFor3aUpdate.shouldUseFlashModeTorch()) {
                this.mCameraControl.enableTorchInternal(false);
            }
            this.mCameraControl.getFocusMeteringControl().enableExternalFlashAeMode(false).addListener(new RunnableC0742z(0), this.mExecutor);
            this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
            ScheduledExecutorService scheduledExecutorServiceMainThreadExecutor = CameraXExecutors.mainThreadExecutor();
            ImageCapture.ScreenFlash screenFlash = this.mScreenFlash;
            Objects.requireNonNull(screenFlash);
            scheduledExecutorServiceMainThreadExecutor.execute(new r(screenFlash, 10));
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        @NonNull
        public S1.y preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
            Logger.d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture");
            AtomicReference atomicReference = new AtomicReference();
            S1.y future = CallbackToFutureAdapter.getFuture(new C0736t(atomicReference, 4));
            final int i = 1;
            FutureChain futureChainTransformAsync = FutureChain.from(CallbackToFutureAdapter.getFuture(new C0727j(2, this, atomicReference))).transformAsync(new AsyncFunction(this) { // from class: androidx.camera.camera2.internal.y

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Camera2CapturePipeline.ScreenFlashTask f7490b;

                {
                    this.f7490b = this;
                }

                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final S1.y apply(Object obj) {
                    switch (i) {
                        case 0:
                            return this.f7490b.lambda$preCapture$10((Void) obj);
                        case 1:
                            return this.f7490b.lambda$preCapture$4((Void) obj);
                        case 2:
                            return this.f7490b.lambda$preCapture$6((Void) obj);
                        default:
                            return this.f7490b.lambda$preCapture$8((Void) obj);
                    }
                }
            }, this.mExecutor);
            final int i4 = 2;
            final int i6 = 3;
            FutureChain futureChainTransformAsync2 = futureChainTransformAsync.transformAsync(new AsyncFunction(this) { // from class: androidx.camera.camera2.internal.y

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Camera2CapturePipeline.ScreenFlashTask f7490b;

                {
                    this.f7490b = this;
                }

                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final S1.y apply(Object obj) {
                    switch (i4) {
                        case 0:
                            return this.f7490b.lambda$preCapture$10((Void) obj);
                        case 1:
                            return this.f7490b.lambda$preCapture$4((Void) obj);
                        case 2:
                            return this.f7490b.lambda$preCapture$6((Void) obj);
                        default:
                            return this.f7490b.lambda$preCapture$8((Void) obj);
                    }
                }
            }, this.mExecutor).transformAsync(new C0732o(1, this, future), this.mExecutor).transformAsync(new AsyncFunction(this) { // from class: androidx.camera.camera2.internal.y

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Camera2CapturePipeline.ScreenFlashTask f7490b;

                {
                    this.f7490b = this;
                }

                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final S1.y apply(Object obj) {
                    switch (i6) {
                        case 0:
                            return this.f7490b.lambda$preCapture$10((Void) obj);
                        case 1:
                            return this.f7490b.lambda$preCapture$4((Void) obj);
                        case 2:
                            return this.f7490b.lambda$preCapture$6((Void) obj);
                        default:
                            return this.f7490b.lambda$preCapture$8((Void) obj);
                    }
                }
            }, this.mExecutor);
            final int i10 = 0;
            return futureChainTransformAsync2.transformAsync(new AsyncFunction(this) { // from class: androidx.camera.camera2.internal.y

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Camera2CapturePipeline.ScreenFlashTask f7490b;

                {
                    this.f7490b = this;
                }

                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final S1.y apply(Object obj) {
                    switch (i10) {
                        case 0:
                            return this.f7490b.lambda$preCapture$10((Void) obj);
                        case 1:
                            return this.f7490b.lambda$preCapture$4((Void) obj);
                        case 2:
                            return this.f7490b.lambda$preCapture$6((Void) obj);
                        default:
                            return this.f7490b.lambda$preCapture$8((Void) obj);
                    }
                }
            }, this.mExecutor).transform(new C0737u(3), CameraXExecutors.directExecutor());
        }
    }

    public static class TorchTask implements PipelineTask {
        private static final long CHECK_3A_WITH_TORCH_TIMEOUT_IN_NS = TimeUnit.SECONDS.toNanos(2);
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final int mFlashMode;
        private boolean mIsExecuted = false;
        private final ScheduledExecutorService mScheduler;
        private final boolean mTriggerAePrecapture;

        public TorchTask(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, int i, @NonNull Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z4) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mFlashMode = i;
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mTriggerAePrecapture = z4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$preCapture$0(CallbackToFutureAdapter.Completer completer) throws Exception {
            this.mCameraControl.getTorchControl().lambda$enableTorch$1(completer, true);
            return "TorchOn";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ S1.y lambda$preCapture$1(Void r1) throws Exception {
            return this.mTriggerAePrecapture ? this.mCameraControl.getFocusMeteringControl().triggerAePrecapture() : Futures.immediateFuture(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$preCapture$2(TotalCaptureResult totalCaptureResult) {
            return Camera2CapturePipeline.is3AConverged(totalCaptureResult, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ S1.y lambda$preCapture$3(Void r62) throws Exception {
            return Camera2CapturePipeline.waitForResult(CHECK_3A_WITH_TORCH_TIMEOUT_IN_NS, this.mScheduler, this.mCameraControl, new C0740x(2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean lambda$preCapture$4(TotalCaptureResult totalCaptureResult) {
            return Boolean.FALSE;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return this.mFlashMode == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                this.mCameraControl.getTorchControl().lambda$enableTorch$1(null, false);
                Logger.d(Camera2CapturePipeline.TAG, "Turning off torch");
                if (this.mTriggerAePrecapture) {
                    this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
                }
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        @NonNull
        public S1.y preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
            Logger.d(Camera2CapturePipeline.TAG, "TorchTask#preCapture: isFlashRequired = " + Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult));
            if (Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult)) {
                if (!this.mCameraControl.isTorchOn()) {
                    Logger.d(Camera2CapturePipeline.TAG, "Turn on torch");
                    this.mIsExecuted = true;
                    return FutureChain.from(CallbackToFutureAdapter.getFuture(new C0736t(this, 5))).transformAsync(new B(this, 0), this.mExecutor).transformAsync(new B(this, 1), this.mExecutor).transform(new C0737u(4), CameraXExecutors.directExecutor());
                }
                Logger.d(Camera2CapturePipeline.TAG, "Torch already on, not turn on");
            }
            return Futures.immediateFuture(Boolean.FALSE);
        }
    }

    public Camera2CapturePipeline(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, @NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, @NonNull Quirks quirks, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.mCameraControl = camera2CameraControlImpl;
        Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.mIsLegacyDevice = num != null && num.intValue() == 2;
        this.mExecutor = executor;
        this.mScheduler = scheduledExecutorService;
        this.mCameraQuirk = quirks;
        this.mUseTorchAsFlash = new UseTorchAsFlash(quirks);
        this.mHasFlashUnit = FlashAvailabilityChecker.isFlashAvailable(new C0736t(cameraCharacteristicsCompat, 8));
    }

    public static boolean is3AConverged(@Nullable TotalCaptureResult totalCaptureResult, boolean z4) {
        if (totalCaptureResult == null) {
            return false;
        }
        return ConvergenceUtils.is3AConverged(new Camera2CameraCaptureResult(totalCaptureResult), z4);
    }

    public static boolean isFlashRequired(int i, @Nullable TotalCaptureResult totalCaptureResult) {
        Logger.d(TAG, "isFlashRequired: flashMode = " + i);
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            Logger.d(TAG, "isFlashRequired: aeState = " + num);
            return num != null && num.intValue() == 4;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new AssertionError(i);
            }
        }
        return true;
    }

    private boolean isTorchAsFlash(int i) {
        return this.mUseTorchAsFlash.shouldUseTorchAsFlash() || this.mTemplate == 3 || i == 1;
    }

    @NonNull
    public static S1.y waitForResult(long j, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Camera2CameraControlImpl camera2CameraControlImpl, @Nullable ResultListener.Checker checker) {
        return Futures.makeTimeoutFuture(TimeUnit.NANOSECONDS.toMillis(j), scheduledExecutorService, null, true, waitForResult(camera2CameraControlImpl, checker));
    }

    @VisibleForTesting
    public Pipeline createPipeline(int i, int i4, int i6) {
        int i10;
        OverrideAeModeForStillCapture overrideAeModeForStillCapture = new OverrideAeModeForStillCapture(this.mCameraQuirk);
        Pipeline pipeline = new Pipeline(this.mTemplate, this.mExecutor, this.mScheduler, this.mCameraControl, this.mIsLegacyDevice, overrideAeModeForStillCapture);
        if (i == 0) {
            pipeline.addTask(new AfTask(this.mCameraControl));
        }
        if (i4 != 3) {
            if (this.mHasFlashUnit) {
                if (isTorchAsFlash(i6)) {
                    i10 = i4;
                    pipeline.addTask(new TorchTask(this.mCameraControl, i10, this.mExecutor, this.mScheduler, (this.mUseTorchAsFlash.shouldUseTorchAsFlash() || this.mCameraControl.isInVideoUsage()) ? false : true));
                } else {
                    i10 = i4;
                    pipeline.addTask(new AePreCaptureTask(this.mCameraControl, i10, overrideAeModeForStillCapture));
                }
            }
            StringBuilder sbU = We.s.u("createPipeline: captureMode = ", i, ", flashMode = ", i10, ", flashType = ");
            sbU.append(i6);
            sbU.append(", pipeline tasks = ");
            sbU.append(pipeline.mTasks);
            Logger.d(TAG, sbU.toString());
            return pipeline;
        }
        pipeline.addTask(new ScreenFlashTask(this.mCameraControl, this.mExecutor, this.mScheduler, new UseFlashModeTorchFor3aUpdate(this.mCameraQuirk)));
        i10 = i4;
        StringBuilder sbU2 = We.s.u("createPipeline: captureMode = ", i, ", flashMode = ", i10, ", flashType = ");
        sbU2.append(i6);
        sbU2.append(", pipeline tasks = ");
        sbU2.append(pipeline.mTasks);
        Logger.d(TAG, sbU2.toString());
        return pipeline;
    }

    @NonNull
    public CameraCapturePipeline getCameraCapturePipeline(int i, int i4, int i6) {
        return new CameraCapturePipelineImpl(createPipeline(i, i4, i6), this.mExecutor, i4);
    }

    public void setTemplate(int i) {
        this.mTemplate = i;
    }

    @NonNull
    public S1.y submitStillCaptures(@NonNull List<CaptureConfig> list, int i, int i4, int i6) {
        return Futures.nonCancellationPropagating(createPipeline(i, i4, i6).executeCapture(list, i4));
    }

    @NonNull
    public static S1.y waitForResult(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, @Nullable ResultListener.Checker checker) {
        ResultListener resultListener = new ResultListener(checker);
        camera2CameraControlImpl.addCaptureResultListener(resultListener);
        S1.y future = resultListener.getFuture();
        future.addListener(new RunnableC0724g(4, camera2CameraControlImpl, resultListener), camera2CameraControlImpl.mExecutor);
        return future;
    }
}
