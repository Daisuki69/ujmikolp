package of;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes4.dex */
public interface r extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void s(long j, e eVar);

    u timeout();
}
