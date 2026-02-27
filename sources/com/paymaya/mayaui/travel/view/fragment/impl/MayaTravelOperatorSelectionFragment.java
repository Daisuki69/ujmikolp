package com.paymaya.mayaui.travel.view.fragment.impl;

import A7.j;
import N5.Q0;
import O5.a;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.paymaya.domain.model.Operator;
import com.paymaya.domain.store.W0;
import com.paymaya.mayaui.travel.view.activity.impl.MayaTravelActivity;
import com.paymaya.mayaui.travel.view.widget.MayaTravelViewDataSelection;
import ic.C1599c;
import ic.InterfaceC1598b;
import java.util.ArrayList;
import jc.c;
import kc.d;
import mc.e;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class MayaTravelOperatorSelectionFragment extends MayaBaseLoadingFragment implements c, InterfaceC1598b {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Q0 f14202o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public RecyclerView f14203p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ConstraintLayout f14204q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public C1599c f14205r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public j f14206s0;
    public d t0;

    public static final void R1(MayaTravelOperatorSelectionFragment mayaTravelOperatorSelectionFragment) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.ACCESS_PHOTOS);
        c1219hH.i();
        mayaTravelOperatorSelectionFragment.A1(c1219hH);
        d dVar = mayaTravelOperatorSelectionFragment.t0;
        if (dVar != null) {
            MayaTravelActivity mayaTravelActivity = (MayaTravelActivity) dVar;
            mayaTravelActivity.n1();
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setType("image/*");
            intent.setFlags(268435456);
            if (intent.resolveActivity(mayaTravelActivity.getPackageManager()) != null) {
                mayaTravelActivity.startActivity(intent);
                return;
            }
            Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
            intent2.setType("image/*");
            if (intent2.resolveActivity(mayaTravelActivity.getPackageManager()) != null) {
                mayaTravelActivity.startActivityForResult(Intent.createChooser(intent2, ""), TypedValues.TransitionType.TYPE_DURATION);
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_travel_operator_selection, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.constraint_layout_travel_saved_qr_ticket_container;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_travel_saved_qr_ticket_container);
        if (constraintLayout2 != null) {
            i = R.id.image_view_travel_saved_qr_ticket_arrow;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_travel_saved_qr_ticket_arrow)) != null) {
                i = R.id.image_view_travel_saved_qr_ticket_icon;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_travel_saved_qr_ticket_icon)) != null) {
                    i = R.id.image_view_travel_saved_qr_ticket_label;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_travel_saved_qr_ticket_label)) != null) {
                        i = R.id.recycler_view_operator_selection;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_operator_selection);
                        if (recyclerView != null) {
                            i = R.id.scroll_view_layout;
                            if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_layout)) != null) {
                                i = R.id.text_view_title_header;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title_header)) != null) {
                                    this.f14202o0 = new Q0(constraintLayout, constraintLayout2, recyclerView, 0);
                                    kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                                    return constraintLayout;
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
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_reusable_error, viewGroup, false);
        kotlin.jvm.internal.j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_travel_operator_selection_loading, viewGroup, false);
        kotlin.jvm.internal.j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final j P1() {
        j jVar = this.f14206s0;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.j.n("mFragmentPresenter");
        throw null;
    }

    public final MayaTravelViewDataSelection Q1() {
        d dVar = this.t0;
        if (dVar != null) {
            return (MayaTravelViewDataSelection) ((MayaTravelActivity) dVar).V1().e;
        }
        return null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.OPERATORS;
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        MayaTravelViewDataSelection mayaTravelViewDataSelectionQ1 = Q1();
        if (mayaTravelViewDataSelectionQ1 != null) {
            mayaTravelViewDataSelectionQ1.f14229a = null;
            ArrayList arrayList = mayaTravelViewDataSelectionQ1.f14230b;
            if (arrayList != null) {
                arrayList.clear();
            }
            mayaTravelViewDataSelectionQ1.f14230b = null;
        }
        d dVar = this.t0;
        if (dVar == null) {
            return false;
        }
        ((MayaTravelActivity) dVar).V1().e = null;
        return false;
    }

    @Override // ic.InterfaceC1598b
    public final void f(e eVar) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.NEXT);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        Operator operator = ((mc.c) eVar).f18399b;
        c1219hH.j.put(AppMeasurementSdk.ConditionalUserProperty.NAME, operator.mName());
        c1219hH.i();
        A1(c1219hH);
        MayaTravelViewDataSelection mayaTravelViewDataSelectionQ1 = Q1();
        if (mayaTravelViewDataSelectionQ1 != null) {
            mayaTravelViewDataSelectionQ1.f14229a = operator;
        }
        d dVar = this.t0;
        if (dVar != null) {
            AbstractC1236z.i((MayaTravelActivity) dVar, R.id.frame_layout_container, new MayaTravelRouteSelectionFragment(), R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().i();
        this.t0 = (d) getActivity();
        a aVar = W4.a.e().A().f4754a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        W0 w0U = aVar.U();
        Uh.d sessionPublishSubject = (Uh.d) aVar.f4748y.get();
        kotlin.jvm.internal.j.g(preference, "preference");
        kotlin.jvm.internal.j.g(sessionPublishSubject, "sessionPublishSubject");
        this.f14206s0 = new j(preference, w0U, sessionPublishSubject, 15);
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
        this.f14202o0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        c1219h.i();
        A1(c1219h);
        d dVar = this.t0;
        if (dVar != null) {
            ((MayaTravelActivity) dVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        Q0 q02 = this.f14202o0;
        kotlin.jvm.internal.j.d(q02);
        this.f14203p0 = q02.f3877d;
        Q0 q03 = this.f14202o0;
        kotlin.jvm.internal.j.d(q03);
        this.f14204q0 = q03.c;
        this.f14205r0 = new C1599c(this);
        RecyclerView recyclerView = this.f14203p0;
        if (recyclerView == null) {
            kotlin.jvm.internal.j.n("mSelectionRecyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = this.f14203p0;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.j.n("mSelectionRecyclerView");
            throw null;
        }
        recyclerView2.setAdapter(this.f14205r0);
        P1().j();
        ConstraintLayout constraintLayout = this.f14204q0;
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new kc.c(this, 0));
        } else {
            kotlin.jvm.internal.j.n("mConstraintLayoutViewSavedQRTickets");
            throw null;
        }
    }
}
