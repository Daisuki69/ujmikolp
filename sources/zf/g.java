package zf;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21421b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21422d;
    public final int e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f21423g;
    public byte[] h;
    public int i;
    public boolean j;

    public g(OutputStream outputStream, int i, int i4, int i6, int i10) {
        super(outputStream);
        this.i = 0;
        this.j = false;
        this.f21420a = i;
        this.f21421b = i4;
        this.c = i6;
        this.f21422d = i10;
        int i11 = (((i4 * i6) * i10) + 7) / 8;
        this.e = i11;
        this.f = i >= 10;
        this.f21423g = new byte[i11];
        this.h = new byte[i11];
    }

    public final void b() throws IOException {
        int i = this.f21420a;
        byte[] bArr = this.f21423g;
        byte[] bArr2 = this.h;
        if (i != 1) {
            int i4 = this.f21421b;
            int i6 = this.c;
            int i10 = ((i4 * i6) + 7) / 8;
            int length = bArr.length;
            if (i != 2) {
                switch (i) {
                    case 11:
                        for (int i11 = i10; i11 < length; i11++) {
                            bArr[i11] = (byte) (bArr[i11] + bArr[i11 - i10]);
                        }
                        break;
                    case 12:
                        for (int i12 = 0; i12 < length; i12++) {
                            bArr[i12] = (byte) (((bArr[i12] & 255) + (bArr2[i12] & 255)) & 255);
                        }
                        break;
                    case 13:
                        for (int i13 = 0; i13 < length; i13++) {
                            int i14 = i13 - i10;
                            bArr[i13] = (byte) (((((i14 >= 0 ? bArr[i14] & 255 : 0) + (bArr2[i13] & 255)) / 2) + (bArr[i13] & 255)) & 255);
                        }
                        break;
                    case 14:
                        for (int i15 = 0; i15 < length; i15++) {
                            int i16 = bArr[i15] & 255;
                            int i17 = i15 - i10;
                            int i18 = i17 >= 0 ? bArr[i17] & 255 : 0;
                            int i19 = bArr2[i15] & 255;
                            int i20 = i17 >= 0 ? bArr2[i17] & 255 : 0;
                            int i21 = (i18 + i19) - i20;
                            int iAbs = Math.abs(i21 - i18);
                            int iAbs2 = Math.abs(i21 - i19);
                            int iAbs3 = Math.abs(i21 - i20);
                            if (iAbs <= iAbs2 && iAbs <= iAbs3) {
                                bArr[i15] = (byte) ((i16 + i18) & 255);
                            } else if (iAbs2 <= iAbs3) {
                                bArr[i15] = (byte) ((i16 + i19) & 255);
                            } else {
                                bArr[i15] = (byte) ((i16 + i20) & 255);
                            }
                        }
                        break;
                }
            } else if (i6 == 8) {
                for (int i22 = i10; i22 < length; i22++) {
                    bArr[i22] = (byte) ((bArr[i22] & 255) + (bArr[i22 - i10] & 255));
                }
            } else if (i6 == 16) {
                for (int i23 = i10; i23 < length - 1; i23 += 2) {
                    int i24 = i23 + 1;
                    int i25 = i23 - i10;
                    int i26 = ((bArr[i25] & 255) << 8) + (bArr[i25 + 1] & 255) + ((bArr[i23] & 255) << 8) + (bArr[i24] & 255);
                    bArr[i23] = (byte) ((i26 >> 8) & 255);
                    bArr[i24] = (byte) (i26 & 255);
                }
            } else if (i6 == 1 && i4 == 1) {
                for (int i27 = 0; i27 < length; i27++) {
                    int i28 = 7;
                    while (i28 >= 0) {
                        int i29 = bArr[i27];
                        int i30 = (i29 >> i28) & 1;
                        if (i27 != 0 || i28 != 7) {
                            if (((i30 + ((i28 == 7 ? bArr[i27 - 1] : i29 >> (i28 + 1)) & 1)) & 1) == 0) {
                                bArr[i27] = (byte) (i29 & (~(1 << i28)));
                            } else {
                                bArr[i27] = (byte) (i29 | (1 << i28));
                            }
                        }
                        i28--;
                    }
                }
            } else {
                int i31 = this.f21422d * i4;
                for (int i32 = i4; i32 < i31; i32++) {
                    int i33 = i32 * i6;
                    int i34 = i33 / 8;
                    int i35 = (8 - (i33 % 8)) - i6;
                    int i36 = (i32 - i4) * i6;
                    int i37 = bArr[i34];
                    int i38 = (1 << i6) - 1;
                    bArr[i34] = (byte) ((((((i37 >>> i35) & i38) + ((bArr[i36 / 8] >>> ((8 - (i36 % 8)) - i6)) & i38)) & i38) << i35) | ((~(i38 << i35)) & i37));
                }
            }
        }
        ((FilterOutputStream) this).out.write(this.f21423g);
        byte[] bArr3 = this.h;
        this.h = this.f21423g;
        this.f21423g = bArr3;
        this.i = 0;
        this.j = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.i;
        if (i > 0) {
            Arrays.fill(this.f21423g, i, this.e, (byte) 0);
            b();
        }
        super.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i4) throws IOException {
        int i6 = i4 + i;
        while (i < i6) {
            if (this.f && this.i == 0 && !this.j) {
                this.f21420a = bArr[i] + 10;
                i++;
                this.j = true;
            } else {
                int iMin = Math.min(this.e - this.i, i6 - i);
                System.arraycopy(bArr, i, this.f21423g, this.i, iMin);
                int i10 = this.i + iMin;
                this.i = i10;
                i += iMin;
                if (i10 == this.f21423g.length) {
                    b();
                }
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        throw new UnsupportedOperationException("Not supported");
    }
}
