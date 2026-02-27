package com.paymaya.mayaui.merchant.view.fragment.impl;

import Ah.p;
import Kh.T;
import Lh.d;
import N5.F0;
import O5.a;
import S5.c;
import We.s;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
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
import com.paymaya.mayaui.merchant.view.activity.impl.MayaMerchantActivity;
import d4.AbstractC1331a;
import fa.ViewOnClickListenerC1479a;
import kotlin.jvm.internal.j;
import l9.C1803a;
import l9.C1804b;
import o9.InterfaceC1972c;
import p9.InterfaceC2019d;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaMerchantConfirmationFragment extends MayaBaseFragment implements InterfaceC1972c {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public F0 f12870U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f12871V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f12872W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Button f12873X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C1804b f12874Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public InterfaceC2019d f12875Z;

    public static final void G1(MayaMerchantConfirmationFragment mayaMerchantConfirmationFragment) {
        int i = 0;
        C1220i c1220iO1 = mayaMerchantConfirmationFragment.o1();
        FragmentActivity activity = mayaMerchantConfirmationFragment.getActivity();
        C1219h c1219hD = C1219h.d(mayaMerchantConfirmationFragment.u1());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.PAY);
        c1220iO1.c(activity, c1219hD);
        C1804b c1804b = mayaMerchantConfirmationFragment.f12874Y;
        if (c1804b == null) {
            j.n("mMerchantConfirmationFragmentPresenter");
            throw null;
        }
        ((MayaBaseFragment) ((InterfaceC1972c) c1804b.c.get())).D1();
        MerchantPayment merchantPayment = c1804b.e;
        if (merchantPayment != null) {
            C1268k0 c1268k0 = c1804b.f18255d;
            String strMPaymentToken = merchantPayment.mPaymentToken();
            String strMMerchant = merchantPayment.mMerchant();
            boolean zIsMerchantV3EndpointEnabled = c1268k0.f11456d.e().isMerchantV3EndpointEnabled();
            PayMayaCardApi payMayaCardApi = c1268k0.f11455b;
            p<MerchantPayment> pVarExecuteMerchantPaymentV3 = zIsMerchantV3EndpointEnabled ? payMayaCardApi.executeMerchantPaymentV3(strMPaymentToken, strMMerchant) : payMayaCardApi.executeMerchantPaymentV2(strMPaymentToken, strMMerchant);
            c1804b.e(new T(5, new d(new d(AbstractC1331a.l(pVarExecuteMerchantPaymentV3, pVarExecuteMerchantPaymentV3, b.a()), new com.paymaya.domain.store.T(c1804b, 21), 2), new L(c1804b, 22), i), new C1803a(c1804b, 1)).e());
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a aVar = W4.a.e().q().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12874Y = new C1804b(aVar.B(), (Uh.d) aVar.f4748y.get(), 1);
        this.f12875Z = (InterfaceC2019d) getActivity();
        C1804b c1804b = this.f12874Y;
        if (c1804b != null) {
            c1804b.h(this);
        } else {
            j.n("mMerchantConfirmationFragmentPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        F0 f0A = F0.a(inflater, viewGroup);
        this.f12870U = f0A;
        return f0A.f3618b;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1804b c1804b = this.f12874Y;
        if (c1804b == null) {
            j.n("mMerchantConfirmationFragmentPresenter");
            throw null;
        }
        c1804b.i();
        super.onDestroy();
        this.f12870U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2019d interfaceC2019d = this.f12875Z;
        if (interfaceC2019d != null) {
            ((MayaMerchantActivity) interfaceC2019d).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        F0 f02 = this.f12870U;
        j.d(f02);
        this.f12871V = f02.f3619d;
        F0 f03 = this.f12870U;
        j.d(f03);
        this.f12872W = f03.e;
        F0 f04 = this.f12870U;
        j.d(f04);
        this.f12873X = f04.c;
        Bundle arguments = getArguments();
        if (arguments != null) {
            MerchantPayment merchantPayment = (MerchantPayment) arguments.getParcelable("merchant");
            C1804b c1804b = this.f12874Y;
            if (c1804b == null) {
                j.n("mMerchantConfirmationFragmentPresenter");
                throw null;
            }
            j.g(merchantPayment, "merchantPayment");
            c1804b.j();
            c1804b.e = merchantPayment;
            InterfaceC1972c interfaceC1972c = (InterfaceC1972c) c1804b.c.get();
            String strMMerchantName = merchantPayment.mMerchantName();
            TextView textView = ((MayaMerchantConfirmationFragment) interfaceC1972c).f12871V;
            if (textView == null) {
                j.n("mMerchantInfo");
                throw null;
            }
            textView.setText(strMMerchantName);
            InterfaceC1972c interfaceC1972c2 = (InterfaceC1972c) c1804b.c.get();
            Amount amountMAmount = merchantPayment.mAmount();
            j.d(amountMAmount);
            MayaMerchantConfirmationFragment mayaMerchantConfirmationFragment = (MayaMerchantConfirmationFragment) interfaceC1972c2;
            String strI = s.i(mayaMerchantConfirmationFragment.getString(R.string.maya_php_currency), C.v(amountMAmount.mValue()));
            TextView textView2 = mayaMerchantConfirmationFragment.f12872W;
            if (textView2 == null) {
                j.n("mPriceLabel");
                throw null;
            }
            textView2.setText(strI);
        }
        Button button = this.f12873X;
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC1479a(this, 24));
        } else {
            j.n("mPayButton");
            throw null;
        }
    }
}
