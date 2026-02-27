package io.flutter.plugins.webviewflutter;

import android.util.Log;
import cj.C1132s;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AndroidWebkitLibraryPigeonUtils {
    public static final AndroidWebkitLibraryPigeonUtils INSTANCE = new AndroidWebkitLibraryPigeonUtils();

    private AndroidWebkitLibraryPigeonUtils() {
    }

    public final AndroidWebKitError createConnectionError(String channelName) {
        kotlin.jvm.internal.j.g(channelName, "channelName");
        return new AndroidWebKitError("channel-error", We.s.j("Unable to establish connection on channel: '", channelName, "'."), "");
    }

    public final List<Object> wrapError(Throwable exception) {
        kotlin.jvm.internal.j.g(exception, "exception");
        if (exception instanceof AndroidWebKitError) {
            AndroidWebKitError androidWebKitError = (AndroidWebKitError) exception;
            return C1132s.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
        }
        return C1132s.g(exception.getClass().getSimpleName(), exception.toString(), "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    }

    public final List<Object> wrapResult(Object obj) {
        return cj.r.c(obj);
    }
}
