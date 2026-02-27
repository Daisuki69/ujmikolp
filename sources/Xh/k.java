package Xh;

import androidx.media3.exoplayer.video.VideoRendererEventListener;
import b1.t;
import io.split.android.client.service.http.HttpFetcherException;
import l9.C1803a;
import ui.C2318e;
import ui.C2321h;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f6652b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6653d;

    public /* synthetic */ k(Object obj, Object obj2, long j, int i) {
        this.f6651a = i;
        this.c = obj;
        this.f6653d = obj2;
        this.f6652b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.f6652b;
        Object obj = this.f6653d;
        Object obj2 = this.c;
        switch (this.f6651a) {
            case 0:
                t tVar = (t) obj;
                n nVar = (n) obj2;
                nVar.getClass();
                try {
                    Ri.a.p("Fresh install detected - prefetching targeting rules");
                    U8.c cVar = (U8.c) tVar.f8333a;
                    C2321h c2321h = nVar.m;
                    int i = C2318e.f20332l;
                    try {
                        c2321h.a(new C1803a(cVar, 21));
                        break;
                    } catch (HttpFetcherException e) {
                        throw e;
                    } catch (Exception e7) {
                        Ri.a.p("Unexpected error pre fetching splits: " + e7.getMessage());
                    }
                    Ri.a.p("Fresh install prefetch completed in " + (System.currentTimeMillis() - j) + "ms");
                    return;
                } catch (HttpFetcherException e10) {
                    Ri.a.p("Error prefetching targeting rules on fresh install: " + e10.getLocalizedMessage());
                    return;
                }
            default:
                ((VideoRendererEventListener.EventDispatcher) obj2).lambda$renderedFirstFrame$6(obj, j);
                return;
        }
    }
}
