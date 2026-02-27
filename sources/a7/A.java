package A7;

import Bj.C0165x;
import G7.F;
import G7.H;
import Kh.B;
import Kh.C0305j;
import Kh.C0310o;
import Kh.T;
import M8.T2;
import N5.A1;
import N5.C0435a;
import N5.C0441c;
import N5.C0446d1;
import N5.C0449e1;
import N5.C0491z;
import N5.G0;
import N5.I;
import N5.M0;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj.M;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.widget.TextViewWithImagesKt;
import com.paymaya.data.database.repository.C1239c;
import com.paymaya.data.database.repository.G;
import com.paymaya.domain.model.CreditApplication;
import com.paymaya.domain.model.CreditResponse;
import com.paymaya.domain.model.CreditWalletBanner;
import com.paymaya.domain.model.CustomerDetails;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.domain.store.B0;
import com.paymaya.domain.store.C;
import com.paymaya.domain.store.C1247a;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.C1273n;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.E;
import com.paymaya.domain.store.I0;
import com.paymaya.domain.store.W0;
import com.paymaya.domain.store.X0;
import com.paymaya.domain.store.Y0;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaWalletFragment;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.rewardscatalog.view.fragment.MayaRewardsCatalogFragment;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import dOYHB6.yFtIp6.svM7M6;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.android.TransparencyMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import k2.v0;
import kotlin.Pair;
import n3.C1916a;
import ph.C2070f1;
import s.AbstractC2217b;
import v5.C2342a;
import y5.AbstractC2509a;
import z7.InterfaceC2555b;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends AbstractC2509a implements InterfaceC2555b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1247a f183d;
    public final Y0 e;
    public final C1293x0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1273n f184g;
    public final com.paymaya.data.preference.a h;
    public final I0 i;
    public final E j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C f185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final W0 f186l;
    public final B0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1264i0 f187n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final S5.c f188o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f189p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f190q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CreditResponse f191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CreditWalletBanner f192s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C1247a c1247a, Y0 y0, C1293x0 c1293x0, C1273n c1273n, com.paymaya.data.preference.a mPreference, I0 i02, E e, C c, W0 w0, B0 b02, C1264i0 c1264i0, S5.c mFlagConfigurationService, Uh.d dVar) {
        super(dVar);
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(mFlagConfigurationService, "mFlagConfigurationService");
        this.f183d = c1247a;
        this.e = y0;
        this.f = c1293x0;
        this.f184g = c1273n;
        this.h = mPreference;
        this.i = i02;
        this.j = e;
        this.f185k = c;
        this.f186l = w0;
        this.m = b02;
        this.f187n = c1264i0;
        this.f188o = mFlagConfigurationService;
    }

    public static C2342a p(PayMayaError payMayaError, Throwable th2) throws Exception {
        if (payMayaError.isSessionTimeout()) {
            throw new Exception(th2);
        }
        return new C2342a(null);
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        int i = 2;
        int i4 = 9;
        int i6 = 1;
        int i10 = 0;
        super.j();
        ((MayaWalletFragment) ((F7.s) this.c.get())).L1();
        MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) ((F7.s) this.c.get());
        M0 m0 = mayaWalletFragment.f12249o0;
        kotlin.jvm.internal.j.d(m0);
        ((Group) m0.c).setVisibility(0);
        M0 m02 = mayaWalletFragment.f12249o0;
        kotlin.jvm.internal.j.d(m02);
        mayaWalletFragment.f12253r0 = (I) m02.m;
        M0 m03 = mayaWalletFragment.f12249o0;
        kotlin.jvm.internal.j.d(m03);
        C0441c c0441c = (C0441c) m03.f3772n;
        mayaWalletFragment.f12254s0 = c0441c;
        I i11 = mayaWalletFragment.f12253r0;
        if (i11 == null) {
            kotlin.jvm.internal.j.n("mViewWalletBalance");
            throw null;
        }
        mayaWalletFragment.t0 = (TextView) i11.c;
        mayaWalletFragment.u0 = i11.f3646b;
        mayaWalletFragment.f12255v0 = (TextView) i11.f3647d;
        mayaWalletFragment.w0 = (ImageView) i11.f3648g;
        mayaWalletFragment.f12256x0 = (TextView) i11.h;
        mayaWalletFragment.f12257z0 = (G0) i11.f3650l;
        TextViewWithImagesKt textViewWithImagesKt = (TextViewWithImagesKt) i11.i;
        mayaWalletFragment.f12229T0 = (TextViewWithImagesKt) i11.j;
        C0491z c0491z = mayaWalletFragment.f12213A0;
        if (c0491z == null) {
            kotlin.jvm.internal.j.n("mViewActivityList");
            throw null;
        }
        mayaWalletFragment.f12219G0 = (G0) c0491z.f4305g;
        mayaWalletFragment.y0 = (RecyclerView) c0441c.c;
        C0435a c0435a = (C0435a) i11.f3649k;
        mayaWalletFragment.f12230U0 = c0435a;
        mayaWalletFragment.f12234Y0 = (A1) c0435a.f4049g;
        mayaWalletFragment.f12231V0 = (TextView) c0435a.f;
        mayaWalletFragment.f12232W0 = (AppCompatTextView) c0435a.c;
        mayaWalletFragment.f12233X0 = (ImageView) c0435a.e;
        mayaWalletFragment.f12235Z0 = (Group) c0435a.f4048d;
        textViewWithImagesKt.setOnClickListener(new G7.E(mayaWalletFragment, i10));
        TextViewWithImagesKt textViewWithImagesKt2 = mayaWalletFragment.f12229T0;
        if (textViewWithImagesKt2 == null) {
            kotlin.jvm.internal.j.n("mTextViewWithImagesSend");
            throw null;
        }
        textViewWithImagesKt2.setOnClickListener(new G7.E(mayaWalletFragment, i6));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(mayaWalletFragment.getActivity(), 4);
        Context contextRequireContext = mayaWalletFragment.requireContext();
        kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
        D7.c cVar = new D7.c(contextRequireContext, mayaWalletFragment);
        mayaWalletFragment.f12247m1 = cVar;
        RecyclerView recyclerView = mayaWalletFragment.y0;
        if (recyclerView == null) {
            kotlin.jvm.internal.j.n("mRecyclerViewFeatures");
            throw null;
        }
        recyclerView.setAdapter(cVar);
        RecyclerView recyclerView2 = mayaWalletFragment.y0;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.j.n("mRecyclerViewFeatures");
            throw null;
        }
        recyclerView2.setLayoutManager(gridLayoutManager);
        MayaWalletFragment mayaWalletFragment2 = (MayaWalletFragment) ((F7.s) this.c.get());
        I i12 = mayaWalletFragment2.f12253r0;
        if (i12 == null) {
            kotlin.jvm.internal.j.n("mViewWalletBalance");
            throw null;
        }
        C0491z c0491z2 = (C0491z) i12.f;
        ConstraintLayout constraintLayout = (ConstraintLayout) c0491z2.e;
        mayaWalletFragment2.f12236a1 = constraintLayout;
        mayaWalletFragment2.f12238c1 = (AppCompatTextView) c0491z2.h;
        mayaWalletFragment2.f12237b1 = (Button) c0491z2.c;
        mayaWalletFragment2.f12239d1 = (AppCompatTextView) c0491z2.f4305g;
        mayaWalletFragment2.f12240e1 = (AppCompatTextView) c0491z2.f4304d;
        mayaWalletFragment2.f12241f1 = (ImageView) c0491z2.f;
        constraintLayout.setOnClickListener(new G7.E(mayaWalletFragment2, i4));
        Button button = mayaWalletFragment2.f12237b1;
        if (button == null) {
            kotlin.jvm.internal.j.n("mButtonCreditBanner");
            throw null;
        }
        button.setOnClickListener(new G7.E(mayaWalletFragment2, 10));
        mayaWalletFragment2.T1();
        if (this.f183d.b() == null) {
            MayaWalletFragment mayaWalletFragment3 = (MayaWalletFragment) ((F7.s) this.c.get());
            TextView textView = mayaWalletFragment3.u0;
            if (textView == null) {
                kotlin.jvm.internal.j.n("mTextViewBalance");
                throw null;
            }
            textView.setVisibility(8);
            TextView textView2 = mayaWalletFragment3.f12255v0;
            if (textView2 == null) {
                kotlin.jvm.internal.j.n("mTextViewMaskedBalance");
                throw null;
            }
            textView2.setVisibility(8);
            G0 g02 = ((MayaWalletFragment) ((F7.s) this.c.get())).f12257z0;
            if (g02 == null) {
                kotlin.jvm.internal.j.n("mViewLoadingBalanceV2");
                throw null;
            }
            g02.f3627b.setVisibility(0);
        }
        MayaWalletFragment mayaWalletFragment4 = (MayaWalletFragment) ((F7.s) this.c.get());
        TextView textView3 = mayaWalletFragment4.f12214B0;
        if (textView3 == null) {
            kotlin.jvm.internal.j.n("mTextViewTransactionLabel");
            throw null;
        }
        textView3.setVisibility(8);
        RecyclerView recyclerView3 = mayaWalletFragment4.f12216D0;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.j.n("mRecyclerViewActivityList");
            throw null;
        }
        recyclerView3.setVisibility(8);
        ((MayaWalletFragment) ((F7.s) this.c.get())).U1();
        ((MayaWalletFragment) ((F7.s) this.c.get())).V1();
        ((MayaWalletFragment) ((F7.s) this.c.get())).b2();
        o();
        MayaWalletFragment mayaWalletFragment5 = (MayaWalletFragment) ((F7.s) this.c.get());
        RecyclerView recyclerView4 = mayaWalletFragment5.y0;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.j.n("mRecyclerViewFeatures");
            throw null;
        }
        recyclerView4.addItemDecoration(new E7.a(mayaWalletFragment5.getResources().getDimensionPixelSize(R.dimen.maya_margin_normal), mayaWalletFragment5.getResources().getDimensionPixelSize(R.dimen.maya_margin_medium), mayaWalletFragment5.getResources().getDimensionPixelSize(R.dimen.maya_secondary_feature_badge_label_inset_vertical), mayaWalletFragment5.getResources().getDimensionPixelSize(R.dimen.maya_secondary_feature_badge_label_inset_horizontal)));
        F7.s sVar = (F7.s) this.c.get();
        ArrayList arrayList = this.i.e;
        ArrayList arrayList2 = arrayList.size() >= 8 ? new ArrayList(arrayList.subList(0, 8)) : new ArrayList(arrayList);
        MayaWalletFragment mayaWalletFragment6 = (MayaWalletFragment) sVar;
        mayaWalletFragment6.getClass();
        D7.c cVar2 = mayaWalletFragment6.f12247m1;
        if (cVar2 != null) {
            cVar2.e(arrayList2);
        }
        B bE = this.f183d.c().e(zh.b.a());
        x xVar = new x(this, 1);
        C1916a c1916a = Eh.d.c;
        mg.c cVar3 = Eh.d.f1365b;
        e(new C0310o(bE, xVar, c1916a, cVar3).f());
        Y0 y0 = this.e;
        mg.c cVar4 = new mg.c(9);
        G g8 = y0.c;
        e(new C0310o(new Kh.z(g8.f11299a.d("user_activity", cVar4), new com.paymaya.data.database.repository.x(g8, 7), 0).e(zh.b.a()).c(C0103a.f), new u(this, i), c1916a, cVar3).f());
        if (S5.c.b(this.f188o, A5.b.f98d)) {
            MayaWalletFragment mayaWalletFragment7 = (MayaWalletFragment) ((F7.s) this.c.get());
            C0435a c0435a2 = mayaWalletFragment7.f12230U0;
            if (c0435a2 == null) {
                kotlin.jvm.internal.j.n("mViewActionCard");
                throw null;
            }
            ((CardView) c0435a2.f4047b).setVisibility(0);
            A1 a12 = mayaWalletFragment7.f12234Y0;
            if (a12 == null) {
                kotlin.jvm.internal.j.n("mActionCardShimmer");
                throw null;
            }
            a12.f3548b.setVisibility(0);
            Group group = mayaWalletFragment7.f12235Z0;
            if (group == null) {
                kotlin.jvm.internal.j.n("mGroupActionCardContent");
                throw null;
            }
            group.setVisibility(4);
            N4.d dVar = new N4.d(6);
            C1239c c1239c = this.m.c;
            c1239c.getClass();
            new C0310o(new C0305j(new Kh.z(c1239c.f11305a.d("action_card_recommendation", dVar), new Q6.r(c1239c, 28), 0).c(C0103a.e).e(zh.b.a()), new y(this, 1), i6), new t(this, i), c1916a, cVar3).f();
        }
        if (S5.c.b(this.f188o, A5.b.f89Y0)) {
            MayaWalletFragment mayaWalletFragment8 = (MayaWalletFragment) ((F7.s) this.c.get());
            mayaWalletFragment8.getClass();
            try {
                H h = new H(mayaWalletFragment8.P1(), mayaWalletFragment8.f12245k1, new Ag.k(mayaWalletFragment8, 18));
                try {
                    h.a();
                } catch (Exception unused) {
                    yk.a.d();
                }
                try {
                    h.a();
                } catch (Exception unused2) {
                    yk.a.d();
                }
                FlutterFragment flutterFragmentBuild = FlutterFragment.withCachedEngine(h.f1827a).renderMode(RenderMode.texture).transparencyMode(TransparencyMode.transparent).build();
                kotlin.jvm.internal.j.f(flutterFragmentBuild, "build(...)");
                mayaWalletFragment8.f12228S0 = flutterFragmentBuild;
                FragmentTransaction fragmentTransactionBeginTransaction = mayaWalletFragment8.getChildFragmentManager().beginTransaction();
                FrameLayout frameLayout = mayaWalletFragment8.f12227Q0;
                if (frameLayout == null) {
                    kotlin.jvm.internal.j.n("mXPWalletFlutterWidgetContainer");
                    throw null;
                }
                fragmentTransactionBeginTransaction.replace(frameLayout.getId(), flutterFragmentBuild).commitAllowingStateLoss();
                mayaWalletFragment8.R0 = h;
                A a8 = (A) mayaWalletFragment8.P1();
                if (!a8.h.L()) {
                    a8.r();
                }
            } catch (Exception unused3) {
                FrameLayout frameLayout2 = mayaWalletFragment8.f12227Q0;
                if (frameLayout2 == null) {
                    kotlin.jvm.internal.j.n("mXPWalletFlutterWidgetContainer");
                    throw null;
                }
                frameLayout2.setVisibility(8);
            }
        }
        if (kotlin.jvm.internal.j.b(S5.c.e(this.f188o, A5.g.h), "wallet_rewards_test")) {
            MayaWalletFragment mayaWalletFragment9 = (MayaWalletFragment) ((F7.s) this.c.get());
            C0446d1 c0446d1 = mayaWalletFragment9.I0;
            if (c0446d1 == null) {
                kotlin.jvm.internal.j.n("mViewBannerAds");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = c0446d1.f4077b.getLayoutParams();
            kotlin.jvm.internal.j.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            C0441c c0441c2 = mayaWalletFragment9.f12254s0;
            if (c0441c2 == null) {
                kotlin.jvm.internal.j.n("mViewWalletService");
                throw null;
            }
            layoutParams2.topToBottom = ((RecyclerView) c0441c2.f4066b).getId();
            C0446d1 c0446d12 = mayaWalletFragment9.I0;
            if (c0446d12 == null) {
                kotlin.jvm.internal.j.n("mViewBannerAds");
                throw null;
            }
            c0446d12.f4077b.setLayoutParams(layoutParams2);
            C0435a c0435a3 = mayaWalletFragment9.f12220H0;
            if (c0435a3 == null) {
                kotlin.jvm.internal.j.n("mViewRewards");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams3 = ((ConstraintLayout) c0435a3.f4047b).getLayoutParams();
            kotlin.jvm.internal.j.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            C0446d1 c0446d13 = mayaWalletFragment9.I0;
            if (c0446d13 == null) {
                kotlin.jvm.internal.j.n("mViewBannerAds");
                throw null;
            }
            layoutParams4.topToBottom = c0446d13.f4077b.getId();
            C0435a c0435a4 = mayaWalletFragment9.f12220H0;
            if (c0435a4 == null) {
                kotlin.jvm.internal.j.n("mViewRewards");
                throw null;
            }
            ((ConstraintLayout) c0435a4.f4047b).setLayoutParams(layoutParams4);
            FrameLayout frameLayout3 = mayaWalletFragment9.g1;
            if (frameLayout3 == null) {
                kotlin.jvm.internal.j.n("mRewardsCatalogWidgetContainer");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams5 = frameLayout3.getLayoutParams();
            kotlin.jvm.internal.j.e(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
            C0435a c0435a5 = mayaWalletFragment9.f12220H0;
            if (c0435a5 == null) {
                kotlin.jvm.internal.j.n("mViewRewards");
                throw null;
            }
            layoutParams6.topToBottom = ((ConstraintLayout) c0435a5.f4047b).getId();
            FrameLayout frameLayout4 = mayaWalletFragment9.g1;
            if (frameLayout4 == null) {
                kotlin.jvm.internal.j.n("mRewardsCatalogWidgetContainer");
                throw null;
            }
            frameLayout4.setLayoutParams(layoutParams6);
            FrameLayout frameLayout5 = mayaWalletFragment9.f12227Q0;
            if (frameLayout5 == null) {
                kotlin.jvm.internal.j.n("mXPWalletFlutterWidgetContainer");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams7 = frameLayout5.getLayoutParams();
            kotlin.jvm.internal.j.e(layoutParams7, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
            FrameLayout frameLayout6 = mayaWalletFragment9.g1;
            if (frameLayout6 == null) {
                kotlin.jvm.internal.j.n("mRewardsCatalogWidgetContainer");
                throw null;
            }
            layoutParams8.topToBottom = frameLayout6.getId();
            FrameLayout frameLayout7 = mayaWalletFragment9.f12227Q0;
            if (frameLayout7 == null) {
                kotlin.jvm.internal.j.n("mXPWalletFlutterWidgetContainer");
                throw null;
            }
            frameLayout7.setLayoutParams(layoutParams8);
            C0491z c0491z3 = mayaWalletFragment9.f12213A0;
            if (c0491z3 == null) {
                kotlin.jvm.internal.j.n("mViewActivityList");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams9 = ((ConstraintLayout) c0491z3.f4303b).getLayoutParams();
            kotlin.jvm.internal.j.e(layoutParams9, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
            FrameLayout frameLayout8 = mayaWalletFragment9.f12227Q0;
            if (frameLayout8 == null) {
                kotlin.jvm.internal.j.n("mXPWalletFlutterWidgetContainer");
                throw null;
            }
            layoutParams10.topToBottom = frameLayout8.getId();
            C0491z c0491z4 = mayaWalletFragment9.f12213A0;
            if (c0491z4 == null) {
                kotlin.jvm.internal.j.n("mViewActivityList");
                throw null;
            }
            ((ConstraintLayout) c0491z4.f4303b).setLayoutParams(layoutParams10);
            C0449e1 c0449e1 = mayaWalletFragment9.f12225O0;
            if (c0449e1 == null) {
                kotlin.jvm.internal.j.n("mViewBspFooter");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams11 = c0449e1.f4085b.getLayoutParams();
            kotlin.jvm.internal.j.e(layoutParams11, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams12 = (ConstraintLayout.LayoutParams) layoutParams11;
            C0491z c0491z5 = mayaWalletFragment9.f12213A0;
            if (c0491z5 == null) {
                kotlin.jvm.internal.j.n("mViewActivityList");
                throw null;
            }
            layoutParams12.topToBottom = ((ConstraintLayout) c0491z5.f4303b).getId();
            C0449e1 c0449e12 = mayaWalletFragment9.f12225O0;
            if (c0449e12 == null) {
                kotlin.jvm.internal.j.n("mViewBspFooter");
                throw null;
            }
            c0449e12.f4085b.setLayoutParams(layoutParams12);
        }
        if (S5.c.b(this.f188o, A5.b.f81U0)) {
            MayaWalletFragment mayaWalletFragment10 = (MayaWalletFragment) ((F7.s) this.c.get());
            FrameLayout frameLayout9 = mayaWalletFragment10.g1;
            if (frameLayout9 == null) {
                kotlin.jvm.internal.j.n("mRewardsCatalogWidgetContainer");
                throw null;
            }
            int id = frameLayout9.getId();
            if (mayaWalletFragment10.getChildFragmentManager().findFragmentById(id) == null) {
                mayaWalletFragment10.getChildFragmentManager().beginTransaction().replace(id, new MayaRewardsCatalogFragment()).commitNowAllowingStateLoss();
            }
        }
    }

    public final void k(boolean z4) {
        Ah.p pVarC;
        int i = 4;
        int i4 = 3;
        int i6 = 5;
        int i10 = 2;
        int i11 = 1;
        int i12 = 0;
        if (this.f189p) {
            return;
        }
        this.f189p = true;
        if (z4) {
            SpringView springView = ((MayaWalletFragment) ((F7.s) this.c.get())).f12251p0;
            if (springView == null) {
                kotlin.jvm.internal.j.n("mDashboardSwipeRefreshLayout");
                throw null;
            }
            springView.c();
        }
        Lh.i iVar = new Lh.i(new Lh.f(this.f183d.a(), new t(this, i12), 0), new q(this, i11), null);
        Y0 y0 = this.e;
        y0.getClass();
        HashMap map = new HashMap();
        map.put("page", String.valueOf(1));
        map.put("limit", String.valueOf(25));
        Ah.p<List<UserActivity>> activities = y0.f11408b.getActivities(map);
        X0 x02 = new X0(y0, 2);
        activities.getClass();
        T t5 = new T(i6, new Lh.h(new Lh.i(new Lh.f(new Lh.d(activities, x02, i10), new t(this, i4), 0), new q(this, i), null), zh.b.a(), 0), new q(this, i6));
        Lh.i iVar2 = new Lh.i(new Lh.f(this.f.g(), new v(this, i10), 0), new q(this, i10), null);
        Lh.i iVar3 = new Lh.i(new Lh.f(this.f185k.a(), new w(this, i11), 0), new q(this, i4), null);
        if (S5.c.b(this.f188o, A5.b.f73Q)) {
            String lowerCase = EventMetricsAggregator.OS_NAME.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.j.f(string, "toString(...)");
            C1264i0 c1264i0 = this.f187n;
            c1264i0.getClass();
            Ah.p<CreditWalletBanner> creditWalletBanner = c1264i0.c.getCreditWalletBanner(T2.v(lowerCase, string));
            kotlin.jvm.internal.j.f(creditWalletBanner, "getCreditWalletBanner(...)");
            pVarC = new Lh.d(new Lh.d(new Lh.f(new Lh.h(creditWalletBanner, zh.b.a(), 0), new t(this, i11), 0), new u(this, i11), i10), new v(this, i11), i12);
        } else {
            pVarC = Ah.p.c(new C2342a(null));
        }
        e(new T(i6, new Lh.d(new Lh.d(new Lh.h(Ah.p.m(new J5.c(new u(this, i12), 22), iVar, t5, iVar2, iVar3, pVarC), zh.b.a(), 0), new v(this, i12), i10), new w(this, i12), i12), new q(this, i12)).e());
    }

    public final void l() {
        int iV;
        if (S5.c.b(this.f188o, A5.b.f73Q)) {
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            LinkedHashMap linkedHashMapI = M.i(new Pair("easy_credit_status", "No Application"));
            CreditWalletBanner creditWalletBanner = this.f192s;
            if (creditWalletBanner == null) {
                v0.F((F7.s) this.c.get(), "easy_credit", M.m(linkedHashMapI), 22);
                G7.G g8 = ((MayaWalletFragment) ((F7.s) this.c.get())).f12245k1;
                if (g8 != null) {
                    ((MayaDashboardActivity) g8).W1("credit", "");
                    return;
                }
                return;
            }
            CreditApplication creditApplication = creditWalletBanner.getCreditApplication();
            if (creditApplication != null) {
                linkedHashMapI.put("easy_credit_status", creditApplication.getStatus());
            }
            v0.F((F7.s) this.c.get(), "easy_credit", M.m(linkedHashMapI), 22);
            String status = creditWalletBanner.getStatus();
            kotlin.jvm.internal.j.g(status, "status");
            try {
                iV = AbstractC1213b.V(status);
            } catch (IllegalArgumentException unused) {
                iV = 0;
            }
            int i = iV == 0 ? -1 : s.f236a[AbstractC2217b.c(iV)];
            if (i == 1) {
                CreditResponse creditResponse = this.f191r;
                if (creditResponse == null) {
                    G7.G g10 = ((MayaWalletFragment) ((F7.s) this.c.get())).f12245k1;
                    if (g10 != null) {
                        ((MayaDashboardActivity) g10).W1("credit", "");
                        return;
                    }
                    return;
                }
                MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) ((F7.s) this.c.get());
                mayaWalletFragment.getClass();
                G7.G g11 = mayaWalletFragment.f12245k1;
                if (g11 != null) {
                    MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) g11;
                    mayaDashboardActivity.n1();
                    Intent intent = new Intent(mayaDashboardActivity, (Class<?>) NewMayaCreditActivity.class);
                    intent.putExtra("feature", "transfer");
                    intent.putExtra("credit_response", creditResponse);
                    mayaDashboardActivity.startActivity(intent);
                    return;
                }
                return;
            }
            if (i != 2) {
                G7.G g12 = ((MayaWalletFragment) ((F7.s) this.c.get())).f12245k1;
                if (g12 != null) {
                    ((MayaDashboardActivity) g12).W1("credit", "");
                    return;
                }
                return;
            }
            boolean zB = S5.c.b(this.f188o, A5.b.f76S);
            CustomerDetails customerDetails = creditWalletBanner.getCustomerDetails();
            boolean z4 = (customerDetails != null ? customerDetails.getMothersMaidenName() : null) != null;
            if (!zB || !z4) {
                G7.G g13 = ((MayaWalletFragment) ((F7.s) this.c.get())).f12245k1;
                if (g13 != null) {
                    ((MayaDashboardActivity) g13).W1("credit", "");
                    return;
                }
                return;
            }
            CreditResponse creditResponse2 = this.f191r;
            if (creditResponse2 == null) {
                G7.G g14 = ((MayaWalletFragment) ((F7.s) this.c.get())).f12245k1;
                if (g14 != null) {
                    ((MayaDashboardActivity) g14).W1("credit", "");
                    return;
                }
                return;
            }
            MayaWalletFragment mayaWalletFragment2 = (MayaWalletFragment) ((F7.s) this.c.get());
            mayaWalletFragment2.getClass();
            G7.G g15 = mayaWalletFragment2.f12245k1;
            if (g15 != null) {
                MayaDashboardActivity mayaDashboardActivity2 = (MayaDashboardActivity) g15;
                mayaDashboardActivity2.n1();
                Intent intent2 = new Intent(mayaDashboardActivity2, (Class<?>) NewMayaCreditActivity.class);
                intent2.putExtra("feature", "transfer");
                intent2.putExtra("credit_response", creditResponse2);
                mayaDashboardActivity2.startActivity(intent2);
            }
        }
    }

    public final void m(boolean z4) {
        H h;
        n();
        boolean zB = !this.h.e().isRestrictedLoginEnabled() ? true : kotlin.jvm.internal.j.b(svM7M6.getString(this.h.f11330b, "key_restrictions", ""), "DUPLICATE");
        if (!this.h.f11330b.getBoolean("key_is_dedup_modal_shown", false) && kotlin.jvm.internal.j.b(svM7M6.getString(this.h.f11330b, "key_account_status", ""), "LIMITED") && zB) {
            G7.G g8 = ((MayaWalletFragment) ((F7.s) this.c.get())).f12245k1;
            if (g8 != null) {
                MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) g8;
                M2.b.Z(2131231237, mayaDashboardActivity.getString(R.string.maya_error_title_duplicate_account), mayaDashboardActivity.getString(R.string.maya_error_message_duplicate_account), mayaDashboardActivity.getString(R.string.maya_label_resolve_dedup_account), null, false, null, new C7.c(mayaDashboardActivity, 7), true, 112).show(mayaDashboardActivity.getSupportFragmentManager(), "error_dialog");
            }
            androidx.camera.core.impl.a.A(this.h.f11330b, "key_is_dedup_modal_shown", true);
        }
        k(z4);
        if (this.h.e().isCashinWalletSettingsEnabled()) {
            TextView textView = ((MayaWalletFragment) ((F7.s) this.c.get())).f12256x0;
            if (textView == null) {
                kotlin.jvm.internal.j.n("mTextViewViewWalletOptions");
                throw null;
            }
            textView.setVisibility(0);
        } else {
            TextView textView2 = ((MayaWalletFragment) ((F7.s) this.c.get())).f12256x0;
            if (textView2 == null) {
                kotlin.jvm.internal.j.n("mTextViewViewWalletOptions");
                throw null;
            }
            textView2.setVisibility(8);
        }
        if (S5.c.b(this.f188o, A5.b.f89Y0) && (h = ((MayaWalletFragment) ((F7.s) this.c.get())).R0) != null) {
            pg.u uVar = h.h;
            if (uVar != null) {
                uVar.a("requestPartialRefresh", null, null);
            } else {
                yk.a.f21331b.getClass();
                C2070f1.l();
            }
        }
        if (S5.c.b(this.f188o, A5.b.f81U0)) {
            MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) ((F7.s) this.c.get());
            FragmentManager childFragmentManager = mayaWalletFragment.getChildFragmentManager();
            FrameLayout frameLayout = mayaWalletFragment.g1;
            if (frameLayout == null) {
                kotlin.jvm.internal.j.n("mRewardsCatalogWidgetContainer");
                throw null;
            }
            Fragment fragmentFindFragmentById = childFragmentManager.findFragmentById(frameLayout.getId());
            MayaRewardsCatalogFragment mayaRewardsCatalogFragment = fragmentFindFragmentById instanceof MayaRewardsCatalogFragment ? (MayaRewardsCatalogFragment) fragmentFindFragmentById : null;
            if (mayaRewardsCatalogFragment != null) {
                mayaRewardsCatalogFragment.G1().q();
            }
        }
        if (S5.c.b(this.f188o, A5.b.g1)) {
            MayaWalletFragment mayaWalletFragment2 = (MayaWalletFragment) ((F7.s) this.c.get());
            BannerAdCarousel bannerAdCarousel = mayaWalletFragment2.f12242h1;
            if (bannerAdCarousel == null) {
                kotlin.jvm.internal.j.n("mViewBannerAdCarousel");
                throw null;
            }
            f5.f fVar = new f5.f(bannerAdCarousel);
            fVar.f16717b = s5.d.f20007a;
            LifecycleOwner viewLifecycleOwner = mayaWalletFragment2.getViewLifecycleOwner();
            kotlin.jvm.internal.j.f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            fVar.c = viewLifecycleOwner;
            fVar.e = mayaWalletFragment2;
            FragmentActivity fragmentActivityRequireActivity = mayaWalletFragment2.requireActivity();
            kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
            fVar.f16718d = fragmentActivityRequireActivity;
            fVar.h = Integer.valueOf(bannerAdCarousel.getResources().getDimensionPixelSize(R.dimen.maya_margin_24));
            fVar.j = new Ag.a(29);
            fVar.f16720k = new F(0);
            fVar.f16721l = new C0165x(10);
            fVar.a();
        }
    }

    public final void n() {
        if (this.h.f11330b.getBoolean("key_is_show_current_balance", true)) {
            MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) ((F7.s) this.c.get());
            ImageView imageView = mayaWalletFragment.w0;
            if (imageView == null) {
                kotlin.jvm.internal.j.n("mImageViewShowHideBalance");
                throw null;
            }
            imageView.setImageDrawable(ContextCompat.getDrawable(mayaWalletFragment.requireActivity(), R.drawable.maya_ic_eye_show_toggle));
            ((MayaWalletFragment) ((F7.s) this.c.get())).c2();
            return;
        }
        MayaWalletFragment mayaWalletFragment2 = (MayaWalletFragment) ((F7.s) this.c.get());
        ImageView imageView2 = mayaWalletFragment2.w0;
        if (imageView2 == null) {
            kotlin.jvm.internal.j.n("mImageViewShowHideBalance");
            throw null;
        }
        imageView2.setImageDrawable(ContextCompat.getDrawable(mayaWalletFragment2.requireActivity(), R.drawable.maya_ic_eye_hide_toggle));
        ((MayaWalletFragment) ((F7.s) this.c.get())).S1();
    }

    public final void o() {
        G7.G g8;
        if (kotlin.jvm.internal.j.b(svM7M6.getString(this.h.f11330b, "key_edd_status", ""), "for_submission") && this.h.e().isEDDEnabled() && (g8 = ((MayaWalletFragment) ((F7.s) this.c.get())).f12245k1) != null) {
            MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) g8;
            mayaDashboardActivity.finish();
            mayaDashboardActivity.n1();
            Intent intent = new Intent(mayaDashboardActivity, (Class<?>) EDDActivity.class);
            intent.addFlags(131072);
            mayaDashboardActivity.startActivity(intent);
        }
    }

    public final void q(PayMayaError payMayaError) {
        ((MayaBaseFragment) ((F7.s) this.c.get())).w1();
        if (payMayaError.isSessionTimeout()) {
            return;
        }
        MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) ((F7.s) this.c.get());
        mayaWalletFragment.getClass();
        G7.G g8 = mayaWalletFragment.f12245k1;
        if (g8 != null) {
            ((MayaDashboardActivity) g8).l2(payMayaError);
        }
    }

    public final void r() {
        if (this.h.L()) {
            FrameLayout frameLayout = ((MayaWalletFragment) ((F7.s) this.c.get())).f12227Q0;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.j.n("mXPWalletFlutterWidgetContainer");
                throw null;
            }
        }
        FrameLayout frameLayout2 = ((MayaWalletFragment) ((F7.s) this.c.get())).f12227Q0;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        } else {
            kotlin.jvm.internal.j.n("mXPWalletFlutterWidgetContainer");
            throw null;
        }
    }
}
