package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7479b;

    public /* synthetic */ r(Object obj, int i) {
        this.f7478a = i;
        this.f7479b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7478a) {
            case 0:
                ((Camera2CameraImpl.StateCallback.ScheduledReopen) this.f7479b).lambda$run$0();
                break;
            case 1:
                ((Camera2CapturePipeline.Pipeline) this.f7479b).executePostCapture();
                break;
            case 2:
                ((CaptureSession) this.f7479b).lambda$issuePendingCaptureRequest$2();
                break;
            case 3:
                CaptureSessionRepository.forceOnClosed((LinkedHashSet) this.f7479b);
                break;
            case 4:
                ((ProcessingCaptureSession) this.f7479b).lambda$release$4();
                break;
            case 5:
                ProcessingCaptureSession.lambda$open$1((DeferrableSurface) this.f7479b);
                break;
            case 6:
                ((SynchronizedCaptureSessionBaseImpl) this.f7479b).lambda$close$2();
                break;
            case 7:
                ((SynchronizedCaptureSessionImpl) this.f7479b).lambda$close$2();
                break;
            case 8:
                ((Camera2CameraControlImpl) this.f7479b).updateSessionConfigSynchronous();
                break;
            case 9:
                ((CameraDevice) this.f7479b).close();
                break;
            case 10:
                ((ImageCapture.ScreenFlash) this.f7479b).clear();
                break;
            default:
                ((SafeCloseImageReaderProxy) this.f7479b).safeClose();
                break;
        }
    }
}
