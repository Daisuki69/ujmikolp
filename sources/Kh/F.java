package Kh;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends AtomicInteger implements Fh.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.j f2685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2686b;

    public F(Ah.j jVar, Object obj) {
        this.f2685a = jVar;
        this.f2686b = obj;
    }

    @Override // Fh.c
    public final int b(int i) {
        lazySet(1);
        return 1;
    }

    @Override // Fh.g
    public final void clear() {
        lazySet(3);
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        set(3);
    }

    @Override // Fh.g
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // Fh.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Fh.g
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f2686b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Ah.j jVar = this.f2685a;
            jVar.onNext(this.f2686b);
            if (get() == 2) {
                lazySet(3);
                jVar.onComplete();
            }
        }
    }
}
