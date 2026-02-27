package okio.internal;

import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes5.dex */
public final class _ZlibJvmKt {
    private static final int DEFAULT_COMPRESSION = -1;

    public static final long datePartsToEpochMillis(int i, int i4, int i6, int i10, int i11, int i12) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(i, i4 - 1, i6, i10, i11, i12);
        return gregorianCalendar.getTime().getTime();
    }

    public static final int getDEFAULT_COMPRESSION() {
        return DEFAULT_COMPRESSION;
    }
}
