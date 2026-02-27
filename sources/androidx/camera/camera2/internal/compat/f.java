package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSessionCompat.StateCallbackExecutorWrapper f7434b;
    public final /* synthetic */ CameraCaptureSession c;

    public /* synthetic */ f(CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, int i) {
        this.f7433a = i;
        this.f7434b = stateCallbackExecutorWrapper;
        this.c = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7433a) {
            case 0:
                this.f7434b.lambda$onActive$3(this.c);
                break;
            case 1:
                this.f7434b.lambda$onClosed$5(this.c);
                break;
            case 2:
                this.f7434b.lambda$onCaptureQueueEmpty$4(this.c);
                break;
            case 3:
                this.f7434b.lambda$onConfigured$0(this.c);
                break;
            case 4:
                this.f7434b.lambda$onReady$2(this.c);
                break;
            default:
                this.f7434b.lambda$onConfigureFailed$1(this.c);
                break;
        }
    }
}
