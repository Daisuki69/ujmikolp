package androidx.camera.core.processing;

import androidx.camera.core.ImageProcessor;
import androidx.camera.core.SurfaceRequest;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements SurfaceRequest.TransformationInfoListener, CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f7585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7586b;

    public /* synthetic */ e(Object obj, Object obj2) {
        this.f7585a = obj;
        this.f7586b = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((InternalImageProcessor) this.f7585a).lambda$safeProcess$1((ImageProcessor.Request) this.f7586b, completer);
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
        ((DefaultSurfaceProcessor) this.f7585a).lambda$onInputSurface$0((SurfaceRequest) this.f7586b, transformationInfo);
    }
}
