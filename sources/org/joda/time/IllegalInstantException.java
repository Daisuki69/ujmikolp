package org.joda.time;

import We.s;
import org.joda.time.format.DateTimeFormat;

/* JADX INFO: loaded from: classes5.dex */
public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    public IllegalInstantException(String str) {
        super(str);
    }

    private static String createMessage(long j, String str) {
        return s.j("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ", DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new Instant(j)), str != null ? s.j(" (", str, ")") : "");
    }

    public static boolean isIllegalInstant(Throwable th2) {
        if (th2 instanceof IllegalInstantException) {
            return true;
        }
        if (th2.getCause() == null || th2.getCause() == th2) {
            return false;
        }
        return isIllegalInstant(th2.getCause());
    }

    public IllegalInstantException(long j, String str) {
        super(createMessage(j, str));
    }
}
