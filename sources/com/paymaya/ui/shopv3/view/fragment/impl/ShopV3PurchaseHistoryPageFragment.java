package com.paymaya.ui.shopv3.view.fragment.impl;

import N5.C0435a;
import Xb.A;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.BaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.data.preference.a;
import hd.C1562b;
import l9.C1803a;
import ue.x;
import ve.j;
import we.C2404I;
import we.InterfaceC2403H;

/* JADX INFO: loaded from: classes4.dex */
public class ShopV3PurchaseHistoryPageFragment extends BaseLoadingFragment implements j {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public A f14865a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public a f14866b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f14867c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public String f14868d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public String f14869e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public x f14870f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public InterfaceC2403H f14871g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public C0435a f14872h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public RecyclerView f14873i0;

    public final A A1() {
        A a8 = this.f14865a0;
        if (a8 != null) {
            return a8;
        }
        kotlin.jvm.internal.j.n("mShopV3PurchaseHistoryPageFragmentPresenter");
        throw null;
    }

    public final SwipeRefreshLayout B1() {
        C0435a c0435a = this.f14872h0;
        kotlin.jvm.internal.j.d(c0435a);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) c0435a.c;
        kotlin.jvm.internal.j.f(swipeRefreshLayout, "containerSwipeRefreshLay…ShopV3PurchaseHistoryPage");
        return swipeRefreshLayout;
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.PURCHASE_HISTORY;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14871g0 = (InterfaceC2403H) getActivity();
        O5.a aVar = W4.a.e().H().f4756a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (a) aVar.e.get();
        this.f14865a0 = new A(aVar.H(), (a) aVar.e.get(), 1);
        this.f14866b0 = (a) aVar.e.get();
        A1().h(this);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        A1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14872h0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        this.f10245B.d(getActivity(), this.f10248Q);
        super.onPause();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1219h c1219h = this.f10248Q;
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("status", this.f14869e0);
        C1220i c1220i = this.f10245B;
        C1219h c1219h2 = this.f10248Q;
        c1220i.getClass();
        C1220i.f(c1219h2);
        C1219h c1219h3 = new C1219h();
        c1219h3.n(2);
        c1219h3.j.put("status", this.f14869e0);
        o1(c1219h3);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        A1().k();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0435a c0435a = this.f14872h0;
        kotlin.jvm.internal.j.d(c0435a);
        ((ImageView) c0435a.f).setVisibility(0);
        C0435a c0435a2 = this.f14872h0;
        kotlin.jvm.internal.j.d(c0435a2);
        this.f14873i0 = (RecyclerView) c0435a2.f4049g;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), 1, false);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
        a aVar = this.f14866b0;
        if (aVar == null) {
            kotlin.jvm.internal.j.n("mPreference");
            throw null;
        }
        this.f14870f0 = new x(contextRequireContext, aVar, this);
        RecyclerView recyclerView = this.f14873i0;
        if (recyclerView == null) {
            kotlin.jvm.internal.j.n("mRecyclerViewItems");
            throw null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        x xVar = this.f14870f0;
        if (xVar == null) {
            kotlin.jvm.internal.j.n("mShopV3PurchaseHistoryItemAdapter");
            throw null;
        }
        recyclerView.setAdapter(xVar);
        x xVar2 = this.f14870f0;
        if (xVar2 == null) {
            kotlin.jvm.internal.j.n("mShopV3PurchaseHistoryItemAdapter");
            throw null;
        }
        recyclerView.addItemDecoration(new C1562b(xVar2, R.layout.pma_view_date_header_view_all));
        recyclerView.addOnScrollListener(new C2404I(this, linearLayoutManager));
        B1().setOnRefreshListener(new C1803a(this, 24));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f14868d0 = arguments.getString("shop_purchase_history_status");
            A aA1 = A1();
            String str = this.f14868d0;
            if (str == null) {
                str = "";
            }
            aA1.j();
            aA1.f = str;
            ((ShopV3PurchaseHistoryPageFragment) ((j) aA1.c.get())).z1();
            aA1.k();
            if ("KYUUBI_PENDING".equalsIgnoreCase(str)) {
                ShopV3PurchaseHistoryPageFragment shopV3PurchaseHistoryPageFragment = (ShopV3PurchaseHistoryPageFragment) ((j) aA1.c.get());
                shopV3PurchaseHistoryPageFragment.getClass();
                shopV3PurchaseHistoryPageFragment.f14869e0 = "pending";
            } else if ("DISBURSEMENT_SUCCESSFUL".equalsIgnoreCase(str)) {
                ShopV3PurchaseHistoryPageFragment shopV3PurchaseHistoryPageFragment2 = (ShopV3PurchaseHistoryPageFragment) ((j) aA1.c.get());
                shopV3PurchaseHistoryPageFragment2.getClass();
                shopV3PurchaseHistoryPageFragment2.f14869e0 = "completed";
            }
        }
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View s1(LayoutInflater layoutInflater, ViewGroup container) {
        kotlin.jvm.internal.j.g(container, "container");
        View viewInflate = layoutInflater.inflate(R.layout.pma_fragment_shop_v3_purchase_history_page, container, false);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
        int i = R.id.container_swipe_refresh_layout_pma_fragment_shop_v3_purchase_history_page;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(viewInflate, R.id.container_swipe_refresh_layout_pma_fragment_shop_v3_purchase_history_page);
        if (swipeRefreshLayout != null) {
            i = R.id.empty_constraint_group_pma_fragment_shop_v3_purchase_history_page;
            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.empty_constraint_group_pma_fragment_shop_v3_purchase_history_page);
            if (group != null) {
                i = R.id.empty_image_view_pma_fragment_shop_v3_purchase_history_page;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.empty_image_view_pma_fragment_shop_v3_purchase_history_page)) != null) {
                    i = R.id.empty_text_view_pma_fragment_shop_v3_purchase_history_page;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.empty_text_view_pma_fragment_shop_v3_purchase_history_page);
                    if (textView != null) {
                        i = R.id.green_background_gradient_image_view_pma_fragment_shop_v3_purchase_history_page;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.green_background_gradient_image_view_pma_fragment_shop_v3_purchase_history_page);
                        if (imageView != null) {
                            i = R.id.recycler_view_pma_fragment_shop_v3_purchase_history_page;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_pma_fragment_shop_v3_purchase_history_page);
                            if (recyclerView != null) {
                                this.f14872h0 = new C0435a(coordinatorLayout, swipeRefreshLayout, group, textView, imageView, recyclerView, 24);
                                kotlin.jvm.internal.j.f(coordinatorLayout, "getRoot(...)");
                                return coordinatorLayout;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View t1(LayoutInflater layoutInflater, ViewGroup container) {
        kotlin.jvm.internal.j.g(container, "container");
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_error3, container, false);
        kotlin.jvm.internal.j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View u1(LayoutInflater layoutInflater, ViewGroup container) {
        kotlin.jvm.internal.j.g(container, "container");
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_loading_fullscreen, container, false);
        kotlin.jvm.internal.j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
