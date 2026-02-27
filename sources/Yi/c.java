package Yi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends ThreadPoolExecutor implements ExecutorService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ReentrantLock f6793a;

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        ReentrantLock reentrantLock = this.f6793a;
        reentrantLock.lock();
        reentrantLock.unlock();
    }
}
