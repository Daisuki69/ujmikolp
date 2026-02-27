package ph;

import fh.C1485a;
import fh.InterfaceC1486b;
import hh.InterfaceC1570c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class X0 extends AtomicInteger implements InterfaceC1486b, Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.r f19373b;
    public final rh.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1485a f19374d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f19375g;
    public final hh.n h;
    public final hh.n i;
    public final InterfaceC1570c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f19376k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19377l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f19378n;

    public X0(ch.r rVar, hh.n nVar, hh.n nVar2, InterfaceC1570c interfaceC1570c, int i) {
        this.f19372a = i;
        switch (i) {
            case 1:
                this.f19373b = rVar;
                this.f19374d = new C1485a(0);
                this.c = new rh.c(ch.l.bufferSize());
                this.e = new LinkedHashMap();
                this.f = new LinkedHashMap();
                this.f19375g = new AtomicReference();
                this.h = nVar;
                this.i = nVar2;
                this.j = interfaceC1570c;
                this.f19376k = new AtomicInteger(2);
                break;
            default:
                this.f19373b = rVar;
                this.f19374d = new C1485a(0);
                this.c = new rh.c(ch.l.bufferSize());
                this.e = new LinkedHashMap();
                this.f = new LinkedHashMap();
                this.f19375g = new AtomicReference();
                this.h = nVar;
                this.i = nVar2;
                this.j = interfaceC1570c;
                this.f19376k = new AtomicInteger(2);
                break;
        }
    }

    private final void i(boolean z4, Z0 z02) {
        synchronized (this) {
            this.c.a(z4 ? 3 : 4, z02);
        }
        f();
    }

    private final void j(Object obj, boolean z4) {
        synchronized (this) {
            this.c.a(z4 ? 1 : 2, obj);
        }
        f();
    }

    @Override // ph.Y0
    public final void a(boolean z4, Z0 z02) {
        switch (this.f19372a) {
            case 0:
                i(z4, z02);
                return;
            default:
                synchronized (this) {
                    this.c.a(z4 ? 3 : 4, z02);
                    break;
                }
                f();
                return;
        }
    }

    @Override // ph.Y0
    public final void b(Throwable th2) {
        switch (this.f19372a) {
            case 0:
                if (!AbstractC2353d.a(this.f19375g, th2)) {
                    S1.s.r(th2);
                } else {
                    this.f19376k.decrementAndGet();
                    f();
                }
                break;
            default:
                if (!AbstractC2353d.a(this.f19375g, th2)) {
                    S1.s.r(th2);
                } else {
                    this.f19376k.decrementAndGet();
                    f();
                }
                break;
        }
    }

    @Override // ph.Y0
    public final void c(C2050a1 c2050a1) {
        switch (this.f19372a) {
            case 0:
                this.f19374d.c(c2050a1);
                this.f19376k.decrementAndGet();
                f();
                break;
            default:
                this.f19374d.c(c2050a1);
                this.f19376k.decrementAndGet();
                f();
                break;
        }
    }

    @Override // ph.Y0
    public final void d(Throwable th2) {
        switch (this.f19372a) {
            case 0:
                if (!AbstractC2353d.a(this.f19375g, th2)) {
                    S1.s.r(th2);
                } else {
                    f();
                }
                break;
            default:
                if (!AbstractC2353d.a(this.f19375g, th2)) {
                    S1.s.r(th2);
                } else {
                    f();
                }
                break;
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19372a) {
            case 0:
                if (!this.f19378n) {
                    this.f19378n = true;
                    this.f19374d.dispose();
                    if (getAndIncrement() == 0) {
                        this.c.clear();
                    }
                    break;
                }
                break;
            default:
                if (!this.f19378n) {
                    this.f19378n = true;
                    this.f19374d.dispose();
                    if (getAndIncrement() == 0) {
                        this.c.clear();
                    }
                }
                break;
        }
    }

    @Override // ph.Y0
    public final void e(Object obj, boolean z4) {
        switch (this.f19372a) {
            case 0:
                j(obj, z4);
                return;
            default:
                synchronized (this) {
                    this.c.a(z4 ? 1 : 2, obj);
                    break;
                }
                f();
                return;
        }
    }

    public final void f() {
        switch (this.f19372a) {
            case 0:
                if (getAndIncrement() == 0) {
                    rh.c cVar = this.c;
                    ch.r rVar = this.f19373b;
                    int iAddAndGet = 1;
                    while (!this.f19378n) {
                        if (((Throwable) this.f19375g.get()) != null) {
                            cVar.clear();
                            this.f19374d.dispose();
                            g(rVar);
                            break;
                        } else {
                            boolean z4 = this.f19376k.get() == 0;
                            Integer num = (Integer) cVar.poll();
                            boolean z5 = num == null;
                            if (z4 && z5) {
                                Iterator it = this.e.values().iterator();
                                while (it.hasNext()) {
                                    ((Wh.f) it.next()).onComplete();
                                }
                                this.e.clear();
                                this.f.clear();
                                this.f19374d.dispose();
                                rVar.onComplete();
                                break;
                            } else if (z5) {
                                iAddAndGet = addAndGet(-iAddAndGet);
                                if (iAddAndGet == 0) {
                                    break;
                                }
                            } else {
                                Object objPoll = cVar.poll();
                                if (num == 1) {
                                    Wh.f fVar = new Wh.f(ch.l.bufferSize());
                                    int i = this.f19377l;
                                    this.f19377l = i + 1;
                                    this.e.put(Integer.valueOf(i), fVar);
                                    try {
                                        Object objApply = this.h.apply(objPoll);
                                        jh.e.b(objApply, "The leftEnd returned a null ObservableSource");
                                        ch.p pVar = (ch.p) objApply;
                                        Z0 z02 = new Z0(this, true, i);
                                        this.f19374d.a(z02);
                                        pVar.subscribe(z02);
                                        if (((Throwable) this.f19375g.get()) != null) {
                                            cVar.clear();
                                            this.f19374d.dispose();
                                            g(rVar);
                                            break;
                                        } else {
                                            try {
                                                Object objA = this.j.a(objPoll, fVar);
                                                jh.e.b(objA, "The resultSelector returned a null value");
                                                rVar.onNext(objA);
                                                Iterator it2 = this.f.values().iterator();
                                                while (it2.hasNext()) {
                                                    fVar.onNext(it2.next());
                                                }
                                            } catch (Throwable th2) {
                                                h(th2, rVar, cVar);
                                                return;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        h(th3, rVar, cVar);
                                        return;
                                    }
                                } else if (num == 2) {
                                    int i4 = this.m;
                                    this.m = i4 + 1;
                                    this.f.put(Integer.valueOf(i4), objPoll);
                                    try {
                                        Object objApply2 = this.i.apply(objPoll);
                                        jh.e.b(objApply2, "The rightEnd returned a null ObservableSource");
                                        ch.p pVar2 = (ch.p) objApply2;
                                        Z0 z03 = new Z0(this, false, i4);
                                        this.f19374d.a(z03);
                                        pVar2.subscribe(z03);
                                        if (((Throwable) this.f19375g.get()) != null) {
                                            cVar.clear();
                                            this.f19374d.dispose();
                                            g(rVar);
                                        } else {
                                            Iterator it3 = this.e.values().iterator();
                                            while (it3.hasNext()) {
                                                ((Wh.f) it3.next()).onNext(objPoll);
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        h(th4, rVar, cVar);
                                        return;
                                    }
                                    break;
                                } else if (num == 3) {
                                    Z0 z04 = (Z0) objPoll;
                                    Wh.f fVar2 = (Wh.f) this.e.remove(Integer.valueOf(z04.c));
                                    this.f19374d.g(z04);
                                    if (fVar2 != null) {
                                        fVar2.onComplete();
                                    }
                                } else if (num == 4) {
                                    Z0 z05 = (Z0) objPoll;
                                    this.f.remove(Integer.valueOf(z05.c));
                                    this.f19374d.g(z05);
                                }
                            }
                        }
                    }
                    cVar.clear();
                    break;
                }
                break;
            default:
                if (getAndIncrement() == 0) {
                    rh.c cVar2 = this.c;
                    ch.r rVar2 = this.f19373b;
                    int iAddAndGet2 = 1;
                    while (!this.f19378n) {
                        if (((Throwable) this.f19375g.get()) != null) {
                            cVar2.clear();
                            this.f19374d.dispose();
                            g(rVar2);
                            break;
                        } else {
                            boolean z8 = this.f19376k.get() == 0;
                            Integer num2 = (Integer) cVar2.poll();
                            boolean z9 = num2 == null;
                            if (z8 && z9) {
                                this.e.clear();
                                this.f.clear();
                                this.f19374d.dispose();
                                rVar2.onComplete();
                                break;
                            } else if (z9) {
                                iAddAndGet2 = addAndGet(-iAddAndGet2);
                                if (iAddAndGet2 == 0) {
                                    break;
                                }
                            } else {
                                Object objPoll2 = cVar2.poll();
                                if (num2 == 1) {
                                    int i6 = this.f19377l;
                                    this.f19377l = i6 + 1;
                                    this.e.put(Integer.valueOf(i6), objPoll2);
                                    try {
                                        Object objApply3 = this.h.apply(objPoll2);
                                        jh.e.b(objApply3, "The leftEnd returned a null ObservableSource");
                                        ch.p pVar3 = (ch.p) objApply3;
                                        Z0 z06 = new Z0(this, true, i6);
                                        this.f19374d.a(z06);
                                        pVar3.subscribe(z06);
                                        if (((Throwable) this.f19375g.get()) != null) {
                                            cVar2.clear();
                                            this.f19374d.dispose();
                                            g(rVar2);
                                            break;
                                        } else {
                                            Iterator it4 = this.f.values().iterator();
                                            while (it4.hasNext()) {
                                                try {
                                                    Object objA2 = this.j.a(objPoll2, it4.next());
                                                    jh.e.b(objA2, "The resultSelector returned a null value");
                                                    rVar2.onNext(objA2);
                                                } catch (Throwable th5) {
                                                    h(th5, rVar2, cVar2);
                                                    return;
                                                }
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        h(th6, rVar2, cVar2);
                                        return;
                                    }
                                } else if (num2 == 2) {
                                    int i10 = this.m;
                                    this.m = i10 + 1;
                                    this.f.put(Integer.valueOf(i10), objPoll2);
                                    try {
                                        Object objApply4 = this.i.apply(objPoll2);
                                        jh.e.b(objApply4, "The rightEnd returned a null ObservableSource");
                                        ch.p pVar4 = (ch.p) objApply4;
                                        Z0 z07 = new Z0(this, false, i10);
                                        this.f19374d.a(z07);
                                        pVar4.subscribe(z07);
                                        if (((Throwable) this.f19375g.get()) != null) {
                                            cVar2.clear();
                                            this.f19374d.dispose();
                                            g(rVar2);
                                            break;
                                        } else {
                                            Iterator it5 = this.e.values().iterator();
                                            while (it5.hasNext()) {
                                                try {
                                                    Object objA3 = this.j.a(it5.next(), objPoll2);
                                                    jh.e.b(objA3, "The resultSelector returned a null value");
                                                    rVar2.onNext(objA3);
                                                } catch (Throwable th7) {
                                                    h(th7, rVar2, cVar2);
                                                    return;
                                                }
                                            }
                                        }
                                    } catch (Throwable th8) {
                                        h(th8, rVar2, cVar2);
                                    }
                                } else if (num2 == 3) {
                                    Z0 z08 = (Z0) objPoll2;
                                    this.e.remove(Integer.valueOf(z08.c));
                                    this.f19374d.g(z08);
                                } else {
                                    Z0 z09 = (Z0) objPoll2;
                                    this.f.remove(Integer.valueOf(z09.c));
                                    this.f19374d.g(z09);
                                }
                            }
                        }
                    }
                    cVar2.clear();
                    break;
                }
                break;
        }
    }

    public final void g(ch.r rVar) {
        switch (this.f19372a) {
            case 0:
                Throwable thB = AbstractC2353d.b(this.f19375g);
                LinkedHashMap linkedHashMap = this.e;
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((Wh.f) it.next()).onError(thB);
                }
                linkedHashMap.clear();
                this.f.clear();
                rVar.onError(thB);
                break;
            default:
                Throwable thB2 = AbstractC2353d.b(this.f19375g);
                this.e.clear();
                this.f.clear();
                rVar.onError(thB2);
                break;
        }
    }

    public final void h(Throwable th2, ch.r rVar, rh.c cVar) {
        switch (this.f19372a) {
            case 0:
                of.p.F(th2);
                AbstractC2353d.a(this.f19375g, th2);
                cVar.clear();
                this.f19374d.dispose();
                g(rVar);
                break;
            default:
                of.p.F(th2);
                AbstractC2353d.a(this.f19375g, th2);
                cVar.clear();
                this.f19374d.dispose();
                g(rVar);
                break;
        }
    }
}
