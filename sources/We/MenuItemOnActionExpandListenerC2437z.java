package we;

import android.view.MenuItem;
import com.paymaya.common.base.BaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListSearchFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3SearchFragment;

/* JADX INFO: renamed from: we.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class MenuItemOnActionExpandListenerC2437z implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItem f20781b;
    public final /* synthetic */ BaseLoadingFragment c;

    public /* synthetic */ MenuItemOnActionExpandListenerC2437z(MenuItem menuItem, BaseLoadingFragment baseLoadingFragment, int i) {
        this.f20780a = i;
        this.f20781b = menuItem;
        this.c = baseLoadingFragment;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem item) {
        switch (this.f20780a) {
            case 0:
                kotlin.jvm.internal.j.g(item, "item");
                this.f20781b.setVisible(false);
                InterfaceC2436y interfaceC2436y = ((ShopV3ProviderProductsListSearchFragment) this.c).f14851g0;
                if (interfaceC2436y != null) {
                    AbstractC1236z.f((ShopV3Activity) interfaceC2436y);
                    return true;
                }
                kotlin.jvm.internal.j.n("mShopProviderProductsListSearchFragmentListener");
                throw null;
            default:
                kotlin.jvm.internal.j.g(item, "item");
                this.f20781b.setVisible(false);
                InterfaceC2410O interfaceC2410O = ((ShopV3SearchFragment) this.c).f14892h0;
                if (interfaceC2410O == null) {
                    return true;
                }
                ((ShopV3Activity) interfaceC2410O).finish();
                return true;
        }
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem item) {
        switch (this.f20780a) {
            case 0:
                kotlin.jvm.internal.j.g(item, "item");
                break;
            default:
                kotlin.jvm.internal.j.g(item, "item");
                break;
        }
        return true;
    }
}
