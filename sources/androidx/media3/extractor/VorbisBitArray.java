package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class VorbisBitArray {
    private int bitOffset;
    private final int byteLimit;
    private int byteOffset;
    private final byte[] data;

    public VorbisBitArray(byte[] bArr) {
        this.data = bArr;
        this.byteLimit = bArr.length;
    }

    private void assertValidOffset() {
        int i;
        int i4 = this.byteOffset;
        Assertions.checkState(i4 >= 0 && (i4 < (i = this.byteLimit) || (i4 == i && this.bitOffset == 0)));
    }

    public int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    public int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public boolean readBit() {
        boolean z4 = (((this.data[this.byteOffset] & 255) >> this.bitOffset) & 1) == 1;
        skipBits(1);
        return z4;
    }

    public int readBits(int i) {
        int i4 = this.byteOffset;
        int iMin = Math.min(i, 8 - this.bitOffset);
        int i6 = i4 + 1;
        int i10 = ((this.data[i4] & 255) >> this.bitOffset) & (255 >> (8 - iMin));
        while (iMin < i) {
            i10 |= (this.data[i6] & 255) << iMin;
            iMin += 8;
            i6++;
        }
        int i11 = i10 & ((-1) >>> (32 - i));
        skipBits(i);
        return i11;
    }

    public void reset() {
        this.byteOffset = 0;
        this.bitOffset = 0;
    }

    public void setPosition(int i) {
        int i4 = i / 8;
        this.byteOffset = i4;
        this.bitOffset = i - (i4 * 8);
        assertValidOffset();
    }

    public void skipBits(int i) {
        int i4 = i / 8;
        int i6 = this.byteOffset + i4;
        this.byteOffset = i6;
        int i10 = (i - (i4 * 8)) + this.bitOffset;
        this.bitOffset = i10;
        if (i10 > 7) {
            this.byteOffset = i6 + 1;
            this.bitOffset = i10 - 8;
        }
        assertValidOffset();
    }
}
