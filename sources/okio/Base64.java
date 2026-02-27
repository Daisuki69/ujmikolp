package okio;

import java.util.Arrays;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: renamed from: okio.-Base64, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class Base64 {
    private static final byte[] BASE64;
    private static final byte[] BASE64_URL_SAFE;

    static {
        ByteString.Companion companion = ByteString.Companion;
        BASE64 = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
        BASE64_URL_SAFE = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
    }

    public static final byte[] decodeBase64ToArray(String str) {
        int i;
        char cCharAt;
        j.g(str, "<this>");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i4 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i4];
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt2 = str.charAt(i12);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else if (cCharAt2 == '/' || cCharAt2 == '_') {
                i = 63;
            } else {
                if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i10 = (i10 << 6) | i;
            i6++;
            if (i6 % 4 == 0) {
                bArr[i11] = (byte) (i10 >> 16);
                int i13 = i11 + 2;
                bArr[i11 + 1] = (byte) (i10 >> 8);
                i11 += 3;
                bArr[i13] = (byte) i10;
            }
        }
        int i14 = i6 % 4;
        if (i14 == 1) {
            return null;
        }
        if (i14 == 2) {
            bArr[i11] = (byte) ((i10 << 12) >> 16);
            i11++;
        } else if (i14 == 3) {
            int i15 = i10 << 6;
            int i16 = i11 + 1;
            bArr[i11] = (byte) (i15 >> 16);
            i11 += 2;
            bArr[i16] = (byte) (i15 >> 8);
        }
        if (i11 == i4) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i11);
        j.f(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static final String encodeBase64(byte[] bArr, byte[] map) {
        j.g(bArr, "<this>");
        j.g(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i4 = 0;
        while (i < length) {
            byte b8 = bArr[i];
            int i6 = i + 2;
            byte b10 = bArr[i + 1];
            i += 3;
            byte b11 = bArr[i6];
            bArr2[i4] = map[(b8 & 255) >> 2];
            bArr2[i4 + 1] = map[((b8 & 3) << 4) | ((b10 & 255) >> 4)];
            int i10 = i4 + 3;
            bArr2[i4 + 2] = map[((b10 & 15) << 2) | ((b11 & 255) >> 6)];
            i4 += 4;
            bArr2[i10] = map[b11 & Utf8.REPLACEMENT_BYTE];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b12 = bArr[i];
            bArr2[i4] = map[(b12 & 255) >> 2];
            bArr2[i4 + 1] = map[(b12 & 3) << 4];
            bArr2[i4 + 2] = 61;
            bArr2[i4 + 3] = 61;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b13 = bArr[i];
            byte b14 = bArr[i11];
            bArr2[i4] = map[(b13 & 255) >> 2];
            bArr2[i4 + 1] = map[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            bArr2[i4 + 2] = map[(b14 & 15) << 2];
            bArr2[i4 + 3] = 61;
        }
        return _JvmPlatformKt.toUtf8String(bArr2);
    }

    public static /* synthetic */ String encodeBase64$default(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = BASE64;
        }
        return encodeBase64(bArr, bArr2);
    }

    public static final byte[] getBASE64() {
        return BASE64;
    }

    public static /* synthetic */ void getBASE64$annotations() {
    }

    public static final byte[] getBASE64_URL_SAFE() {
        return BASE64_URL_SAFE;
    }

    public static /* synthetic */ void getBASE64_URL_SAFE$annotations() {
    }
}
