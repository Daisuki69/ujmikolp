package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.TextureRegistry$GLTextureConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import io.flutter.view.r;

/* JADX INFO: loaded from: classes4.dex */
final class SurfaceTextureSurfaceProducer implements TextureRegistry$SurfaceProducer, TextureRegistry$GLTextureConsumer {

    @NonNull
    private final FlutterJNI flutterJNI;

    @NonNull
    private final Handler handler;
    private final long id;
    private boolean released;
    private int requestBufferWidth;
    private int requestedBufferHeight;

    @Nullable
    private Surface surface;

    @NonNull
    private final TextureRegistry$SurfaceTextureEntry texture;

    public SurfaceTextureSurfaceProducer(long j, @NonNull Handler handler, @NonNull FlutterJNI flutterJNI, @NonNull TextureRegistry$SurfaceTextureEntry textureRegistry$SurfaceTextureEntry) {
        this.id = j;
        this.handler = handler;
        this.flutterJNI = flutterJNI;
        this.texture = textureRegistry$SurfaceTextureEntry;
    }

    public void finalize() throws Throwable {
        try {
            if (this.released) {
                return;
            }
            release();
            this.handler.post(new FlutterRenderer.TextureFinalizerRunnable(this.id, this.flutterJNI));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getHeight() {
        return this.requestedBufferHeight;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getSurface() {
        if (this.surface == null) {
            this.surface = new Surface(this.texture.surfaceTexture());
        }
        return this.surface;
    }

    @Override // io.flutter.view.TextureRegistry$GLTextureConsumer
    @NonNull
    public SurfaceTexture getSurfaceTexture() {
        return this.texture.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getWidth() {
        return this.requestBufferWidth;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public long id() {
        return this.id;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void release() {
        this.texture.release();
        this.released = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void scheduleFrame() {
        this.flutterJNI.markTextureFrameAvailable(this.id);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setCallback(r rVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setSize(int i, int i4) {
        this.requestBufferWidth = i;
        this.requestedBufferHeight = i4;
        getSurfaceTexture().setDefaultBufferSize(i, i4);
    }
}
