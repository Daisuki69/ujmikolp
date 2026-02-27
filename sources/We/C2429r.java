package we;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListSearchFragment;

/* JADX INFO: renamed from: we.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2429r implements Toolbar.OnMenuItemClickListener, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ShopV3ProviderProductsListFragment f20770a;

    public /* synthetic */ C2429r(ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment) {
        this.f20770a = shopV3ProviderProductsListFragment;
    }

    @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem item) {
        String str = ShopV3ProviderProductsListFragment.f14827o0;
        kotlin.jvm.internal.j.g(item, "item");
        if (item.getItemId() != R.id.pma_menu_shop_search_icon) {
            return false;
        }
        ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment = this.f20770a;
        InterfaceC2432u interfaceC2432u = shopV3ProviderProductsListFragment.f14842k0;
        if (interfaceC2432u == null) {
            kotlin.jvm.internal.j.n("mShopProviderProductsListFragmentListener");
            throw null;
        }
        ShopProvider shopProvider = shopV3ProviderProductsListFragment.f14844n0;
        if (shopProvider == null) {
            kotlin.jvm.internal.j.n("mShopProvider");
            throw null;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("search_provider", shopProvider);
        ShopV3ProviderProductsListSearchFragment shopV3ProviderProductsListSearchFragment = new ShopV3ProviderProductsListSearchFragment();
        shopV3ProviderProductsListSearchFragment.setArguments(bundle);
        AbstractC1236z.h((ShopV3Activity) interfaceC2432u, R.id.pma_activity_shop_v3_fragment_container, shopV3ProviderProductsListSearchFragment);
        return false;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment = this.f20770a;
        String str = ShopV3ProviderProductsListFragment.f14827o0;
        Callback.onRefresh_enter();
        try {
            ShopV3ProviderProductsListFragment.D1(shopV3ProviderProductsListFragment);
        } finally {
            Callback.onRefresh_exit();
        }
    }
}
