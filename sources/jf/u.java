package jf;

import We.E;
import d4.AbstractC1331a;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f17802g = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final of.m f17803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17804b;
    public final of.e c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17805d;
    public boolean e;
    public final E f;

    public u(of.m mVar, boolean z4) {
        this.f17803a = mVar;
        this.f17804b = z4;
        of.e eVar = new of.e();
        this.c = eVar;
        E e = new E();
        e.f6350a = Integer.MAX_VALUE;
        e.h = new a[8];
        e.f6352d = 7;
        e.e = 0;
        e.f = 0;
        e.c = 4096;
        e.f6353g = eVar;
        this.f = e;
        this.f17805d = 16384;
    }

    public final synchronized void b(int i, int i4) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (AbstractC1331a.g(i4) == -1) {
            throw new IllegalArgumentException();
        }
        c(i, 4, (byte) 3, (byte) 0);
        this.f17803a.c(AbstractC1331a.g(i4));
        this.f17803a.flush();
    }

    public final void c(int i, int i4, byte b8, byte b10) {
        Level level = Level.FINE;
        Logger logger = f17802g;
        if (logger.isLoggable(level)) {
            logger.fine(d.a(false, i, i4, b8, b10));
        }
        int i6 = this.f17805d;
        if (i4 > i6) {
            d.b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i6), Integer.valueOf(i4));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            d.b("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
        of.m mVar = this.f17803a;
        mVar.f((i4 >>> 16) & 255);
        mVar.f((i4 >>> 8) & 255);
        mVar.f(i4 & 255);
        mVar.f(b8 & 255);
        mVar.f(b10 & 255);
        mVar.c(i & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.f17803a.close();
    }

    public final synchronized void f(int i, int i4, boolean z4) {
        if (this.e) {
            throw new IOException("closed");
        }
        c(0, 8, (byte) 6, z4 ? (byte) 1 : (byte) 0);
        this.f17803a.c(i);
        this.f17803a.c(i4);
        this.f17803a.flush();
    }

    public final synchronized void g(int i, int i4, byte[] bArr) {
        try {
            if (this.e) {
                throw new IOException("closed");
            }
            if (AbstractC1331a.g(i4) == -1) {
                d.b("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
            c(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f17803a.c(i);
            this.f17803a.c(AbstractC1331a.g(i4));
            if (bArr.length > 0) {
                this.f17803a.b(bArr);
            }
            this.f17803a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void i(int i, long j) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            d.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
        c(i, 4, (byte) 8, (byte) 0);
        this.f17803a.c((int) j);
        this.f17803a.flush();
    }

    public final synchronized void k(Ri.a aVar) {
        try {
            if (this.e) {
                throw new IOException("closed");
            }
            int i = this.f17805d;
            int i4 = aVar.f5558b;
            if ((i4 & 32) != 0) {
                i = ((int[]) aVar.c)[5];
            }
            this.f17805d = i;
            int i6 = i4 & 2;
            if ((i6 != 0 ? ((int[]) aVar.c)[1] : -1) != -1) {
                E e = this.f;
                int iMin = Math.min(i6 != 0 ? ((int[]) aVar.c)[1] : -1, 16384);
                int i10 = e.c;
                if (i10 != iMin) {
                    if (iMin < i10) {
                        e.f6350a = Math.min(e.f6350a, iMin);
                    }
                    e.f6351b = true;
                    e.c = iMin;
                    int i11 = e.f;
                    if (iMin < i11) {
                        if (iMin == 0) {
                            Arrays.fill((a[]) e.h, (Object) null);
                            e.f6352d = ((a[]) e.h).length - 1;
                            e.e = 0;
                            e.f = 0;
                        } else {
                            e.a(i11 - iMin);
                        }
                    }
                }
            }
            c(0, 0, (byte) 4, (byte) 1);
            this.f17803a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void m(ArrayList arrayList, int i, boolean z4) {
        if (this.e) {
            throw new IOException("closed");
        }
        this.f.c(arrayList);
        long j = this.c.f18822b;
        int iMin = (int) Math.min(this.f17805d, j);
        long j6 = iMin;
        byte b8 = j == j6 ? (byte) 4 : (byte) 0;
        if (z4) {
            b8 = (byte) (b8 | 1);
        }
        c(i, iMin, (byte) 1, b8);
        this.f17803a.s(j6, this.c);
        if (j > j6) {
            long j7 = j - j6;
            while (j7 > 0) {
                int iMin2 = (int) Math.min(this.f17805d, j7);
                long j9 = iMin2;
                j7 -= j9;
                c(i, iMin2, (byte) 9, j7 == 0 ? (byte) 4 : (byte) 0);
                this.f17803a.s(j9, this.c);
            }
        }
    }

    public final synchronized void q(boolean z4, int i, of.e eVar, int i4) {
        if (this.e) {
            throw new IOException("closed");
        }
        c(i, i4, (byte) 0, z4 ? (byte) 1 : (byte) 0);
        if (i4 > 0) {
            this.f17803a.s(i4, eVar);
        }
    }
}
