package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class ExponentialWeightedAverageStatistic implements BandwidthStatistic {
    public static final double DEFAULT_SMOOTHING_FACTOR = 0.9999d;
    private long bitrateEstimate;
    private final double smoothingFactor;

    public ExponentialWeightedAverageStatistic() {
        this(0.9999d);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void addSample(long j, long j6) {
        long j7 = (8000000 * j) / j6;
        if (this.bitrateEstimate == Long.MIN_VALUE) {
            this.bitrateEstimate = j7;
            return;
        }
        double dPow = Math.pow(this.smoothingFactor, Math.sqrt(j));
        this.bitrateEstimate = (long) (((1.0d - dPow) * j7) + (this.bitrateEstimate * dPow));
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        return this.bitrateEstimate;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    public ExponentialWeightedAverageStatistic(double d10) {
        this.smoothingFactor = d10;
        this.bitrateEstimate = Long.MIN_VALUE;
    }
}
