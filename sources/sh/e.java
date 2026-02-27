package sh;

import ch.v;
import dOYHB6.tiZVw8.numX49;
import fh.InterfaceC1486b;
import ih.EnumC1605c;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f20086d;
    public static final Nh.n e;
    public static final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f20087g;
    public final AtomicReference c;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger(numX49.tnTj78("bF7P"), 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f = iAvailableProcessors;
        d dVar = new d(new Nh.n(numX49.tnTj78("bF7b"), 1));
        f20087g = dVar;
        dVar.dispose();
        Nh.n nVar = new Nh.n(numX49.tnTj78("bF7L"), Math.max(1, Math.min(10, Integer.getInteger(numX49.tnTj78("bF72"), 5).intValue())), 1, true);
        e = nVar;
        c cVar = new c(0, nVar);
        f20086d = cVar;
        for (d dVar2 : cVar.f20085b) {
            dVar2.dispose();
        }
    }

    public e() {
        AtomicReference atomicReference;
        Nh.n nVar = e;
        c cVar = f20086d;
        this.c = new AtomicReference(cVar);
        c cVar2 = new c(f, nVar);
        do {
            atomicReference = this.c;
            if (atomicReference.compareAndSet(cVar, cVar2)) {
                return;
            }
        } while (atomicReference.get() == cVar);
        for (d dVar : cVar2.f20085b) {
            dVar.dispose();
        }
    }

    @Override // ch.v
    public final ch.u b() {
        return new b(((c) this.c.get()).a());
    }

    @Override // ch.v
    public final InterfaceC1486b e(Runnable runnable, long j, TimeUnit timeUnit) {
        d dVarA = ((c) this.c.get()).a();
        dVarA.getClass();
        n nVar = new n(runnable);
        ScheduledExecutorService scheduledExecutorService = dVarA.f20100a;
        try {
            nVar.a(j <= 0 ? scheduledExecutorService.submit(nVar) : scheduledExecutorService.schedule(nVar, j, timeUnit));
            return nVar;
        } catch (RejectedExecutionException e7) {
            S1.s.r(e7);
            return EnumC1605c.f17149a;
        }
    }

    @Override // ch.v
    public final InterfaceC1486b f(Runnable runnable, long j, long j6, TimeUnit timeUnit) {
        d dVarA = ((c) this.c.get()).a();
        dVarA.getClass();
        EnumC1605c enumC1605c = EnumC1605c.f17149a;
        if (j6 <= 0) {
            ScheduledExecutorService scheduledExecutorService = dVarA.f20100a;
            f fVar = new f(runnable, scheduledExecutorService);
            try {
                fVar.a(j <= 0 ? scheduledExecutorService.submit(fVar) : scheduledExecutorService.schedule(fVar, j, timeUnit));
                return fVar;
            } catch (RejectedExecutionException e7) {
                S1.s.r(e7);
            }
        } else {
            m mVar = new m(runnable);
            try {
                mVar.a(dVarA.f20100a.scheduleAtFixedRate(mVar, j, j6, timeUnit));
                return mVar;
            } catch (RejectedExecutionException e10) {
                S1.s.r(e10);
            }
        }
        return enumC1605c;
    }
}
