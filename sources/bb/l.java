package Bb;

import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f411b;

    public /* synthetic */ l(n nVar, int i) {
        this.f410a = i;
        this.f411b = nVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f410a) {
            case 0:
                n nVar = this.f411b;
                PayMayaError payMayaErrorF = nVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                nVar.x(payMayaErrorF);
                break;
            case 1:
                io.reactivex.rxjava3.disposables.b it = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it, "it");
                this.f411b.e(it);
                break;
            case 2:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                n nVar2 = this.f411b;
                PayMayaError payMayaErrorF2 = nVar2.f(it2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                Fb.c cVar = (Fb.c) nVar2.c.get();
                String strMSpiel = payMayaErrorF2.mSpiel();
                MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) cVar;
                mayaSendMoneyFragment.getClass();
                MayaBaseLoadingFragment.N1(mayaSendMoneyFragment, 200, strMSpiel, null, new Gb.h(0), 28);
                break;
            default:
                io.reactivex.rxjava3.disposables.b it3 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                this.f411b.e(it3);
                break;
        }
    }
}
