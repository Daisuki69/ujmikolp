package com.paymaya.mayaui.newmayacredit.view.fragment.impl;

import G5.G;
import G6.m;
import G6.v;
import G7.t;
import J9.a;
import Kh.I;
import Kh.T;
import L9.q;
import Lh.d;
import M8.D2;
import N5.F;
import P9.h;
import Q9.r;
import S5.c;
import android.content.res.Resources;
import android.os.Bundle;
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
import androidx.fragment.app.FragmentResultListener;
import androidx.viewbinding.ViewBindings;
import cj.C1132s;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.ForcedAutoCompleteTextView;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.ContactModel;
import com.paymaya.domain.model.ContactReference;
import com.paymaya.domain.model.ContactReferencePatchRequest;
import com.paymaya.domain.model.MayaChoicesAdapterItem;
import com.paymaya.mayaui.common.view.dialog.impl.MayaChoicesBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaAutoCompleteInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditAssignContactReferenceFragment;
import defpackage.AbstractC1414e;
import java.util.UUID;
import kotlin.jvm.internal.j;
import zh.b;
import zj.o;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class NewMayaCreditAssignContactReferenceFragment extends MayaBaseFragment implements h {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public F f13162U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ConstraintLayout f13163V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public MayaInputLayout f13164W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public MayaInputLayout f13165X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public MayaAutoCompleteInputLayout f13166Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ForcedAutoCompleteTextView f13167Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public MayaAutoCompleteInputLayout f13168a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Button f13169b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Button f13170c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public q f13171d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Q9.q f13172e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final D2 f13173f0 = new D2(this, 4);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final boolean f13174g0 = true;

    public static final void H1(NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment) {
        String str;
        String str2;
        String str3;
        int i = 0;
        C1220i c1220iO1 = newMayaCreditAssignContactReferenceFragment.o1();
        FragmentActivity activity = newMayaCreditAssignContactReferenceFragment.getActivity();
        C1219h c1219hD = C1219h.d(newMayaCreditAssignContactReferenceFragment.u1());
        c1219hD.r(EnumC1216e.ASSIGN_CONTACT_REFERENCE);
        c1219hD.n(17);
        AbstractC1414e.n(c1219hD, EnumC1217f.CONTINUE, c1220iO1, activity, c1219hD);
        q qVarG1 = newMayaCreditAssignContactReferenceFragment.G1();
        CreditReviewUiModel creditReviewUiModel = qVarG1.e;
        if (creditReviewUiModel != null) {
            if (!qVarG1.f) {
                NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment2 = (NewMayaCreditAssignContactReferenceFragment) ((h) qVarG1.c.get());
                newMayaCreditAssignContactReferenceFragment2.getClass();
                Q9.q qVar = newMayaCreditAssignContactReferenceFragment2.f13172e0;
                if (qVar != null) {
                    ((NewMayaCreditActivity) qVar).a2(creditReviewUiModel);
                    return;
                }
                return;
            }
            ((MayaBaseFragment) ((h) qVarG1.c.get())).E1();
            a aVar = creditReviewUiModel.f13060l;
            if (aVar == null || (str = aVar.f2487d) == null) {
                str = "";
            }
            String str4 = creditReviewUiModel.j;
            if (str4 == null) {
                str4 = "";
            }
            if (aVar == null || (str2 = aVar.f2485a) == null) {
                str2 = "";
            }
            if (aVar == null || (str3 = aVar.f2486b) == null) {
                str3 = "";
            }
            String strQ = C.q(str);
            String str5 = strQ != null ? strQ : "";
            a aVar2 = creditReviewUiModel.f13060l;
            qVarG1.e(new T(5, new d(new d(new Lh.h(qVarG1.f2908d.d(new ContactReferencePatchRequest(C.q(str4), C.H(creditReviewUiModel.h), C.J(creditReviewUiModel.i), new ContactReference(str2, str3, C.M(aVar2 != null ? aVar2.c : null), str5))), b.a(), 0), new v(qVarG1, 11), 2), new Gc.h(qVarG1, 7), i), new t(qVarG1, 16)).e());
        }
    }

    public static final void I1(NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment) {
        C1220i c1220iO1 = newMayaCreditAssignContactReferenceFragment.o1();
        FragmentActivity activity = newMayaCreditAssignContactReferenceFragment.getActivity();
        C1219h c1219hD = C1219h.d(newMayaCreditAssignContactReferenceFragment.u1());
        c1219hD.r(EnumC1216e.ASSIGN_CONTACT_REFERENCE);
        c1219hD.n(17);
        AbstractC1414e.n(c1219hD, EnumC1217f.LEARN_MORE, c1220iO1, activity, c1219hD);
        Q9.q qVar = ((NewMayaCreditAssignContactReferenceFragment) ((h) newMayaCreditAssignContactReferenceFragment.G1().c.get())).f13172e0;
        if (qVar != null) {
            NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) qVar;
            E.a("NewMayaCreditActivity", "showLearnMoreBottomSheet");
            new NewMayaCreditContactReferenceLearnMoreBottomSheetFragment().show(newMayaCreditActivity.getSupportFragmentManager(), AbstractC1236z.d(newMayaCreditActivity, NewMayaCreditContactReferenceLearnMoreBottomSheetFragment.class));
        }
    }

    public final q G1() {
        q qVar = this.f13171d0;
        if (qVar != null) {
            return qVar;
        }
        j.n("mNewMayaCreditAssignContactReferenceFragmentPresenter");
        throw null;
    }

    public final void J1() {
        Q9.q qVar = this.f13172e0;
        if (qVar != null) {
            NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) qVar;
            E.a("NewMayaCreditActivity", "showContactRelationshipBottomSheet");
            String strD = AbstractC1236z.d(newMayaCreditActivity, MayaChoicesBottomSheetDialogFragment.class);
            String string = newMayaCreditActivity.getString(R.string.maya_label_contact_relationship_bottom_sheet_title);
            j.f(string, "getString(...)");
            m mVarX1 = newMayaCreditActivity.X1();
            String string2 = ((NewMayaCreditActivity) ((M9.d) mVarX1.c.get())).getString(R.string.maya_label_contact_relationship_value_parent);
            j.f(string2, "getString(...)");
            String string3 = ((NewMayaCreditActivity) ((M9.d) mVarX1.c.get())).getString(R.string.maya_label_contact_relationship_value_sibling);
            j.f(string3, "getString(...)");
            String string4 = ((NewMayaCreditActivity) ((M9.d) mVarX1.c.get())).getString(R.string.maya_label_contact_relationship_value_spouse);
            j.f(string4, "getString(...)");
            String string5 = ((NewMayaCreditActivity) ((M9.d) mVarX1.c.get())).getString(R.string.maya_label_contact_relationship_value_child);
            j.f(string5, "getString(...)");
            String string6 = ((NewMayaCreditActivity) ((M9.d) mVarX1.c.get())).getString(R.string.maya_label_contact_relationship_value_grandparent);
            j.f(string6, "getString(...)");
            String string7 = ((NewMayaCreditActivity) ((M9.d) mVarX1.c.get())).getString(R.string.maya_label_contact_relationship_value_grandchild);
            j.f(string7, "getString(...)");
            String string8 = ((NewMayaCreditActivity) ((M9.d) mVarX1.c.get())).getString(R.string.maya_label_contact_relationship_value_in_law);
            j.f(string8, "getString(...)");
            String string9 = ((NewMayaCreditActivity) ((M9.d) mVarX1.c.get())).getString(R.string.maya_label_contact_relationship_value_friend);
            j.f(string9, "getString(...)");
            String string10 = ((NewMayaCreditActivity) ((M9.d) mVarX1.c.get())).getString(R.string.maya_label_contact_relationship_value_colleague);
            j.f(string10, "getString(...)");
            MayaChoicesBottomSheetDialogFragment mayaChoicesBottomSheetDialogFragmentI = I.i(string, C1132s.g(string2, string3, string4, string5, string6, string7, string8, string9, string10), true);
            mayaChoicesBottomSheetDialogFragmentI.f11835a0 = R.drawable.maya_bg_color_background_secondary_rounded;
            mayaChoicesBottomSheetDialogFragmentI.show(newMayaCreditActivity.getSupportFragmentManager(), strD);
        }
        C.R(getActivity());
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().D().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f13171d0 = new q(aVar.A());
        this.f13172e0 = (Q9.q) getActivity();
        G1().h(this);
        UUID.randomUUID().toString();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_assign_contact_reference, viewGroup, false);
        int i = R.id.assign_contact_reference_description_text_view;
        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.assign_contact_reference_description_text_view)) != null) {
            i = R.id.assign_contact_reference_header_text_view;
            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.assign_contact_reference_header_text_view)) != null) {
                i = R.id.button_learn_more;
                Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_learn_more);
                if (button != null) {
                    i = R.id.constraint_layout_contact_reference_consent_container;
                    if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_contact_reference_consent_container)) != null) {
                        i = R.id.contact_relationship_maya_input_layout;
                        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = (MayaAutoCompleteInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.contact_relationship_maya_input_layout);
                        if (mayaAutoCompleteInputLayout != null) {
                            i = R.id.continue_button;
                            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.continue_button);
                            if (button2 != null) {
                                i = R.id.first_name_maya_input_layout;
                                MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.first_name_maya_input_layout);
                                if (mayaInputLayout != null) {
                                    i = R.id.last_name_maya_input_layout;
                                    MayaInputLayout mayaInputLayout2 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.last_name_maya_input_layout);
                                    if (mayaInputLayout2 != null) {
                                        i = R.id.layout_view_container;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.layout_view_container);
                                        if (constraintLayout != null) {
                                            i = R.id.mobile_number_maya_input_layout;
                                            MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout2 = (MayaAutoCompleteInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.mobile_number_maya_input_layout);
                                            if (mayaAutoCompleteInputLayout2 != null) {
                                                i = R.id.scroll_view_container;
                                                if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_container)) != null) {
                                                    i = R.id.space;
                                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.space);
                                                    if (viewFindChildViewById != null) {
                                                        i = R.id.text_view_bank_information_1;
                                                        if (((HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_bank_information_1)) != null) {
                                                            i = R.id.text_view_bank_information_2;
                                                            if (((HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_bank_information_2)) != null) {
                                                                i = R.id.text_view_contact_reference_consent_icon;
                                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_contact_reference_consent_icon)) != null) {
                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                                    this.f13162U = new F(constraintLayout2, button, mayaAutoCompleteInputLayout, button2, mayaInputLayout, mayaInputLayout2, constraintLayout, mayaAutoCompleteInputLayout2, viewFindChildViewById);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Q9.q qVar;
        super.onResume();
        Q9.q qVar2 = this.f13172e0;
        if (qVar2 != null) {
            ((NewMayaCreditActivity) qVar2).Q(this);
        }
        x1(this.f13173f0);
        q qVarG1 = G1();
        if (!qVarG1.f || (qVar = ((NewMayaCreditAssignContactReferenceFragment) ((h) qVarG1.c.get())).f13172e0) == null) {
            return;
        }
        NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) qVar;
        newMayaCreditActivity.r1();
        newMayaCreditActivity.s1();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        a aVar;
        Resources resources;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        F f = this.f13162U;
        j.d(f);
        this.f13163V = (ConstraintLayout) f.f3615d;
        F f3 = this.f13162U;
        j.d(f3);
        this.f13164W = (MayaInputLayout) f3.h;
        F f7 = this.f13162U;
        j.d(f7);
        this.f13165X = (MayaInputLayout) f7.i;
        F f10 = this.f13162U;
        j.d(f10);
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = (MayaAutoCompleteInputLayout) f10.f;
        this.f13167Z = mayaAutoCompleteInputLayout.getInputAutoCompleteEditText();
        mayaAutoCompleteInputLayout.getPrimaryIconImageView();
        this.f13166Y = mayaAutoCompleteInputLayout;
        F f11 = this.f13162U;
        j.d(f11);
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout2 = (MayaAutoCompleteInputLayout) f11.f3616g;
        mayaAutoCompleteInputLayout2.getInputAutoCompleteEditText();
        mayaAutoCompleteInputLayout2.getPrimaryIconImageView();
        this.f13168a0 = mayaAutoCompleteInputLayout2;
        F f12 = this.f13162U;
        j.d(f12);
        this.f13169b0 = (Button) f12.c;
        F f13 = this.f13162U;
        j.d(f13);
        this.f13170c0 = (Button) f13.e;
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(u1());
        AbstractC1414e.m(c1219hD, EnumC1216e.ASSIGN_CONTACT_REFERENCE, 21);
        c1220iO1.c(activity, c1219hD);
        ConstraintLayout constraintLayout = this.f13163V;
        if (constraintLayout == null) {
            j.n("mLayoutViewContainer");
            throw null;
        }
        final int i = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: Q9.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditAssignContactReferenceFragment f5327b;

            {
                this.f5327b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditAssignContactReferenceFragment.getActivity());
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment2 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditAssignContactReferenceFragment.I1(newMayaCreditAssignContactReferenceFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment3 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment3.J1();
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment4 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            ((NewMayaCreditAssignContactReferenceFragment) ((P9.h) newMayaCreditAssignContactReferenceFragment4.G1().c.get())).J1();
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment5 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment5.G1().l();
                            return;
                        } finally {
                        }
                    case 5:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment6 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment6.G1().l();
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment7 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditAssignContactReferenceFragment.H1(newMayaCreditAssignContactReferenceFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button = this.f13169b0;
        if (button == null) {
            j.n("mLearnMoreButton");
            throw null;
        }
        final int i4 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: Q9.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditAssignContactReferenceFragment f5327b;

            {
                this.f5327b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditAssignContactReferenceFragment.getActivity());
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment2 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditAssignContactReferenceFragment.I1(newMayaCreditAssignContactReferenceFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment3 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment3.J1();
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment4 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            ((NewMayaCreditAssignContactReferenceFragment) ((P9.h) newMayaCreditAssignContactReferenceFragment4.G1().c.get())).J1();
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment5 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment5.G1().l();
                            return;
                        } finally {
                        }
                    case 5:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment6 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment6.G1().l();
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment7 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditAssignContactReferenceFragment.H1(newMayaCreditAssignContactReferenceFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout3 = this.f13166Y;
        if (mayaAutoCompleteInputLayout3 == null) {
            j.n("mMayaInputLayoutContactReference");
            throw null;
        }
        ForcedAutoCompleteTextView inputAutoCompleteEditText = mayaAutoCompleteInputLayout3.getInputAutoCompleteEditText();
        inputAutoCompleteEditText.setInputType(0);
        inputAutoCompleteEditText.setFocusable(false);
        final int i6 = 2;
        inputAutoCompleteEditText.setOnClickListener(new View.OnClickListener(this) { // from class: Q9.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditAssignContactReferenceFragment f5327b;

            {
                this.f5327b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditAssignContactReferenceFragment.getActivity());
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment2 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditAssignContactReferenceFragment.I1(newMayaCreditAssignContactReferenceFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment3 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment3.J1();
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment4 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            ((NewMayaCreditAssignContactReferenceFragment) ((P9.h) newMayaCreditAssignContactReferenceFragment4.G1().c.get())).J1();
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment5 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment5.G1().l();
                            return;
                        } finally {
                        }
                    case 5:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment6 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment6.G1().l();
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment7 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditAssignContactReferenceFragment.H1(newMayaCreditAssignContactReferenceFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i10 = 0;
        inputAutoCompleteEditText.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: Q9.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditAssignContactReferenceFragment f5331b;

            {
                this.f5331b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z4) {
                switch (i10) {
                    case 0:
                        if (z4) {
                            NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment = this.f5331b;
                            newMayaCreditAssignContactReferenceFragment.J1();
                            com.paymaya.common.utility.C.R(newMayaCreditAssignContactReferenceFragment.getActivity());
                        }
                        break;
                    default:
                        if (z4) {
                            this.f5331b.G1().l();
                        }
                        break;
                }
            }
        });
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout4 = this.f13166Y;
        if (mayaAutoCompleteInputLayout4 == null) {
            j.n("mMayaInputLayoutContactReference");
            throw null;
        }
        ImageView primaryIconImageView = mayaAutoCompleteInputLayout4.getPrimaryIconImageView();
        FragmentActivity activity2 = getActivity();
        primaryIconImageView.setImageDrawable((activity2 == null || (resources = activity2.getResources()) == null) ? null : resources.getDrawable(2131231351));
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout5 = this.f13166Y;
        if (mayaAutoCompleteInputLayout5 == null) {
            j.n("mMayaInputLayoutContactReference");
            throw null;
        }
        final int i11 = 3;
        mayaAutoCompleteInputLayout5.getPrimaryIconImageView().setOnClickListener(new View.OnClickListener(this) { // from class: Q9.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditAssignContactReferenceFragment f5327b;

            {
                this.f5327b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditAssignContactReferenceFragment.getActivity());
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment2 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditAssignContactReferenceFragment.I1(newMayaCreditAssignContactReferenceFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment3 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment3.J1();
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment4 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            ((NewMayaCreditAssignContactReferenceFragment) ((P9.h) newMayaCreditAssignContactReferenceFragment4.G1().c.get())).J1();
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment5 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment5.G1().l();
                            return;
                        } finally {
                        }
                    case 5:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment6 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment6.G1().l();
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment7 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditAssignContactReferenceFragment.H1(newMayaCreditAssignContactReferenceFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout6 = this.f13168a0;
        if (mayaAutoCompleteInputLayout6 == null) {
            j.n("mMayaInputLayoutMobileNumber");
            throw null;
        }
        ForcedAutoCompleteTextView inputAutoCompleteEditText2 = mayaAutoCompleteInputLayout6.getInputAutoCompleteEditText();
        inputAutoCompleteEditText2.setInputType(0);
        inputAutoCompleteEditText2.setFocusable(false);
        final int i12 = 4;
        inputAutoCompleteEditText2.setOnClickListener(new View.OnClickListener(this) { // from class: Q9.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditAssignContactReferenceFragment f5327b;

            {
                this.f5327b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditAssignContactReferenceFragment.getActivity());
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment2 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditAssignContactReferenceFragment.I1(newMayaCreditAssignContactReferenceFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment3 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment3.J1();
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment4 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            ((NewMayaCreditAssignContactReferenceFragment) ((P9.h) newMayaCreditAssignContactReferenceFragment4.G1().c.get())).J1();
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment5 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment5.G1().l();
                            return;
                        } finally {
                        }
                    case 5:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment6 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment6.G1().l();
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment7 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditAssignContactReferenceFragment.H1(newMayaCreditAssignContactReferenceFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i13 = 1;
        inputAutoCompleteEditText2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: Q9.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditAssignContactReferenceFragment f5331b;

            {
                this.f5331b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z4) {
                switch (i13) {
                    case 0:
                        if (z4) {
                            NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment = this.f5331b;
                            newMayaCreditAssignContactReferenceFragment.J1();
                            com.paymaya.common.utility.C.R(newMayaCreditAssignContactReferenceFragment.getActivity());
                        }
                        break;
                    default:
                        if (z4) {
                            this.f5331b.G1().l();
                        }
                        break;
                }
            }
        });
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout7 = this.f13168a0;
        if (mayaAutoCompleteInputLayout7 == null) {
            j.n("mMayaInputLayoutMobileNumber");
            throw null;
        }
        final int i14 = 5;
        mayaAutoCompleteInputLayout7.getPrimaryIconImageView().setOnClickListener(new View.OnClickListener(this) { // from class: Q9.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditAssignContactReferenceFragment f5327b;

            {
                this.f5327b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditAssignContactReferenceFragment.getActivity());
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment2 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditAssignContactReferenceFragment.I1(newMayaCreditAssignContactReferenceFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment3 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment3.J1();
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment4 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            ((NewMayaCreditAssignContactReferenceFragment) ((P9.h) newMayaCreditAssignContactReferenceFragment4.G1().c.get())).J1();
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment5 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment5.G1().l();
                            return;
                        } finally {
                        }
                    case 5:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment6 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment6.G1().l();
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment7 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditAssignContactReferenceFragment.H1(newMayaCreditAssignContactReferenceFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f13170c0;
        if (button2 == null) {
            j.n("mContinueButton");
            throw null;
        }
        final int i15 = 6;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: Q9.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditAssignContactReferenceFragment f5327b;

            {
                this.f5327b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            com.paymaya.common.utility.C.R(newMayaCreditAssignContactReferenceFragment.getActivity());
                            return;
                        } finally {
                        }
                    case 1:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment2 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditAssignContactReferenceFragment.I1(newMayaCreditAssignContactReferenceFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment3 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment3.J1();
                            return;
                        } finally {
                        }
                    case 3:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment4 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            ((NewMayaCreditAssignContactReferenceFragment) ((P9.h) newMayaCreditAssignContactReferenceFragment4.G1().c.get())).J1();
                            return;
                        } finally {
                        }
                    case 4:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment5 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment5.G1().l();
                            return;
                        } finally {
                        }
                    case 5:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment6 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            newMayaCreditAssignContactReferenceFragment6.G1().l();
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment7 = this.f5327b;
                        Callback.onClick_enter(view2);
                        try {
                            NewMayaCreditAssignContactReferenceFragment.H1(newMayaCreditAssignContactReferenceFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        q qVarG1 = G1();
        MayaInputLayout mayaInputLayout = this.f13164W;
        if (mayaInputLayout == null) {
            j.n("mMayaInputLayoutFirstName");
            throw null;
        }
        mayaInputLayout.getInputEditText().addTextChangedListener(new r(qVarG1, 0));
        MayaInputLayout mayaInputLayout2 = this.f13165X;
        if (mayaInputLayout2 == null) {
            j.n("mMayaInputLayoutLastName");
            throw null;
        }
        mayaInputLayout2.getInputEditText().addTextChangedListener(new r(qVarG1, 1));
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout8 = this.f13168a0;
        if (mayaAutoCompleteInputLayout8 == null) {
            j.n("mMayaInputLayoutMobileNumber");
            throw null;
        }
        mayaAutoCompleteInputLayout8.getInputAutoCompleteEditText().setInputType(3);
        mayaAutoCompleteInputLayout8.getInputAutoCompleteEditText().addTextChangedListener(new r(qVarG1, 2));
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout9 = this.f13166Y;
        if (mayaAutoCompleteInputLayout9 == null) {
            j.n("mMayaInputLayoutContactReference");
            throw null;
        }
        mayaAutoCompleteInputLayout9.getInputAutoCompleteEditText().addTextChangedListener(new r(qVarG1, 3));
        final int i16 = 0;
        getParentFragmentManager().setFragmentResultListener("model_values", this, new FragmentResultListener(this) { // from class: Q9.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditAssignContactReferenceFragment f5329b;

            {
                this.f5329b = this;
            }

            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                CreditReviewUiModel creditReviewUiModel;
                J9.a aVar2;
                CreditReviewUiModel creditReviewUiModel2;
                J9.a aVar3;
                switch (i16) {
                    case 0:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment = this.f5329b;
                        kotlin.jvm.internal.j.g(str, "<unused var>");
                        kotlin.jvm.internal.j.g(bundle2, "bundle");
                        L9.q qVarG12 = newMayaCreditAssignContactReferenceFragment.G1();
                        MayaChoicesAdapterItem mayaChoicesAdapterItem = (MayaChoicesAdapterItem) bundle2.getParcelable("model_values");
                        if (mayaChoicesAdapterItem == null || (creditReviewUiModel = qVarG12.e) == null || (aVar2 = creditReviewUiModel.f13060l) == null) {
                            return;
                        }
                        aVar2.c = mayaChoicesAdapterItem.getItemAsString();
                        P9.h hVar = (P9.h) qVarG12.c.get();
                        String str2 = aVar2.c;
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment2 = (NewMayaCreditAssignContactReferenceFragment) hVar;
                        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout10 = newMayaCreditAssignContactReferenceFragment2.f13166Y;
                        if (mayaAutoCompleteInputLayout10 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutContactReference");
                            throw null;
                        }
                        mayaAutoCompleteInputLayout10.getInputAutoCompleteEditText().setText(str2);
                        newMayaCreditAssignContactReferenceFragment2.G1().k();
                        com.paymaya.common.utility.C.R(newMayaCreditAssignContactReferenceFragment2.getActivity());
                        return;
                    default:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment3 = this.f5329b;
                        kotlin.jvm.internal.j.g(str, "<unused var>");
                        kotlin.jvm.internal.j.g(bundle2, "bundle");
                        L9.q qVarG13 = newMayaCreditAssignContactReferenceFragment3.G1();
                        ContactModel contactModel = (ContactModel) bundle2.getParcelable("key_selected_contact_model");
                        if (contactModel == null || (creditReviewUiModel2 = qVarG13.e) == null || (aVar3 = creditReviewUiModel2.f13060l) == null) {
                            return;
                        }
                        String mobileNumber = com.paymaya.common.utility.C.q(contactModel.getNumber());
                        if (mobileNumber == null) {
                            mobileNumber = contactModel.getNumber();
                        }
                        kotlin.jvm.internal.j.g(mobileNumber, "mobileNumber");
                        aVar3.f2487d = new zj.o("[^0-9 ]").f("", mobileNumber);
                        P9.h hVar2 = (P9.h) qVarG13.c.get();
                        String str3 = aVar3.f2487d;
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment4 = (NewMayaCreditAssignContactReferenceFragment) hVar2;
                        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout11 = newMayaCreditAssignContactReferenceFragment4.f13168a0;
                        if (mayaAutoCompleteInputLayout11 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutMobileNumber");
                            throw null;
                        }
                        mayaAutoCompleteInputLayout11.getInputAutoCompleteEditText().setText(com.paymaya.common.utility.C.p(str3));
                        newMayaCreditAssignContactReferenceFragment4.G1().k();
                        com.paymaya.common.utility.C.R(newMayaCreditAssignContactReferenceFragment4.getActivity());
                        return;
                }
            }
        });
        final int i17 = 1;
        getParentFragmentManager().setFragmentResultListener("key_contact_request", this, new FragmentResultListener(this) { // from class: Q9.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditAssignContactReferenceFragment f5329b;

            {
                this.f5329b = this;
            }

            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                CreditReviewUiModel creditReviewUiModel;
                J9.a aVar2;
                CreditReviewUiModel creditReviewUiModel2;
                J9.a aVar3;
                switch (i17) {
                    case 0:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment = this.f5329b;
                        kotlin.jvm.internal.j.g(str, "<unused var>");
                        kotlin.jvm.internal.j.g(bundle2, "bundle");
                        L9.q qVarG12 = newMayaCreditAssignContactReferenceFragment.G1();
                        MayaChoicesAdapterItem mayaChoicesAdapterItem = (MayaChoicesAdapterItem) bundle2.getParcelable("model_values");
                        if (mayaChoicesAdapterItem == null || (creditReviewUiModel = qVarG12.e) == null || (aVar2 = creditReviewUiModel.f13060l) == null) {
                            return;
                        }
                        aVar2.c = mayaChoicesAdapterItem.getItemAsString();
                        P9.h hVar = (P9.h) qVarG12.c.get();
                        String str2 = aVar2.c;
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment2 = (NewMayaCreditAssignContactReferenceFragment) hVar;
                        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout10 = newMayaCreditAssignContactReferenceFragment2.f13166Y;
                        if (mayaAutoCompleteInputLayout10 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutContactReference");
                            throw null;
                        }
                        mayaAutoCompleteInputLayout10.getInputAutoCompleteEditText().setText(str2);
                        newMayaCreditAssignContactReferenceFragment2.G1().k();
                        com.paymaya.common.utility.C.R(newMayaCreditAssignContactReferenceFragment2.getActivity());
                        return;
                    default:
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment3 = this.f5329b;
                        kotlin.jvm.internal.j.g(str, "<unused var>");
                        kotlin.jvm.internal.j.g(bundle2, "bundle");
                        L9.q qVarG13 = newMayaCreditAssignContactReferenceFragment3.G1();
                        ContactModel contactModel = (ContactModel) bundle2.getParcelable("key_selected_contact_model");
                        if (contactModel == null || (creditReviewUiModel2 = qVarG13.e) == null || (aVar3 = creditReviewUiModel2.f13060l) == null) {
                            return;
                        }
                        String mobileNumber = com.paymaya.common.utility.C.q(contactModel.getNumber());
                        if (mobileNumber == null) {
                            mobileNumber = contactModel.getNumber();
                        }
                        kotlin.jvm.internal.j.g(mobileNumber, "mobileNumber");
                        aVar3.f2487d = new zj.o("[^0-9 ]").f("", mobileNumber);
                        P9.h hVar2 = (P9.h) qVarG13.c.get();
                        String str3 = aVar3.f2487d;
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment4 = (NewMayaCreditAssignContactReferenceFragment) hVar2;
                        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout11 = newMayaCreditAssignContactReferenceFragment4.f13168a0;
                        if (mayaAutoCompleteInputLayout11 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutMobileNumber");
                            throw null;
                        }
                        mayaAutoCompleteInputLayout11.getInputAutoCompleteEditText().setText(com.paymaya.common.utility.C.p(str3));
                        newMayaCreditAssignContactReferenceFragment4.G1().k();
                        com.paymaya.common.utility.C.R(newMayaCreditAssignContactReferenceFragment4.getActivity());
                        return;
                }
            }
        });
        MayaInputLayout mayaInputLayout3 = this.f13164W;
        if (mayaInputLayout3 == null) {
            j.n("mMayaInputLayoutFirstName");
            throw null;
        }
        AppCompatEditText inputEditText = mayaInputLayout3.getInputEditText();
        inputEditText.addTextChangedListener(new G(inputEditText, new o("^[A-Za-z .\\-]{1,40}$")));
        MayaInputLayout mayaInputLayout4 = this.f13165X;
        if (mayaInputLayout4 == null) {
            j.n("mMayaInputLayoutLastName");
            throw null;
        }
        AppCompatEditText inputEditText2 = mayaInputLayout4.getInputEditText();
        inputEditText2.addTextChangedListener(new G(inputEditText2, new o("^[A-Za-z .\\-]{1,40}$")));
        Q9.q qVar = this.f13172e0;
        CreditReviewUiModel creditReviewUiModel = qVar != null ? (CreditReviewUiModel) ((NewMayaCreditActivity) qVar).X1().f1802k : null;
        Bundle arguments = getArguments();
        boolean zContainsKey = arguments != null ? arguments.containsKey("is_edit") : false;
        q qVarG12 = G1();
        MayaInputLayout mayaInputLayout5 = this.f13164W;
        if (mayaInputLayout5 == null) {
            j.n("mMayaInputLayoutFirstName");
            throw null;
        }
        String.valueOf(mayaInputLayout5.getInputEditText().getText());
        MayaInputLayout mayaInputLayout6 = this.f13165X;
        if (mayaInputLayout6 == null) {
            j.n("mMayaInputLayoutLastName");
            throw null;
        }
        String.valueOf(mayaInputLayout6.getInputEditText().getText());
        ForcedAutoCompleteTextView forcedAutoCompleteTextView = this.f13167Z;
        if (forcedAutoCompleteTextView == null) {
            j.n("mAutoCompleteTextViewContactRelationship");
            throw null;
        }
        forcedAutoCompleteTextView.getText().toString();
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout10 = this.f13168a0;
        if (mayaAutoCompleteInputLayout10 == null) {
            j.n("mMayaInputLayoutMobileNumber");
            throw null;
        }
        mayaAutoCompleteInputLayout10.getInputAutoCompleteEditText().getText().toString();
        qVarG12.j();
        qVarG12.f = zContainsKey;
        qVarG12.e = creditReviewUiModel;
        if (creditReviewUiModel == null || (aVar = creditReviewUiModel.f13060l) == null) {
            if (creditReviewUiModel != null) {
                creditReviewUiModel.f13060l = new a(null, null, null, null);
                return;
            }
            return;
        }
        String strH = aVar.c;
        if (strH != null) {
            switch (strH.hashCode()) {
                case -2130099352:
                    if (strH.equals("IN_LAW")) {
                        strH = z.h("in-law");
                    }
                    break;
                case -1942094678:
                    if (strH.equals("PARENT")) {
                        strH = z.h("parent");
                    }
                    break;
                case -1842428267:
                    if (strH.equals("SPOUSE")) {
                        strH = z.h("spouse");
                    }
                    break;
                case -1493388638:
                    if (strH.equals("SIBLING")) {
                        strH = z.h("sibling");
                    }
                    break;
                case 64093436:
                    if (strH.equals("CHILD")) {
                        strH = z.h("child");
                    }
                    break;
                case 375047055:
                    if (strH.equals("COLLEAGUE")) {
                        strH = z.h("colleague");
                    }
                    break;
                case 880273296:
                    if (strH.equals("GRANDCHILD")) {
                        strH = z.h("grandchild");
                    }
                    break;
                case 1884644502:
                    if (strH.equals("GRANDPARENT")) {
                        strH = z.h("grandparent");
                    }
                    break;
                case 2082012830:
                    if (strH.equals("FRIEND")) {
                        strH = z.h("friend");
                    }
                    break;
            }
        }
        aVar.c = strH;
        h hVar = (h) qVarG12.c.get();
        String str = aVar.f2485a;
        String str2 = aVar.f2486b;
        String str3 = aVar.c;
        String str4 = aVar.f2487d;
        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment = (NewMayaCreditAssignContactReferenceFragment) hVar;
        MayaInputLayout mayaInputLayout7 = newMayaCreditAssignContactReferenceFragment.f13164W;
        if (mayaInputLayout7 == null) {
            j.n("mMayaInputLayoutFirstName");
            throw null;
        }
        mayaInputLayout7.getInputEditText().setText(str);
        MayaInputLayout mayaInputLayout8 = newMayaCreditAssignContactReferenceFragment.f13165X;
        if (mayaInputLayout8 == null) {
            j.n("mMayaInputLayoutLastName");
            throw null;
        }
        mayaInputLayout8.getInputEditText().setText(str2);
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout11 = newMayaCreditAssignContactReferenceFragment.f13168a0;
        if (mayaAutoCompleteInputLayout11 == null) {
            j.n("mMayaInputLayoutMobileNumber");
            throw null;
        }
        mayaAutoCompleteInputLayout11.getInputAutoCompleteEditText().setText(C.p(str4));
        ForcedAutoCompleteTextView forcedAutoCompleteTextView2 = newMayaCreditAssignContactReferenceFragment.f13167Z;
        if (forcedAutoCompleteTextView2 == null) {
            j.n("mAutoCompleteTextViewContactRelationship");
            throw null;
        }
        forcedAutoCompleteTextView2.setText(str3);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean p1() {
        return this.f13174g0;
    }
}
