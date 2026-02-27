package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper f7422b;
    public final /* synthetic */ CameraCaptureSession c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CaptureRequest f7423d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper captureCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Object obj, int i) {
        this.f7421a = i;
        this.f7422b = captureCallbackExecutorWrapper;
        this.c = cameraCaptureSession;
        this.f7423d = captureRequest;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7421a) {
            case 0:
                this.f7422b.lambda$onCaptureCompleted$2(this.c, this.f7423d, (TotalCaptureResult) this.e);
                break;
            case 1:
                this.f7422b.lambda$onCaptureProgressed$1(this.c, this.f7423d, (CaptureResult) this.e);
                break;
            default:
                this.f7422b.lambda$onCaptureFailed$3(this.c, this.f7423d, (CaptureFailure) this.e);
                break;
        }
    }
}
