package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FocusMeteringControl f7381b;
    public final /* synthetic */ CallbackToFutureAdapter.Completer c;

    public /* synthetic */ L(FocusMeteringControl focusMeteringControl, CallbackToFutureAdapter.Completer completer, int i) {
        this.f7380a = i;
        this.f7381b = focusMeteringControl;
        this.c = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7380a) {
            case 0:
                this.f7381b.lambda$cancelFocusAndMetering$12(this.c);
                break;
            default:
                this.f7381b.lambda$triggerAePrecapture$2(this.c);
                break;
        }
    }
}
