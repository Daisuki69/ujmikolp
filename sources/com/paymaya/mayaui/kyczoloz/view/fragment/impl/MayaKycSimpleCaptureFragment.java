package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import D.N;
import D8.J;
import G7.t;
import H8.b;
import K8.C;
import M8.C0419w;
import M8.K1;
import M8.L;
import M8.L1;
import N5.C0469n0;
import O5.a;
import S5.c;
import Th.e;
import Xh.i;
import a.AbstractC0617a;
import android.content.Context;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.KeyEventDispatcher;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycSimpleCaptureFragment extends MayaKycBaseFragment<C0469n0> implements C {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public J f12586W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ActivityResultLauncher f12587X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final InterfaceC1033d f12588Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final N f12589Z;

    public MayaKycSimpleCaptureFragment() {
        super(L1.f3193a);
        this.f12588Y = C1034e.b(new K1(this, 2));
        this.f12589Z = new N(this, 21);
    }

    public final String K1() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("idPage", "FRONT")) == null) ? "FRONT" : string;
    }

    public final J L1() {
        J j = this.f12586W;
        if (j != null) {
            return j;
        }
        j.n("mSimpleCaptureFragmentPresenter");
        throw null;
    }

    public final SurfaceView M1() {
        SurfaceView surfaceViewPreview = (SurfaceView) ((C0469n0) G1()).f4163b.j;
        j.f(surfaceViewPreview, "surfaceViewPreview");
        return surfaceViewPreview;
    }

    public final MayaEKYCSelectedDocument N1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (MayaEKYCSelectedDocument) AbstractC0617a.D(arguments, "selectedDocument", MayaEKYCSelectedDocument.class);
        }
        return null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.SIMPLE_CAPTURE_FRONT;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        super.onAttach(context);
        this.f12587X = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new t(this, 27));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        a aVar = (a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        Nh.t tVar = e.f5840a;
        j.f(tVar, "single(...)");
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        this.f12586W = new J(tVar, preference);
        L1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        L1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBindingFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        MayaKycActivity mayaKycActivity = (MayaKycActivity) ((b) componentRequireActivity);
        mayaKycActivity.m2();
        mayaKycActivity.l2();
        mayaKycActivity.k2();
        this.f12589Z.remove();
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        L1().j();
        J jL1 = L1();
        if (((MayaKycSimpleCaptureFragment) ((C) jL1.c.get())).K1().equals("BACK")) {
            MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment = (MayaKycSimpleCaptureFragment) ((C) jL1.c.get());
            MayaEKYCSelectedDocument mayaEKYCSelectedDocumentN1 = mayaKycSimpleCaptureFragment.N1();
            if (mayaEKYCSelectedDocumentN1 != null) {
                C1219h c1219h = new C1219h();
                c1219h.r(EnumC1216e.SIMPLE_CAPTURE_BACK);
                c1219h.n(2);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219h.j.put("ID_type", mayaEKYCSelectedDocumentN1.getKey());
                KeyEventDispatcher.Component componentRequireActivity = mayaKycSimpleCaptureFragment.requireActivity();
                j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                c1219h.j.put("ID_order", String.valueOf(((MayaKycActivity) ((b) componentRequireActivity)).a2().size()));
                c1219h.i();
                mayaKycSimpleCaptureFragment.z1(c1219h);
                return;
            }
            return;
        }
        boolean zIsPartnerOnboardingEnabled = jL1.e.e().isPartnerOnboardingEnabled();
        EnumC1216e enumC1216e = EnumC1216e.SIMPLE_CAPTURE_FRONT;
        if (zIsPartnerOnboardingEnabled) {
            String strP = jL1.e.p();
            j.f(strP, "getMayaOnboardingPartner(...)");
            if (strP.length() > 0) {
                MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment2 = (MayaKycSimpleCaptureFragment) ((C) jL1.c.get());
                mayaKycSimpleCaptureFragment2.getClass();
                C1219h c1219h2 = new C1219h();
                c1219h2.r(enumC1216e);
                c1219h2.n(2);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                KeyEventDispatcher.Component componentRequireActivity2 = mayaKycSimpleCaptureFragment2.requireActivity();
                j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                c1219h2.j.put("ID_order", String.valueOf(((MayaKycActivity) ((b) componentRequireActivity2)).a2().size()));
                c1219h2.j.put("partner", mayaKycSimpleCaptureFragment2.t1().p());
                c1219h2.j.put("branch", mayaKycSimpleCaptureFragment2.t1().q());
                c1219h2.j.put("kyc_level", mayaKycSimpleCaptureFragment2.t1().k().toString());
                c1219h2.i();
                mayaKycSimpleCaptureFragment2.z1(c1219h2);
                return;
            }
        }
        MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment3 = (MayaKycSimpleCaptureFragment) ((C) jL1.c.get());
        mayaKycSimpleCaptureFragment3.getClass();
        C1219h c1219h3 = new C1219h();
        c1219h3.r(enumC1216e);
        c1219h3.n(2);
        EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
        KeyEventDispatcher.Component componentRequireActivity3 = mayaKycSimpleCaptureFragment3.requireActivity();
        j.e(componentRequireActivity3, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        c1219h3.j.put("ID_order", String.valueOf(((MayaKycActivity) ((b) componentRequireActivity3)).a2().size()));
        c1219h3.i();
        mayaKycSimpleCaptureFragment3.z1(c1219h3);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        L1().l(new K1(this, 1));
        super.onStop();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        requireActivity().getOnBackPressedDispatcher().addCallback(this.f12589Z);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        MayaKycActivity mayaKycActivity = (MayaKycActivity) ((b) componentRequireActivity);
        mayaKycActivity.b2();
        mayaKycActivity.q2();
        MayaBaseFragment.l1((Toolbar) ((C0469n0) G1()).f4163b.f4133g);
        i.D(this, z.a(MayaKycChangeYourMindBottomSheetDialogFragment.class), new C0419w(1, L1(), J.class, "handleConfirmationResult", "handleConfirmationResult(Z)V", 0, 29));
        ((Toolbar) ((C0469n0) G1()).f4163b.f4133g).setNavigationOnClickListener(new L(this, 7));
        ((TextView) ((C0469n0) G1()).f4163b.c).setText(getString(R.string.maya_kyc_toolbar_progress_step, 2));
        L1().j();
        com.paymaya.common.utility.C.r0((TextView) ((C0469n0) G1()).f4163b.f4132d, new K1(this, 0));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.EKYC_V6;
    }
}
