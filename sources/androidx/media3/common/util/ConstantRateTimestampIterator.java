package androidx.media3.common.util;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.camera.video.AudioStats;
import androidx.media3.common.C;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ConstantRateTimestampIterator implements TimestampIterator {
    private final long endPositionUs;
    private final float frameRate;
    private int framesAdded;
    private final double framesDurationUs;
    private final long startPositionUs;
    private final int totalNumberOfFramesToAdd;

    public ConstantRateTimestampIterator(@IntRange(from = 1) long j, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f) {
        this(0L, j, f);
    }

    private long getTimestampUsAfter(int i) {
        long jRound = Math.round(this.framesDurationUs * ((double) i)) + this.startPositionUs;
        Assertions.checkState(jRound >= 0);
        return jRound;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long getLastTimestampUs() {
        int i = this.totalNumberOfFramesToAdd;
        return i == 0 ? C.TIME_UNSET : getTimestampUsAfter(i - 1);
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public boolean hasNext() {
        return this.framesAdded < this.totalNumberOfFramesToAdd;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long next() {
        Assertions.checkState(hasNext());
        int i = this.framesAdded;
        this.framesAdded = i + 1;
        return getTimestampUsAfter(i);
    }

    public ConstantRateTimestampIterator(@IntRange(from = 0) long j, @IntRange(from = 1) long j6, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f) {
        boolean z4 = false;
        Assertions.checkArgument(j6 > 0);
        Assertions.checkArgument(f > 0.0f);
        if (0 <= j && j < j6) {
            z4 = true;
        }
        Assertions.checkArgument(z4);
        this.startPositionUs = j;
        this.endPositionUs = j6;
        this.frameRate = f;
        this.totalNumberOfFramesToAdd = Math.round(((j6 - j) / 1000000.0f) * f);
        this.framesDurationUs = 1000000.0f / f;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public ConstantRateTimestampIterator copyOf() {
        return new ConstantRateTimestampIterator(this.startPositionUs, this.endPositionUs, this.frameRate);
    }
}
