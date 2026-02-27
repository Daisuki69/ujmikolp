package io.flutter.plugins.videoplayer.platformview;

import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.ExoPlayer;
import io.flutter.plugins.videoplayer.ExoPlayerEventListener;
import io.flutter.plugins.videoplayer.VideoPlayerCallbacks;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class PlatformViewExoPlayerEventListener extends ExoPlayerEventListener {
    @VisibleForTesting
    public PlatformViewExoPlayerEventListener(@NonNull ExoPlayer exoPlayer, @NonNull VideoPlayerCallbacks videoPlayerCallbacks) {
        this(exoPlayer, videoPlayerCallbacks, false);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener
    @OptIn(markerClass = {UnstableApi.class})
    public void sendInitialized() {
        int i;
        int i4;
        Format videoFormat = this.exoPlayer.getVideoFormat();
        Objects.requireNonNull(videoFormat);
        ExoPlayerEventListener.RotationDegrees rotationDegreesFromDegrees = ExoPlayerEventListener.RotationDegrees.fromDegrees(videoFormat.rotationDegrees);
        int i6 = videoFormat.width;
        int i10 = videoFormat.height;
        if (rotationDegreesFromDegrees == ExoPlayerEventListener.RotationDegrees.ROTATE_90 || rotationDegreesFromDegrees == ExoPlayerEventListener.RotationDegrees.ROTATE_270) {
            rotationDegreesFromDegrees = ExoPlayerEventListener.RotationDegrees.fromDegrees(0);
            i = i10;
            i4 = i6;
        } else {
            i4 = i10;
            i = i6;
        }
        this.events.onInitialized(i, i4, this.exoPlayer.getDuration(), rotationDegreesFromDegrees.getDegrees());
    }

    public PlatformViewExoPlayerEventListener(@NonNull ExoPlayer exoPlayer, @NonNull VideoPlayerCallbacks videoPlayerCallbacks, boolean z4) {
        super(exoPlayer, videoPlayerCallbacks, z4);
    }
}
