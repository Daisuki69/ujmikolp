package androidx.camera.core.streamsharing;

import S1.y;
import androidx.annotation.NonNull;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ForwardingCameraControl;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class VirtualCameraControl extends ForwardingCameraControl {
    private static final int DEFAULT_JPEG_QUALITY = 100;
    private static final int DEFAULT_ROTATION_DEGREES = 0;
    private final StreamSharing.Control mStreamSharingControl;

    public VirtualCameraControl(@NonNull CameraControlInternal cameraControlInternal, @NonNull StreamSharing.Control control) {
        super(cameraControlInternal);
        this.mStreamSharingControl = control;
    }

    private int getJpegQuality(@NonNull CaptureConfig captureConfig) {
        Integer num = (Integer) captureConfig.getImplementationOptions().retrieveOption(CaptureConfig.OPTION_JPEG_QUALITY, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    private int getRotationDegrees(@NonNull CaptureConfig captureConfig) {
        Integer num = (Integer) captureConfig.getImplementationOptions().retrieveOption(CaptureConfig.OPTION_ROTATION, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y lambda$submitStillCaptureRequests$0(y yVar, CameraCapturePipeline cameraCapturePipeline) throws Exception {
        return ((CameraCapturePipeline) yVar.get()).invokePreCapture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ y lambda$submitStillCaptureRequests$1(List list, Void r42) throws Exception {
        return this.mStreamSharingControl.jpegSnapshot(getJpegQuality((CaptureConfig) list.get(0)), getRotationDegrees((CaptureConfig) list.get(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y lambda$submitStillCaptureRequests$2(y yVar, Void r1) throws Exception {
        return ((CameraCapturePipeline) yVar.get()).invokePostCapture();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public y submitStillCaptureRequests(@NonNull final List<CaptureConfig> list, int i, int i4) {
        Preconditions.checkArgument(list.size() == 1, "Only support one capture config.");
        final y cameraCapturePipelineAsync = getCameraCapturePipelineAsync(i, i4);
        final int i6 = 0;
        final int i10 = 1;
        return Futures.allAsList(Collections.singletonList(FutureChain.from(cameraCapturePipelineAsync).transformAsync(new AsyncFunction() { // from class: androidx.camera.core.streamsharing.c
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final y apply(Object obj) {
                switch (i6) {
                    case 0:
                        return VirtualCameraControl.lambda$submitStillCaptureRequests$0(cameraCapturePipelineAsync, (CameraCapturePipeline) obj);
                    default:
                        return VirtualCameraControl.lambda$submitStillCaptureRequests$2(cameraCapturePipelineAsync, (Void) obj);
                }
            }
        }, CameraXExecutors.directExecutor()).transformAsync(new AsyncFunction() { // from class: androidx.camera.core.streamsharing.d
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final y apply(Object obj) {
                return this.f7613a.lambda$submitStillCaptureRequests$1(list, (Void) obj);
            }
        }, CameraXExecutors.directExecutor()).transformAsync(new AsyncFunction() { // from class: androidx.camera.core.streamsharing.c
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final y apply(Object obj) {
                switch (i10) {
                    case 0:
                        return VirtualCameraControl.lambda$submitStillCaptureRequests$0(cameraCapturePipelineAsync, (CameraCapturePipeline) obj);
                    default:
                        return VirtualCameraControl.lambda$submitStillCaptureRequests$2(cameraCapturePipelineAsync, (Void) obj);
                }
            }
        }, CameraXExecutors.directExecutor())));
    }
}
