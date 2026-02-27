package androidx.camera.camera2.interop;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Camera2CameraControl f7495b;

    public /* synthetic */ b(Camera2CameraControl camera2CameraControl, int i) {
        this.f7494a = i;
        this.f7495b = camera2CameraControl;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f7494a) {
            case 0:
                return this.f7495b.lambda$addCaptureRequestOptions$3(completer);
            case 1:
                return this.f7495b.lambda$setCaptureRequestOptions$1(completer);
            default:
                return this.f7495b.lambda$clearCaptureRequestOptions$5(completer);
        }
    }
}
