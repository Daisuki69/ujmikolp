package androidx.camera.core.impl;

import android.util.Range;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ExposureState;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.utils.SessionProcessorUtil;
import androidx.camera.core.internal.ImmutableZoomState;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class RestrictedCameraInfo extends ForwardingCameraInfo {
    public static final int CAMERA_OPERATION_AE_REGION = 3;
    public static final int CAMERA_OPERATION_AF_REGION = 2;
    public static final int CAMERA_OPERATION_AUTO_FOCUS = 1;
    public static final int CAMERA_OPERATION_AWB_REGION = 4;
    public static final int CAMERA_OPERATION_EXPOSURE_COMPENSATION = 7;
    public static final int CAMERA_OPERATION_EXTENSION_STRENGTH = 8;
    public static final int CAMERA_OPERATION_FLASH = 5;
    public static final int CAMERA_OPERATION_TORCH = 6;
    public static final int CAMERA_OPERATION_ZOOM = 0;

    @NonNull
    private final CameraConfig mCameraConfig;
    private final CameraInfoInternal mCameraInfo;
    private boolean mIsCaptureProcessProgressSupported;
    private boolean mIsPostviewSupported;

    @Nullable
    private final SessionProcessor mSessionProcessor;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CameraOperation {
    }

    public RestrictedCameraInfo(@NonNull CameraInfoInternal cameraInfoInternal, @NonNull CameraConfig cameraConfig) {
        super(cameraInfoInternal);
        this.mIsPostviewSupported = false;
        this.mIsCaptureProcessProgressSupported = false;
        this.mCameraInfo = cameraInfoInternal;
        this.mCameraConfig = cameraConfig;
        this.mSessionProcessor = cameraConfig.getSessionProcessor(null);
        setPostviewSupported(cameraConfig.isPostviewSupported());
        setCaptureProcessProgressSupported(cameraConfig.isCaptureProcessProgressSupported());
    }

    @NonNull
    public CameraConfig getCameraConfig() {
        return this.mCameraConfig;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    @NonNull
    public ExposureState getExposureState() {
        return !SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 7) ? new ExposureState() { // from class: androidx.camera.core.impl.RestrictedCameraInfo.1
            @Override // androidx.camera.core.ExposureState
            public int getExposureCompensationIndex() {
                return 0;
            }

            @Override // androidx.camera.core.ExposureState
            @NonNull
            public Range<Integer> getExposureCompensationRange() {
                return new Range<>(0, 0);
            }

            @Override // androidx.camera.core.ExposureState
            @NonNull
            public Rational getExposureCompensationStep() {
                return Rational.ZERO;
            }

            @Override // androidx.camera.core.ExposureState
            public boolean isExposureCompensationSupported() {
                return false;
            }
        } : this.mCameraInfo.getExposureState();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public CameraInfoInternal getImplementation() {
        return this.mCameraInfo;
    }

    @Nullable
    public SessionProcessor getSessionProcessor() {
        return this.mSessionProcessor;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    @NonNull
    public LiveData<Integer> getTorchState() {
        return !SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 6) ? new MutableLiveData(0) : this.mCameraInfo.getTorchState();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    @NonNull
    public LiveData<ZoomState> getZoomState() {
        return !SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 0) ? new MutableLiveData(ImmutableZoomState.create(1.0f, 1.0f, 1.0f, 0.0f)) : this.mCameraInfo.getZoomState();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
        if (SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 5)) {
            return this.mCameraInfo.hasFlashUnit();
        }
        return false;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    public boolean isCaptureProcessProgressSupported() {
        return this.mIsCaptureProcessProgressSupported;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(@NonNull FocusMeteringAction focusMeteringAction) {
        FocusMeteringAction modifiedFocusMeteringAction = SessionProcessorUtil.getModifiedFocusMeteringAction(this.mSessionProcessor, focusMeteringAction);
        if (modifiedFocusMeteringAction == null) {
            return false;
        }
        return this.mCameraInfo.isFocusMeteringSupported(modifiedFocusMeteringAction);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    public boolean isPostviewSupported() {
        return this.mIsPostviewSupported;
    }

    public void setCaptureProcessProgressSupported(boolean z4) {
        this.mIsCaptureProcessProgressSupported = z4;
    }

    public void setPostviewSupported(boolean z4) {
        this.mIsPostviewSupported = z4;
    }
}
