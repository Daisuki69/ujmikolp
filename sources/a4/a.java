package a4;

import C3.l;
import K3.b;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f6993a = {0, 4, 1, 5};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f6994b = {6, 2, 7, 3};
    public static final int[] c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f6995d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    public static ArrayList a(b bVar) {
        ArrayList arrayList = new ArrayList();
        int i = bVar.f2590b;
        if (i > 0) {
            l[] lVarArr = new l[8];
            int[] iArr = c;
            int i4 = bVar.f2589a;
            int i6 = 0;
            int i10 = 0;
            l[] lVarArrC = c(bVar, i, i4, 0, 0, iArr);
            int[] iArr2 = f6993a;
            for (int i11 = 0; i11 < 4; i11++) {
                lVarArr[iArr2[i11]] = lVarArrC[i11];
            }
            l lVar = lVarArr[4];
            if (lVar != null) {
                i10 = (int) lVar.f727a;
                i6 = (int) lVar.f728b;
            }
            l[] lVarArrC2 = c(bVar, i, i4, i6, i10, f6995d);
            int[] iArr3 = f6994b;
            for (int i12 = 0; i12 < 4; i12++) {
                lVarArr[iArr3[i12]] = lVarArrC2[i12];
            }
            if (lVarArr[0] != null || lVarArr[3] != null) {
                arrayList.add(lVarArr);
            }
        }
        return arrayList;
    }

    public static int[] b(b bVar, int i, int i4, int i6, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i10 = 0;
        while (bVar.b(i, i4) && i > 0) {
            int i11 = i10 + 1;
            if (i10 >= 3) {
                break;
            }
            i--;
            i10 = i11;
        }
        int length = iArr.length;
        int i12 = i;
        int i13 = 0;
        boolean z4 = false;
        while (i < i6) {
            if (bVar.b(i, i4) != z4) {
                iArr2[i13] = iArr2[i13] + 1;
            } else {
                if (i13 != length - 1) {
                    i13++;
                } else {
                    if (d(iArr2, iArr) < 0.42f) {
                        return new int[]{i12, i};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i14 = i13 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i14);
                    iArr2[i14] = 0;
                    iArr2[i13] = 0;
                    i13--;
                }
                iArr2[i13] = 1;
                z4 = !z4;
            }
            i++;
        }
        if (i13 != length - 1 || d(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i12, i - 1};
    }

    public static l[] c(b bVar, int i, int i4, int i6, int i10, int[] iArr) {
        b bVar2;
        int i11;
        int[] iArr2;
        boolean z4;
        int i12;
        int[] iArrB;
        l[] lVarArr = new l[4];
        int[] iArr3 = new int[iArr.length];
        int i13 = i6;
        while (true) {
            bVar2 = bVar;
            i11 = i4;
            if (i13 >= i) {
                iArr2 = iArr;
                z4 = false;
                i12 = i13;
                break;
            }
            int i14 = i10;
            iArr2 = iArr;
            int[] iArrB2 = b(bVar2, i14, i13, i11, iArr2, iArr3);
            if (iArrB2 != null) {
                while (true) {
                    i12 = i13;
                    if (i12 <= 0 || (iArrB = b(bVar2, i14, i12 - 1, i11, iArr2, iArr3)) == null) {
                        break;
                    }
                    iArrB2 = iArrB;
                }
                float f = i12;
                lVarArr[0] = new l(iArrB2[0], f);
                lVarArr[1] = new l(iArrB2[1], f);
                z4 = true;
            } else {
                i13 += 5;
                bVar = bVar2;
                i10 = i14;
                i4 = i11;
                iArr = iArr2;
            }
        }
        int i15 = i12 + 1;
        if (z4) {
            int[] iArr4 = {(int) lVarArr[0].f727a, (int) lVarArr[1].f727a};
            int i16 = i15;
            int i17 = 0;
            while (i16 < i) {
                int[] iArrB3 = b(bVar2, iArr4[0], i16, i11, iArr2, iArr3);
                if (iArrB3 != null && Math.abs(iArr4[0] - iArrB3[0]) < 5 && Math.abs(iArr4[1] - iArrB3[1]) < 5) {
                    iArr4 = iArrB3;
                    i17 = 0;
                } else {
                    if (i17 > 25) {
                        break;
                    }
                    i17++;
                }
                i16++;
            }
            i15 = i16 - (i17 + 1);
            float f3 = i15;
            lVarArr[2] = new l(iArr4[0], f3);
            lVarArr[3] = new l(iArr4[1], f3);
        }
        if (i15 - i12 < 10) {
            Arrays.fill(lVarArr, (Object) null);
        }
        return lVarArr;
    }

    public static float d(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i = 0;
        int i4 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            i += iArr[i6];
            i4 += iArr2[i6];
        }
        if (i < i4) {
            return Float.POSITIVE_INFINITY;
        }
        float f = i;
        float f3 = f / i4;
        float f7 = 0.8f * f3;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            float f11 = iArr2[i10] * f3;
            float f12 = iArr[i10];
            float f13 = f12 > f11 ? f12 - f11 : f11 - f12;
            if (f13 > f7) {
                return Float.POSITIVE_INFINITY;
            }
            f10 += f13;
        }
        return f10 / f;
    }
}
