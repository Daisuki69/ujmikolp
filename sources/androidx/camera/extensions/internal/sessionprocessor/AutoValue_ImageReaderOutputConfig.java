package androidx.camera.extensions.internal.sessionprocessor;

import We.s;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_ImageReaderOutputConfig extends ImageReaderOutputConfig {
    private final int id;
    private final int imageFormat;
    private final int maxImages;
    private final String physicalCameraId;
    private final Size size;
    private final int surfaceGroupId;
    private final List<Camera2OutputConfig> surfaceSharingOutputConfigs;

    public AutoValue_ImageReaderOutputConfig(int i, int i4, @Nullable String str, List<Camera2OutputConfig> list, Size size, int i6, int i10) {
        this.id = i;
        this.surfaceGroupId = i4;
        this.physicalCameraId = str;
        if (list == null) {
            throw new NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.surfaceSharingOutputConfigs = list;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.size = size;
        this.imageFormat = i6;
        this.maxImages = i10;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageReaderOutputConfig) {
            ImageReaderOutputConfig imageReaderOutputConfig = (ImageReaderOutputConfig) obj;
            if (this.id == imageReaderOutputConfig.getId() && this.surfaceGroupId == imageReaderOutputConfig.getSurfaceGroupId() && ((str = this.physicalCameraId) != null ? str.equals(imageReaderOutputConfig.getPhysicalCameraId()) : imageReaderOutputConfig.getPhysicalCameraId() == null) && this.surfaceSharingOutputConfigs.equals(imageReaderOutputConfig.getSurfaceSharingOutputConfigs()) && this.size.equals(imageReaderOutputConfig.getSize()) && this.imageFormat == imageReaderOutputConfig.getImageFormat() && this.maxImages == imageReaderOutputConfig.getMaxImages()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public int getId() {
        return this.id;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    public int getImageFormat() {
        return this.imageFormat;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    public int getMaxImages() {
        return this.maxImages;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    @Nullable
    public String getPhysicalCameraId() {
        return this.physicalCameraId;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    @NonNull
    public Size getSize() {
        return this.size;
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
        return ((((((((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.surfaceSharingOutputConfigs.hashCode()) * 1000003) ^ this.size.hashCode()) * 1000003) ^ this.imageFormat) * 1000003) ^ this.maxImages;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ImageReaderOutputConfig{id=");
        sb2.append(this.id);
        sb2.append(", surfaceGroupId=");
        sb2.append(this.surfaceGroupId);
        sb2.append(", physicalCameraId=");
        sb2.append(this.physicalCameraId);
        sb2.append(", surfaceSharingOutputConfigs=");
        sb2.append(this.surfaceSharingOutputConfigs);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", imageFormat=");
        sb2.append(this.imageFormat);
        sb2.append(", maxImages=");
        return s.o(sb2, "}", this.maxImages);
    }
}
