package We;

import dOYHB6.tiZVw8.numX49;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f6417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6418b;
    public long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6419d;
    public long e = -1;
    public boolean f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6420g;

    public r(InputStream inputStream) {
        this.f6420g = -1;
        this.f6417a = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, 4096);
        this.f6420g = 1024;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f6417a.available();
    }

    public final void b(long j) throws IOException {
        if (this.f6418b > this.f6419d || j < this.c) {
            throw new IOException(numX49.tnTj78("bkRPT"));
        }
        this.f6417a.reset();
        f(this.c, j);
        this.f6418b = j;
    }

    public final void c(long j) {
        try {
            long j6 = this.c;
            long j7 = this.f6418b;
            InputStream inputStream = this.f6417a;
            if (j6 >= j7 || j7 > this.f6419d) {
                this.c = j7;
                inputStream.mark((int) (j - j7));
            } else {
                inputStream.reset();
                inputStream.mark((int) (j - this.c));
                f(this.c, this.f6418b);
            }
            this.f6419d = j;
        } catch (IOException e) {
            throw new IllegalStateException(numX49.tnTj78("bkRPR") + e);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f6417a.close();
    }

    public final void f(long j, long j6) throws IOException {
        while (j < j6) {
            long jSkip = this.f6417a.skip(j6 - j);
            if (jSkip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j += jSkip;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        long j = this.f6418b + ((long) i);
        if (this.f6419d < j) {
            c(j);
        }
        this.e = this.f6418b;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f6417a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (!this.f) {
            long j = this.f6418b + 1;
            long j6 = this.f6419d;
            if (j > j6) {
                c(j6 + ((long) this.f6420g));
            }
        }
        int i = this.f6417a.read();
        if (i != -1) {
            this.f6418b++;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        b(this.e);
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        if (!this.f) {
            long j6 = this.f6418b + j;
            if (j6 > this.f6419d) {
                c(j6 + ((long) this.f6420g));
            }
        }
        long jSkip = this.f6417a.skip(j);
        this.f6418b += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        if (!this.f) {
            long j = this.f6418b;
            if (((long) bArr.length) + j > this.f6419d) {
                c(j + ((long) bArr.length) + ((long) this.f6420g));
            }
        }
        int i = this.f6417a.read(bArr);
        if (i != -1) {
            this.f6418b += (long) i;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        if (!this.f) {
            long j = this.f6418b + ((long) i4);
            if (j > this.f6419d) {
                c(j + ((long) this.f6420g));
            }
        }
        int i6 = this.f6417a.read(bArr, i, i4);
        if (i6 != -1) {
            this.f6418b += (long) i6;
        }
        return i6;
    }
}
