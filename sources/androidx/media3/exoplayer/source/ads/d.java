package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8082b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f8081a = i;
        this.f8082b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8081a) {
            case 0:
                ((AdsMediaSource.AdPrepareListener) this.f8082b).lambda$onPrepareComplete$0((MediaSource.MediaPeriodId) this.c);
                break;
            default:
                ((AdsMediaSource.ComponentListener) this.f8082b).lambda$onAdPlaybackState$0((AdPlaybackState) this.c);
                break;
        }
    }
}
