package D8;

import E8.C0221d;
import E8.RunnableC0218a;
import E8.RunnableC0219b;
import M8.C0351e2;
import M8.C0355f2;
import M8.C0368j;
import M8.C0372k;
import M8.T2;
import M8.W1;
import N5.C0473p0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.Navigation;
import androidx.navigation.ViewKt;
import androidx.viewbinding.ViewBindings;
import cj.C1110A;
import cj.C1112C;
import cj.C1132s;
import com.paymaya.R;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycLivePhotoTip;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureV3Fragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class L extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f1019d;

    public L(Nh.t tVar, com.paymaya.data.preference.a aVar) {
        this.f1019d = aVar;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        KycCmsContentData data;
        super.j();
        if (((MayaKycSimpleCaptureV3Fragment) ((K8.E) this.c.get())).requireContext().getPackageManager().hasSystemFeature("android.hardware.camera")) {
            l(ContextCompat.checkSelfPermission(((MayaKycSimpleCaptureV3Fragment) ((K8.E) this.c.get())).requireContext(), "android.permission.CAMERA") == 0);
        }
        if (((MayaKycSimpleCaptureV3Fragment) ((K8.E) this.c.get())).P1().equals("BACK")) {
            MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment = (MayaKycSimpleCaptureV3Fragment) ((K8.E) this.c.get());
            TextView textView = (TextView) ((C0473p0) mayaKycSimpleCaptureV3Fragment.G1()).f4177b.f3765p;
            String string = mayaKycSimpleCaptureV3Fragment.getString(R.string.maya_kyc_simple_capture_scan_back_title);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            MayaKycSimpleCaptureV3Fragment.Y1(textView, string);
        } else {
            MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment2 = (MayaKycSimpleCaptureV3Fragment) ((K8.E) this.c.get());
            TextView textView2 = (TextView) ((C0473p0) mayaKycSimpleCaptureV3Fragment2.G1()).f4177b.f3765p;
            String string2 = mayaKycSimpleCaptureV3Fragment2.getString(R.string.maya_kyc_simple_capture_scan_front_title);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            MayaKycSimpleCaptureV3Fragment.Y1(textView2, string2);
        }
        KeyEventDispatcher.Component componentRequireActivity = ((MayaKycSimpleCaptureV3Fragment) ((K8.E) this.c.get())).requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().f;
        List<KycLivePhotoTip> tips = (kycCmsContent == null || (data = kycCmsContent.getData()) == null) ? null : data.getLivePhotoTips();
        if (tips == null) {
            tips = C1112C.f9377a;
        }
        if (tips.isEmpty()) {
            ((ConstraintLayout) ((C0473p0) ((MayaKycSimpleCaptureV3Fragment) ((K8.E) this.c.get())).G1()).f4177b.f3759d).setVisibility(8);
            return;
        }
        MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment3 = (MayaKycSimpleCaptureV3Fragment) ((K8.E) this.c.get());
        mayaKycSimpleCaptureV3Fragment3.getClass();
        kotlin.jvm.internal.j.g(tips, "tips");
        N5.M m = ((C0473p0) mayaKycSimpleCaptureV3Fragment3.G1()).f4177b;
        ((ConstraintLayout) m.f3759d).setVisibility(0);
        LinearLayout linearLayout = (LinearLayout) m.f3760g;
        linearLayout.removeAllViews();
        int i = 0;
        for (KycLivePhotoTip kycLivePhotoTip : tips) {
            i++;
            View viewInflate = mayaKycSimpleCaptureV3Fragment3.getLayoutInflater().inflate(R.layout.maya_kyc_simple_capture_v3_camera_tips, (ViewGroup) null, false);
            int i4 = R.id.text_view_tips_bullet;
            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_tips_bullet);
            if (textView3 != null) {
                i4 = R.id.text_view_tips_description;
                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_tips_description);
                if (textView4 != null) {
                    textView3.setText(String.valueOf(i));
                    textView4.setText(kycLivePhotoTip.getDescription());
                    linearLayout.addView((ConstraintLayout) viewInflate);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
        }
    }

    public final void k() {
        if (((MayaKycSimpleCaptureV3Fragment) ((K8.E) this.c.get())).P1().equals("BACK")) {
            MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment = (MayaKycSimpleCaptureV3Fragment) ((K8.E) this.c.get());
            FrameLayout frameLayout = ((C0473p0) mayaKycSimpleCaptureV3Fragment.G1()).f4176a;
            kotlin.jvm.internal.j.f(frameLayout, "getRoot(...)");
            E1.c.m(Navigation.findNavController(frameLayout), new C0351e2(T2.j(mayaKycSimpleCaptureV3Fragment)));
            KeyEventDispatcher.Component componentRequireActivity = ((MayaKycSimpleCaptureV3Fragment) ((K8.E) this.c.get())).requireActivity();
            kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
            ((MayaKycActivity) ((H8.b) componentRequireActivity)).g2();
            return;
        }
        MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment2 = (MayaKycSimpleCaptureV3Fragment) ((K8.E) this.c.get());
        KeyEventDispatcher.Component componentRequireActivity2 = mayaKycSimpleCaptureV3Fragment2.requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        String string = mayaKycSimpleCaptureV3Fragment2.getString(R.string.maya_fragment_kyc_simple_capture_screen_label);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        String string2 = mayaKycSimpleCaptureV3Fragment2.getString(R.string.maya_fragment_kyc_submit_id_screen_label);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        ((MayaKycActivity) ((H8.b) componentRequireActivity2)).h2(string, string2);
        KeyEventDispatcher.Component componentRequireActivity3 = mayaKycSimpleCaptureV3Fragment2.requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity3, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((H8.b) componentRequireActivity3)).i2(false);
    }

    public final void l(boolean z4) {
        int i = 3;
        int i4 = 2;
        if (!z4) {
            MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment = (MayaKycSimpleCaptureV3Fragment) ((K8.E) this.c.get());
            com.paymaya.common.utility.C.r0(((C0473p0) mayaKycSimpleCaptureV3Fragment.G1()).c.c, new W1(mayaKycSimpleCaptureV3Fragment, i));
            ((C0473p0) mayaKycSimpleCaptureV3Fragment.G1()).c.f3580b.setVisibility(0);
            ((ConstraintLayout) ((C0473p0) mayaKycSimpleCaptureV3Fragment.G1()).f4177b.c).setVisibility(8);
            return;
        }
        MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment2 = (MayaKycSimpleCaptureV3Fragment) ((K8.E) this.c.get());
        ((C0473p0) mayaKycSimpleCaptureV3Fragment2.G1()).c.f3580b.setVisibility(8);
        ((ConstraintLayout) ((C0473p0) mayaKycSimpleCaptureV3Fragment2.G1()).f4177b.c).setVisibility(0);
        MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment3 = (MayaKycSimpleCaptureV3Fragment) ((K8.E) this.c.get());
        List listG = C1132s.g(mayaKycSimpleCaptureV3Fragment3.M1(), mayaKycSimpleCaptureV3Fragment3.L1(), mayaKycSimpleCaptureV3Fragment3.K1());
        if (!(listG instanceof Collection) || !listG.isEmpty()) {
            Iterator it = listG.iterator();
            while (it.hasNext()) {
                if (((UseCase) it.next()) == null) {
                    KeyEventDispatcher.Component componentRequireActivity = mayaKycSimpleCaptureV3Fragment3.requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    MayaKycActivity mayaKycActivity = (MayaKycActivity) ((H8.b) componentRequireActivity);
                    mayaKycActivity.f12446n = new C0368j(mayaKycSimpleCaptureV3Fragment3.V1(), i4);
                    mayaKycActivity.f12447o = new C0372k(mayaKycSimpleCaptureV3Fragment3.V1(), i4);
                    FrameLayout frameLayout = ((C0473p0) mayaKycSimpleCaptureV3Fragment3.G1()).f4176a;
                    kotlin.jvm.internal.j.f(frameLayout, "getRoot(...)");
                    E1.c.m(ViewKt.findNavController(frameLayout), new C0355f2(mayaKycActivity.s().toString()));
                    return;
                }
            }
        }
        MayaEKYCSelectedDocument mayaEKYCSelectedDocumentO1 = mayaKycSimpleCaptureV3Fragment3.O1();
        if (C1110A.v(MayaKycSimpleCaptureV3Fragment.f12597i0, mayaEKYCSelectedDocumentO1 != null ? mayaEKYCSelectedDocumentO1.getKey() : null) && mayaKycSimpleCaptureV3Fragment3.P1().equals("BACK")) {
            C0221d c0221d = mayaKycSimpleCaptureV3Fragment3.f12605d0;
            if (c0221d == null) {
                kotlin.jvm.internal.j.n("cameraXUtils");
                throw null;
            }
            Preview previewM1 = mayaKycSimpleCaptureV3Fragment3.M1();
            ImageCapture imageCaptureL1 = mayaKycSimpleCaptureV3Fragment3.L1();
            ProcessCameraProvider.Companion companion = ProcessCameraProvider.Companion;
            Context context = c0221d.f1279a;
            S1.y companion2 = companion.getInstance(context);
            companion2.addListener(new RunnableC0219b(companion2, c0221d, previewM1, imageCaptureL1, 0), ContextCompat.getMainExecutor(context));
            return;
        }
        C0221d c0221d2 = mayaKycSimpleCaptureV3Fragment3.f12605d0;
        if (c0221d2 == null) {
            kotlin.jvm.internal.j.n("cameraXUtils");
            throw null;
        }
        Preview previewM12 = mayaKycSimpleCaptureV3Fragment3.M1();
        ImageCapture imageCaptureL12 = mayaKycSimpleCaptureV3Fragment3.L1();
        ImageAnalysis imageAnalysisK1 = mayaKycSimpleCaptureV3Fragment3.K1();
        ProcessCameraProvider.Companion companion3 = ProcessCameraProvider.Companion;
        Context context2 = c0221d2.f1279a;
        S1.y companion4 = companion3.getInstance(context2);
        companion4.addListener(new RunnableC0218a(companion4, c0221d2, imageAnalysisK1, previewM12, imageCaptureL12, 0), ContextCompat.getMainExecutor(context2));
    }
}
