package ph;

import fh.C1485a;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import pg.C2038a;
import xh.C2479c;

/* JADX INFO: loaded from: classes4.dex */
public final class e3 extends lh.l implements InterfaceC1486b {
    public final ch.p i;
    public final hh.n j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f19451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1485a f19452l;
    public InterfaceC1486b m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicReference f19453n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f19454o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicLong f19455p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f19456q;

    public e3(C2479c c2479c, ch.p pVar, hh.n nVar, int i) {
        super(c2479c, new C2038a(9));
        this.f19453n = new AtomicReference();
        AtomicLong atomicLong = new AtomicLong();
        this.f19455p = atomicLong;
        this.f19456q = new AtomicBoolean();
        this.i = pVar;
        this.j = nVar;
        this.f19451k = i;
        this.f19452l = new C1485a(0);
        this.f19454o = new ArrayList();
        atomicLong.lazySet(1L);
    }

    @Override // lh.l
    public final void A(C2479c c2479c, Object obj) {
    }

    public final void F() {
        C2038a c2038a = this.e;
        C2479c c2479c = this.f18320d;
        ArrayList arrayList = this.f19454o;
        int iAddAndGet = 1;
        while (true) {
            boolean z4 = this.f18321g;
            Object objPoll = c2038a.poll();
            boolean z5 = objPoll == null;
            if (z4 && z5) {
                this.f19452l.dispose();
                EnumC1604b.a(this.f19453n);
                Throwable th2 = this.h;
                if (th2 != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Wh.f) it.next()).onError(th2);
                    }
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((Wh.f) it2.next()).onComplete();
                    }
                }
                arrayList.clear();
                return;
            }
            if (z5) {
                iAddAndGet = this.c.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (objPoll instanceof f3) {
                f3 f3Var = (f3) objPoll;
                Wh.f fVar = f3Var.f19467a;
                if (fVar != null) {
                    if (arrayList.remove(fVar)) {
                        f3Var.f19467a.onComplete();
                        if (this.f19455p.decrementAndGet() == 0) {
                            this.f19452l.dispose();
                            EnumC1604b.a(this.f19453n);
                            return;
                        }
                    } else {
                        continue;
                    }
                } else if (!this.f19456q.get()) {
                    Wh.f fVar2 = new Wh.f(this.f19451k);
                    arrayList.add(fVar2);
                    c2479c.onNext(fVar2);
                    try {
                        Object objApply = this.j.apply(f3Var.f19468b);
                        jh.e.b(objApply, "The ObservableSource supplied is null");
                        ch.p pVar = (ch.p) objApply;
                        d3 d3Var = new d3(this, fVar2);
                        if (this.f19452l.a(d3Var)) {
                            this.f19455p.getAndIncrement();
                            pVar.subscribe(d3Var);
                        }
                    } catch (Throwable th3) {
                        of.p.F(th3);
                        this.f19456q.set(true);
                        c2479c.onError(th3);
                    }
                }
            } else {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((Wh.f) it3.next()).onNext(objPoll);
                }
            }
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.f19456q.compareAndSet(false, true)) {
            EnumC1604b.a(this.f19453n);
            if (this.f19455p.decrementAndGet() == 0) {
                this.m.dispose();
            }
        }
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f18321g) {
            return;
        }
        this.f18321g = true;
        if (B()) {
            F();
        }
        if (this.f19455p.decrementAndGet() == 0) {
            this.f19452l.dispose();
        }
        this.f18320d.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.f18321g) {
            S1.s.r(th2);
            return;
        }
        this.h = th2;
        this.f18321g = true;
        if (B()) {
            F();
        }
        if (this.f19455p.decrementAndGet() == 0) {
            this.f19452l.dispose();
        }
        this.f18320d.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (C()) {
            Iterator it = this.f19454o.iterator();
            while (it.hasNext()) {
                ((Wh.f) it.next()).onNext(obj);
            }
            if (this.c.addAndGet(-1) == 0) {
                return;
            }
        } else {
            this.e.offer(obj);
            if (!B()) {
                return;
            }
        }
        F();
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.m, interfaceC1486b)) {
            this.m = interfaceC1486b;
            this.f18320d.onSubscribe(this);
            if (this.f19456q.get()) {
                return;
            }
            C2045B c2045b = new C2045B(this, 1);
            AtomicReference atomicReference = this.f19453n;
            while (!atomicReference.compareAndSet(null, c2045b)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            this.i.subscribe(c2045b);
        }
    }
}
