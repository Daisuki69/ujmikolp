package M8;

import android.content.Intent;
import android.hardware.Camera;
import android.net.Uri;
import androidx.activity.result.ActivityResultLauncher;
import cj.C1132s;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycMinorTakeAPhotoFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: M8.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0417v1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaKycMinorTakeAPhotoFragment f3378b;

    public /* synthetic */ C0417v1(MayaKycMinorTakeAPhotoFragment mayaKycMinorTakeAPhotoFragment, int i) {
        this.f3377a = i;
        this.f3378b = mayaKycMinorTakeAPhotoFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MayaKycMinorTakeAPhotoFragment mayaKycMinorTakeAPhotoFragment = this.f3378b;
        switch (this.f3377a) {
            case 0:
                D8.I iL1 = mayaKycMinorTakeAPhotoFragment.L1();
                iL1.k(new Ag.k(iL1, 8));
                return Unit.f18162a;
            case 1:
                E8.r rVar = (E8.r) mayaKycMinorTakeAPhotoFragment.f12571a0.getValue();
                Camera camera = rVar.c;
                if (camera != null) {
                    camera.stopPreview();
                    camera.release();
                    rVar.c = null;
                }
                mayaKycMinorTakeAPhotoFragment.L1().e.d();
                return Unit.f18162a;
            case 2:
                return new E8.r(C1132s.g(new Pair(1920, 1080), new Pair(1280, 720), new Pair(720, 480)), new C0419w(1, mayaKycMinorTakeAPhotoFragment.L1(), D8.I.class, "runOnCameraThread", "runOnCameraThread(Lkotlin/jvm/functions/Function0;)V", 0, 26));
            default:
                if (mayaKycMinorTakeAPhotoFragment.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    Uri uriFromParts = Uri.fromParts("package", mayaKycMinorTakeAPhotoFragment.requireActivity().getPackageName(), null);
                    kotlin.jvm.internal.j.f(uriFromParts, "fromParts(...)");
                    intent.setData(uriFromParts);
                    mayaKycMinorTakeAPhotoFragment.startActivity(intent);
                } else {
                    ActivityResultLauncher activityResultLauncher = mayaKycMinorTakeAPhotoFragment.f12568X;
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
