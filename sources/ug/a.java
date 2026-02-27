package ug;

import androidx.tracing.Trace;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a implements AutoCloseable {
    public static String b(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + numX49.tnTj78("bFWP");
    }

    public static void c(String str) {
        Trace.beginSection(b(str));
    }
}
