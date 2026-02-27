package we;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.domain.store.C1285t0;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3SearchFragment;
import ue.C2309A;

/* JADX INFO: renamed from: we.P, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2411P extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ShopV3SearchFragment f20747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f20748b;

    public C2411P(ShopV3SearchFragment shopV3SearchFragment, LinearLayoutManager linearLayoutManager) {
        this.f20747a = shopV3SearchFragment;
        this.f20748b = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        kotlin.jvm.internal.j.g(recyclerView, "recyclerView");
        this.f20747a.f14893i0 = i == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        C2309A c2309a;
        kotlin.jvm.internal.j.g(recyclerView, "recyclerView");
        if (this.f20747a.f14893i0) {
            return;
        }
        int iFindLastVisibleItemPosition = this.f20748b.findLastVisibleItemPosition();
        C2309A c2309a2 = this.f20747a.f14891g0;
        Integer numValueOf = c2309a2 != null ? Integer.valueOf(c2309a2.getItemCount()) : null;
        kotlin.jvm.internal.j.d(numValueOf);
        if (iFindLastVisibleItemPosition != numValueOf.intValue() - 1 || i4 <= 4) {
            return;
        }
        Xb.w wVarA1 = this.f20747a.A1();
        String str = ((ShopV3SearchFragment) ((ve.m) wVarA1.c.get())).f14894j0;
        if (((ShopV3SearchFragment) ((ve.m) wVarA1.c.get())).f14890f0 || str.length() < 2) {
            return;
        }
        ((ShopV3SearchFragment) ((ve.m) wVarA1.c.get())).f14890f0 = true;
        ShopV3SearchFragment shopV3SearchFragment = (ShopV3SearchFragment) ((ve.m) wVarA1.c.get());
        C2309A c2309a3 = shopV3SearchFragment.f14891g0;
        Boolean boolValueOf = c2309a3 != null ? Boolean.valueOf(c2309a3.f20284d) : null;
        kotlin.jvm.internal.j.d(boolValueOf);
        if (!boolValueOf.booleanValue() && (c2309a = shopV3SearchFragment.f14891g0) != null) {
            c2309a.f(true);
        }
        int i6 = ((ShopV3SearchFragment) ((ve.m) wVarA1.c.get())).f14889e0 + 1;
        new Lh.d(new Lh.d(new Lh.h(C1285t0.e(wVarA1.e, wVarA1.f.e().mShopConfig().mDefaultCategory(), str, i6), zh.b.a(), 0), new F.i(str, i6, 11, wVarA1), 2), new se.m(wVarA1, str, 2), 0).e();
    }
}
