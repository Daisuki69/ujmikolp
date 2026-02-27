package we;

import Kh.T;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListFragment;
import ph.C2070f1;

/* JADX INFO: renamed from: we.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2433v extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ShopV3ProviderProductsListFragment f20775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f20776b;

    public C2433v(ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment, LinearLayoutManager linearLayoutManager) {
        this.f20775a = shopV3ProviderProductsListFragment;
        this.f20776b = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        kotlin.jvm.internal.j.g(recyclerView, "recyclerView");
        this.f20775a.f14843l0 = i == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        kotlin.jvm.internal.j.g(recyclerView, "recyclerView");
        if (this.f20775a.f14843l0) {
            return;
        }
        int iFindLastVisibleItemPosition = this.f20776b.findLastVisibleItemPosition();
        ue.r rVar = this.f20775a.f14841j0;
        if (rVar == null) {
            kotlin.jvm.internal.j.n("mProductsAdapter");
            throw null;
        }
        if (iFindLastVisibleItemPosition != rVar.getItemCount() - 1 || i4 <= 4) {
            return;
        }
        se.i iVar = (se.i) this.f20775a.A1();
        if (((ShopV3ProviderProductsListFragment) ((ve.f) iVar.c.get())).m0) {
            return;
        }
        ((ShopV3ProviderProductsListFragment) ((ve.f) iVar.c.get())).m0 = true;
        ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment = (ShopV3ProviderProductsListFragment) ((ve.f) iVar.c.get());
        ue.r rVar2 = shopV3ProviderProductsListFragment.f14841j0;
        if (rVar2 == null) {
            kotlin.jvm.internal.j.n("mProductsAdapter");
            throw null;
        }
        if (!rVar2.e()) {
            ue.r rVar3 = shopV3ProviderProductsListFragment.f14841j0;
            if (rVar3 == null) {
                kotlin.jvm.internal.j.n("mProductsAdapter");
                throw null;
            }
            rVar3.f(true);
        }
        int i6 = 5;
        new T(i6, new Lh.d(new Lh.d(new Lh.h(iVar.f20065d.c(((ShopV3ProviderProductsListFragment) ((ve.f) iVar.c.get())).f14840i0 + 1, ((ShopV3ProviderProductsListFragment) ((ve.f) iVar.c.get())).B1().getName(), false), zh.b.a(), 0), new C2070f1(iVar, 11), 2), new p8.a(iVar, 15), 0), new se.g(iVar, 2)).e();
    }
}
