package gf;

import com.google.firebase.messaging.r;
import java.io.IOException;
import java.net.ProtocolException;
import of.s;
import of.u;

/* JADX INFO: renamed from: gf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1520c implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f16806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16807b;
    public long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16808d;
    public boolean e;
    public final /* synthetic */ r f;

    public C1520c(r rVar, s sVar, long j) {
        this.f = rVar;
        if (sVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f16806a = sVar;
        this.f16807b = j;
        if (j == 0) {
            b(null);
        }
    }

    @Override // of.s
    public final long a(long j, of.e eVar) throws IOException {
        if (this.e) {
            throw new IllegalStateException("closed");
        }
        try {
            long jA = this.f16806a.a(8192L, eVar);
            if (jA == -1) {
                b(null);
                return -1L;
            }
            long j6 = this.c + jA;
            long j7 = this.f16807b;
            if (j7 == -1 || j6 <= j7) {
                this.c = j6;
                if (j6 == j7) {
                    b(null);
                }
                return jA;
            }
            throw new ProtocolException("expected " + j7 + " bytes but received " + j6);
        } catch (IOException e) {
            throw b(e);
        }
    }

    public final IOException b(IOException iOException) {
        if (this.f16808d) {
            return iOException;
        }
        this.f16808d = true;
        return this.f.e(true, false, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.e) {
            return;
        }
        this.e = true;
        try {
            this.f16806a.close();
            b(null);
        } catch (IOException e) {
            throw b(e);
        }
    }

    @Override // of.s
    public final u timeout() {
        return this.f16806a.timeout();
    }

    public final String toString() {
        return C1520c.class.getSimpleName() + "(" + this.f16806a.toString() + ")";
    }
}
