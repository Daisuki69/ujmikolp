package Nh;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class l extends Ah.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f4472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f4473b;

    public l(n nVar) {
        boolean z4 = r.f4481a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, nVar);
        if (r.f4481a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            r.f4483d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f4472a = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // Ah.n
    public final io.reactivex.rxjava3.disposables.b b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // Ah.n
    public final io.reactivex.rxjava3.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f4473b ? Dh.b.f1156a : e(runnable, j, timeUnit, null);
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        if (this.f4473b) {
            return;
        }
        this.f4473b = true;
        this.f4472a.shutdownNow();
    }

    public final q e(Runnable runnable, long j, TimeUnit timeUnit, Dh.c cVar) {
        q qVar = new q(runnable, cVar);
        if (cVar == null || cVar.a(qVar)) {
            ScheduledExecutorService scheduledExecutorService = this.f4472a;
            try {
                qVar.a(j <= 0 ? scheduledExecutorService.submit((Callable) qVar) : scheduledExecutorService.schedule((Callable) qVar, j, timeUnit));
                return qVar;
            } catch (RejectedExecutionException e) {
                if (cVar != null) {
                    cVar.i(qVar);
                }
                E1.c.k(e);
            }
        }
        return qVar;
    }
}
