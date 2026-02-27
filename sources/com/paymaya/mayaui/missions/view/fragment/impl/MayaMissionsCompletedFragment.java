package com.paymaya.mayaui.missions.view.fragment.impl;

import B9.b;
import E9.f;
import E9.i;
import F9.a;
import G6.u;
import J7.e;
import N5.J0;
import S5.c;
import Uh.d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.MissionV2;
import com.paymaya.mayaui.missions.view.activity.impl.MayaMissionsActivity;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaMissionsCompletedFragment extends MayaBaseLoadingFragment implements a, f {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public J0 f12959o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public b f12960p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public RecyclerView f12961q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public SpringView f12962r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Group f12963s0;
    public LottieAnimationView t0;
    public G9.b u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public i f12964v0;

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_missions_completed, viewGroup, false);
        SpringView springView = (SpringView) viewInflate;
        int i = R.id.completed_missions_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.completed_missions_recycler_view);
        if (recyclerView != null) {
            i = R.id.empty_completed_missions_background_view;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.empty_completed_missions_background_view);
            if (viewFindChildViewById != null) {
                i = R.id.empty_completed_missions_constraint_group;
                Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.empty_completed_missions_constraint_group);
                if (group != null) {
                    i = R.id.empty_completed_missions_graphic_image_view;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.empty_completed_missions_graphic_image_view)) != null) {
                        i = R.id.empty_completed_missions_message_text_view;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.empty_completed_missions_message_text_view)) != null) {
                            i = R.id.empty_completed_missions_title_text_view;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.empty_completed_missions_title_text_view)) != null) {
                                this.f12959o0 = new J0(springView, springView, recyclerView, viewFindChildViewById, group);
                                j.f(springView, "getRoot(...)");
                                return springView;
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

    public final b P1() {
        b bVar = this.f12960p0;
        if (bVar != null) {
            return bVar;
        }
        j.n("mMissionsCompletedFragmentPresenter");
        throw null;
    }

    @Override // E9.f
    public final void d(MissionV2 missionV2) {
    }

    @Override // E9.f
    public final void k(MissionV2 missionV2) {
        G9.b bVar = this.u0;
        if (bVar != null) {
            ((MayaMissionsActivity) bVar).V1(missionV2);
        }
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.MISSION_ITEM);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String string = getString(R.string.maya_label_missions_completed);
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
        this.u0 = (G9.b) requireActivity();
        O5.a aVar = W4.a.e().s().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12960p0 = new b((com.paymaya.data.preference.a) aVar.e.get(), aVar.D(), (d) aVar.f4748y.get(), 0);
        P1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        P1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12959o0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        G9.b bVar = this.u0;
        if (bVar != null) {
            ((MayaMissionsActivity) bVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        J0 j02 = this.f12959o0;
        j.d(j02);
        this.f12961q0 = j02.f;
        J0 j03 = this.f12959o0;
        j.d(j03);
        this.f12962r0 = j03.e;
        J0 j04 = this.f12959o0;
        j.d(j04);
        this.f12963s0 = j04.f3694d;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), 1, false);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        this.f12964v0 = new i(fragmentActivityRequireActivity, this, t1());
        SpringView springView = this.f12962r0;
        if (springView == null) {
            j.n("mSpringView");
            throw null;
        }
        springView.setHeader(new e());
        SpringView springView2 = this.f12962r0;
        if (springView2 == null) {
            j.n("mSpringView");
            throw null;
        }
        View viewFindViewById = springView2.getHeaderView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.t0 = (LottieAnimationView) viewFindViewById;
        SpringView springView3 = this.f12962r0;
        if (springView3 == null) {
            j.n("mSpringView");
            throw null;
        }
        springView3.setListener(new u(this, 2));
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        j.f(fragmentActivityRequireActivity2, "requireActivity(...)");
        E9.j jVar = new E9.j(fragmentActivityRequireActivity2);
        RecyclerView recyclerView = this.f12961q0;
        if (recyclerView == null) {
            j.n("missionsRecyclerView");
            throw null;
        }
        recyclerView.addItemDecoration(jVar);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f12964v0);
        P1().j();
    }
}
