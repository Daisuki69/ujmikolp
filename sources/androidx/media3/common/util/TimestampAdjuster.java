package androidx.media3.common.util;

import androidx.annotation.GuardedBy;
import androidx.media3.common.C;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;

    @GuardedBy("this")
    private long firstSampleTimestampUs;

    @GuardedBy("this")
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs = new ThreadLocal<>();

    @GuardedBy("this")
    private long timestampOffsetUs;

    public TimestampAdjuster(long j) {
        reset(j);
    }

    public static long ptsToUs(long j) {
        return (j * 1000000) / 90000;
    }

    public static long usToNonWrappedPts(long j) {
        return (j * 90000) / 1000000;
    }

    public static long usToWrappedPts(long j) {
        return usToNonWrappedPts(j) % MAX_PTS_PLUS_ONE;
    }

    public synchronized long adjustSampleTimestamp(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            if (!isInitialized()) {
                long jLongValue = this.firstSampleTimestampUs;
                if (jLongValue == MODE_SHARED) {
                    jLongValue = ((Long) Assertions.checkNotNull(this.nextSampleTimestampUs.get())).longValue();
                }
                this.timestampOffsetUs = jLongValue - j;
                notifyAll();
            }
            this.lastUnadjustedTimestampUs = j;
            return j + this.timestampOffsetUs;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long adjustTsTimestamp(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j6 = this.lastUnadjustedTimestampUs;
            if (j6 != C.TIME_UNSET) {
                long jUsToNonWrappedPts = usToNonWrappedPts(j6);
                long j7 = (4294967296L + jUsToNonWrappedPts) / MAX_PTS_PLUS_ONE;
                long j9 = ((j7 - 1) * MAX_PTS_PLUS_ONE) + j;
                long j10 = (j7 * MAX_PTS_PLUS_ONE) + j;
                j = Math.abs(j9 - jUsToNonWrappedPts) < Math.abs(j10 - jUsToNonWrappedPts) ? j9 : j10;
            }
            return adjustSampleTimestamp(ptsToUs(j));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long adjustTsTimestampGreaterThanPreviousTimestamp(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j6 = this.lastUnadjustedTimestampUs;
        if (j6 != C.TIME_UNSET) {
            long jUsToNonWrappedPts = usToNonWrappedPts(j6);
            long j7 = jUsToNonWrappedPts / MAX_PTS_PLUS_ONE;
            Long.signum(j7);
            long j9 = (j7 * MAX_PTS_PLUS_ONE) + j;
            j = j9 >= jUsToNonWrappedPts ? j9 : ((j7 + 1) * MAX_PTS_PLUS_ONE) + j;
        }
        return adjustSampleTimestamp(ptsToUs(j));
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j;
        j = this.firstSampleTimestampUs;
        if (j == Long.MAX_VALUE || j == MODE_SHARED) {
            j = C.TIME_UNSET;
        }
        return j;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j;
        try {
            j = this.lastUnadjustedTimestampUs;
        } catch (Throwable th2) {
            throw th2;
        }
        return j != C.TIME_UNSET ? j + this.timestampOffsetUs : getFirstSampleTimestampUs();
    }

    public synchronized long getTimestampOffsetUs() {
        return this.timestampOffsetUs;
    }

    public synchronized boolean isInitialized() {
        return this.timestampOffsetUs != C.TIME_UNSET;
    }

    public synchronized void reset(long j) {
        this.firstSampleTimestampUs = j;
        this.timestampOffsetUs = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.lastUnadjustedTimestampUs = C.TIME_UNSET;
    }

    public synchronized void sharedInitializeOrWait(boolean z4, long j, long j6) throws InterruptedException, TimeoutException {
        try {
            Assertions.checkState(this.firstSampleTimestampUs == MODE_SHARED);
            if (isInitialized()) {
                return;
            }
            if (z4) {
                this.nextSampleTimestampUs.set(Long.valueOf(j));
            } else {
                long jElapsedRealtime = 0;
                long j7 = j6;
                while (!isInitialized()) {
                    if (j6 == 0) {
                        wait();
                    } else {
                        Assertions.checkState(j7 > 0);
                        long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                        wait(j7);
                        jElapsedRealtime += android.os.SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j6 && !isInitialized()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j6 + " milliseconds");
                        }
                        j7 = j6 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
