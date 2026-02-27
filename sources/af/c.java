package Af;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f268a;

    public c(e eVar) {
        this.f268a = eVar;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i4) throws IOException {
        this.f268a.i(bArr, i, i4);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        e eVar = this.f268a;
        eVar.getClass();
        eVar.i(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        e eVar = this.f268a;
        eVar.c();
        eVar.f(true);
        byte[] bArr = eVar.f;
        int i4 = eVar.f276g;
        int i6 = i4 + 1;
        eVar.f276g = i6;
        bArr[i4] = (byte) i;
        eVar.h = true;
        long j = eVar.e + ((long) i6);
        if (j > eVar.c) {
            eVar.c = j;
        }
    }
}
