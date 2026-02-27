package androidx.camera.core;

import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureLatencyEstimate {
    public static final long UNDEFINED_CAPTURE_LATENCY = -1;

    @NonNull
    public static final ImageCaptureLatencyEstimate UNDEFINED_IMAGE_CAPTURE_LATENCY = new ImageCaptureLatencyEstimate(-1, -1);
    public static final long UNDEFINED_PROCESSING_LATENCY = -1;
    private final long mCaptureLatencyMillis;
    private final long mProcessingLatencyMillis;
    private final long mTotalCaptureLatencyMillis;

    public ImageCaptureLatencyEstimate(long j, long j6) {
        this.mCaptureLatencyMillis = j;
        this.mProcessingLatencyMillis = j6;
        this.mTotalCaptureLatencyMillis = computeTotalCaptureLatencyMillis(j, j6);
    }

    private long computeTotalCaptureLatencyMillis(long j, long j6) {
        if (j == -1 || j6 == -1) {
            return -1L;
        }
        return j + j6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCaptureLatencyEstimate)) {
            return false;
        }
        ImageCaptureLatencyEstimate imageCaptureLatencyEstimate = (ImageCaptureLatencyEstimate) obj;
        return this.mCaptureLatencyMillis == imageCaptureLatencyEstimate.getCaptureLatencyMillis() && this.mProcessingLatencyMillis == imageCaptureLatencyEstimate.getProcessingLatencyMillis() && this.mTotalCaptureLatencyMillis == imageCaptureLatencyEstimate.getTotalCaptureLatencyMillis();
    }

    public long getCaptureLatencyMillis() {
        return this.mCaptureLatencyMillis;
    }

    public long getProcessingLatencyMillis() {
        return this.mProcessingLatencyMillis;
    }

    public long getTotalCaptureLatencyMillis() {
        return this.mTotalCaptureLatencyMillis;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.mCaptureLatencyMillis), Long.valueOf(this.mProcessingLatencyMillis), Long.valueOf(this.mTotalCaptureLatencyMillis));
    }

    @NonNull
    public String toString() {
        return "captureLatencyMillis=" + this.mCaptureLatencyMillis + ", processingLatencyMillis=" + this.mProcessingLatencyMillis + ", totalCaptureLatencyMillis=" + this.mTotalCaptureLatencyMillis;
    }
}
