package Nh;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Callable, io.reactivex.rxjava3.disposables.b {
    public static final FutureTask f = new FutureTask(Eh.d.f1364a, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f4459a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f4461d;
    public Thread e;
    public final AtomicReference c = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f4460b = new AtomicReference();

    public f(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.f4459a = runnable;
        this.f4461d = scheduledExecutorService;
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r1.cancel(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r5.e == java.lang.Thread.currentThread()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r2 = false;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() {
        /*
            r5 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r5.e = r0
            r0 = 0
            java.lang.Runnable r1 = r5.f4459a     // Catch: java.lang.Throwable -> L3d
            r1.run()     // Catch: java.lang.Throwable -> L3d
            r5.e = r0     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.ScheduledExecutorService r1 = r5.f4461d     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.Future r1 = r1.submit(r5)     // Catch: java.lang.Throwable -> L3d
        L14:
            java.util.concurrent.atomic.AtomicReference r2 = r5.f4460b     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.FutureTask r4 = Nh.f.f     // Catch: java.lang.Throwable -> L3d
            if (r3 != r4) goto L2f
            java.lang.Thread r2 = r5.e     // Catch: java.lang.Throwable -> L3d
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L3d
            if (r2 == r3) goto L2a
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            r1.cancel(r2)     // Catch: java.lang.Throwable -> L3d
            return r0
        L2f:
            boolean r4 = r2.compareAndSet(r3, r1)     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L36
            return r0
        L36:
            java.lang.Object r4 = r2.get()     // Catch: java.lang.Throwable -> L3d
            if (r4 == r3) goto L2f
            goto L14
        L3d:
            r1 = move-exception
            r5.e = r0
            E1.c.k(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Nh.f.call():java.lang.Object");
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        AtomicReference atomicReference = this.c;
        FutureTask futureTask = f;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.e != Thread.currentThread());
        }
        Future future2 = (Future) this.f4460b.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.e != Thread.currentThread());
    }
}
