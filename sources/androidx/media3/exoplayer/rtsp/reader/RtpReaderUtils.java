package androidx.media3.exoplayer.rtsp.reader;

import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes2.dex */
class RtpReaderUtils {
    private RtpReaderUtils() {
    }

    public static long toSampleTimeUs(long j, long j6, long j7, int i) {
        return j + Util.scaleLargeTimestamp(j6 - j7, 1000000L, i);
    }
}
