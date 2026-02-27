package U3;

import C3.j;
import C3.l;
import C3.m;
import T3.k;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends a {
    public static final int[] i = {1, 10, 34, 70, 126};
    public static final int[] j = {4, 20, 48, 81};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f5933k = {0, 161, 961, 2015, 2715};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f5934l = {0, 336, 1036, 1516};
    public static final int[] m = {8, 6, 4, 3, 1};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f5935n = {2, 4, 6, 8};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[][] f5936o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f5937g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public static void j(ArrayList arrayList, d dVar) {
        if (dVar == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar2 = (d) it.next();
            if (dVar2.f5928a == dVar.f5928a) {
                dVar2.f5932d++;
                return;
            }
        }
        arrayList.add(dVar);
    }

    @Override // T3.k
    public final j b(int i4, K3.a aVar, EnumMap enumMap) throws NotFoundException {
        d dVarL = l(aVar, false, i4, enumMap);
        ArrayList<d> arrayList = this.f5937g;
        j(arrayList, dVarL);
        aVar.i();
        d dVarL2 = l(aVar, true, i4, enumMap);
        ArrayList<d> arrayList2 = this.h;
        j(arrayList2, dVarL2);
        aVar.i();
        for (d dVar : arrayList) {
            if (dVar.f5932d > 1) {
                for (d dVar2 : arrayList2) {
                    if (dVar2.f5932d > 1) {
                        int i6 = ((dVar2.f5929b * 16) + dVar.f5929b) % 79;
                        c cVar = dVar.c;
                        int i10 = cVar.f5930a * 9;
                        c cVar2 = dVar2.c;
                        int i11 = i10 + cVar2.f5930a;
                        if (i11 > 72) {
                            i11--;
                        }
                        if (i11 > 8) {
                            i11--;
                        }
                        if (i6 == i11) {
                            String strValueOf = String.valueOf((((long) dVar.f5928a) * 4537077) + ((long) dVar2.f5928a));
                            StringBuilder sb2 = new StringBuilder(14);
                            for (int length = 13 - strValueOf.length(); length > 0; length--) {
                                sb2.append('0');
                            }
                            sb2.append(strValueOf);
                            int i12 = 0;
                            for (int i13 = 0; i13 < 13; i13++) {
                                int iCharAt = sb2.charAt(i13) - '0';
                                if ((i13 & 1) == 0) {
                                    iCharAt *= 3;
                                }
                                i12 += iCharAt;
                            }
                            int i14 = 10 - (i12 % 10);
                            if (i14 == 10) {
                                i14 = 0;
                            }
                            sb2.append(i14);
                            l[] lVarArr = cVar.c;
                            l[] lVarArr2 = cVar2.c;
                            return new j(sb2.toString(), null, new l[]{lVarArr[0], lVarArr[1], lVarArr2[0], lVarArr2[1]}, C3.a.m);
                        }
                    }
                }
            }
        }
        throw NotFoundException.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[PHI: r14 r15
  0x009c: PHI (r14v7 boolean) = (r14v4 boolean), (r14v15 boolean) binds: [B:50:0x00b8, B:38:0x009a] A[DONT_GENERATE, DONT_INLINE]
  0x009c: PHI (r15v5 boolean) = (r15v2 boolean), (r15v13 boolean) binds: [B:50:0x00b8, B:38:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1 A[PHI: r14 r15
  0x00a1: PHI (r14v6 boolean) = (r14v4 boolean), (r14v15 boolean) binds: [B:50:0x00b8, B:38:0x009a] A[DONT_GENERATE, DONT_INLINE]
  0x00a1: PHI (r15v4 boolean) = (r15v2 boolean), (r15v13 boolean) binds: [B:50:0x00b8, B:38:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final U3.b k(K3.a r21, U3.c r22, boolean r23) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.e.k(K3.a, U3.c, boolean):U3.b");
    }

    public final d l(K3.a aVar, boolean z4, int i4, EnumMap enumMap) {
        try {
            c cVarN = n(aVar, i4, z4, m(aVar, z4));
            m mVar = enumMap == null ? null : (m) enumMap.get(C3.b.NEED_RESULT_POINT_CALLBACK);
            if (mVar != null) {
                float f = (r1[0] + r1[1]) / 2.0f;
                if (z4) {
                    f = (aVar.f2588b - 1) - f;
                }
                mVar.a(new l(f, i4));
            }
            b bVarK = k(aVar, cVarN, true);
            b bVarK2 = k(aVar, cVarN, false);
            return new d((bVarK.f5928a * 1597) + bVarK2.f5928a, (bVarK2.f5929b * 4) + bVarK.f5929b, cVarN);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    public final int[] m(K3.a aVar, boolean z4) throws NotFoundException {
        int[] iArr = this.f5925a;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int i4 = aVar.f2588b;
        int i6 = 0;
        boolean z5 = false;
        while (i6 < i4) {
            z5 = !aVar.d(i6);
            if (z4 == z5) {
                break;
            }
            i6++;
        }
        int i10 = 0;
        int i11 = i6;
        while (i6 < i4) {
            if (aVar.d(i6) != z5) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 != 3) {
                    i10++;
                } else {
                    if (a.i(iArr)) {
                        return new int[]{i11, i6};
                    }
                    i11 += iArr[0] + iArr[1];
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = 0;
                    iArr[3] = 0;
                    i10--;
                }
                iArr[i10] = 1;
                z5 = !z5;
            }
            i6++;
        }
        throw NotFoundException.c;
    }

    public final c n(K3.a aVar, int i4, boolean z4, int[] iArr) throws NotFoundException {
        int i6;
        int i10;
        boolean zD = aVar.d(iArr[0]);
        int i11 = iArr[0] - 1;
        while (i11 >= 0 && zD != aVar.d(i11)) {
            i11--;
        }
        int i12 = i11 + 1;
        int i13 = iArr[0] - i12;
        int[] iArr2 = this.f5925a;
        System.arraycopy(iArr2, 0, iArr2, 1, iArr2.length - 1);
        iArr2[0] = i13;
        int[][] iArr3 = f5936o;
        for (int i14 = 0; i14 < 9; i14++) {
            if (k.d(iArr2, iArr3[i14], 0.45f) < 0.2f) {
                int i15 = iArr[1];
                if (z4) {
                    int i16 = aVar.f2588b - 1;
                    i6 = i16 - i15;
                    i10 = i16 - i12;
                } else {
                    i6 = i15;
                    i10 = i12;
                }
                return new c(i14, new int[]{i12, i15}, i10, i6, i4);
            }
        }
        throw NotFoundException.c;
    }

    @Override // T3.k, C3.i
    public final void reset() {
        this.f5937g.clear();
        this.h.clear();
    }
}
