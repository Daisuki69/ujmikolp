package f4;

import Ff.f;
import androidx.media3.extractor.ts.TsExtractor;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.google.zxing.WriterException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f16705a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[][] f16706b = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] c = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f16707d = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, -1}, new int[]{6, 34, 60, 86, 112, TsExtractor.TS_STREAM_TYPE_DTS, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, ServerConfiguration.DEFAULT_MAX_BEACON_SIZE_KB_SAAS}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, TsExtractor.TS_STREAM_TYPE_DTS_HD, 162}, new int[]{6, 26, 54, 82, 110, TsExtractor.TS_STREAM_TYPE_DTS, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] e = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static int a(f fVar, boolean z4) {
        int i = fVar.f1581b;
        int i4 = fVar.c;
        int i6 = z4 ? i4 : i;
        if (!z4) {
            i = i4;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < i6; i11++) {
            byte b8 = -1;
            int i12 = 0;
            for (int i13 = 0; i13 < i; i13++) {
                byte[][] bArr = (byte[][]) fVar.f1582d;
                byte b10 = z4 ? bArr[i11][i13] : bArr[i13][i11];
                if (b10 == b8) {
                    i12++;
                } else {
                    if (i12 >= 5) {
                        i10 += i12 - 2;
                    }
                    i12 = 1;
                    b8 = b10;
                }
            }
            if (i12 >= 5) {
                i10 = (i12 - 2) + i10;
            }
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(K3.a r24, d4.c r25, d4.g r26, int r27, Ff.f r28) throws com.google.zxing.WriterException {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.b.b(K3.a, d4.c, d4.g, int, Ff.f):void");
    }

    public static int c(int i, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i4);
        int i6 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i6) {
            iNumberOfLeadingZeros2 ^= i4 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i6);
        }
        return iNumberOfLeadingZeros2;
    }

    public static void d(int i, int i4, f fVar) throws WriterException {
        for (int i6 = 0; i6 < 8; i6++) {
            int i10 = i + i6;
            if (!g(fVar.e(i10, i4))) {
                throw new WriterException();
            }
            fVar.h(i10, i4, 0);
        }
    }

    public static void e(int i, int i4, f fVar) {
        for (int i6 = 0; i6 < 7; i6++) {
            int[] iArr = f16706b[i6];
            for (int i10 = 0; i10 < 7; i10++) {
                fVar.h(i + i10, i4 + i6, iArr[i10]);
            }
        }
    }

    public static void f(int i, int i4, f fVar) throws WriterException {
        for (int i6 = 0; i6 < 7; i6++) {
            int i10 = i4 + i6;
            if (!g(fVar.e(i, i10))) {
                throw new WriterException();
            }
            fVar.h(i, i10, 0);
        }
    }

    public static boolean g(int i) {
        return i == -1;
    }
}
