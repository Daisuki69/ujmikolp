package r0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.res.ResourcesCompat;
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
import com.paymaya.R;
import d4.AbstractC1331a;
import kotlin.jvm.internal.j;
import q0.InterfaceC2158a;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements InterfaceC2158a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExoPlayer f19828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PlayerView f19829b;
    public ViewGroup.LayoutParams c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FrameLayout.LayoutParams f19830d;
    public long e;

    @Override // q0.InterfaceC2158a
    public final View a() {
        View view = this.f19829b;
        j.d(view);
        return view;
    }

    @Override // q0.InterfaceC2158a
    public final void b() {
        ExoPlayer exoPlayer = this.f19828a;
        if (exoPlayer != null) {
            j.d(exoPlayer);
            this.e = exoPlayer.getCurrentPosition();
        }
    }

    @Override // q0.InterfaceC2158a
    public final void c(Context context, String url) {
        j.g(url, "url");
        if (this.f19828a != null) {
            return;
        }
        DefaultBandwidthMeter defaultBandwidthMeterBuild = new DefaultBandwidthMeter.Builder(context).build();
        j.f(defaultBandwidthMeterBuild, "build(...)");
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(context, new AdaptiveTrackSelection.Factory());
        String userAgent = Util.getUserAgent(context, context.getPackageName());
        j.f(userAgent, "getUserAgent(...)");
        DefaultHttpDataSource.Factory transferListener = new DefaultHttpDataSource.Factory().setUserAgent(userAgent).setTransferListener(defaultBandwidthMeterBuild.getTransferListener());
        j.f(transferListener, "setTransferListener(...)");
        DefaultDataSource.Factory factory = new DefaultDataSource.Factory(context, transferListener);
        MediaItem mediaItemFromUri = MediaItem.fromUri(url);
        j.f(mediaItemFromUri, "fromUri(...)");
        HlsMediaSource hlsMediaSourceCreateMediaSource = new HlsMediaSource.Factory(factory).createMediaSource(mediaItemFromUri);
        j.f(hlsMediaSourceCreateMediaSource, "createMediaSource(...)");
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).setTrackSelector(defaultTrackSelector).build();
        exoPlayerBuild.setMediaSource(hlsMediaSourceCreateMediaSource);
        exoPlayerBuild.prepare();
        exoPlayerBuild.setRepeatMode(1);
        exoPlayerBuild.seekTo(this.e);
        this.f19828a = exoPlayerBuild;
    }

    @Override // q0.InterfaceC2158a
    public final void d(boolean z4) {
        if (!z4) {
            PlayerView playerView = this.f19829b;
            j.d(playerView);
            playerView.setLayoutParams(this.c);
        } else {
            PlayerView playerView2 = this.f19829b;
            j.d(playerView2);
            this.c = playerView2.getLayoutParams();
            PlayerView playerView3 = this.f19829b;
            j.d(playerView3);
            playerView3.setLayoutParams(this.f19830d);
        }
    }

    @Override // q0.InterfaceC2158a
    public final void e(Context context, boolean z4) {
        if (this.f19829b != null) {
            return;
        }
        int iJ = (int) AbstractC1331a.j(context, 1, z4 ? 408.0f : 240.0f);
        int iJ2 = (int) AbstractC1331a.j(context, 1, z4 ? 299.0f : 134.0f);
        PlayerView playerView = new PlayerView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iJ, iJ2);
        this.c = layoutParams;
        playerView.setLayoutParams(layoutParams);
        playerView.setShowBuffering(1);
        playerView.setUseArtwork(true);
        playerView.setControllerAutoShow(false);
        playerView.setDefaultArtwork(ResourcesCompat.getDrawable(context.getResources(), R.drawable.ct_audio, null));
        this.f19829b = playerView;
    }

    @Override // q0.InterfaceC2158a
    public final void pause() {
        ExoPlayer exoPlayer = this.f19828a;
        if (exoPlayer != null) {
            exoPlayer.stop();
            exoPlayer.release();
            this.f19828a = null;
        }
    }

    @Override // q0.InterfaceC2158a
    public final void play() {
        PlayerView playerView = this.f19829b;
        if (playerView != null) {
            playerView.requestFocus();
            playerView.setVisibility(0);
            playerView.setPlayer(this.f19828a);
        }
        ExoPlayer exoPlayer = this.f19828a;
        if (exoPlayer != null) {
            exoPlayer.setPlayWhenReady(true);
        }
    }
}
