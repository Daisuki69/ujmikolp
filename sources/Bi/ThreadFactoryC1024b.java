package bi;

import dOYHB6.tiZVw8.numX49;
import h2.u;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: bi.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ThreadFactoryC1024b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Number f9147b;

    public /* synthetic */ ThreadFactoryC1024b(Number number, int i) {
        this.f9146a = i;
        this.f9147b = number;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f9146a) {
            case 0:
                Thread thread = new Thread(runnable, numX49.tnTj78("bu6B") + ((AtomicInteger) this.f9147b).getAndIncrement());
                thread.setDaemon(true);
                thread.setUncaughtExceptionHandler(new C1023a(0));
                return thread;
            default:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new u(runnable));
                threadNewThread.setName(numX49.tnTj78("bu6k") + ((AtomicLong) this.f9147b).getAndIncrement());
                return threadNewThread;
        }
    }
}
