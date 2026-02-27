package R2;

import T2.i;
import U2.C0596c;
import com.google.firebase.perf.util.Timer;
import defpackage.AbstractC1414e;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class g {
    public static final M2.a f = M2.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f5447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f5448b;
    public final Runtime c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f5449d;
    public long e;

    public g() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.f5449d = null;
        this.e = -1L;
        this.f5447a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f5448b = new ConcurrentLinkedQueue();
        this.c = runtime;
    }

    public final void a(Timer timer) {
        synchronized (this) {
            try {
                this.f5447a.schedule(new f(this, timer, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                f.f("Unable to collect Memory Metric: " + e.getMessage());
            }
        }
    }

    public final synchronized void b(long j, Timer timer) {
        this.e = j;
        try {
            this.f5449d = this.f5447a.scheduleAtFixedRate(new f(this, timer, 0), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            f.f("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    public final U2.d c(Timer timer) {
        if (timer == null) {
            return null;
        }
        long jA = timer.a() + timer.f9858a;
        C0596c c0596cU = U2.d.u();
        c0596cU.i();
        U2.d.s((U2.d) c0596cU.f10116b, jA);
        Runtime runtime = this.c;
        int iB = i.b((AbstractC1414e.b(5) * (runtime.totalMemory() - runtime.freeMemory())) / 1024);
        c0596cU.i();
        U2.d.t((U2.d) c0596cU.f10116b, iB);
        return (U2.d) c0596cU.g();
    }
}
