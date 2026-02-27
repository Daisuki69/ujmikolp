package p003if;

import dOYHB6.tiZVw8.numX49;
import java.io.IOException;
import of.e;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends AbstractC1601a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17142d;

    @Override // p003if.AbstractC1601a, of.s
    public final long a(long j, e eVar) throws IOException {
        if (this.f17134b) {
            throw new IllegalStateException(numX49.tnTj78("bShu"));
        }
        if (this.f17142d) {
            return -1L;
        }
        long jA = super.a(8192L, eVar);
        if (jA != -1) {
            return jA;
        }
        this.f17142d = true;
        b();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17134b) {
            return;
        }
        if (!this.f17142d) {
            b();
        }
        this.f17134b = true;
    }
}
