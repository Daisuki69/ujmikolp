package oh;

import S1.s;
import ch.AbstractC1103b;
import ch.InterfaceC1104c;
import ch.InterfaceC1105d;
import ch.r;
import fh.InterfaceC1486b;
import hh.n;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import kh.InterfaceC1775b;
import kh.InterfaceC1779f;
import of.p;
import vh.AbstractC2353d;

/* JADX INFO: renamed from: oh.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1980b extends AtomicInteger implements r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1104c f18852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f18853b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qh.c f18854d = new Qh.c();
    public final C1979a e = new C1979a(this, 0);
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1779f f18855g;
    public InterfaceC1486b h;
    public volatile boolean i;
    public volatile boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f18856k;

    public C1980b(InterfaceC1104c interfaceC1104c, n nVar, int i, int i4) {
        this.f18852a = interfaceC1104c;
        this.f18853b = nVar;
        this.c = i;
        this.f = i4;
    }

    public final void a() {
        InterfaceC1105d interfaceC1105d;
        boolean z4;
        if (getAndIncrement() != 0) {
            return;
        }
        Qh.c cVar = this.f18854d;
        int i = this.c;
        while (!this.f18856k) {
            if (!this.i) {
                if (i == 2 && cVar.get() != null) {
                    this.f18856k = true;
                    this.f18855g.clear();
                    this.f18852a.onError(AbstractC2353d.b(cVar));
                    return;
                }
                boolean z5 = this.j;
                try {
                    Object objPoll = this.f18855g.poll();
                    if (objPoll != null) {
                        Object objApply = this.f18853b.apply(objPoll);
                        jh.e.b(objApply, "The mapper returned a null CompletableSource");
                        interfaceC1105d = (InterfaceC1105d) objApply;
                        z4 = false;
                    } else {
                        interfaceC1105d = null;
                        z4 = true;
                    }
                    if (z5 && z4) {
                        this.f18856k = true;
                        cVar.getClass();
                        Throwable thB = AbstractC2353d.b(cVar);
                        if (thB != null) {
                            this.f18852a.onError(thB);
                            return;
                        } else {
                            this.f18852a.onComplete();
                            return;
                        }
                    }
                    if (!z4) {
                        this.i = true;
                        ((AbstractC1103b) interfaceC1105d).b(this.e);
                    }
                } catch (Throwable th2) {
                    p.F(th2);
                    this.f18856k = true;
                    this.f18855g.clear();
                    this.h.dispose();
                    cVar.getClass();
                    AbstractC2353d.a(cVar, th2);
                    this.f18852a.onError(AbstractC2353d.b(cVar));
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        this.f18855g.clear();
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f18856k = true;
        this.h.dispose();
        C1979a c1979a = this.e;
        c1979a.getClass();
        EnumC1604b.a(c1979a);
        if (getAndIncrement() == 0) {
            this.f18855g.clear();
        }
    }

    @Override // ch.r
    public final void onComplete() {
        this.j = true;
        a();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        Qh.c cVar = this.f18854d;
        cVar.getClass();
        if (!AbstractC2353d.a(cVar, th2)) {
            s.r(th2);
            return;
        }
        if (this.c != 1) {
            this.j = true;
            a();
            return;
        }
        this.f18856k = true;
        C1979a c1979a = this.e;
        c1979a.getClass();
        EnumC1604b.a(c1979a);
        Qh.c cVar2 = this.f18854d;
        cVar2.getClass();
        Throwable thB = AbstractC2353d.b(cVar2);
        if (thB != AbstractC2353d.f20501a) {
            this.f18852a.onError(thB);
        }
        if (getAndIncrement() == 0) {
            this.f18855g.clear();
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (obj != null) {
            this.f18855g.offer(obj);
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
                    this.f18855g = interfaceC1775b;
                    this.j = true;
                    this.f18852a.onSubscribe(this);
                    a();
                    return;
                }
                if (iB == 2) {
                    this.f18855g = interfaceC1775b;
                    this.f18852a.onSubscribe(this);
                    return;
                }
            }
            this.f18855g = new rh.c(this.f);
            this.f18852a.onSubscribe(this);
        }
    }
}
