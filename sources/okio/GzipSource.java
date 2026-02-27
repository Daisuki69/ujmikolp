package okio;

import We.s;
import androidx.camera.core.impl.a;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes5.dex */
public final class GzipSource implements Source, AutoCloseable {
    private final CRC32 crc;
    private final Inflater inflater;
    private final InflaterSource inflaterSource;
    private byte section;
    private final RealBufferedSource source;

    public GzipSource(Source source) {
        j.g(source, "source");
        RealBufferedSource realBufferedSource = new RealBufferedSource(source);
        this.source = realBufferedSource;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new InflaterSource((BufferedSource) realBufferedSource, inflater);
        this.crc = new CRC32();
    }

    private final void checkEqual(String str, int i, int i4) throws IOException {
        if (i4 == i) {
            return;
        }
        StringBuilder sbV = s.v(str, ": actual 0x");
        sbV.append(C2576A.K(8, SegmentedByteString.toHexString(i4)));
        sbV.append(" != expected 0x");
        sbV.append(C2576A.K(8, SegmentedByteString.toHexString(i)));
        throw new IOException(sbV.toString());
    }

    private final void consumeHeader() throws IOException {
        this.source.require(10L);
        byte b8 = this.source.bufferField.getByte(3L);
        boolean z4 = ((b8 >> 1) & 1) == 1;
        if (z4) {
            updateCrc(this.source.bufferField, 0L, 10L);
        }
        checkEqual("ID1ID2", 8075, this.source.readShort());
        this.source.skip(8L);
        if (((b8 >> 2) & 1) == 1) {
            this.source.require(2L);
            if (z4) {
                updateCrc(this.source.bufferField, 0L, 2L);
            }
            long shortLe = this.source.bufferField.readShortLe() & 65535;
            this.source.require(shortLe);
            if (z4) {
                updateCrc(this.source.bufferField, 0L, shortLe);
            }
            this.source.skip(shortLe);
        }
        if (((b8 >> 3) & 1) == 1) {
            long jIndexOf = this.source.indexOf((byte) 0);
            if (jIndexOf == -1) {
                throw new EOFException();
            }
            if (z4) {
                updateCrc(this.source.bufferField, 0L, jIndexOf + 1);
            }
            this.source.skip(jIndexOf + 1);
        }
        if (((b8 >> 4) & 1) == 1) {
            long jIndexOf2 = this.source.indexOf((byte) 0);
            if (jIndexOf2 == -1) {
                throw new EOFException();
            }
            if (z4) {
                updateCrc(this.source.bufferField, 0L, jIndexOf2 + 1);
            }
            this.source.skip(jIndexOf2 + 1);
        }
        if (z4) {
            checkEqual("FHCRC", this.source.readShortLe(), (short) this.crc.getValue());
            this.crc.reset();
        }
    }

    private final void consumeTrailer() throws IOException {
        checkEqual("CRC", this.source.readIntLe(), (int) this.crc.getValue());
        checkEqual("ISIZE", this.source.readIntLe(), (int) this.inflater.getBytesWritten());
    }

    private final void updateCrc(Buffer buffer, long j, long j6) {
        Segment segment = buffer.head;
        j.d(segment);
        while (true) {
            int i = segment.limit;
            int i4 = segment.pos;
            if (j < i - i4) {
                break;
            }
            j -= (long) (i - i4);
            segment = segment.next;
            j.d(segment);
        }
        while (j6 > 0) {
            int i6 = (int) (((long) segment.pos) + j);
            int iMin = (int) Math.min(segment.limit - i6, j6);
            this.crc.update(segment.data, i6, iMin);
            j6 -= (long) iMin;
            segment = segment.next;
            j.d(segment);
            j = 0;
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    @Override // okio.Source
    public long read(Buffer sink, long j) throws IOException {
        GzipSource gzipSource;
        j.g(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(a.f(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        if (this.section == 0) {
            consumeHeader();
            this.section = (byte) 1;
        }
        if (this.section == 1) {
            long size = sink.size();
            long j6 = this.inflaterSource.read(sink, j);
            if (j6 != -1) {
                updateCrc(sink, size, j6);
                return j6;
            }
            gzipSource = this;
            gzipSource.section = (byte) 2;
        } else {
            gzipSource = this;
        }
        if (gzipSource.section == 2) {
            consumeTrailer();
            gzipSource.section = (byte) 3;
            if (!gzipSource.source.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.source.timeout();
    }
}
