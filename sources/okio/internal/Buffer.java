package okio.internal;

import We.s;
import androidx.camera.core.impl.a;
import androidx.media3.datasource.cache.c;
import androidx.media3.exoplayer.MediaPeriodQueue;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.extractor.ts.PsExtractor;
import cj.C1127m;
import com.dynatrace.android.agent.events.eventsapi.EnrichmentAttributesGenerator;
import io.flutter.embedding.android.KeyboardMap;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import mx_android.support.v4.media.session.PlaybackStateCompat;
import okhttp3.internal.connection.RealConnection;
import okio.Buffer;
import okio.ByteString;
import okio.C1994SegmentedByteString;
import okio.Options;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Utf8;
import okio._JvmPlatformKt;

/* JADX INFO: renamed from: okio.internal.-Buffer, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class Buffer {
    private static final byte[] HEX_DIGIT_BYTES = _JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static final void commonClear(okio.Buffer buffer) throws EOFException {
        j.g(buffer, "<this>");
        buffer.skip(buffer.size());
    }

    public static final void commonClose(Buffer.UnsafeCursor unsafeCursor) {
        j.g(unsafeCursor, "<this>");
        if (unsafeCursor.buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        unsafeCursor.buffer = null;
        unsafeCursor.setSegment$okio(null);
        unsafeCursor.offset = -1L;
        unsafeCursor.data = null;
        unsafeCursor.start = -1;
        unsafeCursor.end = -1;
    }

    public static final long commonCompleteSegmentByteCount(okio.Buffer buffer) {
        j.g(buffer, "<this>");
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = buffer.head;
        j.d(segment);
        Segment segment2 = segment.prev;
        j.d(segment2);
        int i = segment2.limit;
        return (i >= 8192 || !segment2.owner) ? size : size - ((long) (i - segment2.pos));
    }

    public static final okio.Buffer commonCopy(okio.Buffer buffer) {
        j.g(buffer, "<this>");
        okio.Buffer buffer2 = new okio.Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        j.d(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer2.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            j.d(segment3);
            j.d(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    public static final okio.Buffer commonCopyTo(okio.Buffer buffer, okio.Buffer out, long j, long j6) {
        j.g(buffer, "<this>");
        j.g(out, "out");
        long j7 = j;
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j7, j6);
        if (j6 != 0) {
            out.setSize$okio(out.size() + j6);
            Segment segment = buffer.head;
            while (true) {
                j.d(segment);
                int i = segment.limit;
                int i4 = segment.pos;
                if (j7 < i - i4) {
                    break;
                }
                j7 -= (long) (i - i4);
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j9 = j6;
            while (j9 > 0) {
                j.d(segment2);
                Segment segmentSharedCopy = segment2.sharedCopy();
                int i6 = segmentSharedCopy.pos + ((int) j7);
                segmentSharedCopy.pos = i6;
                segmentSharedCopy.limit = Math.min(i6 + ((int) j9), segmentSharedCopy.limit);
                Segment segment3 = out.head;
                if (segment3 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy;
                    out.head = segmentSharedCopy;
                } else {
                    j.d(segment3);
                    Segment segment4 = segment3.prev;
                    j.d(segment4);
                    segment4.push(segmentSharedCopy);
                }
                j9 -= (long) (segmentSharedCopy.limit - segmentSharedCopy.pos);
                segment2 = segment2.next;
                j7 = 0;
            }
        }
        return buffer;
    }

    public static final boolean commonEquals(okio.Buffer buffer, Object obj) {
        j.g(buffer, "<this>");
        if (buffer == obj) {
            return true;
        }
        if (!(obj instanceof okio.Buffer)) {
            return false;
        }
        okio.Buffer buffer2 = (okio.Buffer) obj;
        if (buffer.size() != buffer2.size()) {
            return false;
        }
        if (buffer.size() == 0) {
            return true;
        }
        Segment segment = buffer.head;
        j.d(segment);
        Segment segment2 = buffer2.head;
        j.d(segment2);
        int i = segment.pos;
        int i4 = segment2.pos;
        long j = 0;
        while (j < buffer.size()) {
            long jMin = Math.min(segment.limit - i, segment2.limit - i4);
            long j6 = 0;
            while (j6 < jMin) {
                int i6 = i + 1;
                int i10 = i4 + 1;
                if (segment.data[i] != segment2.data[i4]) {
                    return false;
                }
                j6++;
                i = i6;
                i4 = i10;
            }
            if (i == segment.limit) {
                segment = segment.next;
                j.d(segment);
                i = segment.pos;
            }
            if (i4 == segment2.limit) {
                segment2 = segment2.next;
                j.d(segment2);
                i4 = segment2.pos;
            }
            j += jMin;
        }
        return true;
    }

    public static final long commonExpandBuffer(Buffer.UnsafeCursor unsafeCursor, int i) {
        j.g(unsafeCursor, "<this>");
        if (i <= 0) {
            throw new IllegalArgumentException(s.f(i, "minByteCount <= 0: ").toString());
        }
        if (i > 8192) {
            throw new IllegalArgumentException(s.f(i, "minByteCount > Segment.SIZE: ").toString());
        }
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
        int i4 = 8192 - segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = 8192;
        long j = i4;
        buffer.setSize$okio(size + j);
        unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = segmentWritableSegment$okio.data;
        unsafeCursor.start = 8192 - i4;
        unsafeCursor.end = 8192;
        return j;
    }

    public static final byte commonGet(okio.Buffer buffer, long j) {
        j.g(buffer, "<this>");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j, 1L);
        Segment segment = buffer.head;
        if (segment == null) {
            j.d(null);
            throw null;
        }
        if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                j.d(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            return segment.data[(int) ((((long) segment.pos) + j) - size)];
        }
        long j6 = 0;
        while (true) {
            int i = segment.limit;
            int i4 = segment.pos;
            long j7 = ((long) (i - i4)) + j6;
            if (j7 > j) {
                return segment.data[(int) ((((long) i4) + j) - j6)];
            }
            segment = segment.next;
            j.d(segment);
            j6 = j7;
        }
    }

    public static final int commonHashCode(okio.Buffer buffer) {
        j.g(buffer, "<this>");
        Segment segment = buffer.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i4 = segment.limit;
            for (int i6 = segment.pos; i6 < i4; i6++) {
                i = (i * 31) + segment.data[i6];
            }
            segment = segment.next;
            j.d(segment);
        } while (segment != buffer.head);
        return i;
    }

    public static final long commonIndexOf(okio.Buffer buffer, byte b8, long j, long j6) {
        Segment segment;
        int i;
        j.g(buffer, "<this>");
        long size = 0;
        if (0 > j || j > j6) {
            StringBuilder sb2 = new StringBuilder("size=");
            sb2.append(buffer.size());
            sb2.append(" fromIndex=");
            sb2.append(j);
            throw new IllegalArgumentException(c.j(j6, " toIndex=", sb2).toString());
        }
        if (j6 > buffer.size()) {
            j6 = buffer.size();
        }
        if (j == j6 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j < j) {
            size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                j.d(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            while (size < j6) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + j6) - size);
                i = (int) ((((long) segment.pos) + j) - size);
                while (i < iMin) {
                    if (bArr[i] != b8) {
                        i++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                j.d(segment);
                j = size;
            }
            return -1L;
        }
        while (true) {
            long j7 = ((long) (segment.limit - segment.pos)) + size;
            if (j7 > j) {
                break;
            }
            segment = segment.next;
            j.d(segment);
            size = j7;
        }
        while (size < j6) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + j6) - size);
            i = (int) ((((long) segment.pos) + j) - size);
            while (i < iMin2) {
                if (bArr2[i] != b8) {
                    i++;
                }
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            j.d(segment);
            j = size;
        }
        return -1L;
        return ((long) (i - segment.pos)) + size;
    }

    public static final long commonIndexOfElement(okio.Buffer buffer, ByteString targetBytes, long j) {
        int i;
        int i4;
        j.g(buffer, "<this>");
        j.g(targetBytes, "targetBytes");
        long size = 0;
        if (j < 0) {
            throw new IllegalArgumentException(a.f(j, "fromIndex < 0: ").toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j < j) {
            size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                j.d(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (targetBytes.size() == 2) {
                byte b8 = targetBytes.getByte(0);
                byte b10 = targetBytes.getByte(1);
                while (size < buffer.size()) {
                    byte[] bArr = segment.data;
                    i = (int) ((((long) segment.pos) + j) - size);
                    int i6 = segment.limit;
                    while (i < i6) {
                        byte b11 = bArr[i];
                        if (b11 == b8 || b11 == b10) {
                            i4 = segment.pos;
                        } else {
                            i++;
                        }
                    }
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    j.d(segment);
                    j = size;
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < buffer.size()) {
                    byte[] bArr2 = segment.data;
                    i = (int) ((((long) segment.pos) + j) - size);
                    int i10 = segment.limit;
                    while (i < i10) {
                        byte b12 = bArr2[i];
                        for (byte b13 : bArrInternalArray$okio) {
                            if (b12 == b13) {
                                i4 = segment.pos;
                            }
                        }
                        i++;
                    }
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    j.d(segment);
                    j = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j6 = ((long) (segment.limit - segment.pos)) + size;
            if (j6 > j) {
                break;
            }
            segment = segment.next;
            j.d(segment);
            size = j6;
        }
        if (targetBytes.size() == 2) {
            byte b14 = targetBytes.getByte(0);
            byte b15 = targetBytes.getByte(1);
            while (size < buffer.size()) {
                byte[] bArr3 = segment.data;
                i = (int) ((((long) segment.pos) + j) - size);
                int i11 = segment.limit;
                while (i < i11) {
                    byte b16 = bArr3[i];
                    if (b16 == b14 || b16 == b15) {
                        i4 = segment.pos;
                    } else {
                        i++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                j.d(segment);
                j = size;
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < buffer.size()) {
                byte[] bArr4 = segment.data;
                i = (int) ((((long) segment.pos) + j) - size);
                int i12 = segment.limit;
                while (i < i12) {
                    byte b17 = bArr4[i];
                    for (byte b18 : bArrInternalArray$okio2) {
                        if (b17 == b18) {
                            i4 = segment.pos;
                        }
                    }
                    i++;
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                j.d(segment);
                j = size;
            }
        }
        return -1L;
        return ((long) (i - i4)) + size;
    }

    public static final int commonNext(Buffer.UnsafeCursor unsafeCursor) {
        j.g(unsafeCursor, "<this>");
        long j = unsafeCursor.offset;
        okio.Buffer buffer = unsafeCursor.buffer;
        j.d(buffer);
        if (j == buffer.size()) {
            throw new IllegalStateException("no more bytes");
        }
        long j6 = unsafeCursor.offset;
        return unsafeCursor.seek(j6 == -1 ? 0L : j6 + ((long) (unsafeCursor.end - unsafeCursor.start)));
    }

    public static final boolean commonRangeEquals(okio.Buffer buffer, long j, ByteString bytes, int i, int i4) {
        j.g(buffer, "<this>");
        j.g(bytes, "bytes");
        if (j < 0 || i < 0 || i4 < 0 || buffer.size() - j < i4 || bytes.size() - i < i4) {
            return false;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            if (buffer.getByte(((long) i6) + j) != bytes.getByte(i + i6)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(okio.Buffer buffer, byte[] sink) {
        j.g(buffer, "<this>");
        j.g(sink, "sink");
        return buffer.read(sink, 0, sink.length);
    }

    public static final long commonReadAll(okio.Buffer buffer, Sink sink) throws IOException {
        j.g(buffer, "<this>");
        j.g(sink, "sink");
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    public static final Buffer.UnsafeCursor commonReadAndWriteUnsafe(okio.Buffer buffer, Buffer.UnsafeCursor unsafeCursor) {
        j.g(buffer, "<this>");
        j.g(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = true;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final byte commonReadByte(okio.Buffer buffer) throws EOFException {
        j.g(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        j.d(segment);
        int i = segment.pos;
        int i4 = segment.limit;
        int i6 = i + 1;
        byte b8 = segment.data[i];
        buffer.setSize$okio(buffer.size() - 1);
        if (i6 != i4) {
            segment.pos = i6;
            return b8;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return b8;
    }

    public static final byte[] commonReadByteArray(okio.Buffer buffer) {
        j.g(buffer, "<this>");
        return buffer.readByteArray(buffer.size());
    }

    public static final ByteString commonReadByteString(okio.Buffer buffer) {
        j.g(buffer, "<this>");
        return buffer.readByteString(buffer.size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = new okio.Buffer().writeDecimalLong(r8).writeByte((int) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        r0.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r0.readUtf8());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long commonReadDecimalLong(okio.Buffer r19) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.Buffer.commonReadDecimalLong(okio.Buffer):long");
    }

    public static final void commonReadFully(okio.Buffer buffer, byte[] sink) throws EOFException {
        j.g(buffer, "<this>");
        j.g(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int i4 = buffer.read(sink, i, sink.length - i);
            if (i4 == -1) {
                throw new EOFException();
            }
            i += i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6 A[EDGE_INSN: B:43:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:5:0x0012->B:45:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long commonReadHexadecimalUnsignedLong(okio.Buffer r14) throws java.io.EOFException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.j.g(r14, r0)
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb0
            r0 = 0
            r1 = r0
            r4 = r2
        L12:
            okio.Segment r6 = r14.head
            kotlin.jvm.internal.j.d(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L1d:
            if (r8 >= r9) goto L92
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L2c
            r11 = 57
            if (r10 > r11) goto L2c
            int r11 = r10 + (-48)
            goto L41
        L2c:
            r11 = 97
            if (r10 < r11) goto L37
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L37
            int r11 = r10 + (-87)
            goto L41
        L37:
            r11 = 65
            if (r10 < r11) goto L76
            r11 = 70
            if (r10 > r11) goto L76
            int r11 = r10 + (-55)
        L41:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L51
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L51:
            okio.Buffer r14 = new okio.Buffer
            r14.<init>()
            okio.Buffer r14 = r14.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Number too large: "
            r1.<init>(r2)
            java.lang.String r14 = r14.readUtf8()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L76:
            if (r0 == 0) goto L7a
            r1 = 1
            goto L92
        L7a:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.<init>(r1)
            java.lang.String r1 = okio.SegmentedByteString.toHexString(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L92:
            if (r8 != r9) goto L9e
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool.recycle(r6)
            goto La0
        L9e:
            r6.pos = r8
        La0:
            if (r1 != 0) goto La6
            okio.Segment r6 = r14.head
            if (r6 != 0) goto L12
        La6:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lb0:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.Buffer.commonReadHexadecimalUnsignedLong(okio.Buffer):long");
    }

    public static final int commonReadInt(okio.Buffer buffer) throws EOFException {
        j.g(buffer, "<this>");
        if (buffer.size() < 4) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        j.d(segment);
        int i = segment.pos;
        int i4 = segment.limit;
        if (i4 - i < 4) {
            return (buffer.readByte() & 255) | ((buffer.readByte() & 255) << 24) | ((buffer.readByte() & 255) << 16) | ((buffer.readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i6 = i + 3;
        int i10 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i11 = i + 4;
        int i12 = (bArr[i6] & 255) | i10;
        buffer.setSize$okio(buffer.size() - 4);
        if (i11 != i4) {
            segment.pos = i11;
            return i12;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return i12;
    }

    public static final long commonReadLong(okio.Buffer buffer) throws EOFException {
        j.g(buffer, "<this>");
        if (buffer.size() < 8) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        j.d(segment);
        int i = segment.pos;
        int i4 = segment.limit;
        if (i4 - i < 8) {
            return ((((long) buffer.readInt()) & KeyboardMap.kValueMask) << 32) | (KeyboardMap.kValueMask & ((long) buffer.readInt()));
        }
        byte[] bArr = segment.data;
        int i6 = i + 7;
        long j = ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i10 = i + 8;
        long j6 = j | (((long) bArr[i6]) & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i10 != i4) {
            segment.pos = i10;
            return j6;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return j6;
    }

    public static final short commonReadShort(okio.Buffer buffer) throws EOFException {
        j.g(buffer, "<this>");
        if (buffer.size() < 2) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        j.d(segment);
        int i = segment.pos;
        int i4 = segment.limit;
        if (i4 - i < 2) {
            return (short) ((buffer.readByte() & 255) | ((buffer.readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i6 = i + 1;
        int i10 = (bArr[i] & 255) << 8;
        int i11 = i + 2;
        int i12 = (bArr[i6] & 255) | i10;
        buffer.setSize$okio(buffer.size() - 2);
        if (i11 == i4) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i11;
        }
        return (short) i12;
    }

    public static final Buffer.UnsafeCursor commonReadUnsafe(okio.Buffer buffer, Buffer.UnsafeCursor unsafeCursor) {
        j.g(buffer, "<this>");
        j.g(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = false;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final String commonReadUtf8(okio.Buffer buffer, long j) throws EOFException {
        j.g(buffer, "<this>");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.f(j, "byteCount: ").toString());
        }
        if (buffer.size() < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        Segment segment = buffer.head;
        j.d(segment);
        int i = segment.pos;
        if (((long) i) + j > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j), 0, 0, 3, null);
        }
        int i4 = (int) j;
        String strCommonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i, i + i4);
        segment.pos += i4;
        buffer.setSize$okio(buffer.size() - j);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return strCommonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(okio.Buffer buffer) throws EOFException {
        int i;
        int i4;
        int i6;
        j.g(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        byte b8 = buffer.getByte(0L);
        if ((b8 & 128) == 0) {
            i = b8 & 127;
            i6 = 0;
            i4 = 1;
        } else if ((b8 & 224) == 192) {
            i = b8 & 31;
            i4 = 2;
            i6 = 128;
        } else if ((b8 & 240) == 224) {
            i = b8 & 15;
            i4 = 3;
            i6 = 2048;
        } else {
            if ((b8 & 248) != 240) {
                buffer.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i = b8 & 7;
            i4 = 4;
            i6 = 65536;
        }
        long j = i4;
        if (buffer.size() < j) {
            StringBuilder sbT = s.t(i4, "size < ", ": ");
            sbT.append(buffer.size());
            sbT.append(" (to read code point prefixed 0x");
            sbT.append(SegmentedByteString.toHexString(b8));
            sbT.append(')');
            throw new EOFException(sbT.toString());
        }
        for (int i10 = 1; i10 < i4; i10++) {
            long j6 = i10;
            byte b10 = buffer.getByte(j6);
            if ((b10 & 192) != 128) {
                buffer.skip(j6);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i = (i << 6) | (b10 & Utf8.REPLACEMENT_BYTE);
        }
        buffer.skip(j);
        return i > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i || i >= 57344) && i >= i6) ? i : Utf8.REPLACEMENT_CODE_POINT;
    }

    public static final String commonReadUtf8Line(okio.Buffer buffer) {
        j.g(buffer, "<this>");
        long jIndexOf = buffer.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(okio.Buffer buffer, long j) throws EOFException {
        j.g(buffer, "<this>");
        if (j < 0) {
            throw new IllegalArgumentException(a.f(j, "limit < 0: ").toString());
        }
        long j6 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jIndexOf = buffer.indexOf((byte) 10, 0L, j6);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (j6 < buffer.size() && buffer.getByte(j6 - 1) == 13 && buffer.getByte(j6) == 10) {
            return readUtf8Line(buffer, j6);
        }
        okio.Buffer buffer2 = new okio.Buffer();
        buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j) + " content=" + buffer2.readByteString().hex() + (char) 8230);
    }

    public static final long commonResizeBuffer(Buffer.UnsafeCursor unsafeCursor, long j) {
        j.g(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        if (j <= size) {
            if (j < 0) {
                throw new IllegalArgumentException(a.f(j, "newSize < 0: ").toString());
            }
            long j6 = size - j;
            while (true) {
                if (j6 <= 0) {
                    break;
                }
                Segment segment = buffer.head;
                j.d(segment);
                Segment segment2 = segment.prev;
                j.d(segment2);
                int i = segment2.limit;
                long j7 = i - segment2.pos;
                if (j7 > j6) {
                    segment2.limit = i - ((int) j6);
                    break;
                }
                buffer.head = segment2.pop();
                SegmentPool.recycle(segment2);
                j6 -= j7;
            }
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j > size) {
            long j9 = j - size;
            boolean z4 = true;
            while (j9 > 0) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                int iMin = (int) Math.min(j9, 8192 - segmentWritableSegment$okio.limit);
                segmentWritableSegment$okio.limit += iMin;
                j9 -= (long) iMin;
                if (z4) {
                    unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = segmentWritableSegment$okio.data;
                    int i4 = segmentWritableSegment$okio.limit;
                    unsafeCursor.start = i4 - iMin;
                    unsafeCursor.end = i4;
                    z4 = false;
                }
            }
        }
        buffer.setSize$okio(j);
        return size;
    }

    public static final int commonSeek(Buffer.UnsafeCursor unsafeCursor, long j) {
        Segment segmentPush;
        j.g(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j < -1 || j > buffer.size()) {
            StringBuilder sbS = a.s(j, "offset=", " > size=");
            sbS.append(buffer.size());
            throw new ArrayIndexOutOfBoundsException(sbS.toString());
        }
        if (j == -1 || j == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long size = buffer.size();
        Segment segment$okio = buffer.head;
        long j6 = 0;
        if (unsafeCursor.getSegment$okio() != null) {
            long j7 = unsafeCursor.offset;
            int i = unsafeCursor.start;
            Segment segment$okio2 = unsafeCursor.getSegment$okio();
            j.d(segment$okio2);
            long j9 = j7 - ((long) (i - segment$okio2.pos));
            if (j9 > j) {
                segmentPush = segment$okio;
                segment$okio = unsafeCursor.getSegment$okio();
                size = j9;
            } else {
                segmentPush = unsafeCursor.getSegment$okio();
                j6 = j9;
            }
        } else {
            segmentPush = segment$okio;
        }
        if (size - j > j - j6) {
            while (true) {
                j.d(segmentPush);
                int i4 = segmentPush.limit;
                int i6 = segmentPush.pos;
                if (j < ((long) (i4 - i6)) + j6) {
                    break;
                }
                j6 += (long) (i4 - i6);
                segmentPush = segmentPush.next;
            }
        } else {
            while (size > j) {
                j.d(segment$okio);
                segment$okio = segment$okio.prev;
                j.d(segment$okio);
                size -= (long) (segment$okio.limit - segment$okio.pos);
            }
            j6 = size;
            segmentPush = segment$okio;
        }
        if (unsafeCursor.readWrite) {
            j.d(segmentPush);
            if (segmentPush.shared) {
                Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                if (buffer.head == segmentPush) {
                    buffer.head = segmentUnsharedCopy;
                }
                segmentPush = segmentPush.push(segmentUnsharedCopy);
                Segment segment = segmentPush.prev;
                j.d(segment);
                segment.pop();
            }
        }
        unsafeCursor.setSegment$okio(segmentPush);
        unsafeCursor.offset = j;
        j.d(segmentPush);
        unsafeCursor.data = segmentPush.data;
        int i10 = segmentPush.pos + ((int) (j - j6));
        unsafeCursor.start = i10;
        int i11 = segmentPush.limit;
        unsafeCursor.end = i11;
        return i11 - i10;
    }

    public static final int commonSelect(okio.Buffer buffer, Options options) throws EOFException {
        j.g(buffer, "<this>");
        j.g(options, "options");
        int iSelectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings$okio()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public static final void commonSkip(okio.Buffer buffer, long j) throws EOFException {
        j.g(buffer, "<this>");
        while (j > 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, segment.limit - segment.pos);
            long j6 = iMin;
            buffer.setSize$okio(buffer.size() - j6);
            j -= j6;
            int i = segment.pos + iMin;
            segment.pos = i;
            if (i == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    public static final ByteString commonSnapshot(okio.Buffer buffer) {
        j.g(buffer, "<this>");
        if (buffer.size() <= 2147483647L) {
            return buffer.snapshot((int) buffer.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
    }

    public static final Segment commonWritableSegment(okio.Buffer buffer, int i) {
        j.g(buffer, "<this>");
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = buffer.head;
        if (segment != null) {
            j.d(segment);
            Segment segment2 = segment.prev;
            j.d(segment2);
            return (segment2.limit + i > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        buffer.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, ByteString byteString, int i, int i4) {
        j.g(buffer, "<this>");
        j.g(byteString, "byteString");
        byteString.write$okio(buffer, i, i4);
        return buffer;
    }

    public static /* synthetic */ okio.Buffer commonWrite$default(okio.Buffer buffer, ByteString byteString, int i, int i4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i = 0;
        }
        if ((i6 & 4) != 0) {
            i4 = byteString.size();
        }
        j.g(buffer, "<this>");
        j.g(byteString, "byteString");
        byteString.write$okio(buffer, i, i4);
        return buffer;
    }

    public static final long commonWriteAll(okio.Buffer buffer, Source source) throws IOException {
        j.g(buffer, "<this>");
        j.g(source, "source");
        long j = 0;
        while (true) {
            long j6 = source.read(buffer, 8192L);
            if (j6 == -1) {
                return j;
            }
            j += j6;
        }
    }

    public static final okio.Buffer commonWriteByte(okio.Buffer buffer, int i) {
        j.g(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i4 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i4 + 1;
        bArr[i4] = (byte) i;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    public static final okio.Buffer commonWriteDecimalLong(okio.Buffer buffer, long j) {
        boolean z4;
        j.g(buffer, "<this>");
        if (j == 0) {
            return buffer.writeByte(48);
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return buffer.writeUtf8("-9223372036854775808");
            }
            z4 = true;
        } else {
            z4 = false;
        }
        if (j >= 100000000) {
            i = j < MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US ? j < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < EnrichmentAttributesGenerator.SEND_NOW_PLACEHOLDER ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z4) {
            i++;
        }
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i4 = segmentWritableSegment$okio.limit + i;
        while (j != 0) {
            long j6 = 10;
            i4--;
            bArr[i4] = getHEX_DIGIT_BYTES()[(int) (j % j6)];
            j /= j6;
        }
        if (z4) {
            bArr[i4 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i;
        buffer.setSize$okio(buffer.size() + ((long) i));
        return buffer;
    }

    public static final okio.Buffer commonWriteHexadecimalUnsignedLong(okio.Buffer buffer, long j) {
        j.g(buffer, "<this>");
        if (j == 0) {
            return buffer.writeByte(48);
        }
        long j6 = (j >>> 1) | j;
        long j7 = j6 | (j6 >>> 2);
        long j9 = j7 | (j7 >>> 4);
        long j10 = j9 | (j9 >>> 8);
        long j11 = j10 | (j10 >>> 16);
        long j12 = j11 | (j11 >>> 32);
        long j13 = j12 - ((j12 >>> 1) & 6148914691236517205L);
        long j14 = ((j13 >>> 2) & 3689348814741910323L) + (j13 & 3689348814741910323L);
        long j15 = ((j14 >>> 4) + j14) & 1085102592571150095L;
        long j16 = j15 + (j15 >>> 8);
        long j17 = j16 + (j16 >>> 16);
        int i = (int) ((((j17 & 63) + ((j17 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i4 = segmentWritableSegment$okio.limit;
        for (int i6 = (i4 + i) - 1; i6 >= i4; i6--) {
            bArr[i6] = getHEX_DIGIT_BYTES()[(int) (15 & j)];
            j >>>= 4;
        }
        segmentWritableSegment$okio.limit += i;
        buffer.setSize$okio(buffer.size() + ((long) i));
        return buffer;
    }

    public static final okio.Buffer commonWriteInt(okio.Buffer buffer, int i) {
        j.g(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i4 = segmentWritableSegment$okio.limit;
        bArr[i4] = (byte) ((i >>> 24) & 255);
        bArr[i4 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i4 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i4 + 3] = (byte) (i & 255);
        segmentWritableSegment$okio.limit = i4 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    public static final okio.Buffer commonWriteLong(okio.Buffer buffer, long j) {
        j.g(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i = segmentWritableSegment$okio.limit;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        segmentWritableSegment$okio.limit = i + 8;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    public static final okio.Buffer commonWriteShort(okio.Buffer buffer, int i) {
        j.g(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i4 = segmentWritableSegment$okio.limit;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i4 + 1] = (byte) (i & 255);
        segmentWritableSegment$okio.limit = i4 + 2;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    public static final okio.Buffer commonWriteUtf8(okio.Buffer buffer, String string, int i, int i4) {
        char cCharAt;
        j.g(buffer, "<this>");
        j.g(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(s.f(i, "beginIndex < 0: ").toString());
        }
        if (i4 < i) {
            throw new IllegalArgumentException(a.c(i4, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i4 > string.length()) {
            StringBuilder sbT = s.t(i4, "endIndex > string.length: ", " > ");
            sbT.append(string.length());
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        while (i < i4) {
            char cCharAt2 = string.charAt(i);
            if (cCharAt2 < 128) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i6 = segmentWritableSegment$okio.limit - i;
                int iMin = Math.min(i4, 8192 - i6);
                int i10 = i + 1;
                bArr[i + i6] = (byte) cCharAt2;
                while (true) {
                    i = i10;
                    if (i >= iMin || (cCharAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i10 = i + 1;
                    bArr[i + i6] = (byte) cCharAt;
                }
                int i11 = segmentWritableSegment$okio.limit;
                int i12 = (i6 + i) - i11;
                segmentWritableSegment$okio.limit = i11 + i12;
                buffer.setSize$okio(buffer.size() + ((long) i12));
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(2);
                    byte[] bArr2 = segmentWritableSegment$okio2.data;
                    int i13 = segmentWritableSegment$okio2.limit;
                    bArr2[i13] = (byte) ((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                    bArr2[i13 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio2.limit = i13 + 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(3);
                    byte[] bArr3 = segmentWritableSegment$okio3.data;
                    int i14 = segmentWritableSegment$okio3.limit;
                    bArr3[i14] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i14 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i14 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio3.limit = i14 + 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i15 = i + 1;
                    char cCharAt3 = i15 < i4 ? string.charAt(i15) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        buffer.writeByte(63);
                        i = i15;
                    } else {
                        int i16 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentWritableSegment$okio4 = buffer.writableSegment$okio(4);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i17 = segmentWritableSegment$okio4.limit;
                        bArr4[i17] = (byte) ((i16 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                        bArr4[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                        bArr4[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                        bArr4[i17 + 3] = (byte) ((i16 & 63) | 128);
                        segmentWritableSegment$okio4.limit = i17 + 4;
                        buffer.setSize$okio(buffer.size() + 4);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return buffer;
    }

    public static final okio.Buffer commonWriteUtf8CodePoint(okio.Buffer buffer, int i) {
        j.g(buffer, "<this>");
        if (i < 128) {
            buffer.writeByte(i);
            return buffer;
        }
        if (i < 2048) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i4 = segmentWritableSegment$okio.limit;
            bArr[i4] = (byte) ((i >> 6) | PsExtractor.AUDIO_STREAM);
            bArr[i4 + 1] = (byte) ((i & 63) | 128);
            segmentWritableSegment$okio.limit = i4 + 2;
            buffer.setSize$okio(buffer.size() + 2);
            return buffer;
        }
        if (55296 <= i && i < 57344) {
            buffer.writeByte(63);
            return buffer;
        }
        if (i < 65536) {
            Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i6 = segmentWritableSegment$okio2.limit;
            bArr2[i6] = (byte) ((i >> 12) | 224);
            bArr2[i6 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i6 + 2] = (byte) ((i & 63) | 128);
            segmentWritableSegment$okio2.limit = i6 + 3;
            buffer.setSize$okio(buffer.size() + 3);
            return buffer;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i));
        }
        Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(4);
        byte[] bArr3 = segmentWritableSegment$okio3.data;
        int i10 = segmentWritableSegment$okio3.limit;
        bArr3[i10] = (byte) ((i >> 18) | PsExtractor.VIDEO_STREAM_MASK);
        bArr3[i10 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i10 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i10 + 3] = (byte) ((i & 63) | 128);
        segmentWritableSegment$okio3.limit = i10 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
    }

    public static final boolean rangeEquals(Segment segment, int i, byte[] bytes, int i4, int i6) {
        j.g(segment, "segment");
        j.g(bytes, "bytes");
        int i10 = segment.limit;
        byte[] bArr = segment.data;
        while (i4 < i6) {
            if (i == i10) {
                segment = segment.next;
                j.d(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i = segment.pos;
                i10 = segment.limit;
            }
            if (bArr[i] != bytes[i4]) {
                return false;
            }
            i++;
            i4++;
        }
        return true;
    }

    public static final String readUtf8Line(okio.Buffer buffer, long j) throws EOFException {
        j.g(buffer, "<this>");
        if (j > 0) {
            long j6 = j - 1;
            if (buffer.getByte(j6) == 13) {
                String utf8 = buffer.readUtf8(j6);
                buffer.skip(2L);
                return utf8;
            }
        }
        String utf82 = buffer.readUtf8(j);
        buffer.skip(1L);
        return utf82;
    }

    public static final <T> T seek(okio.Buffer buffer, long j, Function2<? super Segment, ? super Long, ? extends T> lambda) {
        j.g(buffer, "<this>");
        j.g(lambda, "lambda");
        Segment segment = buffer.head;
        if (segment == null) {
            return (T) lambda.invoke(null, -1L);
        }
        if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                j.d(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            return (T) lambda.invoke(segment, Long.valueOf(size));
        }
        long j6 = 0;
        while (true) {
            long j7 = ((long) (segment.limit - segment.pos)) + j6;
            if (j7 > j) {
                return (T) lambda.invoke(segment, Long.valueOf(j6));
            }
            segment = segment.next;
            j.d(segment);
            j6 = j7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r19 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int selectPrefix(okio.Buffer r17, okio.Options r18, boolean r19) {
        /*
            r0 = r17
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.j.g(r0, r1)
            java.lang.String r1 = "options"
            r2 = r18
            kotlin.jvm.internal.j.g(r2, r1)
            okio.Segment r0 = r0.head
            r1 = -2
            r3 = -1
            if (r0 != 0) goto L18
            if (r19 == 0) goto L17
            return r1
        L17:
            return r3
        L18:
            byte[] r4 = r0.data
            int r5 = r0.pos
            int r6 = r0.limit
            int[] r2 = r2.getTrie$okio()
            r7 = 0
            r9 = r0
            r10 = r3
            r8 = r7
        L26:
            int r11 = r8 + 1
            r12 = r2[r8]
            int r8 = r8 + 2
            r11 = r2[r11]
            if (r11 == r3) goto L31
            r10 = r11
        L31:
            if (r9 != 0) goto L34
            goto L64
        L34:
            r11 = 0
            if (r12 >= 0) goto L7d
            int r12 = r12 * (-1)
            int r13 = r12 + r8
        L3b:
            int r12 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + 1
            r8 = r2[r8]
            if (r5 == r8) goto L48
            goto L87
        L48:
            if (r14 != r13) goto L4c
            r5 = 1
            goto L4d
        L4c:
            r5 = r7
        L4d:
            if (r12 != r6) goto L6d
            kotlin.jvm.internal.j.d(r9)
            okio.Segment r4 = r9.next
            kotlin.jvm.internal.j.d(r4)
            int r6 = r4.pos
            byte[] r8 = r4.data
            int r9 = r4.limit
            if (r4 != r0) goto L67
            if (r5 == 0) goto L64
            r4 = r8
            r8 = r11
            goto L70
        L64:
            if (r19 == 0) goto L87
            return r1
        L67:
            r16 = r8
            r8 = r4
            r4 = r16
            goto L70
        L6d:
            r8 = r9
            r9 = r6
            r6 = r12
        L70:
            if (r5 == 0) goto L78
            r5 = r2[r14]
            r13 = r6
            r6 = r9
            r9 = r8
            goto La2
        L78:
            r5 = r6
            r6 = r9
            r9 = r8
            r8 = r14
            goto L3b
        L7d:
            int r13 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + r12
        L85:
            if (r8 != r14) goto L88
        L87:
            return r10
        L88:
            r15 = r2[r8]
            if (r5 != r15) goto La9
            int r8 = r8 + r12
            r5 = r2[r8]
            if (r13 != r6) goto La2
            okio.Segment r9 = r9.next
            kotlin.jvm.internal.j.d(r9)
            int r4 = r9.pos
            byte[] r6 = r9.data
            int r8 = r9.limit
            r13 = r4
            r4 = r6
            r6 = r8
            if (r9 != r0) goto La2
            r9 = r11
        La2:
            if (r5 < 0) goto La5
            return r5
        La5:
            int r8 = -r5
            r5 = r13
            goto L26
        La9:
            int r8 = r8 + 1
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.Buffer.selectPrefix(okio.Buffer, okio.Options, boolean):int");
    }

    public static /* synthetic */ int selectPrefix$default(okio.Buffer buffer, Options options, boolean z4, int i, Object obj) {
        if ((i & 2) != 0) {
            z4 = false;
        }
        return selectPrefix(buffer, options, z4);
    }

    public static final int commonRead(okio.Buffer buffer, byte[] sink, int i, int i4) {
        j.g(buffer, "<this>");
        j.g(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, i, i4);
        Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i4, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i6 = segment.pos;
        C1127m.d(i, i6, i6 + iMin, bArr, sink);
        segment.pos += iMin;
        buffer.setSize$okio(buffer.size() - ((long) iMin));
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public static final byte[] commonReadByteArray(okio.Buffer buffer, long j) throws EOFException {
        j.g(buffer, "<this>");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.f(j, "byteCount: ").toString());
        }
        if (buffer.size() < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        buffer.readFully(bArr);
        return bArr;
    }

    public static final ByteString commonReadByteString(okio.Buffer buffer, long j) throws EOFException {
        j.g(buffer, "<this>");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.f(j, "byteCount: ").toString());
        }
        if (buffer.size() < j) {
            throw new EOFException();
        }
        if (j < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new ByteString(buffer.readByteArray(j));
        }
        ByteString byteStringSnapshot = buffer.snapshot((int) j);
        buffer.skip(j);
        return byteStringSnapshot;
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, byte[] source) {
        j.g(buffer, "<this>");
        j.g(source, "source");
        return buffer.write(source, 0, source.length);
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, byte[] source, int i, int i4) {
        j.g(buffer, "<this>");
        j.g(source, "source");
        long j = i4;
        SegmentedByteString.checkOffsetAndCount(source.length, i, j);
        int i6 = i4 + i;
        while (i < i6) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int iMin = Math.min(i6 - i, 8192 - segmentWritableSegment$okio.limit);
            int i10 = i + iMin;
            C1127m.d(segmentWritableSegment$okio.limit, i, i10, source, segmentWritableSegment$okio.data);
            segmentWritableSegment$okio.limit += iMin;
            i = i10;
        }
        buffer.setSize$okio(buffer.size() + j);
        return buffer;
    }

    public static final void commonReadFully(okio.Buffer buffer, okio.Buffer sink, long j) throws EOFException {
        j.g(buffer, "<this>");
        j.g(sink, "sink");
        if (buffer.size() >= j) {
            sink.write(buffer, j);
        } else {
            sink.write(buffer, buffer.size());
            throw new EOFException();
        }
    }

    public static final ByteString commonSnapshot(okio.Buffer buffer, int i) {
        j.g(buffer, "<this>");
        if (i == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i);
        Segment segment = buffer.head;
        int i4 = 0;
        int i6 = 0;
        int i10 = 0;
        while (i6 < i) {
            j.d(segment);
            int i11 = segment.limit;
            int i12 = segment.pos;
            if (i11 != i12) {
                i6 += i11 - i12;
                i10++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i10][];
        int[] iArr = new int[i10 * 2];
        Segment segment2 = buffer.head;
        int i13 = 0;
        while (i4 < i) {
            j.d(segment2);
            bArr[i13] = segment2.data;
            i4 += segment2.limit - segment2.pos;
            iArr[i13] = Math.min(i4, i);
            iArr[i13 + i10] = segment2.pos;
            segment2.shared = true;
            i13++;
            segment2 = segment2.next;
        }
        return new C1994SegmentedByteString(bArr, iArr);
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, Source source, long j) throws IOException {
        j.g(buffer, "<this>");
        j.g(source, "source");
        while (j > 0) {
            long j6 = source.read(buffer, j);
            if (j6 == -1) {
                throw new EOFException();
            }
            j -= j6;
        }
        return buffer;
    }

    public static final long commonRead(okio.Buffer buffer, okio.Buffer sink, long j) {
        j.g(buffer, "<this>");
        j.g(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(a.f(j, "byteCount < 0: ").toString());
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j > buffer.size()) {
            j = buffer.size();
        }
        sink.write(buffer, j);
        return j;
    }

    public static final void commonWrite(okio.Buffer buffer, okio.Buffer source, long j) {
        Segment segment;
        j.g(buffer, "<this>");
        j.g(source, "source");
        if (source != buffer) {
            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j);
            while (j > 0) {
                Segment segment2 = source.head;
                j.d(segment2);
                int i = segment2.limit;
                j.d(source.head);
                if (j < i - r1.pos) {
                    Segment segment3 = buffer.head;
                    if (segment3 != null) {
                        j.d(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((((long) segment.limit) + j) - ((long) (segment.shared ? 0 : segment.pos)) <= 8192) {
                            Segment segment4 = source.head;
                            j.d(segment4);
                            segment4.writeTo(segment, (int) j);
                            source.setSize$okio(source.size() - j);
                            buffer.setSize$okio(buffer.size() + j);
                            return;
                        }
                    }
                    Segment segment5 = source.head;
                    j.d(segment5);
                    source.head = segment5.split((int) j);
                }
                Segment segment6 = source.head;
                j.d(segment6);
                long j6 = segment6.limit - segment6.pos;
                source.head = segment6.pop();
                Segment segment7 = buffer.head;
                if (segment7 == null) {
                    buffer.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    j.d(segment7);
                    Segment segment8 = segment7.prev;
                    j.d(segment8);
                    segment8.push(segment6).compact();
                }
                source.setSize$okio(source.size() - j6);
                buffer.setSize$okio(buffer.size() + j6);
                j -= j6;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public static final long commonIndexOf(okio.Buffer buffer, ByteString bytes, long j) {
        int i;
        long j6 = j;
        j.g(buffer, "<this>");
        j.g(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j6 >= 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                return -1L;
            }
            if (buffer.size() - j6 < j6) {
                size = buffer.size();
                while (size > j6) {
                    segment = segment.prev;
                    j.d(segment);
                    size -= (long) (segment.limit - segment.pos);
                }
                byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                byte b8 = bArrInternalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (buffer.size() - ((long) size2)) + 1;
                while (size < size3) {
                    byte[] bArr = segment.data;
                    int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + size3) - size);
                    i = (int) ((((long) segment.pos) + j6) - size);
                    while (i < iMin) {
                        if (bArr[i] != b8 || !rangeEquals(segment, i + 1, bArrInternalArray$okio, 1, size2)) {
                            i++;
                        }
                    }
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    j.d(segment);
                    j6 = size;
                }
                return -1L;
            }
            while (true) {
                long j7 = ((long) (segment.limit - segment.pos)) + size;
                if (j7 > j6) {
                    break;
                }
                segment = segment.next;
                j.d(segment);
                size = j7;
            }
            byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
            byte b10 = bArrInternalArray$okio2[0];
            int size4 = bytes.size();
            long size5 = (buffer.size() - ((long) size4)) + 1;
            while (size < size5) {
                byte[] bArr2 = segment.data;
                long j9 = size5;
                int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + size5) - size);
                i = (int) ((((long) segment.pos) + j6) - size);
                while (i < iMin2) {
                    if (bArr2[i] == b10 && rangeEquals(segment, i + 1, bArrInternalArray$okio2, 1, size4)) {
                    }
                    i++;
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                j.d(segment);
                size5 = j9;
                j6 = size;
            }
            return -1L;
            return ((long) (i - segment.pos)) + size;
        }
        throw new IllegalArgumentException(a.f(j6, "fromIndex < 0: ").toString());
    }
}
