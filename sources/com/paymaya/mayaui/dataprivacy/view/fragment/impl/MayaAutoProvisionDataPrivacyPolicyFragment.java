package com.paymaya.mayaui.dataprivacy.view.fragment.impl;

import Ke.d;
import N5.F;
import R7.a;
import S5.c;
import S7.b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaAutoProvisionDataPrivacyPolicyFragment;
import com.paymaya.mayaui.login.view.activity.impl.MayaRegistrationActivity;
import java.util.HashMap;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaAutoProvisionDataPrivacyPolicyFragment extends MayaBaseFragment implements a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public M7.a f12269U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public F f12270V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public b f12271W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Button f12272X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public LinearLayout f12273Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f12274Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f12275a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f12276b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public TextView f12277c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Group f12278d0;

    public static final void H1(MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment) {
        C1220i c1220iO1 = mayaAutoProvisionDataPrivacyPolicyFragment.o1();
        FragmentActivity activity = mayaAutoProvisionDataPrivacyPolicyFragment.getActivity();
        C1219h c1219hE = C1219h.e(AbstractC1213b.o(3));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("source_page", "Product Opt In");
        map.put("button", "Continue");
        map.put("destination_page", "Data personalization");
        c1219hE.i();
        c1220iO1.c(activity, c1219hE);
        b bVar = mayaAutoProvisionDataPrivacyPolicyFragment.f12271W;
        if (bVar != null) {
            ((MayaRegistrationActivity) bVar).n0(null);
        }
    }

    public static final void I1(MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment) {
        F f = mayaAutoProvisionDataPrivacyPolicyFragment.f12270V;
        j.d(f);
        mayaAutoProvisionDataPrivacyPolicyFragment.G1(d.b(((TextView) f.e).getText().toString()));
        b bVar = mayaAutoProvisionDataPrivacyPolicyFragment.f12271W;
        if (bVar != null) {
            String string = mayaAutoProvisionDataPrivacyPolicyFragment.getString(R.string.maya_label_data_privacy_terms_and_conditions);
            j.f(string, "getString(...)");
            F f3 = mayaAutoProvisionDataPrivacyPolicyFragment.f12270V;
            j.d(f3);
            ((MayaRegistrationActivity) bVar).b2(string, "https://www.mayabank.ph/savings/terms-conditions/", d.b(((TextView) f3.e).getText().toString()));
        }
    }

    public final void G1(String str) {
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hE = C1219h.e(AbstractC1213b.o(3));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("source_page", "Product Opt In");
        map.put("button", str);
        c1219hE.i();
        c1220iO1.c(activity, c1219hE);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaAutoProvisionDataPrivacyPolicyFragment.MayaAutoProvisionDataPrivacyPolicyFragmentListener");
        this.f12271W = (b) activity;
        O5.a aVar = W4.a.e().l().f4755a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        c flagConfigurationService = (c) aVar.f4724k.get();
        j.g(sessionSubject, "sessionSubject");
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        M7.a aVar2 = new M7.a(flagConfigurationService, sessionSubject, preference);
        this.f12269U = aVar2;
        aVar2.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_auto_provision_data_privacy_policy, viewGroup, false);
        int i = R.id.auto_provisions_container_linear_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.auto_provisions_container_linear_layout);
        if (linearLayout != null) {
            i = R.id.auto_provisions_header_text_view;
            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.auto_provisions_header_text_view)) != null) {
                i = R.id.auto_provisions_subheader_text_view;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.auto_provisions_subheader_text_view)) != null) {
                    i = R.id.click_continue_disclaimer_text_view;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.click_continue_disclaimer_text_view)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = R.id.content_nested_scroll_view;
                        if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.content_nested_scroll_view)) != null) {
                            i = R.id.continue_button;
                            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.continue_button);
                            if (button != null) {
                                i = R.id.maya_bank_savings_terms_and_condition_text_view;
                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_bank_savings_terms_and_condition_text_view);
                                if (textView != null) {
                                    i = R.id.maya_savings_group;
                                    Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.maya_savings_group);
                                    if (group != null) {
                                        i = R.id.maya_savings_privacy_policy_text_view;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_savings_privacy_policy_text_view);
                                        if (textView2 != null) {
                                            i = R.id.maya_savings_terms_and_condition_text_view;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_savings_terms_and_condition_text_view);
                                            if (textView3 != null) {
                                                i = R.id.maya_wallet_privacy_policy_text_view;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_wallet_privacy_policy_text_view);
                                                if (textView4 != null) {
                                                    i = R.id.maya_wallet_terms_and_condition_text_view;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_wallet_terms_and_condition_text_view);
                                                    if (textView5 != null) {
                                                        this.f12270V = new F(constraintLayout, linearLayout, button, textView, group, textView2, textView3, textView4, textView5, 1);
                                                        return constraintLayout;
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
    public final void onDestroy() {
        M7.a aVar = this.f12269U;
        if (aVar == null) {
            j.n("mMayaAutoProvisionDataPrivacyPolicyFragmentPresenter");
            throw null;
        }
        aVar.i();
        super.onDestroy();
        this.f12270V = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        b bVar = this.f12271W;
        if (bVar != null) {
            ((MayaRegistrationActivity) bVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        F f = this.f12270V;
        j.d(f);
        this.f12272X = (Button) f.c;
        F f3 = this.f12270V;
        j.d(f3);
        this.f12273Y = (LinearLayout) f3.f3615d;
        F f7 = this.f12270V;
        j.d(f7);
        this.f12274Z = (TextView) f7.j;
        F f10 = this.f12270V;
        j.d(f10);
        this.f12275a0 = (TextView) f10.i;
        F f11 = this.f12270V;
        j.d(f11);
        this.f12276b0 = (TextView) f11.h;
        F f12 = this.f12270V;
        j.d(f12);
        this.f12277c0 = (TextView) f12.f3616g;
        F f13 = this.f12270V;
        j.d(f13);
        this.f12278d0 = (Group) f13.f;
        Button button = this.f12272X;
        if (button == null) {
            j.n("mContinueButton");
            throw null;
        }
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: S7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAutoProvisionDataPrivacyPolicyFragment f5674b;

            {
                this.f5674b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAutoProvisionDataPrivacyPolicyFragment.H1(mayaAutoProvisionDataPrivacyPolicyFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment2 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment2.G1("Terms and conditions");
                            b bVar = mayaAutoProvisionDataPrivacyPolicyFragment2.f12271W;
                            if (bVar != null) {
                                String string = mayaAutoProvisionDataPrivacyPolicyFragment2.getString(R.string.maya_label_data_privacy_terms_and_conditions);
                                kotlin.jvm.internal.j.f(string, "getString(...)");
                                ((MayaRegistrationActivity) bVar).b2(string, "https://www.paymaya.com/terms-and-condition/?in_app=true", "Terms and conditions");
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment3 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment3.G1("Privacy policy");
                            b bVar2 = mayaAutoProvisionDataPrivacyPolicyFragment3.f12271W;
                            if (bVar2 != null) {
                                String string2 = mayaAutoProvisionDataPrivacyPolicyFragment3.getString(R.string.maya_label_data_privacy_privacy_policy);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                ((MayaRegistrationActivity) bVar2).b2(string2, "https://www.paymaya.com/privacy/?in_app=true", "Privacy policy");
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment4 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment4.G1("Terms and conditions Maya Bank");
                            b bVar3 = mayaAutoProvisionDataPrivacyPolicyFragment4.f12271W;
                            if (bVar3 != null) {
                                String string3 = mayaAutoProvisionDataPrivacyPolicyFragment4.getString(R.string.maya_label_data_privacy_terms_and_conditions);
                                kotlin.jvm.internal.j.f(string3, "getString(...)");
                                ((MayaRegistrationActivity) bVar3).b2(string3, "https://www.mayabank.ph/terms-conditions/", "Terms and conditions Maya Bank");
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment5 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAutoProvisionDataPrivacyPolicyFragment.I1(mayaAutoProvisionDataPrivacyPolicyFragment5);
                            return;
                        } finally {
                        }
                    default:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment6 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment6.G1("Privacy policy Maya Bank");
                            b bVar4 = mayaAutoProvisionDataPrivacyPolicyFragment6.f12271W;
                            if (bVar4 != null) {
                                String string4 = mayaAutoProvisionDataPrivacyPolicyFragment6.getString(R.string.maya_label_data_privacy_privacy_policy);
                                kotlin.jvm.internal.j.f(string4, "getString(...)");
                                ((MayaRegistrationActivity) bVar4).b2(string4, "https://www.mayabank.ph/privacy/", "Privacy policy Maya Bank");
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView = this.f12274Z;
        if (textView == null) {
            j.n("mMayaWalletTermsAndConditionTextView");
            throw null;
        }
        final int i4 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: S7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAutoProvisionDataPrivacyPolicyFragment f5674b;

            {
                this.f5674b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAutoProvisionDataPrivacyPolicyFragment.H1(mayaAutoProvisionDataPrivacyPolicyFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment2 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment2.G1("Terms and conditions");
                            b bVar = mayaAutoProvisionDataPrivacyPolicyFragment2.f12271W;
                            if (bVar != null) {
                                String string = mayaAutoProvisionDataPrivacyPolicyFragment2.getString(R.string.maya_label_data_privacy_terms_and_conditions);
                                kotlin.jvm.internal.j.f(string, "getString(...)");
                                ((MayaRegistrationActivity) bVar).b2(string, "https://www.paymaya.com/terms-and-condition/?in_app=true", "Terms and conditions");
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment3 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment3.G1("Privacy policy");
                            b bVar2 = mayaAutoProvisionDataPrivacyPolicyFragment3.f12271W;
                            if (bVar2 != null) {
                                String string2 = mayaAutoProvisionDataPrivacyPolicyFragment3.getString(R.string.maya_label_data_privacy_privacy_policy);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                ((MayaRegistrationActivity) bVar2).b2(string2, "https://www.paymaya.com/privacy/?in_app=true", "Privacy policy");
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment4 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment4.G1("Terms and conditions Maya Bank");
                            b bVar3 = mayaAutoProvisionDataPrivacyPolicyFragment4.f12271W;
                            if (bVar3 != null) {
                                String string3 = mayaAutoProvisionDataPrivacyPolicyFragment4.getString(R.string.maya_label_data_privacy_terms_and_conditions);
                                kotlin.jvm.internal.j.f(string3, "getString(...)");
                                ((MayaRegistrationActivity) bVar3).b2(string3, "https://www.mayabank.ph/terms-conditions/", "Terms and conditions Maya Bank");
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment5 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAutoProvisionDataPrivacyPolicyFragment.I1(mayaAutoProvisionDataPrivacyPolicyFragment5);
                            return;
                        } finally {
                        }
                    default:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment6 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment6.G1("Privacy policy Maya Bank");
                            b bVar4 = mayaAutoProvisionDataPrivacyPolicyFragment6.f12271W;
                            if (bVar4 != null) {
                                String string4 = mayaAutoProvisionDataPrivacyPolicyFragment6.getString(R.string.maya_label_data_privacy_privacy_policy);
                                kotlin.jvm.internal.j.f(string4, "getString(...)");
                                ((MayaRegistrationActivity) bVar4).b2(string4, "https://www.mayabank.ph/privacy/", "Privacy policy Maya Bank");
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView2 = this.f12275a0;
        if (textView2 == null) {
            j.n("mMayaWalletPrivacyPolicyTextView");
            throw null;
        }
        final int i6 = 2;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: S7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAutoProvisionDataPrivacyPolicyFragment f5674b;

            {
                this.f5674b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAutoProvisionDataPrivacyPolicyFragment.H1(mayaAutoProvisionDataPrivacyPolicyFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment2 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment2.G1("Terms and conditions");
                            b bVar = mayaAutoProvisionDataPrivacyPolicyFragment2.f12271W;
                            if (bVar != null) {
                                String string = mayaAutoProvisionDataPrivacyPolicyFragment2.getString(R.string.maya_label_data_privacy_terms_and_conditions);
                                kotlin.jvm.internal.j.f(string, "getString(...)");
                                ((MayaRegistrationActivity) bVar).b2(string, "https://www.paymaya.com/terms-and-condition/?in_app=true", "Terms and conditions");
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment3 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment3.G1("Privacy policy");
                            b bVar2 = mayaAutoProvisionDataPrivacyPolicyFragment3.f12271W;
                            if (bVar2 != null) {
                                String string2 = mayaAutoProvisionDataPrivacyPolicyFragment3.getString(R.string.maya_label_data_privacy_privacy_policy);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                ((MayaRegistrationActivity) bVar2).b2(string2, "https://www.paymaya.com/privacy/?in_app=true", "Privacy policy");
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment4 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment4.G1("Terms and conditions Maya Bank");
                            b bVar3 = mayaAutoProvisionDataPrivacyPolicyFragment4.f12271W;
                            if (bVar3 != null) {
                                String string3 = mayaAutoProvisionDataPrivacyPolicyFragment4.getString(R.string.maya_label_data_privacy_terms_and_conditions);
                                kotlin.jvm.internal.j.f(string3, "getString(...)");
                                ((MayaRegistrationActivity) bVar3).b2(string3, "https://www.mayabank.ph/terms-conditions/", "Terms and conditions Maya Bank");
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment5 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAutoProvisionDataPrivacyPolicyFragment.I1(mayaAutoProvisionDataPrivacyPolicyFragment5);
                            return;
                        } finally {
                        }
                    default:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment6 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment6.G1("Privacy policy Maya Bank");
                            b bVar4 = mayaAutoProvisionDataPrivacyPolicyFragment6.f12271W;
                            if (bVar4 != null) {
                                String string4 = mayaAutoProvisionDataPrivacyPolicyFragment6.getString(R.string.maya_label_data_privacy_privacy_policy);
                                kotlin.jvm.internal.j.f(string4, "getString(...)");
                                ((MayaRegistrationActivity) bVar4).b2(string4, "https://www.mayabank.ph/privacy/", "Privacy policy Maya Bank");
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView3 = this.f12276b0;
        if (textView3 == null) {
            j.n("mMayaSavingsTermsAndConditionTextView");
            throw null;
        }
        final int i10 = 3;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: S7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAutoProvisionDataPrivacyPolicyFragment f5674b;

            {
                this.f5674b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAutoProvisionDataPrivacyPolicyFragment.H1(mayaAutoProvisionDataPrivacyPolicyFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment2 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment2.G1("Terms and conditions");
                            b bVar = mayaAutoProvisionDataPrivacyPolicyFragment2.f12271W;
                            if (bVar != null) {
                                String string = mayaAutoProvisionDataPrivacyPolicyFragment2.getString(R.string.maya_label_data_privacy_terms_and_conditions);
                                kotlin.jvm.internal.j.f(string, "getString(...)");
                                ((MayaRegistrationActivity) bVar).b2(string, "https://www.paymaya.com/terms-and-condition/?in_app=true", "Terms and conditions");
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment3 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment3.G1("Privacy policy");
                            b bVar2 = mayaAutoProvisionDataPrivacyPolicyFragment3.f12271W;
                            if (bVar2 != null) {
                                String string2 = mayaAutoProvisionDataPrivacyPolicyFragment3.getString(R.string.maya_label_data_privacy_privacy_policy);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                ((MayaRegistrationActivity) bVar2).b2(string2, "https://www.paymaya.com/privacy/?in_app=true", "Privacy policy");
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment4 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment4.G1("Terms and conditions Maya Bank");
                            b bVar3 = mayaAutoProvisionDataPrivacyPolicyFragment4.f12271W;
                            if (bVar3 != null) {
                                String string3 = mayaAutoProvisionDataPrivacyPolicyFragment4.getString(R.string.maya_label_data_privacy_terms_and_conditions);
                                kotlin.jvm.internal.j.f(string3, "getString(...)");
                                ((MayaRegistrationActivity) bVar3).b2(string3, "https://www.mayabank.ph/terms-conditions/", "Terms and conditions Maya Bank");
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment5 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAutoProvisionDataPrivacyPolicyFragment.I1(mayaAutoProvisionDataPrivacyPolicyFragment5);
                            return;
                        } finally {
                        }
                    default:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment6 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment6.G1("Privacy policy Maya Bank");
                            b bVar4 = mayaAutoProvisionDataPrivacyPolicyFragment6.f12271W;
                            if (bVar4 != null) {
                                String string4 = mayaAutoProvisionDataPrivacyPolicyFragment6.getString(R.string.maya_label_data_privacy_privacy_policy);
                                kotlin.jvm.internal.j.f(string4, "getString(...)");
                                ((MayaRegistrationActivity) bVar4).b2(string4, "https://www.mayabank.ph/privacy/", "Privacy policy Maya Bank");
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        F f14 = this.f12270V;
        j.d(f14);
        final int i11 = 4;
        ((TextView) f14.e).setOnClickListener(new View.OnClickListener(this) { // from class: S7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAutoProvisionDataPrivacyPolicyFragment f5674b;

            {
                this.f5674b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAutoProvisionDataPrivacyPolicyFragment.H1(mayaAutoProvisionDataPrivacyPolicyFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment2 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment2.G1("Terms and conditions");
                            b bVar = mayaAutoProvisionDataPrivacyPolicyFragment2.f12271W;
                            if (bVar != null) {
                                String string = mayaAutoProvisionDataPrivacyPolicyFragment2.getString(R.string.maya_label_data_privacy_terms_and_conditions);
                                kotlin.jvm.internal.j.f(string, "getString(...)");
                                ((MayaRegistrationActivity) bVar).b2(string, "https://www.paymaya.com/terms-and-condition/?in_app=true", "Terms and conditions");
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment3 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment3.G1("Privacy policy");
                            b bVar2 = mayaAutoProvisionDataPrivacyPolicyFragment3.f12271W;
                            if (bVar2 != null) {
                                String string2 = mayaAutoProvisionDataPrivacyPolicyFragment3.getString(R.string.maya_label_data_privacy_privacy_policy);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                ((MayaRegistrationActivity) bVar2).b2(string2, "https://www.paymaya.com/privacy/?in_app=true", "Privacy policy");
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment4 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment4.G1("Terms and conditions Maya Bank");
                            b bVar3 = mayaAutoProvisionDataPrivacyPolicyFragment4.f12271W;
                            if (bVar3 != null) {
                                String string3 = mayaAutoProvisionDataPrivacyPolicyFragment4.getString(R.string.maya_label_data_privacy_terms_and_conditions);
                                kotlin.jvm.internal.j.f(string3, "getString(...)");
                                ((MayaRegistrationActivity) bVar3).b2(string3, "https://www.mayabank.ph/terms-conditions/", "Terms and conditions Maya Bank");
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment5 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAutoProvisionDataPrivacyPolicyFragment.I1(mayaAutoProvisionDataPrivacyPolicyFragment5);
                            return;
                        } finally {
                        }
                    default:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment6 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment6.G1("Privacy policy Maya Bank");
                            b bVar4 = mayaAutoProvisionDataPrivacyPolicyFragment6.f12271W;
                            if (bVar4 != null) {
                                String string4 = mayaAutoProvisionDataPrivacyPolicyFragment6.getString(R.string.maya_label_data_privacy_privacy_policy);
                                kotlin.jvm.internal.j.f(string4, "getString(...)");
                                ((MayaRegistrationActivity) bVar4).b2(string4, "https://www.mayabank.ph/privacy/", "Privacy policy Maya Bank");
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView4 = this.f12277c0;
        if (textView4 == null) {
            j.n("mMayaSavingsPrivacyPolicyTextView");
            throw null;
        }
        final int i12 = 5;
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: S7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAutoProvisionDataPrivacyPolicyFragment f5674b;

            {
                this.f5674b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAutoProvisionDataPrivacyPolicyFragment.H1(mayaAutoProvisionDataPrivacyPolicyFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment2 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment2.G1("Terms and conditions");
                            b bVar = mayaAutoProvisionDataPrivacyPolicyFragment2.f12271W;
                            if (bVar != null) {
                                String string = mayaAutoProvisionDataPrivacyPolicyFragment2.getString(R.string.maya_label_data_privacy_terms_and_conditions);
                                kotlin.jvm.internal.j.f(string, "getString(...)");
                                ((MayaRegistrationActivity) bVar).b2(string, "https://www.paymaya.com/terms-and-condition/?in_app=true", "Terms and conditions");
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment3 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment3.G1("Privacy policy");
                            b bVar2 = mayaAutoProvisionDataPrivacyPolicyFragment3.f12271W;
                            if (bVar2 != null) {
                                String string2 = mayaAutoProvisionDataPrivacyPolicyFragment3.getString(R.string.maya_label_data_privacy_privacy_policy);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                ((MayaRegistrationActivity) bVar2).b2(string2, "https://www.paymaya.com/privacy/?in_app=true", "Privacy policy");
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment4 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment4.G1("Terms and conditions Maya Bank");
                            b bVar3 = mayaAutoProvisionDataPrivacyPolicyFragment4.f12271W;
                            if (bVar3 != null) {
                                String string3 = mayaAutoProvisionDataPrivacyPolicyFragment4.getString(R.string.maya_label_data_privacy_terms_and_conditions);
                                kotlin.jvm.internal.j.f(string3, "getString(...)");
                                ((MayaRegistrationActivity) bVar3).b2(string3, "https://www.mayabank.ph/terms-conditions/", "Terms and conditions Maya Bank");
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment5 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAutoProvisionDataPrivacyPolicyFragment.I1(mayaAutoProvisionDataPrivacyPolicyFragment5);
                            return;
                        } finally {
                        }
                    default:
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment6 = this.f5674b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAutoProvisionDataPrivacyPolicyFragment6.G1("Privacy policy Maya Bank");
                            b bVar4 = mayaAutoProvisionDataPrivacyPolicyFragment6.f12271W;
                            if (bVar4 != null) {
                                String string4 = mayaAutoProvisionDataPrivacyPolicyFragment6.getString(R.string.maya_label_data_privacy_privacy_policy);
                                kotlin.jvm.internal.j.f(string4, "getString(...)");
                                ((MayaRegistrationActivity) bVar4).b2(string4, "https://www.mayabank.ph/privacy/", "Privacy policy Maya Bank");
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        M7.a aVar = this.f12269U;
        if (aVar != null) {
            aVar.j();
        } else {
            j.n("mMayaAutoProvisionDataPrivacyPolicyFragmentPresenter");
            throw null;
        }
    }
}
