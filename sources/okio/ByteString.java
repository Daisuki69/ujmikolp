package okio;

import We.s;
import androidx.media3.datasource.cache.c;
import cj.C1127m;
import com.dynatrace.android.agent.Global;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import zj.C2581c;
import zj.z;

/* JADX INFO: loaded from: classes5.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final Companion Companion = new Companion(null);
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;
    private final byte[] data;
    private transient int hashCode;
    private transient String utf8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i, Object obj) {
            if ((i & 1) != 0) {
                charset = C2581c.f21468b;
            }
            return companion.encodeString(str, charset);
        }

        public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i, int i4, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i = 0;
            }
            if ((i6 & 2) != 0) {
                i4 = SegmentedByteString.getDEFAULT__ByteString_size();
            }
            return companion.of(bArr, i, i4);
        }

        /* JADX INFO: renamed from: -deprecated_decodeBase64, reason: not valid java name */
        public final ByteString m403deprecated_decodeBase64(String string) {
            j.g(string, "string");
            return decodeBase64(string);
        }

        /* JADX INFO: renamed from: -deprecated_decodeHex, reason: not valid java name */
        public final ByteString m404deprecated_decodeHex(String string) {
            j.g(string, "string");
            return decodeHex(string);
        }

        /* JADX INFO: renamed from: -deprecated_encodeString, reason: not valid java name */
        public final ByteString m405deprecated_encodeString(String string, Charset charset) {
            j.g(string, "string");
            j.g(charset, "charset");
            return encodeString(string, charset);
        }

        /* JADX INFO: renamed from: -deprecated_encodeUtf8, reason: not valid java name */
        public final ByteString m406deprecated_encodeUtf8(String string) {
            j.g(string, "string");
            return encodeUtf8(string);
        }

        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m407deprecated_of(ByteBuffer buffer) {
            j.g(buffer, "buffer");
            return of(buffer);
        }

        /* JADX INFO: renamed from: -deprecated_read, reason: not valid java name */
        public final ByteString m409deprecated_read(InputStream inputstream, int i) {
            j.g(inputstream, "inputstream");
            return read(inputstream, i);
        }

        public final ByteString decodeBase64(String str) {
            j.g(str, "<this>");
            byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
            if (bArrDecodeBase64ToArray != null) {
                return new ByteString(bArrDecodeBase64ToArray);
            }
            return null;
        }

        public final ByteString decodeHex(String str) {
            j.g(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i4 = i * 2;
                bArr[i] = (byte) (okio.internal.ByteString.decodeHexDigit(str.charAt(i4 + 1)) + (okio.internal.ByteString.decodeHexDigit(str.charAt(i4)) << 4));
            }
            return new ByteString(bArr);
        }

        public final ByteString encodeString(String str, Charset charset) {
            j.g(str, "<this>");
            j.g(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            j.f(bytes, "getBytes(...)");
            return new ByteString(bytes);
        }

        public final ByteString encodeUtf8(String str) {
            j.g(str, "<this>");
            ByteString byteString = new ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
            byteString.setUtf8$okio(str);
            return byteString;
        }

        public final ByteString of(ByteBuffer byteBuffer) {
            j.g(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }

        public final ByteString read(InputStream inputStream, int i) throws IOException {
            j.g(inputStream, "<this>");
            if (i < 0) {
                throw new IllegalArgumentException(s.f(i, "byteCount < 0: ").toString());
            }
            byte[] bArr = new byte[i];
            int i4 = 0;
            while (i4 < i) {
                int i6 = inputStream.read(bArr, i4, i - i4);
                if (i6 == -1) {
                    throw new EOFException();
                }
                i4 += i6;
            }
            return new ByteString(bArr);
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m408deprecated_of(byte[] array, int i, int i4) {
            j.g(array, "array");
            return of(array, i, i4);
        }

        public final ByteString of(byte... data) {
            j.g(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            j.f(bArrCopyOf, "copyOf(...)");
            return new ByteString(bArrCopyOf);
        }

        public final ByteString of(byte[] bArr, int i, int i4) {
            j.g(bArr, "<this>");
            int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i4);
            SegmentedByteString.checkOffsetAndCount(bArr.length, i, iResolveDefaultParameter);
            return new ByteString(C1127m.k(i, iResolveDefaultParameter + i, bArr));
        }
    }

    public ByteString(byte[] data) {
        j.g(data, "data");
        this.data = data;
    }

    public static /* synthetic */ void copyInto$default(ByteString byteString, int i, byte[] bArr, int i4, int i6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
        }
        if ((i10 & 1) != 0) {
            i = 0;
        }
        if ((i10 & 4) != 0) {
            i4 = 0;
        }
        byteString.copyInto(i, bArr, i4, i6);
    }

    public static final ByteString decodeBase64(String str) {
        return Companion.decodeBase64(str);
    }

    public static final ByteString decodeHex(String str) {
        return Companion.decodeHex(str);
    }

    public static final ByteString encodeString(String str, Charset charset) {
        return Companion.encodeString(str, charset);
    }

    public static final ByteString encodeUtf8(String str) {
        return Companion.encodeUtf8(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i4 & 2) != 0) {
            i = 0;
        }
        return byteString.indexOf(byteString2, i);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i4 & 2) != 0) {
            i = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(byteString2, i);
    }

    public static final ByteString of(ByteBuffer byteBuffer) {
        return Companion.of(byteBuffer);
    }

    public static final ByteString read(InputStream inputStream, int i) throws IOException {
        return Companion.read(inputStream, i);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        ByteString byteString = Companion.read(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, byteString.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i, int i4, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i6 & 1) != 0) {
            i = 0;
        }
        if ((i6 & 2) != 0) {
            i4 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.substring(i, i4);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m401deprecated_getByte(int i) {
        return getByte(i);
    }

    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m402deprecated_size() {
        return size();
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        j.f(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    public String base64() {
        return Base64.encodeBase64$default(getData$okio(), null, 1, null);
    }

    public String base64Url() {
        return Base64.encodeBase64(getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public void copyInto(int i, byte[] target, int i4, int i6) {
        j.g(target, "target");
        C1127m.d(i4, i, i6 + i, getData$okio(), target);
    }

    public ByteString digest$okio(String algorithm) throws NoSuchAlgorithmException {
        j.g(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, size());
        byte[] bArrDigest = messageDigest.digest();
        j.d(bArrDigest);
        return new ByteString(bArrDigest);
    }

    public final boolean endsWith(ByteString suffix) {
        j.g(suffix, "suffix");
        return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte getByte(int i) {
        return internalGet$okio(i);
    }

    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.hashCode;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    public final String getUtf8$okio() {
        return this.utf8;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(iHashCode);
        return iHashCode;
    }

    public String hex() {
        char[] cArr = new char[getData$okio().length * 2];
        int i = 0;
        for (byte b8 : getData$okio()) {
            int i4 = i + 1;
            cArr[i] = okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b8 >> 4) & 15];
            i += 2;
            cArr[i4] = okio.internal.ByteString.getHEX_DIGIT_CHARS()[b8 & 15];
        }
        return new String(cArr);
    }

    public ByteString hmac$okio(String algorithm, ByteString key) throws NoSuchAlgorithmException {
        j.g(algorithm, "algorithm");
        j.g(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            byte[] bArrDoFinal = mac.doFinal(this.data);
            j.f(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public ByteString hmacSha1(ByteString key) {
        j.g(key, "key");
        return hmac$okio("HmacSHA1", key);
    }

    public ByteString hmacSha256(ByteString key) {
        j.g(key, "key");
        return hmac$okio("HmacSHA256", key);
    }

    public ByteString hmacSha512(ByteString key) {
        j.g(key, "key");
        return hmac$okio("HmacSHA512", key);
    }

    public final int indexOf(ByteString other) {
        j.g(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i) {
        return getData$okio()[i];
    }

    public final int lastIndexOf(ByteString other) {
        j.g(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    public final ByteString md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i, ByteString other, int i4, int i6) {
        j.g(other, "other");
        return other.rangeEquals(i4, getData$okio(), i, i6);
    }

    public final void setHashCode$okio(int i) {
        this.hashCode = i;
    }

    public final void setUtf8$okio(String str) {
        this.utf8 = str;
    }

    public final ByteString sha1() {
        return digest$okio("SHA-1");
    }

    public final ByteString sha256() {
        return digest$okio("SHA-256");
    }

    public final ByteString sha512() {
        return digest$okio("SHA-512");
    }

    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(ByteString prefix) {
        j.g(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    public String string(Charset charset) {
        j.g(charset, "charset");
        return new String(this.data, charset);
    }

    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    public ByteString toAsciiLowercase() {
        for (int i = 0; i < getData$okio().length; i++) {
            byte b8 = getData$okio()[i];
            if (b8 >= 65 && b8 <= 90) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                j.f(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i] = (byte) (b8 + 32);
                for (int i4 = i + 1; i4 < bArrCopyOf.length; i4++) {
                    byte b10 = bArrCopyOf[i4];
                    if (b10 >= 65 && b10 <= 90) {
                        bArrCopyOf[i4] = (byte) (b10 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    public ByteString toAsciiUppercase() {
        for (int i = 0; i < getData$okio().length; i++) {
            byte b8 = getData$okio()[i];
            if (b8 >= 97 && b8 <= 122) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                j.f(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i] = (byte) (b8 - 32);
                for (int i4 = i + 1; i4 < bArrCopyOf.length; i4++) {
                    byte b10 = bArrCopyOf[i4];
                    if (b10 >= 97 && b10 <= 122) {
                        bArrCopyOf[i4] = (byte) (b10 - 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        j.f(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public String toString() {
        if (getData$okio().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = okio.internal.ByteString.codePointIndexToCharIndex(getData$okio(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = utf8();
            String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
            j.f(strSubstring, "substring(...)");
            String strT = z.t(z.t(z.t(strSubstring, "\\", "\\\\"), Global.NEWLINE, "\\n"), "\r", "\\r");
            if (iCodePointIndexToCharIndex >= strUtf8.length()) {
                return c.g(']', "[text=", strT);
            }
            return "[size=" + getData$okio().length + " text=" + strT + "…]";
        }
        if (getData$okio().length <= 64) {
            return "[hex=" + hex() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(getData$okio().length);
        sb2.append(" hex=");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, 64);
        if (iResolveDefaultParameter > getData$okio().length) {
            throw new IllegalArgumentException(s.m(new StringBuilder("endIndex > length("), getData$okio().length, ')').toString());
        }
        if (iResolveDefaultParameter < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        sb2.append((iResolveDefaultParameter == getData$okio().length ? this : new ByteString(C1127m.k(0, iResolveDefaultParameter, getData$okio()))).hex());
        sb2.append("…]");
        return sb2.toString();
    }

    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(internalArray$okio());
        setUtf8$okio(utf8String);
        return utf8String;
    }

    public void write(OutputStream out) throws IOException {
        j.g(out, "out");
        out.write(this.data);
    }

    public void write$okio(Buffer buffer, int i, int i4) {
        j.g(buffer, "buffer");
        okio.internal.ByteString.commonWrite(this, buffer, i, i4);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i4 & 2) != 0) {
            i = 0;
        }
        return byteString.indexOf(bArr, i);
    }

    public static final ByteString of(byte... bArr) {
        return Companion.of(bArr);
    }

    @Override // java.lang.Comparable
    public int compareTo(ByteString other) {
        j.g(other, "other");
        int size = size();
        int size2 = other.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int i4 = getByte(i) & 255;
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

    public final boolean endsWith(byte[] suffix) {
        j.g(suffix, "suffix");
        return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
    }

    public final int indexOf(byte[] other) {
        j.g(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    public final int lastIndexOf(byte[] other) {
        j.g(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    public boolean rangeEquals(int i, byte[] other, int i4, int i6) {
        j.g(other, "other");
        return i >= 0 && i <= getData$okio().length - i6 && i4 >= 0 && i4 <= other.length - i6 && SegmentedByteString.arrayRangeEquals(getData$okio(), i, other, i4, i6);
    }

    public final boolean startsWith(byte[] prefix) {
        j.g(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.length);
    }

    public final ByteString substring(int i) {
        return substring$default(this, i, 0, 2, null);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i4 & 2) != 0) {
            i = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(bArr, i);
    }

    public static final ByteString of(byte[] bArr, int i, int i4) {
        return Companion.of(bArr, i, i4);
    }

    public final int indexOf(ByteString other, int i) {
        j.g(other, "other");
        return indexOf(other.internalArray$okio(), i);
    }

    public final int lastIndexOf(ByteString other, int i) {
        j.g(other, "other");
        return lastIndexOf(other.internalArray$okio(), i);
    }

    public ByteString substring(int i, int i4) {
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, i4);
        if (i >= 0) {
            if (iResolveDefaultParameter > getData$okio().length) {
                throw new IllegalArgumentException(s.m(new StringBuilder("endIndex > length("), getData$okio().length, ')').toString());
            }
            if (iResolveDefaultParameter - i >= 0) {
                return (i == 0 && iResolveDefaultParameter == getData$okio().length) ? this : new ByteString(C1127m.k(i, iResolveDefaultParameter, getData$okio()));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public int indexOf(byte[] other, int i) {
        j.g(other, "other");
        int length = getData$okio().length - other.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.arrayRangeEquals(getData$okio(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public int lastIndexOf(byte[] other, int i) {
        j.g(other, "other");
        for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(this, i), getData$okio().length - other.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.arrayRangeEquals(getData$okio(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }
}
