package com.paymaya.mayaui.merchant.view.fragment.impl;

import Bb.a;
import N5.C0435a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.AbstractBaseReceiptFragmentImpl;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.h0;
import com.paymaya.domain.model.MerchantPayment;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import l9.C1803a;
import o9.e;
import p9.InterfaceC2023h;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class MayaMerchantPaymentReceiptFragment extends AbstractBaseReceiptFragmentImpl implements e {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0435a f12881U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f12882V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f12883W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f12884X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public a f12885Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public InterfaceC2023h f12886Z;

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl
    public final void A1() {
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl
    public final View E1(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_merchant_payment_receipt, (ViewGroup) null, false);
        int i = R.id.amount_divider_pma_fragment_merchant_payment_receipt;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.amount_divider_pma_fragment_merchant_payment_receipt);
        if (viewFindChildViewById != null) {
            i = R.id.amount_text_pma_fragment_merchant_payment_receipt;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.amount_text_pma_fragment_merchant_payment_receipt);
            if (textView != null) {
                i = R.id.amount_title_text_pma_fragment_merchant_payment_receipt;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.amount_title_text_pma_fragment_merchant_payment_receipt)) != null) {
                    i = R.id.completed_text_pma_fragment_merchant_payment_receipt;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.completed_text_pma_fragment_merchant_payment_receipt)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = R.id.label_guide_pma_fragment_merchant_payment_receipt;
                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.label_guide_pma_fragment_merchant_payment_receipt)) != null) {
                            i = R.id.merchant_container_pma_fragment_merchant_payment_receipt;
                            if (((RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.merchant_container_pma_fragment_merchant_payment_receipt)) != null) {
                                i = R.id.merchant_divider_pma_fragment_merchant_payment_receipt;
                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.merchant_divider_pma_fragment_merchant_payment_receipt);
                                if (viewFindChildViewById2 != null) {
                                    i = R.id.merchant_image_view_pma_fragment_merchant_payment_receipt;
                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.merchant_image_view_pma_fragment_merchant_payment_receipt)) != null) {
                                        i = R.id.merchant_text_pma_fragment_merchant_payment_receipt;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.merchant_text_pma_fragment_merchant_payment_receipt);
                                        if (textView2 != null) {
                                            i = R.id.merchant_title_text_pma_fragment_merchant_payment_receipt;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.merchant_title_text_pma_fragment_merchant_payment_receipt)) != null) {
                                                i = R.id.reference_id_text_pma_fragment_merchant_payment_receipt;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.reference_id_text_pma_fragment_merchant_payment_receipt);
                                                if (textView3 != null) {
                                                    i = R.id.reference_id_title_text_pma_fragment_merchant_payment_receipt;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.reference_id_title_text_pma_fragment_merchant_payment_receipt)) != null) {
                                                        i = R.id.transaction_details_title_text_pma_fragment_merchant_payment_receipt;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_details_title_text_pma_fragment_merchant_payment_receipt)) != null) {
                                                            this.f12881U = new C0435a(constraintLayout, viewFindChildViewById, textView, viewFindChildViewById2, textView2, textView3);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        InterfaceC2023h interfaceC2023h = this.f12886Z;
        if (interfaceC2023h == null) {
            return true;
        }
        interfaceC2023h.finish();
        return true;
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1215d m1() {
        return EnumC1215d.RECEIPT;
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl
    public final void onCloseClick() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.BACK_TO_HOME);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("screen", "qr_pay");
        o1(c1219hH);
        a aVar = this.f12885Y;
        if (aVar == null) {
            j.n("mMerchantPaymentReceiptFragmentPresenter");
            throw null;
        }
        Bundle arguments = ((MayaMerchantPaymentReceiptFragment) ((e) aVar.c.get())).getArguments();
        MerchantPayment merchantPayment = arguments != null ? (MerchantPayment) arguments.getParcelable("merchant_payment") : null;
        String strNormalizeRedirectUrl = merchantPayment != null ? merchantPayment.normalizeRedirectUrl() : null;
        if (strNormalizeRedirectUrl == null) {
            InterfaceC2023h interfaceC2023h = ((MayaMerchantPaymentReceiptFragment) ((e) aVar.c.get())).f12886Z;
            if (interfaceC2023h != null) {
                interfaceC2023h.finish();
                return;
            }
            return;
        }
        InterfaceC2023h interfaceC2023h2 = ((MayaMerchantPaymentReceiptFragment) ((e) aVar.c.get())).f12886Z;
        if (interfaceC2023h2 != null) {
            interfaceC2023h2.c(strNormalizeRedirectUrl);
        }
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl, com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        C1219h c1219h = this.f10248Q;
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("screen", "qr_pay");
        this.f12886Z = (InterfaceC2023h) getActivity();
        O5.a aVar = W4.a.e().q().f4751a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        a aVar2 = new a((com.paymaya.data.preference.a) aVar.e.get(), 25);
        this.f12885Y = aVar2;
        aVar2.h(this);
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl, com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        a aVar = this.f12885Y;
        if (aVar == null) {
            j.n("mMerchantPaymentReceiptFragmentPresenter");
            throw null;
        }
        aVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2023h interfaceC2023h = this.f12886Z;
        if (interfaceC2023h != null) {
            interfaceC2023h.Q(this);
        }
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl
    public final void onShareClick() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.SHARE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("screen", "qr_pay");
        o1(c1219hH);
        String str = String.format("receipt_snapshot_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        h0 h0VarD = h0.d(t1(), new C1803a(this, 9));
        h0VarD.f11211g = getResources().getDimensionPixelSize(R.dimen.pma_margin_large);
        h0VarD.e(ContextCompat.getColor(requireContext(), R.color.light_light));
        h0VarD.f11209b = r1();
        h0VarD.f(u1());
        h0VarD.b(str);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0435a c0435a = this.f12881U;
        j.d(c0435a);
        this.f12882V = (TextView) c0435a.f4048d;
        C0435a c0435a2 = this.f12881U;
        j.d(c0435a2);
        this.f12883W = (TextView) c0435a2.c;
        C0435a c0435a3 = this.f12881U;
        j.d(c0435a3);
        this.f12884X = (TextView) c0435a3.e;
        a aVar = this.f12885Y;
        if (aVar == null) {
            j.n("mMerchantPaymentReceiptFragmentPresenter");
            throw null;
        }
        aVar.j();
        I1();
        J1(R.string.maya_label_merchant_payment_receipt_successful);
        v1();
    }
}
