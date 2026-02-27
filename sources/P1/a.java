package P1;

import java.io.OutputStream;
import qk.i;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i4) {
        bArr.getClass();
        i.o(i, i4 + i, bArr.length);
    }
}
