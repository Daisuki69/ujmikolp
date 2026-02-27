package io.flutter.plugins.videoplayer.platformview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.ExoPlayer;
import io.flutter.plugin.platform.k;

/* JADX INFO: loaded from: classes4.dex */
public final class PlatformVideoView implements k {

    @NonNull
    private final SurfaceView surfaceView;

    @OptIn(markerClass = {UnstableApi.class})
    public PlatformVideoView(@NonNull Context context, @NonNull ExoPlayer exoPlayer) {
        SurfaceView surfaceView = new SurfaceView(context);
        this.surfaceView = surfaceView;
        int i = Build.VERSION.SDK_INT;
        if (i == 28) {
            setupSurfaceWithCallback(exoPlayer);
            return;
        }
        if (i <= 25) {
            surfaceView.setZOrderMediaOverlay(true);
        }
        exoPlayer.setVideoSurfaceView(surfaceView);
    }

    private void setupSurfaceWithCallback(@NonNull final ExoPlayer exoPlayer) {
        this.surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: io.flutter.plugins.videoplayer.platformview.PlatformVideoView.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i4, int i6) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                exoPlayer.setVideoSurface(surfaceHolder.getSurface());
                exoPlayer.seekTo(1L);
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
                exoPlayer.setVideoSurface(null);
            }
        });
    }

    @Override // io.flutter.plugin.platform.k
    public void dispose() {
        this.surfaceView.getHolder().getSurface().release();
    }

    @Override // io.flutter.plugin.platform.k
    @NonNull
    public View getView() {
        return this.surfaceView;
    }

    @Override // io.flutter.plugin.platform.k
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onFlutterViewAttached(@NonNull View view) {
    }

    @Override // io.flutter.plugin.platform.k
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onFlutterViewDetached() {
    }

    @Override // io.flutter.plugin.platform.k
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
    }

    @Override // io.flutter.plugin.platform.k
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
    }
}
