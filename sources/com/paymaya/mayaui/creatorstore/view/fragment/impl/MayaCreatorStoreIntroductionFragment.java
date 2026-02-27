package com.paymaya.mayaui.creatorstore.view.fragment.impl;

import A7.j;
import G5.t;
import M8.D2;
import N5.C0435a;
import N5.C0450f;
import S5.c;
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
import androidx.camera.core.impl.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.viewbinding.ViewBindings;
import cj.M;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.internal.ImagesContract;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.creatorstore.view.activity.impl.MayaCreatorStoreActivity;
import fa.ViewOnClickListenerC1479a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import kotlin.Pair;
import p7.b;
import q7.e;
import zj.C2576A;
import zj.C2579a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaCreatorStoreIntroductionFragment extends MayaBaseFragment implements b, t {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0435a f12119U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C1219h f12120V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public j f12121W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public e f12122X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final D2 f12123Y = new D2(this, 12);

    public static final void H1(MayaCreatorStoreIntroductionFragment mayaCreatorStoreIntroductionFragment) {
        j jVar = mayaCreatorStoreIntroductionFragment.f12121W;
        if (jVar == null) {
            kotlin.jvm.internal.j.n("presenter");
            throw null;
        }
        String str = (String) jVar.f;
        if (str == null) {
            kotlin.jvm.internal.j.n("category");
            throw null;
        }
        EnumC1217f enumC1217f = str.equals("luckygames") ? EnumC1217f.CONTINUE : EnumC1217f.GET_STARTED;
        C1219h c1219h = new C1219h();
        c1219h.n(17);
        c1219h.t(enumC1217f);
        c1219h.i();
        String str2 = (String) jVar.f;
        if (str2 == null) {
            kotlin.jvm.internal.j.n("category");
            throw null;
        }
        if (str2.equals("stocks")) {
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put(SessionDescription.ATTR_TYPE, ImagesContract.LOCAL);
            a.A(((com.paymaya.data.preference.a) jVar.e).f11330b, "key_stocks_introduction", true);
        } else if (str2.equals("globalstocks")) {
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put(SessionDescription.ATTR_TYPE, "global");
            a.A(((com.paymaya.data.preference.a) jVar.e).f11330b, "key_global_stocks_introduction", true);
        } else {
            com.paymaya.data.preference.a aVar = (com.paymaya.data.preference.a) jVar.e;
            String str3 = (String) jVar.f;
            if (str3 == null) {
                kotlin.jvm.internal.j.n("category");
                throw null;
            }
            aVar.getClass();
            HashSet hashSet = new HashSet();
            SharedPreferences sharedPreferences = aVar.f11330b;
            Set<String> stringSet = sharedPreferences.getStringSet("key_creator_store_introduction_shown", hashSet);
            stringSet.add(str3);
            sharedPreferences.edit().putStringSet("key_creator_store_introduction_shown", stringSet).apply();
        }
        ((MayaBaseFragment) ((b) jVar.c.get())).A1(c1219h);
        b bVar = (b) jVar.c.get();
        String str4 = (String) jVar.f;
        if (str4 == null) {
            kotlin.jvm.internal.j.n("category");
            throw null;
        }
        MayaCreatorStoreIntroductionFragment mayaCreatorStoreIntroductionFragment2 = (MayaCreatorStoreIntroductionFragment) bVar;
        mayaCreatorStoreIntroductionFragment2.getClass();
        e eVar = mayaCreatorStoreIntroductionFragment2.f12122X;
        if (eVar != null) {
            ((MayaCreatorStoreActivity) eVar).X1(str4);
        }
    }

    public final HashMap G1() {
        return M.g(new Pair("stocks", getString(R.string.maya_label_stock_introduction_content)), new Pair("globalstocks", getString(R.string.maya_label_global_stock_content)), new Pair("globalremittance", getString(R.string.maya_label_global_remittance_content)), new Pair("stocksgame", getString(R.string.maya_label_stocks_game_content)), new Pair("luckygames", getString(R.string.maya_label_lucky_games_content)), new Pair("mayafunds", getString(R.string.maya_label_funds_content)), new Pair("insurance", getString(R.string.maya_label_insurance_content)), new Pair("stream", getString(R.string.maya_label_stream_content)), new Pair("sparkhackathon", getString(R.string.maya_label_spark_hackathon_content)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.INTRO;
    }

    @Override // G5.t
    public final void m(String link, View view) {
        kotlin.jvm.internal.j.g(link, "link");
        kotlin.jvm.internal.j.g(view, "view");
        if (link.equals("terms_and_conditions")) {
            C1219h c1219h = this.f12120V;
            if (c1219h == null) {
                kotlin.jvm.internal.j.n("analyticsEvent");
                throw null;
            }
            c1219h.n(17);
            c1219h.t(EnumC1217f.TERMS);
            c1219h.i();
            A1(c1219h);
            e eVar = this.f12122X;
            if (eVar != null) {
                MayaCreatorStoreActivity mayaCreatorStoreActivity = (MayaCreatorStoreActivity) eVar;
                mayaCreatorStoreActivity.n1().k0(mayaCreatorStoreActivity, "https://www.maya.ph/terms-and-conditions");
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().i();
        this.f12120V = new C1219h();
        O5.a aVar = W4.a.e().j().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        kotlin.jvm.internal.j.g(preference, "preference");
        this.f12121W = new j(preference, 16);
        this.f12122X = (e) getActivity();
        j jVar = this.f12121W;
        if (jVar != null) {
            jVar.h(this);
        } else {
            kotlin.jvm.internal.j.n("presenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_creator_store_introduction_fragment, viewGroup, false);
        int i = R.id.button_get_started_scrolling;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_get_started_scrolling);
        if (button != null) {
            i = R.id.button_get_started_sticky;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_get_started_sticky);
            if (button2 != null) {
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
                                    this.f12119U = new C0435a((ViewGroup) constraintLayout, (Object) button, (Object) button2, (Object) imageView, (View) linearLayout, (Object) textView, 5);
                                    kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
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
        j jVar = this.f12121W;
        if (jVar == null) {
            kotlin.jvm.internal.j.n("presenter");
            throw null;
        }
        jVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        e eVar = this.f12122X;
        if (eVar != null) {
            ((MayaCreatorStoreActivity) eVar).L1(1.0f);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        char c;
        char c10;
        int i;
        int i4;
        char c11 = 6;
        int i6 = 0;
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.j.f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, this.f12123Y);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("category")) == null) {
            string = "";
        }
        j jVar = this.f12121W;
        if (jVar == null) {
            kotlin.jvm.internal.j.n("presenter");
            throw null;
        }
        jVar.j();
        jVar.f = string;
        if (string.equals("stocks")) {
            MayaCreatorStoreIntroductionFragment mayaCreatorStoreIntroductionFragment = (MayaCreatorStoreIntroductionFragment) ((b) jVar.c.get());
            c = 4;
            C1219h c1219hM1 = mayaCreatorStoreIntroductionFragment.m1();
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c10 = 3;
            c1219hM1.j.put(SessionDescription.ATTR_TYPE, ImagesContract.LOCAL);
            C1219h c1219h = mayaCreatorStoreIntroductionFragment.f12120V;
            if (c1219h == null) {
                kotlin.jvm.internal.j.n("analyticsEvent");
                throw null;
            }
            c1219h.j.put(SessionDescription.ATTR_TYPE, ImagesContract.LOCAL);
        } else {
            c = 4;
            c10 = 3;
            if (string.equals("globalstocks")) {
                MayaCreatorStoreIntroductionFragment mayaCreatorStoreIntroductionFragment2 = (MayaCreatorStoreIntroductionFragment) ((b) jVar.c.get());
                C1219h c1219hM12 = mayaCreatorStoreIntroductionFragment2.m1();
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hM12.j.put(SessionDescription.ATTR_TYPE, "global");
                C1219h c1219h2 = mayaCreatorStoreIntroductionFragment2.f12120V;
                if (c1219h2 == null) {
                    kotlin.jvm.internal.j.n("analyticsEvent");
                    throw null;
                }
                c1219h2.j.put(SessionDescription.ATTR_TYPE, "global");
            }
        }
        MayaCreatorStoreIntroductionFragment mayaCreatorStoreIntroductionFragment3 = (MayaCreatorStoreIntroductionFragment) ((b) jVar.c.get());
        if (mayaCreatorStoreIntroductionFragment3.G1().containsKey(string)) {
            String content = (String) M.f(mayaCreatorStoreIntroductionFragment3.G1(), string);
            kotlin.jvm.internal.j.g(content, "content");
            C0435a c0435a = mayaCreatorStoreIntroductionFragment3.f12119U;
            kotlin.jvm.internal.j.d(c0435a);
            LinearLayout linearLayout = (LinearLayout) c0435a.f;
            com.squareup.wire.internal.a aVar = new com.squareup.wire.internal.a(mayaCreatorStoreIntroductionFragment3, 19);
            for (String str : C2576A.T(content, new String[]{Global.NEWLINE}, 6)) {
                C0450f c0450fD = C0450f.d(LayoutInflater.from(linearLayout.getContext()));
                char c12 = c11;
                int length = str.length();
                int i10 = i6;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (C2579a.b(str.charAt(i10))) {
                        break;
                    } else {
                        i10++;
                    }
                }
                String strSubstring = str.substring(i6, i10);
                kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
                ((TextView) c0450fD.f4087b).setText(C2576A.b0(strSubstring).toString());
                G7.t tVar = new G7.t(aVar, 10);
                HtmlTextView htmlTextView = (HtmlTextView) c0450fD.f4088d;
                htmlTextView.setOnLinkClickListener(tVar);
                String strSubstring2 = str.substring(i10);
                kotlin.jvm.internal.j.f(strSubstring2, "substring(...)");
                htmlTextView.setTextHTML(C2576A.b0(strSubstring2).toString());
                TextViewCompat.setTextAppearance(htmlTextView, R.style.CerebriBookTextBody_Secondary);
                linearLayout.addView((ConstraintLayout) c0450fD.c);
                c11 = c12;
                i6 = i6;
            }
            char c13 = c11;
            i = i6;
            i4 = 8;
            Pair pair = new Pair("stocks", mayaCreatorStoreIntroductionFragment3.getString(R.string.maya_label_step_into_exciting_title));
            Pair pair2 = new Pair("globalstocks", mayaCreatorStoreIntroductionFragment3.getString(R.string.maya_label_unlock_the_world_global_stocks_title));
            Pair pair3 = new Pair("globalremittance", mayaCreatorStoreIntroductionFragment3.getString(R.string.maya_label_global_remittance_title));
            Pair pair4 = new Pair("stocksgame", mayaCreatorStoreIntroductionFragment3.getString(R.string.maya_label_learn_stock_trading_title));
            Pair pair5 = new Pair("luckygames", mayaCreatorStoreIntroductionFragment3.getString(R.string.maya_label_lucky_games_title));
            Pair pair6 = new Pair("mayafunds", mayaCreatorStoreIntroductionFragment3.getString(R.string.maya_label_funds_title));
            Pair pair7 = new Pair("insurance", mayaCreatorStoreIntroductionFragment3.getString(R.string.maya_label_insurance_title));
            Pair pair8 = new Pair("stream", mayaCreatorStoreIntroductionFragment3.getString(R.string.maya_label_stream_title));
            Pair pair9 = new Pair("sparkhackathon", mayaCreatorStoreIntroductionFragment3.getString(R.string.maya_label_spark_hackathon_title));
            Pair[] pairArr = new Pair[9];
            pairArr[i] = pair;
            pairArr[1] = pair2;
            pairArr[2] = pair3;
            pairArr[c10] = pair4;
            pairArr[c] = pair5;
            pairArr[5] = pair6;
            pairArr[c13] = pair7;
            pairArr[7] = pair8;
            pairArr[8] = pair9;
            String title = (String) M.f(M.g(pairArr), string);
            kotlin.jvm.internal.j.g(title, "title");
            C0435a c0435a2 = mayaCreatorStoreIntroductionFragment3.f12119U;
            kotlin.jvm.internal.j.d(c0435a2);
            ((TextView) c0435a2.f4049g).setText(title);
            Pair pair10 = new Pair("stocks", 2131231239);
            Pair pair11 = new Pair("globalstocks", 2131231384);
            Pair pair12 = new Pair("globalremittance", 2131231383);
            Pair pair13 = new Pair("stocksgame", 2131231404);
            Pair pair14 = new Pair("luckygames", 2131231393);
            Pair pair15 = new Pair("mayafunds", 2131231382);
            Pair pair16 = new Pair("insurance", 2131231385);
            Pair pair17 = new Pair("stream", 2131231405);
            Pair pair18 = new Pair("sparkhackathon", 2131231402);
            Pair[] pairArr2 = new Pair[9];
            pairArr2[i] = pair10;
            pairArr2[1] = pair11;
            pairArr2[2] = pair12;
            pairArr2[c10] = pair13;
            pairArr2[c] = pair14;
            pairArr2[5] = pair15;
            pairArr2[c13] = pair16;
            pairArr2[7] = pair17;
            pairArr2[8] = pair18;
            int iIntValue = ((Number) M.f(M.g(pairArr2), string)).intValue();
            C0435a c0435a3 = mayaCreatorStoreIntroductionFragment3.f12119U;
            kotlin.jvm.internal.j.d(c0435a3);
            ((ImageView) c0435a3.e).setImageDrawable(ContextCompat.getDrawable(mayaCreatorStoreIntroductionFragment3.requireContext(), iIntValue));
        } else {
            i = 0;
            i4 = 8;
        }
        if (string.equals("luckygames")) {
            MayaCreatorStoreIntroductionFragment mayaCreatorStoreIntroductionFragment4 = (MayaCreatorStoreIntroductionFragment) ((b) jVar.c.get());
            C0435a c0435a4 = mayaCreatorStoreIntroductionFragment4.f12119U;
            kotlin.jvm.internal.j.d(c0435a4);
            ((Button) c0435a4.f4048d).setText(mayaCreatorStoreIntroductionFragment4.getString(R.string.maya_label_button_continue));
            C0435a c0435a5 = mayaCreatorStoreIntroductionFragment4.f12119U;
            kotlin.jvm.internal.j.d(c0435a5);
            ((Button) c0435a5.c).setText(mayaCreatorStoreIntroductionFragment4.getString(R.string.maya_label_button_continue));
            MayaCreatorStoreIntroductionFragment mayaCreatorStoreIntroductionFragment5 = (MayaCreatorStoreIntroductionFragment) ((b) jVar.c.get());
            C0435a c0435a6 = mayaCreatorStoreIntroductionFragment5.f12119U;
            kotlin.jvm.internal.j.d(c0435a6);
            ((Button) c0435a6.f4048d).setVisibility(i4);
            C0435a c0435a7 = mayaCreatorStoreIntroductionFragment5.f12119U;
            kotlin.jvm.internal.j.d(c0435a7);
            ((Button) c0435a7.c).setVisibility(i);
        } else {
            MayaCreatorStoreIntroductionFragment mayaCreatorStoreIntroductionFragment6 = (MayaCreatorStoreIntroductionFragment) ((b) jVar.c.get());
            C0435a c0435a8 = mayaCreatorStoreIntroductionFragment6.f12119U;
            kotlin.jvm.internal.j.d(c0435a8);
            ((Button) c0435a8.f4048d).setText(mayaCreatorStoreIntroductionFragment6.getString(R.string.maya_label_button_get_started));
            C0435a c0435a9 = mayaCreatorStoreIntroductionFragment6.f12119U;
            kotlin.jvm.internal.j.d(c0435a9);
            ((Button) c0435a9.c).setText(mayaCreatorStoreIntroductionFragment6.getString(R.string.maya_label_button_get_started));
            MayaCreatorStoreIntroductionFragment mayaCreatorStoreIntroductionFragment7 = (MayaCreatorStoreIntroductionFragment) ((b) jVar.c.get());
            C0435a c0435a10 = mayaCreatorStoreIntroductionFragment7.f12119U;
            kotlin.jvm.internal.j.d(c0435a10);
            ((Button) c0435a10.f4048d).setVisibility(0);
            C0435a c0435a11 = mayaCreatorStoreIntroductionFragment7.f12119U;
            kotlin.jvm.internal.j.d(c0435a11);
            ((Button) c0435a11.c).setVisibility(8);
        }
        C0435a c0435a12 = this.f12119U;
        kotlin.jvm.internal.j.d(c0435a12);
        ViewOnClickListenerC1479a viewOnClickListenerC1479a = new ViewOnClickListenerC1479a(this, 28);
        ((Button) c0435a12.f4048d).setOnClickListener(viewOnClickListenerC1479a);
        ((Button) c0435a12.c).setOnClickListener(viewOnClickListenerC1479a);
    }
}
