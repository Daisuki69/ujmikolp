package com.paymaya.mayaui.dashboard.view.fragment.impl;

import A7.o;
import D7.h;
import F7.c;
import G7.r;
import G7.s;
import J7.e;
import J7.l;
import N5.L;
import O5.a;
import Uh.d;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaTransactionsActivity;
import com.paymaya.ui.dashboard.view.widget.DashboardLayoutManager;
import jk.b;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;
import z7.InterfaceC2554a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaTransactionsFragment extends MayaBaseLoadingFragment implements c {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public L f12201o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SpringView f12202p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public RecyclerView f12203q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public o f12204r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public r f12205s0;
    public h t0;
    public DashboardLayoutManager u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f12206v0 = true;
    public LottieAnimationView w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public LottieAnimationView f12207x0;

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        L lA = L.a(layoutInflater, viewGroup);
        this.f12201o0 = lA;
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

    public final InterfaceC2554a P1() {
        o oVar = this.f12204r0;
        if (oVar != null) {
            return oVar;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    public final void Q1(boolean z4) {
        SpringView springView = this.f12202p0;
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
        this.f12205s0 = (r) getActivity();
        a aVar = (a) W4.a.e().b().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f12204r0 = new o(aVar.V(), aVar.g(), (com.paymaya.data.preference.a) aVar.e.get(), aVar.o(), aVar.U(), (d) aVar.f4748y.get());
        ((AbstractC2509a) P1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) P1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f12201o0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        r rVar = this.f12205s0;
        if (rVar != null) {
            ((MayaTransactionsActivity) rVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        L l6 = this.f12201o0;
        j.d(l6);
        this.f12202p0 = l6.f3724d;
        L l8 = this.f12201o0;
        j.d(l8);
        this.f12203q0 = l8.c;
        this.u0 = new DashboardLayoutManager(getActivity(), 1, false);
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        this.t0 = new h(contextRequireContext, this, t1());
        RecyclerView recyclerView = this.f12203q0;
        if (recyclerView == null) {
            j.n("mRecyclerViewTransactions");
            throw null;
        }
        recyclerView.setLayoutManager(this.u0);
        RecyclerView recyclerView2 = this.f12203q0;
        if (recyclerView2 == null) {
            j.n("mRecyclerViewTransactions");
            throw null;
        }
        recyclerView2.setAdapter(this.t0);
        l lVar = new l(this.t0);
        RecyclerView recyclerView3 = this.f12203q0;
        if (recyclerView3 == null) {
            j.n("mRecyclerViewTransactions");
            throw null;
        }
        recyclerView3.addItemDecoration(lVar);
        RecyclerView recyclerView4 = this.f12203q0;
        if (recyclerView4 == null) {
            j.n("mRecyclerViewTransactions");
            throw null;
        }
        recyclerView4.addOnScrollListener(new s(this));
        SpringView springView = this.f12202p0;
        if (springView == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView.setHeader(new e());
        SpringView springView2 = this.f12202p0;
        if (springView2 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView2.setFooter(new Gc.h(1));
        SpringView springView3 = this.f12202p0;
        if (springView3 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        View viewFindViewById = springView3.getHeaderView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.w0 = (LottieAnimationView) viewFindViewById;
        SpringView springView4 = this.f12202p0;
        if (springView4 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        View viewFindViewById2 = springView4.getFooterView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById2, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.f12207x0 = (LottieAnimationView) viewFindViewById2;
        SpringView springView5 = this.f12202p0;
        if (springView5 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        Context context = springView5.getContext();
        j.f(context, "getContext(...)");
        springView5.setBackgroundColor(b.n(context, R.attr.mayaColorBackgroundPrimaryAlt));
        SpringView springView6 = this.f12202p0;
        if (springView6 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView6.setListener(new A5.l(this, 28));
        ((o) P1()).j();
    }
}
