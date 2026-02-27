package com.paymaya.mayaui.travel.view.fragment.impl;

import Bb.f;
import N5.G;
import O5.a;
import S5.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Route;
import com.paymaya.domain.store.W0;
import com.paymaya.mayaui.travel.view.activity.impl.MayaTravelActivity;
import com.paymaya.mayaui.travel.view.widget.MayaTravelViewDataSelection;
import ic.C1599c;
import ic.InterfaceC1598b;
import java.util.ArrayList;
import jc.e;
import kc.g;
import kotlin.jvm.internal.j;
import mc.d;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class MayaTravelRouteSelectionFragment extends MayaBaseLoadingFragment implements e, InterfaceC1598b {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public G f14218o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public RecyclerView f14219p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public C1599c f14220q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public f f14221r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public g f14222s0;

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_travel_route_selection, viewGroup, false);
        int i = R.id.recycler_view_route_selection;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_route_selection);
        if (recyclerView != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title_header)) != null) {
                this.f14218o0 = new G(nestedScrollView, recyclerView, 1);
                j.f(nestedScrollView, "getRoot(...)");
                return nestedScrollView;
            }
            i = R.id.text_view_title_header;
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
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_travel_route_selection_loading, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final f P1() {
        f fVar = this.f14221r0;
        if (fVar != null) {
            return fVar;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    public final MayaTravelViewDataSelection Q1() {
        g gVar = this.f14222s0;
        if (gVar != null) {
            return (MayaTravelViewDataSelection) ((MayaTravelActivity) gVar).V1().e;
        }
        return null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.ROUTES;
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        MayaTravelViewDataSelection mayaTravelViewDataSelectionQ1 = Q1();
        if (mayaTravelViewDataSelectionQ1 == null) {
            return false;
        }
        mayaTravelViewDataSelectionQ1.c = null;
        ArrayList arrayList = mayaTravelViewDataSelectionQ1.f14231d;
        if (arrayList != null) {
            arrayList.clear();
        }
        mayaTravelViewDataSelectionQ1.f14231d = null;
        return false;
    }

    @Override // ic.InterfaceC1598b
    public final void f(mc.e eVar) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.NEXT);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        Route route = ((d) eVar).f18400b;
        c1219hH.j.put(AppMeasurementSdk.ConditionalUserProperty.NAME, route.mName());
        c1219hH.i();
        A1(c1219hH);
        MayaTravelViewDataSelection mayaTravelViewDataSelectionQ1 = Q1();
        if (mayaTravelViewDataSelectionQ1 != null) {
            mayaTravelViewDataSelectionQ1.c = route;
        }
        g gVar = this.f14222s0;
        if (gVar != null) {
            AbstractC1236z.i((MayaTravelActivity) gVar, R.id.frame_layout_container, new MayaTravelStopSelectionFragment(), R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().i();
        this.f14222s0 = (g) getActivity();
        a aVar = W4.a.e().A().f4754a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        W0 w0U = aVar.U();
        Uh.d sessionPublishSubject = (Uh.d) aVar.f4748y.get();
        j.g(sessionPublishSubject, "sessionPublishSubject");
        this.f14221r0 = new f(w0U, sessionPublishSubject, 18);
        P1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        P1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f14218o0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        c1219h.i();
        A1(c1219h);
        g gVar = this.f14222s0;
        if (gVar != null) {
            ((MayaTravelActivity) gVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        G g8 = this.f14218o0;
        j.d(g8);
        this.f14219p0 = g8.c;
        this.f14220q0 = new C1599c(this);
        RecyclerView recyclerView = this.f14219p0;
        if (recyclerView == null) {
            j.n("mSelectionRecyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = this.f14219p0;
        if (recyclerView2 == null) {
            j.n("mSelectionRecyclerView");
            throw null;
        }
        recyclerView2.setAdapter(this.f14220q0);
        P1().j();
    }
}
