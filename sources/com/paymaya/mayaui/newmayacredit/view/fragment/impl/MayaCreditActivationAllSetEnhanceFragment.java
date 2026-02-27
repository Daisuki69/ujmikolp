package com.paymaya.mayaui.newmayacredit.view.fragment.impl;

import G5.t;
import Ke.b;
import L9.C0323a;
import N5.C0466m;
import P9.a;
import Q9.C0572b;
import Q9.InterfaceC0573c;
import S5.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import cj.C1110A;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.ContactReference;
import com.paymaya.domain.model.CreditAgreement;
import com.paymaya.domain.model.CreditTerm;
import com.paymaya.domain.model.MothersMaidenName;
import com.paymaya.domain.model.PersonalDetailsPatchRequest;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditActivationAllSetEnhanceFragment;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaCreditActivationAllSetEnhanceFragment extends MayaBaseFragment implements a, t {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0466m f13092U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public String f13093V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public String f13094W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public CreditReviewUiModel f13095X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C0323a f13096Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public InterfaceC0573c f13097Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f13098a0 = true;

    public final C0323a G1() {
        C0323a c0323a = this.f13096Y;
        if (c0323a != null) {
            return c0323a;
        }
        j.n("mMayaCreditActivationAllSetEnhanceFragmentPresenter");
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // G5.t
    public final void m(String str, View view) {
        String str2;
        Object next;
        int i = 0;
        C0323a c0323aG1 = G1();
        if (str != null) {
            switch (str.hashCode()) {
                case -1855896051:
                    str2 = !str.equals("Disclosure") ? null : "disclosureStatement";
                    break;
                case -1120554192:
                    str2 = !str.equals("DataPrivacyPolicy") ? null : "dataPrivacyPolicy";
                    break;
                case -887737123:
                    str2 = !str.equals("AutomatedPayments") ? null : "automatedPayments";
                    break;
                case 80697703:
                    str2 = !str.equals("Terms") ? null : "termsAndConditions";
                    break;
                case 994883844:
                    str2 = !str.equals("TruthAndTransparency") ? null : "truthAndTransparency";
                    break;
                default:
                    str2 = null;
                    break;
            }
        } else {
            str2 = null;
        }
        if (str2 != null) {
            a aVar = (a) c0323aG1.c.get();
            Iterator it = ((ArrayList) c0323aG1.h).iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (j.b(((CreditAgreement) next).getKey(), str2)) {
                    }
                } else {
                    next = null;
                }
            }
            CreditAgreement creditAgreement = (CreditAgreement) next;
            Iterator it2 = ((ArrayList) c0323aG1.h).iterator();
            int i4 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i4 = -1;
                } else if (!j.b(((CreditAgreement) it2.next()).getKey(), str2)) {
                    i4++;
                }
            }
            Integer numValueOf = i4 >= 0 ? Integer.valueOf(i4) : null;
            MayaCreditActivationAllSetEnhanceFragment mayaCreditActivationAllSetEnhanceFragment = (MayaCreditActivationAllSetEnhanceFragment) aVar;
            mayaCreditActivationAllSetEnhanceFragment.getClass();
            if (numValueOf == null || creditAgreement == null) {
                return;
            }
            int iIntValue = numValueOf.intValue();
            C1220i c1220iO1 = mayaCreditActivationAllSetEnhanceFragment.o1();
            FragmentActivity activity = mayaCreditActivationAllSetEnhanceFragment.getActivity();
            C1219h c1219hD = C1219h.d(EnumC1215d.CREDIT);
            c1219hD.r(EnumC1216e.AGREEMENT);
            c1219hD.n(21);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hD.j.put("document_type", str2);
            c1219hD.i();
            c1220iO1.c(activity, c1219hD);
            InterfaceC0573c interfaceC0573c = mayaCreditActivationAllSetEnhanceFragment.f13097Z;
            if (interfaceC0573c != null) {
                ((NewMayaCreditActivity) interfaceC0573c).b2(iIntValue, creditAgreement, new C0572b(mayaCreditActivationAllSetEnhanceFragment, iIntValue, i));
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CreditReviewUiModel creditReviewUiModel;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (creditReviewUiModel = (CreditReviewUiModel) arguments.getParcelable("BUNDLE_REVIEW_INFO")) != null) {
            this.f13095X = creditReviewUiModel;
        }
        this.f13097Z = (InterfaceC0573c) getActivity();
        O5.a aVar = W4.a.e().D().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        C1264i0 c1264i0A = aVar.A();
        c flagConfigurationService = (c) aVar.f4724k.get();
        j.g(flagConfigurationService, "flagConfigurationService");
        this.f13096Y = new C0323a(c1264i0A, flagConfigurationService);
        G1().h(this);
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.CREDIT);
        AbstractC1414e.m(c1219hD, EnumC1216e.OFFER, 33);
        c1220iO1.c(activity, c1219hD);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_credit_all_set_enhance, viewGroup, false);
        int i = R.id.button_proceed;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_proceed);
        if (button != null) {
            i = R.id.constraint_layout_billing_end_date;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_billing_end_date)) != null) {
                i = R.id.constraint_layout_confirmation_agreement;
                if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_confirmation_agreement)) != null) {
                    i = R.id.constraint_layout_credit_limit;
                    if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_credit_limit)) != null) {
                        i = R.id.constraint_layout_fees_and_interest;
                        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_fees_and_interest)) != null) {
                            NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                            i = R.id.guideline_left;
                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_left)) != null) {
                                i = R.id.guideline_right;
                                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_right)) != null) {
                                    i = R.id.image_view_bank_information;
                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_bank_information)) != null) {
                                        i = R.id.image_view_credit_activation;
                                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_credit_activation)) != null) {
                                            i = R.id.middle_vertical_guideline;
                                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.middle_vertical_guideline)) != null) {
                                                i = R.id.middle_vertical_guideline_1;
                                                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.middle_vertical_guideline_1)) != null) {
                                                    i = R.id.text_view_approve_credit_limit;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_approve_credit_limit);
                                                    if (textView != null) {
                                                        i = R.id.text_view_available_credit_label;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_available_credit_label)) != null) {
                                                            i = R.id.text_view_billing_end_date_label;
                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_billing_end_date_label)) != null) {
                                                                i = R.id.text_view_billing_end_date_value;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_billing_end_date_value);
                                                                if (textView2 != null) {
                                                                    i = R.id.text_view_confirmation_info;
                                                                    HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_confirmation_info);
                                                                    if (htmlTextView != null) {
                                                                        i = R.id.text_view_credit_activation_all_set_title;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_activation_all_set_title)) != null) {
                                                                            i = R.id.text_view_credit_activation_message;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_activation_message)) != null) {
                                                                                i = R.id.text_view_effective_interest_rate_label;
                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_effective_interest_rate_label)) != null) {
                                                                                    i = R.id.text_view_effective_interest_rate_value;
                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_effective_interest_rate_value);
                                                                                    if (textView3 != null) {
                                                                                        i = R.id.text_view_fees_and_interest_label;
                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_fees_and_interest_label)) != null) {
                                                                                            i = R.id.text_view_late_penalty_fee_label;
                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_late_penalty_fee_label)) != null) {
                                                                                                i = R.id.text_view_late_penalty_fee_value;
                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_late_penalty_fee_value)) != null) {
                                                                                                    i = R.id.text_view_see_sample_computation_link;
                                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_see_sample_computation_link);
                                                                                                    if (textView4 != null) {
                                                                                                        i = R.id.text_view_service_fee_label;
                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_service_fee_label)) != null) {
                                                                                                            i = R.id.text_view_service_fee_value;
                                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_service_fee_value);
                                                                                                            if (textView5 != null) {
                                                                                                                i = R.id.text_view_value_text_billing_end_date_subtext;
                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_value_text_billing_end_date_subtext)) != null) {
                                                                                                                    this.f13092U = new C0466m((ViewGroup) nestedScrollView, (Object) button, (View) textView, (Object) textView2, (Object) htmlTextView, (Object) textView3, (View) textView4, (View) textView5, 6);
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
    public final void onResume() {
        super.onResume();
        InterfaceC0573c interfaceC0573c = this.f13097Z;
        if (interfaceC0573c != null) {
            ((NewMayaCreditActivity) interfaceC0573c).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<CreditAgreement> agreements;
        final int i = 0;
        final int i4 = 1;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0323a c0323aG1 = G1();
        CreditReviewUiModel creditReviewUiModel = this.f13095X;
        if (creditReviewUiModel == null) {
            j.n("creditReviewUiModel");
            throw null;
        }
        c0323aG1.j();
        c0323aG1.f2878g = creditReviewUiModel;
        a aVar = (a) c0323aG1.c.get();
        String str = creditReviewUiModel.f13057d;
        MayaCreditActivationAllSetEnhanceFragment mayaCreditActivationAllSetEnhanceFragment = (MayaCreditActivationAllSetEnhanceFragment) aVar;
        C0466m c0466m = mayaCreditActivationAllSetEnhanceFragment.f13092U;
        j.d(c0466m);
        ((TextView) c0466m.i).setText(mayaCreditActivationAllSetEnhanceFragment.getString(R.string.maya_label_credit_activation_all_set_service_fee, str));
        a aVar2 = (a) c0323aG1.c.get();
        String str2 = creditReviewUiModel.c;
        MayaCreditActivationAllSetEnhanceFragment mayaCreditActivationAllSetEnhanceFragment2 = (MayaCreditActivationAllSetEnhanceFragment) aVar2;
        C0466m c0466m2 = mayaCreditActivationAllSetEnhanceFragment2.f13092U;
        j.d(c0466m2);
        ((TextView) c0466m2.e).setText(mayaCreditActivationAllSetEnhanceFragment2.getString(R.string.maya_label_credit_enhanced_activation_billing_end_date, str2));
        CreditTerm creditTerm = creditReviewUiModel.m;
        if (creditTerm != null) {
            a aVar3 = (a) c0323aG1.c.get();
            double loanAmount = creditTerm.getLoanAmount();
            MayaCreditActivationAllSetEnhanceFragment mayaCreditActivationAllSetEnhanceFragment3 = (MayaCreditActivationAllSetEnhanceFragment) aVar3;
            C0466m c0466m3 = mayaCreditActivationAllSetEnhanceFragment3.f13092U;
            j.d(c0466m3);
            ((TextView) c0466m3.f4151d).setText(mayaCreditActivationAllSetEnhanceFragment3.getString(R.string.maya_label_credit_amount_with_currency_two_decimal_places, Double.valueOf(loanAmount)));
            a aVar4 = (a) c0323aG1.c.get();
            double effectiveInterestRate = creditTerm.getEffectiveInterestRate();
            MayaCreditActivationAllSetEnhanceFragment mayaCreditActivationAllSetEnhanceFragment4 = (MayaCreditActivationAllSetEnhanceFragment) aVar4;
            C0466m c0466m4 = mayaCreditActivationAllSetEnhanceFragment4.f13092U;
            j.d(c0466m4);
            ((TextView) c0466m4.f4152g).setText(mayaCreditActivationAllSetEnhanceFragment4.getString(R.string.maya_label_credit_effective_interest_rate_value, Double.valueOf(effectiveInterestRate)));
        }
        CreditTerm creditTerm2 = creditReviewUiModel.m;
        if (creditTerm2 != null && (agreements = creditTerm2.getAgreements()) != null) {
            ((ArrayList) c0323aG1.h).addAll(C1110A.W(agreements));
        }
        ((ArrayList) c0323aG1.h).add(J9.c.f2492b);
        ((ArrayList) c0323aG1.h).add(J9.c.f2491a);
        C0466m c0466m5 = this.f13092U;
        j.d(c0466m5);
        b.b((Button) c0466m5.c, new Function0(this) { // from class: Q9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCreditActivationAllSetEnhanceFragment f5317b;

            {
                this.f5317b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str3;
                String str4;
                String str5;
                ContactReference contactReference;
                String firstName;
                String middleName;
                String lastName;
                Double dE;
                switch (i) {
                    case 0:
                        MayaCreditActivationAllSetEnhanceFragment mayaCreditActivationAllSetEnhanceFragment5 = this.f5317b;
                        C1220i c1220iO1 = mayaCreditActivationAllSetEnhanceFragment5.o1();
                        FragmentActivity activity = mayaCreditActivationAllSetEnhanceFragment5.getActivity();
                        C1219h c1219hD = C1219h.d(EnumC1215d.CREDIT);
                        AbstractC1414e.m(c1219hD, EnumC1216e.OFFER, 34);
                        c1220iO1.c(activity, c1219hD);
                        C0323a c0323aG12 = mayaCreditActivationAllSetEnhanceFragment5.G1();
                        ((MayaBaseFragment) ((P9.a) c0323aG12.c.get())).E1();
                        CreditReviewUiModel creditReviewUiModel2 = (CreditReviewUiModel) c0323aG12.f2878g;
                        if (creditReviewUiModel2 == null) {
                            kotlin.jvm.internal.j.n("mCreditReviewUiModel");
                            throw null;
                        }
                        J9.a aVar5 = creditReviewUiModel2.f13060l;
                        String str6 = "";
                        if (aVar5 == null || (str3 = aVar5.f2487d) == null) {
                            str3 = "";
                        }
                        String str7 = creditReviewUiModel2.j;
                        if (str7 == null) {
                            str7 = "";
                        }
                        if (S5.c.b((S5.c) c0323aG12.f, A5.b.f76S)) {
                            contactReference = null;
                        } else {
                            J9.a aVar6 = creditReviewUiModel2.f13060l;
                            if (aVar6 == null || (str4 = aVar6.f2485a) == null) {
                                str4 = "";
                            }
                            if (aVar6 == null || (str5 = aVar6.f2486b) == null) {
                                str5 = "";
                            }
                            String strQ = com.paymaya.common.utility.C.q(str3);
                            if (strQ == null) {
                                strQ = "";
                            }
                            J9.a aVar7 = creditReviewUiModel2.f13060l;
                            contactReference = new ContactReference(str4, str5, com.paymaya.common.utility.C.M(aVar7 != null ? aVar7.c : null), strQ);
                        }
                        MothersMaidenName mothersMaidenName = creditReviewUiModel2.f13065r;
                        if (mothersMaidenName == null || (firstName = mothersMaidenName.getFirstName()) == null) {
                            firstName = "";
                        }
                        MothersMaidenName mothersMaidenName2 = creditReviewUiModel2.f13065r;
                        if (mothersMaidenName2 == null || (middleName = mothersMaidenName2.getMiddleName()) == null) {
                            middleName = "";
                        }
                        MothersMaidenName mothersMaidenName3 = creditReviewUiModel2.f13065r;
                        if (mothersMaidenName3 != null && (lastName = mothersMaidenName3.getLastName()) != null) {
                            str6 = lastName;
                        }
                        MothersMaidenName mothersMaidenName4 = creditReviewUiModel2.f13065r;
                        MothersMaidenName mothersMaidenName5 = new MothersMaidenName(firstName, middleName, str6, mothersMaidenName4 != null ? mothersMaidenName4.getHasNoMiddleName() : true);
                        String strQ2 = com.paymaya.common.utility.C.q(str7);
                        PersonalDetailsPatchRequest personalDetailsPatchRequest = new PersonalDetailsPatchRequest(strQ2 == null ? null : strQ2, com.paymaya.common.utility.C.H(creditReviewUiModel2.h), com.paymaya.common.utility.C.J(creditReviewUiModel2.i), contactReference, mothersMaidenName5);
                        String lowerCase = EventMetricsAggregator.OS_NAME.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
                        String string = UUID.randomUUID().toString();
                        kotlin.jvm.internal.j.f(string, "toString(...)");
                        c0323aG12.e(new Lh.d(new Lh.d(new Lh.h(((C1264i0) c0323aG12.e).e(lowerCase, string, personalDetailsPatchRequest), zh.b.a(), 0), new Gb.d(c0323aG12, 5), 2), new G6.v(c0323aG12, 7), 0).e());
                        return Unit.f18162a;
                    default:
                        C0323a c0323aG13 = this.f5317b.G1();
                        CreditReviewUiModel creditReviewUiModel3 = (CreditReviewUiModel) c0323aG13.f2878g;
                        if (creditReviewUiModel3 == null) {
                            kotlin.jvm.internal.j.n("mCreditReviewUiModel");
                            throw null;
                        }
                        String str8 = creditReviewUiModel3.f13057d;
                        if (str8 != null && (dE = zj.x.e(str8)) != null) {
                            double dDoubleValue = dE.doubleValue();
                            MayaCreditActivationAllSetEnhanceFragment mayaCreditActivationAllSetEnhanceFragment6 = (MayaCreditActivationAllSetEnhanceFragment) ((P9.a) c0323aG13.c.get());
                            C1220i c1220iO12 = mayaCreditActivationAllSetEnhanceFragment6.o1();
                            FragmentActivity activity2 = mayaCreditActivationAllSetEnhanceFragment6.getActivity();
                            C1219h c1219hD2 = C1219h.d(EnumC1215d.CREDIT);
                            c1219hD2.r(EnumC1216e.OFFER);
                            c1219hD2.n(17);
                            AbstractC1414e.n(c1219hD2, EnumC1217f.LEARN_MORE, c1220iO12, activity2, c1219hD2);
                            InterfaceC0573c interfaceC0573c = mayaCreditActivationAllSetEnhanceFragment6.f13097Z;
                            if (interfaceC0573c != null) {
                                String str9 = mayaCreditActivationAllSetEnhanceFragment6.f13093V;
                                if (str9 == null) {
                                    kotlin.jvm.internal.j.n("interestRateRenderingEvent");
                                    throw null;
                                }
                                String str10 = mayaCreditActivationAllSetEnhanceFragment6.f13094W;
                                if (str10 == null) {
                                    kotlin.jvm.internal.j.n("interestRateButtonClickEvent");
                                    throw null;
                                }
                                ((NewMayaCreditActivity) interfaceC0573c).d2(str9, str10, dDoubleValue);
                            }
                        }
                        return Unit.f18162a;
                }
            }
        });
        C0466m c0466m6 = this.f13092U;
        j.d(c0466m6);
        b.b((TextView) c0466m6.h, new Function0(this) { // from class: Q9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCreditActivationAllSetEnhanceFragment f5317b;

            {
                this.f5317b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str3;
                String str4;
                String str5;
                ContactReference contactReference;
                String firstName;
                String middleName;
                String lastName;
                Double dE;
                switch (i4) {
                    case 0:
                        MayaCreditActivationAllSetEnhanceFragment mayaCreditActivationAllSetEnhanceFragment5 = this.f5317b;
                        C1220i c1220iO1 = mayaCreditActivationAllSetEnhanceFragment5.o1();
                        FragmentActivity activity = mayaCreditActivationAllSetEnhanceFragment5.getActivity();
                        C1219h c1219hD = C1219h.d(EnumC1215d.CREDIT);
                        AbstractC1414e.m(c1219hD, EnumC1216e.OFFER, 34);
                        c1220iO1.c(activity, c1219hD);
                        C0323a c0323aG12 = mayaCreditActivationAllSetEnhanceFragment5.G1();
                        ((MayaBaseFragment) ((P9.a) c0323aG12.c.get())).E1();
                        CreditReviewUiModel creditReviewUiModel2 = (CreditReviewUiModel) c0323aG12.f2878g;
                        if (creditReviewUiModel2 == null) {
                            kotlin.jvm.internal.j.n("mCreditReviewUiModel");
                            throw null;
                        }
                        J9.a aVar5 = creditReviewUiModel2.f13060l;
                        String str6 = "";
                        if (aVar5 == null || (str3 = aVar5.f2487d) == null) {
                            str3 = "";
                        }
                        String str7 = creditReviewUiModel2.j;
                        if (str7 == null) {
                            str7 = "";
                        }
                        if (S5.c.b((S5.c) c0323aG12.f, A5.b.f76S)) {
                            contactReference = null;
                        } else {
                            J9.a aVar6 = creditReviewUiModel2.f13060l;
                            if (aVar6 == null || (str4 = aVar6.f2485a) == null) {
                                str4 = "";
                            }
                            if (aVar6 == null || (str5 = aVar6.f2486b) == null) {
                                str5 = "";
                            }
                            String strQ = com.paymaya.common.utility.C.q(str3);
                            if (strQ == null) {
                                strQ = "";
                            }
                            J9.a aVar7 = creditReviewUiModel2.f13060l;
                            contactReference = new ContactReference(str4, str5, com.paymaya.common.utility.C.M(aVar7 != null ? aVar7.c : null), strQ);
                        }
                        MothersMaidenName mothersMaidenName = creditReviewUiModel2.f13065r;
                        if (mothersMaidenName == null || (firstName = mothersMaidenName.getFirstName()) == null) {
                            firstName = "";
                        }
                        MothersMaidenName mothersMaidenName2 = creditReviewUiModel2.f13065r;
                        if (mothersMaidenName2 == null || (middleName = mothersMaidenName2.getMiddleName()) == null) {
                            middleName = "";
                        }
                        MothersMaidenName mothersMaidenName3 = creditReviewUiModel2.f13065r;
                        if (mothersMaidenName3 != null && (lastName = mothersMaidenName3.getLastName()) != null) {
                            str6 = lastName;
                        }
                        MothersMaidenName mothersMaidenName4 = creditReviewUiModel2.f13065r;
                        MothersMaidenName mothersMaidenName5 = new MothersMaidenName(firstName, middleName, str6, mothersMaidenName4 != null ? mothersMaidenName4.getHasNoMiddleName() : true);
                        String strQ2 = com.paymaya.common.utility.C.q(str7);
                        PersonalDetailsPatchRequest personalDetailsPatchRequest = new PersonalDetailsPatchRequest(strQ2 == null ? null : strQ2, com.paymaya.common.utility.C.H(creditReviewUiModel2.h), com.paymaya.common.utility.C.J(creditReviewUiModel2.i), contactReference, mothersMaidenName5);
                        String lowerCase = EventMetricsAggregator.OS_NAME.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
                        String string = UUID.randomUUID().toString();
                        kotlin.jvm.internal.j.f(string, "toString(...)");
                        c0323aG12.e(new Lh.d(new Lh.d(new Lh.h(((C1264i0) c0323aG12.e).e(lowerCase, string, personalDetailsPatchRequest), zh.b.a(), 0), new Gb.d(c0323aG12, 5), 2), new G6.v(c0323aG12, 7), 0).e());
                        return Unit.f18162a;
                    default:
                        C0323a c0323aG13 = this.f5317b.G1();
                        CreditReviewUiModel creditReviewUiModel3 = (CreditReviewUiModel) c0323aG13.f2878g;
                        if (creditReviewUiModel3 == null) {
                            kotlin.jvm.internal.j.n("mCreditReviewUiModel");
                            throw null;
                        }
                        String str8 = creditReviewUiModel3.f13057d;
                        if (str8 != null && (dE = zj.x.e(str8)) != null) {
                            double dDoubleValue = dE.doubleValue();
                            MayaCreditActivationAllSetEnhanceFragment mayaCreditActivationAllSetEnhanceFragment6 = (MayaCreditActivationAllSetEnhanceFragment) ((P9.a) c0323aG13.c.get());
                            C1220i c1220iO12 = mayaCreditActivationAllSetEnhanceFragment6.o1();
                            FragmentActivity activity2 = mayaCreditActivationAllSetEnhanceFragment6.getActivity();
                            C1219h c1219hD2 = C1219h.d(EnumC1215d.CREDIT);
                            c1219hD2.r(EnumC1216e.OFFER);
                            c1219hD2.n(17);
                            AbstractC1414e.n(c1219hD2, EnumC1217f.LEARN_MORE, c1220iO12, activity2, c1219hD2);
                            InterfaceC0573c interfaceC0573c = mayaCreditActivationAllSetEnhanceFragment6.f13097Z;
                            if (interfaceC0573c != null) {
                                String str9 = mayaCreditActivationAllSetEnhanceFragment6.f13093V;
                                if (str9 == null) {
                                    kotlin.jvm.internal.j.n("interestRateRenderingEvent");
                                    throw null;
                                }
                                String str10 = mayaCreditActivationAllSetEnhanceFragment6.f13094W;
                                if (str10 == null) {
                                    kotlin.jvm.internal.j.n("interestRateButtonClickEvent");
                                    throw null;
                                }
                                ((NewMayaCreditActivity) interfaceC0573c).d2(str9, str10, dDoubleValue);
                            }
                        }
                        return Unit.f18162a;
                }
            }
        });
        C0466m c0466m7 = this.f13092U;
        j.d(c0466m7);
        ((HtmlTextView) c0466m7.f).setOnLinkClickListener(this);
        EnumC1215d enumC1215d = EnumC1215d.CREDIT;
        C1219h c1219hD = C1219h.d(enumC1215d);
        EnumC1216e enumC1216e = EnumC1216e.SERVICE_FEE;
        c1219hD.r(enumC1216e);
        c1219hD.n(20);
        c1219hD.i();
        this.f13093V = c1219hD.c();
        C1219h c1219hD2 = C1219h.d(enumC1215d);
        c1219hD2.r(enumC1216e);
        c1219hD2.n(17);
        c1219hD2.t(EnumC1217f.GOT_IT);
        c1219hD2.i();
        this.f13094W = c1219hD2.c();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean p1() {
        return this.f13098a0;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.CREDIT;
    }
}
