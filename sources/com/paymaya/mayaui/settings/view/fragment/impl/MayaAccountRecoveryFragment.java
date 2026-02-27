package com.paymaya.mayaui.settings.view.fragment.impl;

import A7.j;
import Ah.o;
import E1.c;
import G6.r;
import G7.t;
import Gh.d;
import Hh.f;
import N5.C0491z;
import O5.a;
import Q6.n;
import Rb.b;
import Sb.g;
import Th.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import bg.AbstractC0983W;
import com.airbnb.lottie.LottieAnimationView;
import com.dynatrace.android.callback.Callback;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryFragment;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class MayaAccountRecoveryFragment extends MayaBaseFragment implements b {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0491z f13915U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public SpringView f13916V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f13917W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f13918X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Button f13919Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Button f13920Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public j f13921a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public LottieAnimationView f13922b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public g f13923c0;

    public static final void I1(MayaAccountRecoveryFragment mayaAccountRecoveryFragment) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.VERIFY);
        c1219hH.i();
        mayaAccountRecoveryFragment.A1(c1219hH);
        j jVarG1 = mayaAccountRecoveryFragment.G1();
        ((MayaBaseFragment) ((b) jVarG1.c.get())).E1();
        f fVarF = ((C1265j) jVarG1.f).c.sendRecoveryEmail().f(e.c);
        o oVarA = zh.b.a();
        d dVar = new d(0, new r(jVarG1, 15), new t(jVarG1, 21));
        try {
            fVarF.d(new Hh.e(dVar, oVarA));
            jVarG1.e(dVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            c.k(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final j G1() {
        j jVar = this.f13921a0;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.j.n("mFragmentPresenter");
        throw null;
    }

    public final void H1() {
        SpringView springView = this.f13916V;
        if (springView == null) {
            kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView.i();
        LottieAnimationView lottieAnimationView = this.f13922b0;
        if (lottieAnimationView == null) {
            kotlin.jvm.internal.j.n("mLottieView");
            throw null;
        }
        lottieAnimationView.a();
        LottieAnimationView lottieAnimationView2 = this.f13922b0;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setProgress(0.0f);
        } else {
            kotlin.jvm.internal.j.n("mLottieView");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().i();
        this.f13923c0 = (g) getActivity();
        a aVar = (a) W4.a.e().y().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        C1293x0 c1293x0J = aVar.J();
        C1265j c1265jE = aVar.e();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        kotlin.jvm.internal.j.g(sessionSubject, "sessionSubject");
        this.f13921a0 = new j(c1293x0J, c1265jE, sessionSubject, 5);
        G1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_account_recovery, viewGroup, false);
        int i = R.id.button_change_email;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_change_email);
        if (button != null) {
            i = R.id.button_send_verification;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_send_verification);
            if (button2 != null) {
                i = R.id.scroll_view_content;
                if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_content)) != null) {
                    i = R.id.space_registered_account_recovery_email_bottom;
                    if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_registered_account_recovery_email_bottom)) != null) {
                        i = R.id.space_registered_account_recovery_email_top;
                        if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_registered_account_recovery_email_top)) != null) {
                            i = R.id.text_view_header_description;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header_description)) != null) {
                                i = R.id.text_view_header_title;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header_title)) != null) {
                                    i = R.id.text_view_registered_account_recovery_email_text;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_registered_account_recovery_email_text);
                                    if (textView != null) {
                                        i = R.id.text_view_registered_account_recovery_status;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_registered_account_recovery_status);
                                        if (textView2 != null) {
                                            SpringView springView = (SpringView) viewInflate;
                                            i = R.id.view_registered_account_recovery_email;
                                            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_registered_account_recovery_email);
                                            if (viewFindChildViewById != null) {
                                                this.f13915U = new C0491z((ViewGroup) springView, (TextView) button, (View) button2, textView, textView2, (View) springView, viewFindChildViewById, 3);
                                                kotlin.jvm.internal.j.f(springView, "getRoot(...)");
                                                return springView;
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
        G1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f13915U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        g gVar = this.f13923c0;
        if (gVar != null) {
            ((MayaSettingsActivity) gVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0491z c0491z = this.f13915U;
        kotlin.jvm.internal.j.d(c0491z);
        this.f13916V = (SpringView) c0491z.f;
        C0491z c0491z2 = this.f13915U;
        kotlin.jvm.internal.j.d(c0491z2);
        this.f13917W = (TextView) c0491z2.f4304d;
        C0491z c0491z3 = this.f13915U;
        kotlin.jvm.internal.j.d(c0491z3);
        this.f13918X = (TextView) c0491z3.h;
        C0491z c0491z4 = this.f13915U;
        kotlin.jvm.internal.j.d(c0491z4);
        this.f13919Y = (Button) c0491z4.e;
        C0491z c0491z5 = this.f13915U;
        kotlin.jvm.internal.j.d(c0491z5);
        this.f13920Z = (Button) c0491z5.c;
        SpringView springView = this.f13916V;
        if (springView == null) {
            kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView.setHeader(new J7.e());
        SpringView springView2 = this.f13916V;
        if (springView2 == null) {
            kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
            throw null;
        }
        View viewFindViewById = springView2.getHeaderView().findViewById(R.id.lottie_view);
        kotlin.jvm.internal.j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.f13922b0 = (LottieAnimationView) viewFindViewById;
        SpringView springView3 = this.f13916V;
        if (springView3 == null) {
            kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView3.setListener(new n(this, 4));
        G1().j();
        Button button = this.f13919Y;
        if (button == null) {
            kotlin.jvm.internal.j.n("mButtonSendVerification");
            throw null;
        }
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: Sb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAccountRecoveryFragment f5700b;

            {
                this.f5700b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaAccountRecoveryFragment mayaAccountRecoveryFragment = this.f5700b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAccountRecoveryFragment.I1(mayaAccountRecoveryFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaAccountRecoveryFragment mayaAccountRecoveryFragment2 = this.f5700b;
                        Callback.onClick_enter(view2);
                        try {
                            g gVar = mayaAccountRecoveryFragment2.f13923c0;
                            if (gVar != null) {
                                ((MayaSettingsActivity) gVar).Y1(true);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f13920Z;
        if (button2 == null) {
            kotlin.jvm.internal.j.n("mButtonChangeEmail");
            throw null;
        }
        final int i4 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: Sb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAccountRecoveryFragment f5700b;

            {
                this.f5700b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaAccountRecoveryFragment mayaAccountRecoveryFragment = this.f5700b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAccountRecoveryFragment.I1(mayaAccountRecoveryFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaAccountRecoveryFragment mayaAccountRecoveryFragment2 = this.f5700b;
                        Callback.onClick_enter(view2);
                        try {
                            g gVar = mayaAccountRecoveryFragment2.f13923c0;
                            if (gVar != null) {
                                ((MayaSettingsActivity) gVar).Y1(true);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.ACCOUNT_RECOVERY;
    }
}
