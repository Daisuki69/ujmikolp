package androidx.media3.common.util;

import O1.AbstractC0505d0;
import We.s;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.Utf8;
import qk.i;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ParsableByteArray {
    private static final char[] CR_AND_LF = {'\r', '\n'};
    private static final char[] LF = {'\n'};
    private static final AbstractC0505d0 SUPPORTED_CHARSETS_FOR_READLINE = AbstractC0505d0.j(5, N1.e.f3492a, N1.e.c, N1.e.f, N1.e.f3494d, N1.e.e);
    private byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int findNextLineTerminator(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.nio.charset.Charset r0 = N1.e.c
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L40
            java.nio.charset.Charset r0 = N1.e.f3492a
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L11
            goto L40
        L11:
            java.nio.charset.Charset r0 = N1.e.f
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L3e
            java.nio.charset.Charset r0 = N1.e.e
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L3e
            java.nio.charset.Charset r0 = N1.e.f3494d
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L2a
            goto L3e
        L2a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported charset: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L3e:
            r0 = 2
            goto L41
        L40:
            r0 = 1
        L41:
            int r1 = r4.position
        L43:
            int r2 = r4.limit
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto La2
            java.nio.charset.Charset r2 = N1.e.c
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L5b
            java.nio.charset.Charset r2 = N1.e.f3492a
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L66
        L5b:
            byte[] r2 = r4.data
            r2 = r2[r1]
            boolean r2 = androidx.media3.common.util.Util.isLinebreak(r2)
            if (r2 == 0) goto L66
            goto L9f
        L66:
            java.nio.charset.Charset r2 = N1.e.f
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L76
            java.nio.charset.Charset r2 = N1.e.f3494d
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L87
        L76:
            byte[] r2 = r4.data
            r3 = r2[r1]
            if (r3 != 0) goto L87
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = androidx.media3.common.util.Util.isLinebreak(r2)
            if (r2 == 0) goto L87
            goto L9f
        L87:
            java.nio.charset.Charset r2 = N1.e.e
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto La0
            byte[] r2 = r4.data
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto La0
            r2 = r2[r1]
            boolean r2 = androidx.media3.common.util.Util.isLinebreak(r2)
            if (r2 == 0) goto La0
        L9f:
            return r1
        La0:
            int r1 = r1 + r0
            goto L43
        La2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.ParsableByteArray.findNextLineTerminator(java.nio.charset.Charset):int");
    }

    private int peekCharacterAndSize(Charset charset) {
        byte b8;
        int i;
        byte b10;
        byte b11;
        if ((charset.equals(N1.e.c) || charset.equals(N1.e.f3492a)) && bytesLeft() >= 1) {
            long j = this.data[this.position] & 255;
            char c = (char) j;
            i.i(((long) c) == j, "Out of range: %s", j);
            b8 = (byte) c;
            i = 1;
        } else {
            i = 2;
            if ((charset.equals(N1.e.f) || charset.equals(N1.e.f3494d)) && bytesLeft() >= 2) {
                byte[] bArr = this.data;
                int i4 = this.position;
                b10 = bArr[i4];
                b11 = bArr[i4 + 1];
            } else {
                if (!charset.equals(N1.e.e) || bytesLeft() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.data;
                int i6 = this.position;
                b10 = bArr2[i6 + 1];
                b11 = bArr2[i6];
            }
            b8 = (byte) ((char) ((b11 & 255) | (b10 << 8)));
        }
        long j6 = b8;
        char c10 = (char) j6;
        i.i(((long) c10) == j6, "Out of range: %s", j6);
        return (c10 << 16) + i;
    }

    private char readCharacterIfInList(Charset charset, char[] cArr) {
        int iPeekCharacterAndSize = peekCharacterAndSize(charset);
        if (iPeekCharacterAndSize != 0) {
            char c = (char) (iPeekCharacterAndSize >> 16);
            for (char c10 : cArr) {
                if (c10 == c) {
                    this.position += iPeekCharacterAndSize & 65535;
                    return c;
                }
            }
        }
        return (char) 0;
    }

    private void skipLineTerminator(Charset charset) {
        if (readCharacterIfInList(charset, CR_AND_LF) == '\r') {
            readCharacterIfInList(charset, LF);
        }
    }

    public int bytesLeft() {
        return this.limit - this.position;
    }

    public int capacity() {
        return this.data.length;
    }

    public void ensureCapacity(int i) {
        if (i > capacity()) {
            this.data = Arrays.copyOf(this.data, i);
        }
    }

    public byte[] getData() {
        return this.data;
    }

    public int getPosition() {
        return this.position;
    }

    public int limit() {
        return this.limit;
    }

    public char peekChar() {
        byte[] bArr = this.data;
        int i = this.position;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public int peekUnsignedByte() {
        return this.data[this.position] & 255;
    }

    public void readBytes(ParsableBitArray parsableBitArray, int i) {
        readBytes(parsableBitArray.data, 0, i);
        parsableBitArray.setPosition(0);
    }

    @Nullable
    public String readDelimiterTerminatedString(char c) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i = this.position;
        while (i < this.limit && this.data[i] != c) {
            i++;
        }
        byte[] bArr = this.data;
        int i4 = this.position;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(bArr, i4, i - i4);
        this.position = i;
        if (i < this.limit) {
            this.position = i + 1;
        }
        return strFromUtf8Bytes;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public int readInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i4 = i + 1;
        this.position = i4;
        int i6 = (bArr[i] & 255) << 24;
        int i10 = i + 2;
        this.position = i10;
        int i11 = ((bArr[i4] & 255) << 16) | i6;
        int i12 = i + 3;
        this.position = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 8);
        this.position = i + 4;
        return (bArr[i12] & 255) | i13;
    }

    public int readInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i4 = i + 1;
        this.position = i4;
        int i6 = ((bArr[i] & 255) << 24) >> 8;
        int i10 = i + 2;
        this.position = i10;
        int i11 = ((bArr[i4] & 255) << 8) | i6;
        this.position = i + 3;
        return (bArr[i10] & 255) | i11;
    }

    @Nullable
    public String readLine() {
        return readLine(N1.e.c);
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i4 = i + 1;
        this.position = i4;
        int i6 = bArr[i] & 255;
        int i10 = i + 2;
        this.position = i10;
        int i11 = ((bArr[i4] & 255) << 8) | i6;
        int i12 = i + 3;
        this.position = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 16);
        this.position = i + 4;
        return ((bArr[i12] & 255) << 24) | i13;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i4 = i + 1;
        this.position = i4;
        int i6 = bArr[i] & 255;
        int i10 = i + 2;
        this.position = i10;
        int i11 = ((bArr[i4] & 255) << 8) | i6;
        this.position = i + 3;
        return ((bArr[i10] & 255) << 16) | i11;
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i = this.position;
        int i4 = i + 1;
        this.position = i4;
        long j = ((long) bArr[i]) & 255;
        int i6 = i + 2;
        this.position = i6;
        long j6 = j | ((((long) bArr[i4]) & 255) << 8);
        int i10 = i + 3;
        this.position = i10;
        long j7 = j6 | ((((long) bArr[i6]) & 255) << 16);
        int i11 = i + 4;
        this.position = i11;
        long j9 = j7 | ((((long) bArr[i10]) & 255) << 24);
        int i12 = i + 5;
        this.position = i12;
        long j10 = j9 | ((((long) bArr[i11]) & 255) << 32);
        int i13 = i + 6;
        this.position = i13;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i + 7;
        this.position = i14;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 48);
        this.position = i + 8;
        return ((((long) bArr[i14]) & 255) << 56) | j12;
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i4 = i + 1;
        this.position = i4;
        int i6 = bArr[i] & 255;
        this.position = i + 2;
        return (short) (((bArr[i4] & 255) << 8) | i6);
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i4 = i + 1;
        this.position = i4;
        long j = ((long) bArr[i]) & 255;
        int i6 = i + 2;
        this.position = i6;
        long j6 = j | ((((long) bArr[i4]) & 255) << 8);
        int i10 = i + 3;
        this.position = i10;
        long j7 = j6 | ((((long) bArr[i6]) & 255) << 16);
        this.position = i + 4;
        return ((((long) bArr[i10]) & 255) << 24) | j7;
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i4 = i + 1;
        this.position = i4;
        int i6 = bArr[i] & 255;
        int i10 = i + 2;
        this.position = i10;
        int i11 = ((bArr[i4] & 255) << 8) | i6;
        this.position = i + 3;
        return ((bArr[i10] & 255) << 16) | i11;
    }

    public int readLittleEndianUnsignedIntToInt() {
        int littleEndianInt = readLittleEndianInt();
        if (littleEndianInt >= 0) {
            return littleEndianInt;
        }
        throw new IllegalStateException(s.f(littleEndianInt, "Top bit not zero: "));
    }

    public int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i4 = i + 1;
        this.position = i4;
        int i6 = bArr[i] & 255;
        this.position = i + 2;
        return ((bArr[i4] & 255) << 8) | i6;
    }

    public long readLong() {
        byte[] bArr = this.data;
        int i = this.position;
        int i4 = i + 1;
        this.position = i4;
        long j = (((long) bArr[i]) & 255) << 56;
        int i6 = i + 2;
        this.position = i6;
        long j6 = j | ((((long) bArr[i4]) & 255) << 48);
        int i10 = i + 3;
        this.position = i10;
        long j7 = j6 | ((((long) bArr[i6]) & 255) << 40);
        int i11 = i + 4;
        this.position = i11;
        long j9 = j7 | ((((long) bArr[i10]) & 255) << 32);
        int i12 = i + 5;
        this.position = i12;
        long j10 = j9 | ((((long) bArr[i11]) & 255) << 24);
        int i13 = i + 6;
        this.position = i13;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i + 7;
        this.position = i14;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 8);
        this.position = i + 8;
        return (((long) bArr[i14]) & 255) | j12;
    }

    public String readNullTerminatedString(int i) {
        if (i == 0) {
            return "";
        }
        int i4 = this.position;
        int i6 = (i4 + i) - 1;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(this.data, i4, (i6 >= this.limit || this.data[i6] != 0) ? i : i - 1);
        this.position += i;
        return strFromUtf8Bytes;
    }

    public short readShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i4 = i + 1;
        this.position = i4;
        int i6 = (bArr[i] & 255) << 8;
        this.position = i + 2;
        return (short) ((bArr[i4] & 255) | i6);
    }

    public String readString(int i) {
        return readString(i, N1.e.c);
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedByte() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & 255;
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i = this.position;
        int i4 = i + 1;
        this.position = i4;
        int i6 = (bArr[i] & 255) << 8;
        this.position = i + 2;
        int i10 = (bArr[i4] & 255) | i6;
        this.position = i + 4;
        return i10;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i4 = i + 1;
        this.position = i4;
        long j = (((long) bArr[i]) & 255) << 24;
        int i6 = i + 2;
        this.position = i6;
        long j6 = j | ((((long) bArr[i4]) & 255) << 16);
        int i10 = i + 3;
        this.position = i10;
        long j7 = j6 | ((((long) bArr[i6]) & 255) << 8);
        this.position = i + 4;
        return (((long) bArr[i10]) & 255) | j7;
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i4 = i + 1;
        this.position = i4;
        int i6 = (bArr[i] & 255) << 16;
        int i10 = i + 2;
        this.position = i10;
        int i11 = ((bArr[i4] & 255) << 8) | i6;
        this.position = i + 3;
        return (bArr[i10] & 255) | i11;
    }

    public int readUnsignedIntToInt() {
        int i = readInt();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException(s.f(i, "Top bit not zero: "));
    }

    public long readUnsignedLongToLong() {
        long j = readLong();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException(androidx.camera.core.impl.a.f(j, "Top bit not zero: "));
    }

    public int readUnsignedShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i4 = i + 1;
        this.position = i4;
        int i6 = (bArr[i] & 255) << 8;
        this.position = i + 2;
        return (bArr[i4] & 255) | i6;
    }

    public long readUtf8EncodedLong() {
        int i;
        int i4;
        long j = this.data[this.position];
        int i6 = 7;
        while (true) {
            if (i6 < 0) {
                break;
            }
            int i10 = 1 << i6;
            if ((((long) i10) & j) != 0) {
                i6--;
            } else if (i6 < 6) {
                j &= (long) (i10 - 1);
                i4 = 7 - i6;
            } else if (i6 == 7) {
                i4 = 1;
            }
        }
        i4 = 0;
        if (i4 == 0) {
            throw new NumberFormatException(androidx.camera.core.impl.a.f(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i = 1; i < i4; i++) {
            byte b8 = this.data[this.position + i];
            if ((b8 & 192) != 128) {
                throw new NumberFormatException(androidx.camera.core.impl.a.f(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b8 & Utf8.REPLACEMENT_BYTE));
        }
        this.position += i4;
        return j;
    }

    @Nullable
    public Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.data;
            int i = this.position;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.position = i + 3;
                return N1.e.c;
            }
        }
        if (bytesLeft() < 2) {
            return null;
        }
        byte[] bArr2 = this.data;
        int i4 = this.position;
        byte b8 = bArr2[i4];
        if (b8 == -2 && bArr2[i4 + 1] == -1) {
            this.position = i4 + 2;
            return N1.e.f3494d;
        }
        if (b8 != -1 || bArr2[i4 + 1] != -2) {
            return null;
        }
        this.position = i4 + 2;
        return N1.e.e;
    }

    public void reset(int i) {
        reset(capacity() < i ? new byte[i] : this.data, i);
    }

    public void setLimit(int i) {
        Assertions.checkArgument(i >= 0 && i <= this.data.length);
        this.limit = i;
    }

    public void setPosition(int i) {
        Assertions.checkArgument(i >= 0 && i <= this.limit);
        this.position = i;
    }

    public void skipBytes(int i) {
        setPosition(this.position + i);
    }

    public char peekChar(Charset charset) {
        Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: " + charset);
        return (char) (peekCharacterAndSize(charset) >> 16);
    }

    @Nullable
    public String readLine(Charset charset) {
        Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: " + charset);
        if (bytesLeft() == 0) {
            return null;
        }
        if (!charset.equals(N1.e.f3492a)) {
            readUtfCharsetFromBom();
        }
        String string = readString(findNextLineTerminator(charset) - this.position, charset);
        if (this.position == this.limit) {
            return string;
        }
        skipLineTerminator(charset);
        return string;
    }

    public String readString(int i, Charset charset) {
        String str = new String(this.data, this.position, i, charset);
        this.position += i;
        return str;
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public ParsableByteArray(int i) {
        this.data = new byte[i];
        this.limit = i;
    }

    public void readBytes(byte[] bArr, int i, int i4) {
        System.arraycopy(this.data, this.position, bArr, i, i4);
        this.position += i4;
    }

    public void reset(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
        this.position = 0;
    }

    public void readBytes(ByteBuffer byteBuffer, int i) {
        byteBuffer.put(this.data, this.position, i);
        this.position += i;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    @Nullable
    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public ParsableByteArray(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
    }
}
