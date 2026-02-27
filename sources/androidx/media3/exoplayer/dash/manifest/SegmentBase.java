package androidx.media3.exoplayer.dash.manifest;

import Q1.a;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class SegmentBase {

    @Nullable
    final RangedUri initialization;
    final long presentationTimeOffset;
    final long timescale;

    public static abstract class MultiSegmentBase extends SegmentBase {

        @VisibleForTesting
        final long availabilityTimeOffsetUs;
        final long duration;
        private final long periodStartUnixTimeUs;

        @Nullable
        final List<SegmentTimelineElement> segmentTimeline;
        final long startNumber;
        private final long timeShiftBufferDepthUs;

        public MultiSegmentBase(@Nullable RangedUri rangedUri, long j, long j6, long j7, long j9, @Nullable List<SegmentTimelineElement> list, long j10, long j11, long j12) {
            super(rangedUri, j, j6);
            this.startNumber = j7;
            this.duration = j9;
            this.segmentTimeline = list;
            this.availabilityTimeOffsetUs = j10;
            this.timeShiftBufferDepthUs = j11;
            this.periodStartUnixTimeUs = j12;
        }

        public long getAvailableSegmentCount(long j, long j6) {
            long segmentCount = getSegmentCount(j);
            return segmentCount != -1 ? segmentCount : (int) (getSegmentNum((j6 - this.periodStartUnixTimeUs) + this.availabilityTimeOffsetUs, j) - getFirstAvailableSegmentNum(j, j6));
        }

        public long getFirstAvailableSegmentNum(long j, long j6) {
            if (getSegmentCount(j) == -1) {
                long j7 = this.timeShiftBufferDepthUs;
                if (j7 != C.TIME_UNSET) {
                    return Math.max(getFirstSegmentNum(), getSegmentNum((j6 - this.periodStartUnixTimeUs) - j7, j));
                }
            }
            return getFirstSegmentNum();
        }

        public long getFirstSegmentNum() {
            return this.startNumber;
        }

        public long getNextSegmentAvailableTimeUs(long j, long j6) {
            if (this.segmentTimeline != null) {
                return C.TIME_UNSET;
            }
            long availableSegmentCount = getAvailableSegmentCount(j, j6) + getFirstAvailableSegmentNum(j, j6);
            return (getSegmentDurationUs(availableSegmentCount, j) + getSegmentTimeUs(availableSegmentCount)) - this.availabilityTimeOffsetUs;
        }

        public abstract long getSegmentCount(long j);

        public final long getSegmentDurationUs(long j, long j6) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            if (list != null) {
                return (list.get((int) (j - this.startNumber)).duration * 1000000) / this.timescale;
            }
            long segmentCount = getSegmentCount(j6);
            return (segmentCount == -1 || j != (getFirstSegmentNum() + segmentCount) - 1) ? (this.duration * 1000000) / this.timescale : j6 - getSegmentTimeUs(j);
        }

        public long getSegmentNum(long j, long j6) {
            long firstSegmentNum = getFirstSegmentNum();
            long segmentCount = getSegmentCount(j6);
            if (segmentCount != 0) {
                if (this.segmentTimeline != null) {
                    long j7 = (segmentCount + firstSegmentNum) - 1;
                    long j9 = firstSegmentNum;
                    while (j9 <= j7) {
                        long j10 = ((j7 - j9) / 2) + j9;
                        long segmentTimeUs = getSegmentTimeUs(j10);
                        if (segmentTimeUs < j) {
                            j9 = j10 + 1;
                        } else {
                            if (segmentTimeUs <= j) {
                                return j10;
                            }
                            j7 = j10 - 1;
                        }
                    }
                    return j9 == firstSegmentNum ? j9 : j7;
                }
                long j11 = (j / ((this.duration * 1000000) / this.timescale)) + this.startNumber;
                if (j11 >= firstSegmentNum) {
                    return segmentCount == -1 ? j11 : Math.min(j11, (firstSegmentNum + segmentCount) - 1);
                }
            }
            return firstSegmentNum;
        }

        public final long getSegmentTimeUs(long j) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            return Util.scaleLargeTimestamp(list != null ? list.get((int) (j - this.startNumber)).startTime - this.presentationTimeOffset : (j - this.startNumber) * this.duration, 1000000L, this.timescale);
        }

        public abstract RangedUri getSegmentUrl(Representation representation, long j);

        public boolean isExplicit() {
            return this.segmentTimeline != null;
        }
    }

    public static final class SegmentList extends MultiSegmentBase {

        @Nullable
        final List<RangedUri> mediaSegments;

        public SegmentList(RangedUri rangedUri, long j, long j6, long j7, long j9, @Nullable List<SegmentTimelineElement> list, long j10, @Nullable List<RangedUri> list2, long j11, long j12) {
            super(rangedUri, j, j6, j7, j9, list, j10, j11, j12);
            this.mediaSegments = list2;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long j) {
            return this.mediaSegments.size();
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long j) {
            return this.mediaSegments.get((int) (j - this.startNumber));
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public boolean isExplicit() {
            return true;
        }
    }

    public static final class SegmentTemplate extends MultiSegmentBase {
        final long endNumber;

        @Nullable
        final UrlTemplate initializationTemplate;

        @Nullable
        final UrlTemplate mediaTemplate;

        public SegmentTemplate(RangedUri rangedUri, long j, long j6, long j7, long j9, long j10, @Nullable List<SegmentTimelineElement> list, long j11, @Nullable UrlTemplate urlTemplate, @Nullable UrlTemplate urlTemplate2, long j12, long j13) {
            super(rangedUri, j, j6, j7, j10, list, j11, j12, j13);
            this.initializationTemplate = urlTemplate;
            this.mediaTemplate = urlTemplate2;
            this.endNumber = j9;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase
        @Nullable
        public RangedUri getInitialization(Representation representation) {
            UrlTemplate urlTemplate = this.initializationTemplate;
            if (urlTemplate == null) {
                return super.getInitialization(representation);
            }
            Format format = representation.format;
            return new RangedUri(urlTemplate.buildUri(format.id, 0L, format.bitrate, 0L), 0L, -1L);
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long j) {
            if (this.segmentTimeline != null) {
                return r0.size();
            }
            long j6 = this.endNumber;
            if (j6 != -1) {
                return (j6 - this.startNumber) + 1;
            }
            if (j == C.TIME_UNSET) {
                return -1L;
            }
            BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.timescale));
            BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.duration).multiply(BigInteger.valueOf(1000000L));
            RoundingMode roundingMode = RoundingMode.CEILING;
            int i = a.f5198a;
            return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long j) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            long j6 = list != null ? list.get((int) (j - this.startNumber)).startTime : (j - this.startNumber) * this.duration;
            UrlTemplate urlTemplate = this.mediaTemplate;
            Format format = representation.format;
            return new RangedUri(urlTemplate.buildUri(format.id, j, format.bitrate, j6), 0L, -1L);
        }
    }

    public static final class SegmentTimelineElement {
        final long duration;
        final long startTime;

        public SegmentTimelineElement(long j, long j6) {
            this.startTime = j;
            this.duration = j6;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SegmentTimelineElement.class == obj.getClass()) {
                SegmentTimelineElement segmentTimelineElement = (SegmentTimelineElement) obj;
                if (this.startTime == segmentTimelineElement.startTime && this.duration == segmentTimelineElement.duration) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.startTime) * 31) + ((int) this.duration);
        }
    }

    public SegmentBase(@Nullable RangedUri rangedUri, long j, long j6) {
        this.initialization = rangedUri;
        this.timescale = j;
        this.presentationTimeOffset = j6;
    }

    @Nullable
    public RangedUri getInitialization(Representation representation) {
        return this.initialization;
    }

    public long getPresentationTimeOffsetUs() {
        return Util.scaleLargeTimestamp(this.presentationTimeOffset, 1000000L, this.timescale);
    }

    public static class SingleSegmentBase extends SegmentBase {
        final long indexLength;
        final long indexStart;

        public SingleSegmentBase(@Nullable RangedUri rangedUri, long j, long j6, long j7, long j9) {
            super(rangedUri, j, j6);
            this.indexStart = j7;
            this.indexLength = j9;
        }

        @Nullable
        public RangedUri getIndex() {
            long j = this.indexLength;
            if (j <= 0) {
                return null;
            }
            return new RangedUri(null, this.indexStart, j);
        }

        public SingleSegmentBase() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
