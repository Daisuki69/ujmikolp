package Nh;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends Ah.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f4484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dh.c f4485b = new Dh.c(1);
    public volatile boolean c;

    public s(ScheduledExecutorService scheduledExecutorService) {
        this.f4484a = scheduledExecutorService;
    }

    @Override // Ah.n
    public final io.reactivex.rxjava3.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        boolean z4 = this.c;
        Dh.b bVar = Dh.b.f1156a;
        if (z4) {
            return bVar;
        }
        q qVar = new q(runnable, this.f4485b);
        this.f4485b.a(qVar);
        try {
            qVar.a(j <= 0 ? this.f4484a.submit((Callable) qVar) : this.f4484a.schedule((Callable) qVar, j, timeUnit));
            return qVar;
        } catch (RejectedExecutionException e) {
            dispose();
            E1.c.k(e);
            return bVar;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.f4485b.dispose();
    }
}
