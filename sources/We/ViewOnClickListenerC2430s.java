package we;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListFragment;

/* JADX INFO: renamed from: we.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC2430s implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShopV3ProviderProductsListFragment f20772b;

    public /* synthetic */ ViewOnClickListenerC2430s(ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment, int i) {
        this.f20771a = i;
        this.f20772b = shopV3ProviderProductsListFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment = this.f20772b;
        switch (this.f20771a) {
            case 0:
                String str = ShopV3ProviderProductsListFragment.f14827o0;
                Callback.onClick_enter(view);
                try {
                    ((se.i) shopV3ProviderProductsListFragment.A1()).k();
                    return;
                } finally {
                }
            default:
                String str2 = ShopV3ProviderProductsListFragment.f14827o0;
                Callback.onClick_enter(view);
                try {
                    ((se.i) shopV3ProviderProductsListFragment.A1()).k();
                    return;
                } finally {
                }
        }
    }
}
