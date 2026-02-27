package sh;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends a implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = a.c;
        this.f20080b = Thread.currentThread();
        try {
            this.f20079a.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.f20080b = null;
        }
    }
}
