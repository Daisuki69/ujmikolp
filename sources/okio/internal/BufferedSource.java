package okio.internal;

import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.TypedOptions;

/* JADX INFO: renamed from: okio.internal.-BufferedSource, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class BufferedSource {
    public static final <T> T commonSelect(okio.BufferedSource bufferedSource, TypedOptions<T> options) throws IOException {
        j.g(bufferedSource, "<this>");
        j.g(options, "options");
        int iSelect = bufferedSource.select(options.getOptions$okio());
        if (iSelect == -1) {
            return null;
        }
        return options.get(iSelect);
    }
}
