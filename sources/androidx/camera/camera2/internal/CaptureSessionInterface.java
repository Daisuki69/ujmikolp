package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
interface CaptureSessionInterface {
    void cancelIssuedCaptureRequests();

    void close();

    @NonNull
    List<CaptureConfig> getCaptureConfigs();

    @Nullable
    SessionConfig getSessionConfig();

    boolean isInOpenState();

    void issueCaptureRequests(@NonNull List<CaptureConfig> list);

    @NonNull
    S1.y open(@NonNull SessionConfig sessionConfig, @NonNull CameraDevice cameraDevice, @NonNull SynchronizedCaptureSession.Opener opener);

    @NonNull
    S1.y release(boolean z4);

    void setSessionConfig(@Nullable SessionConfig sessionConfig);

    void setStreamUseCaseMap(@NonNull Map<DeferrableSurface, Long> map);
}
