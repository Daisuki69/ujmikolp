package com.paymaya.mayaui.login.view.fragment.impl;

import G5.A;
import G5.C;
import Ke.e;
import N5.C0491z;
import S5.c;
import Y8.a;
import Z8.f;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import bg.AbstractC0983W;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;
import com.paymaya.mayaui.login.view.activity.impl.MayaAuthBaseFragment;
import com.paymaya.mayaui.login.view.activity.impl.MayaRegistrationActivity;
import com.paymaya.mayaui.login.view.dialog.impl.MayaPasswordTipsBottomSheetDialogFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationIdentityFragment;
import g9.InterfaceC1509d;
import h9.n;
import h9.o;
import java.util.Locale;
import jk.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaRegistrationIdentityFragment extends MayaAuthBaseFragment implements InterfaceC1509d {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public f f12791V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C1229s f12792W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public C0491z f12793X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public MultiColorTextView f12794Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public NestedScrollView f12795Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public MayaInputLayout f12796a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f12797b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public MayaInputLayout f12798c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Button f12799d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public o f12800e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f12801f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f12802g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f12803h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f12804i0 = "";

    public static final void M1(MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment) {
        C1229s c1229sI1 = mayaRegistrationIdentityFragment.I1();
        FragmentActivity fragmentActivityRequireActivity = mayaRegistrationIdentityFragment.requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        String strO = AbstractC1213b.o(3);
        j.f(strO, "tapped(...)");
        C1229s.c(c1229sI1, fragmentActivityRequireActivity, strO, "Set your login details", "Tips for a strong password (Bottom sheet)", "Password tips", null, null, null, 224);
        o oVar = mayaRegistrationIdentityFragment.f12800e0;
        if (oVar != null) {
            MayaPasswordTipsBottomSheetDialogFragment mayaPasswordTipsBottomSheetDialogFragment = new MayaPasswordTipsBottomSheetDialogFragment();
            mayaPasswordTipsBottomSheetDialogFragment.show(((MayaRegistrationActivity) oVar).getSupportFragmentManager(), mayaPasswordTipsBottomSheetDialogFragment.getTag());
        }
    }

    public static final void N1(MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment) {
        Drawable drawable;
        mayaRegistrationIdentityFragment.f12802g0 = !mayaRegistrationIdentityFragment.f12802g0;
        MayaInputLayout mayaInputLayout = mayaRegistrationIdentityFragment.f12798c0;
        if (mayaInputLayout == null) {
            j.n("mMayaInputLayoutPassword");
            throw null;
        }
        AppCompatEditText inputEditText = mayaInputLayout.getInputEditText();
        int selectionStart = inputEditText.getSelectionStart();
        int selectionEnd = inputEditText.getSelectionEnd();
        boolean zHasFocus = inputEditText.hasFocus();
        inputEditText.setTransformationMethod(mayaRegistrationIdentityFragment.f12802g0 ? null : new PasswordTransformationMethod());
        if (zHasFocus) {
            inputEditText.requestFocus();
            inputEditText.setSelection(selectionStart, selectionEnd);
        }
        if (mayaRegistrationIdentityFragment.f12802g0) {
            Context context = mayaRegistrationIdentityFragment.getContext();
            if (context == null || (drawable = b.o(context, R.attr.mayaDrawable_RegistrationMaskPasswordShown)) == null) {
                drawable = ContextCompat.getDrawable(mayaRegistrationIdentityFragment.requireContext(), R.drawable.maya_ic_mask_password_shown_light);
            }
        } else {
            Context context2 = mayaRegistrationIdentityFragment.getContext();
            if (context2 == null || (drawable = b.o(context2, R.attr.mayaDrawable_RegistrationMaskPasswordHidden)) == null) {
                drawable = ContextCompat.getDrawable(mayaRegistrationIdentityFragment.requireContext(), R.drawable.maya_ic_mask_password_hidden_light);
            }
        }
        C1229s c1229sI1 = mayaRegistrationIdentityFragment.I1();
        FragmentActivity fragmentActivityRequireActivity = mayaRegistrationIdentityFragment.requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        String strO = AbstractC1213b.o(3);
        j.f(strO, "tapped(...)");
        C1229s.c(c1229sI1, fragmentActivityRequireActivity, strO, "Set your login details", "Set your login details", "Hide password", null, null, null, 224);
        MayaInputLayout mayaInputLayout2 = mayaRegistrationIdentityFragment.f12798c0;
        if (mayaInputLayout2 != null) {
            mayaInputLayout2.getPrimaryIconImageView().setImageDrawable(drawable);
        } else {
            j.n("mMayaInputLayoutPassword");
            throw null;
        }
    }

    public static final void O1(MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment) {
        C1229s c1229sI1 = mayaRegistrationIdentityFragment.I1();
        FragmentActivity fragmentActivityRequireActivity = mayaRegistrationIdentityFragment.requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        String strO = AbstractC1213b.o(3);
        j.f(strO, "tapped(...)");
        FragmentActivity fragmentActivityRequireActivity2 = mayaRegistrationIdentityFragment.requireActivity();
        j.e(fragmentActivityRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.login.view.activity.impl.MayaRegistrationActivity");
        C1229s.c(c1229sI1, fragmentActivityRequireActivity, strO, "Set your login details", ((MayaRegistrationActivity) fragmentActivityRequireActivity2).Z1(), "Continue", null, null, null, 224);
        mayaRegistrationIdentityFragment.f12801f0 = true;
        ((f) mayaRegistrationIdentityFragment.J1()).k();
    }

    public final C1229s I1() {
        C1229s c1229s = this.f12792W;
        if (c1229s != null) {
            return c1229s;
        }
        j.n("mAuthAnalyticsUtils");
        throw null;
    }

    public final a J1() {
        f fVar = this.f12791V;
        if (fVar != null) {
            return fVar;
        }
        j.n("mMayaRegistrationIdentityFragmentPresenter");
        throw null;
    }

    public final String K1() {
        String string;
        String string2;
        MayaInputLayout mayaInputLayout = this.f12796a0;
        if (mayaInputLayout != null) {
            Editable text = mayaInputLayout.getInputEditText().getText();
            return (text == null || (string = text.toString()) == null || (string2 = C2576A.b0(string).toString()) == null) ? "" : string2;
        }
        j.n("mMayaInputLayoutMobileNumber");
        throw null;
    }

    public final String L1() {
        String string;
        String string2;
        MayaInputLayout mayaInputLayout = this.f12798c0;
        if (mayaInputLayout != null) {
            Editable text = mayaInputLayout.getInputEditText().getText();
            return (text == null || (string = text.toString()) == null || (string2 = C2576A.b0(string).toString()) == null) ? "" : string2;
        }
        j.n("mMayaInputLayoutPassword");
        throw null;
    }

    public final void P1(PayMayaError payMayaError) {
        String strMSpiel = payMayaError.mSpiel();
        C1229s c1229sI1 = I1();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        String strD = AbstractC1213b.d(8);
        j.f(strD, "errorViewed(...)");
        C1229s.d(c1229sI1, fragmentActivityRequireActivity, strD, "Reg Verification Page (OTP)", null, null, strMSpiel, null, 88);
        o oVar = this.f12800e0;
        if (oVar != null) {
            getString(R.string.maya_label_that_didnt_load_right);
            ((MayaRegistrationActivity) oVar).v(payMayaError, new C7.f(19, this, strMSpiel));
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1().i();
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("screen_name", "setup_login");
        C1219h c1219hM12 = m1();
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        String str = u1().f10786a;
        Locale locale = Locale.getDefault();
        j.f(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        j.f(lowerCase, "toLowerCase(...)");
        c1219hM12.j.put("module", lowerCase);
        this.f10338R = true;
        this.f12800e0 = (o) getActivity();
        O5.a aVar = W4.a.e().p().f4756a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12720U = (C1229s) aVar.f4684R.get();
        this.f12791V = new f(aVar.M(), aVar.j(), (com.paymaya.data.preference.a) aVar.e.get());
        this.f12792W = (C1229s) aVar.f4684R.get();
        ((AbstractC2509a) J1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_registration_identity, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.continue_button;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.continue_button);
        if (button != null) {
            i = R.id.country_phone_prefix_text_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.country_phone_prefix_text_view);
            if (textView != null) {
                i = R.id.mobile_number_helper_error_text_view;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.mobile_number_helper_error_text_view);
                if (textView2 != null) {
                    i = R.id.mobile_number_maya_input_layout;
                    MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.mobile_number_maya_input_layout);
                    if (mayaInputLayout != null) {
                        i = R.id.password_maya_input_layout;
                        MayaInputLayout mayaInputLayout2 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.password_maya_input_layout);
                        if (mayaInputLayout2 != null) {
                            i = R.id.scrollable_nested_scroll_view;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scrollable_nested_scroll_view);
                            if (nestedScrollView != null) {
                                i = R.id.title_header_text_view;
                                MultiColorTextView multiColorTextView = (MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.title_header_text_view);
                                if (multiColorTextView != null) {
                                    this.f12793X = new C0491z(constraintLayout, button, textView, textView2, mayaInputLayout, mayaInputLayout2, nestedScrollView, multiColorTextView);
                                    return constraintLayout;
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
        ((AbstractC2509a) J1()).i();
        super.onDestroy();
        this.f12793X = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o oVar = this.f12800e0;
        if (oVar != null) {
            ((MayaRegistrationActivity) oVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final int i = 2;
        final int i4 = 0;
        final int i6 = 1;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0491z c0491z = this.f12793X;
        j.d(c0491z);
        this.f12794Y = (MultiColorTextView) c0491z.h;
        C0491z c0491z2 = this.f12793X;
        j.d(c0491z2);
        this.f12795Z = (NestedScrollView) c0491z2.f4305g;
        j.d(this.f12793X);
        C0491z c0491z3 = this.f12793X;
        j.d(c0491z3);
        this.f12796a0 = (MayaInputLayout) c0491z3.e;
        C0491z c0491z4 = this.f12793X;
        j.d(c0491z4);
        this.f12797b0 = (TextView) c0491z4.f4304d;
        C0491z c0491z5 = this.f12793X;
        j.d(c0491z5);
        this.f12798c0 = (MayaInputLayout) c0491z5.f;
        C0491z c0491z6 = this.f12793X;
        j.d(c0491z6);
        this.f12799d0 = (Button) c0491z6.c;
        NestedScrollView nestedScrollView = this.f12795Z;
        if (nestedScrollView == null) {
            j.n("mScrollableNestedScrollView");
            throw null;
        }
        MultiColorTextView multiColorTextView = this.f12794Y;
        if (multiColorTextView == null) {
            j.n("mTitleHeaderTextView");
            throw null;
        }
        C.a(nestedScrollView, multiColorTextView, new Ag.j(this, 20));
        MayaInputLayout mayaInputLayout = this.f12798c0;
        if (mayaInputLayout == null) {
            j.n("mMayaInputLayoutPassword");
            throw null;
        }
        mayaInputLayout.getInputEditText().setOnEditorActionListener(new e(this, 6));
        MayaInputLayout mayaInputLayout2 = this.f12798c0;
        if (mayaInputLayout2 == null) {
            j.n("mMayaInputLayoutPassword");
            throw null;
        }
        mayaInputLayout2.getPrimaryIconImageView().setOnClickListener(new View.OnClickListener(this) { // from class: h9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationIdentityFragment f16952b;

            {
                this.f16952b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment = this.f16952b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRegistrationIdentityFragment.M1(mayaRegistrationIdentityFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment2 = this.f16952b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRegistrationIdentityFragment.N1(mayaRegistrationIdentityFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment3 = this.f16952b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRegistrationIdentityFragment.O1(mayaRegistrationIdentityFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaInputLayout mayaInputLayout3 = this.f12798c0;
        if (mayaInputLayout3 == null) {
            j.n("mMayaInputLayoutPassword");
            throw null;
        }
        mayaInputLayout3.getSecondaryIconImageView().setOnClickListener(new View.OnClickListener(this) { // from class: h9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationIdentityFragment f16952b;

            {
                this.f16952b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment = this.f16952b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRegistrationIdentityFragment.M1(mayaRegistrationIdentityFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment2 = this.f16952b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRegistrationIdentityFragment.N1(mayaRegistrationIdentityFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment3 = this.f16952b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRegistrationIdentityFragment.O1(mayaRegistrationIdentityFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button = this.f12799d0;
        if (button == null) {
            j.n("mContinueButton");
            throw null;
        }
        button.setOnClickListener(new View.OnClickListener(this) { // from class: h9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationIdentityFragment f16952b;

            {
                this.f16952b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment = this.f16952b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRegistrationIdentityFragment.M1(mayaRegistrationIdentityFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment2 = this.f16952b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRegistrationIdentityFragment.N1(mayaRegistrationIdentityFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment3 = this.f16952b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRegistrationIdentityFragment.O1(mayaRegistrationIdentityFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        Function0 function0 = new Function0(this) { // from class: h9.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationIdentityFragment f16954b;

            {
                this.f16954b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(this.f16954b.f12801f0);
                    case 1:
                        ((Z8.f) this.f16954b.J1()).l();
                        return Unit.f18162a;
                    case 2:
                        ((Z8.f) this.f16954b.J1()).l();
                        return Unit.f18162a;
                    case 3:
                        MayaInputLayout mayaInputLayout4 = this.f16954b.f12798c0;
                        if (mayaInputLayout4 != null) {
                            mayaInputLayout4.p();
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMayaInputLayoutPassword");
                        throw null;
                    default:
                        MayaInputLayout mayaInputLayout5 = this.f16954b.f12798c0;
                        if (mayaInputLayout5 != null) {
                            mayaInputLayout5.f();
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMayaInputLayoutPassword");
                        throw null;
                }
            }
        };
        MayaInputLayout mayaInputLayout4 = this.f12796a0;
        if (mayaInputLayout4 == null) {
            j.n("mMayaInputLayoutMobileNumber");
            throw null;
        }
        AbstractC0983W.A(mayaInputLayout4, null, new com.squareup.wire.internal.a(this, 9), 1);
        AppCompatEditText inputEditText = mayaInputLayout4.getInputEditText();
        A a8 = new A();
        a8.c = new n(this, mayaInputLayout4);
        a8.f1715d = new n(mayaInputLayout4, this);
        inputEditText.addTextChangedListener(a8);
        MayaInputLayout mayaInputLayout5 = this.f12798c0;
        if (mayaInputLayout5 == null) {
            j.n("mMayaInputLayoutPassword");
            throw null;
        }
        mayaInputLayout5.setHelperErrorText(getString(R.string.maya_format_missing_field_is_required, getString(R.string.maya_label_password)));
        AppCompatEditText inputEditText2 = mayaInputLayout5.getInputEditText();
        A a10 = new A();
        a10.c = new Function0(this) { // from class: h9.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationIdentityFragment f16954b;

            {
                this.f16954b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return Boolean.valueOf(this.f16954b.f12801f0);
                    case 1:
                        ((Z8.f) this.f16954b.J1()).l();
                        return Unit.f18162a;
                    case 2:
                        ((Z8.f) this.f16954b.J1()).l();
                        return Unit.f18162a;
                    case 3:
                        MayaInputLayout mayaInputLayout42 = this.f16954b.f12798c0;
                        if (mayaInputLayout42 != null) {
                            mayaInputLayout42.p();
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMayaInputLayoutPassword");
                        throw null;
                    default:
                        MayaInputLayout mayaInputLayout52 = this.f16954b.f12798c0;
                        if (mayaInputLayout52 != null) {
                            mayaInputLayout52.f();
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMayaInputLayoutPassword");
                        throw null;
                }
            }
        };
        a10.f1715d = new Function0(this) { // from class: h9.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationIdentityFragment f16954b;

            {
                this.f16954b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return Boolean.valueOf(this.f16954b.f12801f0);
                    case 1:
                        ((Z8.f) this.f16954b.J1()).l();
                        return Unit.f18162a;
                    case 2:
                        ((Z8.f) this.f16954b.J1()).l();
                        return Unit.f18162a;
                    case 3:
                        MayaInputLayout mayaInputLayout42 = this.f16954b.f12798c0;
                        if (mayaInputLayout42 != null) {
                            mayaInputLayout42.p();
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMayaInputLayoutPassword");
                        throw null;
                    default:
                        MayaInputLayout mayaInputLayout52 = this.f16954b.f12798c0;
                        if (mayaInputLayout52 != null) {
                            mayaInputLayout52.f();
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMayaInputLayoutPassword");
                        throw null;
                }
            }
        };
        inputEditText2.addTextChangedListener(a10);
        AppCompatEditText inputEditText3 = mayaInputLayout5.getInputEditText();
        A a11 = new A(function0, (Function0) null, (Function0) null, 14);
        final int i10 = 3;
        a11.c = new Function0(this) { // from class: h9.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationIdentityFragment f16954b;

            {
                this.f16954b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(this.f16954b.f12801f0);
                    case 1:
                        ((Z8.f) this.f16954b.J1()).l();
                        return Unit.f18162a;
                    case 2:
                        ((Z8.f) this.f16954b.J1()).l();
                        return Unit.f18162a;
                    case 3:
                        MayaInputLayout mayaInputLayout42 = this.f16954b.f12798c0;
                        if (mayaInputLayout42 != null) {
                            mayaInputLayout42.p();
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMayaInputLayoutPassword");
                        throw null;
                    default:
                        MayaInputLayout mayaInputLayout52 = this.f16954b.f12798c0;
                        if (mayaInputLayout52 != null) {
                            mayaInputLayout52.f();
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMayaInputLayoutPassword");
                        throw null;
                }
            }
        };
        final int i11 = 4;
        a11.f1715d = new Function0(this) { // from class: h9.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationIdentityFragment f16954b;

            {
                this.f16954b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return Boolean.valueOf(this.f16954b.f12801f0);
                    case 1:
                        ((Z8.f) this.f16954b.J1()).l();
                        return Unit.f18162a;
                    case 2:
                        ((Z8.f) this.f16954b.J1()).l();
                        return Unit.f18162a;
                    case 3:
                        MayaInputLayout mayaInputLayout42 = this.f16954b.f12798c0;
                        if (mayaInputLayout42 != null) {
                            mayaInputLayout42.p();
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMayaInputLayoutPassword");
                        throw null;
                    default:
                        MayaInputLayout mayaInputLayout52 = this.f16954b.f12798c0;
                        if (mayaInputLayout52 != null) {
                            mayaInputLayout52.f();
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mMayaInputLayoutPassword");
                        throw null;
                }
            }
        };
        inputEditText3.addTextChangedListener(a11);
        ((f) J1()).j();
    }
}
