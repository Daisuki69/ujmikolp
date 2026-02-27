package sh;

import ch.v;
import dOYHB6.tiZVw8.numX49;
import fh.InterfaceC1486b;
import ih.EnumC1605c;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Nh.n f20110d;
    public static final ScheduledExecutorService e;
    public final AtomicReference c;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        e = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f20110d = new Nh.n(numX49.tnTj78("bF7Z"), Math.max(1, Math.min(10, Integer.getInteger(numX49.tnTj78("bF7r"), 5).intValue())), 1, true);
    }

    public r() {
        AtomicReference atomicReference = new AtomicReference();
        this.c = atomicReference;
        boolean z4 = p.f20105a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, f20110d);
        if (p.f20105a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            p.f20107d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // ch.v
    public final ch.u b() {
        return new q((ScheduledExecutorService) this.c.get());
    }

    @Override // ch.v
    public final InterfaceC1486b e(Runnable runnable, long j, TimeUnit timeUnit) {
        n nVar = new n(runnable);
        AtomicReference atomicReference = this.c;
        try {
            nVar.a(j <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(nVar) : ((ScheduledExecutorService) atomicReference.get()).schedule(nVar, j, timeUnit));
            return nVar;
        } catch (RejectedExecutionException e7) {
            S1.s.r(e7);
            return EnumC1605c.f17149a;
        }
    }

    @Override // ch.v
    public final InterfaceC1486b f(Runnable runnable, long j, long j6, TimeUnit timeUnit) {
        EnumC1605c enumC1605c = EnumC1605c.f17149a;
        AtomicReference atomicReference = this.c;
        if (j6 > 0) {
            m mVar = new m(runnable);
            try {
                mVar.a(((ScheduledExecutorService) atomicReference.get()).scheduleAtFixedRate(mVar, j, j6, timeUnit));
                return mVar;
            } catch (RejectedExecutionException e7) {
                S1.s.r(e7);
                return enumC1605c;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
        f fVar = new f(runnable, scheduledExecutorService);
        try {
            fVar.a(j <= 0 ? scheduledExecutorService.submit(fVar) : scheduledExecutorService.schedule(fVar, j, timeUnit));
            return fVar;
        } catch (RejectedExecutionException e10) {
            S1.s.r(e10);
            return enumC1605c;
        }
    }
}
