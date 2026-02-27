package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.SupportedRepeatingSurfaceSize;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.TargetConfig;
import com.dynatrace.android.agent.Global;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
class MeteringRepeatingSession {
    private static final int IMAGE_FORMAT = 34;
    private static final String TAG = "MeteringRepeating";
    private DeferrableSurface mDeferrableSurface;

    @NonNull
    private final Size mMeteringRepeatingSize;

    @NonNull
    private SessionConfig mSessionConfig;

    @Nullable
    private final SurfaceResetCallback mSurfaceResetCallback;

    @NonNull
    private final SupportedRepeatingSurfaceSize mSupportedRepeatingSurfaceSize = new SupportedRepeatingSurfaceSize();

    @Nullable
    private SessionConfig.CloseableErrorListener mCloseableErrorListener = null;

    @NonNull
    private final MeteringRepeatingConfig mConfigWithDefaults = new MeteringRepeatingConfig();

    public static class MeteringRepeatingConfig implements UseCaseConfig<UseCase> {

        @NonNull
        private final Config mConfig;

        public MeteringRepeatingConfig() {
            MutableOptionsBundle mutableOptionsBundleCreate = MutableOptionsBundle.create();
            mutableOptionsBundleCreate.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, new Camera2SessionOptionUnpacker());
            mutableOptionsBundleCreate.insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 34);
            setTargetConfigs(mutableOptionsBundleCreate);
            this.mConfig = mutableOptionsBundleCreate;
        }

        private void setTargetConfigs(MutableOptionsBundle mutableOptionsBundle) {
            mutableOptionsBundle.insertOption(TargetConfig.OPTION_TARGET_CLASS, MeteringRepeatingSession.class);
            mutableOptionsBundle.insertOption(TargetConfig.OPTION_TARGET_NAME, MeteringRepeatingSession.class.getCanonicalName() + Global.HYPHEN + UUID.randomUUID());
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public final /* synthetic */ boolean containsOption(Config.Option option) {
            return androidx.camera.core.impl.s.a(this, option);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public final /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
            androidx.camera.core.impl.s.b(this, str, optionMatcher);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker() {
            return androidx.camera.core.impl.y.a(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        @NonNull
        public UseCaseConfigFactory.CaptureType getCaptureType() {
            return UseCaseConfigFactory.CaptureType.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        @NonNull
        public Config getConfig() {
            return this.mConfig;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final /* synthetic */ CaptureConfig getDefaultCaptureConfig() {
            return androidx.camera.core.impl.y.d(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final /* synthetic */ SessionConfig getDefaultSessionConfig() {
            return androidx.camera.core.impl.y.f(this);
        }

        @Override // androidx.camera.core.impl.ImageInputConfig
        public final /* synthetic */ DynamicRange getDynamicRange() {
            return androidx.camera.core.impl.n.a(this);
        }

        @Override // androidx.camera.core.impl.ImageInputConfig
        public final /* synthetic */ int getInputFormat() {
            return androidx.camera.core.impl.n.b(this);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public final /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
            return androidx.camera.core.impl.s.c(this, option);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final /* synthetic */ int getPreviewStabilizationMode() {
            return androidx.camera.core.impl.y.h(this);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public final /* synthetic */ Set getPriorities(Config.Option option) {
            return androidx.camera.core.impl.s.d(this, option);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final /* synthetic */ SessionConfig.OptionUnpacker getSessionOptionUnpacker() {
            return androidx.camera.core.impl.y.i(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final /* synthetic */ int getSurfaceOccupancyPriority() {
            return androidx.camera.core.impl.y.k(this);
        }

        @Override // androidx.camera.core.internal.TargetConfig
        public final /* synthetic */ Class getTargetClass() {
            return androidx.camera.core.internal.e.a(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final /* synthetic */ Range getTargetFrameRate() {
            return androidx.camera.core.impl.y.m(this);
        }

        @Override // androidx.camera.core.internal.TargetConfig
        public final /* synthetic */ String getTargetName() {
            return androidx.camera.core.internal.e.c(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final /* synthetic */ int getVideoStabilizationMode() {
            return androidx.camera.core.impl.y.o(this);
        }

        @Override // androidx.camera.core.impl.ImageInputConfig
        public final /* synthetic */ boolean hasDynamicRange() {
            return androidx.camera.core.impl.n.c(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final /* synthetic */ boolean isHighResolutionDisabled(boolean z4) {
            return androidx.camera.core.impl.y.p(this, z4);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final /* synthetic */ boolean isZslDisabled(boolean z4) {
            return androidx.camera.core.impl.y.q(this, z4);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public final /* synthetic */ Set listOptions() {
            return androidx.camera.core.impl.s.e(this);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public final /* synthetic */ Object retrieveOption(Config.Option option) {
            return androidx.camera.core.impl.s.f(this, option);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public final /* synthetic */ Object retrieveOptionWithPriority(Config.Option option, Config.OptionPriority optionPriority) {
            return androidx.camera.core.impl.s.h(this, option, optionPriority);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            return androidx.camera.core.impl.y.b(this, optionUnpacker);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final /* synthetic */ CaptureConfig getDefaultCaptureConfig(CaptureConfig captureConfig) {
            return androidx.camera.core.impl.y.e(this, captureConfig);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final /* synthetic */ SessionConfig getDefaultSessionConfig(SessionConfig sessionConfig) {
            return androidx.camera.core.impl.y.g(this, sessionConfig);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final /* synthetic */ SessionConfig.OptionUnpacker getSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            return androidx.camera.core.impl.y.j(this, optionUnpacker);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final /* synthetic */ int getSurfaceOccupancyPriority(int i) {
            return androidx.camera.core.impl.y.l(this, i);
        }

        @Override // androidx.camera.core.internal.TargetConfig
        public final /* synthetic */ Class getTargetClass(Class cls) {
            return androidx.camera.core.internal.e.b(this, cls);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final /* synthetic */ Range getTargetFrameRate(Range range) {
            return androidx.camera.core.impl.y.n(this, range);
        }

        @Override // androidx.camera.core.internal.TargetConfig
        public final /* synthetic */ String getTargetName(String str) {
            return androidx.camera.core.internal.e.d(this, str);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public final /* synthetic */ Object retrieveOption(Config.Option option, Object obj) {
            return androidx.camera.core.impl.s.g(this, option, obj);
        }
    }

    public interface SurfaceResetCallback {
        void onSurfaceReset();
    }

    public MeteringRepeatingSession(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, @NonNull DisplayInfoManager displayInfoManager, @Nullable SurfaceResetCallback surfaceResetCallback) {
        this.mSurfaceResetCallback = surfaceResetCallback;
        Size properPreviewSize = getProperPreviewSize(cameraCharacteristicsCompat, displayInfoManager);
        this.mMeteringRepeatingSize = properPreviewSize;
        Logger.d(TAG, "MeteringSession SurfaceTexture size: " + properPreviewSize);
        this.mSessionConfig = createSessionConfig();
    }

    @NonNull
    private Size getProperPreviewSize(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, @NonNull DisplayInfoManager displayInfoManager) {
        Size[] outputSizes = cameraCharacteristicsCompat.getStreamConfigurationMapCompat().getOutputSizes(34);
        if (outputSizes == null) {
            Logger.e(TAG, "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] supportedSizes = this.mSupportedRepeatingSurfaceSize.getSupportedSizes(outputSizes);
        List listAsList = Arrays.asList(supportedSizes);
        Collections.sort(listAsList, new S());
        Size previewSize = displayInfoManager.getPreviewSize();
        long jMin = Math.min(((long) previewSize.getWidth()) * ((long) previewSize.getHeight()), 307200L);
        int length = supportedSizes.length;
        Size size = null;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Size size2 = supportedSizes[i];
            long width = ((long) size2.getWidth()) * ((long) size2.getHeight());
            if (width == jMin) {
                return size2;
            }
            if (width <= jMin) {
                i++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (Size) listAsList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createSessionConfig$0(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        this.mSessionConfig = createSessionConfig();
        SurfaceResetCallback surfaceResetCallback = this.mSurfaceResetCallback;
        if (surfaceResetCallback != null) {
            surfaceResetCallback.onSurfaceReset();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getProperPreviewSize$1(Size size, Size size2) {
        return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
    }

    public void clear() {
        Logger.d(TAG, "MeteringRepeating clear!");
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        this.mDeferrableSurface = null;
    }

    @NonNull
    public SessionConfig createSessionConfig() {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.mMeteringRepeatingSize.getWidth(), this.mMeteringRepeatingSize.getHeight());
        final Surface surface = new Surface(surfaceTexture);
        SessionConfig.Builder builderCreateFrom = SessionConfig.Builder.createFrom(this.mConfigWithDefaults, this.mMeteringRepeatingSize);
        builderCreateFrom.setTemplateType(1);
        ImmediateSurface immediateSurface = new ImmediateSurface(surface);
        this.mDeferrableSurface = immediateSurface;
        Futures.addCallback(immediateSurface.getTerminationFuture(), new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.MeteringRepeatingSession.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Void r1) {
                surface.release();
                surfaceTexture.release();
            }
        }, CameraXExecutors.directExecutor());
        builderCreateFrom.addSurface(this.mDeferrableSurface);
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new SessionConfig.ErrorListener() { // from class: androidx.camera.camera2.internal.Q
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                this.f7391a.lambda$createSessionConfig$0(sessionConfig, sessionError);
            }
        });
        this.mCloseableErrorListener = closeableErrorListener2;
        builderCreateFrom.setErrorListener(closeableErrorListener2);
        return builderCreateFrom.build();
    }

    @NonNull
    public Size getMeteringRepeatingSize() {
        return this.mMeteringRepeatingSize;
    }

    @NonNull
    public String getName() {
        return TAG;
    }

    @NonNull
    public SessionConfig getSessionConfig() {
        return this.mSessionConfig;
    }

    @NonNull
    public UseCaseConfig<?> getUseCaseConfig() {
        return this.mConfigWithDefaults;
    }
}
