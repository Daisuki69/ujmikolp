package com.paymaya.mayaui.merchant.view.fragment.impl;

import Ah.p;
import E8.D;
import E8.E;
import Kh.T;
import Lh.d;
import N5.F0;
import O5.a;
import S5.c;
import We.s;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.data.api.PayMayaCardApi;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.MerchantPayment;
import com.paymaya.domain.store.C1268k0;
import com.paymaya.domain.store.L;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaDynamicMerchantActivity;
import d4.AbstractC1331a;
import fa.ViewOnClickListenerC1479a;
import kotlin.jvm.internal.j;
import l9.C1803a;
import l9.C1804b;
import o9.InterfaceC1970a;
import p9.InterfaceC2017b;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaDynamicMerchantConfirmationFragment extends MayaBaseFragment implements InterfaceC1970a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public F0 f12858U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f12859V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f12860W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Button f12861X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C1804b f12862Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public InterfaceC2017b f12863Z;

    public static final void G1(MayaDynamicMerchantConfirmationFragment mayaDynamicMerchantConfirmationFragment) {
        int i = 0;
        C1220i c1220iO1 = mayaDynamicMerchantConfirmationFragment.o1();
        FragmentActivity activity = mayaDynamicMerchantConfirmationFragment.getActivity();
        C1219h c1219hD = C1219h.d(mayaDynamicMerchantConfirmationFragment.u1());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.PAY);
        c1220iO1.c(activity, c1219hD);
        C1804b c1804b = mayaDynamicMerchantConfirmationFragment.f12862Y;
        if (c1804b == null) {
            j.n("mDynamicMerchantConfirmationFragmentPresenter");
            throw null;
        }
        ((MayaBaseFragment) ((InterfaceC1970a) c1804b.c.get())).D1();
        MerchantPayment merchantPayment = c1804b.e;
        if (merchantPayment != null) {
            C1268k0 c1268k0 = c1804b.f18255d;
            String strMPaymentToken = merchantPayment.mPaymentToken();
            boolean zIsMerchantV3EndpointEnabled = c1268k0.f11456d.e().isMerchantV3EndpointEnabled();
            PayMayaCardApi payMayaCardApi = c1268k0.f11455b;
            p<MerchantPayment> pVarExecuteDynamicMerchantPaymentV3 = zIsMerchantV3EndpointEnabled ? payMayaCardApi.executeDynamicMerchantPaymentV3(strMPaymentToken) : payMayaCardApi.executeDynamicMerchantPaymentV2(strMPaymentToken);
            c1804b.e(new T(5, new d(new d(AbstractC1331a.l(pVarExecuteDynamicMerchantPaymentV3, pVarExecuteDynamicMerchantPaymentV3, b.a()), new com.paymaya.domain.store.T(c1804b, 20), 2), new L(c1804b, 21), i), new C1803a(c1804b, 0)).e());
        }
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        InterfaceC2017b interfaceC2017b = this.f12863Z;
        if (interfaceC2017b == null) {
            return true;
        }
        MayaDynamicMerchantActivity mayaDynamicMerchantActivity = (MayaDynamicMerchantActivity) interfaceC2017b;
        AlertDialog.Builder builder = new AlertDialog.Builder(mayaDynamicMerchantActivity);
        builder.setTitle(mayaDynamicMerchantActivity.getString(R.string.pma_label_cancel_transaction)).setMessage(R.string.pma_label_are_you_sure_you_want_to_cancel_transaction).setPositiveButton(R.string.pma_label_yes_cancel, new D(mayaDynamicMerchantActivity, 4)).setNegativeButton(R.string.pma_label_no, new E(4));
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        Button button = alertDialogCreate.getButton(-2);
        if (button == null) {
            return true;
        }
        button.setTextColor(ResourcesCompat.getColor(mayaDynamicMerchantActivity.getResources(), R.color.pma_text_color_dark_grey, null));
        return true;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a aVar = W4.a.e().q().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12862Y = new C1804b(aVar.B(), (Uh.d) aVar.f4748y.get(), 0);
        this.f12863Z = (InterfaceC2017b) getActivity();
        C1804b c1804b = this.f12862Y;
        if (c1804b != null) {
            c1804b.h(this);
        } else {
            j.n("mDynamicMerchantConfirmationFragmentPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        F0 f0A = F0.a(inflater, viewGroup);
        this.f12858U = f0A;
        return f0A.f3618b;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1804b c1804b = this.f12862Y;
        if (c1804b == null) {
            j.n("mDynamicMerchantConfirmationFragmentPresenter");
            throw null;
        }
        c1804b.i();
        super.onDestroy();
        this.f12858U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2017b interfaceC2017b = this.f12863Z;
        if (interfaceC2017b != null) {
            ((MayaDynamicMerchantActivity) interfaceC2017b).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        F0 f02 = this.f12858U;
        j.d(f02);
        this.f12859V = f02.f3619d;
        F0 f03 = this.f12858U;
        j.d(f03);
        this.f12860W = f03.e;
        F0 f04 = this.f12858U;
        j.d(f04);
        this.f12861X = f04.c;
        Bundle arguments = getArguments();
        if (arguments != null) {
            MerchantPayment merchantPayment = (MerchantPayment) arguments.getParcelable("merchant");
            C1804b c1804b = this.f12862Y;
            if (c1804b == null) {
                j.n("mDynamicMerchantConfirmationFragmentPresenter");
                throw null;
            }
            j.g(merchantPayment, "merchantPayment");
            c1804b.j();
            c1804b.e = merchantPayment;
            InterfaceC1970a interfaceC1970a = (InterfaceC1970a) c1804b.c.get();
            String strMMerchantName = merchantPayment.mMerchantName();
            j.d(strMMerchantName);
            MayaDynamicMerchantConfirmationFragment mayaDynamicMerchantConfirmationFragment = (MayaDynamicMerchantConfirmationFragment) interfaceC1970a;
            mayaDynamicMerchantConfirmationFragment.getClass();
            TextView textView = mayaDynamicMerchantConfirmationFragment.f12859V;
            if (textView == null) {
                j.n("mMerchantInfo");
                throw null;
            }
            textView.setText(strMMerchantName);
            InterfaceC1970a interfaceC1970a2 = (InterfaceC1970a) c1804b.c.get();
            Amount amountMAmount = merchantPayment.mAmount();
            j.d(amountMAmount);
            MayaDynamicMerchantConfirmationFragment mayaDynamicMerchantConfirmationFragment2 = (MayaDynamicMerchantConfirmationFragment) interfaceC1970a2;
            String strI = s.i(mayaDynamicMerchantConfirmationFragment2.getString(R.string.maya_php_currency), C.v(amountMAmount.mValue()));
            TextView textView2 = mayaDynamicMerchantConfirmationFragment2.f12860W;
            if (textView2 == null) {
                j.n("mPriceLabel");
                throw null;
            }
            textView2.setText(strI);
        }
        Button button = this.f12861X;
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC1479a(this, 22));
        } else {
            j.n("mPayButton");
            throw null;
        }
    }
}
