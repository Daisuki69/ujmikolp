package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImageReaderOutputConfig implements Camera2OutputConfig {
    public static ImageReaderOutputConfig create(int i, int i4, @Nullable String str, @NonNull List<Camera2OutputConfig> list, @NonNull Size size, int i6, int i10) {
        return new AutoValue_ImageReaderOutputConfig(i, i4, str, list, size, i6, i10);
    }

    public abstract int getImageFormat();

    public abstract int getMaxImages();

    @NonNull
    public abstract Size getSize();

    public static ImageReaderOutputConfig create(int i, @NonNull Size size, int i4, int i6) {
        return new AutoValue_ImageReaderOutputConfig(i, -1, null, Collections.EMPTY_LIST, size, i4, i6);
    }
}
