package androidx.camera.core.imagecapture;

import S1.y;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface CameraCapturePipeline {
    y invokePostCapture();

    y invokePreCapture();
}
