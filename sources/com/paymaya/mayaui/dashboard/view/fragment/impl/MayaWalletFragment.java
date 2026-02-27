package com.paymaya.mayaui.dashboard.view.fragment.impl;

import A7.A;
import A7.x;
import A7.y;
import Ah.p;
import Bj.C0165x;
import D7.a;
import D7.b;
import D7.c;
import F7.s;
import G6.r;
import G7.E;
import G7.F;
import G7.G;
import G7.H;
import G7.t;
import J7.e;
import Lh.f;
import Lh.h;
import N5.A1;
import N5.C0435a;
import N5.C0441c;
import N5.C0443c1;
import N5.C0446d1;
import N5.C0449e1;
import N5.C0491z;
import N5.G0;
import N5.I;
import N5.M0;
import Uh.d;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.common.widget.TextViewWithImagesKt;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.data.database.repository.C1239c;
import com.paymaya.domain.model.FeatureDynamicStatus;
import com.paymaya.domain.model.Recommendation;
import com.paymaya.domain.model.SecondaryFeature;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.B0;
import com.paymaya.domain.store.M;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.ui.dashboard.view.widget.DashboardLayoutManager;
import io.flutter.embedding.android.FlutterFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import k2.v0;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import m5.C1847a;
import n5.C1928e;
import pg.u;
import retrofit2.Response;
import v.AbstractC2329d;
import y5.AbstractC2509a;
import z7.InterfaceC2555b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaWalletFragment extends MayaBaseLoadingFragment implements s, b {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public C0491z f12213A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public TextView f12214B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public TextView f12215C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public RecyclerView f12216D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public Group f12217E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public Button f12218F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public G0 f12219G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public C0435a f12220H0;
    public C0446d1 I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public View f12221J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public View f12222K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public C0443c1 f12223L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public TextView f12224M0;
    public LottieAnimationView N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public C0449e1 f12225O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public HtmlTextView f12226P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public FrameLayout f12227Q0;
    public H R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public FlutterFragment f12228S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public TextViewWithImagesKt f12229T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public C0435a f12230U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public TextView f12231V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public AppCompatTextView f12232W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public ImageView f12233X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public A1 f12234Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public Group f12235Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public ConstraintLayout f12236a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public Button f12237b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public AppCompatTextView f12238c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public AppCompatTextView f12239d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public AppCompatTextView f12240e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public ImageView f12241f1;
    public FrameLayout g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public BannerAdCarousel f12242h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public M f12243i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public A f12244j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public G f12245k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public a f12246l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public c f12247m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public DashboardLayoutManager f12248n1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public M0 f12249o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SpringView f12251p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ConstraintLayout f12252q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public I f12253r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public C0441c f12254s0;
    public TextView t0;
    public TextView u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public TextView f12255v0;
    public ImageView w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public TextView f12256x0;
    public RecyclerView y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public G0 f12257z0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public final Handler f12250o1 = new Handler(Looper.getMainLooper());
    public final boolean p1 = true;
    public final boolean q1 = true;

    public static final void W1(MayaWalletFragment mayaWalletFragment) {
        A a8 = (A) mayaWalletFragment.P1();
        if (j.b(a8.h.l(), "kyc1")) {
            G g8 = ((MayaWalletFragment) ((s) a8.c.get())).f12245k1;
            if (g8 != null) {
                ((MayaDashboardActivity) g8).s2();
            }
        } else {
            G g10 = ((MayaWalletFragment) ((s) a8.c.get())).f12245k1;
            if (g10 != null) {
                ((MayaDashboardActivity) g10).t2(EnumC1215d.SEND_MONEY, null);
            }
        }
        v0.F(mayaWalletFragment, "send_money", null, 30);
    }

    public static final void Y1(MayaWalletFragment mayaWalletFragment) {
        v0.F(mayaWalletFragment, "show_balance", null, 30);
        A a8 = (A) mayaWalletFragment.P1();
        if (a8.h.f11330b.getBoolean("key_is_show_current_balance", true)) {
            androidx.camera.core.impl.a.A(a8.h.f11330b, "key_is_show_current_balance", false);
            MayaWalletFragment mayaWalletFragment2 = (MayaWalletFragment) ((s) a8.c.get());
            ImageView imageView = mayaWalletFragment2.w0;
            if (imageView == null) {
                j.n("mImageViewShowHideBalance");
                throw null;
            }
            imageView.setImageDrawable(ContextCompat.getDrawable(mayaWalletFragment2.requireActivity(), R.drawable.maya_ic_eye_hide_toggle));
            ((MayaWalletFragment) ((s) a8.c.get())).S1();
            MayaWalletFragment mayaWalletFragment3 = (MayaWalletFragment) ((s) a8.c.get());
            mayaWalletFragment3.getClass();
            C1219h c1219h = new C1219h();
            c1219h.n(17);
            c1219h.t(EnumC1217f.HIDE_BALANCE);
            c1219h.i();
            mayaWalletFragment3.A1(c1219h);
            return;
        }
        androidx.camera.core.impl.a.A(a8.h.f11330b, "key_is_show_current_balance", true);
        MayaWalletFragment mayaWalletFragment4 = (MayaWalletFragment) ((s) a8.c.get());
        ImageView imageView2 = mayaWalletFragment4.w0;
        if (imageView2 == null) {
            j.n("mImageViewShowHideBalance");
            throw null;
        }
        imageView2.setImageDrawable(ContextCompat.getDrawable(mayaWalletFragment4.requireActivity(), R.drawable.maya_ic_eye_show_toggle));
        ((MayaWalletFragment) ((s) a8.c.get())).c2();
        MayaWalletFragment mayaWalletFragment5 = (MayaWalletFragment) ((s) a8.c.get());
        mayaWalletFragment5.getClass();
        C1219h c1219h2 = new C1219h();
        c1219h2.n(17);
        c1219h2.t(EnumC1217f.UNHIDE_BALANCE);
        c1219h2.i();
        mayaWalletFragment5.A1(c1219h2);
    }

    public static final void Z1(MayaWalletFragment mayaWalletFragment, Recommendation recommendation) {
        InterfaceC2555b interfaceC2555bP1 = mayaWalletFragment.P1();
        String applicationUri = recommendation.getApplicationUri();
        G g8 = ((MayaWalletFragment) ((s) ((A) interfaceC2555bP1).c.get())).f12245k1;
        if (g8 != null) {
            MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) g8;
            mayaDashboardActivity.getIntent().setData(Uri.parse(applicationUri));
            mayaDashboardActivity.Y1().l(applicationUri);
        }
        C1220i c1220iO1 = mayaWalletFragment.o1();
        FragmentActivity activity = mayaWalletFragment.getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.ACTION_CARD);
        c1219hD.n(17);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put("action_card", recommendation.getId());
        c1219hD.i();
        c1220iO1.c(activity, c1219hD);
    }

    public static final void d2(MayaWalletFragment mayaWalletFragment) {
        A a8 = (A) mayaWalletFragment.P1();
        ((MayaWalletFragment) ((s) a8.c.get())).L1();
        if (a8.f183d.b() == null) {
            MayaWalletFragment mayaWalletFragment2 = (MayaWalletFragment) ((s) a8.c.get());
            TextView textView = mayaWalletFragment2.u0;
            if (textView == null) {
                j.n("mTextViewBalance");
                throw null;
            }
            textView.setVisibility(8);
            TextView textView2 = mayaWalletFragment2.f12255v0;
            if (textView2 == null) {
                j.n("mTextViewMaskedBalance");
                throw null;
            }
            textView2.setVisibility(8);
            G0 g02 = ((MayaWalletFragment) ((s) a8.c.get())).f12257z0;
            if (g02 == null) {
                j.n("mViewLoadingBalanceV2");
                throw null;
            }
            g02.f3627b.setVisibility(0);
        }
        MayaWalletFragment mayaWalletFragment3 = (MayaWalletFragment) ((s) a8.c.get());
        TextView textView3 = mayaWalletFragment3.f12214B0;
        if (textView3 == null) {
            j.n("mTextViewTransactionLabel");
            throw null;
        }
        textView3.setVisibility(8);
        RecyclerView recyclerView = mayaWalletFragment3.f12216D0;
        if (recyclerView == null) {
            j.n("mRecyclerViewActivityList");
            throw null;
        }
        recyclerView.setVisibility(8);
        ((MayaWalletFragment) ((s) a8.c.get())).U1();
        ((MayaWalletFragment) ((s) a8.c.get())).V1();
        ((MayaWalletFragment) ((s) a8.c.get())).b2();
        a8.k(false);
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_wallet, viewGroup, false);
        int i = R.id.container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.container);
        if (constraintLayout != null) {
            SpringView springView = (SpringView) viewInflate;
            i = R.id.frame_layout_maya_miles_catalog_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_maya_miles_catalog_container);
            if (frameLayout != null) {
                i = R.id.group_wallet_balance_v2;
                Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_wallet_balance_v2);
                if (group != null) {
                    i = R.id.maya_score_flutter_container;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_score_flutter_container);
                    if (frameLayout2 != null) {
                        i = R.id.scroll_view_container;
                        if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_container)) != null) {
                            i = R.id.view_activity_list;
                            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_activity_list);
                            if (viewFindChildViewById != null) {
                                int i4 = R.id.button_cash_in;
                                Button button = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.button_cash_in);
                                if (button != null) {
                                    i4 = R.id.group_no_activity_list;
                                    Group group2 = (Group) ViewBindings.findChildViewById(viewFindChildViewById, R.id.group_no_activity_list);
                                    if (group2 != null) {
                                        i4 = R.id.recycler_view_user_activity_list;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.recycler_view_user_activity_list);
                                        if (recyclerView != null) {
                                            i4 = R.id.text_view_no_transactions_label;
                                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_no_transactions_label)) != null) {
                                                i4 = R.id.text_view_see_all_label;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_see_all_label);
                                                if (textView != null) {
                                                    i4 = R.id.text_view_transactions_label;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_transactions_label);
                                                    if (textView2 != null) {
                                                        i4 = R.id.view_loading_wallet_activity_list;
                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.view_loading_wallet_activity_list);
                                                        if (viewFindChildViewById2 != null) {
                                                            G0.d(viewFindChildViewById2);
                                                            i4 = R.id.view_loading_wallet_activity_list_v2;
                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.view_loading_wallet_activity_list_v2);
                                                            if (viewFindChildViewById3 != null) {
                                                                C0491z c0491z = new C0491z((ConstraintLayout) viewFindChildViewById, button, group2, recyclerView, textView, textView2, G0.e(viewFindChildViewById3), 20);
                                                                i = R.id.view_ad_banner;
                                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.view_ad_banner);
                                                                if (viewFindChildViewById4 != null) {
                                                                    C0446d1 c0446d1A = C0446d1.a(viewFindChildViewById4);
                                                                    i = R.id.view_bsp_footer;
                                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.view_bsp_footer);
                                                                    if (viewFindChildViewById5 != null) {
                                                                        int i6 = R.id.html_text_view_bsp;
                                                                        HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewFindChildViewById5, R.id.html_text_view_bsp);
                                                                        if (htmlTextView != null) {
                                                                            i6 = R.id.image_view_maya_logo;
                                                                            if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById5, R.id.image_view_maya_logo)) != null) {
                                                                                C0449e1 c0449e1 = new C0449e1((ConstraintLayout) viewFindChildViewById5, htmlTextView, 0);
                                                                                i = R.id.view_error;
                                                                                View viewFindChildViewById6 = ViewBindings.findChildViewById(viewInflate, R.id.view_error);
                                                                                if (viewFindChildViewById6 != null) {
                                                                                    CardView cardView = (CardView) viewFindChildViewById6;
                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById6, R.id.text_view_error);
                                                                                    if (textView3 == null) {
                                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById6.getResources().getResourceName(R.id.text_view_error)));
                                                                                    }
                                                                                    C0443c1 c0443c1 = new C0443c1(cardView, textView3, 1);
                                                                                    i = R.id.view_rewards;
                                                                                    View viewFindChildViewById7 = ViewBindings.findChildViewById(viewInflate, R.id.view_rewards);
                                                                                    if (viewFindChildViewById7 != null) {
                                                                                        int i10 = R.id.button_missions;
                                                                                        View viewFindChildViewById8 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.button_missions);
                                                                                        if (viewFindChildViewById8 != null) {
                                                                                            i10 = R.id.button_vouchers;
                                                                                            View viewFindChildViewById9 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.button_vouchers);
                                                                                            if (viewFindChildViewById9 != null) {
                                                                                                i10 = R.id.card_view_mission;
                                                                                                if (((CardView) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.card_view_mission)) != null) {
                                                                                                    i10 = R.id.card_view_vouchers;
                                                                                                    if (((CardView) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.card_view_vouchers)) != null) {
                                                                                                        i10 = R.id.guideline_center_vertical;
                                                                                                        if (((Guideline) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.guideline_center_vertical)) != null) {
                                                                                                            i10 = R.id.image_view_missions;
                                                                                                            if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.image_view_missions)) != null) {
                                                                                                                i10 = R.id.image_view_vouchers;
                                                                                                                if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.image_view_vouchers)) != null) {
                                                                                                                    i10 = R.id.text_view_get_rewards_label;
                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.text_view_get_rewards_label)) != null) {
                                                                                                                        i10 = R.id.text_view_missions_description_label;
                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.text_view_missions_description_label)) != null) {
                                                                                                                            i10 = R.id.text_view_missions_title_label;
                                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.text_view_missions_title_label)) != null) {
                                                                                                                                i10 = R.id.text_view_vouchers_description_label;
                                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.text_view_vouchers_description_label)) != null) {
                                                                                                                                    i10 = R.id.text_view_vouchers_title_label;
                                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.text_view_vouchers_title_label)) != null) {
                                                                                                                                        i10 = R.id.view_mission_center;
                                                                                                                                        View viewFindChildViewById10 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.view_mission_center);
                                                                                                                                        if (viewFindChildViewById10 != null) {
                                                                                                                                            i10 = R.id.view_text_end;
                                                                                                                                            View viewFindChildViewById11 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.view_text_end);
                                                                                                                                            if (viewFindChildViewById11 != null) {
                                                                                                                                                i10 = R.id.view_voucher_center;
                                                                                                                                                View viewFindChildViewById12 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.view_voucher_center);
                                                                                                                                                if (viewFindChildViewById12 != null) {
                                                                                                                                                    C0435a c0435a = new C0435a((ConstraintLayout) viewFindChildViewById7, viewFindChildViewById8, viewFindChildViewById9, viewFindChildViewById10, viewFindChildViewById11, viewFindChildViewById12);
                                                                                                                                                    i = R.id.view_wallet_balance;
                                                                                                                                                    View viewFindChildViewById13 = ViewBindings.findChildViewById(viewInflate, R.id.view_wallet_balance);
                                                                                                                                                    if (viewFindChildViewById13 != null) {
                                                                                                                                                        int i11 = R.id.container_constraint_balance;
                                                                                                                                                        if (((ConstraintLayout) ViewBindings.findChildViewById(viewFindChildViewById13, R.id.container_constraint_balance)) != null) {
                                                                                                                                                            i11 = R.id.container_constraint_credit_banner;
                                                                                                                                                            View viewFindChildViewById14 = ViewBindings.findChildViewById(viewFindChildViewById13, R.id.container_constraint_credit_banner);
                                                                                                                                                            if (viewFindChildViewById14 != null) {
                                                                                                                                                                int i12 = R.id.button_dashboard_credit_banner;
                                                                                                                                                                Button button2 = (Button) ViewBindings.findChildViewById(viewFindChildViewById14, R.id.button_dashboard_credit_banner);
                                                                                                                                                                if (button2 != null) {
                                                                                                                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewFindChildViewById14;
                                                                                                                                                                    i12 = R.id.image_view_credit_chevron;
                                                                                                                                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById14, R.id.image_view_credit_chevron);
                                                                                                                                                                    if (imageView != null) {
                                                                                                                                                                        i12 = R.id.text_view_credit_accepted_header_main;
                                                                                                                                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewFindChildViewById14, R.id.text_view_credit_accepted_header_main);
                                                                                                                                                                        if (appCompatTextView != null) {
                                                                                                                                                                            i12 = R.id.text_view_credit_accepted_header_sub;
                                                                                                                                                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(viewFindChildViewById14, R.id.text_view_credit_accepted_header_sub);
                                                                                                                                                                            if (appCompatTextView2 != null) {
                                                                                                                                                                                i12 = R.id.text_view_credit_header_main;
                                                                                                                                                                                if (((AppCompatTextView) ViewBindings.findChildViewById(viewFindChildViewById14, R.id.text_view_credit_header_main)) != null) {
                                                                                                                                                                                    i12 = R.id.text_view_credit_header_sub;
                                                                                                                                                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(viewFindChildViewById14, R.id.text_view_credit_header_sub);
                                                                                                                                                                                    if (appCompatTextView3 != null) {
                                                                                                                                                                                        C0491z c0491z2 = new C0491z((ViewGroup) constraintLayout2, (View) button2, (Object) constraintLayout2, (Object) imageView, (View) appCompatTextView, (View) appCompatTextView2, (View) appCompatTextView3, 24);
                                                                                                                                                                                        i11 = R.id.image_view_show_hide_balance;
                                                                                                                                                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById13, R.id.image_view_show_hide_balance);
                                                                                                                                                                                        if (imageView2 != null) {
                                                                                                                                                                                            i11 = R.id.text_view_balance;
                                                                                                                                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById13, R.id.text_view_balance);
                                                                                                                                                                                            if (textView4 != null) {
                                                                                                                                                                                                i11 = R.id.text_view_currency;
                                                                                                                                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById13, R.id.text_view_currency);
                                                                                                                                                                                                if (textView5 != null) {
                                                                                                                                                                                                    i11 = R.id.text_view_masked_balance;
                                                                                                                                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById13, R.id.text_view_masked_balance);
                                                                                                                                                                                                    if (textView6 != null) {
                                                                                                                                                                                                        i11 = R.id.text_view_wallet_balance_label;
                                                                                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById13, R.id.text_view_wallet_balance_label)) != null) {
                                                                                                                                                                                                            i11 = R.id.text_view_wallet_options;
                                                                                                                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById13, R.id.text_view_wallet_options);
                                                                                                                                                                                                            if (textView7 != null) {
                                                                                                                                                                                                                i11 = R.id.text_view_with_images_cash_in;
                                                                                                                                                                                                                TextViewWithImagesKt textViewWithImagesKt = (TextViewWithImagesKt) ViewBindings.findChildViewById(viewFindChildViewById13, R.id.text_view_with_images_cash_in);
                                                                                                                                                                                                                if (textViewWithImagesKt != null) {
                                                                                                                                                                                                                    i11 = R.id.text_view_with_images_send;
                                                                                                                                                                                                                    TextViewWithImagesKt textViewWithImagesKt2 = (TextViewWithImagesKt) ViewBindings.findChildViewById(viewFindChildViewById13, R.id.text_view_with_images_send);
                                                                                                                                                                                                                    if (textViewWithImagesKt2 != null) {
                                                                                                                                                                                                                        i11 = R.id.view_dashboard_action_card;
                                                                                                                                                                                                                        View viewFindChildViewById15 = ViewBindings.findChildViewById(viewFindChildViewById13, R.id.view_dashboard_action_card);
                                                                                                                                                                                                                        if (viewFindChildViewById15 != null) {
                                                                                                                                                                                                                            int i13 = R.id.group_dashboard_action_card_content;
                                                                                                                                                                                                                            Group group3 = (Group) ViewBindings.findChildViewById(viewFindChildViewById15, R.id.group_dashboard_action_card_content);
                                                                                                                                                                                                                            if (group3 != null) {
                                                                                                                                                                                                                                i13 = R.id.image_view_dashboard_action_card_arrow;
                                                                                                                                                                                                                                if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById15, R.id.image_view_dashboard_action_card_arrow)) != null) {
                                                                                                                                                                                                                                    i13 = R.id.image_view_dashboard_action_card_image;
                                                                                                                                                                                                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById15, R.id.image_view_dashboard_action_card_image);
                                                                                                                                                                                                                                    if (imageView3 != null) {
                                                                                                                                                                                                                                        i13 = R.id.text_view_dashboard_action_card_description;
                                                                                                                                                                                                                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(viewFindChildViewById15, R.id.text_view_dashboard_action_card_description);
                                                                                                                                                                                                                                        if (appCompatTextView4 != null) {
                                                                                                                                                                                                                                            i13 = R.id.text_view_dashboard_action_card_header;
                                                                                                                                                                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById15, R.id.text_view_dashboard_action_card_header);
                                                                                                                                                                                                                                            if (textView8 != null) {
                                                                                                                                                                                                                                                CardView cardView2 = (CardView) viewFindChildViewById15;
                                                                                                                                                                                                                                                i13 = R.id.view_dashboard_action_card_shimmer;
                                                                                                                                                                                                                                                View viewFindChildViewById16 = ViewBindings.findChildViewById(viewFindChildViewById15, R.id.view_dashboard_action_card_shimmer);
                                                                                                                                                                                                                                                if (viewFindChildViewById16 != null) {
                                                                                                                                                                                                                                                    C0435a c0435a2 = new C0435a(cardView2, group3, imageView3, appCompatTextView4, textView8, new A1((CardView) viewFindChildViewById16, 2));
                                                                                                                                                                                                                                                    i11 = R.id.view_loading_wallet_balance;
                                                                                                                                                                                                                                                    View viewFindChildViewById17 = ViewBindings.findChildViewById(viewFindChildViewById13, R.id.view_loading_wallet_balance);
                                                                                                                                                                                                                                                    if (viewFindChildViewById17 != null) {
                                                                                                                                                                                                                                                        View viewFindChildViewById18 = ViewBindings.findChildViewById(viewFindChildViewById17, R.id.lottie_animation_balance_loading);
                                                                                                                                                                                                                                                        if (viewFindChildViewById18 == null) {
                                                                                                                                                                                                                                                            throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById17.getResources().getResourceName(R.id.lottie_animation_balance_loading)));
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        I i14 = new I((ConstraintLayout) viewFindChildViewById13, c0491z2, imageView2, textView4, textView5, textView6, textView7, textViewWithImagesKt, textViewWithImagesKt2, c0435a2, new G0((ConstraintLayout) viewFindChildViewById17, 15), 7);
                                                                                                                                                                                                                                                        i = R.id.view_wallet_services;
                                                                                                                                                                                                                                                        View viewFindChildViewById19 = ViewBindings.findChildViewById(viewInflate, R.id.view_wallet_services);
                                                                                                                                                                                                                                                        if (viewFindChildViewById19 != null) {
                                                                                                                                                                                                                                                            RecyclerView recyclerView2 = (RecyclerView) viewFindChildViewById19;
                                                                                                                                                                                                                                                            this.f12249o0 = new M0(springView, constraintLayout, springView, frameLayout, group, frameLayout2, c0491z, c0446d1A, c0449e1, c0443c1, c0435a, i14, new C0441c(recyclerView2, recyclerView2, 15));
                                                                                                                                                                                                                                                            j.f(springView, "getRoot(...)");
                                                                                                                                                                                                                                                            return springView;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById15.getResources().getResourceName(i13)));
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
                                                                                                                                                                throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById14.getResources().getResourceName(i12)));
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById13.getResources().getResourceName(i11)));
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
                                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById7.getResources().getResourceName(i10)));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById5.getResources().getResourceName(i6)));
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
                                throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_error_dashboard, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading_dashboard, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // D7.b
    public final void M(SecondaryFeature secondaryFeature, int i) {
        String status;
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.TILE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("tile", secondaryFeature.mId());
        FeatureDynamicStatus featureDynamicStatusMFeatureDynamicStatus = secondaryFeature.mFeatureDynamicStatus();
        if (featureDynamicStatusMFeatureDynamicStatus == null || (status = featureDynamicStatusMFeatureDynamicStatus.getStatus()) == null) {
            status = "empty";
        }
        c1219hH.j.put("status", status);
        z1(c1219hH);
        G g8 = this.f12245k1;
        if (g8 != null) {
            ((MayaDashboardActivity) g8).e2(secondaryFeature);
        }
    }

    public final InterfaceC2555b P1() {
        A a8 = this.f12244j1;
        if (a8 != null) {
            return a8;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    public final void Q1() {
        C0435a c0435a = this.f12230U0;
        if (c0435a != null) {
            ((CardView) c0435a.f4047b).setVisibility(8);
        } else {
            j.n("mViewActionCard");
            throw null;
        }
    }

    public final void R1() {
        TextView textView = this.f12214B0;
        if (textView == null) {
            j.n("mTextViewTransactionLabel");
            throw null;
        }
        textView.setVisibility(8);
        G0 g02 = this.f12219G0;
        if (g02 != null) {
            g02.f3627b.setVisibility(8);
        } else {
            j.n("mViewLoadingActivityListV2");
            throw null;
        }
    }

    public final void S1() {
        a aVar = this.f12246l1;
        if (aVar != null) {
            aVar.f988d = false;
            aVar.notifyDataSetChanged();
        }
        TextView textView = this.u0;
        if (textView == null) {
            j.n("mTextViewBalance");
            throw null;
        }
        textView.setVisibility(8);
        TextView textView2 = this.f12255v0;
        if (textView2 != null) {
            textView2.setVisibility(0);
        } else {
            j.n("mTextViewMaskedBalance");
            throw null;
        }
    }

    public final void T1() {
        ConstraintLayout constraintLayout = this.f12236a1;
        if (constraintLayout == null) {
            j.n("mConstraintLayoutCreditBanner");
            throw null;
        }
        constraintLayout.setVisibility(8);
        Button button = this.f12237b1;
        if (button == null) {
            j.n("mButtonCreditBanner");
            throw null;
        }
        button.setVisibility(8);
        AppCompatTextView appCompatTextView = this.f12239d1;
        if (appCompatTextView == null) {
            j.n("mTextViewCreditHeaderMain");
            throw null;
        }
        appCompatTextView.setVisibility(8);
        AppCompatTextView appCompatTextView2 = this.f12240e1;
        if (appCompatTextView2 == null) {
            j.n("mTextViewCreditHeaderSub");
            throw null;
        }
        appCompatTextView2.setVisibility(8);
        ImageView imageView = this.f12241f1;
        if (imageView != null) {
            imageView.setVisibility(8);
        } else {
            j.n("mImageViewCreditChevron");
            throw null;
        }
    }

    public final void U1() {
        TextView textView = this.f12214B0;
        if (textView == null) {
            j.n("mTextViewTransactionLabel");
            throw null;
        }
        textView.setVisibility(8);
        Group group = this.f12217E0;
        if (group != null) {
            group.setVisibility(8);
        } else {
            j.n("mGroupNoActivityList");
            throw null;
        }
    }

    public final void V1() {
        TextView textView = this.f12215C0;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            j.n("mTextViewSeeAll");
            throw null;
        }
    }

    public final void X1(String str, Map map) {
        C1220i c1220iO1 = o1();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        C1219h c1219hE = C1219h.e(str);
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            c1219hE.h((String) entry.getKey(), (String) entry.getValue());
        }
        Unit unit = Unit.f18162a;
        c1220iO1.c(fragmentActivityRequireActivity, c1219hE);
    }

    public final void a2(UserActivity activity) {
        j.g(activity, "activity");
        G g8 = this.f12245k1;
        if (g8 != null) {
            ((MayaDashboardActivity) g8).i2(activity, null);
        }
    }

    public final void b2() {
        TextView textView = this.f12214B0;
        if (textView == null) {
            j.n("mTextViewTransactionLabel");
            throw null;
        }
        textView.setVisibility(8);
        G0 g02 = this.f12219G0;
        if (g02 != null) {
            g02.f3627b.setVisibility(0);
        } else {
            j.n("mViewLoadingActivityListV2");
            throw null;
        }
    }

    public final void c2() {
        a aVar = this.f12246l1;
        if (aVar != null) {
            aVar.f988d = true;
            aVar.notifyDataSetChanged();
        }
        TextView textView = this.u0;
        if (textView == null) {
            j.n("mTextViewBalance");
            throw null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.f12255v0;
        if (textView2 != null) {
            textView2.setVisibility(8);
        } else {
            j.n("mTextViewMaskedBalance");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        O5.a aVar = (O5.a) W4.a.e().b().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f12244j1 = new A(aVar.a(), aVar.V(), aVar.J(), aVar.g(), (com.paymaya.data.preference.a) aVar.e.get(), aVar.O(), aVar.o(), aVar.n(), aVar.U(), new B0((PayMayaClientApi) aVar.f4745w.get(), (C1239c) aVar.f4734p0.get(), (com.paymaya.data.preference.a) aVar.e.get()), aVar.A(), (S5.c) aVar.f4724k.get(), (d) aVar.f4748y.get());
        super.onAttach(context);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12245k1 = (G) getActivity();
        ((AbstractC2509a) P1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f12250o1.removeCallbacksAndMessages(null);
        ((AbstractC2509a) P1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        u uVar;
        FlutterFragment flutterFragment = this.f12228S0;
        if (flutterFragment != null && flutterFragment.isAdded()) {
            getChildFragmentManager().beginTransaction().remove(flutterFragment).commitAllowingStateLoss();
        }
        this.f12228S0 = null;
        H h = this.R0;
        if (h != null) {
            try {
                if (j.b(H.i, h.f1830g) && (uVar = h.h) != null) {
                    uVar.b(null);
                    H.i = null;
                }
            } catch (Exception unused) {
                yk.a.d();
            }
        }
        this.R0 = null;
        BannerAdCarousel bannerAdCarousel = this.f12242h1;
        if (bannerAdCarousel == null) {
            j.n("mViewBannerAdCarousel");
            throw null;
        }
        bannerAdCarousel.c();
        M m = this.f12243i1;
        if (m != null) {
            C1928e c1928e = ((C1847a) m.f11371b).j;
            if (c1928e != null) {
                Bj.B0 b02 = c1928e.f;
                if (b02 != null) {
                    b02.b(null);
                }
                NativeCustomFormatAd nativeCustomFormatAd = c1928e.f18624g;
                if (nativeCustomFormatAd != null) {
                    nativeCustomFormatAd.destroy();
                }
                c1928e.f18624g = null;
            }
            this.f12243i1 = null;
        }
        super.onDestroyView();
        this.f12249o0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f12245k1 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        y1();
        this.f10338R = false;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2;
        int i4 = 0;
        super.onResume();
        this.f10338R = true;
        F1();
        C1219h c1219hM1 = m1();
        c1219hM1.n(9);
        c1219hM1.t(EnumC1217f.SCREEN);
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("attribution", n1().f10371a);
        z1(c1219h);
        G g8 = this.f12245k1;
        if (g8 != null) {
            ((MayaDashboardActivity) g8).Q(this);
        }
        ((A) P1()).m(false);
        A a8 = (A) P1();
        if (S5.c.b(a8.f188o, A5.b.f98d)) {
            B0 b02 = a8.m;
            p<Response<Void>> actionCardRecommendationsHead = b02.f11338b.getActionCardRecommendationsHead();
            A0 a02 = new A0(b02, i4);
            actionCardRecommendationsHead.getClass();
            a8.e(new Lh.d(new Lh.d(new h(new f(actionCardRecommendationsHead, a02, i4), zh.b.a(), 0), new x(a8, i4), i), new y(a8, 0), i4).e());
        }
        A a10 = (A) P1();
        if (S5.c.b(a10.f188o, A5.b.g1)) {
            MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) ((s) a10.c.get());
            if (mayaWalletFragment.f12243i1 == null) {
                M m = new M(mayaWalletFragment, s5.f.f20013a);
                F f = new F(1);
                C1847a c1847a = (C1847a) m.f11371b;
                c1847a.f17717d = f;
                c1847a.e = new F(2);
                c1847a.f = new C0165x(11);
                mayaWalletFragment.f12243i1 = m;
            }
            M m2 = mayaWalletFragment.f12243i1;
            if (m2 != null) {
                m2.j();
            }
        }
        s1().f("ttd");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        M0 m0 = this.f12249o0;
        j.d(m0);
        this.f12251p0 = (SpringView) m0.e;
        M0 m02 = this.f12249o0;
        j.d(m02);
        this.f12252q0 = m02.f3767b;
        M0 m03 = this.f12249o0;
        j.d(m03);
        C0491z c0491z = (C0491z) m03.h;
        this.f12213A0 = c0491z;
        this.f12214B0 = (TextView) c0491z.h;
        this.f12215C0 = (TextView) c0491z.f4304d;
        this.f12216D0 = (RecyclerView) c0491z.f;
        this.f12217E0 = (Group) c0491z.e;
        this.f12218F0 = (Button) c0491z.c;
        M0 m04 = this.f12249o0;
        j.d(m04);
        C0443c1 c0443c1 = (C0443c1) m04.f3770k;
        this.f12223L0 = c0443c1;
        this.f12224M0 = c0443c1.c;
        M0 m05 = this.f12249o0;
        j.d(m05);
        C0449e1 c0449e1 = (C0449e1) m05.j;
        this.f12225O0 = c0449e1;
        this.f12226P0 = c0449e1.c;
        M0 m06 = this.f12249o0;
        j.d(m06);
        C0446d1 c0446d1 = (C0446d1) m06.i;
        this.I0 = c0446d1;
        this.f12242h1 = c0446d1.c;
        M0 m07 = this.f12249o0;
        j.d(m07);
        this.f12227Q0 = (FrameLayout) m07.f3769g;
        M0 m08 = this.f12249o0;
        j.d(m08);
        this.g1 = (FrameLayout) m08.f;
        M0 m09 = this.f12249o0;
        j.d(m09);
        C0435a c0435a = (C0435a) m09.f3771l;
        this.f12220H0 = c0435a;
        this.f12221J0 = c0435a.f;
        this.f12222K0 = (View) c0435a.f4049g;
        SpringView springView = this.f12251p0;
        if (springView == null) {
            j.n("mDashboardSwipeRefreshLayout");
            throw null;
        }
        springView.setHeader(new e());
        SpringView springView2 = this.f12251p0;
        if (springView2 == null) {
            j.n("mDashboardSwipeRefreshLayout");
            throw null;
        }
        View viewFindViewById = springView2.getHeaderView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.N0 = (LottieAnimationView) viewFindViewById;
        SpringView springView3 = this.f12251p0;
        if (springView3 == null) {
            j.n("mDashboardSwipeRefreshLayout");
            throw null;
        }
        springView3.setListener(new r(this, 3));
        this.f12248n1 = new DashboardLayoutManager(getActivity(), 1, false);
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        this.f12246l1 = new a(contextRequireContext, this);
        RecyclerView recyclerView = this.f12216D0;
        if (recyclerView == null) {
            j.n("mRecyclerViewActivityList");
            throw null;
        }
        recyclerView.setLayoutManager(this.f12248n1);
        RecyclerView recyclerView2 = this.f12216D0;
        if (recyclerView2 == null) {
            j.n("mRecyclerViewActivityList");
            throw null;
        }
        ViewCompat.setNestedScrollingEnabled(recyclerView2, true);
        RecyclerView recyclerView3 = this.f12216D0;
        if (recyclerView3 == null) {
            j.n("mRecyclerViewActivityList");
            throw null;
        }
        recyclerView3.setAdapter(this.f12246l1);
        ((A) P1()).j();
        ImageView imageView = this.w0;
        if (imageView == null) {
            j.n("mImageViewShowHideBalance");
            throw null;
        }
        imageView.setOnClickListener(new E(this, 2));
        TextView textView = this.f12256x0;
        if (textView == null) {
            j.n("mTextViewViewWalletOptions");
            throw null;
        }
        textView.setOnClickListener(new E(this, 3));
        TextView textView2 = this.f12215C0;
        if (textView2 == null) {
            j.n("mTextViewSeeAll");
            throw null;
        }
        textView2.setOnClickListener(new E(this, 4));
        Button button = this.f12218F0;
        if (button == null) {
            j.n("mButtonCashIn");
            throw null;
        }
        button.setOnClickListener(new E(this, 5));
        HtmlTextView htmlTextView = this.f12226P0;
        if (htmlTextView == null) {
            j.n("mHtmlTextViewBsp");
            throw null;
        }
        htmlTextView.setOnLinkClickListener(new t(this, 1));
        View view2 = this.f12221J0;
        if (view2 == null) {
            j.n("mViewMissions");
            throw null;
        }
        view2.setOnClickListener(new E(this, 6));
        View view3 = this.f12222K0;
        if (view3 == null) {
            j.n("mViewVouchers");
            throw null;
        }
        view3.setOnClickListener(new E(this, 7));
        HtmlTextView htmlTextView2 = this.f12226P0;
        if (htmlTextView2 != null) {
            htmlTextView2.setTextHTML(getString(R.string.maya_label_bsp_footer_with_hotline_message));
        } else {
            j.n("mHtmlTextViewBsp");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean p1() {
        return this.p1;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean r1() {
        return this.q1;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.WALLET;
    }
}
