package okio;

import We.s;
import androidx.camera.core.impl.a;
import cj.C1127m;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: okio.SegmentedByteString, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1994SegmentedByteString extends ByteString {
    private final transient int[] directory;
    private final transient byte[][] segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1994SegmentedByteString(byte[][] segments, int[] directory) {
        super(ByteString.EMPTY.getData$okio());
        j.g(segments, "segments");
        j.g(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private final Object writeReplace() {
        ByteString byteString = toByteString();
        j.e(byteString, "null cannot be cast to non-null type java.lang.Object");
        return byteString;
    }

    @Override // okio.ByteString
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        j.f(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // okio.ByteString
    public String base64() {
        return toByteString().base64();
    }

    @Override // okio.ByteString
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // okio.ByteString
    public void copyInto(int i, byte[] target, int i4, int i6) {
        j.g(target, "target");
        long j = i6;
        SegmentedByteString.checkOffsetAndCount(size(), i, j);
        SegmentedByteString.checkOffsetAndCount(target.length, i4, j);
        int i10 = i6 + i;
        int iSegment = okio.internal.SegmentedByteString.segment(this, i);
        while (i < i10) {
            int i11 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i12 = getDirectory$okio()[iSegment] - i11;
            int i13 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - i;
            int i14 = (i - i11) + i13;
            C1127m.d(i4, i14, i14 + iMin, getSegments$okio()[iSegment], target);
            i4 += iMin;
            i += iMin;
            iSegment++;
        }
    }

    @Override // okio.ByteString
    public ByteString digest$okio(String algorithm) throws NoSuchAlgorithmException {
        j.g(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments$okio().length;
        int i = 0;
        int i4 = 0;
        while (i < length) {
            int i6 = getDirectory$okio()[length + i];
            int i10 = getDirectory$okio()[i];
            messageDigest.update(getSegments$okio()[i], i6, i10 - i4);
            i++;
            i4 = i10;
        }
        byte[] bArrDigest = messageDigest.digest();
        j.d(bArrDigest);
        return new ByteString(bArrDigest);
    }

    @Override // okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    public final int[] getDirectory$okio() {
        return this.directory;
    }

    public final byte[][] getSegments$okio() {
        return this.segments;
    }

    @Override // okio.ByteString
    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    @Override // okio.ByteString
    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = getSegments$okio().length;
        int i = 0;
        int i4 = 1;
        int i6 = 0;
        while (i < length) {
            int i10 = getDirectory$okio()[length + i];
            int i11 = getDirectory$okio()[i];
            byte[] bArr = getSegments$okio()[i];
            int i12 = (i11 - i6) + i10;
            while (i10 < i12) {
                i4 = (i4 * 31) + bArr[i10];
                i10++;
            }
            i++;
            i6 = i11;
        }
        setHashCode$okio(i4);
        return i4;
    }

    @Override // okio.ByteString
    public String hex() {
        return toByteString().hex();
    }

    @Override // okio.ByteString
    public ByteString hmac$okio(String algorithm, ByteString key) throws NoSuchAlgorithmException {
        j.g(algorithm, "algorithm");
        j.g(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            int length = getSegments$okio().length;
            int i = 0;
            int i4 = 0;
            while (i < length) {
                int i6 = getDirectory$okio()[length + i];
                int i10 = getDirectory$okio()[i];
                mac.update(getSegments$okio()[i], i6, i10 - i4);
                i++;
                i4 = i10;
            }
            byte[] bArrDoFinal = mac.doFinal();
            j.f(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // okio.ByteString
    public int indexOf(byte[] other, int i) {
        j.g(other, "other");
        return toByteString().indexOf(other, i);
    }

    @Override // okio.ByteString
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int i) {
        SegmentedByteString.checkOffsetAndCount(getDirectory$okio()[getSegments$okio().length - 1], i, 1L);
        int iSegment = okio.internal.SegmentedByteString.segment(this, i);
        return getSegments$okio()[iSegment][(i - (iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1])) + getDirectory$okio()[getSegments$okio().length + iSegment]];
    }

    @Override // okio.ByteString
    public int lastIndexOf(byte[] other, int i) {
        j.g(other, "other");
        return toByteString().lastIndexOf(other, i);
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i, ByteString other, int i4, int i6) {
        j.g(other, "other");
        if (i < 0 || i > size() - i6) {
            return false;
        }
        int i10 = i6 + i;
        int iSegment = okio.internal.SegmentedByteString.segment(this, i);
        while (i < i10) {
            int i11 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i12 = getDirectory$okio()[iSegment] - i11;
            int i13 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - i;
            if (!other.rangeEquals(i4, getSegments$okio()[iSegment], (i - i11) + i13, iMin)) {
                return false;
            }
            i4 += iMin;
            i += iMin;
            iSegment++;
        }
        return true;
    }

    @Override // okio.ByteString
    public String string(Charset charset) {
        j.g(charset, "charset");
        return toByteString().string(charset);
    }

    @Override // okio.ByteString
    public ByteString substring(int i, int i4) {
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, i4);
        if (i < 0) {
            throw new IllegalArgumentException(s.g(i, "beginIndex=", " < 0").toString());
        }
        if (iResolveDefaultParameter > size()) {
            StringBuilder sbT = s.t(iResolveDefaultParameter, "endIndex=", " > length(");
            sbT.append(size());
            sbT.append(')');
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        int i6 = iResolveDefaultParameter - i;
        if (i6 < 0) {
            throw new IllegalArgumentException(a.c(iResolveDefaultParameter, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && iResolveDefaultParameter == size()) {
            return this;
        }
        if (i == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = okio.internal.SegmentedByteString.segment(this, i);
        int iSegment2 = okio.internal.SegmentedByteString.segment(this, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) C1127m.l(iSegment, iSegment2 + 1, getSegments$okio());
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i10 = iSegment;
            int i11 = 0;
            while (true) {
                iArr[i11] = Math.min(getDirectory$okio()[i10] - i, i6);
                int i12 = i11 + 1;
                iArr[i11 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i10];
                if (i10 == iSegment2) {
                    break;
                }
                i10++;
                i11 = i12;
            }
        }
        int i13 = iSegment != 0 ? getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i - i13) + iArr[length];
        return new C1994SegmentedByteString(bArr, iArr);
    }

    @Override // okio.ByteString
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // okio.ByteString
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // okio.ByteString
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i = 0;
        int i4 = 0;
        int i6 = 0;
        while (i < length) {
            int i10 = getDirectory$okio()[length + i];
            int i11 = getDirectory$okio()[i];
            int i12 = i11 - i4;
            C1127m.d(i6, i10, i10 + i12, getSegments$okio()[i], bArr);
            i6 += i12;
            i++;
            i4 = i11;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public String toString() {
        return toByteString().toString();
    }

    @Override // okio.ByteString
    public void write(OutputStream out) throws IOException {
        j.g(out, "out");
        int length = getSegments$okio().length;
        int i = 0;
        int i4 = 0;
        while (i < length) {
            int i6 = getDirectory$okio()[length + i];
            int i10 = getDirectory$okio()[i];
            out.write(getSegments$okio()[i], i6, i10 - i4);
            i++;
            i4 = i10;
        }
    }

    @Override // okio.ByteString
    public void write$okio(Buffer buffer, int i, int i4) {
        j.g(buffer, "buffer");
        int i6 = i + i4;
        int iSegment = okio.internal.SegmentedByteString.segment(this, i);
        while (i < i6) {
            int i10 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i11 = getDirectory$okio()[iSegment] - i10;
            int i12 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i6, i11 + i10) - i;
            int i13 = (i - i10) + i12;
            Segment segment = new Segment(getSegments$okio()[iSegment], i13, i13 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                j.d(segment2);
                Segment segment3 = segment2.prev;
                j.d(segment3);
                segment3.push(segment);
            }
            i += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) i4));
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i, byte[] other, int i4, int i6) {
        j.g(other, "other");
        if (i < 0 || i > size() - i6 || i4 < 0 || i4 > other.length - i6) {
            return false;
        }
        int i10 = i6 + i;
        int iSegment = okio.internal.SegmentedByteString.segment(this, i);
        while (i < i10) {
            int i11 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i12 = getDirectory$okio()[iSegment] - i11;
            int i13 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - i;
            if (!SegmentedByteString.arrayRangeEquals(getSegments$okio()[iSegment], (i - i11) + i13, other, i4, iMin)) {
                return false;
            }
            i4 += iMin;
            i += iMin;
            iSegment++;
        }
        return true;
    }
}
