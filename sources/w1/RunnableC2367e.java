package w1;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.Surface;
import android.widget.TextView;
import com.paymaya.common.base.AbstractBaseReceiptFragmentImpl;
import com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.ui.ekyc.view.fragment.impl.EKycPhotoCaptureFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PurchaseHistoryPageFragment;

/* JADX INFO: renamed from: w1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2367e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20563b;

    public /* synthetic */ RunnableC2367e(Object obj, int i) {
        this.f20562a = i;
        this.f20563b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20562a) {
            case 0:
                ((t) this.f20563b).n();
                return;
            case 1:
                MayaMfaActivity mayaMfaActivity = (MayaMfaActivity) this.f20563b;
                int i = MayaMfaActivity.f12926w;
                A7.j jVarZ1 = mayaMfaActivity.Z1();
                if (jVarZ1.g()) {
                    ((MayaMfaActivity) ((v9.a) jVarZ1.c.get())).l2();
                    return;
                }
                return;
            case 2:
                ((ShopV3PurchaseHistoryPageFragment) this.f20563b).B1().setRefreshing(false);
                return;
            case 3:
                x1.h hVar = (x1.h) this.f20563b;
                Surface surface = hVar.h;
                if (surface != null) {
                    SurfaceTexture surfaceTexture = hVar.f20874g;
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                    }
                    surface.release();
                    hVar.f20874g = null;
                    hVar.h = null;
                    return;
                }
                return;
            case 4:
                ((AbstractBaseReceiptFragmentImpl) this.f20563b).f10234T = true;
                return;
            case 5:
                TextView textView = ((MayaAbstractBaseReceiptFragmentImpl) this.f20563b).f10278Z;
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mTransactionTitleTextView");
                    throw null;
                }
            default:
                EKycPhotoCaptureFragment eKycPhotoCaptureFragment = (EKycPhotoCaptureFragment) this.f20563b;
                Camera camera = eKycPhotoCaptureFragment.f14578g0;
                if (camera != null) {
                    Camera.Parameters parameters = camera.getParameters();
                    if ((parameters != null ? parameters.getSupportedFocusModes() : null) == null || !parameters.getSupportedFocusModes().contains("continuous-picture")) {
                        return;
                    }
                    parameters.setFocusMode("continuous-picture");
                    Camera camera2 = eKycPhotoCaptureFragment.f14578g0;
                    if (camera2 != null) {
                        camera2.setParameters(parameters);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
