package n4;

import android.graphics.Rect;
import android.util.Log;
import dOYHB6.tiZVw8.numX49;
import m4.p;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18614a;

    @Override // n4.i
    public final float a(p pVar, p pVar2) {
        int i;
        switch (this.f18614a) {
            case 0:
                if (pVar.f18368a <= 0 || pVar.f18369b <= 0) {
                    return 0.0f;
                }
                p pVarA = pVar.a(pVar2);
                float f = pVarA.f18368a * 1.0f;
                float fPow = f / pVar.f18368a;
                if (fPow > 1.0f) {
                    fPow = (float) Math.pow(1.0f / fPow, 1.1d);
                }
                float f3 = ((pVarA.f18369b * 1.0f) / pVar2.f18369b) + (f / pVar2.f18368a);
                return ((1.0f / f3) / f3) * fPow;
            case 1:
                if (pVar.f18368a <= 0 || pVar.f18369b <= 0) {
                    return 0.0f;
                }
                float f7 = pVar.b(pVar2).f18368a;
                float fPow2 = (f7 * 1.0f) / pVar.f18368a;
                if (fPow2 > 1.0f) {
                    fPow2 = (float) Math.pow(1.0f / fPow2, 1.1d);
                }
                float f10 = ((pVar2.f18369b * 1.0f) / r0.f18369b) * ((pVar2.f18368a * 1.0f) / f7);
                return (((1.0f / f10) / f10) / f10) * fPow2;
            default:
                int i4 = pVar.f18368a;
                if (i4 <= 0 || (i = pVar.f18369b) <= 0) {
                    return 0.0f;
                }
                int i6 = pVar2.f18368a;
                float f11 = (i4 * 1.0f) / i6;
                if (f11 < 1.0f) {
                    f11 = 1.0f / f11;
                }
                float f12 = i;
                float f13 = pVar2.f18369b;
                float f14 = (f12 * 1.0f) / f13;
                if (f14 < 1.0f) {
                    f14 = 1.0f / f14;
                }
                float f15 = (1.0f / f11) / f14;
                float f16 = ((i4 * 1.0f) / f12) / ((i6 * 1.0f) / f13);
                if (f16 < 1.0f) {
                    f16 = 1.0f / f16;
                }
                return (((1.0f / f16) / f16) / f16) * f15;
        }
    }

    @Override // n4.i
    public final Rect b(p pVar, p pVar2) {
        String strTnTj78 = numX49.tnTj78("brEP");
        String strTnTj782 = numX49.tnTj78("brEb");
        String strTnTj783 = numX49.tnTj78("brE2");
        String strTnTj784 = numX49.tnTj78("brEL");
        switch (this.f18614a) {
            case 0:
                p pVarA = pVar.a(pVar2);
                Log.i(strTnTj78, strTnTj784 + pVar + strTnTj783 + pVarA + strTnTj782 + pVar2);
                int i = pVar2.f18368a;
                int i4 = pVarA.f18368a;
                int i6 = (i4 - i) / 2;
                int i10 = pVar2.f18369b;
                int i11 = pVarA.f18369b;
                int i12 = (i11 - i10) / 2;
                return new Rect(-i6, -i12, i4 - i6, i11 - i12);
            case 1:
                p pVarB = pVar.b(pVar2);
                Log.i(strTnTj78, strTnTj784 + pVar + strTnTj783 + pVarB + strTnTj782 + pVar2);
                int i13 = pVar2.f18368a;
                int i14 = pVarB.f18368a;
                int i15 = (i14 - i13) / 2;
                int i16 = pVar2.f18369b;
                int i17 = pVarB.f18369b;
                int i18 = (i17 - i16) / 2;
                return new Rect(-i15, -i18, i14 - i15, i17 - i18);
            default:
                return new Rect(0, 0, pVar2.f18368a, pVar2.f18369b);
        }
    }
}
