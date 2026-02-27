package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import kh.InterfaceC1775b;
import kh.InterfaceC1779f;
import lh.C1839j;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class S extends AtomicInteger implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19327b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19328d;
    public final int e;
    public final Qh.c f = new Qh.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f19329g = new ArrayDeque();
    public InterfaceC1779f h;
    public InterfaceC1486b i;
    public volatile boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f19331l;
    public C1839j m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f19332n;

    public S(ch.r rVar, hh.n nVar, int i, int i4, int i6) {
        this.f19326a = rVar;
        this.f19327b = nVar;
        this.c = i;
        this.f19328d = i4;
        this.e = i6;
    }

    public final void a() {
        C1839j c1839j = this.m;
        if (c1839j != null) {
            EnumC1604b.a(c1839j);
        }
        while (true) {
            C1839j c1839j2 = (C1839j) this.f19329g.poll();
            if (c1839j2 == null) {
                return;
            } else {
                EnumC1604b.a(c1839j2);
            }
        }
    }

    public final void b() {
        Object objPoll;
        boolean z4;
        if (getAndIncrement() != 0) {
            return;
        }
        InterfaceC1779f interfaceC1779f = this.h;
        ArrayDeque arrayDeque = this.f19329g;
        ch.r rVar = this.f19326a;
        int i = this.e;
        int iAddAndGet = 1;
        while (true) {
            int i4 = this.f19332n;
            while (i4 != this.c) {
                if (this.f19331l) {
                    interfaceC1779f.clear();
                    a();
                    return;
                }
                if (i == 1 && ((Throwable) this.f.get()) != null) {
                    interfaceC1779f.clear();
                    a();
                    Qh.c cVar = this.f;
                    cVar.getClass();
                    rVar.onError(AbstractC2353d.b(cVar));
                    return;
                }
                try {
                    Object objPoll2 = interfaceC1779f.poll();
                    if (objPoll2 == null) {
                        break;
                    }
                    Object objApply = this.f19327b.apply(objPoll2);
                    jh.e.b(objApply, "The mapper returned a null ObservableSource");
                    ch.p pVar = (ch.p) objApply;
                    C1839j c1839j = new C1839j(this, this.f19328d);
                    arrayDeque.offer(c1839j);
                    pVar.subscribe(c1839j);
                    i4++;
                } catch (Throwable th2) {
                    of.p.F(th2);
                    this.i.dispose();
                    interfaceC1779f.clear();
                    a();
                    Qh.c cVar2 = this.f;
                    cVar2.getClass();
                    AbstractC2353d.a(cVar2, th2);
                    Qh.c cVar3 = this.f;
                    cVar3.getClass();
                    rVar.onError(AbstractC2353d.b(cVar3));
                    return;
                }
            }
            this.f19332n = i4;
            if (this.f19331l) {
                interfaceC1779f.clear();
                a();
                return;
            }
            if (i == 1 && ((Throwable) this.f.get()) != null) {
                interfaceC1779f.clear();
                a();
                Qh.c cVar4 = this.f;
                cVar4.getClass();
                rVar.onError(AbstractC2353d.b(cVar4));
                return;
            }
            C1839j c1839j2 = this.m;
            if (c1839j2 == null) {
                if (i == 2 && ((Throwable) this.f.get()) != null) {
                    interfaceC1779f.clear();
                    a();
                    Qh.c cVar5 = this.f;
                    cVar5.getClass();
                    rVar.onError(AbstractC2353d.b(cVar5));
                    return;
                }
                boolean z5 = this.j;
                C1839j c1839j3 = (C1839j) arrayDeque.poll();
                boolean z8 = c1839j3 == null;
                if (z5 && z8) {
                    if (((Throwable) this.f.get()) == null) {
                        rVar.onComplete();
                        return;
                    }
                    interfaceC1779f.clear();
                    a();
                    Qh.c cVar6 = this.f;
                    cVar6.getClass();
                    rVar.onError(AbstractC2353d.b(cVar6));
                    return;
                }
                if (!z8) {
                    this.m = c1839j3;
                }
                c1839j2 = c1839j3;
            }
            if (c1839j2 != null) {
                InterfaceC1779f interfaceC1779f2 = c1839j2.c;
                while (!this.f19331l) {
                    boolean z9 = c1839j2.f18316d;
                    if (i == 1 && ((Throwable) this.f.get()) != null) {
                        interfaceC1779f.clear();
                        a();
                        Qh.c cVar7 = this.f;
                        cVar7.getClass();
                        rVar.onError(AbstractC2353d.b(cVar7));
                        return;
                    }
                    try {
                        objPoll = interfaceC1779f2.poll();
                        z4 = objPoll == null;
                    } catch (Throwable th3) {
                        of.p.F(th3);
                        Qh.c cVar8 = this.f;
                        cVar8.getClass();
                        AbstractC2353d.a(cVar8, th3);
                        this.m = null;
                        this.f19332n--;
                    }
                    if (z9 && z4) {
                        this.m = null;
                        this.f19332n--;
                    } else if (!z4) {
                        rVar.onNext(objPoll);
                    }
                }
                interfaceC1779f.clear();
                a();
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.f19331l) {
            return;
        }
        this.f19331l = true;
        this.i.dispose();
        if (getAndIncrement() == 0) {
            do {
                this.h.clear();
                a();
            } while (decrementAndGet() != 0);
        }
    }

    @Override // ch.r
    public final void onComplete() {
        this.j = true;
        b();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        Qh.c cVar = this.f;
        cVar.getClass();
        if (!AbstractC2353d.a(cVar, th2)) {
            S1.s.r(th2);
        } else {
            this.j = true;
            b();
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f19330k == 0) {
            this.h.offer(obj);
        }
        b();
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.i, interfaceC1486b)) {
            this.i = interfaceC1486b;
            if (interfaceC1486b instanceof InterfaceC1775b) {
                InterfaceC1775b interfaceC1775b = (InterfaceC1775b) interfaceC1486b;
                int iB = interfaceC1775b.b(3);
                if (iB == 1) {
                    this.f19330k = iB;
                    this.h = interfaceC1775b;
                    this.j = true;
                    this.f19326a.onSubscribe(this);
                    b();
                    return;
                }
                if (iB == 2) {
                    this.f19330k = iB;
                    this.h = interfaceC1775b;
                    this.f19326a.onSubscribe(this);
                    return;
                }
            }
            this.h = new rh.c(this.f19328d);
            this.f19326a.onSubscribe(this);
        }
    }
}
