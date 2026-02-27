package okio;

import We.s;
import androidx.camera.core.impl.a;
import androidx.media3.datasource.cache.c;
import androidx.media3.exoplayer.MediaPeriodQueue;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.extractor.ts.PsExtractor;
import cj.C1127m;
import com.dynatrace.android.agent.events.eventsapi.EnrichmentAttributesGenerator;
import io.flutter.embedding.android.KeyboardMap;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.j;
import mx_android.support.v4.media.session.PlaybackStateCompat;
import okhttp3.internal.connection.RealConnection;
import zj.C2581c;

/* JADX INFO: loaded from: classes5.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel, AutoCloseable {
    public Segment head;
    private long size;

    public static final class UnsafeCursor implements Closeable, AutoCloseable {
        public Buffer buffer;
        public byte[] data;
        public boolean readWrite;
        private Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            setSegment$okio(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final long expandBuffer(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException(s.f(i, "minByteCount <= 0: ").toString());
            }
            if (i > 8192) {
                throw new IllegalArgumentException(s.f(i, "minByteCount > Segment.SIZE: ").toString());
            }
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long size = buffer.size();
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
            int i4 = 8192 - segmentWritableSegment$okio.limit;
            segmentWritableSegment$okio.limit = 8192;
            long j = i4;
            buffer.setSize$okio(size + j);
            setSegment$okio(segmentWritableSegment$okio);
            this.offset = size;
            this.data = segmentWritableSegment$okio.data;
            this.start = 8192 - i4;
            this.end = 8192;
            return j;
        }

        public final Segment getSegment$okio() {
            return this.segment;
        }

        public final int next() {
            long j = this.offset;
            Buffer buffer = this.buffer;
            j.d(buffer);
            if (j == buffer.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j6 = this.offset;
            return seek(j6 == -1 ? 0L : j6 + ((long) (this.end - this.start)));
        }

        public final long resizeBuffer(long j) {
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
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
                setSegment$okio(null);
                this.offset = j;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (j > size) {
                long j9 = j - size;
                boolean z4 = true;
                while (j9 > 0) {
                    Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                    int iMin = (int) Math.min(j9, 8192 - segmentWritableSegment$okio.limit);
                    segmentWritableSegment$okio.limit += iMin;
                    j9 -= (long) iMin;
                    if (z4) {
                        setSegment$okio(segmentWritableSegment$okio);
                        this.offset = size;
                        this.data = segmentWritableSegment$okio.data;
                        int i4 = segmentWritableSegment$okio.limit;
                        this.start = i4 - iMin;
                        this.end = i4;
                        z4 = false;
                    }
                }
            }
            buffer.setSize$okio(j);
            return size;
        }

        public final int seek(long j) {
            Segment segmentPush;
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j < -1 || j > buffer.size()) {
                StringBuilder sbS = a.s(j, "offset=", " > size=");
                sbS.append(buffer.size());
                throw new ArrayIndexOutOfBoundsException(sbS.toString());
            }
            if (j == -1 || j == buffer.size()) {
                setSegment$okio(null);
                this.offset = j;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = buffer.size();
            Segment segment$okio = buffer.head;
            long j6 = 0;
            if (getSegment$okio() != null) {
                long j7 = this.offset;
                int i = this.start;
                Segment segment$okio2 = getSegment$okio();
                j.d(segment$okio2);
                long j9 = j7 - ((long) (i - segment$okio2.pos));
                if (j9 > j) {
                    segmentPush = segment$okio;
                    segment$okio = getSegment$okio();
                    size = j9;
                } else {
                    segmentPush = getSegment$okio();
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
            if (this.readWrite) {
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
            setSegment$okio(segmentPush);
            this.offset = j;
            j.d(segmentPush);
            this.data = segmentPush.data;
            int i10 = segmentPush.pos + ((int) (j - j6));
            this.start = i10;
            int i11 = segmentPush.limit;
            this.end = i11;
            return i11 - i10;
        }

        public final void setSegment$okio(Segment segment) {
            this.segment = segment;
        }
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j, long j6, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j7 = j;
        if ((i & 4) != 0) {
            j6 = buffer.size - j7;
        }
        return buffer.copyTo(outputStream, j7, j6);
    }

    private final ByteString digest(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i = segment.pos;
            messageDigest.update(bArr, i, segment.limit - i);
            Segment segment2 = segment.next;
            j.d(segment2);
            while (segment2 != segment) {
                byte[] bArr2 = segment2.data;
                int i4 = segment2.pos;
                messageDigest.update(bArr2, i4, segment2.limit - i4);
                segment2 = segment2.next;
                j.d(segment2);
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        j.f(bArrDigest, "digest(...)");
        return new ByteString(bArrDigest);
    }

    private final ByteString hmac(String str, ByteString byteString) throws NoSuchAlgorithmException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.internalArray$okio(), str));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i = segment.pos;
                mac.update(bArr, i, segment.limit - i);
                Segment segment2 = segment.next;
                j.d(segment2);
                while (segment2 != segment) {
                    byte[] bArr2 = segment2.data;
                    int i4 = segment2.pos;
                    mac.update(bArr2, i4, segment2.limit - i4);
                    segment2 = segment2.next;
                    j.d(segment2);
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            j.f(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i, Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i, Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = buffer.size;
        }
        return buffer.writeTo(outputStream, j);
    }

    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m398deprecated_getByte(long j) {
        return getByte(j);
    }

    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final long m399deprecated_size() {
        return this.size;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer buffer() {
        return this;
    }

    public final void clear() throws EOFException {
        skip(size());
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.head;
        j.d(segment);
        Segment segment2 = segment.prev;
        j.d(segment2);
        int i = segment2.limit;
        return (i >= 8192 || !segment2.owner) ? size : size - ((long) (i - segment2.pos));
    }

    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() == 0) {
            return buffer;
        }
        Segment segment = this.head;
        j.d(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            j.d(segment3);
            j.d(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer.setSize$okio(size());
        return buffer;
    }

    public final Buffer copyTo(OutputStream out) throws IOException {
        j.g(out, "out");
        return copyTo$default(this, out, 0L, 0L, 6, (Object) null);
    }

    @Override // okio.BufferedSink
    public Buffer emit() {
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) obj;
        if (size() != buffer.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        Segment segment = this.head;
        j.d(segment);
        Segment segment2 = buffer.head;
        j.d(segment2);
        int i = segment.pos;
        int i4 = segment2.pos;
        long j = 0;
        while (j < size()) {
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

    @Override // okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer getBuffer() {
        return this;
    }

    public final byte getByte(long j) {
        SegmentedByteString.checkOffsetAndCount(size(), j, 1L);
        Segment segment = this.head;
        if (segment == null) {
            j.d(null);
            throw null;
        }
        if (size() - j < j) {
            long size = size();
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

    public int hashCode() {
        Segment segment = this.head;
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
        } while (segment != this.head);
        return i;
    }

    public final ByteString hmacSha1(ByteString key) {
        j.g(key, "key");
        return hmac("HmacSHA1", key);
    }

    public final ByteString hmacSha256(ByteString key) {
        j.g(key, "key");
        return hmac("HmacSHA256", key);
    }

    public final ByteString hmacSha512(ByteString key) {
        j.g(key, "key");
        return hmac("HmacSHA512", key);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b8) {
        return indexOf(b8, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(ByteString targetBytes) {
        j.g(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.Buffer.inputStream.1
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size(), Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (Buffer.this.size() > 0) {
                    return Buffer.this.readByte() & 255;
                }
                return -1;
            }

            public String toString() {
                return Buffer.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(byte[] sink, int i, int i4) {
                j.g(sink, "sink");
                return Buffer.this.read(sink, i, i4);
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final ByteString md5() {
        return digest("MD5");
    }

    @Override // okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.Buffer.outputStream.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i) {
                Buffer.this.writeByte(i);
            }

            @Override // java.io.OutputStream
            public void write(byte[] data, int i, int i4) {
                j.g(data, "data");
                Buffer.this.write(data, i, i4);
            }
        };
    }

    @Override // okio.BufferedSource
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j, ByteString bytes) {
        j.g(bytes, "bytes");
        return rangeEquals(j, bytes, 0, bytes.size());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) throws IOException {
        j.g(sink, "sink");
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), segment.limit - segment.pos);
        sink.put(segment.data, segment.pos, iMin);
        int i = segment.pos + iMin;
        segment.pos = i;
        this.size -= (long) iMin;
        if (i == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @Override // okio.BufferedSource
    public long readAll(Sink sink) throws IOException {
        j.g(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        Segment segment = this.head;
        j.d(segment);
        int i = segment.pos;
        int i4 = segment.limit;
        int i6 = i + 1;
        byte b8 = segment.data[i];
        setSize$okio(size() - 1);
        if (i6 != i4) {
            segment.pos = i6;
            return b8;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return b8;
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // okio.BufferedSource
    public ByteString readByteString() {
        return readByteString(size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r1 = new okio.Buffer().writeDecimalLong(r8).writeByte((int) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r1.readUtf8());
     */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readDecimalLong() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readDecimalLong():long");
    }

    public final Buffer readFrom(InputStream input) throws IOException {
        j.g(input, "input");
        readFrom(input, Long.MAX_VALUE, true);
        return this;
    }

    @Override // okio.BufferedSource
    public void readFully(Buffer sink, long j) throws EOFException {
        j.g(sink, "sink");
        if (size() >= j) {
            sink.write(this, j);
        } else {
            sink.write(this, size());
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1 A[EDGE_INSN: B:43:0x00a1->B:37:0x00a1 BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lab
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            okio.Segment r6 = r14.head
            kotlin.jvm.internal.j.d(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L8d
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L71
            r11 = 70
            if (r10 > r11) goto L71
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L71:
            if (r0 == 0) goto L75
            r1 = 1
            goto L8d
        L75:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = okio.SegmentedByteString.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8d:
            if (r8 != r9) goto L99
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool.recycle(r6)
            goto L9b
        L99:
            r6.pos = r8
        L9b:
            if (r1 != 0) goto La1
            okio.Segment r6 = r14.head
            if (r6 != 0) goto Ld
        La1:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lab:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        Segment segment = this.head;
        j.d(segment);
        int i = segment.pos;
        int i4 = segment.limit;
        if (i4 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = segment.data;
        int i6 = i + 3;
        int i10 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i11 = i + 4;
        int i12 = (bArr[i6] & 255) | i10;
        setSize$okio(size() - 4);
        if (i11 != i4) {
            segment.pos = i11;
            return i12;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return i12;
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readInt());
    }

    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        Segment segment = this.head;
        j.d(segment);
        int i = segment.pos;
        int i4 = segment.limit;
        if (i4 - i < 8) {
            return ((((long) readInt()) & KeyboardMap.kValueMask) << 32) | (KeyboardMap.kValueMask & ((long) readInt()));
        }
        byte[] bArr = segment.data;
        int i6 = i + 7;
        long j = ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i10 = i + 8;
        long j6 = j | (((long) bArr[i6]) & 255);
        setSize$okio(size() - 8);
        if (i10 != i4) {
            segment.pos = i10;
            return j6;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return j6;
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readLong());
    }

    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        Segment segment = this.head;
        j.d(segment);
        int i = segment.pos;
        int i4 = segment.limit;
        if (i4 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = segment.data;
        int i6 = i + 1;
        int i10 = (bArr[i] & 255) << 8;
        int i11 = i + 2;
        int i12 = (bArr[i6] & 255) | i10;
        setSize$okio(size() - 2);
        if (i11 == i4) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i11;
        }
        return (short) i12;
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readShort());
    }

    @Override // okio.BufferedSource
    public String readString(Charset charset) {
        j.g(charset, "charset");
        return readString(this.size, charset);
    }

    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    @Override // okio.BufferedSource
    public String readUtf8() {
        return readString(this.size, C2581c.f21468b);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i;
        int i4;
        int i6;
        if (size() == 0) {
            throw new EOFException();
        }
        byte b8 = getByte(0L);
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
                skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i = b8 & 7;
            i4 = 4;
            i6 = 65536;
        }
        long j = i4;
        if (size() < j) {
            StringBuilder sbT = s.t(i4, "size < ", ": ");
            sbT.append(size());
            sbT.append(" (to read code point prefixed 0x");
            sbT.append(SegmentedByteString.toHexString(b8));
            sbT.append(')');
            throw new EOFException(sbT.toString());
        }
        for (int i10 = 1; i10 < i4; i10++) {
            long j6 = i10;
            byte b10 = getByte(j6);
            if ((b10 & 192) != 128) {
                skip(j6);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i = (i << 6) | (b10 & Utf8.REPLACEMENT_BYTE);
        }
        skip(j);
        return i > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i || i >= 57344) && i >= i6) ? i : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Override // okio.BufferedSource
    public String readUtf8Line() throws EOFException {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public boolean request(long j) {
        return this.size >= j;
    }

    @Override // okio.BufferedSource
    public void require(long j) throws EOFException {
        if (this.size < j) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(Options options) throws EOFException {
        j.g(options, "options");
        int iSelectPrefix$default = okio.internal.Buffer.selectPrefix$default(this, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings$okio()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public final void setSize$okio(long j) {
        this.size = j;
    }

    public final ByteString sha1() {
        return digest("SHA-1");
    }

    public final ByteString sha256() {
        return digest("SHA-256");
    }

    public final ByteString sha512() {
        return digest("SHA-512");
    }

    public final long size() {
        return this.size;
    }

    @Override // okio.BufferedSource
    public void skip(long j) throws EOFException {
        while (j > 0) {
            Segment segment = this.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, segment.limit - segment.pos);
            long j6 = iMin;
            setSize$okio(size() - j6);
            j -= j6;
            int i = segment.pos + iMin;
            segment.pos = i;
            if (i == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    public final ByteString snapshot() {
        if (size() <= 2147483647L) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // okio.Source
    public Timeout timeout() {
        return Timeout.NONE;
    }

    public String toString() {
        return snapshot().toString();
    }

    public final Segment writableSegment$okio(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = this.head;
        if (segment != null) {
            j.d(segment);
            Segment segment2 = segment.prev;
            j.d(segment2);
            return (segment2.limit + i > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        this.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @Override // okio.BufferedSink
    public long writeAll(Source source) throws IOException {
        j.g(source, "source");
        long j = 0;
        while (true) {
            long j6 = source.read(this, 8192L);
            if (j6 == -1) {
                return j;
            }
            j += j6;
        }
    }

    public final Buffer writeTo(OutputStream out) throws IOException {
        j.g(out, "out");
        return writeTo$default(this, out, 0L, 2, null);
    }

    public Buffer clone() {
        return copy();
    }

    public final Buffer copyTo(OutputStream out, long j) throws IOException {
        j.g(out, "out");
        return copyTo$default(this, out, j, 0L, 4, (Object) null);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b8, long j) {
        return indexOf(b8, j, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(ByteString targetBytes, long j) {
        int i;
        int i4;
        j.g(targetBytes, "targetBytes");
        long size = 0;
        if (j < 0) {
            throw new IllegalArgumentException(a.f(j, "fromIndex < 0: ").toString());
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - j < j) {
            size = size();
            while (size > j) {
                segment = segment.prev;
                j.d(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (targetBytes.size() == 2) {
                byte b8 = targetBytes.getByte(0);
                byte b10 = targetBytes.getByte(1);
                while (size < size()) {
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
                while (size < size()) {
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
            while (size < size()) {
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
            while (size < size()) {
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

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j, ByteString bytes, int i, int i4) {
        j.g(bytes, "bytes");
        if (j < 0 || i < 0 || i4 < 0 || size() - j < i4 || bytes.size() - i < i4) {
            return false;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            if (getByte(((long) i6) + j) != bytes.getByte(i + i6)) {
                return false;
            }
        }
        return true;
    }

    public final UnsafeCursor readAndWriteUnsafe(UnsafeCursor unsafeCursor) {
        j.g(unsafeCursor, "unsafeCursor");
        return okio.internal.Buffer.commonReadAndWriteUnsafe(this, unsafeCursor);
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.f(j, "byteCount: ").toString());
        }
        if (size() < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.BufferedSource
    public ByteString readByteString(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.f(j, "byteCount: ").toString());
        }
        if (size() < j) {
            throw new EOFException();
        }
        if (j < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new ByteString(readByteArray(j));
        }
        ByteString byteStringSnapshot = snapshot((int) j);
        skip(j);
        return byteStringSnapshot;
    }

    public final Buffer readFrom(InputStream input, long j) throws IOException {
        j.g(input, "input");
        if (j < 0) {
            throw new IllegalArgumentException(a.f(j, "byteCount < 0: ").toString());
        }
        readFrom(input, j, false);
        return this;
    }

    @Override // okio.BufferedSource
    public String readString(long j, Charset charset) throws EOFException {
        j.g(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.f(j, "byteCount: ").toString());
        }
        if (this.size < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        Segment segment = this.head;
        j.d(segment);
        int i = segment.pos;
        if (((long) i) + j > segment.limit) {
            return new String(readByteArray(j), charset);
        }
        int i4 = (int) j;
        String str = new String(segment.data, i, i4, charset);
        int i6 = segment.pos + i4;
        segment.pos = i6;
        this.size -= j;
        if (i6 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    public final UnsafeCursor readUnsafe(UnsafeCursor unsafeCursor) {
        j.g(unsafeCursor, "unsafeCursor");
        return okio.internal.Buffer.commonReadUnsafe(this, unsafeCursor);
    }

    @Override // okio.BufferedSource
    public String readUtf8(long j) throws EOFException {
        return readString(j, C2581c.f21468b);
    }

    @Override // okio.BufferedSource
    public String readUtf8LineStrict(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(a.f(j, "limit < 0: ").toString());
        }
        long j6 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j6);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (j6 < size() && getByte(j6 - 1) == 13 && getByte(j6) == 10) {
            return okio.internal.Buffer.readUtf8Line(this, j6);
        }
        Buffer buffer = new Buffer();
        copyTo(buffer, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    @Override // okio.BufferedSink
    public Buffer writeByte(int i) {
        Segment segmentWritableSegment$okio = writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i4 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i4 + 1;
        bArr[i4] = (byte) i;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeDecimalLong(long j) {
        boolean z4;
        if (j == 0) {
            return writeByte(48);
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return writeUtf8("-9223372036854775808");
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
        Segment segmentWritableSegment$okio = writableSegment$okio(i);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i4 = segmentWritableSegment$okio.limit + i;
        while (j != 0) {
            long j6 = 10;
            i4--;
            bArr[i4] = okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (j % j6)];
            j /= j6;
        }
        if (z4) {
            bArr[i4 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i;
        setSize$okio(size() + ((long) i));
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeHexadecimalUnsignedLong(long j) {
        if (j == 0) {
            return writeByte(48);
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
        Segment segmentWritableSegment$okio = writableSegment$okio(i);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i4 = segmentWritableSegment$okio.limit;
        for (int i6 = (i4 + i) - 1; i6 >= i4; i6--) {
            bArr[i6] = okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (15 & j)];
            j >>>= 4;
        }
        segmentWritableSegment$okio.limit += i;
        setSize$okio(size() + ((long) i));
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeInt(int i) {
        Segment segmentWritableSegment$okio = writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i4 = segmentWritableSegment$okio.limit;
        bArr[i4] = (byte) ((i >>> 24) & 255);
        bArr[i4 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i4 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i4 + 3] = (byte) (i & 255);
        segmentWritableSegment$okio.limit = i4 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeIntLe(int i) {
        return writeInt(SegmentedByteString.reverseBytes(i));
    }

    @Override // okio.BufferedSink
    public Buffer writeLong(long j) {
        Segment segmentWritableSegment$okio = writableSegment$okio(8);
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
        setSize$okio(size() + 8);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeLongLe(long j) {
        return writeLong(SegmentedByteString.reverseBytes(j));
    }

    @Override // okio.BufferedSink
    public Buffer writeShort(int i) {
        Segment segmentWritableSegment$okio = writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i4 = segmentWritableSegment$okio.limit;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i4 + 1] = (byte) (i & 255);
        segmentWritableSegment$okio.limit = i4 + 2;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeShortLe(int i) {
        return writeShort((int) SegmentedByteString.reverseBytes((short) i));
    }

    public final Buffer writeTo(OutputStream out, long j) throws IOException {
        j.g(out, "out");
        SegmentedByteString.checkOffsetAndCount(this.size, 0L, j);
        Segment segment = this.head;
        long j6 = j;
        while (j6 > 0) {
            j.d(segment);
            int iMin = (int) Math.min(j6, segment.limit - segment.pos);
            out.write(segment.data, segment.pos, iMin);
            int i = segment.pos + iMin;
            segment.pos = i;
            long j7 = iMin;
            this.size -= j7;
            j6 -= j7;
            if (i == segment.limit) {
                Segment segmentPop = segment.pop();
                this.head = segmentPop;
                SegmentPool.recycle(segment);
                segment = segmentPop;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeUtf8CodePoint(int i) {
        if (i < 128) {
            writeByte(i);
            return this;
        }
        if (i < 2048) {
            Segment segmentWritableSegment$okio = writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i4 = segmentWritableSegment$okio.limit;
            bArr[i4] = (byte) ((i >> 6) | PsExtractor.AUDIO_STREAM);
            bArr[i4 + 1] = (byte) ((i & 63) | 128);
            segmentWritableSegment$okio.limit = i4 + 2;
            setSize$okio(size() + 2);
            return this;
        }
        if (55296 <= i && i < 57344) {
            writeByte(63);
            return this;
        }
        if (i < 65536) {
            Segment segmentWritableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i6 = segmentWritableSegment$okio2.limit;
            bArr2[i6] = (byte) ((i >> 12) | 224);
            bArr2[i6 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i6 + 2] = (byte) ((i & 63) | 128);
            segmentWritableSegment$okio2.limit = i6 + 3;
            setSize$okio(size() + 3);
            return this;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i));
        }
        Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
        byte[] bArr3 = segmentWritableSegment$okio3.data;
        int i10 = segmentWritableSegment$okio3.limit;
        bArr3[i10] = (byte) ((i >> 18) | PsExtractor.VIDEO_STREAM_MASK);
        bArr3[i10 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i10 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i10 + 3] = (byte) ((i & 63) | 128);
        segmentWritableSegment$okio3.limit = i10 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j, long j6, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return buffer.copyTo(buffer2, j, j6);
    }

    public final Buffer copyTo(OutputStream out, long j, long j6) throws IOException {
        j.g(out, "out");
        long j7 = j;
        SegmentedByteString.checkOffsetAndCount(this.size, j7, j6);
        if (j6 != 0) {
            Segment segment = this.head;
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
                int i6 = (int) (((long) segment2.pos) + j7);
                int iMin = (int) Math.min(segment2.limit - i6, j9);
                out.write(segment2.data, i6, iMin);
                j9 -= (long) iMin;
                segment2 = segment2.next;
                j7 = 0;
            }
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString bytes) throws IOException {
        j.g(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSink
    public Buffer writeString(String string, Charset charset) {
        j.g(string, "string");
        j.g(charset, "charset");
        return writeString(string, 0, string.length(), charset);
    }

    @Override // okio.BufferedSink
    public Buffer writeUtf8(String string) {
        j.g(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return buffer.copyTo(buffer2, j);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b8, long j, long j6) {
        Segment segment;
        int i;
        long size = 0;
        if (0 > j || j > j6) {
            StringBuilder sb2 = new StringBuilder("size=");
            sb2.append(size());
            sb2.append(" fromIndex=");
            sb2.append(j);
            throw new IllegalArgumentException(c.j(j6, " toIndex=", sb2).toString());
        }
        if (j6 > size()) {
            j6 = size();
        }
        if (j == j6 || (segment = this.head) == null) {
            return -1L;
        }
        if (size() - j < j) {
            size = size();
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

    @Override // okio.BufferedSource
    public <T> T select(TypedOptions<T> options) throws IOException {
        j.g(options, "options");
        int iSelect = select(options.getOptions$okio());
        if (iSelect == -1) {
            return null;
        }
        return options.get(iSelect);
    }

    public final ByteString snapshot(int i) {
        if (i == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(size(), 0L, i);
        Segment segment = this.head;
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
        Segment segment2 = this.head;
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

    @Override // okio.BufferedSink
    public Buffer writeUtf8(String string, int i, int i4) {
        char cCharAt;
        j.g(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(s.f(i, "beginIndex < 0: ").toString());
        }
        if (i4 >= i) {
            if (i4 > string.length()) {
                StringBuilder sbT = s.t(i4, "endIndex > string.length: ", " > ");
                sbT.append(string.length());
                throw new IllegalArgumentException(sbT.toString().toString());
            }
            while (i < i4) {
                char cCharAt2 = string.charAt(i);
                if (cCharAt2 < 128) {
                    Segment segmentWritableSegment$okio = writableSegment$okio(1);
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
                    setSize$okio(size() + ((long) i12));
                } else {
                    if (cCharAt2 < 2048) {
                        Segment segmentWritableSegment$okio2 = writableSegment$okio(2);
                        byte[] bArr2 = segmentWritableSegment$okio2.data;
                        int i13 = segmentWritableSegment$okio2.limit;
                        bArr2[i13] = (byte) ((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                        bArr2[i13 + 1] = (byte) ((cCharAt2 & '?') | 128);
                        segmentWritableSegment$okio2.limit = i13 + 2;
                        setSize$okio(size() + 2);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i14 = i + 1;
                        char cCharAt3 = i14 < i4 ? string.charAt(i14) : (char) 0;
                        if (cCharAt2 <= 56319 && 56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i15 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
                            byte[] bArr3 = segmentWritableSegment$okio3.data;
                            int i16 = segmentWritableSegment$okio3.limit;
                            bArr3[i16] = (byte) ((i15 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            bArr3[i16 + 1] = (byte) (((i15 >> 12) & 63) | 128);
                            bArr3[i16 + 2] = (byte) (((i15 >> 6) & 63) | 128);
                            bArr3[i16 + 3] = (byte) ((i15 & 63) | 128);
                            segmentWritableSegment$okio3.limit = i16 + 4;
                            setSize$okio(size() + 4);
                            i += 2;
                        } else {
                            writeByte(63);
                            i = i14;
                        }
                    } else {
                        Segment segmentWritableSegment$okio4 = writableSegment$okio(3);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i17 = segmentWritableSegment$okio4.limit;
                        bArr4[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                        bArr4[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                        bArr4[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                        segmentWritableSegment$okio4.limit = i17 + 3;
                        setSize$okio(size() + 3);
                    }
                    i++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(a.c(i4, i, "endIndex < beginIndex: ", " < ").toString());
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] sink) throws EOFException {
        j.g(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int i4 = read(sink, i, sink.length - i);
            if (i4 == -1) {
                throw new EOFException();
            }
            i += i4;
        }
    }

    @Override // okio.BufferedSink
    public Buffer writeString(String string, int i, int i4, Charset charset) {
        j.g(string, "string");
        j.g(charset, "charset");
        if (i < 0) {
            throw new IllegalArgumentException(s.f(i, "beginIndex < 0: ").toString());
        }
        if (i4 >= i) {
            if (i4 <= string.length()) {
                if (charset.equals(C2581c.f21468b)) {
                    return writeUtf8(string, i, i4);
                }
                String strSubstring = string.substring(i, i4);
                j.f(strSubstring, "substring(...)");
                byte[] bytes = strSubstring.getBytes(charset);
                j.f(bytes, "getBytes(...)");
                return write(bytes, 0, bytes.length);
            }
            StringBuilder sbT = s.t(i4, "endIndex > string.length: ", " > ");
            sbT.append(string.length());
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        throw new IllegalArgumentException(a.c(i4, i, "endIndex < beginIndex: ", " < ").toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) throws IOException {
        j.g(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i, 8192 - segmentWritableSegment$okio.limit);
            source.get(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
            i -= iMin;
            segmentWritableSegment$okio.limit += iMin;
        }
        this.size += (long) iRemaining;
        return iRemaining;
    }

    @Override // okio.BufferedSource
    public int read(byte[] sink) {
        j.g(sink, "sink");
        return read(sink, 0, sink.length);
    }

    private final void readFrom(InputStream inputStream, long j, boolean z4) throws IOException {
        while (true) {
            if (j <= 0 && !z4) {
                return;
            }
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int i = inputStream.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(j, 8192 - segmentWritableSegment$okio.limit));
            if (i == -1) {
                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                    this.head = segmentWritableSegment$okio.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio);
                }
                if (!z4) {
                    throw new EOFException();
                }
                return;
            }
            segmentWritableSegment$okio.limit += i;
            long j6 = i;
            this.size += j6;
            j -= j6;
        }
    }

    @Override // okio.BufferedSource
    public int read(byte[] sink, int i, int i4) {
        j.g(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, i, i4);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i4, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i6 = segment.pos;
        C1127m.d(i, i6, i6 + iMin, bArr, sink);
        segment.pos += iMin;
        setSize$okio(size() - ((long) iMin));
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public final Buffer copyTo(Buffer out, long j) {
        j.g(out, "out");
        return copyTo(out, j, this.size - j);
    }

    @Override // okio.BufferedSink
    public Buffer write(ByteString byteString) {
        j.g(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    public final Buffer copyTo(Buffer out, long j, long j6) {
        j.g(out, "out");
        long j7 = j;
        SegmentedByteString.checkOffsetAndCount(size(), j7, j6);
        if (j6 != 0) {
            out.setSize$okio(out.size() + j6);
            Segment segment = this.head;
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
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer write(ByteString byteString, int i, int i4) {
        j.g(byteString, "byteString");
        byteString.write$okio(this, i, i4);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer write(byte[] source) {
        j.g(source, "source");
        return write(source, 0, source.length);
    }

    @Override // okio.BufferedSink
    public Buffer write(byte[] source, int i, int i4) {
        j.g(source, "source");
        long j = i4;
        SegmentedByteString.checkOffsetAndCount(source.length, i, j);
        int i6 = i4 + i;
        while (i < i6) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i6 - i, 8192 - segmentWritableSegment$okio.limit);
            int i10 = i + iMin;
            C1127m.d(segmentWritableSegment$okio.limit, i, i10, source, segmentWritableSegment$okio.data);
            segmentWritableSegment$okio.limit += iMin;
            i = i10;
        }
        setSize$okio(size() + j);
        return this;
    }

    @Override // okio.Source
    public long read(Buffer sink, long j) {
        j.g(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(a.f(j, "byteCount < 0: ").toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j > size()) {
            j = size();
        }
        sink.write(this, j);
        return j;
    }

    @Override // okio.BufferedSink
    public Buffer write(Source source, long j) throws IOException {
        j.g(source, "source");
        while (j > 0) {
            long j6 = source.read(this, j);
            if (j6 == -1) {
                throw new EOFException();
            }
            j -= j6;
        }
        return this;
    }

    @Override // okio.Sink
    public void write(Buffer source, long j) {
        Segment segment;
        j.g(source, "source");
        if (source != this) {
            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j);
            while (j > 0) {
                Segment segment2 = source.head;
                j.d(segment2);
                int i = segment2.limit;
                j.d(source.head);
                if (j < i - r1.pos) {
                    Segment segment3 = this.head;
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
                            setSize$okio(size() + j);
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
                Segment segment7 = this.head;
                if (segment7 == null) {
                    this.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    j.d(segment7);
                    Segment segment8 = segment7.prev;
                    j.d(segment8);
                    segment8.push(segment6).compact();
                }
                source.setSize$okio(source.size() - j6);
                setSize$okio(size() + j6);
                j -= j6;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString bytes, long j) throws IOException {
        int i;
        long j6 = j;
        j.g(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j6 >= 0) {
            Segment segment = this.head;
            if (segment == null) {
                return -1L;
            }
            if (size() - j6 < j6) {
                size = size();
                while (size > j6) {
                    segment = segment.prev;
                    j.d(segment);
                    size -= (long) (segment.limit - segment.pos);
                }
                byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                byte b8 = bArrInternalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (size() - ((long) size2)) + 1;
                while (size < size3) {
                    byte[] bArr = segment.data;
                    long j7 = size3;
                    int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + size3) - size);
                    i = (int) ((((long) segment.pos) + j6) - size);
                    while (i < iMin) {
                        if (bArr[i] != b8 || !okio.internal.Buffer.rangeEquals(segment, i + 1, bArrInternalArray$okio, 1, size2)) {
                            i++;
                        }
                    }
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    j.d(segment);
                    j6 = size;
                    size3 = j7;
                }
                return -1L;
            }
            while (true) {
                long j9 = ((long) (segment.limit - segment.pos)) + size;
                if (j9 > j6) {
                    break;
                }
                segment = segment.next;
                j.d(segment);
                size = j9;
            }
            byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
            byte b10 = bArrInternalArray$okio2[0];
            int size4 = bytes.size();
            long size5 = (size() - ((long) size4)) + 1;
            while (size < size5) {
                byte[] bArr2 = segment.data;
                int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + size5) - size);
                i = (int) ((((long) segment.pos) + j6) - size);
                while (i < iMin2) {
                    if (bArr2[i] == b10 && okio.internal.Buffer.rangeEquals(segment, i + 1, bArrInternalArray$okio2, 1, size4)) {
                    }
                    i++;
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                j.d(segment);
                j6 = size;
            }
            return -1L;
            return ((long) (i - segment.pos)) + size;
        }
        throw new IllegalArgumentException(a.f(j6, "fromIndex < 0: ").toString());
    }
}
