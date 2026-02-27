package P2;

import U2.p;
import U2.r;
import com.google.firebase.perf.util.Timer;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f4980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N2.d f4981b;
    public final Timer c;
    public long e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4982d = -1;
    public long f = -1;

    public a(InputStream inputStream, N2.d dVar, Timer timer) {
        this.c = timer;
        this.f4980a = inputStream;
        this.f4981b = dVar;
        this.e = ((r) dVar.f3518d.f10116b).O();
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.f4980a.available();
        } catch (IOException e) {
            long jA = this.c.a();
            N2.d dVar = this.f4981b;
            dVar.i(jA);
            h.c(dVar);
            throw e;
        }
    }

    public final void b(long j) {
        long j6 = this.f4982d;
        if (j6 == -1) {
            this.f4982d = j;
        } else {
            this.f4982d = j6 + j;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        N2.d dVar = this.f4981b;
        Timer timer = this.c;
        long jA = timer.a();
        if (this.f == -1) {
            this.f = jA;
        }
        try {
            this.f4980a.close();
            long j = this.f4982d;
            if (j != -1) {
                dVar.h(j);
            }
            long j6 = this.e;
            if (j6 != -1) {
                p pVar = dVar.f3518d;
                pVar.i();
                r.z((r) pVar.f10116b, j6);
            }
            dVar.i(this.f);
            dVar.b();
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f4980a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f4980a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        Timer timer = this.c;
        N2.d dVar = this.f4981b;
        try {
            int i = this.f4980a.read();
            long jA = timer.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (i != -1 || this.f != -1) {
                b(1L);
                dVar.h(this.f4982d);
                return i;
            }
            this.f = jA;
            dVar.i(jA);
            dVar.b();
            return i;
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.f4980a.reset();
        } catch (IOException e) {
            long jA = this.c.a();
            N2.d dVar = this.f4981b;
            dVar.i(jA);
            h.c(dVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        Timer timer = this.c;
        N2.d dVar = this.f4981b;
        try {
            long jSkip = this.f4980a.skip(j);
            long jA = timer.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (jSkip == 0 && j != 0 && this.f == -1) {
                this.f = jA;
                dVar.i(jA);
                return jSkip;
            }
            b(jSkip);
            dVar.h(this.f4982d);
            return jSkip;
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        Timer timer = this.c;
        N2.d dVar = this.f4981b;
        try {
            int i6 = this.f4980a.read(bArr, i, i4);
            long jA = timer.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (i6 == -1 && this.f == -1) {
                this.f = jA;
                dVar.i(jA);
                dVar.b();
                return i6;
            }
            b(i6);
            dVar.h(this.f4982d);
            return i6;
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        Timer timer = this.c;
        N2.d dVar = this.f4981b;
        try {
            int i = this.f4980a.read(bArr);
            long jA = timer.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (i == -1 && this.f == -1) {
                this.f = jA;
                dVar.i(jA);
                dVar.b();
                return i;
            }
            b(i);
            dVar.h(this.f4982d);
            return i;
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }
}
