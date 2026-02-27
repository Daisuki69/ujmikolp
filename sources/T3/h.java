package T3;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f5777b = {6, 8, 10, 12, 14};
    public static final int[] c = {1, 1, 1, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f5778d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};
    public static final int[][] e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5779a = -1;

    public static int g(int[] iArr) throws NotFoundException {
        float f = 0.38f;
        int i = -1;
        for (int i4 = 0; i4 < 20; i4++) {
            float fD = k.d(iArr, e[i4], 0.5f);
            if (fD < f) {
                i = i4;
                f = fD;
            } else if (fD == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw NotFoundException.c;
    }

    public static int[] h(int i, K3.a aVar, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i4 = aVar.f2588b;
        int i6 = i;
        boolean z4 = false;
        int i10 = 0;
        while (i < i4) {
            if (aVar.d(i) != z4) {
                iArr2[i10] = iArr2[i10] + 1;
            } else {
                if (i10 != length - 1) {
                    i10++;
                } else {
                    if (k.d(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i6, i};
                    }
                    i6 += iArr2[0] + iArr2[1];
                    int i11 = i10 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i11);
                    iArr2[i11] = 0;
                    iArr2[i10] = 0;
                    i10--;
                }
                iArr2[i10] = 1;
                z4 = !z4;
            }
            i++;
        }
        throw NotFoundException.c;
    }

    @Override // T3.k
    public final C3.j b(int i, K3.a aVar, EnumMap enumMap) throws NotFoundException, FormatException {
        int[] iArrH;
        int i4;
        int i6 = 0;
        int i10 = aVar.f2588b;
        int iE = aVar.e(0);
        if (iE == i10) {
            throw NotFoundException.c;
        }
        int[] iArrH2 = h(iE, aVar, c);
        int i11 = iArrH2[1];
        int i12 = iArrH2[0];
        this.f5779a = (i11 - i12) / 4;
        i(aVar, i12);
        int[][] iArr = f5778d;
        aVar.i();
        try {
            int i13 = aVar.f2588b;
            int iE2 = aVar.e(0);
            if (iE2 == i13) {
                throw NotFoundException.c;
            }
            try {
                iArrH = h(iE2, aVar, iArr[0]);
            } catch (NotFoundException unused) {
                iArrH = h(iE2, aVar, iArr[1]);
            }
            i(aVar, iArrH[0]);
            int i14 = iArrH[0];
            int i15 = aVar.f2588b;
            iArrH[0] = i15 - iArrH[1];
            iArrH[1] = i15 - i14;
            aVar.i();
            StringBuilder sb2 = new StringBuilder(20);
            int i16 = iArrH2[1];
            int i17 = iArrH[0];
            int[] iArr2 = new int[10];
            int[] iArr3 = new int[5];
            int[] iArr4 = new int[5];
            while (i16 < i17) {
                k.e(i16, aVar, iArr2);
                int i18 = i6;
                while (i6 < 5) {
                    int i19 = i6 * 2;
                    iArr3[i6] = iArr2[i19];
                    iArr4[i6] = iArr2[i19 + 1];
                    i6++;
                }
                sb2.append((char) (g(iArr3) + 48));
                sb2.append((char) (g(iArr4) + 48));
                for (int i20 = i18; i20 < 10; i20++) {
                    i16 += iArr2[i20];
                }
                i6 = i18;
            }
            int i21 = i6;
            String string = sb2.toString();
            int[] iArr5 = enumMap != null ? (int[]) enumMap.get(C3.b.ALLOWED_LENGTHS) : null;
            if (iArr5 == null) {
                iArr5 = f5777b;
            }
            int length = string.length();
            int length2 = iArr5.length;
            int i22 = i21;
            int i23 = i22;
            while (true) {
                if (i22 >= length2) {
                    i4 = i21;
                    break;
                }
                int i24 = iArr5[i22];
                if (length == i24) {
                    i4 = 1;
                    break;
                }
                if (i24 > i23) {
                    i23 = i24;
                }
                i22++;
            }
            if (i4 == 0 && length > i23) {
                i4 = 1;
            }
            if (i4 == 0) {
                throw FormatException.a();
            }
            float f = i;
            C3.l lVar = new C3.l(iArrH2[1], f);
            C3.l lVar2 = new C3.l(iArrH[i21], f);
            C3.l[] lVarArr = new C3.l[2];
            lVarArr[i21] = lVar;
            lVarArr[1] = lVar2;
            return new C3.j(string, null, lVarArr, C3.a.i);
        } catch (Throwable th2) {
            aVar.i();
            throw th2;
        }
    }

    public final void i(K3.a aVar, int i) throws NotFoundException {
        int i4 = this.f5779a * 10;
        if (i4 >= i) {
            i4 = i;
        }
        for (int i6 = i - 1; i4 > 0 && i6 >= 0 && !aVar.d(i6); i6--) {
            i4--;
        }
        if (i4 != 0) {
            throw NotFoundException.c;
        }
    }
}
