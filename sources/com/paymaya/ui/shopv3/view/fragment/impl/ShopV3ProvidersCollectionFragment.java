package com.paymaya.ui.shopv3.view.fragment.impl;

import Kh.T;
import Lh.d;
import N5.C0450f;
import O5.a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.BaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import l9.C1803a;
import o6.f;
import oi.C1983a;
import re.InterfaceC2204d;
import se.k;
import se.l;
import ue.u;
import ve.h;
import we.InterfaceC2400E;
import we.RunnableC2398C;
import y5.AbstractC2509a;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class ShopV3ProvidersCollectionFragment extends BaseLoadingFragment implements h {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public l f14855a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public C0450f f14856b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f14857c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public u f14858d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public InterfaceC2400E f14859e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f14860f0;

    public static final void D1(ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment) {
        l lVar = (l) shopV3ProvidersCollectionFragment.B1();
        if (((ShopV3ProvidersCollectionFragment) ((h) lVar.c.get())).f14860f0) {
            ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment2 = (ShopV3ProvidersCollectionFragment) ((h) lVar.c.get());
            if (shopV3ProvidersCollectionFragment2.C1().isRefreshing()) {
                shopV3ProvidersCollectionFragment2.C1().post(new RunnableC2398C(shopV3ProvidersCollectionFragment2, 1));
                return;
            }
            return;
        }
        ((ShopV3ProvidersCollectionFragment) ((h) lVar.c.get())).f14860f0 = true;
        ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment3 = (ShopV3ProvidersCollectionFragment) ((h) lVar.c.get());
        if (!shopV3ProvidersCollectionFragment3.C1().isRefreshing()) {
            shopV3ProvidersCollectionFragment3.C1().post(new RunnableC2398C(shopV3ProvidersCollectionFragment3, 0));
        }
        new T(5, new d(new d(new Lh.h(lVar.f20070d.a(), b.a(), 0), new C1983a(lVar, 16), 2), new f(lVar, 14), 0), new k(lVar, 0)).e();
    }

    public final RecyclerView A1() {
        C0450f c0450f = this.f14856b0;
        j.d(c0450f);
        RecyclerView recyclerView = (RecyclerView) c0450f.f4088d;
        j.f(recyclerView, "providersRecyclerViewPma…ShopV3ProvidersCollection");
        return recyclerView;
    }

    public final InterfaceC2204d B1() {
        l lVar = this.f14855a0;
        if (lVar != null) {
            return lVar;
        }
        j.n("mShopProvidersCollectionFragmentPresenter");
        throw null;
    }

    public final SwipeRefreshLayout C1() {
        C0450f c0450f = this.f14856b0;
        j.d(c0450f);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) c0450f.f4087b;
        j.f(swipeRefreshLayout, "containerSwipeRefreshLay…ShopV3ProvidersCollection");
        return swipeRefreshLayout;
    }

    public final void E1(List items) {
        j.g(items, "items");
        u uVar = this.f14858d0;
        if (uVar != null) {
            uVar.e(items);
        } else {
            j.n("mProvidersCollectionAdapter");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.PROVIDERS;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        setHasOptionsMenu(true);
        if (getActivity() instanceof InterfaceC2400E) {
            KeyEventDispatcher.Component activity = getActivity();
            j.e(activity, "null cannot be cast to non-null type com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProvidersCollectionFragment.ShopV3ProvidersCollectionFragmentListener");
            this.f14859e0 = (InterfaceC2400E) activity;
        }
        a aVar = W4.a.e().H().f4756a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14855a0 = new l(aVar.Q(), (Uh.d) aVar.f4748y.get());
        ((AbstractC2509a) B1()).h(this);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) B1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14856b0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC2400E interfaceC2400E = this.f14859e0;
        Bundle bundle = null;
        if (interfaceC2400E != null) {
            Bundle bundleT1 = ((ShopV3Activity) interfaceC2400E).t1();
            bundleT1.putBoolean("provider_collection_is_initially_loaded", this.f14857c0);
            RecyclerView.LayoutManager layoutManager = A1().getLayoutManager();
            bundleT1.putParcelable("provider_collection_layout_manager", layoutManager != null ? layoutManager.onSaveInstanceState() : null);
            u uVar = this.f14858d0;
            if (uVar == null) {
                j.n("mProvidersCollectionAdapter");
                throw null;
            }
            ArrayList arrayList = uVar.c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof ShopProvider) {
                    arrayList2.add(obj);
                }
            }
            bundleT1.putParcelableArrayList("provider_collection_list_items", new ArrayList<>(arrayList2));
            bundle = bundleT1;
        }
        InterfaceC2400E interfaceC2400E2 = this.f14859e0;
        if (interfaceC2400E2 != null) {
            ((ShopV3Activity) interfaceC2400E2).j = bundle;
        }
        super.onPause();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2400E interfaceC2400E = this.f14859e0;
        if (interfaceC2400E != null) {
            ((ShopV3Activity) interfaceC2400E).Q(this);
        }
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        o1(c1219h);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), 1, false);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        this.f14858d0 = new u(fragmentActivityRequireActivity, this);
        A1().setLayoutManager(linearLayoutManager);
        RecyclerView recyclerViewA1 = A1();
        u uVar = this.f14858d0;
        if (uVar == null) {
            j.n("mProvidersCollectionAdapter");
            throw null;
        }
        recyclerViewA1.setAdapter(uVar);
        C1().setOnRefreshListener(new C1803a(this, 23));
        this.f14860f0 = false;
        InterfaceC2400E interfaceC2400E = this.f14859e0;
        this.f14857c0 = interfaceC2400E != null && ((ShopV3Activity) interfaceC2400E).t1().getBoolean("provider_collection_is_initially_loaded", false);
        ((l) B1()).j();
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View s1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        View viewInflate = layoutInflater.inflate(R.layout.pma_fragment_shop_v3_providers_collection, container, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.container_swipe_refresh_layout_pma_fragment_shop_v3_providers_collection;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(viewInflate, R.id.container_swipe_refresh_layout_pma_fragment_shop_v3_providers_collection);
        if (swipeRefreshLayout != null) {
            i = R.id.providers_recycler_view_pma_fragment_shop_v3_providers_collection;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.providers_recycler_view_pma_fragment_shop_v3_providers_collection);
            if (recyclerView != null) {
                this.f14856b0 = new C0450f((ViewGroup) constraintLayout, (Object) swipeRefreshLayout, (Object) recyclerView, 24);
                j.f(constraintLayout, "getRoot(...)");
                return constraintLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View t1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_error2, container, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View u1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_loading_fullscreen, container, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
