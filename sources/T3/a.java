package T3;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f5761d = "0123456789-$:/.+ABCD".toCharArray();
    public static final int[] e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    public static final char[] f = {'A', 'B', 'C', 'D'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f5762a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f5763b = new int[80];
    public int c = 0;

    public static boolean g(char[] cArr, char c) {
        if (cArr != null) {
            for (char c10 : cArr) {
                if (c10 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x018d, code lost:
    
        throw com.google.zxing.NotFoundException.c;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0231  */
    @Override // T3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final C3.j b(int r27, K3.a r28, java.util.EnumMap r29) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.a.b(int, K3.a, java.util.EnumMap):C3.j");
    }

    public final int h(int i) {
        int i4 = i + 7;
        if (i4 >= this.c) {
            return -1;
        }
        int[] iArr = this.f5763b;
        int i6 = Integer.MAX_VALUE;
        int i10 = 0;
        int i11 = Integer.MAX_VALUE;
        int i12 = 0;
        for (int i13 = i; i13 < i4; i13 += 2) {
            int i14 = iArr[i13];
            if (i14 < i11) {
                i11 = i14;
            }
            if (i14 > i12) {
                i12 = i14;
            }
        }
        int i15 = (i11 + i12) / 2;
        int i16 = 0;
        for (int i17 = i + 1; i17 < i4; i17 += 2) {
            int i18 = iArr[i17];
            if (i18 < i6) {
                i6 = i18;
            }
            if (i18 > i16) {
                i16 = i18;
            }
        }
        int i19 = (i6 + i16) / 2;
        int i20 = 128;
        int i21 = 0;
        for (int i22 = 0; i22 < 7; i22++) {
            i20 >>= 1;
            if (iArr[i + i22] > ((i22 & 1) == 0 ? i15 : i19)) {
                i21 |= i20;
            }
        }
        while (true) {
            int[] iArr2 = e;
            if (i10 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i10] == i21) {
                return i10;
            }
            i10++;
        }
    }
}
