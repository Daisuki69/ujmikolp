package zj;

import bj.AbstractC1046q;

/* JADX INFO: loaded from: classes11.dex */
public abstract class f {
    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            iArr[i4] = "0123456789abcdef".charAt(i4 & 15) | ("0123456789abcdef".charAt(i4 >> 4) << '\b');
        }
        int[] iArr2 = new int[256];
        for (int i6 = 0; i6 < 256; i6++) {
            iArr2[i6] = "0123456789ABCDEF".charAt(i6 & 15) | ("0123456789ABCDEF".charAt(i6 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i10 = 0; i10 < 256; i10++) {
            iArr3[i10] = -1;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i11)] = i12;
            i11++;
            i12++;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i13)] = i14;
            i13++;
            i14++;
        }
        long[] jArr = new long[256];
        for (int i15 = 0; i15 < 256; i15++) {
            jArr[i15] = -1;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        int i18 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i18;
            i++;
            i18++;
        }
    }

    public static String a(long j) {
        i format = i.f21478d;
        kotlin.jvm.internal.j.g(format, "format");
        String str = format.f21479a ? "0123456789ABCDEF" : "0123456789abcdef";
        if (format.c.f21477a) {
            return new String(new char[]{str.charAt((int) ((j >> 60) & 15)), str.charAt((int) ((j >> 56) & 15)), str.charAt((int) ((j >> 52) & 15)), str.charAt((int) ((j >> 48) & 15)), str.charAt((int) ((j >> 44) & 15)), str.charAt((int) ((j >> 40) & 15)), str.charAt((int) ((j >> 36) & 15)), str.charAt((int) ((j >> 32) & 15)), str.charAt((int) ((j >> 28) & 15)), str.charAt((int) ((j >> 24) & 15)), str.charAt((int) ((j >> 20) & 15)), str.charAt((int) ((j >> 16) & 15)), str.charAt((int) ((j >> 12) & 15)), str.charAt((int) ((j >> 8) & 15)), str.charAt((int) ((j >> 4) & 15)), str.charAt((int) (j & 15))});
        }
        long j6 = 0;
        long j7 = j6 + j6 + ((long) 16) + j6;
        if (0 > j7 || j7 > 2147483647L) {
            throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) AbstractC1046q.a(j7)));
        }
        int i = (int) j7;
        char[] cArr = new char[i];
        int i4 = 64;
        int i6 = 0;
        int i10 = 0;
        while (i6 < 16) {
            i4 -= 4;
            cArr[i10] = str.charAt((int) ((j >> i4) & 15));
            i6++;
            i10++;
        }
        return i10 == i ? new String(cArr) : z.i(cArr, 0, i10);
    }
}
