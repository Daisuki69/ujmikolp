package com.paymaya.mayaui.pushapproval.view.fragment.impl;

import A5.l;
import Ca.a;
import D.N;
import Da.b;
import J7.e;
import N5.C0447e;
import N5.C0450f;
import N5.C0453g;
import N5.C0464l;
import N5.G0;
import S5.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.messaging.p;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.pushapproval.view.activity.impl.MayaPushApprovalActivity;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalListFragment;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;
import ya.C2516a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaPushApprovalListFragment extends MayaBaseFragment implements b {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public LottieAnimationView f13550V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C2516a f13551W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public C0450f f13552X;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final a f13549U = new a(this);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final N f13553Y = new N(this, 1);

    public final Button G1() {
        C0450f c0450f = this.f13552X;
        j.d(c0450f);
        Button buttonBottomRefresh = (Button) ((C0453g) c0450f.f4088d).c;
        j.f(buttonBottomRefresh, "buttonBottomRefresh");
        return buttonBottomRefresh;
    }

    public final RecyclerView H1() {
        C0450f c0450f = this.f13552X;
        j.d(c0450f);
        RecyclerView recyclerViewAuthorizeRequests = (RecyclerView) ((C0447e) ((C0453g) c0450f.f4088d).f4095d).e;
        j.f(recyclerViewAuthorizeRequests, "recyclerViewAuthorizeRequests");
        return recyclerViewAuthorizeRequests;
    }

    public final SpringView I1() {
        C0450f c0450f = this.f13552X;
        j.d(c0450f);
        SpringView springView = (SpringView) ((C0447e) ((C0453g) c0450f.f4088d).f4095d).c;
        j.f(springView, "getRoot(...)");
        return springView;
    }

    public final ConstraintLayout J1() {
        C0450f c0450f = this.f13552X;
        j.d(c0450f);
        ConstraintLayout constraintLayout = ((G0) ((C0453g) c0450f.f4088d).e).f3627b;
        j.f(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    public final C2516a K1() {
        C2516a c2516a = this.f13551W;
        if (c2516a != null) {
            return c2516a;
        }
        j.n("mMayaPushApprovalListFragmentPresenter");
        throw null;
    }

    public final SpringView L1() {
        C0450f c0450f = this.f13552X;
        j.d(c0450f);
        SpringView springViewAuthorizeRequests = (SpringView) ((C0447e) ((C0453g) c0450f.f4088d).f4095d).f;
        j.f(springViewAuthorizeRequests, "springViewAuthorizeRequests");
        return springViewAuthorizeRequests;
    }

    public final void M1() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.REFRESH);
        c1219hH.i();
        A1(c1219hH);
    }

    public final void N1() {
        C0450f c0450f = this.f13552X;
        j.d(c0450f);
        ((ConstraintLayout) ((C0453g) c0450f.f4088d).f4094b).setVisibility(0);
        J1().setVisibility(8);
        C0450f c0450f2 = this.f13552X;
        j.d(c0450f2);
        ((C0464l) c0450f2.f4087b).f4141b.setVisibility(8);
        G1().setEnabled(true);
        I1().setVisibility(0);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.pushapproval.view.activity.IMayaPushApprovalActivityView");
        ((MayaPushApprovalActivity) ((Aa.a) componentRequireActivity)).Z1();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.LIST;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().u().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        p pVarL = aVar.L();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        this.f13551W = new C2516a(pVarL, preference, 0);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.f13553Y);
        K1().h(this);
        this.f10338R = true;
        m1().i();
        m1().o(u1());
        m1().r(EnumC1216e.LIST);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_push_approval_list, viewGroup, false);
        int i = R.id.layout_list_error;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.layout_list_error);
        if (viewFindChildViewById != null) {
            int i4 = R.id.button_try_again;
            Button button = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.button_try_again);
            if (button != null) {
                i4 = R.id.image_view_network_error;
                if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_network_error)) != null) {
                    i4 = R.id.text_view_error_description;
                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_error_description)) != null) {
                        i4 = R.id.text_view_error_title;
                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_error_title)) != null) {
                            C0464l c0464l = new C0464l((LinearLayout) viewFindChildViewById, button, 1);
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.layout_list_loading_and_content);
                            if (viewFindChildViewById2 != null) {
                                int i6 = R.id.button_bottom_refresh;
                                Button button2 = (Button) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.button_bottom_refresh);
                                if (button2 != null) {
                                    i6 = R.id.layout_list_content;
                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(viewFindChildViewById2, R.id.layout_list_content);
                                    if (viewFindChildViewById3 != null) {
                                        int i10 = R.id.frame_layout_content_container;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewFindChildViewById3, R.id.frame_layout_content_container);
                                        if (frameLayout != null) {
                                            i10 = R.id.image_view_empty_list;
                                            if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById3, R.id.image_view_empty_list)) != null) {
                                                i10 = R.id.linear_layout_empty_content_container;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewFindChildViewById3, R.id.linear_layout_empty_content_container);
                                                if (linearLayout != null) {
                                                    i10 = R.id.nested_scroll_view_content;
                                                    if (((NestedScrollView) ViewBindings.findChildViewById(viewFindChildViewById3, R.id.nested_scroll_view_content)) != null) {
                                                        i10 = R.id.recycler_view_authorize_requests;
                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewFindChildViewById3, R.id.recycler_view_authorize_requests);
                                                        if (recyclerView != null) {
                                                            SpringView springView = (SpringView) viewFindChildViewById3;
                                                            i10 = R.id.text_view_empty_list_description;
                                                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById3, R.id.text_view_empty_list_description)) != null) {
                                                                i10 = R.id.text_view_empty_list_title;
                                                                if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById3, R.id.text_view_empty_list_title)) != null) {
                                                                    C0447e c0447e = new C0447e(springView, frameLayout, linearLayout, recyclerView, springView);
                                                                    i6 = R.id.layout_list_loading;
                                                                    View viewFindChildViewById4 = ViewBindings.findChildViewById(viewFindChildViewById2, R.id.layout_list_loading);
                                                                    if (viewFindChildViewById4 != null) {
                                                                        int i11 = R.id.lottie_view_loader;
                                                                        if (((LottieAnimationView) ViewBindings.findChildViewById(viewFindChildViewById4, R.id.lottie_view_loader)) != null) {
                                                                            i11 = R.id.text_view_loader_info;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById4, R.id.text_view_loader_info)) != null) {
                                                                                FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                                                                                this.f13552X = new C0450f(frameLayout2, c0464l, new C0453g(23, (ConstraintLayout) viewFindChildViewById2, button2, c0447e, new G0((ConstraintLayout) viewFindChildViewById4, 8)), 11);
                                                                                j.f(frameLayout2, "getRoot(...)");
                                                                                return frameLayout2;
                                                                            }
                                                                        }
                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById4.getResources().getResourceName(i11)));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById3.getResources().getResourceName(i10)));
                                    }
                                }
                                throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById2.getResources().getResourceName(i6)));
                            }
                            i = R.id.layout_list_loading_and_content;
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        K1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f13552X = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        K1().j();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.pushapproval.view.activity.IMayaPushApprovalActivityView");
        Aa.a aVar = (Aa.a) componentRequireActivity;
        ((MayaPushApprovalActivity) aVar).Y1(new Ad.a(3, this, aVar));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.pushapproval.view.activity.IMayaPushApprovalActivityView");
        ((MayaPushApprovalActivity) ((Aa.a) componentRequireActivity)).Y1(null);
        super.onStop();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        H1().setLayoutManager(new LinearLayoutManager(getActivity()));
        H1().setAdapter(this.f13549U);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.pushapproval.view.activity.IMayaPushApprovalActivityView");
        ((MayaPushApprovalActivity) ((Aa.a) componentRequireActivity)).J1(R.string.maya_push_approval_authorize_requests_toolbar_title);
        L1().setHeader(new e());
        View viewFindViewById = L1().getHeaderView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.f13550V = (LottieAnimationView) viewFindViewById;
        L1().setListener(new l(this, 19));
        C0450f c0450f = this.f13552X;
        j.d(c0450f);
        final int i = 0;
        ((Button) ((C0453g) c0450f.f4088d).c).setOnClickListener(new View.OnClickListener(this) { // from class: Fa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPushApprovalListFragment f1562b;

            {
                this.f1562b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaPushApprovalListFragment mayaPushApprovalListFragment = this.f1562b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaPushApprovalListFragment.M1();
                            mayaPushApprovalListFragment.K1().p();
                            return;
                        } finally {
                        }
                    default:
                        MayaPushApprovalListFragment mayaPushApprovalListFragment2 = this.f1562b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaPushApprovalListFragment2.M1();
                            mayaPushApprovalListFragment2.K1().p();
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i4 = 1;
        ((C0464l) c0450f.f4087b).c.setOnClickListener(new View.OnClickListener(this) { // from class: Fa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPushApprovalListFragment f1562b;

            {
                this.f1562b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaPushApprovalListFragment mayaPushApprovalListFragment = this.f1562b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaPushApprovalListFragment.M1();
                            mayaPushApprovalListFragment.K1().p();
                            return;
                        } finally {
                        }
                    default:
                        MayaPushApprovalListFragment mayaPushApprovalListFragment2 = this.f1562b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaPushApprovalListFragment2.M1();
                            mayaPushApprovalListFragment2.K1().p();
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    @Override // Ea.a
    public final void q() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.pushapproval.view.activity.IMayaPushApprovalActivityView");
        ((MayaPushApprovalActivity) ((Aa.a) componentRequireActivity)).n1().a();
    }
}
