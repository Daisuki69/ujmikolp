package b4;

import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: renamed from: b4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0908c {
    public static final byte[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f8511a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f8512b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, Utf8.REPLACEMENT_BYTE, 123, 125, 39, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f8513d = new byte[128];
    public static final Charset e = StandardCharsets.ISO_8859_1;

    static {
        int i = 0;
        byte[] bArr = new byte[128];
        c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i4 = 0;
        while (true) {
            byte[] bArr2 = f8511a;
            if (i4 >= bArr2.length) {
                break;
            }
            byte b8 = bArr2[i4];
            if (b8 > 0) {
                c[b8] = (byte) i4;
            }
            i4++;
        }
        Arrays.fill(f8513d, (byte) -1);
        while (true) {
            byte[] bArr3 = f8512b;
            if (i >= bArr3.length) {
                return;
            }
            byte b10 = bArr3[i];
            if (b10 > 0) {
                f8513d[b10] = (byte) i;
            }
            i++;
        }
    }

    public static void a(byte[] bArr, int i, int i4, StringBuilder sb2) {
        if (i == 1 && i4 == 0) {
            sb2.append((char) 913);
        } else if (i % 6 == 0) {
            sb2.append((char) 924);
        } else {
            sb2.append((char) 901);
        }
        int i6 = 0;
        if (i >= 6) {
            char[] cArr = new char[5];
            int i10 = 0;
            while (i - i10 >= 6) {
                long j = 0;
                for (int i11 = 0; i11 < 6; i11++) {
                    j = (j << 8) + ((long) (bArr[i10 + i11] & 255));
                }
                for (int i12 = 0; i12 < 5; i12++) {
                    cArr[i12] = (char) (j % 900);
                    j /= 900;
                }
                for (int i13 = 4; i13 >= 0; i13--) {
                    sb2.append(cArr[i13]);
                }
                i10 += 6;
            }
            i6 = i10;
        }
        while (i6 < i) {
            sb2.append((char) (bArr[i6] & 255));
            i6++;
        }
    }

    public static void b(StringBuilder sb2, int i, int i4, String str) {
        StringBuilder sb3 = new StringBuilder((i4 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i6 = 0;
        while (i6 < i4) {
            sb3.setLength(0);
            int iMin = Math.min(44, i4 - i6);
            StringBuilder sb4 = new StringBuilder(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            int i10 = i + i6;
            sb4.append(str.substring(i10, i10 + iMin));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i6 += iMin;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4 A[EDGE_INSN: B:76:0x00e4->B:57:0x00e4 BREAK  A[LOOP:0: B:3:0x000e->B:93:0x000e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(java.lang.String r17, int r18, int r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.AbstractC0908c.c(java.lang.String, int, int, java.lang.StringBuilder, int):int");
    }

    public static boolean d(char c10) {
        if (c10 != ' ') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public static boolean e(char c10) {
        if (c10 != ' ') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }
}
