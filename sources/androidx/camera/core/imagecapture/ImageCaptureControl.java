package androidx.camera.core.imagecapture;

import S1.y;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.CaptureConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ImageCaptureControl {
    @MainThread
    void lockFlashMode();

    @NonNull
    @MainThread
    y submitStillCaptureRequests(@NonNull List<CaptureConfig> list);

    @MainThread
    void unlockFlashMode();
}
