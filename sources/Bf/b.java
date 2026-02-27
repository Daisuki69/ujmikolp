package Bf;

import java.io.BufferedOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends BufferedOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f433b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f434d;

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final synchronized void flush() {
        try {
            if (this.f432a && !this.f433b) {
                write(13);
                this.c++;
            }
            this.f432a = false;
            this.f433b = false;
            super.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i4) {
        try {
            if (this.c == 0 && i4 > 10) {
                this.f434d = false;
                for (int i6 = 0; i6 < 10; i6++) {
                    byte b8 = bArr[i6];
                    if (b8 >= 9 && (b8 <= 10 || b8 >= 32 || b8 == 13)) {
                    }
                    this.f434d = true;
                    break;
                }
            }
            if (this.f434d) {
                if (this.f432a) {
                    this.f432a = false;
                    if (!this.f433b && i4 == 1 && bArr[i] == 10) {
                        return;
                    } else {
                        write(13);
                    }
                }
                if (this.f433b) {
                    write(10);
                    this.f433b = false;
                }
                if (i4 > 0) {
                    byte b10 = bArr[(i + i4) - 1];
                    if (b10 == 13) {
                        this.f432a = true;
                        i4--;
                    } else if (b10 == 10) {
                        this.f433b = true;
                        int i10 = i4 - 1;
                        if (i10 <= 0 || bArr[(i + i10) - 1] != 13) {
                            i4 = i10;
                        } else {
                            this.f432a = true;
                            i4 -= 2;
                        }
                    }
                }
            }
            super.write(bArr, i, i4);
            this.c += i4;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
