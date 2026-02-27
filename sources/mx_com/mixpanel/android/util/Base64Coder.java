package mx_com.mixpanel.android.util;

/* JADX INFO: loaded from: classes7.dex */
public class Base64Coder {
    private static final char[] map1 = new char[64];
    private static final byte[] map2;

    static {
        char c = 'A';
        int i = 0;
        while (c <= 'Z') {
            map1[i] = c;
            c = (char) (c + 1);
            i++;
        }
        char c10 = 'a';
        while (c10 <= 'z') {
            map1[i] = c10;
            c10 = (char) (c10 + 1);
            i++;
        }
        char c11 = '0';
        while (c11 <= '9') {
            map1[i] = c11;
            c11 = (char) (c11 + 1);
            i++;
        }
        char[] cArr = map1;
        cArr[i] = '+';
        cArr[i + 1] = '/';
        map2 = new byte[128];
        int i4 = 0;
        while (true) {
            byte[] bArr = map2;
            if (i4 >= bArr.length) {
                break;
            }
            bArr[i4] = -1;
            i4++;
        }
        for (int i6 = 0; i6 < 64; i6++) {
            map2[map1[i6]] = (byte) i6;
        }
    }

    public static String encodeString(String str) {
        return new String(encode(str.getBytes()));
    }

    public static char[] encode(byte[] bArr) {
        return encode(bArr, bArr.length);
    }

    public static char[] encode(byte[] bArr, int i) {
        int i4;
        int i6;
        int i10;
        int i11 = ((i * 4) + 2) / 3;
        char[] cArr = new char[((i + 2) / 3) * 4];
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            int i14 = i12 + 1;
            int i15 = bArr[i12] & 255;
            if (i14 < i) {
                i4 = i14 + 1;
                i6 = bArr[i14] & 255;
            } else {
                i4 = i14;
                i6 = 0;
            }
            if (i4 < i) {
                i10 = bArr[i4] & 255;
                i4++;
            } else {
                i10 = 0;
            }
            int i16 = i15 >>> 2;
            int i17 = ((i15 & 3) << 4) | (i6 >>> 4);
            int i18 = ((i6 & 15) << 2) | (i10 >>> 6);
            int i19 = i10 & 63;
            int i20 = i13 + 1;
            char[] cArr2 = map1;
            cArr[i13] = cArr2[i16];
            int i21 = i20 + 1;
            cArr[i20] = cArr2[i17];
            char c = '=';
            cArr[i21] = i21 < i11 ? cArr2[i18] : '=';
            int i22 = i21 + 1;
            if (i22 < i11) {
                c = cArr2[i19];
            }
            cArr[i22] = c;
            i13 = i22 + 1;
            i12 = i4;
        }
        return cArr;
    }

    public static String decodeString(String str) {
        return new String(decode(str));
    }

    public static byte[] decode(String str) {
        return decode(str.toCharArray());
    }

    public static byte[] decode(char[] cArr) {
        int i;
        char c;
        int i4;
        char c10;
        int length = cArr.length;
        if (length % 4 != 0) {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        while (length > 0 && cArr[length - 1] == '=') {
            length--;
        }
        int i6 = (length * 3) / 4;
        byte[] bArr = new byte[i6];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 = i4) {
            int i12 = i11 + 1;
            char c11 = cArr[i11];
            int i13 = i12 + 1;
            char c12 = cArr[i12];
            if (i13 < length) {
                i = i13 + 1;
                c = cArr[i13];
            } else {
                i = i13;
                c = 'A';
            }
            if (i < length) {
                i4 = i + 1;
                c10 = cArr[i];
            } else {
                i4 = i;
                c10 = 'A';
            }
            if (c11 > 127 || c12 > 127 || c > 127 || c10 > 127) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            byte[] bArr2 = map2;
            byte b8 = bArr2[c11];
            byte b10 = bArr2[c12];
            byte b11 = bArr2[c];
            byte b12 = bArr2[c10];
            if (b8 < 0 || b10 < 0 || b11 < 0 || b12 < 0) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            int i14 = (b8 << 2) | (b10 >>> 4);
            int i15 = ((b10 & 15) << 4) | (b11 >>> 2);
            int i16 = ((b11 & 3) << 6) | b12;
            int i17 = i10 + 1;
            bArr[i10] = (byte) i14;
            if (i17 < i6) {
                bArr[i17] = (byte) i15;
                i17++;
            }
            if (i17 < i6) {
                bArr[i17] = (byte) i16;
                i10 = i17 + 1;
            } else {
                i10 = i17;
            }
        }
        return bArr;
    }
}
