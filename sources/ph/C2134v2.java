package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ph.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2134v2 extends AtomicInteger implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19669b;
    public final TimeUnit c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ch.v f19670d;
    public final rh.c e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1486b f19671g;
    public volatile boolean h;
    public volatile boolean i;
    public Throwable j;

    public C2134v2(ch.r rVar, long j, TimeUnit timeUnit, ch.v vVar, int i, boolean z4) {
        this.f19668a = rVar;
        this.f19669b = j;
        this.c = timeUnit;
        this.f19670d = vVar;
        this.e = new rh.c(i);
        this.f = z4;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        ch.r rVar = this.f19668a;
        rh.c cVar = this.e;
        boolean z4 = this.f;
        TimeUnit timeUnit = this.c;
        ch.v vVar = this.f19670d;
        long j = this.f19669b;
        int iAddAndGet = 1;
        while (!this.h) {
            boolean z5 = this.i;
            Long l6 = (Long) cVar.c();
            boolean z8 = l6 == null;
            long jC = vVar.c(timeUnit);
            if (!z8 && l6.longValue() > jC - j) {
                z8 = true;
            }
            if (z5) {
                if (!z4) {
                    Throwable th2 = this.j;
                    if (th2 != null) {
                        this.e.clear();
                        rVar.onError(th2);
                        return;
                    } else if (z8) {
                        rVar.onComplete();
                        return;
                    }
                } else if (z8) {
                    Throwable th3 = this.j;
                    if (th3 != null) {
                        rVar.onError(th3);
                        return;
                    } else {
                        rVar.onComplete();
                        return;
                    }
                }
            }
            if (z8) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                cVar.poll();
                rVar.onNext(cVar.poll());
            }
        }
        this.e.clear();
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f19671g.dispose();
        if (getAndIncrement() == 0) {
            this.e.clear();
        }
    }

    @Override // ch.r
    public final void onComplete() {
        this.i = true;
        a();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.j = th2;
        this.i = true;
        a();
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        this.e.a(Long.valueOf(this.f19670d.c(this.c)), obj);
        a();
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f19671g, interfaceC1486b)) {
            this.f19671g = interfaceC1486b;
            this.f19668a.onSubscribe(this);
        }
    }
}
