package com.paymaya.mayaui.dashboard.view.fragment.impl;

import A7.p;
import F7.g;
import G7.w;
import Kh.I;
import Lh.c;
import W4.a;
import android.os.Bundle;
import android.view.View;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaTransactionsActivity;
import kotlin.jvm.internal.j;
import sd.AbstractC2252a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaUserActivityCashOutFragment extends MayaAbstractBaseUserActivityFragmentImpl implements g {
    public p u0;

    @Override // F7.e
    public final String A0() {
        String string = getString(R.string.maya_label_receipt_withdrawal_date);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.n
    public final String E0() {
        String string = getString(R.string.maya_label_account_name);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl
    public final AbstractC2252a G1() {
        p pVar = this.u0;
        if (pVar != null) {
            return pVar;
        }
        j.n("mCashOutFragmentPresenter");
        throw null;
    }

    @Override // F7.m
    public final String I0() {
        String string = getString(R.string.maya_label_receipt_bank_name);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.m
    public final String M0() {
        String string = getString(R.string.maya_label_receipt_merchant_id);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.p
    public final String O0() {
        String string = getString(R.string.maya_label_receipt_recipient);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.n
    public final String R0() {
        String string = getString(R.string.maya_label_account_number);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl
    public final void S1() {
        super.S1();
        U1(getString(R.string.maya_label_share_receipt), null);
    }

    @Override // F7.m
    public final String W0() {
        String string = getString(R.string.maya_label_receipt_paid_using);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.e
    public final String Z0() {
        String string = getString(R.string.maya_label_receipt_date);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.e
    public final String f0() {
        String string = getString(R.string.maya_label_receipt_auth_amount_approved);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.e
    public final String k0() {
        String string = getString(R.string.maya_label_receipt_merchant_reference_number);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.e
    public final String m0() {
        String string = getString(R.string.maya_label_amount);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.m, F7.p, F7.e
    public final String n() {
        String string = getString(R.string.maya_label_receipt_payment_id);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.m, F7.n
    public final String o() {
        String string = getString(R.string.maya_label_receipt_invoice_number);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t0 = (w) getActivity();
        c cVarB = a.e().b();
        O5.a aVar = (O5.a) cVarB.c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        ((I) cVarB.f2990b).getClass();
        this.u0 = new p(2);
        G1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        G1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f10297U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        y5.p pVar = this.t0;
        if (pVar != null) {
            ((MayaTransactionsActivity) pVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        ((p) G1()).j();
    }

    @Override // F7.m, F7.n
    public final String p() {
        String string = getString(R.string.maya_label_receipt_trace_number);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.p
    public final String p0() {
        String string = getString(R.string.maya_label_receipt_product_name);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.n
    public final String t() {
        String string = getString(R.string.maya_label_receipt_account_type);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.e
    public final String t0() {
        String string = getString(R.string.maya_label_receipt_purchase_date);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.e
    public final String z0() {
        String string = getString(R.string.maya_label_receipt_auth_amount_cancelled);
        j.f(string, "getString(...)");
        return string;
    }
}
