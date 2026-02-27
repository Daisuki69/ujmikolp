package androidx.media3.common;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import androidx.annotation.IntRange;
import androidx.camera.core.ImageCapture;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.UnstableApi;
import mx_android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface GlObjectsProvider {
    GlTextureInfo createBuffersForTexture(int i, int i4, int i6) throws GlUtil.GlException;

    EGLContext createEglContext(EGLDisplay eGLDisplay, @IntRange(from = PlaybackStateCompat.ACTION_PAUSE, to = ImageCapture.SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS) int i, int[] iArr) throws GlUtil.GlException;

    EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i, boolean z4) throws GlUtil.GlException;

    EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlUtil.GlException;

    void release(EGLDisplay eGLDisplay) throws GlUtil.GlException;
}
