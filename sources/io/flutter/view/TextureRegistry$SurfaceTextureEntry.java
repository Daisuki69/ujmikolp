package io.flutter.view;

import android.graphics.SurfaceTexture;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public interface TextureRegistry$SurfaceTextureEntry {
    /* synthetic */ long id();

    /* synthetic */ void release();

    void setOnFrameConsumedListener(@Nullable p pVar);

    void setOnTrimMemoryListener(@Nullable q qVar);

    @NonNull
    SurfaceTexture surfaceTexture();
}
