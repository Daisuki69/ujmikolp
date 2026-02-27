package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SurfaceOutputConfig extends SurfaceOutputConfig {
    private final int id;
    private final String physicalCameraId;
    private final Surface surface;
    private final int surfaceGroupId;
    private final List<Camera2OutputConfig> surfaceSharingOutputConfigs;

    public AutoValue_SurfaceOutputConfig(int i, int i4, @Nullable String str, List<Camera2OutputConfig> list, Surface surface) {
        this.id = i;
        this.surfaceGroupId = i4;
        this.physicalCameraId = str;
        if (list == null) {
            throw new NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.surfaceSharingOutputConfigs = list;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.surface = surface;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SurfaceOutputConfig) {
            SurfaceOutputConfig surfaceOutputConfig = (SurfaceOutputConfig) obj;
            if (this.id == surfaceOutputConfig.getId() && this.surfaceGroupId == surfaceOutputConfig.getSurfaceGroupId() && ((str = this.physicalCameraId) != null ? str.equals(surfaceOutputConfig.getPhysicalCameraId()) : surfaceOutputConfig.getPhysicalCameraId() == null) && this.surfaceSharingOutputConfigs.equals(surfaceOutputConfig.getSurfaceSharingOutputConfigs()) && this.surface.equals(surfaceOutputConfig.getSurface())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public int getId() {
        return this.id;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    @Nullable
    public String getPhysicalCameraId() {
        return this.physicalCameraId;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig
    @NonNull
    public Surface getSurface() {
        return this.surface;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public int getSurfaceGroupId() {
        return this.surfaceGroupId;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    @NonNull
    public List<Camera2OutputConfig> getSurfaceSharingOutputConfigs() {
        return this.surfaceSharingOutputConfigs;
    }

    public int hashCode() {
        int i = (((this.id ^ 1000003) * 1000003) ^ this.surfaceGroupId) * 1000003;
        String str = this.physicalCameraId;
        return ((((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.surfaceSharingOutputConfigs.hashCode()) * 1000003) ^ this.surface.hashCode();
    }

    public String toString() {
        return "SurfaceOutputConfig{id=" + this.id + ", surfaceGroupId=" + this.surfaceGroupId + ", physicalCameraId=" + this.physicalCameraId + ", surfaceSharingOutputConfigs=" + this.surfaceSharingOutputConfigs + ", surface=" + this.surface + "}";
    }
}
