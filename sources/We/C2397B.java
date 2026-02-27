package we;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.domain.store.C1285t0;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListSearchFragment;
import ue.C2309A;

/* JADX INFO: renamed from: we.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2397B extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ShopV3ProviderProductsListSearchFragment f20731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f20732b;

    public C2397B(ShopV3ProviderProductsListSearchFragment shopV3ProviderProductsListSearchFragment, LinearLayoutManager linearLayoutManager) {
        this.f20731a = shopV3ProviderProductsListSearchFragment;
        this.f20732b = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        kotlin.jvm.internal.j.g(recyclerView, "recyclerView");
        this.f20731a.f14852h0 = i == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        kotlin.jvm.internal.j.g(recyclerView, "recyclerView");
        if (this.f20731a.f14852h0) {
            return;
        }
        int iFindLastVisibleItemPosition = this.f20732b.findLastVisibleItemPosition();
        C2309A c2309a = this.f20731a.f14850f0;
        if (iFindLastVisibleItemPosition != (c2309a != null ? c2309a.getItemCount() : 0) - 1 || i4 <= 4) {
            return;
        }
        Xb.w wVarB1 = this.f20731a.B1();
        String str = ((ShopV3ProviderProductsListSearchFragment) ((ve.g) wVarB1.c.get())).f14853i0;
        if (((ShopV3ProviderProductsListSearchFragment) ((ve.g) wVarB1.c.get())).f14849e0 || str.length() < 2) {
            return;
        }
        ((ShopV3ProviderProductsListSearchFragment) ((ve.g) wVarB1.c.get())).f14849e0 = true;
        C2309A c2309a2 = ((ShopV3ProviderProductsListSearchFragment) ((ve.g) wVarB1.c.get())).f14850f0;
        if ((c2309a2 == null || !c2309a2.f20284d) && c2309a2 != null) {
            c2309a2.f(true);
        }
        int i6 = ((ShopV3ProviderProductsListSearchFragment) ((ve.g) wVarB1.c.get())).f14848d0 + 1;
        new Lh.d(new Lh.d(new Lh.h(C1285t0.f(wVarB1.e, wVarB1.f.e().mShopConfig().mDefaultCategory(), str, ((ShopV3ProviderProductsListSearchFragment) ((ve.g) wVarB1.c.get())).C1(), i6), zh.b.a(), 0), new F.i(str, i6, 10, wVarB1), 2), new se.j(wVarB1, str, 2), 0).e();
    }
}
