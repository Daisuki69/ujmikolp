package androidx.media3.extractor;

import androidx.media3.common.C;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SeekMap;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class ConstantBitrateSeekMap implements SeekMap {
    private final boolean allowSeeksIfLengthUnknown;
    private final int bitrate;
    private final long dataSize;
    private final long durationUs;
    private final long firstFrameBytePosition;
    private final int frameSize;
    private final long inputLength;

    public ConstantBitrateSeekMap(long j, long j6, int i, int i4) {
        this(j, j6, i, i4, false);
    }

    private long getFramePositionForTimeUs(long j) {
        long j6 = (j * ((long) this.bitrate)) / 8000000;
        int i = this.frameSize;
        long jMin = (j6 / ((long) i)) * ((long) i);
        long j7 = this.dataSize;
        if (j7 != -1) {
            jMin = Math.min(jMin, j7 - ((long) i));
        }
        return this.firstFrameBytePosition + Math.max(jMin, 0L);
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        if (this.dataSize == -1 && !this.allowSeeksIfLengthUnknown) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.firstFrameBytePosition));
        }
        long framePositionForTimeUs = getFramePositionForTimeUs(j);
        long timeUsAtPosition = getTimeUsAtPosition(framePositionForTimeUs);
        SeekPoint seekPoint = new SeekPoint(timeUsAtPosition, framePositionForTimeUs);
        if (this.dataSize != -1 && timeUsAtPosition < j) {
            int i = this.frameSize;
            if (((long) i) + framePositionForTimeUs < this.inputLength) {
                long j6 = framePositionForTimeUs + ((long) i);
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUsAtPosition(j6), j6));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    public long getTimeUsAtPosition(long j) {
        return getTimeUsAtPosition(j, this.firstFrameBytePosition, this.bitrate);
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.dataSize != -1 || this.allowSeeksIfLengthUnknown;
    }

    public ConstantBitrateSeekMap(long j, long j6, int i, int i4, boolean z4) {
        this.inputLength = j;
        this.firstFrameBytePosition = j6;
        this.frameSize = i4 == -1 ? 1 : i4;
        this.bitrate = i;
        this.allowSeeksIfLengthUnknown = z4;
        if (j == -1) {
            this.dataSize = -1L;
            this.durationUs = C.TIME_UNSET;
        } else {
            this.dataSize = j - j6;
            this.durationUs = getTimeUsAtPosition(j, j6, i);
        }
    }

    private static long getTimeUsAtPosition(long j, long j6, int i) {
        return (Math.max(0L, j - j6) * 8000000) / ((long) i);
    }
}
