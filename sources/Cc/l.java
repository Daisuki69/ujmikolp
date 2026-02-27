package cc;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.common.view.widget.MayaAutoCompleteInputLayout;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaShopPaymentFragment f9347b;

    public /* synthetic */ l(MayaShopPaymentFragment mayaShopPaymentFragment, int i) {
        this.f9346a = i;
        this.f9347b = mayaShopPaymentFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9346a) {
            case 0:
                MayaShopPaymentFragment mayaShopPaymentFragment = this.f9347b;
                Callback.onClick_enter(view);
                try {
                    ((Xb.o) mayaShopPaymentFragment.Y1()).l();
                    return;
                } finally {
                }
            case 1:
                MayaShopPaymentFragment mayaShopPaymentFragment2 = this.f9347b;
                Callback.onClick_enter(view);
                try {
                    MayaShopPaymentFragment.d2(mayaShopPaymentFragment2);
                    return;
                } finally {
                }
            case 2:
                MayaShopPaymentFragment mayaShopPaymentFragment3 = this.f9347b;
                Callback.onClick_enter(view);
                try {
                    mayaShopPaymentFragment3.f14038x0 = "";
                    mayaShopPaymentFragment3.W1().setText("");
                    MayaAutoCompleteInputLayout mayaAutoCompleteInputLayoutX1 = mayaShopPaymentFragment3.X1();
                    mayaAutoCompleteInputLayoutX1.f11977g.requestFocus();
                    InputMethodManager inputMethodManager = (InputMethodManager) mayaAutoCompleteInputLayoutX1.getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.showSoftInput(mayaAutoCompleteInputLayoutX1.f11977g, 1);
                    }
                    mayaShopPaymentFragment3.V1().setEnabled(false);
                    mayaShopPaymentFragment3.b2();
                    return;
                } finally {
                }
            case 3:
                MayaShopPaymentFragment mayaShopPaymentFragment4 = this.f9347b;
                Callback.onClick_enter(view);
                try {
                    ((Xb.o) mayaShopPaymentFragment4.Y1()).l();
                    return;
                } finally {
                }
            case 4:
                MayaShopPaymentFragment mayaShopPaymentFragment5 = this.f9347b;
                Callback.onClick_enter(view);
                try {
                    mayaShopPaymentFragment5.e2();
                    mayaShopPaymentFragment5.T1().d();
                    return;
                } finally {
                }
            case 5:
                MayaShopPaymentFragment mayaShopPaymentFragment6 = this.f9347b;
                Callback.onClick_enter(view);
                try {
                    mayaShopPaymentFragment6.e2();
                    mayaShopPaymentFragment6.T1().d();
                    return;
                } finally {
                }
            case 6:
                MayaShopPaymentFragment mayaShopPaymentFragment7 = this.f9347b;
                Callback.onClick_enter(view);
                try {
                    mayaShopPaymentFragment7.f14028A0 = mayaShopPaymentFragment7.U1().isChecked();
                    return;
                } finally {
                }
            default:
                MayaShopPaymentFragment mayaShopPaymentFragment8 = this.f9347b;
                Callback.onClick_enter(view);
                try {
                    MayaShopPaymentFragment.c2(mayaShopPaymentFragment8);
                    return;
                } finally {
                }
        }
    }
}
