package Af;

import We.s;
import androidx.media3.extractor.AacUtil;
import java.io.Closeable;
import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f269a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f270b = 0;
    public final BitSet c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile byte[][] f271d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f272g;
    public volatile boolean h;

    public d(U1.b bVar) {
        BitSet bitSet = new BitSet();
        this.c = bitSet;
        this.h = false;
        boolean z4 = bVar.f5895b;
        this.f272g = !z4;
        this.f = Integer.MAX_VALUE;
        int i = z4 ? Integer.MAX_VALUE : 0;
        this.e = i;
        this.f271d = new byte[z4 ? AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND : i][];
        bitSet.set(0, this.f271d.length);
    }

    public final void b() throws IOException {
        if (this.h) {
            throw new IOException("Scratch file already closed");
        }
    }

    public final void c() {
        synchronized (this.f269a) {
            try {
                b();
                if (this.f270b >= this.f) {
                    return;
                }
                if (!this.f272g) {
                    int length = this.f271d.length;
                    int iMin = (int) Math.min(((long) length) * 2, 2147483647L);
                    if (iMin > length) {
                        byte[][] bArr = new byte[iMin][];
                        System.arraycopy(this.f271d, 0, bArr, 0, length);
                        this.f271d = bArr;
                        this.c.set(length, iMin);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f269a) {
            try {
                if (this.h) {
                    return;
                }
                this.h = true;
                synchronized (this.c) {
                    this.c.clear();
                    this.f270b = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final byte[] f(int i) throws IOException {
        if (i < 0 || i >= this.f270b) {
            b();
            throw new IOException(androidx.camera.core.impl.a.l(s.t(i, "Page index out of range: ", ". Max value: "), this.f270b, 1));
        }
        if (i < this.e) {
            byte[] bArr = this.f271d[i];
            if (bArr != null) {
                return bArr;
            }
            b();
            throw new IOException(s.g(i, "Requested page with index ", " was not written before."));
        }
        synchronized (this.f269a) {
            b();
            throw new IOException("Missing scratch file to read page with index " + i + " from.");
        }
    }

    public final void g(int i, byte[] bArr) throws IOException {
        if (i < 0 || i >= this.f270b) {
            b();
            throw new IOException(androidx.camera.core.impl.a.l(s.t(i, "Page index out of range: ", ". Max value: "), this.f270b, 1));
        }
        if (bArr.length != 4096) {
            throw new IOException(s.o(new StringBuilder("Wrong page size to write: "), ". Expected: 4096", bArr.length));
        }
        if (i >= this.e) {
            synchronized (this.f269a) {
                b();
                throw null;
            }
        }
        if (this.f272g) {
            this.f271d[i] = bArr;
        } else {
            synchronized (this.f269a) {
                this.f271d[i] = bArr;
            }
        }
        b();
    }
}
