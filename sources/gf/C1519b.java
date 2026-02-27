package gf;

import java.io.IOException;
import java.net.ProtocolException;
import of.r;
import of.u;

/* JADX INFO: renamed from: gf.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1519b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f16803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16804b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16805d;
    public boolean e;
    public final /* synthetic */ com.google.firebase.messaging.r f;

    public C1519b(com.google.firebase.messaging.r rVar, r rVar2, long j) {
        this.f = rVar;
        if (rVar2 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f16803a = rVar2;
        this.c = j;
    }

    public final IOException b(IOException iOException) {
        if (this.f16804b) {
            return iOException;
        }
        this.f16804b = true;
        return this.f.e(false, true, iOException);
    }

    @Override // of.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.e) {
            return;
        }
        this.e = true;
        long j = this.c;
        if (j != -1 && this.f16805d != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            this.f16803a.close();
            b(null);
        } catch (IOException e) {
            throw b(e);
        }
    }

    @Override // of.r, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.f16803a.flush();
        } catch (IOException e) {
            throw b(e);
        }
    }

    @Override // of.r
    public final void s(long j, of.e eVar) throws IOException {
        if (this.e) {
            throw new IllegalStateException("closed");
        }
        long j6 = this.c;
        if (j6 != -1 && this.f16805d + j > j6) {
            StringBuilder sbS = androidx.camera.core.impl.a.s(j6, "expected ", " bytes but received ");
            sbS.append(this.f16805d + j);
            throw new ProtocolException(sbS.toString());
        }
        try {
            this.f16803a.s(j, eVar);
            this.f16805d += j;
        } catch (IOException e) {
            throw b(e);
        }
    }

    @Override // of.r
    public final u timeout() {
        return this.f16803a.timeout();
    }

    public final String toString() {
        return C1519b.class.getSimpleName() + "(" + this.f16803a.toString() + ")";
    }
}
