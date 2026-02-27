package zf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: zf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2565a extends FilterInputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21392b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f21393d;
    public byte[] e;

    public C2565a(InputStream inputStream) {
        super(inputStream);
        this.f21391a = 0;
        this.f21392b = 0;
        this.c = false;
        this.f21393d = new byte[5];
        this.e = new byte[4];
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f21393d = null;
        this.c = true;
        this.e = null;
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        r13 = r14.f21393d;
        r13[r2] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r12 != 126) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
    
        r13[r2] = 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        r4 = r2 - 1;
        r14.f21392b = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        if (r4 != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
    
        r14.c = true;
        r14.f21393d = null;
        r14.e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
    
        if (r2 >= 5) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
    
        if (r2 >= 5) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        r14.f21393d[r2] = 117;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        r14.c = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0090, code lost:
    
        r1 = 0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0093, code lost:
    
        if (r4 >= 5) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0095, code lost:
    
        r5 = (byte) (r14.f21393d[r4] - 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009c, code lost:
    
        if (r5 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a0, code lost:
    
        if (r5 > 93) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a2, code lost:
    
        r1 = (r1 * 85) + ((long) r5);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00aa, code lost:
    
        r14.f21392b = 0;
        r14.c = true;
        r14.f21393d = null;
        r14.e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b9, code lost:
    
        throw new java.io.IOException("Invalid data in Ascii85 stream");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
    
        if (r10 < 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        r14.e[r10] = (byte) (255 & r1);
        r1 = r1 >>> 8;
        r10 = r10 - 1;
     */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.C2565a.read():int");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        throw new IOException("Reset is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        return 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        if (this.c && this.f21391a >= this.f21392b) {
            return -1;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            int i10 = this.f21391a;
            if (i10 < this.f21392b) {
                byte[] bArr2 = this.e;
                this.f21391a = i10 + 1;
                bArr[i6 + i] = bArr2[i10];
            } else {
                int i11 = read();
                if (i11 == -1) {
                    return i6;
                }
                bArr[i6 + i] = (byte) i11;
            }
        }
        return i4;
    }
}
