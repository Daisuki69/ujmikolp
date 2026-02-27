package zi;

import D.C0176i;
import Xh.g;
import gi.InterfaceC1523a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import ji.C1684a;
import ki.C1781b;
import ki.C1783d;
import ki.InterfaceC1782c;
import ki.h;
import ki.i;
import o6.C1967a;
import pg.C2038a;
import xi.C2482a;
import xi.C2483b;
import xi.C2484c;
import yi.C2533a;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements InterfaceC1523a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xh.d f21451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f21452b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ni.a f21453d;
    public final C1967a f;
    public final yi.e h;
    public final C2484c i;
    public final C2533a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final wg.d f21455k;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2038a f21454g = new C2038a(27);

    public c(Xh.d dVar, d dVar2, yi.e eVar, C2484c c2484c, C1967a c1967a, C2533a c2533a, wg.d dVar3, Ni.a aVar) {
        this.f21452b = dVar2;
        this.f21451a = dVar;
        this.f21453d = aVar;
        this.h = eVar;
        this.i = c2484c;
        this.f = c1967a;
        this.j = c2533a;
        this.f21455k = dVar3;
    }

    public final void a() {
        this.f21451a.getClass();
        AtomicBoolean atomicBoolean = this.e;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f21452b.e();
        Ri.a.k("Polling enabled.");
    }

    public final void b() {
        d dVar = this.f21452b;
        final g gVar = dVar.f;
        gVar.getClass();
        ArrayList arrayList = new ArrayList();
        h hVar = (h) gVar.f6642d;
        io.split.android.client.storage.splits.a aVar = (io.split.android.client.storage.splits.a) hVar.f18141b.f916d;
        ArrayList arrayList2 = hVar.f18145l;
        String str = hVar.e;
        arrayList.add(new C1783d(new Ci.a(aVar, arrayList2, str), null));
        C0176i c0176i = hVar.f18141b;
        arrayList.add(new C1783d(new i((Mi.c) c0176i.f923q), null));
        arrayList.add(new C1783d(new Ci.a((io.split.android.client.storage.splits.c) c0176i.f914a, str, hVar.f), (C2483b) gVar.e));
        arrayList.add(new C1783d(new InterfaceC1782c() { // from class: zi.a
            @Override // ki.InterfaceC1782c
            public final Ff.f execute() {
                g gVar2 = gVar;
                if (((AtomicBoolean) gVar2.j).get()) {
                    ((yi.f) gVar2.f6643g).e();
                }
                return Ff.f.k(10);
            }
        }, null));
        Yi.a aVar2 = (Yi.a) ((C1781b) gVar.f6640a).f18135a;
        if (!aVar2.isShutdown()) {
            aVar2.submit(new C.h(arrayList));
        }
        dVar.f21461l.c();
        dVar.f21460k.a();
        dVar.j();
        this.f21451a.getClass();
        Ri.a.p("User consent granted. Recording started");
        dVar.g();
        this.f21453d.b();
        this.e.set(false);
        ((CopyOnWriteArrayList) this.f.f18783b).add(new WeakReference(this));
        this.i.r();
        C2038a c2038a = this.f21454g;
        if (!((AtomicBoolean) c2038a.f19100b).getAndSet(true)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c2038a.c;
            if (concurrentHashMap.isEmpty()) {
                Ri.a.d("No MySegmentsUpdateWorkers have been registered");
            }
            Iterator it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                ((C2482a) it.next()).r();
            }
        }
        i iVar = new i(this, 5);
        C2533a c2533a = this.j;
        c2533a.getClass();
        c2533a.c = iVar;
    }

    public final void c() {
        this.f21451a.getClass();
        d dVar = this.f21452b;
        dVar.i();
        g gVar = dVar.f;
        ((yi.f) gVar.f6643g).f();
        ((yi.f) gVar.h).f();
        dVar.f21461l.destroy();
        dVar.c.getClass();
        C1684a c1684aA = dVar.f21458d.a();
        yi.f fVar = dVar.i;
        synchronized (fVar) {
            fVar.d(c1684aA, null);
        }
        fVar.e();
        dVar.e.flush();
        this.f21453d.destroy();
        this.h.c();
        this.i.s();
        C2038a c2038a = this.f21454g;
        if (((AtomicBoolean) c2038a.f19100b).getAndSet(false)) {
            Iterator it = ((ConcurrentHashMap) c2038a.c).values().iterator();
            while (it.hasNext()) {
                ((C2482a) it.next()).s();
            }
        }
        dVar.h();
    }

    @Override // gi.InterfaceC1523a
    public final void pause() {
        this.c.set(true);
        d dVar = this.f21452b;
        dVar.pause();
        this.f21453d.flush();
        this.f21451a.getClass();
        yi.e eVar = this.h;
        eVar.h.set(true);
        StringBuilder sb2 = new StringBuilder("Scheduling disconnection in ");
        yi.h hVar = eVar.f21294g;
        int i = hVar.f21305b;
        sb2.append(i);
        sb2.append(" seconds");
        Ri.a.p(sb2.toString());
        String str = hVar.c;
        C1781b c1781b = hVar.f21304a;
        if (str != null) {
            c1781b.k(str);
        }
        hVar.c = c1781b.i(eVar.f21295k, i, hVar);
        Ri.a.d("Push notification manager paused");
        wg.d dVar2 = this.f21455k;
        if (dVar2 != null && !dVar2.c) {
            dVar2.c = true;
        }
        if (this.e.get()) {
            dVar.h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    @Override // gi.InterfaceC1523a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resume() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.c
            r1 = 0
            r0.set(r1)
            zi.d r0 = r6.f21452b
            r0.resume()
            Xh.d r2 = r6.f21451a
            r2.getClass()
            yi.e r2 = r6.h
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.h
            r4 = 1
            boolean r1 = r3.compareAndSet(r4, r1)
            r3 = 2
            b1.t r4 = r2.f21293d
            if (r1 != 0) goto L1f
            goto L44
        L1f:
            yi.h r1 = r2.f21294g
            java.lang.String r5 = r1.c
            if (r5 == 0) goto L2a
            ki.b r1 = r1.f21304a
            r1.k(r5)
        L2a:
            java.lang.Object r1 = r4.f8334b
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.get()
            if (r1 != r3) goto L3f
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.i
            boolean r1 = r1.get()
            if (r1 != 0) goto L3f
            r2.a()
        L3f:
            java.lang.String r1 = "Push notification manager resumed"
            Ri.a.d(r1)
        L44:
            java.lang.Object r1 = r4.f8334b
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.get()
            if (r1 != r3) goto L91
            wg.d r1 = r6.f21455k
            boolean r2 = r1.c
            if (r2 == 0) goto L8b
            boolean r2 = r1.f20792a
            if (r2 == 0) goto L8b
            boolean r2 = r1.f20793b
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.f20795g
            v0.a r2 = (v0.C2333a) r2
            r2.getClass()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r3 = java.lang.System.currentTimeMillis()
            long r2 = r2.toSeconds(r3)
            java.io.Serializable r4 = r1.f
            java.util.concurrent.atomic.AtomicLong r4 = (java.util.concurrent.atomic.AtomicLong) r4
            long r4 = r4.get()
            long r2 = r2 - r4
            java.io.Serializable r1 = r1.e
            java.util.concurrent.atomic.AtomicLong r1 = (java.util.concurrent.atomic.AtomicLong) r1
            long r4 = r1.get()
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 < 0) goto L8b
            java.lang.String r1 = "Must sync, synchronizing splits"
            Ri.a.p(r1)
            r0.k()
            goto L96
        L8b:
            java.lang.String r1 = "No need to sync"
            Ri.a.p(r1)
            goto L96
        L91:
            java.lang.String r1 = "SSE client is connected, no need to trigger sync"
            Ri.a.p(r1)
        L96:
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.e
            boolean r1 = r1.get()
            if (r1 == 0) goto La1
            r0.e()
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zi.c.resume():void");
    }
}
