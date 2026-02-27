package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FocusMeteringControl f7374b;

    public /* synthetic */ I(FocusMeteringControl focusMeteringControl, int i) {
        this.f7373a = i;
        this.f7374b = focusMeteringControl;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f7373a) {
            case 0:
                return this.f7374b.lambda$cancelFocusAndMetering$13(completer);
            default:
                return this.f7374b.lambda$triggerAePrecapture$3(completer);
        }
    }
}
