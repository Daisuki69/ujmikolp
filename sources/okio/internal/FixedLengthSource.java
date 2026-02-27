package okio.internal;

import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;

/* JADX INFO: loaded from: classes5.dex */
public final class FixedLengthSource extends ForwardingSource {
    private long bytesReceived;
    private final long size;
    private final boolean truncate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedLengthSource(Source delegate, long j, boolean z4) {
        super(delegate);
        j.g(delegate, "delegate");
        this.size = j;
        this.truncate = z4;
    }

    private final void truncateToSize(Buffer buffer, long j) throws IOException {
        Buffer buffer2 = new Buffer();
        buffer2.writeAll(buffer);
        buffer.write(buffer2, j);
        buffer2.clear();
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(Buffer sink, long j) throws IOException {
        j.g(sink, "sink");
        long j6 = this.bytesReceived;
        long j7 = this.size;
        if (j6 > j7) {
            j = 0;
        } else if (this.truncate) {
            long j9 = j7 - j6;
            if (j9 == 0) {
                return -1L;
            }
            j = Math.min(j, j9);
        }
        long j10 = super.read(sink, j);
        if (j10 != -1) {
            this.bytesReceived += j10;
        }
        long j11 = this.bytesReceived;
        long j12 = this.size;
        if ((j11 >= j12 || j10 != -1) && j11 <= j12) {
            return j10;
        }
        if (j10 > 0 && j11 > j12) {
            truncateToSize(sink, sink.size() - (this.bytesReceived - this.size));
        }
        throw new IOException("expected " + this.size + " bytes but got " + this.bytesReceived);
    }
}
