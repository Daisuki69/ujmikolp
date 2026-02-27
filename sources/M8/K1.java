package M8;

import android.content.Intent;
import android.hardware.Camera;
import android.net.Uri;
import androidx.activity.result.ActivityResultLauncher;
import cj.C1132s;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class K1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaKycSimpleCaptureFragment f3188b;

    public /* synthetic */ K1(MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment, int i) {
        this.f3187a = i;
        this.f3188b = mayaKycSimpleCaptureFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3187a) {
            case 0:
                D8.J jL1 = this.f3188b.L1();
                if (((MayaKycSimpleCaptureFragment) ((K8.C) jL1.c.get())).K1().equals("BACK")) {
                    MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment = (MayaKycSimpleCaptureFragment) ((K8.C) jL1.c.get());
                    MayaEKYCSelectedDocument mayaEKYCSelectedDocumentN1 = mayaKycSimpleCaptureFragment.N1();
                    if (mayaEKYCSelectedDocumentN1 != null) {
                        C1219h c1219h = new C1219h();
                        c1219h.r(EnumC1216e.SIMPLE_CAPTURE_BACK);
                        c1219h.n(31);
                        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                        c1219h.j.put("ID_type", mayaEKYCSelectedDocumentN1.getKey());
                        c1219h.i();
                        mayaKycSimpleCaptureFragment.z1(c1219h);
                    }
                } else {
                    MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment2 = (MayaKycSimpleCaptureFragment) ((K8.C) jL1.c.get());
                    MayaEKYCSelectedDocument mayaEKYCSelectedDocumentN12 = mayaKycSimpleCaptureFragment2.N1();
                    if (mayaEKYCSelectedDocumentN12 != null) {
                        C1219h c1219h2 = new C1219h();
                        c1219h2.r(EnumC1216e.SIMPLE_CAPTURE_FRONT);
                        c1219h2.n(31);
                        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                        c1219h2.j.put("ID_type", mayaEKYCSelectedDocumentN12.getKey());
                        c1219h2.i();
                        mayaKycSimpleCaptureFragment2.z1(c1219h2);
                    }
                }
                jL1.l(new Ag.k(jL1, 9));
                return Unit.f18162a;
            case 1:
                MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment3 = this.f3188b;
                E8.r rVar = (E8.r) mayaKycSimpleCaptureFragment3.f12588Y.getValue();
                Camera camera = rVar.c;
                if (camera != null) {
                    camera.stopPreview();
                    camera.release();
                    rVar.c = null;
                }
                mayaKycSimpleCaptureFragment3.L1().f.d();
                return Unit.f18162a;
            case 2:
                return new E8.r(C1132s.g(new Pair(1920, 1080), new Pair(1280, 720), new Pair(720, 480)), new C0419w(1, this.f3188b.L1(), D8.J.class, "runOnCameraThread", "runOnCameraThread(Lkotlin/jvm/functions/Function0;)V", 0, 28));
            default:
                MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment4 = this.f3188b;
                if (mayaKycSimpleCaptureFragment4.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    Uri uriFromParts = Uri.fromParts("package", mayaKycSimpleCaptureFragment4.requireActivity().getPackageName(), null);
                    kotlin.jvm.internal.j.f(uriFromParts, "fromParts(...)");
                    intent.setData(uriFromParts);
                    mayaKycSimpleCaptureFragment4.startActivity(intent);
                } else {
                    ActivityResultLauncher activityResultLauncher = mayaKycSimpleCaptureFragment4.f12587X;
                    if (activityResultLauncher == null) {
                        kotlin.jvm.internal.j.n("requestPermissionLauncher");
                        throw null;
                    }
                    activityResultLauncher.launch("android.permission.CAMERA");
                }
                return Unit.f18162a;
        }
    }
}
