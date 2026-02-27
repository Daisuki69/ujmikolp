package com.paymaya.mayaui.cashin.view.fragment.impl;

import A7.j;
import Ah.p;
import K6.a;
import L6.InterfaceC0315a;
import Lh.d;
import N5.C0435a;
import S5.c;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.data.api.PayMayaAutoCashInApi;
import com.paymaya.domain.model.AutoCashInCustomerSetup;
import com.paymaya.domain.store.D;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import d4.AbstractC1331a;
import defpackage.AbstractC1414e;
import io.flutter.embedding.android.FlutterActivity;
import w.C2361c;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaAutoCashinWalletSettingsFragment extends MayaBaseFragment implements a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0435a f11614U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public AppCompatTextView f11615V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public AppCompatTextView f11616W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public AppCompatTextView f11617X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public InterfaceC0315a f11618Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public j f11619Z;

    public static final void G1(MayaAutoCashinWalletSettingsFragment mayaAutoCashinWalletSettingsFragment) {
        j jVar = mayaAutoCashinWalletSettingsFragment.f11619Z;
        if (jVar == null) {
            kotlin.jvm.internal.j.n("mFragmentPresenter");
            throw null;
        }
        boolean zB = kotlin.jvm.internal.j.b(((com.paymaya.data.preference.a) jVar.e).k(), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        EnumC1215d enumC1215d = EnumC1215d.AUTO_CASH_IN;
        if (!zB) {
            MayaAutoCashinWalletSettingsFragment mayaAutoCashinWalletSettingsFragment2 = (MayaAutoCashinWalletSettingsFragment) ((a) jVar.c.get());
            C1220i c1220iO1 = mayaAutoCashinWalletSettingsFragment2.o1();
            FragmentActivity activity = mayaAutoCashinWalletSettingsFragment2.getActivity();
            C1219h c1219h = new C1219h();
            c1219h.p(enumC1215d);
            AbstractC1414e.m(c1219h, EnumC1216e.U_ACCOUNT_UPGRADE, 17);
            c1220iO1.c(activity, c1219h);
            InterfaceC0315a interfaceC0315a = ((MayaAutoCashinWalletSettingsFragment) ((a) jVar.c.get())).f11618Y;
            if (interfaceC0315a != null) {
                ((MayaCashInActivity) interfaceC0315a).c2();
                return;
            }
            return;
        }
        MayaAutoCashinWalletSettingsFragment mayaAutoCashinWalletSettingsFragment3 = (MayaAutoCashinWalletSettingsFragment) ((a) jVar.c.get());
        C1220i c1220iO12 = mayaAutoCashinWalletSettingsFragment3.o1();
        FragmentActivity activity2 = mayaAutoCashinWalletSettingsFragment3.getActivity();
        C1219h c1219h2 = new C1219h();
        c1219h2.p(enumC1215d);
        AbstractC1414e.m(c1219h2, EnumC1216e.DEFAULT, 2);
        c1220iO12.c(activity2, c1219h2);
        InterfaceC0315a interfaceC0315a2 = ((MayaAutoCashinWalletSettingsFragment) ((a) jVar.c.get())).f11618Y;
        if (interfaceC0315a2 != null) {
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) interfaceC0315a2;
            mayaCashInActivity.n1();
            Intent intentBuild = FlutterActivity.withCachedEngine("runAutoCashIn").build(mayaCashInActivity);
            intentBuild.putExtra("engineId", "runAutoCashIn");
            mayaCashInActivity.startActivity(intentBuild);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11618Y = (InterfaceC0315a) getActivity();
        O5.a aVar = W4.a.e().i().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        D d10 = new D((PayMayaAutoCashInApi) aVar.N0.get());
        kotlin.jvm.internal.j.g(preference, "preference");
        j jVar = new j(2, preference, d10);
        this.f11619Z = jVar;
        jVar.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_maya_auto_cashin_wallet_settings, viewGroup, false);
        int i = R.id.card_view_wallet_auto_cashin_settings;
        if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_wallet_auto_cashin_settings)) != null) {
            i = R.id.container;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.container)) != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                i = R.id.text_view_auto_cashin_title;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_auto_cashin_title);
                if (appCompatTextView != null) {
                    i = R.id.text_view_insta_fill_title;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_insta_fill_title);
                    if (appCompatTextView2 != null) {
                        i = R.id.text_view_title_header;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title_header)) != null) {
                            i = R.id.text_view_wallet_transaction_limit_title;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_wallet_transaction_limit_title);
                            if (appCompatTextView3 != null) {
                                i = R.id.view_auto_cashin_option_divider;
                                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_auto_cashin_option_divider);
                                if (viewFindChildViewById != null) {
                                    i = R.id.view_wallet_transaction_limit_divider;
                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_wallet_transaction_limit_divider);
                                    if (viewFindChildViewById2 != null) {
                                        this.f11614U = new C0435a(nestedScrollView, appCompatTextView, appCompatTextView2, appCompatTextView3, viewFindChildViewById, viewFindChildViewById2, 0);
                                        return nestedScrollView;
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
    public final void onResume() {
        super.onResume();
        InterfaceC0315a interfaceC0315a = this.f11618Y;
        if (interfaceC0315a != null) {
            ((MayaCashInActivity) interfaceC0315a).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0435a c0435a = this.f11614U;
        kotlin.jvm.internal.j.d(c0435a);
        this.f11615V = (AppCompatTextView) c0435a.e;
        C0435a c0435a2 = this.f11614U;
        kotlin.jvm.internal.j.d(c0435a2);
        this.f11616W = (AppCompatTextView) c0435a2.c;
        C0435a c0435a3 = this.f11614U;
        kotlin.jvm.internal.j.d(c0435a3);
        this.f11617X = (AppCompatTextView) c0435a3.f4048d;
        j jVar = this.f11619Z;
        if (jVar == null) {
            kotlin.jvm.internal.j.n("mFragmentPresenter");
            throw null;
        }
        jVar.j();
        AppCompatTextView appCompatTextView = this.f11616W;
        if (appCompatTextView == null) {
            kotlin.jvm.internal.j.n("mTextViewAutoCashin");
            throw null;
        }
        appCompatTextView.setOnClickListener(new Ba.a(this, 19));
        j jVar2 = this.f11619Z;
        if (jVar2 == null) {
            kotlin.jvm.internal.j.n("mFragmentPresenter");
            throw null;
        }
        MayaAutoCashinWalletSettingsFragment mayaAutoCashinWalletSettingsFragment = (MayaAutoCashinWalletSettingsFragment) ((a) jVar2.c.get());
        mayaAutoCashinWalletSettingsFragment.getClass();
        mayaAutoCashinWalletSettingsFragment.C1("");
        p<AutoCashInCustomerSetup> pVarCustomerSetupAccountsDefault = ((D) jVar2.f).f11342b.customerSetupAccountsDefault();
        jVar2.e(new d(new d(AbstractC1331a.l(pVarCustomerSetupAccountsDefault, pVarCustomerSetupAccountsDefault, b.a()), new C2361c(jVar2, 21), 2), new J5.a(jVar2, 26), 0).e());
    }
}
