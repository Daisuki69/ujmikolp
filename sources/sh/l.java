package sh;

import fh.C1485a;
import fh.InterfaceC1486b;
import ih.EnumC1605c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ph.RunnableC2125t1;

/* JADX INFO: loaded from: classes11.dex */
public class l extends ch.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f20100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f20101b;

    public l(Nh.n nVar) {
        boolean z4 = p.f20105a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, nVar);
        if (p.f20105a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            p.f20107d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f20100a = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // ch.u
    public final InterfaceC1486b b(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f20101b ? EnumC1605c.f17149a : e(runnable, j, timeUnit, null);
    }

    @Override // ch.u
    public final void c(RunnableC2125t1 runnableC2125t1) {
        b(runnableC2125t1, 0L, null);
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.f20101b) {
            return;
        }
        this.f20101b = true;
        this.f20100a.shutdownNow();
    }

    public final o e(Runnable runnable, long j, TimeUnit timeUnit, C1485a c1485a) {
        o oVar = new o(runnable, c1485a);
        if (c1485a == null || c1485a.a(oVar)) {
            ScheduledExecutorService scheduledExecutorService = this.f20100a;
            try {
                oVar.a(j <= 0 ? scheduledExecutorService.submit((Callable) oVar) : scheduledExecutorService.schedule((Callable) oVar, j, timeUnit));
                return oVar;
            } catch (RejectedExecutionException e) {
                if (c1485a != null) {
                    c1485a.g(oVar);
                }
                S1.s.r(e);
            }
        }
        return oVar;
    }
}
