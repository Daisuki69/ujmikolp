package com.paymaya.mayaui.common.view.fragment.impl;

import Bb.f;
import N5.C0450f;
import Q6.n;
import W4.a;
import X6.c;
import Y6.d;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.data.database.repository.k;
import com.paymaya.domain.model.ContactModel;
import com.paymaya.mayaui.common.view.widget.MayaSectionIndexFastScroller;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaContactsSelectionFragment extends MayaBaseLoadingFragment implements c {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public String f11908o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public f f11909p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public C0450f f11910q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public RecyclerView f11911r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public MayaSectionIndexFastScroller f11912s0;
    public LinearLayoutManager t0;
    public U6.c u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public d f11913v0;
    public boolean w0;

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_contacts_selection, viewGroup, false);
        int i = R.id.recycler_view_contacts;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_contacts);
        if (recyclerView != null) {
            i = R.id.section_index_fast_scroller;
            MayaSectionIndexFastScroller mayaSectionIndexFastScroller = (MayaSectionIndexFastScroller) ViewBindings.findChildViewById(viewInflate, R.id.section_index_fast_scroller);
            if (mayaSectionIndexFastScroller != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f11910q0 = new C0450f((ViewGroup) constraintLayout, (Object) recyclerView, (Object) mayaSectionIndexFastScroller, 8);
                j.f(constraintLayout, "getRoot(...)");
                return constraintLayout;
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

    public f P1() {
        f fVar = this.f11909p0;
        if (fVar != null) {
            return fVar;
        }
        j.n("mMayaContactSelectionFragmentPresenter");
        throw null;
    }

    public final void Q1(ContactModel contact) {
        j.g(contact, "contact");
        if (t1().e().isShopEventsV2Enabled()) {
            o1().b(C1219h.e(AbstractC1213b.q(6)));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_selected_contact_model", contact);
        getParentFragmentManager().setFragmentResult("key_contact_request", bundle);
        getParentFragmentManager().popBackStack();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() instanceof d) {
            KeyEventDispatcher.Component activity = getActivity();
            j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment.MayaContactSelectionFragmentListener");
            this.f11913v0 = (d) activity;
        }
        Lh.c cVarA = a.e().a();
        O5.a aVar = (O5.a) cVarA.c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        O5.a aVar2 = (O5.a) cVarA.c;
        this.f11909p0 = new f((k) aVar2.f4732o0.get(), (Uh.d) aVar2.f4748y.get());
        P1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        P1().i();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f11910q0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (j.b(this.f11908o0, "Product Details")) {
            String strW = AbstractC1213b.w(5);
            j.f(strW, "viewed(...)");
            Map mapH = M.h(new Pair(EnumC1212a.SOURCE_PAGE, this.f11908o0), new Pair(EnumC1212a.PERMISSION_GRANTED, String.valueOf(AbstractC1955a.u(getContext(), "android.permission.READ_CONTACTS"))));
            if (t1().e().isShopEventsV2Enabled()) {
                C1219h c1219hE = C1219h.e(strW);
                for (Map.Entry entry : mapH.entrySet()) {
                    c1219hE.k((EnumC1212a) entry.getKey(), (String) entry.getValue());
                }
                o1().b(c1219hE);
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        d dVar = this.f11913v0;
        if (dVar != null) {
            dVar.Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        P1().n();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0450f c0450f = this.f11910q0;
        j.d(c0450f);
        this.f11911r0 = (RecyclerView) c0450f.f4087b;
        C0450f c0450f2 = this.f11910q0;
        j.d(c0450f2);
        this.f11912s0 = (MayaSectionIndexFastScroller) c0450f2.f4088d;
        this.t0 = new LinearLayoutManager(getActivity(), 1, false);
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        this.u0 = new U6.c(contextRequireContext, this);
        RecyclerView recyclerView = this.f11911r0;
        if (recyclerView == null) {
            j.n("mRecyclerViewContacts");
            throw null;
        }
        LinearLayoutManager linearLayoutManager = this.t0;
        if (linearLayoutManager == null) {
            j.n("mLinearLayoutManager");
            throw null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        U6.c cVar = this.u0;
        if (cVar == null) {
            j.n("mMayaContactsSelectionItemAdapter");
            throw null;
        }
        recyclerView.setAdapter(cVar);
        MayaSectionIndexFastScroller mayaSectionIndexFastScroller = this.f11912s0;
        if (mayaSectionIndexFastScroller == null) {
            j.n("mSectionIndexFastScroller");
            throw null;
        }
        mayaSectionIndexFastScroller.setSectionIndexFastScrollListener(new n(this, 15));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f11908o0 = arguments.getString("key_analytics_source_page");
        }
        P1().j();
    }
}
