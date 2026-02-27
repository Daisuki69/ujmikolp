package ph;

import fh.C1487c;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class Q2 extends AtomicLong implements ch.r, InterfaceC1486b, R2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19319b;
    public final TimeUnit c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ch.u f19320d;
    public final C1487c e = new C1487c();
    public final AtomicReference f = new AtomicReference();

    public Q2(ch.r rVar, long j, TimeUnit timeUnit, ch.u uVar) {
        this.f19318a = rVar;
        this.f19319b = j;
        this.c = timeUnit;
        this.f19320d = uVar;
    }

    @Override // ph.R2
    public final void b(long j) {
        if (compareAndSet(j, Long.MAX_VALUE)) {
            EnumC1604b.a(this.f);
            this.f19318a.onError(new TimeoutException(AbstractC2353d.c(this.f19319b, this.c)));
            this.f19320d.dispose();
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this.f);
        this.f19320d.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            C1487c c1487c = this.e;
            c1487c.getClass();
            EnumC1604b.a(c1487c);
            this.f19318a.onComplete();
            this.f19320d.dispose();
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            S1.s.r(th2);
            return;
        }
        C1487c c1487c = this.e;
        c1487c.getClass();
        EnumC1604b.a(c1487c);
        this.f19318a.onError(th2);
        this.f19320d.dispose();
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j6 = 1 + j;
            if (compareAndSet(j, j6)) {
                C1487c c1487c = this.e;
                ((InterfaceC1486b) c1487c.get()).dispose();
                this.f19318a.onNext(obj);
                InterfaceC1486b interfaceC1486bB = this.f19320d.b(new Kh.P(1, j6, this), this.f19319b, this.c);
                c1487c.getClass();
                EnumC1604b.c(c1487c, interfaceC1486bB);
            }
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this.f, interfaceC1486b);
    }
}
