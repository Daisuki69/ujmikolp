package androidx.camera.video;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.video.Quality;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_Quality_ConstantQuality extends Quality.ConstantQuality {
    private final String name;
    private final List<Size> typicalSizes;
    private final int value;

    public AutoValue_Quality_ConstantQuality(int i, String str, List<Size> list) {
        this.value = i;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.name = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.typicalSizes = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Quality.ConstantQuality) {
            Quality.ConstantQuality constantQuality = (Quality.ConstantQuality) obj;
            if (this.value == constantQuality.getValue() && this.name.equals(constantQuality.getName()) && this.typicalSizes.equals(constantQuality.getTypicalSizes())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    @NonNull
    public String getName() {
        return this.name;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    @NonNull
    public List<Size> getTypicalSizes() {
        return this.typicalSizes;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    public int getValue() {
        return this.value;
    }

    public int hashCode() {
        return ((((this.value ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.typicalSizes.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConstantQuality{value=");
        sb2.append(this.value);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", typicalSizes=");
        return We.s.r(sb2, this.typicalSizes, "}");
    }
}
