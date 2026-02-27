package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7375a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f7376b;
    public final /* synthetic */ boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7377d;

    public /* synthetic */ J(FocusMeteringControl focusMeteringControl, boolean z4, CallbackToFutureAdapter.Completer completer) {
        this.f7377d = focusMeteringControl;
        this.c = z4;
        this.f7376b = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7375a) {
            case 0:
                ((FocusMeteringControl) this.f7377d).lambda$enableExternalFlashAeMode$4(this.c, this.f7376b);
                break;
            default:
                ((TorchControl) this.f7377d).lambda$enableTorch$1(this.f7376b, this.c);
                break;
        }
    }

    public /* synthetic */ J(TorchControl torchControl, CallbackToFutureAdapter.Completer completer, boolean z4) {
        this.f7377d = torchControl;
        this.f7376b = completer;
        this.c = z4;
    }
}
