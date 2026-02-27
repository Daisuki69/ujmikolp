package androidx.camera.view;

import S1.y;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ExperimentalCameraInfo;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
class ProcessCameraProviderWrapperImpl implements ProcessCameraProviderWrapper {
    private final ProcessCameraProvider mProcessCameraProvider;

    public ProcessCameraProviderWrapperImpl(ProcessCameraProvider processCameraProvider) {
        this.mProcessCameraProvider = processCameraProvider;
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    @NonNull
    public Camera bindToLifecycle(@NonNull LifecycleOwner lifecycleOwner, @NonNull CameraSelector cameraSelector, @NonNull UseCaseGroup useCaseGroup) {
        return this.mProcessCameraProvider.bindToLifecycle(lifecycleOwner, cameraSelector, useCaseGroup);
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    @NonNull
    @OptIn(markerClass = {ExperimentalCameraInfo.class})
    public CameraInfo getCameraInfo(CameraSelector cameraSelector) {
        return this.mProcessCameraProvider.getCameraInfo(cameraSelector);
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public boolean hasCamera(@NonNull CameraSelector cameraSelector) throws CameraInfoUnavailableException {
        return this.mProcessCameraProvider.hasCamera(cameraSelector);
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    @NonNull
    @VisibleForTesting
    public y shutdownAsync() {
        return this.mProcessCameraProvider.shutdownAsync();
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public void unbind(@NonNull UseCase... useCaseArr) {
        this.mProcessCameraProvider.unbind(useCaseArr);
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public void unbindAll() {
        this.mProcessCameraProvider.unbindAll();
    }
}
