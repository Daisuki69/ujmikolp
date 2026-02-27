package T3;

import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.Arrays;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k implements C3.i {
    public static float d(int[] iArr, int[] iArr2, float f) {
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
        float f3 = i;
        float f7 = f3 / i4;
        float f10 = f * f7;
        float f11 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            float f12 = iArr2[i10] * f7;
            float f13 = iArr[i10];
            float f14 = f13 > f12 ? f13 - f12 : f12 - f13;
            if (f14 > f10) {
                return Float.POSITIVE_INFINITY;
            }
            f11 += f14;
        }
        return f11 / f3;
    }

    public static void e(int i, K3.a aVar, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i4 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int i6 = aVar.f2588b;
        if (i >= i6) {
            throw NotFoundException.c;
        }
        boolean z4 = !aVar.d(i);
        while (i < i6) {
            if (aVar.d(i) == z4) {
                i4++;
                if (i4 == length) {
                    break;
                }
                iArr[i4] = 1;
                z4 = !z4;
            } else {
                iArr[i4] = iArr[i4] + 1;
            }
            i++;
        }
        if (i4 != length) {
            if (i4 != length - 1 || i != i6) {
                throw NotFoundException.c;
            }
        }
    }

    public static void f(int i, K3.a aVar, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean zD = aVar.d(i);
        while (i > 0 && length >= 0) {
            i--;
            if (aVar.d(i) != zD) {
                length--;
                zD = !zD;
            }
        }
        if (length >= 0) {
            throw NotFoundException.c;
        }
        e(i + 1, aVar, iArr);
    }

    @Override // C3.i
    public C3.j a(A7.f fVar, EnumMap enumMap) throws NotFoundException {
        try {
            return c(fVar, enumMap);
        } catch (NotFoundException e) {
            if (enumMap == null || !enumMap.containsKey(C3.b.TRY_HARDER) || !((K3.e) fVar.f210b).f2599a.c()) {
                throw e;
            }
            C3.e eVarD = ((K3.e) fVar.f210b).f2599a.d();
            C3.j jVarC = c(new A7.f(new K3.e(eVarD), 6), enumMap);
            EnumMap enumMap2 = jVarC.e;
            C3.k kVar = C3.k.f722a;
            int iIntValue = 270;
            if (enumMap2 != null && enumMap2.containsKey(kVar)) {
                iIntValue = (((Integer) enumMap2.get(kVar)).intValue() + 270) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
            }
            jVarC.a(kVar, Integer.valueOf(iIntValue));
            C3.l[] lVarArr = jVarC.c;
            if (lVarArr != null) {
                int i = eVarD.f713b;
                for (int i4 = 0; i4 < lVarArr.length; i4++) {
                    C3.l lVar = lVarArr[i4];
                    lVarArr[i4] = new C3.l((i - lVar.f728b) - 1.0f, lVar.f727a);
                }
            }
            return jVarC;
        }
    }

    public abstract C3.j b(int i, K3.a aVar, EnumMap enumMap);

    public final C3.j c(A7.f fVar, EnumMap enumMap) throws NotFoundException {
        EnumMap enumMap2;
        int i;
        C3.l lVar;
        A7.f fVar2 = fVar;
        EnumMap enumMap3 = enumMap;
        C3.e eVar = ((K3.e) fVar2.f210b).f2599a;
        int i4 = eVar.f712a;
        int i6 = eVar.f713b;
        K3.a aVar = new K3.a(i4);
        int i10 = 1;
        boolean z4 = enumMap3 != null && enumMap3.containsKey(C3.b.TRY_HARDER);
        int iMax = Math.max(1, i6 >> (z4 ? 8 : 5));
        int i11 = z4 ? i6 : 15;
        int i12 = i6 / 2;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = i13 + 1;
            int i15 = i14 / 2;
            if ((i13 & 1) != 0) {
                i15 = -i15;
            }
            int i16 = (i15 * iMax) + i12;
            if (i16 < 0 || i16 >= i6) {
                break;
            }
            try {
                aVar = fVar2.f(aVar, i16);
                int i17 = 0;
                while (i17 < 2) {
                    if (i17 == i10) {
                        aVar.i();
                        if (enumMap3 != null) {
                            C3.b bVar = C3.b.NEED_RESULT_POINT_CALLBACK;
                            if (enumMap3.containsKey(bVar)) {
                                EnumMap enumMap4 = new EnumMap(C3.b.class);
                                enumMap4.putAll(enumMap3);
                                enumMap4.remove(bVar);
                                enumMap3 = enumMap4;
                            }
                        }
                    }
                    try {
                        C3.j jVarB = b(i16, aVar, enumMap3);
                        if (i17 == i10) {
                            i = i10;
                            try {
                                jVarB.a(C3.k.f722a, 180);
                                C3.l[] lVarArr = jVarB.c;
                                if (lVarArr != null) {
                                    float f = i4;
                                    try {
                                        lVar = lVarArr[0];
                                        enumMap2 = enumMap3;
                                    } catch (ReaderException unused) {
                                        enumMap2 = enumMap3;
                                    }
                                    try {
                                        lVarArr[0] = new C3.l((f - lVar.f727a) - 1.0f, lVar.f728b);
                                        C3.l lVar2 = lVarArr[i];
                                        lVarArr[i] = new C3.l((f - lVar2.f727a) - 1.0f, lVar2.f728b);
                                    } catch (ReaderException unused2) {
                                        continue;
                                        i17++;
                                        enumMap3 = enumMap2;
                                        i10 = i;
                                    }
                                }
                            } catch (ReaderException unused3) {
                                enumMap2 = enumMap3;
                                i17++;
                                enumMap3 = enumMap2;
                                i10 = i;
                            }
                        }
                        return jVarB;
                    } catch (ReaderException unused4) {
                        enumMap2 = enumMap3;
                        i = i10;
                    }
                }
            } catch (NotFoundException unused5) {
            }
            fVar2 = fVar;
            i13 = i14;
            i10 = i10;
        }
        throw NotFoundException.c;
    }

    @Override // C3.i
    public void reset() {
    }
}
