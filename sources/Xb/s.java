package Xb;

import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f6592b;

    public /* synthetic */ s(u uVar, int i) {
        this.f6591a = i;
        this.f6592b = uVar;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f6591a) {
            case 0:
                ((MayaShopProviderProductsListFragment) ((bc.h) this.f6592b.c.get())).f14070C0 = false;
                return;
            case 1:
                u uVar = this.f6592b;
                ((MayaShopProviderProductsListFragment) ((bc.h) uVar.c.get())).f14070C0 = false;
                SpringView springView = ((MayaShopProviderProductsListFragment) ((bc.h) uVar.c.get())).w0;
                if (springView != null) {
                    springView.i();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                    throw null;
                }
            default:
                u uVar2 = this.f6592b;
                ((MayaShopProviderProductsListFragment) ((bc.h) uVar2.c.get())).f14070C0 = false;
                MayaShopProviderProductsListFragment mayaShopProviderProductsListFragment = (MayaShopProviderProductsListFragment) ((bc.h) uVar2.c.get());
                ac.s sVar = mayaShopProviderProductsListFragment.f14068A0;
                if (sVar == null) {
                    kotlin.jvm.internal.j.n("mProductsAdapter");
                    throw null;
                }
                if (sVar.f()) {
                    ac.s sVar2 = mayaShopProviderProductsListFragment.f14068A0;
                    if (sVar2 != null) {
                        sVar2.g(false);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mProductsAdapter");
                        throw null;
                    }
                }
                return;
        }
    }
}
