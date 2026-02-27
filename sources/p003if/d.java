package p003if;

import dOYHB6.tiZVw8.numX49;
import ef.c;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import of.e;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AbstractC1601a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17139d;
    public final /* synthetic */ g e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, long j) {
        super(gVar);
        this.e = gVar;
        this.f17139d = j;
        if (j == 0) {
            b();
        }
    }

    @Override // p003if.AbstractC1601a, of.s
    public final long a(long j, e eVar) throws IOException {
        if (this.f17134b) {
            throw new IllegalStateException(numX49.tnTj78("bShr"));
        }
        long j6 = this.f17139d;
        if (j6 == 0) {
            return -1L;
        }
        long jA = super.a(Math.min(j6, 8192L), eVar);
        if (jA == -1) {
            this.e.f17144b.k();
            ProtocolException protocolException = new ProtocolException(numX49.tnTj78("bShL"));
            b();
            throw protocolException;
        }
        long j7 = this.f17139d - jA;
        this.f17139d = j7;
        if (j7 == 0) {
            b();
        }
        return jA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zO;
        if (this.f17134b) {
            return;
        }
        if (this.f17139d != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zO = c.o(this, 100);
            } catch (IOException unused) {
                zO = false;
            }
            if (!zO) {
                this.e.f17144b.k();
                b();
            }
        }
        this.f17134b = true;
    }
}
