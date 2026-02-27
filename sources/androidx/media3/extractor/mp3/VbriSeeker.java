package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.camera.core.impl.a;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* JADX INFO: loaded from: classes2.dex */
final class VbriSeeker implements Seeker {
    private static final String TAG = "VbriSeeker";
    private final int bitrate;
    private final long dataEndPosition;
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    private VbriSeeker(long[] jArr, long[] jArr2, long j, long j6, int i) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j;
        this.dataEndPosition = j6;
        this.bitrate = i;
    }

    @Nullable
    public static VbriSeeker create(long j, long j6, MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int unsignedByte;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        parsableByteArray2.skipBytes(10);
        int i = parsableByteArray2.readInt();
        VbriSeeker vbriSeeker = null;
        if (i <= 0) {
            return null;
        }
        int i4 = header.sampleRate;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(i, ((long) (i4 >= 32000 ? 1152 : 576)) * 1000000, i4);
        int unsignedShort = parsableByteArray2.readUnsignedShort();
        int unsignedShort2 = parsableByteArray2.readUnsignedShort();
        int unsignedShort3 = parsableByteArray2.readUnsignedShort();
        parsableByteArray2.skipBytes(2);
        long j7 = j6 + ((long) header.frameSize);
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        int i6 = 0;
        long j9 = j6;
        while (i6 < unsignedShort) {
            VbriSeeker vbriSeeker2 = vbriSeeker;
            int i10 = unsignedShort2;
            long j10 = j7;
            jArr[i6] = (((long) i6) * jScaleLargeTimestamp) / ((long) unsignedShort);
            jArr2[i6] = Math.max(j9, j10);
            if (unsignedShort3 == 1) {
                unsignedByte = parsableByteArray2.readUnsignedByte();
            } else if (unsignedShort3 == 2) {
                unsignedByte = parsableByteArray2.readUnsignedShort();
            } else if (unsignedShort3 == 3) {
                unsignedByte = parsableByteArray2.readUnsignedInt24();
            } else {
                if (unsignedShort3 != 4) {
                    return vbriSeeker2;
                }
                unsignedByte = parsableByteArray2.readUnsignedIntToInt();
            }
            j9 += ((long) unsignedByte) * ((long) i10);
            i6++;
            parsableByteArray2 = parsableByteArray;
            j7 = j10;
            unsignedShort2 = i10;
            vbriSeeker = vbriSeeker2;
            unsignedShort = unsignedShort;
        }
        if (j != -1 && j != j9) {
            StringBuilder sbS = a.s(j, "VBRI data size mismatch: ", ", ");
            sbS.append(j9);
            Log.w(TAG, sbS.toString());
        }
        return new VbriSeeker(jArr, jArr2, jScaleLargeTimestamp, j9, header.bitrate);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.timesUs, j, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[iBinarySearchFloor], this.positions[iBinarySearchFloor]);
        if (seekPoint.timeUs >= j || iBinarySearchFloor == this.timesUs.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs[i], this.positions[i]));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return this.timesUs[Util.binarySearchFloor(this.positions, j, true, true)];
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
