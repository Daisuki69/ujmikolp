package cc;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.domain.store.C1285t0;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopSearchFragment;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class J extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaShopSearchFragment f9331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f9332b;

    public J(MayaShopSearchFragment mayaShopSearchFragment, LinearLayoutManager linearLayoutManager) {
        this.f9331a = mayaShopSearchFragment;
        this.f9332b = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        kotlin.jvm.internal.j.g(recyclerView, numX49.tnTj78("btQe"));
        this.f9331a.f14172k0 = i == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        ac.F f;
        kotlin.jvm.internal.j.g(recyclerView, numX49.tnTj78("btQ8"));
        MayaShopSearchFragment mayaShopSearchFragment = this.f9331a;
        if (mayaShopSearchFragment.f14174n0 || mayaShopSearchFragment.f14172k0) {
            return;
        }
        int iFindLastVisibleItemPosition = this.f9332b.findLastVisibleItemPosition();
        ac.F f3 = this.f9331a.f14167f0;
        kotlin.jvm.internal.j.d(f3);
        if (iFindLastVisibleItemPosition == f3.getItemCount() - 1) {
            Xb.w wVarG1 = this.f9331a.G1();
            String str = ((MayaShopSearchFragment) ((bc.o) wVarG1.c.get())).f14173l0;
            if (((MayaShopSearchFragment) ((bc.o) wVarG1.c.get())).f14171j0 || str.length() < 2) {
                return;
            }
            ((MayaShopSearchFragment) ((bc.o) wVarG1.c.get())).f14171j0 = true;
            MayaShopSearchFragment mayaShopSearchFragment2 = (MayaShopSearchFragment) ((bc.o) wVarG1.c.get());
            ac.F f7 = mayaShopSearchFragment2.f14167f0;
            Boolean boolValueOf = f7 != null ? Boolean.valueOf(f7.f7087d) : null;
            kotlin.jvm.internal.j.d(boolValueOf);
            if (!boolValueOf.booleanValue() && (f = mayaShopSearchFragment2.f14167f0) != null) {
                f.f(true);
            }
            int i6 = ((MayaShopSearchFragment) ((bc.o) wVarG1.c.get())).f14170i0 + 1;
            new Lh.d(new Lh.d(new Lh.h(C1285t0.e(wVarG1.e, wVarG1.f.e().mShopConfig().mDefaultCategory(), str, i6), zh.b.a(), 0), new F.i(str, i6, 5, wVarG1), 2), new Xb.D(wVarG1, str, 2), 0).e();
        }
    }
}
