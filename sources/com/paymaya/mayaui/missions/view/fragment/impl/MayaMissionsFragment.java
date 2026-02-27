package com.paymaya.mayaui.missions.view.fragment.impl;

import B9.c;
import F9.e;
import G9.f;
import G9.g;
import N5.H0;
import O5.a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import cj.C1132s;
import com.google.android.material.tabs.TabLayout;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.MissionsCategory;
import com.paymaya.mayaui.missions.view.activity.impl.MayaMissionsActivity;
import java.util.List;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class MayaMissionsFragment extends MayaBaseLoadingFragment implements e {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public H0 f13019o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TabLayout f13020p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ViewPager f13021q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public c f13022r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public f f13023s0;

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_missions, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        int i = R.id.maya_missions_view_pager;
        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(viewInflate, R.id.maya_missions_view_pager);
        if (viewPager != null) {
            i = R.id.missions_tab_layout;
            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(viewInflate, R.id.missions_tab_layout);
            if (tabLayout != null) {
                this.f13019o0 = new H0(linearLayout, viewPager, tabLayout, 0);
                j.f(linearLayout, "getRoot(...)");
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_error_dashboard, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading_progress, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final void P1() {
        List listG = C1132s.g(new MissionsCategory(0, "Home"), new MissionsCategory(1, "In Progress"), new MissionsCategory(2, "Completed"));
        FragmentManager childFragmentManager = getChildFragmentManager();
        j.f(childFragmentManager, "getChildFragmentManager(...)");
        E9.e eVar = new E9.e(childFragmentManager, listG, 0);
        ViewPager viewPager = this.f13021q0;
        if (viewPager == null) {
            j.n("mViewPagerContent");
            throw null;
        }
        viewPager.setAdapter(eVar);
        TabLayout tabLayout = this.f13020p0;
        if (tabLayout == null) {
            j.n("mTabLayoutMissions");
            throw null;
        }
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setOffscreenPageLimit(1);
        viewPager.addOnPageChangeListener(new g(listG, this));
        L1();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().r(EnumC1216e.MISSION);
        this.f13023s0 = (f) requireActivity();
        a aVar = W4.a.e().s().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        c cVar = new c(aVar.D());
        this.f13022r0 = cVar;
        cVar.h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        c cVar = this.f13022r0;
        if (cVar == null) {
            j.n("mMissionsFragmentPresenter");
            throw null;
        }
        cVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f13019o0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1219h c1219hH = AbstractC2329d.h(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("attribution", n1().f10371a);
        A1(c1219hH);
        f fVar = this.f13023s0;
        if (fVar != null) {
            ((MayaMissionsActivity) fVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        H0 h02 = this.f13019o0;
        j.d(h02);
        this.f13020p0 = h02.f3644d;
        H0 h03 = this.f13019o0;
        j.d(h03);
        this.f13021q0 = h03.c;
        c cVar = this.f13022r0;
        if (cVar != null) {
            cVar.j();
        } else {
            j.n("mMissionsFragmentPresenter");
            throw null;
        }
    }
}
