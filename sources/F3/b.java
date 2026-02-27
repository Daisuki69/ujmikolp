package F3;

import C3.l;
import E1.c;
import G6.r;
import K3.f;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import x3.d;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f1543g = {3808, 476, 2107, 1799};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K3.b f1544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1545b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1546d;
    public int e;
    public int f;

    public b(K3.b bVar) {
        this.f1544a = bVar;
    }

    public static l[] b(l[] lVarArr, float f, float f3) {
        float f7 = f3 / (f * 2.0f);
        l lVar = lVarArr[0];
        float f10 = lVar.f727a;
        l lVar2 = lVarArr[2];
        float f11 = lVar2.f727a;
        float f12 = f10 - f11;
        float f13 = lVar.f728b;
        float f14 = lVar2.f728b;
        float f15 = f13 - f14;
        float f16 = (f10 + f11) / 2.0f;
        float f17 = (f13 + f14) / 2.0f;
        float f18 = f12 * f7;
        float f19 = f15 * f7;
        l lVar3 = new l(f16 + f18, f17 + f19);
        l lVar4 = new l(f16 - f18, f17 - f19);
        l lVar5 = lVarArr[1];
        float f20 = lVar5.f727a;
        l lVar6 = lVarArr[3];
        float f21 = lVar6.f727a;
        float f22 = f20 - f21;
        float f23 = lVar5.f728b;
        float f24 = lVar6.f728b;
        float f25 = f23 - f24;
        float f26 = (f20 + f21) / 2.0f;
        float f27 = (f23 + f24) / 2.0f;
        float f28 = f22 * f7;
        float f29 = f7 * f25;
        return new l[]{lVar3, new l(f26 + f28, f27 + f29), lVar4, new l(f26 - f28, f27 - f29)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final D3.a a(boolean z4) throws NotFoundException {
        l lVarA;
        l lVar;
        l lVar2;
        l lVar3;
        char c;
        l lVar4;
        l lVar5;
        l lVar6;
        l lVar7;
        int i;
        int i4;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j;
        int i15;
        a aVar;
        a aVar2;
        boolean z5;
        a aVar3;
        int i16 = -1;
        int i17 = 2;
        int i18 = 1;
        K3.b bVar = this.f1544a;
        try {
            l[] lVarArrB = new L3.a(bVar).b();
            lVar2 = lVarArrB[0];
            lVar3 = lVarArrB[1];
            lVar = lVarArrB[2];
            lVarA = lVarArrB[3];
        } catch (NotFoundException unused) {
            int i19 = bVar.f2589a / 2;
            int i20 = bVar.f2590b / 2;
            int i21 = i19 + 7;
            int i22 = i20 - 7;
            l lVarA2 = e(new a(i21, i22, 0), false, 1, -1).a();
            int i23 = i20 + 7;
            l lVarA3 = e(new a(i21, i23, 0), false, 1, 1).a();
            int i24 = i19 - 7;
            l lVarA4 = e(new a(i24, i23, 0), false, -1, 1).a();
            lVarA = e(new a(i24, i22, 0), false, -1, -1).a();
            lVar = lVarA4;
            lVar2 = lVarA2;
            lVar3 = lVarA3;
        }
        int iA = d.A((((lVar2.f727a + lVarA.f727a) + lVar3.f727a) + lVar.f727a) / 4.0f);
        int iA2 = d.A((((lVar2.f728b + lVarA.f728b) + lVar3.f728b) + lVar.f728b) / 4.0f);
        char c10 = 15;
        try {
            l[] lVarArrB2 = new L3.a(bVar, 15, iA, iA2).b();
            lVar7 = lVarArrB2[0];
            lVar4 = lVarArrB2[1];
            l lVar8 = lVarArrB2[2];
            lVar6 = lVarArrB2[3];
            c = 3;
            lVar5 = lVar8;
        } catch (NotFoundException unused2) {
            int i25 = iA + 7;
            int i26 = iA2 - 7;
            l lVarA5 = e(new a(i25, i26, 0), false, 1, -1).a();
            c = 3;
            int i27 = iA2 + 7;
            l lVarA6 = e(new a(i25, i27, 0), false, 1, 1).a();
            int i28 = iA - 7;
            l lVarA7 = e(new a(i28, i27, 0), false, -1, 1).a();
            l lVarA8 = e(new a(i28, i26, 0), false, -1, -1).a();
            lVar4 = lVarA6;
            lVar5 = lVarA7;
            lVar6 = lVarA8;
            lVar7 = lVarA5;
        }
        a aVar4 = new a(d.A((((lVar7.f727a + lVar6.f727a) + lVar4.f727a) + lVar5.f727a) / 4.0f), d.A((((lVar7.f728b + lVar6.f728b) + lVar4.f728b) + lVar5.f728b) / 4.0f), 0);
        this.e = 1;
        boolean z8 = true;
        a aVar5 = aVar4;
        a aVar6 = aVar5;
        a aVar7 = aVar6;
        while (true) {
            int i29 = this.e;
            char c11 = c10;
            i = aVar7.c;
            i4 = aVar7.f1542b;
            i6 = aVar4.c;
            i10 = aVar4.f1542b;
            if (i29 >= 9) {
                i11 = i17;
                i12 = i18;
                break;
            }
            a aVarE = e(aVar4, z8, i18, i16);
            a aVarE2 = e(aVar5, z8, i18, i18);
            a aVarE3 = e(aVar6, z8, i16, i18);
            a aVarE4 = e(aVar7, z8, i16, i16);
            int i30 = i16;
            if (this.e > i17) {
                int i31 = aVarE4.f1542b;
                i12 = i18;
                int i32 = aVarE.f1542b;
                int i33 = i31 - i32;
                i11 = i17;
                int i34 = aVarE4.c;
                int i35 = aVarE.c;
                int i36 = i34 - i35;
                int i37 = (i36 * i36) + (i33 * i33);
                aVar2 = aVarE4;
                z5 = z8;
                int i38 = i4 - i10;
                int i39 = i - i6;
                double dSqrt = (((float) Math.sqrt(i37)) * this.e) / (((float) Math.sqrt((i39 * i39) + (i38 * i38))) * (this.e + 2));
                if (dSqrt < 0.75d || dSqrt > 1.25d) {
                    break;
                }
                a aVar8 = new a(i32 - 3, i35 + 3, 0);
                a aVar9 = new a(aVarE2.f1542b - 3, aVarE2.c - 3, 0);
                aVar = aVarE;
                a aVar10 = new a(aVarE3.f1542b + 3, aVarE3.c - 3, 0);
                aVar3 = aVarE2;
                a aVar11 = new a(i31 + 3, i34 + 3, 0);
                int iC = c(aVar11, aVar8);
                if (iC == 0 || c(aVar8, aVar9) != iC || c(aVar9, aVar10) != iC || c(aVar10, aVar11) != iC) {
                    break;
                }
            } else {
                i11 = i17;
                i12 = i18;
                aVar = aVarE;
                aVar2 = aVarE4;
                z5 = z8;
                aVar3 = aVarE2;
            }
            z8 = !z5;
            this.e++;
            aVar6 = aVarE3;
            c10 = c11;
            i16 = i30;
            i18 = i12;
            i17 = i11;
            aVar5 = aVar3;
            aVar7 = aVar2;
            aVar4 = aVar;
        }
        int i40 = this.e;
        if (i40 != 5 && i40 != 7) {
            throw NotFoundException.c;
        }
        this.f1545b = i40 == 5 ? i12 : 0;
        l lVar9 = new l(i10 + 0.5f, i6 - 0.5f);
        l lVar10 = new l(aVar5.f1542b + 0.5f, aVar5.c + 0.5f);
        l lVar11 = new l(aVar6.f1542b - 0.5f, aVar6.c + 0.5f);
        l lVar12 = new l(i4 - 0.5f, i - 0.5f);
        l[] lVarArr = new l[4];
        lVarArr[0] = lVar9;
        lVarArr[i12] = lVar10;
        lVarArr[i11] = lVar11;
        lVarArr[c] = lVar12;
        l[] lVarArrB3 = b(lVarArr, r1 - 3, i40 * 2);
        if (z4) {
            l lVar13 = lVarArrB3[0];
            lVarArrB3[0] = lVarArrB3[i11];
            lVarArrB3[i11] = lVar13;
        }
        if (!g(lVarArrB3[0]) || !g(lVarArrB3[i12]) || !g(lVarArrB3[i11]) || !g(lVarArrB3[c])) {
            throw NotFoundException.c;
        }
        int i41 = this.e * 2;
        int[] iArr = {h(lVarArrB3[0], lVarArrB3[i12], i41), h(lVarArrB3[i12], lVarArrB3[i11], i41), h(lVarArrB3[i11], lVarArrB3[c], i41), h(lVarArrB3[c], lVarArrB3[0], i41)};
        int i42 = 0;
        for (int i43 = 0; i43 < 4; i43++) {
            int i44 = iArr[i43];
            i42 = (i42 << 3) + ((i44 >> (i41 - 2)) << 1) + (i44 & 1);
        }
        int i45 = ((i42 & 1) << 11) + (i42 >> 1);
        for (int i46 = 0; i46 < 4; i46++) {
            int i47 = i11;
            if (Integer.bitCount(f1543g[i46] ^ i45) <= i47) {
                this.f = i46;
                long j6 = 0;
                int i48 = 0;
                for (int i49 = 4; i48 < i49; i49 = 4) {
                    int i50 = iArr[(this.f + i48) % i49];
                    if (this.f1545b) {
                        j = j6 << 7;
                        i15 = (i50 >> 1) & 127;
                    } else {
                        j = j6 << 10;
                        i15 = ((i50 >> 2) & 992) + ((i50 >> 1) & 31);
                    }
                    j6 = j + ((long) i15);
                    i48++;
                }
                if (this.f1545b) {
                    i13 = 7;
                    i14 = 2;
                } else {
                    i13 = 10;
                    i14 = 4;
                }
                int i51 = i13 - i14;
                int[] iArr2 = new int[i13];
                for (int i52 = i13 - 1; i52 >= 0; i52--) {
                    iArr2[i52] = ((int) j6) & 15;
                    j6 >>= 4;
                }
                try {
                    new r(M3.a.f3049k, 19).e(i51, iArr2);
                    int i53 = 0;
                    for (int i54 = 0; i54 < i14; i54++) {
                        i53 = (i53 << 4) + iArr2[i54];
                    }
                    if (this.f1545b) {
                        this.c = (i53 >> 6) + 1;
                        this.f1546d = (i53 & 63) + 1;
                    } else {
                        this.c = (i53 >> 11) + 1;
                        this.f1546d = (i53 & 2047) + 1;
                    }
                    int i55 = this.f;
                    l lVar14 = lVarArrB3[i55 % 4];
                    l lVar15 = lVarArrB3[(i55 + 1) % 4];
                    l lVar16 = lVarArrB3[(i55 + 2) % 4];
                    l lVar17 = lVarArrB3[(i55 + 3) % 4];
                    int iD = d();
                    float f = iD / 2.0f;
                    float f3 = this.e;
                    float f7 = f - f3;
                    float f10 = f + f3;
                    return new D3.a(c.n(bVar, iD, iD, f.a(f7, f7, f10, f7, f10, f10, f7, f10, lVar14.f727a, lVar14.f728b, lVar15.f727a, lVar15.f728b, lVar16.f727a, lVar16.f728b, lVar17.f727a, lVar17.f728b)), b(lVarArrB3, this.e * 2, d()), this.f1545b, this.f1546d, this.c);
                } catch (ReedSolomonException unused3) {
                    throw NotFoundException.c;
                }
            }
            i11 = i47;
        }
        throw NotFoundException.c;
    }

    public final int c(a aVar, a aVar2) {
        int i = aVar.f1542b;
        int i4 = i - aVar2.f1542b;
        int i6 = aVar.c;
        int i10 = i6 - aVar2.c;
        float fSqrt = (float) Math.sqrt((i10 * i10) + (i4 * i4));
        float f = (r1 - i) / fSqrt;
        float f3 = (r13 - i6) / fSqrt;
        float f7 = i;
        float f10 = i6;
        K3.b bVar = this.f1544a;
        boolean zB = bVar.b(i, i6);
        int iCeil = (int) Math.ceil(fSqrt);
        int i11 = 0;
        for (int i12 = 0; i12 < iCeil; i12++) {
            f7 += f;
            f10 += f3;
            if (bVar.b(d.A(f7), d.A(f10)) != zB) {
                i11++;
            }
        }
        float f11 = i11 / fSqrt;
        if (f11 <= 0.1f || f11 >= 0.9f) {
            return (f11 <= 0.1f) == zB ? 1 : -1;
        }
        return 0;
    }

    public final int d() {
        if (this.f1545b) {
            return (this.c * 4) + 11;
        }
        int i = this.c;
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return ((((i - 4) / 8) + 1) * 2) + (i * 4) + 15;
    }

    public final a e(a aVar, boolean z4, int i, int i4) {
        K3.b bVar;
        int i6 = aVar.f1542b + i;
        int i10 = aVar.c;
        while (true) {
            i10 += i4;
            boolean zF = f(i6, i10);
            bVar = this.f1544a;
            if (!zF || bVar.b(i6, i10) != z4) {
                break;
            }
            i6 += i;
        }
        int i11 = i6 - i;
        int i12 = i10 - i4;
        while (f(i11, i12) && bVar.b(i11, i12) == z4) {
            i11 += i;
        }
        int i13 = i11 - i;
        while (f(i13, i12) && bVar.b(i13, i12) == z4) {
            i12 += i4;
        }
        return new a(i13, i12 - i4, 0);
    }

    public final boolean f(int i, int i4) {
        if (i < 0) {
            return false;
        }
        K3.b bVar = this.f1544a;
        return i < bVar.f2589a && i4 > 0 && i4 < bVar.f2590b;
    }

    public final boolean g(l lVar) {
        return f(d.A(lVar.f727a), d.A(lVar.f728b));
    }

    public final int h(l lVar, l lVar2, int i) {
        float f = lVar.f727a - lVar2.f727a;
        float f3 = lVar.f728b;
        float f7 = lVar2.f728b;
        float f10 = f3 - f7;
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f * f));
        float f11 = fSqrt / i;
        float f12 = lVar2.f727a;
        float f13 = lVar.f727a;
        float f14 = ((f12 - f13) * f11) / fSqrt;
        float f15 = ((f7 - f3) * f11) / fSqrt;
        int i4 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            float f16 = i6;
            if (this.f1544a.b(d.A((f16 * f14) + f13), d.A((f16 * f15) + f3))) {
                i4 |= 1 << ((i - i6) - 1);
            }
        }
        return i4;
    }
}
