package com.paymaya.mayaui.favorite.view.fragment.impl;

import N5.C0447e;
import O5.a;
import X7.d;
import Y7.f;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import androidx.work.impl.e;
import c8.c;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.store.C1269l;
import com.paymaya.domain.store.C1286u;
import com.paymaya.domain.store.Q;
import com.paymaya.mayaui.favorite.view.activity.impl.MayaFavoriteActivity;
import d8.C1342g;
import d8.InterfaceC1341f;
import d8.ViewOnClickListenerC1340e;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaFavoriteFragment extends MayaBaseLoadingFragment implements c {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C0447e f12345o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Toolbar f12346p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ViewPager2 f12347q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TabLayout f12348r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public U7.c f12349s0;
    public f t0;
    public InterfaceC1341f u0;

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_favorite, viewGroup, false);
        int i = R.id.app_bar_layout_favorites;
        if (((AppBarLayout) ViewBindings.findChildViewById(viewInflate, R.id.app_bar_layout_favorites)) != null) {
            i = R.id.collapsing_toolbar_favorites;
            if (((CollapsingToolbarLayout) ViewBindings.findChildViewById(viewInflate, R.id.collapsing_toolbar_favorites)) != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                i = R.id.tab_layout_favorites;
                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(viewInflate, R.id.tab_layout_favorites);
                if (tabLayout != null) {
                    i = R.id.toolbar_favorites;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, R.id.toolbar_favorites);
                    if (toolbar != null) {
                        i = R.id.view_pager_favorites;
                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(viewInflate, R.id.view_pager_favorites);
                        if (viewPager2 != null) {
                            this.f12345o0 = new C0447e(coordinatorLayout, coordinatorLayout, tabLayout, toolbar, viewPager2, 14);
                            j.f(coordinatorLayout, "getRoot(...)");
                            return coordinatorLayout;
                        }
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

    public final d P1() {
        f fVar = this.t0;
        if (fVar != null) {
            return fVar;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.u0 = (InterfaceC1341f) getActivity();
        a aVar = W4.a.e().m().f4756a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        Q q9 = aVar.q();
        C1269l c1269lF = aVar.f();
        C1286u c1286uK = aVar.k();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(sessionSubject, "sessionSubject");
        this.t0 = new f(q9, c1286uK, c1269lF, preference, sessionSubject);
        ((AbstractC2509a) P1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((f) P1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f12345o0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC1341f interfaceC1341f = this.u0;
        if (interfaceC1341f != null) {
            ((MayaFavoriteActivity) interfaceC1341f).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0447e c0447e = this.f12345o0;
        j.d(c0447e);
        this.f12346p0 = (Toolbar) c0447e.e;
        C0447e c0447e2 = this.f12345o0;
        j.d(c0447e2);
        this.f12347q0 = (ViewPager2) c0447e2.f;
        C0447e c0447e3 = this.f12345o0;
        j.d(c0447e3);
        this.f12348r0 = (TabLayout) c0447e3.f4080d;
        Toolbar toolbar = this.f12346p0;
        if (toolbar == null) {
            j.n("mToolbar");
            throw null;
        }
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC1340e(this, 0));
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        U7.c cVar = new U7.c(fragmentActivityRequireActivity, this);
        this.f12349s0 = cVar;
        ViewPager2 viewPager2 = this.f12347q0;
        if (viewPager2 == null) {
            j.n("mViewPager");
            throw null;
        }
        viewPager2.setAdapter(cVar);
        ViewPager2 viewPager22 = this.f12347q0;
        if (viewPager22 == null) {
            j.n("mViewPager");
            throw null;
        }
        viewPager22.setUserInputEnabled(false);
        TabLayout tabLayout = this.f12348r0;
        if (tabLayout == null) {
            j.n("mTabLayout");
            throw null;
        }
        ViewPager2 viewPager23 = this.f12347q0;
        if (viewPager23 == null) {
            j.n("mViewPager");
            throw null;
        }
        new TabLayoutMediator(tabLayout, viewPager23, new e(this, 29)).attach();
        TabLayout tabLayout2 = this.f12348r0;
        if (tabLayout2 == null) {
            j.n("mTabLayout");
            throw null;
        }
        View childAt = tabLayout2.getChildAt(0);
        j.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) childAt;
        View view2 = ViewGroupKt.get(viewGroup, 0);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        j.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(view2.getResources().getDimensionPixelSize(R.dimen.maya_margin_large));
        view2.setLayoutParams(layoutParams2);
        View view3 = ViewGroupKt.get(viewGroup, viewGroup.getChildCount() - 1);
        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
        j.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.setMarginEnd(view3.getResources().getDimensionPixelSize(R.dimen.maya_margin_large));
        view3.setLayoutParams(layoutParams4);
        TabLayout tabLayout3 = this.f12348r0;
        if (tabLayout3 == null) {
            j.n("mTabLayout");
            throw null;
        }
        tabLayout3.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C1342g(this));
        ((f) P1()).j();
    }
}
