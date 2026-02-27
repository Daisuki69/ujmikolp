package com.paymaya.mayaui.missions.view.fragment.impl;

import B9.d;
import E9.a;
import E9.b;
import E9.k;
import F9.f;
import G6.w;
import G9.h;
import G9.i;
import J7.e;
import N5.C0466m;
import S5.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.tabs.TabLayout;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.MissionV2;
import com.paymaya.mayaui.missions.view.activity.impl.MayaMissionsActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaMissionsHomeFragment extends MayaBaseLoadingFragment implements f, E9.f {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C0466m f13024o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public d f13025p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public RecyclerView f13026q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public RecyclerView f13027r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public TextView f13028s0;
    public SpringView t0;
    public Group u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Group f13029v0;
    public LottieAnimationView w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public i f13030x0;
    public E9.i y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public a f13031z0;

    public static final void Q1(MayaMissionsHomeFragment mayaMissionsHomeFragment) {
        FragmentActivity fragmentActivityRequireActivity = mayaMissionsHomeFragment.requireActivity();
        j.e(fragmentActivityRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) fragmentActivityRequireActivity;
        new MayaMissionsFragment();
        Fragment fragmentFindFragmentByTag = appCompatActivity.getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(appCompatActivity, MayaMissionsFragment.class));
        if (fragmentFindFragmentByTag == null || !(fragmentFindFragmentByTag instanceof MayaMissionsFragment)) {
            return;
        }
        TabLayout tabLayout = ((MayaMissionsFragment) fragmentFindFragmentByTag).f13020p0;
        if (tabLayout != null) {
            tabLayout.selectTab(tabLayout.getTabAt(1));
        } else {
            j.n("mTabLayoutMissions");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_missions_home, viewGroup, false);
        int i = R.id.empty_missions_background_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.empty_missions_background_view);
        if (viewFindChildViewById != null) {
            i = R.id.empty_missions_constraint_group;
            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.empty_missions_constraint_group);
            if (group != null) {
                i = R.id.empty_missions_graphic_image_view;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.empty_missions_graphic_image_view)) != null) {
                    i = R.id.empty_missions_message_text_view;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.empty_missions_message_text_view)) != null) {
                        i = R.id.empty_missions_title_text_view;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.empty_missions_title_text_view)) != null) {
                            SpringView springView = (SpringView) viewInflate;
                            i = R.id.home_missions_recycler_view;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.home_missions_recycler_view);
                            if (recyclerView != null) {
                                i = R.id.home_screen_nested_scroll_view;
                                if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.home_screen_nested_scroll_view)) != null) {
                                    i = R.id.in_progress_home_missions_recycler_view;
                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.in_progress_home_missions_recycler_view);
                                    if (recyclerView2 != null) {
                                        i = R.id.in_progress_missions_constraint_group;
                                        Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.in_progress_missions_constraint_group);
                                        if (group2 != null) {
                                            i = R.id.in_progress_missions_text_view;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.in_progress_missions_text_view)) != null) {
                                                i = R.id.other_missions_text_view;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.other_missions_text_view)) != null) {
                                                    i = R.id.view_all_in_progress_missions_text_view;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.view_all_in_progress_missions_text_view);
                                                    if (textView != null) {
                                                        this.f13024o0 = new C0466m(springView, viewFindChildViewById, group, springView, recyclerView, recyclerView2, group2, textView);
                                                        j.f(springView, "getRoot(...)");
                                                        return springView;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
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

    public final A9.a P1() {
        d dVar = this.f13025p0;
        if (dVar != null) {
            return dVar;
        }
        j.n("mMissionsHomeFragmentPresenter");
        throw null;
    }

    public final void R1(List inProgressMissionListItems) {
        j.g(inProgressMissionListItems, "inProgressMissionListItems");
        a aVar = this.f13031z0;
        if (aVar != null) {
            ArrayList arrayList = aVar.f1330d;
            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new k(arrayList, inProgressMissionListItems));
            j.f(diffResultCalculateDiff, "calculateDiff(...)");
            arrayList.clear();
            arrayList.addAll(inProgressMissionListItems);
            diffResultCalculateDiff.dispatchUpdatesTo(aVar);
        }
    }

    @Override // E9.f
    public final void d(MissionV2 missionV2) {
        i iVar = this.f13030x0;
        if (iVar != null) {
            ((MayaMissionsActivity) iVar).X1(missionV2);
        }
    }

    @Override // E9.f
    public final void k(MissionV2 missionV2) {
        i iVar = this.f13030x0;
        if (iVar != null) {
            ((MayaMissionsActivity) iVar).V1(missionV2);
        }
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.MISSION_ITEM);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String string = getString(R.string.maya_label_missions_home);
        j.f(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        j.f(lowerCase, "toLowerCase(...)");
        HashMap map = c1219hD.j;
        map.put("category", lowerCase);
        map.put("mission_title", missionV2 != null ? missionV2.getTitle() : null);
        c1219hD.i();
        c1220iO1.c(activity, c1219hD);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().r(EnumC1216e.MISSION);
        this.f13030x0 = (i) requireActivity();
        O5.a aVar = W4.a.e().s().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f13025p0 = new d((com.paymaya.data.preference.a) aVar.e.get(), aVar.D(), (Uh.d) aVar.f4748y.get());
        ((AbstractC2509a) P1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) P1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f13024o0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        i iVar = this.f13030x0;
        if (iVar != null) {
            ((MayaMissionsActivity) iVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0466m c0466m = this.f13024o0;
        j.d(c0466m);
        this.f13026q0 = (RecyclerView) c0466m.f;
        C0466m c0466m2 = this.f13024o0;
        j.d(c0466m2);
        this.f13027r0 = (RecyclerView) c0466m2.f4152g;
        C0466m c0466m3 = this.f13024o0;
        j.d(c0466m3);
        this.f13028s0 = (TextView) c0466m3.i;
        C0466m c0466m4 = this.f13024o0;
        j.d(c0466m4);
        this.t0 = (SpringView) c0466m4.e;
        C0466m c0466m5 = this.f13024o0;
        j.d(c0466m5);
        this.u0 = (Group) c0466m5.c;
        C0466m c0466m6 = this.f13024o0;
        j.d(c0466m6);
        this.f13029v0 = (Group) c0466m6.h;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), 1, false);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        E9.j jVar = new E9.j(fragmentActivityRequireActivity);
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        j.f(fragmentActivityRequireActivity2, "requireActivity(...)");
        this.y0 = new E9.i(fragmentActivityRequireActivity2, this, t1());
        RecyclerView recyclerView = this.f13026q0;
        if (recyclerView == null) {
            j.n("homeMissionsRecyclerView");
            throw null;
        }
        recyclerView.addItemDecoration(jVar);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.y0);
        SpringView springView = this.t0;
        if (springView == null) {
            j.n("mSpringView");
            throw null;
        }
        springView.setHeader(new e());
        SpringView springView2 = this.t0;
        if (springView2 == null) {
            j.n("mSpringView");
            throw null;
        }
        View viewFindViewById = springView2.getHeaderView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.w0 = (LottieAnimationView) viewFindViewById;
        SpringView springView3 = this.t0;
        if (springView3 == null) {
            j.n("mSpringView");
            throw null;
        }
        springView3.setListener(new w(this, 2));
        TextView textView = this.f13028s0;
        if (textView == null) {
            j.n("viewAllInProgressMissionsTextView");
            throw null;
        }
        textView.setOnClickListener(new h(this, 0));
        ((d) P1()).j();
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
        FragmentActivity fragmentActivityRequireActivity3 = requireActivity();
        j.f(fragmentActivityRequireActivity3, "requireActivity(...)");
        b bVar = new b(fragmentActivityRequireActivity3);
        MayaMissionsHomeFragment$initializeInProgressMissionListCarousel$linearLayoutManager$1 mayaMissionsHomeFragment$initializeInProgressMissionListCarousel$linearLayoutManager$1 = new MayaMissionsHomeFragment$initializeInProgressMissionListCarousel$linearLayoutManager$1(getContext(), 0, false);
        FragmentActivity fragmentActivityRequireActivity4 = requireActivity();
        j.f(fragmentActivityRequireActivity4, "requireActivity(...)");
        this.f13031z0 = new a(fragmentActivityRequireActivity4, this);
        RecyclerView recyclerView2 = this.f13027r0;
        if (recyclerView2 == null) {
            j.n("inProgressHomeMissionsRecyclerView");
            throw null;
        }
        recyclerView2.addItemDecoration(bVar);
        recyclerView2.setLayoutManager(mayaMissionsHomeFragment$initializeInProgressMissionListCarousel$linearLayoutManager$1);
        ViewCompat.setNestedScrollingEnabled(recyclerView2, false);
        linearSnapHelper.attachToRecyclerView(recyclerView2);
        recyclerView2.setAdapter(this.f13031z0);
    }
}
