package sh;

import fh.C1485a;
import fh.InterfaceC1486b;
import ih.EnumC1605c;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends ch.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f20108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1485a f20109b = new C1485a(0);
    public volatile boolean c;

    public q(ScheduledExecutorService scheduledExecutorService) {
        this.f20108a = scheduledExecutorService;
    }

    @Override // ch.u
    public final InterfaceC1486b b(Runnable runnable, long j, TimeUnit timeUnit) {
        boolean z4 = this.c;
        EnumC1605c enumC1605c = EnumC1605c.f17149a;
        if (z4) {
            return enumC1605c;
        }
        o oVar = new o(runnable, this.f20109b);
        this.f20109b.a(oVar);
        try {
            oVar.a(j <= 0 ? this.f20108a.submit((Callable) oVar) : this.f20108a.schedule((Callable) oVar, j, timeUnit));
            return oVar;
        } catch (RejectedExecutionException e) {
            dispose();
            S1.s.r(e);
            return enumC1605c;
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.f20109b.dispose();
    }
}
