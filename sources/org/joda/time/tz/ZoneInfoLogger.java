package org.joda.time.tz;

/* JADX INFO: loaded from: classes5.dex */
public class ZoneInfoLogger {
    static ThreadLocal<Boolean> cVerbose = new ThreadLocal<Boolean>() { // from class: org.joda.time.tz.ZoneInfoLogger.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    };

    public static void set(boolean z4) {
        cVerbose.set(Boolean.valueOf(z4));
    }

    public static boolean verbose() {
        return cVerbose.get().booleanValue();
    }
}
