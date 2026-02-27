package androidx.camera.camera2.internal;

import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0722e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7449b;
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7450d;

    public /* synthetic */ RunnableC0722e(int i, ExposureControl exposureControl, CallbackToFutureAdapter.Completer completer) {
        this.f7448a = 2;
        this.f7449b = exposureControl;
        this.f7450d = completer;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7448a) {
            case 0:
                ((CameraCaptureCallback) this.f7449b).onCaptureFailed(this.c, (CameraCaptureFailure) this.f7450d);
                break;
            case 1:
                ((CameraCaptureCallback) this.f7449b).onCaptureCompleted(this.c, (CameraCaptureResult) this.f7450d);
                break;
            default:
                ((ExposureControl) this.f7449b).lambda$setExposureCompensationIndex$1((CallbackToFutureAdapter.Completer) this.f7450d, this.c);
                break;
        }
    }

    public /* synthetic */ RunnableC0722e(CameraCaptureCallback cameraCaptureCallback, int i, Object obj, int i4) {
        this.f7448a = i4;
        this.f7449b = cameraCaptureCallback;
        this.c = i;
        this.f7450d = obj;
    }
}
