package Bj;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class I extends AbstractC0136d0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final I h;
    public static final long i;

    static {
        Long l6;
        I i4 = new I();
        h = i4;
        i4.D(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l6 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l6 = 1000L;
        }
        i = timeUnit.toNanos(l6.longValue());
    }

    @Override // Bj.AbstractC0138e0
    public final Thread C() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(h.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // Bj.AbstractC0138e0
    public final void G(long j, AbstractRunnableC0132b0 abstractRunnableC0132b0) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // Bj.AbstractC0136d0
    public final void H(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.H(runnable);
    }

    public final synchronized void M() {
        int i4 = debugStatus;
        if (i4 == 2 || i4 == 3) {
            debugStatus = 3;
            AbstractC0136d0.e.set(this, null);
            AbstractC0136d0.f.set(this, null);
            notifyAll();
        }
    }

    @Override // Bj.AbstractC0136d0, Bj.M
    public final W r(long j, G0 g02, CoroutineContext coroutineContext) {
        long j6 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j6 >= 4611686018427387903L) {
            return y0.f648a;
        }
        long jNanoTime = System.nanoTime();
        C0130a0 c0130a0 = new C0130a0(j6 + jNanoTime, g02);
        L(jNanoTime, c0130a0);
        return c0130a0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zK;
        F0.f588a.set(this);
        try {
            synchronized (this) {
                int i4 = debugStatus;
                if (i4 == 2 || i4 == 3) {
                    if (zK) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jE = E();
                    if (jE == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = i + jNanoTime;
                        }
                        long j6 = j - jNanoTime;
                        if (j6 <= 0) {
                            _thread = null;
                            M();
                            if (K()) {
                                return;
                            }
                            C();
                            return;
                        }
                        if (jE > j6) {
                            jE = j6;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jE > 0) {
                        int i6 = debugStatus;
                        if (i6 == 2 || i6 == 3) {
                            _thread = null;
                            M();
                            if (K()) {
                                return;
                            }
                            C();
                            return;
                        }
                        LockSupport.parkNanos(this, jE);
                    }
                }
            }
        } finally {
            _thread = null;
            M();
            if (!K()) {
                C();
            }
        }
    }

    @Override // Bj.AbstractC0136d0, Bj.AbstractC0138e0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // Bj.A
    public final String toString() {
        return "DefaultExecutor";
    }
}
