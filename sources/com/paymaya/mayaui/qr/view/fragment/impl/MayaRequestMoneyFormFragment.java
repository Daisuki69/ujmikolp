package com.paymaya.mayaui.qr.view.fragment.impl;

import B5.i;
import G5.C0256f;
import G5.InterfaceC0254d;
import G5.t;
import Ia.b;
import Ja.f;
import Ma.c;
import N5.C0462k;
import Na.o;
import O5.a;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.TransferAppLink;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.qr.view.activity.impl.MayaRequestMoneyActivity;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaRequestMoneyFormFragment;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;
import y5.AbstractC2509a;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaRequestMoneyFormFragment extends BaseFragment implements c, t, InterfaceC0254d {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0462k f13612S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public SwitchCompat f13613T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public MayaInputLayout f13614U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public AppCompatEditText f13615V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public HtmlTextView f13616W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Group f13617X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public SwitchCompat f13618Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public MayaInputLayout f13619Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public AppCompatEditText f13620a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Group f13621b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Button f13622c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Toolbar f13623d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public C0256f f13624e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final InterfaceC1033d f13625f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final InterfaceC1033d f13626g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public f f13627h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public o f13628i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f13629j0;

    public MayaRequestMoneyFormFragment() {
        final int i = 0;
        this.f13625f0 = C1034e.b(new Function0(this) { // from class: Na.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRequestMoneyFormFragment f4368b;

            {
                this.f4368b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ColorStateList.valueOf(C.C(this.f4368b.getContext()));
                    default:
                        return this.f4368b.requireContext().getColorStateList(R.color.pma_text_color_red_error);
                }
            }
        });
        final int i4 = 1;
        this.f13626g0 = C1034e.b(new Function0(this) { // from class: Na.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRequestMoneyFormFragment f4368b;

            {
                this.f4368b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return ColorStateList.valueOf(C.C(this.f4368b.getContext()));
                    default:
                        return this.f4368b.requireContext().getColorStateList(R.color.pma_text_color_red_error);
                }
            }
        });
    }

    public static final void s1(MayaRequestMoneyFormFragment mayaRequestMoneyFormFragment) {
        String string;
        C0256f c0256f = mayaRequestMoneyFormFragment.f13624e0;
        if (c0256f != null) {
            c0256f.a();
        }
        f fVar = (f) mayaRequestMoneyFormFragment.r1();
        SwitchCompat switchCompat = ((MayaRequestMoneyFormFragment) ((c) fVar.c.get())).f13613T;
        if (switchCompat == null) {
            j.n("mSwitchAmount");
            throw null;
        }
        boolean zIsChecked = switchCompat.isChecked();
        double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (zIsChecked) {
            AppCompatEditText appCompatEditText = ((MayaRequestMoneyFormFragment) ((c) fVar.c.get())).f13615V;
            if (appCompatEditText == null) {
                j.n("mEditTextAmount");
                throw null;
            }
            String string2 = C2576A.b0(z.t(z.t(z.t(String.valueOf(appCompatEditText.getText()), "₱", ""), Global.BLANK, ""), ",", "")).toString();
            if (string2 != null) {
                d10 = Double.parseDouble(string2);
            }
        }
        SwitchCompat switchCompat2 = ((MayaRequestMoneyFormFragment) ((c) fVar.c.get())).f13618Y;
        if (switchCompat2 == null) {
            j.n("mSwitchMessage");
            throw null;
        }
        if (switchCompat2.isChecked()) {
            AppCompatEditText appCompatEditText2 = ((MayaRequestMoneyFormFragment) ((c) fVar.c.get())).f13620a0;
            if (appCompatEditText2 == null) {
                j.n("mEditTextMessage");
                throw null;
            }
            string = C2576A.b0(String.valueOf(appCompatEditText2.getText())).toString();
        } else {
            string = null;
        }
        TransferAppLink transferAppLinkBuild = TransferAppLink.sBuilder().mAmount(C.u(Double.valueOf(d10))).mCurrency("PHP").mAccountType("PAYMAYA").mRecipient(fVar.f2505d.r()).mMessage(string).build();
        c cVar = (c) fVar.c.get();
        j.d(transferAppLinkBuild);
        MayaRequestMoneyFormFragment mayaRequestMoneyFormFragment2 = (MayaRequestMoneyFormFragment) cVar;
        mayaRequestMoneyFormFragment2.getClass();
        Bundle arguments = mayaRequestMoneyFormFragment2.getArguments();
        if (arguments != null) {
            arguments.getBoolean("has_generated_new_qr", false);
        }
        FragmentActivity fragmentActivityRequireActivity = mayaRequestMoneyFormFragment2.requireActivity();
        AppCompatEditText appCompatEditText3 = mayaRequestMoneyFormFragment2.f13615V;
        if (appCompatEditText3 == null) {
            j.n("mEditTextAmount");
            throw null;
        }
        AppCompatEditText appCompatEditText4 = mayaRequestMoneyFormFragment2.f13620a0;
        if (appCompatEditText4 == null) {
            j.n("mEditTextMessage");
            throw null;
        }
        View[] viewArr = {appCompatEditText3, appCompatEditText4};
        for (int i = 0; i < 2; i++) {
            C.Q(fragmentActivityRequireActivity, viewArr[i]);
        }
        o oVar = mayaRequestMoneyFormFragment2.f13628i0;
        if (oVar != null) {
            MayaRequestMoneyActivity mayaRequestMoneyActivity = (MayaRequestMoneyActivity) oVar;
            mayaRequestMoneyActivity.getSupportFragmentManager().popBackStack();
            MayaRequestMoneyFragment mayaRequestMoneyFragment = new MayaRequestMoneyFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("transfer_app_link", transferAppLinkBuild);
            mayaRequestMoneyFragment.setArguments(bundle);
            AbstractC1236z.h(mayaRequestMoneyActivity, R.id.fragment_container, mayaRequestMoneyFragment);
        }
    }

    @Override // G5.InterfaceC0254d
    public final void T() {
        AppCompatEditText appCompatEditText = this.f13615V;
        if (appCompatEditText == null) {
            j.n("mEditTextAmount");
            throw null;
        }
        ViewCompat.setBackgroundTintList(appCompatEditText, (ColorStateList) this.f13626g0.getValue());
        this.f13629j0 = false;
        ((f) r1()).k();
        MayaInputLayout mayaInputLayout = this.f13614U;
        if (mayaInputLayout == null) {
            j.n("mLayoutAmount");
            throw null;
        }
        mayaInputLayout.r();
        MayaInputLayout mayaInputLayout2 = this.f13614U;
        if (mayaInputLayout2 == null) {
            j.n("mLayoutAmount");
            throw null;
        }
        mayaInputLayout2.p();
        MayaInputLayout mayaInputLayout3 = this.f13614U;
        if (mayaInputLayout3 != null) {
            mayaInputLayout3.g();
        } else {
            j.n("mLayoutAmount");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.CUSTOMIZE;
    }

    @Override // G5.t
    public final void m(String str, View view) {
        if (j.b(str, "AccountLimits")) {
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.ACCOUNT_LIMITS);
            o1(c1219hH);
            o oVar = this.f13628i0;
            if (oVar != null) {
                MayaRequestMoneyActivity mayaRequestMoneyActivity = (MayaRequestMoneyActivity) oVar;
                mayaRequestMoneyActivity.n1();
                i.b(mayaRequestMoneyActivity);
            }
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.qr.view.fragment.impl.MayaRequestMoneyFormFragment.MayaRequestMoneyFormFragmentListener");
        this.f13628i0 = (o) activity;
        a aVar = W4.a.e().v().f4753a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f13627h0 = new f((com.paymaya.data.preference.a) aVar.e.get());
        ((AbstractC2509a) r1()).h(this);
        this.f10249R = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_request_money_form, viewGroup, false);
        int i = R.id.amount_container;
        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.amount_container)) != null) {
            i = R.id.amount_group;
            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.amount_group);
            if (group != null) {
                i = R.id.amount_text;
                MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.amount_text);
                if (mayaInputLayout != null) {
                    i = R.id.form_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.form_container);
                    if (constraintLayout != null) {
                        i = R.id.generate_button;
                        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.generate_button);
                        if (button != null) {
                            i = R.id.include_message_icon;
                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.include_message_icon)) != null) {
                                i = R.id.include_message_switch;
                                SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(viewInflate, R.id.include_message_switch);
                                if (switchCompat != null) {
                                    i = R.id.include_message_text;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.include_message_text)) != null) {
                                        i = R.id.information_icon;
                                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.information_icon)) != null) {
                                            i = R.id.message_container;
                                            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.message_container)) != null) {
                                                i = R.id.message_group;
                                                Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.message_group);
                                                if (group2 != null) {
                                                    i = R.id.message_text;
                                                    MayaInputLayout mayaInputLayout2 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.message_text);
                                                    if (mayaInputLayout2 != null) {
                                                        i = R.id.refer_to_account_limits_text;
                                                        HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.refer_to_account_limits_text);
                                                        if (htmlTextView != null) {
                                                            i = R.id.request_money_form_appbar;
                                                            if (((AppBarLayout) ViewBindings.findChildViewById(viewInflate, R.id.request_money_form_appbar)) != null) {
                                                                i = R.id.request_money_form_collapsing_toolbar;
                                                                if (((CollapsingToolbarLayout) ViewBindings.findChildViewById(viewInflate, R.id.request_money_form_collapsing_toolbar)) != null) {
                                                                    i = R.id.request_money_form_scroll_view;
                                                                    if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.request_money_form_scroll_view)) != null) {
                                                                        i = R.id.request_money_form_toolbar;
                                                                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, R.id.request_money_form_toolbar);
                                                                        if (toolbar != null) {
                                                                            i = R.id.specify_amount_icon;
                                                                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.specify_amount_icon)) != null) {
                                                                                i = R.id.specify_amount_switch;
                                                                                SwitchCompat switchCompat2 = (SwitchCompat) ViewBindings.findChildViewById(viewInflate, R.id.specify_amount_switch);
                                                                                if (switchCompat2 != null) {
                                                                                    i = R.id.specify_amount_text;
                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.specify_amount_text)) != null) {
                                                                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                                                                                        this.f13612S = new C0462k(coordinatorLayout, group, mayaInputLayout, constraintLayout, button, switchCompat, group2, mayaInputLayout2, htmlTextView, toolbar, switchCompat2);
                                                                                        j.f(coordinatorLayout, "getRoot(...)");
                                                                                        return coordinatorLayout;
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
        ((AbstractC2509a) r1()).i();
        super.onDestroy();
        this.f13612S = null;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o oVar = this.f13628i0;
        if (oVar != null) {
            ((MayaRequestMoneyActivity) oVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        j.d(this.f13612S);
        C0462k c0462k = this.f13612S;
        j.d(c0462k);
        this.f13613T = (SwitchCompat) c0462k.f4134k;
        C0462k c0462k2 = this.f13612S;
        j.d(c0462k2);
        this.f13614U = (MayaInputLayout) c0462k2.f4133g;
        C0462k c0462k3 = this.f13612S;
        j.d(c0462k3);
        this.f13615V = ((MayaInputLayout) c0462k3.f4133g).getInputEditText();
        C0462k c0462k4 = this.f13612S;
        j.d(c0462k4);
        this.f13616W = (HtmlTextView) c0462k4.h;
        C0462k c0462k5 = this.f13612S;
        j.d(c0462k5);
        this.f13617X = (Group) c0462k5.f;
        C0462k c0462k6 = this.f13612S;
        j.d(c0462k6);
        this.f13618Y = (SwitchCompat) c0462k6.f4132d;
        C0462k c0462k7 = this.f13612S;
        j.d(c0462k7);
        this.f13619Z = (MayaInputLayout) c0462k7.i;
        C0462k c0462k8 = this.f13612S;
        j.d(c0462k8);
        this.f13620a0 = ((MayaInputLayout) c0462k8.i).getInputEditText();
        C0462k c0462k9 = this.f13612S;
        j.d(c0462k9);
        this.f13621b0 = (Group) c0462k9.e;
        C0462k c0462k10 = this.f13612S;
        j.d(c0462k10);
        this.f13622c0 = (Button) c0462k10.c;
        C0462k c0462k11 = this.f13612S;
        j.d(c0462k11);
        this.f13623d0 = (Toolbar) c0462k11.j;
        SwitchCompat switchCompat = this.f13613T;
        if (switchCompat == null) {
            j.n("mSwitchAmount");
            throw null;
        }
        final int i = 0;
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: Na.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRequestMoneyFormFragment f4370b;

            {
                this.f4370b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                switch (i) {
                    case 0:
                        MayaRequestMoneyFormFragment mayaRequestMoneyFormFragment = this.f4370b;
                        Group group = mayaRequestMoneyFormFragment.f13617X;
                        if (group == null) {
                            kotlin.jvm.internal.j.n(numX49.tnTj78("bdVb"));
                            throw null;
                        }
                        group.setVisibility(z4 ? 0 : 8);
                        ((Ja.f) mayaRequestMoneyFormFragment.r1()).k();
                        return;
                    default:
                        MayaRequestMoneyFormFragment mayaRequestMoneyFormFragment2 = this.f4370b;
                        Group group2 = mayaRequestMoneyFormFragment2.f13621b0;
                        if (group2 == null) {
                            kotlin.jvm.internal.j.n(numX49.tnTj78("bdVP"));
                            throw null;
                        }
                        group2.setVisibility(z4 ? 0 : 8);
                        ((Ja.f) mayaRequestMoneyFormFragment2.r1()).k();
                        return;
                }
            }
        });
        SwitchCompat switchCompat2 = this.f13618Y;
        if (switchCompat2 == null) {
            j.n("mSwitchMessage");
            throw null;
        }
        final int i4 = 1;
        switchCompat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: Na.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRequestMoneyFormFragment f4370b;

            {
                this.f4370b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                switch (i4) {
                    case 0:
                        MayaRequestMoneyFormFragment mayaRequestMoneyFormFragment = this.f4370b;
                        Group group = mayaRequestMoneyFormFragment.f13617X;
                        if (group == null) {
                            kotlin.jvm.internal.j.n(numX49.tnTj78("bdVb"));
                            throw null;
                        }
                        group.setVisibility(z4 ? 0 : 8);
                        ((Ja.f) mayaRequestMoneyFormFragment.r1()).k();
                        return;
                    default:
                        MayaRequestMoneyFormFragment mayaRequestMoneyFormFragment2 = this.f4370b;
                        Group group2 = mayaRequestMoneyFormFragment2.f13621b0;
                        if (group2 == null) {
                            kotlin.jvm.internal.j.n(numX49.tnTj78("bdVP"));
                            throw null;
                        }
                        group2.setVisibility(z4 ? 0 : 8);
                        ((Ja.f) mayaRequestMoneyFormFragment2.r1()).k();
                        return;
                }
            }
        });
        Toolbar toolbar = this.f13623d0;
        if (toolbar == null) {
            j.n("mToolbar");
            throw null;
        }
        final int i6 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: Na.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRequestMoneyFormFragment f4372b;

            {
                this.f4372b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaRequestMoneyFormFragment mayaRequestMoneyFormFragment = this.f4372b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaRequestMoneyFormFragment.requireActivity().onBackPressed();
                            return;
                        } finally {
                        }
                    default:
                        MayaRequestMoneyFormFragment mayaRequestMoneyFormFragment2 = this.f4372b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRequestMoneyFormFragment.s1(mayaRequestMoneyFormFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        ((f) r1()).j();
        HtmlTextView htmlTextView = this.f13616W;
        if (htmlTextView == null) {
            j.n("mHtmlTextAccountLimits");
            throw null;
        }
        htmlTextView.setOnLinkClickListener(this);
        Button button = this.f13622c0;
        if (button == null) {
            j.n("mButtonGenerate");
            throw null;
        }
        final int i10 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: Na.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRequestMoneyFormFragment f4372b;

            {
                this.f4372b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        MayaRequestMoneyFormFragment mayaRequestMoneyFormFragment = this.f4372b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaRequestMoneyFormFragment.requireActivity().onBackPressed();
                            return;
                        } finally {
                        }
                    default:
                        MayaRequestMoneyFormFragment mayaRequestMoneyFormFragment2 = this.f4372b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRequestMoneyFormFragment.s1(mayaRequestMoneyFormFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    public final b r1() {
        f fVar = this.f13627h0;
        if (fVar != null) {
            return fVar;
        }
        j.n("mRequestMoneyFormFragmentPresenter");
        throw null;
    }

    @Override // G5.InterfaceC0254d
    public final void u() {
        AppCompatEditText appCompatEditText = this.f13615V;
        if (appCompatEditText == null) {
            j.n("mEditTextAmount");
            throw null;
        }
        ViewCompat.setBackgroundTintList(appCompatEditText, (ColorStateList) this.f13625f0.getValue());
        this.f13629j0 = true;
        ((f) r1()).k();
        MayaInputLayout mayaInputLayout = this.f13614U;
        if (mayaInputLayout == null) {
            j.n("mLayoutAmount");
            throw null;
        }
        mayaInputLayout.h();
        MayaInputLayout mayaInputLayout2 = this.f13614U;
        if (mayaInputLayout2 == null) {
            j.n("mLayoutAmount");
            throw null;
        }
        mayaInputLayout2.f();
        MayaInputLayout mayaInputLayout3 = this.f13614U;
        if (mayaInputLayout3 != null) {
            mayaInputLayout3.q();
        } else {
            j.n("mLayoutAmount");
            throw null;
        }
    }
}
