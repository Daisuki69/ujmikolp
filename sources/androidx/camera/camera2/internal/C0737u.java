package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0737u implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7483a;

    public /* synthetic */ C0737u(int i) {
        this.f7483a = i;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        switch (this.f7483a) {
            case 0:
                return Camera2CapturePipeline.AePreCaptureTask.lambda$preCapture$1((Void) obj);
            case 1:
                return Camera2CapturePipeline.CameraCapturePipelineImpl.lambda$invokePreCapture$0((TotalCaptureResult) obj);
            case 2:
                return Camera2CapturePipeline.Pipeline.AnonymousClass1.lambda$preCapture$0((List) obj);
            case 3:
                return Camera2CapturePipeline.ScreenFlashTask.lambda$preCapture$11((TotalCaptureResult) obj);
            default:
                return Camera2CapturePipeline.TorchTask.lambda$preCapture$4((TotalCaptureResult) obj);
        }
    }
}
