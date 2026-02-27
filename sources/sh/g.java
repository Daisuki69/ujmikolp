package sh;

import fh.C1485a;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f20092b;
    public final C1485a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f20093d;
    public final ScheduledFuture e;
    public final Nh.n f;

    public g(long j, TimeUnit timeUnit, Nh.n nVar) {
        g gVar;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
        this.f20091a = nanos;
        this.f20092b = new ConcurrentLinkedQueue();
        this.c = new C1485a(0);
        this.f = nVar;
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, j.e);
            gVar = this;
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(gVar, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            gVar = this;
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        gVar.f20093d = scheduledExecutorServiceNewScheduledThreadPool;
        gVar.e = scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue<i> concurrentLinkedQueue = this.f20092b;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        for (i iVar : concurrentLinkedQueue) {
            if (iVar.c > jNanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(iVar)) {
                this.c.g(iVar);
            }
        }
    }
}
