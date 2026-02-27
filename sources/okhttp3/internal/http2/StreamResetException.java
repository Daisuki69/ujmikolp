package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes5.dex */
public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        j.g(errorCode, "errorCode");
        this.errorCode = errorCode;
    }
}
