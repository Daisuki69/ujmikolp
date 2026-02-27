package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7372b;
    public final /* synthetic */ Object c;

    public /* synthetic */ H(Object obj, boolean z4, int i) {
        this.f7371a = i;
        this.c = obj;
        this.f7372b = z4;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f7371a) {
            case 0:
                return ((FocusMeteringControl) this.c).lambda$enableExternalFlashAeMode$5(this.f7372b, completer);
            default:
                return ((TorchControl) this.c).lambda$enableTorch$2(this.f7372b, completer);
        }
    }
}
