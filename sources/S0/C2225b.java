package s0;

import D.C0190x;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;

/* JADX INFO: renamed from: s0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2225b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0190x f19985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f19986b;
    public final /* synthetic */ ExoPlayer c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0190x f19987d;

    public C2225b(C0190x c0190x, c cVar, ExoPlayer exoPlayer, C0190x c0190x2) {
        this.f19985a = c0190x;
        this.f19986b = cVar;
        this.c = exoPlayer;
        this.f19987d = c0190x2;
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) {
        if (i == 2) {
            this.f19985a.invoke();
            return;
        }
        if (i == 3) {
            this.f19987d.invoke();
            return;
        }
        if (i != 4) {
            return;
        }
        c cVar = this.f19986b;
        if (cVar.f19989b != null) {
            ExoPlayer exoPlayer = this.c;
            exoPlayer.seekTo(0L);
            exoPlayer.setPlayWhenReady(false);
            PlayerView playerView = cVar.f19988a;
            if (playerView != null) {
                playerView.showController();
            }
        }
    }
}
