package li;

import bi.C1023a;
import dOYHB6.tiZVw8.numX49;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: li.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ThreadFactoryC1841a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f18322a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1023a f18323b = new C1023a(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(numX49.tnTj78("bOvP") + this.f18322a.getAndIncrement());
        thread.setUncaughtExceptionHandler(this.f18323b);
        return thread;
    }
}
