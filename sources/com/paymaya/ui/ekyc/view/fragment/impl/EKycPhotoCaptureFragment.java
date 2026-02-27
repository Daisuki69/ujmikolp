package com.paymaya.ui.ekyc.view.fragment.impl;

import A3.a;
import Eh.d;
import Gh.f;
import Kh.B;
import Kh.C0305j;
import M8.C0358g1;
import N5.H;
import Nh.j;
import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.viewbinding.ViewBindings;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1112C;
import cj.C1132s;
import cj.M;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.ui.ekyc.view.activity.impl.EKycPhotoCaptureActivity;
import com.paymaya.ui.ekyc.view.fragment.impl.EKycPhotoCaptureFragment;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntRange;
import n0.e;
import o1.AbstractC1955a;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import s.AbstractC2217b;
import sd.h;
import v.AbstractC2329d;
import w1.RunnableC2367e;
import y3.C2503d;
import yd.l;
import zd.v;
import zh.b;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class EKycPhotoCaptureFragment extends BaseFragment implements l, SurfaceHolder.Callback {

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final InterfaceC1033d f14561B0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public H f14564S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public View f14565T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public TextView f14566U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f14567V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Group f14568W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Group f14569X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public SurfaceView f14570Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ImageView f14571Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f14572a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ImageView f14573b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public TextView f14574c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public TextView f14575d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public View f14576e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public h f14577f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Camera f14578g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public v f14579h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public File f14580i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Handler f14581j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Mat f14582k0;
    public boolean m0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C2503d f14585o0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f14589s0;
    public a u0;
    public final InterfaceC1033d w0;
    public ByteBuffer y0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f14583l0 = "capture_docs";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public String f14584n0 = "";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f14586p0 = 224;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f14587q0 = 224;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f14588r0 = 3;
    public String t0 = "";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final int[] f14590v0 = new int[50176];

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Object f14591x0 = M.e();

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final InterfaceC1033d f14592z0 = C1034e.b(new e(13));

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final InterfaceC1033d f14560A0 = C1034e.b(new e(14));

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final C0358g1 f14562C0 = new C0358g1(this, getActivity(), 1);

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final PriorityQueue f14563D0 = new PriorityQueue(21, new A7.l(18));

    public EKycPhotoCaptureFragment() {
        final int i = 0;
        this.w0 = C1034e.b(new Function0(this) { // from class: zd.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EKycPhotoCaptureFragment f21390b;

            {
                this.f21390b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                EKycPhotoCaptureFragment eKycPhotoCaptureFragment = this.f21390b;
                switch (i) {
                    case 0:
                        try {
                            return eKycPhotoCaptureFragment.v1();
                        } catch (IOException e) {
                            e.printStackTrace();
                            return C1112C.f9377a;
                        }
                    default:
                        return new float[][]{new float[((List) eKycPhotoCaptureFragment.w0.getValue()).size()]};
                }
            }
        });
        final int i4 = 1;
        this.f14561B0 = C1034e.b(new Function0(this) { // from class: zd.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EKycPhotoCaptureFragment f21390b;

            {
                this.f21390b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                EKycPhotoCaptureFragment eKycPhotoCaptureFragment = this.f21390b;
                switch (i4) {
                    case 0:
                        try {
                            return eKycPhotoCaptureFragment.v1();
                        } catch (IOException e) {
                            e.printStackTrace();
                            return C1112C.f9377a;
                        }
                    default:
                        return new float[][]{new float[((List) eKycPhotoCaptureFragment.w0.getValue()).size()]};
                }
            }
        });
    }

    public static final void A1(EKycPhotoCaptureFragment eKycPhotoCaptureFragment) {
        h hVarR1 = eKycPhotoCaptureFragment.r1();
        if (hVarR1.f20046d == 2 && !z.o(((EKycPhotoCaptureFragment) ((l) hVarR1.c.get())).f14583l0, "capture_docs", true)) {
            int iC = AbstractC2217b.c(hVarR1.h);
            if (iC == 1) {
                ((EKycPhotoCaptureFragment) ((l) hVarR1.c.get())).w1();
            } else if (iC == 2) {
                EKycPhotoCaptureFragment eKycPhotoCaptureFragment2 = (EKycPhotoCaptureFragment) ((l) hVarR1.c.get());
                eKycPhotoCaptureFragment2.getClass();
                C1219h c1219h = new C1219h();
                c1219h.n(17);
                c1219h.t(EnumC1217f.RETAKE);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219h.j.put(SessionDescription.ATTR_TYPE, "photo");
                c1219h.j.put(Constants.REASON, "no_face");
                eKycPhotoCaptureFragment2.o1(c1219h);
            } else if (iC == 3) {
                EKycPhotoCaptureFragment eKycPhotoCaptureFragment3 = (EKycPhotoCaptureFragment) ((l) hVarR1.c.get());
                eKycPhotoCaptureFragment3.getClass();
                C1219h c1219h2 = new C1219h();
                c1219h2.n(17);
                c1219h2.t(EnumC1217f.RETAKE);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219h2.j.put(SessionDescription.ATTR_TYPE, "photo");
                c1219h2.j.put(Constants.REASON, "face_detected");
                eKycPhotoCaptureFragment3.o1(c1219h2);
            } else if (iC == 4) {
                EKycPhotoCaptureFragment eKycPhotoCaptureFragment4 = (EKycPhotoCaptureFragment) ((l) hVarR1.c.get());
                eKycPhotoCaptureFragment4.getClass();
                C1219h c1219h3 = new C1219h();
                c1219h3.n(17);
                c1219h3.t(EnumC1217f.RETAKE);
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                c1219h3.j.put(SessionDescription.ATTR_TYPE, "photo");
                c1219h3.j.put(Constants.REASON, "multiple_face");
                eKycPhotoCaptureFragment4.o1(c1219h3);
            }
        } else if (hVarR1.f20046d == 4 && !z.o(((EKycPhotoCaptureFragment) ((l) hVarR1.c.get())).f14583l0, "capture_docs", true) && hVarR1.h == 2) {
            ((EKycPhotoCaptureFragment) ((l) hVarR1.c.get())).w1();
        }
        hVarR1.h = 1;
        hVarR1.m();
    }

    public static final void B1(EKycPhotoCaptureFragment eKycPhotoCaptureFragment) {
        if (!AbstractC1955a.v(eKycPhotoCaptureFragment.getActivity(), "android.permission.CAMERA")) {
            h hVarR1 = eKycPhotoCaptureFragment.r1();
            EKycPhotoCaptureFragment eKycPhotoCaptureFragment2 = (EKycPhotoCaptureFragment) ((l) hVarR1.c.get());
            eKycPhotoCaptureFragment2.getClass();
            B bE = AbstractC1955a.k(eKycPhotoCaptureFragment2).e(b.a());
            j jVar = Th.e.c;
            Objects.requireNonNull(jVar, "scheduler is null");
            C0305j c0305j = new C0305j(bE, jVar, 4);
            f fVar = new f(new p8.a(hVarR1, 11), d.f1366d);
            c0305j.g(fVar);
            hVarR1.e(fVar);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(eKycPhotoCaptureFragment.requireContext());
        View viewInflate = eKycPhotoCaptureFragment.requireActivity().getLayoutInflater().inflate(R.layout.pma_dialog_fragment_allow_camera_permission, (ViewGroup) null);
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        kotlin.jvm.internal.j.f(alertDialogCreate, "create(...)");
        alertDialogCreate.setCanceledOnTouchOutside(false);
        Button button = (Button) viewInflate.findViewById(R.id.pma_dialog_fragment_allow_camera_permission_not_now_button);
        Button button2 = (Button) viewInflate.findViewById(R.id.pma_dialog_fragment_allow_camera_permission_open_settings_button);
        button.setOnClickListener(new Na.a(alertDialogCreate, 5));
        button2.setOnClickListener(new com.paymaya.common.utility.H(alertDialogCreate, eKycPhotoCaptureFragment));
        alertDialogCreate.show();
    }

    public static final void z1(EKycPhotoCaptureFragment eKycPhotoCaptureFragment) {
        h hVarR1 = eKycPhotoCaptureFragment.r1();
        String strValueOf = String.valueOf(eKycPhotoCaptureFragment.f14580i0);
        if (hVarR1.f20046d == 2 && !z.o(((EKycPhotoCaptureFragment) ((l) hVarR1.c.get())).f14583l0, "capture_docs", true)) {
            int iC = AbstractC2217b.c(hVarR1.h);
            if (iC == 1) {
                ((EKycPhotoCaptureFragment) ((l) hVarR1.c.get())).x1();
            } else if (iC == 2) {
                EKycPhotoCaptureFragment eKycPhotoCaptureFragment2 = (EKycPhotoCaptureFragment) ((l) hVarR1.c.get());
                eKycPhotoCaptureFragment2.getClass();
                C1219h c1219h = new C1219h();
                c1219h.n(17);
                c1219h.t(EnumC1217f.USE);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219h.j.put(SessionDescription.ATTR_TYPE, "photo");
                c1219h.j.put(Constants.REASON, "no_face");
                eKycPhotoCaptureFragment2.o1(c1219h);
            } else if (iC == 3) {
                EKycPhotoCaptureFragment eKycPhotoCaptureFragment3 = (EKycPhotoCaptureFragment) ((l) hVarR1.c.get());
                eKycPhotoCaptureFragment3.getClass();
                C1219h c1219h2 = new C1219h();
                c1219h2.n(17);
                c1219h2.t(EnumC1217f.USE);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219h2.j.put(SessionDescription.ATTR_TYPE, "photo");
                c1219h2.j.put(Constants.REASON, "face_detected");
                eKycPhotoCaptureFragment3.o1(c1219h2);
            } else if (iC == 4) {
                EKycPhotoCaptureFragment eKycPhotoCaptureFragment4 = (EKycPhotoCaptureFragment) ((l) hVarR1.c.get());
                eKycPhotoCaptureFragment4.getClass();
                C1219h c1219h3 = new C1219h();
                c1219h3.n(17);
                c1219h3.t(EnumC1217f.USE);
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                c1219h3.j.put(SessionDescription.ATTR_TYPE, "photo");
                c1219h3.j.put(Constants.REASON, "multiple_face");
                eKycPhotoCaptureFragment4.o1(c1219h3);
            }
        } else if (hVarR1.f20046d == 4 && !z.o(((EKycPhotoCaptureFragment) ((l) hVarR1.c.get())).f14583l0, "capture_docs", true) && hVarR1.h == 2) {
            ((EKycPhotoCaptureFragment) ((l) hVarR1.c.get())).x1();
        }
        int i = hVarR1.f20046d;
        if (i == 2) {
            hVarR1.e = strValueOf;
        } else if (i == 4) {
            hVarR1.f = strValueOf;
        }
        hVarR1.h = 1;
        hVarR1.l();
    }

    public final void C1() {
        Camera cameraOpen;
        IntRange intRangeE;
        IntRange intRangeE2;
        Camera.Parameters parameters;
        yk.a.a();
        if (getActivity() != null && !getActivity().getPackageManager().hasSystemFeature("android.hardware.camera")) {
            yk.a.c();
            return;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        int i = 0;
        while (true) {
            if (i < numberOfCameras) {
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    try {
                        cameraOpen = Camera.open(i);
                        break;
                    } catch (RuntimeException unused) {
                        yk.a.e();
                    }
                }
                i++;
            } else {
                try {
                    cameraOpen = Camera.open();
                    break;
                } catch (Exception unused2) {
                    yk.a.e();
                    cameraOpen = null;
                }
            }
        }
        this.f14578g0 = cameraOpen;
        if (cameraOpen == null) {
            yk.a.c();
            return;
        }
        Camera.Parameters parameters2 = cameraOpen.getParameters();
        Camera camera = this.f14578g0;
        List<Camera.Size> supportedPreviewSizes = (camera == null || (parameters = camera.getParameters()) == null) ? null : parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes != null) {
            intRangeE = C1132s.e(supportedPreviewSizes);
        } else {
            IntRange.e.getClass();
            intRangeE = IntRange.f;
        }
        int i4 = intRangeE.f18201a;
        int i6 = intRangeE.f18202b;
        if (i4 <= i6) {
            int i10 = -1;
            while (true) {
                Camera.Size size = supportedPreviewSizes != null ? supportedPreviewSizes.get(i4) : null;
                if (size == null || size.height != 720 || size.width != 1280) {
                    if (size != null && size.height == 720) {
                        i10 = i4;
                    }
                    if (i4 == i6) {
                        i4 = i10;
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
        } else {
            i4 = -1;
        }
        if (i4 == -1) {
            if (supportedPreviewSizes != null) {
                intRangeE2 = C1132s.e(supportedPreviewSizes);
            } else {
                IntRange.e.getClass();
                intRangeE2 = IntRange.f;
            }
            i4 = intRangeE2.f18201a;
            int i11 = intRangeE2.f18202b;
            if (i4 <= i11) {
                int i12 = 0;
                while (true) {
                    Camera.Size size2 = supportedPreviewSizes != null ? supportedPreviewSizes.get(i4) : null;
                    if (size2 == null || size2.height != 480 || size2.width != 720) {
                        if (size2 != null && size2.height == 480) {
                            i12 = i4;
                        }
                        if (i4 == i11) {
                            i4 = i12;
                            break;
                        }
                        i4++;
                    } else {
                        break;
                    }
                }
            } else {
                i4 = 0;
            }
        }
        Camera.Size size3 = supportedPreviewSizes != null ? supportedPreviewSizes.get(i4) : null;
        if (size3 != null) {
            if (parameters2 != null) {
                parameters2.setPictureSize(size3.width, size3.height);
            }
            if (parameters2 != null) {
                parameters2.setPreviewSize(size3.width, size3.height);
            }
            SurfaceView surfaceView = this.f14570Y;
            if (surfaceView == null) {
                kotlin.jvm.internal.j.n("mSurfaceViewPhotoPreview");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = surfaceView.getLayoutParams();
            kotlin.jvm.internal.j.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.dimensionRatio = String.format("%d:%d", Arrays.copyOf(new Object[]{Integer.valueOf(size3.height), Integer.valueOf(size3.width)}, 2));
            SurfaceView surfaceView2 = this.f14570Y;
            if (surfaceView2 == null) {
                kotlin.jvm.internal.j.n("mSurfaceViewPhotoPreview");
                throw null;
            }
            surfaceView2.setLayoutParams(layoutParams2);
        }
        Handler handler = this.f14581j0;
        if (handler != null) {
            handler.postDelayed(new RunnableC2367e(this, 6), 1000L);
        }
        Camera camera2 = this.f14578g0;
        if (camera2 != null) {
            camera2.setParameters(parameters2);
        }
        SurfaceView surfaceView3 = this.f14570Y;
        if (surfaceView3 == null) {
            kotlin.jvm.internal.j.n("mSurfaceViewPhotoPreview");
            throw null;
        }
        surfaceView3.getHolder().addCallback(this);
        yk.a.a();
        try {
            Camera camera3 = this.f14578g0;
            if (camera3 != null) {
                SurfaceView surfaceView4 = this.f14570Y;
                if (surfaceView4 == null) {
                    kotlin.jvm.internal.j.n("mSurfaceViewPhotoPreview");
                    throw null;
                }
                camera3.setPreviewDisplay(surfaceView4.getHolder());
            }
        } catch (IOException unused3) {
            yk.a.e();
        }
        Camera camera4 = this.f14578g0;
        if (camera4 != null) {
            camera4.setDisplayOrientation(90);
        }
        Camera camera5 = this.f14578g0;
        if (camera5 != null) {
            camera5.startPreview();
        }
    }

    public final void D1() {
        TextView textView = this.f14566U;
        if (textView != null) {
            textView.setText(R.string.pma_label_ekyc_instruction_back_id_capture);
        } else {
            kotlin.jvm.internal.j.n("mTextViewCaptureInstructions");
            throw null;
        }
    }

    public final void E1() {
        TextView textView = this.f14566U;
        if (textView != null) {
            textView.setText(R.string.pma_label_ekyc_instruction_front_id_capture);
        } else {
            kotlin.jvm.internal.j.n("mTextViewCaptureInstructions");
            throw null;
        }
    }

    public final void F1() {
        TextView textView = this.f14567V;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewBlurryImageWarningSpiel");
            throw null;
        }
        textView.setVisibility(0);
        Group group = this.f14569X;
        if (group == null) {
            kotlin.jvm.internal.j.n("mConstraintGroupPostCaptureActions");
            throw null;
        }
        group.setVisibility(0);
        TextView textView2 = this.f14574c0;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewUsePhoto");
            throw null;
        }
        textView2.setVisibility(0);
        TextView textView3 = this.f14575d0;
        if (textView3 == null) {
            kotlin.jvm.internal.j.n("mTextViewRetakePhoto");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.f14576e0;
        if (view != null) {
            view.setVisibility(0);
        } else {
            kotlin.jvm.internal.j.n("mActionDividerView");
            throw null;
        }
    }

    public final void G1() {
        TextView textView = this.f14567V;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewBlurryImageWarningSpiel");
            throw null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.f14567V;
        if (textView2 != null) {
            textView2.setText(getString(R.string.pma_label_ekyc_default_warning));
        } else {
            kotlin.jvm.internal.j.n("mTextViewBlurryImageWarningSpiel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i4, Intent intent) {
        super.onActivityResult(i, i4, intent);
        if (i == 2 && AbstractC1955a.u(getContext(), "android.permission.CAMERA")) {
            r1().j();
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().d().f4753a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14577f0 = new h((com.paymaya.data.preference.a) aVar.e.get());
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("capture_mode", "capture_docs");
            kotlin.jvm.internal.j.f(string, "getString(...)");
            this.f14583l0 = string;
            this.m0 = arguments.getBoolean("should_show_tutorial", false);
            String string2 = arguments.getString("id_type", "");
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            this.f14584n0 = string2;
        }
        this.f14579h0 = (v) getActivity();
        r1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_fragment_ekyc_photo_capture, viewGroup, false);
        int i = R.id.actions_background_view_pma_fragment_ekyc_photo_capture;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.actions_background_view_pma_fragment_ekyc_photo_capture);
        if (viewFindChildViewById != null) {
            i = R.id.allow_permission_message_text_view_pma_fragment_ekyc_photo_capture;
            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.allow_permission_message_text_view_pma_fragment_ekyc_photo_capture)) != null) {
                i = R.id.allow_permission_title_text_view_pma_fragment_ekyc_photo_capture;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.allow_permission_title_text_view_pma_fragment_ekyc_photo_capture)) != null) {
                    i = R.id.back_image_view_pma_fragment_ekyc_photo_capture;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.back_image_view_pma_fragment_ekyc_photo_capture);
                    if (imageView != null) {
                        i = R.id.blurry_image_warning_spiel_text_view_pma_fragment_ekyc_photo_capture;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.blurry_image_warning_spiel_text_view_pma_fragment_ekyc_photo_capture);
                        if (textView != null) {
                            i = R.id.capture_background_view_pma_fragment_ekyc_photo_capture;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.capture_background_view_pma_fragment_ekyc_photo_capture);
                            if (viewFindChildViewById2 != null) {
                                i = R.id.capture_instructions_text_view_pma_fragment_ekyc_photo_capture;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.capture_instructions_text_view_pma_fragment_ekyc_photo_capture);
                                if (textView2 != null) {
                                    i = R.id.capture_photo_image_view_pma_fragment_ekyc_photo_capture;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.capture_photo_image_view_pma_fragment_ekyc_photo_capture);
                                    if (imageView2 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        i = R.id.deny_permission_background_view_pma_fragment_ekyc_photo_capture;
                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.deny_permission_background_view_pma_fragment_ekyc_photo_capture);
                                        if (viewFindChildViewById3 != null) {
                                            i = R.id.deny_permission_constraint_group_pma_fragment_ekyc_photo_capture;
                                            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.deny_permission_constraint_group_pma_fragment_ekyc_photo_capture);
                                            if (group != null) {
                                                i = R.id.enable_camera_text_view_pma_fragment_ekyc_photo_capture;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.enable_camera_text_view_pma_fragment_ekyc_photo_capture);
                                                if (textView3 != null) {
                                                    i = R.id.photo_preview_surface_view_pma_fragment_ekyc_photo_capture;
                                                    SurfaceView surfaceView = (SurfaceView) ViewBindings.findChildViewById(viewInflate, R.id.photo_preview_surface_view_pma_fragment_ekyc_photo_capture);
                                                    if (surfaceView != null) {
                                                        i = R.id.post_capture_actions_constraint_group_pma_fragment_ekyc_photo_capture;
                                                        Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.post_capture_actions_constraint_group_pma_fragment_ekyc_photo_capture);
                                                        if (group2 != null) {
                                                            i = R.id.post_capture_actions_divider_view_pma_fragment_ekyc_photo_capture;
                                                            View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.post_capture_actions_divider_view_pma_fragment_ekyc_photo_capture);
                                                            if (viewFindChildViewById4 != null) {
                                                                i = R.id.preview_window_view_pma_fragment_ekyc_photo_capture;
                                                                View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.preview_window_view_pma_fragment_ekyc_photo_capture);
                                                                if (viewFindChildViewById5 != null) {
                                                                    i = R.id.retake_photo_text_view_pma_fragment_ekyc_photo_capture;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.retake_photo_text_view_pma_fragment_ekyc_photo_capture);
                                                                    if (textView4 != null) {
                                                                        i = R.id.use_photo_text_view_pma_fragment_ekyc_photo_capture;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.use_photo_text_view_pma_fragment_ekyc_photo_capture);
                                                                        if (textView5 != null) {
                                                                            this.f14564S = new H(constraintLayout, viewFindChildViewById, imageView, textView, viewFindChildViewById2, textView2, imageView2, viewFindChildViewById3, group, textView3, surfaceView, group2, viewFindChildViewById4, viewFindChildViewById5, textView4, textView5);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        try {
            a aVar = this.u0;
            if (aVar != null) {
                aVar.close();
            }
        } catch (IOException unused) {
            yk.a.b();
        }
        Camera camera = this.f14578g0;
        if (camera != null) {
            camera.release();
        }
        r1().i();
        super.onDestroy();
        this.f14564S = null;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Handler handler = this.f14581j0;
        if (handler == null || handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        v vVar = this.f14579h0;
        if (vVar != null) {
            ((EKycPhotoCaptureActivity) vVar).n1(false);
        }
        boolean zB = org.opencv.android.a.b();
        C0358g1 c0358g1 = this.f14562C0;
        if (zB) {
            c0358g1.o(0);
        } else {
            org.opencv.android.a.a(getActivity(), c0358g1);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C1();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        yk.a.a();
        Camera camera = this.f14578g0;
        if (camera != null) {
            camera.release();
            this.f14578g0 = null;
        }
        super.onStop();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        H h = this.f14564S;
        kotlin.jvm.internal.j.d(h);
        this.f14565T = h.m;
        H h6 = this.f14564S;
        kotlin.jvm.internal.j.d(h6);
        this.f14566U = h6.f;
        H h7 = this.f14564S;
        kotlin.jvm.internal.j.d(h7);
        this.f14567V = h7.c;
        H h8 = this.f14564S;
        kotlin.jvm.internal.j.d(h8);
        this.f14568W = (Group) h8.f3639o;
        H h10 = this.f14564S;
        kotlin.jvm.internal.j.d(h10);
        this.f14569X = (Group) h10.f3641q;
        H h11 = this.f14564S;
        kotlin.jvm.internal.j.d(h11);
        this.f14570Y = (SurfaceView) h11.f3640p;
        H h12 = this.f14564S;
        kotlin.jvm.internal.j.d(h12);
        this.f14571Z = (ImageView) h12.f3638n;
        H h13 = this.f14564S;
        kotlin.jvm.internal.j.d(h13);
        this.f14572a0 = h13.f3635g;
        H h14 = this.f14564S;
        kotlin.jvm.internal.j.d(h14);
        this.f14573b0 = (ImageView) h14.f3634d;
        H h15 = this.f14564S;
        kotlin.jvm.internal.j.d(h15);
        this.f14574c0 = (TextView) h15.f3636k;
        H h16 = this.f14564S;
        kotlin.jvm.internal.j.d(h16);
        this.f14575d0 = (TextView) h16.j;
        H h17 = this.f14564S;
        kotlin.jvm.internal.j.d(h17);
        this.f14576e0 = h17.f3637l;
        r1().j();
        this.f14581j0 = new Handler();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f14586p0 * this.f14587q0 * this.f14588r0 * 4);
        this.y0 = byteBufferAllocateDirect;
        if (byteBufferAllocateDirect != null) {
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        }
        this.f14585o0 = new C2503d();
        TextView textView = this.f14572a0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewEnableCamera");
            throw null;
        }
        final int i = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: zd.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EKycPhotoCaptureFragment f21388b;

            {
                this.f21388b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            EKycPhotoCaptureFragment.B1(eKycPhotoCaptureFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment2 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            eKycPhotoCaptureFragment2.r1().m();
                            return;
                        } finally {
                        }
                    case 2:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment3 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            ImageView imageView = eKycPhotoCaptureFragment3.f14571Z;
                            if (imageView == null) {
                                kotlin.jvm.internal.j.n("mCapturePhotoImageView");
                                throw null;
                            }
                            imageView.setEnabled(false);
                            Camera camera = eKycPhotoCaptureFragment3.f14578g0;
                            if (camera != null) {
                                camera.takePicture(null, null, new E8.q(eKycPhotoCaptureFragment3));
                            }
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    case 3:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment4 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            EKycPhotoCaptureFragment.z1(eKycPhotoCaptureFragment4);
                            return;
                        } finally {
                        }
                    default:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment5 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            EKycPhotoCaptureFragment.A1(eKycPhotoCaptureFragment5);
                            return;
                        } finally {
                        }
                }
            }
        });
        ImageView imageView = this.f14573b0;
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mImageViewBack");
            throw null;
        }
        final int i4 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: zd.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EKycPhotoCaptureFragment f21388b;

            {
                this.f21388b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            EKycPhotoCaptureFragment.B1(eKycPhotoCaptureFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment2 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            eKycPhotoCaptureFragment2.r1().m();
                            return;
                        } finally {
                        }
                    case 2:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment3 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            ImageView imageView2 = eKycPhotoCaptureFragment3.f14571Z;
                            if (imageView2 == null) {
                                kotlin.jvm.internal.j.n("mCapturePhotoImageView");
                                throw null;
                            }
                            imageView2.setEnabled(false);
                            Camera camera = eKycPhotoCaptureFragment3.f14578g0;
                            if (camera != null) {
                                camera.takePicture(null, null, new E8.q(eKycPhotoCaptureFragment3));
                            }
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    case 3:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment4 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            EKycPhotoCaptureFragment.z1(eKycPhotoCaptureFragment4);
                            return;
                        } finally {
                        }
                    default:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment5 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            EKycPhotoCaptureFragment.A1(eKycPhotoCaptureFragment5);
                            return;
                        } finally {
                        }
                }
            }
        });
        ImageView imageView2 = this.f14571Z;
        if (imageView2 == null) {
            kotlin.jvm.internal.j.n("mCapturePhotoImageView");
            throw null;
        }
        final int i6 = 2;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: zd.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EKycPhotoCaptureFragment f21388b;

            {
                this.f21388b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            EKycPhotoCaptureFragment.B1(eKycPhotoCaptureFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment2 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            eKycPhotoCaptureFragment2.r1().m();
                            return;
                        } finally {
                        }
                    case 2:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment3 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            ImageView imageView22 = eKycPhotoCaptureFragment3.f14571Z;
                            if (imageView22 == null) {
                                kotlin.jvm.internal.j.n("mCapturePhotoImageView");
                                throw null;
                            }
                            imageView22.setEnabled(false);
                            Camera camera = eKycPhotoCaptureFragment3.f14578g0;
                            if (camera != null) {
                                camera.takePicture(null, null, new E8.q(eKycPhotoCaptureFragment3));
                            }
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    case 3:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment4 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            EKycPhotoCaptureFragment.z1(eKycPhotoCaptureFragment4);
                            return;
                        } finally {
                        }
                    default:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment5 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            EKycPhotoCaptureFragment.A1(eKycPhotoCaptureFragment5);
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView2 = this.f14574c0;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewUsePhoto");
            throw null;
        }
        final int i10 = 3;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: zd.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EKycPhotoCaptureFragment f21388b;

            {
                this.f21388b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            EKycPhotoCaptureFragment.B1(eKycPhotoCaptureFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment2 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            eKycPhotoCaptureFragment2.r1().m();
                            return;
                        } finally {
                        }
                    case 2:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment3 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            ImageView imageView22 = eKycPhotoCaptureFragment3.f14571Z;
                            if (imageView22 == null) {
                                kotlin.jvm.internal.j.n("mCapturePhotoImageView");
                                throw null;
                            }
                            imageView22.setEnabled(false);
                            Camera camera = eKycPhotoCaptureFragment3.f14578g0;
                            if (camera != null) {
                                camera.takePicture(null, null, new E8.q(eKycPhotoCaptureFragment3));
                            }
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    case 3:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment4 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            EKycPhotoCaptureFragment.z1(eKycPhotoCaptureFragment4);
                            return;
                        } finally {
                        }
                    default:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment5 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            EKycPhotoCaptureFragment.A1(eKycPhotoCaptureFragment5);
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView3 = this.f14575d0;
        if (textView3 == null) {
            kotlin.jvm.internal.j.n("mTextViewRetakePhoto");
            throw null;
        }
        final int i11 = 4;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: zd.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EKycPhotoCaptureFragment f21388b;

            {
                this.f21388b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            EKycPhotoCaptureFragment.B1(eKycPhotoCaptureFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment2 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            eKycPhotoCaptureFragment2.r1().m();
                            return;
                        } finally {
                        }
                    case 2:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment3 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            ImageView imageView22 = eKycPhotoCaptureFragment3.f14571Z;
                            if (imageView22 == null) {
                                kotlin.jvm.internal.j.n("mCapturePhotoImageView");
                                throw null;
                            }
                            imageView22.setEnabled(false);
                            Camera camera = eKycPhotoCaptureFragment3.f14578g0;
                            if (camera != null) {
                                camera.takePicture(null, null, new E8.q(eKycPhotoCaptureFragment3));
                            }
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    case 3:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment4 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            EKycPhotoCaptureFragment.z1(eKycPhotoCaptureFragment4);
                            return;
                        } finally {
                        }
                    default:
                        EKycPhotoCaptureFragment eKycPhotoCaptureFragment5 = this.f21388b;
                        Callback.onClick_enter(view2);
                        try {
                            EKycPhotoCaptureFragment.A1(eKycPhotoCaptureFragment5);
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    public final h r1() {
        h hVar = this.f14577f0;
        if (hVar != null) {
            return hVar;
        }
        kotlin.jvm.internal.j.n("mIEKycPhotoCaptureFragmentPresenter");
        throw null;
    }

    public final void s1() {
        TextView textView = this.f14567V;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewBlurryImageWarningSpiel");
            throw null;
        }
        textView.setVisibility(8);
        TextView textView2 = this.f14567V;
        if (textView2 != null) {
            textView2.setText("");
        } else {
            kotlin.jvm.internal.j.n("mTextViewBlurryImageWarningSpiel");
            throw null;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder holder, int i, int i4, int i6) {
        kotlin.jvm.internal.j.g(holder, "holder");
        SurfaceView surfaceView = this.f14570Y;
        if (surfaceView == null) {
            kotlin.jvm.internal.j.n("mSurfaceViewPhotoPreview");
            throw null;
        }
        if (surfaceView.getHolder().getSurface() == null) {
            return;
        }
        try {
            Camera camera = this.f14578g0;
            if (camera != null) {
                camera.stopPreview();
            }
        } catch (Exception unused) {
            yk.a.b();
        }
        Camera camera2 = this.f14578g0;
        if (camera2 != null) {
            camera2.setDisplayOrientation(90);
        }
        try {
            Camera camera3 = this.f14578g0;
            if (camera3 != null) {
                SurfaceView surfaceView2 = this.f14570Y;
                if (surfaceView2 == null) {
                    kotlin.jvm.internal.j.n("mSurfaceViewPhotoPreview");
                    throw null;
                }
                camera3.setPreviewDisplay(surfaceView2.getHolder());
            }
            Camera camera4 = this.f14578g0;
            if (camera4 != null) {
                camera4.startPreview();
            }
        } catch (Exception unused2) {
            yk.a.e();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder holder) {
        kotlin.jvm.internal.j.g(holder, "holder");
        yk.a.a();
        Camera camera = this.f14578g0;
        if (camera != null) {
            camera.setDisplayOrientation(90);
        }
        try {
            Camera camera2 = this.f14578g0;
            if (camera2 != null) {
                camera2.setPreviewDisplay(holder);
                Camera camera3 = this.f14578g0;
                if (camera3 != null) {
                    camera3.startPreview();
                }
            }
        } catch (IOException e) {
            e.getMessage();
            yk.a.d();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder holder) {
        kotlin.jvm.internal.j.g(holder, "holder");
    }

    public final void t1() {
        Camera camera = this.f14578g0;
        if (camera != null) {
            camera.startPreview();
        }
        ImageView imageView = this.f14571Z;
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mCapturePhotoImageView");
            throw null;
        }
        imageView.setEnabled(true);
        TextView textView = this.f14567V;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewBlurryImageWarningSpiel");
            throw null;
        }
        textView.setVisibility(8);
        Group group = this.f14569X;
        if (group == null) {
            kotlin.jvm.internal.j.n("mConstraintGroupPostCaptureActions");
            throw null;
        }
        group.setVisibility(8);
        TextView textView2 = this.f14574c0;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewUsePhoto");
            throw null;
        }
        textView2.setVisibility(8);
        TextView textView3 = this.f14575d0;
        if (textView3 == null) {
            kotlin.jvm.internal.j.n("mTextViewRetakePhoto");
            throw null;
        }
        textView3.setVisibility(8);
        View view = this.f14576e0;
        if (view != null) {
            view.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.n("mActionDividerView");
            throw null;
        }
    }

    public final boolean u1() {
        double d10;
        File file = this.f14580i0;
        Mat matA = Imgcodecs.a(file != null ? file.getAbsolutePath() : null);
        this.f14582k0 = matA;
        if (matA.a()) {
            d10 = -1.0d;
        } else {
            Mat mat = new Mat();
            Imgproc.b(this.f14582k0, mat);
            Mat mat2 = new Mat();
            Imgproc.a(mat, mat2);
            Imgproc.a(mat, mat2);
            lk.b bVar = new lk.b();
            lk.b bVar2 = new lk.b();
            Core.b(mat2, bVar, bVar2);
            d10 = bVar2.b()[0];
        }
        return d10 < 7.0d;
    }

    public final ArrayList v1() throws IOException {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(requireActivity().getAssets().open("labels.txt")));
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(requireActivity().getAssets().open("strict_id_typing.txt")));
        while (true) {
            String line = bufferedReader.readLine();
            String str = line == null ? "" : line;
            if (line == null || C2576A.H(line)) {
                break;
            }
            String line2 = bufferedReader2.readLine();
            String str2 = line2 != null ? line2 : "";
            if (line2 == null || C2576A.H(line2)) {
                break;
            }
            arrayList.add(str);
            linkedHashMap.put(str, Boolean.valueOf(Boolean.parseBoolean(str2)));
        }
        this.f14591x0 = linkedHashMap;
        bufferedReader.close();
        bufferedReader2.close();
        return arrayList;
    }

    public final void w1() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.RETAKE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put(SessionDescription.ATTR_TYPE, "photo");
        c1219hH.j.put(Constants.REASON, "blurred");
        o1(c1219hH);
    }

    public final void x1() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.USE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put(SessionDescription.ATTR_TYPE, "photo");
        c1219hH.j.put(Constants.REASON, "blurred");
        o1(c1219hH);
    }

    public final void y1(String str, String str2, String str3) {
        C1219h c1219h = new C1219h();
        HashMap map = c1219h.j;
        c1219h.t(EnumC1217f.ID_PHOTO_MATCHING);
        c1219h.n(14);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        map.put("selected_id", str);
        map.put("detected_id", str2);
        map.put("confidence_score", str3);
        o1(c1219h);
    }
}
