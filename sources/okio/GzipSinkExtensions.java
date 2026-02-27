package okio;

import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: okio.-GzipSinkExtensions, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class GzipSinkExtensions {
    public static final GzipSink gzip(Sink sink) {
        j.g(sink, "<this>");
        return new GzipSink(sink);
    }
}
