package Ah;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n implements io.reactivex.rxjava3.disposables.b {
    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public io.reactivex.rxjava3.disposables.b b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public abstract io.reactivex.rxjava3.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit);

    public final io.reactivex.rxjava3.disposables.b d(Runnable runnable, long j, long j6, TimeUnit timeUnit) {
        Dh.d dVar = new Dh.d(0);
        Dh.d dVar2 = new Dh.d(0);
        dVar2.lazySet(dVar);
        long nanos = timeUnit.toNanos(j6);
        long jA = a(TimeUnit.NANOSECONDS);
        io.reactivex.rxjava3.disposables.b bVarC = c(new m(this, timeUnit.toNanos(j) + jA, runnable, jA, dVar2, nanos, 0), j, timeUnit);
        if (bVarC == Dh.b.f1156a) {
            return bVarC;
        }
        Dh.a.c(dVar, bVarC);
        return dVar2;
    }
}
