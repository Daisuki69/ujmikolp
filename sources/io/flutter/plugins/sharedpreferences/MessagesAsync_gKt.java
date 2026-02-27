package io.flutter.plugins.sharedpreferences;

import android.util.Log;
import cj.C1132s;
import cj.r;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MessagesAsync_gKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> wrapError(Throwable th2) {
        if (th2 instanceof SharedPreferencesError) {
            SharedPreferencesError sharedPreferencesError = (SharedPreferencesError) th2;
            return C1132s.g(sharedPreferencesError.getCode(), sharedPreferencesError.getMessage(), sharedPreferencesError.getDetails());
        }
        return C1132s.g(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
    }

    private static final List<Object> wrapResult(Object obj) {
        return r.c(obj);
    }
}
