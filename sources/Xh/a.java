package Xh;

import D.C0176i;
import D8.C0193a;
import android.os.Handler;
import android.os.Looper;
import gi.C1525c;
import gi.RunnableC1524b;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import ki.C1781b;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f6617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f6618b;
    public final Ei.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0176i f6619d;
    public final long e;
    public final Ni.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f6620g;
    public final ScheduledThreadPoolExecutor h;
    public final zi.c i;
    public final C1525c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o3.d f6621k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fi.c f6622l;
    public final C0193a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1781b f6623n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1781b f6624o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ExecutorService f6625p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f6626q;

    public a(ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Ei.c cVar, C0176i c0176i, long j, Ni.a aVar, ThreadPoolExecutor threadPoolExecutor, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, zi.c cVar2, C1525c c1525c, o3.d dVar, fi.c cVar3, io.split.android.client.network.d dVar2, C0193a c0193a, C1781b c1781b, C1781b c1781b2, ExecutorService executorService, AtomicBoolean atomicBoolean2) {
        this.f6617a = reentrantLock;
        this.f6618b = atomicBoolean;
        this.c = cVar;
        this.f6619d = c0176i;
        this.e = j;
        this.f = aVar;
        this.f6620g = threadPoolExecutor;
        this.h = scheduledThreadPoolExecutor;
        this.i = cVar2;
        this.j = c1525c;
        this.f6621k = dVar;
        this.f6622l = cVar3;
        this.m = c0193a;
        this.f6623n = c1781b;
        this.f6624o = c1781b2;
        this.f6625p = executorService;
        this.f6626q = atomicBoolean2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Ni.a aVar = this.f;
        C0176i c0176i = this.f6619d;
        AtomicBoolean atomicBoolean = this.f6618b;
        ReentrantLock reentrantLock = this.f6617a;
        reentrantLock.lock();
        try {
            boolean z4 = atomicBoolean.get();
            Ei.c cVar = this.c;
            if (!z4 || new HashSet(cVar.f1374a.values()).isEmpty()) {
                Ri.a.q("Shutdown called for split");
                ((Qi.c) c0176i.f919l).J(System.currentTimeMillis() - this.e);
                aVar.flush();
                aVar.destroy();
                Ri.a.d("Successful shutdown of telemetry");
                this.f6620g.shutdown();
                this.h.shutdown();
                Ri.a.d("Successful shutdown of impressions logging executor");
                this.i.c();
                Ri.a.d("Flushing impressions and events");
                C1525c c1525c = this.j;
                c1525c.getClass();
                new Handler(Looper.getMainLooper()).post(new RunnableC1524b(c1525c, 1));
                String str = cVar.f1385s;
                C1781b c1781b = cVar.f1380n;
                if (str != null) {
                    c1781b.k(str);
                }
                String str2 = cVar.f1386t;
                if (str2 != null) {
                    c1781b.k(str2);
                }
                Ri.a.d("Successful shutdown of lifecycle manager");
                this.f6621k.d();
                Ri.a.d("Successful shutdown of segment fetchers");
                this.f6622l.b();
                Ri.a.d("Successful shutdown of ImpressionListener");
                Ri.a.d("Successful shutdown of httpclient");
                this.m.f1033b = true;
                Ri.a.d("Successful shutdown of manager");
                this.f6623n.j();
                this.f6624o.j();
                Ri.a.d("Successful shutdown of task executor");
                ((io.split.android.client.storage.attributes.b) ((io.split.android.client.storage.attributes.a) c0176i.j)).f17615a.clear();
                this.f6625p.shutdown();
                Ri.a.d("Successful shutdown of attributes storage");
                this.f6626q.set(true);
                Ri.a.d("SplitFactory has been destroyed");
            } else {
                Ri.a.d("Avoiding shutdown due to active clients");
            }
        } catch (Exception e) {
            Ri.a.i(e, "We could not shutdown split", new Object[0]);
        } finally {
            atomicBoolean.set(false);
            reentrantLock.unlock();
        }
    }
}
