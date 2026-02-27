package okio;

import java.io.EOFException;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes5.dex */
final class BlackholeSink implements Sink, AutoCloseable {
    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @Override // okio.Sink
    public void write(Buffer source, long j) throws EOFException {
        j.g(source, "source");
        source.skip(j);
    }
}
