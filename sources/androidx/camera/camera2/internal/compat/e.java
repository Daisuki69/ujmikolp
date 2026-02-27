package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7431b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AutoCloseable f7432d;

    public /* synthetic */ e(Object obj, AutoCloseable autoCloseable, int i, int i4) {
        this.f7430a = i4;
        this.c = obj;
        this.f7432d = autoCloseable;
        this.f7431b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7430a) {
            case 0:
                ((CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper) this.c).lambda$onCaptureSequenceAborted$5((CameraCaptureSession) this.f7432d, this.f7431b);
                break;
            default:
                ((CameraDeviceCompat.StateCallbackExecutorWrapper) this.c).lambda$onError$2((CameraDevice) this.f7432d, this.f7431b);
                break;
        }
    }
}
