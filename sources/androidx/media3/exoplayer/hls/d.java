package androidx.media3.exoplayer.hls;

import androidx.media3.exoplayer.hls.HlsSampleStreamWrapper;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8026b;

    public /* synthetic */ d(Object obj, int i) {
        this.f8025a = i;
        this.f8026b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8025a) {
            case 0:
                ((HlsSampleStreamWrapper) this.f8026b).maybeFinishPrepare();
                break;
            case 1:
                ((HlsSampleStreamWrapper) this.f8026b).onTracksEnded();
                break;
            default:
                ((HlsSampleStreamWrapper.Callback) this.f8026b).onPrepared();
                break;
        }
    }
}
