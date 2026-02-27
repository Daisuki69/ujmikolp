package com.paymaya.mayaui.shop.view.fragment.impl;

import Ac.e;
import Ah.p;
import N5.H0;
import O5.a;
import Uh.d;
import Xb.C0612a;
import Xb.z;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import bc.k;
import cc.y;
import com.google.android.material.tabs.TabLayout;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import d4.AbstractC1331a;
import kotlin.jvm.internal.j;
import retrofit2.Response;
import y5.g;
import zh.b;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaShopPurchaseHistoryFragment extends BaseFragment implements k {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public z f14105S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public g f14106T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public e f14107U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public H0 f14108V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public String f14109W;

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f14109W = arguments.getString("shop_history_source_page");
        }
        this.f14106T = (g) getActivity();
        a aVar = W4.a.e().z().f4753a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        z zVar = new z(aVar.H(), (d) aVar.f4748y.get());
        this.f14105S = zVar;
        zVar.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_shop_purchase_history, viewGroup, false);
        int i = R.id.container_view_pager_pma_fragment_shop_v3_purchase_history;
        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(viewInflate, R.id.container_view_pager_pma_fragment_shop_v3_purchase_history);
        if (viewPager != null) {
            i = R.id.tab_layout_pma_fragment_shop_v3_purchase_history;
            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(viewInflate, R.id.tab_layout_pma_fragment_shop_v3_purchase_history);
            if (tabLayout != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                this.f14108V = new H0(linearLayout, viewPager, tabLayout, 1);
                j.f(linearLayout, "getRoot(...)");
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        z zVar = this.f14105S;
        if (zVar == null) {
            j.n("mShopV3PurchaseHistoryFragmentPresenter");
            throw null;
        }
        zVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14108V = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1219h c1219hE = C1219h.e(AbstractC1213b.w(7));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String str = this.f14109W;
        if (str != null) {
            c1219hE.j.put("source_page", str);
        }
        this.f10245B.b(c1219hE);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        g gVar = this.f14106T;
        j.d(gVar);
        gVar.Q(this);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        String string = getArguments() != null ? requireArguments().getString("status") : null;
        z zVar = this.f14105S;
        if (zVar == null) {
            j.n("mShopV3PurchaseHistoryFragmentPresenter");
            throw null;
        }
        zVar.j();
        MayaShopPurchaseHistoryFragment mayaShopPurchaseHistoryFragment = (MayaShopPurchaseHistoryFragment) ((k) zVar.c.get());
        Context contextRequireContext = mayaShopPurchaseHistoryFragment.requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        FragmentManager childFragmentManager = mayaShopPurchaseHistoryFragment.getChildFragmentManager();
        j.f(childFragmentManager, "getChildFragmentManager(...)");
        mayaShopPurchaseHistoryFragment.f14107U = new e(contextRequireContext, childFragmentManager, 1);
        ViewPager viewPagerR1 = mayaShopPurchaseHistoryFragment.r1();
        viewPagerR1.setOffscreenPageLimit(2);
        viewPagerR1.setAdapter(mayaShopPurchaseHistoryFragment.f14107U);
        viewPagerR1.addOnPageChangeListener(new y());
        H0 h02 = mayaShopPurchaseHistoryFragment.f14108V;
        j.d(h02);
        TabLayout tabLayout = h02.f3644d;
        tabLayout.setupWithViewPager(mayaShopPurchaseHistoryFragment.r1());
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
        new Lh.d(AbstractC1331a.l(pVarResetOrdersPurchaseHistory, pVarResetOrdersPurchaseHistory, b.a()), C0612a.h, 0).e();
        if (string == null || C2576A.H(string) || "KYUUBI_PENDING".equalsIgnoreCase(string)) {
            ((MayaShopPurchaseHistoryFragment) ((k) zVar.c.get())).r1().setCurrentItem(0);
        } else if ("DISBURSEMENT_SUCCESSFUL".equalsIgnoreCase(string)) {
            ((MayaShopPurchaseHistoryFragment) ((k) zVar.c.get())).r1().setCurrentItem(1);
        }
    }

    public final ViewPager r1() {
        H0 h02 = this.f14108V;
        j.d(h02);
        ViewPager containerViewPagerPmaFragmentShopV3PurchaseHistory = h02.c;
        j.f(containerViewPagerPmaFragmentShopV3PurchaseHistory, "containerViewPagerPmaFragmentShopV3PurchaseHistory");
        return containerViewPagerPmaFragmentShopV3PurchaseHistory;
    }
}
