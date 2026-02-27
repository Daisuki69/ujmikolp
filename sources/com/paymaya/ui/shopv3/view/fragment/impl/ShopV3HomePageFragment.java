package com.paymaya.ui.shopv3.view.fragment.impl;

import B5.i;
import D.C0187u;
import N5.k1;
import O5.a;
import Uh.d;
import We.s;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import bg.AbstractC0983W;
import cj.C1110A;
import cj.M;
import cj.r;
import cj.x;
import com.paymaya.R;
import com.paymaya.common.base.BaseLoadingFragment;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ShopHomeSectionItem;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopActivity;
import ha.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import re.InterfaceC2201a;
import se.e;
import ue.m;
import ue.n;
import v.AbstractC2329d;
import ve.c;
import we.InterfaceC2422k;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class ShopV3HomePageFragment extends BaseLoadingFragment implements c, m {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public e f14792a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public C0187u f14793b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public k1 f14794c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public RecyclerView f14795d0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f14797f0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public n f14799h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public InterfaceC2422k f14800i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f14801j0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f14796e0 = M.h(new Pair("Favorites", Integer.valueOf(R.string.pma_label_shop_v3_error_refresh_card_favorites)), new Pair("Buy Again", Integer.valueOf(R.string.pma_label_shop_v3_error_refresh_card_buy_again)));

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet f14798g0 = new LinkedHashSet();

    public final void A1(ShopHomeSectionItem homeSection) {
        j.g(homeSection, "homeSection");
        n nVar = this.f14799h0;
        if (nVar != null) {
            nVar.e(r.c(homeSection));
        }
    }

    @Override // ad.InterfaceC0684a
    public final void B0(HashMap map) {
        AbstractC0983W.u(this, map);
    }

    public final InterfaceC2201a B1() {
        e eVar = this.f14792a0;
        if (eVar != null) {
            return eVar;
        }
        j.n("mShopHomePageFragmentPresenter");
        throw null;
    }

    public final void C1(String str) {
        n nVar = this.f14799h0;
        if (nVar != null) {
            ArrayList arrayList = nVar.f20301d;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (j.b(((ShopHomeSectionItem) it.next()).getName(), str)) {
                        ArrayList arrayListW = C1110A.W(arrayList);
                        x.s(arrayListW, new ac.m(str, 4));
                        nVar.f(arrayListW);
                        return;
                    }
                }
            }
        }
    }

    public final void D1() {
        k1 k1Var = this.f14794c0;
        j.d(k1Var);
        SwipeRefreshLayout containerSwipeRefreshLayoutPmaFragmentShopV3Page = (SwipeRefreshLayout) k1Var.f4138b;
        j.f(containerSwipeRefreshLayoutPmaFragmentShopV3Page, "containerSwipeRefreshLayoutPmaFragmentShopV3Page");
        containerSwipeRefreshLayoutPmaFragmentShopV3Page.setEnabled(!this.f14797f0 && this.f14798g0.isEmpty());
    }

    @Override // ad.InterfaceC0684a
    public final void c(int i, String str, String str2) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.BANNER);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put(SessionDescription.ATTR_TYPE, s.f(i, "CT"));
        o1(c1219hH);
        C0187u c0187u = this.f14793b0;
        if (c0187u == null) {
            j.n("mCleverTapAPI");
            throw null;
        }
        c0187u.m(str2);
        e eVar = (e) B1();
        if (str == null || C2576A.H(str)) {
            return;
        }
        if (!C.Y(str)) {
            ShopV3HomePageFragment shopV3HomePageFragment = (ShopV3HomePageFragment) ((c) eVar.c.get());
            shopV3HomePageFragment.getClass();
            InterfaceC2422k interfaceC2422k = shopV3HomePageFragment.f14800i0;
            if (interfaceC2422k != null) {
                MayaShopActivity mayaShopActivity = (MayaShopActivity) interfaceC2422k;
                mayaShopActivity.e.k0(mayaShopActivity, str);
                return;
            }
            return;
        }
        ShopV3HomePageFragment shopV3HomePageFragment2 = (ShopV3HomePageFragment) ((c) eVar.c.get());
        shopV3HomePageFragment2.getClass();
        InterfaceC2422k interfaceC2422k2 = shopV3HomePageFragment2.f14800i0;
        if (interfaceC2422k2 != null) {
            MayaShopActivity mayaShopActivity2 = (MayaShopActivity) interfaceC2422k2;
            i iVar = mayaShopActivity2.e;
            AttributionSource attributionSource = AttributionSource.f10368d;
            iVar.getClass();
            i.l(mayaShopActivity2, str, attributionSource);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1215d m1() {
        return EnumC1215d.SHOP;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        this.f10248Q.r(EnumC1216e.HOME);
        this.f14800i0 = (InterfaceC2422k) getActivity();
        a aVar = W4.a.e().H().f4756a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14792a0 = new e(aVar.Q(), aVar.P(), aVar.I(), aVar.R(), (com.paymaya.data.preference.a) aVar.e.get(), (d) aVar.f4748y.get());
        this.f14793b0 = (C0187u) aVar.f.get();
        ((AbstractC2509a) B1()).h(this);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) B1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RecyclerView recyclerView = this.f14795d0;
        if (recyclerView == null) {
            j.n("mRecyclerViewItems");
            throw null;
        }
        recyclerView.setAdapter(null);
        this.f14794c0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1220i c1220i = this.f10245B;
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.SHOP);
        c1219hD.r(EnumC1216e.HOME);
        c1219hD.n(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put("attribution", l1().f10371a);
        c1220i.c(activity, c1219hD);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        k1 k1Var = this.f14794c0;
        j.d(k1Var);
        this.f14795d0 = (RecyclerView) k1Var.f;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity(), 1, false);
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        this.f14799h0 = new n(contextRequireContext, this);
        RecyclerView recyclerView = this.f14795d0;
        if (recyclerView == null) {
            j.n("mRecyclerViewItems");
            throw null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.f14795d0;
        if (recyclerView2 == null) {
            j.n("mRecyclerViewItems");
            throw null;
        }
        recyclerView2.setAdapter(this.f14799h0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("category_id");
            this.f14801j0 = arguments.getString("category_name");
            ((e) B1()).j();
        }
        k1 k1Var2 = this.f14794c0;
        j.d(k1Var2);
        SwipeRefreshLayout containerSwipeRefreshLayoutPmaFragmentShopV3Page = (SwipeRefreshLayout) k1Var2.f4138b;
        j.f(containerSwipeRefreshLayoutPmaFragmentShopV3Page, "containerSwipeRefreshLayoutPmaFragmentShopV3Page");
        containerSwipeRefreshLayoutPmaFragmentShopV3Page.setColorSchemeResources(R.color.pma_color_swipe_blue, R.color.pma_color_swipe_green);
        containerSwipeRefreshLayoutPmaFragmentShopV3Page.setOnRefreshListener(new u(10, containerSwipeRefreshLayoutPmaFragmentShopV3Page, this));
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View s1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        k1 k1VarC = k1.c(layoutInflater, container);
        this.f14794c0 = k1VarC;
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
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_loading_fullscreen, container, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
