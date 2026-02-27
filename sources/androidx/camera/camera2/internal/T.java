package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class T implements AsyncFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7392a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraDevice f7393b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7394d;
    public final /* synthetic */ Object e;

    public /* synthetic */ T(ProcessingCaptureSession processingCaptureSession, SessionConfig sessionConfig, CameraDevice cameraDevice, SynchronizedCaptureSession.Opener opener) {
        this.c = processingCaptureSession;
        this.f7394d = sessionConfig;
        this.f7393b = cameraDevice;
        this.e = opener;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public final S1.y apply(Object obj) {
        List list = (List) obj;
        switch (this.f7392a) {
            case 0:
                return ((ProcessingCaptureSession) this.c).lambda$open$2((SessionConfig) this.f7394d, this.f7393b, (SynchronizedCaptureSession.Opener) this.e, list);
            default:
                return ((SynchronizedCaptureSessionImpl) this.c).lambda$openCaptureSession$0(this.f7393b, (SessionConfigurationCompat) this.f7394d, (List) this.e, list);
        }
    }

    public /* synthetic */ T(SynchronizedCaptureSessionImpl synchronizedCaptureSessionImpl, CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        this.c = synchronizedCaptureSessionImpl;
        this.f7393b = cameraDevice;
        this.f7394d = sessionConfigurationCompat;
        this.e = list;
    }
}
