package com.paymaya.mayaui.shop.view.fragment.impl;

import N5.D;
import O5.a;
import O6.b;
import R4.i;
import S5.c;
import Uh.d;
import Wb.e;
import Xb.y;
import ac.z;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import bc.j;
import cc.x;
import com.airbnb.lottie.LottieAnimationView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import java.util.ArrayList;
import java.util.List;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaShopProvidersCollectionFragment extends MayaBaseLoadingFragment implements j {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public y f14099o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public D f14100p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public LottieAnimationView f14101q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f14102r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public z f14103s0;
    public x t0;
    public boolean u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final EnumC1216e f14104v0 = EnumC1216e.PROVIDERS;

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_shop_providers_collection, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.container_swipe_refresh_layout;
        SpringView springView = (SpringView) ViewBindings.findChildViewById(viewInflate, R.id.container_swipe_refresh_layout);
        if (springView != null) {
            i = R.id.providers_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.providers_recycler_view);
            if (recyclerView != null) {
                i = R.id.providers_scrollview;
                if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.providers_scrollview)) != null) {
                    this.f14100p0 = new D(constraintLayout, springView, recyclerView);
                    kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_reusable_error, viewGroup, false);
        kotlin.jvm.internal.j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading_progress, viewGroup, false);
        kotlin.jvm.internal.j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final RecyclerView P1() {
        D d10 = this.f14100p0;
        kotlin.jvm.internal.j.d(d10);
        RecyclerView providersRecyclerView = d10.f3578d;
        kotlin.jvm.internal.j.f(providersRecyclerView, "providersRecyclerView");
        return providersRecyclerView;
    }

    public final e Q1() {
        y yVar = this.f14099o0;
        if (yVar != null) {
            return yVar;
        }
        kotlin.jvm.internal.j.n("mShopProvidersCollectionFragmentPresenter");
        throw null;
    }

    public final SpringView R1() {
        D d10 = this.f14100p0;
        kotlin.jvm.internal.j.d(d10);
        SpringView containerSwipeRefreshLayout = d10.c;
        kotlin.jvm.internal.j.f(containerSwipeRefreshLayout, "containerSwipeRefreshLayout");
        return containerSwipeRefreshLayout;
    }

    public final void S1(List items) {
        kotlin.jvm.internal.j.g(items, "items");
        z zVar = this.f14103s0;
        if (zVar != null) {
            zVar.e(items);
        } else {
            kotlin.jvm.internal.j.n("mProvidersCollectionAdapter");
            throw null;
        }
    }

    public final void T1(String str) {
        x xVar = this.t0;
        if (xVar != null) {
            String string = getString(R.string.maya_label_that_didnt_load_right);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            String string2 = getString(R.string.maya_label_connection_issue);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            ((MayaShopV2Activity) xVar).o(string, string2);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return this.f14104v0;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        if (getActivity() instanceof x) {
            KeyEventDispatcher.Component activity = getActivity();
            kotlin.jvm.internal.j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProvidersCollectionFragment.MayaShopProvidersCollectionFragmentListener");
            this.t0 = (x) activity;
        }
        a aVar = W4.a.e().z().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f14099o0 = new y(aVar.Q(), (d) aVar.f4748y.get());
        ((AbstractC2509a) Q1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) Q1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14100p0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        x xVar = this.t0;
        Bundle bundle = null;
        if (xVar != null) {
            Bundle bundleW1 = ((MayaShopV2Activity) xVar).W1();
            bundleW1.putBoolean("provider_collection_is_initially_loaded", this.f14102r0);
            RecyclerView.LayoutManager layoutManager = P1().getLayoutManager();
            bundleW1.putParcelable("provider_collection_layout_manager", layoutManager != null ? layoutManager.onSaveInstanceState() : null);
            z zVar = this.f14103s0;
            if (zVar == null) {
                kotlin.jvm.internal.j.n("mProvidersCollectionAdapter");
                throw null;
            }
            ArrayList arrayList = zVar.f7127b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof ShopProvider) {
                    arrayList2.add(obj);
                }
            }
            bundleW1.putParcelableArrayList("provider_collection_list_items", new ArrayList<>(arrayList2));
            bundle = bundleW1;
        }
        x xVar2 = this.t0;
        if (xVar2 != null) {
            ((MayaShopV2Activity) xVar2).m = bundle;
        }
        super.onPause();
        if (t1().e().isShopEventsV2Enabled()) {
            o1().b(C1219h.e(AbstractC1213b.w(3)));
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        x xVar = this.t0;
        if (xVar != null) {
            ((MayaShopV2Activity) xVar).Q(this);
        }
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        c1219h.i();
        A1(c1219h);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        R1().setHeader(new J7.e());
        View viewFindViewById = R1().getHeaderView().findViewById(R.id.lottie_view);
        kotlin.jvm.internal.j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.f14101q0 = (LottieAnimationView) viewFindViewById;
        R1().setListener(new i(this, 26));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), 1, false);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        this.f14103s0 = new z(fragmentActivityRequireActivity, this);
        P1().setLayoutManager(linearLayoutManager);
        RecyclerView recyclerViewP1 = P1();
        z zVar = this.f14103s0;
        if (zVar == null) {
            kotlin.jvm.internal.j.n("mProvidersCollectionAdapter");
            throw null;
        }
        recyclerViewP1.setAdapter(zVar);
        RecyclerView recyclerViewP12 = P1();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
        b bVar = new b(contextRequireContext, 1);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.maya_divider_recycler_view);
        if (drawable != null) {
            bVar.f4759a = drawable;
        }
        recyclerViewP12.addItemDecoration(bVar);
        this.u0 = false;
        x xVar = this.t0;
        this.f14102r0 = xVar != null && ((MayaShopV2Activity) xVar).W1().getBoolean("provider_collection_is_initially_loaded", false);
        ((y) Q1()).j();
    }
}
