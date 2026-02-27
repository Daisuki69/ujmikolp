package W0;

import android.os.Looper;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode;
import com.shield.android.ShieldCallback;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import pg.t;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6198b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6199d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6200g;

    public /* synthetic */ l(com.shield.android.f.f fVar, String str, HashMap map, ShieldCallback shieldCallback, Looper looper, Thread thread) {
        this.f6197a = 3;
        this.c = fVar;
        this.e = str;
        this.f6200g = map;
        this.f = shieldCallback;
        this.f6199d = looper;
        this.f6198b = thread;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.f6197a) {
            case 0:
                n nVar = (n) this.c;
                d dVar = (d) this.f6200g;
                Set set = (Set) this.f;
                String str = (String) this.e;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f6199d;
                CountDownLatch countDownLatch = (CountDownLatch) this.f6198b;
                try {
                    concurrentHashMap.put(dVar, nVar.a(dVar, set, str));
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 1:
                ((CountDownLatch) this.f6198b).await();
                Ld.b bVar = new Ld.b(3, (ConcurrentHashMap) this.f6199d, (String) this.e, (Set) this.f);
                ((n) this.c).c((t) this.f6200g, bVar);
                return;
            case 2:
                Map.Entry entry = (Map.Entry) this.f6198b;
                ((DualSurfaceProcessorNode) this.c).lambda$sendSurfaceOutputs$0((CameraInternal) this.f6200g, (CameraInternal) this.f, (SurfaceEdge) this.e, (SurfaceEdge) this.f6199d, entry);
                return;
            default:
                ((com.shield.android.f.f) this.c).a((String) this.e, (HashMap) this.f6200g, (ShieldCallback) this.f, (Looper) this.f6199d, (Thread) this.f6198b);
                return;
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f6197a = i;
        this.c = obj;
        this.f6200g = obj2;
        this.f = obj3;
        this.e = obj4;
        this.f6199d = obj5;
        this.f6198b = obj6;
    }

    public /* synthetic */ l(CountDownLatch countDownLatch, n nVar, t tVar, ConcurrentHashMap concurrentHashMap, String str, Set set) {
        this.f6197a = 1;
        this.f6198b = countDownLatch;
        this.c = nVar;
        this.f6200g = tVar;
        this.f6199d = concurrentHashMap;
        this.e = str;
        this.f = set;
    }
}
