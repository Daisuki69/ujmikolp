package x2;

import java.io.OutputStream;

/* JADX INFO: renamed from: x2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2455b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f20881a;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f20881a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f20881a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i4) {
        int i6;
        if (i >= 0 && i <= bArr.length && i4 >= 0 && (i6 = i + i4) <= bArr.length && i6 >= 0) {
            this.f20881a += (long) i4;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
