package androidx.camera.extensions.internal.sessionprocessor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class MultiResolutionImageReaderOutputConfig implements Camera2OutputConfig {
    public static MultiResolutionImageReaderOutputConfig create(int i, int i4, @Nullable String str, @NonNull List<Camera2OutputConfig> list, int i6, int i10) {
        return new AutoValue_MultiResolutionImageReaderOutputConfig(i, i4, str, list, i6, i10);
    }

    public abstract int getImageFormat();

    public abstract int getMaxImages();
}
