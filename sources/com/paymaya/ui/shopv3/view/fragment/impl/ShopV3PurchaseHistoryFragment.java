package com.paymaya.ui.shopv3.view.fragment.impl;

import Ac.e;
import Ah.p;
import N5.C0450f;
import O5.a;
import Uh.d;
import Xb.z;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1220i;
import d4.AbstractC1331a;
import kotlin.jvm.internal.j;
import retrofit2.Response;
import se.C2255a;
import ve.i;
import we.C2401F;
import y5.g;
import zh.b;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class ShopV3PurchaseHistoryFragment extends BaseFragment implements i {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public z f14861S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public g f14862T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public e f14863U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C0450f f14864V;

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14862T = (g) getActivity();
        a aVar = W4.a.e().H().f4756a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        z zVar = new z(aVar.H(), (d) aVar.f4748y.get());
        this.f14861S = zVar;
        zVar.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_fragment_shop_v3_purchase_history, viewGroup, false);
        ViewPager viewPager = (ViewPager) viewInflate;
        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(viewInflate, R.id.tab_layout_pma_fragment_shop_v3_purchase_history);
        if (tabLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tab_layout_pma_fragment_shop_v3_purchase_history)));
        }
        this.f14864V = new C0450f((ViewGroup) viewPager, (Object) viewPager, (Object) tabLayout, 25);
        return viewPager;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        z zVar = this.f14861S;
        if (zVar == null) {
            j.n("mShopV3PurchaseHistoryFragmentPresenter");
            throw null;
        }
        zVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14864V = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        g gVar = this.f14862T;
        j.d(gVar);
        gVar.Q(this);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        String string = getArguments() != null ? requireArguments().getString("status") : null;
        z zVar = this.f14861S;
        if (zVar == null) {
            j.n("mShopV3PurchaseHistoryFragmentPresenter");
            throw null;
        }
        zVar.j();
        ShopV3PurchaseHistoryFragment shopV3PurchaseHistoryFragment = (ShopV3PurchaseHistoryFragment) ((i) zVar.c.get());
        Context contextRequireContext = shopV3PurchaseHistoryFragment.requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        FragmentManager childFragmentManager = shopV3PurchaseHistoryFragment.getChildFragmentManager();
        j.f(childFragmentManager, "getChildFragmentManager(...)");
        shopV3PurchaseHistoryFragment.f14863U = new e(contextRequireContext, childFragmentManager, 2);
        ViewPager viewPagerR1 = shopV3PurchaseHistoryFragment.r1();
        viewPagerR1.setOffscreenPageLimit(2);
        viewPagerR1.setAdapter(shopV3PurchaseHistoryFragment.f14863U);
        viewPagerR1.addOnPageChangeListener(new C2401F());
        C0450f c0450f = shopV3PurchaseHistoryFragment.f14864V;
        j.d(c0450f);
        TabLayout tabLayout = (TabLayout) c0450f.f4088d;
        tabLayout.setupWithViewPager(shopV3PurchaseHistoryFragment.r1());
        int tabCount = tabLayout.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            if (tabLayout.getTabAt(i) != null) {
                View childAt = tabLayout.getChildAt(0);
                j.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                View childAt2 = ((ViewGroup) childAt).getChildAt(i);
                if (i == 0) {
                    childAt2.setId(R.id.pma_fragment_shop_purchase_history_tab_processing);
                } else if (i == 1) {
                    childAt2.setId(R.id.pma_fragment_shop_purchase_history_tab_completed);
                }
            }
        }
        p<Response<Void>> pVarResetOrdersPurchaseHistory = zVar.f6602d.f11480b.resetOrdersPurchaseHistory();
        new Lh.d(AbstractC1331a.l(pVarResetOrdersPurchaseHistory, pVarResetOrdersPurchaseHistory, b.a()), C2255a.h, 0).e();
        if (string == null || C2576A.H(string) || "KYUUBI_PENDING".equalsIgnoreCase(string)) {
            ((ShopV3PurchaseHistoryFragment) ((i) zVar.c.get())).r1().setCurrentItem(0);
        } else if ("DISBURSEMENT_SUCCESSFUL".equalsIgnoreCase(string)) {
            ((ShopV3PurchaseHistoryFragment) ((i) zVar.c.get())).r1().setCurrentItem(1);
        }
    }

    public final ViewPager r1() {
        C0450f c0450f = this.f14864V;
        j.d(c0450f);
        ViewPager containerViewPagerPmaFragmentShopV3PurchaseHistory = (ViewPager) c0450f.f4087b;
        j.f(containerViewPagerPmaFragmentShopV3PurchaseHistory, "containerViewPagerPmaFragmentShopV3PurchaseHistory");
        return containerViewPagerPmaFragmentShopV3PurchaseHistory;
    }
}
