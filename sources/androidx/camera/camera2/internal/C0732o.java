package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0732o implements AsyncFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7473b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0732o(int i, Object obj, Object obj2) {
        this.f7472a = i;
        this.f7473b = obj;
        this.c = obj2;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public final S1.y apply(Object obj) {
        switch (this.f7472a) {
            case 0:
                return Camera2CameraImpl.lambda$configAndClose$3((CaptureSession) this.f7473b, (ImmediateSurface) this.c, (Void) obj);
            case 1:
                return ((Camera2CapturePipeline.ScreenFlashTask) this.f7473b).lambda$preCapture$7((S1.y) this.c, obj);
            default:
                return ((SynchronizedCaptureSessionBaseImpl) this.f7473b).lambda$startWithDeferrableSurface$1((List) this.c, (List) obj);
        }
    }
}
