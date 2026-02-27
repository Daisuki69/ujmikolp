package ba;

import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersFragment;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bb.f f8589b;

    public /* synthetic */ k(Bb.f fVar, int i) {
        this.f8588a = i;
        this.f8589b = fVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f8588a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(th2, numX49.tnTj78("bucZC"));
                PayMayaError payMayaErrorF = this.f8589b.f(th2, true);
                Bb.f fVar = this.f8589b;
                int iMErrorCode = payMayaErrorF.mErrorCode();
                String strMSpiel = payMayaErrorF.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel, numX49.tnTj78("bucZ4"));
                fVar.B(iMErrorCode, strMSpiel, ((MayaBillersFragment) ((ga.b) fVar.c.get())).P1());
                fVar.x(payMayaErrorF);
                break;
            default:
                Throwable th3 = (Throwable) obj;
                kotlin.jvm.internal.j.g(th3, numX49.tnTj78("bucZe"));
                PayMayaError payMayaErrorF2 = this.f8589b.f(th3, true);
                Bb.f fVar2 = this.f8589b;
                int iMErrorCode2 = payMayaErrorF2.mErrorCode();
                String strMSpiel2 = payMayaErrorF2.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel2, numX49.tnTj78("bucZ8"));
                fVar2.B(iMErrorCode2, strMSpiel2, ((MayaBillersFragment) ((ga.b) fVar2.c.get())).P1());
                fVar2.x(payMayaErrorF2);
                break;
        }
    }
}
