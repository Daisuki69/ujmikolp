package Mj;

import java.io.IOException;
import java.io.InputStream;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements d, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f3425a;

    public b(InputStream input) {
        kotlin.jvm.internal.j.g(input, "input");
        this.f3425a = input;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f3425a.close();
    }

    @Override // Mj.d
    public final long l(a sink, long j) throws IOException {
        kotlin.jvm.internal.j.g(sink, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(androidx.media3.datasource.cache.c.i(j, "byteCount (", ") < 0").toString());
        }
        boolean z4 = false;
        try {
            g gVarG = sink.g(1);
            long j6 = this.f3425a.read(gVarG.f3432a, gVarG.c, (int) Math.min(j, r4.length - r5));
            int i = j6 == -1 ? 0 : (int) j6;
            if (i == 1) {
                gVarG.c += i;
                sink.c += (long) i;
                return j6;
            }
            if (i < 0 || i > gVarG.a()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + i + ". Should be in 0.." + gVarG.a()).toString());
            }
            if (i != 0) {
                gVarG.c += i;
                sink.c += (long) i;
                return j6;
            }
            if (!j.b(gVarG)) {
                return j6;
            }
            sink.c();
            return j6;
        } catch (AssertionError e) {
            if (e.getCause() != null) {
                String message = e.getMessage();
                if (message != null ? C2576A.z(message, "getsockname failed", false, 2) : false) {
                    z4 = true;
                }
            }
            if (z4) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    public final String toString() {
        return "RawSource(" + this.f3425a + ')';
    }
}
