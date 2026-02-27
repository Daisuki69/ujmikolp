package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.upstream.BandwidthMeter;

/* JADX INFO: renamed from: androidx.media3.exoplayer.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0807k implements N1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BandwidthMeter f8034b;

    public /* synthetic */ C0807k(BandwidthMeter bandwidthMeter, int i) {
        this.f8033a = i;
        this.f8034b = bandwidthMeter;
    }

    @Override // N1.o
    public final Object get() {
        switch (this.f8033a) {
            case 0:
                return ExoPlayer.Builder.lambda$setBandwidthMeter$20(this.f8034b);
            default:
                return ExoPlayer.Builder.lambda$new$12(this.f8034b);
        }
    }
}
