package com.paymaya.mayaui.cashin.view.fragment.impl;

import B5.i;
import Bj.C0165x;
import D.C0187u;
import G6.n;
import G6.p;
import G7.F;
import I6.c;
import J6.e;
import J6.f;
import K6.h;
import L6.q;
import Lh.d;
import N5.C0446d1;
import N5.C0453g;
import N5.C0462k;
import N5.F0;
import N5.M;
import a7.EnumC0650k;
import a7.InterfaceC0641b;
import a7.InterfaceC0643d;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import bg.AbstractC0983W;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1233w;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.data.api.ConfigApi;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.data.database.repository.v;
import com.paymaya.data.preference.a;
import com.paymaya.domain.model.ClevertapAd;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.domain.store.C1262h0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInFragment;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import d4.AbstractC1331a;
import defpackage.AbstractC1414e;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;
import w.C2360b;
import y5.s;
import zh.b;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaCashInFragment extends MayaBaseLoadingFragment implements h, InterfaceC0641b, InterfaceC0643d {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public Button f11684A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public View f11685B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public BannerAdCarousel f11686C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f11687D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public p f11688E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public C0187u f11689F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public q f11690G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public f f11691H0;
    public GridLayoutManager I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public boolean f11692J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public String f11693K0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public M f11694o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public MayaCarousel f11695p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AppCompatTextView f11696q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public AppCompatTextView f11697r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public View f11698s0;
    public AppCompatTextView t0;
    public AppCompatTextView u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public RecyclerView f11699v0;
    public C0462k w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public F0 f11700x0;
    public TextView y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public TextView f11701z0;

    public static final void S1(MayaCashInFragment mayaCashInFragment) {
        String strMName;
        p pVarP1 = mayaCashInFragment.P1();
        if (((a) pVarP1.e).e().isAppEventsV2CashInEnabled()) {
            LoadUpPartner loadUpPartner = (LoadUpPartner) pVarP1.i;
            if (loadUpPartner != null && (strMName = loadUpPartner.mName()) != null) {
                pVarP1.p(strMName);
            }
        } else {
            s sVar = (h) pVarP1.c.get();
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.PARTNER);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            LoadUpPartner loadUpPartner2 = (LoadUpPartner) pVarP1.i;
            c1219hH.j.put("partner", loadUpPartner2 != null ? loadUpPartner2.mName() : null);
            c1219hH.j.put("location", "recommended");
            ((MayaBaseFragment) sVar).A1(c1219hH);
        }
        p pVarP12 = mayaCashInFragment.P1();
        if (!pVarP12.f || ((LoadUpPartner) pVarP12.i) == null) {
            return;
        }
        ((MayaBaseFragment) ((h) pVarP12.c.get())).E1();
        C1262h0 c1262h0 = (C1262h0) pVarP12.f1808g;
        LoadUpPartner loadUpPartner3 = (LoadUpPartner) pVarP12.i;
        Ah.p pVarA = c1262h0.a(loadUpPartner3 != null ? loadUpPartner3.mId() : null);
        new d(new d(AbstractC1331a.l(pVarA, pVarA, b.a()), new C2360b(pVarP12, 27), 2), new n(pVarP12, 1), 0).e();
    }

    public static final void T1(MayaCashInFragment mayaCashInFragment) {
        p pVarP1 = mayaCashInFragment.P1();
        if (((a) pVarP1.e).e().isAppEventsV2CashInEnabled()) {
            pVarP1.p("Debit or Credit Card");
        } else {
            s sVar = (h) pVarP1.c.get();
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.CARD_OPTION);
            ((MayaBaseFragment) sVar).A1(c1219hH);
        }
        mayaCashInFragment.P1().m();
    }

    public static final void U1(MayaCashInFragment mayaCashInFragment) {
        p pVarP1 = mayaCashInFragment.P1();
        if (((a) pVarP1.e).e().isAppEventsV2CashInEnabled()) {
            pVarP1.p("Maya Savings");
        } else {
            s sVar = (h) pVarP1.c.get();
            C1219h c1219h = new C1219h();
            c1219h.p(EnumC1215d.CASH_IN);
            AbstractC1414e.m(c1219h, EnumC1216e.MAYA_SAVINGS, 17);
            ((MayaBaseFragment) sVar).z1(c1219h);
        }
        q qVar = mayaCashInFragment.f11690G0;
        if (qVar != null) {
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) qVar;
            mayaCashInActivity.n1();
            i.k(mayaCashInActivity, "paymaya://saving_to_wallet");
        }
    }

    @Override // ad.InterfaceC0684a
    public final void B0(HashMap map) {
        AbstractC0983W.u(this, map);
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_cash_in, viewGroup, false);
        int i = R.id.card_view_popular_methods;
        if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_popular_methods)) != null) {
            i = R.id.carousel;
            MayaCarousel mayaCarousel = (MayaCarousel) ViewBindings.findChildViewById(viewInflate, R.id.carousel);
            if (mayaCarousel != null) {
                i = R.id.image_view_account_limits_image;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_account_limits_image)) != null) {
                    NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                    i = R.id.text_view_account_limits_description;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_account_limits_description)) != null) {
                        i = R.id.text_view_account_limits_title;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_account_limits_title)) != null) {
                            i = R.id.text_view_bank_account_option_title;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_bank_account_option_title);
                            if (appCompatTextView != null) {
                                i = R.id.text_view_debit_credit_card_option_title;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_debit_credit_card_option_title);
                                if (appCompatTextView2 != null) {
                                    i = R.id.text_view_maya_savings;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_maya_savings);
                                    if (appCompatTextView3 != null) {
                                        i = R.id.text_view_padala_agents_option_title;
                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_padala_agents_option_title);
                                        if (appCompatTextView4 != null) {
                                            i = R.id.text_view_partners_title;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_partners_title);
                                            if (textView != null) {
                                                i = R.id.text_view_popular_methods_title;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_popular_methods_title)) != null) {
                                                    i = R.id.text_view_view_account_limits;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_view_account_limits)) != null) {
                                                        i = R.id.view_account_limits_container;
                                                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_account_limits_container);
                                                        if (viewFindChildViewById != null) {
                                                            i = R.id.view_account_limits_space;
                                                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_account_limits_space);
                                                            if (viewFindChildViewById2 != null) {
                                                                i = R.id.view_ad_banner;
                                                                View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.view_ad_banner);
                                                                if (viewFindChildViewById3 != null) {
                                                                    C0446d1 c0446d1A = C0446d1.a(viewFindChildViewById3);
                                                                    i = R.id.view_bank_account_option_divider;
                                                                    View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.view_bank_account_option_divider);
                                                                    if (viewFindChildViewById4 != null) {
                                                                        i = R.id.view_cash_in_partners_content;
                                                                        View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.view_cash_in_partners_content);
                                                                        if (viewFindChildViewById5 != null) {
                                                                            int i4 = R.id.recycler_view_partners;
                                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewFindChildViewById5, R.id.recycler_view_partners);
                                                                            if (recyclerView != null) {
                                                                                i4 = R.id.view_error_content;
                                                                                View viewFindChildViewById6 = ViewBindings.findChildViewById(viewFindChildViewById5, R.id.view_error_content);
                                                                                if (viewFindChildViewById6 != null) {
                                                                                    int i6 = R.id.button_retry;
                                                                                    Button button = (Button) ViewBindings.findChildViewById(viewFindChildViewById6, R.id.button_retry);
                                                                                    if (button != null) {
                                                                                        i6 = R.id.image_view_error_image;
                                                                                        if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById6, R.id.image_view_error_image)) != null) {
                                                                                            i6 = R.id.text_view_error_message;
                                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById6, R.id.text_view_error_message);
                                                                                            if (textView2 != null) {
                                                                                                i6 = R.id.text_view_error_title;
                                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById6, R.id.text_view_error_title);
                                                                                                if (textView3 != null) {
                                                                                                    F0 f02 = new F0((ConstraintLayout) viewFindChildViewById6, button, textView2, textView3, 1);
                                                                                                    i4 = R.id.view_loading_content;
                                                                                                    View viewFindChildViewById7 = ViewBindings.findChildViewById(viewFindChildViewById5, R.id.view_loading_content);
                                                                                                    if (viewFindChildViewById7 != null) {
                                                                                                        int i10 = R.id.card_view_partner_1_1_content;
                                                                                                        if (((CardView) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.card_view_partner_1_1_content)) != null) {
                                                                                                            i10 = R.id.card_view_partner_1_2_content;
                                                                                                            if (((CardView) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.card_view_partner_1_2_content)) != null) {
                                                                                                                i10 = R.id.card_view_partner_1_3_content;
                                                                                                                if (((CardView) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.card_view_partner_1_3_content)) != null) {
                                                                                                                    i10 = R.id.card_view_partner_2_1_content;
                                                                                                                    if (((CardView) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.card_view_partner_2_1_content)) != null) {
                                                                                                                        i10 = R.id.card_view_partner_2_2_content;
                                                                                                                        if (((CardView) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.card_view_partner_2_2_content)) != null) {
                                                                                                                            i10 = R.id.card_view_partner_2_3_content;
                                                                                                                            if (((CardView) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.card_view_partner_2_3_content)) != null) {
                                                                                                                                i10 = R.id.card_view_partner_3_1_content;
                                                                                                                                if (((CardView) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.card_view_partner_3_1_content)) != null) {
                                                                                                                                    i10 = R.id.card_view_partner_3_2_content;
                                                                                                                                    if (((CardView) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.card_view_partner_3_2_content)) != null) {
                                                                                                                                        i10 = R.id.card_view_partner_3_3_content;
                                                                                                                                        if (((CardView) ViewBindings.findChildViewById(viewFindChildViewById7, R.id.card_view_partner_3_3_content)) != null) {
                                                                                                                                            i10 = R.id.lottie_animation_partner_image_1_1_content;
                                                                                                                                            View viewFindChildViewById8 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.lottie_animation_partner_image_1_1_content);
                                                                                                                                            if (viewFindChildViewById8 != null) {
                                                                                                                                                i10 = R.id.lottie_animation_partner_image_1_2_content;
                                                                                                                                                View viewFindChildViewById9 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.lottie_animation_partner_image_1_2_content);
                                                                                                                                                if (viewFindChildViewById9 != null) {
                                                                                                                                                    i10 = R.id.lottie_animation_partner_image_1_3_content;
                                                                                                                                                    View viewFindChildViewById10 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.lottie_animation_partner_image_1_3_content);
                                                                                                                                                    if (viewFindChildViewById10 != null) {
                                                                                                                                                        i10 = R.id.lottie_animation_partner_image_2_1_content;
                                                                                                                                                        View viewFindChildViewById11 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.lottie_animation_partner_image_2_1_content);
                                                                                                                                                        if (viewFindChildViewById11 != null) {
                                                                                                                                                            i10 = R.id.lottie_animation_partner_image_2_2_content;
                                                                                                                                                            View viewFindChildViewById12 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.lottie_animation_partner_image_2_2_content);
                                                                                                                                                            if (viewFindChildViewById12 != null) {
                                                                                                                                                                i10 = R.id.lottie_animation_partner_image_2_3_content;
                                                                                                                                                                View viewFindChildViewById13 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.lottie_animation_partner_image_2_3_content);
                                                                                                                                                                if (viewFindChildViewById13 != null) {
                                                                                                                                                                    i10 = R.id.lottie_animation_partner_image_3_1_content;
                                                                                                                                                                    View viewFindChildViewById14 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.lottie_animation_partner_image_3_1_content);
                                                                                                                                                                    if (viewFindChildViewById14 != null) {
                                                                                                                                                                        i10 = R.id.lottie_animation_partner_image_3_2_content;
                                                                                                                                                                        View viewFindChildViewById15 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.lottie_animation_partner_image_3_2_content);
                                                                                                                                                                        if (viewFindChildViewById15 != null) {
                                                                                                                                                                            i10 = R.id.lottie_animation_partner_image_3_3_content;
                                                                                                                                                                            View viewFindChildViewById16 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.lottie_animation_partner_image_3_3_content);
                                                                                                                                                                            if (viewFindChildViewById16 != null) {
                                                                                                                                                                                i10 = R.id.lottie_animation_partner_title_1_1_content;
                                                                                                                                                                                View viewFindChildViewById17 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.lottie_animation_partner_title_1_1_content);
                                                                                                                                                                                if (viewFindChildViewById17 != null) {
                                                                                                                                                                                    i10 = R.id.lottie_animation_partner_title_1_2_content;
                                                                                                                                                                                    View viewFindChildViewById18 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.lottie_animation_partner_title_1_2_content);
                                                                                                                                                                                    if (viewFindChildViewById18 != null) {
                                                                                                                                                                                        i10 = R.id.lottie_animation_partner_title_1_3_content;
                                                                                                                                                                                        View viewFindChildViewById19 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.lottie_animation_partner_title_1_3_content);
                                                                                                                                                                                        if (viewFindChildViewById19 != null) {
                                                                                                                                                                                            i10 = R.id.lottie_animation_partner_title_2_1_content;
                                                                                                                                                                                            View viewFindChildViewById20 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.lottie_animation_partner_title_2_1_content);
                                                                                                                                                                                            if (viewFindChildViewById20 != null) {
                                                                                                                                                                                                i10 = R.id.lottie_animation_partner_title_2_2_content;
                                                                                                                                                                                                View viewFindChildViewById21 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.lottie_animation_partner_title_2_2_content);
                                                                                                                                                                                                if (viewFindChildViewById21 != null) {
                                                                                                                                                                                                    i10 = R.id.lottie_animation_partner_title_2_3_content;
                                                                                                                                                                                                    View viewFindChildViewById22 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.lottie_animation_partner_title_2_3_content);
                                                                                                                                                                                                    if (viewFindChildViewById22 != null) {
                                                                                                                                                                                                        i10 = R.id.lottie_animation_partner_title_3_1_content;
                                                                                                                                                                                                        View viewFindChildViewById23 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.lottie_animation_partner_title_3_1_content);
                                                                                                                                                                                                        if (viewFindChildViewById23 != null) {
                                                                                                                                                                                                            i10 = R.id.lottie_animation_partner_title_3_2_content;
                                                                                                                                                                                                            View viewFindChildViewById24 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.lottie_animation_partner_title_3_2_content);
                                                                                                                                                                                                            if (viewFindChildViewById24 != null) {
                                                                                                                                                                                                                i10 = R.id.lottie_animation_partner_title_3_3_content;
                                                                                                                                                                                                                View viewFindChildViewById25 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.lottie_animation_partner_title_3_3_content);
                                                                                                                                                                                                                if (viewFindChildViewById25 != null) {
                                                                                                                                                                                                                    i10 = R.id.view_partner_1_1_divider;
                                                                                                                                                                                                                    View viewFindChildViewById26 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.view_partner_1_1_divider);
                                                                                                                                                                                                                    if (viewFindChildViewById26 != null) {
                                                                                                                                                                                                                        i10 = R.id.view_partner_1_2_divider;
                                                                                                                                                                                                                        View viewFindChildViewById27 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.view_partner_1_2_divider);
                                                                                                                                                                                                                        if (viewFindChildViewById27 != null) {
                                                                                                                                                                                                                            i10 = R.id.view_partner_1_3_divider;
                                                                                                                                                                                                                            View viewFindChildViewById28 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.view_partner_1_3_divider);
                                                                                                                                                                                                                            if (viewFindChildViewById28 != null) {
                                                                                                                                                                                                                                i10 = R.id.view_partner_2_1_divider;
                                                                                                                                                                                                                                View viewFindChildViewById29 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.view_partner_2_1_divider);
                                                                                                                                                                                                                                if (viewFindChildViewById29 != null) {
                                                                                                                                                                                                                                    i10 = R.id.view_partner_2_2_divider;
                                                                                                                                                                                                                                    View viewFindChildViewById30 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.view_partner_2_2_divider);
                                                                                                                                                                                                                                    if (viewFindChildViewById30 != null) {
                                                                                                                                                                                                                                        i10 = R.id.view_partner_2_3_divider;
                                                                                                                                                                                                                                        View viewFindChildViewById31 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.view_partner_2_3_divider);
                                                                                                                                                                                                                                        if (viewFindChildViewById31 != null) {
                                                                                                                                                                                                                                            i10 = R.id.view_partner_3_1_divider;
                                                                                                                                                                                                                                            View viewFindChildViewById32 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.view_partner_3_1_divider);
                                                                                                                                                                                                                                            if (viewFindChildViewById32 != null) {
                                                                                                                                                                                                                                                i10 = R.id.view_partner_3_2_divider;
                                                                                                                                                                                                                                                View viewFindChildViewById33 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.view_partner_3_2_divider);
                                                                                                                                                                                                                                                if (viewFindChildViewById33 != null) {
                                                                                                                                                                                                                                                    i10 = R.id.view_partner_3_3_divider;
                                                                                                                                                                                                                                                    View viewFindChildViewById34 = ViewBindings.findChildViewById(viewFindChildViewById7, R.id.view_partner_3_3_divider);
                                                                                                                                                                                                                                                    if (viewFindChildViewById34 != null) {
                                                                                                                                                                                                                                                        C0453g c0453g = new C0453g(25, (ConstraintLayout) viewFindChildViewById5, recyclerView, f02, new C0462k((ConstraintLayout) viewFindChildViewById7, viewFindChildViewById26, viewFindChildViewById27, viewFindChildViewById28, viewFindChildViewById29, viewFindChildViewById30, viewFindChildViewById31, viewFindChildViewById32, viewFindChildViewById33, viewFindChildViewById34, 14));
                                                                                                                                                                                                                                                        i = R.id.view_padala_agents_option_divider;
                                                                                                                                                                                                                                                        View viewFindChildViewById35 = ViewBindings.findChildViewById(viewInflate, R.id.view_padala_agents_option_divider);
                                                                                                                                                                                                                                                        if (viewFindChildViewById35 != null) {
                                                                                                                                                                                                                                                            i = R.id.view_savings_divider;
                                                                                                                                                                                                                                                            View viewFindChildViewById36 = ViewBindings.findChildViewById(viewInflate, R.id.view_savings_divider);
                                                                                                                                                                                                                                                            if (viewFindChildViewById36 != null) {
                                                                                                                                                                                                                                                                i = R.id.view_view_account_limits_content;
                                                                                                                                                                                                                                                                View viewFindChildViewById37 = ViewBindings.findChildViewById(viewInflate, R.id.view_view_account_limits_content);
                                                                                                                                                                                                                                                                if (viewFindChildViewById37 != null) {
                                                                                                                                                                                                                                                                    this.f11694o0 = new M(nestedScrollView, mayaCarousel, nestedScrollView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, textView, viewFindChildViewById, viewFindChildViewById2, c0446d1A, viewFindChildViewById4, c0453g, viewFindChildViewById35, viewFindChildViewById36, viewFindChildViewById37);
                                                                                                                                                                                                                                                                    j.f(nestedScrollView, "getRoot(...)");
                                                                                                                                                                                                                                                                    return nestedScrollView;
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
                                                                                    }
                                                                                    throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById6.getResources().getResourceName(i6)));
                                                                                }
                                                                            }
                                                                            throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById5.getResources().getResourceName(i4)));
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
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading_cash_in, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final p P1() {
        p pVar = this.f11688E0;
        if (pVar != null) {
            return pVar;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    public final void Q1() {
        F0 f02 = this.f11700x0;
        if (f02 != null) {
            f02.f3618b.setVisibility(8);
        } else {
            j.n("mViewPartnersError");
            throw null;
        }
    }

    public final void R1() {
        C0462k c0462k = this.w0;
        if (c0462k != null) {
            ((ConstraintLayout) c0462k.f4131b).setVisibility(8);
        } else {
            j.n("mViewPartnersLoading");
            throw null;
        }
    }

    public final void V1() {
        Intent intent;
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("from_deep_link", "true");
        FragmentActivity activity = getActivity();
        if (activity == null || (intent = activity.getIntent()) == null) {
            return;
        }
        intent.setData(null);
    }

    public final void W1(String str) {
        F0 f02 = this.f11700x0;
        if (f02 == null) {
            j.n("mViewPartnersError");
            throw null;
        }
        f02.f3618b.setVisibility(0);
        TextView textView = this.y0;
        if (textView == null) {
            j.n("mTextViewErrorTitle");
            throw null;
        }
        textView.setText(getString(R.string.maya_label_that_didnt_load_right));
        TextView textView2 = this.f11701z0;
        if (textView2 != null) {
            textView2.setText(str);
        } else {
            j.n("mTextViewErrorMessage");
            throw null;
        }
    }

    public final void X1(String str) {
        q qVar = this.f11690G0;
        if (qVar != null) {
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) qVar;
            String string = mayaCashInActivity.getString(R.string.maya_label_upgrade_dialog_title);
            j.f(string, "getString(...)");
            z2.d.n(2131231670, string, mayaCashInActivity.getString(R.string.maya_label_upgrade_dialog_description), new Pair(mayaCashInActivity.getString(R.string.maya_label_upgrade_now), new c(mayaCashInActivity, 0)), new Pair(mayaCashInActivity.getString(R.string.maya_label_maybe_later), new c(mayaCashInActivity, 1)), null, 96).show(mayaCashInActivity.getSupportFragmentManager(), "alert_dialog");
        }
        p pVarP1 = P1();
        if (((a) pVarP1.e).e().isAppEventsV2CashInEnabled()) {
            MayaCashInFragment mayaCashInFragment = (MayaCashInFragment) ((h) pVarP1.c.get());
            mayaCashInFragment.getClass();
            C1219h c1219hE = C1219h.e(AbstractC1213b.r(2));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("cash_in_method", str);
            mayaCashInFragment.o1().b(c1219hE);
        }
    }

    @Override // ad.InterfaceC0684a
    public final void c(int i, String str, String str2) {
        C0187u c0187u = this.f11689F0;
        if (c0187u == null) {
            j.n("mCleverTapAPI");
            throw null;
        }
        c0187u.m(str2);
        p pVarP1 = P1();
        if (C.Y(str)) {
            q qVar = ((MayaCashInFragment) ((h) pVarP1.c.get())).f11690G0;
            if (qVar != null) {
                MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) qVar;
                mayaCashInActivity.n1();
                i.k(mayaCashInActivity, str);
            }
        } else if (str != null) {
            MayaCashInFragment mayaCashInFragment = (MayaCashInFragment) ((h) pVarP1.c.get());
            mayaCashInFragment.getClass();
            q qVar2 = mayaCashInFragment.f11690G0;
            if (qVar2 != null) {
                MayaCashInActivity mayaCashInActivity2 = (MayaCashInActivity) qVar2;
                mayaCashInActivity2.n1().t(mayaCashInActivity2, str);
            }
        }
        p pVarP12 = P1();
        if (((a) pVarP12.e).e().isAppEventsV2CashInEnabled()) {
            MayaCashInFragment mayaCashInFragment2 = (MayaCashInFragment) ((h) pVarP12.c.get());
            mayaCashInFragment2.getClass();
            mayaCashInFragment2.o1().b(C1219h.e(AbstractC1213b.j(3)));
            return;
        }
        s sVar = (h) pVarP12.c.get();
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.BANNER);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put(SessionDescription.ATTR_TYPE, We.s.f(i, "CT"));
        c1219hH.i();
        ((MayaBaseFragment) sVar).A1(c1219hH);
    }

    @Override // a7.InterfaceC0641b
    public final void o0() {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11690G0 = (q) getActivity();
        O5.a aVar = W4.a.e().i().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        a preference = (a) aVar.e.get();
        ConfigApi configApi = (ConfigApi) aVar.f4705b0.get();
        PayMayaClientApi payMayaClientApi = (PayMayaClientApi) aVar.f4745w.get();
        v vVar = (v) aVar.f4676M0.get();
        a aVar2 = (a) aVar.e.get();
        C1262h0 c1262h0 = new C1262h0();
        c1262h0.f11445b = configApi;
        c1262h0.c = payMayaClientApi;
        c1262h0.f11446d = vVar;
        c1262h0.e = aVar2;
        S5.c flagConfigurationService = (S5.c) aVar.f4724k.get();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        j.g(sessionSubject, "sessionSubject");
        this.f11688E0 = new p(preference, c1262h0, flagConfigurationService, sessionSubject);
        this.f11689F0 = (C0187u) aVar.f.get();
        P1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        P1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        BannerAdCarousel bannerAdCarousel = this.f11686C0;
        if (bannerAdCarousel == null) {
            j.n("mViewGoogleAdCarousel");
            throw null;
        }
        bannerAdCarousel.c();
        yk.a.a();
        super.onDestroyView();
        this.f11694o0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        MayaCarousel mayaCarousel = this.f11695p0;
        if (mayaCarousel == null) {
            j.n("mCarousel");
            throw null;
        }
        mayaCarousel.m();
        p pVarP1 = P1();
        String str = this.f11693K0;
        if (((a) pVarP1.e).e().isAppEventsV2CashInEnabled()) {
            MayaCashInFragment mayaCashInFragment = (MayaCashInFragment) ((h) pVarP1.c.get());
            mayaCashInFragment.getClass();
            C1219h c1219hE = C1219h.e(AbstractC1213b.r(6));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            if (str != null) {
                c1219hE.j.put("source_page", str);
            }
            mayaCashInFragment.o1().b(c1219hE);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1219h c1219hH = AbstractC2329d.h(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("attribution", n1().f10371a);
        A1(c1219hH);
        q qVar = this.f11690G0;
        if (qVar != null) {
            ((MayaCashInActivity) qVar).Q(this);
        }
        if (this.f11692J0) {
            MayaCarousel mayaCarousel = this.f11695p0;
            if (mayaCarousel == null) {
                j.n("mCarousel");
                throw null;
            }
            mayaCarousel.setVisibility(0);
            MayaCarousel mayaCarousel2 = this.f11695p0;
            if (mayaCarousel2 == null) {
                j.n("mCarousel");
                throw null;
            }
            mayaCarousel2.k();
        }
        String str = this.f11693K0;
        if (str == null || C2576A.H(str)) {
            q qVar2 = this.f11690G0;
            this.f11693K0 = qVar2 != null ? ((MayaCashInActivity) qVar2).getIntent().getStringExtra("analytics_source_page") : null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        j.d(this.f11694o0);
        M m = this.f11694o0;
        j.d(m);
        this.f11695p0 = (MayaCarousel) m.f3759d;
        M m2 = this.f11694o0;
        j.d(m2);
        this.f11696q0 = (AppCompatTextView) m2.f3760g;
        M m3 = this.f11694o0;
        j.d(m3);
        this.f11697r0 = (AppCompatTextView) m3.h;
        M m6 = this.f11694o0;
        j.d(m6);
        this.f11698s0 = m6.f3762l;
        M m10 = this.f11694o0;
        j.d(m10);
        this.t0 = (AppCompatTextView) m10.e;
        M m11 = this.f11694o0;
        j.d(m11);
        this.u0 = (AppCompatTextView) m11.f;
        M m12 = this.f11694o0;
        j.d(m12);
        C0453g c0453g = (C0453g) m12.f3765p;
        this.f11699v0 = (RecyclerView) c0453g.c;
        this.w0 = (C0462k) c0453g.e;
        F0 f02 = (F0) c0453g.f4095d;
        this.f11700x0 = f02;
        this.y0 = f02.e;
        this.f11701z0 = f02.f3619d;
        this.f11684A0 = f02.c;
        M m13 = this.f11694o0;
        j.d(m13);
        this.f11685B0 = m13.f3763n;
        M m14 = this.f11694o0;
        j.d(m14);
        this.f11686C0 = ((C0446d1) m14.f3764o).c;
        this.f11692J0 = false;
        this.I0 = new GridLayoutManager(getActivity(), 3);
        f fVar = this.f11691H0;
        if (fVar == null) {
            Context contextRequireContext = requireContext();
            j.f(contextRequireContext, "requireContext(...)");
            fVar = new f(contextRequireContext, this);
        }
        this.f11691H0 = fVar;
        RecyclerView recyclerView = this.f11699v0;
        if (recyclerView == null) {
            j.n("mRecyclerViewPartners");
            throw null;
        }
        recyclerView.setAdapter(fVar);
        RecyclerView recyclerView2 = this.f11699v0;
        if (recyclerView2 == null) {
            j.n("mRecyclerViewPartners");
            throw null;
        }
        recyclerView2.setLayoutManager(this.I0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.pma_margin_small);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.pma_margin_medium);
        RecyclerView recyclerView3 = this.f11699v0;
        if (recyclerView3 == null) {
            j.n("mRecyclerViewPartners");
            throw null;
        }
        recyclerView3.addItemDecoration(new e(dimensionPixelSize, dimensionPixelSize2));
        p pVarP1 = P1();
        if (S5.c.b((S5.c) pVarP1.h, A5.b.g1) && S5.c.b((S5.c) pVarP1.h, A5.b.m)) {
            MayaCashInFragment mayaCashInFragment = (MayaCashInFragment) ((h) pVarP1.c.get());
            if (!mayaCashInFragment.f11687D0) {
                MayaCarousel mayaCarousel = mayaCashInFragment.f11695p0;
                if (mayaCarousel == null) {
                    j.n("mCarousel");
                    throw null;
                }
                mayaCarousel.setVisibility(8);
                M m15 = mayaCashInFragment.f11694o0;
                j.d(m15);
                TextView textView = (TextView) m15.f3758b;
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                M m16 = mayaCashInFragment.f11694o0;
                j.d(m16);
                layoutParams2.topToBottom = ((C0446d1) m16.f3764o).f4077b.getId();
                layoutParams2.topToTop = -1;
                textView.setLayoutParams(layoutParams2);
                BannerAdCarousel bannerAdCarousel = mayaCashInFragment.f11686C0;
                if (bannerAdCarousel == null) {
                    j.n("mViewGoogleAdCarousel");
                    throw null;
                }
                f5.f fVar2 = new f5.f(bannerAdCarousel);
                fVar2.f16717b = s5.d.c;
                LifecycleOwner viewLifecycleOwner = mayaCashInFragment.getViewLifecycleOwner();
                j.f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                fVar2.c = viewLifecycleOwner;
                FragmentActivity fragmentActivityRequireActivity = mayaCashInFragment.requireActivity();
                j.f(fragmentActivityRequireActivity, "requireActivity(...)");
                fVar2.f16718d = fragmentActivityRequireActivity;
                fVar2.h = 75;
                fVar2.f16720k = new Ag.d(mayaCashInFragment, 20);
                fVar2.f16721l = new C0165x(17);
                fVar2.j = new F(10);
                fVar2.a();
            }
        } else {
            MayaCashInFragment mayaCashInFragment2 = (MayaCashInFragment) ((h) pVarP1.c.get());
            MayaCarousel mayaCarousel2 = mayaCashInFragment2.f11695p0;
            if (mayaCarousel2 == null) {
                j.n("mCarousel");
                throw null;
            }
            mayaCarousel2.setDividerMode(EnumC0650k.c);
            mayaCarousel2.setAutomaticScrolling(true);
            mayaCarousel2.setEndlessScrolling(true);
            mayaCarousel2.setHideCarouselTitle(true);
            mayaCarousel2.setCarouselListener(mayaCashInFragment2);
            mayaCarousel2.setClevertapAdTextStyle(ClevertapAd.TextStyle.FULL_SIZE_BANNER);
            mayaCarousel2.setFilterAdsByScreen(AbstractC1233w.f11237k);
            OneShotPreDrawListener.add(mayaCarousel2, new S1.v(mayaCarousel2, mayaCashInFragment2, mayaCarousel2));
        }
        AppCompatTextView appCompatTextView = this.f11697r0;
        if (appCompatTextView == null) {
            j.n("mTextViewPadalaAgents");
            throw null;
        }
        final int i = 0;
        appCompatTextView.setOnClickListener(new View.OnClickListener(this) { // from class: L6.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCashInFragment f2842b;

            {
                this.f2842b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaCashInFragment mayaCashInFragment3 = this.f2842b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaCashInFragment.S1(mayaCashInFragment3);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaCashInFragment mayaCashInFragment4 = this.f2842b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInFragment4.P1().p("Bank Account");
                            mayaCashInFragment4.P1().n();
                            return;
                        } finally {
                        }
                    case 2:
                        MayaCashInFragment mayaCashInFragment5 = this.f2842b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaCashInFragment.T1(mayaCashInFragment5);
                            return;
                        } finally {
                        }
                    case 3:
                        MayaCashInFragment mayaCashInFragment6 = this.f2842b;
                        Callback.onClick_enter(view2);
                        try {
                            G6.p pVarP12 = mayaCashInFragment6.P1();
                            if (((com.paymaya.data.preference.a) pVarP12.e).e().isAppEventsV2CashInEnabled()) {
                                pVarP12.p("View account limits");
                            }
                            q qVar = mayaCashInFragment6.f11690G0;
                            if (qVar != null) {
                                MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) qVar;
                                mayaCashInActivity.n1();
                                B5.i.b(mayaCashInActivity);
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaCashInFragment mayaCashInFragment7 = this.f2842b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInFragment7.P1().l();
                            return;
                        } finally {
                        }
                    default:
                        MayaCashInFragment mayaCashInFragment8 = this.f2842b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaCashInFragment.U1(mayaCashInFragment8);
                            return;
                        } finally {
                        }
                }
            }
        });
        AppCompatTextView appCompatTextView2 = this.t0;
        if (appCompatTextView2 == null) {
            j.n("mTextViewBankAccount");
            throw null;
        }
        final int i4 = 1;
        appCompatTextView2.setOnClickListener(new View.OnClickListener(this) { // from class: L6.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCashInFragment f2842b;

            {
                this.f2842b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaCashInFragment mayaCashInFragment3 = this.f2842b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaCashInFragment.S1(mayaCashInFragment3);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaCashInFragment mayaCashInFragment4 = this.f2842b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInFragment4.P1().p("Bank Account");
                            mayaCashInFragment4.P1().n();
                            return;
                        } finally {
                        }
                    case 2:
                        MayaCashInFragment mayaCashInFragment5 = this.f2842b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaCashInFragment.T1(mayaCashInFragment5);
                            return;
                        } finally {
                        }
                    case 3:
                        MayaCashInFragment mayaCashInFragment6 = this.f2842b;
                        Callback.onClick_enter(view2);
                        try {
                            G6.p pVarP12 = mayaCashInFragment6.P1();
                            if (((com.paymaya.data.preference.a) pVarP12.e).e().isAppEventsV2CashInEnabled()) {
                                pVarP12.p("View account limits");
                            }
                            q qVar = mayaCashInFragment6.f11690G0;
                            if (qVar != null) {
                                MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) qVar;
                                mayaCashInActivity.n1();
                                B5.i.b(mayaCashInActivity);
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaCashInFragment mayaCashInFragment7 = this.f2842b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInFragment7.P1().l();
                            return;
                        } finally {
                        }
                    default:
                        MayaCashInFragment mayaCashInFragment8 = this.f2842b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaCashInFragment.U1(mayaCashInFragment8);
                            return;
                        } finally {
                        }
                }
            }
        });
        AppCompatTextView appCompatTextView3 = this.u0;
        if (appCompatTextView3 == null) {
            j.n("mTextViewDebitCreditCard");
            throw null;
        }
        final int i6 = 2;
        appCompatTextView3.setOnClickListener(new View.OnClickListener(this) { // from class: L6.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCashInFragment f2842b;

            {
                this.f2842b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaCashInFragment mayaCashInFragment3 = this.f2842b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaCashInFragment.S1(mayaCashInFragment3);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaCashInFragment mayaCashInFragment4 = this.f2842b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInFragment4.P1().p("Bank Account");
                            mayaCashInFragment4.P1().n();
                            return;
                        } finally {
                        }
                    case 2:
                        MayaCashInFragment mayaCashInFragment5 = this.f2842b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaCashInFragment.T1(mayaCashInFragment5);
                            return;
                        } finally {
                        }
                    case 3:
                        MayaCashInFragment mayaCashInFragment6 = this.f2842b;
                        Callback.onClick_enter(view2);
                        try {
                            G6.p pVarP12 = mayaCashInFragment6.P1();
                            if (((com.paymaya.data.preference.a) pVarP12.e).e().isAppEventsV2CashInEnabled()) {
                                pVarP12.p("View account limits");
                            }
                            q qVar = mayaCashInFragment6.f11690G0;
                            if (qVar != null) {
                                MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) qVar;
                                mayaCashInActivity.n1();
                                B5.i.b(mayaCashInActivity);
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaCashInFragment mayaCashInFragment7 = this.f2842b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInFragment7.P1().l();
                            return;
                        } finally {
                        }
                    default:
                        MayaCashInFragment mayaCashInFragment8 = this.f2842b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaCashInFragment.U1(mayaCashInFragment8);
                            return;
                        } finally {
                        }
                }
            }
        });
        View view2 = this.f11685B0;
        if (view2 == null) {
            j.n("mTextViewAccountLimits");
            throw null;
        }
        final int i10 = 3;
        view2.setOnClickListener(new View.OnClickListener(this) { // from class: L6.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCashInFragment f2842b;

            {
                this.f2842b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i10) {
                    case 0:
                        MayaCashInFragment mayaCashInFragment3 = this.f2842b;
                        Callback.onClick_enter(view22);
                        try {
                            MayaCashInFragment.S1(mayaCashInFragment3);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaCashInFragment mayaCashInFragment4 = this.f2842b;
                        Callback.onClick_enter(view22);
                        try {
                            mayaCashInFragment4.P1().p("Bank Account");
                            mayaCashInFragment4.P1().n();
                            return;
                        } finally {
                        }
                    case 2:
                        MayaCashInFragment mayaCashInFragment5 = this.f2842b;
                        Callback.onClick_enter(view22);
                        try {
                            MayaCashInFragment.T1(mayaCashInFragment5);
                            return;
                        } finally {
                        }
                    case 3:
                        MayaCashInFragment mayaCashInFragment6 = this.f2842b;
                        Callback.onClick_enter(view22);
                        try {
                            G6.p pVarP12 = mayaCashInFragment6.P1();
                            if (((com.paymaya.data.preference.a) pVarP12.e).e().isAppEventsV2CashInEnabled()) {
                                pVarP12.p("View account limits");
                            }
                            q qVar = mayaCashInFragment6.f11690G0;
                            if (qVar != null) {
                                MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) qVar;
                                mayaCashInActivity.n1();
                                B5.i.b(mayaCashInActivity);
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaCashInFragment mayaCashInFragment7 = this.f2842b;
                        Callback.onClick_enter(view22);
                        try {
                            mayaCashInFragment7.P1().l();
                            return;
                        } finally {
                        }
                    default:
                        MayaCashInFragment mayaCashInFragment8 = this.f2842b;
                        Callback.onClick_enter(view22);
                        try {
                            MayaCashInFragment.U1(mayaCashInFragment8);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button = this.f11684A0;
        if (button == null) {
            j.n("mButtonErrorRetry");
            throw null;
        }
        final int i11 = 4;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: L6.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCashInFragment f2842b;

            {
                this.f2842b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i11) {
                    case 0:
                        MayaCashInFragment mayaCashInFragment3 = this.f2842b;
                        Callback.onClick_enter(view22);
                        try {
                            MayaCashInFragment.S1(mayaCashInFragment3);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaCashInFragment mayaCashInFragment4 = this.f2842b;
                        Callback.onClick_enter(view22);
                        try {
                            mayaCashInFragment4.P1().p("Bank Account");
                            mayaCashInFragment4.P1().n();
                            return;
                        } finally {
                        }
                    case 2:
                        MayaCashInFragment mayaCashInFragment5 = this.f2842b;
                        Callback.onClick_enter(view22);
                        try {
                            MayaCashInFragment.T1(mayaCashInFragment5);
                            return;
                        } finally {
                        }
                    case 3:
                        MayaCashInFragment mayaCashInFragment6 = this.f2842b;
                        Callback.onClick_enter(view22);
                        try {
                            G6.p pVarP12 = mayaCashInFragment6.P1();
                            if (((com.paymaya.data.preference.a) pVarP12.e).e().isAppEventsV2CashInEnabled()) {
                                pVarP12.p("View account limits");
                            }
                            q qVar = mayaCashInFragment6.f11690G0;
                            if (qVar != null) {
                                MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) qVar;
                                mayaCashInActivity.n1();
                                B5.i.b(mayaCashInActivity);
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaCashInFragment mayaCashInFragment7 = this.f2842b;
                        Callback.onClick_enter(view22);
                        try {
                            mayaCashInFragment7.P1().l();
                            return;
                        } finally {
                        }
                    default:
                        MayaCashInFragment mayaCashInFragment8 = this.f2842b;
                        Callback.onClick_enter(view22);
                        try {
                            MayaCashInFragment.U1(mayaCashInFragment8);
                            return;
                        } finally {
                        }
                }
            }
        });
        AppCompatTextView appCompatTextView4 = this.f11696q0;
        if (appCompatTextView4 == null) {
            j.n("mTextViewMayaSavings");
            throw null;
        }
        final int i12 = 5;
        appCompatTextView4.setOnClickListener(new View.OnClickListener(this) { // from class: L6.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCashInFragment f2842b;

            {
                this.f2842b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i12) {
                    case 0:
                        MayaCashInFragment mayaCashInFragment3 = this.f2842b;
                        Callback.onClick_enter(view22);
                        try {
                            MayaCashInFragment.S1(mayaCashInFragment3);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaCashInFragment mayaCashInFragment4 = this.f2842b;
                        Callback.onClick_enter(view22);
                        try {
                            mayaCashInFragment4.P1().p("Bank Account");
                            mayaCashInFragment4.P1().n();
                            return;
                        } finally {
                        }
                    case 2:
                        MayaCashInFragment mayaCashInFragment5 = this.f2842b;
                        Callback.onClick_enter(view22);
                        try {
                            MayaCashInFragment.T1(mayaCashInFragment5);
                            return;
                        } finally {
                        }
                    case 3:
                        MayaCashInFragment mayaCashInFragment6 = this.f2842b;
                        Callback.onClick_enter(view22);
                        try {
                            G6.p pVarP12 = mayaCashInFragment6.P1();
                            if (((com.paymaya.data.preference.a) pVarP12.e).e().isAppEventsV2CashInEnabled()) {
                                pVarP12.p("View account limits");
                            }
                            q qVar = mayaCashInFragment6.f11690G0;
                            if (qVar != null) {
                                MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) qVar;
                                mayaCashInActivity.n1();
                                B5.i.b(mayaCashInActivity);
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaCashInFragment mayaCashInFragment7 = this.f2842b;
                        Callback.onClick_enter(view22);
                        try {
                            mayaCashInFragment7.P1().l();
                            return;
                        } finally {
                        }
                    default:
                        MayaCashInFragment mayaCashInFragment8 = this.f2842b;
                        Callback.onClick_enter(view22);
                        try {
                            MayaCashInFragment.U1(mayaCashInFragment8);
                            return;
                        } finally {
                        }
                }
            }
        });
        P1().j();
        P1().l();
    }
}
