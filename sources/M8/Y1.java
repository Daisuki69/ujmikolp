package M8;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.Display;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import cj.C1132s;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureV3Fragment;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Y1 implements ActivityResultCallback, ImageAnalysis.Analyzer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaKycSimpleCaptureV3Fragment f3254a;

    public /* synthetic */ Y1(MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment) {
        this.f3254a = mayaKycSimpleCaptureV3Fragment;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(ImageProxy imageProxy) {
        Object objG;
        Bitmap bitmapA;
        E8.y yVar;
        List list = MayaKycSimpleCaptureV3Fragment.f12596h0;
        kotlin.jvm.internal.j.g(imageProxy, "imageProxy");
        long jCurrentTimeMillis = System.currentTimeMillis();
        MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment = this.f3254a;
        if (jCurrentTimeMillis - mayaKycSimpleCaptureV3Fragment.f12606e0 < 600) {
            imageProxy.close();
            return;
        }
        mayaKycSimpleCaptureV3Fragment.f12606e0 = jCurrentTimeMillis;
        mayaKycSimpleCaptureV3Fragment.T1();
        View viewQ1 = mayaKycSimpleCaptureV3Fragment.Q1();
        Display defaultDisplay = mayaKycSimpleCaptureV3Fragment.requireActivity().getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int[] iArr = new int[2];
        viewQ1.getLocationOnScreen(iArr);
        float width = imageProxy.getWidth() / i;
        float f = iArr[1] * width;
        Rect rect = new Rect(((int) f) - ((int) ((r6 - viewQ1.getTop()) * width)), 0, (int) ((viewQ1.getHeight() * width) + f), imageProxy.getHeight());
        try {
            mayaKycSimpleCaptureV3Fragment.T1();
            bitmapA = A5.l.a(imageProxy, rect);
            try {
                yVar = mayaKycSimpleCaptureV3Fragment.f12599X;
            } catch (Exception unused) {
                objG = MayaKycSimpleCaptureV3Fragment.f12596h0;
            }
        } catch (Exception unused2) {
            objG = C1132s.g(Float.valueOf(100.0f), Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        if (yVar == null) {
            kotlin.jvm.internal.j.n("mKycIdReviewUtils");
            throw null;
        }
        objG = yVar.d(bitmapA);
        new Handler(Looper.getMainLooper()).post(new I6.a(4, mayaKycSimpleCaptureV3Fragment, objG, imageProxy));
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public /* synthetic */ Size getDefaultTargetResolution() {
        return androidx.camera.core.l.a(this);
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public /* synthetic */ int getTargetCoordinateSystem() {
        return androidx.camera.core.l.b(this);
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        List list = MayaKycSimpleCaptureV3Fragment.f12596h0;
        this.f3254a.V1().l(zBooleanValue);
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public /* synthetic */ void updateTransform(Matrix matrix) {
        androidx.camera.core.l.c(this, matrix);
    }
}
