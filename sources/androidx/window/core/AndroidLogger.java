package androidx.window.core;

import android.util.Log;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidLogger implements Logger {
    public static final AndroidLogger INSTANCE = new AndroidLogger();

    private AndroidLogger() {
    }

    @Override // androidx.window.core.Logger
    public void debug(String tag, String message) {
        j.g(tag, "tag");
        j.g(message, "message");
        Log.d(tag, message);
    }
}
