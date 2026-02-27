package of;

import dOYHB6.tiZVw8.numX49;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class d extends u {
    public static final long h;
    public static final long i;
    public static d j;
    public boolean e;
    public d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18820g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        h = millis;
        i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static d j() throws InterruptedException {
        d dVar = j.f;
        if (dVar == null) {
            long jNanoTime = System.nanoTime();
            d.class.wait(h);
            if (j.f != null || System.nanoTime() - jNanoTime < i) {
                return null;
            }
            return j;
        }
        long jNanoTime2 = dVar.f18820g - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j6 = jNanoTime2 / 1000000;
            d.class.wait(j6, (int) (jNanoTime2 - (1000000 * j6)));
            return null;
        }
        j.f = dVar.f;
        dVar.f = null;
        return dVar;
    }

    public IOException h(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(numX49.tnTj78("bQub9"));
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final void i(boolean z4) throws IOException {
        if (l() && z4) {
            throw h(null);
        }
    }

    public final void k() {
        d dVar;
        if (this.e) {
            throw new IllegalStateException(numX49.tnTj78("bQubP"));
        }
        long j6 = this.c;
        boolean z4 = this.f18843a;
        if (j6 != 0 || z4) {
            this.e = true;
            synchronized (d.class) {
                try {
                    if (j == null) {
                        j = new d();
                        Nh.m mVar = new Nh.m("Okio Watchdog");
                        mVar.setDaemon(true);
                        mVar.start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (j6 != 0 && z4) {
                        this.f18820g = Math.min(j6, e() - jNanoTime) + jNanoTime;
                    } else if (j6 != 0) {
                        this.f18820g = j6 + jNanoTime;
                    } else {
                        if (!z4) {
                            throw new AssertionError();
                        }
                        this.f18820g = e();
                    }
                    long j7 = this.f18820g - jNanoTime;
                    d dVar2 = j;
                    while (true) {
                        dVar = dVar2.f;
                        if (dVar == null || j7 < dVar.f18820g - jNanoTime) {
                            break;
                        } else {
                            dVar2 = dVar;
                        }
                    }
                    this.f = dVar;
                    dVar2.f = this;
                    if (dVar2 == j) {
                        d.class.notify();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final boolean l() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        synchronized (d.class) {
            d dVar = j;
            while (dVar != null) {
                d dVar2 = dVar.f;
                if (dVar2 == this) {
                    dVar.f = this.f;
                    this.f = null;
                    return false;
                }
                dVar = dVar2;
            }
            return true;
        }
    }

    public void m() {
    }
}
