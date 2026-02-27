package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProgressiveMediaPeriod f8098b;

    public /* synthetic */ m(ProgressiveMediaPeriod progressiveMediaPeriod, int i) {
        this.f8097a = i;
        this.f8098b = progressiveMediaPeriod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8097a) {
            case 0:
                this.f8098b.lambda$onLengthKnown$2();
                break;
            case 1:
                this.f8098b.maybeFinishPrepare();
                break;
            default:
                this.f8098b.lambda$new$0();
                break;
        }
    }
}
