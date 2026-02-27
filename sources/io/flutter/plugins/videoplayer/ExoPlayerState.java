package io.flutter.plugins.videoplayer;

import androidx.annotation.NonNull;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: classes4.dex */
public final class ExoPlayerState {
    private final PlaybackParameters playbackParameters;
    private final long position;
    private final int repeatMode;
    private final float volume;

    private ExoPlayerState(long j, int i, float f, PlaybackParameters playbackParameters) {
        this.position = j;
        this.repeatMode = i;
        this.volume = f;
        this.playbackParameters = playbackParameters;
    }

    @NonNull
    public static ExoPlayerState save(@NonNull ExoPlayer exoPlayer) {
        return new ExoPlayerState(exoPlayer.getCurrentPosition(), exoPlayer.getRepeatMode(), exoPlayer.getVolume(), exoPlayer.getPlaybackParameters());
    }

    public void restore(@NonNull ExoPlayer exoPlayer) {
        exoPlayer.seekTo(this.position);
        exoPlayer.setRepeatMode(this.repeatMode);
        exoPlayer.setVolume(this.volume);
        exoPlayer.setPlaybackParameters(this.playbackParameters);
    }
}
