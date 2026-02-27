package androidx.media3.exoplayer.upstream.experimental;

import androidx.camera.video.AudioStats;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayDeque;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class SlidingPercentileBandwidthStatistic implements BandwidthStatistic {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    public static final double DEFAULT_PERCENTILE = 0.5d;
    private long bitrateEstimate;
    private final int maxSampleCount;
    private final double percentile;
    private final ArrayDeque<Sample> samples;
    private final TreeSet<Sample> sortedSamples;
    private double weightSum;

    public static class Sample implements Comparable<Sample> {
        private final long bitrate;
        private final double weight;

        public Sample(long j, double d10) {
            this.bitrate = j;
            this.weight = d10;
        }

        @Override // java.lang.Comparable
        public int compareTo(Sample sample) {
            return Util.compareLong(this.bitrate, sample.bitrate);
        }
    }

    public SlidingPercentileBandwidthStatistic() {
        this(10, 0.5d);
    }

    private long calculateBitrateEstimate() {
        if (this.samples.isEmpty()) {
            return Long.MIN_VALUE;
        }
        double d10 = this.weightSum * this.percentile;
        double d11 = AudioStats.AUDIO_AMPLITUDE_NONE;
        long j = 0;
        double d12 = 0.0d;
        for (Sample sample : this.sortedSamples) {
            double d13 = d11 + (sample.weight / 2.0d);
            if (d13 >= d10) {
                if (j == 0) {
                    return sample.bitrate;
                }
                return j + ((long) (((d10 - d12) * (sample.bitrate - j)) / (d13 - d12)));
            }
            j = sample.bitrate;
            d12 = d13;
            d11 = (sample.weight / 2.0d) + d13;
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void addSample(long j, long j6) {
        while (this.samples.size() >= this.maxSampleCount) {
            Sample sampleRemove = this.samples.remove();
            this.sortedSamples.remove(sampleRemove);
            this.weightSum -= sampleRemove.weight;
        }
        double dSqrt = Math.sqrt(j);
        Sample sample = new Sample((j * 8000000) / j6, dSqrt);
        this.samples.add(sample);
        this.sortedSamples.add(sample);
        this.weightSum += dSqrt;
        this.bitrateEstimate = calculateBitrateEstimate();
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        return this.bitrateEstimate;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.samples.clear();
        this.sortedSamples.clear();
        this.weightSum = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    public SlidingPercentileBandwidthStatistic(int i, double d10) {
        Assertions.checkArgument(d10 >= AudioStats.AUDIO_AMPLITUDE_NONE && d10 <= 1.0d);
        this.maxSampleCount = i;
        this.percentile = d10;
        this.samples = new ArrayDeque<>();
        this.sortedSamples = new TreeSet<>();
        this.bitrateEstimate = Long.MIN_VALUE;
    }
}
