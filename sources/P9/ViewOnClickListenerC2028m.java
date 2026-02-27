package p9;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantPaymentFragment;
import l9.C1819q;

/* JADX INFO: renamed from: p9.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC2028m implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaQRPHMerchantPaymentFragment f19082b;

    public /* synthetic */ ViewOnClickListenerC2028m(MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment, int i) {
        this.f19081a = i;
        this.f19082b = mayaQRPHMerchantPaymentFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f19081a) {
            case 0:
                MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment = this.f19082b;
                Callback.onClick_enter(view);
                try {
                    MayaQRPHMerchantPaymentFragment.R1(mayaQRPHMerchantPaymentFragment);
                    return;
                } finally {
                }
            case 1:
                MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment2 = this.f19082b;
                Callback.onClick_enter(view);
                try {
                    ((C1819q) mayaQRPHMerchantPaymentFragment2.Q1()).l();
                    return;
                } finally {
                }
            default:
                MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment3 = this.f19082b;
                Callback.onClick_enter(view);
                try {
                    ((C1819q) mayaQRPHMerchantPaymentFragment3.Q1()).l();
                    return;
                } finally {
                }
        }
    }
}
