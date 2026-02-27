package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraDeviceCompat.StateCallbackExecutorWrapper f7438b;
    public final /* synthetic */ CameraDevice c;

    public /* synthetic */ h(CameraDeviceCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraDevice cameraDevice, int i) {
        this.f7437a = i;
        this.f7438b = stateCallbackExecutorWrapper;
        this.c = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7437a) {
            case 0:
                this.f7438b.lambda$onClosed$3(this.c);
                break;
            case 1:
                this.f7438b.lambda$onDisconnected$1(this.c);
                break;
            default:
                this.f7438b.lambda$onOpened$0(this.c);
                break;
        }
    }
}
