package com.paymaya.mayaui.creatorstore.view.fragment.impl;

import Bb.a;
import M8.D2;
import N5.C0435a;
import a7.InterfaceC0641b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBindings;
import bg.AbstractC0983W;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.creatorstore.view.activity.impl.MayaCreatorStoreActivity;
import defpackage.AbstractC1414e;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import p7.c;
import q7.g;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class MayaLuckyGamesInterstitialFragment extends MayaBaseFragment implements c, InterfaceC0641b {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public a f12124U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public g f12125V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C0435a f12126W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f12127X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public HtmlTextView f12128Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public MayaCarousel f12129Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final D2 f12130a0 = new D2(this, 13);

    public static final void G1(MayaLuckyGamesInterstitialFragment mayaLuckyGamesInterstitialFragment) {
        a aVar = mayaLuckyGamesInterstitialFragment.f12124U;
        if (aVar == null) {
            j.n("presenter");
            throw null;
        }
        MayaLuckyGamesInterstitialFragment mayaLuckyGamesInterstitialFragment2 = (MayaLuckyGamesInterstitialFragment) ((c) aVar.c.get());
        mayaLuckyGamesInterstitialFragment2.getClass();
        C1219h c1219h = new C1219h();
        c1219h.n(17);
        c1219h.t(EnumC1217f.CONTINUE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("category", "luckygames");
        mayaLuckyGamesInterstitialFragment2.A1(c1219h);
        g gVar = mayaLuckyGamesInterstitialFragment2.f12125V;
        if (gVar != null) {
            ((MayaCreatorStoreActivity) gVar).X1("luckygames");
        }
    }

    @Override // ad.InterfaceC0684a
    public final void B0(HashMap map) {
        AbstractC0983W.u(this, map);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.INTERSTITIAL;
    }

    @Override // ad.InterfaceC0684a
    public final void c(int i, String str, String str2) {
    }

    @Override // a7.InterfaceC0641b
    public final void o0() {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1219h c1219h = new C1219h();
        c1219h.p(EnumC1215d.LUCKY_GAMES);
        AbstractC1414e.m(c1219h, EnumC1216e.INTRO, 7);
        this.f10337Q = c1219h;
        this.f10338R = true;
        this.f12125V = (g) getActivity();
        O5.a aVar = W4.a.e().j().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        a aVar2 = new a(preference, 23, false);
        this.f12124U = aVar2;
        aVar2.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_lucky_games_interstitial_fragment, viewGroup, false);
        int i = R.id.button_continue;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_continue);
        if (button != null) {
            i = R.id.carousel;
            MayaCarousel mayaCarousel = (MayaCarousel) ViewBindings.findChildViewById(viewInflate, R.id.carousel);
            if (mayaCarousel != null) {
                i = R.id.constraint_layout_body;
                if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_body)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    i = R.id.html_text_view_body_content;
                    HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.html_text_view_body_content);
                    if (htmlTextView != null) {
                        i = R.id.html_text_view_terms_and_conditions;
                        HtmlTextView htmlTextView2 = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.html_text_view_terms_and_conditions);
                        if (htmlTextView2 != null) {
                            i = R.id.scroll_view_content;
                            if (((ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_content)) != null) {
                                i = R.id.text_view_body_title;
                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_body_title);
                                if (textView != null) {
                                    this.f12126W = new C0435a((ViewGroup) constraintLayout, (Object) button, (Object) mayaCarousel, (Object) htmlTextView, (View) htmlTextView2, (Object) textView, 19);
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
    public final void onResume() {
        super.onResume();
        C1219h c1219hH = AbstractC2329d.h(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("category", "luckygames");
        A1(c1219hH);
        MayaCarousel mayaCarousel = this.f12129Z;
        if (mayaCarousel != null) {
            mayaCarousel.k();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        j.f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, this.f12130a0);
        g gVar = this.f12125V;
        if (gVar != null) {
            ((MayaCreatorStoreActivity) gVar).C1(R.drawable.maya_ic_close);
        }
        C0435a c0435a = this.f12126W;
        j.d(c0435a);
        this.f12127X = (TextView) c0435a.f4049g;
        C0435a c0435a2 = this.f12126W;
        j.d(c0435a2);
        this.f12128Y = (HtmlTextView) c0435a2.e;
        a aVar = this.f12124U;
        if (aVar != null) {
            aVar.j();
        } else {
            j.n("presenter");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.CREATOR_STORE;
    }
}
