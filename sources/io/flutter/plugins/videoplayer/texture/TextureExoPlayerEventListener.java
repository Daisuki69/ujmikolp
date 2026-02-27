package io.flutter.plugins.videoplayer.texture;

import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.ExoPlayer;
import io.flutter.plugins.videoplayer.ExoPlayerEventListener;
import io.flutter.plugins.videoplayer.VideoPlayerCallbacks;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class TextureExoPlayerEventListener extends ExoPlayerEventListener {
    private boolean surfaceProducerHandlesCropAndRotation;

    @VisibleForTesting
    public TextureExoPlayerEventListener(@NonNull ExoPlayer exoPlayer, @NonNull VideoPlayerCallbacks videoPlayerCallbacks, boolean z4) {
        this(exoPlayer, videoPlayerCallbacks, z4, false);
    }

    @OptIn(markerClass = {UnstableApi.class})
    private int getRotationCorrectionFromFormat(ExoPlayer exoPlayer) {
        Format videoFormat = exoPlayer.getVideoFormat();
        Objects.requireNonNull(videoFormat);
        return videoFormat.rotationDegrees;
    }

    private ExoPlayerEventListener.RotationDegrees getRotationCorrectionFromUnappliedRotation(ExoPlayerEventListener.RotationDegrees rotationDegrees) {
        return rotationDegrees == ExoPlayerEventListener.RotationDegrees.ROTATE_180 ? rotationDegrees : ExoPlayerEventListener.RotationDegrees.ROTATE_0;
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener
    public void sendInitialized() {
        VideoSize videoSize = this.exoPlayer.getVideoSize();
        ExoPlayerEventListener.RotationDegrees rotationDegreesFromDegrees = ExoPlayerEventListener.RotationDegrees.ROTATE_0;
        int i = videoSize.width;
        int i4 = videoSize.height;
        if (i != 0 && i4 != 0 && !this.surfaceProducerHandlesCropAndRotation) {
            try {
                rotationDegreesFromDegrees = ExoPlayerEventListener.RotationDegrees.fromDegrees(getRotationCorrectionFromFormat(this.exoPlayer));
            } catch (IllegalArgumentException unused) {
                rotationDegreesFromDegrees = ExoPlayerEventListener.RotationDegrees.ROTATE_0;
            }
        }
        this.events.onInitialized(i, i4, this.exoPlayer.getDuration(), rotationDegreesFromDegrees.getDegrees());
    }

    public TextureExoPlayerEventListener(@NonNull ExoPlayer exoPlayer, @NonNull VideoPlayerCallbacks videoPlayerCallbacks, boolean z4, boolean z5) {
        super(exoPlayer, videoPlayerCallbacks, z5);
        this.surfaceProducerHandlesCropAndRotation = z4;
    }
}
