package okio;

import java.util.zip.Deflater;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: okio.-DeflaterSinkExtensions, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class DeflaterSinkExtensions {
    public static final DeflaterSink deflate(Sink sink, Deflater deflater) {
        j.g(sink, "<this>");
        j.g(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }

    public static /* synthetic */ DeflaterSink deflate$default(Sink sink, Deflater deflater, int i, Object obj) {
        if ((i & 1) != 0) {
            deflater = new Deflater();
        }
        j.g(sink, "<this>");
        j.g(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }
}
