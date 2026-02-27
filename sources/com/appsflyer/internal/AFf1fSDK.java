package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1fSDK extends FilterInputStream implements AutoCloseable {
    private final int[] AFLogger;
    private int AFLogger$LogLevel;
    private int AFVersionDeclaration;
    private final byte[] afDebugLog;
    private final int afErrorLog;
    private final int[] afInfoLog;
    private final byte[][] afRDLog;
    private int afWarnLog;
    private final byte[] getLevel;
    private static final byte[] AFInAppEventType = AFf1iSDK.AFInAppEventParameterName;
    private static final int[] AFInAppEventParameterName = AFf1iSDK.values;
    private static final int[] values = AFf1iSDK.valueOf;
    private static final int[] AFKeystoreWrapper = AFf1iSDK.AFKeystoreWrapper;
    private static final int[] valueOf = AFf1iSDK.AFInAppEventType;

    public AFf1fSDK(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        super(inputStream);
        this.AFLogger = new int[4];
        this.afDebugLog = new byte[16];
        this.getLevel = new byte[16];
        this.AFLogger$LogLevel = Integer.MAX_VALUE;
        this.AFVersionDeclaration = 16;
        this.afWarnLog = 16;
        this.afErrorLog = i;
        this.afInfoLog = AFf1iSDK.values(bArr, i);
        this.afRDLog = AFKeystoreWrapper(bArr2);
    }

    private void AFInAppEventParameterName(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.AFLogger;
        char c = 1;
        char c10 = 2;
        char c11 = '\b';
        char c12 = 3;
        int i = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.afInfoLog;
        iArr[0] = i ^ iArr2[0];
        char c13 = 5;
        char c14 = 6;
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & 255) | (((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8))) ^ iArr2[2];
        char c15 = 14;
        iArr[3] = (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255)) ^ iArr2[3];
        int i4 = 1;
        int i6 = 4;
        while (i4 < this.afErrorLog) {
            int[] iArr3 = AFInAppEventParameterName;
            int[] iArr4 = this.AFLogger;
            char c16 = c;
            byte[][] bArr3 = this.afRDLog;
            byte[] bArr4 = bArr3[0];
            int i10 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = values;
            byte[] bArr5 = bArr3[c16];
            char c17 = c10;
            int i11 = i10 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = AFKeystoreWrapper;
            byte[] bArr6 = bArr3[c17];
            char c18 = c12;
            int i12 = i11 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = valueOf;
            byte[] bArr7 = bArr3[c18];
            char c19 = c11;
            int i13 = i12 ^ iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.afInfoLog;
            int i14 = i13 ^ iArr8[i6];
            char c20 = c15;
            char c21 = c13;
            int i15 = (((iArr3[iArr4[bArr4[c16]] >>> 24] ^ iArr5[(iArr4[bArr5[c16]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c16]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c16]] & 255]) ^ iArr8[i6 + 1];
            int i16 = (((iArr3[iArr4[bArr4[c17]] >>> 24] ^ iArr5[(iArr4[bArr5[c17]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c17]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c17]] & 255]) ^ iArr8[i6 + 2];
            int i17 = (((iArr3[iArr4[bArr4[c18]] >>> 24] ^ iArr5[(iArr4[bArr5[c18]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c18]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c18]] & 255]) ^ iArr8[i6 + 3];
            iArr4[0] = i14;
            iArr4[c16] = i15;
            iArr4[c17] = i16;
            iArr4[c18] = i17;
            i4++;
            i6 += 4;
            c = c16;
            c10 = c17;
            c12 = c18;
            c11 = c19;
            c13 = c21;
            c15 = c20;
            c14 = c14;
        }
        char c22 = c;
        char c23 = c10;
        char c24 = c12;
        char c25 = c11;
        char c26 = c15;
        int[] iArr9 = this.afInfoLog;
        int i18 = iArr9[i6];
        byte[] bArr8 = AFInAppEventType;
        int[] iArr10 = this.AFLogger;
        byte[][] bArr9 = this.afRDLog;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i18 >>> 24));
        byte[] bArr11 = bArr9[c22];
        bArr2[c22] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i18 >>> 16));
        byte[] bArr12 = bArr9[c23];
        bArr2[c23] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i18 >>> 8));
        byte[] bArr13 = bArr9[c24];
        bArr2[c24] = (byte) (i18 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i19 = iArr9[i6 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[c22]] >>> 24] ^ (i19 >>> 24));
        bArr2[c13] = (byte) (bArr8[(iArr10[bArr11[c22]] >>> 16) & 255] ^ (i19 >>> 16));
        bArr2[c14] = (byte) (bArr8[(iArr10[bArr12[c22]] >>> 8) & 255] ^ (i19 >>> 8));
        bArr2[7] = (byte) (i19 ^ bArr8[iArr10[bArr13[c22]] & 255]);
        int i20 = iArr9[i6 + 2];
        bArr2[c25] = (byte) (bArr8[iArr10[bArr10[c23]] >>> 24] ^ (i20 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[c23]] >>> 16) & 255] ^ (i20 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[c23]] >>> 8) & 255] ^ (i20 >>> 8));
        bArr2[11] = (byte) (i20 ^ bArr8[iArr10[bArr13[c23]] & 255]);
        int i21 = iArr9[i6 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[c24]] >>> 24] ^ (i21 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[c24]] >>> 16) & 255] ^ (i21 >>> 16));
        bArr2[c26] = (byte) (bArr8[(iArr10[bArr12[c24]] >>> 8) & 255] ^ (i21 >>> 8));
        bArr2[15] = (byte) (i21 ^ bArr8[iArr10[bArr13[c24]] & 255]);
    }

    private static byte[][] AFKeystoreWrapper(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            int i4 = 0;
            while (true) {
                byte[] bArr3 = bArr[i];
                if (i4 < bArr3.length) {
                    bArr2[i][bArr3[i4]] = (byte) i4;
                    i4++;
                }
            }
        }
        return bArr2;
    }

    private int valueOf() throws IOException {
        if (this.AFLogger$LogLevel == Integer.MAX_VALUE) {
            this.AFLogger$LogLevel = ((FilterInputStream) this).in.read();
        }
        if (this.AFVersionDeclaration == 16) {
            byte[] bArr = this.afDebugLog;
            int i = this.AFLogger$LogLevel;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = 1;
            do {
                int i6 = ((FilterInputStream) this).in.read(this.afDebugLog, i4, 16 - i4);
                if (i6 <= 0) {
                    break;
                }
                i4 += i6;
            } while (i4 < 16);
            if (i4 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            AFInAppEventParameterName(this.afDebugLog, this.getLevel);
            int i10 = ((FilterInputStream) this).in.read();
            this.AFLogger$LogLevel = i10;
            this.AFVersionDeclaration = 0;
            this.afWarnLog = i10 < 0 ? 16 - (this.getLevel[15] & 255) : 16;
        }
        return this.afWarnLog;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        valueOf();
        return this.afWarnLog - this.AFVersionDeclaration;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        valueOf();
        int i = this.AFVersionDeclaration;
        if (i >= this.afWarnLog) {
            return -1;
        }
        byte[] bArr = this.getLevel;
        this.AFVersionDeclaration = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j6 = 0;
        while (j6 < j && read() != -1) {
            j6++;
        }
        return j6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        int i6 = i + i4;
        for (int i10 = i; i10 < i6; i10++) {
            valueOf();
            int i11 = this.AFVersionDeclaration;
            if (i11 >= this.afWarnLog) {
                if (i10 == i) {
                    return -1;
                }
                return i4 - (i6 - i10);
            }
            byte[] bArr2 = this.getLevel;
            this.AFVersionDeclaration = i11 + 1;
            bArr[i10] = bArr2[i11];
        }
        return i4;
    }
}
