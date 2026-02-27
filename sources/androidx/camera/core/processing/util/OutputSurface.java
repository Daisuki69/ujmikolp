package androidx.camera.core.processing.util;

import android.opengl.EGLSurface;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class OutputSurface {
    @NonNull
    public static OutputSurface of(@NonNull EGLSurface eGLSurface, int i, int i4) {
        return new AutoValue_OutputSurface(eGLSurface, i, i4);
    }

    @NonNull
    public abstract EGLSurface getEglSurface();

    public abstract int getHeight();

    public abstract int getWidth();
}
