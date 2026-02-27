package T3;

import M8.T2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends T2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f5780b = {1, 1, 1, 1};
    public static final int[] c = {3, 1, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f5781d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5782a;

    public /* synthetic */ i(int i) {
        this.f5782a = i;
    }

    public static void U(boolean[] zArr, int i, int[] iArr) {
        int length = iArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i6 = i + 1;
            zArr[i] = iArr[i4] != 0;
            i4++;
            i = i6;
        }
    }

    public static int V(int i, String str) {
        int iIndexOf = 0;
        int i4 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i4;
            i4++;
            if (i4 > i) {
                i4 = 1;
            }
        }
        return iIndexOf % 47;
    }

    public static int W(int i, String str) {
        char cCharAt;
        int length = str.length();
        if (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 == 241) {
                return 4;
            }
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                int i4 = i + 1;
                return (i4 < length && (cCharAt = str.charAt(i4)) >= '0' && cCharAt <= '9') ? 3 : 2;
            }
        }
        return 1;
    }

    public static void X(int i, int[] iArr) {
        for (int i4 = 0; i4 < 9; i4++) {
            int i6 = 1;
            if (((1 << (8 - i4)) & i) != 0) {
                i6 = 2;
            }
            iArr[i4] = i6;
        }
    }

    public static void Y(int i, int[] iArr) {
        for (int i4 = 0; i4 < 9; i4++) {
            int i6 = 1;
            if (((1 << (8 - i4)) & i) == 0) {
                i6 = 0;
            }
            iArr[i4] = i6;
        }
    }

    @Override // M8.T2, C3.n
    public final K3.b e(String str, C3.a aVar, int i, int i4, HashMap map) {
        switch (this.f5782a) {
            case 0:
                if (aVar == C3.a.i) {
                    return super.e(str, aVar, i, i4, map);
                }
                throw new IllegalArgumentException("Can only encode ITF, but got " + aVar);
            case 1:
                if (aVar == C3.a.e) {
                    return super.e(str, aVar, i, i4, map);
                }
                throw new IllegalArgumentException("Can only encode CODE_128, but got " + aVar);
            case 2:
                if (aVar == C3.a.c) {
                    return super.e(str, aVar, i, i4, map);
                }
                throw new IllegalArgumentException("Can only encode CODE_39, but got " + aVar);
            default:
                if (aVar == C3.a.f691d) {
                    return super.e(str, aVar, i, i4, map);
                }
                throw new IllegalArgumentException("Can only encode CODE_93, but got " + aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0192  */
    @Override // M8.T2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean[] n(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.i.n(java.lang.String):boolean[]");
    }
}
