package com.paymaya.mayaui.merchant.view.fragment.impl;

import E8.D;
import E8.E;
import G5.C0256f;
import G5.ViewOnFocusChangeListenerC0253c;
import Ke.e;
import N5.C0453g;
import O5.a;
import S5.c;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.model.QRMerchant;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaMerchantActivity;
import k9.InterfaceC1768a;
import kotlin.jvm.internal.j;
import l9.C1809g;
import o9.d;
import p9.InterfaceC2021f;
import p9.ViewOnClickListenerC2020e;
import y5.AbstractC2509a;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaMerchantPaymentFragment extends MayaBaseLoadingFragment implements d {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C0453g f12876o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TextView f12877p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Button f12878q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public MayaInputLayout f12879r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public C1809g f12880s0;
    public InterfaceC2021f t0;
    public C0256f u0;

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C0453g c0453gA = C0453g.a(layoutInflater, viewGroup);
        this.f12876o0 = c0453gA;
        ConstraintLayout constraintLayout = (ConstraintLayout) c0453gA.f4094b;
        j.f(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_error_dashboard, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading_progress, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final String P1() {
        MayaInputLayout mayaInputLayout = this.f12879r0;
        if (mayaInputLayout != null) {
            return z.t(z.t(C2576A.b0(String.valueOf(mayaInputLayout.getInputEditText().getText())).toString(), "₱ ", ""), ",", "");
        }
        j.n("mAmountMayaInput");
        throw null;
    }

    public final InterfaceC1768a Q1() {
        C1809g c1809g = this.f12880s0;
        if (c1809g != null) {
            return c1809g;
        }
        j.n("mMerchantPaymentPresenter");
        throw null;
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        InterfaceC2021f interfaceC2021f = this.t0;
        if (interfaceC2021f == null) {
            return true;
        }
        MayaMerchantActivity mayaMerchantActivity = (MayaMerchantActivity) interfaceC2021f;
        AlertDialog.Builder builder = new AlertDialog.Builder(mayaMerchantActivity);
        builder.setTitle(mayaMerchantActivity.getString(R.string.pma_label_cancel_transaction)).setMessage(R.string.pma_label_are_you_sure_you_want_to_cancel_transaction).setPositiveButton(R.string.pma_label_yes_cancel, new D(mayaMerchantActivity, 5)).setNegativeButton(R.string.pma_label_no, new E(5));
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        Button button = alertDialogCreate.getButton(-2);
        if (button == null) {
            return true;
        }
        button.setTextColor(ResourcesCompat.getColor(mayaMerchantActivity.getResources(), R.color.pma_text_color_dark_grey, null));
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
        this.f12880s0 = new C1809g((com.paymaya.data.preference.a) aVar.e.get(), aVar.B(), aVar.a(), (Uh.d) aVar.f4748y.get());
        this.t0 = (InterfaceC2021f) getActivity();
        ((AbstractC2509a) Q1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) Q1()).i();
        super.onDestroy();
        this.f12876o0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2021f interfaceC2021f = this.t0;
        if (interfaceC2021f != null) {
            ((MayaMerchantActivity) interfaceC2021f).Q(this);
        }
        ((C1809g) Q1()).m();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        j.d(this.f12876o0);
        C0453g c0453g = this.f12876o0;
        j.d(c0453g);
        this.f12877p0 = (TextView) c0453g.f4095d;
        C0453g c0453g2 = this.f12876o0;
        j.d(c0453g2);
        this.f12878q0 = (Button) c0453g2.e;
        C0453g c0453g3 = this.f12876o0;
        j.d(c0453g3);
        this.f12879r0 = (MayaInputLayout) c0453g3.c;
        Bundle arguments = getArguments();
        QRMerchant qrMerchant = arguments != null ? (QRMerchant) arguments.getParcelable("merchant") : null;
        C1809g c1809g = (C1809g) Q1();
        j.g(qrMerchant, "qrMerchant");
        c1809g.j();
        c1809g.f18265g = qrMerchant;
        d dVar = (d) c1809g.c.get();
        String name = qrMerchant.mName();
        MayaMerchantPaymentFragment mayaMerchantPaymentFragment = (MayaMerchantPaymentFragment) dVar;
        mayaMerchantPaymentFragment.getClass();
        j.g(name, "name");
        TextView textView = mayaMerchantPaymentFragment.f12877p0;
        if (textView == null) {
            j.n("mMerchantInfoTextView");
            throw null;
        }
        textView.setText(name);
        if (c1809g.f18264d.e().isQrWithCheckoutFlowEnabled()) {
            MayaMerchantPaymentFragment mayaMerchantPaymentFragment2 = (MayaMerchantPaymentFragment) ((d) c1809g.c.get());
            Button button = mayaMerchantPaymentFragment2.f12878q0;
            if (button == null) {
                j.n("mContinueButton");
                throw null;
            }
            button.setText(mayaMerchantPaymentFragment2.getString(R.string.maya_label_pay));
        } else {
            MayaMerchantPaymentFragment mayaMerchantPaymentFragment3 = (MayaMerchantPaymentFragment) ((d) c1809g.c.get());
            Button button2 = mayaMerchantPaymentFragment3.f12878q0;
            if (button2 == null) {
                j.n("mContinueButton");
                throw null;
            }
            button2.setText(mayaMerchantPaymentFragment3.getString(R.string.maya_label_continue));
        }
        Button button3 = this.f12878q0;
        if (button3 == null) {
            j.n("mContinueButton");
            throw null;
        }
        button3.setOnClickListener(new ViewOnClickListenerC2020e(this, 0));
        MayaInputLayout mayaInputLayout = this.f12879r0;
        if (mayaInputLayout == null) {
            j.n("mAmountMayaInput");
            throw null;
        }
        mayaInputLayout.getInputEditText().setOnFocusChangeListener(new ViewOnFocusChangeListenerC0253c(this, 7));
        MayaInputLayout mayaInputLayout2 = this.f12879r0;
        if (mayaInputLayout2 != null) {
            mayaInputLayout2.getInputEditText().setOnEditorActionListener(new e(this, 9));
        } else {
            j.n("mAmountMayaInput");
            throw null;
        }
    }
}
