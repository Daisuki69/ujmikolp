package androidx.media3.extractor.mkv;

import androidx.media3.extractor.ExtractorInput;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class VarintReader {
    private static final int STATE_BEGIN_READING = 0;
    private static final int STATE_READ_CONTENTS = 1;
    private static final long[] VARINT_LENGTH_MASKS = {128, 64, 32, 16, 8, 4, 2, 1};
    private int length;
    private final byte[] scratch = new byte[8];
    private int state;

    public static long assembleVarint(byte[] bArr, int i, boolean z4) {
        long j = ((long) bArr[0]) & 255;
        if (z4) {
            j &= ~VARINT_LENGTH_MASKS[i - 1];
        }
        for (int i4 = 1; i4 < i; i4++) {
            j = (j << 8) | (((long) bArr[i4]) & 255);
        }
        return j;
    }

    public static int parseUnsignedVarintLength(int i) {
        int i4 = 0;
        while (true) {
            long[] jArr = VARINT_LENGTH_MASKS;
            if (i4 >= jArr.length) {
                return -1;
            }
            if ((jArr[i4] & ((long) i)) != 0) {
                return i4 + 1;
            }
            i4++;
        }
    }

    public int getLastLength() {
        return this.length;
    }

    public long readUnsignedVarint(ExtractorInput extractorInput, boolean z4, boolean z5, int i) throws IOException {
        if (this.state == 0) {
            if (!extractorInput.readFully(this.scratch, 0, 1, z4)) {
                return -1L;
            }
            int unsignedVarintLength = parseUnsignedVarintLength(this.scratch[0] & 255);
            this.length = unsignedVarintLength;
            if (unsignedVarintLength == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.state = 1;
        }
        int i4 = this.length;
        if (i4 > i) {
            this.state = 0;
            return -2L;
        }
        if (i4 != 1) {
            extractorInput.readFully(this.scratch, 1, i4 - 1);
        }
        this.state = 0;
        return assembleVarint(this.scratch, this.length, z5);
    }

    public void reset() {
        this.state = 0;
        this.length = 0;
    }
}
