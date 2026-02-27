package We;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6349a = 1;

    public /* synthetic */ D(int i, int i4, long j, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(i, i4, j, timeUnit, blockingQueue);
    }

    public void a(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        switch (this.f6349a) {
            case 0:
                C c = new C((RunnableC0603g) runnable);
                execute(c);
                return c;
            default:
                return super.submit(runnable);
        }
    }

    public /* synthetic */ D(int i, int i4, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i4, j, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactory);
    }
}
