package androidx.media3.exoplayer.source.preload;

import N1.j;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8104a;

    public /* synthetic */ b(int i) {
        this.f8104a = i;
    }

    @Override // N1.j
    public final boolean apply(Object obj) {
        DefaultPreloadManager.Status status = (DefaultPreloadManager.Status) obj;
        switch (this.f8104a) {
            case 0:
                return DefaultPreloadManager.SourcePreloadControl.lambda$onTracksSelected$1(status);
            default:
                return DefaultPreloadManager.SourcePreloadControl.lambda$onSourcePrepared$0(status);
        }
    }
}
