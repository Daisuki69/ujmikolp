package Nh;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends AtomicReference implements io.reactivex.rxjava3.disposables.b {
    public static final FutureTask c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FutureTask f4449d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f4450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f4451b;

    static {
        Eh.b bVar = Eh.d.f1364a;
        c = new FutureTask(bVar, null);
        f4449d = new FutureTask(bVar, null);
    }

    public a(Runnable runnable) {
        this.f4450a = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == c) {
                return;
            }
            if (future2 == f4449d) {
                future.cancel(this.f4451b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == c || future == (futureTask = f4449d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f4451b != Thread.currentThread());
    }
}
