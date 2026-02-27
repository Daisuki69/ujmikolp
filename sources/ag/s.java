package Ag;

import Bg.C0121s;
import bj.C1030a;
import io.ktor.client.engine.okhttp.StreamAdapterIOException;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f311b;

    public s(Long l6, Function0 function0) {
        this.f310a = l6;
        this.f311b = function0;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        Long l6 = this.f310a;
        if (l6 != null) {
            return l6.longValue();
        }
        return -1L;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink sink) throws IOException {
        kotlin.jvm.internal.j.g(sink, "sink");
        try {
            io.ktor.utils.io.n nVar = (io.ktor.utils.io.n) this.f311b.invoke();
            kotlin.jvm.internal.j.g(nVar, "<this>");
            Source source = Okio.source(new C0121s(nVar, 1));
            Long th2 = null;
            try {
                Long lValueOf = Long.valueOf(sink.writeAll(source));
                if (source != null) {
                    try {
                        source.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                Long l6 = th2;
                th2 = lValueOf;
                th = l6;
            } catch (Throwable th4) {
                th = th4;
                if (source != null) {
                    try {
                        source.close();
                    } catch (Throwable th5) {
                        C1030a.a(th, th5);
                    }
                }
            }
            if (th != 0) {
                throw th;
            }
            th2.getClass();
        } catch (IOException e) {
            throw e;
        } catch (Throwable th6) {
            throw new StreamAdapterIOException(th6);
        }
    }
}
