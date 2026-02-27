package com.paymaya.ui.shopv3.view.fragment.impl;

import Kh.T;
import Lh.d;
import Lh.h;
import N5.k1;
import O5.a;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import com.paymaya.common.base.BaseLoadingFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import re.InterfaceC2203c;
import se.g;
import se.i;
import ue.r;
import ve.f;
import we.C2429r;
import we.C2433v;
import we.InterfaceC2432u;
import we.RunnableC2431t;
import y5.AbstractC2509a;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class ShopV3ProviderProductsListFragment extends BaseLoadingFragment implements f {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f14827o0 = z.a(ShopV3ProviderProductsListFragment.class).c();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f14828p0 = "is_initially_loaded";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f14829q0 = "current_page";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f14830r0 = "layout_manager";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f14831s0 = "product_list_items";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public i f14832a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public k1 f14833b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Toolbar f14834c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ImageView f14835d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public LottieAnimationView f14836e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public RecyclerView f14837f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public SwipeRefreshLayout f14838g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f14839h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f14840i0 = 1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public r f14841j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public InterfaceC2432u f14842k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f14843l0;
    public boolean m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ShopProvider f14844n0;

    public static final void D1(ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment) {
        i iVar = (i) shopV3ProviderProductsListFragment.A1();
        if (((ShopV3ProviderProductsListFragment) ((f) iVar.c.get())).m0) {
            ((ShopV3ProviderProductsListFragment) ((f) iVar.c.get())).C1();
            return;
        }
        ((ShopV3ProviderProductsListFragment) ((f) iVar.c.get())).m0 = true;
        ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment2 = (ShopV3ProviderProductsListFragment) ((f) iVar.c.get());
        SwipeRefreshLayout swipeRefreshLayout = shopV3ProviderProductsListFragment2.f14838g0;
        if (swipeRefreshLayout == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        if (!swipeRefreshLayout.isRefreshing()) {
            SwipeRefreshLayout swipeRefreshLayout2 = shopV3ProviderProductsListFragment2.f14838g0;
            if (swipeRefreshLayout2 == null) {
                j.n("mSwipeRefreshLayout");
                throw null;
            }
            swipeRefreshLayout2.post(new RunnableC2431t(shopV3ProviderProductsListFragment2, 0));
        }
        new T(5, new d(new d(new h(iVar.f20065d.c(1, ((ShopV3ProviderProductsListFragment) ((f) iVar.c.get())).B1().getName(), true), b.a(), 0), new o6.f(iVar, 13), 2), new se.h(iVar, 1), 0), new g(iVar, 0)).e();
    }

    public final InterfaceC2203c A1() {
        i iVar = this.f14832a0;
        if (iVar != null) {
            return iVar;
        }
        j.n("mShopProviderProductsListFragmentPresenter");
        throw null;
    }

    public final ShopProvider B1() {
        ShopProvider shopProvider = this.f14844n0;
        if (shopProvider != null) {
            return shopProvider;
        }
        j.n("mShopProvider");
        throw null;
    }

    public final void C1() {
        SwipeRefreshLayout swipeRefreshLayout = this.f14838g0;
        if (swipeRefreshLayout == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        if (swipeRefreshLayout.isRefreshing()) {
            SwipeRefreshLayout swipeRefreshLayout2 = this.f14838g0;
            if (swipeRefreshLayout2 != null) {
                swipeRefreshLayout2.post(new RunnableC2431t(this, 1));
            } else {
                j.n("mSwipeRefreshLayout");
                throw null;
            }
        }
    }

    public final void E1(List products) {
        j.g(products, "products");
        r rVar = this.f14841j0;
        if (rVar != null) {
            rVar.g(products);
        } else {
            j.n("mProductsAdapter");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Parcelable parcelable = arguments.getParcelable("shop_provider");
            j.d(parcelable);
            this.f14844n0 = (ShopProvider) parcelable;
        }
        this.f10249R = true;
        setHasOptionsMenu(true);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListFragment.ShopV3ProviderProductsListFragmentListener");
        this.f14842k0 = (InterfaceC2432u) activity;
        a aVar = W4.a.e().H().f4756a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14832a0 = new i(aVar.I(), (Uh.d) aVar.f4748y.get());
        ((AbstractC2509a) A1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        j.g(menu, "menu");
        j.g(menuInflater, "menuInflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        Toolbar toolbar = this.f14834c0;
        if (toolbar == null) {
            j.n("mToolbar");
            throw null;
        }
        toolbar.inflateMenu(R.menu.pma_menu_shop_v3);
        Toolbar toolbar2 = this.f14834c0;
        if (toolbar2 == null) {
            j.n("mToolbar");
            throw null;
        }
        toolbar2.setOnMenuItemClickListener(new C2429r(this));
        Toolbar toolbar3 = this.f14834c0;
        if (toolbar3 == null) {
            j.n("mToolbar");
            throw null;
        }
        toolbar3.getMenu().findItem(R.id.pma_menu_shop_purchase_history_icon).setVisible(false);
        Toolbar toolbar4 = this.f14834c0;
        if (toolbar4 == null) {
            j.n("mToolbar");
            throw null;
        }
        toolbar4.getMenu().findItem(R.id.pma_menu_shop_purchase_history_icon).setEnabled(false);
        Toolbar toolbar5 = this.f14834c0;
        if (toolbar5 == null) {
            j.n("mToolbar");
            throw null;
        }
        toolbar5.getMenu().findItem(R.id.pma_menu_shop_search_icon).setEnabled(true);
        Toolbar toolbar6 = this.f14834c0;
        if (toolbar6 != null) {
            toolbar6.getMenu().findItem(R.id.pma_menu_shop_search_icon).setEnabled(true);
        } else {
            j.n("mToolbar");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) A1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14833b0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC2432u interfaceC2432u = this.f14842k0;
        if (interfaceC2432u == null) {
            j.n("mShopProviderProductsListFragmentListener");
            throw null;
        }
        Bundle bundleT1 = ((ShopV3Activity) interfaceC2432u).t1();
        bundleT1.putBoolean(f14828p0, this.f14839h0);
        bundleT1.putInt(f14829q0, this.f14840i0);
        RecyclerView recyclerView = this.f14837f0;
        if (recyclerView == null) {
            j.n("mProductsRecyclerView");
            throw null;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        bundleT1.putParcelable(f14830r0, layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        r rVar = this.f14841j0;
        if (rVar == null) {
            j.n("mProductsAdapter");
            throw null;
        }
        ArrayList arrayList = rVar.f20306b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof ProductV3) {
                arrayList2.add(obj);
            }
        }
        bundleT1.putParcelableArrayList(f14831s0, new ArrayList<>(arrayList2));
        InterfaceC2432u interfaceC2432u2 = this.f14842k0;
        if (interfaceC2432u2 == null) {
            j.n("mShopProviderProductsListFragmentListener");
            throw null;
        }
        Bundle bundleT12 = ((ShopV3Activity) interfaceC2432u2).t1();
        bundleT12.putBundle(f14827o0, bundleT1);
        InterfaceC2432u interfaceC2432u3 = this.f14842k0;
        if (interfaceC2432u3 == null) {
            j.n("mShopProviderProductsListFragmentListener");
            throw null;
        }
        ((ShopV3Activity) interfaceC2432u3).j = bundleT12;
        super.onPause();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2432u interfaceC2432u = this.f14842k0;
        if (interfaceC2432u != null) {
            ((ShopV3Activity) interfaceC2432u).Q(this);
        } else {
            j.n("mShopProviderProductsListFragmentListener");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f14834c0 = (Toolbar) requireActivity().findViewById(R.id.pma_view_toolbar);
        k1 k1Var = this.f14833b0;
        j.d(k1Var);
        this.f14835d0 = (ImageView) k1Var.f4138b;
        k1 k1Var2 = this.f14833b0;
        j.d(k1Var2);
        this.f14836e0 = (LottieAnimationView) k1Var2.c;
        k1 k1Var3 = this.f14833b0;
        j.d(k1Var3);
        this.f14837f0 = (RecyclerView) k1Var3.f4139d;
        k1 k1Var4 = this.f14833b0;
        j.d(k1Var4);
        this.f14838g0 = (SwipeRefreshLayout) k1Var4.f;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), 1, false);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        this.f14841j0 = new r(fragmentActivityRequireActivity, this);
        RecyclerView recyclerView = this.f14837f0;
        if (recyclerView == null) {
            j.n("mProductsRecyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.f14837f0;
        if (recyclerView2 == null) {
            j.n("mProductsRecyclerView");
            throw null;
        }
        r rVar = this.f14841j0;
        if (rVar == null) {
            j.n("mProductsAdapter");
            throw null;
        }
        recyclerView2.setAdapter(rVar);
        RecyclerView recyclerView3 = this.f14837f0;
        if (recyclerView3 == null) {
            j.n("mProductsRecyclerView");
            throw null;
        }
        recyclerView3.addOnScrollListener(new C2433v(this, linearLayoutManager));
        SwipeRefreshLayout swipeRefreshLayout = this.f14838g0;
        if (swipeRefreshLayout == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        swipeRefreshLayout.setOnRefreshListener(new C2429r(this));
        ((i) A1()).j();
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View s1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        View viewInflate = layoutInflater.inflate(R.layout.pma_fragment_shop_v3_provider_products_list, container, false);
        int i = R.id.banner_loading_lottie_view_pma_fragment_shop_v3_provider_products_list;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.banner_loading_lottie_view_pma_fragment_shop_v3_provider_products_list);
        if (lottieAnimationView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.container_swipe_refresh_layout_pma_fragment_shop_v3_provider_products_list;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(viewInflate, R.id.container_swipe_refresh_layout_pma_fragment_shop_v3_provider_products_list);
            if (swipeRefreshLayout != null) {
                i = R.id.products_recycler_view_pma_fragment_shop_v3_provider_products_list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.products_recycler_view_pma_fragment_shop_v3_provider_products_list);
                if (recyclerView != null) {
                    i = R.id.provider_banner_image_view_pma_fragment_shop_v3_provider_products_list;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.provider_banner_image_view_pma_fragment_shop_v3_provider_products_list);
                    if (imageView != null) {
                        this.f14833b0 = new k1(constraintLayout, lottieAnimationView, swipeRefreshLayout, recyclerView, imageView);
                        j.f(constraintLayout, "getRoot(...)");
                        return constraintLayout;
                    }
                }
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
