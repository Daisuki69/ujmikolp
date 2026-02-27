package com.paymaya.mayaui.common.view.fragment.impl;

import A5.m;
import G5.A;
import Ke.e;
import M8.M1;
import N5.C0466m;
import O5.a;
import Q6.o;
import S5.c;
import X6.f;
import Y6.h;
import Y6.j;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.i0;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaAuthBaseFragment;
import defpackage.AbstractC1414e;
import java.util.HashMap;
import jk.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaSessionExpiredFragment extends MayaAuthBaseFragment implements f {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C0466m f11925V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f11926W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f11927X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public MayaInputLayout f11928Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f11929Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Button f11930a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f11931b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Button f11932c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public o f11933d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public C1229s f11934e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public j f11935f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public String f11936g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public KeyguardManager f11937h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f11938i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f11939j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f11940k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f11941l0;

    public static final void K1(MayaSessionExpiredFragment mayaSessionExpiredFragment) {
        C1229s c1229s = mayaSessionExpiredFragment.f11934e0;
        if (c1229s == null) {
            kotlin.jvm.internal.j.n("mAuthAnalyticsUtils");
            throw null;
        }
        FragmentActivity fragmentActivityRequireActivity = mayaSessionExpiredFragment.requireActivity();
        kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        String strL = AbstractC1213b.l(1);
        kotlin.jvm.internal.j.f(strL, "tapped(...)");
        TextView textView = mayaSessionExpiredFragment.f11929Z;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mForgotPasswordTextView");
            throw null;
        }
        C1229s.c(c1229s, fragmentActivityRequireActivity, strL, "Login Page", "Enter your number", textView.getText().toString(), "Session Timeout Login", null, null, PsExtractor.AUDIO_STREAM);
        o oVarI1 = mayaSessionExpiredFragment.I1();
        if (!oVarI1.f5285g.e().isForgotPasswordV2Enabled()) {
            j jVar = ((MayaSessionExpiredFragment) ((f) oVarI1.c.get())).f11935f0;
            if (jVar != null) {
                MayaSessionExpiredActivity mayaSessionExpiredActivity = (MayaSessionExpiredActivity) jVar;
                mayaSessionExpiredActivity.n1().j0(mayaSessionExpiredActivity, "https://online.maya.ph/forgot-password", mayaSessionExpiredActivity.getString(R.string.pma_label_forgot_password_title));
                return;
            }
            return;
        }
        j jVar2 = ((MayaSessionExpiredFragment) ((f) oVarI1.c.get())).f11935f0;
        if (jVar2 != null) {
            MayaSessionExpiredActivity mayaSessionExpiredActivity2 = (MayaSessionExpiredActivity) jVar2;
            mayaSessionExpiredActivity2.n1();
            mayaSessionExpiredActivity2.startActivity(new Intent(mayaSessionExpiredActivity2, (Class<?>) MayaForgotPasswordActivity.class));
        }
    }

    public static final void L1(MayaSessionExpiredFragment mayaSessionExpiredFragment) {
        C1229s c1229s = mayaSessionExpiredFragment.f11934e0;
        if (c1229s == null) {
            kotlin.jvm.internal.j.n("mAuthAnalyticsUtils");
            throw null;
        }
        FragmentActivity fragmentActivityRequireActivity = mayaSessionExpiredFragment.requireActivity();
        kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        String strL = AbstractC1213b.l(1);
        kotlin.jvm.internal.j.f(strL, "tapped(...)");
        TextView textView = mayaSessionExpiredFragment.f11931b0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mSwitchAccountTextView");
            throw null;
        }
        C1229s.c(c1229s, fragmentActivityRequireActivity, strL, "Login Page", "Login Page", textView.getText().toString(), "Session Timeout Login", null, null, PsExtractor.AUDIO_STREAM);
        mayaSessionExpiredFragment.I1().n();
    }

    public static final void M1(MayaSessionExpiredFragment mayaSessionExpiredFragment) {
        boolean z4 = !mayaSessionExpiredFragment.f11939j0;
        mayaSessionExpiredFragment.f11939j0 = z4;
        MayaInputLayout mayaInputLayout = mayaSessionExpiredFragment.f11928Y;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mPasswordMayaInputLayout");
            throw null;
        }
        b.z(mayaInputLayout, z4);
        C1229s c1229s = mayaSessionExpiredFragment.f11934e0;
        if (c1229s == null) {
            kotlin.jvm.internal.j.n("mAuthAnalyticsUtils");
            throw null;
        }
        FragmentActivity fragmentActivityRequireActivity = mayaSessionExpiredFragment.requireActivity();
        kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        String strL = AbstractC1213b.l(1);
        kotlin.jvm.internal.j.f(strL, "tapped(...)");
        C1229s.c(c1229s, fragmentActivityRequireActivity, strL, "Login Page", "Login Page", "Hide password", "Session Timeout Login", null, null, PsExtractor.AUDIO_STREAM);
    }

    public final o I1() {
        o oVar = this.f11933d0;
        if (oVar != null) {
            return oVar;
        }
        kotlin.jvm.internal.j.n("mMayaSessionExpiredFragmentPresenter");
        throw null;
    }

    public final String J1() {
        MayaInputLayout mayaInputLayout = this.f11928Y;
        if (mayaInputLayout != null) {
            return AbstractC1414e.g(mayaInputLayout);
        }
        kotlin.jvm.internal.j.n("mPasswordMayaInputLayout");
        throw null;
    }

    public final void N1(PayMayaError payMayaError) {
        j jVar = this.f11935f0;
        if (jVar != null) {
            M2.b.Z(2131231238, getString(R.string.maya_label_unable_to_log_you_in), null, null, null, false, payMayaError, null, false, 444).show(((MayaSessionExpiredActivity) jVar).getSupportFragmentManager(), "error_dialog");
        }
    }

    @Override // g9.InterfaceC1506a
    public final void g(String str, String str2, String str3) {
        o1().a(str, str2, str3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i4, Intent intent) {
        if (i == 1) {
            if (i4 == -1) {
                I1().o(true);
            } else if (i4 != 0) {
                Toast.makeText(getActivity(), "Authentication failed.", 0).show();
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.j.g(context, "context");
        a aVar = (a) W4.a.e().a().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12720U = (C1229s) aVar.f4684R.get();
        this.f11933d0 = new o(aVar.J(), aVar.S(), (com.paymaya.data.preference.a) aVar.e.get(), aVar.E(), (m) aVar.f4653A.get(), (c) aVar.f4724k.get());
        this.f11934e0 = (C1229s) aVar.f4684R.get();
        super.onAttach(context);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1().i();
        this.f10338R = true;
        setHasOptionsMenu(true);
        this.f11935f0 = (j) getActivity();
        Object systemService = requireActivity().getSystemService("keyguard");
        kotlin.jvm.internal.j.e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        this.f11937h0 = (KeyguardManager) systemService;
        I1().h(this);
        i0.d();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.j.g(menu, "menu");
        kotlin.jvm.internal.j.g(inflater, "inflater");
        inflater.inflate(R.menu.maya_menu_session_expired, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_session_expired, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.content_nested_scroll_view;
        if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.content_nested_scroll_view)) != null) {
            i = R.id.display_name_text_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.display_name_text_view);
            if (textView != null) {
                i = R.id.forgot_password_link_text_view;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.forgot_password_link_text_view);
                if (textView2 != null) {
                    i = R.id.form_constraint_layout;
                    if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.form_constraint_layout)) != null) {
                        i = R.id.header_logo_image_view;
                        if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.header_logo_image_view)) != null) {
                            i = R.id.login_button;
                            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.login_button);
                            if (button != null) {
                                i = R.id.login_identity_display_text_view;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.login_identity_display_text_view);
                                if (textView3 != null) {
                                    i = R.id.not_you_label_text_view;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.not_you_label_text_view)) != null) {
                                        i = R.id.password_maya_input_layout;
                                        MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.password_maya_input_layout);
                                        if (mayaInputLayout != null) {
                                            i = R.id.screen_lock_button;
                                            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.screen_lock_button);
                                            if (button2 != null) {
                                                i = R.id.switch_account_link_text_view;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.switch_account_link_text_view);
                                                if (textView4 != null) {
                                                    this.f11925V = new C0466m(constraintLayout, textView, textView2, button, textView3, mayaInputLayout, button2, textView4);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        I1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f11925V = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.j.g(item, "item");
        if (item.getItemId() != R.id.menu_help) {
            return super.onOptionsItemSelected(item);
        }
        j jVar = this.f11935f0;
        if (jVar != null) {
            MayaSessionExpiredActivity mayaSessionExpiredActivity = (MayaSessionExpiredActivity) jVar;
            mayaSessionExpiredActivity.f11793q = new N9.f(new M1(1, this, MayaSessionExpiredFragment.class, "processHelpCenterActivityResult", "processHelpCenterActivityResult(Landroidx/activity/result/ActivityResult;)V", 0, 28), 12);
            mayaSessionExpiredActivity.n1().n0(mayaSessionExpiredActivity, mayaSessionExpiredActivity.f11795s, "session_expired");
        }
        C1220i c1220iO1 = o1();
        C1219h c1219hE = C1219h.e("SESSION_TIMEOUT_BUTTON_TAPPED");
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("button", "Help center");
        map.put("screen_type", "Session Timeout");
        map.put("destination_page", "Help center");
        c1219hE.i();
        c1220iO1.b(c1219hE);
        return true;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        j jVar = this.f11935f0;
        if (jVar != null) {
            ((MayaSessionExpiredActivity) jVar).Q(this);
        }
        o oVarI1 = I1();
        if (!((MayaSessionExpiredFragment) ((f) oVarI1.c.get())).f11940k0) {
            oVarI1.m();
        }
        I1().i.a(true);
        s1().f("ttd");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final int i = 3;
        final int i4 = 2;
        char c = 1;
        char c10 = 1;
        final int i6 = 0;
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0466m c0466m = this.f11925V;
        kotlin.jvm.internal.j.d(c0466m);
        this.f11926W = (TextView) c0466m.f4151d;
        C0466m c0466m2 = this.f11925V;
        kotlin.jvm.internal.j.d(c0466m2);
        this.f11927X = (TextView) c0466m2.f;
        C0466m c0466m3 = this.f11925V;
        kotlin.jvm.internal.j.d(c0466m3);
        this.f11928Y = (MayaInputLayout) c0466m3.f4152g;
        C0466m c0466m4 = this.f11925V;
        kotlin.jvm.internal.j.d(c0466m4);
        this.f11929Z = (TextView) c0466m4.e;
        C0466m c0466m5 = this.f11925V;
        kotlin.jvm.internal.j.d(c0466m5);
        this.f11930a0 = (Button) c0466m5.h;
        C0466m c0466m6 = this.f11925V;
        kotlin.jvm.internal.j.d(c0466m6);
        this.f11931b0 = (TextView) c0466m6.i;
        C0466m c0466m7 = this.f11925V;
        kotlin.jvm.internal.j.d(c0466m7);
        this.f11932c0 = (Button) c0466m7.c;
        TextView textView = this.f11929Z;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mForgotPasswordTextView");
            throw null;
        }
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: Y6.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSessionExpiredFragment f6762b;

            {
                this.f6762b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSessionExpiredFragment.K1(mayaSessionExpiredFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment2 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaSessionExpiredFragment2.f11940k0 = false;
                            mayaSessionExpiredFragment2.I1().m();
                            return;
                        } finally {
                        }
                    case 2:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment3 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSessionExpiredFragment.L1(mayaSessionExpiredFragment3);
                            return;
                        } finally {
                        }
                    case 3:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment4 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaSessionExpiredFragment4.f11938i0 = true;
                            mayaSessionExpiredFragment4.I1().l();
                            return;
                        } finally {
                        }
                    default:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment5 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSessionExpiredFragment.M1(mayaSessionExpiredFragment5);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button = this.f11930a0;
        if (button == null) {
            kotlin.jvm.internal.j.n("mScreenLockButton");
            throw null;
        }
        final char c11 = c10 == true ? 1 : 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: Y6.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSessionExpiredFragment f6762b;

            {
                this.f6762b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (c11) {
                    case 0:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSessionExpiredFragment.K1(mayaSessionExpiredFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment2 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaSessionExpiredFragment2.f11940k0 = false;
                            mayaSessionExpiredFragment2.I1().m();
                            return;
                        } finally {
                        }
                    case 2:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment3 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSessionExpiredFragment.L1(mayaSessionExpiredFragment3);
                            return;
                        } finally {
                        }
                    case 3:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment4 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaSessionExpiredFragment4.f11938i0 = true;
                            mayaSessionExpiredFragment4.I1().l();
                            return;
                        } finally {
                        }
                    default:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment5 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSessionExpiredFragment.M1(mayaSessionExpiredFragment5);
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView2 = this.f11931b0;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mSwitchAccountTextView");
            throw null;
        }
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: Y6.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSessionExpiredFragment f6762b;

            {
                this.f6762b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSessionExpiredFragment.K1(mayaSessionExpiredFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment2 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaSessionExpiredFragment2.f11940k0 = false;
                            mayaSessionExpiredFragment2.I1().m();
                            return;
                        } finally {
                        }
                    case 2:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment3 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSessionExpiredFragment.L1(mayaSessionExpiredFragment3);
                            return;
                        } finally {
                        }
                    case 3:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment4 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaSessionExpiredFragment4.f11938i0 = true;
                            mayaSessionExpiredFragment4.I1().l();
                            return;
                        } finally {
                        }
                    default:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment5 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSessionExpiredFragment.M1(mayaSessionExpiredFragment5);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f11932c0;
        if (button2 == null) {
            kotlin.jvm.internal.j.n("mLoginButton");
            throw null;
        }
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: Y6.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSessionExpiredFragment f6762b;

            {
                this.f6762b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSessionExpiredFragment.K1(mayaSessionExpiredFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment2 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaSessionExpiredFragment2.f11940k0 = false;
                            mayaSessionExpiredFragment2.I1().m();
                            return;
                        } finally {
                        }
                    case 2:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment3 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSessionExpiredFragment.L1(mayaSessionExpiredFragment3);
                            return;
                        } finally {
                        }
                    case 3:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment4 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaSessionExpiredFragment4.f11938i0 = true;
                            mayaSessionExpiredFragment4.I1().l();
                            return;
                        } finally {
                        }
                    default:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment5 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSessionExpiredFragment.M1(mayaSessionExpiredFragment5);
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaInputLayout mayaInputLayout = this.f11928Y;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mPasswordMayaInputLayout");
            throw null;
        }
        final int i10 = 4;
        mayaInputLayout.getPrimaryIconImageView().setOnClickListener(new View.OnClickListener(this) { // from class: Y6.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSessionExpiredFragment f6762b;

            {
                this.f6762b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSessionExpiredFragment.K1(mayaSessionExpiredFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment2 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaSessionExpiredFragment2.f11940k0 = false;
                            mayaSessionExpiredFragment2.I1().m();
                            return;
                        } finally {
                        }
                    case 2:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment3 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSessionExpiredFragment.L1(mayaSessionExpiredFragment3);
                            return;
                        } finally {
                        }
                    case 3:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment4 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaSessionExpiredFragment4.f11938i0 = true;
                            mayaSessionExpiredFragment4.I1().l();
                            return;
                        } finally {
                        }
                    default:
                        MayaSessionExpiredFragment mayaSessionExpiredFragment5 = this.f6762b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSessionExpiredFragment.M1(mayaSessionExpiredFragment5);
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaInputLayout mayaInputLayout2 = this.f11928Y;
        if (mayaInputLayout2 == null) {
            kotlin.jvm.internal.j.n("mPasswordMayaInputLayout");
            throw null;
        }
        mayaInputLayout2.getInputEditText().setOnEditorActionListener(new e(this, i));
        MayaInputLayout mayaInputLayout3 = this.f11928Y;
        if (mayaInputLayout3 == null) {
            kotlin.jvm.internal.j.n("mPasswordMayaInputLayout");
            throw null;
        }
        mayaInputLayout3.setHelperErrorText(getString(R.string.maya_format_missing_field_is_required, getString(R.string.maya_label_password)));
        AppCompatEditText inputEditText = mayaInputLayout3.getInputEditText();
        A a8 = new A();
        a8.c = new Function0(this) { // from class: Y6.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSessionExpiredFragment f6766b;

            {
                this.f6766b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        this.f6766b.I1().s();
                        return Unit.f18162a;
                    case 1:
                        this.f6766b.I1().s();
                        return Unit.f18162a;
                    default:
                        return Boolean.valueOf(this.f6766b.f11938i0);
                }
            }
        };
        final char c12 = c == true ? 1 : 0;
        a8.f1715d = new Function0(this) { // from class: Y6.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSessionExpiredFragment f6766b;

            {
                this.f6766b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (c12) {
                    case 0:
                        this.f6766b.I1().s();
                        return Unit.f18162a;
                    case 1:
                        this.f6766b.I1().s();
                        return Unit.f18162a;
                    default:
                        return Boolean.valueOf(this.f6766b.f11938i0);
                }
            }
        };
        inputEditText.addTextChangedListener(a8);
        AppCompatEditText inputEditText2 = mayaInputLayout3.getInputEditText();
        A a10 = new A(new Function0(this) { // from class: Y6.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSessionExpiredFragment f6766b;

            {
                this.f6766b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        this.f6766b.I1().s();
                        return Unit.f18162a;
                    case 1:
                        this.f6766b.I1().s();
                        return Unit.f18162a;
                    default:
                        return Boolean.valueOf(this.f6766b.f11938i0);
                }
            }
        }, (Function0) null, (Function0) null, 14);
        a10.c = new h(mayaInputLayout3, 1);
        a10.f1715d = new h(mayaInputLayout3, 0);
        inputEditText2.addTextChangedListener(a10);
        I1().j();
        boolean z4 = Build.VERSION.SDK_INT >= 33 && !AbstractC1955a.u(requireContext(), "android.permission.POST_NOTIFICATIONS");
        this.f11941l0 = z4;
        if (z4) {
            MayaSessionExpiredFragment mayaSessionExpiredFragment = (MayaSessionExpiredFragment) ((f) I1().c.get());
            mayaSessionExpiredFragment.getClass();
            E1.c.r(new Ze.c(mayaSessionExpiredFragment).b("android.permission.POST_NOTIFICATIONS")).e(zh.b.a()).f();
        }
    }
}
