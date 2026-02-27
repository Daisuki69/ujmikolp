package okio;

import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: okio.-GzipSourceExtensions, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class GzipSourceExtensions {
    private static final int FCOMMENT = 4;
    private static final int FEXTRA = 2;
    private static final int FHCRC = 1;
    private static final int FNAME = 3;
    private static final byte SECTION_BODY = 1;
    private static final byte SECTION_DONE = 3;
    private static final byte SECTION_HEADER = 0;
    private static final byte SECTION_TRAILER = 2;

    private static final boolean getBit(int i, int i4) {
        return ((i >> i4) & 1) == 1;
    }

    public static final GzipSource gzip(Source source) {
        j.g(source, "<this>");
        return new GzipSource(source);
    }
}
