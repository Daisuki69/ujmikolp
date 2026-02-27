package Bf;

import java.io.EOFException;
import java.io.IOException;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements i, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PushbackInputStream f435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f436b = 0;

    public c(yf.h hVar) {
        this.f435a = new PushbackInputStream(hVar, 32767);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f435a.close();
    }

    @Override // Bf.i
    public final void d(int i, byte[] bArr) throws IOException {
        this.f435a.unread(bArr, 0, i);
        this.f436b -= i;
    }

    @Override // Bf.i
    public final long getPosition() {
        return this.f436b;
    }

    @Override // Bf.i
    public final int peek() throws IOException {
        PushbackInputStream pushbackInputStream = this.f435a;
        int i = pushbackInputStream.read();
        if (i != -1) {
            pushbackInputStream.unread(i);
        }
        return i;
    }

    @Override // Bf.i
    public final int read() throws IOException {
        int i = this.f435a.read();
        this.f436b++;
        return i;
    }

    @Override // Bf.i
    public final byte[] u(int i) throws IOException {
        byte[] bArr = new byte[i];
        int i4 = 0;
        do {
            int i6 = this.f435a.read(bArr, i4, i - i4);
            if (i6 > 0) {
                this.f436b += i6;
            } else {
                i6 = -1;
            }
            if (i6 < 0) {
                throw new EOFException();
            }
            i4 += i6;
        } while (i4 < i);
        return bArr;
    }

    @Override // Bf.i
    public final void unread(int i) throws IOException {
        this.f435a.unread(i);
        this.f436b--;
    }

    @Override // Bf.i
    public final boolean v() {
        return peek() == -1;
    }

    @Override // Bf.i
    public final int read(byte[] bArr) throws IOException {
        int i = this.f435a.read(bArr);
        if (i <= 0) {
            return -1;
        }
        this.f436b += i;
        return i;
    }

    @Override // Bf.i
    public final void unread(byte[] bArr) throws IOException {
        this.f435a.unread(bArr);
        this.f436b -= bArr.length;
    }
}
