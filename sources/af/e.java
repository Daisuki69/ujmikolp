package Af;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f274b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f275d;
    public long e;
    public byte[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f276g;
    public long c = 0;
    public boolean h = false;
    public int[] i = new int[16];
    public int j = 0;

    public e(d dVar) throws IOException {
        dVar.b();
        this.f274b = dVar;
        this.f273a = 4096;
        b();
    }

    public final void b() throws IOException {
        int iNextSetBit;
        int i = this.j;
        int i4 = i + 1;
        int[] iArr = this.i;
        if (i4 >= iArr.length) {
            int length = iArr.length * 2;
            if (length < iArr.length) {
                if (iArr.length == Integer.MAX_VALUE) {
                    throw new IOException("Maximum buffer size reached.");
                }
                length = Integer.MAX_VALUE;
            }
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.i = iArr2;
        }
        d dVar = this.f274b;
        synchronized (dVar.c) {
            try {
                iNextSetBit = dVar.c.nextSetBit(0);
                if (iNextSetBit < 0) {
                    dVar.c();
                    iNextSetBit = dVar.c.nextSetBit(0);
                    if (iNextSetBit < 0) {
                        throw new IOException("Maximum allowed scratch file memory exceeded.");
                    }
                }
                dVar.c.clear(iNextSetBit);
                if (iNextSetBit >= dVar.f270b) {
                    dVar.f270b = iNextSetBit + 1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int[] iArr3 = this.i;
        int i6 = this.j;
        iArr3[i6] = iNextSetBit;
        this.f275d = i6;
        int i10 = this.f273a;
        this.e = ((long) i6) * ((long) i10);
        this.j = i6 + 1;
        this.f = new byte[i10];
        this.f276g = 0;
    }

    public final void c() throws IOException {
        d dVar = this.f274b;
        if (dVar == null) {
            throw new IOException("Buffer already closed");
        }
        dVar.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d dVar = this.f274b;
        if (dVar != null) {
            int[] iArr = this.i;
            int i = this.j;
            synchronized (dVar.c) {
                for (int i4 = 0; i4 < i; i4++) {
                    try {
                        int i6 = iArr[i4];
                        if (i6 >= 0 && i6 < dVar.f270b && !dVar.c.get(i6)) {
                            dVar.c.set(i6);
                            if (i6 < dVar.e) {
                                dVar.f271d[i6] = null;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.f274b = null;
            this.i = null;
            this.f = null;
            this.e = 0L;
            this.f275d = -1;
            this.f276g = 0;
            this.c = 0L;
        }
    }

    public final boolean f(boolean z4) throws IOException {
        int i = this.f276g;
        int i4 = this.f273a;
        if (i < i4) {
            return true;
        }
        if (this.h) {
            this.f274b.g(this.i[this.f275d], this.f);
            this.h = false;
        }
        int i6 = this.f275d + 1;
        if (i6 >= this.j) {
            if (!z4) {
                return false;
            }
            b();
            return true;
        }
        d dVar = this.f274b;
        int[] iArr = this.i;
        this.f275d = i6;
        this.f = dVar.f(iArr[i6]);
        this.e = ((long) this.f275d) * ((long) i4);
        this.f276g = 0;
        return true;
    }

    public final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public final void g(long j) throws IOException {
        c();
        if (j > this.c) {
            throw new EOFException();
        }
        if (j < 0) {
            throw new IOException(androidx.camera.core.impl.a.f(j, "Negative seek offset: "));
        }
        long j6 = this.e;
        int i = this.f273a;
        if (j >= j6 && j <= ((long) i) + j6) {
            this.f276g = (int) (j - j6);
            return;
        }
        if (this.h) {
            this.f274b.g(this.i[this.f275d], this.f);
            this.h = false;
        }
        long j7 = i;
        int i4 = (int) (j / j7);
        if (j % j7 == 0 && j == this.c) {
            i4--;
        }
        this.f = this.f274b.f(this.i[i4]);
        this.f275d = i4;
        long j9 = ((long) i4) * j7;
        this.e = j9;
        this.f276g = (int) (j - j9);
    }

    public final long getPosition() throws IOException {
        c();
        return this.e + ((long) this.f276g);
    }

    public final void i(byte[] bArr, int i, int i4) throws IOException {
        c();
        while (i4 > 0) {
            f(true);
            int iMin = Math.min(i4, this.f273a - this.f276g);
            System.arraycopy(bArr, i, this.f, this.f276g, iMin);
            this.f276g += iMin;
            this.h = true;
            i += iMin;
            i4 -= iMin;
        }
        long j = this.e + ((long) this.f276g);
        if (j > this.c) {
            this.c = j;
        }
    }

    public final boolean v() throws IOException {
        c();
        return this.e + ((long) this.f276g) >= this.c;
    }
}
