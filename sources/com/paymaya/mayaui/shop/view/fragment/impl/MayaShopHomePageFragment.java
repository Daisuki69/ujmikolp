package com.paymaya.mayaui.shop.view.fragment.impl;

import D.C0187u;
import J7.e;
import N5.C0447e;
import S5.c;
import Uh.d;
import Wb.a;
import We.s;
import Xb.f;
import ac.m;
import ac.n;
import ac.o;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bc.b;
import bg.AbstractC0983W;
import cc.InterfaceC1094g;
import cj.C1110A;
import cj.L;
import cj.r;
import cj.x;
import com.airbnb.lottie.LottieAnimationView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ShopHomeSectionItem;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import dc.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaShopHomePageFragment extends MayaBaseLoadingFragment implements b, n {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public f f14004o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public C0187u f14005p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public C0447e f14006q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public RecyclerView f14007r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public LottieAnimationView f14008s0;
    public boolean t0;
    public final LinkedHashSet u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public o f14009v0;
    public InterfaceC1094g w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f14010x0;

    public MayaShopHomePageFragment() {
        L.c(new Pair("Favorites", Integer.valueOf(R.string.maya_shop_label_refresh_card_favorites)));
        this.u0 = new LinkedHashSet();
    }

    @Override // ad.InterfaceC0684a
    public final void B0(HashMap map) {
        AbstractC0983W.u(this, map);
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C0447e c0447eB = C0447e.b(layoutInflater, viewGroup);
        this.f14006q0 = c0447eB;
        SpringView springView = (SpringView) c0447eB.f4079b;
        j.f(springView, "getRoot(...)");
        return springView;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_error_dashboard, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final void P1(ShopHomeSectionItem shopHomeSectionItem) {
        o oVar = this.f14009v0;
        if (oVar != null) {
            ArrayList arrayList = oVar.i;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((ShopHomeSectionItem) it.next()).getViewType() == shopHomeSectionItem.getViewType()) {
                        return;
                    }
                }
            }
            ArrayList arrayListW = C1110A.W(arrayList);
            arrayListW.add(shopHomeSectionItem);
            oVar.f(arrayListW);
        }
    }

    public final void Q1(ShopHomeSectionItem homeSection) {
        j.g(homeSection, "homeSection");
        o oVar = this.f14009v0;
        if (oVar != null) {
            oVar.e(r.c(homeSection));
        }
    }

    public final a R1() {
        f fVar = this.f14004o0;
        if (fVar != null) {
            return fVar;
        }
        j.n("mShopHomePageFragmentPresenter");
        throw null;
    }

    public final SpringView S1() {
        C0447e c0447e = this.f14006q0;
        j.d(c0447e);
        SpringView containerLayoutShopSwipeRefresh = (SpringView) c0447e.c;
        j.f(containerLayoutShopSwipeRefresh, "containerLayoutShopSwipeRefresh");
        return containerLayoutShopSwipeRefresh;
    }

    public final void T1(String str) {
        o oVar = this.f14009v0;
        if (oVar != null) {
            ArrayList arrayList = oVar.i;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (j.b(((ShopHomeSectionItem) it.next()).getName(), str)) {
                        ArrayList arrayListW = C1110A.W(arrayList);
                        x.s(arrayListW, new m(str, 0));
                        oVar.f(arrayListW);
                        return;
                    }
                }
            }
        }
    }

    public final void U1(ShopHomeSectionItem.VIEW_TYPE viewType) {
        j.g(viewType, "viewType");
        o oVar = this.f14009v0;
        if (oVar != null) {
            ArrayList arrayList = oVar.i;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((ShopHomeSectionItem) it.next()).getViewType() == viewType) {
                        ArrayList arrayListW = C1110A.W(arrayList);
                        x.s(arrayListW, new N9.f(viewType, 22));
                        oVar.f(arrayListW);
                        return;
                    }
                }
            }
        }
    }

    public final void V1() {
        if (this.t0 || !this.u0.isEmpty()) {
            return;
        }
        S1().i();
    }

    @Override // ad.InterfaceC0684a
    public final void c(int i, String str, String str2) {
        if (t1().e().isShopEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.q(1));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("page", "Home");
            A1(c1219hE);
        } else {
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.BANNER);
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH.j.put(SessionDescription.ATTR_TYPE, s.f(i, "CT"));
            A1(c1219hH);
        }
        C0187u c0187u = this.f14005p0;
        if (c0187u == null) {
            j.n("mCleverTapAPI");
            throw null;
        }
        c0187u.m(str2);
        f fVar = (f) R1();
        if (str == null || C2576A.H(str)) {
            return;
        }
        if (C.Y(str)) {
            MayaShopHomePageFragment mayaShopHomePageFragment = (MayaShopHomePageFragment) ((b) fVar.c.get());
            mayaShopHomePageFragment.getClass();
            InterfaceC1094g interfaceC1094g = mayaShopHomePageFragment.w0;
            if (interfaceC1094g != null) {
                ((MayaShopV2Activity) interfaceC1094g).Q0(str);
                return;
            }
            return;
        }
        MayaShopHomePageFragment mayaShopHomePageFragment2 = (MayaShopHomePageFragment) ((b) fVar.c.get());
        mayaShopHomePageFragment2.getClass();
        InterfaceC1094g interfaceC1094g2 = mayaShopHomePageFragment2.w0;
        if (interfaceC1094g2 != null) {
            MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) interfaceC1094g2;
            mayaShopV2Activity.n1().k0(mayaShopV2Activity, str);
        }
    }

    @Override // a7.InterfaceC0641b
    public final void o0() {
        T1("Deals & Promos");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().r(EnumC1216e.HOME);
        this.w0 = (InterfaceC1094g) getActivity();
        O5.a aVar = W4.a.e().z().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f14004o0 = new f(aVar.Q(), aVar.P(), aVar.I(), aVar.R(), (com.paymaya.data.preference.a) aVar.e.get(), (c) aVar.f4724k.get(), (d) aVar.f4748y.get());
        this.f14005p0 = (C0187u) aVar.f.get();
        ((AbstractC2509a) R1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) R1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RecyclerView recyclerView = this.f14007r0;
        if (recyclerView == null) {
            j.n("mRecyclerViewItems");
            throw null;
        }
        recyclerView.setAdapter(null);
        this.f14006q0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (t1().e().isShopEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.w(10));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            FragmentActivity activity = getActivity();
            j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity");
            MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) activity;
            String stringExtra = mayaShopV2Activity.f13997y;
            if (stringExtra == null) {
                stringExtra = mayaShopV2Activity.getIntent().getStringExtra("source_page");
            }
            c1219hE.j.put("source_page", stringExtra);
            o1().b(c1219hE);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        i iVar;
        MayaShopHomePageFragment mayaShopHomePageFragment;
        super.onResume();
        o oVar = this.f14009v0;
        if (oVar != null && (iVar = oVar.f7110k) != null && (mayaShopHomePageFragment = iVar.f16323a) != null && mayaShopHomePageFragment.isResumed()) {
            MayaCarousel mayaCarousel = iVar.e;
            C0187u c0187u = mayaCarousel.f12035w;
            if (c0187u != null) {
                c0187u.q(mayaCarousel);
            }
            mayaCarousel.k();
        }
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(EnumC1216e.HOME);
        c1219hD.n(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put("attribution", n1().f10371a);
        c1220iO1.c(activity, c1219hD);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0447e c0447e = this.f14006q0;
        j.d(c0447e);
        this.f14007r0 = (RecyclerView) c0447e.f;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity(), 1, false);
        com.paymaya.data.preference.a aVarT1 = t1();
        C1220i c1220iO1 = o1();
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        j.f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        o oVar = new o(aVarT1, c1220iO1, contextRequireContext, this, viewLifecycleOwner, fragmentActivityRequireActivity, this);
        oVar.f7111l = c.b(q1(), A5.b.f125o1);
        this.f14009v0 = oVar;
        RecyclerView recyclerView = this.f14007r0;
        if (recyclerView == null) {
            j.n("mRecyclerViewItems");
            throw null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.f14007r0;
        if (recyclerView2 == null) {
            j.n("mRecyclerViewItems");
            throw null;
        }
        recyclerView2.setAdapter(this.f14009v0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("category_id");
            this.f14010x0 = arguments.getString("category_name");
            ((f) R1()).j();
        }
        S1().setHeader(new e());
        View viewFindViewById = S1().getHeaderView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.f14008s0 = (LottieAnimationView) viewFindViewById;
        S1().setListener(new Qd.a(this, 26));
    }
}
