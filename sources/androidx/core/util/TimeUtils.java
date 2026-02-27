package androidx.core.util;

import androidx.annotation.RestrictTo;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class TimeUtils {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final Object sFormatSync = new Object();
    private static char[] sFormatStr = new char[24];

    private TimeUtils() {
    }

    private static int accumField(int i, int i4, boolean z4, int i6) {
        if (i > 99 || (z4 && i6 >= 3)) {
            return i4 + 3;
        }
        if (i > 9 || (z4 && i6 >= 2)) {
            return i4 + 2;
        }
        if (z4 || i > 0) {
            return i4 + 1;
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j, StringBuilder sb2) {
        synchronized (sFormatSync) {
            sb2.append(sFormatStr, 0, formatDurationLocked(j, 0));
        }
    }

    private static int formatDurationLocked(long j, int i) {
        char c;
        int i4;
        int i6;
        int i10;
        int i11;
        long j6 = j;
        if (sFormatStr.length < i) {
            sFormatStr = new char[i];
        }
        char[] cArr = sFormatStr;
        if (j6 == 0) {
            int i12 = i - 1;
            while (i12 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j6 > 0) {
            c = '+';
        } else {
            j6 = -j6;
            c = '-';
        }
        int i13 = (int) (j6 % 1000);
        int iFloor = (int) Math.floor(j6 / 1000);
        if (iFloor > 86400) {
            i4 = iFloor / 86400;
            iFloor -= 86400 * i4;
        } else {
            i4 = 0;
        }
        if (iFloor > 3600) {
            i6 = iFloor / 3600;
            iFloor -= i6 * 3600;
        } else {
            i6 = 0;
        }
        if (iFloor > 60) {
            int i14 = iFloor / 60;
            iFloor -= i14 * 60;
            i10 = i14;
        } else {
            i10 = 0;
        }
        if (i != 0) {
            int iAccumField = accumField(i4, 1, false, 0);
            int iAccumField2 = iAccumField + accumField(i6, 1, iAccumField > 0, 2);
            int iAccumField3 = iAccumField2 + accumField(i10, 1, iAccumField2 > 0, 2);
            int iAccumField4 = iAccumField3 + accumField(iFloor, 1, iAccumField3 > 0, 2);
            i11 = 0;
            for (int iAccumField5 = accumField(i13, 2, true, iAccumField4 > 0 ? 3 : 0) + 1 + iAccumField4; iAccumField5 < i; iAccumField5++) {
                cArr[i11] = ' ';
                i11++;
            }
        } else {
            i11 = 0;
        }
        cArr[i11] = c;
        int i15 = i11 + 1;
        boolean z4 = i != 0;
        int iPrintField = printField(cArr, i4, 'd', i15, false, 0);
        int iPrintField2 = printField(cArr, i6, 'h', iPrintField, iPrintField != i15, z4 ? 2 : 0);
        int iPrintField3 = printField(cArr, i10, 'm', iPrintField2, iPrintField2 != i15, z4 ? 2 : 0);
        int iPrintField4 = printField(cArr, iFloor, 's', iPrintField3, iPrintField3 != i15, z4 ? 2 : 0);
        int iPrintField5 = printField(cArr, i13, 'm', iPrintField4, true, (!z4 || iPrintField4 == i15) ? 0 : 3);
        cArr[iPrintField5] = 's';
        return iPrintField5 + 1;
    }

    private static int printField(char[] cArr, int i, char c, int i4, boolean z4, int i6) {
        int i10;
        if (!z4 && i <= 0) {
            return i4;
        }
        if ((!z4 || i6 < 3) && i <= 99) {
            i10 = i4;
        } else {
            int i11 = i / 100;
            cArr[i4] = (char) (i11 + 48);
            i10 = i4 + 1;
            i -= i11 * 100;
        }
        if ((z4 && i6 >= 2) || i > 9 || i4 != i10) {
            int i12 = i / 10;
            cArr[i10] = (char) (i12 + 48);
            i10++;
            i -= i12 * 10;
        }
        cArr[i10] = (char) (i + 48);
        cArr[i10 + 1] = c;
        return i10 + 2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j, PrintWriter printWriter, int i) {
        synchronized (sFormatSync) {
            printWriter.print(new String(sFormatStr, 0, formatDurationLocked(j, i)));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j, PrintWriter printWriter) {
        formatDuration(j, printWriter, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j, long j6, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            formatDuration(j - j6, printWriter, 0);
        }
    }
}
