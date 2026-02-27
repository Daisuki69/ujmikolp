package com.paymaya.mayaui.merchant.view.fragment.impl;

import G5.C0256f;
import G5.ViewOnFocusChangeListenerC0253c;
import Ke.e;
import N5.C0453g;
import O5.a;
import S5.c;
import Uh.d;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.QRPHMerchantPaymentRequest;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import java.util.HashMap;
import k9.b;
import l9.C1819q;
import o9.j;
import p9.InterfaceC2029n;
import p9.ViewOnClickListenerC2028m;
import y5.AbstractC2509a;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaQRPHMerchantPaymentFragment extends MayaBaseLoadingFragment implements j {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C1819q f12909o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public C0453g f12910p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TextView f12911q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public MayaInputLayout f12912r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Button f12913s0;
    public InterfaceC2029n t0;
    public C0256f u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public QRPHMerchantPaymentRequest f12914v0;

    public static final void R1(MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment) {
        if (mayaQRPHMerchantPaymentFragment.t1().e().isQREventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.n(4));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String string = mayaQRPHMerchantPaymentFragment.getString(R.string.maya_label_pay);
            HashMap map = c1219hE.j;
            map.put("button", string);
            QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest = mayaQRPHMerchantPaymentFragment.f12914v0;
            if (qRPHMerchantPaymentRequest == null) {
                kotlin.jvm.internal.j.n("mQRPHMerchantPaymentRequest");
                throw null;
            }
            map.put("merchant_name", qRPHMerchantPaymentRequest.getMerchantDetails().getName());
            map.put("amount", mayaQRPHMerchantPaymentFragment.P1());
            mayaQRPHMerchantPaymentFragment.o1().b(c1219hE);
        } else {
            C1220i c1220iO1 = mayaQRPHMerchantPaymentFragment.o1();
            FragmentActivity activity = mayaQRPHMerchantPaymentFragment.getActivity();
            C1219h c1219hD = C1219h.d(mayaQRPHMerchantPaymentFragment.u1());
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.CONTINUE);
            c1220iO1.c(activity, c1219hD);
        }
        C0256f c0256f = mayaQRPHMerchantPaymentFragment.u0;
        if (c0256f != null) {
            c0256f.a();
        }
        ((C1819q) mayaQRPHMerchantPaymentFragment.Q1()).o();
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C0453g c0453gA = C0453g.a(layoutInflater, viewGroup);
        this.f12910p0 = c0453gA;
        ConstraintLayout constraintLayout = (ConstraintLayout) c0453gA.f4094b;
        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_error_dashboard, viewGroup, false);
        kotlin.jvm.internal.j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading_progress, viewGroup, false);
        kotlin.jvm.internal.j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final String P1() {
        MayaInputLayout mayaInputLayout = this.f12912r0;
        if (mayaInputLayout != null) {
            return z.t(z.t(C2576A.b0(String.valueOf(mayaInputLayout.getInputEditText().getText())).toString(), "₱ ", ""), ",", "");
        }
        kotlin.jvm.internal.j.n("mAmountMayaInput");
        throw null;
    }

    public final b Q1() {
        C1819q c1819q = this.f12909o0;
        if (c1819q != null) {
            return c1819q;
        }
        kotlin.jvm.internal.j.n("mQRPHMerchantPaymentPresenter");
        throw null;
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        if (t1().e().isQREventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.n(4));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219hE.j;
            map.put("button", "Back");
            QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest = this.f12914v0;
            if (qRPHMerchantPaymentRequest == null) {
                kotlin.jvm.internal.j.n("mQRPHMerchantPaymentRequest");
                throw null;
            }
            map.put("merchant_name", qRPHMerchantPaymentRequest.getMerchantDetails().getName());
            o1().b(c1219hE);
        }
        InterfaceC2029n interfaceC2029n = this.t0;
        if (interfaceC2029n == null) {
            return true;
        }
        ((MayaQRPHMerchantActivity) interfaceC2029n).a2();
        return true;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        a aVar = W4.a.e().q().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12909o0 = new C1819q((com.paymaya.data.preference.a) aVar.e.get(), aVar.B(), aVar.a(), (d) aVar.f4748y.get());
        this.t0 = (InterfaceC2029n) getActivity();
        ((AbstractC2509a) Q1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) Q1()).i();
        super.onDestroy();
        this.f12910p0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (t1().e().isQREventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.t(3));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest = this.f12914v0;
            if (qRPHMerchantPaymentRequest == null) {
                kotlin.jvm.internal.j.n("mQRPHMerchantPaymentRequest");
                throw null;
            }
            String type = qRPHMerchantPaymentRequest.getType();
            if (type != null) {
                c1219hE.j.put("merchant_type", type);
            }
            QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest2 = this.f12914v0;
            if (qRPHMerchantPaymentRequest2 == null) {
                kotlin.jvm.internal.j.n("mQRPHMerchantPaymentRequest");
                throw null;
            }
            c1219hE.j.put("merchant_name", qRPHMerchantPaymentRequest2.getMerchantDetails().getName());
            o1().b(c1219hE);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2029n interfaceC2029n = this.t0;
        if (interfaceC2029n != null) {
            ((MayaQRPHMerchantActivity) interfaceC2029n).Q(this);
        }
        ((C1819q) Q1()).l();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0453g c0453g = this.f12910p0;
        kotlin.jvm.internal.j.d(c0453g);
        this.f12911q0 = (TextView) c0453g.f4095d;
        C0453g c0453g2 = this.f12910p0;
        kotlin.jvm.internal.j.d(c0453g2);
        this.f12913s0 = (Button) c0453g2.e;
        C0453g c0453g3 = this.f12910p0;
        kotlin.jvm.internal.j.d(c0453g3);
        this.f12912r0 = (MayaInputLayout) c0453g3.c;
        Button button = this.f12913s0;
        if (button == null) {
            kotlin.jvm.internal.j.n("mContinueButton");
            throw null;
        }
        button.setOnClickListener(new ViewOnClickListenerC2028m(this, 0));
        MayaInputLayout mayaInputLayout = this.f12912r0;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mAmountMayaInput");
            throw null;
        }
        mayaInputLayout.getInputEditText().setOnFocusChangeListener(new ViewOnFocusChangeListenerC0253c(this, 8));
        MayaInputLayout mayaInputLayout2 = this.f12912r0;
        if (mayaInputLayout2 == null) {
            kotlin.jvm.internal.j.n("mAmountMayaInput");
            throw null;
        }
        mayaInputLayout2.getInputEditText().setOnEditorActionListener(new e(this, 10));
        if (getArguments() != null) {
            Parcelable parcelable = requireArguments().getParcelable("qrph_merchant_payment_request");
            kotlin.jvm.internal.j.d(parcelable);
            this.f12914v0 = (QRPHMerchantPaymentRequest) parcelable;
        }
        ((C1819q) Q1()).j();
    }
}
