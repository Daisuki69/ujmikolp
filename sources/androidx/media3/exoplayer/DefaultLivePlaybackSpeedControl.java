package androidx.media3.exoplayer;

import android.os.SystemClock;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DefaultLivePlaybackSpeedControl implements LivePlaybackSpeedControl {
    public static final float DEFAULT_FALLBACK_MAX_PLAYBACK_SPEED = 1.03f;
    public static final float DEFAULT_FALLBACK_MIN_PLAYBACK_SPEED = 0.97f;
    public static final long DEFAULT_MAX_LIVE_OFFSET_ERROR_MS_FOR_UNIT_SPEED = 20;
    public static final float DEFAULT_MIN_POSSIBLE_LIVE_OFFSET_SMOOTHING_FACTOR = 0.999f;
    public static final long DEFAULT_MIN_UPDATE_INTERVAL_MS = 1000;
    public static final float DEFAULT_PROPORTIONAL_CONTROL_FACTOR = 0.1f;
    public static final long DEFAULT_TARGET_LIVE_OFFSET_INCREMENT_ON_REBUFFER_MS = 500;
    private float adjustedPlaybackSpeed;
    private long currentTargetLiveOffsetUs;
    private final float fallbackMaxPlaybackSpeed;
    private final float fallbackMinPlaybackSpeed;
    private long idealTargetLiveOffsetUs;
    private long lastPlaybackSpeedUpdateMs;
    private final long maxLiveOffsetErrorUsForUnitSpeed;
    private float maxPlaybackSpeed;
    private long maxTargetLiveOffsetUs;
    private long mediaConfigurationTargetLiveOffsetUs;
    private float minPlaybackSpeed;
    private final float minPossibleLiveOffsetSmoothingFactor;
    private long minTargetLiveOffsetUs;
    private final long minUpdateIntervalMs;
    private final float proportionalControlFactor;
    private long smoothedMinPossibleLiveOffsetDeviationUs;
    private long smoothedMinPossibleLiveOffsetUs;
    private long targetLiveOffsetOverrideUs;
    private final long targetLiveOffsetRebufferDeltaUs;

    public static final class Builder {
        private float fallbackMinPlaybackSpeed = 0.97f;
        private float fallbackMaxPlaybackSpeed = 1.03f;
        private long minUpdateIntervalMs = 1000;
        private float proportionalControlFactorUs = 1.0E-7f;
        private long maxLiveOffsetErrorUsForUnitSpeed = Util.msToUs(20);
        private long targetLiveOffsetIncrementOnRebufferUs = Util.msToUs(500);
        private float minPossibleLiveOffsetSmoothingFactor = 0.999f;

        public DefaultLivePlaybackSpeedControl build() {
            return new DefaultLivePlaybackSpeedControl(this.fallbackMinPlaybackSpeed, this.fallbackMaxPlaybackSpeed, this.minUpdateIntervalMs, this.proportionalControlFactorUs, this.maxLiveOffsetErrorUsForUnitSpeed, this.targetLiveOffsetIncrementOnRebufferUs, this.minPossibleLiveOffsetSmoothingFactor);
        }

        public Builder setFallbackMaxPlaybackSpeed(float f) {
            Assertions.checkArgument(f >= 1.0f);
            this.fallbackMaxPlaybackSpeed = f;
            return this;
        }

        public Builder setFallbackMinPlaybackSpeed(float f) {
            Assertions.checkArgument(0.0f < f && f <= 1.0f);
            this.fallbackMinPlaybackSpeed = f;
            return this;
        }

        public Builder setMaxLiveOffsetErrorMsForUnitSpeed(long j) {
            Assertions.checkArgument(j > 0);
            this.maxLiveOffsetErrorUsForUnitSpeed = Util.msToUs(j);
            return this;
        }

        public Builder setMinPossibleLiveOffsetSmoothingFactor(float f) {
            Assertions.checkArgument(f >= 0.0f && f < 1.0f);
            this.minPossibleLiveOffsetSmoothingFactor = f;
            return this;
        }

        public Builder setMinUpdateIntervalMs(long j) {
            Assertions.checkArgument(j > 0);
            this.minUpdateIntervalMs = j;
            return this;
        }

        public Builder setProportionalControlFactor(float f) {
            Assertions.checkArgument(f > 0.0f);
            this.proportionalControlFactorUs = f / 1000000.0f;
            return this;
        }

        public Builder setTargetLiveOffsetIncrementOnRebufferMs(long j) {
            Assertions.checkArgument(j >= 0);
            this.targetLiveOffsetIncrementOnRebufferUs = Util.msToUs(j);
            return this;
        }
    }

    private void adjustTargetLiveOffsetUs(long j) {
        long j6 = (this.smoothedMinPossibleLiveOffsetDeviationUs * 3) + this.smoothedMinPossibleLiveOffsetUs;
        if (this.currentTargetLiveOffsetUs <= j6) {
            long jConstrainValue = Util.constrainValue(j - ((long) (Math.max(0.0f, this.adjustedPlaybackSpeed - 1.0f) / this.proportionalControlFactor)), this.currentTargetLiveOffsetUs, j6);
            this.currentTargetLiveOffsetUs = jConstrainValue;
            long j7 = this.maxTargetLiveOffsetUs;
            if (j7 == androidx.media3.common.C.TIME_UNSET || jConstrainValue <= j7) {
                return;
            }
            this.currentTargetLiveOffsetUs = j7;
            return;
        }
        float fMsToUs = Util.msToUs(this.minUpdateIntervalMs);
        long[] jArr = {j6, this.idealTargetLiveOffsetUs, this.currentTargetLiveOffsetUs - (((long) ((this.adjustedPlaybackSpeed - 1.0f) * fMsToUs)) + ((long) ((this.maxPlaybackSpeed - 1.0f) * fMsToUs)))};
        long j9 = jArr[0];
        for (int i = 1; i < 3; i++) {
            long j10 = jArr[i];
            if (j10 > j9) {
                j9 = j10;
            }
        }
        this.currentTargetLiveOffsetUs = j9;
    }

    private void maybeResetTargetLiveOffsetUs() {
        long j;
        long j6 = this.mediaConfigurationTargetLiveOffsetUs;
        if (j6 != androidx.media3.common.C.TIME_UNSET) {
            j = this.targetLiveOffsetOverrideUs;
            if (j == androidx.media3.common.C.TIME_UNSET) {
                long j7 = this.minTargetLiveOffsetUs;
                if (j7 != androidx.media3.common.C.TIME_UNSET && j6 < j7) {
                    j6 = j7;
                }
                j = this.maxTargetLiveOffsetUs;
                if (j == androidx.media3.common.C.TIME_UNSET || j6 <= j) {
                    j = j6;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.idealTargetLiveOffsetUs == j) {
            return;
        }
        this.idealTargetLiveOffsetUs = j;
        this.currentTargetLiveOffsetUs = j;
        this.smoothedMinPossibleLiveOffsetUs = androidx.media3.common.C.TIME_UNSET;
        this.smoothedMinPossibleLiveOffsetDeviationUs = androidx.media3.common.C.TIME_UNSET;
        this.lastPlaybackSpeedUpdateMs = androidx.media3.common.C.TIME_UNSET;
    }

    private static long smooth(long j, long j6, float f) {
        return (long) (((1.0f - f) * j6) + (j * f));
    }

    private void updateSmoothedMinPossibleLiveOffsetUs(long j, long j6) {
        long j7 = j - j6;
        long j9 = this.smoothedMinPossibleLiveOffsetUs;
        if (j9 == androidx.media3.common.C.TIME_UNSET) {
            this.smoothedMinPossibleLiveOffsetUs = j7;
            this.smoothedMinPossibleLiveOffsetDeviationUs = 0L;
        } else {
            long jMax = Math.max(j7, smooth(j9, j7, this.minPossibleLiveOffsetSmoothingFactor));
            this.smoothedMinPossibleLiveOffsetUs = jMax;
            this.smoothedMinPossibleLiveOffsetDeviationUs = smooth(this.smoothedMinPossibleLiveOffsetDeviationUs, Math.abs(j7 - jMax), this.minPossibleLiveOffsetSmoothingFactor);
        }
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public float getAdjustedPlaybackSpeed(long j, long j6) {
        if (this.mediaConfigurationTargetLiveOffsetUs == androidx.media3.common.C.TIME_UNSET) {
            return 1.0f;
        }
        updateSmoothedMinPossibleLiveOffsetUs(j, j6);
        if (this.lastPlaybackSpeedUpdateMs != androidx.media3.common.C.TIME_UNSET && SystemClock.elapsedRealtime() - this.lastPlaybackSpeedUpdateMs < this.minUpdateIntervalMs) {
            return this.adjustedPlaybackSpeed;
        }
        this.lastPlaybackSpeedUpdateMs = SystemClock.elapsedRealtime();
        adjustTargetLiveOffsetUs(j);
        long j7 = j - this.currentTargetLiveOffsetUs;
        if (Math.abs(j7) < this.maxLiveOffsetErrorUsForUnitSpeed) {
            this.adjustedPlaybackSpeed = 1.0f;
        } else {
            this.adjustedPlaybackSpeed = Util.constrainValue((this.proportionalControlFactor * j7) + 1.0f, this.minPlaybackSpeed, this.maxPlaybackSpeed);
        }
        return this.adjustedPlaybackSpeed;
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public long getTargetLiveOffsetUs() {
        return this.currentTargetLiveOffsetUs;
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public void notifyRebuffer() {
        long j = this.currentTargetLiveOffsetUs;
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return;
        }
        long j6 = j + this.targetLiveOffsetRebufferDeltaUs;
        this.currentTargetLiveOffsetUs = j6;
        long j7 = this.maxTargetLiveOffsetUs;
        if (j7 != androidx.media3.common.C.TIME_UNSET && j6 > j7) {
            this.currentTargetLiveOffsetUs = j7;
        }
        this.lastPlaybackSpeedUpdateMs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public void setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration) {
        this.mediaConfigurationTargetLiveOffsetUs = Util.msToUs(liveConfiguration.targetOffsetMs);
        this.minTargetLiveOffsetUs = Util.msToUs(liveConfiguration.minOffsetMs);
        this.maxTargetLiveOffsetUs = Util.msToUs(liveConfiguration.maxOffsetMs);
        float f = liveConfiguration.minPlaybackSpeed;
        if (f == -3.4028235E38f) {
            f = this.fallbackMinPlaybackSpeed;
        }
        this.minPlaybackSpeed = f;
        float f3 = liveConfiguration.maxPlaybackSpeed;
        if (f3 == -3.4028235E38f) {
            f3 = this.fallbackMaxPlaybackSpeed;
        }
        this.maxPlaybackSpeed = f3;
        if (f == 1.0f && f3 == 1.0f) {
            this.mediaConfigurationTargetLiveOffsetUs = androidx.media3.common.C.TIME_UNSET;
        }
        maybeResetTargetLiveOffsetUs();
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public void setTargetLiveOffsetOverrideUs(long j) {
        this.targetLiveOffsetOverrideUs = j;
        maybeResetTargetLiveOffsetUs();
    }

    private DefaultLivePlaybackSpeedControl(float f, float f3, long j, float f7, long j6, long j7, float f10) {
        this.fallbackMinPlaybackSpeed = f;
        this.fallbackMaxPlaybackSpeed = f3;
        this.minUpdateIntervalMs = j;
        this.proportionalControlFactor = f7;
        this.maxLiveOffsetErrorUsForUnitSpeed = j6;
        this.targetLiveOffsetRebufferDeltaUs = j7;
        this.minPossibleLiveOffsetSmoothingFactor = f10;
        this.mediaConfigurationTargetLiveOffsetUs = androidx.media3.common.C.TIME_UNSET;
        this.targetLiveOffsetOverrideUs = androidx.media3.common.C.TIME_UNSET;
        this.minTargetLiveOffsetUs = androidx.media3.common.C.TIME_UNSET;
        this.maxTargetLiveOffsetUs = androidx.media3.common.C.TIME_UNSET;
        this.minPlaybackSpeed = f;
        this.maxPlaybackSpeed = f3;
        this.adjustedPlaybackSpeed = 1.0f;
        this.lastPlaybackSpeedUpdateMs = androidx.media3.common.C.TIME_UNSET;
        this.idealTargetLiveOffsetUs = androidx.media3.common.C.TIME_UNSET;
        this.currentTargetLiveOffsetUs = androidx.media3.common.C.TIME_UNSET;
        this.smoothedMinPossibleLiveOffsetUs = androidx.media3.common.C.TIME_UNSET;
        this.smoothedMinPossibleLiveOffsetDeviationUs = androidx.media3.common.C.TIME_UNSET;
    }
}
