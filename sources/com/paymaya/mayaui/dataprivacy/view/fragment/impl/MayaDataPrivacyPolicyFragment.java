package com.paymaya.mayaui.dataprivacy.view.fragment.impl;

import Bb.a;
import M8.D2;
import N5.C0435a;
import R7.c;
import S7.h;
import S7.i;
import Uh.d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyPolicyFragment;
import dOYHB6.yFtIp6.svM7M6;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaDataPrivacyPolicyFragment extends MayaBaseFragment implements c {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public a f12293U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C0435a f12294V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public AppCompatTextView f12295W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public AppCompatTextView f12296X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Button f12297Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f12298Z;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public i f12301c0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f12299a0 = "";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f12300b0 = "";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final D2 f12302d0 = new D2(this, 7);

    public static final void H1(MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment) {
        C1219h c1219hE;
        int i = 3;
        a aVarG1 = mayaDataPrivacyPolicyFragment.G1();
        String str = ((MayaDataPrivacyPolicyFragment) ((c) aVarG1.c.get())).f12299a0;
        if (j.b(str, "login")) {
            c1219hE = C1219h.e(AbstractC1213b.l(3));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("page_name", ((MayaDataPrivacyPolicyFragment) ((c) aVarG1.c.get())).f12300b0);
        } else if (j.b(str, "registration")) {
            c1219hE = C1219h.e(AbstractC1213b.o(4));
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("source_page", ((MayaDataPrivacyPolicyFragment) ((c) aVarG1.c.get())).f12300b0);
        } else {
            c1219hE = null;
        }
        MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment2 = (MayaDataPrivacyPolicyFragment) ((c) aVarG1.c.get());
        if (c1219hE != null) {
            C1220i c1220iO1 = mayaDataPrivacyPolicyFragment2.o1();
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            AppCompatTextView appCompatTextView = mayaDataPrivacyPolicyFragment2.f12296X;
            if (appCompatTextView == null) {
                j.n("mTextViewPrivacyPolicy");
                throw null;
            }
            c1219hE.j.put("button", appCompatTextView.getText().toString());
            c1219hE.i();
            c1220iO1.b(c1219hE);
        } else {
            mayaDataPrivacyPolicyFragment2.getClass();
        }
        i iVar = mayaDataPrivacyPolicyFragment.f12301c0;
        if (iVar != null) {
            String string = mayaDataPrivacyPolicyFragment.getString(R.string.maya_label_data_privacy_privacy_policy);
            j.f(string, "getString(...)");
            iVar.e(string, "https://www.paymaya.com/privacy/?in_app=true", new h(mayaDataPrivacyPolicyFragment, 2), new h(mayaDataPrivacyPolicyFragment, i));
        }
    }

    public static final void I1(MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment) {
        C1219h c1219hE;
        a aVarG1 = mayaDataPrivacyPolicyFragment.G1();
        String str = ((MayaDataPrivacyPolicyFragment) ((c) aVarG1.c.get())).f12299a0;
        if (j.b(str, "login")) {
            c1219hE = C1219h.e(AbstractC1213b.l(3));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("page_name", ((MayaDataPrivacyPolicyFragment) ((c) aVarG1.c.get())).f12300b0);
        } else if (j.b(str, "registration")) {
            c1219hE = C1219h.e(AbstractC1213b.o(3));
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("source_page", ((MayaDataPrivacyPolicyFragment) ((c) aVarG1.c.get())).f12300b0);
        } else {
            c1219hE = null;
        }
        MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment2 = (MayaDataPrivacyPolicyFragment) ((c) aVarG1.c.get());
        if (c1219hE != null) {
            C1220i c1220iO1 = mayaDataPrivacyPolicyFragment2.o1();
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            Button button = mayaDataPrivacyPolicyFragment2.f12297Y;
            if (button == null) {
                j.n("mContinueButton");
                throw null;
            }
            String string = button.getText().toString();
            HashMap map = c1219hE.j;
            map.put("button", string);
            map.put("destination_page", "Data personalization");
            c1219hE.i();
            c1220iO1.b(c1219hE);
        } else {
            mayaDataPrivacyPolicyFragment2.getClass();
        }
        i iVar = mayaDataPrivacyPolicyFragment.f12301c0;
        if (iVar != null) {
            iVar.n0(mayaDataPrivacyPolicyFragment.f12300b0);
        }
    }

    public static final void J1(MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment) {
        C1219h c1219hE;
        a aVarG1 = mayaDataPrivacyPolicyFragment.G1();
        String str = ((MayaDataPrivacyPolicyFragment) ((c) aVarG1.c.get())).f12299a0;
        if (j.b(str, "login")) {
            c1219hE = C1219h.e(AbstractC1213b.l(3));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("page_name", ((MayaDataPrivacyPolicyFragment) ((c) aVarG1.c.get())).f12300b0);
        } else if (j.b(str, "registration")) {
            c1219hE = C1219h.e(AbstractC1213b.o(4));
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("source_page", ((MayaDataPrivacyPolicyFragment) ((c) aVarG1.c.get())).f12300b0);
        } else {
            c1219hE = null;
        }
        MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment2 = (MayaDataPrivacyPolicyFragment) ((c) aVarG1.c.get());
        if (c1219hE != null) {
            C1220i c1220iO1 = mayaDataPrivacyPolicyFragment2.o1();
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            AppCompatTextView appCompatTextView = mayaDataPrivacyPolicyFragment2.f12295W;
            if (appCompatTextView == null) {
                j.n("mTextViewTermsAndConditions");
                throw null;
            }
            c1219hE.j.put("button", appCompatTextView.getText().toString());
            c1219hE.i();
            c1220iO1.b(c1219hE);
        } else {
            mayaDataPrivacyPolicyFragment2.getClass();
        }
        i iVar = mayaDataPrivacyPolicyFragment.f12301c0;
        if (iVar != null) {
            String string = mayaDataPrivacyPolicyFragment.getString(R.string.maya_label_data_privacy_terms_and_conditions);
            j.f(string, "getString(...)");
            iVar.e(string, "https://www.paymaya.com/terms-and-condition/?in_app=true", new h(mayaDataPrivacyPolicyFragment, 0), new h(mayaDataPrivacyPolicyFragment, 1));
        }
    }

    public final a G1() {
        a aVar = this.f12293U;
        if (aVar != null) {
            return aVar;
        }
        j.n("mMayaDataPrivacyPolicyFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().l().f4755a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        d sessionSubject = (d) aVar.f4748y.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(sessionSubject, "sessionSubject");
        j.g(preference, "preference");
        this.f12293U = new a(sessionSubject, preference);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("source")) == null) {
            string = "";
        }
        this.f12299a0 = string;
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyPolicyFragment.MayaDataPrivacyPolicyFragmentListener");
        this.f12301c0 = (i) activity;
        G1().h(this);
        a aVarG1 = G1();
        boolean zE = C.e(svM7M6.getString(aVarG1.e.f11330b, "key_privacy_policy_version", ""));
        if ((j.b(((MayaDataPrivacyPolicyFragment) ((c) aVarG1.c.get())).f12299a0, "login") || j.b(((MayaDataPrivacyPolicyFragment) ((c) aVarG1.c.get())).f12299a0, "session_expired")) && !zE) {
            c cVar = (c) aVarG1.c.get();
            String string2 = svM7M6.getString(aVarG1.e.f11330b, "key_privacy_policy_version", "");
            j.f(string2, "getPrivacyPolicyVersion(...)");
            MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment = (MayaDataPrivacyPolicyFragment) cVar;
            mayaDataPrivacyPolicyFragment.getClass();
            String string3 = mayaDataPrivacyPolicyFragment.getString(R.string.maya_label_data_privacy_title_with_version_header, string2);
            j.f(string3, "getString(...)");
            mayaDataPrivacyPolicyFragment.f12300b0 = string3;
        } else {
            MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment2 = (MayaDataPrivacyPolicyFragment) ((c) aVarG1.c.get());
            String string4 = mayaDataPrivacyPolicyFragment2.getString(R.string.maya_label_data_privacy_title_header);
            j.f(string4, "getString(...)");
            mayaDataPrivacyPolicyFragment2.f12300b0 = string4;
        }
        a aVarG12 = G1();
        if (j.b(((MayaDataPrivacyPolicyFragment) ((c) aVarG12.c.get())).f12299a0, "login")) {
            MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment3 = (MayaDataPrivacyPolicyFragment) ((c) aVarG12.c.get());
            mayaDataPrivacyPolicyFragment3.getClass();
            C1219h c1219hE = C1219h.e(AbstractC1213b.A(3).concat("_SCREEN"));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("page_name", mayaDataPrivacyPolicyFragment3.f12300b0);
            c1219hE.i();
            mayaDataPrivacyPolicyFragment3.f10337Q = c1219hE;
            mayaDataPrivacyPolicyFragment3.f10338R = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_data_privacy_policy, viewGroup, false);
        int i = R.id.click_continue_disclaimer_text_view;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.click_continue_disclaimer_text_view);
        if (appCompatTextView != null) {
            ScrollView scrollView = (ScrollView) viewInflate;
            i = R.id.continue_button;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.continue_button);
            if (button != null) {
                i = R.id.divider_view;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.divider_view);
                if (viewFindChildViewById != null) {
                    i = R.id.documents_container_card_view;
                    if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.documents_container_card_view)) != null) {
                        i = R.id.information_icon_image_view;
                        if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.information_icon_image_view)) != null) {
                            i = R.id.instructions_text_view;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.instructions_text_view)) != null) {
                                i = R.id.privacy_policy_text_view;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.privacy_policy_text_view);
                                if (appCompatTextView2 != null) {
                                    i = R.id.subtitle_text_view;
                                    if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.subtitle_text_view)) != null) {
                                        i = R.id.terms_and_conditions_text_view;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.terms_and_conditions_text_view);
                                        if (appCompatTextView3 != null) {
                                            i = R.id.title_header_text_view;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_header_text_view);
                                            if (textView != null) {
                                                this.f12294V = new C0435a(scrollView, appCompatTextView, button, viewFindChildViewById, appCompatTextView2, appCompatTextView3, textView);
                                                return scrollView;
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
        this.f12294V = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        i iVar = this.f12301c0;
        if (iVar != null) {
            iVar.Q(this);
        }
        a aVarG1 = G1();
        if (aVarG1.e.e().isPartnerOnboardingEnabled()) {
            String strP = aVarG1.e.p();
            if (strP == null) {
                strP = "";
            }
            String strQ = aVarG1.e.q();
            String str = strQ != null ? strQ : "";
            if (strP.length() > 0) {
                MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment = (MayaDataPrivacyPolicyFragment) ((c) aVarG1.c.get());
                mayaDataPrivacyPolicyFragment.getClass();
                C1220i c1220iO1 = mayaDataPrivacyPolicyFragment.o1();
                C1219h c1219h = new C1219h();
                c1219h.p(EnumC1215d.DATA_PRIVACY);
                c1219h.n(2);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219h.j.put("partner", strP);
                c1219h.j.put("branch", str);
                c1219h.j.put("kyc_level", "0");
                c1219h.i();
                c1220iO1.b(c1219h);
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("source", this.f12299a0);
        super.onStop();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        x1(this.f12302d0);
        C0435a c0435a = this.f12294V;
        j.d(c0435a);
        this.f12295W = (AppCompatTextView) c0435a.f4048d;
        C0435a c0435a2 = this.f12294V;
        j.d(c0435a2);
        this.f12296X = (AppCompatTextView) c0435a2.c;
        j.d(this.f12294V);
        C0435a c0435a3 = this.f12294V;
        j.d(c0435a3);
        this.f12297Y = (Button) c0435a3.e;
        C0435a c0435a4 = this.f12294V;
        j.d(c0435a4);
        this.f12298Z = (TextView) c0435a4.f4049g;
        a aVarG1 = G1();
        if (j.b(((MayaDataPrivacyPolicyFragment) ((c) aVarG1.c.get())).f12299a0, "login")) {
            MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment = (MayaDataPrivacyPolicyFragment) ((c) aVarG1.c.get());
            C1220i c1220iO1 = mayaDataPrivacyPolicyFragment.o1();
            C1219h c1219hE = C1219h.e(AbstractC1213b.A(3).concat("_VIEWED"));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String string = C2576A.b0(Ke.d.a(mayaDataPrivacyPolicyFragment.f12299a0)).toString();
            HashMap map = c1219hE.j;
            map.put("source_page", string);
            map.put("page_name", mayaDataPrivacyPolicyFragment.f12300b0);
            c1219hE.i();
            c1220iO1.b(c1219hE);
        }
        TextView textView = this.f12298Z;
        if (textView == null) {
            j.n("mHeaderTextView");
            throw null;
        }
        textView.setText(this.f12300b0);
        Button button = this.f12297Y;
        if (button == null) {
            j.n("mContinueButton");
            throw null;
        }
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: S7.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaDataPrivacyPolicyFragment f5682b;

            {
                this.f5682b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment2 = this.f5682b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDataPrivacyPolicyFragment.I1(mayaDataPrivacyPolicyFragment2);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment3 = this.f5682b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDataPrivacyPolicyFragment.J1(mayaDataPrivacyPolicyFragment3);
                            return;
                        } finally {
                        }
                    default:
                        MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment4 = this.f5682b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDataPrivacyPolicyFragment.H1(mayaDataPrivacyPolicyFragment4);
                            return;
                        } finally {
                        }
                }
            }
        });
        AppCompatTextView appCompatTextView = this.f12295W;
        if (appCompatTextView == null) {
            j.n("mTextViewTermsAndConditions");
            throw null;
        }
        final int i4 = 1;
        appCompatTextView.setOnClickListener(new View.OnClickListener(this) { // from class: S7.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaDataPrivacyPolicyFragment f5682b;

            {
                this.f5682b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment2 = this.f5682b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDataPrivacyPolicyFragment.I1(mayaDataPrivacyPolicyFragment2);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment3 = this.f5682b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDataPrivacyPolicyFragment.J1(mayaDataPrivacyPolicyFragment3);
                            return;
                        } finally {
                        }
                    default:
                        MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment4 = this.f5682b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDataPrivacyPolicyFragment.H1(mayaDataPrivacyPolicyFragment4);
                            return;
                        } finally {
                        }
                }
            }
        });
        AppCompatTextView appCompatTextView2 = this.f12296X;
        if (appCompatTextView2 == null) {
            j.n("mTextViewPrivacyPolicy");
            throw null;
        }
        final int i6 = 2;
        appCompatTextView2.setOnClickListener(new View.OnClickListener(this) { // from class: S7.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaDataPrivacyPolicyFragment f5682b;

            {
                this.f5682b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment2 = this.f5682b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDataPrivacyPolicyFragment.I1(mayaDataPrivacyPolicyFragment2);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment3 = this.f5682b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDataPrivacyPolicyFragment.J1(mayaDataPrivacyPolicyFragment3);
                            return;
                        } finally {
                        }
                    default:
                        MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment4 = this.f5682b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDataPrivacyPolicyFragment.H1(mayaDataPrivacyPolicyFragment4);
                            return;
                        } finally {
                        }
                }
            }
        });
    }
}
