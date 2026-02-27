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
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
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
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import g4.C1499a;
import h4.C1538b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.j;
import o6.f;
import ue.C2309A;
import ue.y;
import ve.m;
import we.C2396A;
import we.C2411P;
import we.InterfaceC2410O;
import we.MenuItemOnActionExpandListenerC2437z;
import we.MenuItemOnMenuItemClickListenerC2435x;
import zh.b;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class ShopV3SearchFragment extends BaseLoadingFragment implements m, y {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public w f14885a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public r1 f14886b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public RecyclerView f14887c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public SearchView f14888d0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f14890f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public C2309A f14891g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public InterfaceC2410O f14892h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f14893i0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f14895k0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f14889e0 = 1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f14894j0 = "";

    public final w A1() {
        w wVar = this.f14885a0;
        if (wVar != null) {
            return wVar;
        }
        j.n("mShopSearchFragmentPresenter");
        throw null;
    }

    public final void B1() {
        C2309A c2309a;
        C2309A c2309a2 = this.f14891g0;
        Boolean boolValueOf = c2309a2 != null ? Boolean.valueOf(c2309a2.f20284d) : null;
        j.d(boolValueOf);
        if (boolValueOf.booleanValue() && (c2309a = this.f14891g0) != null) {
            c2309a.f(false);
        }
    }

    public final void C1() {
        w1();
        RecyclerView recyclerView = this.f14887c0;
        if (recyclerView == null) {
            j.n("mRecyclerViewItems");
            throw null;
        }
        recyclerView.setVisibility(0);
        r1 r1Var = this.f14886b0;
        j.d(r1Var);
        ((Group) r1Var.f4198b).setVisibility(8);
    }

    @Override // ue.y
    public final void Y0(ProductV3 productV3) {
        String productCode;
        w wVarA1 = A1();
        Boolean boolValueOf = productV3 != null ? Boolean.valueOf(productV3.isDisabled()) : null;
        j.d(boolValueOf);
        boolean zBooleanValue = boolValueOf.booleanValue();
        EnumC1215d enumC1215d = EnumC1215d.SHOP;
        if (zBooleanValue) {
            ShopV3SearchFragment shopV3SearchFragment = (ShopV3SearchFragment) ((m) wVarA1.c.get());
            C1220i c1220i = shopV3SearchFragment.f10245B;
            FragmentActivity activity = shopV3SearchFragment.getActivity();
            C1219h c1219hD = C1219h.d(enumC1215d);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.PRODUCT_DISABLED);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            productCode = productV3 != null ? productV3.getProductCode() : null;
            HashMap map = c1219hD.j;
            map.put("product", productCode);
            map.put("location", "search");
            c1220i.c(activity, c1219hD);
            return;
        }
        ShopV3SearchFragment shopV3SearchFragment2 = (ShopV3SearchFragment) ((m) wVarA1.c.get());
        C1220i c1220i2 = shopV3SearchFragment2.f10245B;
        FragmentActivity activity2 = shopV3SearchFragment2.getActivity();
        C1219h c1219hD2 = C1219h.d(enumC1215d);
        c1219hD2.n(17);
        c1219hD2.t(EnumC1217f.PRODUCT);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        productCode = productV3 != null ? productV3.getProductCode() : null;
        HashMap map2 = c1219hD2.j;
        map2.put("product", productCode);
        map2.put("location", "search");
        c1220i2.c(activity2, c1219hD2);
        InterfaceC2410O interfaceC2410O = shopV3SearchFragment2.f14892h0;
        if (interfaceC2410O != null) {
            ((ShopV3Activity) interfaceC2410O).u1(productV3);
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
            this.f14895k0 = arguments.getString("search_query");
            arguments.remove("search_query");
            setArguments(arguments);
        }
        this.f10249R = true;
        setHasOptionsMenu(true);
        this.f14892h0 = (InterfaceC2410O) getActivity();
        a aVar = W4.a.e().H().f4756a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14885a0 = new w(aVar.I(), (com.paymaya.data.preference.a) aVar.e.get(), (d) aVar.f4748y.get(), 3);
        A1().h(this);
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
        A1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14886b0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC2410O interfaceC2410O = this.f14892h0;
        ArrayList arrayList = null;
        Bundle bundleT1 = interfaceC2410O != null ? ((ShopV3Activity) interfaceC2410O).t1() : null;
        if (bundleT1 != null) {
            bundleT1.putInt("last_page_number", this.f14889e0);
        }
        SearchView searchView = this.f14888d0;
        CharSequence query = searchView != null ? searchView.getQuery() : null;
        if (bundleT1 != null) {
            bundleT1.putString("last_search_query", (query == null || C2576A.H(query)) ? "" : query.toString());
        }
        if (bundleT1 != null) {
            RecyclerView recyclerView = this.f14887c0;
            if (recyclerView == null) {
                j.n("mRecyclerViewItems");
                throw null;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            bundleT1.putParcelable("layout_manager", layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
        if (bundleT1 != null) {
            C2309A c2309a = this.f14891g0;
            if (c2309a != null) {
                ArrayList arrayList2 = c2309a.f20283b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (obj instanceof ProductV3) {
                        arrayList3.add(obj);
                    }
                }
                arrayList = arrayList3;
            }
            bundleT1.putParcelableArrayList("searched_product_list_items", new ArrayList<>(arrayList));
        }
        InterfaceC2410O interfaceC2410O2 = this.f14892h0;
        if (interfaceC2410O2 != null) {
            ((ShopV3Activity) interfaceC2410O2).j = bundleT1;
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        j.g(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.pma_menu_shop_search_field);
        menuItemFindItem.expandActionView();
        View actionView = menuItemFindItem.getActionView();
        j.e(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        this.f14888d0 = (SearchView) actionView;
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        o1(c1219h);
        menuItemFindItem.setOnActionExpandListener(new MenuItemOnActionExpandListenerC2437z(menuItemFindItem, this, 1));
        InterfaceC2410O interfaceC2410O = this.f14892h0;
        Bundle bundleT1 = interfaceC2410O != null ? ((ShopV3Activity) interfaceC2410O).t1() : null;
        if (bundleT1 != null) {
            this.f14889e0 = bundleT1.getInt("last_page_number", 1);
            String str = this.f14895k0;
            if (str == null) {
                str = "";
            }
            String string = bundleT1.getString("last_search_query", str);
            j.d(string);
            this.f14894j0 = string;
            SearchView searchView = this.f14888d0;
            if (searchView != null) {
                searchView.setQuery(string, false);
            }
            if (bundleT1.containsKey("searched_product_list_items")) {
                List parcelableArrayList = bundleT1.getParcelableArrayList("searched_product_list_items");
                if (parcelableArrayList == null) {
                    parcelableArrayList = C1112C.f9377a;
                }
                A1().m(parcelableArrayList);
            }
            if (bundleT1.containsKey("layout_manager")) {
                RecyclerView recyclerView = this.f14887c0;
                if (recyclerView == null) {
                    j.n("mRecyclerViewItems");
                    throw null;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.onRestoreInstanceState(bundleT1.getParcelable("layout_manager"));
                }
            }
        }
        SearchView searchView2 = this.f14888d0;
        C0301f c0301fR = c.r(searchView2 != null ? new C1499a(new C1538b(searchView2), 0) : null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        new C0310o(new C0307l(c0301fR.b(1500L), 0).c(C2396A.c).e(b.a()), new f(this, 20), Eh.d.c, Eh.d.f1365b).f();
        menuItemFindItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC2435x(1));
        String str2 = this.f14895k0;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        SearchView searchView3 = this.f14888d0;
        if (searchView3 != null) {
            searchView3.setQuery(this.f14895k0, false);
        }
        String str3 = this.f14895k0;
        this.f14894j0 = str3 != null ? str3 : "";
        this.f14895k0 = null;
        A1().l();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2410O interfaceC2410O = this.f14892h0;
        if (interfaceC2410O != null) {
            ((ShopV3Activity) interfaceC2410O).Q(this);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        r1 r1Var = this.f14886b0;
        j.d(r1Var);
        this.f14887c0 = (RecyclerView) r1Var.e;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), 1, false);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        this.f14891g0 = new C2309A(fragmentActivityRequireActivity, this);
        RecyclerView recyclerView = this.f14887c0;
        if (recyclerView == null) {
            j.n("mRecyclerViewItems");
            throw null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f14891g0);
        recyclerView.addOnScrollListener(new C2411P(this, linearLayoutManager));
        this.f14890f0 = false;
        A1().j();
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View s1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        r1 r1VarB = r1.b(layoutInflater, container);
        this.f14886b0 = r1VarB;
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
