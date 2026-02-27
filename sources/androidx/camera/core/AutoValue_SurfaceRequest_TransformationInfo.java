package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.SurfaceRequest;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SurfaceRequest_TransformationInfo extends SurfaceRequest.TransformationInfo {
    private final Rect getCropRect;
    private final int getRotationDegrees;
    private final Matrix getSensorToBufferTransform;
    private final int getTargetRotation;
    private final boolean hasCameraTransform;
    private final boolean isMirroring;

    public AutoValue_SurfaceRequest_TransformationInfo(Rect rect, int i, int i4, boolean z4, Matrix matrix, boolean z5) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.getCropRect = rect;
        this.getRotationDegrees = i;
        this.getTargetRotation = i4;
        this.hasCameraTransform = z4;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.getSensorToBufferTransform = matrix;
        this.isMirroring = z5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SurfaceRequest.TransformationInfo) {
            SurfaceRequest.TransformationInfo transformationInfo = (SurfaceRequest.TransformationInfo) obj;
            if (this.getCropRect.equals(transformationInfo.getCropRect()) && this.getRotationDegrees == transformationInfo.getRotationDegrees() && this.getTargetRotation == transformationInfo.getTargetRotation() && this.hasCameraTransform == transformationInfo.hasCameraTransform() && this.getSensorToBufferTransform.equals(transformationInfo.getSensorToBufferTransform()) && this.isMirroring == transformationInfo.isMirroring()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    @NonNull
    public Rect getCropRect() {
        return this.getCropRect;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public int getRotationDegrees() {
        return this.getRotationDegrees;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    @NonNull
    public Matrix getSensorToBufferTransform() {
        return this.getSensorToBufferTransform;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getTargetRotation() {
        return this.getTargetRotation;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public boolean hasCameraTransform() {
        return this.hasCameraTransform;
    }

    public int hashCode() {
        return ((((((((((this.getCropRect.hashCode() ^ 1000003) * 1000003) ^ this.getRotationDegrees) * 1000003) ^ this.getTargetRotation) * 1000003) ^ (this.hasCameraTransform ? 1231 : 1237)) * 1000003) ^ this.getSensorToBufferTransform.hashCode()) * 1000003) ^ (this.isMirroring ? 1231 : 1237);
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public boolean isMirroring() {
        return this.isMirroring;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TransformationInfo{getCropRect=");
        sb2.append(this.getCropRect);
        sb2.append(", getRotationDegrees=");
        sb2.append(this.getRotationDegrees);
        sb2.append(", getTargetRotation=");
        sb2.append(this.getTargetRotation);
        sb2.append(", hasCameraTransform=");
        sb2.append(this.hasCameraTransform);
        sb2.append(", getSensorToBufferTransform=");
        sb2.append(this.getSensorToBufferTransform);
        sb2.append(", isMirroring=");
        return We.s.s(sb2, this.isMirroring, "}");
    }
}
