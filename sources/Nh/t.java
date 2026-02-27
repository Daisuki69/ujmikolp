package Nh;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends Ah.o {
    public static final n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ScheduledExecutorService f4486d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f4487b;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f4486d = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        c = new n("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), 0, true);
    }

    public t() {
        AtomicReference atomicReference = new AtomicReference();
        this.f4487b = atomicReference;
        boolean z4 = r.f4481a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, c);
        if (r.f4481a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            r.f4483d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // Ah.o
    public final Ah.n a() {
        return new s((ScheduledExecutorService) this.f4487b.get());
    }

    @Override // Ah.o
    public final io.reactivex.rxjava3.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        p pVar = new p(runnable);
        AtomicReference atomicReference = this.f4487b;
        try {
            pVar.a(j <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(pVar) : ((ScheduledExecutorService) atomicReference.get()).schedule(pVar, j, timeUnit));
            return pVar;
        } catch (RejectedExecutionException e) {
            E1.c.k(e);
            return Dh.b.f1156a;
        }
    }

    @Override // Ah.o
    public final io.reactivex.rxjava3.disposables.b d(Runnable runnable, long j, long j6, TimeUnit timeUnit) {
        Dh.b bVar = Dh.b.f1156a;
        AtomicReference atomicReference = this.f4487b;
        if (j6 > 0) {
            o oVar = new o(runnable);
            try {
                oVar.a(((ScheduledExecutorService) atomicReference.get()).scheduleAtFixedRate(oVar, j, j6, timeUnit));
                return oVar;
            } catch (RejectedExecutionException e) {
                E1.c.k(e);
                return bVar;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
        f fVar = new f(runnable, scheduledExecutorService);
        try {
            fVar.a(j <= 0 ? scheduledExecutorService.submit(fVar) : scheduledExecutorService.schedule(fVar, j, timeUnit));
            return fVar;
        } catch (RejectedExecutionException e7) {
            E1.c.k(e7);
            return bVar;
        }
    }
}
