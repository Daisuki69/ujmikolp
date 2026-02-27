package Nh;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f4463b;
    public final Dh.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f4464d;
    public final ScheduledFuture e;
    public final n f;

    public g(long j, TimeUnit timeUnit, n nVar) {
        g gVar;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
        this.f4462a = nanos;
        this.f4463b = new ConcurrentLinkedQueue();
        this.c = new Dh.c(1);
        this.f = nVar;
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, j.f4468d);
            gVar = this;
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(gVar, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            gVar = this;
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        gVar.f4464d = scheduledExecutorServiceNewScheduledThreadPool;
        gVar.e = scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue<i> concurrentLinkedQueue = this.f4463b;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        for (i iVar : concurrentLinkedQueue) {
            if (iVar.c > jNanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(iVar)) {
                this.c.i(iVar);
            }
        }
    }
}
