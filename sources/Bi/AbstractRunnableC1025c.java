package bi;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: bi.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC1025c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayBlockingQueue f9148a = new ArrayBlockingQueue(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f9149b = Collections.newSetFromMap(new ConcurrentHashMap());

    static {
        new ThreadFactoryC1024b(new AtomicInteger(1), 0);
    }

    public AbstractRunnableC1025c() {
        Yi.c cVar = new Yi.c(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        ReentrantLock reentrantLock = new ReentrantLock();
        cVar.f6793a = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        cVar.submit(this);
        reentrantLock.lock();
        try {
            conditionNewCondition.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            b();
        }
    }
}
