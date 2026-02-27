package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PreloadMediaSource f8107b;

    public /* synthetic */ d(PreloadMediaSource preloadMediaSource, int i) {
        this.f8106a = i;
        this.f8107b = preloadMediaSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8106a) {
            case 0:
                this.f8107b.lambda$releasePreloadMediaSource$3();
                break;
            default:
                this.f8107b.lambda$clear$1();
                break;
        }
    }
}
