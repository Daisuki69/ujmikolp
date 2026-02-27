package M8;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResultLauncher;
import androidx.camera.core.ImageCapture;
import androidx.core.content.ContextCompat;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureV3Fragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class W1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaKycSimpleCaptureV3Fragment f3243b;

    public /* synthetic */ W1(MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment, int i) {
        this.f3242a = i;
        this.f3243b = mayaKycSimpleCaptureV3Fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3242a) {
            case 0:
                MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment = this.f3243b;
                List list = MayaKycSimpleCaptureV3Fragment.f12596h0;
                MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment2 = (MayaKycSimpleCaptureV3Fragment) ((K8.E) mayaKycSimpleCaptureV3Fragment.V1().c.get());
                ImageCapture imageCapture = mayaKycSimpleCaptureV3Fragment2.f12602a0;
                if (imageCapture != null) {
                    imageCapture.lambda$takePicture$1(ContextCompat.getMainExecutor(mayaKycSimpleCaptureV3Fragment2.requireContext()), new C0339b2(mayaKycSimpleCaptureV3Fragment2));
                }
                return Unit.f18162a;
            case 1:
                List list2 = MayaKycSimpleCaptureV3Fragment.f12596h0;
                this.f3243b.Z1(false);
                return Unit.f18162a;
            case 2:
                List list3 = MayaKycSimpleCaptureV3Fragment.f12596h0;
                this.f3243b.Z1(false);
                return Unit.f18162a;
            default:
                List list4 = MayaKycSimpleCaptureV3Fragment.f12596h0;
                MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment3 = this.f3243b;
                if (mayaKycSimpleCaptureV3Fragment3.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    Uri uriFromParts = Uri.fromParts("package", mayaKycSimpleCaptureV3Fragment3.requireActivity().getPackageName(), null);
                    kotlin.jvm.internal.j.f(uriFromParts, "fromParts(...)");
                    intent.setData(uriFromParts);
                    mayaKycSimpleCaptureV3Fragment3.startActivity(intent);
                } else {
                    ActivityResultLauncher activityResultLauncher = mayaKycSimpleCaptureV3Fragment3.f12603b0;
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
