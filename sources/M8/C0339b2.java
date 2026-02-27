package M8;

import N5.C0473p0;
import android.media.Image;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.navigation.Navigation;
import cj.C1129o;
import com.paymaya.R;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureV3Fragment;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: M8.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0339b2 extends ImageCapture.OnImageCapturedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaKycSimpleCaptureV3Fragment f3273a;

    public C0339b2(MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment) {
        this.f3273a = mayaKycSimpleCaptureV3Fragment;
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public final void onCaptureSuccess(ImageProxy imageProxy) {
        byte[] bArr;
        kotlin.jvm.internal.j.g(imageProxy, "imageProxy");
        int rotationDegrees = imageProxy.getImageInfo().getRotationDegrees();
        E8.k kVar = E8.k.f1285a;
        Image image = imageProxy.getImage();
        if (image == null) {
            bArr = null;
        } else {
            Image.Plane[] planes = image.getPlanes();
            kotlin.jvm.internal.j.d(planes);
            ByteBuffer buffer = ((Image.Plane) C1129o.r(planes)).getBuffer();
            bArr = new byte[buffer.remaining()];
            buffer.get(bArr);
        }
        D8.L lV1 = this.f3273a.V1();
        if (lV1.g()) {
            if (lV1.f1019d.e().isShortenedFlowIdCaptureV2Enabled() || lV1.f1019d.e().isShortenedFlowIdCaptureV3Enabled()) {
                E8.k.f1286b = lV1.f1019d.e().isShortenedFlowIdCaptureV21080pEnabled();
                MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment = (MayaKycSimpleCaptureV3Fragment) ((K8.E) lV1.c.get());
                byte[] bArrF = kVar.f(bArr, rotationDegrees, mayaKycSimpleCaptureV3Fragment.U1().getHeight(), mayaKycSimpleCaptureV3Fragment.Q1().getHeight(), mayaKycSimpleCaptureV3Fragment.Q1().getTop());
                if (mayaKycSimpleCaptureV3Fragment.O1() != null && bArrF != null) {
                    File cacheDir = mayaKycSimpleCaptureV3Fragment.requireContext().getCacheDir();
                    kotlin.jvm.internal.j.f(cacheDir, "getCacheDir(...)");
                    E8.k.e(cacheDir, mayaKycSimpleCaptureV3Fragment.O1(), bArrF);
                }
            } else {
                MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment2 = (MayaKycSimpleCaptureV3Fragment) ((K8.E) lV1.c.get());
                mayaKycSimpleCaptureV3Fragment2.getClass();
                byte[] bArrA = E8.k.a(rotationDegrees, bArr);
                if (mayaKycSimpleCaptureV3Fragment2.O1() != null && bArrA != null) {
                    File cacheDir2 = mayaKycSimpleCaptureV3Fragment2.requireContext().getCacheDir();
                    kotlin.jvm.internal.j.f(cacheDir2, "getCacheDir(...)");
                    E8.k.e(cacheDir2, mayaKycSimpleCaptureV3Fragment2.O1(), bArrA);
                }
            }
            MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment3 = (MayaKycSimpleCaptureV3Fragment) ((K8.E) lV1.c.get());
            MayaEKYCSelectedDocument mayaEKYCSelectedDocumentO1 = mayaKycSimpleCaptureV3Fragment3.O1();
            if (mayaEKYCSelectedDocumentO1 != null) {
                String strP1 = mayaKycSimpleCaptureV3Fragment3.P1();
                Bundle arguments = mayaKycSimpleCaptureV3Fragment3.getArguments();
                C0359g2 c0359g2 = new C0359g2(strP1, mayaEKYCSelectedDocumentO1, arguments != null ? arguments.getBoolean("isSelectedFromSecondaryIdScreen", false) : false);
                String string = mayaKycSimpleCaptureV3Fragment3.getString(R.string.maya_kyc_simple_capture_take_id_photo);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                T2.Q(mayaKycSimpleCaptureV3Fragment3, string, T2.l(mayaKycSimpleCaptureV3Fragment3, c0359g2).toString(), null, 12);
                FrameLayout frameLayout = ((C0473p0) mayaKycSimpleCaptureV3Fragment3.G1()).f4176a;
                kotlin.jvm.internal.j.f(frameLayout, "getRoot(...)");
                Navigation.findNavController(frameLayout).navigate(c0359g2);
            }
        }
        super.onCaptureSuccess(imageProxy);
        imageProxy.close();
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public final void onError(ImageCaptureException exception) {
        kotlin.jvm.internal.j.g(exception, "exception");
        super.onError(exception);
        MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment = this.f3273a;
        String string = mayaKycSimpleCaptureV3Fragment.getString(R.string.maya_kyc_simple_capture_take_id_photo);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        T2.Q(mayaKycSimpleCaptureV3Fragment, string, null, null, 14);
    }
}
