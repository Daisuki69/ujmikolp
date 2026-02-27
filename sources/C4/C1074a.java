package c4;

import A7.f;
import C3.b;
import C3.i;
import C3.j;
import C3.k;
import C3.l;
import C3.m;
import E1.c;
import K3.d;
import We.s;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.paymaya.domain.store.A0;
import d4.g;
import e2.C1421c;
import e4.C1424a;
import e4.C1426c;
import e4.C1427d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: renamed from: c4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1074a implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l[] f9285b = new l[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0 f9286a = new A0(2);

    @Override // C3.i
    public final j a(f fVar, EnumMap enumMap) throws NotFoundException, ChecksumException, FormatException {
        ArrayList arrayList;
        int i;
        int i4;
        float f;
        float f3;
        C1424a c1424aF;
        float f7;
        float f10;
        float f11;
        l[] lVarArr;
        l[] lVarArr2;
        d dVarD;
        int i6;
        int i10;
        int i11;
        int iAbs;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 4;
        A0 a02 = this.f9286a;
        int i17 = 0;
        int i18 = 3;
        int i19 = 1;
        if (enumMap == null || !enumMap.containsKey(b.PURE_BARCODE)) {
            K3.b bVarE = fVar.e();
            C1421c c1421c = new C1421c(bVarE);
            m mVar = enumMap == null ? null : (m) enumMap.get(b.NEED_RESULT_POINT_CALLBACK);
            c1421c.c = mVar;
            N.m mVar2 = new N.m(bVarE, mVar);
            boolean z4 = enumMap != null && enumMap.containsKey(b.TRY_HARDER);
            int i20 = bVarE.f2590b;
            int i21 = (i20 * 3) / 388;
            if (i21 < 3 || z4) {
                i21 = 3;
            }
            int[] iArr = new int[5];
            int i22 = i21 - 1;
            boolean zE = false;
            while (true) {
                arrayList = (ArrayList) mVar2.c;
                if (i22 >= i20 || zE) {
                    break;
                }
                N.m.b(iArr);
                int i23 = i18;
                int i24 = i21;
                int i25 = 0;
                int i26 = 0;
                while (true) {
                    i6 = bVarE.f2589a;
                    if (i26 >= i6) {
                        break;
                    }
                    if (bVarE.b(i26, i22)) {
                        if ((i25 & 1) == i19) {
                            i25 += i19;
                        }
                        iArr[i25] = iArr[i25] + i19;
                        i10 = i16;
                    } else if ((i25 & 1) != 0) {
                        i10 = i16;
                        iArr[i25] = iArr[i25] + 1;
                    } else if (i25 == i16) {
                        if (!N.m.c(iArr)) {
                            i10 = i16;
                            int i27 = i19;
                            iArr[0] = iArr[2];
                            iArr[i27] = iArr[i23];
                            iArr[2] = iArr[i10];
                            iArr[i23] = i27;
                            iArr[i10] = 0;
                        } else if (mVar2.d(i22, i26, iArr)) {
                            if (mVar2.f3484a) {
                                zE = mVar2.e();
                                i10 = i16;
                                i11 = 2;
                            } else {
                                if (arrayList.size() > i19) {
                                    Iterator it = arrayList.iterator();
                                    i10 = i16;
                                    C1426c c1426c = null;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i11 = 2;
                                            iAbs = 0;
                                            break;
                                        }
                                        C1426c c1426c2 = (C1426c) it.next();
                                        Iterator it2 = it;
                                        if (c1426c2.f16597d >= 2) {
                                            if (c1426c != null) {
                                                mVar2.f3484a = true;
                                                i11 = 2;
                                                iAbs = ((int) (Math.abs(c1426c.f727a - c1426c2.f727a) - Math.abs(c1426c.f728b - c1426c2.f728b))) / 2;
                                                break;
                                            }
                                            c1426c = c1426c2;
                                        }
                                        it = it2;
                                    }
                                } else {
                                    i10 = i16;
                                    iAbs = 0;
                                    i11 = 2;
                                }
                                if (iAbs > iArr[i11]) {
                                    i22 += (iAbs - r3) - 2;
                                    i26 = i6 - 1;
                                }
                            }
                            N.m.b(iArr);
                            i25 = 0;
                            i24 = i11;
                        } else {
                            i10 = i16;
                            int i28 = i19;
                            iArr[0] = iArr[2];
                            iArr[i28] = iArr[i23];
                            iArr[2] = iArr[i10];
                            iArr[i23] = i28;
                            iArr[i10] = 0;
                        }
                        i25 = i23;
                    } else {
                        i10 = i16;
                        i25++;
                        iArr[i25] = iArr[i25] + 1;
                    }
                    i26++;
                    i16 = i10;
                    i19 = 1;
                }
                int i29 = i16;
                if (N.m.c(iArr) && mVar2.d(i22, i6, iArr)) {
                    int i30 = iArr[0];
                    if (mVar2.f3484a) {
                        i21 = i30;
                        zE = mVar2.e();
                    } else {
                        i21 = i30;
                    }
                } else {
                    i21 = i24;
                }
                i22 += i21;
                i18 = i23;
                i16 = i29;
                i19 = 1;
            }
            int i31 = i16;
            int i32 = i18;
            int size = arrayList.size();
            if (size < i32) {
                throw NotFoundException.c;
            }
            float f12 = 0.0f;
            if (size > i32) {
                Iterator it3 = arrayList.iterator();
                float f13 = 0.0f;
                float f14 = 0.0f;
                while (it3.hasNext()) {
                    float f15 = ((C1426c) it3.next()).c;
                    f13 += f15;
                    f14 += f15 * f15;
                }
                float f16 = f13 / size;
                float fSqrt = (float) Math.sqrt((f14 / r1) - (f16 * f16));
                Collections.sort(arrayList, new C1427d(f16, 1));
                float fMax = Math.max(0.2f * f16, fSqrt);
                int i33 = 0;
                while (i33 < arrayList.size() && arrayList.size() > 3) {
                    if (Math.abs(((C1426c) arrayList.get(i33)).c - f16) > fMax) {
                        arrayList.remove(i33);
                        i33--;
                    }
                    i33++;
                }
            }
            if (arrayList.size() > 3) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    f12 += ((C1426c) it4.next()).c;
                }
                i4 = 0;
                Collections.sort(arrayList, new C1427d(f12 / arrayList.size(), 0));
                i = 3;
                arrayList.subList(3, arrayList.size()).clear();
            } else {
                i = 3;
                i4 = 0;
            }
            C1426c c1426c3 = (C1426c) arrayList.get(i4);
            C1426c c1426c4 = (C1426c) arrayList.get(1);
            C1426c c1426c5 = (C1426c) arrayList.get(2);
            C1426c[] c1426cArr = new C1426c[i];
            c1426cArr[i4] = c1426c3;
            c1426cArr[1] = c1426c4;
            c1426cArr[2] = c1426c5;
            l.b(c1426cArr);
            C1426c c1426c6 = c1426cArr[i4];
            C1426c c1426c7 = c1426cArr[1];
            C1426c c1426c8 = c1426cArr[2];
            float fB = (c1421c.b(c1426c7, c1426c6) + c1421c.b(c1426c7, c1426c8)) / 2.0f;
            if (fB < 1.0f) {
                throw NotFoundException.c;
            }
            int iA = (x3.d.A(l.a(c1426c7, c1426c6) / fB) + x3.d.A(l.a(c1426c7, c1426c8) / fB)) / 2;
            int i34 = iA + 7;
            int i35 = i34 & 3;
            if (i35 == 0) {
                i34 = iA + 8;
            } else if (i35 == 2) {
                i34 = iA + 6;
            } else if (i35 == 3) {
                throw NotFoundException.c;
            }
            int[] iArr2 = g.e;
            if (i34 % 4 != 1) {
                throw FormatException.a();
            }
            try {
                g gVarC = g.c((i34 - 17) / 4);
                int i36 = (gVarC.f16272a * 4) + 10;
                int length = gVarC.f16273b.length;
                float f17 = c1426c7.f728b;
                float f18 = c1426c7.f727a;
                float f19 = c1426c8.f728b;
                float f20 = c1426c8.f727a;
                float f21 = c1426c6.f728b;
                float f22 = c1426c6.f727a;
                if (length > 0) {
                    f = f22;
                    float f23 = 1.0f - (3.0f / i36);
                    int iA2 = (int) s.a((f20 - f18) + f22, f18, f23, f18);
                    int iA3 = (int) s.a((f19 - f17) + f21, f17, f23, f17);
                    f3 = f21;
                    for (int i37 = i31; i37 <= 16; i37 <<= 1) {
                        try {
                            c1424aF = c1421c.f(fB, i37, iA2, iA3);
                            break;
                        } catch (NotFoundException unused) {
                        }
                    }
                } else {
                    f = f22;
                    f3 = f21;
                }
                c1424aF = null;
                float f24 = i34 - 3.5f;
                if (c1424aF != null) {
                    f7 = c1424aF.f727a;
                    f10 = c1424aF.f728b;
                    f11 = f24 - 3.0f;
                } else {
                    f7 = (f20 - f18) + f;
                    f10 = (f19 - f17) + f3;
                    f11 = f24;
                }
                K3.b bVarN = c.n(bVarE, i34, i34, K3.f.a(3.5f, 3.5f, f24, 3.5f, f11, f11, 3.5f, f24, c1426c7.f727a, c1426c7.f728b, c1426c8.f727a, c1426c8.f728b, f7, f10, c1426c6.f727a, c1426c6.f728b));
                if (c1424aF == null) {
                    lVarArr = new l[]{c1426c6, c1426c7, c1426c8};
                } else {
                    lVarArr = new l[i31];
                    lVarArr[0] = c1426c6;
                    lVarArr[1] = c1426c7;
                    lVarArr[2] = c1426c8;
                    lVarArr[3] = c1424aF;
                }
                lVarArr2 = lVarArr;
                dVarD = a02.d(bVarN, enumMap);
            } catch (IllegalArgumentException unused2) {
                throw FormatException.a();
            }
        } else {
            K3.b bVarE2 = fVar.e();
            int[] iArrE = bVarE2.e();
            int[] iArrC = bVarE2.c();
            if (iArrE == null || iArrC == null) {
                throw NotFoundException.c;
            }
            int i38 = iArrE[0];
            int i39 = iArrE[1];
            int i40 = 0;
            boolean z5 = true;
            while (true) {
                i13 = bVarE2.f2589a;
                i14 = i17;
                i15 = bVarE2.f2590b;
                if (i38 >= i13 || i39 >= i15) {
                    break;
                }
                if (z5 != bVarE2.b(i38, i39)) {
                    i40++;
                    if (i40 == 5) {
                        break;
                    }
                    z5 = !z5;
                }
                i38++;
                i39++;
                i17 = i14;
            }
            if (i38 == i13 || i39 == i15) {
                throw NotFoundException.c;
            }
            int i41 = iArrE[i14];
            float f25 = (i38 - i41) / 7.0f;
            int i42 = iArrE[1];
            int i43 = iArrC[1];
            int i44 = iArrC[i14];
            if (i41 >= i44 || i42 >= i43) {
                throw NotFoundException.c;
            }
            int i45 = i43 - i42;
            if (i45 != i44 - i41 && (i44 = i41 + i45) >= i13) {
                throw NotFoundException.c;
            }
            int iRound = Math.round(((i44 - i41) + 1) / f25);
            int iRound2 = Math.round((i45 + 1) / f25);
            if (iRound <= 0 || iRound2 <= 0) {
                throw NotFoundException.c;
            }
            if (iRound2 != iRound) {
                throw NotFoundException.c;
            }
            int i46 = (int) (f25 / 2.0f);
            int i47 = i42 + i46;
            int i48 = i41 + i46;
            int i49 = (((int) ((iRound - 1) * f25)) + i48) - i44;
            if (i49 > 0) {
                if (i49 > i46) {
                    throw NotFoundException.c;
                }
                i48 -= i49;
            }
            int i50 = (((int) ((iRound2 - 1) * f25)) + i47) - i43;
            if (i50 > 0) {
                if (i50 > i46) {
                    throw NotFoundException.c;
                }
                i47 -= i50;
            }
            K3.b bVar = new K3.b(iRound, iRound2);
            for (int i51 = i14; i51 < iRound2; i51++) {
                int i52 = ((int) (i51 * f25)) + i47;
                for (int i53 = i14; i53 < iRound; i53++) {
                    if (bVarE2.b(((int) (i53 * f25)) + i48, i52)) {
                        bVar.f(i53, i51);
                    }
                }
            }
            dVarD = a02.d(bVar, enumMap);
            lVarArr2 = f9285b;
        }
        Object obj = dVarD.f2598g;
        if (obj instanceof d4.f) {
            ((d4.f) obj).getClass();
            if (lVarArr2.length >= 3) {
                l lVar = lVarArr2[0];
                lVarArr2[0] = lVarArr2[2];
                lVarArr2[2] = lVar;
            }
        }
        j jVar = new j(dVarD.f2595a, (byte[]) dVarD.f2597d, lVarArr2, C3.a.f694l);
        ArrayList arrayList2 = (ArrayList) dVarD.f;
        if (arrayList2 != null) {
            jVar.a(k.f723b, arrayList2);
        }
        String str = (String) dVarD.e;
        if (str != null) {
            jVar.a(k.c, str);
        }
        int i54 = dVarD.f2596b;
        if (i54 >= 0 && (i12 = dVarD.c) >= 0) {
            jVar.a(k.i, Integer.valueOf(i12));
            jVar.a(k.j, Integer.valueOf(i54));
        }
        return jVar;
    }

    @Override // C3.i
    public final void reset() {
    }
}
