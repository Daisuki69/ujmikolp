package cc;

import ac.C0674C;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryPageFragment;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaShopPurchaseHistoryPageFragment f9322a;

    public B(MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment) {
        this.f9322a = mayaShopPurchaseHistoryPageFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        kotlin.jvm.internal.j.g(recyclerView, numX49.tnTj78("btQK"));
        this.f9322a.f14111p0 = i == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        LinearLayoutManager linearLayoutManager;
        kotlin.jvm.internal.j.g(recyclerView, numX49.tnTj78("btQw"));
        MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment = this.f9322a;
        if (mayaShopPurchaseHistoryPageFragment.f14111p0 || (linearLayoutManager = mayaShopPurchaseHistoryPageFragment.w0) == null) {
            return;
        }
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        C0674C c0674c = this.f9322a.f14114s0;
        String strTnTj78 = numX49.tnTj78("btQc");
        if (c0674c == null) {
            kotlin.jvm.internal.j.n(strTnTj78);
            throw null;
        }
        if (iFindLastVisibleItemPosition == c0674c.getItemCount() - 1) {
            Xb.A aQ1 = this.f9322a.Q1();
            if (aQ1.h) {
                return;
            }
            C0674C c0674c2 = ((MayaShopPurchaseHistoryPageFragment) ((bc.l) aQ1.c.get())).f14114s0;
            if (c0674c2 == null) {
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            }
            if (!c0674c2.e) {
                c0674c2.f(true);
            }
            aQ1.h = true;
            new Lh.d(new Lh.d(new Lh.h(aQ1.e.a(aQ1.f6550g + 1, aQ1.f), zh.b.a(), 0), new Qd.a(aQ1, 14), 2), new Q6.s(aQ1, 15), 0).e();
        }
    }
}
