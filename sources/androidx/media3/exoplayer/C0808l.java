package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.trackselection.TrackSelector;

/* JADX INFO: renamed from: androidx.media3.exoplayer.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0808l implements N1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackSelector f8036b;

    public /* synthetic */ C0808l(TrackSelector trackSelector, int i) {
        this.f8035a = i;
        this.f8036b = trackSelector;
    }

    @Override // N1.o
    public final Object get() {
        switch (this.f8035a) {
            case 0:
                return ExoPlayer.Builder.lambda$new$10(this.f8036b);
            default:
                return ExoPlayer.Builder.lambda$setTrackSelector$18(this.f8036b);
        }
    }
}
