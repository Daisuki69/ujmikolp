package D8;

import D.C0190x;
import D.CallableC0168a;
import M8.K1;
import M8.O1;
import M8.T2;
import N5.C0462k;
import N5.C0469n0;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.Navigation;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycLivePhotoTip;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import w.C2361c;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class J extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Nh.t f1017d;
    public final com.paymaya.data.preference.a e;
    public final Dh.c f = new Dh.c(1);

    public J(Nh.t tVar, com.paymaya.data.preference.a aVar) {
        this.f1017d = tVar;
        this.e = aVar;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        KycCmsContentData data;
        super.j();
        if (((MayaKycSimpleCaptureFragment) ((K8.C) this.c.get())).requireContext().getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            m(ContextCompat.checkSelfPermission(((MayaKycSimpleCaptureFragment) ((K8.C) this.c.get())).requireContext(), "android.permission.CAMERA") == 0);
        }
        if (((MayaKycSimpleCaptureFragment) ((K8.C) this.c.get())).K1().equals("BACK")) {
            MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment = (MayaKycSimpleCaptureFragment) ((K8.C) this.c.get());
            ((TextView) ((C0469n0) mayaKycSimpleCaptureFragment.G1()).f4163b.i).setText(mayaKycSimpleCaptureFragment.getString(R.string.maya_kyc_simple_capture_back_id_title));
        } else {
            MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment2 = (MayaKycSimpleCaptureFragment) ((K8.C) this.c.get());
            ((TextView) ((C0469n0) mayaKycSimpleCaptureFragment2.G1()).f4163b.i).setText(mayaKycSimpleCaptureFragment2.getString(R.string.maya_kyc_simple_capture_front_id_title));
        }
        KeyEventDispatcher.Component componentRequireActivity = ((MayaKycSimpleCaptureFragment) ((K8.C) this.c.get())).requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().f;
        List<KycLivePhotoTip> livePhotoTips = (kycCmsContent == null || (data = kycCmsContent.getData()) == null) ? null : data.getLivePhotoTips();
        if (livePhotoTips == null) {
            livePhotoTips = C1112C.f9377a;
        }
        if (livePhotoTips.isEmpty()) {
            ConstraintLayout constraintViewTipsForCapturing = (ConstraintLayout) ((C0469n0) ((MayaKycSimpleCaptureFragment) ((K8.C) this.c.get())).G1()).f4163b.f;
            kotlin.jvm.internal.j.f(constraintViewTipsForCapturing, "constraintViewTipsForCapturing");
            constraintViewTipsForCapturing.setVisibility(8);
            return;
        }
        K8.C c = (K8.C) this.c.get();
        Iterator<KycLivePhotoTip> it = livePhotoTips.iterator();
        String tips = "";
        while (it.hasNext()) {
            tips = androidx.camera.core.impl.a.j(tips, " \n• ", it.next().getDescription());
        }
        MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment3 = (MayaKycSimpleCaptureFragment) c;
        mayaKycSimpleCaptureFragment3.getClass();
        kotlin.jvm.internal.j.g(tips, "tips");
        C0462k c0462k = ((C0469n0) mayaKycSimpleCaptureFragment3.G1()).f4163b;
        ConstraintLayout constraintViewTipsForCapturing2 = (ConstraintLayout) c0462k.f;
        kotlin.jvm.internal.j.f(constraintViewTipsForCapturing2, "constraintViewTipsForCapturing");
        constraintViewTipsForCapturing2.setVisibility(0);
        ((TextView) c0462k.e).setText(We.s.i(mayaKycSimpleCaptureFragment3.getString(R.string.maya_kyc_simple_capture_tips_header), tips));
    }

    public final void k() {
        if (!((MayaKycSimpleCaptureFragment) ((K8.C) this.c.get())).K1().equals("BACK")) {
            FrameLayout frameLayout = ((C0469n0) ((MayaKycSimpleCaptureFragment) ((K8.C) this.c.get())).G1()).f4162a;
            kotlin.jvm.internal.j.f(frameLayout, "getRoot(...)");
            Navigation.findNavController(frameLayout).popBackStack();
        } else {
            MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment = (MayaKycSimpleCaptureFragment) ((K8.C) this.c.get());
            FrameLayout frameLayout2 = ((C0469n0) mayaKycSimpleCaptureFragment.G1()).f4162a;
            kotlin.jvm.internal.j.f(frameLayout2, "getRoot(...)");
            E1.c.m(Navigation.findNavController(frameLayout2), new O1(T2.j(mayaKycSimpleCaptureFragment)));
        }
    }

    public final void l(Function0 action) {
        kotlin.jvm.internal.j.g(action, "action");
        this.f.a(new Hh.c(new Hh.c(new H(1, action), 1).f(this.f1017d), 2).c());
    }

    public final void m(boolean z4) {
        if (!z4) {
            MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment = (MayaKycSimpleCaptureFragment) ((K8.C) this.c.get());
            com.paymaya.common.utility.C.r0(((C0469n0) mayaKycSimpleCaptureFragment.G1()).c.c, new K1(mayaKycSimpleCaptureFragment, 3));
            ((C0469n0) mayaKycSimpleCaptureFragment.G1()).c.f3580b.setVisibility(0);
            ((ConstraintLayout) ((C0469n0) mayaKycSimpleCaptureFragment.G1()).f4163b.f4131b).setVisibility(8);
            return;
        }
        MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment2 = (MayaKycSimpleCaptureFragment) ((K8.C) this.c.get());
        ((C0469n0) mayaKycSimpleCaptureFragment2.G1()).c.f3580b.setVisibility(8);
        ((ConstraintLayout) ((C0469n0) mayaKycSimpleCaptureFragment2.G1()).f4163b.f4131b).setVisibility(0);
        mayaKycSimpleCaptureFragment2.M1().getHolder().addCallback((E8.r) mayaKycSimpleCaptureFragment2.f12588Y.getValue());
        mayaKycSimpleCaptureFragment2.M1().getHolder().setType(3);
        Lh.d dVar = new Lh.d(new Lh.h(new Kh.J(new CallableC0168a(new C0190x(0, this.c.get(), K8.C.class, "prepareCamera", "prepareCamera()Landroid/hardware/Camera$Size;", 0, 12), 4), 3).h(this.f1017d), zh.b.a(), 0), new C2361c(new Ag.f(1, this.c.get(), K8.C.class, "setSurfaceViewRatio", "setSurfaceViewRatio(Landroid/hardware/Camera$Size;)V", 0, 4), 15), 2);
        Jh.a aVar = new Jh.a();
        try {
            dVar.f(new Jh.b(aVar, 0));
            this.f.a(aVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            throw AbstractC1213b.L(th2, "subscribeActual failed", th2);
        }
    }
}
