package ph;

import fh.C1487c;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class P2 extends AtomicReference implements ch.r, InterfaceC1486b, R2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19305b;
    public final TimeUnit c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ch.u f19306d;
    public final C1487c e = new C1487c();
    public final AtomicLong f = new AtomicLong();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f19307g = new AtomicReference();
    public ch.p h;

    public P2(ch.r rVar, long j, TimeUnit timeUnit, ch.u uVar, ch.p pVar) {
        this.f19304a = rVar;
        this.f19305b = j;
        this.c = timeUnit;
        this.f19306d = uVar;
        this.h = pVar;
    }

    @Override // ph.R2
    public final void b(long j) {
        if (this.f.compareAndSet(j, Long.MAX_VALUE)) {
            EnumC1604b.a(this.f19307g);
            ch.p pVar = this.h;
            this.h = null;
            pVar.subscribe(new D1(this.f19304a, this, 1));
            this.f19306d.dispose();
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this.f19307g);
        EnumC1604b.a(this);
        this.f19306d.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            C1487c c1487c = this.e;
            c1487c.getClass();
            EnumC1604b.a(c1487c);
            this.f19304a.onComplete();
            this.f19306d.dispose();
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.f.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            S1.s.r(th2);
            return;
        }
        C1487c c1487c = this.e;
        c1487c.getClass();
        EnumC1604b.a(c1487c);
        this.f19304a.onError(th2);
        this.f19306d.dispose();
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        AtomicLong atomicLong = this.f;
        long j = atomicLong.get();
        if (j != Long.MAX_VALUE) {
            long j6 = 1 + j;
            if (atomicLong.compareAndSet(j, j6)) {
                C1487c c1487c = this.e;
                ((InterfaceC1486b) c1487c.get()).dispose();
                this.f19304a.onNext(obj);
                InterfaceC1486b interfaceC1486bB = this.f19306d.b(new Kh.P(1, j6, this), this.f19305b, this.c);
                c1487c.getClass();
                EnumC1604b.c(c1487c, interfaceC1486bB);
            }
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this.f19307g, interfaceC1486b);
    }
}
