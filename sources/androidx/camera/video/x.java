package androidx.camera.video;

import androidx.camera.core.SurfaceRequest;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements CallbackToFutureAdapter.Resolver, SurfaceRequest.TransformationInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7713b;

    public /* synthetic */ x(Object obj, int i) {
        this.f7712a = i;
        this.f7713b = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f7712a) {
            case 0:
                return ((VideoEncoderSession) this.f7713b).lambda$configure$0(completer);
            default:
                return ((VideoEncoderSession) this.f7713b).lambda$configure$1(completer);
        }
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
        ((Recorder) this.f7713b).lambda$configureInternal$7(transformationInfo);
    }
}
