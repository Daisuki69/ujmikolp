package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface CameraControlInternal extends CameraControl {

    @NonNull
    public static final CameraControlInternal DEFAULT_EMPTY_INSTANCE = new CameraControlInternal() { // from class: androidx.camera.core.impl.CameraControlInternal.2
        @Override // androidx.camera.core.impl.CameraControlInternal
        public void addInteropConfig(@NonNull Config config) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void addZslConfig(@NonNull SessionConfig.Builder builder) {
        }

        @Override // androidx.camera.core.CameraControl
        @NonNull
        public S1.y cancelFocusAndMetering() {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void clearInteropConfig() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final /* synthetic */ void decrementVideoUsage() {
            CC.a(this);
        }

        @Override // androidx.camera.core.CameraControl
        @NonNull
        public S1.y enableTorch(boolean z4) {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final /* synthetic */ S1.y getCameraCapturePipelineAsync(int i, int i4) {
            return CC.b(this, i, i4);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public int getFlashMode() {
            return 2;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final /* synthetic */ CameraControlInternal getImplementation() {
            return CC.c(this);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        @NonNull
        public Config getInteropConfig() {
            return null;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        @NonNull
        public Rect getSensorRect() {
            return new Rect();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        @NonNull
        public SessionConfig getSessionConfig() {
            return SessionConfig.defaultEmptySessionConfig();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final /* synthetic */ void incrementVideoUsage() {
            CC.d(this);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final /* synthetic */ boolean isInVideoUsage() {
            return CC.e(this);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public boolean isZslDisabledByByUserCaseConfig() {
            return false;
        }

        @Override // androidx.camera.core.CameraControl
        @NonNull
        public S1.y setExposureCompensationIndex(int i) {
            return Futures.immediateFuture(0);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void setFlashMode(int i) {
        }

        @Override // androidx.camera.core.CameraControl
        @NonNull
        public S1.y setLinearZoom(float f) {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final /* synthetic */ void setScreenFlash(ImageCapture.ScreenFlash screenFlash) {
            CC.f(this, screenFlash);
        }

        @Override // androidx.camera.core.CameraControl
        @NonNull
        public S1.y setZoomRatio(float f) {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void setZslDisabledByUserCaseConfig(boolean z4) {
        }

        @Override // androidx.camera.core.CameraControl
        @NonNull
        public S1.y startFocusAndMetering(@NonNull FocusMeteringAction focusMeteringAction) {
            return Futures.immediateFuture(FocusMeteringResult.emptyInstance());
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        @NonNull
        public S1.y submitStillCaptureRequests(@NonNull List<CaptureConfig> list, int i, int i4) {
            return Futures.immediateFuture(Collections.EMPTY_LIST);
        }
    };

    /* JADX INFO: renamed from: androidx.camera.core.impl.CameraControlInternal$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static void a(CameraControlInternal cameraControlInternal) {
        }

        public static S1.y b(final CameraControlInternal cameraControlInternal, int i, int i4) {
            return Futures.immediateFuture(new CameraCapturePipeline() { // from class: androidx.camera.core.impl.CameraControlInternal.1
                @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
                @NonNull
                public S1.y invokePostCapture() {
                    return Futures.immediateFuture(null);
                }

                @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
                @NonNull
                public S1.y invokePreCapture() {
                    return Futures.immediateFuture(null);
                }
            });
        }

        public static CameraControlInternal c(CameraControlInternal cameraControlInternal) {
            return cameraControlInternal;
        }

        public static void d(CameraControlInternal cameraControlInternal) {
        }

        public static boolean e(CameraControlInternal cameraControlInternal) {
            return false;
        }

        public static void f(CameraControlInternal cameraControlInternal, ImageCapture.ScreenFlash screenFlash) {
        }
    }

    public interface ControlUpdateCallback {
        void onCameraControlCaptureRequests(@NonNull List<CaptureConfig> list);

        void onCameraControlUpdateSessionConfig();
    }

    void addInteropConfig(@NonNull Config config);

    void addZslConfig(@NonNull SessionConfig.Builder builder);

    void clearInteropConfig();

    void decrementVideoUsage();

    @NonNull
    S1.y getCameraCapturePipelineAsync(int i, int i4);

    int getFlashMode();

    @NonNull
    CameraControlInternal getImplementation();

    @NonNull
    Config getInteropConfig();

    @NonNull
    Rect getSensorRect();

    @NonNull
    SessionConfig getSessionConfig();

    void incrementVideoUsage();

    @VisibleForTesting
    boolean isInVideoUsage();

    boolean isZslDisabledByByUserCaseConfig();

    void setFlashMode(int i);

    void setScreenFlash(@Nullable ImageCapture.ScreenFlash screenFlash);

    void setZslDisabledByUserCaseConfig(boolean z4);

    @NonNull
    S1.y submitStillCaptureRequests(@NonNull List<CaptureConfig> list, int i, int i4);

    public static final class CameraControlException extends Exception {

        @NonNull
        private CameraCaptureFailure mCameraCaptureFailure;

        public CameraControlException(@NonNull CameraCaptureFailure cameraCaptureFailure) {
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }

        @NonNull
        public CameraCaptureFailure getCameraCaptureFailure() {
            return this.mCameraCaptureFailure;
        }

        public CameraControlException(@NonNull CameraCaptureFailure cameraCaptureFailure, @NonNull Throwable th2) {
            super(th2);
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }
    }
}
