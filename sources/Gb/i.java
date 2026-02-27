package Gb;

import android.view.View;
import android.widget.AdapterView;
import com.dynatrace.android.callback.Callback;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.widget.ForcedAutoCompleteTextView;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ForcedAutoCompleteTextView f1950b;
    public final /* synthetic */ MayaBaseLoadingFragment c;

    public /* synthetic */ i(ForcedAutoCompleteTextView forcedAutoCompleteTextView, MayaBaseLoadingFragment mayaBaseLoadingFragment, int i) {
        this.f1949a = i;
        this.f1950b = forcedAutoCompleteTextView;
        this.c = mayaBaseLoadingFragment;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.f1949a) {
            case 0:
                ForcedAutoCompleteTextView forcedAutoCompleteTextView = this.f1950b;
                MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) this.c;
                Callback.onItemClick_enter(view, i);
                try {
                    MayaSendMoneyFragment.f2(forcedAutoCompleteTextView, mayaSendMoneyFragment, view, i);
                    return;
                } finally {
                }
            default:
                ForcedAutoCompleteTextView forcedAutoCompleteTextView2 = this.f1950b;
                MayaShopPaymentFragment mayaShopPaymentFragment = (MayaShopPaymentFragment) this.c;
                Callback.onItemClick_enter(view, i);
                try {
                    kotlin.jvm.internal.j.g(view, "<unused var>");
                    String string = forcedAutoCompleteTextView2.getText().toString();
                    forcedAutoCompleteTextView2.setSelection(0);
                    C.R(mayaShopPaymentFragment.getActivity());
                    mayaShopPaymentFragment.X1().clearFocus();
                    ((Xb.o) mayaShopPaymentFragment.Y1()).s(string);
                    return;
                } finally {
                }
        }
    }
}
