package androidx.camera.video.internal.audio;

import We.s;
import android.media.AudioTimestamp;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class AudioUtils {
    private AudioUtils() {
    }

    public static int channelCountToChannelConfig(int i) {
        return i == 1 ? 16 : 12;
    }

    public static int channelCountToChannelMask(int i) {
        return i == 1 ? 16 : 12;
    }

    public static long computeInterpolatedTimeNs(int i, long j, @NonNull AudioTimestamp audioTimestamp) {
        Preconditions.checkArgument(((long) i) > 0, "sampleRate must be greater than 0.");
        Preconditions.checkArgument(j >= 0, "framePosition must be no less than 0.");
        long jFrameCountToDurationNs = audioTimestamp.nanoTime + frameCountToDurationNs(j - audioTimestamp.framePosition, i);
        if (jFrameCountToDurationNs < 0) {
            return 0L;
        }
        return jFrameCountToDurationNs;
    }

    public static long frameCountToDurationNs(long j, int i) {
        long j6 = i;
        Preconditions.checkArgument(j6 > 0, "sampleRate must be greater than 0.");
        return (TimeUnit.SECONDS.toNanos(1L) * j) / j6;
    }

    public static long frameCountToSize(long j, int i) {
        long j6 = i;
        Preconditions.checkArgument(j6 > 0, "bytesPerFrame must be greater than 0.");
        return j * j6;
    }

    public static int getBytesPerFrame(int i, int i4) {
        Preconditions.checkArgument(i4 > 0, "Invalid channel count: " + i4);
        if (i == 2) {
            return i4 * 2;
        }
        if (i == 3) {
            return i4;
        }
        if (i != 4) {
            if (i == 21) {
                return i4 * 3;
            }
            if (i != 22) {
                throw new IllegalArgumentException(s.f(i, "Invalid audio encoding: "));
            }
        }
        return i4 * 4;
    }

    public static long sizeToFrameCount(long j, int i) {
        long j6 = i;
        Preconditions.checkArgument(j6 > 0, "bytesPerFrame must be greater than 0.");
        return j / j6;
    }
}
