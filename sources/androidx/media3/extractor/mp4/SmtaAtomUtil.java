package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
import androidx.media3.extractor.ts.PsExtractor;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class SmtaAtomUtil {
    private static final int CAMCORDER_FRC_SUPERSLOW_MOTION = 9;
    private static final int CAMCORDER_FRC_SUPERSLOW_MOTION_HEVC = 22;
    private static final int CAMCORDER_NORMAL = 0;
    private static final int CAMCORDER_QFRC_SUPERSLOW_MOTION = 23;
    private static final int CAMCORDER_SINGLE_SUPERSLOW_MOTION = 7;
    private static final int CAMCORDER_SLOW_MOTION_V2 = 12;
    private static final int CAMCORDER_SLOW_MOTION_V2_120 = 13;
    private static final int CAMCORDER_SLOW_MOTION_V2_HEVC = 21;
    private static final int NO_VALUE = -1;

    private SmtaAtomUtil() {
    }

    private static int getCaptureFrameRate(int i, ParsableByteArray parsableByteArray, int i4) {
        if (i == 12) {
            return PsExtractor.VIDEO_STREAM_MASK;
        }
        if (i == 13) {
            return 120;
        }
        if (i == 21 && parsableByteArray.bytesLeft() >= 8 && parsableByteArray.getPosition() + 8 <= i4) {
            int i6 = parsableByteArray.readInt();
            int i10 = parsableByteArray.readInt();
            if (i6 >= 12 && i10 == 1936877170) {
                return parsableByteArray.readUnsignedFixedPoint1616();
            }
        }
        return C.RATE_UNSET_INT;
    }

    @Nullable
    public static Metadata parseSmta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int i4 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1935766900) {
                if (i4 < 16) {
                    return null;
                }
                parsableByteArray.skipBytes(4);
                int i6 = -1;
                int i10 = 0;
                for (int i11 = 0; i11 < 2; i11++) {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    int unsignedByte2 = parsableByteArray.readUnsignedByte();
                    if (unsignedByte == 0) {
                        i6 = unsignedByte2;
                    } else if (unsignedByte == 1) {
                        i10 = unsignedByte2;
                    }
                }
                int captureFrameRate = getCaptureFrameRate(i6, parsableByteArray, i);
                if (captureFrameRate == -2147483647) {
                    return null;
                }
                return new Metadata(new SmtaMetadataEntry(captureFrameRate, i10));
            }
            parsableByteArray.setPosition(position + i4);
        }
        return null;
    }
}
