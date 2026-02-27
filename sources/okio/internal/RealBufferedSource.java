package okio.internal;

import androidx.camera.core.impl.a;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.PeekSource;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Timeout;
import zj.C2579a;

/* JADX INFO: renamed from: okio.internal.-RealBufferedSource, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class RealBufferedSource {
    public static final void commonClose(okio.RealBufferedSource realBufferedSource) throws IOException {
        j.g(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            return;
        }
        realBufferedSource.closed = true;
        realBufferedSource.source.close();
        realBufferedSource.bufferField.clear();
    }

    public static final boolean commonExhausted(okio.RealBufferedSource realBufferedSource) {
        j.g(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        return realBufferedSource.bufferField.exhausted() && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1;
    }

    public static final long commonIndexOf(okio.RealBufferedSource realBufferedSource, byte b8, long j, long j6) {
        j.g(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (0 > j || j > j6) {
            StringBuilder sbS = a.s(j, "fromIndex=", " toIndex=");
            sbS.append(j6);
            throw new IllegalArgumentException(sbS.toString().toString());
        }
        long jMax = j;
        while (jMax < j6) {
            byte b10 = b8;
            long j7 = j6;
            long jIndexOf = realBufferedSource.bufferField.indexOf(b10, jMax, j7);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (size >= j7 || realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b8 = b10;
            j6 = j7;
        }
        return -1L;
    }

    public static final long commonIndexOfElement(okio.RealBufferedSource realBufferedSource, ByteString targetBytes, long j) {
        j.g(realBufferedSource, "<this>");
        j.g(targetBytes, "targetBytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOfElement = realBufferedSource.bufferField.indexOfElement(targetBytes, j);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, size);
        }
    }

    public static final BufferedSource commonPeek(okio.RealBufferedSource realBufferedSource) {
        j.g(realBufferedSource, "<this>");
        return Okio.buffer(new PeekSource(realBufferedSource));
    }

    public static final boolean commonRangeEquals(okio.RealBufferedSource realBufferedSource, long j, ByteString bytes, int i, int i4) {
        j.g(realBufferedSource, "<this>");
        j.g(bytes, "bytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || i < 0 || i4 < 0 || bytes.size() - i < i4) {
            return false;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            long j6 = ((long) i6) + j;
            if (!realBufferedSource.request(1 + j6) || realBufferedSource.bufferField.getByte(j6) != bytes.getByte(i + i6)) {
                return false;
            }
        }
        return true;
    }

    public static final long commonRead(okio.RealBufferedSource realBufferedSource, Buffer sink, long j) {
        j.g(realBufferedSource, "<this>");
        j.g(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(a.f(j, "byteCount < 0: ").toString());
        }
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (realBufferedSource.bufferField.size() == 0) {
            if (j == 0) {
                return 0L;
            }
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
        }
        return realBufferedSource.bufferField.read(sink, Math.min(j, realBufferedSource.bufferField.size()));
    }

    public static final long commonReadAll(okio.RealBufferedSource realBufferedSource, Sink sink) throws IOException {
        j.g(realBufferedSource, "<this>");
        j.g(sink, "sink");
        long j = 0;
        while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1) {
            long jCompleteSegmentByteCount = realBufferedSource.bufferField.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j += jCompleteSegmentByteCount;
                sink.write(realBufferedSource.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (realBufferedSource.bufferField.size() <= 0) {
            return j;
        }
        long size = realBufferedSource.bufferField.size() + j;
        Buffer buffer = realBufferedSource.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    public static final byte commonReadByte(okio.RealBufferedSource realBufferedSource) throws EOFException {
        j.g(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        return realBufferedSource.bufferField.readByte();
    }

    public static final byte[] commonReadByteArray(okio.RealBufferedSource realBufferedSource, long j) throws EOFException {
        j.g(realBufferedSource, "<this>");
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readByteArray(j);
    }

    public static final ByteString commonReadByteString(okio.RealBufferedSource realBufferedSource, long j) throws EOFException {
        j.g(realBufferedSource, "<this>");
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readByteString(j);
    }

    public static final long commonReadDecimalLong(okio.RealBufferedSource realBufferedSource) throws EOFException {
        byte b8;
        j.g(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        long j = 0;
        while (true) {
            long j6 = j + 1;
            if (!realBufferedSource.request(j6)) {
                break;
            }
            b8 = realBufferedSource.bufferField.getByte(j);
            if ((b8 < 48 || b8 > 57) && !(j == 0 && b8 == 45)) {
                break;
            }
            j = j6;
        }
        if (j == 0) {
            C2579a.a(16);
            String string = Integer.toString(b8, 16);
            j.f(string, "toString(...)");
            throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
        }
        return realBufferedSource.bufferField.readDecimalLong();
    }

    public static final void commonReadFully(okio.RealBufferedSource realBufferedSource, byte[] sink) throws EOFException {
        j.g(realBufferedSource, "<this>");
        j.g(sink, "sink");
        try {
            realBufferedSource.require(sink.length);
            realBufferedSource.bufferField.readFully(sink);
        } catch (EOFException e) {
            int i = 0;
            while (realBufferedSource.bufferField.size() > 0) {
                Buffer buffer = realBufferedSource.bufferField;
                int i4 = buffer.read(sink, i, (int) buffer.size());
                if (i4 == -1) {
                    throw new AssertionError();
                }
                i += i4;
            }
            throw e;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(okio.RealBufferedSource realBufferedSource) throws EOFException {
        byte b8;
        j.g(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        int i = 0;
        while (true) {
            int i4 = i + 1;
            if (!realBufferedSource.request(i4)) {
                break;
            }
            b8 = realBufferedSource.bufferField.getByte(i);
            if ((b8 < 48 || b8 > 57) && ((b8 < 97 || b8 > 102) && (b8 < 65 || b8 > 70))) {
                break;
            }
            i = i4;
        }
        if (i == 0) {
            C2579a.a(16);
            String string = Integer.toString(b8, 16);
            j.f(string, "toString(...)");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return realBufferedSource.bufferField.readHexadecimalUnsignedLong();
    }

    public static final int commonReadInt(okio.RealBufferedSource realBufferedSource) throws EOFException {
        j.g(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readInt();
    }

    public static final int commonReadIntLe(okio.RealBufferedSource realBufferedSource) throws EOFException {
        j.g(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readIntLe();
    }

    public static final long commonReadLong(okio.RealBufferedSource realBufferedSource) throws EOFException {
        j.g(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLong();
    }

    public static final long commonReadLongLe(okio.RealBufferedSource realBufferedSource) throws EOFException {
        j.g(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLongLe();
    }

    public static final short commonReadShort(okio.RealBufferedSource realBufferedSource) throws EOFException {
        j.g(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShort();
    }

    public static final short commonReadShortLe(okio.RealBufferedSource realBufferedSource) throws EOFException {
        j.g(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShortLe();
    }

    public static final String commonReadUtf8(okio.RealBufferedSource realBufferedSource, long j) throws EOFException {
        j.g(realBufferedSource, "<this>");
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readUtf8(j);
    }

    public static final int commonReadUtf8CodePoint(okio.RealBufferedSource realBufferedSource) throws EOFException {
        j.g(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        byte b8 = realBufferedSource.bufferField.getByte(0L);
        if ((b8 & 224) == 192) {
            realBufferedSource.require(2L);
        } else if ((b8 & 240) == 224) {
            realBufferedSource.require(3L);
        } else if ((b8 & 248) == 240) {
            realBufferedSource.require(4L);
        }
        return realBufferedSource.bufferField.readUtf8CodePoint();
    }

    public static final String commonReadUtf8Line(okio.RealBufferedSource realBufferedSource) {
        j.g(realBufferedSource, "<this>");
        long jIndexOf = realBufferedSource.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (realBufferedSource.bufferField.size() != 0) {
            return realBufferedSource.readUtf8(realBufferedSource.bufferField.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(okio.RealBufferedSource realBufferedSource, long j) throws EOFException {
        j.g(realBufferedSource, "<this>");
        if (j < 0) {
            throw new IllegalArgumentException(a.f(j, "limit < 0: ").toString());
        }
        long j6 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jIndexOf = realBufferedSource.indexOf((byte) 10, 0L, j6);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (j6 < Long.MAX_VALUE && realBufferedSource.request(j6) && realBufferedSource.bufferField.getByte(j6 - 1) == 13 && realBufferedSource.request(j6 + 1) && realBufferedSource.bufferField.getByte(j6) == 10) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, j6);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = realBufferedSource.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(realBufferedSource.bufferField.size(), j) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    public static final boolean commonRequest(okio.RealBufferedSource realBufferedSource, long j) {
        j.g(realBufferedSource, "<this>");
        if (j < 0) {
            throw new IllegalArgumentException(a.f(j, "byteCount < 0: ").toString());
        }
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (realBufferedSource.bufferField.size() < j) {
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void commonRequire(okio.RealBufferedSource realBufferedSource, long j) throws EOFException {
        j.g(realBufferedSource, "<this>");
        if (!realBufferedSource.request(j)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(okio.RealBufferedSource realBufferedSource, Options options) throws EOFException {
        j.g(realBufferedSource, "<this>");
        j.g(options, "options");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int iSelectPrefix = Buffer.selectPrefix(realBufferedSource.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    return -1;
                }
                realBufferedSource.bufferField.skip(options.getByteStrings$okio()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1);
        return -1;
    }

    public static final void commonSkip(okio.RealBufferedSource realBufferedSource, long j) throws EOFException {
        j.g(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, realBufferedSource.bufferField.size());
            realBufferedSource.bufferField.skip(jMin);
            j -= jMin;
        }
    }

    public static final Timeout commonTimeout(okio.RealBufferedSource realBufferedSource) {
        j.g(realBufferedSource, "<this>");
        return realBufferedSource.source.timeout();
    }

    public static final String commonToString(okio.RealBufferedSource realBufferedSource) {
        j.g(realBufferedSource, "<this>");
        return "buffer(" + realBufferedSource.source + ')';
    }

    public static final byte[] commonReadByteArray(okio.RealBufferedSource realBufferedSource) throws IOException {
        j.g(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteArray();
    }

    public static final ByteString commonReadByteString(okio.RealBufferedSource realBufferedSource) throws IOException {
        j.g(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteString();
    }

    public static final String commonReadUtf8(okio.RealBufferedSource realBufferedSource) throws IOException {
        j.g(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readUtf8();
    }

    public static final void commonReadFully(okio.RealBufferedSource realBufferedSource, Buffer sink, long j) throws IOException {
        j.g(realBufferedSource, "<this>");
        j.g(sink, "sink");
        try {
            realBufferedSource.require(j);
            realBufferedSource.bufferField.readFully(sink, j);
        } catch (EOFException e) {
            sink.writeAll(realBufferedSource.bufferField);
            throw e;
        }
    }

    public static final long commonIndexOf(okio.RealBufferedSource realBufferedSource, ByteString bytes, long j) throws IOException {
        j.g(realBufferedSource, "<this>");
        j.g(bytes, "bytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOf = realBufferedSource.bufferField.indexOf(bytes, j);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, (size - ((long) bytes.size())) + 1);
        }
    }

    public static final int commonRead(okio.RealBufferedSource realBufferedSource, byte[] sink, int i, int i4) {
        j.g(realBufferedSource, "<this>");
        j.g(sink, "sink");
        long j = i4;
        SegmentedByteString.checkOffsetAndCount(sink.length, i, j);
        if (realBufferedSource.bufferField.size() == 0) {
            if (i4 == 0) {
                return 0;
            }
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1;
            }
        }
        return realBufferedSource.bufferField.read(sink, i, (int) Math.min(j, realBufferedSource.bufferField.size()));
    }
}
