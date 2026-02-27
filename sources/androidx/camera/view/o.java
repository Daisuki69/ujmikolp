package androidx.camera.view;

import androidx.camera.view.RotationProvider;
import androidx.camera.view.impl.ZoomGestureDetector;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements CallbackToFutureAdapter.Resolver, RotationProvider.Listener, ZoomGestureDetector.OnZoomGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f7738a;

    public /* synthetic */ o(Object obj) {
        this.f7738a = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((TextureViewImplementation) this.f7738a).lambda$waitForNextFrame$3(completer);
    }

    @Override // androidx.camera.view.RotationProvider.Listener
    public void onRotationChanged(int i) {
        ((CameraController) this.f7738a).lambda$new$1(i);
    }

    @Override // androidx.camera.view.impl.ZoomGestureDetector.OnZoomGestureListener
    public boolean onZoomEvent(ZoomGestureDetector.ZoomEvent zoomEvent) {
        return ((PreviewView) this.f7738a).lambda$new$1(zoomEvent);
    }
}
