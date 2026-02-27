package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ZoomControl f7409b;
    public final /* synthetic */ CallbackToFutureAdapter.Completer c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ZoomState f7410d;

    public /* synthetic */ a0(ZoomControl zoomControl, CallbackToFutureAdapter.Completer completer, ZoomState zoomState, int i) {
        this.f7408a = i;
        this.f7409b = zoomControl;
        this.c = completer;
        this.f7410d = zoomState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7408a) {
            case 0:
                this.f7409b.lambda$setZoomRatio$0(this.c, this.f7410d);
                break;
            default:
                this.f7409b.lambda$setLinearZoom$2(this.c, this.f7410d);
                break;
        }
    }
}
