package we;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProvidersCollectionFragment;

/* JADX INFO: renamed from: we.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC2399D implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShopV3ProvidersCollectionFragment f20736b;

    public /* synthetic */ ViewOnClickListenerC2399D(ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment, int i) {
        this.f20735a = i;
        this.f20736b = shopV3ProvidersCollectionFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20735a) {
            case 0:
                ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment = this.f20736b;
                Callback.onClick_enter(view);
                try {
                    ((se.l) shopV3ProvidersCollectionFragment.B1()).k();
                    return;
                } finally {
                }
            default:
                ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment2 = this.f20736b;
                Callback.onClick_enter(view);
                try {
                    ((se.l) shopV3ProvidersCollectionFragment2.B1()).k();
                    return;
                } finally {
                }
        }
    }
}
