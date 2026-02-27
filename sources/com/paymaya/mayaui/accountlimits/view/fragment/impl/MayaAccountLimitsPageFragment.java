package com.paymaya.mayaui.accountlimits.view.fragment.impl;

import J7.e;
import N5.D;
import O5.a;
import S5.c;
import a6.InterfaceC0632a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.model.AccountLimitsFooterItem;
import com.paymaya.domain.model.AccountLimitsLoadingItem;
import com.paymaya.domain.store.M;
import com.paymaya.mayaui.accountlimits.view.activity.impl.MayaAccountLimitsActivity;
import d6.C1332a;
import d6.C1333b;
import e6.b;
import f6.InterfaceC1467c;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaAccountLimitsPageFragment extends MayaBaseFragment implements b {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public D f11520U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public LottieAnimationView f11521V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public b6.b f11522W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public InterfaceC1467c f11523X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C1332a f11524Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public String f11525Z;

    public final InterfaceC0632a G1() {
        b6.b bVar = this.f11522W;
        if (bVar != null) {
            return bVar;
        }
        j.n("mAccountLimitsPageFragmentPresenter");
        throw null;
    }

    public final void H1(ArrayList arrayList) {
        C1332a c1332a = this.f11524Y;
        if (c1332a != null) {
            ArrayList arrayList2 = c1332a.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            c1332a.notifyDataSetChanged();
        }
        D d10 = this.f11520U;
        j.d(d10);
        d10.c.i();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11523X = (InterfaceC1467c) getActivity();
        a aVar = W4.a.e().g().f4756a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        this.f11522W = new b6.b(preference);
        ((AbstractC2509a) G1()).h(this);
        Bundle arguments = getArguments();
        this.f11525Z = arguments != null ? arguments.getString("mode") : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_account_limits_page, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view);
        if (recyclerView != null) {
            i = R.id.swipe_refresh_layout;
            SpringView springView = (SpringView) ViewBindings.findChildViewById(viewInflate, R.id.swipe_refresh_layout);
            if (springView != null) {
                this.f11520U = new D(constraintLayout, recyclerView, springView);
                return constraintLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) G1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11520U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC1467c interfaceC1467c = this.f11523X;
        if (interfaceC1467c != null) {
            ((MayaAccountLimitsActivity) interfaceC1467c).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        D d10 = this.f11520U;
        j.d(d10);
        e eVar = new e();
        SpringView springView = d10.c;
        springView.setHeader(eVar);
        View viewFindViewById = springView.getHeaderView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.f11521V = (LottieAnimationView) viewFindViewById;
        springView.setListener(new M(this, 6));
        D d11 = this.f11520U;
        j.d(d11);
        Context context = getContext();
        if (context != null) {
            String str = this.f11525Z;
            String strL = ((b6.b) G1()).f8541d.l();
            j.f(strL, "getKYCStatus(...)");
            this.f11524Y = new C1332a(context, str, strL, this);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), 1, false);
            RecyclerView recyclerView = d11.f3578d;
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(this.f11524Y);
            recyclerView.addItemDecoration(new C1333b(context));
        }
        InterfaceC0632a interfaceC0632aG1 = G1();
        String str2 = this.f11525Z;
        b6.b bVar = (b6.b) interfaceC0632aG1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AccountLimitsLoadingItem());
        if (j.b(str2, "Daily")) {
            AccountLimitsFooterItem accountLimitsFooterItemBuild = AccountLimitsFooterItem.sBuilder().mHeaderType(0).build();
            j.f(accountLimitsFooterItemBuild, "build(...)");
            arrayList.add(accountLimitsFooterItemBuild);
        } else if (j.b(str2, "Monthly")) {
            AccountLimitsFooterItem accountLimitsFooterItemBuild2 = AccountLimitsFooterItem.sBuilder().mHeaderType(1).build();
            j.f(accountLimitsFooterItemBuild2, "build(...)");
            arrayList.add(accountLimitsFooterItemBuild2);
        }
        ((MayaAccountLimitsPageFragment) ((b) bVar.c.get())).H1(arrayList);
    }
}
