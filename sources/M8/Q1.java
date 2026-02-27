package M8;

import E8.C0221d;
import N5.C0471o0;
import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.MeteringPointFactory;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureV2Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Q1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaKycSimpleCaptureV2Fragment f3216b;

    public /* synthetic */ Q1(MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment, int i) {
        this.f3215a = i;
        this.f3216b = mayaKycSimpleCaptureV2Fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 2;
        switch (this.f3215a) {
            case 0:
                D8.K kN1 = this.f3216b.N1();
                if (((MayaKycSimpleCaptureV2Fragment) ((K8.D) kN1.c.get())).K1().equals("BACK")) {
                    MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment = (MayaKycSimpleCaptureV2Fragment) ((K8.D) kN1.c.get());
                    MayaEKYCSelectedDocument mayaEKYCSelectedDocumentO1 = mayaKycSimpleCaptureV2Fragment.O1();
                    if (mayaEKYCSelectedDocumentO1 != null) {
                        C1219h c1219h = new C1219h();
                        c1219h.r(EnumC1216e.SIMPLE_CAPTURE_BACK);
                        c1219h.n(31);
                        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                        c1219h.j.put("ID_type", mayaEKYCSelectedDocumentO1.getKey());
                        c1219h.i();
                        mayaKycSimpleCaptureV2Fragment.z1(c1219h);
                    }
                } else {
                    MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment2 = (MayaKycSimpleCaptureV2Fragment) ((K8.D) kN1.c.get());
                    MayaEKYCSelectedDocument mayaEKYCSelectedDocumentO12 = mayaKycSimpleCaptureV2Fragment2.O1();
                    if (mayaEKYCSelectedDocumentO12 != null) {
                        C1219h c1219h2 = new C1219h();
                        c1219h2.r(EnumC1216e.SIMPLE_CAPTURE_FRONT);
                        c1219h2.n(31);
                        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                        c1219h2.j.put("ID_type", mayaEKYCSelectedDocumentO12.getKey());
                        c1219h2.i();
                        mayaKycSimpleCaptureV2Fragment2.z1(c1219h2);
                    }
                }
                MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment3 = (MayaKycSimpleCaptureV2Fragment) ((K8.D) kN1.c.get());
                ((TextView) ((C0471o0) mayaKycSimpleCaptureV2Fragment3.G1()).f4169b.f3588g).setEnabled(false);
                TextView textView = (TextView) ((C0471o0) mayaKycSimpleCaptureV2Fragment3.G1()).f4169b.i;
                textView.setText(mayaKycSimpleCaptureV2Fragment3.getString(R.string.maya_kyc_simple_capture_status_focusing));
                textView.setVisibility(0);
                ((ConstraintLayout) ((C0471o0) mayaKycSimpleCaptureV2Fragment3.G1()).f4169b.c).setBackground(ContextCompat.getDrawable(mayaKycSimpleCaptureV2Fragment3.requireContext(), R.drawable.maya_bg_selector_button_black_inactive));
                MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment4 = (MayaKycSimpleCaptureV2Fragment) ((K8.D) kN1.c.get());
                float x6 = mayaKycSimpleCaptureV2Fragment4.L1().getX() + (mayaKycSimpleCaptureV2Fragment4.L1().getWidth() / 2);
                float y7 = mayaKycSimpleCaptureV2Fragment4.L1().getY() + (mayaKycSimpleCaptureV2Fragment4.L1().getHeight() / 2);
                C0221d c0221d = mayaKycSimpleCaptureV2Fragment4.f12594a0;
                if (c0221d == null) {
                    kotlin.jvm.internal.j.n("cameraXUtils");
                    throw null;
                }
                MeteringPointFactory meteringPointFactory = mayaKycSimpleCaptureV2Fragment4.M1().getMeteringPointFactory();
                kotlin.jvm.internal.j.f(meteringPointFactory, "getMeteringPointFactory(...)");
                c0221d.a(meteringPointFactory, x6, y7, new Q1(mayaKycSimpleCaptureV2Fragment4, i), new Q1(mayaKycSimpleCaptureV2Fragment4, 3), true);
                return Unit.f18162a;
            case 1:
                MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment5 = this.f3216b;
                if (mayaKycSimpleCaptureV2Fragment5.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    Uri uriFromParts = Uri.fromParts("package", mayaKycSimpleCaptureV2Fragment5.requireActivity().getPackageName(), null);
                    kotlin.jvm.internal.j.f(uriFromParts, "fromParts(...)");
                    intent.setData(uriFromParts);
                    mayaKycSimpleCaptureV2Fragment5.startActivity(intent);
                } else {
                    ActivityResultLauncher activityResultLauncher = mayaKycSimpleCaptureV2Fragment5.f12592Y;
                    if (activityResultLauncher == null) {
                        kotlin.jvm.internal.j.n("requestPermissionLauncher");
                        throw null;
                    }
                    activityResultLauncher.launch("android.permission.CAMERA");
                }
                return Unit.f18162a;
            case 2:
                MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment6 = (MayaKycSimpleCaptureV2Fragment) ((K8.D) this.f3216b.N1().c.get());
                ImageCapture imageCapture = mayaKycSimpleCaptureV2Fragment6.f12591X;
                if (imageCapture != null) {
                    imageCapture.lambda$takePicture$1(ContextCompat.getMainExecutor(mayaKycSimpleCaptureV2Fragment6.requireContext()), new S1(mayaKycSimpleCaptureV2Fragment6));
                }
                return Unit.f18162a;
            default:
                MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment7 = this.f3216b;
                try {
                    ((TextView) ((C0471o0) mayaKycSimpleCaptureV2Fragment7.G1()).f4169b.f3588g).setEnabled(true);
                    ((TextView) ((C0471o0) mayaKycSimpleCaptureV2Fragment7.G1()).f4169b.i).setText(mayaKycSimpleCaptureV2Fragment7.getString(R.string.maya_kyc_simple_capture_status_retrying));
                    ((ConstraintLayout) ((C0471o0) mayaKycSimpleCaptureV2Fragment7.G1()).f4169b.c).setBackground(ContextCompat.getDrawable(mayaKycSimpleCaptureV2Fragment7.requireContext(), R.drawable.maya_bg_selector_button_black));
                    break;
                } catch (Exception unused) {
                }
                return Unit.f18162a;
        }
    }
}
