package com.paymaya.mayaui.missions.view.fragment.impl;

import B9.b;
import E9.f;
import E9.i;
import F9.g;
import G6.r;
import G9.k;
import J7.e;
import N5.J0;
import O5.a;
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
public class MayaMissionsInProgressFragment extends MayaBaseLoadingFragment implements g, f {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public J0 f13032o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public b f13033p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public RecyclerView f13034q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public SpringView f13035r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Group f13036s0;
    public LottieAnimationView t0;
    public k u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public i f13037v0;

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_missions_in_progress, viewGroup, false);
        int i = R.id.empty_in_progress_missions_background_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.empty_in_progress_missions_background_view);
        if (viewFindChildViewById != null) {
            i = R.id.empty_in_progress_missions_constraint_group;
            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.empty_in_progress_missions_constraint_group);
            if (group != null) {
                i = R.id.empty_in_progress_missions_image_view;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.empty_in_progress_missions_image_view)) != null) {
                    i = R.id.empty_in_progress_missions_message_text_view;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.empty_in_progress_missions_message_text_view)) != null) {
                        i = R.id.empty_in_progress_missions_title_text_view;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.empty_in_progress_missions_title_text_view)) != null) {
                            SpringView springView = (SpringView) viewInflate;
                            i = R.id.in_progress_missions_recycler_view;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.in_progress_missions_recycler_view);
                            if (recyclerView != null) {
                                this.f13032o0 = new J0(springView, viewFindChildViewById, group, springView, recyclerView);
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
        b bVar = this.f13033p0;
        if (bVar != null) {
            return bVar;
        }
        j.n("mMissionsInProgressFragmentPresenter");
        throw null;
    }

    @Override // E9.f
    public final void d(MissionV2 missionV2) {
    }

    @Override // E9.f
    public final void k(MissionV2 missionV2) {
        k kVar = this.u0;
        if (kVar != null) {
            ((MayaMissionsActivity) kVar).V1(missionV2);
        }
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.MISSION_ITEM);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String string = getString(R.string.maya_label_missions_in_progress);
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
        this.u0 = (k) requireActivity();
        a aVar = W4.a.e().s().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f13033p0 = new b((com.paymaya.data.preference.a) aVar.e.get(), aVar.D(), (d) aVar.f4748y.get(), 1);
        P1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        P1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f13032o0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        k kVar = this.u0;
        if (kVar != null) {
            ((MayaMissionsActivity) kVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        J0 j02 = this.f13032o0;
        j.d(j02);
        this.f13034q0 = j02.f;
        J0 j03 = this.f13032o0;
        j.d(j03);
        SpringView springView = j03.e;
        j.g(springView, "<set-?>");
        this.f13035r0 = springView;
        J0 j04 = this.f13032o0;
        j.d(j04);
        this.f13036s0 = j04.f3694d;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), 1, false);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        this.f13037v0 = new i(fragmentActivityRequireActivity, this, t1());
        SpringView springView2 = this.f13035r0;
        if (springView2 == null) {
            j.n("mSpringView");
            throw null;
        }
        springView2.setHeader(new e());
        SpringView springView3 = this.f13035r0;
        if (springView3 == null) {
            j.n("mSpringView");
            throw null;
        }
        View viewFindViewById = springView3.getHeaderView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.t0 = (LottieAnimationView) viewFindViewById;
        SpringView springView4 = this.f13035r0;
        if (springView4 == null) {
            j.n("mSpringView");
            throw null;
        }
        springView4.setListener(new r(this, 4));
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        j.f(fragmentActivityRequireActivity2, "requireActivity(...)");
        E9.j jVar = new E9.j(fragmentActivityRequireActivity2);
        RecyclerView recyclerView = this.f13034q0;
        if (recyclerView == null) {
            j.n("missionsRecyclerView");
            throw null;
        }
        recyclerView.addItemDecoration(jVar);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f13037v0);
        P1().j();
    }
}
