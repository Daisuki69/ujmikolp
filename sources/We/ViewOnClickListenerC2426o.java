package we;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment;

/* JADX INFO: renamed from: we.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC2426o implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShopV3PaymentFragment f20768b;

    public /* synthetic */ ViewOnClickListenerC2426o(ShopV3PaymentFragment shopV3PaymentFragment, int i) {
        this.f20767a = i;
        this.f20768b = shopV3PaymentFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20767a) {
            case 0:
                ShopV3PaymentFragment shopV3PaymentFragment = this.f20768b;
                Callback.onClick_enter(view);
                try {
                    ((se.f) shopV3PaymentFragment.G1()).l();
                    return;
                } finally {
                }
            case 1:
                ShopV3PaymentFragment shopV3PaymentFragment2 = this.f20768b;
                Callback.onClick_enter(view);
                try {
                    shopV3PaymentFragment2.Q1();
                    return;
                } finally {
                }
            case 2:
                ShopV3PaymentFragment shopV3PaymentFragment3 = this.f20768b;
                Callback.onClick_enter(view);
                try {
                    shopV3PaymentFragment3.I1();
                    return;
                } finally {
                }
            case 3:
                ShopV3PaymentFragment shopV3PaymentFragment4 = this.f20768b;
                Callback.onClick_enter(view);
                try {
                    ShopV3PaymentFragment.L1(shopV3PaymentFragment4);
                    return;
                } finally {
                }
            case 4:
                ShopV3PaymentFragment shopV3PaymentFragment5 = this.f20768b;
                Callback.onClick_enter(view);
                try {
                    ((se.f) shopV3PaymentFragment5.G1()).l();
                    return;
                } finally {
                }
            case 5:
                ShopV3PaymentFragment shopV3PaymentFragment6 = this.f20768b;
                Callback.onClick_enter(view);
                try {
                    ShopV3PaymentFragment.O1(shopV3PaymentFragment6);
                    return;
                } finally {
                }
            default:
                ShopV3PaymentFragment shopV3PaymentFragment7 = this.f20768b;
                Callback.onClick_enter(view);
                try {
                    shopV3PaymentFragment7.F1().setText("");
                    return;
                } finally {
                }
        }
    }
}
