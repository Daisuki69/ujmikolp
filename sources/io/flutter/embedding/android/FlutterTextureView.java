package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.RenderSurface;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterTextureView extends TextureView implements RenderSurface {
    private static final String TAG = "FlutterTextureView";

    @Nullable
    private FlutterRenderer flutterRenderer;
    private boolean isPaused;
    private boolean isSurfaceAvailableForRendering;

    @Nullable
    private Surface renderSurface;
    private final TextureView.SurfaceTextureListener surfaceTextureListener;

    public FlutterTextureView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeSurfaceSize(int i, int i4) {
        FlutterRenderer flutterRenderer = this.flutterRenderer;
        if (flutterRenderer == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.surfaceChanged(i, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectSurfaceToRenderer() {
        if (this.flutterRenderer == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.renderSurface;
        if (surface != null) {
            surface.release();
            this.renderSurface = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.renderSurface = surface2;
        this.flutterRenderer.startRenderingToSurface(surface2, this.isPaused);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disconnectSurfaceFromRenderer() {
        FlutterRenderer flutterRenderer = this.flutterRenderer;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.stopRenderingToSurface();
        Surface surface = this.renderSurface;
        if (surface != null) {
            surface.release();
            this.renderSurface = null;
        }
    }

    private void init() {
        setSurfaceTextureListener(this.surfaceTextureListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldNotify() {
        return (this.flutterRenderer == null || this.isPaused) ? false : true;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void attachToRenderer(@NonNull FlutterRenderer flutterRenderer) {
        FlutterRenderer flutterRenderer2 = this.flutterRenderer;
        if (flutterRenderer2 != null) {
            flutterRenderer2.stopRenderingToSurface();
        }
        this.flutterRenderer = flutterRenderer;
        resume();
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void detachFromRenderer() {
        if (this.flutterRenderer == null) {
            Log.w(TAG, "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            disconnectSurfaceFromRenderer();
        }
        this.flutterRenderer = null;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    @Nullable
    public FlutterRenderer getAttachedRenderer() {
        return this.flutterRenderer;
    }

    @VisibleForTesting
    public boolean isSurfaceAvailableForRendering() {
        return this.isSurfaceAvailableForRendering;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void pause() {
        if (this.flutterRenderer == null) {
            Log.w(TAG, "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.isPaused = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void resume() {
        if (this.flutterRenderer == null) {
            Log.w(TAG, "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (isSurfaceAvailableForRendering()) {
            connectSurfaceToRenderer();
        }
        this.isPaused = false;
    }

    @VisibleForTesting
    public void setRenderSurface(Surface surface) {
        this.renderSurface = surface;
    }

    public FlutterTextureView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isSurfaceAvailableForRendering = false;
        this.isPaused = false;
        this.surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: io.flutter.embedding.android.FlutterTextureView.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i4) {
                FlutterTextureView.this.isSurfaceAvailableForRendering = true;
                if (FlutterTextureView.this.shouldNotify()) {
                    FlutterTextureView.this.connectSurfaceToRenderer();
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(@NonNull SurfaceTexture surfaceTexture) {
                FlutterTextureView.this.isSurfaceAvailableForRendering = false;
                if (FlutterTextureView.this.shouldNotify()) {
                    FlutterTextureView.this.disconnectSurfaceFromRenderer();
                }
                if (FlutterTextureView.this.renderSurface == null) {
                    return true;
                }
                FlutterTextureView.this.renderSurface.release();
                FlutterTextureView.this.renderSurface = null;
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surfaceTexture, int i, int i4) {
                if (FlutterTextureView.this.shouldNotify()) {
                    FlutterTextureView.this.changeSurfaceSize(i, i4);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(@NonNull SurfaceTexture surfaceTexture) {
            }
        };
        init();
    }
}
