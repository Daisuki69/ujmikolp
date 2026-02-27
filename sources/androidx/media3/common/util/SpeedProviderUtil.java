package androidx.media3.common.util;

import androidx.camera.video.AudioStats;
import androidx.media3.common.C;
import androidx.media3.common.audio.SpeedProvider;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class SpeedProviderUtil {
    private SpeedProviderUtil() {
    }

    public static long getDurationAfterSpeedProviderApplied(SpeedProvider speedProvider, long j) {
        long j6 = 0;
        double dMin = AudioStats.AUDIO_AMPLITUDE_NONE;
        while (j6 < j) {
            long nextSpeedChangeTimeUs = speedProvider.getNextSpeedChangeTimeUs(j6);
            if (nextSpeedChangeTimeUs == C.TIME_UNSET) {
                nextSpeedChangeTimeUs = Long.MAX_VALUE;
            }
            dMin += (Math.min(nextSpeedChangeTimeUs, j) - j6) / ((double) speedProvider.getSpeed(j6));
            j6 = nextSpeedChangeTimeUs;
        }
        return Math.round(dMin);
    }
}
