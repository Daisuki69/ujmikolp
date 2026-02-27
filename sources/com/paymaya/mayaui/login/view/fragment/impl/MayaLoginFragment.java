package com.paymaya.mayaui.login.view.fragment.impl;

import G5.A;
import Ke.e;
import N5.C0435a;
import N9.f;
import O5.a;
import Z8.c;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.i0;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaAuthBaseFragment;
import com.paymaya.mayaui.login.view.activity.impl.MayaLoginActivity;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginFragment;
import defpackage.AbstractC1414e;
import eb.g;
import g9.InterfaceC1507b;
import h9.C1545d;
import h9.C1547f;
import h9.j;
import java.util.HashMap;
import jk.b;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o1.AbstractC1955a;
import z2.d;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaLoginFragment extends MayaAuthBaseFragment implements InterfaceC1507b {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C0435a f12776V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public MayaInputLayout f12777W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f12778X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public MayaInputLayout f12779Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f12780Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Button f12781a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public c f12782b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public C1229s f12783c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f12784d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f12785e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f12786f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public KeyguardManager f12787g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public j f12788h0;

    public static final void O1(MayaLoginFragment mayaLoginFragment) {
        boolean z4 = !mayaLoginFragment.f12784d0;
        mayaLoginFragment.f12784d0 = z4;
        MayaInputLayout mayaInputLayout = mayaLoginFragment.f12779Y;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mPasswordMayaInputLayout");
            throw null;
        }
        b.z(mayaInputLayout, z4);
        C1229s c1229s = mayaLoginFragment.f12783c0;
        if (c1229s == null) {
            kotlin.jvm.internal.j.n("mAuthAnalyticsUtils");
            throw null;
        }
        FragmentActivity fragmentActivityRequireActivity = mayaLoginFragment.requireActivity();
        kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        String strL = AbstractC1213b.l(1);
        kotlin.jvm.internal.j.f(strL, "tapped(...)");
        C1229s.c(c1229s, fragmentActivityRequireActivity, strL, "Login Page", "Login Page", "Hide password", "Main Login", null, null, PsExtractor.AUDIO_STREAM);
    }

    public static final void P1(MayaLoginFragment mayaLoginFragment) {
        C1229s c1229s = mayaLoginFragment.f12783c0;
        if (c1229s == null) {
            kotlin.jvm.internal.j.n("mAuthAnalyticsUtils");
            throw null;
        }
        FragmentActivity fragmentActivityRequireActivity = mayaLoginFragment.requireActivity();
        kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        String strL = AbstractC1213b.l(1);
        kotlin.jvm.internal.j.f(strL, "tapped(...)");
        TextView textView = mayaLoginFragment.f12780Z;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mForgotPasswordLinkTextView");
            throw null;
        }
        C1229s.c(c1229s, fragmentActivityRequireActivity, strL, "Login Page", "Enter your number", textView.getText().toString(), "Main Login", null, null, PsExtractor.AUDIO_STREAM);
        c cVarJ1 = mayaLoginFragment.J1();
        if (!cVarJ1.e.e().isForgotPasswordV2Enabled()) {
            j jVar = ((MayaLoginFragment) ((InterfaceC1507b) cVarJ1.c.get())).f12788h0;
            if (jVar != null) {
                MayaLoginActivity mayaLoginActivity = (MayaLoginActivity) jVar;
                mayaLoginActivity.n1().j0(mayaLoginActivity, "https://online.maya.ph/forgot-password", mayaLoginActivity.getString(R.string.pma_label_forgot_password_title));
                return;
            }
            return;
        }
        j jVar2 = ((MayaLoginFragment) ((InterfaceC1507b) cVarJ1.c.get())).f12788h0;
        if (jVar2 != null) {
            MayaLoginActivity mayaLoginActivity2 = (MayaLoginActivity) jVar2;
            mayaLoginActivity2.n1();
            mayaLoginActivity2.startActivity(new Intent(mayaLoginActivity2, (Class<?>) MayaForgotPasswordActivity.class));
        }
    }

    public final void I1() {
        this.f12785e0 = false;
        MayaInputLayout mayaInputLayout = this.f12779Y;
        if (mayaInputLayout != null) {
            mayaInputLayout.getInputEditText().setText("");
        } else {
            kotlin.jvm.internal.j.n("mPasswordMayaInputLayout");
            throw null;
        }
    }

    public final c J1() {
        c cVar = this.f12782b0;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.j.n("mMayaLoginFragmentPresenter");
        throw null;
    }

    public final String K1() {
        String string;
        String string2;
        MayaInputLayout mayaInputLayout = this.f12777W;
        if (mayaInputLayout != null) {
            Editable text = mayaInputLayout.getInputEditText().getText();
            return (text == null || (string = text.toString()) == null || (string2 = C2576A.b0(string).toString()) == null) ? "" : string2;
        }
        kotlin.jvm.internal.j.n("mMobileNumberMayaInputLayout");
        throw null;
    }

    public final String L1() {
        MayaInputLayout mayaInputLayout = this.f12777W;
        if (mayaInputLayout != null) {
            return AbstractC1414e.h("+63", C2576A.b0(String.valueOf(mayaInputLayout.getInputEditText().getText())).toString());
        }
        kotlin.jvm.internal.j.n("mMobileNumberMayaInputLayout");
        throw null;
    }

    public final String M1() {
        String string;
        String string2;
        MayaInputLayout mayaInputLayout = this.f12779Y;
        if (mayaInputLayout != null) {
            Editable text = mayaInputLayout.getInputEditText().getText();
            return (text == null || (string = text.toString()) == null || (string2 = C2576A.b0(string).toString()) == null) ? "" : string2;
        }
        kotlin.jvm.internal.j.n("mPasswordMayaInputLayout");
        throw null;
    }

    public final void N1(String mobileNumber, String challengeId, String transactionType) {
        kotlin.jvm.internal.j.g(mobileNumber, "mobileNumber");
        kotlin.jvm.internal.j.g(challengeId, "challengeId");
        kotlin.jvm.internal.j.g(transactionType, "transactionType");
        j jVar = this.f12788h0;
        if (jVar != null) {
            MayaLoginOTPFragment mayaLoginOTPFragment = new MayaLoginOTPFragment();
            Bundle bundleE = androidx.media3.datasource.cache.c.e("mobile_number", mobileNumber, "challenge_id", challengeId);
            bundleE.putString("transaction_type", transactionType);
            bundleE.putBoolean("is_from_login", true);
            mayaLoginOTPFragment.setArguments(bundleE);
            AbstractC1236z.i((MayaLoginActivity) jVar, R.id.fragment_container, mayaLoginOTPFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
        }
    }

    public final void Q1(PayMayaError payMayaError) {
        Bundle arguments;
        String string = null;
        if (getArguments() != null && (arguments = getArguments()) != null) {
            string = arguments.getString("title");
        }
        if (string == null) {
            string = getString(R.string.maya_label_unable_to_log_you_in);
            kotlin.jvm.internal.j.f(string, "getString(...)");
        }
        String str = string;
        j jVar = this.f12788h0;
        if (jVar != null) {
            M2.b.Z(2131231238, str, null, null, null, false, payMayaError, null, false, 444).show(((MayaLoginActivity) jVar).getSupportFragmentManager(), "error_dialog");
        }
    }

    public final void R1(Function0 function0, Function0 function02) {
        j jVar = this.f12788h0;
        if (jVar != null) {
            C1547f c1547f = new C1547f(this, function0, 0);
            C1547f c1547f2 = new C1547f(this, function02, 1);
            MayaLoginActivity mayaLoginActivity = (MayaLoginActivity) jVar;
            String string = mayaLoginActivity.getString(R.string.maya_label_use_screen_lock_login_dialog_title);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = d.n(2131231399, string, mayaLoginActivity.getString(R.string.maya_label_use_screen_lock_login_dialog_description), new Pair(mayaLoginActivity.getString(R.string.maya_label_confirm), new f(c1547f, 26)), new Pair(mayaLoginActivity.getString(R.string.maya_label_cancel), new f(c1547f2, 27)), null, 96);
            mayaAlertBottomSheetDialogFragmentN.setCancelable(false);
            mayaAlertBottomSheetDialogFragmentN.show(mayaLoginActivity.getSupportFragmentManager(), "confirm_screen_lock_login");
        }
    }

    @Override // g9.InterfaceC1506a
    public final void g(String str, String str2, String str3) {
        o1().a(str, str2, str3);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.j.g(context, "context");
        a aVar = W4.a.e().p().f4756a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f12720U = (C1229s) aVar.f4684R.get();
        this.f12782b0 = new c((com.paymaya.data.preference.a) aVar.e.get(), aVar.J(), aVar.E(), (S5.c) aVar.f4724k.get());
        this.f12783c0 = (C1229s) aVar.f4684R.get();
        super.onAttach(context);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        setHasOptionsMenu(true);
        Object systemService = requireActivity().getSystemService("keyguard");
        kotlin.jvm.internal.j.e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        this.f12787g0 = (KeyguardManager) systemService;
        this.f12788h0 = (j) getActivity();
        J1().h(this);
        i0.d();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.j.g(menu, "menu");
        kotlin.jvm.internal.j.g(inflater, "inflater");
        inflater.inflate(R.menu.maya_menu_login, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_login, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.continue_button;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.continue_button);
        if (button != null) {
            i = R.id.country_phone_prefix_text_view;
            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.country_phone_prefix_text_view)) != null) {
                i = R.id.forgot_password_link_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.forgot_password_link_text_view);
                if (textView != null) {
                    i = R.id.image_view_logo_header;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_logo_header)) != null) {
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
                                    if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scrollable_nested_scroll_view)) != null) {
                                        this.f12776V = new C0435a(constraintLayout, button, textView, textView2, mayaInputLayout, mayaInputLayout2, 13);
                                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                                        return constraintLayout;
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
        J1().i();
        super.onDestroy();
        this.f12776V = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.j.g(item, "item");
        if (item.getItemId() != R.id.menu_help) {
            return super.onOptionsItemSelected(item);
        }
        j jVar = this.f12788h0;
        if (jVar != null) {
            MayaLoginActivity mayaLoginActivity = (MayaLoginActivity) jVar;
            mayaLoginActivity.f12725q = new f(new g(1, this, MayaLoginFragment.class, "processHelpCenterActivityResult", "processHelpCenterActivityResult(Landroidx/activity/result/ActivityResult;)V", 0, 11), 24);
            mayaLoginActivity.n1().n0(mayaLoginActivity, mayaLoginActivity.f12727s, "login");
        }
        C1220i c1220iO1 = o1();
        C1219h c1219hE = C1219h.e(AbstractC1213b.l(1));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("button", "Help center");
        map.put("source_page", "Login Page");
        map.put("screen_type", "Main Login");
        map.put("destination_page", "Help center");
        c1219hE.i();
        c1220iO1.b(c1219hE);
        return true;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        j jVar = this.f12788h0;
        if (jVar != null) {
            ((MayaLoginActivity) jVar).Q(this);
        }
        s1().f("ttd");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final int i = 2;
        final int i4 = 0;
        final int i6 = 1;
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0435a c0435a = this.f12776V;
        kotlin.jvm.internal.j.d(c0435a);
        this.f12777W = (MayaInputLayout) c0435a.f;
        C0435a c0435a2 = this.f12776V;
        kotlin.jvm.internal.j.d(c0435a2);
        this.f12778X = (TextView) c0435a2.e;
        C0435a c0435a3 = this.f12776V;
        kotlin.jvm.internal.j.d(c0435a3);
        this.f12779Y = (MayaInputLayout) c0435a3.f4049g;
        C0435a c0435a4 = this.f12776V;
        kotlin.jvm.internal.j.d(c0435a4);
        this.f12780Z = (TextView) c0435a4.f4048d;
        C0435a c0435a5 = this.f12776V;
        kotlin.jvm.internal.j.d(c0435a5);
        this.f12781a0 = (Button) c0435a5.c;
        MayaInputLayout mayaInputLayout = this.f12779Y;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mPasswordMayaInputLayout");
            throw null;
        }
        mayaInputLayout.getInputEditText().setOnEditorActionListener(new e(this, 5));
        MayaInputLayout mayaInputLayout2 = this.f12779Y;
        if (mayaInputLayout2 == null) {
            kotlin.jvm.internal.j.n("mPasswordMayaInputLayout");
            throw null;
        }
        mayaInputLayout2.getPrimaryIconImageView().setOnClickListener(new View.OnClickListener(this) { // from class: h9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaLoginFragment f16948b;

            {
                this.f16948b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaLoginFragment mayaLoginFragment = this.f16948b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaLoginFragment.O1(mayaLoginFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaLoginFragment mayaLoginFragment2 = this.f16948b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaLoginFragment.P1(mayaLoginFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaLoginFragment mayaLoginFragment3 = this.f16948b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220iO1 = mayaLoginFragment3.o1();
                            FragmentActivity activity = mayaLoginFragment3.getActivity();
                            C1219h c1219hD = C1219h.d(mayaLoginFragment3.u1());
                            c1219hD.n(17);
                            c1219hD.t(EnumC1217f.LOGIN);
                            c1220iO1.c(activity, c1219hD);
                            mayaLoginFragment3.f12785e0 = true;
                            mayaLoginFragment3.J1().o();
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView = this.f12780Z;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mForgotPasswordLinkTextView");
            throw null;
        }
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: h9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaLoginFragment f16948b;

            {
                this.f16948b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaLoginFragment mayaLoginFragment = this.f16948b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaLoginFragment.O1(mayaLoginFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaLoginFragment mayaLoginFragment2 = this.f16948b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaLoginFragment.P1(mayaLoginFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaLoginFragment mayaLoginFragment3 = this.f16948b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220iO1 = mayaLoginFragment3.o1();
                            FragmentActivity activity = mayaLoginFragment3.getActivity();
                            C1219h c1219hD = C1219h.d(mayaLoginFragment3.u1());
                            c1219hD.n(17);
                            c1219hD.t(EnumC1217f.LOGIN);
                            c1220iO1.c(activity, c1219hD);
                            mayaLoginFragment3.f12785e0 = true;
                            mayaLoginFragment3.J1().o();
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button = this.f12781a0;
        if (button == null) {
            kotlin.jvm.internal.j.n("mContinueButton");
            throw null;
        }
        button.setOnClickListener(new View.OnClickListener(this) { // from class: h9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaLoginFragment f16948b;

            {
                this.f16948b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaLoginFragment mayaLoginFragment = this.f16948b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaLoginFragment.O1(mayaLoginFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaLoginFragment mayaLoginFragment2 = this.f16948b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaLoginFragment.P1(mayaLoginFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaLoginFragment mayaLoginFragment3 = this.f16948b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220iO1 = mayaLoginFragment3.o1();
                            FragmentActivity activity = mayaLoginFragment3.getActivity();
                            C1219h c1219hD = C1219h.d(mayaLoginFragment3.u1());
                            c1219hD.n(17);
                            c1219hD.t(EnumC1217f.LOGIN);
                            c1220iO1.c(activity, c1219hD);
                            mayaLoginFragment3.f12785e0 = true;
                            mayaLoginFragment3.J1().o();
                            return;
                        } finally {
                        }
                }
            }
        });
        Function0 function0 = new Function0(this) { // from class: h9.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaLoginFragment f16950b;

            {
                this.f16950b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        break;
                    case 1:
                        this.f16950b.J1().t();
                        break;
                    default:
                        this.f16950b.J1().t();
                        break;
                }
                return Unit.f18162a;
            }
        };
        TextView textView2 = this.f12778X;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mMobileNumberHelperErrorTextView");
            throw null;
        }
        textView2.setText(getString(R.string.maya_format_missing_field_is_required, getString(R.string.maya_label_mobile_number)));
        MayaInputLayout mayaInputLayout3 = this.f12777W;
        if (mayaInputLayout3 == null) {
            kotlin.jvm.internal.j.n("mMobileNumberMayaInputLayout");
            throw null;
        }
        AppCompatEditText inputEditText = mayaInputLayout3.getInputEditText();
        A a8 = new A(function0, (Function0) null, (Function0) null, 14);
        a8.c = new C1545d(this, mayaInputLayout3, i6);
        a8.f1715d = new C1545d(this, mayaInputLayout3, i);
        inputEditText.addTextChangedListener(a8);
        MayaInputLayout mayaInputLayout4 = this.f12779Y;
        if (mayaInputLayout4 == null) {
            kotlin.jvm.internal.j.n("mPasswordMayaInputLayout");
            throw null;
        }
        mayaInputLayout4.setHelperErrorText(getString(R.string.maya_format_missing_field_is_required, getString(R.string.maya_label_password)));
        AppCompatEditText inputEditText2 = mayaInputLayout4.getInputEditText();
        A a10 = new A();
        a10.c = new Function0(this) { // from class: h9.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaLoginFragment f16950b;

            {
                this.f16950b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        break;
                    case 1:
                        this.f16950b.J1().t();
                        break;
                    default:
                        this.f16950b.J1().t();
                        break;
                }
                return Unit.f18162a;
            }
        };
        a10.f1715d = new Function0(this) { // from class: h9.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaLoginFragment f16950b;

            {
                this.f16950b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        break;
                    case 1:
                        this.f16950b.J1().t();
                        break;
                    default:
                        this.f16950b.J1().t();
                        break;
                }
                return Unit.f18162a;
            }
        };
        inputEditText2.addTextChangedListener(a10);
        AppCompatEditText inputEditText3 = mayaInputLayout4.getInputEditText();
        A a11 = new A(function0, (Function0) null, (Function0) null, 14);
        a11.c = new C1545d(this, mayaInputLayout4, 3);
        a11.f1715d = new C1545d(mayaInputLayout4, this);
        inputEditText3.addTextChangedListener(a11);
        J1().j();
        if (Build.VERSION.SDK_INT < 33 || AbstractC1955a.u(requireContext(), "android.permission.POST_NOTIFICATIONS")) {
            return;
        }
        MayaLoginFragment mayaLoginFragment = (MayaLoginFragment) ((InterfaceC1507b) J1().c.get());
        mayaLoginFragment.getClass();
        E1.c.r(new Ze.c(mayaLoginFragment).b("android.permission.POST_NOTIFICATIONS")).e(zh.b.a()).f();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean p1() {
        return true;
    }
}
