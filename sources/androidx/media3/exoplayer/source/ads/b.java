package androidx.media3.exoplayer.source.ads;

import androidx.media3.exoplayer.source.ads.AdsMediaSource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdsMediaSource f8077b;
    public final /* synthetic */ AdsMediaSource.ComponentListener c;

    public /* synthetic */ b(AdsMediaSource adsMediaSource, AdsMediaSource.ComponentListener componentListener, int i) {
        this.f8076a = i;
        this.f8077b = adsMediaSource;
        this.c = componentListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8076a) {
            case 0:
                this.f8077b.lambda$prepareSourceInternal$0(this.c);
                break;
            default:
                this.f8077b.lambda$releaseSourceInternal$1(this.c);
                break;
        }
    }
}
