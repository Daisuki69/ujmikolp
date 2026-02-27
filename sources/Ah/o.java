package Ah;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f323a;

    static {
        long jLongValue = Long.getLong("rx3.scheduler.drift-tolerance", 15L).longValue();
        String property = System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes");
        f323a = "seconds".equalsIgnoreCase(property) ? TimeUnit.SECONDS.toNanos(jLongValue) : "milliseconds".equalsIgnoreCase(property) ? TimeUnit.MILLISECONDS.toNanos(jLongValue) : TimeUnit.MINUTES.toNanos(jLongValue);
    }

    public abstract n a();

    public io.reactivex.rxjava3.disposables.b b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public io.reactivex.rxjava3.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        n nVarA = a();
        k kVar = new k(runnable, nVarA);
        nVarA.c(kVar, j, timeUnit);
        return kVar;
    }

    public io.reactivex.rxjava3.disposables.b d(Runnable runnable, long j, long j6, TimeUnit timeUnit) {
        n nVarA = a();
        l lVar = new l(runnable, nVarA);
        io.reactivex.rxjava3.disposables.b bVarD = nVarA.d(lVar, j, j6, timeUnit);
        return bVarD == Dh.b.f1156a ? bVarD : lVar;
    }
}
