package com.paymaya.mayaui.cashin.view.fragment.impl;

import D.C0187u;
import Dc.e;
import G7.t;
import K6.j;
import L6.s;
import N5.I;
import O5.a;
import S5.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.h0;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.ExecutePullFunds;
import com.paymaya.domain.model.WesternUnionTransaction;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import java.util.Arrays;
import y5.InterfaceC2511c;
import y5.n;
import y5.u;

/* JADX INFO: loaded from: classes4.dex */
public class MayaCashInReceiptFragment extends MayaAbstractBaseReceiptFragmentImpl implements j, InterfaceC2511c {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public TextView f11708A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public TextView f11709B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public Group f11710C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public e f11711D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public s f11712E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final EnumC1215d f11713F0 = EnumC1215d.RECEIPT;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public I f11714v0;
    public ImageView w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public TextView f11715x0;
    public TextView y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public TextView f11716z0;

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final String G1() {
        return "cash_in";
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final n H1() {
        return this.f11712E0;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final u I1() {
        return o2();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final View J1(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_cash_in_receipt_details, (ViewGroup) null, false);
        int i = R.id.barrier_source;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_source)) != null) {
            CardView cardView = (CardView) viewInflate;
            i = R.id.constraint_layout_container;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_container)) != null) {
                i = R.id.group_cash_in_amount;
                Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_cash_in_amount);
                if (group != null) {
                    i = R.id.guideline_receipt;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_receipt)) != null) {
                        i = R.id.image_view_icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_icon);
                        if (imageView != null) {
                            i = R.id.text_view_cash_in_amount_label;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_cash_in_amount_label)) != null) {
                                i = R.id.text_view_cash_in_amount_value;
                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_cash_in_amount_value);
                                if (textView != null) {
                                    i = R.id.text_view_reference_id_label;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_reference_id_label)) != null) {
                                        i = R.id.text_view_reference_id_value;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_reference_id_value);
                                        if (textView2 != null) {
                                            i = R.id.text_view_source_label;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_source_label)) != null) {
                                                i = R.id.text_view_source_name;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_source_name);
                                                if (textView3 != null) {
                                                    i = R.id.text_view_source_value;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_source_value);
                                                    if (textView4 != null) {
                                                        i = R.id.text_view_transaction_fee_label;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transaction_fee_label)) != null) {
                                                            i = R.id.text_view_transaction_fee_value;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transaction_fee_value);
                                                            if (textView5 != null) {
                                                                i = R.id.view_divider_cash_in_amount;
                                                                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_cash_in_amount);
                                                                if (viewFindChildViewById != null) {
                                                                    i = R.id.view_divider_source;
                                                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_source);
                                                                    if (viewFindChildViewById2 != null) {
                                                                        i = R.id.view_divider_transaction_fee;
                                                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_transaction_fee);
                                                                        if (viewFindChildViewById3 != null) {
                                                                            this.f11714v0 = new I(cardView, group, imageView, textView, textView2, textView3, textView4, textView5, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, 5);
                                                                            kotlin.jvm.internal.j.f(cardView, "getRoot(...)");
                                                                            return cardView;
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void V1() {
        s sVar = this.f11712E0;
        if (sVar != null) {
            ((MayaCashInActivity) sVar).finish();
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void W1() {
        s sVar = this.f11712E0;
        if (sVar != null) {
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) sVar;
            mayaCashInActivity.n1().u(mayaCashInActivity, "https://support.maya.ph/s/article/Guide-for-your-Transaction-Concerns", mayaCashInActivity.getString(R.string.pma_label_help));
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void Y1() {
        String str = String.format("receipt_snapshot_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        Q1().setVisibility(4);
        h0 h0VarD = h0.d(M1(), new t(this, 12));
        h0VarD.f(O1(), N1(), K1(), L1());
        h0VarD.b(str);
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        s sVar = this.f11712E0;
        if (sVar == null) {
            return true;
        }
        ((MayaCashInActivity) sVar).finish();
        return true;
    }

    public final BankPullPaymentOption m2() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (BankPullPaymentOption) arguments.getParcelable("bank_pull_payment_option");
        }
        return null;
    }

    public final ExecutePullFunds n2() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (ExecutePullFunds) arguments.getParcelable("execute_pull_funds");
        }
        return null;
    }

    public final e o2() {
        e eVar = this.f11711D0;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.j.n("mMayaCashInReceiptFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("screen", "cash_in");
        this.f11712E0 = (s) getActivity();
        a aVar = W4.a.e().i().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.u0 = (C0187u) aVar.f.get();
        c flagConfigurationService = (c) aVar.f4724k.get();
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        this.f11711D0 = new e(flagConfigurationService, 0, 1);
        o2().h(this);
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        o2().i();
        super.onDestroy();
        this.f11714v0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        s sVar = this.f11712E0;
        if (sVar != null) {
            ((MayaCashInActivity) sVar).Q(this);
        }
        e eVarO2 = o2();
        Bundle arguments = ((MayaCashInReceiptFragment) ((j) eVarO2.c.get())).getArguments();
        boolean z4 = (arguments != null ? arguments.getInt("mode", 0) : 0) == 0;
        Z1((((MayaCashInReceiptFragment) ((j) eVarO2.c.get())).m2() != null || ((MayaCashInReceiptFragment) ((j) eVarO2.c.get())).n2() == null) ? (((MayaCashInReceiptFragment) ((j) eVarO2.c.get())).m2() == null || ((MayaCashInReceiptFragment) ((j) eVarO2.c.get())).n2() == null) ? ((MayaCashInReceiptFragment) ((j) eVarO2.c.get())).p2() != null ? "western_union" : "cash_in" : z4 ? "add_money_via_bank_success" : "add_money_via_bank_failed" : z4 ? "add_money_via_card_success" : "add_money_via_card_failed");
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        I i = this.f11714v0;
        kotlin.jvm.internal.j.d(i);
        this.f11716z0 = (TextView) i.i;
        I i4 = this.f11714v0;
        kotlin.jvm.internal.j.d(i4);
        this.f11715x0 = (TextView) i4.f3647d;
        I i6 = this.f11714v0;
        kotlin.jvm.internal.j.d(i6);
        this.y0 = (TextView) i6.h;
        I i10 = this.f11714v0;
        kotlin.jvm.internal.j.d(i10);
        this.w0 = (ImageView) i10.f3648g;
        I i11 = this.f11714v0;
        kotlin.jvm.internal.j.d(i11);
        this.f11708A0 = i11.f3646b;
        I i12 = this.f11714v0;
        kotlin.jvm.internal.j.d(i12);
        this.f11709B0 = (TextView) i12.c;
        I i13 = this.f11714v0;
        kotlin.jvm.internal.j.d(i13);
        this.f11710C0 = (Group) i13.f;
        U1();
        a2();
        b2(R.string.maya_label_cash_in_receipt_title);
        l2();
        P1().setVisibility(0);
        P1().setText(R.string.maya_label_cash_in_receipt_subtitle);
        o2().j();
    }

    public final WesternUnionTransaction p2() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (WesternUnionTransaction) arguments.getParcelable("western_union");
        }
        return null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return this.f11713F0;
    }
}
