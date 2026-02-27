package com.appsflyer.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1iSDK {
    private static byte[] afRDLog = new byte[256];
    static final byte[] AFInAppEventParameterName = new byte[256];
    static final int[] values = new int[256];
    static final int[] valueOf = new int[256];
    static final int[] AFKeystoreWrapper = new int[256];
    static final int[] AFInAppEventType = new int[256];
    private static int[] afInfoLog = new int[10];

    static {
        byte[] bArr;
        int i;
        byte b8 = 1;
        byte b10 = 1;
        do {
            b8 = (byte) (((b8 & 128) != 0 ? 27 : 0) ^ ((b8 << 1) ^ b8));
            byte b11 = (byte) (b10 ^ (b10 << 1));
            byte b12 = (byte) (b11 ^ (b11 << 2));
            byte b13 = (byte) (b12 ^ (b12 << 4));
            b10 = (byte) (b13 ^ ((b13 & 128) != 0 ? (byte) 9 : (byte) 0));
            bArr = afRDLog;
            i = b8 & 255;
            int i4 = b10 & 255;
            bArr[i] = (byte) (((((b10 ^ 99) ^ ((i4 << 1) | (i4 >> 7))) ^ ((i4 << 2) | (i4 >> 6))) ^ ((i4 << 3) | (i4 >> 5))) ^ ((i4 >> 4) | (i4 << 4)));
        } while (i != 1);
        bArr[0] = 99;
        for (int i6 = 0; i6 < 256; i6++) {
            int i10 = afRDLog[i6] & 255;
            AFInAppEventParameterName[i10] = (byte) i6;
            int i11 = i6 << 1;
            if (i11 >= 256) {
                i11 ^= 283;
            }
            int i12 = i11 << 1;
            if (i12 >= 256) {
                i12 ^= 283;
            }
            int i13 = i12 << 1;
            if (i13 >= 256) {
                i13 ^= 283;
            }
            int i14 = i13 ^ i6;
            int i15 = ((i11 ^ (i12 ^ i13)) << 24) | (i14 << 16) | ((i14 ^ i12) << 8) | (i14 ^ i11);
            values[i10] = i15;
            valueOf[i10] = (i15 >>> 8) | (i15 << 24);
            AFKeystoreWrapper[i10] = (i15 >>> 16) | (i15 << 16);
            AFInAppEventType[i10] = (i15 << 8) | (i15 >>> 24);
        }
        afInfoLog[0] = 16777216;
        int i16 = 1;
        for (int i17 = 1; i17 < 10; i17++) {
            i16 <<= 1;
            if (i16 >= 256) {
                i16 ^= 283;
            }
            afInfoLog[i17] = i16 << 24;
        }
    }

    public static byte[][] AFKeystoreWrapper(int i) {
        byte[][] bArr = new byte[4][];
        for (int i4 = 0; i4 < 4; i4++) {
            int i6 = i >>> (i4 << 3);
            bArr[i4] = new byte[]{(byte) (i6 & 3), (byte) ((i6 >> 2) & 3), (byte) ((i6 >> 4) & 3), (byte) ((i6 >> 6) & 3)};
        }
        return bArr;
    }

    public static int[] values(byte[] bArr, int i) throws IllegalArgumentException {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i4 = 4;
        int i6 = (i + 1) * 4;
        int[] iArr = new int[i6];
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i10 + 3;
            int i13 = ((bArr[i10 + 1] & 255) << 16) | (bArr[i10] << 24) | ((bArr[i10 + 2] & 255) << 8);
            i10 += 4;
            iArr[i11] = i13 | (bArr[i12] & 255);
        }
        int i14 = 4;
        int i15 = 0;
        int i16 = 0;
        while (i14 < i6) {
            int i17 = iArr[i14 - 1];
            if (i15 == 0) {
                byte[] bArr2 = afRDLog;
                i17 = ((bArr2[i17 >>> 24] & 255) | (((bArr2[(i17 >>> 16) & 255] << 24) | ((bArr2[(i17 >>> 8) & 255] & 255) << 16)) | ((bArr2[i17 & 255] & 255) << 8))) ^ afInfoLog[i16];
                i15 = 4;
                i16++;
            }
            iArr[i14] = i17 ^ iArr[i14 - 4];
            i14++;
            i15--;
        }
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int[] iArr2 = new int[i6];
        int i18 = i * 4;
        iArr2[0] = iArr[i18];
        int i19 = 1;
        iArr2[1] = iArr[i18 + 1];
        iArr2[2] = iArr[i18 + 2];
        char c = 3;
        iArr2[3] = iArr[i18 + 3];
        int i20 = i18 - 4;
        while (i19 < i) {
            int i21 = iArr[i20];
            int[] iArr3 = values;
            byte[] bArr3 = afRDLog;
            int i22 = iArr3[bArr3[i21 >>> 24] & 255];
            int[] iArr4 = valueOf;
            int i23 = i22 ^ iArr4[bArr3[(i21 >>> 16) & 255] & 255];
            int[] iArr5 = AFKeystoreWrapper;
            int i24 = i23 ^ iArr5[bArr3[(i21 >>> 8) & 255] & 255];
            int[] iArr6 = AFInAppEventType;
            iArr2[i4] = iArr6[bArr3[i21 & 255] & 255] ^ i24;
            int i25 = iArr[i20 + 1];
            char c10 = c;
            int[] iArr7 = iArr2;
            iArr7[i4 + 1] = ((iArr4[bArr3[(i25 >>> 16) & 255] & 255] ^ iArr3[bArr3[i25 >>> 24] & 255]) ^ iArr5[bArr3[(i25 >>> 8) & 255] & 255]) ^ iArr6[bArr3[i25 & 255] & 255];
            int i26 = iArr[i20 + 2];
            int i27 = i4 + 3;
            iArr7[i4 + 2] = iArr6[bArr3[i26 & 255] & 255] ^ ((iArr3[bArr3[i26 >>> 24] & 255] ^ iArr4[bArr3[(i26 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i26 >>> 8) & 255] & 255]);
            int i28 = iArr[i20 + 3];
            i4 += 4;
            iArr7[i27] = iArr6[bArr3[i28 & 255] & 255] ^ ((iArr3[bArr3[i28 >>> 24] & 255] ^ iArr4[bArr3[(i28 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i28 >>> 8) & 255] & 255]);
            i20 -= 4;
            i19++;
            c = c10;
            iArr2 = iArr7;
        }
        int[] iArr8 = iArr2;
        iArr8[i4] = iArr[i20];
        iArr8[i4 + 1] = iArr[i20 + 1];
        iArr8[i4 + 2] = iArr[i20 + 2];
        iArr8[i4 + 3] = iArr[i20 + 3];
        return iArr8;
    }
}
