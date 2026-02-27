package ch;

import dOYHB6.tiZVw8.numX49;
import fh.InterfaceC1486b;
import ih.EnumC1605c;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f9374a = Boolean.getBoolean(numX49.tnTj78("bt8P"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f9375b = TimeUnit.MINUTES.toNanos(Long.getLong(numX49.tnTj78("bt8b"), 15).longValue());

    public static long a(TimeUnit timeUnit) {
        return !f9374a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public abstract u b();

    public long c(TimeUnit timeUnit) {
        return a(timeUnit);
    }

    public InterfaceC1486b d(Runnable runnable) {
        return e(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public InterfaceC1486b e(Runnable runnable, long j, TimeUnit timeUnit) {
        u uVarB = b();
        s sVar = new s(runnable, uVarB);
        uVarB.b(sVar, j, timeUnit);
        return sVar;
    }

    public InterfaceC1486b f(Runnable runnable, long j, long j6, TimeUnit timeUnit) {
        u uVarB = b();
        t tVar = new t(runnable, uVarB);
        InterfaceC1486b interfaceC1486bD = uVarB.d(tVar, j, j6, timeUnit);
        return interfaceC1486bD == EnumC1605c.f17149a ? interfaceC1486bD : tVar;
    }
}
