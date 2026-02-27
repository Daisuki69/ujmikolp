package io.flutter.plugins.videoplayer;

import We.s;
import androidx.annotation.NonNull;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.e;
import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ExoPlayerEventListener implements Player.Listener {
    protected final VideoPlayerCallbacks events;
    protected final ExoPlayer exoPlayer;
    private boolean isBuffering = false;
    private boolean isInitialized;

    public enum RotationDegrees {
        ROTATE_0(0),
        ROTATE_90(90),
        ROTATE_180(180),
        ROTATE_270(270);

        private final int degrees;

        RotationDegrees(int i) {
            this.degrees = i;
        }

        public static RotationDegrees fromDegrees(int i) {
            for (RotationDegrees rotationDegrees : values()) {
                if (rotationDegrees.degrees == i) {
                    return rotationDegrees;
                }
            }
            throw new IllegalArgumentException(s.f(i, "Invalid rotation degrees specified: "));
        }

        public int getDegrees() {
            return this.degrees;
        }
    }

    public ExoPlayerEventListener(@NonNull ExoPlayer exoPlayer, @NonNull VideoPlayerCallbacks videoPlayerCallbacks, boolean z4) {
        this.exoPlayer = exoPlayer;
        this.events = videoPlayerCallbacks;
        this.isInitialized = z4;
    }

    private void setBuffering(boolean z4) {
        if (this.isBuffering == z4) {
            return;
        }
        this.isBuffering = z4;
        if (z4) {
            this.events.onBufferingStart();
        } else {
            this.events.onBufferingEnd();
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        e.a(this, audioAttributes);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onAudioSessionIdChanged(int i) {
        e.b(this, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        e.c(this, commands);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onCues(CueGroup cueGroup) {
        e.d(this, cueGroup);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        e.f(this, deviceInfo);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onDeviceVolumeChanged(int i, boolean z4) {
        e.g(this, i, z4);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onEvents(Player player, Player.Events events) {
        e.h(this, player, events);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onIsLoadingChanged(boolean z4) {
        e.i(this, z4);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onIsPlayingChanged(boolean z4) {
        this.events.onIsPlayingStateUpdate(z4);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onLoadingChanged(boolean z4) {
        e.k(this, z4);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
        e.l(this, j);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
        e.m(this, mediaItem, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        e.n(this, mediaMetadata);
    }

    @Override // androidx.media3.common.Player.Listener, androidx.media3.exoplayer.metadata.MetadataOutput
    public final /* synthetic */ void onMetadata(Metadata metadata) {
        e.o(this, metadata);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z4, int i) {
        e.p(this, z4, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        e.q(this, playbackParameters);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlaybackStateChanged(int i) {
        if (i == 2) {
            setBuffering(true);
            this.events.onBufferingUpdate(this.exoPlayer.getBufferedPosition());
        } else if (i != 3) {
            if (i == 4) {
                this.events.onCompleted();
            }
        } else {
            if (this.isInitialized) {
                return;
            }
            this.isInitialized = true;
            sendInitialized();
        }
        if (i != 2) {
            setBuffering(false);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        e.s(this, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerError(@NonNull PlaybackException playbackException) {
        setBuffering(false);
        if (playbackException.errorCode == 1002) {
            this.exoPlayer.seekToDefaultPosition();
            this.exoPlayer.prepare();
        } else {
            this.events.onError("VideoError", "Video player had error " + playbackException, null);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        e.u(this, playbackException);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlayerStateChanged(boolean z4, int i) {
        e.v(this, z4, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        e.w(this, mediaMetadata);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPositionDiscontinuity(int i) {
        e.x(this, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onRenderedFirstFrame() {
        e.z(this);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onRepeatModeChanged(int i) {
        e.A(this, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onSeekBackIncrementChanged(long j) {
        e.B(this, j);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onSeekForwardIncrementChanged(long j) {
        e.C(this, j);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z4) {
        e.D(this, z4);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z4) {
        e.E(this, z4);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onSurfaceSizeChanged(int i, int i4) {
        e.F(this, i, i4);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
        e.G(this, timeline, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        e.H(this, trackSelectionParameters);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onTracksChanged(Tracks tracks) {
        e.I(this, tracks);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
        e.J(this, videoSize);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onVolumeChanged(float f) {
        e.K(this, f);
    }

    public abstract void sendInitialized();

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onCues(List list) {
        e.e(this, list);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        e.y(this, positionInfo, positionInfo2, i);
    }
}
