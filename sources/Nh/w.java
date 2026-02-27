package Nh;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends Ah.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriorityBlockingQueue f4494a = new PriorityBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f4495b = new AtomicInteger();
    public final AtomicInteger c = new AtomicInteger();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f4496d;

    @Override // Ah.n
    public final io.reactivex.rxjava3.disposables.b b(Runnable runnable) {
        return e(runnable, a(TimeUnit.MILLISECONDS));
    }

    @Override // Ah.n
    public final io.reactivex.rxjava3.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j) + a(TimeUnit.MILLISECONDS);
        return e(new u(runnable, this, millis, 0), millis);
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        this.f4496d = true;
    }

    public final io.reactivex.rxjava3.disposables.b e(Runnable runnable, long j) {
        boolean z4 = this.f4496d;
        Dh.b bVar = Dh.b.f1156a;
        if (!z4) {
            v vVar = new v(runnable, Long.valueOf(j), this.c.incrementAndGet());
            this.f4494a.add(vVar);
            if (this.f4495b.getAndIncrement() != 0) {
                return io.reactivex.rxjava3.disposables.a.a(new S1.v(13, this, vVar, false));
            }
            int iAddAndGet = 1;
            while (!this.f4496d) {
                v vVar2 = (v) this.f4494a.poll();
                if (vVar2 == null) {
                    iAddAndGet = this.f4495b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                    }
                } else if (!vVar2.f4493d) {
                    vVar2.f4491a.run();
                }
            }
            this.f4494a.clear();
            return bVar;
        }
        return bVar;
    }
}
