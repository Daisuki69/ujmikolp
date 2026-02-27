package S1;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class D extends A implements ScheduledExecutorService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f5599b;

    public D(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f5599b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        G g8 = new G(callable);
        return new B(g8, this.f5599b.schedule(g8, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j6, TimeUnit timeUnit) {
        C c = new C(runnable);
        return new B(c, this.f5599b.scheduleAtFixedRate(c, j, j6, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j6, TimeUnit timeUnit) {
        C c = new C(runnable);
        return new B(c, this.f5599b.scheduleWithFixedDelay(c, j, j6, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        G g8 = new G(Executors.callable(runnable, null));
        return new B(g8, this.f5599b.schedule(g8, j, timeUnit));
    }
}
