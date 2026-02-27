package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class T0 extends AtomicInteger implements ch.r, InterfaceC1486b {
    public static final Object i = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19341b;
    public final hh.n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19342d;
    public final boolean e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1486b f19343g;
    public final AtomicBoolean h = new AtomicBoolean();
    public final ConcurrentHashMap f = new ConcurrentHashMap();

    public T0(ch.r rVar, hh.n nVar, hh.n nVar2, int i4, boolean z4) {
        this.f19340a = rVar;
        this.f19341b = nVar;
        this.c = nVar2;
        this.f19342d = i4;
        this.e = z4;
        lazySet(1);
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.h.compareAndSet(false, true) && decrementAndGet() == 0) {
            this.f19343g.dispose();
        }
    }

    @Override // ch.r
    public final void onComplete() {
        ArrayList arrayList = new ArrayList(this.f.values());
        this.f.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            V0 v02 = ((U0) it.next()).f19352b;
            v02.e = true;
            v02.a();
        }
        this.f19340a.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f.values());
        this.f.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            V0 v02 = ((U0) it.next()).f19352b;
            v02.f = th2;
            v02.e = true;
            v02.a();
        }
        this.f19340a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        try {
            Object objApply = this.f19341b.apply(obj);
            Object obj2 = objApply != null ? objApply : i;
            ConcurrentHashMap concurrentHashMap = this.f;
            U0 u0 = (U0) concurrentHashMap.get(obj2);
            if (u0 == null) {
                if (this.h.get()) {
                    return;
                }
                U0 u02 = new U0(objApply, new V0(this.f19342d, this, objApply, this.e));
                concurrentHashMap.put(obj2, u02);
                getAndIncrement();
                this.f19340a.onNext(u02);
                u0 = u02;
            }
            try {
                Object objApply2 = this.c.apply(obj);
                jh.e.b(objApply2, "The value supplied is null");
                V0 v02 = u0.f19352b;
                v02.f19358b.offer(objApply2);
                v02.a();
            } catch (Throwable th2) {
                of.p.F(th2);
                this.f19343g.dispose();
                onError(th2);
            }
        } catch (Throwable th3) {
            of.p.F(th3);
            this.f19343g.dispose();
            onError(th3);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f19343g, interfaceC1486b)) {
            this.f19343g = interfaceC1486b;
            this.f19340a.onSubscribe(this);
        }
    }
}
