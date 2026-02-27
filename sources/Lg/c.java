package lg;

import Ah.n;
import ch.u;
import fh.InterfaceC1486b;
import java.util.concurrent.TimeUnit;
import ph.RunnableC2125t1;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f18295a;

    public c(n nVar) {
        this.f18295a = nVar;
    }

    @Override // ch.u
    public final long a(TimeUnit timeUnit) {
        return this.f18295a.a(TimeUnit.NANOSECONDS);
    }

    @Override // ch.u
    public final InterfaceC1486b b(Runnable runnable, long j, TimeUnit timeUnit) {
        return C1828a.a(this.f18295a.c(runnable, j, timeUnit));
    }

    @Override // ch.u
    public final void c(RunnableC2125t1 runnableC2125t1) {
        this.f18295a.b(runnableC2125t1);
    }

    @Override // ch.u
    public final InterfaceC1486b d(Runnable runnable, long j, long j6, TimeUnit timeUnit) {
        return C1828a.a(this.f18295a.d(runnable, j, j6, timeUnit));
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f18295a.dispose();
    }
}
