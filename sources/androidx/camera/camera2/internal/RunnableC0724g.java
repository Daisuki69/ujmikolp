package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0724g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7454b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0724g(int i, Object obj, Object obj2) {
        this.f7453a = i;
        this.f7454b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7453a) {
            case 0:
                ((Camera2CameraControlImpl.CameraControlSessionCallback) this.f7454b).lambda$onCaptureCompleted$0((TotalCaptureResult) this.c);
                break;
            case 1:
                Camera2CameraImpl.lambda$postSurfaceClosedError$19((SessionConfig.ErrorListener) this.f7454b, (SessionConfig) this.c);
                break;
            case 2:
                Camera2CameraImpl.lambda$configAndClose$2((Surface) this.f7454b, (SurfaceTexture) this.c);
                break;
            case 3:
                ((Camera2CameraImpl) this.f7454b).lambda$onUseCaseInactive$8((String) this.c);
                break;
            case 4:
                ((Camera2CameraControlImpl) this.f7454b).removeCaptureResultListener((Camera2CapturePipeline.ResultListener) this.c);
                break;
            case 5:
                ((ProcessingCaptureSession) this.f7454b).lambda$open$0((DeferrableSurface) this.c);
                break;
            case 6:
                ((Camera2CameraControlImpl) this.f7454b).lambda$updateSessionConfigAsync$6((CallbackToFutureAdapter.Completer) this.c);
                break;
            default:
                ((Camera2CameraControlImpl) this.f7454b).lambda$removeSessionCameraCaptureCallback$9((CameraCaptureCallback) this.c);
                break;
        }
    }
}
