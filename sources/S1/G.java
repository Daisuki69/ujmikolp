package S1;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends p implements RunnableFuture, h {
    public volatile F h;

    public G(Callable callable) {
        this.h = new F(this, callable);
    }

    @Override // S1.p
    public final void b() {
        F f;
        Object obj = this.f5621a;
        if ((obj instanceof C0587a) && ((C0587a) obj).f5604a && (f = this.h) != null) {
            Eh.b bVar = F.f5600d;
            Eh.b bVar2 = F.c;
            Runnable runnable = (Runnable) f.get();
            if (runnable instanceof Thread) {
                w wVar = new w(f);
                w.a(wVar, Thread.currentThread());
                if (f.compareAndSet(runnable, wVar)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) f.getAndSet(bVar2)) == bVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.h = null;
    }

    @Override // S1.p
    public final String i() {
        F f = this.h;
        if (f == null) {
            return super.i();
        }
        return "task=[" + f + "]";
    }

    @Override // S1.p, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5621a instanceof C0587a;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        F f = this.h;
        if (f != null) {
            f.run();
        }
        this.h = null;
    }
}
