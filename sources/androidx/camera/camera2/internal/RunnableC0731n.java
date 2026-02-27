package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0731n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7470b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7471d;

    public /* synthetic */ RunnableC0731n(int i, Object obj, Object obj2, Object obj3) {
        this.f7469a = i;
        this.c = obj;
        this.f7470b = obj2;
        this.f7471d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7469a) {
            case 0:
                ((Camera2CameraImpl) this.c).lambda$isUseCaseAttached$11((CallbackToFutureAdapter.Completer) this.f7470b, (String) this.f7471d);
                break;
            case 1:
                ((Camera2CapturePipeline.ScreenFlashTask) this.c).lambda$preCapture$2((AtomicReference) this.f7471d, (CallbackToFutureAdapter.Completer) this.f7470b);
                break;
            default:
                ((Camera2CameraControlImpl) this.c).lambda$addSessionCameraCaptureCallback$8((Executor) this.f7470b, (CameraCaptureCallback) this.f7471d);
                break;
        }
    }

    public /* synthetic */ RunnableC0731n(Camera2CapturePipeline.ScreenFlashTask screenFlashTask, AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        this.f7469a = 1;
        this.c = screenFlashTask;
        this.f7471d = atomicReference;
        this.f7470b = completer;
    }
}
