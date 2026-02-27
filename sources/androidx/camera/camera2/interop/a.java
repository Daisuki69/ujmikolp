package androidx.camera.camera2.interop;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Camera2CameraControl f7493b;
    public final /* synthetic */ CallbackToFutureAdapter.Completer c;

    public /* synthetic */ a(Camera2CameraControl camera2CameraControl, CallbackToFutureAdapter.Completer completer, int i) {
        this.f7492a = i;
        this.f7493b = camera2CameraControl;
        this.c = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7492a) {
            case 0:
                this.f7493b.lambda$clearCaptureRequestOptions$4(this.c);
                break;
            case 1:
                this.f7493b.lambda$setCaptureRequestOptions$0(this.c);
                break;
            default:
                this.f7493b.lambda$addCaptureRequestOptions$2(this.c);
                break;
        }
    }
}
