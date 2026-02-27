package sh;

import ch.v;
import fh.C1487c;
import fh.InterfaceC1486b;
import ih.EnumC1605c;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import n4.RunnableC1918b;
import ph.RunnableC2125t1;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends ch.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriorityBlockingQueue f20114a = new PriorityBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f20115b = new AtomicInteger();
    public final AtomicInteger c = new AtomicInteger();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f20116d;

    @Override // ch.u
    public final InterfaceC1486b b(Runnable runnable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j) + v.a(TimeUnit.MILLISECONDS);
        return e(new Nh.u(runnable, this, millis, 1), millis);
    }

    @Override // ch.u
    public final void c(RunnableC2125t1 runnableC2125t1) {
        e(runnableC2125t1, v.a(TimeUnit.MILLISECONDS));
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f20116d = true;
    }

    public final InterfaceC1486b e(Runnable runnable, long j) {
        boolean z4 = this.f20116d;
        EnumC1605c enumC1605c = EnumC1605c.f17149a;
        if (!z4) {
            s sVar = new s(runnable, Long.valueOf(j), this.c.incrementAndGet());
            this.f20114a.add(sVar);
            if (this.f20115b.getAndIncrement() != 0) {
                return new C1487c(new RunnableC1918b(10, this, sVar));
            }
            int iAddAndGet = 1;
            while (!this.f20116d) {
                s sVar2 = (s) this.f20114a.poll();
                if (sVar2 == null) {
                    iAddAndGet = this.f20115b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                    }
                } else if (!sVar2.f20113d) {
                    sVar2.f20111a.run();
                }
            }
            this.f20114a.clear();
            return enumC1605c;
        }
        return enumC1605c;
    }
}
