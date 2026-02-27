package com.paymaya.mayaui.common.view.fragment.impl;

import Bb.a;
import G5.t;
import M8.D2;
import N5.C0447e;
import S5.c;
import X6.i;
import Y6.o;
import Y6.p;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBindings;
import bj.C1042m;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.EnumC1235y;
import com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class MayaWebInterstitialFragment extends MayaBaseFragment implements i, t {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0447e f11967U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public a f11968V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public p f11969W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final D2 f11970X = new D2(this, 8);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final HashMap f11971Y = M.g(new Pair(EnumC1235y.f11266d, EnumC1215d.PAL));

    public static final void I1(MayaWebInterstitialFragment mayaWebInterstitialFragment) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.CONTINUE);
        c1219hH.i();
        mayaWebInterstitialFragment.A1(c1219hH);
        a aVar = mayaWebInterstitialFragment.f11968V;
        if (aVar == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        EnumC1235y enumC1235yG1 = ((MayaWebInterstitialFragment) ((i) aVar.c.get())).G1();
        com.paymaya.data.preference.a aVar2 = aVar.e;
        String strName = enumC1235yG1.name();
        aVar2.getClass();
        HashSet hashSet = new HashSet();
        SharedPreferences sharedPreferences = aVar2.f11330b;
        Set<String> stringSet = sharedPreferences.getStringSet("key_mma_introduction_shown", hashSet);
        stringSet.add(strName);
        sharedPreferences.edit().putStringSet("key_mma_introduction_shown", stringSet).apply();
        MayaWebInterstitialFragment mayaWebInterstitialFragment2 = (MayaWebInterstitialFragment) ((i) aVar.c.get());
        p pVar = mayaWebInterstitialFragment2.f11969W;
        if (pVar != null) {
            ((MayaWebActivity) pVar).f2(mayaWebInterstitialFragment2.G1().f11267a);
        }
    }

    public final EnumC1235y G1() {
        Serializable serializable = requireArguments().getSerializable("code");
        j.e(serializable, "null cannot be cast to non-null type com.paymaya.common.utility.EnumKt.MMA");
        return (EnumC1235y) serializable;
    }

    public final HashMap H1() {
        return M.g(new Pair(EnumC1235y.f11266d, new C1042m(getString(R.string.maya_label_pal_interstitial_title), getString(R.string.maya_label_pal_interstitial_content), 2131231479)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.INTRO;
    }

    @Override // G5.t
    public final void m(String str, View view) {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f11969W = (p) getActivity();
        O5.a aVar = (O5.a) W4.a.e().a().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        a aVar2 = new a((com.paymaya.data.preference.a) aVar.e.get(), 14);
        this.f11968V = aVar2;
        aVar2.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_web_interstitial, viewGroup, false);
        int i = R.id.button_continue;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_continue);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.constraint_layout_content;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_content)) != null) {
                i = R.id.image_view_stocks_banner;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_stocks_banner);
                if (imageView != null) {
                    i = R.id.linear_layout_content_container;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_content_container);
                    if (linearLayout != null) {
                        i = R.id.scroll_view_content;
                        if (((ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_content)) != null) {
                            i = R.id.text_view_title;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title);
                            if (textView != null) {
                                this.f11967U = new C0447e(constraintLayout, button, imageView, linearLayout, textView);
                                j.f(constraintLayout, "getRoot(...)");
                                return constraintLayout;
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
        a aVar = this.f11968V;
        if (aVar == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        aVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11967U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        p pVar = this.f11969W;
        if (pVar != null) {
            ((MayaWebActivity) pVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        a aVar = this.f11968V;
        if (aVar == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        aVar.j();
        C0447e c0447e = this.f11967U;
        j.d(c0447e);
        ((Button) c0447e.c).setOnClickListener(new o(this, 0));
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        j.f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, this.f11970X);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        EnumC1215d enumC1215d = (EnumC1215d) this.f11971Y.get(G1());
        return enumC1215d == null ? EnumC1215d.DEFAULT : enumC1215d;
    }
}
