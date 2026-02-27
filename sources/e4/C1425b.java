package e4;

import C3.m;
import java.util.ArrayList;

/* JADX INFO: renamed from: e4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1425b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K3.b f16593a;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16595d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f16596g;
    public final m i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16594b = new ArrayList(5);
    public final int[] h = new int[3];

    public C1425b(K3.b bVar, int i, int i4, int i6, int i10, float f, m mVar) {
        this.f16593a = bVar;
        this.c = i;
        this.f16595d = i4;
        this.e = i6;
        this.f = i10;
        this.f16596g = f;
        this.i = mVar;
    }

    public final boolean a(int[] iArr) {
        float f = this.f16596g;
        float f3 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f3) {
                return false;
            }
        }
        return true;
    }

    public final C1424a b(int i, int i4, int[] iArr) {
        int i6 = iArr[0];
        int i10 = iArr[1];
        int i11 = i6 + i10 + iArr[2];
        float f = (i4 - r5) - (i10 / 2.0f);
        int i12 = (int) f;
        int i13 = i10 * 2;
        K3.b bVar = this.f16593a;
        int i14 = bVar.f2590b;
        int[] iArr2 = this.h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i15 = i;
        while (i15 >= 0 && bVar.b(i12, i15)) {
            int i16 = iArr2[1];
            if (i16 > i13) {
                break;
            }
            iArr2[1] = i16 + 1;
            i15--;
        }
        float f3 = Float.NaN;
        if (i15 >= 0 && iArr2[1] <= i13) {
            while (i15 >= 0 && !bVar.b(i12, i15)) {
                int i17 = iArr2[0];
                if (i17 > i13) {
                    break;
                }
                iArr2[0] = i17 + 1;
                i15--;
            }
            if (iArr2[0] <= i13) {
                int i18 = i + 1;
                while (i18 < i14 && bVar.b(i12, i18)) {
                    int i19 = iArr2[1];
                    if (i19 > i13) {
                        break;
                    }
                    iArr2[1] = i19 + 1;
                    i18++;
                }
                if (i18 != i14 && iArr2[1] <= i13) {
                    while (i18 < i14 && !bVar.b(i12, i18)) {
                        int i20 = iArr2[2];
                        if (i20 > i13) {
                            break;
                        }
                        iArr2[2] = i20 + 1;
                        i18++;
                    }
                    int i21 = iArr2[2];
                    if (i21 <= i13 && Math.abs(((iArr2[0] + iArr2[1]) + i21) - i11) * 5 < i11 * 2 && a(iArr2)) {
                        f3 = (i18 - iArr2[2]) - (iArr2[1] / 2.0f);
                    }
                }
            }
        }
        if (Float.isNaN(f3)) {
            return null;
        }
        float f7 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        ArrayList<C1424a> arrayList = this.f16594b;
        for (C1424a c1424a : arrayList) {
            if (Math.abs(f3 - c1424a.f728b) <= f7) {
                float f10 = c1424a.f727a;
                if (Math.abs(f - f10) <= f7) {
                    float f11 = c1424a.c;
                    float fAbs = Math.abs(f7 - f11);
                    if (fAbs <= 1.0f || fAbs <= f11) {
                        return new C1424a((f10 + f) / 2.0f, (c1424a.f728b + f3) / 2.0f, (f11 + f7) / 2.0f);
                    }
                } else {
                    continue;
                }
            }
        }
        C1424a c1424a2 = new C1424a(f, f3, f7);
        arrayList.add(c1424a2);
        m mVar = this.i;
        if (mVar == null) {
            return null;
        }
        mVar.a(c1424a2);
        return null;
    }
}
