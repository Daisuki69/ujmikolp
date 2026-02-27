package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0730m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Camera2CameraImpl f7468b;
    public final /* synthetic */ CallbackToFutureAdapter.Completer c;

    public /* synthetic */ RunnableC0730m(Camera2CameraImpl camera2CameraImpl, CallbackToFutureAdapter.Completer completer, int i) {
        this.f7467a = i;
        this.f7468b = camera2CameraImpl;
        this.c = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7467a) {
            case 0:
                this.f7468b.lambda$release$4(this.c);
                break;
            default:
                this.f7468b.lambda$isMeteringRepeatingAttached$13(this.c);
                break;
        }
    }
}
