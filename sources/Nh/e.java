package Nh;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends Ah.o {
    public static final c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f4457d;
    public static final int e;
    public static final d f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f4458b;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        e = iAvailableProcessors;
        d dVar = new d(new n("RxComputationShutdown", 0));
        f = dVar;
        dVar.dispose();
        n nVar = new n("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), 0, true);
        f4457d = nVar;
        c cVar = new c(0, nVar);
        c = cVar;
        for (d dVar2 : cVar.f4456b) {
            dVar2.dispose();
        }
    }

    public e() {
        AtomicReference atomicReference;
        n nVar = f4457d;
        c cVar = c;
        this.f4458b = new AtomicReference(cVar);
        c cVar2 = new c(e, nVar);
        do {
            atomicReference = this.f4458b;
            if (atomicReference.compareAndSet(cVar, cVar2)) {
                return;
            }
        } while (atomicReference.get() == cVar);
        for (d dVar : cVar2.f4456b) {
            dVar.dispose();
        }
    }

    @Override // Ah.o
    public final Ah.n a() {
        return new b(((c) this.f4458b.get()).a());
    }

    @Override // Ah.o
    public final io.reactivex.rxjava3.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        d dVarA = ((c) this.f4458b.get()).a();
        dVarA.getClass();
        p pVar = new p(runnable);
        ScheduledExecutorService scheduledExecutorService = dVarA.f4472a;
        try {
            pVar.a(j <= 0 ? scheduledExecutorService.submit(pVar) : scheduledExecutorService.schedule(pVar, j, timeUnit));
            return pVar;
        } catch (RejectedExecutionException e7) {
            E1.c.k(e7);
            return Dh.b.f1156a;
        }
    }

    @Override // Ah.o
    public final io.reactivex.rxjava3.disposables.b d(Runnable runnable, long j, long j6, TimeUnit timeUnit) {
        d dVarA = ((c) this.f4458b.get()).a();
        dVarA.getClass();
        Dh.b bVar = Dh.b.f1156a;
        if (j6 <= 0) {
            ScheduledExecutorService scheduledExecutorService = dVarA.f4472a;
            f fVar = new f(runnable, scheduledExecutorService);
            try {
                fVar.a(j <= 0 ? scheduledExecutorService.submit(fVar) : scheduledExecutorService.schedule(fVar, j, timeUnit));
                return fVar;
            } catch (RejectedExecutionException e7) {
                E1.c.k(e7);
            }
        } else {
            o oVar = new o(runnable);
            try {
                oVar.a(dVarA.f4472a.scheduleAtFixedRate(oVar, j, j6, timeUnit));
                return oVar;
            } catch (RejectedExecutionException e10) {
                E1.c.k(e10);
            }
        }
        return bVar;
    }
}
