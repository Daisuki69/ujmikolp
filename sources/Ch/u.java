package ch;

import fh.C1487c;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import ih.EnumC1605c;
import java.util.concurrent.TimeUnit;
import ph.RunnableC2125t1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u implements InterfaceC1486b {
    public long a(TimeUnit timeUnit) {
        return v.a(TimeUnit.NANOSECONDS);
    }

    public abstract InterfaceC1486b b(Runnable runnable, long j, TimeUnit timeUnit);

    public void c(RunnableC2125t1 runnableC2125t1) {
        b(runnableC2125t1, 0L, TimeUnit.NANOSECONDS);
    }

    public InterfaceC1486b d(Runnable runnable, long j, long j6, TimeUnit timeUnit) {
        C1487c c1487c = new C1487c();
        C1487c c1487c2 = new C1487c();
        c1487c2.lazySet(c1487c);
        long nanos = timeUnit.toNanos(j6);
        long jA = a(TimeUnit.NANOSECONDS);
        InterfaceC1486b interfaceC1486bB = b(new Ah.m(this, timeUnit.toNanos(j) + jA, runnable, jA, c1487c2, nanos, 1), j, timeUnit);
        if (interfaceC1486bB == EnumC1605c.f17149a) {
            return interfaceC1486bB;
        }
        EnumC1604b.c(c1487c, interfaceC1486bB);
        return c1487c2;
    }
}
