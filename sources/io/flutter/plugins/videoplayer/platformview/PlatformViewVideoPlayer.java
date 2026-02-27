package io.flutter.plugins.videoplayer.platformview;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import io.flutter.plugins.videoplayer.ExoPlayerEventListener;
import io.flutter.plugins.videoplayer.VideoAsset;
import io.flutter.plugins.videoplayer.VideoPlayer;
import io.flutter.plugins.videoplayer.VideoPlayerCallbacks;
import io.flutter.plugins.videoplayer.VideoPlayerOptions;
import io.flutter.view.TextureRegistry$SurfaceProducer;

/* JADX INFO: loaded from: classes4.dex */
public class PlatformViewVideoPlayer extends VideoPlayer {
    @VisibleForTesting
    public PlatformViewVideoPlayer(@NonNull VideoPlayerCallbacks videoPlayerCallbacks, @NonNull MediaItem mediaItem, @NonNull VideoPlayerOptions videoPlayerOptions, @NonNull VideoPlayer.ExoPlayerProvider exoPlayerProvider) {
        super(videoPlayerCallbacks, mediaItem, videoPlayerOptions, null, exoPlayerProvider);
    }

    @NonNull
    public static PlatformViewVideoPlayer create(@NonNull Context context, @NonNull VideoPlayerCallbacks videoPlayerCallbacks, @NonNull VideoAsset videoAsset, @NonNull VideoPlayerOptions videoPlayerOptions) {
        return new PlatformViewVideoPlayer(videoPlayerCallbacks, videoAsset.getMediaItem(), videoPlayerOptions, new a(context, videoAsset, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ExoPlayer lambda$create$0(Context context, VideoAsset videoAsset) {
        return new ExoPlayer.Builder(context).setMediaSourceFactory(videoAsset.getMediaSourceFactory(context)).build();
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayer
    @NonNull
    public ExoPlayerEventListener createExoPlayerEventListener(@NonNull ExoPlayer exoPlayer, @Nullable TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer) {
        return new PlatformViewExoPlayerEventListener(exoPlayer, this.videoPlayerEvents, false);
    }
}
