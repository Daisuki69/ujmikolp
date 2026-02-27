package of;

import dOYHB6.tiZVw8.numX49;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f18842d = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18844b;
    public long c;

    public u a() {
        this.f18843a = false;
        return this;
    }

    public u b(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j, numX49.tnTj78("bQub")));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bQuP"));
        }
        this.c = timeUnit.toNanos(j);
        return this;
    }

    public u c(long j) {
        this.f18843a = true;
        this.f18844b = j;
        return this;
    }

    public u d() {
        this.c = 0L;
        return this;
    }

    public long e() {
        if (this.f18843a) {
            return this.f18844b;
        }
        throw new IllegalStateException(numX49.tnTj78("bQu2"));
    }

    public boolean f() {
        return this.f18843a;
    }

    public void g() throws InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException(numX49.tnTj78("bQur"));
        }
        if (this.f18843a && this.f18844b - System.nanoTime() <= 0) {
            throw new InterruptedIOException(numX49.tnTj78("bQuL"));
        }
    }
}
