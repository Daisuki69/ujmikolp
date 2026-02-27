package io.flutter.plugins.videoplayer.texture;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import io.flutter.plugins.videoplayer.ExoPlayerEventListener;
import io.flutter.plugins.videoplayer.ExoPlayerState;
import io.flutter.plugins.videoplayer.VideoAsset;
import io.flutter.plugins.videoplayer.VideoPlayer;
import io.flutter.plugins.videoplayer.VideoPlayerCallbacks;
import io.flutter.plugins.videoplayer.VideoPlayerOptions;
import io.flutter.plugins.videoplayer.platformview.a;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.r;

/* JADX INFO: loaded from: classes4.dex */
public final class TextureVideoPlayer extends VideoPlayer implements r {

    @Nullable
    private ExoPlayerState savedStateDuring;

    @VisibleForTesting
    public TextureVideoPlayer(@NonNull VideoPlayerCallbacks videoPlayerCallbacks, @NonNull TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer, @NonNull MediaItem mediaItem, @NonNull VideoPlayerOptions videoPlayerOptions, @NonNull VideoPlayer.ExoPlayerProvider exoPlayerProvider) {
        super(videoPlayerCallbacks, mediaItem, videoPlayerOptions, textureRegistry$SurfaceProducer, exoPlayerProvider);
        textureRegistry$SurfaceProducer.setCallback(this);
        this.exoPlayer.setVideoSurface(textureRegistry$SurfaceProducer.getSurface());
    }

    @NonNull
    public static TextureVideoPlayer create(@NonNull Context context, @NonNull VideoPlayerCallbacks videoPlayerCallbacks, @NonNull TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer, @NonNull VideoAsset videoAsset, @NonNull VideoPlayerOptions videoPlayerOptions) {
        return new TextureVideoPlayer(videoPlayerCallbacks, textureRegistry$SurfaceProducer, videoAsset.getMediaItem(), videoPlayerOptions, new a(context, videoAsset, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ExoPlayer lambda$create$0(Context context, VideoAsset videoAsset) {
        return new ExoPlayer.Builder(context).setMediaSourceFactory(videoAsset.getMediaSourceFactory(context)).build();
    }

    private boolean playerHasBeenSuspended() {
        return this.savedStateDuring != null;
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayer
    @NonNull
    public ExoPlayerEventListener createExoPlayerEventListener(@NonNull ExoPlayer exoPlayer, @Nullable TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer) {
        if (textureRegistry$SurfaceProducer == null) {
            throw new IllegalArgumentException("surfaceProducer cannot be null to create an ExoPlayerEventListener for TextureVideoPlayer.");
        }
        return new TextureExoPlayerEventListener(exoPlayer, this.videoPlayerEvents, textureRegistry$SurfaceProducer.handlesCropAndRotation(), playerHasBeenSuspended());
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayer
    public void dispose() {
        super.dispose();
        this.surfaceProducer.release();
        this.surfaceProducer.setCallback(null);
    }

    @Override // io.flutter.view.r
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onSurfaceAvailable() {
        if (this.savedStateDuring != null) {
            ExoPlayer exoPlayerCreateVideoPlayer = createVideoPlayer();
            this.exoPlayer = exoPlayerCreateVideoPlayer;
            exoPlayerCreateVideoPlayer.setVideoSurface(this.surfaceProducer.getSurface());
            this.savedStateDuring.restore(this.exoPlayer);
            this.savedStateDuring = null;
        }
    }

    @Deprecated(forRemoval = true, since = "Flutter 3.27")
    public /* bridge */ /* synthetic */ void onSurfaceCreated() {
    }

    @Override // io.flutter.view.r
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onSurfaceDestroyed() {
        this.savedStateDuring = ExoPlayerState.save(this.exoPlayer);
        this.exoPlayer.release();
    }
}
