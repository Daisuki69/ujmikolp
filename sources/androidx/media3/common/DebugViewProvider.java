package androidx.media3.common;

import android.view.SurfaceView;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface DebugViewProvider {
    public static final DebugViewProvider NONE = new androidx.constraintlayout.core.state.a(4);

    @Nullable
    SurfaceView getDebugPreviewSurfaceView(int i, int i4);
}
