package com.paymaya.mayaui.pushapproval.view.fragment.impl;

import Aa.a;
import Ag.k;
import Da.d;
import N5.C0453g;
import S5.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.Navigation;
import androidx.viewbinding.ViewBindings;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.PushApprovalPendingRequest;
import com.paymaya.mayaui.pushapproval.view.activity.impl.MayaPushApprovalActivity;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalRequestDeniedFragment;
import i8.C1593a;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;
import zj.C2578C;

/* JADX INFO: loaded from: classes4.dex */
public class MayaPushApprovalRequestDeniedFragment extends MayaBaseFragment implements d {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final InterfaceC1033d f13558U = C1034e.b(new k(this, 14));

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C1593a f13559V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C0453g f13560W;

    public static final void H1(MayaPushApprovalRequestDeniedFragment mayaPushApprovalRequestDeniedFragment) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.REPORT);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("challengeId", ((PushApprovalPendingRequest) mayaPushApprovalRequestDeniedFragment.f13558U.getValue()).getId());
        mayaPushApprovalRequestDeniedFragment.A1(c1219hH);
        MayaPushApprovalRequestDeniedFragment mayaPushApprovalRequestDeniedFragment2 = (MayaPushApprovalRequestDeniedFragment) ((d) mayaPushApprovalRequestDeniedFragment.G1().c.get());
        mayaPushApprovalRequestDeniedFragment2.getClass();
        KeyEventDispatcher.Component componentRequireActivity = mayaPushApprovalRequestDeniedFragment2.requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.pushapproval.view.activity.IMayaPushApprovalActivityView");
        MayaPushApprovalActivity mayaPushApprovalActivity = (MayaPushApprovalActivity) ((a) componentRequireActivity);
        mayaPushApprovalActivity.n1().k0(mayaPushApprovalActivity, "https://cares.paymaya.com/s/article/Guide-for-your-Transaction-Concerns");
    }

    public static final void I1(MayaPushApprovalRequestDeniedFragment mayaPushApprovalRequestDeniedFragment) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.DONE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("challengeId", ((PushApprovalPendingRequest) mayaPushApprovalRequestDeniedFragment.f13558U.getValue()).getId());
        mayaPushApprovalRequestDeniedFragment.A1(c1219hH);
        C0453g c0453g = ((MayaPushApprovalRequestDeniedFragment) ((d) mayaPushApprovalRequestDeniedFragment.G1().c.get())).f13560W;
        j.d(c0453g);
        ConstraintLayout constraintLayout = (ConstraintLayout) c0453g.f4094b;
        j.f(constraintLayout, "getRoot(...)");
        Navigation.findNavController(constraintLayout).popBackStack();
    }

    public final C1593a G1() {
        C1593a c1593a = this.f13559V;
        if (c1593a != null) {
            return c1593a;
        }
        j.n("mMayaPushApprovalRequestDeniedFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.REQEUST_DENIED;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().u().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f13559V = new C1593a(16);
        G1().h(this);
        this.f10338R = true;
        m1().i();
        m1().o(u1());
        m1().r(EnumC1216e.REQEUST_DENIED);
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("challengeId", ((PushApprovalPendingRequest) this.f13558U.getValue()).getId());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_pushapproval_request_denied, viewGroup, false);
        int i = R.id.button_close;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_close);
        if (button != null) {
            i = R.id.linear_layout_link_container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_link_container);
            if (linearLayout != null) {
                i = R.id.linear_layout_request_denied_container;
                if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_request_denied_container)) != null) {
                    i = R.id.linear_layout_request_number_container;
                    if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_request_number_container)) != null) {
                        i = R.id.text_view_request_denied_info_content;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_request_denied_info_content)) != null) {
                            i = R.id.text_view_request_denied_info_title;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_request_denied_info_title)) != null) {
                                i = R.id.text_view_request_number;
                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_request_number);
                                if (textView != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    this.f13560W = new C0453g(15, constraintLayout, button, linearLayout, textView);
                                    j.f(constraintLayout, "getRoot(...)");
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

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        G1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f13560W = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.pushapproval.view.activity.IMayaPushApprovalActivityView");
        ((MayaPushApprovalActivity) ((a) componentRequireActivity)).X1();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.pushapproval.view.activity.IMayaPushApprovalActivityView");
        ((MayaPushApprovalActivity) ((a) componentRequireActivity)).Z1();
        super.onStop();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0453g c0453g = this.f13560W;
        j.d(c0453g);
        final int i = 0;
        ((LinearLayout) c0453g.f4095d).setOnClickListener(new View.OnClickListener(this) { // from class: Fa.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPushApprovalRequestDeniedFragment f1567b;

            {
                this.f1567b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaPushApprovalRequestDeniedFragment mayaPushApprovalRequestDeniedFragment = this.f1567b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaPushApprovalRequestDeniedFragment.H1(mayaPushApprovalRequestDeniedFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaPushApprovalRequestDeniedFragment mayaPushApprovalRequestDeniedFragment2 = this.f1567b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaPushApprovalRequestDeniedFragment.I1(mayaPushApprovalRequestDeniedFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        C0453g c0453g2 = this.f13560W;
        j.d(c0453g2);
        final int i4 = 1;
        ((Button) c0453g2.c).setOnClickListener(new View.OnClickListener(this) { // from class: Fa.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPushApprovalRequestDeniedFragment f1567b;

            {
                this.f1567b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaPushApprovalRequestDeniedFragment mayaPushApprovalRequestDeniedFragment = this.f1567b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaPushApprovalRequestDeniedFragment.H1(mayaPushApprovalRequestDeniedFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaPushApprovalRequestDeniedFragment mayaPushApprovalRequestDeniedFragment2 = this.f1567b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaPushApprovalRequestDeniedFragment.I1(mayaPushApprovalRequestDeniedFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.pushapproval.view.activity.IMayaPushApprovalActivityView");
        ((MayaPushApprovalActivity) ((a) componentRequireActivity)).J1(R.string.maya_push_approval_authorize_request_toolbar_title);
        C1593a c1593aG1 = G1();
        PushApprovalPendingRequest request = (PushApprovalPendingRequest) this.f13558U.getValue();
        j.g(request, "request");
        c1593aG1.j();
        d dVar = (d) c1593aG1.c.get();
        String strF0 = C2578C.f0(12, request.getRrn());
        MayaPushApprovalRequestDeniedFragment mayaPushApprovalRequestDeniedFragment = (MayaPushApprovalRequestDeniedFragment) dVar;
        mayaPushApprovalRequestDeniedFragment.getClass();
        C0453g c0453g3 = mayaPushApprovalRequestDeniedFragment.f13560W;
        j.d(c0453g3);
        ((TextView) c0453g3.e).setText(strF0);
    }
}
