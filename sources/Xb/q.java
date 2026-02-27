package Xb;

import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderPageProductsListFragment;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f6589b;

    public /* synthetic */ q(r rVar, int i) {
        this.f6588a = i;
        this.f6589b = rVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f6588a) {
            case 0:
                List productsList = (List) obj;
                kotlin.jvm.internal.j.g(productsList, "productsList");
                this.f6589b.k(productsList);
                ((MayaShopProviderPageProductsListFragment) ((bc.g) this.f6589b.c.get())).f14061v0 = 1;
                break;
            default:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                r rVar = this.f6589b;
                PayMayaError payMayaErrorF = rVar.f(throwable, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                rVar.l(payMayaErrorF);
                break;
        }
    }
}
