package Oa;

import android.util.Log;
import android.view.SurfaceHolder;
import android.view.ViewGroup;
import com.journeyapps.barcodescanner.BarcodeView;
import com.paymaya.mayaui.qr.view.widget.MayaCameraSourcePreview;
import com.paymaya.ui.qr.view.widget.CameraSourcePreview;
import java.io.IOException;
import m4.p;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f4785b;

    public /* synthetic */ f(ViewGroup viewGroup, int i) {
        this.f4784a = i;
        this.f4785b = viewGroup;
    }

    private final void a(SurfaceHolder surfaceHolder, int i, int i4, int i6) {
    }

    private final void b(SurfaceHolder surfaceHolder, int i, int i4, int i6) {
    }

    private final void c(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i4, int i6) {
        switch (this.f4784a) {
            case 0:
            case 1:
                break;
            default:
                if (surfaceHolder != null) {
                    p pVar = new p(i4, i6);
                    BarcodeView barcodeView = (BarcodeView) this.f4785b;
                    barcodeView.f18345p = pVar;
                    barcodeView.e();
                } else {
                    int i10 = m4.e.f18336B;
                    Log.e("e", "*** WARNING *** surfaceChanged() gave us a null surface!");
                }
                break;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        switch (this.f4784a) {
            case 0:
                MayaCameraSourcePreview mayaCameraSourcePreview = (MayaCameraSourcePreview) this.f4785b;
                mayaCameraSourcePreview.f13655d = true;
                try {
                    mayaCameraSourcePreview.a();
                } catch (IOException e) {
                    Log.e("MIDemoApp:Preview", "Could not start camera source.", e);
                    return;
                }
                break;
            case 1:
                CameraSourcePreview cameraSourcePreview = (CameraSourcePreview) this.f4785b;
                cameraSourcePreview.f14763d = true;
                try {
                    cameraSourcePreview.a();
                } catch (IOException e7) {
                    Log.e("MIDemoApp:Preview", "Could not start camera source.", e7);
                    return;
                }
                break;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        switch (this.f4784a) {
            case 0:
                ((MayaCameraSourcePreview) this.f4785b).f13655d = false;
                break;
            case 1:
                ((CameraSourcePreview) this.f4785b).f14763d = false;
                break;
            default:
                ((BarcodeView) this.f4785b).f18345p = null;
                break;
        }
    }
}
