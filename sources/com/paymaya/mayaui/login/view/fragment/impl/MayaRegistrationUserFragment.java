package com.paymaya.mayaui.login.view.fragment.impl;

import Ag.l;
import F8.e;
import G5.A;
import M8.W2;
import N5.I;
import O5.a;
import S5.c;
import Y8.b;
import Z8.g;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import bg.AbstractC0983W;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;
import com.paymaya.mayaui.login.view.activity.impl.MayaAuthBaseFragment;
import com.paymaya.mayaui.login.view.activity.impl.MayaLoginActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaRegistrationActivity;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationUserFragment;
import de.m;
import g9.InterfaceC1510e;
import h9.p;
import h9.t;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaRegistrationUserFragment extends MayaAuthBaseFragment implements InterfaceC1510e {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public g f12805V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public I f12806W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public MultiColorTextView f12807X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public NestedScrollView f12808Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public MayaInputLayout f12809Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public MayaInputLayout f12810a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public MayaInputLayout f12811b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public MayaInputLayout f12812c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Button f12813d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public TextView f12814e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public AppCompatCheckBox f12815f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Group f12816g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public t f12817h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public e f12818i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f12819j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f12820k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f12821l0;
    public boolean m0 = true;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public String f12822n0 = "";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public String f12823o0 = "";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f12824p0 = "";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f12825q0 = "";

    public static final void N1(MayaRegistrationUserFragment mayaRegistrationUserFragment) {
        C1220i c1220iO1 = mayaRegistrationUserFragment.o1();
        FragmentActivity activity = mayaRegistrationUserFragment.getActivity();
        C1219h c1219hE = C1219h.e(AbstractC1213b.o(3));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hE.j.put("source_page", "Start an account");
        c1219hE.j.put("button", "Continue");
        c1219hE.j.put("destination_page", "Set your login details");
        c1219hE.i();
        c1220iO1.c(activity, c1219hE);
        g gVar = (g) mayaRegistrationUserFragment.L1();
        if (gVar.f6914d.e().isRegistrationMiddleNameEnabled()) {
            MayaInputLayout mayaInputLayout = ((MayaRegistrationUserFragment) ((InterfaceC1510e) gVar.c.get())).f12810a0;
            if (mayaInputLayout == null) {
                j.n("mMayaInputLayoutMiddleName");
                throw null;
            }
            AbstractC0983W.E(mayaInputLayout);
        }
        MayaInputLayout mayaInputLayout2 = ((MayaRegistrationUserFragment) ((InterfaceC1510e) gVar.c.get())).f12809Z;
        if (mayaInputLayout2 == null) {
            j.n("mMayaInputLayoutFirstName");
            throw null;
        }
        AbstractC0983W.E(mayaInputLayout2);
        MayaInputLayout mayaInputLayout3 = ((MayaRegistrationUserFragment) ((InterfaceC1510e) gVar.c.get())).f12811b0;
        if (mayaInputLayout3 == null) {
            j.n("mMayaInputLayoutLastName");
            throw null;
        }
        AbstractC0983W.E(mayaInputLayout3);
        ((g) mayaRegistrationUserFragment.L1()).l();
    }

    public static final void O1(MayaRegistrationUserFragment mayaRegistrationUserFragment) {
        C1220i c1220iO1 = mayaRegistrationUserFragment.o1();
        FragmentActivity activity = mayaRegistrationUserFragment.getActivity();
        C1219h c1219hE = C1219h.e(AbstractC1213b.o(3));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("source_page", "Start an account");
        map.put("button", "Log in to your existing account");
        map.put("destination_page", "Login Page");
        c1219hE.i();
        c1220iO1.c(activity, c1219hE);
        t tVar = mayaRegistrationUserFragment.f12817h0;
        if (tVar != null) {
            MayaRegistrationActivity mayaRegistrationActivity = (MayaRegistrationActivity) tVar;
            mayaRegistrationActivity.n1();
            mayaRegistrationActivity.startActivity(new Intent(mayaRegistrationActivity.getApplicationContext(), (Class<?>) MayaLoginActivity.class));
            mayaRegistrationActivity.finish();
        }
    }

    public final String I1() {
        String string;
        String string2;
        MayaInputLayout mayaInputLayout = this.f12812c0;
        if (mayaInputLayout != null) {
            Editable text = mayaInputLayout.getInputEditText().getText();
            return (text == null || (string = text.toString()) == null || (string2 = C2576A.b0(string).toString()) == null) ? "" : string2;
        }
        j.n("mMayaInputLayoutEmailAddress");
        throw null;
    }

    public final String J1() {
        String string;
        String string2;
        MayaInputLayout mayaInputLayout = this.f12809Z;
        if (mayaInputLayout != null) {
            Editable text = mayaInputLayout.getInputEditText().getText();
            return (text == null || (string = text.toString()) == null || (string2 = C2576A.b0(string).toString()) == null) ? "" : string2;
        }
        j.n("mMayaInputLayoutFirstName");
        throw null;
    }

    public final String K1() {
        String string;
        String string2;
        MayaInputLayout mayaInputLayout = this.f12811b0;
        if (mayaInputLayout != null) {
            Editable text = mayaInputLayout.getInputEditText().getText();
            return (text == null || (string = text.toString()) == null || (string2 = C2576A.b0(string).toString()) == null) ? "" : string2;
        }
        j.n("mMayaInputLayoutLastName");
        throw null;
    }

    public final b L1() {
        g gVar = this.f12805V;
        if (gVar != null) {
            return gVar;
        }
        j.n("mMayaRegistrationUserFragmentPresenter");
        throw null;
    }

    public final void M1(String str, String str2, boolean z4) {
        o1().c(getActivity(), C1219h.b(AbstractC1213b.g(7), "Start an account", str, z4, str2, false));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1().i();
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("screen_name", "start_account");
        C1219h c1219hM12 = m1();
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        String str = u1().f10786a;
        Locale locale = Locale.getDefault();
        j.f(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        j.f(lowerCase, "toLowerCase(...)");
        c1219hM12.j.put("module", lowerCase);
        this.f10338R = true;
        this.f12817h0 = (t) getActivity();
        a aVar = W4.a.e().p().f4756a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12720U = (C1229s) aVar.f4684R.get();
        this.f12805V = new g((com.paymaya.data.preference.a) aVar.e.get());
        ((g) L1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_registration_user, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.continue_button;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.continue_button);
        if (button != null) {
            i = R.id.email_address_maya_input_layout;
            MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.email_address_maya_input_layout);
            if (mayaInputLayout != null) {
                i = R.id.first_name_maya_input_layout;
                MayaInputLayout mayaInputLayout2 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.first_name_maya_input_layout);
                if (mayaInputLayout2 != null) {
                    i = R.id.last_name_maya_input_layout;
                    MayaInputLayout mayaInputLayout3 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.last_name_maya_input_layout);
                    if (mayaInputLayout3 != null) {
                        i = R.id.legal_middle_name_checkbox;
                        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(viewInflate, R.id.legal_middle_name_checkbox);
                        if (appCompatCheckBox != null) {
                            i = R.id.log_in_to_existing_account_text_view;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.log_in_to_existing_account_text_view);
                            if (textView != null) {
                                i = R.id.middle_name_group;
                                Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.middle_name_group);
                                if (group != null) {
                                    i = R.id.middle_name_maya_input_layout;
                                    MayaInputLayout mayaInputLayout4 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.middle_name_maya_input_layout);
                                    if (mayaInputLayout4 != null) {
                                        i = R.id.scrollable_nested_scroll_view;
                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scrollable_nested_scroll_view);
                                        if (nestedScrollView != null) {
                                            i = R.id.title_header_text_view;
                                            MultiColorTextView multiColorTextView = (MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.title_header_text_view);
                                            if (multiColorTextView != null) {
                                                this.f12806W = new I(constraintLayout, button, mayaInputLayout, mayaInputLayout2, mayaInputLayout3, appCompatCheckBox, textView, group, mayaInputLayout4, nestedScrollView, multiColorTextView);
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

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) L1()).i();
        super.onDestroy();
        this.f12806W = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        t tVar = this.f12817h0;
        if (tVar != null) {
            ((MayaRegistrationActivity) tVar).Q(this);
        }
        g gVar = (g) L1();
        if (gVar.f6914d.e().isPartnerOnboardingEnabled()) {
            String strP = gVar.f6914d.p();
            if (strP == null) {
                strP = "";
            }
            String strQ = gVar.f6914d.q();
            String str = strQ != null ? strQ : "";
            if (strP.length() > 0) {
                MayaRegistrationUserFragment mayaRegistrationUserFragment = (MayaRegistrationUserFragment) ((InterfaceC1510e) gVar.c.get());
                mayaRegistrationUserFragment.getClass();
                C1220i c1220iO1 = mayaRegistrationUserFragment.o1();
                C1219h c1219h = new C1219h();
                c1219h.p(EnumC1215d.REGISTRATION);
                c1219h.n(2);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219h.j.put("partner", strP);
                c1219h.j.put("branch", str);
                c1219h.j.put("kyc_level", "0");
                c1219h.i();
                c1220iO1.b(c1219h);
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        I i = this.f12806W;
        j.d(i);
        this.f12807X = (MultiColorTextView) i.f3650l;
        I i4 = this.f12806W;
        j.d(i4);
        this.f12808Y = (NestedScrollView) i4.e;
        I i6 = this.f12806W;
        j.d(i6);
        this.f12809Z = (MayaInputLayout) i6.c;
        I i10 = this.f12806W;
        j.d(i10);
        this.f12810a0 = (MayaInputLayout) i10.f3649k;
        I i11 = this.f12806W;
        j.d(i11);
        this.f12811b0 = (MayaInputLayout) i11.f3647d;
        I i12 = this.f12806W;
        j.d(i12);
        this.f12812c0 = (MayaInputLayout) i12.h;
        I i13 = this.f12806W;
        j.d(i13);
        this.f12813d0 = (Button) i13.f3648g;
        I i14 = this.f12806W;
        j.d(i14);
        this.f12814e0 = i14.f3646b;
        I i15 = this.f12806W;
        j.d(i15);
        this.f12815f0 = (AppCompatCheckBox) i15.i;
        I i16 = this.f12806W;
        j.d(i16);
        this.f12816g0 = (Group) i16.j;
        MayaInputLayout mayaInputLayout = this.f12809Z;
        if (mayaInputLayout == null) {
            j.n("mMayaInputLayoutFirstName");
            throw null;
        }
        mayaInputLayout.getInputEditText().setFilters(C.G());
        MayaInputLayout mayaInputLayout2 = this.f12810a0;
        if (mayaInputLayout2 == null) {
            j.n("mMayaInputLayoutMiddleName");
            throw null;
        }
        mayaInputLayout2.getInputEditText().setFilters(C.G());
        MayaInputLayout mayaInputLayout3 = this.f12811b0;
        if (mayaInputLayout3 == null) {
            j.n("mMayaInputLayoutLastName");
            throw null;
        }
        mayaInputLayout3.getInputEditText().setFilters(C.G());
        MayaInputLayout mayaInputLayout4 = this.f12812c0;
        if (mayaInputLayout4 == null) {
            j.n("mMayaInputLayoutEmailAddress");
            throw null;
        }
        mayaInputLayout4.getInputEditText().setFilters(C.G());
        MayaInputLayout mayaInputLayout5 = this.f12809Z;
        if (mayaInputLayout5 == null) {
            j.n("mMayaInputLayoutFirstName");
            throw null;
        }
        AbstractC0983W.y(mayaInputLayout5, false);
        MayaInputLayout mayaInputLayout6 = this.f12810a0;
        if (mayaInputLayout6 == null) {
            j.n("mMayaInputLayoutMiddleName");
            throw null;
        }
        AbstractC0983W.y(mayaInputLayout6, false);
        MayaInputLayout mayaInputLayout7 = this.f12811b0;
        if (mayaInputLayout7 == null) {
            j.n("mMayaInputLayoutLastName");
            throw null;
        }
        AbstractC0983W.y(mayaInputLayout7, false);
        NestedScrollView nestedScrollView = this.f12808Y;
        if (nestedScrollView == null) {
            j.n("mScrollableNestedScrollView");
            throw null;
        }
        nestedScrollView.setOnScrollChangeListener(new m(this, 11));
        MayaInputLayout mayaInputLayout8 = this.f12812c0;
        if (mayaInputLayout8 == null) {
            j.n("mMayaInputLayoutEmailAddress");
            throw null;
        }
        mayaInputLayout8.f12050B = true;
        mayaInputLayout8.l();
        mayaInputLayout8.getInputEditText().setOnEditorActionListener(new Ke.e(this, 7));
        Button button = this.f12813d0;
        if (button == null) {
            j.n("mContinueButton");
            throw null;
        }
        final int i17 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: h9.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationUserFragment f16964b;

            {
                this.f16964b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        MayaRegistrationUserFragment mayaRegistrationUserFragment = this.f16964b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRegistrationUserFragment.N1(mayaRegistrationUserFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaRegistrationUserFragment mayaRegistrationUserFragment2 = this.f16964b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRegistrationUserFragment.O1(mayaRegistrationUserFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView = this.f12814e0;
        if (textView == null) {
            j.n("mLoginToExistingAccountTextView");
            throw null;
        }
        final int i18 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: h9.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationUserFragment f16964b;

            {
                this.f16964b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        MayaRegistrationUserFragment mayaRegistrationUserFragment = this.f16964b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRegistrationUserFragment.N1(mayaRegistrationUserFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaRegistrationUserFragment mayaRegistrationUserFragment2 = this.f16964b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRegistrationUserFragment.O1(mayaRegistrationUserFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        AppCompatCheckBox appCompatCheckBox = this.f12815f0;
        if (appCompatCheckBox == null) {
            j.n("mLegalMiddleNameCheckbox");
            throw null;
        }
        appCompatCheckBox.setOnCheckedChangeListener(new W2(this, 5));
        MayaInputLayout mayaInputLayout9 = this.f12809Z;
        if (mayaInputLayout9 == null) {
            j.n("mMayaInputLayoutFirstName");
            throw null;
        }
        AbstractC0983W.z(mayaInputLayout9, new p(mayaInputLayout9, this, 13), new p(mayaInputLayout9, this, 5));
        final int i19 = 2;
        mayaInputLayout9.getInputEditText().addTextChangedListener(new e(new Function1(this) { // from class: h9.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationUserFragment f16960b;

            {
                this.f16960b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Boolean bool = (Boolean) obj;
                switch (i19) {
                    case 0:
                        boolean zBooleanValue = bool.booleanValue();
                        MayaRegistrationUserFragment mayaRegistrationUserFragment = this.f16960b;
                        mayaRegistrationUserFragment.f12821l0 = zBooleanValue;
                        mayaRegistrationUserFragment.f12824p0 = "";
                        MayaInputLayout mayaInputLayout10 = mayaRegistrationUserFragment.f12811b0;
                        if (mayaInputLayout10 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutLastName");
                            throw null;
                        }
                        mayaInputLayout10.f();
                        ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                        return Unit.f18162a;
                    case 1:
                        bool.getClass();
                        MayaRegistrationUserFragment mayaRegistrationUserFragment2 = this.f16960b;
                        MayaInputLayout mayaInputLayout11 = mayaRegistrationUserFragment2.f12812c0;
                        if (mayaInputLayout11 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutEmailAddress");
                            throw null;
                        }
                        mayaRegistrationUserFragment2.M1(mayaInputLayout11.getLabel().toString(), mayaRegistrationUserFragment2.f12825q0, mayaRegistrationUserFragment2.m0);
                        return Unit.f18162a;
                    case 2:
                        boolean zBooleanValue2 = bool.booleanValue();
                        MayaRegistrationUserFragment mayaRegistrationUserFragment3 = this.f16960b;
                        mayaRegistrationUserFragment3.f12819j0 = zBooleanValue2;
                        mayaRegistrationUserFragment3.f12822n0 = "";
                        MayaInputLayout mayaInputLayout12 = mayaRegistrationUserFragment3.f12809Z;
                        if (mayaInputLayout12 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutFirstName");
                            throw null;
                        }
                        mayaInputLayout12.f();
                        ((Z8.g) mayaRegistrationUserFragment3.L1()).m();
                        return Unit.f18162a;
                    default:
                        boolean zBooleanValue3 = bool.booleanValue();
                        MayaRegistrationUserFragment mayaRegistrationUserFragment4 = this.f16960b;
                        mayaRegistrationUserFragment4.f12820k0 = zBooleanValue3;
                        mayaRegistrationUserFragment4.f12823o0 = "";
                        AppCompatCheckBox appCompatCheckBox2 = mayaRegistrationUserFragment4.f12815f0;
                        if (appCompatCheckBox2 == null) {
                            kotlin.jvm.internal.j.n("mLegalMiddleNameCheckbox");
                            throw null;
                        }
                        appCompatCheckBox2.setVisibility(8);
                        MayaInputLayout mayaInputLayout13 = mayaRegistrationUserFragment4.f12810a0;
                        if (mayaInputLayout13 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutMiddleName");
                            throw null;
                        }
                        mayaInputLayout13.f();
                        ((Z8.g) mayaRegistrationUserFragment4.L1()).m();
                        return Unit.f18162a;
                }
            }
        }, new p(this, mayaInputLayout9, 7), new p(this, mayaInputLayout9, 8), new p(this, mayaInputLayout9, 9), new p(this, mayaInputLayout9, 10)));
        if (t1().e().isRegistrationMiddleNameEnabled()) {
            MayaInputLayout mayaInputLayout10 = this.f12810a0;
            if (mayaInputLayout10 == null) {
                j.n("mMayaInputLayoutMiddleName");
                throw null;
            }
            AbstractC0983W.z(mayaInputLayout10, new p(mayaInputLayout10, this, 11), new p(mayaInputLayout10, this, 12));
            final int i20 = 3;
            this.f12818i0 = new e(new Function1(this) { // from class: h9.q

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MayaRegistrationUserFragment f16960b;

                {
                    this.f16960b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Boolean bool = (Boolean) obj;
                    switch (i20) {
                        case 0:
                            boolean zBooleanValue = bool.booleanValue();
                            MayaRegistrationUserFragment mayaRegistrationUserFragment = this.f16960b;
                            mayaRegistrationUserFragment.f12821l0 = zBooleanValue;
                            mayaRegistrationUserFragment.f12824p0 = "";
                            MayaInputLayout mayaInputLayout102 = mayaRegistrationUserFragment.f12811b0;
                            if (mayaInputLayout102 == null) {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutLastName");
                                throw null;
                            }
                            mayaInputLayout102.f();
                            ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                            return Unit.f18162a;
                        case 1:
                            bool.getClass();
                            MayaRegistrationUserFragment mayaRegistrationUserFragment2 = this.f16960b;
                            MayaInputLayout mayaInputLayout11 = mayaRegistrationUserFragment2.f12812c0;
                            if (mayaInputLayout11 == null) {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutEmailAddress");
                                throw null;
                            }
                            mayaRegistrationUserFragment2.M1(mayaInputLayout11.getLabel().toString(), mayaRegistrationUserFragment2.f12825q0, mayaRegistrationUserFragment2.m0);
                            return Unit.f18162a;
                        case 2:
                            boolean zBooleanValue2 = bool.booleanValue();
                            MayaRegistrationUserFragment mayaRegistrationUserFragment3 = this.f16960b;
                            mayaRegistrationUserFragment3.f12819j0 = zBooleanValue2;
                            mayaRegistrationUserFragment3.f12822n0 = "";
                            MayaInputLayout mayaInputLayout12 = mayaRegistrationUserFragment3.f12809Z;
                            if (mayaInputLayout12 == null) {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutFirstName");
                                throw null;
                            }
                            mayaInputLayout12.f();
                            ((Z8.g) mayaRegistrationUserFragment3.L1()).m();
                            return Unit.f18162a;
                        default:
                            boolean zBooleanValue3 = bool.booleanValue();
                            MayaRegistrationUserFragment mayaRegistrationUserFragment4 = this.f16960b;
                            mayaRegistrationUserFragment4.f12820k0 = zBooleanValue3;
                            mayaRegistrationUserFragment4.f12823o0 = "";
                            AppCompatCheckBox appCompatCheckBox2 = mayaRegistrationUserFragment4.f12815f0;
                            if (appCompatCheckBox2 == null) {
                                kotlin.jvm.internal.j.n("mLegalMiddleNameCheckbox");
                                throw null;
                            }
                            appCompatCheckBox2.setVisibility(8);
                            MayaInputLayout mayaInputLayout13 = mayaRegistrationUserFragment4.f12810a0;
                            if (mayaInputLayout13 == null) {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutMiddleName");
                                throw null;
                            }
                            mayaInputLayout13.f();
                            ((Z8.g) mayaRegistrationUserFragment4.L1()).m();
                            return Unit.f18162a;
                    }
                }
            }, new p(this, mayaInputLayout10, 14), new p(this, mayaInputLayout10, 15), new p(this, mayaInputLayout10, 16), new p(this, mayaInputLayout10, 17));
            mayaInputLayout10.getInputEditText().addTextChangedListener(this.f12818i0);
        }
        MayaInputLayout mayaInputLayout11 = this.f12811b0;
        if (mayaInputLayout11 == null) {
            j.n("mMayaInputLayoutLastName");
            throw null;
        }
        AbstractC0983W.z(mayaInputLayout11, new p(mayaInputLayout11, this, 0), new p(mayaInputLayout11, this, 1));
        final int i21 = 0;
        mayaInputLayout11.getInputEditText().addTextChangedListener(new e(new Function1(this) { // from class: h9.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationUserFragment f16960b;

            {
                this.f16960b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Boolean bool = (Boolean) obj;
                switch (i21) {
                    case 0:
                        boolean zBooleanValue = bool.booleanValue();
                        MayaRegistrationUserFragment mayaRegistrationUserFragment = this.f16960b;
                        mayaRegistrationUserFragment.f12821l0 = zBooleanValue;
                        mayaRegistrationUserFragment.f12824p0 = "";
                        MayaInputLayout mayaInputLayout102 = mayaRegistrationUserFragment.f12811b0;
                        if (mayaInputLayout102 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutLastName");
                            throw null;
                        }
                        mayaInputLayout102.f();
                        ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                        return Unit.f18162a;
                    case 1:
                        bool.getClass();
                        MayaRegistrationUserFragment mayaRegistrationUserFragment2 = this.f16960b;
                        MayaInputLayout mayaInputLayout112 = mayaRegistrationUserFragment2.f12812c0;
                        if (mayaInputLayout112 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutEmailAddress");
                            throw null;
                        }
                        mayaRegistrationUserFragment2.M1(mayaInputLayout112.getLabel().toString(), mayaRegistrationUserFragment2.f12825q0, mayaRegistrationUserFragment2.m0);
                        return Unit.f18162a;
                    case 2:
                        boolean zBooleanValue2 = bool.booleanValue();
                        MayaRegistrationUserFragment mayaRegistrationUserFragment3 = this.f16960b;
                        mayaRegistrationUserFragment3.f12819j0 = zBooleanValue2;
                        mayaRegistrationUserFragment3.f12822n0 = "";
                        MayaInputLayout mayaInputLayout12 = mayaRegistrationUserFragment3.f12809Z;
                        if (mayaInputLayout12 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutFirstName");
                            throw null;
                        }
                        mayaInputLayout12.f();
                        ((Z8.g) mayaRegistrationUserFragment3.L1()).m();
                        return Unit.f18162a;
                    default:
                        boolean zBooleanValue3 = bool.booleanValue();
                        MayaRegistrationUserFragment mayaRegistrationUserFragment4 = this.f16960b;
                        mayaRegistrationUserFragment4.f12820k0 = zBooleanValue3;
                        mayaRegistrationUserFragment4.f12823o0 = "";
                        AppCompatCheckBox appCompatCheckBox2 = mayaRegistrationUserFragment4.f12815f0;
                        if (appCompatCheckBox2 == null) {
                            kotlin.jvm.internal.j.n("mLegalMiddleNameCheckbox");
                            throw null;
                        }
                        appCompatCheckBox2.setVisibility(8);
                        MayaInputLayout mayaInputLayout13 = mayaRegistrationUserFragment4.f12810a0;
                        if (mayaInputLayout13 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutMiddleName");
                            throw null;
                        }
                        mayaInputLayout13.f();
                        ((Z8.g) mayaRegistrationUserFragment4.L1()).m();
                        return Unit.f18162a;
                }
            }
        }, new p(this, mayaInputLayout11, 2), new p(this, mayaInputLayout11, 3), new p(this, mayaInputLayout11, 4), new p(this, mayaInputLayout11, 6)));
        MayaInputLayout mayaInputLayout12 = this.f12812c0;
        if (mayaInputLayout12 == null) {
            j.n("mMayaInputLayoutEmailAddress");
            throw null;
        }
        final int i22 = 1;
        AbstractC0983W.A(mayaInputLayout12, null, new Function1(this) { // from class: h9.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationUserFragment f16960b;

            {
                this.f16960b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Boolean bool = (Boolean) obj;
                switch (i22) {
                    case 0:
                        boolean zBooleanValue = bool.booleanValue();
                        MayaRegistrationUserFragment mayaRegistrationUserFragment = this.f16960b;
                        mayaRegistrationUserFragment.f12821l0 = zBooleanValue;
                        mayaRegistrationUserFragment.f12824p0 = "";
                        MayaInputLayout mayaInputLayout102 = mayaRegistrationUserFragment.f12811b0;
                        if (mayaInputLayout102 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutLastName");
                            throw null;
                        }
                        mayaInputLayout102.f();
                        ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                        return Unit.f18162a;
                    case 1:
                        bool.getClass();
                        MayaRegistrationUserFragment mayaRegistrationUserFragment2 = this.f16960b;
                        MayaInputLayout mayaInputLayout112 = mayaRegistrationUserFragment2.f12812c0;
                        if (mayaInputLayout112 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutEmailAddress");
                            throw null;
                        }
                        mayaRegistrationUserFragment2.M1(mayaInputLayout112.getLabel().toString(), mayaRegistrationUserFragment2.f12825q0, mayaRegistrationUserFragment2.m0);
                        return Unit.f18162a;
                    case 2:
                        boolean zBooleanValue2 = bool.booleanValue();
                        MayaRegistrationUserFragment mayaRegistrationUserFragment3 = this.f16960b;
                        mayaRegistrationUserFragment3.f12819j0 = zBooleanValue2;
                        mayaRegistrationUserFragment3.f12822n0 = "";
                        MayaInputLayout mayaInputLayout122 = mayaRegistrationUserFragment3.f12809Z;
                        if (mayaInputLayout122 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutFirstName");
                            throw null;
                        }
                        mayaInputLayout122.f();
                        ((Z8.g) mayaRegistrationUserFragment3.L1()).m();
                        return Unit.f18162a;
                    default:
                        boolean zBooleanValue3 = bool.booleanValue();
                        MayaRegistrationUserFragment mayaRegistrationUserFragment4 = this.f16960b;
                        mayaRegistrationUserFragment4.f12820k0 = zBooleanValue3;
                        mayaRegistrationUserFragment4.f12823o0 = "";
                        AppCompatCheckBox appCompatCheckBox2 = mayaRegistrationUserFragment4.f12815f0;
                        if (appCompatCheckBox2 == null) {
                            kotlin.jvm.internal.j.n("mLegalMiddleNameCheckbox");
                            throw null;
                        }
                        appCompatCheckBox2.setVisibility(8);
                        MayaInputLayout mayaInputLayout13 = mayaRegistrationUserFragment4.f12810a0;
                        if (mayaInputLayout13 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutMiddleName");
                            throw null;
                        }
                        mayaInputLayout13.f();
                        ((Z8.g) mayaRegistrationUserFragment4.L1()).m();
                        return Unit.f18162a;
                }
            }
        }, 1);
        final int i23 = 0;
        final int i24 = 1;
        mayaInputLayout12.getInputEditText().addTextChangedListener(new A(mayaInputLayout12, "^(?=.{1,50}$)[\\w.-]+@([\\w-]+\\.)+[\\w-]{2,4}$", new Function0(this) { // from class: h9.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationUserFragment f16962b;

            {
                this.f16962b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i23) {
                    case 0:
                        MayaRegistrationUserFragment mayaRegistrationUserFragment = this.f16962b;
                        mayaRegistrationUserFragment.m0 = true;
                        mayaRegistrationUserFragment.f12825q0 = "";
                        MayaInputLayout mayaInputLayout13 = mayaRegistrationUserFragment.f12812c0;
                        if (mayaInputLayout13 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutEmailAddress");
                            throw null;
                        }
                        mayaInputLayout13.f();
                        ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                        return Unit.f18162a;
                    default:
                        MayaRegistrationUserFragment mayaRegistrationUserFragment2 = this.f16962b;
                        mayaRegistrationUserFragment2.m0 = true;
                        mayaRegistrationUserFragment2.f12825q0 = "";
                        MayaInputLayout mayaInputLayout14 = mayaRegistrationUserFragment2.f12812c0;
                        if (mayaInputLayout14 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutEmailAddress");
                            throw null;
                        }
                        mayaInputLayout14.f();
                        ((Z8.g) mayaRegistrationUserFragment2.L1()).m();
                        return Unit.f18162a;
                }
            }
        }, new l(20, this, mayaInputLayout12), new Function0(this) { // from class: h9.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationUserFragment f16962b;

            {
                this.f16962b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i24) {
                    case 0:
                        MayaRegistrationUserFragment mayaRegistrationUserFragment = this.f16962b;
                        mayaRegistrationUserFragment.m0 = true;
                        mayaRegistrationUserFragment.f12825q0 = "";
                        MayaInputLayout mayaInputLayout13 = mayaRegistrationUserFragment.f12812c0;
                        if (mayaInputLayout13 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutEmailAddress");
                            throw null;
                        }
                        mayaInputLayout13.f();
                        ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                        return Unit.f18162a;
                    default:
                        MayaRegistrationUserFragment mayaRegistrationUserFragment2 = this.f16962b;
                        mayaRegistrationUserFragment2.m0 = true;
                        mayaRegistrationUserFragment2.f12825q0 = "";
                        MayaInputLayout mayaInputLayout14 = mayaRegistrationUserFragment2.f12812c0;
                        if (mayaInputLayout14 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutEmailAddress");
                            throw null;
                        }
                        mayaInputLayout14.f();
                        ((Z8.g) mayaRegistrationUserFragment2.L1()).m();
                        return Unit.f18162a;
                }
            }
        }));
        ((g) L1()).j();
    }
}
