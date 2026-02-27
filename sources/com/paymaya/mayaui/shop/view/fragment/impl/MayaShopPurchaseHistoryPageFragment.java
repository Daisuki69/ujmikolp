package com.paymaya.mayaui.shop.view.fragment.impl;

import J7.e;
import N5.C0447e;
import O5.a;
import S5.c;
import Xb.A;
import ac.C0674C;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import bc.l;
import cc.B;
import cc.InterfaceC1087A;
import cc.z;
import com.airbnb.lottie.LottieAnimationView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import hd.C1562b;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class MayaShopPurchaseHistoryPageFragment extends MayaBaseLoadingFragment implements l {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public A f14110o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f14111p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f14112q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f14113r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public C0674C f14114s0;
    public InterfaceC1087A t0;
    public C0447e u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public RecyclerView f14115v0;
    public LinearLayoutManager w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public LottieAnimationView f14116x0;
    public final EnumC1216e y0 = EnumC1216e.PURCHASE_HISTORY;

    public static final void S1(MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment) {
        if (mayaShopPurchaseHistoryPageFragment.t1().e().isShopEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.q(8));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("button", mayaShopPurchaseHistoryPageFragment.getString(R.string.maya_shop_history_empty_button));
            mayaShopPurchaseHistoryPageFragment.o1().b(c1219hE);
        }
        InterfaceC1087A interfaceC1087A = mayaShopPurchaseHistoryPageFragment.t0;
        if (interfaceC1087A != null) {
            ((MayaShopV2Activity) interfaceC1087A).onBackPressed();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_shop_purchase_history_page, viewGroup, false);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
        int i = R.id.containerSwipeRefreshLayout;
        SpringView springView = (SpringView) ViewBindings.findChildViewById(viewInflate, R.id.containerSwipeRefreshLayout);
        if (springView != null) {
            i = R.id.recycler_view_history;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_history);
            if (recyclerView != null) {
                i = R.id.shop_history_empty_linear;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(viewInflate, R.id.shop_history_empty_linear);
                if (linearLayoutCompat != null) {
                    i = R.id.shop_now_button;
                    Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.shop_now_button);
                    if (button != null) {
                        this.u0 = new C0447e(coordinatorLayout, springView, recyclerView, linearLayoutCompat, button);
                        j.f(coordinatorLayout, "getRoot(...)");
                        return coordinatorLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P1(com.paymaya.domain.model.ShopPurchaseHistory r10) {
        /*
            r9 = this;
            androidx.fragment.app.FragmentActivity r0 = r9.requireActivity()
            java.lang.String r1 = "clipboard"
            java.lang.Object r0 = r0.getSystemService(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.content.ClipboardManager"
            kotlin.jvm.internal.j.e(r0, r1)
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            java.lang.String r10 = r10.mCode()
            if (r10 == 0) goto L50
            int r1 = r10.length()
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r4 = r3
            r5 = r4
        L20:
            if (r4 > r1) goto L45
            if (r5 != 0) goto L26
            r6 = r4
            goto L27
        L26:
            r6 = r1
        L27:
            char r6 = r10.charAt(r6)
            r7 = 32
            int r6 = kotlin.jvm.internal.j.i(r6, r7)
            if (r6 > 0) goto L35
            r6 = r2
            goto L36
        L35:
            r6 = r3
        L36:
            if (r5 != 0) goto L3f
            if (r6 != 0) goto L3c
            r5 = r2
            goto L20
        L3c:
            int r4 = r4 + 1
            goto L20
        L3f:
            if (r6 != 0) goto L42
            goto L45
        L42:
            int r1 = r1 + (-1)
            goto L20
        L45:
            int r1 = r1 + r2
            java.lang.CharSequence r10 = r10.subSequence(r4, r1)
            java.lang.String r10 = r10.toString()
            if (r10 != 0) goto L52
        L50:
            java.lang.String r10 = ""
        L52:
            java.lang.String r1 = "Coupon Code"
            android.content.ClipData r10 = android.content.ClipData.newPlainText(r1, r10)
            r0.setPrimaryClip(r10)
            cc.A r10 = r9.t0
            if (r10 == 0) goto L80
            r0 = r10
            com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity r0 = (com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity) r0
            N5.j r10 = r0.f13986n
            kotlin.jvm.internal.j.d(r10)
            java.lang.String r1 = "getRoot(...)"
            androidx.constraintlayout.widget.ConstraintLayout r10 = r10.f4123b
            kotlin.jvm.internal.j.f(r10, r1)
            r5 = 2132017793(0x7f140281, float:1.9673874E38)
            r8 = 852(0x354, float:1.194E-42)
            r2 = 0
            r3 = 2131955418(0x7f130eda, float:1.9547363E38)
            r4 = 2131231175(0x7f0801c7, float:1.8078424E38)
            r6 = 0
            r7 = 0
            r1 = r10
            com.paymaya.common.utility.b0.e(r0, r1, r2, r3, r4, r5, r6, r7, r8)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryPageFragment.P1(com.paymaya.domain.model.ShopPurchaseHistory):void");
    }

    public final A Q1() {
        A a8 = this.f14110o0;
        if (a8 != null) {
            return a8;
        }
        j.n("mShopV3PurchaseHistoryPageFragmentPresenter");
        throw null;
    }

    public final SpringView R1() {
        C0447e c0447e = this.u0;
        j.d(c0447e);
        SpringView containerSwipeRefreshLayout = (SpringView) c0447e.f4080d;
        j.f(containerSwipeRefreshLayout, "containerSwipeRefreshLayout");
        return containerSwipeRefreshLayout;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return this.y0;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t0 = (InterfaceC1087A) getActivity();
        a aVar = W4.a.e().z().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f14110o0 = new A(aVar.H(), (com.paymaya.data.preference.a) aVar.e.get(), 0);
        Q1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Q1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.u0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        o1().d(getActivity(), m1());
        super.onPause();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("status", this.f14113r0);
        o1();
        m1().f11205g = System.nanoTime();
        C1219h c1219hH = AbstractC2329d.h(2);
        c1219hH.j.put("status", this.f14113r0);
        A1(c1219hH);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Q1().k();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        R1().setHeader(new e());
        View viewFindViewById = R1().getHeaderView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.f14116x0 = (LottieAnimationView) viewFindViewById;
        R1().setListener(new T3.l(this, 26));
        C0447e c0447e = this.u0;
        j.d(c0447e);
        this.f14115v0 = (RecyclerView) c0447e.e;
        this.w0 = new LinearLayoutManager(getActivity(), 1, false);
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        this.f14114s0 = new C0674C(contextRequireContext, t1(), this);
        RecyclerView recyclerView = this.f14115v0;
        if (recyclerView == null) {
            j.n("mRecyclerViewItems");
            throw null;
        }
        recyclerView.setLayoutManager(this.w0);
        C0674C c0674c = this.f14114s0;
        if (c0674c == null) {
            j.n("mShopV3PurchaseHistoryItemAdapter");
            throw null;
        }
        recyclerView.setAdapter(c0674c);
        C0674C c0674c2 = this.f14114s0;
        if (c0674c2 == null) {
            j.n("mShopV3PurchaseHistoryItemAdapter");
            throw null;
        }
        recyclerView.addItemDecoration(new C1562b(c0674c2, R.layout.maya_view_date_header_view_all));
        recyclerView.addOnScrollListener(new B(this));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f14112q0 = arguments.getString("shop_purchase_history_status");
            A aQ1 = Q1();
            String str = this.f14112q0;
            if (str == null) {
                str = "";
            }
            aQ1.j();
            aQ1.f = str;
            ((MayaShopPurchaseHistoryPageFragment) ((l) aQ1.c.get())).O1();
            aQ1.k();
            if ("KYUUBI_PENDING".equalsIgnoreCase(str)) {
                MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment = (MayaShopPurchaseHistoryPageFragment) ((l) aQ1.c.get());
                mayaShopPurchaseHistoryPageFragment.getClass();
                mayaShopPurchaseHistoryPageFragment.f14113r0 = "pending";
            } else if ("DISBURSEMENT_SUCCESSFUL".equalsIgnoreCase(str)) {
                MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment2 = (MayaShopPurchaseHistoryPageFragment) ((l) aQ1.c.get());
                mayaShopPurchaseHistoryPageFragment2.getClass();
                mayaShopPurchaseHistoryPageFragment2.f14113r0 = "completed";
            }
        }
        C0447e c0447e2 = this.u0;
        j.d(c0447e2);
        ((Button) c0447e2.c).setOnClickListener(new z(this, 1));
    }
}
