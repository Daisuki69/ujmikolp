package we;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PurchaseHistoryPageFragment;
import oi.C1983a;

/* JADX INFO: renamed from: we.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2404I extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ShopV3PurchaseHistoryPageFragment f20739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f20740b;

    public C2404I(ShopV3PurchaseHistoryPageFragment shopV3PurchaseHistoryPageFragment, LinearLayoutManager linearLayoutManager) {
        this.f20739a = shopV3PurchaseHistoryPageFragment;
        this.f20740b = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        kotlin.jvm.internal.j.g(recyclerView, "recyclerView");
        this.f20739a.f14867c0 = i == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        kotlin.jvm.internal.j.g(recyclerView, "recyclerView");
        if (this.f20739a.f14867c0) {
            return;
        }
        int iFindLastVisibleItemPosition = this.f20740b.findLastVisibleItemPosition();
        ue.x xVar = this.f20739a.f14870f0;
        if (xVar == null) {
            kotlin.jvm.internal.j.n("mShopV3PurchaseHistoryItemAdapter");
            throw null;
        }
        if (iFindLastVisibleItemPosition == xVar.getItemCount() - 1) {
            Xb.A aA1 = this.f20739a.A1();
            if (aA1.h) {
                return;
            }
            ue.x xVar2 = ((ShopV3PurchaseHistoryPageFragment) ((ve.j) aA1.c.get())).f14870f0;
            if (xVar2 == null) {
                kotlin.jvm.internal.j.n("mShopV3PurchaseHistoryItemAdapter");
                throw null;
            }
            if (!xVar2.e) {
                xVar2.f(true);
            }
            aA1.h = true;
            new Lh.d(new Lh.d(new Lh.h(aA1.e.a(aA1.f6550g + 1, aA1.f), zh.b.a(), 0), new p8.a(aA1, 17), 2), new C1983a(aA1, 17), 0).e();
        }
    }
}
