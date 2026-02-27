package of;

import dOYHB6.tiZVw8.numX49;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends u {
    public u e;

    public h(u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bQuPs"));
        }
        this.e = uVar;
    }

    @Override // of.u
    public final u a() {
        return this.e.a();
    }

    @Override // of.u
    public final u b(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return this.e.b(j);
    }

    @Override // of.u
    public final u c(long j) {
        return this.e.c(j);
    }

    @Override // of.u
    public final u d() {
        return this.e.d();
    }

    @Override // of.u
    public final long e() {
        return this.e.e();
    }

    @Override // of.u
    public final boolean f() {
        return this.e.f();
    }

    @Override // of.u
    public final void g() throws InterruptedIOException {
        this.e.g();
    }
}
