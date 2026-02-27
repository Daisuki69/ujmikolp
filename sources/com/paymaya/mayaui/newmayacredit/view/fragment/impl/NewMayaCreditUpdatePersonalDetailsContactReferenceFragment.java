package com.paymaya.mayaui.newmayacredit.view.fragment.impl;

import A5.b;
import Ah.p;
import G5.C0251a;
import J9.a;
import Kh.T;
import L9.E;
import L9.F;
import L9.G;
import L9.H;
import L9.I;
import Lh.d;
import Lh.h;
import N5.C0466m;
import P9.o;
import Q9.O;
import Q9.P;
import S5.c;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.ForcedAutoCompleteTextView;
import com.paymaya.domain.model.ContactReference;
import com.paymaya.domain.model.ContactReferencePatchRequest;
import com.paymaya.domain.model.CreditApplication;
import com.paymaya.domain.model.PersonalDetailsPatchRequest;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.C1265j;
import com.paymaya.mayaui.common.view.widget.MayaAutoCompleteInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditUpdatePersonalDetailsContactReferenceFragment;
import defpackage.AbstractC1414e;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class NewMayaCreditUpdatePersonalDetailsContactReferenceFragment extends MayaBaseFragment implements o {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0466m f13313U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ConstraintLayout f13314V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public MayaInputLayout f13315W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public NestedScrollView f13316X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public MayaAutoCompleteInputLayout f13317Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ForcedAutoCompleteTextView f13318Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public MayaAutoCompleteInputLayout f13319a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ForcedAutoCompleteTextView f13320b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Button f13321c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public I f13322d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public O f13323e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final boolean f13324f0 = true;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final boolean f13325g0 = true;

    public static final void H1(NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment) {
        String str;
        String str2;
        String str3;
        int i = 5;
        int i4 = 2;
        int i6 = 1;
        int i10 = 0;
        C1220i c1220iO1 = newMayaCreditUpdatePersonalDetailsContactReferenceFragment.o1();
        FragmentActivity activity = newMayaCreditUpdatePersonalDetailsContactReferenceFragment.getActivity();
        C1219h c1219hD = C1219h.d(newMayaCreditUpdatePersonalDetailsContactReferenceFragment.u1());
        c1219hD.r(EnumC1216e.ASSIGN_CONTACT_REFERENCE);
        c1219hD.n(17);
        AbstractC1414e.n(c1219hD, EnumC1217f.CONTINUE, c1220iO1, activity, c1219hD);
        I iG1 = newMayaCreditUpdatePersonalDetailsContactReferenceFragment.G1();
        boolean zB = c.b(iG1.e, b.f76S);
        CreditReviewUiModel creditReviewUiModel = (CreditReviewUiModel) iG1.i;
        if (creditReviewUiModel != null) {
            if (!iG1.f) {
                NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment2 = (NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((o) iG1.c.get());
                newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.getClass();
                O o8 = newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.f13323e0;
                if (o8 != null) {
                    ((NewMayaCreditActivity) o8).c2(creditReviewUiModel);
                    return;
                }
                return;
            }
            if (zB) {
                ((MayaBaseFragment) ((o) iG1.c.get())).E1();
                String str4 = creditReviewUiModel.j;
                PersonalDetailsPatchRequest personalDetailsPatchRequest = new PersonalDetailsPatchRequest(C.q(str4 != null ? str4 : ""), C.H(creditReviewUiModel.h), C.J(creditReviewUiModel.i), null, null);
                C1264i0 c1264i0 = (C1264i0) iG1.f2876g;
                String lowerCase = EventMetricsAggregator.OS_NAME.toLowerCase(Locale.ROOT);
                j.f(lowerCase, "toLowerCase(...)");
                String string = UUID.randomUUID().toString();
                j.f(string, "toString(...)");
                iG1.e(new T(i, new d(new d(new h(c1264i0.e(lowerCase, string, personalDetailsPatchRequest), zh.b.a(), 0), new G(iG1, i6), i4), new H(iG1, i6), i10), new E(iG1, i4)).e());
                return;
            }
            ((MayaBaseFragment) ((o) iG1.c.get())).E1();
            a aVar = creditReviewUiModel.f13060l;
            if (aVar == null || (str = aVar.f2487d) == null) {
                str = "";
            }
            String str5 = creditReviewUiModel.j;
            if (str5 == null) {
                str5 = "";
            }
            if (aVar == null || (str2 = aVar.f2485a) == null) {
                str2 = "";
            }
            if (aVar == null || (str3 = aVar.f2486b) == null) {
                str3 = "";
            }
            String strQ = C.q(str);
            String str6 = strQ != null ? strQ : "";
            a aVar2 = creditReviewUiModel.f13060l;
            iG1.e(new T(i, new d(new d(new h(((C1264i0) iG1.f2876g).d(new ContactReferencePatchRequest(C.q(str5), C.H(creditReviewUiModel.h), C.J(creditReviewUiModel.i), new ContactReference(str2, str3, C.M(aVar2 != null ? aVar2.c : null), str6))), zh.b.a(), 0), new Gc.h(iG1, 12), i4), new F(iG1, i6), i10), new E(iG1, i10)).e());
        }
    }

    public final I G1() {
        I i = this.f13322d0;
        if (i != null) {
            return i;
        }
        j.n("mPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().D().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        C1264i0 c1264i0A = aVar.A();
        C1265j c1265jE = aVar.e();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        c flagConfigurationService = (c) aVar.f4724k.get();
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        this.f13322d0 = new I(c1264i0A, c1265jE, preference, flagConfigurationService);
        this.f13323e0 = (O) getActivity();
        G1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_update_personal_details_contact_reference, viewGroup, false);
        int i = R.id.button_update_personal_details_continue;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_update_personal_details_continue);
        if (button != null) {
            i = R.id.layout_view_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.layout_view_container);
            if (constraintLayout != null) {
                i = R.id.maya_input_layout_alternate_number;
                MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_alternate_number);
                if (mayaInputLayout != null) {
                    i = R.id.maya_input_layout_gender;
                    MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = (MayaAutoCompleteInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_gender);
                    if (mayaAutoCompleteInputLayout != null) {
                        i = R.id.maya_input_layout_marital_status;
                        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout2 = (MayaAutoCompleteInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_marital_status);
                        if (mayaAutoCompleteInputLayout2 != null) {
                            i = R.id.scroll_view_container;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_container);
                            if (nestedScrollView != null) {
                                i = R.id.space;
                                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.space);
                                if (viewFindChildViewById != null) {
                                    i = R.id.text_view_credit_personal_details_title;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_personal_details_title)) != null) {
                                        i = R.id.text_view_update_personal_details_description;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_update_personal_details_description)) != null) {
                                            i = R.id.text_view_update_personal_details_title;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_update_personal_details_title)) != null) {
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                this.f13313U = new C0466m((ViewGroup) constraintLayout2, (View) button, (View) constraintLayout, (View) mayaInputLayout, (View) mayaAutoCompleteInputLayout, (View) mayaAutoCompleteInputLayout2, (View) nestedScrollView, viewFindChildViewById, 15);
                                                return constraintLayout2;
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
        O o8;
        super.onResume();
        O o10 = this.f13323e0;
        if (o10 != null) {
            ((NewMayaCreditActivity) o10).Q(this);
        }
        I iG1 = G1();
        if (!iG1.f || (o8 = ((NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((o) iG1.c.get())).f13323e0) == null) {
            return;
        }
        NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) o8;
        newMayaCreditActivity.r1();
        newMayaCreditActivity.s1();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        p<CreditApplication> creditApplication;
        Resources resources;
        Resources resources2;
        String str;
        String str2;
        final int i = 5;
        final int i4 = 3;
        final int i6 = 2;
        final int i10 = 1;
        final int i11 = 0;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0466m c0466m = this.f13313U;
        j.d(c0466m);
        this.f13314V = (ConstraintLayout) c0466m.e;
        C0466m c0466m2 = this.f13313U;
        j.d(c0466m2);
        this.f13316X = (NestedScrollView) c0466m2.i;
        C0466m c0466m3 = this.f13313U;
        j.d(c0466m3);
        this.f13315W = (MayaInputLayout) c0466m3.f;
        C0466m c0466m4 = this.f13313U;
        j.d(c0466m4);
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = (MayaAutoCompleteInputLayout) c0466m4.f4152g;
        this.f13318Z = mayaAutoCompleteInputLayout.getInputAutoCompleteEditText();
        mayaAutoCompleteInputLayout.getPrimaryIconImageView();
        this.f13317Y = mayaAutoCompleteInputLayout;
        C0466m c0466m5 = this.f13313U;
        j.d(c0466m5);
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout2 = (MayaAutoCompleteInputLayout) c0466m5.h;
        this.f13320b0 = mayaAutoCompleteInputLayout2.getInputAutoCompleteEditText();
        mayaAutoCompleteInputLayout2.getPrimaryIconImageView();
        this.f13319a0 = mayaAutoCompleteInputLayout2;
        C0466m c0466m6 = this.f13313U;
        j.d(c0466m6);
        this.f13321c0 = (Button) c0466m6.c;
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(u1());
        AbstractC1414e.m(c1219hD, EnumC1216e.UPDATE_PERSONAL_DETAILS, 21);
        c1220iO1.c(activity, c1219hD);
        Bundle arguments = getArguments();
        CreditReviewUiModel creditReviewUiModel = arguments != null ? (CreditReviewUiModel) arguments.getParcelable("bundle_credit_review") : null;
        I iG1 = G1();
        iG1.j();
        if (creditReviewUiModel != null) {
            iG1.f = true;
            iG1.i = creditReviewUiModel;
            String str3 = creditReviewUiModel.h;
            if (str3 != null) {
                iG1.u(str3);
            }
            CreditReviewUiModel creditReviewUiModel2 = (CreditReviewUiModel) iG1.i;
            if (creditReviewUiModel2 != null && (str2 = creditReviewUiModel2.i) != null) {
                iG1.v(str2);
            }
            CreditReviewUiModel creditReviewUiModel3 = (CreditReviewUiModel) iG1.i;
            if (creditReviewUiModel3 != null && (str = creditReviewUiModel3.j) != null) {
                String strQ = C.q(str);
                String alternateMobileNumber = C.p(strQ);
                NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment = (NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((o) iG1.c.get());
                newMayaCreditUpdatePersonalDetailsContactReferenceFragment.getClass();
                j.g(alternateMobileNumber, "alternateMobileNumber");
                MayaInputLayout mayaInputLayout = newMayaCreditUpdatePersonalDetailsContactReferenceFragment.f13315W;
                if (mayaInputLayout == null) {
                    j.n("mMayaInputLayoutAltMobileNumber");
                    throw null;
                }
                mayaInputLayout.getInputEditText().setText(alternateMobileNumber);
                if (strQ != null) {
                    iG1.o(strQ);
                }
            }
            iG1.l();
            ((NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((o) iG1.c.get())).s1().g();
        } else {
            ((MayaBaseFragment) ((o) iG1.c.get())).E1();
            C1264i0 c1264i0 = (C1264i0) iG1.f2876g;
            if (c1264i0.i()) {
                creditApplication = c1264i0.c.getCreditApplication(C1264i0.a(c1264i0));
                j.d(creditApplication);
            } else {
                creditApplication = c1264i0.f11449b.getCreditApplication();
                j.d(creditApplication);
            }
            iG1.e(new T(i, new d(new d(new h(creditApplication, zh.b.a(), 0), new H(iG1, i11), i6), new Gb.d(iG1, 12), i11), new E(iG1, i10)).e());
        }
        ConstraintLayout constraintLayout = this.f13314V;
        if (constraintLayout == null) {
            j.n("mLayoutViewContainer");
            throw null;
        }
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: Q9.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditUpdatePersonalDetailsContactReferenceFragment f5311b;

            {
                this.f5311b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment2 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.getActivity());
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment3 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment3.G1().m();
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment4 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment4.G1().m();
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment4.getActivity());
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment5 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment5.G1().n();
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment6 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment6.G1().n();
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment6.getActivity());
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment7 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditUpdatePersonalDetailsContactReferenceFragment.H1(newMayaCreditUpdatePersonalDetailsContactReferenceFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaInputLayout mayaInputLayout2 = this.f13315W;
        if (mayaInputLayout2 == null) {
            j.n("mMayaInputLayoutAltMobileNumber");
            throw null;
        }
        mayaInputLayout2.q();
        AppCompatEditText inputEditText = mayaInputLayout2.getInputEditText();
        inputEditText.addTextChangedListener(new P(this, i6));
        inputEditText.setFilters(new InputFilter[]{new G5.E(this, 2)});
        G1().l();
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout3 = this.f13317Y;
        if (mayaAutoCompleteInputLayout3 == null) {
            j.n("mMayaInputLayoutGender");
            throw null;
        }
        ForcedAutoCompleteTextView inputAutoCompleteEditText = mayaAutoCompleteInputLayout3.getInputAutoCompleteEditText();
        inputAutoCompleteEditText.setInputType(0);
        inputAutoCompleteEditText.setFocusable(false);
        inputAutoCompleteEditText.setOnClickListener(new View.OnClickListener(this) { // from class: Q9.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditUpdatePersonalDetailsContactReferenceFragment f5311b;

            {
                this.f5311b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment2 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.getActivity());
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment3 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment3.G1().m();
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment4 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment4.G1().m();
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment4.getActivity());
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment5 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment5.G1().n();
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment6 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment6.G1().n();
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment6.getActivity());
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment7 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditUpdatePersonalDetailsContactReferenceFragment.H1(newMayaCreditUpdatePersonalDetailsContactReferenceFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        inputAutoCompleteEditText.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: Q9.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditUpdatePersonalDetailsContactReferenceFragment f5313b;

            {
                this.f5313b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z4) {
                switch (i11) {
                    case 0:
                        if (z4) {
                            NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment2 = this.f5313b;
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.G1().m();
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.getActivity());
                        }
                        break;
                    default:
                        if (z4) {
                            NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment3 = this.f5313b;
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment3.G1().n();
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment3.getActivity());
                        }
                        break;
                }
            }
        });
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout4 = this.f13317Y;
        if (mayaAutoCompleteInputLayout4 == null) {
            j.n("mMayaInputLayoutGender");
            throw null;
        }
        ImageView primaryIconImageView = mayaAutoCompleteInputLayout4.getPrimaryIconImageView();
        FragmentActivity activity2 = getActivity();
        primaryIconImageView.setImageDrawable((activity2 == null || (resources2 = activity2.getResources()) == null) ? null : resources2.getDrawable(2131231351));
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout5 = this.f13317Y;
        if (mayaAutoCompleteInputLayout5 == null) {
            j.n("mMayaInputLayoutGender");
            throw null;
        }
        mayaAutoCompleteInputLayout5.getPrimaryIconImageView().setOnClickListener(new View.OnClickListener(this) { // from class: Q9.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditUpdatePersonalDetailsContactReferenceFragment f5311b;

            {
                this.f5311b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment2 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.getActivity());
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment3 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment3.G1().m();
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment4 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment4.G1().m();
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment4.getActivity());
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment5 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment5.G1().n();
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment6 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment6.G1().n();
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment6.getActivity());
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment7 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditUpdatePersonalDetailsContactReferenceFragment.H1(newMayaCreditUpdatePersonalDetailsContactReferenceFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout6 = this.f13319a0;
        if (mayaAutoCompleteInputLayout6 == null) {
            j.n("mMayaInputLayoutMaritalStatus");
            throw null;
        }
        ForcedAutoCompleteTextView inputAutoCompleteEditText2 = mayaAutoCompleteInputLayout6.getInputAutoCompleteEditText();
        inputAutoCompleteEditText2.setInputType(0);
        inputAutoCompleteEditText2.setFocusable(false);
        inputAutoCompleteEditText2.setOnClickListener(new View.OnClickListener(this) { // from class: Q9.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditUpdatePersonalDetailsContactReferenceFragment f5311b;

            {
                this.f5311b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment2 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.getActivity());
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment3 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment3.G1().m();
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment4 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment4.G1().m();
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment4.getActivity());
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment5 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment5.G1().n();
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment6 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment6.G1().n();
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment6.getActivity());
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment7 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditUpdatePersonalDetailsContactReferenceFragment.H1(newMayaCreditUpdatePersonalDetailsContactReferenceFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        inputAutoCompleteEditText2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: Q9.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditUpdatePersonalDetailsContactReferenceFragment f5313b;

            {
                this.f5313b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z4) {
                switch (i10) {
                    case 0:
                        if (z4) {
                            NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment2 = this.f5313b;
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.G1().m();
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.getActivity());
                        }
                        break;
                    default:
                        if (z4) {
                            NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment3 = this.f5313b;
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment3.G1().n();
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment3.getActivity());
                        }
                        break;
                }
            }
        });
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout7 = this.f13319a0;
        if (mayaAutoCompleteInputLayout7 == null) {
            j.n("mMayaInputLayoutMaritalStatus");
            throw null;
        }
        ImageView primaryIconImageView2 = mayaAutoCompleteInputLayout7.getPrimaryIconImageView();
        FragmentActivity activity3 = getActivity();
        primaryIconImageView2.setImageDrawable((activity3 == null || (resources = activity3.getResources()) == null) ? null : resources.getDrawable(2131231351));
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout8 = this.f13319a0;
        if (mayaAutoCompleteInputLayout8 == null) {
            j.n("mMayaInputLayoutMaritalStatus");
            throw null;
        }
        final int i12 = 4;
        mayaAutoCompleteInputLayout8.getPrimaryIconImageView().setOnClickListener(new View.OnClickListener(this) { // from class: Q9.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditUpdatePersonalDetailsContactReferenceFragment f5311b;

            {
                this.f5311b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment2 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.getActivity());
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment3 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment3.G1().m();
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment4 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment4.G1().m();
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment4.getActivity());
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment5 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment5.G1().n();
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment6 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment6.G1().n();
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment6.getActivity());
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment7 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditUpdatePersonalDetailsContactReferenceFragment.H1(newMayaCreditUpdatePersonalDetailsContactReferenceFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button = this.f13321c0;
        if (button == null) {
            j.n("mContinueButton");
            throw null;
        }
        button.setOnClickListener(new View.OnClickListener(this) { // from class: Q9.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditUpdatePersonalDetailsContactReferenceFragment f5311b;

            {
                this.f5311b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment2 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.getActivity());
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment3 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment3.G1().m();
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment4 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment4.G1().m();
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment4.getActivity());
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment5 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment5.G1().n();
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment6 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditUpdatePersonalDetailsContactReferenceFragment6.G1().n();
                            com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment6.getActivity());
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment7 = this.f5311b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditUpdatePersonalDetailsContactReferenceFragment.H1(newMayaCreditUpdatePersonalDetailsContactReferenceFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        I iG12 = G1();
        MayaInputLayout mayaInputLayout3 = this.f13315W;
        if (mayaInputLayout3 == null) {
            j.n("mMayaInputLayoutAltMobileNumber");
            throw null;
        }
        mayaInputLayout3.getInputEditText().setInputType(3);
        mayaInputLayout3.getInputEditText().addTextChangedListener(new C0251a(i4, iG12, this));
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout9 = this.f13317Y;
        if (mayaAutoCompleteInputLayout9 == null) {
            j.n("mMayaInputLayoutGender");
            throw null;
        }
        mayaAutoCompleteInputLayout9.getInputAutoCompleteEditText();
        ForcedAutoCompleteTextView forcedAutoCompleteTextView = this.f13318Z;
        if (forcedAutoCompleteTextView == null) {
            j.n("mAutoCompleteTextViewGender");
            throw null;
        }
        forcedAutoCompleteTextView.addTextChangedListener(new P(this, i11));
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout10 = this.f13319a0;
        if (mayaAutoCompleteInputLayout10 == null) {
            j.n("mMayaInputLayoutMaritalStatus");
            throw null;
        }
        mayaAutoCompleteInputLayout10.getInputAutoCompleteEditText();
        ForcedAutoCompleteTextView forcedAutoCompleteTextView2 = this.f13320b0;
        if (forcedAutoCompleteTextView2 == null) {
            j.n("mAutoCompleteTextViewMaritalStatus");
            throw null;
        }
        forcedAutoCompleteTextView2.addTextChangedListener(new P(this, i10));
        getParentFragmentManager().setFragmentResultListener("model_values", this, new Na.d(this, 9));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean p1() {
        return this.f13324f0;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean r1() {
        return this.f13325g0;
    }
}
