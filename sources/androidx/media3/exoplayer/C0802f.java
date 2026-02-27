package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: renamed from: androidx.media3.exoplayer.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0802f implements N1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoadControl f8018b;

    public /* synthetic */ C0802f(LoadControl loadControl, int i) {
        this.f8017a = i;
        this.f8018b = loadControl;
    }

    @Override // N1.o
    public final Object get() {
        switch (this.f8017a) {
            case 0:
                return ExoPlayer.Builder.lambda$setLoadControl$19(this.f8018b);
            default:
                return ExoPlayer.Builder.lambda$new$11(this.f8018b);
        }
    }
}
