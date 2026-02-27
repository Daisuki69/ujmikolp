package com.paymaya.mayaui.paybills.view.fragment.impl;

import Bb.f;
import Gc.h;
import J7.e;
import N5.L;
import O5.a;
import S5.c;
import Uh.d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.google.firebase.messaging.p;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.BillerCategory;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.ui.dashboard.view.widget.DashboardLayoutManager;
import ea.l;
import ga.b;
import ha.C1552e;
import ha.InterfaceC1551d;
import java.util.HashMap;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaBillersFragment extends MayaBaseLoadingFragment implements b {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public DashboardLayoutManager f13372A0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public L f13373o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SpringView f13374p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public LottieAnimationView f13375q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public LottieAnimationView f13376r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public f f13377s0;
    public InterfaceC1551d t0;
    public l u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public BillerCategory f13378v0;
    public boolean y0;
    public String w0 = "";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f13379x0 = 1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f13380z0 = true;

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_billers, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.billers_recycler_view);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.billers_recycler_view)));
        }
        SpringView springView = (SpringView) viewInflate;
        this.f13373o0 = new L(springView, recyclerView, springView, 0);
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

    public final BillerCategory P1() {
        BillerCategory billerCategory = this.f13378v0;
        if (billerCategory != null) {
            return billerCategory;
        }
        j.n("billerCategory");
        throw null;
    }

    public final f Q1() {
        f fVar = this.f13377s0;
        if (fVar != null) {
            return fVar;
        }
        j.n("mBillersFragmentPresenter");
        throw null;
    }

    public final void R1(boolean z4) {
        SpringView springView = this.f13374p0;
        if (springView != null) {
            springView.setEnableFooter(z4);
        } else {
            j.n("mSpringViewContainer");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a aVar = W4.a.e().t().f4754a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f13377s0 = new f(aVar.g(), (d) aVar.f4748y.get(), 15);
        this.t0 = (InterfaceC1551d) getActivity();
        Q1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Q1().i();
        super.onDestroy();
        this.f13373o0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (t1().e().isBillsPayEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1173g.b(4));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String strMSlug = P1().mSlug();
            HashMap map = c1219hE.j;
            map.put("category_slug", strMSlug);
            map.put("category_name", P1().mName());
            o1().b(c1219hE);
        }
        InterfaceC1551d interfaceC1551d = this.t0;
        if (interfaceC1551d != null) {
            ((MayaPayBillsActivity) interfaceC1551d).f13344w = "Category";
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC1551d interfaceC1551d = this.t0;
        if (interfaceC1551d != null) {
            ((MayaPayBillsActivity) interfaceC1551d).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        BillerCategory billerCategoryBuild;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        this.u0 = new l(this, t1().e().isBillersItemsListAcceptsMayaCreditSubtextEnabled());
        L l6 = this.f13373o0;
        j.d(l6);
        RecyclerView recyclerView = l6.c;
        DashboardLayoutManager dashboardLayoutManager = new DashboardLayoutManager(recyclerView.getContext());
        this.f13372A0 = dashboardLayoutManager;
        recyclerView.setLayoutManager(dashboardLayoutManager);
        l lVar = this.u0;
        if (lVar == null) {
            j.n("mBillersListAdapter");
            throw null;
        }
        recyclerView.setAdapter(lVar);
        recyclerView.addOnScrollListener(new C1552e(this));
        L l8 = this.f13373o0;
        j.d(l8);
        SpringView springView = l8.f3724d;
        this.f13374p0 = springView;
        if (springView == null) {
            j.n("mSpringViewContainer");
            throw null;
        }
        springView.setHeader(new e());
        springView.setFooter(new h(1));
        View viewFindViewById = springView.getHeaderView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.f13375q0 = (LottieAnimationView) viewFindViewById;
        View viewFindViewById2 = springView.getFooterView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById2, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.f13376r0 = (LottieAnimationView) viewFindViewById2;
        springView.setListener(new p(this, 12));
        Bundle arguments = getArguments();
        if (arguments == null || (billerCategoryBuild = (BillerCategory) arguments.getParcelable("biller_category")) == null) {
            billerCategoryBuild = BillerCategory.sBuilder().mName("").mSlug("").build();
            j.f(billerCategoryBuild, "build(...)");
        }
        this.f13378v0 = billerCategoryBuild;
        Q1().j();
    }
}
