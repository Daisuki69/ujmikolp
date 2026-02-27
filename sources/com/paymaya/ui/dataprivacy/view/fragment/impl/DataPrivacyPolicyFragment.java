package com.paymaya.ui.dataprivacy.view.fragment.impl;

import Ah.p;
import G5.t;
import Kh.T;
import Lh.d;
import M7.c;
import M8.A0;
import N5.M0;
import O5.a;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.store.L;
import com.paymaya.ui.common.view.fragment.impl.WebFragment;
import com.paymaya.ui.dataprivacy.view.activity.impl.DataPrivacyActivity;
import com.paymaya.ui.dataprivacy.view.fragment.impl.DataPrivacyPolicyFragment;
import d4.AbstractC1331a;
import de.m;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import od.b;
import pd.e;

/* JADX INFO: loaded from: classes4.dex */
public class DataPrivacyPolicyFragment extends BaseFragment implements b, t, AppBarLayout.OnOffsetChangedListener {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public M0 f14488S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public c f14489T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f14490U = true;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f14491V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public String f14492W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public e f14493X;

    public static final void t1(DataPrivacyPolicyFragment dataPrivacyPolicyFragment) {
        int i = 0;
        C1220i c1220i = dataPrivacyPolicyFragment.f10245B;
        FragmentActivity activity = dataPrivacyPolicyFragment.getActivity();
        C1219h c1219hD = C1219h.d(dataPrivacyPolicyFragment.m1());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.AGREE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put("source", dataPrivacyPolicyFragment.f14492W);
        c1220i.c(activity, c1219hD);
        c cVar = dataPrivacyPolicyFragment.f14489T;
        if (cVar == null) {
            j.n("mDataPrivacyPolicyFragmentPresenter");
            throw null;
        }
        e eVar = ((DataPrivacyPolicyFragment) ((b) cVar.c.get())).f14493X;
        j.d(eVar);
        ArrayList arrayList = ((DataPrivacyActivity) eVar).m;
        j.d(arrayList);
        M0 m0 = ((DataPrivacyPolicyFragment) ((b) cVar.c.get())).f14488S;
        j.d(m0);
        if (!((CheckBox) m0.f3771l).isChecked()) {
            e eVar2 = ((DataPrivacyPolicyFragment) ((b) cVar.c.get())).f14493X;
            if (eVar2 != null) {
                AbstractC1236z.h((DataPrivacyActivity) eVar2, R.id.pma_activity_data_privacy_container, new DataAndPersonalizationFragment());
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            map.put(((Consent) arrayList.get(i4)).mID(), Boolean.TRUE);
        }
        String str = ((DataPrivacyPolicyFragment) ((b) cVar.c.get())).f14492W;
        j.d(str);
        if (!str.equalsIgnoreCase("registration")) {
            ((BaseFragment) ((b) cVar.c.get())).p1();
            p pVarA = cVar.e.a(map);
            new T(5, new d(new d(AbstractC1331a.l(pVarA, pVarA, zh.b.a()), new com.paymaya.domain.store.T(cVar, 16), 2), new L(cVar, 17), i), new m(cVar, 26)).e();
            return;
        }
        DataPrivacyPolicyFragment dataPrivacyPolicyFragment2 = (DataPrivacyPolicyFragment) ((b) cVar.c.get());
        dataPrivacyPolicyFragment2.getClass();
        e eVar3 = dataPrivacyPolicyFragment2.f14493X;
        if (eVar3 != null) {
            DataPrivacyActivity dataPrivacyActivity = (DataPrivacyActivity) eVar3;
            Intent intent = new Intent();
            intent.putExtra("consents", new HashMap(map));
            dataPrivacyActivity.setResult(1, intent);
            dataPrivacyActivity.finish();
        }
    }

    public static final void u1(DataPrivacyPolicyFragment dataPrivacyPolicyFragment) {
        C1220i c1220i = dataPrivacyPolicyFragment.f10245B;
        FragmentActivity activity = dataPrivacyPolicyFragment.getActivity();
        C1219h c1219hD = C1219h.d(dataPrivacyPolicyFragment.m1());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.ENABLE_ALL);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        M0 m0 = dataPrivacyPolicyFragment.f14488S;
        j.d(m0);
        String strValueOf = String.valueOf(((CheckBox) m0.f3771l).isChecked());
        HashMap map = c1219hD.j;
        map.put(Constants.ENABLED, strValueOf);
        map.put("screen", "primary");
        c1220i.c(activity, c1219hD);
    }

    @Override // G5.t
    public final void m(String link, View view) {
        j.g(link, "link");
        j.g(view, "view");
        if (link.equals(getString(R.string.pma_link_id_terms_and_conditions))) {
            s1();
        } else {
            r1();
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        Bundle arguments = getArguments();
        j.d(arguments);
        this.f14492W = arguments.getString("source");
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.ui.dataprivacy.view.fragment.impl.DataPrivacyPolicyFragment.DataPrivacyPolicyFragmentListener");
        this.f14493X = (e) activity;
        a aVar = W4.a.e().c().f4752a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        c cVar = new c(aVar.j(), (com.paymaya.data.preference.a) aVar.e.get(), (Uh.d) aVar.f4748y.get(), 3);
        this.f14489T = cVar;
        cVar.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_fragment_data_privacy_policy, viewGroup, false);
        int i = R.id.agree_button_pma_fragment_data_privacy;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.agree_button_pma_fragment_data_privacy);
        if (button != null) {
            i = R.id.agree_spiel_html_text_view_pma_fragment_data_privacy_policy;
            HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.agree_spiel_html_text_view_pma_fragment_data_privacy_policy);
            if (htmlTextView != null) {
                i = R.id.app_bar;
                AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(viewInflate, R.id.app_bar);
                if (appBarLayout != null) {
                    i = R.id.arrow_privacy_policy_image_view_pma_fragment_data_privacy_policy;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.arrow_privacy_policy_image_view_pma_fragment_data_privacy_policy)) != null) {
                        i = R.id.arrow_terms_and_conditions_image_view_pma_fragment_data_privacy_policy;
                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.arrow_terms_and_conditions_image_view_pma_fragment_data_privacy_policy)) != null) {
                            i = R.id.border_agree_pma_fragment_data_privacy_policy;
                            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.border_agree_pma_fragment_data_privacy_policy);
                            if (viewFindChildViewById != null) {
                                i = R.id.border_bottom_enable_pma_fragment_data_privacy_policy;
                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.border_bottom_enable_pma_fragment_data_privacy_policy);
                                if (viewFindChildViewById2 != null) {
                                    i = R.id.border_bottom_privacy_policy_pma_fragment_data_privacy_policy;
                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.border_bottom_privacy_policy_pma_fragment_data_privacy_policy);
                                    if (viewFindChildViewById3 != null) {
                                        i = R.id.border_bottom_terms_and_conditions_pma_fragment_data_privacy_policy;
                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.border_bottom_terms_and_conditions_pma_fragment_data_privacy_policy);
                                        if (viewFindChildViewById4 != null) {
                                            i = R.id.border_top_terms_and_conditions_pma_fragment_data_privacy_policy;
                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.border_top_terms_and_conditions_pma_fragment_data_privacy_policy);
                                            if (viewFindChildViewById5 != null) {
                                                i = R.id.enable_check_box_pma_fragment_data_privacy_policy;
                                                CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(viewInflate, R.id.enable_check_box_pma_fragment_data_privacy_policy);
                                                if (checkBox != null) {
                                                    i = R.id.enable_spiel_text_view_pma_fragment_data_privacy_policy;
                                                    if (((HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.enable_spiel_text_view_pma_fragment_data_privacy_policy)) != null) {
                                                        i = R.id.privay_policy_text_view_pma_fragment_data_privacy_policy;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.privay_policy_text_view_pma_fragment_data_privacy_policy)) != null) {
                                                            i = R.id.scroll_view_pma_fragment_data_privacy_policy;
                                                            if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_pma_fragment_data_privacy_policy)) != null) {
                                                                i = R.id.spiel_line1_text_view_pma_fragment_data_privacy_policy;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.spiel_line1_text_view_pma_fragment_data_privacy_policy)) != null) {
                                                                    i = R.id.spiel_line2_text_view_pma_fragment_data_privacy_policy;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.spiel_line2_text_view_pma_fragment_data_privacy_policy)) != null) {
                                                                        i = R.id.terms_and_conditions_text_view_pma_fragment_data_privacy_policy;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.terms_and_conditions_text_view_pma_fragment_data_privacy_policy)) != null) {
                                                                            i = R.id.toolbar_layout_pma_fragment_data_privacy_policy;
                                                                            if (((CollapsingToolbarLayout) ViewBindings.findChildViewById(viewInflate, R.id.toolbar_layout_pma_fragment_data_privacy_policy)) != null) {
                                                                                i = R.id.toolbar_pma_fragment_data_privacy_policy;
                                                                                if (((Toolbar) ViewBindings.findChildViewById(viewInflate, R.id.toolbar_pma_fragment_data_privacy_policy)) != null) {
                                                                                    i = R.id.version_text_view_pma_fragment_data_privacy_policy;
                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.version_text_view_pma_fragment_data_privacy_policy);
                                                                                    if (textView != null) {
                                                                                        i = R.id.view_privacy_policy_pma_fragment_data_privacy_policy;
                                                                                        View viewFindChildViewById6 = ViewBindings.findChildViewById(viewInflate, R.id.view_privacy_policy_pma_fragment_data_privacy_policy);
                                                                                        if (viewFindChildViewById6 != null) {
                                                                                            i = R.id.view_terms_and_conditions_pma_fragment_data_privacy_policy;
                                                                                            View viewFindChildViewById7 = ViewBindings.findChildViewById(viewInflate, R.id.view_terms_and_conditions_pma_fragment_data_privacy_policy);
                                                                                            if (viewFindChildViewById7 != null) {
                                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                                this.f14488S = new M0(constraintLayout, button, htmlTextView, appBarLayout, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, checkBox, textView, viewFindChildViewById6, viewFindChildViewById7);
                                                                                                j.f(constraintLayout, "getRoot(...)");
                                                                                                Ke.b.a(constraintLayout);
                                                                                                M0 m0 = this.f14488S;
                                                                                                j.d(m0);
                                                                                                return m0.f3767b;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        c cVar = this.f14489T;
        if (cVar == null) {
            j.n("mDataPrivacyPolicyFragmentPresenter");
            throw null;
        }
        cVar.i();
        super.onDestroy();
        this.f14488S = null;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        j.g(appBarLayout, "appBarLayout");
        if (this.f14491V) {
            if (((double) Math.abs(i)) / ((double) appBarLayout.getTotalScrollRange()) >= 0.20000000298023224d) {
                if (this.f14490U) {
                    M0 m0 = this.f14488S;
                    j.d(m0);
                    A0.z(4, (TextView) m0.h);
                    this.f14490U = false;
                    return;
                }
                return;
            }
            if (this.f14490U) {
                return;
            }
            M0 m02 = this.f14488S;
            j.d(m02);
            A0.z(0, (TextView) m02.h);
            this.f14490U = true;
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        e eVar = this.f14493X;
        j.d(eVar);
        ((DataPrivacyActivity) eVar).Q(this);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        C1219h c1219h = this.f10248Q;
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("source", this.f14492W);
        super.onStop();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        M0 m0 = this.f14488S;
        j.d(m0);
        ((HtmlTextView) m0.e).setOnLinkClickListener(this);
        M0 m02 = this.f14488S;
        j.d(m02);
        ((AppBarLayout) m02.f).addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) this);
        c cVar = this.f14489T;
        if (cVar == null) {
            j.n("mDataPrivacyPolicyFragmentPresenter");
            throw null;
        }
        cVar.j();
        M0 m03 = this.f14488S;
        j.d(m03);
        final int i = 0;
        ((View) m03.f3772n).setOnClickListener(new View.OnClickListener(this) { // from class: pd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DataPrivacyPolicyFragment f19092b;

            {
                this.f19092b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        DataPrivacyPolicyFragment dataPrivacyPolicyFragment = this.f19092b;
                        Callback.onClick_enter(view2);
                        try {
                            dataPrivacyPolicyFragment.s1();
                            return;
                        } finally {
                        }
                    case 1:
                        DataPrivacyPolicyFragment dataPrivacyPolicyFragment2 = this.f19092b;
                        Callback.onClick_enter(view2);
                        try {
                            dataPrivacyPolicyFragment2.r1();
                            return;
                        } finally {
                        }
                    case 2:
                        DataPrivacyPolicyFragment dataPrivacyPolicyFragment3 = this.f19092b;
                        Callback.onClick_enter(view2);
                        try {
                            DataPrivacyPolicyFragment.t1(dataPrivacyPolicyFragment3);
                            return;
                        } finally {
                        }
                    default:
                        DataPrivacyPolicyFragment dataPrivacyPolicyFragment4 = this.f19092b;
                        Callback.onClick_enter(view2);
                        try {
                            DataPrivacyPolicyFragment.u1(dataPrivacyPolicyFragment4);
                            return;
                        } finally {
                        }
                }
            }
        });
        M0 m04 = this.f14488S;
        j.d(m04);
        final int i4 = 1;
        ((View) m04.m).setOnClickListener(new View.OnClickListener(this) { // from class: pd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DataPrivacyPolicyFragment f19092b;

            {
                this.f19092b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        DataPrivacyPolicyFragment dataPrivacyPolicyFragment = this.f19092b;
                        Callback.onClick_enter(view2);
                        try {
                            dataPrivacyPolicyFragment.s1();
                            return;
                        } finally {
                        }
                    case 1:
                        DataPrivacyPolicyFragment dataPrivacyPolicyFragment2 = this.f19092b;
                        Callback.onClick_enter(view2);
                        try {
                            dataPrivacyPolicyFragment2.r1();
                            return;
                        } finally {
                        }
                    case 2:
                        DataPrivacyPolicyFragment dataPrivacyPolicyFragment3 = this.f19092b;
                        Callback.onClick_enter(view2);
                        try {
                            DataPrivacyPolicyFragment.t1(dataPrivacyPolicyFragment3);
                            return;
                        } finally {
                        }
                    default:
                        DataPrivacyPolicyFragment dataPrivacyPolicyFragment4 = this.f19092b;
                        Callback.onClick_enter(view2);
                        try {
                            DataPrivacyPolicyFragment.u1(dataPrivacyPolicyFragment4);
                            return;
                        } finally {
                        }
                }
            }
        });
        M0 m05 = this.f14488S;
        j.d(m05);
        final int i6 = 2;
        ((Button) m05.f3768d).setOnClickListener(new View.OnClickListener(this) { // from class: pd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DataPrivacyPolicyFragment f19092b;

            {
                this.f19092b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        DataPrivacyPolicyFragment dataPrivacyPolicyFragment = this.f19092b;
                        Callback.onClick_enter(view2);
                        try {
                            dataPrivacyPolicyFragment.s1();
                            return;
                        } finally {
                        }
                    case 1:
                        DataPrivacyPolicyFragment dataPrivacyPolicyFragment2 = this.f19092b;
                        Callback.onClick_enter(view2);
                        try {
                            dataPrivacyPolicyFragment2.r1();
                            return;
                        } finally {
                        }
                    case 2:
                        DataPrivacyPolicyFragment dataPrivacyPolicyFragment3 = this.f19092b;
                        Callback.onClick_enter(view2);
                        try {
                            DataPrivacyPolicyFragment.t1(dataPrivacyPolicyFragment3);
                            return;
                        } finally {
                        }
                    default:
                        DataPrivacyPolicyFragment dataPrivacyPolicyFragment4 = this.f19092b;
                        Callback.onClick_enter(view2);
                        try {
                            DataPrivacyPolicyFragment.u1(dataPrivacyPolicyFragment4);
                            return;
                        } finally {
                        }
                }
            }
        });
        M0 m06 = this.f14488S;
        j.d(m06);
        final int i10 = 3;
        ((CheckBox) m06.f3771l).setOnClickListener(new View.OnClickListener(this) { // from class: pd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DataPrivacyPolicyFragment f19092b;

            {
                this.f19092b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        DataPrivacyPolicyFragment dataPrivacyPolicyFragment = this.f19092b;
                        Callback.onClick_enter(view2);
                        try {
                            dataPrivacyPolicyFragment.s1();
                            return;
                        } finally {
                        }
                    case 1:
                        DataPrivacyPolicyFragment dataPrivacyPolicyFragment2 = this.f19092b;
                        Callback.onClick_enter(view2);
                        try {
                            dataPrivacyPolicyFragment2.r1();
                            return;
                        } finally {
                        }
                    case 2:
                        DataPrivacyPolicyFragment dataPrivacyPolicyFragment3 = this.f19092b;
                        Callback.onClick_enter(view2);
                        try {
                            DataPrivacyPolicyFragment.t1(dataPrivacyPolicyFragment3);
                            return;
                        } finally {
                        }
                    default:
                        DataPrivacyPolicyFragment dataPrivacyPolicyFragment4 = this.f19092b;
                        Callback.onClick_enter(view2);
                        try {
                            DataPrivacyPolicyFragment.u1(dataPrivacyPolicyFragment4);
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    public final void r1() {
        C1220i c1220i = this.f10245B;
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(m1());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.VIEW_PRIVACY_POLICY);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put("source", this.f14492W);
        c1220i.c(activity, c1219hD);
        e eVar = this.f14493X;
        j.d(eVar);
        DataPrivacyActivity dataPrivacyActivity = (DataPrivacyActivity) eVar;
        boolean zB = j.b(dataPrivacyActivity.f14474l, "settings");
        WebFragment webFragment = new WebFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ImagesContract.URL, "https://www.paymaya.com/privacy/?in_app=true");
        bundle.putBoolean("limit_links", false);
        bundle.putBoolean("use_web_title", false);
        bundle.putBoolean("has_session", zB);
        webFragment.setArguments(bundle);
        dataPrivacyActivity.f14475n = dataPrivacyActivity.getString(R.string.pma_label_privacy_policy);
        AbstractC1236z.h(dataPrivacyActivity, R.id.pma_activity_data_privacy_container, webFragment);
    }

    public final void s1() {
        C1220i c1220i = this.f10245B;
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(m1());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.VIEW_TERMS);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put("source", this.f14492W);
        c1220i.c(activity, c1219hD);
        e eVar = this.f14493X;
        if (eVar != null) {
            DataPrivacyActivity dataPrivacyActivity = (DataPrivacyActivity) eVar;
            boolean zB = j.b(dataPrivacyActivity.f14474l, "settings");
            WebFragment webFragment = new WebFragment();
            Bundle bundle = new Bundle();
            bundle.putString(ImagesContract.URL, "https://www.paymaya.com/terms-and-condition/?in_app=true");
            bundle.putBoolean("limit_links", false);
            bundle.putBoolean("use_web_title", false);
            bundle.putBoolean("has_session", zB);
            webFragment.setArguments(bundle);
            dataPrivacyActivity.f14475n = dataPrivacyActivity.getString(R.string.pma_label_terms_and_conditions);
            AbstractC1236z.h(dataPrivacyActivity, R.id.pma_activity_data_privacy_container, webFragment);
        }
    }
}
