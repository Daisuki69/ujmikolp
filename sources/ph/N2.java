package ph;

import fh.C1487c;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class N2 extends AtomicLong implements ch.r, InterfaceC1486b, O2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19284b;
    public final C1487c c = new C1487c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f19285d = new AtomicReference();

    public N2(ch.r rVar, hh.n nVar) {
        this.f19283a = rVar;
        this.f19284b = nVar;
    }

    @Override // ph.O2
    public final void a(long j, Throwable th2) {
        if (!compareAndSet(j, Long.MAX_VALUE)) {
            S1.s.r(th2);
        } else {
            EnumC1604b.a(this.f19285d);
            this.f19283a.onError(th2);
        }
    }

    @Override // ph.R2
    public final void b(long j) {
        if (compareAndSet(j, Long.MAX_VALUE)) {
            EnumC1604b.a(this.f19285d);
            this.f19283a.onError(new TimeoutException());
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this.f19285d);
        C1487c c1487c = this.c;
        c1487c.getClass();
        EnumC1604b.a(c1487c);
    }

    @Override // ch.r
    public final void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            C1487c c1487c = this.c;
            c1487c.getClass();
            EnumC1604b.a(c1487c);
            this.f19283a.onComplete();
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            S1.s.r(th2);
            return;
        }
        C1487c c1487c = this.c;
        c1487c.getClass();
        EnumC1604b.a(c1487c);
        this.f19283a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j6 = 1 + j;
            if (compareAndSet(j, j6)) {
                C1487c c1487c = this.c;
                InterfaceC1486b interfaceC1486b = (InterfaceC1486b) c1487c.get();
                if (interfaceC1486b != null) {
                    interfaceC1486b.dispose();
                }
                ch.r rVar = this.f19283a;
                rVar.onNext(obj);
                try {
                    Object objApply = this.f19284b.apply(obj);
                    jh.e.b(objApply, "The itemTimeoutIndicator returned a null ObservableSource.");
                    ch.p pVar = (ch.p) objApply;
                    C2135w c2135w = new C2135w(j6, this);
                    if (EnumC1604b.c(c1487c, c2135w)) {
                        pVar.subscribe(c2135w);
                    }
                } catch (Throwable th2) {
                    of.p.F(th2);
                    ((InterfaceC1486b) this.f19285d.get()).dispose();
                    getAndSet(Long.MAX_VALUE);
                    rVar.onError(th2);
                }
            }
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this.f19285d, interfaceC1486b);
    }
}
