package Nh;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends a implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = a.c;
        this.f4451b = Thread.currentThread();
        try {
            try {
                this.f4450a.run();
                return null;
            } finally {
                lazySet(futureTask);
                this.f4451b = null;
            }
        } catch (Throwable th2) {
            E1.c.k(th2);
            throw th2;
        }
    }
}
