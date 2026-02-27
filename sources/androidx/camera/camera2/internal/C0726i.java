package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.MeteringRepeatingSession;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0726i implements CallbackToFutureAdapter.Resolver, MeteringRepeatingSession.SurfaceResetCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Camera2CameraImpl f7460b;

    public /* synthetic */ C0726i(Camera2CameraImpl camera2CameraImpl, int i) {
        this.f7459a = i;
        this.f7460b = camera2CameraImpl;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f7459a) {
            case 0:
                return this.f7460b.lambda$release$5(completer);
            case 1:
            default:
                return this.f7460b.lambda$isMeteringRepeatingAttached$14(completer);
            case 2:
                return this.f7460b.lambda$getOrCreateUserReleaseFuture$6(completer);
            case 3:
                return this.f7460b.lambda$openCameraConfigAndClose$1(completer);
        }
    }

    @Override // androidx.camera.camera2.internal.MeteringRepeatingSession.SurfaceResetCallback
    public void onSurfaceReset() {
        this.f7460b.lambda$addOrRemoveMeteringRepeatingUseCase$17();
    }
}
