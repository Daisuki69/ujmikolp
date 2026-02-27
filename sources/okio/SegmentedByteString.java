package okio;

import androidx.camera.core.impl.a;
import androidx.media3.datasource.cache.c;
import kotlin.jvm.internal.j;
import okio.Buffer;
import zj.z;

/* JADX INFO: renamed from: okio.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class SegmentedByteString {
    private static final Buffer.UnsafeCursor DEFAULT__new_UnsafeCursor = new Buffer.UnsafeCursor();
    private static final int DEFAULT__ByteString_size = -1234567890;

    public static final int and(byte b8, int i) {
        return b8 & i;
    }

    public static final boolean arrayRangeEquals(byte[] a8, int i, byte[] b8, int i4, int i6) {
        j.g(a8, "a");
        j.g(b8, "b");
        for (int i10 = 0; i10 < i6; i10++) {
            if (a8[i10 + i] != b8[i10 + i4]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long j, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j || j - j6 < j7) {
            StringBuilder sbS = a.s(j, "size=", " offset=");
            sbS.append(j6);
            throw new ArrayIndexOutOfBoundsException(c.j(j7, " byteCount=", sbS));
        }
    }

    public static final int getDEFAULT__ByteString_size() {
        return DEFAULT__ByteString_size;
    }

    public static final Buffer.UnsafeCursor getDEFAULT__new_UnsafeCursor() {
        return DEFAULT__new_UnsafeCursor;
    }

    public static /* synthetic */ void getDEFAULT__new_UnsafeCursor$annotations() {
    }

    public static final int leftRotate(int i, int i4) {
        return (i >>> (32 - i4)) | (i << i4);
    }

    public static final long minOf(long j, int i) {
        return Math.min(j, i);
    }

    public static final Buffer.UnsafeCursor resolveDefaultParameter(Buffer.UnsafeCursor unsafeCursor) {
        j.g(unsafeCursor, "unsafeCursor");
        return unsafeCursor == DEFAULT__new_UnsafeCursor ? new Buffer.UnsafeCursor() : unsafeCursor;
    }

    public static final int reverseBytes(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final long rightRotate(long j, int i) {
        return (j << (64 - i)) | (j >>> i);
    }

    public static final int shl(byte b8, int i) {
        return b8 << i;
    }

    public static final int shr(byte b8, int i) {
        return b8 >> i;
    }

    public static final String toHexString(byte b8) {
        return new String(new char[]{okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b8 >> 4) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[b8 & 15]});
    }

    public static final byte xor(byte b8, byte b10) {
        return (byte) (b8 ^ b10);
    }

    public static final long and(byte b8, long j) {
        return j & ((long) b8);
    }

    public static final long minOf(int i, long j) {
        return Math.min(i, j);
    }

    public static final int resolveDefaultParameter(ByteString byteString, int i) {
        j.g(byteString, "<this>");
        return i == DEFAULT__ByteString_size ? byteString.size() : i;
    }

    public static final long reverseBytes(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static final long and(int i, long j) {
        return j & ((long) i);
    }

    public static final int resolveDefaultParameter(byte[] bArr, int i) {
        j.g(bArr, "<this>");
        return i == DEFAULT__ByteString_size ? bArr.length : i;
    }

    public static final short reverseBytes(short s9) {
        return (short) (((s9 & 255) << 8) | ((65280 & s9) >>> 8));
    }

    public static final String toHexString(int i) {
        int i4 = 0;
        if (i == 0) {
            return "0";
        }
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 28) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 24) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 20) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 16) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 12) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 8) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 4) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[i & 15]};
        while (i4 < 8 && cArr[i4] == '0') {
            i4++;
        }
        return z.i(cArr, i4, 8);
    }

    public static final String toHexString(long j) {
        if (j == 0) {
            return "0";
        }
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 60) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 56) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 52) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 48) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 44) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 40) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 36) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 32) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 28) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 24) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 20) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 16) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 12) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 8) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 4) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) (j & 15)]};
        int i = 0;
        while (i < 16 && cArr[i] == '0') {
            i++;
        }
        return z.i(cArr, i, 16);
    }
}
