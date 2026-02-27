package se;

import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListFragment;
import dOYHB6.tiZVw8.numX49;
import ue.r;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f20062b;

    public /* synthetic */ g(i iVar, int i) {
        this.f20061a = i;
        this.f20062b = iVar;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f20061a) {
            case 0:
                i iVar = this.f20062b;
                ((ShopV3ProviderProductsListFragment) ((ve.f) iVar.c.get())).m0 = false;
                ((ShopV3ProviderProductsListFragment) ((ve.f) iVar.c.get())).C1();
                return;
            case 1:
                ((ShopV3ProviderProductsListFragment) ((ve.f) this.f20062b.c.get())).m0 = false;
                return;
            default:
                i iVar2 = this.f20062b;
                ((ShopV3ProviderProductsListFragment) ((ve.f) iVar2.c.get())).m0 = false;
                ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment = (ShopV3ProviderProductsListFragment) ((ve.f) iVar2.c.get());
                r rVar = shopV3ProviderProductsListFragment.f14841j0;
                String strTnTj78 = numX49.tnTj78("bF3Py");
                if (rVar == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                if (rVar.e()) {
                    r rVar2 = shopV3ProviderProductsListFragment.f14841j0;
                    if (rVar2 != null) {
                        rVar2.f(false);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n(strTnTj78);
                        throw null;
                    }
                }
                return;
        }
    }
}
