package com.paymaya.mayaui.newmayacredit.view.fragment.impl;

import G6.w;
import Gc.h;
import J7.e;
import J7.l;
import Kh.C0310o;
import Kh.z;
import L9.C0329g;
import L9.C0331i;
import N5.L;
import O9.b;
import P9.c;
import Q9.C0576f;
import Q9.InterfaceC0575e;
import S9.a;
import Uh.d;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.data.database.repository.m;
import com.paymaya.domain.store.A;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.MayaCreditTransactionListActivity;
import com.paymaya.ui.dashboard.view.widget.DashboardLayoutManager;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaCreditTransactionListFragment extends MayaBaseLoadingFragment implements c, a {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public L f13112o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SpringView f13113p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public RecyclerView f13114q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public C0331i f13115r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public InterfaceC0575e f13116s0;
    public b t0;
    public DashboardLayoutManager u0;
    public LottieAnimationView w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public LottieAnimationView f13118x0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f13117v0 = true;
    public final boolean y0 = true;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final boolean f13119z0 = true;

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        L lA = L.a(layoutInflater, viewGroup);
        this.f13112o0 = lA;
        SpringView springView = lA.f3723b;
        j.f(springView, "getRoot(...)");
        return springView;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_reusable_error, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading_progress, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final C0331i P1() {
        C0331i c0331i = this.f13115r0;
        if (c0331i != null) {
            return c0331i;
        }
        j.n("mFragmentPresenterMaya");
        throw null;
    }

    public final void Q1(boolean z4) {
        SpringView springView = this.f13113p0;
        if (springView != null) {
            springView.setEnableFooter(z4);
        } else {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().i();
        this.f13116s0 = (InterfaceC0575e) getActivity();
        O5.a aVar = (O5.a) W4.a.e().b().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        aVar.V();
        aVar.g();
        aVar.o();
        this.f13115r0 = new C0331i(aVar.m(), (d) aVar.f4748y.get());
        P1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        P1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f13112o0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC0575e interfaceC0575e = this.f13116s0;
        if (interfaceC0575e != null) {
            ((MayaCreditTransactionListActivity) interfaceC0575e).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        L l6 = this.f13112o0;
        j.d(l6);
        this.f13113p0 = l6.f3724d;
        L l8 = this.f13112o0;
        j.d(l8);
        this.f13114q0 = l8.c;
        this.u0 = new DashboardLayoutManager(getActivity(), 1, false);
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        this.t0 = new b(contextRequireContext, this);
        RecyclerView recyclerView = this.f13114q0;
        if (recyclerView == null) {
            j.n("mRecyclerViewTransactions");
            throw null;
        }
        recyclerView.setLayoutManager(this.u0);
        RecyclerView recyclerView2 = this.f13114q0;
        if (recyclerView2 == null) {
            j.n("mRecyclerViewTransactions");
            throw null;
        }
        recyclerView2.setAdapter(this.t0);
        l lVar = new l(this.t0);
        RecyclerView recyclerView3 = this.f13114q0;
        if (recyclerView3 == null) {
            j.n("mRecyclerViewTransactions");
            throw null;
        }
        recyclerView3.addItemDecoration(lVar);
        RecyclerView recyclerView4 = this.f13114q0;
        if (recyclerView4 == null) {
            j.n("mRecyclerViewTransactions");
            throw null;
        }
        recyclerView4.addOnScrollListener(new C0576f(this));
        SpringView springView = this.f13113p0;
        if (springView == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView.setHeader(new e());
        SpringView springView2 = this.f13113p0;
        if (springView2 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView2.setFooter(new h(1));
        SpringView springView3 = this.f13113p0;
        if (springView3 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        View viewFindViewById = springView3.getHeaderView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.w0 = (LottieAnimationView) viewFindViewById;
        SpringView springView4 = this.f13113p0;
        if (springView4 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        View viewFindViewById2 = springView4.getFooterView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById2, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.f13118x0 = (LottieAnimationView) viewFindViewById2;
        SpringView springView5 = this.f13113p0;
        if (springView5 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView5.setListener(new w(this, 28));
        FragmentActivity activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.newmayacredit.view.activity.impl.MayaCreditTransactionListActivity");
        String accountId = ((MayaCreditTransactionListActivity) activity).f13078n;
        C0331i c0331iP1 = P1();
        j.g(accountId, "accountId");
        c0331iP1.j();
        c0331iP1.h = accountId;
        A a8 = c0331iP1.f2890d;
        z2.d dVar = new z2.d(6);
        m mVar = a8.f11332d;
        mVar.getClass();
        c0331iP1.e(new C0310o(new z(mVar.f11315a.d("credit_transaction", dVar), new Qd.a(mVar, 29), 0).e(zh.b.a()).c(C0329g.f2888a), new w(c0331iP1, 9), Eh.d.c, Eh.d.f1365b).f());
        if (((MayaBaseLoadingFragment) ((c) c0331iP1.c.get())).f10359n0) {
            return;
        }
        c0331iP1.k(true);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean p1() {
        return this.y0;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean r1() {
        return this.f13119z0;
    }
}
