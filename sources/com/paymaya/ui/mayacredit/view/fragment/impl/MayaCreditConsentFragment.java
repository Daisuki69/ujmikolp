package com.paymaya.ui.mayacredit.view.fragment.impl;

import A7.j;
import Hh.f;
import N5.C0491z;
import Na.d;
import Qd.a;
import Sd.b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.CreditConsent;
import com.paymaya.domain.store.C1264i0;

/* JADX INFO: loaded from: classes4.dex */
public class MayaCreditConsentFragment extends BaseFragment implements b, AppBarLayout.OnOffsetChangedListener {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0491z f14642S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public AppBarLayout f14643T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public TextView f14644U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f14645V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f14646W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public j f14647X;

    public static final void r1(MayaCreditConsentFragment mayaCreditConsentFragment) {
        int i = 0;
        C1220i c1220i = mayaCreditConsentFragment.f10245B;
        FragmentActivity activity = mayaCreditConsentFragment.getActivity();
        C1219h c1219hD = C1219h.d(mayaCreditConsentFragment.m1());
        c1219hD.r(EnumC1216e.OPT_IN);
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.AGREE);
        c1220i.c(activity, c1219hD);
        j jVar = mayaCreditConsentFragment.f14647X;
        if (jVar == null) {
            kotlin.jvm.internal.j.n("mMayaCreditConsentFragmentPresenter");
            throw null;
        }
        ((BaseFragment) ((b) jVar.c.get())).p1();
        CreditConsent creditConsent = (CreditConsent) jVar.f;
        if (creditConsent != null) {
            jVar.e(new f(((C1264i0) jVar.e).f(creditConsent), zh.b.a(), 0).a(new d(jVar, 10)).b(new a(jVar, i)).c());
        }
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.OPT_IN;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        O5.a aVar = W4.a.e().k().f4754a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14647X = new j(aVar.A(), (Uh.d) aVar.f4748y.get());
        kotlin.jvm.internal.j.e(requireActivity(), "null cannot be cast to non-null type com.paymaya.ui.mayacredit.view.fragment.impl.MayaCreditConsentFragment.MayaCreditConsentFragmentListener");
        throw new ClassCastException();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_fragment_maya_credit_consent, viewGroup, false);
        int i = R.id.additional_consent_text_view_pma_fragment_maya_credit_consent;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.additional_consent_text_view_pma_fragment_maya_credit_consent);
        if (textView != null) {
            i = R.id.additional_consent_title_text_view_pma_fragment_maya_credit_consent;
            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.additional_consent_title_text_view_pma_fragment_maya_credit_consent)) != null) {
                i = R.id.agree_button_view_pma_fragment_maya_credit_consent;
                Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.agree_button_view_pma_fragment_maya_credit_consent);
                if (button != null) {
                    i = R.id.app_bar_layout_pma_fragment_maya_credit_consent;
                    AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(viewInflate, R.id.app_bar_layout_pma_fragment_maya_credit_consent);
                    if (appBarLayout != null) {
                        i = R.id.card_shadow_view_pma_fragment_maya_credit_consent;
                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.card_shadow_view_pma_fragment_maya_credit_consent);
                        if (viewFindChildViewById != null) {
                            i = R.id.card_view_pma_fragment_maya_credit_consent;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.card_view_pma_fragment_maya_credit_consent);
                            if (viewFindChildViewById2 != null) {
                                i = R.id.collapsing_toolbar_layout_pma_fragment_maya_credit_consent;
                                if (((CollapsingToolbarLayout) ViewBindings.findChildViewById(viewInflate, R.id.collapsing_toolbar_layout_pma_fragment_maya_credit_consent)) != null) {
                                    i = R.id.consent_intro_text_view_pma_fragment_maya_credit_consent;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.consent_intro_text_view_pma_fragment_maya_credit_consent)) != null) {
                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                                        i = R.id.credit_features_bullet_text_view_pma_fragment_maya_credit_consent;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.credit_features_bullet_text_view_pma_fragment_maya_credit_consent);
                                        if (textView2 != null) {
                                            i = R.id.credit_features_title_text_view_pma_fragment_maya_credit_consent;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.credit_features_title_text_view_pma_fragment_maya_credit_consent)) != null) {
                                                i = R.id.exclusive_offer_chip_view_pma_fragment_maya_credit_consent;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.exclusive_offer_chip_view_pma_fragment_maya_credit_consent)) != null) {
                                                    i = R.id.margin_space_pma_fragment_maya_credit_consent;
                                                    if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.margin_space_pma_fragment_maya_credit_consent)) != null) {
                                                        i = R.id.running_out_text_view_pma_fragment_maya_credit_consent;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.running_out_text_view_pma_fragment_maya_credit_consent)) != null) {
                                                            i = R.id.scroll_view_pma_fragment_maya_credit_consent;
                                                            if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_pma_fragment_maya_credit_consent)) != null) {
                                                                i = R.id.toolbar_space_pma_fragment_maya_credit_consent;
                                                                if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.toolbar_space_pma_fragment_maya_credit_consent)) != null) {
                                                                    i = R.id.toolbar_view_pma_fragment_maya_credit_consent;
                                                                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, R.id.toolbar_view_pma_fragment_maya_credit_consent);
                                                                    if (toolbar != null) {
                                                                        this.f14642S = new C0491z(coordinatorLayout, textView, button, appBarLayout, viewFindChildViewById, viewFindChildViewById2, textView2, toolbar);
                                                                        kotlin.jvm.internal.j.f(coordinatorLayout, "getRoot(...)");
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        j jVar = this.f14647X;
        if (jVar == null) {
            kotlin.jvm.internal.j.n("mMayaCreditConsentFragmentPresenter");
            throw null;
        }
        jVar.i();
        super.onDestroy();
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        if (i == 0 && this.f14646W) {
            this.f14646W = false;
        } else {
            if (this.f14646W) {
                return;
            }
            this.f14646W = true;
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        kotlin.jvm.internal.j.d(this.f14642S);
        C0491z c0491z = this.f14642S;
        kotlin.jvm.internal.j.d(c0491z);
        this.f14643T = (AppBarLayout) c0491z.e;
        C0491z c0491z2 = this.f14642S;
        kotlin.jvm.internal.j.d(c0491z2);
        this.f14644U = (TextView) c0491z2.h;
        C0491z c0491z3 = this.f14642S;
        kotlin.jvm.internal.j.d(c0491z3);
        this.f14645V = (TextView) c0491z3.f4304d;
        C0491z c0491z4 = this.f14642S;
        kotlin.jvm.internal.j.d(c0491z4);
        ((Button) c0491z4.c).setOnClickListener(new S.b(this, 14));
        Bundle arguments = getArguments();
        if (arguments != null) {
            CreditConsent creditConsent = (CreditConsent) arguments.getParcelable("credit_consent");
            j jVar = this.f14647X;
            if (jVar == null) {
                kotlin.jvm.internal.j.n("mMayaCreditConsentFragmentPresenter");
                throw null;
            }
            jVar.j();
            jVar.f = creditConsent;
            MayaCreditConsentFragment mayaCreditConsentFragment = (MayaCreditConsentFragment) ((b) jVar.c.get());
            String string = mayaCreditConsentFragment.getString(R.string.pma_label_maya_credit_features_bullet_1);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            String string2 = mayaCreditConsentFragment.getString(R.string.pma_label_maya_credit_features_bullet_2);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            String string3 = mayaCreditConsentFragment.getString(R.string.pma_label_maya_credit_features_bullet_3);
            kotlin.jvm.internal.j.f(string3, "getString(...)");
            TextView textView = mayaCreditConsentFragment.f14644U;
            if (textView == null) {
                kotlin.jvm.internal.j.n("mTextViewCreditFeatures");
                throw null;
            }
            textView.setText(C.j(0, string, string2, string3));
            b bVar = (b) jVar.c.get();
            String value = creditConsent != null ? creditConsent.getValue() : null;
            TextView textView2 = ((MayaCreditConsentFragment) bVar).f14645V;
            if (textView2 == null) {
                kotlin.jvm.internal.j.n("mTextViewAdditionalConsent");
                throw null;
            }
            textView2.setText(value);
        }
        AppBarLayout appBarLayout = this.f14643T;
        if (appBarLayout != null) {
            appBarLayout.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) this);
        } else {
            kotlin.jvm.internal.j.n("mAppBarLayout");
            throw null;
        }
    }
}
