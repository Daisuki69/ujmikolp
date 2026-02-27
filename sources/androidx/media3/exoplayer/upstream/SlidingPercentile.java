package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.upstream.SlidingPercentile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class SlidingPercentile {
    private static final Comparator<Sample> INDEX_COMPARATOR;
    private static final int MAX_RECYCLED_SAMPLES = 5;
    private static final int SORT_ORDER_BY_INDEX = 1;
    private static final int SORT_ORDER_BY_VALUE = 0;
    private static final int SORT_ORDER_NONE = -1;
    private static final Comparator<Sample> VALUE_COMPARATOR;
    private final int maxWeight;
    private int nextSampleIndex;
    private int recycledSampleCount;
    private int totalWeight;
    private final Sample[] recycledSamples = new Sample[5];
    private final ArrayList<Sample> samples = new ArrayList<>();
    private int currentSortOrder = -1;

    public static class Sample {
        public int index;
        public float value;
        public int weight;

        private Sample() {
        }
    }

    static {
        final int i = 0;
        INDEX_COMPARATOR = new Comparator() { // from class: androidx.media3.exoplayer.upstream.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                SlidingPercentile.Sample sample = (SlidingPercentile.Sample) obj;
                SlidingPercentile.Sample sample2 = (SlidingPercentile.Sample) obj2;
                switch (i) {
                    case 0:
                        return SlidingPercentile.lambda$static$0(sample, sample2);
                    default:
                        return SlidingPercentile.lambda$static$1(sample, sample2);
                }
            }
        };
        final int i4 = 1;
        VALUE_COMPARATOR = new Comparator() { // from class: androidx.media3.exoplayer.upstream.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                SlidingPercentile.Sample sample = (SlidingPercentile.Sample) obj;
                SlidingPercentile.Sample sample2 = (SlidingPercentile.Sample) obj2;
                switch (i4) {
                    case 0:
                        return SlidingPercentile.lambda$static$0(sample, sample2);
                    default:
                        return SlidingPercentile.lambda$static$1(sample, sample2);
                }
            }
        };
    }

    public SlidingPercentile(int i) {
        this.maxWeight = i;
    }

    private void ensureSortedByIndex() {
        if (this.currentSortOrder != 1) {
            Collections.sort(this.samples, INDEX_COMPARATOR);
            this.currentSortOrder = 1;
        }
    }

    private void ensureSortedByValue() {
        if (this.currentSortOrder != 0) {
            Collections.sort(this.samples, VALUE_COMPARATOR);
            this.currentSortOrder = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(Sample sample, Sample sample2) {
        return sample.index - sample2.index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$1(Sample sample, Sample sample2) {
        return Float.compare(sample.value, sample2.value);
    }

    public void addSample(int i, float f) {
        Sample sample;
        ensureSortedByIndex();
        int i4 = this.recycledSampleCount;
        if (i4 > 0) {
            Sample[] sampleArr = this.recycledSamples;
            int i6 = i4 - 1;
            this.recycledSampleCount = i6;
            sample = sampleArr[i6];
        } else {
            sample = new Sample();
        }
        int i10 = this.nextSampleIndex;
        this.nextSampleIndex = i10 + 1;
        sample.index = i10;
        sample.weight = i;
        sample.value = f;
        this.samples.add(sample);
        this.totalWeight += i;
        while (true) {
            int i11 = this.totalWeight;
            int i12 = this.maxWeight;
            if (i11 <= i12) {
                return;
            }
            int i13 = i11 - i12;
            Sample sample2 = this.samples.get(0);
            int i14 = sample2.weight;
            if (i14 <= i13) {
                this.totalWeight -= i14;
                this.samples.remove(0);
                int i15 = this.recycledSampleCount;
                if (i15 < 5) {
                    Sample[] sampleArr2 = this.recycledSamples;
                    this.recycledSampleCount = i15 + 1;
                    sampleArr2[i15] = sample2;
                }
            } else {
                sample2.weight = i14 - i13;
                this.totalWeight -= i13;
            }
        }
    }

    public float getPercentile(float f) {
        ensureSortedByValue();
        float f3 = f * this.totalWeight;
        int i = 0;
        for (int i4 = 0; i4 < this.samples.size(); i4++) {
            Sample sample = this.samples.get(i4);
            i += sample.weight;
            if (i >= f3) {
                return sample.value;
            }
        }
        if (this.samples.isEmpty()) {
            return Float.NaN;
        }
        return ((Sample) androidx.camera.core.impl.a.b(1, this.samples)).value;
    }

    public void reset() {
        this.samples.clear();
        this.currentSortOrder = -1;
        this.nextSampleIndex = 0;
        this.totalWeight = 0;
    }
}
