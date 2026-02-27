package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;

/* JADX INFO: loaded from: classes2.dex */
final class XingFrame {
    public final long dataSize;
    public final int encoderDelay;
    public final int encoderPadding;
    public final long frameCount;
    public final MpegAudioUtil.Header header;

    @Nullable
    public final long[] tableOfContents;

    private XingFrame(MpegAudioUtil.Header header, long j, long j6, @Nullable long[] jArr, int i, int i4) {
        this.header = new MpegAudioUtil.Header(header);
        this.frameCount = j;
        this.dataSize = j6;
        this.tableOfContents = jArr;
        this.encoderDelay = i;
        this.encoderPadding = i4;
    }

    public static XingFrame parse(MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        long[] jArr;
        int i;
        int i4;
        int i6 = parsableByteArray.readInt();
        int unsignedIntToInt = (i6 & 1) != 0 ? parsableByteArray.readUnsignedIntToInt() : -1;
        long unsignedInt = (i6 & 2) != 0 ? parsableByteArray.readUnsignedInt() : -1L;
        if ((i6 & 4) == 4) {
            jArr = new long[100];
            for (int i10 = 0; i10 < 100; i10++) {
                jArr[i10] = parsableByteArray.readUnsignedByte();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((i6 & 8) != 0) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.bytesLeft() >= 24) {
            parsableByteArray.skipBytes(21);
            int unsignedInt24 = parsableByteArray.readUnsignedInt24();
            i4 = unsignedInt24 & 4095;
            i = (16773120 & unsignedInt24) >> 12;
        } else {
            i = -1;
            i4 = -1;
        }
        return new XingFrame(header, unsignedIntToInt, unsignedInt, jArr2, i, i4);
    }

    public long computeDurationUs() {
        long j = this.frameCount;
        if (j == -1 || j == 0) {
            return C.TIME_UNSET;
        }
        MpegAudioUtil.Header header = this.header;
        return Util.sampleCountToDurationUs((j * ((long) header.samplesPerFrame)) - 1, header.sampleRate);
    }
}
