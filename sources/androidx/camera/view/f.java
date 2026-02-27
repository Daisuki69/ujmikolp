package androidx.camera.view;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.view.PreviewView;
import androidx.camera.view.PreviewViewImplementation;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements CallbackToFutureAdapter.Resolver, SurfaceRequest.TransformationInfoListener, PreviewViewImplementation.OnSurfaceNotInUseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f7724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7725b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(PreviewView.AnonymousClass1 anonymousClass1, PreviewStreamStateObserver previewStreamStateObserver, CameraInternal cameraInternal) {
        this.f7725b = anonymousClass1;
        this.f7724a = previewStreamStateObserver;
        this.c = cameraInternal;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((PreviewStreamStateObserver) this.f7724a).lambda$waitForCaptureResult$2((CameraInfo) this.f7725b, (List) this.c, completer);
    }

    @Override // androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener
    public void onSurfaceNotInUse() {
        ((PreviewView.AnonymousClass1) this.f7725b).lambda$onSurfaceRequested$2((PreviewStreamStateObserver) this.f7724a, (CameraInternal) this.c);
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
        ((PreviewView.AnonymousClass1) this.f7724a).lambda$onSurfaceRequested$1((CameraInternal) this.f7725b, (SurfaceRequest) this.c, transformationInfo);
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3) {
        this.f7724a = obj;
        this.f7725b = obj2;
        this.c = obj3;
    }
}
