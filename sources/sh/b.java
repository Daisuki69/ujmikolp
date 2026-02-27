package sh;

import fh.C1485a;
import fh.InterfaceC1486b;
import ih.EnumC1605c;
import java.util.concurrent.TimeUnit;
import ph.RunnableC2125t1;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends ch.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1485a f20081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1485a f20082b;
    public final C1485a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f20083d;
    public volatile boolean e;

    public b(d dVar) {
        this.f20083d = dVar;
        C1485a c1485a = new C1485a(1);
        this.f20081a = c1485a;
        C1485a c1485a2 = new C1485a(0);
        this.f20082b = c1485a2;
        C1485a c1485a3 = new C1485a(1);
        this.c = c1485a3;
        c1485a3.a(c1485a);
        c1485a3.a(c1485a2);
    }

    @Override // ch.u
    public final InterfaceC1486b b(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.e ? EnumC1605c.f17149a : this.f20083d.e(runnable, j, timeUnit, this.f20082b);
    }

    @Override // ch.u
    public final void c(RunnableC2125t1 runnableC2125t1) {
        if (this.e) {
            return;
        }
        this.f20083d.e(runnableC2125t1, 0L, TimeUnit.MILLISECONDS, this.f20081a);
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.c.dispose();
    }
}
