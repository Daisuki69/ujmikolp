package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import D.N;
import D8.K;
import E8.C0221d;
import G7.t;
import H8.b;
import K8.D;
import M8.L;
import M8.M1;
import M8.Q1;
import M8.R1;
import N5.C0471o0;
import O5.a;
import S5.c;
import Th.e;
import Xh.i;
import a.AbstractC0617a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.ImageCapture;
import androidx.camera.view.PreviewView;
import androidx.core.view.KeyEventDispatcher;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycSimpleCaptureV2Fragment extends MayaKycBaseFragment<C0471o0> implements D {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public K f12590W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ImageCapture f12591X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ActivityResultLauncher f12592Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ExecutorService f12593Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public C0221d f12594a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final N f12595b0;

    public MayaKycSimpleCaptureV2Fragment() {
        super(R1.f3219a);
        this.f12595b0 = new N(this, 22);
    }

    public final String K1() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("idPage", "FRONT")) == null) ? "FRONT" : string;
    }

    public final View L1() {
        View viewCameraFrame = (View) ((C0471o0) G1()).f4169b.m;
        j.f(viewCameraFrame, "viewCameraFrame");
        return viewCameraFrame;
    }

    public final PreviewView M1() {
        PreviewView previewView = (PreviewView) ((C0471o0) G1()).f4169b.f3586b;
        j.f(previewView, "previewView");
        return previewView;
    }

    public final K N1() {
        K k8 = this.f12590W;
        if (k8 != null) {
            return k8;
        }
        j.n("mSimpleCaptureV2FragmentPresenter");
        throw null;
    }

    public final MayaEKYCSelectedDocument O1() {
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
        this.f12592Y = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new t(this, 28));
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
        this.f12590W = new K(tVar, preference);
        N1().h(this);
        this.f12593Z = Executors.newSingleThreadExecutor();
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        this.f12594a0 = new C0221d(contextRequireContext, this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        N1().i();
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
        this.f12595b0.remove();
        ExecutorService executorService = this.f12593Z;
        if (executorService == null) {
            j.n("cameraExecutor");
            throw null;
        }
        executorService.shutdown();
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        N1().j();
        K kN1 = N1();
        if (((MayaKycSimpleCaptureV2Fragment) ((D) kN1.c.get())).K1().equals("BACK")) {
            MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment = (MayaKycSimpleCaptureV2Fragment) ((D) kN1.c.get());
            MayaEKYCSelectedDocument mayaEKYCSelectedDocumentO1 = mayaKycSimpleCaptureV2Fragment.O1();
            if (mayaEKYCSelectedDocumentO1 != null) {
                C1219h c1219h = new C1219h();
                c1219h.r(EnumC1216e.SIMPLE_CAPTURE_BACK);
                c1219h.n(2);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219h.j.put("ID_type", mayaEKYCSelectedDocumentO1.getKey());
                KeyEventDispatcher.Component componentRequireActivity = mayaKycSimpleCaptureV2Fragment.requireActivity();
                j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                c1219h.j.put("ID_order", String.valueOf(((MayaKycActivity) ((b) componentRequireActivity)).a2().size()));
                c1219h.i();
                mayaKycSimpleCaptureV2Fragment.z1(c1219h);
                return;
            }
            return;
        }
        boolean zIsPartnerOnboardingEnabled = kN1.f1018d.e().isPartnerOnboardingEnabled();
        EnumC1216e enumC1216e = EnumC1216e.SIMPLE_CAPTURE_FRONT;
        if (zIsPartnerOnboardingEnabled) {
            String strP = kN1.f1018d.p();
            j.f(strP, "getMayaOnboardingPartner(...)");
            if (strP.length() > 0) {
                MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment2 = (MayaKycSimpleCaptureV2Fragment) ((D) kN1.c.get());
                mayaKycSimpleCaptureV2Fragment2.getClass();
                C1219h c1219h2 = new C1219h();
                c1219h2.r(enumC1216e);
                c1219h2.n(2);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                KeyEventDispatcher.Component componentRequireActivity2 = mayaKycSimpleCaptureV2Fragment2.requireActivity();
                j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                c1219h2.j.put("ID_order", String.valueOf(((MayaKycActivity) ((b) componentRequireActivity2)).a2().size()));
                c1219h2.j.put("partner", mayaKycSimpleCaptureV2Fragment2.t1().p());
                c1219h2.j.put("branch", mayaKycSimpleCaptureV2Fragment2.t1().q());
                c1219h2.j.put("kyc_level", mayaKycSimpleCaptureV2Fragment2.t1().k().toString());
                c1219h2.i();
                mayaKycSimpleCaptureV2Fragment2.z1(c1219h2);
                return;
            }
        }
        MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment3 = (MayaKycSimpleCaptureV2Fragment) ((D) kN1.c.get());
        mayaKycSimpleCaptureV2Fragment3.getClass();
        C1219h c1219h3 = new C1219h();
        c1219h3.r(enumC1216e);
        c1219h3.n(2);
        EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
        KeyEventDispatcher.Component componentRequireActivity3 = mayaKycSimpleCaptureV2Fragment3.requireActivity();
        j.e(componentRequireActivity3, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        c1219h3.j.put("ID_order", String.valueOf(((MayaKycActivity) ((b) componentRequireActivity3)).a2().size()));
        c1219h3.i();
        mayaKycSimpleCaptureV2Fragment3.z1(c1219h3);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        requireActivity().getOnBackPressedDispatcher().addCallback(this.f12595b0);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        MayaKycActivity mayaKycActivity = (MayaKycActivity) ((b) componentRequireActivity);
        mayaKycActivity.b2();
        mayaKycActivity.q2();
        MayaBaseFragment.l1((Toolbar) ((C0471o0) G1()).f4169b.f3589k);
        i.D(this, z.a(MayaKycChangeYourMindBottomSheetDialogFragment.class), new M1(1, N1(), K.class, "handleChangeYourMindBottomSheetResult", "handleChangeYourMindBottomSheetResult(Z)V", 0, 1));
        ((Toolbar) ((C0471o0) G1()).f4169b.f3589k).setNavigationOnClickListener(new L(this, 8));
        ((TextView) ((C0471o0) G1()).f4169b.f).setText(getString(R.string.maya_kyc_toolbar_progress_step, 2));
        N1().j();
        C.r0((TextView) ((C0471o0) G1()).f4169b.f3588g, new Q1(this, 0));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.EKYC_V6;
    }
}
