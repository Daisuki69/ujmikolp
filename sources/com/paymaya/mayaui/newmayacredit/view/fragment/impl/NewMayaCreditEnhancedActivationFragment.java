package com.paymaya.mayaui.newmayacredit.view.fragment.impl;

import B5.i;
import G5.t;
import G6.v;
import L9.s;
import Lh.d;
import Lh.h;
import M8.W2;
import N5.P;
import O5.a;
import P9.j;
import Q9.B;
import Q9.C;
import Q9.C0572b;
import S5.c;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.viewbinding.ViewBindings;
import b7.C0923a;
import c7.C1078b;
import cj.C1132s;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.CreditAgreement;
import com.paymaya.domain.model.CreditTerm;
import com.paymaya.domain.model.MayaChoicesAdapterItem;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.C1265j;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.MayaEnhancedReviewInfoRecyclerView;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditEnhancedActivationFragment;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import of.p;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class NewMayaCreditEnhancedActivationFragment extends MayaBaseFragment implements j, t {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public s f13195A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public B f13196B0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public P f13201W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f13202X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f13203Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Button f13204Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Button f13205a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ConstraintLayout f13206b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ImageView f13207c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public TextView f13208d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public TextView f13209e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ConstraintLayout f13210f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ImageView f13211g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public TextView f13212h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public HtmlTextView f13213i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Group f13214j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Group f13215k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public MayaInputLayout f13216l0;
    public MayaInputLayout m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public HtmlTextView f13217n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Group f13218o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public MayaInputLayout f13219p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TextView f13220q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ConstraintLayout f13221r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Group f13222s0;
    public MayaInputLayout t0;
    public MayaInputLayout u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public MayaInputLayout f13223v0;
    public AppCompatCheckBox w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public View f13224x0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final String f13199U = "OPTIONS_GENDER_KEY";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final String f13200V = "OPTIONS_MARITAL_STATUS_KEY";
    public final C0923a y0 = new C0923a();

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final C0923a f13225z0 = new C0923a();

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final boolean f13197C0 = true;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final boolean f13198D0 = true;

    public static final void K1(NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment) {
        int i = 0;
        C1220i c1220iO1 = newMayaCreditEnhancedActivationFragment.o1();
        FragmentActivity activity = newMayaCreditEnhancedActivationFragment.getActivity();
        C1219h c1219hD = C1219h.d(newMayaCreditEnhancedActivationFragment.u1());
        c1219hD.r(EnumC1216e.ACTIVATION);
        c1219hD.n(17);
        AbstractC1414e.n(c1219hD, EnumC1217f.ACTIVATE, c1220iO1, activity, c1219hD);
        s sVarH1 = newMayaCreditEnhancedActivationFragment.H1();
        ((MayaBaseFragment) ((j) sVarH1.c.get())).E1();
        CreditTerm creditTerm = sVarH1.j;
        if (creditTerm != null) {
            sVarH1.e(new d(new d(new h(sVarH1.f2911d.h(creditTerm.getId(), sVarH1.f2915n, creditTerm.getLoanAmount(), C1132s.d("termsAndConditions", "truthAndTransparency", "disclosureStatement")), b.a(), 0), new v(sVarH1, 12), 2), new Gc.h(sVarH1, 8), i).e());
        }
    }

    public static final void L1(NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment) {
        s sVarH1 = newMayaCreditEnhancedActivationFragment.H1();
        CreditReviewUiModel creditReview = sVarH1.h;
        if (c.b(sVarH1.f2912g, A5.b.f76S)) {
            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = (NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get());
            newMayaCreditEnhancedActivationFragment2.getClass();
            kotlin.jvm.internal.j.g(creditReview, "creditReview");
            B b8 = newMayaCreditEnhancedActivationFragment2.f13196B0;
            if (b8 != null) {
                ((NewMayaCreditActivity) b8).a2(creditReview);
                return;
            }
            return;
        }
        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = (NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get());
        newMayaCreditEnhancedActivationFragment3.getClass();
        kotlin.jvm.internal.j.g(creditReview, "creditReview");
        B b10 = newMayaCreditEnhancedActivationFragment3.f13196B0;
        if (b10 != null) {
            ((NewMayaCreditActivity) b10).c2(creditReview);
        }
    }

    public static final void M1(NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment) {
        s sVarH1 = newMayaCreditEnhancedActivationFragment.H1();
        TextView textView = newMayaCreditEnhancedActivationFragment.f13208d0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewServiceFeeDescription");
            throw null;
        }
        if (textView.getVisibility() == 0) {
            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = (NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get());
            TextView textView2 = newMayaCreditEnhancedActivationFragment2.f13208d0;
            if (textView2 == null) {
                kotlin.jvm.internal.j.n("mTextViewServiceFeeDescription");
                throw null;
            }
            textView2.setVisibility(8);
            TextView textView3 = newMayaCreditEnhancedActivationFragment2.f13209e0;
            if (textView3 == null) {
                kotlin.jvm.internal.j.n("mTextViewCreditServiceFeeViewSample");
                throw null;
            }
            textView3.setVisibility(8);
            ImageView imageView = newMayaCreditEnhancedActivationFragment2.f13207c0;
            if (imageView == null) {
                kotlin.jvm.internal.j.n("mImageViewCreditServiceFeeExpand");
                throw null;
            }
            Context context = newMayaCreditEnhancedActivationFragment2.getContext();
            imageView.setImageDrawable(context != null ? jk.b.o(context, R.attr.mayaDrawable_CommonExpandContentIcon) : null);
            return;
        }
        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = (NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get());
        TextView textView4 = newMayaCreditEnhancedActivationFragment3.f13208d0;
        if (textView4 == null) {
            kotlin.jvm.internal.j.n("mTextViewServiceFeeDescription");
            throw null;
        }
        textView4.setVisibility(0);
        TextView textView5 = newMayaCreditEnhancedActivationFragment3.f13209e0;
        if (textView5 == null) {
            kotlin.jvm.internal.j.n("mTextViewCreditServiceFeeViewSample");
            throw null;
        }
        textView5.setVisibility(8);
        ImageView imageView2 = newMayaCreditEnhancedActivationFragment3.f13207c0;
        if (imageView2 == null) {
            kotlin.jvm.internal.j.n("mImageViewCreditServiceFeeExpand");
            throw null;
        }
        Context context2 = newMayaCreditEnhancedActivationFragment3.getContext();
        imageView2.setImageDrawable(context2 != null ? jk.b.o(context2, R.attr.mayaDrawable_CommonCollapseContentIcon) : null);
    }

    public static final void N1(NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment) {
        s sVarH1 = newMayaCreditEnhancedActivationFragment.H1();
        TextView textView = newMayaCreditEnhancedActivationFragment.f13212h0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewCreditAutomatedPaymentDescription");
            throw null;
        }
        if (textView.getVisibility() == 0) {
            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = (NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get());
            TextView textView2 = newMayaCreditEnhancedActivationFragment2.f13212h0;
            if (textView2 == null) {
                kotlin.jvm.internal.j.n("mTextViewCreditAutomatedPaymentDescription");
                throw null;
            }
            textView2.setVisibility(8);
            ImageView imageView = newMayaCreditEnhancedActivationFragment2.f13211g0;
            if (imageView == null) {
                kotlin.jvm.internal.j.n("mImageViewCreditAutomatedPaymentExpand");
                throw null;
            }
            Context context = newMayaCreditEnhancedActivationFragment2.getContext();
            imageView.setImageDrawable(context != null ? jk.b.o(context, R.attr.mayaDrawable_CommonExpandContentIcon) : null);
            return;
        }
        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = (NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get());
        TextView textView3 = newMayaCreditEnhancedActivationFragment3.f13212h0;
        if (textView3 == null) {
            kotlin.jvm.internal.j.n("mTextViewCreditAutomatedPaymentDescription");
            throw null;
        }
        textView3.setVisibility(0);
        ImageView imageView2 = newMayaCreditEnhancedActivationFragment3.f13211g0;
        if (imageView2 == null) {
            kotlin.jvm.internal.j.n("mImageViewCreditAutomatedPaymentExpand");
            throw null;
        }
        Context context2 = newMayaCreditEnhancedActivationFragment3.getContext();
        imageView2.setImageDrawable(context2 != null ? jk.b.o(context2, R.attr.mayaDrawable_CommonCollapseContentIcon) : null);
    }

    public static final void O1(NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment) {
        s sVarH1 = newMayaCreditEnhancedActivationFragment.H1();
        j jVar = (j) sVarH1.c.get();
        double d10 = sVarH1.f2920s;
        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = (NewMayaCreditEnhancedActivationFragment) jVar;
        C1220i c1220iO1 = newMayaCreditEnhancedActivationFragment2.o1();
        FragmentActivity activity = newMayaCreditEnhancedActivationFragment2.getActivity();
        C1219h c1219hD = C1219h.d(newMayaCreditEnhancedActivationFragment2.u1());
        c1219hD.r(EnumC1216e.ACTIVATION);
        c1219hD.n(17);
        AbstractC1414e.n(c1219hD, EnumC1217f.LEARN_MORE, c1220iO1, activity, c1219hD);
        B b8 = newMayaCreditEnhancedActivationFragment2.f13196B0;
        if (b8 != null) {
            String str = newMayaCreditEnhancedActivationFragment2.f13202X;
            if (str == null) {
                kotlin.jvm.internal.j.n("interestRateRenderingEvent");
                throw null;
            }
            String str2 = newMayaCreditEnhancedActivationFragment2.f13203Y;
            if (str2 != null) {
                ((NewMayaCreditActivity) b8).d2(str, str2, d10);
            } else {
                kotlin.jvm.internal.j.n("interestRateButtonClickEvent");
                throw null;
            }
        }
    }

    public final void G1() {
        View view = this.f13224x0;
        if (view == null) {
            kotlin.jvm.internal.j.n("mBottomSpacerView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = getResources().getDimensionPixelSize(R.dimen.maya_padding_3x_large);
        View view2 = this.f13224x0;
        if (view2 == null) {
            kotlin.jvm.internal.j.n("mBottomSpacerView");
            throw null;
        }
        view2.setLayoutParams(layoutParams);
        View view3 = this.f13224x0;
        if (view3 != null) {
            view3.requestLayout();
        } else {
            kotlin.jvm.internal.j.n("mBottomSpacerView");
            throw null;
        }
    }

    public final s H1() {
        s sVar = this.f13195A0;
        if (sVar != null) {
            return sVar;
        }
        kotlin.jvm.internal.j.n("mNewMayaCreditEnhancedActivationFragmentPresenter");
        throw null;
    }

    public final void I1() {
        View view = this.f13224x0;
        if (view == null) {
            kotlin.jvm.internal.j.n("mBottomSpacerView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = 0;
        View view2 = this.f13224x0;
        if (view2 == null) {
            kotlin.jvm.internal.j.n("mBottomSpacerView");
            throw null;
        }
        view2.setLayoutParams(layoutParams);
        View view3 = this.f13224x0;
        if (view3 != null) {
            view3.requestLayout();
        } else {
            kotlin.jvm.internal.j.n("mBottomSpacerView");
            throw null;
        }
    }

    public final void J1(boolean z4) {
        Button button = this.f13205a0;
        if (button != null) {
            button.setEnabled(z4);
        } else {
            kotlin.jvm.internal.j.n("mButtonContinue");
            throw null;
        }
    }

    public final void P1(String str) {
        Integer numValueOf;
        int i = 1;
        H1();
        Bundle arguments = getArguments();
        CreditTerm creditTerm = arguments != null ? (CreditTerm) arguments.getParcelable("credit_term") : null;
        List<CreditAgreement> agreements = creditTerm != null ? creditTerm.getAgreements() : null;
        kotlin.jvm.internal.j.d(agreements);
        int size = agreements.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                numValueOf = null;
                break;
            } else {
                if (kotlin.jvm.internal.j.b(agreements.get(i4).getKey(), str)) {
                    numValueOf = Integer.valueOf(i4);
                    break;
                }
                i4++;
            }
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            C1220i c1220iO1 = o1();
            FragmentActivity activity = getActivity();
            C1219h c1219hD = C1219h.d(u1());
            c1219hD.r(EnumC1216e.AGREEMENT);
            c1219hD.n(21);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hD.j.put("document_type", str);
            c1219hD.i();
            c1220iO1.c(activity, c1219hD);
            B b8 = this.f13196B0;
            if (b8 != null) {
                Bundle arguments2 = getArguments();
                CreditTerm creditTerm2 = arguments2 != null ? (CreditTerm) arguments2.getParcelable("credit_term") : null;
                List<CreditAgreement> agreements2 = creditTerm2 != null ? creditTerm2.getAgreements() : null;
                kotlin.jvm.internal.j.d(agreements2);
                ((NewMayaCreditActivity) b8).b2(iIntValue, agreements2.get(iIntValue), new C0572b(this, iIntValue, i));
            }
        }
    }

    public final void Q1(CreditReviewUiModel creditReview) {
        String string;
        String string2;
        final int i = 0;
        kotlin.jvm.internal.j.g(creditReview, "creditReview");
        Group group = this.f13214j0;
        if (group == null) {
            kotlin.jvm.internal.j.n("mGroupCreditDefaultFlow");
            throw null;
        }
        group.setVisibility(8);
        Group group2 = this.f13215k0;
        if (group2 == null) {
            kotlin.jvm.internal.j.n("mGroupCreditContactReferenceFlow");
            throw null;
        }
        group2.setVisibility(0);
        MayaInputLayout mayaInputLayout = this.f13216l0;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mAlternativeEmail");
            throw null;
        }
        mayaInputLayout.getInputEditText().setText(creditReview.e);
        MayaInputLayout mayaInputLayout2 = this.m0;
        if (mayaInputLayout2 == null) {
            kotlin.jvm.internal.j.n("mVerifiedEmailAddress");
            throw null;
        }
        mayaInputLayout2.getInputEditText().setText(creditReview.e);
        MayaInputLayout mayaInputLayout3 = this.f13219p0;
        if (mayaInputLayout3 == null) {
            kotlin.jvm.internal.j.n("mAlternativeMobile");
            throw null;
        }
        mayaInputLayout3.getInputEditText().setText(creditReview.j);
        final s sVarH1 = H1();
        C0923a c0923a = this.y0;
        ArrayList arrayList = new ArrayList();
        String string3 = ((NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get())).getString(R.string.maya_label_credit_activation_billing_end_date_header);
        kotlin.jvm.internal.j.f(string3, "getString(...)");
        if (creditReview.c != null) {
            String string4 = ((NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get())).getString(R.string.maya_label_credit_enhanced_activation_billing_end_date);
            kotlin.jvm.internal.j.f(string4, "getString(...)");
            string = String.format(string4, Arrays.copyOf(new Object[]{creditReview.c}, 1));
        } else {
            string = ((NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get())).getString(R.string.maya_label_agreement_settings_enhanced_date_placeholder);
            kotlin.jvm.internal.j.f(string, "getString(...)");
        }
        Boolean boolValueOf = Boolean.valueOf(creditReview.c == null);
        String str = creditReview.c;
        if (str == null || str.length() == 0) {
            string2 = ((NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get())).getString(R.string.maya_label_credit_activation_select_date);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
        } else {
            string2 = ((NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get())).getString(R.string.maya_label_credit_activation_change_date);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
        }
        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = (NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get());
        newMayaCreditEnhancedActivationFragment.getClass();
        final int i4 = 2;
        arrayList.add(new C1078b(string3, string, boolValueOf, string2, newMayaCreditEnhancedActivationFragment, ContextCompat.getDrawable(((NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get())).requireActivity(), 2131231272), new View.OnClickListener() { // from class: L9.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        s sVar = sVarH1;
                        Callback.onClick_enter(view);
                        try {
                            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = (NewMayaCreditEnhancedActivationFragment) ((P9.j) sVar.c.get());
                            Q9.B b8 = newMayaCreditEnhancedActivationFragment2.f13196B0;
                            if (b8 != null) {
                                String string5 = newMayaCreditEnhancedActivationFragment2.getString(R.string.maya_label_credit_activation_gender_header);
                                kotlin.jvm.internal.j.f(string5, "getString(...)");
                                jk.b.x(b8, string5, C1132s.g(newMayaCreditEnhancedActivationFragment2.getString(R.string.maya_label_credit_contact_reference_selection_sex_male), newMayaCreditEnhancedActivationFragment2.getString(R.string.maya_label_credit_contact_reference_selection_sex_female)), newMayaCreditEnhancedActivationFragment2.f13199U);
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        s sVar2 = sVarH1;
                        Callback.onClick_enter(view);
                        try {
                            s.o(sVar2);
                            return;
                        } finally {
                        }
                    default:
                        s sVar3 = sVarH1;
                        Callback.onClick_enter(view);
                        try {
                            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = (NewMayaCreditEnhancedActivationFragment) ((P9.j) sVar3.c.get());
                            C1220i c1220iO1 = newMayaCreditEnhancedActivationFragment3.o1();
                            FragmentActivity activity = newMayaCreditEnhancedActivationFragment3.getActivity();
                            C1219h c1219hD = C1219h.d(newMayaCreditEnhancedActivationFragment3.u1());
                            c1219hD.r(EnumC1216e.ACTIVATION);
                            c1219hD.n(17);
                            AbstractC1414e.n(c1219hD, EnumC1217f.CHANGE_DATE, c1220iO1, activity, c1219hD);
                            sVar3.l(null, null);
                            return;
                        } finally {
                        }
                }
            }
        }, 3314));
        ArrayList arrayList2 = c0923a.f8542a;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        c0923a.notifyDataSetChanged();
        C0923a c0923a2 = this.f13225z0;
        ArrayList arrayList3 = new ArrayList();
        String string5 = ((NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get())).getString(R.string.maya_label_credit_activation_gender_header);
        kotlin.jvm.internal.j.f(string5, "getString(...)");
        String str2 = creditReview.h;
        if (str2 == null) {
            str2 = "";
        }
        String strM = sVarH1.m(str2);
        String str3 = creditReview.h;
        if (str3 == null) {
            str3 = "";
        }
        String strM2 = sVarH1.m(str3);
        String string6 = ((NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get())).getString(R.string.maya_label_agreement_settings_enhanced_gender_placeholder);
        kotlin.jvm.internal.j.f(string6, "getString(...)");
        Boolean boolValueOf2 = Boolean.valueOf(strM2.equals(string6));
        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = (NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get());
        newMayaCreditEnhancedActivationFragment2.getClass();
        arrayList3.add(new C1078b(string5, strM, boolValueOf2, null, newMayaCreditEnhancedActivationFragment2, ContextCompat.getDrawable(((NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get())).requireActivity(), R.drawable.maya_ic_arrow_black_down), new View.OnClickListener() { // from class: L9.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        s sVar = sVarH1;
                        Callback.onClick_enter(view);
                        try {
                            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment22 = (NewMayaCreditEnhancedActivationFragment) ((P9.j) sVar.c.get());
                            Q9.B b8 = newMayaCreditEnhancedActivationFragment22.f13196B0;
                            if (b8 != null) {
                                String string52 = newMayaCreditEnhancedActivationFragment22.getString(R.string.maya_label_credit_activation_gender_header);
                                kotlin.jvm.internal.j.f(string52, "getString(...)");
                                jk.b.x(b8, string52, C1132s.g(newMayaCreditEnhancedActivationFragment22.getString(R.string.maya_label_credit_contact_reference_selection_sex_male), newMayaCreditEnhancedActivationFragment22.getString(R.string.maya_label_credit_contact_reference_selection_sex_female)), newMayaCreditEnhancedActivationFragment22.f13199U);
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        s sVar2 = sVarH1;
                        Callback.onClick_enter(view);
                        try {
                            s.o(sVar2);
                            return;
                        } finally {
                        }
                    default:
                        s sVar3 = sVarH1;
                        Callback.onClick_enter(view);
                        try {
                            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = (NewMayaCreditEnhancedActivationFragment) ((P9.j) sVar3.c.get());
                            C1220i c1220iO1 = newMayaCreditEnhancedActivationFragment3.o1();
                            FragmentActivity activity = newMayaCreditEnhancedActivationFragment3.getActivity();
                            C1219h c1219hD = C1219h.d(newMayaCreditEnhancedActivationFragment3.u1());
                            c1219hD.r(EnumC1216e.ACTIVATION);
                            c1219hD.n(17);
                            AbstractC1414e.n(c1219hD, EnumC1217f.CHANGE_DATE, c1220iO1, activity, c1219hD);
                            sVar3.l(null, null);
                            return;
                        } finally {
                        }
                }
            }
        }, 3570));
        String string7 = ((NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get())).getString(R.string.maya_label_credit_activation_marital_header);
        kotlin.jvm.internal.j.f(string7, "getString(...)");
        String str4 = creditReview.i;
        if (str4 == null) {
            str4 = "";
        }
        String strN = sVarH1.n(str4);
        String str5 = creditReview.i;
        if (str5 == null) {
            str5 = "";
        }
        String strN2 = sVarH1.n(str5);
        String string8 = ((NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get())).getString(R.string.maya_label_agreement_settings_enhanced_marital_placeholder);
        kotlin.jvm.internal.j.f(string8, "getString(...)");
        Boolean boolValueOf3 = Boolean.valueOf(strN2.equals(string8));
        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = (NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get());
        newMayaCreditEnhancedActivationFragment3.getClass();
        final int i6 = 1;
        arrayList3.add(new C1078b(string7, strN, boolValueOf3, null, newMayaCreditEnhancedActivationFragment3, ContextCompat.getDrawable(((NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get())).requireActivity(), R.drawable.maya_ic_arrow_black_down), new View.OnClickListener() { // from class: L9.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        s sVar = sVarH1;
                        Callback.onClick_enter(view);
                        try {
                            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment22 = (NewMayaCreditEnhancedActivationFragment) ((P9.j) sVar.c.get());
                            Q9.B b8 = newMayaCreditEnhancedActivationFragment22.f13196B0;
                            if (b8 != null) {
                                String string52 = newMayaCreditEnhancedActivationFragment22.getString(R.string.maya_label_credit_activation_gender_header);
                                kotlin.jvm.internal.j.f(string52, "getString(...)");
                                jk.b.x(b8, string52, C1132s.g(newMayaCreditEnhancedActivationFragment22.getString(R.string.maya_label_credit_contact_reference_selection_sex_male), newMayaCreditEnhancedActivationFragment22.getString(R.string.maya_label_credit_contact_reference_selection_sex_female)), newMayaCreditEnhancedActivationFragment22.f13199U);
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        s sVar2 = sVarH1;
                        Callback.onClick_enter(view);
                        try {
                            s.o(sVar2);
                            return;
                        } finally {
                        }
                    default:
                        s sVar3 = sVarH1;
                        Callback.onClick_enter(view);
                        try {
                            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment32 = (NewMayaCreditEnhancedActivationFragment) ((P9.j) sVar3.c.get());
                            C1220i c1220iO1 = newMayaCreditEnhancedActivationFragment32.o1();
                            FragmentActivity activity = newMayaCreditEnhancedActivationFragment32.getActivity();
                            C1219h c1219hD = C1219h.d(newMayaCreditEnhancedActivationFragment32.u1());
                            c1219hD.r(EnumC1216e.ACTIVATION);
                            c1219hD.n(17);
                            AbstractC1414e.n(c1219hD, EnumC1217f.CHANGE_DATE, c1220iO1, activity, c1219hD);
                            sVar3.l(null, null);
                            return;
                        } finally {
                        }
                }
            }
        }, 3570));
        ArrayList arrayList4 = c0923a2.f8542a;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        c0923a2.notifyDataSetChanged();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // G5.t
    public final void m(String str, View view) {
        B b8;
        s sVarH1 = H1();
        if (str != null) {
            switch (str.hashCode()) {
                case -1855896051:
                    if (str.equals("Disclosure")) {
                        ((NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get())).P1("truthAndTransparency");
                        return;
                    }
                    return;
                case -138937442:
                    if (!str.equals("ChangeDate")) {
                        return;
                    }
                    break;
                case 80697703:
                    if (str.equals("Terms")) {
                        ((NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get())).P1("termsAndConditions");
                        return;
                    }
                    return;
                case 337024746:
                    if (!str.equals("SelectDate")) {
                        return;
                    }
                    break;
                case 994883844:
                    if (str.equals("TruthAndTransparency")) {
                        ((NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get())).P1("disclosureStatement");
                        return;
                    }
                    return;
                case 1070194739:
                    if (str.equals("UpdateEmail") && (b8 = ((NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get())).f13196B0) != null) {
                        NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) b8;
                        LinkedHashSet linkedHashSet = E.f10412a;
                        E.a("NewMayaCreditActivity", "showDeepLink: ".concat("paymaya://accountrecovery"));
                        newMayaCreditActivity.n1();
                        i.k(newMayaCreditActivity, "paymaya://accountrecovery");
                        return;
                    }
                    return;
                default:
                    return;
            }
            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = (NewMayaCreditEnhancedActivationFragment) ((j) sVarH1.c.get());
            C1220i c1220iO1 = newMayaCreditEnhancedActivationFragment.o1();
            FragmentActivity activity = newMayaCreditEnhancedActivationFragment.getActivity();
            C1219h c1219hD = C1219h.d(newMayaCreditEnhancedActivationFragment.u1());
            c1219hD.r(EnumC1216e.ACTIVATION);
            c1219hD.n(17);
            AbstractC1414e.n(c1219hD, EnumC1217f.CHANGE_DATE, c1220iO1, activity, c1219hD);
            newMayaCreditEnhancedActivationFragment.H1().l(null, null);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        a aVar = W4.a.e().D().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        C1264i0 c1264i0A = aVar.A();
        C1265j c1265jE = aVar.e();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        c flagConfigurationService = (c) aVar.f4724k.get();
        Uh.d sessionPublishSubject = (Uh.d) aVar.f4748y.get();
        kotlin.jvm.internal.j.g(preference, "preference");
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        kotlin.jvm.internal.j.g(sessionPublishSubject, "sessionPublishSubject");
        this.f13195A0 = new s(c1264i0A, c1265jE, preference, flagConfigurationService, sessionPublishSubject);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditEnhancedActivationFragment.NewMayaCreditEnhancedActivationFragmentListener");
        this.f13196B0 = (B) componentRequireActivity;
        H1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_credit_enhanced_activation, viewGroup, false);
        int i = R.id.barrier_billing_details;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_billing_details)) != null) {
            i = R.id.bottomSpacer;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.bottomSpacer);
            if (viewFindChildViewById != null) {
                i = R.id.button_activate_credit;
                Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_activate_credit);
                if (button != null) {
                    i = R.id.button_continue;
                    Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_continue);
                    if (button2 != null) {
                        i = R.id.checkbox_mothers_maiden_middle_name;
                        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(viewInflate, R.id.checkbox_mothers_maiden_middle_name);
                        if (appCompatCheckBox != null) {
                            i = R.id.group_credit_contact_reference_flow;
                            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_credit_contact_reference_flow);
                            if (group != null) {
                                i = R.id.group_credit_default_flow;
                                Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_credit_default_flow);
                                if (group2 != null) {
                                    i = R.id.group_mothers_maiden_name;
                                    Group group3 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_mothers_maiden_name);
                                    if (group3 != null) {
                                        i = R.id.group_verified_email_address;
                                        Group group4 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_verified_email_address);
                                        if (group4 != null) {
                                            i = R.id.html_text_view_update_email;
                                            HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.html_text_view_update_email);
                                            if (htmlTextView != null) {
                                                i = R.id.image_view_bank_information;
                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_bank_information)) != null) {
                                                    i = R.id.image_view_credit_automated_payment_expand;
                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_credit_automated_payment_expand);
                                                    if (imageView != null) {
                                                        i = R.id.image_view_credit_service_fee_expand;
                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_credit_service_fee_expand);
                                                        if (imageView2 != null) {
                                                            i = R.id.layout_credit_automated_payment_card;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.layout_credit_automated_payment_card);
                                                            if (constraintLayout != null) {
                                                                i = R.id.layout_credit_service_fee_card;
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.layout_credit_service_fee_card);
                                                                if (constraintLayout2 != null) {
                                                                    i = R.id.layout_view_container;
                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.layout_view_container);
                                                                    if (constraintLayout3 != null) {
                                                                        i = R.id.maya_input_layout_alternate_number;
                                                                        MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_alternate_number);
                                                                        if (mayaInputLayout != null) {
                                                                            i = R.id.maya_input_layout_mothers_maiden_first_name;
                                                                            MayaInputLayout mayaInputLayout2 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_mothers_maiden_first_name);
                                                                            if (mayaInputLayout2 != null) {
                                                                                i = R.id.maya_input_layout_mothers_maiden_last_name;
                                                                                MayaInputLayout mayaInputLayout3 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_mothers_maiden_last_name);
                                                                                if (mayaInputLayout3 != null) {
                                                                                    i = R.id.maya_input_layout_mothers_maiden_middle_name;
                                                                                    MayaInputLayout mayaInputLayout4 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_mothers_maiden_middle_name);
                                                                                    if (mayaInputLayout4 != null) {
                                                                                        i = R.id.recycler_view_credit_personal_details;
                                                                                        MayaEnhancedReviewInfoRecyclerView mayaEnhancedReviewInfoRecyclerView = (MayaEnhancedReviewInfoRecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_credit_personal_details);
                                                                                        if (mayaEnhancedReviewInfoRecyclerView != null) {
                                                                                            i = R.id.recycler_view_credit_review_info;
                                                                                            MayaEnhancedReviewInfoRecyclerView mayaEnhancedReviewInfoRecyclerView2 = (MayaEnhancedReviewInfoRecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_credit_review_info);
                                                                                            if (mayaEnhancedReviewInfoRecyclerView2 != null) {
                                                                                                i = R.id.scroll_view_container;
                                                                                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_container);
                                                                                                if (nestedScrollView != null) {
                                                                                                    i = R.id.text_view_alternate_email;
                                                                                                    MayaInputLayout mayaInputLayout5 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.text_view_alternate_email);
                                                                                                    if (mayaInputLayout5 != null) {
                                                                                                        i = R.id.text_view_bank_information;
                                                                                                        HtmlTextView htmlTextView2 = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_bank_information);
                                                                                                        if (htmlTextView2 != null) {
                                                                                                            i = R.id.text_view_billing_end_date_helper_info_text;
                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_billing_end_date_helper_info_text)) != null) {
                                                                                                                i = R.id.text_view_credit_activation_subtitle;
                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_activation_subtitle)) != null) {
                                                                                                                    i = R.id.text_view_credit_activation_title;
                                                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_activation_title);
                                                                                                                    if (textView != null) {
                                                                                                                        i = R.id.text_view_credit_automated_payment_description;
                                                                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_automated_payment_description);
                                                                                                                        if (textView2 != null) {
                                                                                                                            i = R.id.text_view_credit_automated_payment_title;
                                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_automated_payment_title)) != null) {
                                                                                                                                i = R.id.text_view_credit_billing_details_title;
                                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_billing_details_title)) != null) {
                                                                                                                                    i = R.id.text_view_credit_learn_more;
                                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_learn_more)) != null) {
                                                                                                                                        i = R.id.text_view_credit_personal_details_title;
                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_personal_details_title)) != null) {
                                                                                                                                            i = R.id.text_view_credit_service_fee_description;
                                                                                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_service_fee_description);
                                                                                                                                            if (textView3 != null) {
                                                                                                                                                i = R.id.text_view_credit_service_fee_title;
                                                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_service_fee_title)) != null) {
                                                                                                                                                    i = R.id.text_view_credit_service_fee_view_sample;
                                                                                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_service_fee_view_sample);
                                                                                                                                                    if (textView4 != null) {
                                                                                                                                                        i = R.id.text_view_mothers_maiden_name_title;
                                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_mothers_maiden_name_title)) != null) {
                                                                                                                                                            i = R.id.text_view_verified_email_address;
                                                                                                                                                            MayaInputLayout mayaInputLayout6 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.text_view_verified_email_address);
                                                                                                                                                            if (mayaInputLayout6 != null) {
                                                                                                                                                                i = R.id.view_bank_information;
                                                                                                                                                                if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.view_bank_information)) != null) {
                                                                                                                                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) viewInflate;
                                                                                                                                                                    this.f13201W = new P(constraintLayout4, viewFindChildViewById, button, button2, appCompatCheckBox, group, group2, group3, group4, htmlTextView, imageView, imageView2, constraintLayout, constraintLayout2, constraintLayout3, mayaInputLayout, mayaInputLayout2, mayaInputLayout3, mayaInputLayout4, mayaEnhancedReviewInfoRecyclerView, mayaEnhancedReviewInfoRecyclerView2, nestedScrollView, mayaInputLayout5, htmlTextView2, textView, textView2, textView3, textView4, mayaInputLayout6);
                                                                                                                                                                    kotlin.jvm.internal.j.f(constraintLayout4, "getRoot(...)");
                                                                                                                                                                    return constraintLayout4;
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        H1().i();
        this.f13201W = null;
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        B b8 = this.f13196B0;
        if (b8 != null) {
            ((NewMayaCreditActivity) b8).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final int i = 5;
        final int i4 = 4;
        final int i6 = 3;
        final int i10 = 2;
        final int i11 = 0;
        final int i12 = 1;
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        P p10 = this.f13201W;
        kotlin.jvm.internal.j.d(p10);
        this.f13220q0 = p10.f3842g;
        P p11 = this.f13201W;
        kotlin.jvm.internal.j.d(p11);
        this.f13204Z = (Button) p11.m;
        P p12 = this.f13201W;
        kotlin.jvm.internal.j.d(p12);
        this.f13205a0 = (Button) p12.f3845n;
        P p13 = this.f13201W;
        kotlin.jvm.internal.j.d(p13);
        this.f13206b0 = (ConstraintLayout) p13.f3843k;
        P p14 = this.f13201W;
        kotlin.jvm.internal.j.d(p14);
        this.f13208d0 = (TextView) p14.f3837B;
        P p15 = this.f13201W;
        kotlin.jvm.internal.j.d(p15);
        this.f13209e0 = (TextView) p15.f3838C;
        P p16 = this.f13201W;
        kotlin.jvm.internal.j.d(p16);
        this.f13207c0 = (ImageView) p16.f3849r;
        P p17 = this.f13201W;
        kotlin.jvm.internal.j.d(p17);
        this.f13210f0 = (ConstraintLayout) p17.j;
        P p18 = this.f13201W;
        kotlin.jvm.internal.j.d(p18);
        this.f13212h0 = (TextView) p18.f3836A;
        P p19 = this.f13201W;
        kotlin.jvm.internal.j.d(p19);
        this.f13211g0 = (ImageView) p19.f3848q;
        P p20 = this.f13201W;
        kotlin.jvm.internal.j.d(p20);
        this.f13213i0 = (HtmlTextView) p20.f3847p;
        P p21 = this.f13201W;
        kotlin.jvm.internal.j.d(p21);
        this.f13214j0 = p21.c;
        P p22 = this.f13201W;
        kotlin.jvm.internal.j.d(p22);
        this.f13215k0 = p22.f3840b;
        P p23 = this.f13201W;
        kotlin.jvm.internal.j.d(p23);
        this.f13216l0 = (MayaInputLayout) p23.f3854w;
        P p24 = this.f13201W;
        kotlin.jvm.internal.j.d(p24);
        this.m0 = (MayaInputLayout) p24.f3855x;
        P p25 = this.f13201W;
        kotlin.jvm.internal.j.d(p25);
        this.f13217n0 = p25.f;
        P p26 = this.f13201W;
        kotlin.jvm.internal.j.d(p26);
        this.f13218o0 = p26.e;
        P p27 = this.f13201W;
        kotlin.jvm.internal.j.d(p27);
        this.f13219p0 = (MayaInputLayout) p27.f3850s;
        P p28 = this.f13201W;
        kotlin.jvm.internal.j.d(p28);
        this.f13221r0 = (ConstraintLayout) p28.f3844l;
        kotlin.jvm.internal.j.d(this.f13201W);
        P p29 = this.f13201W;
        kotlin.jvm.internal.j.d(p29);
        this.f13222s0 = p29.f3841d;
        P p30 = this.f13201W;
        kotlin.jvm.internal.j.d(p30);
        this.t0 = (MayaInputLayout) p30.f3851t;
        P p31 = this.f13201W;
        kotlin.jvm.internal.j.d(p31);
        this.u0 = (MayaInputLayout) p31.f3853v;
        P p32 = this.f13201W;
        kotlin.jvm.internal.j.d(p32);
        this.f13223v0 = (MayaInputLayout) p32.f3852u;
        P p33 = this.f13201W;
        kotlin.jvm.internal.j.d(p33);
        this.w0 = (AppCompatCheckBox) p33.f3846o;
        P p34 = this.f13201W;
        kotlin.jvm.internal.j.d(p34);
        this.f13224x0 = p34.h;
        P p35 = this.f13201W;
        kotlin.jvm.internal.j.d(p35);
        ((MayaEnhancedReviewInfoRecyclerView) p35.f3857z).setAdapter(this.y0);
        ((MayaEnhancedReviewInfoRecyclerView) p35.f3856y).setAdapter(this.f13225z0);
        C1219h c1219hD = C1219h.d(u1());
        EnumC1216e enumC1216e = EnumC1216e.SERVICE_FEE;
        c1219hD.r(enumC1216e);
        c1219hD.n(20);
        c1219hD.i();
        this.f13202X = c1219hD.c();
        C1219h c1219hD2 = C1219h.d(u1());
        c1219hD2.r(enumC1216e);
        c1219hD2.n(17);
        c1219hD2.t(EnumC1217f.GOT_IT);
        c1219hD2.i();
        this.f13203Y = c1219hD2.c();
        Button button = this.f13204Z;
        if (button == null) {
            kotlin.jvm.internal.j.n("mButtonActivateCredit");
            throw null;
        }
        button.setOnClickListener(new View.OnClickListener(this) { // from class: Q9.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5337b;

            {
                this.f5337b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.K1(newMayaCreditEnhancedActivationFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.L1(newMayaCreditEnhancedActivationFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.M1(newMayaCreditEnhancedActivationFragment3);
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment4 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.N1(newMayaCreditEnhancedActivationFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment5 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.O1(newMayaCreditEnhancedActivationFragment5);
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment6 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditEnhancedActivationFragment6.getActivity());
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f13205a0;
        if (button2 == null) {
            kotlin.jvm.internal.j.n("mButtonContinue");
            throw null;
        }
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: Q9.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5337b;

            {
                this.f5337b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.K1(newMayaCreditEnhancedActivationFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.L1(newMayaCreditEnhancedActivationFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.M1(newMayaCreditEnhancedActivationFragment3);
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment4 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.N1(newMayaCreditEnhancedActivationFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment5 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.O1(newMayaCreditEnhancedActivationFragment5);
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment6 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditEnhancedActivationFragment6.getActivity());
                            return;
                        } finally {
                        }
                }
            }
        });
        ConstraintLayout constraintLayout = this.f13206b0;
        if (constraintLayout == null) {
            kotlin.jvm.internal.j.n("mLayoutServiceFeeCard");
            throw null;
        }
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: Q9.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5337b;

            {
                this.f5337b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.K1(newMayaCreditEnhancedActivationFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.L1(newMayaCreditEnhancedActivationFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.M1(newMayaCreditEnhancedActivationFragment3);
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment4 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.N1(newMayaCreditEnhancedActivationFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment5 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.O1(newMayaCreditEnhancedActivationFragment5);
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment6 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditEnhancedActivationFragment6.getActivity());
                            return;
                        } finally {
                        }
                }
            }
        });
        ConstraintLayout constraintLayout2 = this.f13210f0;
        if (constraintLayout2 == null) {
            kotlin.jvm.internal.j.n("mLayoutAutomatedPaymentCard");
            throw null;
        }
        constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: Q9.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5337b;

            {
                this.f5337b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.K1(newMayaCreditEnhancedActivationFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.L1(newMayaCreditEnhancedActivationFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.M1(newMayaCreditEnhancedActivationFragment3);
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment4 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.N1(newMayaCreditEnhancedActivationFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment5 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.O1(newMayaCreditEnhancedActivationFragment5);
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment6 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditEnhancedActivationFragment6.getActivity());
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView = this.f13209e0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewCreditServiceFeeViewSample");
            throw null;
        }
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: Q9.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5337b;

            {
                this.f5337b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.K1(newMayaCreditEnhancedActivationFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.L1(newMayaCreditEnhancedActivationFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.M1(newMayaCreditEnhancedActivationFragment3);
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment4 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.N1(newMayaCreditEnhancedActivationFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment5 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.O1(newMayaCreditEnhancedActivationFragment5);
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment6 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditEnhancedActivationFragment6.getActivity());
                            return;
                        } finally {
                        }
                }
            }
        });
        ConstraintLayout constraintLayout3 = this.f13221r0;
        if (constraintLayout3 == null) {
            kotlin.jvm.internal.j.n("mLayoutViewContainer");
            throw null;
        }
        constraintLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: Q9.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5337b;

            {
                this.f5337b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.K1(newMayaCreditEnhancedActivationFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.L1(newMayaCreditEnhancedActivationFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.M1(newMayaCreditEnhancedActivationFragment3);
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment4 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.N1(newMayaCreditEnhancedActivationFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment5 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditEnhancedActivationFragment.O1(newMayaCreditEnhancedActivationFragment5);
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment6 = this.f5337b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditEnhancedActivationFragment6.getActivity());
                            return;
                        } finally {
                        }
                }
            }
        });
        HtmlTextView htmlTextView = this.f13213i0;
        if (htmlTextView == null) {
            kotlin.jvm.internal.j.n("mTextViewBankInformation");
            throw null;
        }
        htmlTextView.setOnLinkClickListener(this);
        HtmlTextView htmlTextView2 = this.f13217n0;
        if (htmlTextView2 == null) {
            kotlin.jvm.internal.j.n("mHtmlTextViewUpdateEmail");
            throw null;
        }
        htmlTextView2.setOnLinkClickListener(this);
        MayaInputLayout mayaInputLayout = this.f13216l0;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mAlternativeEmail");
            throw null;
        }
        mayaInputLayout.q();
        mayaInputLayout.getInputEditText().addTextChangedListener(new C(this, i4));
        MayaInputLayout mayaInputLayout2 = this.f13219p0;
        if (mayaInputLayout2 == null) {
            kotlin.jvm.internal.j.n("mAlternativeMobile");
            throw null;
        }
        mayaInputLayout2.q();
        AppCompatEditText inputEditText = mayaInputLayout2.getInputEditText();
        inputEditText.addTextChangedListener(new C(this, i11));
        inputEditText.setFilters(new InputFilter[]{new G5.E(this, 1)});
        getParentFragmentManager().setFragmentResultListener(this.f13199U, this, new FragmentResultListener(this) { // from class: Q9.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5297b;

            {
                this.f5297b = this;
            }

            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                String itemAsString;
                String itemAsString2;
                switch (i11) {
                    case 0:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5297b;
                        kotlin.jvm.internal.j.g(str, "str");
                        kotlin.jvm.internal.j.g(bundle2, "bundle");
                        MayaChoicesAdapterItem mayaChoicesAdapterItem = (MayaChoicesAdapterItem) bundle2.getParcelable("model_values");
                        L9.s sVarH1 = newMayaCreditEnhancedActivationFragment.H1();
                        if (mayaChoicesAdapterItem == null || (itemAsString = mayaChoicesAdapterItem.getItemAsString()) == null) {
                            itemAsString = "";
                        }
                        sVarH1.f2918q = itemAsString;
                        CreditReviewUiModel creditReviewUiModel = sVarH1.h;
                        creditReviewUiModel.h = itemAsString;
                        ((NewMayaCreditEnhancedActivationFragment) ((P9.j) sVarH1.c.get())).Q1(creditReviewUiModel);
                        ((NewMayaCreditEnhancedActivationFragment) ((P9.j) sVarH1.c.get())).J1(sVarH1.k());
                        break;
                    default:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5297b;
                        kotlin.jvm.internal.j.g(str, "str");
                        kotlin.jvm.internal.j.g(bundle2, "bundle");
                        MayaChoicesAdapterItem mayaChoicesAdapterItem2 = (MayaChoicesAdapterItem) bundle2.getParcelable("model_values");
                        L9.s sVarH12 = newMayaCreditEnhancedActivationFragment2.H1();
                        if (mayaChoicesAdapterItem2 == null || (itemAsString2 = mayaChoicesAdapterItem2.getItemAsString()) == null) {
                            itemAsString2 = "";
                        }
                        sVarH12.f2919r = itemAsString2;
                        CreditReviewUiModel creditReviewUiModel2 = sVarH12.h;
                        creditReviewUiModel2.i = itemAsString2;
                        ((NewMayaCreditEnhancedActivationFragment) ((P9.j) sVarH12.c.get())).Q1(creditReviewUiModel2);
                        ((NewMayaCreditEnhancedActivationFragment) ((P9.j) sVarH12.c.get())).J1(sVarH12.k());
                        break;
                }
            }
        });
        getParentFragmentManager().setFragmentResultListener(this.f13200V, this, new FragmentResultListener(this) { // from class: Q9.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5297b;

            {
                this.f5297b = this;
            }

            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                String itemAsString;
                String itemAsString2;
                switch (i12) {
                    case 0:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5297b;
                        kotlin.jvm.internal.j.g(str, "str");
                        kotlin.jvm.internal.j.g(bundle2, "bundle");
                        MayaChoicesAdapterItem mayaChoicesAdapterItem = (MayaChoicesAdapterItem) bundle2.getParcelable("model_values");
                        L9.s sVarH1 = newMayaCreditEnhancedActivationFragment.H1();
                        if (mayaChoicesAdapterItem == null || (itemAsString = mayaChoicesAdapterItem.getItemAsString()) == null) {
                            itemAsString = "";
                        }
                        sVarH1.f2918q = itemAsString;
                        CreditReviewUiModel creditReviewUiModel = sVarH1.h;
                        creditReviewUiModel.h = itemAsString;
                        ((NewMayaCreditEnhancedActivationFragment) ((P9.j) sVarH1.c.get())).Q1(creditReviewUiModel);
                        ((NewMayaCreditEnhancedActivationFragment) ((P9.j) sVarH1.c.get())).J1(sVarH1.k());
                        break;
                    default:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5297b;
                        kotlin.jvm.internal.j.g(str, "str");
                        kotlin.jvm.internal.j.g(bundle2, "bundle");
                        MayaChoicesAdapterItem mayaChoicesAdapterItem2 = (MayaChoicesAdapterItem) bundle2.getParcelable("model_values");
                        L9.s sVarH12 = newMayaCreditEnhancedActivationFragment2.H1();
                        if (mayaChoicesAdapterItem2 == null || (itemAsString2 = mayaChoicesAdapterItem2.getItemAsString()) == null) {
                            itemAsString2 = "";
                        }
                        sVarH12.f2919r = itemAsString2;
                        CreditReviewUiModel creditReviewUiModel2 = sVarH12.h;
                        creditReviewUiModel2.i = itemAsString2;
                        ((NewMayaCreditEnhancedActivationFragment) ((P9.j) sVarH12.c.get())).Q1(creditReviewUiModel2);
                        ((NewMayaCreditEnhancedActivationFragment) ((P9.j) sVarH12.c.get())).J1(sVarH12.k());
                        break;
                }
            }
        });
        MayaInputLayout mayaInputLayout3 = this.t0;
        if (mayaInputLayout3 == null) {
            kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
            throw null;
        }
        mayaInputLayout3.q();
        mayaInputLayout3.getInputEditText().addTextChangedListener(new C(this, i12));
        MayaInputLayout mayaInputLayout4 = this.u0;
        if (mayaInputLayout4 == null) {
            kotlin.jvm.internal.j.n("mMothersMaidenMiddleName");
            throw null;
        }
        mayaInputLayout4.q();
        mayaInputLayout4.getInputEditText().addTextChangedListener(new C(this, i10));
        MayaInputLayout mayaInputLayout5 = this.f13223v0;
        if (mayaInputLayout5 == null) {
            kotlin.jvm.internal.j.n("mMothersMaidenLastName");
            throw null;
        }
        mayaInputLayout5.q();
        mayaInputLayout5.getInputEditText().addTextChangedListener(new C(this, i6));
        AppCompatCheckBox appCompatCheckBox = this.w0;
        if (appCompatCheckBox == null) {
            kotlin.jvm.internal.j.n("mMotherMiddleNameCheckBox");
            throw null;
        }
        appCompatCheckBox.setOnCheckedChangeListener(new W2(this, i12));
        MayaInputLayout mayaInputLayout6 = this.f13216l0;
        if (mayaInputLayout6 == null) {
            kotlin.jvm.internal.j.n("mAlternativeEmail");
            throw null;
        }
        p.f(mayaInputLayout6.getInputEditText(), new Function0(this) { // from class: Q9.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5339b;

            {
                this.f5339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        MayaInputLayout mayaInputLayout7 = this.f5339b.f13216l0;
                        if (mayaInputLayout7 != null) {
                            of.p.B(mayaInputLayout7);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAlternativeEmail");
                        throw null;
                    case 1:
                        MayaInputLayout mayaInputLayout8 = this.f5339b.f13219p0;
                        if (mayaInputLayout8 != null) {
                            of.p.B(mayaInputLayout8);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAlternativeMobile");
                        throw null;
                    case 2:
                        MayaInputLayout mayaInputLayout9 = this.f5339b.t0;
                        if (mayaInputLayout9 != null) {
                            of.p.B(mayaInputLayout9);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    case 3:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5339b;
                        newMayaCreditEnhancedActivationFragment.G1();
                        MayaInputLayout mayaInputLayout10 = newMayaCreditEnhancedActivationFragment.t0;
                        if (mayaInputLayout10 != null) {
                            of.p.B(mayaInputLayout10);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    case 4:
                        this.f5339b.I1();
                        return Unit.f18162a;
                    case 5:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5339b;
                        newMayaCreditEnhancedActivationFragment2.G1();
                        MayaInputLayout mayaInputLayout11 = newMayaCreditEnhancedActivationFragment2.u0;
                        if (mayaInputLayout11 != null) {
                            of.p.B(mayaInputLayout11);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenMiddleName");
                        throw null;
                    case 6:
                        this.f5339b.I1();
                        return Unit.f18162a;
                    case 7:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = this.f5339b;
                        newMayaCreditEnhancedActivationFragment3.G1();
                        MayaInputLayout mayaInputLayout12 = newMayaCreditEnhancedActivationFragment3.f13223v0;
                        if (mayaInputLayout12 != null) {
                            of.p.B(mayaInputLayout12);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenLastName");
                        throw null;
                    default:
                        this.f5339b.I1();
                        return Unit.f18162a;
                }
            }
        }, new A5.j(13));
        MayaInputLayout mayaInputLayout7 = this.f13219p0;
        if (mayaInputLayout7 == null) {
            kotlin.jvm.internal.j.n("mAlternativeMobile");
            throw null;
        }
        p.f(mayaInputLayout7.getInputEditText(), new Function0(this) { // from class: Q9.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5339b;

            {
                this.f5339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        MayaInputLayout mayaInputLayout72 = this.f5339b.f13216l0;
                        if (mayaInputLayout72 != null) {
                            of.p.B(mayaInputLayout72);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAlternativeEmail");
                        throw null;
                    case 1:
                        MayaInputLayout mayaInputLayout8 = this.f5339b.f13219p0;
                        if (mayaInputLayout8 != null) {
                            of.p.B(mayaInputLayout8);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAlternativeMobile");
                        throw null;
                    case 2:
                        MayaInputLayout mayaInputLayout9 = this.f5339b.t0;
                        if (mayaInputLayout9 != null) {
                            of.p.B(mayaInputLayout9);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    case 3:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5339b;
                        newMayaCreditEnhancedActivationFragment.G1();
                        MayaInputLayout mayaInputLayout10 = newMayaCreditEnhancedActivationFragment.t0;
                        if (mayaInputLayout10 != null) {
                            of.p.B(mayaInputLayout10);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    case 4:
                        this.f5339b.I1();
                        return Unit.f18162a;
                    case 5:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5339b;
                        newMayaCreditEnhancedActivationFragment2.G1();
                        MayaInputLayout mayaInputLayout11 = newMayaCreditEnhancedActivationFragment2.u0;
                        if (mayaInputLayout11 != null) {
                            of.p.B(mayaInputLayout11);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenMiddleName");
                        throw null;
                    case 6:
                        this.f5339b.I1();
                        return Unit.f18162a;
                    case 7:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = this.f5339b;
                        newMayaCreditEnhancedActivationFragment3.G1();
                        MayaInputLayout mayaInputLayout12 = newMayaCreditEnhancedActivationFragment3.f13223v0;
                        if (mayaInputLayout12 != null) {
                            of.p.B(mayaInputLayout12);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenLastName");
                        throw null;
                    default:
                        this.f5339b.I1();
                        return Unit.f18162a;
                }
            }
        }, new A5.j(13));
        MayaInputLayout mayaInputLayout8 = this.t0;
        if (mayaInputLayout8 == null) {
            kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
            throw null;
        }
        p.f(mayaInputLayout8.getInputEditText(), new Function0(this) { // from class: Q9.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5339b;

            {
                this.f5339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        MayaInputLayout mayaInputLayout72 = this.f5339b.f13216l0;
                        if (mayaInputLayout72 != null) {
                            of.p.B(mayaInputLayout72);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAlternativeEmail");
                        throw null;
                    case 1:
                        MayaInputLayout mayaInputLayout82 = this.f5339b.f13219p0;
                        if (mayaInputLayout82 != null) {
                            of.p.B(mayaInputLayout82);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAlternativeMobile");
                        throw null;
                    case 2:
                        MayaInputLayout mayaInputLayout9 = this.f5339b.t0;
                        if (mayaInputLayout9 != null) {
                            of.p.B(mayaInputLayout9);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    case 3:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5339b;
                        newMayaCreditEnhancedActivationFragment.G1();
                        MayaInputLayout mayaInputLayout10 = newMayaCreditEnhancedActivationFragment.t0;
                        if (mayaInputLayout10 != null) {
                            of.p.B(mayaInputLayout10);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    case 4:
                        this.f5339b.I1();
                        return Unit.f18162a;
                    case 5:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5339b;
                        newMayaCreditEnhancedActivationFragment2.G1();
                        MayaInputLayout mayaInputLayout11 = newMayaCreditEnhancedActivationFragment2.u0;
                        if (mayaInputLayout11 != null) {
                            of.p.B(mayaInputLayout11);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenMiddleName");
                        throw null;
                    case 6:
                        this.f5339b.I1();
                        return Unit.f18162a;
                    case 7:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = this.f5339b;
                        newMayaCreditEnhancedActivationFragment3.G1();
                        MayaInputLayout mayaInputLayout12 = newMayaCreditEnhancedActivationFragment3.f13223v0;
                        if (mayaInputLayout12 != null) {
                            of.p.B(mayaInputLayout12);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenLastName");
                        throw null;
                    default:
                        this.f5339b.I1();
                        return Unit.f18162a;
                }
            }
        }, new A5.j(13));
        MayaInputLayout mayaInputLayout9 = this.t0;
        if (mayaInputLayout9 == null) {
            kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
            throw null;
        }
        p.f(mayaInputLayout9.getInputEditText(), new Function0(this) { // from class: Q9.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5339b;

            {
                this.f5339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        MayaInputLayout mayaInputLayout72 = this.f5339b.f13216l0;
                        if (mayaInputLayout72 != null) {
                            of.p.B(mayaInputLayout72);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAlternativeEmail");
                        throw null;
                    case 1:
                        MayaInputLayout mayaInputLayout82 = this.f5339b.f13219p0;
                        if (mayaInputLayout82 != null) {
                            of.p.B(mayaInputLayout82);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAlternativeMobile");
                        throw null;
                    case 2:
                        MayaInputLayout mayaInputLayout92 = this.f5339b.t0;
                        if (mayaInputLayout92 != null) {
                            of.p.B(mayaInputLayout92);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    case 3:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5339b;
                        newMayaCreditEnhancedActivationFragment.G1();
                        MayaInputLayout mayaInputLayout10 = newMayaCreditEnhancedActivationFragment.t0;
                        if (mayaInputLayout10 != null) {
                            of.p.B(mayaInputLayout10);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    case 4:
                        this.f5339b.I1();
                        return Unit.f18162a;
                    case 5:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5339b;
                        newMayaCreditEnhancedActivationFragment2.G1();
                        MayaInputLayout mayaInputLayout11 = newMayaCreditEnhancedActivationFragment2.u0;
                        if (mayaInputLayout11 != null) {
                            of.p.B(mayaInputLayout11);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenMiddleName");
                        throw null;
                    case 6:
                        this.f5339b.I1();
                        return Unit.f18162a;
                    case 7:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = this.f5339b;
                        newMayaCreditEnhancedActivationFragment3.G1();
                        MayaInputLayout mayaInputLayout12 = newMayaCreditEnhancedActivationFragment3.f13223v0;
                        if (mayaInputLayout12 != null) {
                            of.p.B(mayaInputLayout12);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenLastName");
                        throw null;
                    default:
                        this.f5339b.I1();
                        return Unit.f18162a;
                }
            }
        }, new Function0(this) { // from class: Q9.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5339b;

            {
                this.f5339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        MayaInputLayout mayaInputLayout72 = this.f5339b.f13216l0;
                        if (mayaInputLayout72 != null) {
                            of.p.B(mayaInputLayout72);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAlternativeEmail");
                        throw null;
                    case 1:
                        MayaInputLayout mayaInputLayout82 = this.f5339b.f13219p0;
                        if (mayaInputLayout82 != null) {
                            of.p.B(mayaInputLayout82);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAlternativeMobile");
                        throw null;
                    case 2:
                        MayaInputLayout mayaInputLayout92 = this.f5339b.t0;
                        if (mayaInputLayout92 != null) {
                            of.p.B(mayaInputLayout92);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    case 3:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5339b;
                        newMayaCreditEnhancedActivationFragment.G1();
                        MayaInputLayout mayaInputLayout10 = newMayaCreditEnhancedActivationFragment.t0;
                        if (mayaInputLayout10 != null) {
                            of.p.B(mayaInputLayout10);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    case 4:
                        this.f5339b.I1();
                        return Unit.f18162a;
                    case 5:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5339b;
                        newMayaCreditEnhancedActivationFragment2.G1();
                        MayaInputLayout mayaInputLayout11 = newMayaCreditEnhancedActivationFragment2.u0;
                        if (mayaInputLayout11 != null) {
                            of.p.B(mayaInputLayout11);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenMiddleName");
                        throw null;
                    case 6:
                        this.f5339b.I1();
                        return Unit.f18162a;
                    case 7:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = this.f5339b;
                        newMayaCreditEnhancedActivationFragment3.G1();
                        MayaInputLayout mayaInputLayout12 = newMayaCreditEnhancedActivationFragment3.f13223v0;
                        if (mayaInputLayout12 != null) {
                            of.p.B(mayaInputLayout12);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenLastName");
                        throw null;
                    default:
                        this.f5339b.I1();
                        return Unit.f18162a;
                }
            }
        });
        MayaInputLayout mayaInputLayout10 = this.u0;
        if (mayaInputLayout10 == null) {
            kotlin.jvm.internal.j.n("mMothersMaidenMiddleName");
            throw null;
        }
        final int i13 = 6;
        p.f(mayaInputLayout10.getInputEditText(), new Function0(this) { // from class: Q9.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5339b;

            {
                this.f5339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MayaInputLayout mayaInputLayout72 = this.f5339b.f13216l0;
                        if (mayaInputLayout72 != null) {
                            of.p.B(mayaInputLayout72);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAlternativeEmail");
                        throw null;
                    case 1:
                        MayaInputLayout mayaInputLayout82 = this.f5339b.f13219p0;
                        if (mayaInputLayout82 != null) {
                            of.p.B(mayaInputLayout82);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAlternativeMobile");
                        throw null;
                    case 2:
                        MayaInputLayout mayaInputLayout92 = this.f5339b.t0;
                        if (mayaInputLayout92 != null) {
                            of.p.B(mayaInputLayout92);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    case 3:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5339b;
                        newMayaCreditEnhancedActivationFragment.G1();
                        MayaInputLayout mayaInputLayout102 = newMayaCreditEnhancedActivationFragment.t0;
                        if (mayaInputLayout102 != null) {
                            of.p.B(mayaInputLayout102);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    case 4:
                        this.f5339b.I1();
                        return Unit.f18162a;
                    case 5:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5339b;
                        newMayaCreditEnhancedActivationFragment2.G1();
                        MayaInputLayout mayaInputLayout11 = newMayaCreditEnhancedActivationFragment2.u0;
                        if (mayaInputLayout11 != null) {
                            of.p.B(mayaInputLayout11);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenMiddleName");
                        throw null;
                    case 6:
                        this.f5339b.I1();
                        return Unit.f18162a;
                    case 7:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = this.f5339b;
                        newMayaCreditEnhancedActivationFragment3.G1();
                        MayaInputLayout mayaInputLayout12 = newMayaCreditEnhancedActivationFragment3.f13223v0;
                        if (mayaInputLayout12 != null) {
                            of.p.B(mayaInputLayout12);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenLastName");
                        throw null;
                    default:
                        this.f5339b.I1();
                        return Unit.f18162a;
                }
            }
        }, new Function0(this) { // from class: Q9.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5339b;

            {
                this.f5339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        MayaInputLayout mayaInputLayout72 = this.f5339b.f13216l0;
                        if (mayaInputLayout72 != null) {
                            of.p.B(mayaInputLayout72);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAlternativeEmail");
                        throw null;
                    case 1:
                        MayaInputLayout mayaInputLayout82 = this.f5339b.f13219p0;
                        if (mayaInputLayout82 != null) {
                            of.p.B(mayaInputLayout82);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAlternativeMobile");
                        throw null;
                    case 2:
                        MayaInputLayout mayaInputLayout92 = this.f5339b.t0;
                        if (mayaInputLayout92 != null) {
                            of.p.B(mayaInputLayout92);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    case 3:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5339b;
                        newMayaCreditEnhancedActivationFragment.G1();
                        MayaInputLayout mayaInputLayout102 = newMayaCreditEnhancedActivationFragment.t0;
                        if (mayaInputLayout102 != null) {
                            of.p.B(mayaInputLayout102);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    case 4:
                        this.f5339b.I1();
                        return Unit.f18162a;
                    case 5:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5339b;
                        newMayaCreditEnhancedActivationFragment2.G1();
                        MayaInputLayout mayaInputLayout11 = newMayaCreditEnhancedActivationFragment2.u0;
                        if (mayaInputLayout11 != null) {
                            of.p.B(mayaInputLayout11);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenMiddleName");
                        throw null;
                    case 6:
                        this.f5339b.I1();
                        return Unit.f18162a;
                    case 7:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = this.f5339b;
                        newMayaCreditEnhancedActivationFragment3.G1();
                        MayaInputLayout mayaInputLayout12 = newMayaCreditEnhancedActivationFragment3.f13223v0;
                        if (mayaInputLayout12 != null) {
                            of.p.B(mayaInputLayout12);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenLastName");
                        throw null;
                    default:
                        this.f5339b.I1();
                        return Unit.f18162a;
                }
            }
        });
        MayaInputLayout mayaInputLayout11 = this.f13223v0;
        if (mayaInputLayout11 == null) {
            kotlin.jvm.internal.j.n("mMothersMaidenLastName");
            throw null;
        }
        final int i14 = 7;
        final int i15 = 8;
        p.f(mayaInputLayout11.getInputEditText(), new Function0(this) { // from class: Q9.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5339b;

            {
                this.f5339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        MayaInputLayout mayaInputLayout72 = this.f5339b.f13216l0;
                        if (mayaInputLayout72 != null) {
                            of.p.B(mayaInputLayout72);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAlternativeEmail");
                        throw null;
                    case 1:
                        MayaInputLayout mayaInputLayout82 = this.f5339b.f13219p0;
                        if (mayaInputLayout82 != null) {
                            of.p.B(mayaInputLayout82);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAlternativeMobile");
                        throw null;
                    case 2:
                        MayaInputLayout mayaInputLayout92 = this.f5339b.t0;
                        if (mayaInputLayout92 != null) {
                            of.p.B(mayaInputLayout92);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    case 3:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5339b;
                        newMayaCreditEnhancedActivationFragment.G1();
                        MayaInputLayout mayaInputLayout102 = newMayaCreditEnhancedActivationFragment.t0;
                        if (mayaInputLayout102 != null) {
                            of.p.B(mayaInputLayout102);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    case 4:
                        this.f5339b.I1();
                        return Unit.f18162a;
                    case 5:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5339b;
                        newMayaCreditEnhancedActivationFragment2.G1();
                        MayaInputLayout mayaInputLayout112 = newMayaCreditEnhancedActivationFragment2.u0;
                        if (mayaInputLayout112 != null) {
                            of.p.B(mayaInputLayout112);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenMiddleName");
                        throw null;
                    case 6:
                        this.f5339b.I1();
                        return Unit.f18162a;
                    case 7:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = this.f5339b;
                        newMayaCreditEnhancedActivationFragment3.G1();
                        MayaInputLayout mayaInputLayout12 = newMayaCreditEnhancedActivationFragment3.f13223v0;
                        if (mayaInputLayout12 != null) {
                            of.p.B(mayaInputLayout12);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenLastName");
                        throw null;
                    default:
                        this.f5339b.I1();
                        return Unit.f18162a;
                }
            }
        }, new Function0(this) { // from class: Q9.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5339b;

            {
                this.f5339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        MayaInputLayout mayaInputLayout72 = this.f5339b.f13216l0;
                        if (mayaInputLayout72 != null) {
                            of.p.B(mayaInputLayout72);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAlternativeEmail");
                        throw null;
                    case 1:
                        MayaInputLayout mayaInputLayout82 = this.f5339b.f13219p0;
                        if (mayaInputLayout82 != null) {
                            of.p.B(mayaInputLayout82);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAlternativeMobile");
                        throw null;
                    case 2:
                        MayaInputLayout mayaInputLayout92 = this.f5339b.t0;
                        if (mayaInputLayout92 != null) {
                            of.p.B(mayaInputLayout92);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    case 3:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5339b;
                        newMayaCreditEnhancedActivationFragment.G1();
                        MayaInputLayout mayaInputLayout102 = newMayaCreditEnhancedActivationFragment.t0;
                        if (mayaInputLayout102 != null) {
                            of.p.B(mayaInputLayout102);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
                        throw null;
                    case 4:
                        this.f5339b.I1();
                        return Unit.f18162a;
                    case 5:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5339b;
                        newMayaCreditEnhancedActivationFragment2.G1();
                        MayaInputLayout mayaInputLayout112 = newMayaCreditEnhancedActivationFragment2.u0;
                        if (mayaInputLayout112 != null) {
                            of.p.B(mayaInputLayout112);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenMiddleName");
                        throw null;
                    case 6:
                        this.f5339b.I1();
                        return Unit.f18162a;
                    case 7:
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = this.f5339b;
                        newMayaCreditEnhancedActivationFragment3.G1();
                        MayaInputLayout mayaInputLayout12 = newMayaCreditEnhancedActivationFragment3.f13223v0;
                        if (mayaInputLayout12 != null) {
                            of.p.B(mayaInputLayout12);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMothersMaidenLastName");
                        throw null;
                    default:
                        this.f5339b.I1();
                        return Unit.f18162a;
                }
            }
        });
        MayaInputLayout mayaInputLayout12 = this.t0;
        if (mayaInputLayout12 == null) {
            kotlin.jvm.internal.j.n("mMothersMaidenFirstName");
            throw null;
        }
        p.C(mayaInputLayout12.getInputEditText(), new Function1(this) { // from class: Q9.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5341b;

            {
                this.f5341b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i16 = i10;
                int iIntValue = ((Integer) obj).intValue();
                switch (i16) {
                    case 0:
                        if (iIntValue == 2 || iIntValue == 5 || iIntValue == 6) {
                            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5341b;
                            com.paymaya.common.utility.C.R(newMayaCreditEnhancedActivationFragment.getActivity());
                            newMayaCreditEnhancedActivationFragment.I1();
                        }
                        break;
                    case 1:
                        if (iIntValue == 2 || iIntValue == 5 || iIntValue == 6) {
                            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5341b;
                            com.paymaya.common.utility.C.R(newMayaCreditEnhancedActivationFragment2.getActivity());
                            newMayaCreditEnhancedActivationFragment2.I1();
                        }
                        break;
                    default:
                        if (iIntValue == 2 || iIntValue == 5 || iIntValue == 6) {
                            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = this.f5341b;
                            com.paymaya.common.utility.C.R(newMayaCreditEnhancedActivationFragment3.getActivity());
                            newMayaCreditEnhancedActivationFragment3.I1();
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        MayaInputLayout mayaInputLayout13 = this.u0;
        if (mayaInputLayout13 == null) {
            kotlin.jvm.internal.j.n("mMothersMaidenMiddleName");
            throw null;
        }
        p.C(mayaInputLayout13.getInputEditText(), new Function1(this) { // from class: Q9.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5341b;

            {
                this.f5341b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i16 = i11;
                int iIntValue = ((Integer) obj).intValue();
                switch (i16) {
                    case 0:
                        if (iIntValue == 2 || iIntValue == 5 || iIntValue == 6) {
                            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5341b;
                            com.paymaya.common.utility.C.R(newMayaCreditEnhancedActivationFragment.getActivity());
                            newMayaCreditEnhancedActivationFragment.I1();
                        }
                        break;
                    case 1:
                        if (iIntValue == 2 || iIntValue == 5 || iIntValue == 6) {
                            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5341b;
                            com.paymaya.common.utility.C.R(newMayaCreditEnhancedActivationFragment2.getActivity());
                            newMayaCreditEnhancedActivationFragment2.I1();
                        }
                        break;
                    default:
                        if (iIntValue == 2 || iIntValue == 5 || iIntValue == 6) {
                            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = this.f5341b;
                            com.paymaya.common.utility.C.R(newMayaCreditEnhancedActivationFragment3.getActivity());
                            newMayaCreditEnhancedActivationFragment3.I1();
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        MayaInputLayout mayaInputLayout14 = this.f13223v0;
        if (mayaInputLayout14 == null) {
            kotlin.jvm.internal.j.n("mMothersMaidenLastName");
            throw null;
        }
        p.C(mayaInputLayout14.getInputEditText(), new Function1(this) { // from class: Q9.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5341b;

            {
                this.f5341b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i16 = i12;
                int iIntValue = ((Integer) obj).intValue();
                switch (i16) {
                    case 0:
                        if (iIntValue == 2 || iIntValue == 5 || iIntValue == 6) {
                            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5341b;
                            com.paymaya.common.utility.C.R(newMayaCreditEnhancedActivationFragment.getActivity());
                            newMayaCreditEnhancedActivationFragment.I1();
                        }
                        break;
                    case 1:
                        if (iIntValue == 2 || iIntValue == 5 || iIntValue == 6) {
                            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5341b;
                            com.paymaya.common.utility.C.R(newMayaCreditEnhancedActivationFragment2.getActivity());
                            newMayaCreditEnhancedActivationFragment2.I1();
                        }
                        break;
                    default:
                        if (iIntValue == 2 || iIntValue == 5 || iIntValue == 6) {
                            NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment3 = this.f5341b;
                            com.paymaya.common.utility.C.R(newMayaCreditEnhancedActivationFragment3.getActivity());
                            newMayaCreditEnhancedActivationFragment3.I1();
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD3 = C1219h.d(u1());
        c1219hD3.r(EnumC1216e.ACTIVATION);
        c1219hD3.n(21);
        c1220iO1.c(activity, c1219hD3);
        H1().j();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean p1() {
        return this.f13197C0;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean r1() {
        return this.f13198D0;
    }
}
