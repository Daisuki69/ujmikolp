package io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextureRegistry$SurfaceTextureEntry f17207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SurfaceTexture f17208b;
    public Surface c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17209d = 0;
    public int e = 0;
    public boolean f = false;

    public B(TextureRegistry$SurfaceTextureEntry textureRegistry$SurfaceTextureEntry) {
        A a8 = new A(this);
        this.f17207a = textureRegistry$SurfaceTextureEntry;
        this.f17208b = textureRegistry$SurfaceTextureEntry.surfaceTexture();
        textureRegistry$SurfaceTextureEntry.setOnTrimMemoryListener(a8);
    }

    @Override // io.flutter.plugin.platform.n
    public final void a(int i, int i4) {
        this.f17209d = i;
        this.e = i4;
        SurfaceTexture surfaceTexture = this.f17208b;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i4);
        }
    }

    @Override // io.flutter.plugin.platform.n
    public final int getHeight() {
        return this.e;
    }

    @Override // io.flutter.plugin.platform.n
    public final long getId() {
        return this.f17207a.id();
    }

    @Override // io.flutter.plugin.platform.n
    public final Surface getSurface() {
        Surface surface = this.c;
        if (surface == null || this.f) {
            if (surface != null) {
                surface.release();
                this.c = null;
            }
            this.c = new Surface(this.f17208b);
            this.f = false;
        }
        SurfaceTexture surfaceTexture = this.f17208b;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            return null;
        }
        return this.c;
    }

    @Override // io.flutter.plugin.platform.n
    public final int getWidth() {
        return this.f17209d;
    }

    @Override // io.flutter.plugin.platform.n
    public final void release() {
        this.f17208b = null;
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
            this.c = null;
        }
    }

    @Override // io.flutter.plugin.platform.n
    public final /* synthetic */ void scheduleFrame() {
    }
}
