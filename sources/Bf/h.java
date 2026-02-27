package Bf;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements i, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Af.a f462a;

    public h(Af.a aVar) {
        this.f462a = aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f462a.close();
    }

    @Override // Bf.i
    public final void d(int i, byte[] bArr) throws IOException {
        this.f462a.f(i);
    }

    @Override // Bf.i
    public final long getPosition() throws IOException {
        Af.a aVar = this.f462a;
        aVar.b();
        return aVar.f264d;
    }

    @Override // Bf.i
    public final int peek() {
        return this.f462a.peek();
    }

    @Override // Bf.i
    public final int read() {
        return this.f462a.read();
    }

    @Override // Bf.i
    public final byte[] u(int i) throws IOException {
        Af.a aVar = this.f462a;
        byte[] bArr = new byte[i];
        int i4 = 0;
        do {
            int i6 = aVar.read(bArr, i4, i - i4);
            if (i6 < 0) {
                throw new EOFException();
            }
            i4 += i6;
        } while (i4 < i);
        return bArr;
    }

    @Override // Bf.i
    public final void unread(int i) throws IOException {
        this.f462a.f(1);
    }

    @Override // Bf.i
    public final boolean v() {
        return this.f462a.v();
    }

    @Override // Bf.i
    public final int read(byte[] bArr) {
        return this.f462a.read(bArr, 0, bArr.length);
    }

    @Override // Bf.i
    public final void unread(byte[] bArr) throws IOException {
        this.f462a.f(bArr.length);
    }
}
