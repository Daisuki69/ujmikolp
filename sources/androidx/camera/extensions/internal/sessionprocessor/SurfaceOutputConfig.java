package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class SurfaceOutputConfig implements Camera2OutputConfig {
    public static SurfaceOutputConfig create(int i, int i4, @Nullable String str, @NonNull List<Camera2OutputConfig> list, @NonNull Surface surface) {
        return new AutoValue_SurfaceOutputConfig(i, i4, str, list, surface);
    }

    @NonNull
    public abstract Surface getSurface();

    public static SurfaceOutputConfig create(int i, @NonNull Surface surface) {
        return create(i, -1, null, Collections.EMPTY_LIST, surface);
    }
}
