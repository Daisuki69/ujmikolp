package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0736t implements CallbackToFutureAdapter.Resolver, ForceCloseCaptureSession.OnConfigured, CameraCharacteristicsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7482b;

    public /* synthetic */ C0736t(Object obj, int i) {
        this.f7481a = i;
        this.f7482b = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f7481a) {
            case 0:
                return ((Camera2CapturePipeline.AePreCaptureTask) this.f7482b).lambda$preCapture$0(completer);
            case 1:
                return ((Camera2CapturePipeline.CameraCapturePipelineImpl) this.f7482b).lambda$invokePostCapture$1(completer);
            case 2:
                return ((Camera2CapturePipeline.ResultListener) this.f7482b).lambda$new$0(completer);
            case 3:
                return ((Camera2CapturePipeline.ScreenFlashTask) this.f7482b).lambda$preCapture$5(completer);
            case 4:
                return Camera2CapturePipeline.ScreenFlashTask.lambda$preCapture$1((AtomicReference) this.f7482b, completer);
            case 5:
                return ((Camera2CapturePipeline.TorchTask) this.f7482b).lambda$preCapture$0(completer);
            default:
                return ((Camera2CameraControlImpl) this.f7482b).lambda$updateSessionConfigAsync$7(completer);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider
    public Object get(CameraCharacteristics.Key key) {
        return ((CameraCharacteristicsCompat) this.f7482b).get(key);
    }

    @Override // androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession.OnConfigured
    public void run(SynchronizedCaptureSession synchronizedCaptureSession) {
        ((SynchronizedCaptureSessionImpl) this.f7482b).lambda$onConfigured$1(synchronizedCaptureSession);
    }
}
