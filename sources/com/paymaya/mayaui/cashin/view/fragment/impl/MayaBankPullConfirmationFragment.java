package com.paymaya.mayaui.cashin.view.fragment.impl;

import Ah.p;
import D8.C0214w;
import J5.c;
import K6.b;
import Kh.T;
import L6.InterfaceC0316b;
import Lh.d;
import N5.F;
import O5.a;
import We.s;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.d0;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.CreatePullFunds;
import com.paymaya.domain.model.ExecutePullFunds;
import com.paymaya.domain.store.C1295y0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import d4.AbstractC1331a;
import kotlin.jvm.internal.j;
import okhttp3.RequestBody;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class MayaBankPullConfirmationFragment extends MayaBaseFragment implements b {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public F f11620U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f11621V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f11622W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f11623X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f11624Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public C0214w f11625Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public InterfaceC0316b f11626a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f11627b0;

    public static final void G1(MayaBankPullConfirmationFragment mayaBankPullConfirmationFragment) {
        int i = 0;
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.CONTINUE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("bank", mayaBankPullConfirmationFragment.f11627b0);
        c1219hH.j.put("screen_name", "confirmation");
        c1219hH.i();
        mayaBankPullConfirmationFragment.z1(c1219hH);
        C0214w c0214w = mayaBankPullConfirmationFragment.f11625Z;
        if (c0214w == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        ((MayaBaseFragment) ((b) c0214w.c.get())).E1();
        CreatePullFunds createPullFunds = (CreatePullFunds) c0214w.f;
        if (createPullFunds != null) {
            C1295y0 c1295y0 = (C1295y0) c0214w.e;
            String strMPurchaseId = createPullFunds.mPurchaseId();
            c1295y0.getClass();
            p<ExecutePullFunds> pVarExecuteBankPullFundsV2 = c1295y0.f11503b.executeBankPullFundsV2(strMPurchaseId, RequestBody.create(d0.f10787a, new byte[0]));
            new T(5, new d(new d(AbstractC1331a.l(pVarExecuteBankPullFundsV2, pVarExecuteBankPullFundsV2, zh.b.a()), new c(c0214w, 24), 2), new V2.c(c0214w, 23), i), new A7.c(c0214w, 19)).e();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.CONFIRMATION;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1().i();
        this.f10338R = true;
        this.f11626a0 = (InterfaceC0316b) getActivity();
        a aVar = W4.a.e().i().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        C1295y0 c1295y0K = aVar.K();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(sessionSubject, "sessionSubject");
        C0214w c0214w = new C0214w(c1295y0K, sessionSubject, 3);
        this.f11625Z = c0214w;
        c0214w.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_bank_pull_confirmation, viewGroup, false);
        int i = R.id.barrier_bank_name;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_bank_name)) != null) {
            i = R.id.barrier_fee;
            if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_fee)) != null) {
                i = R.id.button_continue;
                Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_continue);
                if (button != null) {
                    i = R.id.guide_line_labels;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guide_line_labels)) != null) {
                        i = R.id.text_view_amount;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_amount);
                        if (textView != null) {
                            i = R.id.text_view_bank_name_label;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_bank_name_label)) != null) {
                                i = R.id.text_view_bank_name_value;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_bank_name_value);
                                if (textView2 != null) {
                                    i = R.id.text_view_confirm_transaction;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_confirm_transaction)) != null) {
                                        i = R.id.text_view_confirmation_info;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_confirmation_info);
                                        if (textView3 != null) {
                                            i = R.id.text_view_fee_label;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_fee_label)) != null) {
                                                i = R.id.text_view_fee_value;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_fee_value);
                                                if (textView4 != null) {
                                                    i = R.id.view_bank_name_divider;
                                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_bank_name_divider);
                                                    if (viewFindChildViewById != null) {
                                                        i = R.id.view_labels_content;
                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_labels_content);
                                                        if (viewFindChildViewById2 != null) {
                                                            i = R.id.view_labels_content_bottom_space;
                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.view_labels_content_bottom_space);
                                                            if (viewFindChildViewById3 != null) {
                                                                NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                                                this.f11620U = new F(nestedScrollView, button, textView, textView2, textView3, textView4, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, 2);
                                                                j.f(nestedScrollView, "getRoot(...)");
                                                                return nestedScrollView;
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0214w c0214w = this.f11625Z;
        if (c0214w == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        c0214w.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11620U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC0316b interfaceC0316b = this.f11626a0;
        if (interfaceC0316b != null) {
            ((MayaCashInActivity) interfaceC0316b).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Amount amountMFees;
        Amount amountMAmount;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        F f = this.f11620U;
        j.d(f);
        this.f11621V = (TextView) f.f3615d;
        F f3 = this.f11620U;
        j.d(f3);
        this.f11622W = (TextView) f3.e;
        F f7 = this.f11620U;
        j.d(f7);
        this.f11623X = (TextView) f7.f3616g;
        F f10 = this.f11620U;
        j.d(f10);
        this.f11624Y = (TextView) f10.f;
        F f11 = this.f11620U;
        j.d(f11);
        ((Button) f11.c).setOnClickListener(new Ba.a(this, 20));
        Bundle arguments = getArguments();
        if (arguments != null) {
            CreatePullFunds createPullFunds = (CreatePullFunds) arguments.getParcelable("createPullFunds");
            BankPullPaymentOption bankPullPaymentOption = (BankPullPaymentOption) arguments.getParcelable("paymentOption");
            this.f11627b0 = bankPullPaymentOption != null ? bankPullPaymentOption.getId() : null;
            C1219h c1219hM1 = m1();
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hM1.j.put("bank", this.f11627b0);
            C0214w c0214w = this.f11625Z;
            if (c0214w == null) {
                j.n("mFragmentPresenter");
                throw null;
            }
            c0214w.j();
            c0214w.f = createPullFunds;
            c0214w.f1106g = bankPullPaymentOption;
            b bVar = (b) c0214w.c.get();
            String string = ((MayaBankPullConfirmationFragment) ((b) c0214w.c.get())).getString(R.string.pma_label_peso);
            j.f(string, "getString(...)");
            String strI = s.i(string, (createPullFunds == null || (amountMAmount = createPullFunds.mAmount()) == null) ? null : amountMAmount.getFormattedValue());
            TextView textView = ((MayaBankPullConfirmationFragment) bVar).f11621V;
            if (textView == null) {
                j.n("mTextViewAmount");
                throw null;
            }
            textView.setText(strI);
            b bVar2 = (b) c0214w.c.get();
            String string2 = ((MayaBankPullConfirmationFragment) ((b) c0214w.c.get())).getString(R.string.pma_label_peso);
            j.f(string2, "getString(...)");
            String strI2 = s.i(string2, (createPullFunds == null || (amountMFees = createPullFunds.mFees()) == null) ? null : amountMFees.getFormattedValue());
            TextView textView2 = ((MayaBankPullConfirmationFragment) bVar2).f11623X;
            if (textView2 == null) {
                j.n("mTextViewTransferFee");
                throw null;
            }
            textView2.setText(strI2);
            String name = bankPullPaymentOption != null ? bankPullPaymentOption.getName() : null;
            TextView textView3 = this.f11622W;
            if (textView3 == null) {
                j.n("mTextViewBankName");
                throw null;
            }
            textView3.setText(name);
            TextView textView4 = this.f11624Y;
            if (textView4 != null) {
                textView4.setText(getString(R.string.maya_format_confirmation_info, name));
            } else {
                j.n("mTextViewConfirmationInfo");
                throw null;
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.BANK_PULL;
    }
}
