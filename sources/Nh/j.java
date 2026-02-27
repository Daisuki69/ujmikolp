package Nh;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends Ah.o {
    public static final n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f4468d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f4469g;
    public static final g h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f4470b;
    public static final TimeUnit f = TimeUnit.SECONDS;
    public static final long e = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    static {
        i iVar = new i(new n("RxCachedThreadSchedulerShutdown", 0));
        f4469g = iVar;
        iVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        n nVar = new n("RxCachedThreadScheduler", iMax, 0, false);
        c = nVar;
        f4468d = new n("RxCachedWorkerPoolEvictor", iMax, 0, false);
        g gVar = new g(0L, null, nVar);
        h = gVar;
        gVar.c.dispose();
        ScheduledFuture scheduledFuture = gVar.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = gVar.f4464d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public j() {
        AtomicReference atomicReference;
        n nVar = c;
        g gVar = h;
        this.f4470b = new AtomicReference(gVar);
        g gVar2 = new g(e, f, nVar);
        do {
            atomicReference = this.f4470b;
            if (atomicReference.compareAndSet(gVar, gVar2)) {
                return;
            }
        } while (atomicReference.get() == gVar);
        gVar2.c.dispose();
        ScheduledFuture scheduledFuture = gVar2.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = gVar2.f4464d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // Ah.o
    public final Ah.n a() {
        return new h((g) this.f4470b.get());
    }
}
