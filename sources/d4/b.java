package d4;

import androidx.media3.extractor.ts.PsExtractor;
import com.google.zxing.FormatException;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f16260a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(Ff.f r3, java.lang.StringBuilder r4, int r5, boolean r6) throws com.google.zxing.FormatException {
        /*
            int r0 = r4.length()
        L4:
            r1 = 1
            if (r5 <= r1) goto L2d
            int r1 = r3.c()
            r2 = 11
            if (r1 < r2) goto L28
            int r1 = r3.g(r2)
            int r2 = r1 / 45
            char r2 = f(r2)
            r4.append(r2)
            int r1 = r1 % 45
            char r1 = f(r1)
            r4.append(r1)
            int r5 = r5 + (-2)
            goto L4
        L28:
            com.google.zxing.FormatException r3 = com.google.zxing.FormatException.a()
            throw r3
        L2d:
            if (r5 != r1) goto L47
            int r5 = r3.c()
            r2 = 6
            if (r5 < r2) goto L42
            int r3 = r3.g(r2)
            char r3 = f(r3)
            r4.append(r3)
            goto L47
        L42:
            com.google.zxing.FormatException r3 = com.google.zxing.FormatException.a()
            throw r3
        L47:
            if (r6 == 0) goto L72
        L49:
            int r3 = r4.length()
            if (r0 >= r3) goto L72
            char r3 = r4.charAt(r0)
            r5 = 37
            if (r3 != r5) goto L6f
            int r3 = r4.length()
            int r3 = r3 - r1
            if (r0 >= r3) goto L6a
            int r3 = r0 + 1
            char r6 = r4.charAt(r3)
            if (r6 != r5) goto L6a
            r4.deleteCharAt(r3)
            goto L6f
        L6a:
            r3 = 29
            r4.setCharAt(r0, r3)
        L6f:
            int r0 = r0 + 1
            goto L49
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.b.a(Ff.f, java.lang.StringBuilder, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(Ff.f r28, java.lang.StringBuilder r29, int r30, K3.c r31, java.util.ArrayList r32, java.util.EnumMap r33) throws com.google.zxing.FormatException {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.b.b(Ff.f, java.lang.StringBuilder, int, K3.c, java.util.ArrayList, java.util.EnumMap):void");
    }

    public static void c(Ff.f fVar, StringBuilder sb2, int i) throws FormatException {
        if (i * 13 > fVar.c()) {
            throw FormatException.a();
        }
        byte[] bArr = new byte[i * 2];
        int i4 = 0;
        while (i > 0) {
            int iG = fVar.g(13);
            int i6 = (iG % 96) | ((iG / 96) << 8);
            int i10 = i6 + (i6 < 959 ? 41377 : 42657);
            bArr[i4] = (byte) (i10 >> 8);
            bArr[i4 + 1] = (byte) i10;
            i4 += 2;
            i--;
        }
        try {
            sb2.append(new String(bArr, "GB2312"));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.a();
        }
    }

    public static void d(Ff.f fVar, StringBuilder sb2, int i) throws FormatException {
        if (i * 13 > fVar.c()) {
            throw FormatException.a();
        }
        byte[] bArr = new byte[i * 2];
        int i4 = 0;
        while (i > 0) {
            int iG = fVar.g(13);
            int i6 = (iG % PsExtractor.AUDIO_STREAM) | ((iG / PsExtractor.AUDIO_STREAM) << 8);
            int i10 = i6 + (i6 < 7936 ? 33088 : 49472);
            bArr[i4] = (byte) (i10 >> 8);
            bArr[i4 + 1] = (byte) i10;
            i4 += 2;
            i--;
        }
        try {
            sb2.append(new String(bArr, "SJIS"));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.a();
        }
    }

    public static void e(Ff.f fVar, StringBuilder sb2, int i) throws FormatException {
        while (i >= 3) {
            if (fVar.c() < 10) {
                throw FormatException.a();
            }
            int iG = fVar.g(10);
            if (iG >= 1000) {
                throw FormatException.a();
            }
            sb2.append(f(iG / 100));
            sb2.append(f((iG / 10) % 10));
            sb2.append(f(iG % 10));
            i -= 3;
        }
        if (i == 2) {
            if (fVar.c() < 7) {
                throw FormatException.a();
            }
            int iG2 = fVar.g(7);
            if (iG2 >= 100) {
                throw FormatException.a();
            }
            sb2.append(f(iG2 / 10));
            sb2.append(f(iG2 % 10));
            return;
        }
        if (i == 1) {
            if (fVar.c() < 4) {
                throw FormatException.a();
            }
            int iG3 = fVar.g(4);
            if (iG3 >= 10) {
                throw FormatException.a();
            }
            sb2.append(f(iG3));
        }
    }

    public static char f(int i) throws FormatException {
        char[] cArr = f16260a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.a();
    }
}
