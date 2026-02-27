package Xb;

import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f6580b;

    public /* synthetic */ m(o oVar, int i) {
        this.f6579a = i;
        this.f6580b = oVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f6579a) {
            case 0:
                o oVar = this.f6580b;
                PayMayaError payMayaErrorF = oVar.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF, "paymayaErrorHandling(...)");
                oVar.t(Integer.valueOf(payMayaErrorF.mErrorCode()), payMayaErrorF.mSpiel());
                if (!payMayaErrorF.isSessionTimeout()) {
                    if (!payMayaErrorF.isNetworkError()) {
                        bc.e eVar = (bc.e) oVar.c.get();
                        String strMSpiel = payMayaErrorF.mSpiel();
                        kotlin.jvm.internal.j.f(strMSpiel, "mSpiel(...)");
                        MayaShopPaymentFragment mayaShopPaymentFragment = (MayaShopPaymentFragment) eVar;
                        mayaShopPaymentFragment.getClass();
                        MayaBaseLoadingFragment.N1(mayaShopPaymentFragment, 100, strMSpiel, null, new cc.l(mayaShopPaymentFragment, 0), 28);
                    } else {
                        bc.e eVar2 = (bc.e) oVar.c.get();
                        String strMSpiel2 = payMayaErrorF.mSpiel();
                        kotlin.jvm.internal.j.f(strMSpiel2, "mSpiel(...)");
                        MayaShopPaymentFragment mayaShopPaymentFragment2 = (MayaShopPaymentFragment) eVar2;
                        mayaShopPaymentFragment2.getClass();
                        MayaBaseLoadingFragment.N1(mayaShopPaymentFragment2, 200, strMSpiel2, null, new cc.l(mayaShopPaymentFragment2, 3), 28);
                    }
                }
                break;
            default:
                io.reactivex.rxjava3.disposables.b it = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it, "it");
                this.f6580b.e(new io.reactivex.rxjava3.disposables.b[0]);
                break;
        }
    }
}
