package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: renamed from: androidx.media3.exoplayer.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0805i implements N1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RenderersFactory f8030b;

    public /* synthetic */ C0805i(RenderersFactory renderersFactory, int i) {
        this.f8029a = i;
        this.f8030b = renderersFactory;
    }

    @Override // N1.o
    public final Object get() {
        switch (this.f8029a) {
            case 0:
                return ExoPlayer.Builder.lambda$setRenderersFactory$16(this.f8030b);
            case 1:
                return ExoPlayer.Builder.lambda$new$6(this.f8030b);
            case 2:
                return ExoPlayer.Builder.lambda$new$2(this.f8030b);
            default:
                return ExoPlayer.Builder.lambda$new$8(this.f8030b);
        }
    }
}
