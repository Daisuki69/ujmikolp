package androidx.media3.common.util;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ParsableBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    public byte[] data;

    public ParsableBitArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    private void assertValidOffset() {
        int i;
        int i4 = this.byteOffset;
        Assertions.checkState(i4 >= 0 && (i4 < (i = this.byteLimit) || (i4 == i && this.bitOffset == 0)));
    }

    public int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    public void byteAlign() {
        if (this.bitOffset == 0) {
            return;
        }
        this.bitOffset = 0;
        this.byteOffset++;
        assertValidOffset();
    }

    public int getBytePosition() {
        Assertions.checkState(this.bitOffset == 0);
        return this.byteOffset;
    }

    public int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public void putInt(int i, int i4) {
        if (i4 < 32) {
            i &= (1 << i4) - 1;
        }
        int iMin = Math.min(8 - this.bitOffset, i4);
        int i6 = this.bitOffset;
        int i10 = (8 - i6) - iMin;
        byte[] bArr = this.data;
        int i11 = this.byteOffset;
        byte b8 = (byte) (((65280 >> i6) | ((1 << i10) - 1)) & bArr[i11]);
        bArr[i11] = b8;
        int i12 = i4 - iMin;
        bArr[i11] = (byte) (b8 | ((i >>> i12) << i10));
        int i13 = i11 + 1;
        while (i12 > 8) {
            this.data[i13] = (byte) (i >>> (i12 - 8));
            i12 -= 8;
            i13++;
        }
        int i14 = 8 - i12;
        byte[] bArr2 = this.data;
        byte b10 = (byte) (bArr2[i13] & ((1 << i14) - 1));
        bArr2[i13] = b10;
        bArr2[i13] = (byte) (((i & ((1 << i12) - 1)) << i14) | b10);
        skipBits(i4);
        assertValidOffset();
    }

    public boolean readBit() {
        boolean z4 = (this.data[this.byteOffset] & (128 >> this.bitOffset)) != 0;
        skipBit();
        return z4;
    }

    public int readBits(int i) {
        int i4;
        if (i == 0) {
            return 0;
        }
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
            this.byteOffset = i11 + 1;
            i6 |= (bArr[i11] & 255) << i10;
        }
        byte[] bArr2 = this.data;
        int i12 = this.byteOffset;
        int i13 = ((-1) >>> (32 - i)) & (i6 | ((bArr2[i12] & 255) >> (8 - i4)));
        if (i4 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i12 + 1;
        }
        assertValidOffset();
        return i13;
    }

    public long readBitsToLong(int i) {
        return i <= 32 ? Util.toUnsignedLong(readBits(i)) : Util.toLong(readBits(i - 32), readBits(32));
    }

    public void readBytes(byte[] bArr, int i, int i4) {
        Assertions.checkState(this.bitOffset == 0);
        System.arraycopy(this.data, this.byteOffset, bArr, i, i4);
        this.byteOffset += i4;
        assertValidOffset();
    }

    public String readBytesAsString(int i) {
        return readBytesAsString(i, N1.e.c);
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void setPosition(int i) {
        int i4 = i / 8;
        this.byteOffset = i4;
        this.bitOffset = i - (i4 * 8);
        assertValidOffset();
    }

    public void skipBit() {
        int i = this.bitOffset + 1;
        this.bitOffset = i;
        if (i == 8) {
            this.bitOffset = 0;
            this.byteOffset++;
        }
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

    public void skipBytes(int i) {
        Assertions.checkState(this.bitOffset == 0);
        this.byteOffset += i;
        assertValidOffset();
    }

    public String readBytesAsString(int i, Charset charset) {
        byte[] bArr = new byte[i];
        readBytes(bArr, 0, i);
        return new String(bArr, charset);
    }

    public void reset(ParsableByteArray parsableByteArray) {
        reset(parsableByteArray.getData(), parsableByteArray.limit());
        setPosition(parsableByteArray.getPosition() * 8);
    }

    public ParsableBitArray(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public ParsableBitArray(byte[] bArr, int i) {
        this.data = bArr;
        this.byteLimit = i;
    }

    public void reset(byte[] bArr, int i) {
        this.data = bArr;
        this.byteOffset = 0;
        this.bitOffset = 0;
        this.byteLimit = i;
    }

    public void readBits(byte[] bArr, int i, int i4) {
        int i6 = (i4 >> 3) + i;
        while (i < i6) {
            byte[] bArr2 = this.data;
            int i10 = this.byteOffset;
            int i11 = i10 + 1;
            this.byteOffset = i11;
            byte b8 = bArr2[i10];
            int i12 = this.bitOffset;
            byte b10 = (byte) (b8 << i12);
            bArr[i] = b10;
            bArr[i] = (byte) (((255 & bArr2[i11]) >> (8 - i12)) | b10);
            i++;
        }
        int i13 = i4 & 7;
        if (i13 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i6] & (255 >> i13));
        bArr[i6] = b11;
        int i14 = this.bitOffset;
        if (i14 + i13 > 8) {
            byte[] bArr3 = this.data;
            int i15 = this.byteOffset;
            this.byteOffset = i15 + 1;
            bArr[i6] = (byte) (b11 | ((bArr3[i15] & 255) << i14));
            this.bitOffset = i14 - 8;
        }
        int i16 = this.bitOffset + i13;
        this.bitOffset = i16;
        byte[] bArr4 = this.data;
        int i17 = this.byteOffset;
        bArr[i6] = (byte) (((byte) (((255 & bArr4[i17]) >> (8 - i16)) << (8 - i13))) | bArr[i6]);
        if (i16 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i17 + 1;
        }
        assertValidOffset();
    }
}
