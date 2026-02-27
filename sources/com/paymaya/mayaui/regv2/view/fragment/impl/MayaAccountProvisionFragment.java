package com.paymaya.mayaui.regv2.view.fragment.impl;

import Ke.b;
import Lb.a;
import M8.C0376l;
import M8.D2;
import N5.E;
import S5.c;
import Uh.d;
import Y6.o;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import androidx.viewbinding.ViewBindings;
import cj.C1129o;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.P;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.model.DataPrivacyProvision;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.E0;
import com.paymaya.mayaui.common.view.widget.MayaStaticToolTipView;
import com.paymaya.mayaui.login.view.activity.impl.MayaAuthBaseFragment;
import com.paymaya.mayaui.regv2.view.activity.impl.MayaRegistrationV2Activity;
import db.InterfaceC1349b;
import eb.g;
import eb.i;
import eb.l;
import eb.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaAccountProvisionFragment extends MayaAuthBaseFragment implements InterfaceC1349b {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public E f13682V;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public l f13684X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f13686Z;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f13688b0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public a f13690d0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final NavArgsLazy f13683W = new NavArgsLazy(z.a(m.class), new C0376l(this, 25));

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ArrayList f13685Y = new ArrayList();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f13687a0 = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final D2 f13689c0 = new D2(this, 10);

    public static void M1(MayaAccountProvisionFragment mayaAccountProvisionFragment, String str, String str2, String str3, String str4, String str5, Map map, int i) {
        String str6 = (i & 16) != 0 ? null : str5;
        Map mapE = (i & 32) != 0 ? M.e() : map;
        if (mayaAccountProvisionFragment.isAdded()) {
            C1229s c1229sH1 = mayaAccountProvisionFragment.H1();
            FragmentActivity fragmentActivityRequireActivity = mayaAccountProvisionFragment.requireActivity();
            j.f(fragmentActivityRequireActivity, "requireActivity(...)");
            C1229s.c(c1229sH1, fragmentActivityRequireActivity, str2, str3, str4, str, null, str6, mapE, 32);
        }
    }

    public static void N1(MayaAccountProvisionFragment mayaAccountProvisionFragment, String str, String str2, Map map) {
        if (mayaAccountProvisionFragment.isAdded()) {
            C1229s c1229sH1 = mayaAccountProvisionFragment.H1();
            FragmentActivity fragmentActivityRequireActivity = mayaAccountProvisionFragment.requireActivity();
            j.f(fragmentActivityRequireActivity, "requireActivity(...)");
            C1229s.d(c1229sH1, fragmentActivityRequireActivity, str, str2, null, null, null, map, 24);
        }
    }

    public static final void O1(MayaAccountProvisionFragment mayaAccountProvisionFragment) {
        Object next;
        a aVarI1 = mayaAccountProvisionFragment.I1();
        E e = mayaAccountProvisionFragment.f13682V;
        j.d(e);
        boolean zIsChecked = ((AppCompatCheckBox) e.e).isChecked();
        Iterator it = ((MayaAccountProvisionFragment) ((InterfaceC1349b) aVarI1.c.get())).f13685Y.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (j.b(((Consent) next).mID(), Consent.ID_ADVERTISING)) {
                    break;
                }
            }
        }
        Consent consent = (Consent) next;
        MayaAccountProvisionFragment mayaAccountProvisionFragment2 = (MayaAccountProvisionFragment) ((InterfaceC1349b) aVarI1.c.get());
        mayaAccountProvisionFragment2.getClass();
        if (consent != null) {
            String strMName = consent.mName();
            j.f(strMName, "mName(...)");
            mayaAccountProvisionFragment2.K1(strMName, M.e(), zIsChecked);
            String strMID = consent.mID();
            j.f(strMID, "mID(...)");
            ListIterator listIterator = mayaAccountProvisionFragment2.f13685Y.listIterator();
            while (listIterator.hasNext()) {
                Consent consent2 = (Consent) listIterator.next();
                if (j.b(consent2.mID(), strMID)) {
                    ArrayList arrayList = mayaAccountProvisionFragment2.f13685Y;
                    int iPreviousIndex = listIterator.previousIndex();
                    Consent consentBuild = consent2.toBuilder().isEnabled(zIsChecked).build();
                    j.f(consentBuild, "build(...)");
                    arrayList.set(iPreviousIndex, consentBuild);
                    return;
                }
            }
        }
    }

    public final a I1() {
        a aVar = this.f13690d0;
        if (aVar != null) {
            return aVar;
        }
        j.n("mMayaAccountProvisionFragmentPresenter");
        throw null;
    }

    public final ArrayList J1() {
        DataPrivacyProvision[] dataPrivacyProvisionArrA = ((m) this.f13683W.getValue()).a();
        return dataPrivacyProvisionArrA != null ? C1129o.B(dataPrivacyProvisionArrA) : new ArrayList();
    }

    public final void K1(String str, Map map, boolean z4) {
        if (isAdded()) {
            C1229s c1229sH1 = H1();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            j.f(fragmentActivityRequireActivity, "requireActivity(...)");
            String strP = AbstractC1213b.p(3);
            j.f(strP, "tapped(...)");
            c1229sH1.a(fragmentActivityRequireActivity, strP, s(), str, z4, EnumC1212a.CHECKBOX, new g(1, H1(), C1229s.class, "getStatusValue", "getStatusValue(Z)Ljava/lang/String;", 0, 4), new g(1, H1(), C1229s.class, "getCheckValue", "getCheckValue(Z)Ljava/lang/String;", 0, 5), map);
        }
    }

    public final void L1(PayMayaError payMayaError) {
        String strE = AbstractC1213b.e(13);
        j.f(strE, "errorViewed(...)");
        String strS = s();
        String strMSpiel = payMayaError.mSpiel();
        Map mapH = M.h(new Pair(EnumC1212a.SCREEN_NAME, "Registration Error (Dialog)"), new Pair(EnumC1212a.ERROR_CODE, String.valueOf(payMayaError.mErrorCode())));
        if (isAdded()) {
            C1229s c1229sH1 = H1();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            j.f(fragmentActivityRequireActivity, "requireActivity(...)");
            C1229s.d(c1229sH1, fragmentActivityRequireActivity, strE, strS, null, null, strMSpiel, mapH, 24);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().w().f4755a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12720U = (C1229s) aVar.f4684R.get();
        d sessionSubject = (d) aVar.f4748y.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        P partnerOnboardingUtils = (P) aVar.f4687T.get();
        E0 e0M = aVar.M();
        c flagConfigurationService = (c) aVar.f4724k.get();
        j.g(sessionSubject, "sessionSubject");
        j.g(preference, "preference");
        j.g(partnerOnboardingUtils, "partnerOnboardingUtils");
        j.g(flagConfigurationService, "flagConfigurationService");
        this.f13690d0 = new a(sessionSubject, preference, partnerOnboardingUtils, e0M, flagConfigurationService);
        C1219h c1219hE = C1219h.e(AbstractC1213b.h(3));
        c1219hE.i();
        this.f10337Q = c1219hE;
        this.f10338R = true;
        Consent[] consentArrB = ((m) this.f13683W.getValue()).b();
        this.f13685Y = consentArrB != null ? C1129o.B(consentArrB) : new ArrayList();
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountProvisionFragment.MayaAccountProvisionFragmentListener");
        this.f13684X = (l) activity;
        I1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_account_provision, viewGroup, false);
        int i = R.id.account_provision_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.account_provision_container);
        if (linearLayout != null) {
            i = R.id.auto_provisions_header_text_view;
            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.auto_provisions_header_text_view)) != null) {
                i = R.id.consent_allow_all_text_view;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.consent_allow_all_text_view)) != null) {
                    i = R.id.consent_allow_data_usage_check_box;
                    AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(viewInflate, R.id.consent_allow_data_usage_check_box);
                    if (appCompatCheckBox != null) {
                        i = R.id.consent_allow_data_usage_spiel_text_view;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.consent_allow_data_usage_spiel_text_view);
                        if (textView != null) {
                            i = R.id.consents_all_container;
                            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.consents_all_container)) != null) {
                                i = R.id.content_nested_scroll_view;
                                if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.content_nested_scroll_view)) != null) {
                                    i = R.id.continue_button;
                                    Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.continue_button);
                                    if (button != null) {
                                        i = R.id.disclaimer_text_view;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.disclaimer_text_view)) != null) {
                                            i = R.id.footer_container;
                                            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.footer_container)) != null) {
                                                i = R.id.maya_bank_savings_terms_and_condition_text_view;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_bank_savings_terms_and_condition_text_view);
                                                if (textView2 != null) {
                                                    i = R.id.maya_savings_privacy_policy_text_view;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_savings_privacy_policy_text_view);
                                                    if (textView3 != null) {
                                                        i = R.id.maya_savings_terms_and_condition_text_view;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_savings_terms_and_condition_text_view);
                                                        if (textView4 != null) {
                                                            i = R.id.maya_wallet_terms_and_condition_text_view;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_wallet_terms_and_condition_text_view);
                                                            if (textView5 != null) {
                                                                i = R.id.open_accounts_title_text_view;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.open_accounts_title_text_view);
                                                                if (textView6 != null) {
                                                                    i = R.id.privacy_device_info_disclaimer_text_view;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.privacy_device_info_disclaimer_text_view)) != null) {
                                                                        i = R.id.provisions_container;
                                                                        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.provisions_container)) != null) {
                                                                            i = R.id.savings_group;
                                                                            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.savings_group);
                                                                            if (group != null) {
                                                                                i = R.id.savings_tooltip_view;
                                                                                MayaStaticToolTipView mayaStaticToolTipView = (MayaStaticToolTipView) ViewBindings.findChildViewById(viewInflate, R.id.savings_tooltip_view);
                                                                                if (mayaStaticToolTipView != null) {
                                                                                    FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                                                    this.f13682V = new E(frameLayout, linearLayout, appCompatCheckBox, textView, button, textView2, textView3, textView4, textView5, textView6, group, mayaStaticToolTipView);
                                                                                    return frameLayout;
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
    public final void onDestroy() {
        I1().i();
        super.onDestroy();
        this.f13682V = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        l lVar = this.f13684X;
        if (lVar != null) {
            ((MayaRegistrationV2Activity) lVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean bool;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        x1(this.f13689c0);
        C1220i c1220iO1 = o1();
        int i = 3;
        C1219h c1219hE = C1219h.e(AbstractC1213b.v(3));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String string = G1().r().toString();
        HashMap map = c1219hE.j;
        map.put("source_page", string);
        map.put("screen_name", s());
        c1219hE.i();
        c1220iO1.b(c1219hE);
        NavBackStackEntry currentBackStackEntry = FragmentKt.findNavController(this).getCurrentBackStackEntry();
        SavedStateHandle savedStateHandle = currentBackStackEntry != null ? currentBackStackEntry.getSavedStateHandle() : null;
        this.f13686Z = (savedStateHandle == null || (bool = (Boolean) savedStateHandle.get("state_show_savings_group")) == null) ? true : bool.booleanValue();
        I1().k(this.f13686Z);
        E e = this.f13682V;
        j.d(e);
        b.b((Button) e.f3586b, new i(this, 0));
        E e7 = this.f13682V;
        j.d(e7);
        b.b((TextView) e7.j, new i(this, 2));
        E e10 = this.f13682V;
        j.d(e10);
        b.b((TextView) e10.i, new i(this, i));
        E e11 = this.f13682V;
        j.d(e11);
        b.b((TextView) e11.f3588g, new i(this, 4));
        E e12 = this.f13682V;
        j.d(e12);
        b.b((TextView) e12.h, new i(this, 5));
        E e13 = this.f13682V;
        j.d(e13);
        ((AppCompatCheckBox) e13.e).setOnClickListener(new o(this, 28));
        I1().j();
    }
}
