package S1;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class F extends AtomicReference implements Runnable {
    public static final Eh.b c = new Eh.b(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Eh.b f5600d = new Eh.b(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable f5601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f5602b;

    public F(G g8, Callable callable) {
        this.f5602b = g8;
        callable.getClass();
        this.f5601a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        w wVar = null;
        boolean z4 = false;
        int i = 0;
        while (true) {
            boolean z5 = runnable instanceof w;
            Eh.b bVar = f5600d;
            if (!z5 && runnable != bVar) {
                break;
            }
            if (z5) {
                wVar = (w) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == bVar || compareAndSet(runnable, bVar)) {
                z4 = Thread.interrupted() || z4;
                LockSupport.park(wVar);
            }
            runnable = (Runnable) get();
        }
        if (z4) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        Thread threadCurrentThread = Thread.currentThread();
        if (compareAndSet(null, threadCurrentThread)) {
            G g8 = this.f5602b;
            boolean zIsDone = g8.isDone();
            Eh.b bVar = c;
            if (zIsDone) {
                objCall = null;
            } else {
                try {
                    objCall = this.f5601a.call();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, bVar)) {
                            a(threadCurrentThread);
                        }
                        if (zIsDone) {
                            return;
                        }
                        g8.k(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, bVar)) {
                            a(threadCurrentThread);
                        }
                        if (!zIsDone) {
                            g8.getClass();
                            if (p.f.j(g8, null, p.f5620g)) {
                                p.d(g8, false);
                            }
                        }
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, bVar)) {
                a(threadCurrentThread);
            }
            if (zIsDone) {
                return;
            }
            g8.getClass();
            if (objCall == null) {
                objCall = p.f5620g;
            }
            if (p.f.j(g8, null, objCall)) {
                p.d(g8, false);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == c) {
            str = "running=[DONE]";
        } else if (runnable instanceof w) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbV = We.s.v(str, ", ");
        sbV.append(this.f5601a.toString());
        return sbV.toString();
    }
}
