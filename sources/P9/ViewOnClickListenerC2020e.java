package p9;

import G5.C0256f;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentFragment;
import l9.C1809g;

/* JADX INFO: renamed from: p9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC2020e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaMerchantPaymentFragment f19078b;

    public /* synthetic */ ViewOnClickListenerC2020e(MayaMerchantPaymentFragment mayaMerchantPaymentFragment, int i) {
        this.f19077a = i;
        this.f19078b = mayaMerchantPaymentFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f19077a) {
            case 0:
                MayaMerchantPaymentFragment mayaMerchantPaymentFragment = this.f19078b;
                Callback.onClick_enter(view);
                try {
                    C1220i c1220iO1 = mayaMerchantPaymentFragment.o1();
                    FragmentActivity activity = mayaMerchantPaymentFragment.getActivity();
                    C1219h c1219hD = C1219h.d(mayaMerchantPaymentFragment.u1());
                    c1219hD.n(17);
                    c1219hD.t(EnumC1217f.CONTINUE);
                    c1220iO1.c(activity, c1219hD);
                    C0256f c0256f = mayaMerchantPaymentFragment.u0;
                    if (c0256f != null) {
                        c0256f.a();
                    }
                    ((C1809g) mayaMerchantPaymentFragment.Q1()).k(mayaMerchantPaymentFragment.getString(R.string.pma_label_php));
                    return;
                } finally {
                }
            case 1:
                MayaMerchantPaymentFragment mayaMerchantPaymentFragment2 = this.f19078b;
                Callback.onClick_enter(view);
                try {
                    ((C1809g) mayaMerchantPaymentFragment2.Q1()).m();
                    return;
                } finally {
                }
            default:
                MayaMerchantPaymentFragment mayaMerchantPaymentFragment3 = this.f19078b;
                Callback.onClick_enter(view);
                try {
                    ((C1809g) mayaMerchantPaymentFragment3.Q1()).m();
                    return;
                } finally {
                }
        }
    }
}
