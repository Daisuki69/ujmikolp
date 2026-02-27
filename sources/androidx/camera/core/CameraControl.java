package androidx.camera.core;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;

/* JADX INFO: loaded from: classes.dex */
public interface CameraControl {

    public static final class OperationCanceledException extends Exception {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OperationCanceledException(@NonNull String str) {
            super(str);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OperationCanceledException(@NonNull String str, @NonNull Throwable th2) {
            super(str, th2);
        }
    }

    @NonNull
    S1.y cancelFocusAndMetering();

    @NonNull
    S1.y enableTorch(boolean z4);

    @NonNull
    S1.y setExposureCompensationIndex(int i);

    @NonNull
    S1.y setLinearZoom(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f);

    @NonNull
    S1.y setZoomRatio(float f);

    @NonNull
    S1.y startFocusAndMetering(@NonNull FocusMeteringAction focusMeteringAction);
}
