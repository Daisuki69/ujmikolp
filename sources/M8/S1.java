package M8;

import N5.C0471o0;
import android.media.Image;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.navigation.Navigation;
import cj.C1129o;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureV2Fragment;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class S1 extends ImageCapture.OnImageCapturedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaKycSimpleCaptureV2Fragment f3224a;

    public S1(MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment) {
        this.f3224a = mayaKycSimpleCaptureV2Fragment;
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
        D8.K kN1 = this.f3224a.N1();
        if (kN1.g()) {
            if (kN1.f1018d.e().isShortenedFlowIdCaptureV2Enabled()) {
                E8.k.f1286b = kN1.f1018d.e().isShortenedFlowIdCaptureV21080pEnabled();
                MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment = (MayaKycSimpleCaptureV2Fragment) ((K8.D) kN1.c.get());
                byte[] bArrF = kVar.f(bArr, rotationDegrees, mayaKycSimpleCaptureV2Fragment.M1().getHeight(), mayaKycSimpleCaptureV2Fragment.L1().getHeight(), mayaKycSimpleCaptureV2Fragment.L1().getTop());
                if (mayaKycSimpleCaptureV2Fragment.O1() != null && bArrF != null) {
                    File cacheDir = mayaKycSimpleCaptureV2Fragment.requireContext().getCacheDir();
                    kotlin.jvm.internal.j.f(cacheDir, "getCacheDir(...)");
                    E8.k.e(cacheDir, mayaKycSimpleCaptureV2Fragment.O1(), bArrF);
                }
            } else {
                MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment2 = (MayaKycSimpleCaptureV2Fragment) ((K8.D) kN1.c.get());
                mayaKycSimpleCaptureV2Fragment2.getClass();
                byte[] bArrA = E8.k.a(rotationDegrees, bArr);
                if (mayaKycSimpleCaptureV2Fragment2.O1() != null && bArrA != null) {
                    File cacheDir2 = mayaKycSimpleCaptureV2Fragment2.requireContext().getCacheDir();
                    kotlin.jvm.internal.j.f(cacheDir2, "getCacheDir(...)");
                    E8.k.e(cacheDir2, mayaKycSimpleCaptureV2Fragment2.O1(), bArrA);
                }
            }
            MayaKycSimpleCaptureV2Fragment mayaKycSimpleCaptureV2Fragment3 = (MayaKycSimpleCaptureV2Fragment) ((K8.D) kN1.c.get());
            MayaEKYCSelectedDocument mayaEKYCSelectedDocumentO1 = mayaKycSimpleCaptureV2Fragment3.O1();
            if (mayaEKYCSelectedDocumentO1 != null) {
                String strK1 = mayaKycSimpleCaptureV2Fragment3.K1();
                Bundle arguments = mayaKycSimpleCaptureV2Fragment3.getArguments();
                V1 v12 = new V1(strK1, mayaEKYCSelectedDocumentO1, arguments != null ? arguments.getBoolean("isSelectedFromSecondaryIdScreen", false) : false);
                FrameLayout frameLayout = ((C0471o0) mayaKycSimpleCaptureV2Fragment3.G1()).f4168a;
                kotlin.jvm.internal.j.f(frameLayout, "getRoot(...)");
                Navigation.findNavController(frameLayout).navigate(v12);
            }
        }
        super.onCaptureSuccess(imageProxy);
        imageProxy.close();
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public final void onError(ImageCaptureException exception) {
        kotlin.jvm.internal.j.g(exception, "exception");
        super.onError(exception);
    }
}
