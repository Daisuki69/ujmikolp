package okio.internal;

import We.s;
import androidx.media3.datasource.cache.c;
import cj.C1127m;
import com.dynatrace.android.agent.Global;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import okio.Base64;
import okio.Buffer;
import okio.SegmentedByteString;
import okio._JvmPlatformKt;
import zj.z;

/* JADX INFO: renamed from: okio.internal.-ByteString, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class ByteString {
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0113, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01b5, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005c, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a0, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int codePointIndexToCharIndex(byte[] r19, int r20) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.ByteString.codePointIndexToCharIndex(byte[], int):int");
    }

    public static final String commonBase64(okio.ByteString byteString) {
        j.g(byteString, "<this>");
        return Base64.encodeBase64$default(byteString.getData$okio(), null, 1, null);
    }

    public static final String commonBase64Url(okio.ByteString byteString) {
        j.g(byteString, "<this>");
        return Base64.encodeBase64(byteString.getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(okio.ByteString byteString, okio.ByteString other) {
        j.g(byteString, "<this>");
        j.g(other, "other");
        int size = byteString.size();
        int size2 = other.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int i4 = byteString.getByte(i) & 255;
            int i6 = other.getByte(i) & 255;
            if (i4 != i6) {
                return i4 < i6 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final void commonCopyInto(okio.ByteString byteString, int i, byte[] target, int i4, int i6) {
        j.g(byteString, "<this>");
        j.g(target, "target");
        C1127m.d(i4, i, i6 + i, byteString.getData$okio(), target);
    }

    public static final okio.ByteString commonDecodeBase64(String str) {
        j.g(str, "<this>");
        byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (bArrDecodeBase64ToArray != null) {
            return new okio.ByteString(bArrDecodeBase64ToArray);
        }
        return null;
    }

    public static final okio.ByteString commonDecodeHex(String str) {
        j.g(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i4 = i * 2;
            bArr[i] = (byte) (decodeHexDigit(str.charAt(i4 + 1)) + (decodeHexDigit(str.charAt(i4)) << 4));
        }
        return new okio.ByteString(bArr);
    }

    public static final okio.ByteString commonEncodeUtf8(String str) {
        j.g(str, "<this>");
        okio.ByteString byteString = new okio.ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final boolean commonEndsWith(okio.ByteString byteString, okio.ByteString suffix) {
        j.g(byteString, "<this>");
        j.g(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final boolean commonEquals(okio.ByteString byteString, Object obj) {
        j.g(byteString, "<this>");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof okio.ByteString) {
            okio.ByteString byteString2 = (okio.ByteString) obj;
            if (byteString2.size() == byteString.getData$okio().length && byteString2.rangeEquals(0, byteString.getData$okio(), 0, byteString.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(okio.ByteString byteString, int i) {
        j.g(byteString, "<this>");
        return byteString.getData$okio()[i];
    }

    public static final int commonGetSize(okio.ByteString byteString) {
        j.g(byteString, "<this>");
        return byteString.getData$okio().length;
    }

    public static final int commonHashCode(okio.ByteString byteString) {
        j.g(byteString, "<this>");
        int hashCode$okio = byteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(byteString.getData$okio());
        byteString.setHashCode$okio(iHashCode);
        return iHashCode;
    }

    public static final String commonHex(okio.ByteString byteString) {
        j.g(byteString, "<this>");
        char[] cArr = new char[byteString.getData$okio().length * 2];
        int i = 0;
        for (byte b8 : byteString.getData$okio()) {
            int i4 = i + 1;
            cArr[i] = getHEX_DIGIT_CHARS()[(b8 >> 4) & 15];
            i += 2;
            cArr[i4] = getHEX_DIGIT_CHARS()[b8 & 15];
        }
        return new String(cArr);
    }

    public static final int commonIndexOf(okio.ByteString byteString, byte[] other, int i) {
        j.g(byteString, "<this>");
        j.g(other, "other");
        int length = byteString.getData$okio().length - other.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public static final byte[] commonInternalArray(okio.ByteString byteString) {
        j.g(byteString, "<this>");
        return byteString.getData$okio();
    }

    public static final int commonLastIndexOf(okio.ByteString byteString, okio.ByteString other, int i) {
        j.g(byteString, "<this>");
        j.g(other, "other");
        return byteString.lastIndexOf(other.internalArray$okio(), i);
    }

    public static final okio.ByteString commonOf(byte[] data) {
        j.g(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        j.f(bArrCopyOf, "copyOf(...)");
        return new okio.ByteString(bArrCopyOf);
    }

    public static final boolean commonRangeEquals(okio.ByteString byteString, int i, okio.ByteString other, int i4, int i6) {
        j.g(byteString, "<this>");
        j.g(other, "other");
        return other.rangeEquals(i4, byteString.getData$okio(), i, i6);
    }

    public static final boolean commonStartsWith(okio.ByteString byteString, okio.ByteString prefix) {
        j.g(byteString, "<this>");
        j.g(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.size());
    }

    public static final okio.ByteString commonSubstring(okio.ByteString byteString, int i, int i4) {
        j.g(byteString, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, i4);
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iResolveDefaultParameter > byteString.getData$okio().length) {
            throw new IllegalArgumentException(s.m(new StringBuilder("endIndex > length("), byteString.getData$okio().length, ')').toString());
        }
        if (iResolveDefaultParameter - i >= 0) {
            return (i == 0 && iResolveDefaultParameter == byteString.getData$okio().length) ? byteString : new okio.ByteString(C1127m.k(i, iResolveDefaultParameter, byteString.getData$okio()));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public static final okio.ByteString commonToAsciiLowercase(okio.ByteString byteString) {
        j.g(byteString, "<this>");
        for (int i = 0; i < byteString.getData$okio().length; i++) {
            byte b8 = byteString.getData$okio()[i];
            if (b8 >= 65 && b8 <= 90) {
                byte[] data$okio = byteString.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                j.f(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i] = (byte) (b8 + 32);
                for (int i4 = i + 1; i4 < bArrCopyOf.length; i4++) {
                    byte b10 = bArrCopyOf[i4];
                    if (b10 >= 65 && b10 <= 90) {
                        bArrCopyOf[i4] = (byte) (b10 + 32);
                    }
                }
                return new okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    public static final okio.ByteString commonToAsciiUppercase(okio.ByteString byteString) {
        j.g(byteString, "<this>");
        for (int i = 0; i < byteString.getData$okio().length; i++) {
            byte b8 = byteString.getData$okio()[i];
            if (b8 >= 97 && b8 <= 122) {
                byte[] data$okio = byteString.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                j.f(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i] = (byte) (b8 - 32);
                for (int i4 = i + 1; i4 < bArrCopyOf.length; i4++) {
                    byte b10 = bArrCopyOf[i4];
                    if (b10 >= 97 && b10 <= 122) {
                        bArrCopyOf[i4] = (byte) (b10 - 32);
                    }
                }
                return new okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    public static final byte[] commonToByteArray(okio.ByteString byteString) {
        j.g(byteString, "<this>");
        byte[] data$okio = byteString.getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        j.f(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static final okio.ByteString commonToByteString(byte[] bArr, int i, int i4) {
        j.g(bArr, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i4);
        SegmentedByteString.checkOffsetAndCount(bArr.length, i, iResolveDefaultParameter);
        return new okio.ByteString(C1127m.k(i, iResolveDefaultParameter + i, bArr));
    }

    public static final String commonToString(okio.ByteString byteString) {
        j.g(byteString, "<this>");
        if (byteString.getData$okio().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData$okio(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = byteString.utf8();
            String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
            j.f(strSubstring, "substring(...)");
            String strT = z.t(z.t(z.t(strSubstring, "\\", "\\\\"), Global.NEWLINE, "\\n"), "\r", "\\r");
            if (iCodePointIndexToCharIndex >= strUtf8.length()) {
                return c.g(']', "[text=", strT);
            }
            return "[size=" + byteString.getData$okio().length + " text=" + strT + "…]";
        }
        if (byteString.getData$okio().length <= 64) {
            return "[hex=" + byteString.hex() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(byteString.getData$okio().length);
        sb2.append(" hex=");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, 64);
        if (iResolveDefaultParameter > byteString.getData$okio().length) {
            throw new IllegalArgumentException(s.m(new StringBuilder("endIndex > length("), byteString.getData$okio().length, ')').toString());
        }
        if (iResolveDefaultParameter < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (iResolveDefaultParameter != byteString.getData$okio().length) {
            byteString = new okio.ByteString(C1127m.k(0, iResolveDefaultParameter, byteString.getData$okio()));
        }
        sb2.append(byteString.hex());
        sb2.append("…]");
        return sb2.toString();
    }

    public static final String commonUtf8(okio.ByteString byteString) {
        j.g(byteString, "<this>");
        String utf8$okio = byteString.getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
        byteString.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final void commonWrite(okio.ByteString byteString, Buffer buffer, int i, int i4) {
        j.g(byteString, "<this>");
        j.g(buffer, "buffer");
        buffer.write(byteString.getData$okio(), i, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int decodeHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
    }

    public static final boolean commonEndsWith(okio.ByteString byteString, byte[] suffix) {
        j.g(byteString, "<this>");
        j.g(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final int commonLastIndexOf(okio.ByteString byteString, byte[] other, int i) {
        j.g(byteString, "<this>");
        j.g(other, "other");
        for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(byteString, i), byteString.getData$okio().length - other.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public static final boolean commonRangeEquals(okio.ByteString byteString, int i, byte[] other, int i4, int i6) {
        j.g(byteString, "<this>");
        j.g(other, "other");
        return i >= 0 && i <= byteString.getData$okio().length - i6 && i4 >= 0 && i4 <= other.length - i6 && SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), i, other, i4, i6);
    }

    public static final boolean commonStartsWith(okio.ByteString byteString, byte[] prefix) {
        j.g(byteString, "<this>");
        j.g(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.length);
    }
}
