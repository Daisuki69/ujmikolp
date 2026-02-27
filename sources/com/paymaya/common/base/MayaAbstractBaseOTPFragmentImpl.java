package com.paymaya.common.base;

import B5.i;
import G5.t;
import N5.C;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import cj.C1110A;
import cj.C1132s;
import cj.I;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;
import io.flutter.plugins.firebase.core.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import y5.e;
import y5.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MayaAbstractBaseOTPFragmentImpl extends MayaBaseFragment implements t {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C f10258U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public HtmlTextView f10259V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Button f10260W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public HtmlTextView f10261X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Group f10262Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public HtmlTextView f10263Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f10264a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public List f10265b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public i f10266c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public k f10267d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public long f10268e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f10269f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f10270g0 = true;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final String[] f10271h0 = {"", "", "", "", "", ""};

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f10272i0;

    public final void G1() {
        Iterator<Integer> it = C1132s.e(H1()).iterator();
        while (it.hasNext()) {
            int iNextInt = ((I) it).nextInt();
            ((TextView) H1().get(iNextInt)).setSelected(false);
            ((TextView) H1().get(iNextInt)).setText(this.f10271h0[iNextInt]);
        }
    }

    public final List H1() {
        List list = this.f10265b0;
        if (list != null) {
            return list;
        }
        j.n("mDigitsTextViewList");
        throw null;
    }

    public final TextView I1() {
        TextView textView = this.f10264a0;
        if (textView != null) {
            return textView;
        }
        j.n("mHiddenRealTextView");
        throw null;
    }

    public final HtmlTextView J1() {
        HtmlTextView htmlTextView = this.f10259V;
        if (htmlTextView != null) {
            return htmlTextView;
        }
        j.n("mOTPSpielTextView");
        throw null;
    }

    public final HtmlTextView K1() {
        HtmlTextView htmlTextView = this.f10261X;
        if (htmlTextView != null) {
            return htmlTextView;
        }
        j.n("mResendCodeHtmlTextView");
        throw null;
    }

    public final String L1() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.f10271h0) {
            sb2.append(str);
        }
        String string = sb2.toString();
        j.f(string, "toString(...)");
        return string;
    }

    public abstract e M1();

    public void N1() {
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.OTP);
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.HELP_CENTER);
        c1220iO1.c(activity, c1219hD);
    }

    public final void O1(View view) {
        this.f10269f0 = H1().indexOf(view);
        R1();
        I1().requestFocus();
        if (!isAdded() || getView() == null) {
            return;
        }
        Object systemService = requireActivity().getSystemService("input_method");
        j.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(I1(), 1);
    }

    public void P1() {
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(U());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.RESEND);
        c1220iO1.c(activity, c1219hD);
    }

    public void Q1() {
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(U());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.PROCEED);
        c1220iO1.c(activity, c1219hD);
    }

    public final void R1() {
        G1();
        TextView textView = (TextView) C1110A.C(this.f10269f0, H1());
        if (textView != null) {
            textView.setSelected(true);
        }
    }

    public final void S1(String str) {
        for (int i = 0; i < 6; i++) {
            String strValueOf = String.valueOf(str.charAt(i));
            ((TextView) H1().get(i)).setText(strValueOf);
            this.f10271h0[i] = strValueOf;
        }
    }

    public final void T1() {
        K1().setOnLinkClickListener(this);
        HtmlTextView htmlTextView = this.f10263Z;
        if (htmlTextView != null) {
            htmlTextView.setOnLinkClickListener(this);
        } else {
            j.n("mHelpCenterDescriptionHtmlTextView");
            throw null;
        }
    }

    public final void U1() {
        k kVar = this.f10267d0;
        if (kVar != null) {
            kVar.cancel();
        }
        k kVar2 = new k(this, M1().d() - this.f10268e0);
        this.f10267d0 = kVar2;
        kVar2.start();
    }

    public final void V1() {
        k kVar = this.f10267d0;
        if (kVar != null) {
            kVar.cancel();
        }
    }

    @Override // G5.t
    public final void m(String link, View view) {
        j.g(link, "link");
        j.g(view, "view");
        if (!link.equals("Help")) {
            if (link.equals("ResendCode")) {
                P1();
                M1().b();
                U1();
                return;
            }
            return;
        }
        N1();
        i iVar = this.f10266c0;
        if (iVar != null) {
            iVar.x(getActivity(), "https://support.maya.ph/s/", Boolean.valueOf(this.f10270g0), false);
        } else {
            j.n("mFlowController");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_otp, viewGroup, false);
        ScrollView scrollView = (ScrollView) viewInflate;
        int i = R.id.digit_text_view_1;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.digit_text_view_1);
        if (textView != null) {
            i = R.id.digit_text_view_2;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.digit_text_view_2);
            if (textView2 != null) {
                i = R.id.digit_text_view_3;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.digit_text_view_3);
                if (textView3 != null) {
                    i = R.id.digit_text_view_4;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.digit_text_view_4);
                    if (textView4 != null) {
                        i = R.id.digit_text_view_5;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.digit_text_view_5);
                        if (textView5 != null) {
                            i = R.id.digit_text_view_6;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.digit_text_view_6);
                            if (textView6 != null) {
                                i = R.id.help_center_background_view;
                                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.help_center_background_view);
                                if (viewFindChildViewById != null) {
                                    i = R.id.help_center_bottom_space;
                                    if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.help_center_bottom_space)) != null) {
                                        i = R.id.help_center_constraint_group;
                                        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.help_center_constraint_group);
                                        if (group != null) {
                                            i = R.id.help_center_description_html_text_view;
                                            HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.help_center_description_html_text_view);
                                            if (htmlTextView != null) {
                                                i = R.id.help_center_icon_image_view;
                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.help_center_icon_image_view)) != null) {
                                                    i = R.id.help_center_left_guideline;
                                                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.help_center_left_guideline)) != null) {
                                                        i = R.id.help_center_right_guideline;
                                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.help_center_right_guideline)) != null) {
                                                            i = R.id.help_center_title_text_view;
                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.help_center_title_text_view)) != null) {
                                                                i = R.id.help_center_top_space;
                                                                if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.help_center_top_space)) != null) {
                                                                    i = R.id.hidden_real_text_view;
                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.hidden_real_text_view);
                                                                    if (textView7 != null) {
                                                                        i = R.id.otp_spiel_text_view;
                                                                        HtmlTextView htmlTextView2 = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.otp_spiel_text_view);
                                                                        if (htmlTextView2 != null) {
                                                                            i = R.id.resend_code_html_text_view;
                                                                            HtmlTextView htmlTextView3 = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.resend_code_html_text_view);
                                                                            if (htmlTextView3 != null) {
                                                                                i = R.id.title_header_text_view;
                                                                                if (((MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.title_header_text_view)) != null) {
                                                                                    i = R.id.verify_button;
                                                                                    Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.verify_button);
                                                                                    if (button != null) {
                                                                                        this.f10258U = new C(scrollView, textView, textView2, textView3, textView4, textView5, textView6, viewFindChildViewById, group, htmlTextView, textView7, htmlTextView2, htmlTextView3, button);
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
    public void onViewCreated(View view, Bundle bundle) {
        final int i = 1;
        final int i4 = 0;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C c = this.f10258U;
        j.d(c);
        this.f10259V = (HtmlTextView) c.m;
        C c10 = this.f10258U;
        j.d(c10);
        this.f10260W = c10.f3560d;
        C c11 = this.f10258U;
        j.d(c11);
        this.f10261X = (HtmlTextView) c11.f3564n;
        C c12 = this.f10258U;
        j.d(c12);
        this.f10262Y = (Group) c12.j;
        C c13 = this.f10258U;
        j.d(c13);
        this.f10263Z = (HtmlTextView) c13.f3562k;
        C c14 = this.f10258U;
        j.d(c14);
        this.f10264a0 = (TextView) c14.f3563l;
        C c15 = this.f10258U;
        j.d(c15);
        C c16 = this.f10258U;
        j.d(c16);
        C c17 = this.f10258U;
        j.d(c17);
        C c18 = this.f10258U;
        j.d(c18);
        C c19 = this.f10258U;
        j.d(c19);
        C c20 = this.f10258U;
        j.d(c20);
        List listG = C1132s.g((TextView) c15.f3559b, (TextView) c16.f, (TextView) c17.f3561g, (TextView) c18.e, (TextView) c19.h, (TextView) c20.i);
        j.g(listG, "<set-?>");
        this.f10265b0 = listG;
        I1().setRawInputType(3);
        I1().setOnKeyListener(new View.OnKeyListener() { // from class: y5.h
            /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
                java.lang.UnsupportedOperationException
                	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
                	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
                	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
                */
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(android.view.View r4, int r5, android.view.KeyEvent r6) {
                /*
                    Method dump skipped, instruction units count: 216
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: y5.h.onKey(android.view.View, int, android.view.KeyEvent):boolean");
            }
        });
        Button button = this.f10260W;
        if (button == null) {
            j.n("mVerifyButton");
            throw null;
        }
        button.setOnClickListener(new View.OnClickListener(this) { // from class: y5.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAbstractBaseOTPFragmentImpl f21066b;

            {
                this.f21066b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaAbstractBaseOTPFragmentImpl mayaAbstractBaseOTPFragmentImpl = this.f21066b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAbstractBaseOTPFragmentImpl.Q1();
                            mayaAbstractBaseOTPFragmentImpl.M1().c();
                            return;
                        } finally {
                        }
                    default:
                        MayaAbstractBaseOTPFragmentImpl mayaAbstractBaseOTPFragmentImpl2 = this.f21066b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAbstractBaseOTPFragmentImpl2.O1(view2);
                            return;
                        } finally {
                        }
                }
            }
        });
        Iterator it = H1().iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setOnClickListener(new View.OnClickListener(this) { // from class: y5.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MayaAbstractBaseOTPFragmentImpl f21066b;

                {
                    this.f21066b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i) {
                        case 0:
                            MayaAbstractBaseOTPFragmentImpl mayaAbstractBaseOTPFragmentImpl = this.f21066b;
                            Callback.onClick_enter(view2);
                            try {
                                mayaAbstractBaseOTPFragmentImpl.Q1();
                                mayaAbstractBaseOTPFragmentImpl.M1().c();
                                return;
                            } finally {
                            }
                        default:
                            MayaAbstractBaseOTPFragmentImpl mayaAbstractBaseOTPFragmentImpl2 = this.f21066b;
                            Callback.onClick_enter(view2);
                            try {
                                mayaAbstractBaseOTPFragmentImpl2.O1(view2);
                                return;
                            } finally {
                            }
                    }
                }
            });
        }
        TextView textView = (TextView) C1110A.A(H1());
        textView.postDelayed(new a(21, this, textView), 100L);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public EnumC1215d u1() {
        return EnumC1215d.OTP;
    }
}
