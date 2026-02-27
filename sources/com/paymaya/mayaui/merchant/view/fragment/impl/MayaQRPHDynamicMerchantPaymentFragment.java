package com.paymaya.mayaui.merchant.view.fragment.impl;

import Bb.f;
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
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.QRPHMerchantPaymentRequest;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import fa.ViewOnClickListenerC1479a;
import kotlin.jvm.internal.j;
import o9.g;
import p9.InterfaceC2025j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaQRPHDynamicMerchantPaymentFragment extends MayaBaseFragment implements g {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0453g f12893U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f12894V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Button f12895W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public f f12896X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public InterfaceC2025j f12897Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public QRPHMerchantPaymentRequest f12898Z;

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        a aVar = W4.a.e().q().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12896X = new f(aVar.B(), (d) aVar.f4748y.get());
        this.f12897Y = (InterfaceC2025j) getActivity();
        f fVar = this.f12896X;
        if (fVar != null) {
            fVar.h(this);
        } else {
            j.n("mQRPHDynamicMerchantPaymentPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        C0453g c0453gA = C0453g.a(inflater, viewGroup);
        this.f12893U = c0453gA;
        return (ConstraintLayout) c0453gA.f4094b;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        f fVar = this.f12896X;
        if (fVar == null) {
            j.n("mQRPHDynamicMerchantPaymentPresenter");
            throw null;
        }
        fVar.i();
        super.onDestroy();
        this.f12893U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (t1().e().isQREventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.t(3));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest = this.f12898Z;
            if (qRPHMerchantPaymentRequest == null) {
                j.n("mQRPHMerchantPaymentRequest");
                throw null;
            }
            String type = qRPHMerchantPaymentRequest.getType();
            if (type != null) {
                c1219hE.j.put("merchant_type", type);
            }
            QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest2 = this.f12898Z;
            if (qRPHMerchantPaymentRequest2 == null) {
                j.n("mQRPHMerchantPaymentRequest");
                throw null;
            }
            c1219hE.j.put("merchant_name", qRPHMerchantPaymentRequest2.getMerchantDetails().getName());
            o1().b(c1219hE);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2025j interfaceC2025j = this.f12897Y;
        if (interfaceC2025j != null) {
            ((MayaQRPHMerchantActivity) interfaceC2025j).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0453g c0453g = this.f12893U;
        j.d(c0453g);
        this.f12894V = (TextView) c0453g.f4095d;
        C0453g c0453g2 = this.f12893U;
        j.d(c0453g2);
        this.f12895W = (Button) c0453g2.e;
        j.d(this.f12893U);
        if (getArguments() != null) {
            Parcelable parcelable = requireArguments().getParcelable("qrph_merchant_payment_request");
            j.d(parcelable);
            this.f12898Z = (QRPHMerchantPaymentRequest) parcelable;
        }
        f fVar = this.f12896X;
        if (fVar == null) {
            j.n("mQRPHDynamicMerchantPaymentPresenter");
            throw null;
        }
        fVar.j();
        Button button = this.f12895W;
        if (button == null) {
            j.n("mContinueButton");
            throw null;
        }
        button.setEnabled(true);
        Button button2 = this.f12895W;
        if (button2 != null) {
            button2.setOnClickListener(new ViewOnClickListenerC1479a(this, 26));
        } else {
            j.n("mContinueButton");
            throw null;
        }
    }
}
