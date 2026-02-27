package com.paymaya.ui.shopv3.view.fragment.impl;

import G5.o;
import N5.k1;
import O5.a;
import Xb.h;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.paymaya.R;
import com.paymaya.common.base.BaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderListItem;
import ha.u;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.j;
import ve.d;
import we.InterfaceC2424m;

/* JADX INFO: loaded from: classes4.dex */
public class ShopV3PageFragment extends BaseLoadingFragment implements d {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public k1 f14802a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public RecyclerView f14803b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public h f14804c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ue.d f14805d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public InterfaceC2424m f14806e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f14807f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public String f14808g0 = "";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f14809h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Bundle f14810i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f14811j0;

    public final h A1() {
        h hVar = this.f14804c0;
        if (hVar != null) {
            return hVar;
        }
        j.n("mShopPageFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1215d m1() {
        return EnumC1215d.SHOP;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14806e0 = (InterfaceC2424m) getActivity();
        a aVar = W4.a.e().H().f4756a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14804c0 = new h(aVar.Q(), (Uh.d) aVar.f4748y.get(), 1);
        A1().h(this);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        A1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14802a0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        Bundle bundle = this.f14810i0;
        if (bundle != null) {
            bundle.putBoolean("is_initially_loaded", this.f14807f0);
        }
        Bundle bundle2 = this.f14810i0;
        ArrayList arrayList = null;
        if (bundle2 != null) {
            RecyclerView recyclerView = this.f14803b0;
            if (recyclerView == null) {
                j.n("mRecyclerViewItems");
                throw null;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            bundle2.putParcelable("layout_manager", layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
        Bundle bundle3 = this.f14810i0;
        if (bundle3 != null) {
            ue.d dVar = this.f14805d0;
            if (dVar != null) {
                arrayList = new ArrayList();
                for (ShopProviderListItem shopProviderListItem : dVar.c) {
                    if (shopProviderListItem instanceof ShopProvider) {
                        arrayList.add(shopProviderListItem);
                    }
                }
            }
            bundle3.putParcelableArrayList("provider_list_items", new ArrayList<>(arrayList));
        }
        requireArguments().getString("category_name");
        super.onPause();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        String upperCase;
        super.onResume();
        C1220i c1220i = this.f10245B;
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.SHOP);
        String str = this.f14809h0;
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
            j.f(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        c1219hD.s(upperCase);
        c1219hD.n(2);
        c1220i.c(activity, c1219hD);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        k1 k1Var = this.f14802a0;
        j.d(k1Var);
        this.f14803b0 = (RecyclerView) k1Var.f;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        this.f14805d0 = new ue.d(fragmentActivityRequireActivity, this);
        RecyclerView recyclerView = this.f14803b0;
        if (recyclerView == null) {
            j.n("mRecyclerViewItems");
            throw null;
        }
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        recyclerView.addItemDecoration(new o(contextRequireContext));
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(this.f14805d0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("category_code");
            if (string == null) {
                string = "";
            }
            this.f14808g0 = string;
            this.f14809h0 = arguments.getString("category_name");
            Bundle bundle2 = new Bundle();
            this.f14810i0 = bundle2;
            this.f14807f0 = bundle2.getBoolean("is_initially_loaded", false);
            A1().j();
        }
        k1 k1Var2 = this.f14802a0;
        j.d(k1Var2);
        SwipeRefreshLayout containerSwipeRefreshLayoutPmaFragmentShopV3Page = (SwipeRefreshLayout) k1Var2.f4138b;
        j.f(containerSwipeRefreshLayoutPmaFragmentShopV3Page, "containerSwipeRefreshLayoutPmaFragmentShopV3Page");
        containerSwipeRefreshLayoutPmaFragmentShopV3Page.setColorSchemeResources(R.color.pma_color_swipe_blue, R.color.pma_color_swipe_green);
        containerSwipeRefreshLayoutPmaFragmentShopV3Page.setOnRefreshListener(new u(11, this, containerSwipeRefreshLayoutPmaFragmentShopV3Page));
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View s1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        k1 k1VarC = k1.c(layoutInflater, container);
        this.f14802a0 = k1VarC;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) k1VarC.e;
        j.f(swipeRefreshLayout, "getRoot(...)");
        return swipeRefreshLayout;
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View t1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_error3, container, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View u1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_shop_v3_category_page_loading, container, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
