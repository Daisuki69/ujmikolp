package we;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3HomePageFragment;

/* JADX INFO: renamed from: we.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC2420i implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShopV3HomePageFragment f20761b;

    public /* synthetic */ ViewOnClickListenerC2420i(ShopV3HomePageFragment shopV3HomePageFragment, int i) {
        this.f20760a = i;
        this.f20761b = shopV3HomePageFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20760a) {
            case 0:
                ShopV3HomePageFragment shopV3HomePageFragment = this.f20761b;
                Callback.onClick_enter(view);
                try {
                    ((se.e) shopV3HomePageFragment.B1()).n();
                    return;
                } finally {
                }
            default:
                ShopV3HomePageFragment shopV3HomePageFragment2 = this.f20761b;
                Callback.onClick_enter(view);
                try {
                    ((se.e) shopV3HomePageFragment2.B1()).n();
                    return;
                } finally {
                }
        }
    }
}
