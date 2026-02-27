package L3;

import C3.l;
import K3.b;
import com.google.zxing.NotFoundException;
import x3.d;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2808b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2809d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2810g;

    public a(b bVar, int i, int i4, int i6) throws NotFoundException {
        this.f2807a = bVar;
        int i10 = bVar.f2590b;
        this.f2808b = i10;
        int i11 = bVar.f2589a;
        this.c = i11;
        int i12 = i / 2;
        int i13 = i4 - i12;
        this.f2809d = i13;
        int i14 = i4 + i12;
        this.e = i14;
        int i15 = i6 - i12;
        this.f2810g = i15;
        int i16 = i6 + i12;
        this.f = i16;
        if (i15 < 0 || i13 < 0 || i16 >= i10 || i14 >= i11) {
            throw NotFoundException.c;
        }
    }

    public final boolean a(int i, int i4, int i6, boolean z4) {
        b bVar = this.f2807a;
        if (z4) {
            while (i <= i4) {
                if (bVar.b(i, i6)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i4) {
            if (bVar.b(i6, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final l[] b() throws NotFoundException {
        int i;
        char c;
        ?? r22;
        int i4;
        int i6 = this.f2809d;
        int i10 = this.e;
        int i11 = this.f2810g;
        int i12 = this.f;
        boolean z4 = false;
        ?? r11 = false;
        ?? r12 = false;
        ?? r13 = false;
        ?? r14 = false;
        ?? r15 = false;
        ?? r10 = true;
        while (true) {
            i = this.c;
            if (r10 != true) {
                c = 2;
                r22 = false;
                break;
            }
            ?? r17 = false;
            boolean zA = true;
            while (true) {
                if ((!zA && r11 == true) || i10 >= i) {
                    break;
                }
                zA = a(i11, i12, i10, false);
                if (zA) {
                    i10++;
                    r11 = true;
                    r17 = true;
                } else if (r11 == false) {
                    i10++;
                }
            }
            if (i10 >= i) {
                r22 = true;
                c = 2;
                break;
            }
            boolean zA2 = true;
            c = 2;
            while (true) {
                i4 = this.f2808b;
                if ((!zA2 && r12 == true) || i12 >= i4) {
                    break;
                }
                zA2 = a(i6, i10, i12, true);
                if (zA2) {
                    i12++;
                    r12 = true;
                    r17 = true;
                } else if (r12 == false) {
                    i12++;
                }
            }
            if (i12 >= i4) {
                break;
            }
            boolean zA3 = true;
            while (true) {
                if ((!zA3 && r13 == true) || i6 < 0) {
                    break;
                }
                zA3 = a(i11, i12, i6, false);
                if (zA3) {
                    i6--;
                    r13 = true;
                    r17 = true;
                } else if (r13 == false) {
                    i6--;
                }
            }
            if (i6 < 0) {
                break;
            }
            boolean zA4 = true;
            r10 = r17;
            while (true) {
                if ((!zA4 && r15 == true) || i11 < 0) {
                    break;
                }
                zA4 = a(i6, i10, i11, true);
                if (zA4) {
                    i11--;
                    r10 = true;
                    r15 = true;
                } else if (r15 == false) {
                    i11--;
                }
            }
            if (i11 < 0) {
                break;
            }
            if (r10 != false) {
                r14 = true;
            }
        }
        r22 = true;
        if (r22 == true || !r14 == true) {
            throw NotFoundException.c;
        }
        int i13 = i10 - i6;
        l lVarC = null;
        l lVarC2 = null;
        for (int i14 = 1; lVarC2 == null && i14 < i13; i14++) {
            lVarC2 = c(i6, i12 - i14, i6 + i14, i12);
        }
        if (lVarC2 == null) {
            throw NotFoundException.c;
        }
        int i15 = 1;
        l lVarC3 = null;
        while (lVarC3 == null && i15 < i13) {
            lVarC3 = c(i6, i11 + i15, i6 + i15, i11);
            i15++;
            z4 = z4;
        }
        boolean z5 = z4;
        if (lVarC3 == null) {
            throw NotFoundException.c;
        }
        l lVarC4 = null;
        for (int i16 = 1; lVarC4 == null && i16 < i13; i16++) {
            lVarC4 = c(i10, i11 + i16, i10 - i16, i11);
        }
        if (lVarC4 == null) {
            throw NotFoundException.c;
        }
        for (int i17 = 1; lVarC == null && i17 < i13; i17++) {
            lVarC = c(i10, i12 - i17, i10 - i17, i12);
        }
        if (lVarC == null) {
            throw NotFoundException.c;
        }
        float f = i / 2.0f;
        float f3 = lVarC.f727a;
        float f7 = lVarC2.f727a;
        float f10 = lVarC4.f727a;
        float f11 = lVarC3.f727a;
        float f12 = lVarC.f728b;
        float f13 = lVarC2.f728b;
        float f14 = lVarC4.f728b;
        float f15 = lVarC3.f728b;
        if (f3 < f) {
            l lVar = new l(f11 - 1.0f, f15 + 1.0f);
            l lVar2 = new l(f7 + 1.0f, f13 + 1.0f);
            l lVar3 = new l(f10 - 1.0f, f14 - 1.0f);
            l lVar4 = new l(f3 + 1.0f, f12 - 1.0f);
            l[] lVarArr = new l[4];
            lVarArr[z5 ? 1 : 0] = lVar;
            lVarArr[1] = lVar2;
            lVarArr[c] = lVar3;
            lVarArr[3] = lVar4;
            return lVarArr;
        }
        l lVar5 = new l(f11 + 1.0f, f15 + 1.0f);
        l lVar6 = new l(f7 + 1.0f, f13 - 1.0f);
        l lVar7 = new l(f10 - 1.0f, f14 + 1.0f);
        l lVar8 = new l(f3 - 1.0f, f12 - 1.0f);
        l[] lVarArr2 = new l[4];
        lVarArr2[z5 ? 1 : 0] = lVar5;
        lVarArr2[1] = lVar6;
        lVarArr2[c] = lVar7;
        lVarArr2[3] = lVar8;
        return lVarArr2;
    }

    public final l c(float f, float f3, float f7, float f10) {
        float f11 = f - f7;
        float f12 = f3 - f10;
        int iA = d.A((float) Math.sqrt((f12 * f12) + (f11 * f11)));
        float f13 = iA;
        float f14 = (f7 - f) / f13;
        float f15 = (f10 - f3) / f13;
        for (int i = 0; i < iA; i++) {
            float f16 = i;
            int iA2 = d.A((f16 * f14) + f);
            int iA3 = d.A((f16 * f15) + f3);
            if (this.f2807a.b(iA2, iA3)) {
                return new l(iA2, iA3);
            }
        }
        return null;
    }

    public a(b bVar) {
        this(bVar, 10, bVar.f2589a / 2, bVar.f2590b / 2);
    }
}
