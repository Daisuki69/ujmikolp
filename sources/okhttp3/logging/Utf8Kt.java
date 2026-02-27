package okhttp3.logging;

import java.io.EOFException;
import kotlin.jvm.internal.j;
import okio.Buffer;

/* JADX INFO: loaded from: classes5.dex */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(Buffer buffer) {
        j.g(buffer, "<this>");
        try {
            Buffer buffer2 = new Buffer();
            long size = buffer.size();
            long j = 64;
            if (size <= 64) {
                j = size;
            }
            buffer.copyTo(buffer2, 0L, j);
            for (int i = 0; i < 16; i++) {
                if (buffer2.exhausted()) {
                    return true;
                }
                int utf8CodePoint = buffer2.readUtf8CodePoint();
                if (Character.isISOControl(utf8CodePoint) && !Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
