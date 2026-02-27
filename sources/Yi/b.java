package Yi;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import ki.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends ScheduledThreadPoolExecutor implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f6792b;
    public final Condition c;

    public b(int i, j jVar) {
        super(i, jVar, new ThreadPoolExecutor.DiscardPolicy());
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f6792b = reentrantLock;
        this.c = reentrantLock.newCondition();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        ReentrantLock reentrantLock = this.f6792b;
        reentrantLock.lock();
        while (this.f6791a) {
            try {
                this.c.await();
            } catch (InterruptedException unused) {
                thread.interrupt();
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
