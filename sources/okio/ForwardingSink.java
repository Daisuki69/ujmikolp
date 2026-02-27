package okio;

import java.io.IOException;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ForwardingSink implements Sink, AutoCloseable {
    private final Sink delegate;

    public ForwardingSink(Sink delegate) {
        j.g(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final Sink m413deprecated_delegate() {
        return this.delegate;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final Sink delegate() {
        return this.delegate;
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // okio.Sink
    public void write(Buffer source, long j) throws IOException {
        j.g(source, "source");
        this.delegate.write(source, j);
    }
}
