package D8;

import E8.C0221d;
import E8.RunnableC0219b;
import M8.Q1;
import M8.T2;
import M8.U1;
import N5.C0471o0;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.Navigation;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycLivePhotoTip;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureV2Fragment;
import java.util.Iterator;
import java.util.List;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f1018d;

    public K(Nh.t tVar, com.paymaya.data.preference.a aVar) {
        this.f1018d = aVar;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        KycCmsContentData data;
        super.j();
        if (((MayaKycSimpleCaptureV2Fragment) ((K8.D) this.c.get())).requireContext().getPackageManager().hasSystemFeature("android.hardware.camera")) {
            k(ContextCompat.checkSelfPermission(((MayaKycSimpleCaptureV2Fragment) ((K8.D) this.c.get())).requireContext(), "android.permission.CAMERA") == 0);
        }
        if (((MayaKycSimpleCaptureV2Fragment) ((K8.D) this.c.get())).K1().equals("BACK")) {
            MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment = (MayaKycSimpleCaptureV2Fragment) ((K8.D) this.c.get());
            ((TextView) ((C0471o0) mayaKycSimpleCaptureV2Fragment.G1()).f4169b.j).setText(mayaKycSimpleCaptureV2Fragment.getString(R.string.maya_kyc_simple_capture_back_id_title));
        } else {
            MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment2 = (MayaKycSimpleCaptureV2Fragment) ((K8.D) this.c.get());
            ((TextView) ((C0471o0) mayaKycSimpleCaptureV2Fragment2.G1()).f4169b.j).setText(mayaKycSimpleCaptureV2Fragment2.getString(R.string.maya_kyc_simple_capture_front_id_title));
        }
        KeyEventDispatcher.Component componentRequireActivity = ((MayaKycSimpleCaptureV2Fragment) ((K8.D) this.c.get())).requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().f;
        List<KycLivePhotoTip> livePhotoTips = (kycCmsContent == null || (data = kycCmsContent.getData()) == null) ? null : data.getLivePhotoTips();
        if (livePhotoTips == null) {
            livePhotoTips = C1112C.f9377a;
        }
        if (livePhotoTips.isEmpty()) {
            ((ConstraintLayout) ((C0471o0) ((MayaKycSimpleCaptureV2Fragment) ((K8.D) this.c.get())).G1()).f4169b.e).setVisibility(8);
            return;
        }
        K8.D d10 = (K8.D) this.c.get();
        Iterator<KycLivePhotoTip> it = livePhotoTips.iterator();
        String tips = "";
        while (it.hasNext()) {
            tips = androidx.camera.core.impl.a.j(tips, " \n• ", it.next().getDescription());
        }
        MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment3 = (MayaKycSimpleCaptureV2Fragment) d10;
        mayaKycSimpleCaptureV2Fragment3.getClass();
        kotlin.jvm.internal.j.g(tips, "tips");
        N5.E e = ((C0471o0) mayaKycSimpleCaptureV2Fragment3.G1()).f4169b;
        ((ConstraintLayout) e.e).setVisibility(0);
        ((TextView) e.h).setText(We.s.i(mayaKycSimpleCaptureV2Fragment3.getString(R.string.maya_kyc_simple_capture_tips_header), tips));
    }

    public final void k(boolean z4) {
        if (!z4) {
            MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment = (MayaKycSimpleCaptureV2Fragment) ((K8.D) this.c.get());
            com.paymaya.common.utility.C.r0(((C0471o0) mayaKycSimpleCaptureV2Fragment.G1()).c.c, new Q1(mayaKycSimpleCaptureV2Fragment, 1));
            ((C0471o0) mayaKycSimpleCaptureV2Fragment.G1()).c.f3580b.setVisibility(0);
            ((ConstraintLayout) ((C0471o0) mayaKycSimpleCaptureV2Fragment.G1()).f4169b.f3587d).setVisibility(8);
            return;
        }
        MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment2 = (MayaKycSimpleCaptureV2Fragment) ((K8.D) this.c.get());
        ((C0471o0) mayaKycSimpleCaptureV2Fragment2.G1()).c.f3580b.setVisibility(8);
        ((ConstraintLayout) ((C0471o0) mayaKycSimpleCaptureV2Fragment2.G1()).f4169b.f3587d).setVisibility(0);
        MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment3 = (MayaKycSimpleCaptureV2Fragment) ((K8.D) this.c.get());
        C0221d c0221d = mayaKycSimpleCaptureV2Fragment3.f12594a0;
        if (c0221d == null) {
            kotlin.jvm.internal.j.n("cameraXUtils");
            throw null;
        }
        Preview.Builder builder = new Preview.Builder();
        C0221d c0221d2 = mayaKycSimpleCaptureV2Fragment3.f12594a0;
        if (c0221d2 == null) {
            kotlin.jvm.internal.j.n("cameraXUtils");
            throw null;
        }
        Preview.Builder targetResolution = builder.setTargetResolution(C0221d.b(c0221d2));
        kotlin.jvm.internal.j.f(targetResolution, "setTargetResolution(...)");
        if (mayaKycSimpleCaptureV2Fragment3.M1().getDisplay() != null) {
            targetResolution.setTargetRotation(mayaKycSimpleCaptureV2Fragment3.M1().getDisplay().getRotation());
        }
        Preview previewBuild = targetResolution.build();
        kotlin.jvm.internal.j.f(previewBuild, "build(...)");
        previewBuild.setSurfaceProvider(mayaKycSimpleCaptureV2Fragment3.M1().getSurfaceProvider());
        ImageCapture.Builder builder2 = new ImageCapture.Builder();
        C0221d c0221d3 = mayaKycSimpleCaptureV2Fragment3.f12594a0;
        if (c0221d3 == null) {
            kotlin.jvm.internal.j.n("cameraXUtils");
            throw null;
        }
        ImageCapture.Builder targetResolution2 = builder2.setTargetResolution(C0221d.b(c0221d3));
        kotlin.jvm.internal.j.f(targetResolution2, "setTargetResolution(...)");
        if (mayaKycSimpleCaptureV2Fragment3.M1().getDisplay() != null) {
            targetResolution2.setTargetRotation(mayaKycSimpleCaptureV2Fragment3.M1().getDisplay().getRotation());
        }
        ImageCapture imageCaptureBuild = targetResolution2.build();
        kotlin.jvm.internal.j.f(imageCaptureBuild, "build(...)");
        mayaKycSimpleCaptureV2Fragment3.f12591X = imageCaptureBuild;
        ProcessCameraProvider.Companion companion = ProcessCameraProvider.Companion;
        Context context = c0221d.f1279a;
        S1.y companion2 = companion.getInstance(context);
        companion2.addListener(new RunnableC0219b(companion2, c0221d, previewBuild, imageCaptureBuild, 0), ContextCompat.getMainExecutor(context));
    }

    public final void l() {
        if (!((MayaKycSimpleCaptureV2Fragment) ((K8.D) this.c.get())).K1().equals("BACK")) {
            KeyEventDispatcher.Component componentRequireActivity = ((MayaKycSimpleCaptureV2Fragment) ((K8.D) this.c.get())).requireActivity();
            kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
            ((MayaKycActivity) ((H8.b) componentRequireActivity)).i2(true);
            return;
        }
        MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment = (MayaKycSimpleCaptureV2Fragment) ((K8.D) this.c.get());
        FrameLayout frameLayout = ((C0471o0) mayaKycSimpleCaptureV2Fragment.G1()).f4168a;
        kotlin.jvm.internal.j.f(frameLayout, "getRoot(...)");
        E1.c.m(Navigation.findNavController(frameLayout), new U1(T2.j(mayaKycSimpleCaptureV2Fragment)));
        KeyEventDispatcher.Component componentRequireActivity2 = ((MayaKycSimpleCaptureV2Fragment) ((K8.D) this.c.get())).requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((H8.b) componentRequireActivity2)).g2();
    }
}
