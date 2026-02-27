package androidx.media3.exoplayer.trackselection;

import O1.AbstractC0529x;
import O1.O;
import O1.P;
import O1.S;
import O1.o0;
import O1.p0;
import O1.r0;
import O1.t0;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class AdaptiveTrackSelection extends BaseTrackSelection {
    public static final float DEFAULT_BANDWIDTH_FRACTION = 0.7f;
    public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75f;
    public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
    public static final int DEFAULT_MAX_HEIGHT_TO_DISCARD = 719;
    public static final int DEFAULT_MAX_WIDTH_TO_DISCARD = 1279;
    public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
    public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
    private static final long MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS = 1000;
    private static final String TAG = "AdaptiveTrackSelection";
    private final S adaptationCheckpoints;
    private final float bandwidthFraction;
    private final BandwidthMeter bandwidthMeter;
    private final float bufferedFractionToLiveEdgeForQualityIncrease;
    private final Clock clock;

    @Nullable
    private MediaChunk lastBufferEvaluationMediaChunk;
    private long lastBufferEvaluationMs;
    private long latestBitrateEstimate;
    private final long maxDurationForQualityDecreaseUs;
    private final int maxHeightToDiscard;
    private final int maxWidthToDiscard;
    private final long minDurationForQualityIncreaseUs;
    private final long minDurationToRetainAfterDiscardUs;
    private float playbackSpeed;
    private int reason;
    private int selectedIndex;

    public static final class AdaptationCheckpoint {
        public final long allocatedBandwidth;
        public final long totalBandwidth;

        public AdaptationCheckpoint(long j, long j6) {
            this.totalBandwidth = j;
            this.allocatedBandwidth = j6;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdaptationCheckpoint)) {
                return false;
            }
            AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) obj;
            return this.totalBandwidth == adaptationCheckpoint.totalBandwidth && this.allocatedBandwidth == adaptationCheckpoint.allocatedBandwidth;
        }

        public int hashCode() {
            return (((int) this.totalBandwidth) * 31) + ((int) this.allocatedBandwidth);
        }
    }

    public static class Factory implements ExoTrackSelection.Factory {
        private final float bandwidthFraction;
        private final float bufferedFractionToLiveEdgeForQualityIncrease;
        private final Clock clock;
        private final int maxDurationForQualityDecreaseMs;
        private final int maxHeightToDiscard;
        private final int maxWidthToDiscard;
        private final int minDurationForQualityIncreaseMs;
        private final int minDurationToRetainAfterDiscardMs;

        public Factory() {
            this(10000, 25000, 25000, 0.7f);
        }

        public AdaptiveTrackSelection createAdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, int i, BandwidthMeter bandwidthMeter, S s9) {
            return new AdaptiveTrackSelection(trackGroup, iArr, i, bandwidthMeter, this.minDurationForQualityIncreaseMs, this.maxDurationForQualityDecreaseMs, this.minDurationToRetainAfterDiscardMs, this.maxWidthToDiscard, this.maxHeightToDiscard, this.bandwidthFraction, this.bufferedFractionToLiveEdgeForQualityIncrease, s9, this.clock);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.media3.exoplayer.trackselection.ExoTrackSelection[] createTrackSelections(androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] r10, androidx.media3.exoplayer.upstream.BandwidthMeter r11, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId r12, androidx.media3.common.Timeline r13) {
            /*
                r9 = this;
                O1.S r12 = androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.access$000(r10)
                int r13 = r10.length
                androidx.media3.exoplayer.trackselection.ExoTrackSelection[] r13 = new androidx.media3.exoplayer.trackselection.ExoTrackSelection[r13]
                r0 = 0
                r1 = r0
            L9:
                int r2 = r10.length
                if (r1 >= r2) goto L40
                r2 = r10[r1]
                if (r2 == 0) goto L15
                int[] r5 = r2.tracks
                int r3 = r5.length
                if (r3 != 0) goto L17
            L15:
                r7 = r11
                goto L3c
            L17:
                int r3 = r5.length
                r4 = 1
                if (r3 != r4) goto L28
                androidx.media3.exoplayer.trackselection.FixedTrackSelection r3 = new androidx.media3.exoplayer.trackselection.FixedTrackSelection
                androidx.media3.common.TrackGroup r4 = r2.group
                r5 = r5[r0]
                int r2 = r2.type
                r3.<init>(r4, r5, r2)
                r7 = r11
                goto L3a
            L28:
                androidx.media3.common.TrackGroup r4 = r2.group
                int r6 = r2.type
                java.lang.Object r2 = r12.get(r1)
                r8 = r2
                O1.S r8 = (O1.S) r8
                r3 = r9
                r7 = r11
                androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection r11 = r3.createAdaptiveTrackSelection(r4, r5, r6, r7, r8)
                r3 = r11
            L3a:
                r13[r1] = r3
            L3c:
                int r1 = r1 + 1
                r11 = r7
                goto L9
            L40:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.Factory.createTrackSelections(androidx.media3.exoplayer.trackselection.ExoTrackSelection$Definition[], androidx.media3.exoplayer.upstream.BandwidthMeter, androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, androidx.media3.common.Timeline):androidx.media3.exoplayer.trackselection.ExoTrackSelection[]");
        }

        public Factory(int i, int i4, int i6, float f) {
            this(i, i4, i6, AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, f, 0.75f, Clock.DEFAULT);
        }

        public Factory(int i, int i4, int i6, int i10, int i11, float f) {
            this(i, i4, i6, i10, i11, f, 0.75f, Clock.DEFAULT);
        }

        public Factory(int i, int i4, int i6, float f, float f3, Clock clock) {
            this(i, i4, i6, AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, f, f3, clock);
        }

        public Factory(int i, int i4, int i6, int i10, int i11, float f, float f3, Clock clock) {
            this.minDurationForQualityIncreaseMs = i;
            this.maxDurationForQualityDecreaseMs = i4;
            this.minDurationToRetainAfterDiscardMs = i6;
            this.maxWidthToDiscard = i10;
            this.maxHeightToDiscard = i11;
            this.bandwidthFraction = f;
            this.bufferedFractionToLiveEdgeForQualityIncrease = f3;
            this.clock = clock;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter) {
        this(trackGroup, iArr, 0, bandwidthMeter, 10000L, 25000L, 25000L, DEFAULT_MAX_WIDTH_TO_DISCARD, DEFAULT_MAX_HEIGHT_TO_DISCARD, 0.7f, 0.75f, t0.e, Clock.DEFAULT);
        P p10 = S.f4555b;
    }

    private static void addCheckpoint(List<O> list, long[] jArr) {
        long j = 0;
        for (long j6 : jArr) {
            j += j6;
        }
        for (int i = 0; i < list.size(); i++) {
            O o8 = list.get(i);
            if (o8 != null) {
                o8.a(new AdaptationCheckpoint(j, jArr[i]));
            }
        }
    }

    private int determineIdealSelectedIndex(long j, long j6) {
        long allocatedBandwidth = getAllocatedBandwidth(j6);
        int i = 0;
        for (int i4 = 0; i4 < this.length; i4++) {
            if (j == Long.MIN_VALUE || !isTrackExcluded(i4, j)) {
                Format format = getFormat(i4);
                if (canSelectFormat(format, format.bitrate, allocatedBandwidth)) {
                    return i4;
                }
                i = i4;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static S getAdaptationCheckpoints(ExoTrackSelection.Definition[] definitionArr) {
        ArrayList arrayList = new ArrayList();
        for (ExoTrackSelection.Definition definition : definitionArr) {
            if (definition == null || definition.tracks.length <= 1) {
                arrayList.add(null);
            } else {
                O oJ = S.j();
                oJ.a(new AdaptationCheckpoint(0L, 0L));
                arrayList.add(oJ);
            }
        }
        long[][] sortedTrackBitrates = getSortedTrackBitrates(definitionArr);
        int[] iArr = new int[sortedTrackBitrates.length];
        long[] jArr = new long[sortedTrackBitrates.length];
        for (int i = 0; i < sortedTrackBitrates.length; i++) {
            long[] jArr2 = sortedTrackBitrates[i];
            jArr[i] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        addCheckpoint(arrayList, jArr);
        S switchOrder = getSwitchOrder(sortedTrackBitrates);
        for (int i4 = 0; i4 < switchOrder.size(); i4++) {
            int iIntValue = ((Integer) switchOrder.get(i4)).intValue();
            int i6 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i6;
            jArr[iIntValue] = sortedTrackBitrates[iIntValue][i6];
            addCheckpoint(arrayList, jArr);
        }
        for (int i10 = 0; i10 < definitionArr.length; i10++) {
            if (arrayList.get(i10) != null) {
                jArr[i10] = jArr[i10] * 2;
            }
        }
        addCheckpoint(arrayList, jArr);
        O oJ2 = S.j();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            O o8 = (O) arrayList.get(i11);
            oJ2.a(o8 == null ? t0.e : o8.g());
        }
        return oJ2.g();
    }

    private long getAllocatedBandwidth(long j) {
        long totalAllocatableBandwidth = getTotalAllocatableBandwidth(j);
        if (this.adaptationCheckpoints.isEmpty()) {
            return totalAllocatableBandwidth;
        }
        int i = 1;
        while (i < this.adaptationCheckpoints.size() - 1 && ((AdaptationCheckpoint) this.adaptationCheckpoints.get(i)).totalBandwidth < totalAllocatableBandwidth) {
            i++;
        }
        AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) this.adaptationCheckpoints.get(i - 1);
        AdaptationCheckpoint adaptationCheckpoint2 = (AdaptationCheckpoint) this.adaptationCheckpoints.get(i);
        long j6 = adaptationCheckpoint.totalBandwidth;
        float f = (totalAllocatableBandwidth - j6) / (adaptationCheckpoint2.totalBandwidth - j6);
        return adaptationCheckpoint.allocatedBandwidth + ((long) (f * (adaptationCheckpoint2.allocatedBandwidth - r2)));
    }

    private long getLastChunkDurationUs(List<? extends MediaChunk> list) {
        if (list.isEmpty()) {
            return C.TIME_UNSET;
        }
        MediaChunk mediaChunk = (MediaChunk) AbstractC0529x.k(list);
        long j = mediaChunk.startTimeUs;
        if (j != C.TIME_UNSET) {
            long j6 = mediaChunk.endTimeUs;
            if (j6 != C.TIME_UNSET) {
                return j6 - j;
            }
        }
        return C.TIME_UNSET;
    }

    private long getNextChunkDurationUs(MediaChunkIterator[] mediaChunkIteratorArr, List<? extends MediaChunk> list) {
        int i = this.selectedIndex;
        if (i < mediaChunkIteratorArr.length && mediaChunkIteratorArr[i].next()) {
            MediaChunkIterator mediaChunkIterator = mediaChunkIteratorArr[this.selectedIndex];
            return mediaChunkIterator.getChunkEndTimeUs() - mediaChunkIterator.getChunkStartTimeUs();
        }
        for (MediaChunkIterator mediaChunkIterator2 : mediaChunkIteratorArr) {
            if (mediaChunkIterator2.next()) {
                return mediaChunkIterator2.getChunkEndTimeUs() - mediaChunkIterator2.getChunkStartTimeUs();
            }
        }
        return getLastChunkDurationUs(list);
    }

    private static long[][] getSortedTrackBitrates(ExoTrackSelection.Definition[] definitionArr) {
        long[][] jArr = new long[definitionArr.length][];
        for (int i = 0; i < definitionArr.length; i++) {
            ExoTrackSelection.Definition definition = definitionArr[i];
            if (definition == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[definition.tracks.length];
                int i4 = 0;
                while (true) {
                    int[] iArr = definition.tracks;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    long j = definition.group.getFormat(iArr[i4]).bitrate;
                    long[] jArr2 = jArr[i];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i4] = j;
                    i4++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    private static S getSwitchOrder(long[][] jArr) {
        AbstractC0529x.d(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(r0.f4604b);
        o0 o0Var = new o0();
        p0 p0Var = new p0(treeMap);
        p0Var.f4603g = o0Var;
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = jArr[i];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i4 = 0;
                while (true) {
                    long[] jArr3 = jArr[i];
                    int length2 = jArr3.length;
                    double dLog = AudioStats.AUDIO_AMPLITUDE_NONE;
                    if (i4 >= length2) {
                        break;
                    }
                    long j = jArr3[i4];
                    if (j != -1) {
                        dLog = Math.log(j);
                    }
                    dArr[i4] = dLog;
                    i4++;
                }
                int i6 = length - 1;
                double d10 = dArr[i6] - dArr[0];
                int i10 = 0;
                while (i10 < i6) {
                    double d11 = dArr[i10];
                    i10++;
                    p0Var.put(Double.valueOf(d10 == AudioStats.AUDIO_AMPLITUDE_NONE ? 1.0d : (((d11 + dArr[i10]) * 0.5d) - dArr[0]) / d10), Integer.valueOf(i));
                }
            }
        }
        return S.k(p0Var.values());
    }

    private long getTotalAllocatableBandwidth(long j) {
        long bitrateEstimate = this.bandwidthMeter.getBitrateEstimate();
        this.latestBitrateEstimate = bitrateEstimate;
        long j6 = (long) (bitrateEstimate * this.bandwidthFraction);
        long timeToFirstByteEstimateUs = this.bandwidthMeter.getTimeToFirstByteEstimateUs();
        if (timeToFirstByteEstimateUs == C.TIME_UNSET || j == C.TIME_UNSET) {
            return (long) (j6 / this.playbackSpeed);
        }
        float f = j;
        return (long) ((j6 * Math.max((f / this.playbackSpeed) - timeToFirstByteEstimateUs, 0.0f)) / f);
    }

    private long minDurationForQualityIncreaseUs(long j, long j6) {
        if (j == C.TIME_UNSET) {
            return this.minDurationForQualityIncreaseUs;
        }
        if (j6 != C.TIME_UNSET) {
            j -= j6;
        }
        return Math.min((long) (j * this.bufferedFractionToLiveEdgeForQualityIncrease), this.minDurationForQualityIncreaseUs);
    }

    public boolean canSelectFormat(Format format, int i, long j) {
        return ((long) i) <= j;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    @CallSuper
    public void disable() {
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    @CallSuper
    public void enable() {
        this.lastBufferEvaluationMs = C.TIME_UNSET;
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j, List<? extends MediaChunk> list) {
        int i;
        int i4;
        long jElapsedRealtime = this.clock.elapsedRealtime();
        if (!shouldEvaluateQueueSize(jElapsedRealtime, list)) {
            return list.size();
        }
        this.lastBufferEvaluationMs = jElapsedRealtime;
        this.lastBufferEvaluationMediaChunk = list.isEmpty() ? null : (MediaChunk) AbstractC0529x.k(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(list.get(size - 1).startTimeUs - j, this.playbackSpeed);
        long minDurationToRetainAfterDiscardUs = getMinDurationToRetainAfterDiscardUs();
        if (playoutDurationForMediaDuration >= minDurationToRetainAfterDiscardUs) {
            Format format = getFormat(determineIdealSelectedIndex(jElapsedRealtime, getLastChunkDurationUs(list)));
            for (int i6 = 0; i6 < size; i6++) {
                MediaChunk mediaChunk = list.get(i6);
                Format format2 = mediaChunk.trackFormat;
                if (Util.getPlayoutDurationForMediaDuration(mediaChunk.startTimeUs - j, this.playbackSpeed) >= minDurationToRetainAfterDiscardUs && format2.bitrate < format.bitrate && (i = format2.height) != -1 && i <= this.maxHeightToDiscard && (i4 = format2.width) != -1 && i4 <= this.maxWidthToDiscard && i < format.height) {
                    return i6;
                }
            }
        }
        return size;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public long getLatestBitrateEstimate() {
        return this.latestBitrateEstimate;
    }

    public long getMinDurationToRetainAfterDiscardUs() {
        return this.minDurationToRetainAfterDiscardUs;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    @Nullable
    public Object getSelectionData() {
        return null;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f) {
        this.playbackSpeed = f;
    }

    public boolean shouldEvaluateQueueSize(long j, List<? extends MediaChunk> list) {
        long j6 = this.lastBufferEvaluationMs;
        if (j6 == C.TIME_UNSET || j - j6 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((MediaChunk) AbstractC0529x.k(list)).equals(this.lastBufferEvaluationMediaChunk)) ? false : true;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j, long j6, long j7, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long jElapsedRealtime = this.clock.elapsedRealtime();
        long nextChunkDurationUs = getNextChunkDurationUs(mediaChunkIteratorArr, list);
        int i = this.reason;
        if (i == 0) {
            this.reason = 1;
            this.selectedIndex = determineIdealSelectedIndex(jElapsedRealtime, nextChunkDurationUs);
            return;
        }
        int i4 = this.selectedIndex;
        int iIndexOf = list.isEmpty() ? -1 : indexOf(((MediaChunk) AbstractC0529x.k(list)).trackFormat);
        if (iIndexOf != -1) {
            i = ((MediaChunk) AbstractC0529x.k(list)).trackSelectionReason;
            i4 = iIndexOf;
        }
        int iDetermineIdealSelectedIndex = determineIdealSelectedIndex(jElapsedRealtime, nextChunkDurationUs);
        if (iDetermineIdealSelectedIndex != i4 && !isTrackExcluded(i4, jElapsedRealtime)) {
            Format format = getFormat(i4);
            Format format2 = getFormat(iDetermineIdealSelectedIndex);
            long jMinDurationForQualityIncreaseUs = minDurationForQualityIncreaseUs(j7, nextChunkDurationUs);
            int i6 = format2.bitrate;
            int i10 = format.bitrate;
            if ((i6 > i10 && j6 < jMinDurationForQualityIncreaseUs) || (i6 < i10 && j6 >= this.maxDurationForQualityDecreaseUs)) {
                iDetermineIdealSelectedIndex = i4;
            }
        }
        if (iDetermineIdealSelectedIndex != i4) {
            i = 3;
        }
        this.reason = i;
        this.selectedIndex = iDetermineIdealSelectedIndex;
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, int i, BandwidthMeter bandwidthMeter, long j, long j6, long j7, int i4, int i6, float f, float f3, List<AdaptationCheckpoint> list, Clock clock) {
        long j9;
        super(trackGroup, iArr, i);
        if (j7 < j) {
            Log.w(TAG, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j9 = j;
        } else {
            j9 = j7;
        }
        this.bandwidthMeter = bandwidthMeter;
        this.minDurationForQualityIncreaseUs = j * 1000;
        this.maxDurationForQualityDecreaseUs = j6 * 1000;
        this.minDurationToRetainAfterDiscardUs = j9 * 1000;
        this.maxWidthToDiscard = i4;
        this.maxHeightToDiscard = i6;
        this.bandwidthFraction = f;
        this.bufferedFractionToLiveEdgeForQualityIncrease = f3;
        this.adaptationCheckpoints = S.k(list);
        this.clock = clock;
        this.playbackSpeed = 1.0f;
        this.reason = 0;
        this.lastBufferEvaluationMs = C.TIME_UNSET;
        this.latestBitrateEstimate = -2147483647L;
    }
}
