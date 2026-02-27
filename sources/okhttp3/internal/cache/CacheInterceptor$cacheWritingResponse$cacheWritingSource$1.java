package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.j;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes5.dex */
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements Source, AutoCloseable {
    final /* synthetic */ BufferedSink $cacheBody;
    final /* synthetic */ CacheRequest $cacheRequest;
    final /* synthetic */ BufferedSource $source;
    private boolean cacheRequestClosed;

    public CacheInterceptor$cacheWritingResponse$cacheWritingSource$1(BufferedSource bufferedSource, CacheRequest cacheRequest, BufferedSink bufferedSink) {
        this.$source = bufferedSource;
        this.$cacheRequest = cacheRequest;
        this.$cacheBody = bufferedSink;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.cacheRequestClosed = true;
            this.$cacheRequest.abort();
        }
        this.$source.close();
    }

    @Override // okio.Source
    public long read(Buffer sink, long j) throws IOException {
        j.g(sink, "sink");
        try {
            long j6 = this.$source.read(sink, j);
            if (j6 != -1) {
                sink.copyTo(this.$cacheBody.getBuffer(), sink.size() - j6, j6);
                this.$cacheBody.emitCompleteSegments();
                return j6;
            }
            if (!this.cacheRequestClosed) {
                this.cacheRequestClosed = true;
                this.$cacheBody.close();
            }
            return -1L;
        } catch (IOException e) {
            if (this.cacheRequestClosed) {
                throw e;
            }
            this.cacheRequestClosed = true;
            this.$cacheRequest.abort();
            throw e;
        }
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.$source.timeout();
    }
}
