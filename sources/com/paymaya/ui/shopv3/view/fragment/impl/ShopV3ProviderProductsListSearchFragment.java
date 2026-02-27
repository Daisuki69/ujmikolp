package com.paymaya.ui.shopv3.view.fragment.impl;

import E1.c;
import Kh.C0301f;
import Kh.C0307l;
import Kh.C0310o;
import N5.r1;
import O5.a;
import Uh.d;
import Xb.w;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.base.BaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import g4.C1499a;
import h4.C1538b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.j;
import oi.C1983a;
import ue.C2309A;
import ue.y;
import v.AbstractC2329d;
import ve.g;
import we.C2396A;
import we.C2397B;
import we.InterfaceC2436y;
import we.MenuItemOnActionExpandListenerC2437z;
import we.MenuItemOnMenuItemClickListenerC2435x;
import zh.b;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class ShopV3ProviderProductsListSearchFragment extends BaseLoadingFragment implements g, y {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public w f14845a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public r1 f14846b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public SearchView f14847c0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f14849e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public C2309A f14850f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public InterfaceC2436y f14851g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f14852h0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ShopProvider f14854j0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f14848d0 = 1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f14853i0 = "";

    public final RecyclerView A1() {
        r1 r1Var = this.f14846b0;
        j.d(r1Var);
        RecyclerView recyclerViewPmaFragmentShopSearch = (RecyclerView) r1Var.e;
        j.f(recyclerViewPmaFragmentShopSearch, "recyclerViewPmaFragmentShopSearch");
        return recyclerViewPmaFragmentShopSearch;
    }

    public final w B1() {
        w wVar = this.f14845a0;
        if (wVar != null) {
            return wVar;
        }
        j.n("mShopProviderProductsListSearchFragmentPresenter");
        throw null;
    }

    public final String C1() {
        ShopProvider shopProvider = this.f14854j0;
        if (shopProvider != null) {
            return shopProvider.getName();
        }
        j.n("mShopProvider");
        throw null;
    }

    public final void D1() {
        w1();
        A1().setVisibility(0);
        r1 r1Var = this.f14846b0;
        j.d(r1Var);
        ((Group) r1Var.f4198b).setVisibility(8);
    }

    @Override // ue.y
    public final void Y0(ProductV3 productV3) {
        w wVarB1 = B1();
        EnumC1215d enumC1215d = EnumC1215d.SHOP;
        if (productV3 != null && productV3.isDisabled()) {
            ShopV3ProviderProductsListSearchFragment shopV3ProviderProductsListSearchFragment = (ShopV3ProviderProductsListSearchFragment) ((g) wVarB1.c.get());
            C1220i c1220i = shopV3ProviderProductsListSearchFragment.f10245B;
            FragmentActivity activity = shopV3ProviderProductsListSearchFragment.getActivity();
            C1219h c1219hD = C1219h.d(enumC1215d);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.PRODUCT_DISABLED);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String productCode = productV3.getProductCode();
            HashMap map = c1219hD.j;
            map.put("product", productCode);
            map.put("location", "search");
            c1220i.c(activity, c1219hD);
            return;
        }
        ShopV3ProviderProductsListSearchFragment shopV3ProviderProductsListSearchFragment2 = (ShopV3ProviderProductsListSearchFragment) ((g) wVarB1.c.get());
        C1220i c1220i2 = shopV3ProviderProductsListSearchFragment2.f10245B;
        FragmentActivity activity2 = shopV3ProviderProductsListSearchFragment2.getActivity();
        C1219h c1219hD2 = C1219h.d(enumC1215d);
        c1219hD2.n(17);
        c1219hD2.t(EnumC1217f.PRODUCT);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        String productCode2 = productV3 != null ? productV3.getProductCode() : null;
        HashMap map2 = c1219hD2.j;
        map2.put("product", productCode2);
        map2.put("location", "search");
        c1220i2.c(activity2, c1219hD2);
        InterfaceC2436y interfaceC2436y = shopV3ProviderProductsListSearchFragment2.f14851g0;
        if (interfaceC2436y != null) {
            ((ShopV3Activity) interfaceC2436y).u1(productV3);
        } else {
            j.n("mShopProviderProductsListSearchFragmentListener");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1215d m1() {
        return EnumC1215d.SHOP_SEARCH;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Parcelable parcelable = arguments.getParcelable("search_provider");
            j.d(parcelable);
            this.f14854j0 = (ShopProvider) parcelable;
        }
        this.f10249R = true;
        setHasOptionsMenu(true);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListSearchFragment.ShopV3ProviderProductsListSearchFragmentListener");
        this.f14851g0 = (InterfaceC2436y) activity;
        a aVar = W4.a.e().H().f4756a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14845a0 = new w(aVar.I(), (com.paymaya.data.preference.a) aVar.e.get(), (d) aVar.f4748y.get(), 2);
        B1().h(this);
        InterfaceC2436y interfaceC2436y = this.f14851g0;
        if (interfaceC2436y == null) {
            j.n("mShopProviderProductsListSearchFragmentListener");
            throw null;
        }
        Bundle bundleT1 = ((ShopV3Activity) interfaceC2436y).t1();
        bundleT1.remove("ShopV3ProviderProductsListSearchFragment");
        InterfaceC2436y interfaceC2436y2 = this.f14851g0;
        if (interfaceC2436y2 != null) {
            ((ShopV3Activity) interfaceC2436y2).j = bundleT1;
        } else {
            j.n("mShopProviderProductsListSearchFragmentListener");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        j.g(menu, "menu");
        j.g(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.pma_menu_shop_search, menu);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        B1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14846b0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        ArrayList arrayList;
        InterfaceC2436y interfaceC2436y = this.f14851g0;
        if (interfaceC2436y == null) {
            j.n("mShopProviderProductsListSearchFragmentListener");
            throw null;
        }
        Bundle bundleT1 = ((ShopV3Activity) interfaceC2436y).t1();
        bundleT1.putInt("last_page_number", this.f14848d0);
        SearchView searchView = this.f14847c0;
        if (searchView == null) {
            j.n("mSearchView");
            throw null;
        }
        CharSequence query = searchView.getQuery();
        bundleT1.putString("last_search_query", (query == null || C2576A.H(query)) ? "" : query.toString());
        ShopProvider shopProvider = this.f14854j0;
        if (shopProvider == null) {
            j.n("mShopProvider");
            throw null;
        }
        bundleT1.putParcelable("search_provider", shopProvider);
        RecyclerView.LayoutManager layoutManager = A1().getLayoutManager();
        bundleT1.putParcelable("layout_manager", layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        C2309A c2309a = this.f14850f0;
        if (c2309a != null) {
            ArrayList arrayList2 = c2309a.f20283b;
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof ProductV3) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        bundleT1.putParcelableArrayList("searched_product_list_items", new ArrayList<>(arrayList));
        InterfaceC2436y interfaceC2436y2 = this.f14851g0;
        if (interfaceC2436y2 == null) {
            j.n("mShopProviderProductsListSearchFragmentListener");
            throw null;
        }
        Bundle bundleT12 = ((ShopV3Activity) interfaceC2436y2).t1();
        bundleT12.putBundle("ShopV3ProviderProductsListSearchFragment", bundleT1);
        InterfaceC2436y interfaceC2436y3 = this.f14851g0;
        if (interfaceC2436y3 == null) {
            j.n("mShopProviderProductsListSearchFragmentListener");
            throw null;
        }
        ((ShopV3Activity) interfaceC2436y3).j = bundleT12;
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        RecyclerView.LayoutManager layoutManager;
        j.g(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.pma_menu_shop_search_field);
        menuItemFindItem.expandActionView();
        View actionView = menuItemFindItem.getActionView();
        j.e(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        this.f14847c0 = (SearchView) actionView;
        C1219h c1219hH = AbstractC2329d.h(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("provider", C1());
        o1(c1219hH);
        menuItemFindItem.setOnActionExpandListener(new MenuItemOnActionExpandListenerC2437z(menuItemFindItem, this, 0));
        InterfaceC2436y interfaceC2436y = this.f14851g0;
        if (interfaceC2436y == null) {
            j.n("mShopProviderProductsListSearchFragmentListener");
            throw null;
        }
        Bundle bundle = ((ShopV3Activity) interfaceC2436y).t1().getBundle("ShopV3ProviderProductsListSearchFragment");
        if (bundle != null) {
            this.f14848d0 = bundle.getInt("last_page_number", 1);
            String string = bundle.getString("last_search_query", "");
            j.d(string);
            this.f14853i0 = string;
            ShopProvider shopProvider = (ShopProvider) bundle.getParcelable("search_provider");
            if (shopProvider == null && (shopProvider = this.f14854j0) == null) {
                j.n("mShopProvider");
                throw null;
            }
            this.f14854j0 = shopProvider;
            SearchView searchView = this.f14847c0;
            if (searchView == null) {
                j.n("mSearchView");
                throw null;
            }
            searchView.setQuery(string, false);
            if (bundle.containsKey("searched_product_list_items")) {
                List parcelableArrayList = bundle.getParcelableArrayList("searched_product_list_items");
                if (parcelableArrayList == null) {
                    parcelableArrayList = C1112C.f9377a;
                }
                B1().m(parcelableArrayList);
            }
            if (bundle.containsKey("layout_manager") && (layoutManager = A1().getLayoutManager()) != null) {
                layoutManager.onRestoreInstanceState(bundle.getParcelable("layout_manager"));
            }
        }
        SearchView searchView2 = this.f14847c0;
        if (searchView2 == null) {
            j.n("mSearchView");
            throw null;
        }
        C0301f c0301fR = c.r(new C1499a(new C1538b(searchView2), 0));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        new C0310o(new C0307l(c0301fR.b(1500L), 0).c(C2396A.f20729b).e(b.a()), new C1983a(this, 23), Eh.d.c, Eh.d.f1365b).f();
        menuItemFindItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC2435x(0));
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2436y interfaceC2436y = this.f14851g0;
        if (interfaceC2436y != null) {
            ((ShopV3Activity) interfaceC2436y).Q(this);
        } else {
            j.n("mShopProviderProductsListSearchFragmentListener");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), 1, false);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        this.f14850f0 = new C2309A(fragmentActivityRequireActivity, this);
        RecyclerView recyclerViewA1 = A1();
        recyclerViewA1.setLayoutManager(linearLayoutManager);
        recyclerViewA1.setAdapter(this.f14850f0);
        recyclerViewA1.addOnScrollListener(new C2397B(this, linearLayoutManager));
        this.f14849e0 = false;
        B1().j();
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View s1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        r1 r1VarB = r1.b(layoutInflater, container);
        this.f14846b0 = r1VarB;
        ConstraintLayout constraintLayout = (ConstraintLayout) r1VarB.c;
        j.f(constraintLayout, "getRoot(...)");
        return constraintLayout;
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
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_loading_fullscreen_please_wait, container, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
