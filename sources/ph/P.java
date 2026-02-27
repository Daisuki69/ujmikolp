package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import kh.InterfaceC1775b;
import kh.InterfaceC1779f;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class P extends AtomicInteger implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19294b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qh.c f19295d = new Qh.c();
    public final O e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1779f f19296g;
    public InterfaceC1486b h;
    public volatile boolean i;
    public volatile boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f19297k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19298l;

    public P(int i, ch.r rVar, hh.n nVar, boolean z4) {
        this.f19293a = rVar;
        this.f19294b = nVar;
        this.c = i;
        this.f = z4;
        this.e = new O(rVar, this, 0);
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        ch.r rVar = this.f19293a;
        InterfaceC1779f interfaceC1779f = this.f19296g;
        Qh.c cVar = this.f19295d;
        while (true) {
            if (!this.i) {
                if (this.f19297k) {
                    interfaceC1779f.clear();
                    return;
                }
                if (!this.f && ((Throwable) cVar.get()) != null) {
                    interfaceC1779f.clear();
                    this.f19297k = true;
                    rVar.onError(AbstractC2353d.b(cVar));
                    return;
                }
                boolean z4 = this.j;
                try {
                    Object objPoll = interfaceC1779f.poll();
                    boolean z5 = objPoll == null;
                    if (z4 && z5) {
                        this.f19297k = true;
                        cVar.getClass();
                        Throwable thB = AbstractC2353d.b(cVar);
                        if (thB != null) {
                            rVar.onError(thB);
                            return;
                        } else {
                            rVar.onComplete();
                            return;
                        }
                    }
                    if (!z5) {
                        try {
                            Object objApply = this.f19294b.apply(objPoll);
                            jh.e.b(objApply, "The mapper returned a null ObservableSource");
                            ch.p pVar = (ch.p) objApply;
                            if (pVar instanceof Callable) {
                                try {
                                    Object objCall = ((Callable) pVar).call();
                                    if (objCall != null && !this.f19297k) {
                                        rVar.onNext(objCall);
                                    }
                                } catch (Throwable th2) {
                                    of.p.F(th2);
                                    cVar.getClass();
                                    AbstractC2353d.a(cVar, th2);
                                }
                            } else {
                                this.i = true;
                                pVar.subscribe(this.e);
                            }
                        } catch (Throwable th3) {
                            of.p.F(th3);
                            this.f19297k = true;
                            this.h.dispose();
                            interfaceC1779f.clear();
                            cVar.getClass();
                            AbstractC2353d.a(cVar, th3);
                            rVar.onError(AbstractC2353d.b(cVar));
                            return;
                        }
                    }
                } catch (Throwable th4) {
                    of.p.F(th4);
                    this.f19297k = true;
                    this.h.dispose();
                    cVar.getClass();
                    AbstractC2353d.a(cVar, th4);
                    rVar.onError(AbstractC2353d.b(cVar));
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f19297k = true;
        this.h.dispose();
        O o8 = this.e;
        o8.getClass();
        EnumC1604b.a(o8);
    }

    @Override // ch.r
    public final void onComplete() {
        this.j = true;
        a();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        Qh.c cVar = this.f19295d;
        cVar.getClass();
        if (!AbstractC2353d.a(cVar, th2)) {
            S1.s.r(th2);
        } else {
            this.j = true;
            a();
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f19298l == 0) {
            this.f19296g.offer(obj);
        }
        a();
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.h, interfaceC1486b)) {
            this.h = interfaceC1486b;
            if (interfaceC1486b instanceof InterfaceC1775b) {
                InterfaceC1775b interfaceC1775b = (InterfaceC1775b) interfaceC1486b;
                int iB = interfaceC1775b.b(3);
                if (iB == 1) {
                    this.f19298l = iB;
                    this.f19296g = interfaceC1775b;
                    this.j = true;
                    this.f19293a.onSubscribe(this);
                    a();
                    return;
                }
                if (iB == 2) {
                    this.f19298l = iB;
                    this.f19296g = interfaceC1775b;
                    this.f19293a.onSubscribe(this);
                    return;
                }
            }
            this.f19296g = new rh.c(this.c);
            this.f19293a.onSubscribe(this);
        }
    }
}
