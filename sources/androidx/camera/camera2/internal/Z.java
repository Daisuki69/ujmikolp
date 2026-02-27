package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Z implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ZoomControl f7405b;
    public final /* synthetic */ ZoomState c;

    public /* synthetic */ Z(ZoomControl zoomControl, ZoomState zoomState, int i) {
        this.f7404a = i;
        this.f7405b = zoomControl;
        this.c = zoomState;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f7404a) {
            case 0:
                return this.f7405b.lambda$setZoomRatio$1(this.c, completer);
            default:
                return this.f7405b.lambda$setLinearZoom$3(this.c, completer);
        }
    }
}
