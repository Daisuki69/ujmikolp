package we;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListFragment;

/* JADX INFO: renamed from: we.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC2431t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShopV3ProviderProductsListFragment f20774b;

    public /* synthetic */ RunnableC2431t(ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment, int i) {
        this.f20773a = i;
        this.f20774b = shopV3ProviderProductsListFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20773a) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout = this.f20774b.f14838g0;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(true);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                    throw null;
                }
            default:
                SwipeRefreshLayout swipeRefreshLayout2 = this.f20774b.f14838g0;
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                    throw null;
                }
        }
    }
}
