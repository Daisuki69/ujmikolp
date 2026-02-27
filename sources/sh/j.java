package sh;

import ch.v;
import dOYHB6.tiZVw8.numX49;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Nh.n f20097d;
    public static final Nh.n e;
    public static final i h;
    public static final boolean i;
    public static final g j;
    public final AtomicReference c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TimeUnit f20098g = TimeUnit.SECONDS;
    public static final long f = Long.getLong(numX49.tnTj78("bF7j"), 60).longValue();

    static {
        i iVar = new i(new Nh.n(numX49.tnTj78("bF7d"), 1));
        h = iVar;
        iVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger(numX49.tnTj78("bF7i"), 5).intValue()));
        Nh.n nVar = new Nh.n(numX49.tnTj78("bF7E"), iMax, 1, false);
        f20097d = nVar;
        e = new Nh.n(numX49.tnTj78("bF7F"), iMax, 1, false);
        i = Boolean.getBoolean(numX49.tnTj78("bF7H"));
        g gVar = new g(0L, null, nVar);
        j = gVar;
        gVar.c.dispose();
        ScheduledFuture scheduledFuture = gVar.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = gVar.f20093d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public j() {
        AtomicReference atomicReference;
        Nh.n nVar = f20097d;
        g gVar = j;
        this.c = new AtomicReference(gVar);
        g gVar2 = new g(f, f20098g, nVar);
        do {
            atomicReference = this.c;
            if (atomicReference.compareAndSet(gVar, gVar2)) {
                return;
            }
        } while (atomicReference.get() == gVar);
        gVar2.c.dispose();
        ScheduledFuture scheduledFuture = gVar2.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = gVar2.f20093d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // ch.v
    public final ch.u b() {
        return new h((g) this.c.get());
    }
}
