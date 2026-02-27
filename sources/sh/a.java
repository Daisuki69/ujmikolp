package sh;

import fh.InterfaceC1486b;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a extends AtomicReference implements InterfaceC1486b {
    public static final FutureTask c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FutureTask f20078d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f20079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f20080b;

    static {
        Eh.b bVar = jh.e.f17816b;
        c = new FutureTask(bVar, null);
        f20078d = new FutureTask(bVar, null);
    }

    public a(Runnable runnable) {
        this.f20079a = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == c) {
                return;
            }
            if (future2 == f20078d) {
                future.cancel(this.f20080b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == c || future == (futureTask = f20078d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f20080b != Thread.currentThread());
    }
}
