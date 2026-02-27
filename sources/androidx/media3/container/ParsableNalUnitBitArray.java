package androidx.media3.container;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ParsableNalUnitBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    private byte[] data;

    public ParsableNalUnitBitArray(byte[] bArr, int i, int i4) {
        reset(bArr, i, i4);
    }

    private void assertValidOffset() {
        int i;
        int i4 = this.byteOffset;
        Assertions.checkState(i4 >= 0 && (i4 < (i = this.byteLimit) || (i4 == i && this.bitOffset == 0)));
    }

    private int readExpGolombCodeNum() {
        int i = 0;
        while (!readBit()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? readBits(i) : 0);
    }

    private boolean shouldSkipByte(int i) {
        if (2 > i || i >= this.byteLimit) {
            return false;
        }
        byte[] bArr = this.data;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    public boolean canReadBits(int i) {
        int i4 = this.byteOffset;
        int i6 = i / 8;
        int i10 = i4 + i6;
        int i11 = (this.bitOffset + i) - (i6 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i4++;
            if (i4 > i10 || i10 >= this.byteLimit) {
                break;
            }
            if (shouldSkipByte(i4)) {
                i10++;
                i4 += 2;
            }
        }
        int i12 = this.byteLimit;
        if (i10 >= i12) {
            return i10 == i12 && i11 == 0;
        }
        return true;
    }

    public boolean canReadExpGolombCodedNum() {
        int i = this.byteOffset;
        int i4 = this.bitOffset;
        int i6 = 0;
        while (this.byteOffset < this.byteLimit && !readBit()) {
            i6++;
        }
        boolean z4 = this.byteOffset == this.byteLimit;
        this.byteOffset = i;
        this.bitOffset = i4;
        return !z4 && canReadBits((i6 * 2) + 1);
    }

    public boolean readBit() {
        boolean z4 = (this.data[this.byteOffset] & (128 >> this.bitOffset)) != 0;
        skipBit();
        return z4;
    }

    public int readBits(int i) {
        int i4;
        this.bitOffset += i;
        int i6 = 0;
        while (true) {
            i4 = this.bitOffset;
            if (i4 <= 8) {
                break;
            }
            int i10 = i4 - 8;
            this.bitOffset = i10;
            byte[] bArr = this.data;
            int i11 = this.byteOffset;
            i6 |= (bArr[i11] & 255) << i10;
            if (!shouldSkipByte(i11 + 1)) {
                i = 1;
            }
            this.byteOffset = i11 + i;
        }
        byte[] bArr2 = this.data;
        int i12 = this.byteOffset;
        int i13 = ((-1) >>> (32 - i)) & (i6 | ((bArr2[i12] & 255) >> (8 - i4)));
        if (i4 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i12 + (shouldSkipByte(i12 + 1) ? 2 : 1);
        }
        assertValidOffset();
        return i13;
    }

    public int readSignedExpGolombCodedInt() {
        int expGolombCodeNum = readExpGolombCodeNum();
        return ((expGolombCodeNum + 1) / 2) * (expGolombCodeNum % 2 == 0 ? -1 : 1);
    }

    public int readUnsignedExpGolombCodedInt() {
        return readExpGolombCodeNum();
    }

    public void reset(byte[] bArr, int i, int i4) {
        this.data = bArr;
        this.byteOffset = i;
        this.byteLimit = i4;
        this.bitOffset = 0;
        assertValidOffset();
    }

    public void skipBit() {
        int i = this.bitOffset + 1;
        this.bitOffset = i;
        if (i == 8) {
            this.bitOffset = 0;
            int i4 = this.byteOffset;
            this.byteOffset = i4 + (shouldSkipByte(i4 + 1) ? 2 : 1);
        }
        assertValidOffset();
    }

    public void skipBits(int i) {
        int i4 = this.byteOffset;
        int i6 = i / 8;
        int i10 = i4 + i6;
        this.byteOffset = i10;
        int i11 = (i - (i6 * 8)) + this.bitOffset;
        this.bitOffset = i11;
        if (i11 > 7) {
            this.byteOffset = i10 + 1;
            this.bitOffset = i11 - 8;
        }
        while (true) {
            i4++;
            if (i4 > this.byteOffset) {
                assertValidOffset();
                return;
            } else if (shouldSkipByte(i4)) {
                this.byteOffset++;
                i4 += 2;
            }
        }
    }
}
