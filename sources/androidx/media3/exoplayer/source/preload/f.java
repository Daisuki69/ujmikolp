package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PreloadMediaSource.PreloadMediaPeriodCallback f8109b;
    public final /* synthetic */ MediaPeriod c;

    public /* synthetic */ f(PreloadMediaSource.PreloadMediaPeriodCallback preloadMediaPeriodCallback, MediaPeriod mediaPeriod, int i) {
        this.f8108a = i;
        this.f8109b = preloadMediaPeriodCallback;
        this.c = mediaPeriod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8108a) {
            case 0:
                this.f8109b.lambda$onPrepared$0(this.c);
                break;
            default:
                this.f8109b.lambda$onContinueLoadingRequested$1(this.c);
                break;
        }
    }
}
