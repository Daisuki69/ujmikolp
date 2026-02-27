package ph;

import fh.C1487c;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class M2 extends AtomicReference implements ch.r, InterfaceC1486b, O2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19276b;
    public final C1487c c = new C1487c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f19277d = new AtomicLong();
    public final AtomicReference e = new AtomicReference();
    public ch.p f;

    public M2(ch.p pVar, ch.r rVar, hh.n nVar) {
        this.f19275a = rVar;
        this.f19276b = nVar;
        this.f = pVar;
    }

    @Override // ph.O2
    public final void a(long j, Throwable th2) {
        if (!this.f19277d.compareAndSet(j, Long.MAX_VALUE)) {
            S1.s.r(th2);
        } else {
            EnumC1604b.a(this);
            this.f19275a.onError(th2);
        }
    }

    @Override // ph.R2
    public final void b(long j) {
        if (this.f19277d.compareAndSet(j, Long.MAX_VALUE)) {
            EnumC1604b.a(this.e);
            ch.p pVar = this.f;
            this.f = null;
            pVar.subscribe(new D1(this.f19275a, this, 1));
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this.e);
        EnumC1604b.a(this);
        C1487c c1487c = this.c;
        c1487c.getClass();
        EnumC1604b.a(c1487c);
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f19277d.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            C1487c c1487c = this.c;
            c1487c.getClass();
            EnumC1604b.a(c1487c);
            this.f19275a.onComplete();
            c1487c.getClass();
            EnumC1604b.a(c1487c);
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.f19277d.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            S1.s.r(th2);
            return;
        }
        C1487c c1487c = this.c;
        c1487c.getClass();
        EnumC1604b.a(c1487c);
        this.f19275a.onError(th2);
        c1487c.getClass();
        EnumC1604b.a(c1487c);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        AtomicLong atomicLong = this.f19277d;
        long j = atomicLong.get();
        if (j != Long.MAX_VALUE) {
            long j6 = 1 + j;
            if (atomicLong.compareAndSet(j, j6)) {
                C1487c c1487c = this.c;
                InterfaceC1486b interfaceC1486b = (InterfaceC1486b) c1487c.get();
                if (interfaceC1486b != null) {
                    interfaceC1486b.dispose();
                }
                ch.r rVar = this.f19275a;
                rVar.onNext(obj);
                try {
                    Object objApply = this.f19276b.apply(obj);
                    jh.e.b(objApply, "The itemTimeoutIndicator returned a null ObservableSource.");
                    ch.p pVar = (ch.p) objApply;
                    C2135w c2135w = new C2135w(j6, this);
                    if (EnumC1604b.c(c1487c, c2135w)) {
                        pVar.subscribe(c2135w);
                    }
                } catch (Throwable th2) {
                    of.p.F(th2);
                    ((InterfaceC1486b) this.e.get()).dispose();
                    atomicLong.getAndSet(Long.MAX_VALUE);
                    rVar.onError(th2);
                }
            }
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this.e, interfaceC1486b);
    }
}
