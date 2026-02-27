package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class DefaultExtractorInput implements ExtractorInput {
    private static final int PEEK_MAX_FREE_SPACE = 524288;
    private static final int PEEK_MIN_FREE_SPACE_AFTER_RESIZE = 65536;
    private static final int SCRATCH_SPACE_SIZE = 4096;
    private final DataReader dataReader;
    private int peekBufferLength;
    private int peekBufferPosition;
    private long position;
    private final long streamLength;
    private byte[] peekBuffer = new byte[65536];
    private final byte[] scratchSpace = new byte[4096];

    static {
        MediaLibraryInfo.registerModule("media3.extractor");
    }

    public DefaultExtractorInput(DataReader dataReader, long j, long j6) {
        this.dataReader = dataReader;
        this.position = j;
        this.streamLength = j6;
    }

    private void commitBytesRead(int i) {
        if (i != -1) {
            this.position += (long) i;
        }
    }

    private void ensureSpaceForPeek(int i) {
        int i4 = this.peekBufferPosition + i;
        byte[] bArr = this.peekBuffer;
        if (i4 > bArr.length) {
            this.peekBuffer = Arrays.copyOf(this.peekBuffer, Util.constrainValue(bArr.length * 2, 65536 + i4, i4 + 524288));
        }
    }

    private int readFromPeekBuffer(byte[] bArr, int i, int i4) {
        int i6 = this.peekBufferLength;
        if (i6 == 0) {
            return 0;
        }
        int iMin = Math.min(i6, i4);
        System.arraycopy(this.peekBuffer, 0, bArr, i, iMin);
        updatePeekBuffer(iMin);
        return iMin;
    }

    private int readFromUpstream(byte[] bArr, int i, int i4, int i6, boolean z4) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i10 = this.dataReader.read(bArr, i + i6, i4 - i6);
        if (i10 != -1) {
            return i6 + i10;
        }
        if (i6 == 0 && z4) {
            return -1;
        }
        throw new EOFException();
    }

    private int skipFromPeekBuffer(int i) {
        int iMin = Math.min(this.peekBufferLength, i);
        updatePeekBuffer(iMin);
        return iMin;
    }

    private void updatePeekBuffer(int i) {
        int i4 = this.peekBufferLength - i;
        this.peekBufferLength = i4;
        this.peekBufferPosition = 0;
        byte[] bArr = this.peekBuffer;
        byte[] bArr2 = i4 < bArr.length - 524288 ? new byte[65536 + i4] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i4);
        this.peekBuffer = bArr2;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean advancePeekPosition(int i, boolean z4) throws IOException {
        ensureSpaceForPeek(i);
        int fromUpstream = this.peekBufferLength - this.peekBufferPosition;
        while (fromUpstream < i) {
            int i4 = i;
            boolean z5 = z4;
            fromUpstream = readFromUpstream(this.peekBuffer, this.peekBufferPosition, i4, fromUpstream, z5);
            if (fromUpstream == -1) {
                return false;
            }
            this.peekBufferLength = this.peekBufferPosition + fromUpstream;
            i = i4;
            z4 = z5;
        }
        this.peekBufferPosition += i;
        return true;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getLength() {
        return this.streamLength;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.position + ((long) this.peekBufferPosition);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getPosition() {
        return this.position;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public int peek(byte[] bArr, int i, int i4) throws IOException {
        DefaultExtractorInput defaultExtractorInput;
        int iMin;
        ensureSpaceForPeek(i4);
        int i6 = this.peekBufferLength;
        int i10 = this.peekBufferPosition;
        int i11 = i6 - i10;
        if (i11 == 0) {
            defaultExtractorInput = this;
            iMin = defaultExtractorInput.readFromUpstream(this.peekBuffer, i10, i4, 0, true);
            if (iMin == -1) {
                return -1;
            }
            defaultExtractorInput.peekBufferLength += iMin;
        } else {
            defaultExtractorInput = this;
            iMin = Math.min(i4, i11);
        }
        System.arraycopy(defaultExtractorInput.peekBuffer, defaultExtractorInput.peekBufferPosition, bArr, i, iMin);
        defaultExtractorInput.peekBufferPosition += iMin;
        return iMin;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean peekFully(byte[] bArr, int i, int i4, boolean z4) throws IOException {
        if (!advancePeekPosition(i4, z4)) {
            return false;
        }
        System.arraycopy(this.peekBuffer, this.peekBufferPosition - i4, bArr, i, i4);
        return true;
    }

    @Override // androidx.media3.extractor.ExtractorInput, androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i4) throws IOException {
        int fromPeekBuffer = readFromPeekBuffer(bArr, i, i4);
        if (fromPeekBuffer == 0) {
            fromPeekBuffer = readFromUpstream(bArr, i, i4, 0, true);
        }
        commitBytesRead(fromPeekBuffer);
        return fromPeekBuffer;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean readFully(byte[] bArr, int i, int i4, boolean z4) throws IOException {
        int fromPeekBuffer = readFromPeekBuffer(bArr, i, i4);
        while (fromPeekBuffer < i4 && fromPeekBuffer != -1) {
            fromPeekBuffer = readFromUpstream(bArr, i, i4, fromPeekBuffer, z4);
        }
        commitBytesRead(fromPeekBuffer);
        return fromPeekBuffer != -1;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void resetPeekPosition() {
        this.peekBufferPosition = 0;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable {
        Assertions.checkArgument(j >= 0);
        this.position = j;
        throw e;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public int skip(int i) throws IOException {
        int iSkipFromPeekBuffer = skipFromPeekBuffer(i);
        if (iSkipFromPeekBuffer == 0) {
            byte[] bArr = this.scratchSpace;
            iSkipFromPeekBuffer = readFromUpstream(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        commitBytesRead(iSkipFromPeekBuffer);
        return iSkipFromPeekBuffer;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean skipFully(int i, boolean z4) throws IOException {
        int iSkipFromPeekBuffer = skipFromPeekBuffer(i);
        while (iSkipFromPeekBuffer < i && iSkipFromPeekBuffer != -1) {
            iSkipFromPeekBuffer = readFromUpstream(this.scratchSpace, -iSkipFromPeekBuffer, Math.min(i, this.scratchSpace.length + iSkipFromPeekBuffer), iSkipFromPeekBuffer, z4);
        }
        commitBytesRead(iSkipFromPeekBuffer);
        return iSkipFromPeekBuffer != -1;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void peekFully(byte[] bArr, int i, int i4) throws IOException {
        peekFully(bArr, i, i4, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i, int i4) throws IOException {
        readFully(bArr, i, i4, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void skipFully(int i) throws IOException {
        skipFully(i, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void advancePeekPosition(int i) throws IOException {
        advancePeekPosition(i, false);
    }
}
