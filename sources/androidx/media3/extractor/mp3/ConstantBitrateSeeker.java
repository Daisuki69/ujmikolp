package androidx.media3.extractor.mp3;

import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.MpegAudioUtil;

/* JADX INFO: loaded from: classes2.dex */
final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Seeker {
    private final int bitrate;
    private final long dataEndPosition;

    public ConstantBitrateSeeker(long j, long j6, MpegAudioUtil.Header header, boolean z4) {
        this(j, j6, header.bitrate, header.frameSize, z4);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return getTimeUsAtPosition(j);
    }

    public ConstantBitrateSeeker(long j, long j6, int i, int i4, boolean z4) {
        super(j, j6, i, i4, z4);
        long j7 = j;
        this.bitrate = i;
        this.dataEndPosition = j7 == -1 ? -1L : j7;
    }
}
