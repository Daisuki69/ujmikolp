package io.flutter.plugins.videoplayer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.exoplayer.ExoPlayer;
import io.flutter.view.TextureRegistry$SurfaceProducer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VideoPlayer {

    @NonNull
    protected ExoPlayer exoPlayer = createVideoPlayer();

    @NonNull
    private final ExoPlayerProvider exoPlayerProvider;

    @NonNull
    private final MediaItem mediaItem;

    @NonNull
    private final VideoPlayerOptions options;

    @Nullable
    protected final TextureRegistry$SurfaceProducer surfaceProducer;

    @NonNull
    protected final VideoPlayerCallbacks videoPlayerEvents;

    public interface ExoPlayerProvider {
        @NonNull
        ExoPlayer get();
    }

    public VideoPlayer(@NonNull VideoPlayerCallbacks videoPlayerCallbacks, @NonNull MediaItem mediaItem, @NonNull VideoPlayerOptions videoPlayerOptions, @Nullable TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer, @NonNull ExoPlayerProvider exoPlayerProvider) {
        this.videoPlayerEvents = videoPlayerCallbacks;
        this.mediaItem = mediaItem;
        this.options = videoPlayerOptions;
        this.exoPlayerProvider = exoPlayerProvider;
        this.surfaceProducer = textureRegistry$SurfaceProducer;
    }

    private static void setAudioAttributes(ExoPlayer exoPlayer, boolean z4) {
        exoPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(3).build(), !z4);
    }

    @NonNull
    public abstract ExoPlayerEventListener createExoPlayerEventListener(@NonNull ExoPlayer exoPlayer, @Nullable TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer);

    @NonNull
    public ExoPlayer createVideoPlayer() {
        ExoPlayer exoPlayer = this.exoPlayerProvider.get();
        exoPlayer.setMediaItem(this.mediaItem);
        exoPlayer.prepare();
        exoPlayer.addListener(createExoPlayerEventListener(exoPlayer, this.surfaceProducer));
        setAudioAttributes(exoPlayer, this.options.mixWithOthers);
        return exoPlayer;
    }

    public void dispose() {
        this.exoPlayer.release();
    }

    @NonNull
    public ExoPlayer getExoPlayer() {
        return this.exoPlayer;
    }

    public long getPosition() {
        return this.exoPlayer.getCurrentPosition();
    }

    public void pause() {
        this.exoPlayer.pause();
    }

    public void play() {
        this.exoPlayer.play();
    }

    public void seekTo(int i) {
        this.exoPlayer.seekTo(i);
    }

    public void sendBufferingUpdate() {
        this.videoPlayerEvents.onBufferingUpdate(this.exoPlayer.getBufferedPosition());
    }

    public void setLooping(boolean z4) {
        this.exoPlayer.setRepeatMode(z4 ? 2 : 0);
    }

    public void setPlaybackSpeed(double d10) {
        this.exoPlayer.setPlaybackParameters(new PlaybackParameters((float) d10));
    }

    public void setVolume(double d10) {
        this.exoPlayer.setVolume((float) Math.max(AudioStats.AUDIO_AMPLITUDE_NONE, Math.min(1.0d, d10)));
    }
}
