package androidx.camera.extensions.internal.sessionprocessor;

import We.s;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_MultiResolutionImageReaderOutputConfig extends MultiResolutionImageReaderOutputConfig {
    private final int id;
    private final int imageFormat;
    private final int maxImages;
    private final String physicalCameraId;
    private final int surfaceGroupId;
    private final List<Camera2OutputConfig> surfaceSharingOutputConfigs;

    public AutoValue_MultiResolutionImageReaderOutputConfig(int i, int i4, @Nullable String str, List<Camera2OutputConfig> list, int i6, int i10) {
        this.id = i;
        this.surfaceGroupId = i4;
        this.physicalCameraId = str;
        if (list == null) {
            throw new NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.surfaceSharingOutputConfigs = list;
        this.imageFormat = i6;
        this.maxImages = i10;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof MultiResolutionImageReaderOutputConfig) {
            MultiResolutionImageReaderOutputConfig multiResolutionImageReaderOutputConfig = (MultiResolutionImageReaderOutputConfig) obj;
            if (this.id == multiResolutionImageReaderOutputConfig.getId() && this.surfaceGroupId == multiResolutionImageReaderOutputConfig.getSurfaceGroupId() && ((str = this.physicalCameraId) != null ? str.equals(multiResolutionImageReaderOutputConfig.getPhysicalCameraId()) : multiResolutionImageReaderOutputConfig.getPhysicalCameraId() == null) && this.surfaceSharingOutputConfigs.equals(multiResolutionImageReaderOutputConfig.getSurfaceSharingOutputConfigs()) && this.imageFormat == multiResolutionImageReaderOutputConfig.getImageFormat() && this.maxImages == multiResolutionImageReaderOutputConfig.getMaxImages()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public int getId() {
        return this.id;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig
    public int getImageFormat() {
        return this.imageFormat;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig
    public int getMaxImages() {
        return this.maxImages;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    @Nullable
    public String getPhysicalCameraId() {
        return this.physicalCameraId;
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
        return ((((((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.surfaceSharingOutputConfigs.hashCode()) * 1000003) ^ this.imageFormat) * 1000003) ^ this.maxImages;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MultiResolutionImageReaderOutputConfig{id=");
        sb2.append(this.id);
        sb2.append(", surfaceGroupId=");
        sb2.append(this.surfaceGroupId);
        sb2.append(", physicalCameraId=");
        sb2.append(this.physicalCameraId);
        sb2.append(", surfaceSharingOutputConfigs=");
        sb2.append(this.surfaceSharingOutputConfigs);
        sb2.append(", imageFormat=");
        sb2.append(this.imageFormat);
        sb2.append(", maxImages=");
        return s.o(sb2, "}", this.maxImages);
    }
}
