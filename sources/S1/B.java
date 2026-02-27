package S1;

import O1.K;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends K implements ScheduledFuture, y, Future {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f5597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledFuture f5598b;

    public B(p pVar, ScheduledFuture scheduledFuture) {
        this.f5597a = pVar;
        this.f5598b = scheduledFuture;
    }

    public final boolean a(boolean z4) {
        return this.f5597a.cancel(z4);
    }

    @Override // S1.y
    public final void addListener(Runnable runnable, Executor executor) {
        this.f5597a.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        boolean zA = a(z4);
        if (zA) {
            this.f5598b.cancel(z4);
        }
        return zA;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f5598b.compareTo(delayed);
    }

    @Override // O1.K
    public final Object delegate() {
        return this.f5597a;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f5597a.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f5598b.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5597a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5597a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f5597a.get(j, timeUnit);
    }
}
