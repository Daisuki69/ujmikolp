package uk;

import java.util.Arrays;
import qk.i;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements sk.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20351d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f20349a = {127.5f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f20350b = {127.5f};
    public final int c = 1;

    @Override // sk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xk.a apply(xk.a aVar) {
        if (this.f20351d) {
            return aVar;
        }
        aVar.b();
        int[] iArr = aVar.f21026b;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        int i = this.c;
        i.j("Number of means (stddevs) is not same with number of channels (size of last axis).", i == 1 || (iArrCopyOf.length != 0 && iArrCopyOf[iArrCopyOf.length - 1] == i));
        float[] fArrI = aVar.i();
        int i4 = 0;
        for (int i6 = 0; i6 < fArrI.length; i6++) {
            fArrI[i6] = (fArrI[i6] - this.f20349a[i4]) / this.f20350b[i4];
            i4 = (i4 + 1) % i;
        }
        xk.a aVarE = aVar.f21027d ? xk.a.e(1) : xk.a.f(1, iArrCopyOf);
        aVarE.l(fArrI, iArrCopyOf);
        return aVarE;
    }
}
