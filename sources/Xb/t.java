package Xb;

import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListFragment;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f6594b;

    public /* synthetic */ t(u uVar, int i) {
        this.f6593a = i;
        this.f6594b = uVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f6593a) {
            case 0:
                List productsList = (List) obj;
                kotlin.jvm.internal.j.g(productsList, "productsList");
                ((MayaShopProviderProductsListFragment) ((bc.h) this.f6594b.c.get())).f14079z0 = 1;
                this.f6594b.l(productsList);
                ((MayaShopProviderProductsListFragment) ((bc.h) this.f6594b.c.get())).y0 = true;
                break;
            default:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                u uVar = this.f6594b;
                PayMayaError payMayaErrorF = uVar.f(throwable, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                uVar.m(payMayaErrorF);
                break;
        }
    }
}
