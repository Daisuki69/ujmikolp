package com.paymaya.mayaui.merchant.view.fragment.impl;

import D.C0187u;
import N5.C0462k;
import O5.a;
import S5.c;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBindings;
import ba.D;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.h0;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import l9.C1803a;
import p9.InterfaceC2016a;
import p9.InterfaceC2030o;
import v.AbstractC2329d;
import y5.InterfaceC2511c;
import y5.n;
import y5.u;

/* JADX INFO: loaded from: classes4.dex */
public class MayaV2MerchantPaymentReceiptFragment extends MayaAbstractBaseReceiptFragmentImpl implements InterfaceC2016a, InterfaceC2511c {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public TextView f12915A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public TextView f12916B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public TextView f12917C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public TextView f12918D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public TextView f12919E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public View f12920F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public View f12921G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final EnumC1215d f12922H0 = EnumC1215d.RECEIPT;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public C0462k f12923v0;
    public D w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public InterfaceC2030o f12924x0;
    public TextView y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public TextView f12925z0;

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final n H1() {
        return this.f12924x0;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final u I1() {
        return m2();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final View J1(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_v2_view_merchant_payment_receipt_details, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.divider_view_invoice_number;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.divider_view_invoice_number);
        if (viewFindChildViewById != null) {
            i = R.id.divider_view_source;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.divider_view_source);
            if (viewFindChildViewById2 != null) {
                i = R.id.guideline_top_section_center;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_top_section_center)) != null) {
                    i = R.id.invoice_number_label_text_view;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.invoice_number_label_text_view);
                    if (textView != null) {
                        i = R.id.invoice_number_value_text_view;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.invoice_number_value_text_view);
                        if (textView2 != null) {
                            i = R.id.mobile_number_text_view;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.mobile_number_text_view);
                            if (textView3 != null) {
                                i = R.id.payment_method_label_text_view;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.payment_method_label_text_view);
                                if (textView4 != null) {
                                    i = R.id.payment_method_value_text_view;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.payment_method_value_text_view);
                                    if (textView5 != null) {
                                        i = R.id.reference_id_label_text_view;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.reference_id_label_text_view);
                                        if (textView6 != null) {
                                            i = R.id.reference_id_value_text_view;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.reference_id_value_text_view);
                                            if (textView7 != null) {
                                                this.f12923v0 = new C0462k(constraintLayout, viewFindChildViewById, viewFindChildViewById2, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                j.f(constraintLayout, "getRoot(...)");
                                                return constraintLayout;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void V1() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.BACK_TO_HOME);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("screen", "qr_pay");
        A1(c1219hH);
        m2().D();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void W1() {
        InterfaceC2030o interfaceC2030o = this.f12924x0;
        if (interfaceC2030o != null) {
            interfaceC2030o.W();
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void Y1() {
        String str = String.format("receipt_snapshot_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        TypedValue typedValue = new TypedValue();
        int i = requireContext().getTheme().resolveAttribute(R.attr.mayaColorBackgroundPrimary, typedValue, true) ? typedValue.resourceId : R.color.maya_primary_white;
        h0 h0VarD = h0.d(M1(), new C1803a(this, 11));
        h0VarD.e(ContextCompat.getColor(requireContext(), i));
        h0VarD.f(O1(), N1(), L1(), K1());
        h0VarD.b(str);
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        m2().D();
        return true;
    }

    public final D m2() {
        D d10 = this.w0;
        if (d10 != null) {
            return d10;
        }
        j.n("mMerchantPaymentReceiptFragmentPresenter");
        throw null;
    }

    public final void n2() {
        TextView textView = this.f12915A0;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            j.n("mMobileNumberTextView");
            throw null;
        }
    }

    public final void o2(String str) {
        e2(getString(R.string.maya_currency_symbol_with_negative_amount_value, str));
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("screen", "qr_pay");
        this.f12924x0 = (InterfaceC2030o) getActivity();
        a aVar = W4.a.e().v().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.u0 = (C0187u) aVar.f.get();
        this.w0 = new D((com.paymaya.data.preference.a) aVar.e.get(), (c) aVar.f4724k.get());
        a aVar2 = W4.a.e().q().f4751a;
        this.f10334B = (C1220i) aVar2.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar2.e.get();
        this.f10336P = (c) aVar2.f4724k.get();
        this.u0 = (C0187u) aVar2.f.get();
        this.w0 = new D((com.paymaya.data.preference.a) aVar2.e.get(), (c) aVar2.f4724k.get());
        m2().h(this);
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        m2().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2030o interfaceC2030o = this.f12924x0;
        if (interfaceC2030o != null) {
            interfaceC2030o.Q(this);
        }
        Z1("qr_pay");
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0462k c0462k = this.f12923v0;
        j.d(c0462k);
        this.y0 = (TextView) c0462k.i;
        C0462k c0462k2 = this.f12923v0;
        j.d(c0462k2);
        this.f12925z0 = (TextView) c0462k2.j;
        C0462k c0462k3 = this.f12923v0;
        j.d(c0462k3);
        this.f12915A0 = (TextView) c0462k3.e;
        C0462k c0462k4 = this.f12923v0;
        j.d(c0462k4);
        this.f12916B0 = (TextView) c0462k4.f4134k;
        C0462k c0462k5 = this.f12923v0;
        j.d(c0462k5);
        this.f12917C0 = (TextView) c0462k5.h;
        C0462k c0462k6 = this.f12923v0;
        j.d(c0462k6);
        this.f12918D0 = (TextView) c0462k6.c;
        C0462k c0462k7 = this.f12923v0;
        j.d(c0462k7);
        this.f12919E0 = (TextView) c0462k7.f4132d;
        C0462k c0462k8 = this.f12923v0;
        j.d(c0462k8);
        this.f12920F0 = c0462k8.f4133g;
        C0462k c0462k9 = this.f12923v0;
        j.d(c0462k9);
        this.f12921G0 = c0462k9.f;
        a2();
        b2(R.string.maya_merchant_payment_receipt_title);
        g2(R.drawable.maya_ic_shop_placeholder_green);
        MayaAbstractBaseReceiptFragmentImpl.h2(this);
        U1();
        l2();
        m2().j();
    }

    public final void p2(String mobileNumber) {
        j.g(mobileNumber, "mobileNumber");
        TextView textView = this.f12915A0;
        if (textView != null) {
            textView.setText(mobileNumber);
        } else {
            j.n("mMobileNumberTextView");
            throw null;
        }
    }

    public final void q2(String str) {
        TextView textView = this.f12917C0;
        if (textView != null) {
            textView.setText(str);
        } else {
            j.n("mReferenceIdTextView");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return this.f12922H0;
    }
}
