package androidx.media3.exoplayer.offline;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class Download {
    public static final int FAILURE_REASON_NONE = 0;
    public static final int FAILURE_REASON_UNKNOWN = 1;
    public static final int STATE_COMPLETED = 3;
    public static final int STATE_DOWNLOADING = 2;
    public static final int STATE_FAILED = 4;
    public static final int STATE_QUEUED = 0;
    public static final int STATE_REMOVING = 5;
    public static final int STATE_RESTARTING = 7;
    public static final int STATE_STOPPED = 1;
    public static final int STOP_REASON_NONE = 0;
    public final long contentLength;
    public final int failureReason;
    final DownloadProgress progress;
    public final DownloadRequest request;
    public final long startTimeMs;
    public final int state;
    public final int stopReason;
    public final long updateTimeMs;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FailureReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public Download(DownloadRequest downloadRequest, int i, long j, long j6, long j7, int i4, int i6) {
        this(downloadRequest, i, j, j6, j7, i4, i6, new DownloadProgress());
    }

    public long getBytesDownloaded() {
        return this.progress.bytesDownloaded;
    }

    public float getPercentDownloaded() {
        return this.progress.percentDownloaded;
    }

    public boolean isTerminalState() {
        int i = this.state;
        return i == 3 || i == 4;
    }

    public Download(DownloadRequest downloadRequest, int i, long j, long j6, long j7, int i4, int i6, DownloadProgress downloadProgress) {
        Assertions.checkNotNull(downloadProgress);
        boolean z4 = false;
        Assertions.checkArgument((i6 == 0) == (i != 4));
        if (i4 != 0) {
            if (i != 2 && i != 0) {
                z4 = true;
            }
            Assertions.checkArgument(z4);
        }
        this.request = downloadRequest;
        this.state = i;
        this.startTimeMs = j;
        this.updateTimeMs = j6;
        this.contentLength = j7;
        this.stopReason = i4;
        this.failureReason = i6;
        this.progress = downloadProgress;
    }
}
