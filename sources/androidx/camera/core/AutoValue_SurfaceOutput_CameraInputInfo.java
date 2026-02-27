package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.CameraInternal;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SurfaceOutput_CameraInputInfo extends SurfaceOutput.CameraInputInfo {
    private final CameraInternal cameraInternal;
    private final Rect inputCropRect;
    private final Size inputSize;
    private final boolean mirroring;
    private final int rotationDegrees;

    public AutoValue_SurfaceOutput_CameraInputInfo(Size size, Rect rect, @Nullable CameraInternal cameraInternal, int i, boolean z4) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.inputSize = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.inputCropRect = rect;
        this.cameraInternal = cameraInternal;
        this.rotationDegrees = i;
        this.mirroring = z4;
    }

    public boolean equals(Object obj) {
        CameraInternal cameraInternal;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SurfaceOutput.CameraInputInfo) {
            SurfaceOutput.CameraInputInfo cameraInputInfo = (SurfaceOutput.CameraInputInfo) obj;
            if (this.inputSize.equals(cameraInputInfo.getInputSize()) && this.inputCropRect.equals(cameraInputInfo.getInputCropRect()) && ((cameraInternal = this.cameraInternal) != null ? cameraInternal.equals(cameraInputInfo.getCameraInternal()) : cameraInputInfo.getCameraInternal() == null) && this.rotationDegrees == cameraInputInfo.getRotationDegrees() && this.mirroring == cameraInputInfo.getMirroring()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    @Nullable
    public CameraInternal getCameraInternal() {
        return this.cameraInternal;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    @NonNull
    public Rect getInputCropRect() {
        return this.inputCropRect;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    @NonNull
    public Size getInputSize() {
        return this.inputSize;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public boolean getMirroring() {
        return this.mirroring;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public int hashCode() {
        int iHashCode = (((this.inputSize.hashCode() ^ 1000003) * 1000003) ^ this.inputCropRect.hashCode()) * 1000003;
        CameraInternal cameraInternal = this.cameraInternal;
        return ((((iHashCode ^ (cameraInternal == null ? 0 : cameraInternal.hashCode())) * 1000003) ^ this.rotationDegrees) * 1000003) ^ (this.mirroring ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CameraInputInfo{inputSize=");
        sb2.append(this.inputSize);
        sb2.append(", inputCropRect=");
        sb2.append(this.inputCropRect);
        sb2.append(", cameraInternal=");
        sb2.append(this.cameraInternal);
        sb2.append(", rotationDegrees=");
        sb2.append(this.rotationDegrees);
        sb2.append(", mirroring=");
        return We.s.s(sb2, this.mirroring, "}");
    }
}
