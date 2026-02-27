package s0;

import D.C0190x;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.ui.PlayerView;
import kotlin.jvm.internal.j;
import q0.InterfaceC2159b;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements InterfaceC2159b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerView f19988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExoPlayer f19989b;

    @Override // q0.InterfaceC2159b
    public final View a() {
        View view = this.f19988a;
        j.d(view);
        return view;
    }

    @Override // q0.InterfaceC2159b
    public final void b() {
        ExoPlayer exoPlayer = this.f19989b;
        if (exoPlayer != null) {
            float fE = e();
            if (fE > 0.0f) {
                exoPlayer.setVolume(0.0f);
            } else if (fE == 0.0f) {
                exoPlayer.setVolume(1.0f);
            }
        }
    }

    @Override // q0.InterfaceC2159b
    public final void c(Context context, C0190x c0190x) {
        if (this.f19988a != null) {
            return;
        }
        PlayerView playerView = new PlayerView(context);
        playerView.setBackgroundColor(0);
        playerView.setResizeMode(context.getResources().getConfiguration().orientation == 2 ? 3 : 0);
        playerView.setUseArtwork(true);
        playerView.setDefaultArtwork((Drawable) c0190x.invoke());
        playerView.setUseController(true);
        playerView.setControllerAutoShow(false);
        playerView.setPlayer(this.f19989b);
        this.f19988a = playerView;
    }

    @Override // q0.InterfaceC2159b
    public final void d(Context context, C0190x c0190x, C0190x c0190x2) {
        if (this.f19989b != null) {
            return;
        }
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).setTrackSelector(new DefaultTrackSelector(context, new AdaptiveTrackSelection.Factory())).build();
        exoPlayerBuild.setVolume(0.0f);
        exoPlayerBuild.addListener(new C2225b(c0190x, this, exoPlayerBuild, c0190x2));
        this.f19989b = exoPlayerBuild;
    }

    @Override // q0.InterfaceC2159b
    public final float e() {
        ExoPlayer exoPlayer = this.f19989b;
        if (exoPlayer != null) {
            return exoPlayer.getVolume();
        }
        return 0.0f;
    }

    @Override // q0.InterfaceC2159b
    public final void f(Context context, String uriString, boolean z4, boolean z5) {
        j.g(uriString, "uriString");
        PlayerView playerView = this.f19988a;
        if (playerView != null) {
            playerView.requestFocus();
            playerView.setShowBuffering(0);
        }
        ExoPlayer exoPlayer = this.f19989b;
        if (exoPlayer != null) {
            DefaultBandwidthMeter defaultBandwidthMeterBuild = new DefaultBandwidthMeter.Builder(context).build();
            j.f(defaultBandwidthMeterBuild, "build(...)");
            String userAgent = Util.getUserAgent(context, context.getPackageName());
            j.f(userAgent, "getUserAgent(...)");
            MediaItem mediaItemFromUri = MediaItem.fromUri(uriString);
            j.f(mediaItemFromUri, "fromUri(...)");
            DefaultHttpDataSource.Factory transferListener = new DefaultHttpDataSource.Factory().setUserAgent(userAgent).setTransferListener(defaultBandwidthMeterBuild);
            j.f(transferListener, "setTransferListener(...)");
            HlsMediaSource hlsMediaSourceCreateMediaSource = new HlsMediaSource.Factory(new DefaultDataSource.Factory(context, transferListener)).createMediaSource(mediaItemFromUri);
            j.f(hlsMediaSourceCreateMediaSource, "createMediaSource(...)");
            exoPlayer.setMediaSource(hlsMediaSourceCreateMediaSource);
            exoPlayer.prepare();
            if (!z4) {
                if (z5) {
                    exoPlayer.setPlayWhenReady(true);
                    exoPlayer.setVolume(e());
                    return;
                }
                return;
            }
            PlayerView playerView2 = this.f19988a;
            if (playerView2 != null) {
                playerView2.showController();
            }
            exoPlayer.setPlayWhenReady(false);
            exoPlayer.setVolume(1.0f);
        }
    }

    @Override // q0.InterfaceC2159b
    public final void pause() {
        ExoPlayer exoPlayer = this.f19989b;
        if (exoPlayer != null) {
            exoPlayer.stop();
            exoPlayer.release();
        }
        this.f19989b = null;
        this.f19988a = null;
    }

    @Override // q0.InterfaceC2159b
    public final void setPlayWhenReady(boolean z4) {
        ExoPlayer exoPlayer = this.f19989b;
        if (exoPlayer != null) {
            exoPlayer.setPlayWhenReady(z4);
        }
    }
}
