package androidx.core.os;

import android.os.Trace;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class TraceKt {
    public static final <T> T trace(String str, Function0<? extends T> function0) {
        Trace.beginSection(str);
        try {
            return (T) function0.invoke();
        } finally {
            Trace.endSection();
        }
    }
}
