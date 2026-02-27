package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.internal.utils.RingBuffer;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0740x implements Camera2CapturePipeline.ResultListener.Checker, RingBuffer.OnRemoveCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7488a;

    public /* synthetic */ C0740x(int i) {
        this.f7488a = i;
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
    public boolean check(TotalCaptureResult totalCaptureResult) {
        switch (this.f7488a) {
            case 0:
                return Camera2CapturePipeline.Pipeline.lambda$executePreCapture$2(totalCaptureResult);
            case 1:
                return Camera2CapturePipeline.ScreenFlashTask.lambda$preCapture$9(totalCaptureResult);
            default:
                return Camera2CapturePipeline.TorchTask.lambda$preCapture$2(totalCaptureResult);
        }
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback
    public void onRemove(Object obj) {
        ((ImageProxy) obj).close();
    }
}
