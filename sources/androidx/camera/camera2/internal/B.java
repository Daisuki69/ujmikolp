package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.utils.futures.AsyncFunction;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements AsyncFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7361b;

    public /* synthetic */ B(Object obj, int i) {
        this.f7360a = i;
        this.f7361b = obj;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public final S1.y apply(Object obj) {
        switch (this.f7360a) {
            case 0:
                return ((Camera2CapturePipeline.TorchTask) this.f7361b).lambda$preCapture$1((Void) obj);
            case 1:
                return ((Camera2CapturePipeline.TorchTask) this.f7361b).lambda$preCapture$3((Void) obj);
            default:
                return ((Camera2CapturePipeline.Pipeline) this.f7361b).lambda$executePreCapture$3((Boolean) obj);
        }
    }
}
