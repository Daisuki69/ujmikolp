package com.paymaya.mayaui.rekyc.view.fragment.impl;

import Ah.p;
import D8.E;
import Hh.a;
import Hh.f;
import Lh.d;
import Lh.h;
import N5.C0447e;
import N5.G0;
import Th.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.data.api.KycSubmissionApi;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.L;
import com.paymaya.domain.store.S0;
import com.paymaya.domain.store.T;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;
import com.paymaya.mayaui.rekyc.view.activity.impl.ReKycSubmittedActivity;
import de.m;
import fa.ViewOnClickListenerC1479a;
import gb.C1515a;
import hb.InterfaceC1559b;
import java.util.HashMap;
import java.util.UUID;
import kb.c;
import kotlin.jvm.internal.j;
import lb.InterfaceC1823d;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class ReKycSubmittedFragment extends MayaBaseFragment implements c {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0447e f13713U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public E f13714V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public InterfaceC1823d f13715W;

    public static final void H1(ReKycSubmittedFragment reKycSubmittedFragment) {
        E e = reKycSubmittedFragment.f13714V;
        if (e == null) {
            j.n("mReKycSubmittedFragmentPresenter");
            throw null;
        }
        ReKycSubmittedFragment reKycSubmittedFragment2 = (ReKycSubmittedFragment) ((c) e.c.get());
        reKycSubmittedFragment2.getClass();
        C1219h c1219h = new C1219h();
        c1219h.r(EnumC1216e.REKYC_SUBMITTED);
        c1219h.n(17);
        c1219h.t(EnumC1217f.LOGOUT);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("rekyc_status", reKycSubmittedFragment2.t1().x());
        c1219h.j.put("rekyc_reason", reKycSubmittedFragment2.t1().w());
        c1219h.i();
        reKycSubmittedFragment2.z1(c1219h);
        ReKycSubmittedFragment reKycSubmittedFragment3 = (ReKycSubmittedFragment) ((c) e.c.get());
        C0447e c0447e = reKycSubmittedFragment3.f13713U;
        j.d(c0447e);
        ConstraintLayout constraintLayout = ((G0) c0447e.e).f3627b;
        j.f(constraintLayout, "getRoot(...)");
        constraintLayout.setVisibility(0);
        C0447e c0447e2 = reKycSubmittedFragment3.f13713U;
        j.d(c0447e2);
        ((ConstraintLayout) c0447e2.f4080d).setVisibility(8);
        e.e(new a(new f(((S0) e.i).b(), b.a(), 0), new m(e, 6), 1).c());
    }

    public final void G1() {
        C1219h c1219h = new C1219h();
        HashMap map = c1219h.j;
        c1219h.r(EnumC1216e.REKYC_SUBMITTED);
        c1219h.n(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        map.put("rekyc_status", t1().x());
        map.put("rekyc_reason", t1().w());
        c1219h.i();
        z1(c1219h);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.REKYC_SUBMITTED;
    }

    @Override // L8.d
    public final void j1() {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.rekyc.view.fragment.impl.ReKycSubmittedFragment.ReKycSubmittedFragmentListener");
        this.f13715W = (InterfaceC1823d) activity;
        O5.a aVar = W4.a.e().F().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        E e = new E(aVar.x(), aVar.z(), aVar.S(), (com.paymaya.data.preference.a) aVar.e.get());
        this.f13714V = e;
        e.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_re_kyc_submitted, viewGroup, false);
        int i = R.id.button_logout;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_logout);
        if (button != null) {
            i = R.id.constraint_layout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout);
            if (constraintLayout != null) {
                i = R.id.constraint_layout_information_box;
                if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_information_box)) != null) {
                    i = R.id.image_view_rockon;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_rockon)) != null) {
                        i = R.id.image_view_warning_icon;
                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_warning_icon)) != null) {
                            i = R.id.loader;
                            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.loader);
                            if (viewFindChildViewById != null) {
                                G0 g0A = G0.a(viewFindChildViewById);
                                i = R.id.text_view_account_status_description;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_account_status_description)) != null) {
                                    i = R.id.text_view_account_status_description_under_review;
                                    if (((MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_account_status_description_under_review)) != null) {
                                        i = R.id.text_view_account_status_header;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_account_status_header)) != null) {
                                            i = R.id.text_view_account_status_reference_number;
                                            MultiColorTextView multiColorTextView = (MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_account_status_reference_number);
                                            if (multiColorTextView != null) {
                                                i = R.id.text_view_header;
                                                if (((MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                                                    i = R.id.text_view_header_subtext;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header_subtext)) != null) {
                                                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                        this.f13713U = new C0447e(frameLayout, button, constraintLayout, g0A, multiColorTextView, 19);
                                                        return frameLayout;
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
        E e = this.f13714V;
        if (e == null) {
            j.n("mReKycSubmittedFragmentPresenter");
            throw null;
        }
        e.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f13713U = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 8;
        super.onResume();
        E e = this.f13714V;
        if (e == null) {
            j.n("mReKycSubmittedFragmentPresenter");
            throw null;
        }
        e.j();
        ReKycSubmittedFragment reKycSubmittedFragment = (ReKycSubmittedFragment) ((c) e.c.get());
        C0447e c0447e = reKycSubmittedFragment.f13713U;
        j.d(c0447e);
        ConstraintLayout constraintLayout = ((G0) c0447e.e).f3627b;
        j.f(constraintLayout, "getRoot(...)");
        constraintLayout.setVisibility(0);
        C0447e c0447e2 = reKycSubmittedFragment.f13713U;
        j.d(c0447e2);
        ((ConstraintLayout) c0447e2.f4080d).setVisibility(8);
        if (e.h.n().length() == 0) {
            e.h.b0(UUID.randomUUID().toString());
        }
        KeyEventDispatcher.Component componentRequireActivity = ((ReKycSubmittedFragment) ((c) e.c.get())).requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.rekyc.view.activity.IReKycSubmittedActivityView");
        if (((KycCmsContent) ((ReKycSubmittedActivity) ((InterfaceC1559b) componentRequireActivity)).V1().e) != null) {
            e.e(new d(new d(new h(((KycSubmissionApi) e.f1010g.f11367b).getSubmissionResponse().h(e.c), b.a(), 0), new A0(e, 6), 2), new C1258f0(e, 7), 0).e());
        } else {
            e.e(new d(new d(new h(p.l(((KycSubmissionApi) e.f1010g.f11367b).getSubmissionResponse().h(e.c), e.f.u(), C1515a.f16798a), b.a(), 0), new T(e, i), 2), new L(e, 9), 0).e());
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0447e c0447e = this.f13713U;
        j.d(c0447e);
        ((Button) c0447e.c).setOnClickListener(new ViewOnClickListenerC1479a(this, 15));
    }

    @Override // L8.d
    public final void q() {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.EKYC_V6;
    }
}
