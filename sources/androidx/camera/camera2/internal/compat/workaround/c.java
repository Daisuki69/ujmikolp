package androidx.camera.camera2.internal.compat.workaround;

import androidx.arch.core.util.Function;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.work.impl.model.WorkSpec;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7444a;

    public /* synthetic */ c(int i) {
        this.f7444a = i;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        switch (this.f7444a) {
            case 0:
                return RequestMonitor.lambda$getRequestsProcessedFuture$0((List) obj);
            case 1:
                return ImageCapture.lambda$submitStillCaptureRequest$4((List) obj);
            case 2:
                return new DefaultSurfaceProcessor((DynamicRange) obj);
            case 3:
                return VideoEncoderInfoImpl.lambda$static$0((VideoEncoderConfig) obj);
            default:
                return WorkSpec.WORK_INFO_MAPPER$lambda$1((List) obj);
        }
    }
}
