package com.paymaya.mayaui.regv2.view.fragment.impl;

import A5.b;
import B5.i;
import Eh.d;
import Gh.f;
import Kh.B;
import M7.a;
import N5.C0435a;
import a7.C0644e;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1228q;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.mayaui.login.view.activity.impl.MayaWelcomeActivity;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaWelcomeV2Fragment;
import db.c;
import eb.g;
import eb.q;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaWelcomeV2Fragment extends MayaBaseFragment implements c {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0435a f13694U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public a f13695V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C1229s f13696W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public q f13697X;

    public static final void G1(MayaWelcomeV2Fragment mayaWelcomeV2Fragment, ActivityResult activityResult) {
        mayaWelcomeV2Fragment.getClass();
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            String stringExtra = data != null ? data.getStringExtra("source_screen") : null;
            if (stringExtra == null) {
                stringExtra = "";
            }
            C1220i c1220iO1 = mayaWelcomeV2Fragment.o1();
            C1219h c1219hE = C1219h.e(AbstractC1213b.v(1));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219hE.j;
            map.put("source_page", stringExtra);
            map.put("screen_name", "Landing");
            c1219hE.i();
            c1220iO1.b(c1219hE);
        }
    }

    public static final void J1(MayaWelcomeV2Fragment mayaWelcomeV2Fragment) {
        MayaWelcomeV2Fragment mayaWelcomeV2Fragment2 = (MayaWelcomeV2Fragment) ((c) mayaWelcomeV2Fragment.H1().c.get());
        q qVar = mayaWelcomeV2Fragment2.f13697X;
        if (qVar != null) {
            MayaWelcomeActivity mayaWelcomeActivity = (MayaWelcomeActivity) qVar;
            mayaWelcomeActivity.f12741s = new g(1, mayaWelcomeV2Fragment2, MayaWelcomeV2Fragment.class, "handleRegistration", "handleRegistration(Landroidx/activity/result/ActivityResult;)V", 0, 8);
            Intent intentR0 = mayaWelcomeActivity.n1().r0(mayaWelcomeActivity);
            intentR0.setData(mayaWelcomeActivity.getIntent().getData());
            i.v0(mayaWelcomeActivity, intentR0);
            mayaWelcomeActivity.f12740r.launch(intentR0);
        }
        String strP = AbstractC1213b.p(1);
        j.f(strP, "tapped(...)");
        C0435a c0435a = mayaWelcomeV2Fragment.f13694U;
        j.d(c0435a);
        mayaWelcomeV2Fragment.I1(strP, "Account Creation", ((Button) c0435a.f).getText().toString());
    }

    public static final void K1(MayaWelcomeV2Fragment mayaWelcomeV2Fragment) {
        a aVarH1 = mayaWelcomeV2Fragment.H1();
        if (S5.c.b(aVarH1.f, b.f53B1)) {
            MayaWelcomeV2Fragment mayaWelcomeV2Fragment2 = (MayaWelcomeV2Fragment) ((c) aVarH1.c.get());
            if (AbstractC1955a.u(mayaWelcomeV2Fragment2.requireContext(), "android.permission.ACCESS_FINE_LOCATION") && AbstractC1955a.u(mayaWelcomeV2Fragment2.requireContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                aVarH1.m();
            } else {
                MayaWelcomeV2Fragment mayaWelcomeV2Fragment3 = (MayaWelcomeV2Fragment) ((c) aVarH1.c.get());
                mayaWelcomeV2Fragment3.getClass();
                B bE = AbstractC1955a.q(mayaWelcomeV2Fragment3).e(zh.b.a());
                f fVar = new f(new Qd.a(aVarH1, 7), d.f1366d);
                bE.g(fVar);
                aVarH1.e(fVar);
            }
        } else {
            aVarH1.m();
        }
        String strP = AbstractC1213b.p(1);
        j.f(strP, "tapped(...)");
        C0435a c0435a = mayaWelcomeV2Fragment.f13694U;
        j.d(c0435a);
        mayaWelcomeV2Fragment.I1(strP, "Login", ((Button) c0435a.c).getText().toString());
    }

    public final a H1() {
        a aVar = this.f13695V;
        if (aVar != null) {
            return aVar;
        }
        j.n("mWelcomeFragmentV2Presenter");
        throw null;
    }

    public final void I1(String str, String str2, String str3) {
        if (isAdded()) {
            C1229s c1229s = this.f13696W;
            if (c1229s == null) {
                j.n("mAuthAnalyticsUtils");
                throw null;
            }
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            j.f(fragmentActivityRequireActivity, "requireActivity(...)");
            C1229s.c(c1229s, fragmentActivityRequireActivity, str, "Landing", str2, str3, null, null, null, 224);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = requireActivity().getWindow();
        j.f(window, "getWindow(...)");
        if (Build.VERSION.SDK_INT >= 35) {
            WindowCompat.setDecorFitsSystemWindows(window, false);
            window.setNavigationBarContrastEnforced(false);
            window.getDecorView().setBackgroundColor(-16777216);
            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
            insetsController.setAppearanceLightStatusBars(false);
            insetsController.setAppearanceLightNavigationBars(false);
        } else {
            window.setStatusBarColor(-16777216);
            window.setNavigationBarColor(-16777216);
            WindowCompat.setDecorFitsSystemWindows(window, true);
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
            windowInsetsControllerCompat.setAppearanceLightStatusBars(false);
            windowInsetsControllerCompat.setAppearanceLightNavigationBars(false);
        }
        C1219h c1219hE = C1219h.e(AbstractC1213b.h(1));
        c1219hE.i();
        this.f10337Q = c1219hE;
        this.f10338R = true;
        this.f13697X = (q) getActivity();
        O5.a aVar = W4.a.e().w().f4755a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        S5.c flagConfigurationService = (S5.c) aVar.f4724k.get();
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        this.f13695V = new a(preference, flagConfigurationService, 4);
        this.f13696W = (C1229s) aVar.f4684R.get();
        H1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_welcome_v2, viewGroup, false);
        ScrollView scrollView = (ScrollView) viewInflate;
        int i = R.id.device_info_text_view;
        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.device_info_text_view)) != null) {
            i = R.id.login_button;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.login_button);
            if (button != null) {
                i = R.id.lottie_view;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.lottie_view);
                if (lottieAnimationView != null) {
                    i = R.id.maya_word_mark_image_view;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.maya_word_mark_image_view);
                    if (imageView != null) {
                        i = R.id.register_button;
                        Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.register_button);
                        if (button2 != null) {
                            i = R.id.regulation_notice_text_view;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.regulation_notice_text_view);
                            if (textView != null) {
                                this.f13694U = new C0435a(scrollView, button, lottieAnimationView, imageView, button2, textView, 16);
                                j.f(scrollView, "getRoot(...)");
                                return scrollView;
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
        super.onDestroy();
        this.f13694U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        final int i = 0;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C1220i c1220iO1 = o1();
        final int i4 = 1;
        C1219h c1219hE = C1219h.e(AbstractC1213b.v(1));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("SOURCE_SCREEN")) == null) {
            string = "";
        }
        HashMap map = c1219hE.j;
        map.put("source_page", string);
        map.put("screen_name", "Landing");
        c1219hE.i();
        c1220iO1.b(c1219hE);
        C0435a c0435a = this.f13694U;
        j.d(c0435a);
        AbstractC1228q.a((Button) c0435a.f);
        C0435a c0435a2 = this.f13694U;
        j.d(c0435a2);
        AbstractC1228q.a((Button) c0435a2.c);
        C0435a c0435a3 = this.f13694U;
        j.d(c0435a3);
        AbstractC1228q.a((TextView) c0435a3.f4049g);
        C0435a c0435a4 = this.f13694U;
        j.d(c0435a4);
        androidx.window.layout.adapter.extensions.a aVar = new androidx.window.layout.adapter.extensions.a(this, 11);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) c0435a4.f4048d;
        lottieAnimationView.setAlpha(0.0f);
        if (lottieAnimationView.getVisibility() != 0) {
            lottieAnimationView.setVisibility(0);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(lottieAnimationView, "alpha", 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        DecelerateInterpolator decelerateInterpolator = AbstractC1228q.f11227a;
        objectAnimatorOfFloat.setInterpolator(decelerateInterpolator);
        objectAnimatorOfFloat.setStartDelay(500L);
        objectAnimatorOfFloat.addListener(new C0644e(aVar, 2));
        objectAnimatorOfFloat.start();
        C0435a c0435a5 = this.f13694U;
        j.d(c0435a5);
        ImageView imageView = (ImageView) c0435a5.e;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, "alpha", 0.0f);
        objectAnimatorOfFloat2.setDuration(500L);
        objectAnimatorOfFloat2.setInterpolator(decelerateInterpolator);
        objectAnimatorOfFloat2.setStartDelay(500L);
        objectAnimatorOfFloat2.addListener(new C0644e(imageView, 3));
        objectAnimatorOfFloat2.start();
        C0435a c0435a6 = this.f13694U;
        j.d(c0435a6);
        ((Button) c0435a6.f).setOnClickListener(new View.OnClickListener(this) { // from class: eb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaWelcomeV2Fragment f16644b;

            {
                this.f16644b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaWelcomeV2Fragment mayaWelcomeV2Fragment = this.f16644b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaWelcomeV2Fragment.J1(mayaWelcomeV2Fragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaWelcomeV2Fragment mayaWelcomeV2Fragment2 = this.f16644b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaWelcomeV2Fragment.K1(mayaWelcomeV2Fragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        C0435a c0435a7 = this.f13694U;
        j.d(c0435a7);
        ((Button) c0435a7.c).setOnClickListener(new View.OnClickListener(this) { // from class: eb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaWelcomeV2Fragment f16644b;

            {
                this.f16644b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaWelcomeV2Fragment mayaWelcomeV2Fragment = this.f16644b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaWelcomeV2Fragment.J1(mayaWelcomeV2Fragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaWelcomeV2Fragment mayaWelcomeV2Fragment2 = this.f16644b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaWelcomeV2Fragment.K1(mayaWelcomeV2Fragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        H1().j();
    }
}
