package cc;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaShopProviderProductsListFragment f9352b;

    public /* synthetic */ r(MayaShopProviderProductsListFragment mayaShopProviderProductsListFragment, int i) {
        this.f9351a = i;
        this.f9352b = mayaShopProviderProductsListFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MayaShopProviderProductsListFragment mayaShopProviderProductsListFragment = this.f9352b;
        switch (this.f9351a) {
            case 0:
                String str = MayaShopProviderProductsListFragment.f14064E0;
                Callback.onClick_enter(view);
                try {
                    s sVar = mayaShopProviderProductsListFragment.f14069B0;
                    if (sVar == null) {
                        kotlin.jvm.internal.j.n("mShopProviderProductsListFragmentListener");
                        throw null;
                    }
                    ShopProvider shopProvider = mayaShopProviderProductsListFragment.f14071D0;
                    if (shopProvider != null) {
                        ((MayaShopV2Activity) sVar).f2(shopProvider);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mShopProvider");
                        throw null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            case 1:
                String str2 = MayaShopProviderProductsListFragment.f14064E0;
                Callback.onClick_enter(view);
                try {
                    ((Xb.u) mayaShopProviderProductsListFragment.P1()).k();
                    return;
                } finally {
                }
            default:
                String str3 = MayaShopProviderProductsListFragment.f14064E0;
                Callback.onClick_enter(view);
                try {
                    ((Xb.u) mayaShopProviderProductsListFragment.P1()).k();
                    return;
                } finally {
                }
        }
    }
}
