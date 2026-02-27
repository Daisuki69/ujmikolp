package com.paymaya.mayaui.pushapproval.view.fragment.impl;

import Ag.k;
import Da.f;
import N5.E;
import O5.a;
import Th.e;
import Xh.i;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.Navigation;
import androidx.viewbinding.ViewBindings;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.messaging.p;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.data.api.PushApprovalApi;
import com.paymaya.domain.model.PushApprovalPendingRequest;
import com.paymaya.domain.model.PushApprovalRequest;
import com.paymaya.mayaui.pushapproval.view.activity.impl.MayaPushApprovalActivity;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalViewRequestFragment;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import o6.C1967a;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import qc.c;
import ya.C2516a;
import zh.b;
import zj.C2578C;

/* JADX INFO: loaded from: classes4.dex */
public class MayaPushApprovalViewRequestFragment extends MayaBaseFragment implements f {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C2516a f13565U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public E f13566V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final InterfaceC1033d f13567W = C1034e.b(new k(this, 16));

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public CountDownTimer f13568X;

    public static final void G1(MayaPushApprovalViewRequestFragment mayaPushApprovalViewRequestFragment, boolean z4) {
        C2516a c2516aH1 = mayaPushApprovalViewRequestFragment.H1();
        if (z4) {
            E e = ((MayaPushApprovalViewRequestFragment) ((f) c2516aH1.c.get())).f13566V;
            j.d(e);
            ConstraintLayout constraintLayout = (ConstraintLayout) e.f3587d;
            j.f(constraintLayout, "getRoot(...)");
            Navigation.findNavController(constraintLayout).popBackStack(R.id.maya_push_approval_list_fragment, false);
        }
    }

    public static final void J1(MayaPushApprovalViewRequestFragment mayaPushApprovalViewRequestFragment) {
        mayaPushApprovalViewRequestFragment.C1("");
        C1219h c1219h = new C1219h();
        c1219h.n(17);
        c1219h.t(EnumC1217f.DENY);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("challengeId", mayaPushApprovalViewRequestFragment.I1().getId());
        c1219h.i();
        mayaPushApprovalViewRequestFragment.A1(c1219h);
        C2516a c2516aH1 = mayaPushApprovalViewRequestFragment.H1();
        String id = mayaPushApprovalViewRequestFragment.I1().getId();
        j.g(id, "id");
        p pVar = c2516aH1.f;
        pVar.getClass();
        c2516aH1.e(new Hh.f(((PushApprovalApi) pVar.f9799b).denyRequest(id, new PushApprovalRequest("PUSH")).f(e.c), b.a(), 0).a(new ya.b(c2516aH1, 1)).b(new c(c2516aH1, 16)).c());
    }

    public static final void K1(MayaPushApprovalViewRequestFragment mayaPushApprovalViewRequestFragment) {
        mayaPushApprovalViewRequestFragment.C1("");
        C1219h c1219h = new C1219h();
        c1219h.r(EnumC1216e.REQUEST);
        c1219h.n(17);
        c1219h.t(EnumC1217f.APPROVE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("challengeId", mayaPushApprovalViewRequestFragment.I1().getId());
        c1219h.i();
        mayaPushApprovalViewRequestFragment.A1(c1219h);
        C2516a c2516aH1 = mayaPushApprovalViewRequestFragment.H1();
        String id = mayaPushApprovalViewRequestFragment.I1().getId();
        j.g(id, "id");
        p pVar = c2516aH1.f;
        pVar.getClass();
        c2516aH1.e(new Hh.f(((PushApprovalApi) pVar.f9799b).allowRequest(id, new PushApprovalRequest("PUSH")).f(e.c), b.a(), 0).a(new ya.b(c2516aH1, 0)).b(new C1967a(c2516aH1, 24)).c());
    }

    public final C2516a H1() {
        C2516a c2516a = this.f13565U;
        if (c2516a != null) {
            return c2516a;
        }
        j.n("mViewRequestFragmentPresenter");
        throw null;
    }

    public final PushApprovalPendingRequest I1() {
        return (PushApprovalPendingRequest) this.f13567W.getValue();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.REQUEST;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a aVar = W4.a.e().u().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        p pVarL = aVar.L();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        this.f13565U = new C2516a(pVarL, preference, 1);
        H1().h(this);
        this.f10338R = true;
        m1().i();
        m1().o(u1());
        m1().r(EnumC1216e.REQUEST);
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("challengeId", I1().getId());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_push_approval_view_request, viewGroup, false);
        int i = R.id.button_authorize;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_authorize);
        if (button != null) {
            i = R.id.button_deny;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_deny);
            if (button2 != null) {
                i = R.id.constraint_layout;
                if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout)) != null) {
                    i = R.id.constraint_layout_request_number;
                    if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_request_number)) != null) {
                        i = R.id.image_view_divider_1;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_divider_1);
                        if (imageView != null) {
                            i = R.id.image_view_divider_2;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_divider_2);
                            if (imageView2 != null) {
                                i = R.id.text_view_countdown;
                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_countdown);
                                if (textView != null) {
                                    i = R.id.text_view_device;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_device);
                                    if (textView2 != null) {
                                        i = R.id.text_view_header;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                                            i = R.id.text_view_header_subtext;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header_subtext)) != null) {
                                                i = R.id.text_view_label_device;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_label_device);
                                                if (textView3 != null) {
                                                    i = R.id.text_view_label_location;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_label_location);
                                                    if (textView4 != null) {
                                                        i = R.id.text_view_label_time;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_label_time)) != null) {
                                                            i = R.id.text_view_location;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_location);
                                                            if (textView5 != null) {
                                                                i = R.id.text_view_request_number;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_request_number);
                                                                if (textView6 != null) {
                                                                    i = R.id.text_view_request_number_label;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_request_number_label)) != null) {
                                                                        i = R.id.text_view_seconds_label;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_seconds_label)) != null) {
                                                                            i = R.id.text_view_time;
                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_time);
                                                                            if (textView7 != null) {
                                                                                i = R.id.text_view_timer;
                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_timer)) != null) {
                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                    this.f13566V = new E(constraintLayout, button, button2, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                                                    j.f(constraintLayout, "getRoot(...)");
                                                                                    return constraintLayout;
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
        H1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        CountDownTimer countDownTimer = this.f13568X;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f13566V = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.pushapproval.view.activity.IMayaPushApprovalActivityView");
        ((MayaPushApprovalActivity) ((Aa.a) componentRequireActivity)).J1(R.string.maya_push_approval_authorize_request_toolbar_title);
        i.D(this, z.a(MayaPushApprovalErrorDialogFragment.class), new Ag.f(1, this, MayaPushApprovalViewRequestFragment.class, "handleFormConfirmationResult", "handleFormConfirmationResult(Z)V", 0, 8));
        i.D(this, z.a(MayaPushApprovalRequestExpiredBottomSheetDialogFragment.class), new Ag.f(1, this, MayaPushApprovalViewRequestFragment.class, "handleFormConfirmationResult", "handleFormConfirmationResult(Z)V", 0, 9));
        i.D(this, z.a(MayaPushApprovalRequestAuthorizedBottomSheetDialogFragment.class), new Ag.f(1, this, MayaPushApprovalViewRequestFragment.class, "handleFormConfirmationResult", "handleFormConfirmationResult(Z)V", 0, 10));
        E e = this.f13566V;
        j.d(e);
        final int i = 0;
        ((Button) e.c).setOnClickListener(new View.OnClickListener(this) { // from class: Fa.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPushApprovalViewRequestFragment f1569b;

            {
                this.f1569b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaPushApprovalViewRequestFragment mayaPushApprovalViewRequestFragment = this.f1569b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaPushApprovalViewRequestFragment.J1(mayaPushApprovalViewRequestFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaPushApprovalViewRequestFragment mayaPushApprovalViewRequestFragment2 = this.f1569b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaPushApprovalViewRequestFragment.K1(mayaPushApprovalViewRequestFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        E e7 = this.f13566V;
        j.d(e7);
        final int i4 = 1;
        ((Button) e7.f3586b).setOnClickListener(new View.OnClickListener(this) { // from class: Fa.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPushApprovalViewRequestFragment f1569b;

            {
                this.f1569b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaPushApprovalViewRequestFragment mayaPushApprovalViewRequestFragment = this.f1569b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaPushApprovalViewRequestFragment.J1(mayaPushApprovalViewRequestFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaPushApprovalViewRequestFragment mayaPushApprovalViewRequestFragment2 = this.f1569b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaPushApprovalViewRequestFragment.K1(mayaPushApprovalViewRequestFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        C2516a c2516aH1 = H1();
        c2516aH1.j();
        PushApprovalPendingRequest request = I1();
        j.g(request, "request");
        String requestNumber = request.getRrn();
        j.g(requestNumber, "requestNumber");
        f fVar = (f) c2516aH1.c.get();
        String strF0 = C2578C.f0(12, requestNumber);
        MayaPushApprovalViewRequestFragment mayaPushApprovalViewRequestFragment = (MayaPushApprovalViewRequestFragment) fVar;
        mayaPushApprovalViewRequestFragment.getClass();
        E e10 = mayaPushApprovalViewRequestFragment.f13566V;
        j.d(e10);
        ((TextView) e10.f3589k).setText(strF0);
        String location = request.getLocation();
        if (location == null || location.length() == 0) {
            MayaPushApprovalViewRequestFragment mayaPushApprovalViewRequestFragment2 = (MayaPushApprovalViewRequestFragment) ((f) c2516aH1.c.get());
            E e11 = mayaPushApprovalViewRequestFragment2.f13566V;
            j.d(e11);
            ((TextView) e11.j).setVisibility(8);
            E e12 = mayaPushApprovalViewRequestFragment2.f13566V;
            j.d(e12);
            ((TextView) e12.i).setVisibility(8);
            E e13 = mayaPushApprovalViewRequestFragment2.f13566V;
            j.d(e13);
            ((ImageView) e13.f3590l).setVisibility(8);
        } else {
            MayaPushApprovalViewRequestFragment mayaPushApprovalViewRequestFragment3 = (MayaPushApprovalViewRequestFragment) ((f) c2516aH1.c.get());
            mayaPushApprovalViewRequestFragment3.getClass();
            E e14 = mayaPushApprovalViewRequestFragment3.f13566V;
            j.d(e14);
            ((TextView) e14.j).setText(location);
        }
        String deviceId = request.getDeviceId();
        if (deviceId == null || deviceId.length() == 0) {
            MayaPushApprovalViewRequestFragment mayaPushApprovalViewRequestFragment4 = (MayaPushApprovalViewRequestFragment) ((f) c2516aH1.c.get());
            E e15 = mayaPushApprovalViewRequestFragment4.f13566V;
            j.d(e15);
            ((TextView) e15.f3588g).setVisibility(8);
            E e16 = mayaPushApprovalViewRequestFragment4.f13566V;
            j.d(e16);
            ((TextView) e16.h).setVisibility(8);
            E e17 = mayaPushApprovalViewRequestFragment4.f13566V;
            j.d(e17);
            ((ImageView) e17.e).setVisibility(8);
        } else {
            MayaPushApprovalViewRequestFragment mayaPushApprovalViewRequestFragment5 = (MayaPushApprovalViewRequestFragment) ((f) c2516aH1.c.get());
            mayaPushApprovalViewRequestFragment5.getClass();
            E e18 = mayaPushApprovalViewRequestFragment5.f13566V;
            j.d(e18);
            ((TextView) e18.f3588g).setText(deviceId);
        }
        String time = request.getCreatedAt();
        j.g(time, "time");
        f fVar2 = (f) c2516aH1.c.get();
        String strR = qk.i.r(time, DateTimeZone.getDefault());
        if (strR == null) {
            strR = "";
        }
        MayaPushApprovalViewRequestFragment mayaPushApprovalViewRequestFragment6 = (MayaPushApprovalViewRequestFragment) fVar2;
        mayaPushApprovalViewRequestFragment6.getClass();
        E e19 = mayaPushApprovalViewRequestFragment6.f13566V;
        j.d(e19);
        ((TextView) e19.m).setText(strR);
        String endDate = request.getExpiresAt();
        j.g(endDate, "endDate");
        f fVar3 = (f) c2516aH1.c.get();
        long millis = DateTime.parse(endDate).getMillis() - DateTime.now().getMillis();
        if (millis <= 0) {
            millis = 0;
        }
        MayaPushApprovalViewRequestFragment mayaPushApprovalViewRequestFragment7 = (MayaPushApprovalViewRequestFragment) fVar3;
        mayaPushApprovalViewRequestFragment7.getClass();
        mayaPushApprovalViewRequestFragment7.f13568X = new B5.k(millis, mayaPushApprovalViewRequestFragment7).start();
    }

    @Override // Ea.a
    public final void q() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.pushapproval.view.activity.IMayaPushApprovalActivityView");
        ((MayaPushApprovalActivity) ((Aa.a) componentRequireActivity)).n1().a();
    }
}
