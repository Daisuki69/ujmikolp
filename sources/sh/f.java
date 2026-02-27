package sh;

import fh.InterfaceC1486b;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements Callable, InterfaceC1486b {
    public static final FutureTask f = new FutureTask(jh.e.f17816b, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f20088a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f20090d;
    public Thread e;
    public final AtomicReference c = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f20089b = new AtomicReference();

    public f(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.f20088a = runnable;
        this.f20090d = scheduledExecutorService;
    }

    public final void a(Future future) {
        while (true) {
            AtomicReference atomicReference = this.c;
            Future future2 = (Future) atomicReference.get();
            if (future2 == f) {
                future.cancel(this.e != Thread.currentThread());
                return;
            }
            while (!atomicReference.compareAndSet(future2, future)) {
                if (atomicReference.get() != future2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.e = Thread.currentThread();
        try {
            this.f20088a.run();
            Future futureSubmit = this.f20090d.submit(this);
            loop0: while (true) {
                AtomicReference atomicReference = this.f20089b;
                Future future = (Future) atomicReference.get();
                if (future != f) {
                    while (!atomicReference.compareAndSet(future, futureSubmit)) {
                        if (atomicReference.get() != future) {
                            break;
                        }
                    }
                    break loop0;
                }
                futureSubmit.cancel(this.e != Thread.currentThread());
            }
            this.e = null;
            return null;
        } catch (Throwable th2) {
            this.e = null;
            S1.s.r(th2);
            return null;
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        AtomicReference atomicReference = this.c;
        FutureTask futureTask = f;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.e != Thread.currentThread());
        }
        Future future2 = (Future) this.f20089b.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.e != Thread.currentThread());
    }
}
