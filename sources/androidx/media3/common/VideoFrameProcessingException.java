package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class VideoFrameProcessingException extends Exception {
    public final long presentationTimeUs;

    public VideoFrameProcessingException(String str) {
        this(str, C.TIME_UNSET);
    }

    public static VideoFrameProcessingException from(Exception exc) {
        return from(exc, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(String str, long j) {
        super(str);
        this.presentationTimeUs = j;
    }

    public static VideoFrameProcessingException from(Exception exc, long j) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(exc, j);
    }

    public VideoFrameProcessingException(String str, Throwable th2) {
        this(str, th2, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(String str, Throwable th2, long j) {
        super(str, th2);
        this.presentationTimeUs = j;
    }

    public VideoFrameProcessingException(Throwable th2) {
        this(th2, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(Throwable th2, long j) {
        super(th2);
        this.presentationTimeUs = j;
    }
}
