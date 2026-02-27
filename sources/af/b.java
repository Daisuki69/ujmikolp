package Af;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class b extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f267b = 0;

    public b(e eVar) {
        this.f266a = eVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long j = this.f267b;
        e eVar = this.f266a;
        eVar.g(j);
        long position = eVar.c - eVar.getPosition();
        if (position > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) position;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i;
        long j = this.f267b;
        e eVar = this.f266a;
        eVar.g(j);
        if (eVar.v()) {
            return -1;
        }
        eVar.c();
        if (eVar.e + ((long) eVar.f276g) >= eVar.c) {
            i = -1;
        } else {
            if (!eVar.f(false)) {
                throw new IOException("Unexpectedly no bytes available for read in buffer.");
            }
            byte[] bArr = eVar.f;
            int i4 = eVar.f276g;
            eVar.f276g = i4 + 1;
            i = bArr[i4] & 255;
        }
        if (i != -1) {
            this.f267b++;
            return i;
        }
        Log.e("PdfBox-Android", "read() returns -1, assumed position: " + this.f267b + ", actual position: " + eVar.getPosition());
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long j6 = this.f267b;
        e eVar = this.f266a;
        eVar.g(j6);
        eVar.g(this.f267b + j);
        this.f267b += j;
        return j;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        int i6;
        long j = this.f267b;
        e eVar = this.f266a;
        eVar.g(j);
        if (eVar.v()) {
            return -1;
        }
        eVar.c();
        long j6 = eVar.e + ((long) eVar.f276g);
        long j7 = eVar.c;
        if (j6 >= j7) {
            i6 = -1;
        } else {
            int iMin = (int) Math.min(i4, j7 - j6);
            int i10 = i;
            int i11 = 0;
            while (iMin > 0) {
                if (eVar.f(false)) {
                    int iMin2 = Math.min(iMin, eVar.f273a - eVar.f276g);
                    System.arraycopy(eVar.f, eVar.f276g, bArr, i10, iMin2);
                    eVar.f276g += iMin2;
                    i11 += iMin2;
                    i10 += iMin2;
                    iMin -= iMin2;
                } else {
                    throw new IOException("Unexpectedly no bytes available for read in buffer.");
                }
            }
            i6 = i11;
        }
        if (i6 != -1) {
            this.f267b += (long) i6;
            return i6;
        }
        Log.e("PdfBox-Android", "read() returns -1, assumed position: " + this.f267b + ", actual position: " + eVar.getPosition());
        return i6;
    }
}
