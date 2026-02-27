package cc;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.domain.store.C1285t0;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListSearchFragment;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaShopProviderProductsListSearchFragment f9355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f9356b;

    public v(MayaShopProviderProductsListSearchFragment mayaShopProviderProductsListSearchFragment, LinearLayoutManager linearLayoutManager) {
        this.f9355a = mayaShopProviderProductsListSearchFragment;
        this.f9356b = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        kotlin.jvm.internal.j.g(recyclerView, numX49.tnTj78("btQC"));
        this.f9355a.f14094i0 = i == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        kotlin.jvm.internal.j.g(recyclerView, numX49.tnTj78("btQ4"));
        MayaShopProviderProductsListSearchFragment mayaShopProviderProductsListSearchFragment = this.f9355a;
        if (mayaShopProviderProductsListSearchFragment.f14097l0 || mayaShopProviderProductsListSearchFragment.f14094i0) {
            return;
        }
        int iFindLastVisibleItemPosition = this.f9356b.findLastVisibleItemPosition();
        ac.F f = this.f9355a.f14092g0;
        if (iFindLastVisibleItemPosition != (f != null ? f.getItemCount() : 0) - 1 || i4 <= 4) {
            return;
        }
        Xb.w wVarG1 = this.f9355a.G1();
        String str = ((MayaShopProviderProductsListSearchFragment) ((bc.i) wVarG1.c.get())).f14095j0;
        if (((MayaShopProviderProductsListSearchFragment) ((bc.i) wVarG1.c.get())).f14091f0 || str.length() < 2) {
            return;
        }
        ((MayaShopProviderProductsListSearchFragment) ((bc.i) wVarG1.c.get())).f14091f0 = true;
        ac.F f3 = ((MayaShopProviderProductsListSearchFragment) ((bc.i) wVarG1.c.get())).f14092g0;
        if ((f3 == null || !f3.f7087d) && f3 != null) {
            f3.f(true);
        }
        int i6 = ((MayaShopProviderProductsListSearchFragment) ((bc.i) wVarG1.c.get())).f14090e0 + 1;
        new Lh.d(new Lh.d(new Lh.h(C1285t0.f(wVarG1.e, wVarG1.f.e().mShopConfig().mDefaultCategory(), str, ((MayaShopProviderProductsListSearchFragment) ((bc.i) wVarG1.c.get())).H1(), i6), zh.b.a(), 0), new F.i(str, i6, 4, wVarG1), 2), new Xb.v(wVarG1, str, 2), 0).e();
    }
}
