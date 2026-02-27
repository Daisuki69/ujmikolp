package v;

import We.s;
import com.paymaya.common.utility.C1219h;
import dOYHB6.tiZVw8.numX49;
import java.util.Arrays;
import yf.j;

/* JADX INFO: renamed from: v.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2329d {
    public static int[] a(int i, int[] iArr) {
        int length = iArr.length + 1;
        int[] iArr2 = new int[length];
        for (int i4 = 0; i4 < i; i4++) {
            iArr2[i4] = iArr[i4];
        }
        iArr2[i] = 1;
        for (int i6 = i + 1; i6 < length; i6++) {
            iArr2[i6] = iArr[i6 - 1];
        }
        return iArr2;
    }

    public static int b(int i, int i4) {
        return (((i4 + 1) / 2) * ((i + 1) / 2) * 2) + (i * i4);
    }

    public static final void c(int i, int i4, int i6, int i10) {
        qk.i.j(String.format(numX49.tnTj78("bL96"), Integer.valueOf(i4), j(i), Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(g(i, i6, i10))), i4 >= g(i, i6, i10));
    }

    public static final void d(int i, String str) {
        if (i == 1 || i == 2) {
            return;
        }
        StringBuilder sbV = s.v(str, numX49.tnTj78("bL9a"));
        sbV.append(j(i));
        throw new UnsupportedOperationException(sbV.toString());
    }

    public static final void e(int i, int[] iArr) {
        String strTnTj78;
        d(i, numX49.tnTj78("bL9X"));
        int[] iArrF = f(i, iArr);
        boolean z4 = false;
        if (iArrF[0] == 1 && iArrF[1] > 0 && iArrF[2] > 0) {
            int i4 = iArrF[3];
            int i6 = 1;
            if (i == 1) {
                i6 = 3;
            } else if (i != 2) {
                throw new UnsupportedOperationException(numX49.tnTj78("bL9G").concat(j(i)));
            }
            if (i4 == i6) {
                z4 = true;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i == 1) {
            strTnTj78 = numX49.tnTj78("bL9v");
        } else {
            if (i != 2) {
                throw new UnsupportedOperationException(numX49.tnTj78("bL9y").concat(j(i)));
            }
            strTnTj78 = numX49.tnTj78("bL93");
        }
        sb2.append(strTnTj78);
        sb2.append(numX49.tnTj78("bL97"));
        sb2.append(Arrays.toString(iArr));
        qk.i.j(sb2.toString(), z4);
    }

    public static int[] f(int i, int[] iArr) {
        if (i == 1) {
            int length = iArr.length;
            if (length == 3) {
                return a(0, iArr);
            }
            if (length == 4) {
                return iArr;
            }
            throw new IllegalArgumentException(numX49.tnTj78("bL9T") + Arrays.toString(iArr));
        }
        if (i != 2) {
            throw new UnsupportedOperationException(numX49.tnTj78("bL9Y").concat(j(i)));
        }
        int length2 = iArr.length;
        if (length2 == 2) {
            return a(3, a(0, iArr));
        }
        if (length2 == 4) {
            return iArr;
        }
        throw new IllegalArgumentException(numX49.tnTj78("bL9A") + Arrays.toString(iArr));
    }

    public static int g(int i, int i4, int i6) {
        switch (i) {
        }
        return b(i4, i6);
    }

    public static C1219h h(int i) {
        C1219h c1219h = new C1219h();
        c1219h.n(i);
        return c1219h;
    }

    public static j i(String str, String str2) {
        new j(str, true);
        return new j(str2, true);
    }

    public static /* synthetic */ String j(int i) {
        switch (i) {
            case 1:
                return numX49.tnTj78("bL9n");
            case 2:
                return numX49.tnTj78("bL91");
            case 3:
                return numX49.tnTj78("bL9f");
            case 4:
                return numX49.tnTj78("bL9g");
            case 5:
                return numX49.tnTj78("bL90");
            case 6:
                return numX49.tnTj78("bL9p");
            case 7:
                return numX49.tnTj78("bL9R");
            default:
                throw null;
        }
    }

    public static /* synthetic */ String k(int i) {
        switch (i) {
            case 1:
                return numX49.tnTj78("bL9PP");
            case 2:
                return numX49.tnTj78("bL9P9");
            case 3:
                return numX49.tnTj78("bL9W");
            case 4:
                return numX49.tnTj78("bL9l");
            case 5:
                return numX49.tnTj78("bL9z");
            case 6:
                return numX49.tnTj78("bL9q");
            case 7:
                return numX49.tnTj78("bL9I");
            case 8:
                return numX49.tnTj78("bL9J");
            case 9:
                return numX49.tnTj78("bL95");
            case 10:
                return numX49.tnTj78("bL9s");
            default:
                return numX49.tnTj78("bL9x");
        }
    }
}
