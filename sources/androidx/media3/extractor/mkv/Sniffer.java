package androidx.media3.extractor.mkv;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class Sniffer {
    private static final int ID_EBML = 440786851;
    private static final int SEARCH_LENGTH = 1024;
    private int peekLength;
    private final ParsableByteArray scratch = new ParsableByteArray(8);

    private long readUint(ExtractorInput extractorInput) throws IOException {
        int i = 0;
        extractorInput.peekFully(this.scratch.getData(), 0, 1);
        int i4 = this.scratch.getData()[0] & 255;
        if (i4 == 0) {
            return Long.MIN_VALUE;
        }
        int i6 = 128;
        int i10 = 0;
        while ((i4 & i6) == 0) {
            i6 >>= 1;
            i10++;
        }
        int i11 = i4 & (~i6);
        extractorInput.peekFully(this.scratch.getData(), 1, i10);
        while (i < i10) {
            i++;
            i11 = (this.scratch.getData()[i] & 255) + (i11 << 8);
        }
        this.peekLength = i10 + 1 + this.peekLength;
        return i11;
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        long length = extractorInput.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i = (int) j;
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        long unsignedInt = this.scratch.readUnsignedInt();
        this.peekLength = 4;
        while (unsignedInt != 440786851) {
            int i4 = this.peekLength + 1;
            this.peekLength = i4;
            if (i4 == i) {
                return false;
            }
            extractorInput.peekFully(this.scratch.getData(), 0, 1);
            unsignedInt = ((unsignedInt << 8) & (-256)) | ((long) (this.scratch.getData()[0] & 255));
        }
        long uint = readUint(extractorInput);
        long j6 = this.peekLength;
        if (uint != Long.MIN_VALUE && (length == -1 || j6 + uint < length)) {
            while (true) {
                int i6 = this.peekLength;
                long j7 = j6 + uint;
                if (i6 < j7) {
                    if (readUint(extractorInput) == Long.MIN_VALUE) {
                        return false;
                    }
                    long uint2 = readUint(extractorInput);
                    if (uint2 < 0 || uint2 > 2147483647L) {
                        break;
                    }
                    if (uint2 != 0) {
                        int i10 = (int) uint2;
                        extractorInput.advancePeekPosition(i10);
                        this.peekLength += i10;
                    }
                } else if (i6 == j7) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
