package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import A5.l;
import D.N;
import D8.L;
import E8.A;
import E8.C0221d;
import E8.y;
import H8.b;
import K8.E;
import Lh.c;
import M8.C0343c2;
import M8.C0376l;
import M8.M1;
import M8.T2;
import M8.W1;
import M8.X1;
import M8.Y1;
import M8.Z1;
import N5.C0473p0;
import Nh.t;
import Th.e;
import Xh.i;
import a.AbstractC0617a;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavArgsLazy;
import cj.C1129o;
import cj.C1132s;
import cj.M;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.e0;
import com.paymaya.domain.model.KycDocument;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import yk.a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycSimpleCaptureV3Fragment extends MayaKycBaseFragment<C0473p0> implements E {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final List f12596h0 = C1132s.g(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f));

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Set f12597i0 = C1129o.C(new String[]{"SCHOOL_ID", "SENIOR_CITIZEN_CARD", "PH_NATIONAL_ID"});

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public L f12598W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public y f12599X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public l f12600Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final NavArgsLazy f12601Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ImageCapture f12602a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ActivityResultLauncher f12603b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ExecutorService f12604c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public C0221d f12605d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public long f12606e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public long f12607f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final N f12608g0;

    public MayaKycSimpleCaptureV3Fragment() {
        super(Z1.f3259a);
        this.f12601Z = new NavArgsLazy(z.a(C0343c2.class), new C0376l(this, 11));
        this.f12608g0 = new N(this, 23);
    }

    public static void Y1(TextView textView, String str) {
        SpannableString spannableString = new SpannableString(str);
        String str2 = C2576A.z(str, "front", false, 2) ? "front" : "back";
        int iF = C2576A.F(str, str2, 0, false, 6);
        int length = str2.length() + iF;
        if (iF >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(textView.getContext(), R.color.maya_primary_green)), iF, length, 33);
        }
        textView.setText(spannableString);
    }

    public final ImageAnalysis K1() {
        try {
            ImageAnalysis.Builder builder = new ImageAnalysis.Builder();
            if (this.f12605d0 == null) {
                j.n("cameraXUtils");
                throw null;
            }
            int iV1 = v1();
            Display defaultDisplay = requireActivity().getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            ImageAnalysis imageAnalysisBuild = builder.setTargetResolution(new Size(iV1, displayMetrics.heightPixels)).setTargetRotation(W1()).setBackpressureStrategy(0).setImageQueueDepth(1).build();
            ExecutorService executorService = this.f12604c0;
            if (executorService != null) {
                imageAnalysisBuild.setAnalyzer(executorService, new Y1(this));
                return imageAnalysisBuild;
            }
            j.n("cameraExecutor");
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final ImageCapture L1() {
        try {
            ImageCapture.Builder builder = new ImageCapture.Builder();
            C0221d c0221d = this.f12605d0;
            if (c0221d == null) {
                j.n("cameraXUtils");
                throw null;
            }
            ImageCapture imageCaptureBuild = builder.setTargetResolution(C0221d.b(c0221d)).setTargetRotation(W1()).build();
            this.f12602a0 = imageCaptureBuild;
            return imageCaptureBuild;
        } catch (Exception unused) {
            return null;
        }
    }

    public final Preview M1() {
        try {
            Preview.Builder builder = new Preview.Builder();
            C0221d c0221d = this.f12605d0;
            if (c0221d == null) {
                j.n("cameraXUtils");
                throw null;
            }
            Preview previewBuild = builder.setTargetResolution(C0221d.b(c0221d)).setTargetRotation(W1()).build();
            previewBuild.setSurfaceProvider(U1().getSurfaceProvider());
            return previewBuild;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void N1(boolean z4) {
        if (z4) {
            R1().setEnabled(true);
            R1().clearColorFilter();
        } else {
            R1().setEnabled(false);
            R1().setColorFilter(Color.argb(ServerConfiguration.DEFAULT_MAX_BEACON_SIZE_KB_SAAS, ServerConfiguration.DEFAULT_MAX_BEACON_SIZE_KB_SAAS, ServerConfiguration.DEFAULT_MAX_BEACON_SIZE_KB_SAAS, ServerConfiguration.DEFAULT_MAX_BEACON_SIZE_KB_SAAS), PorterDuff.Mode.MULTIPLY);
        }
    }

    public final MayaEKYCSelectedDocument O1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (MayaEKYCSelectedDocument) AbstractC0617a.D(arguments, "selectedDocument", MayaEKYCSelectedDocument.class);
        }
        return null;
    }

    public final String P1() {
        String strA = ((C0343c2) this.f12601Z.getValue()).a();
        if (strA == null) {
            strA = "";
        }
        return C2576A.H(strA) ? "FRONT" : strA;
    }

    public final View Q1() {
        View viewCameraFrame = ((C0473p0) G1()).f4177b.f3762l;
        j.f(viewCameraFrame, "viewCameraFrame");
        return viewCameraFrame;
    }

    public final ImageView R1() {
        ImageView imageViewCapturePhoto = (ImageView) ((C0473p0) G1()).f4177b.e;
        j.f(imageViewCapturePhoto, "imageViewCapturePhoto");
        return imageViewCapturePhoto;
    }

    public final ImageView S1() {
        ImageView imageViewTapArea = (ImageView) ((C0473p0) G1()).f4177b.f;
        j.f(imageViewTapArea, "imageViewTapArea");
        return imageViewTapArea;
    }

    public final l T1() {
        l lVar = this.f12600Y;
        if (lVar != null) {
            return lVar;
        }
        j.n("mKycImageFeedbackUtils");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        String strP1 = P1();
        if (strP1.equals("BACK")) {
            return EnumC1216e.SIMPLE_CAPTURE_BACK;
        }
        strP1.equals("FRONT");
        return EnumC1216e.SIMPLE_CAPTURE_FRONT;
    }

    public final PreviewView U1() {
        PreviewView previewView = (PreviewView) ((C0473p0) G1()).f4177b.m;
        j.f(previewView, "previewView");
        return previewView;
    }

    public final L V1() {
        L l6 = this.f12598W;
        if (l6 != null) {
            return l6;
        }
        j.n("mSimpleCaptureV3FragmentPresenter");
        throw null;
    }

    public final int W1() {
        if (U1().getDisplay() != null) {
            return U1().getDisplay().getRotation();
        }
        return 0;
    }

    public final void X1(List result) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        T1();
        j.g(result, "result");
        A[] aArr = A.f1264a;
        String str = ((Number) result.get(0)).floatValue() < 0.8035f ? "DETECTOR" : ((Number) result.get(1)).floatValue() > 0.4371f ? "GLARE" : ((Number) result.get(2)).floatValue() > 0.5451f ? "BLUR" : "GOOD_QUALITY";
        if (jCurrentTimeMillis - this.f12607f0 >= 5000) {
            this.f12607f0 = jCurrentTimeMillis;
            if (str.equals("GOOD_QUALITY")) {
                return;
            }
            EnumC1212a enumC1212a = EnumC1212a.ID_TYPE;
            MayaEKYCSelectedDocument mayaEKYCSelectedDocumentO1 = O1();
            j.d(mayaEKYCSelectedDocumentO1);
            Pair pair = new Pair(enumC1212a, mayaEKYCSelectedDocumentO1.getKey());
            EnumC1212a enumC1212a2 = EnumC1212a.ID_ORDER;
            KeyEventDispatcher.Component componentRequireActivity = requireActivity();
            j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
            Pair pair2 = new Pair(enumC1212a2, String.valueOf(((MayaKycActivity) ((b) componentRequireActivity)).a2().size()));
            Pair pair3 = new Pair(EnumC1212a.ID_SIDE, P1());
            EnumC1212a enumC1212a3 = EnumC1212a.IMAGEQ_MODEL_VERSION;
            if (this.f12599X == null) {
                j.n("mKycIdReviewUtils");
                throw null;
            }
            Map mapH = M.h(pair, pair2, pair3, new Pair(enumC1212a3, C2576A.Z("kyc_realtime_20251205_v2.tflite")), new Pair(EnumC1212a.REALTIME_RESULT, str));
            O();
            C1219h c1219hH = ((MayaKycActivity) Q()).H();
            c1219hH.n(43);
            c1219hH.j.put("vendor", "data science");
            for (Map.Entry entry : mapH.entrySet()) {
                c1219hH.f((EnumC1212a) entry.getKey(), (String) entry.getValue());
            }
            o1().c((FragmentActivity) Q(), c1219hH);
            Unit unit = Unit.f18162a;
        }
    }

    public final void Z1(boolean z4) {
        try {
            if (z4) {
                S1().setVisibility(0);
            } else {
                S1().setVisibility(4);
            }
        } catch (Exception unused) {
            a.e();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        super.onAttach(context);
        this.f12603b0 = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new Y1(this));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        c cVarF = W4.a.e().f();
        O5.a aVar = (O5.a) cVarF.c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        t tVar = e.f5840a;
        j.f(tVar, "single(...)");
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        this.f12598W = new L(tVar, preference);
        this.f12599X = cVarF.o();
        e0 resourceManager = (e0) aVar.f4685S.get();
        j.g(resourceManager, "resourceManager");
        this.f12600Y = new l(resourceManager, 17);
        V1().h(this);
        this.f12604c0 = Executors.newSingleThreadExecutor();
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        this.f12605d0 = new C0221d(contextRequireContext, this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        V1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBindingFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12608g0.remove();
        ExecutorService executorService = this.f12604c0;
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
        ExecutorService executorService = this.f12604c0;
        if (executorService == null) {
            j.n("cameraExecutor");
            throw null;
        }
        if (executorService.isShutdown()) {
            this.f12604c0 = Executors.newSingleThreadExecutor();
        }
        V1().j();
        L lV1 = V1();
        if (((MayaKycSimpleCaptureV3Fragment) ((E) lV1.c.get())).P1().equals("BACK")) {
            MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment = (MayaKycSimpleCaptureV3Fragment) ((E) lV1.c.get());
            mayaKycSimpleCaptureV3Fragment.getClass();
            EnumC1212a enumC1212a = EnumC1212a.ID_ORDER;
            KeyEventDispatcher.Component componentRequireActivity = mayaKycSimpleCaptureV3Fragment.requireActivity();
            j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
            T2.H(mayaKycSimpleCaptureV3Fragment, M.h(new Pair(enumC1212a, String.valueOf(((MayaKycActivity) ((b) componentRequireActivity)).a2().size())), new Pair(EnumC1212a.VENDOR, "in-house"), new Pair(EnumC1212a.ID_SIDE, "back")), 2);
            return;
        }
        MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment2 = (MayaKycSimpleCaptureV3Fragment) ((E) lV1.c.get());
        mayaKycSimpleCaptureV3Fragment2.getClass();
        EnumC1212a enumC1212a2 = EnumC1212a.ID_ORDER;
        KeyEventDispatcher.Component componentRequireActivity2 = mayaKycSimpleCaptureV3Fragment2.requireActivity();
        j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        T2.H(mayaKycSimpleCaptureV3Fragment2, M.h(new Pair(enumC1212a2, String.valueOf(((MayaKycActivity) ((b) componentRequireActivity2)).a2().size())), new Pair(EnumC1212a.VENDOR, "in-house"), new Pair(EnumC1212a.ID_SIDE, "front")), 2);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        MayaKycActivity mayaKycActivity = (MayaKycActivity) ((b) componentRequireActivity);
        mayaKycActivity.m2();
        mayaKycActivity.l2();
        mayaKycActivity.k2();
        super.onStop();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        KycDocument document;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        requireActivity().getOnBackPressedDispatcher().addCallback(this.f12608g0);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        MayaKycActivity mayaKycActivity = (MayaKycActivity) ((b) componentRequireActivity);
        mayaKycActivity.b2();
        mayaKycActivity.q2();
        MayaBaseFragment.l1((Toolbar) ((C0473p0) G1()).f4177b.h);
        i.D(this, z.a(MayaKycChangeYourMindBottomSheetDialogFragment.class), new M1(1, V1(), L.class, "handleConfirmationDialogResult", "handleConfirmationDialogResult(Z)V", 0, 2));
        ((Toolbar) ((C0473p0) G1()).f4177b.h).setNavigationOnClickListener(new M8.L(this, 9));
        ((TextView) ((C0473p0) G1()).f4177b.f3758b).setText(getString(R.string.maya_kyc_toolbar_progress_step, 2));
        C.r0(R1(), new W1(this, 0));
        TextView textView = (TextView) ((C0473p0) G1()).f4177b.f3763n;
        MayaEKYCSelectedDocument mayaEKYCSelectedDocumentO1 = O1();
        textView.setText((mayaEKYCSelectedDocumentO1 == null || (document = mayaEKYCSelectedDocumentO1.getDocument()) == null) ? null : document.getDescription());
        Q1().setOnTouchListener(new X1(this, 0));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.EKYC_V6;
    }
}
