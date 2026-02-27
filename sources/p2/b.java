package P2;

import U2.p;
import U2.r;
import com.google.firebase.perf.util.Timer;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends OutputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f4983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Timer f4984b;
    public final N2.d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4985d = -1;

    public b(OutputStream outputStream, N2.d dVar, Timer timer) {
        this.f4983a = outputStream;
        this.c = dVar;
        this.f4984b = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j = this.f4985d;
        N2.d dVar = this.c;
        if (j != -1) {
            dVar.e(j);
        }
        Timer timer = this.f4984b;
        long jA = timer.a();
        p pVar = dVar.f3518d;
        pVar.i();
        r.y((r) pVar.f10116b, jA);
        try {
            this.f4983a.close();
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.f4983a.flush();
        } catch (IOException e) {
            long jA = this.f4984b.a();
            N2.d dVar = this.c;
            dVar.i(jA);
            h.c(dVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        N2.d dVar = this.c;
        try {
            this.f4983a.write(i);
            long j = this.f4985d + 1;
            this.f4985d = j;
            dVar.e(j);
        } catch (IOException e) {
            AbstractC1414e.l(this.f4984b, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        N2.d dVar = this.c;
        try {
            this.f4983a.write(bArr);
            long length = this.f4985d + ((long) bArr.length);
            this.f4985d = length;
            dVar.e(length);
        } catch (IOException e) {
            AbstractC1414e.l(this.f4984b, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i4) throws IOException {
        N2.d dVar = this.c;
        try {
            this.f4983a.write(bArr, i, i4);
            long j = this.f4985d + ((long) i4);
            this.f4985d = j;
            dVar.e(j);
        } catch (IOException e) {
            AbstractC1414e.l(this.f4984b, dVar, dVar);
            throw e;
        }
    }
}
