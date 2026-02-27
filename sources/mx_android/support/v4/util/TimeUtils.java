package mx_android.support.v4.util;

import java.io.PrintWriter;

/* JADX INFO: loaded from: classes7.dex */
public class TimeUtils {
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final Object sFormatSync = new Object();
    private static char[] sFormatStr = new char[24];

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
        int i13 = i10 + 1;
        cArr[i13] = c;
        return i13 + 1;
    }

    private static int formatDurationLocked(long j, int i) {
        char c;
        int i4;
        int i6;
        int i10;
        int i11;
        int i12;
        long j6 = j;
        if (sFormatStr.length < i) {
            sFormatStr = new char[i];
        }
        char[] cArr = sFormatStr;
        if (j6 == 0) {
            int i13 = i - 1;
            while (i13 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j6 > 0) {
            c = '+';
        } else {
            c = '-';
            j6 = -j6;
        }
        int i14 = (int) (j6 % 1000);
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
            int i15 = iFloor / 60;
            i10 = iFloor - (i15 * 60);
            i11 = i15;
        } else {
            i10 = iFloor;
            i11 = 0;
        }
        if (i != 0) {
            int iAccumField = accumField(i4, 1, false, 0);
            int iAccumField2 = iAccumField + accumField(i6, 1, iAccumField > 0, 2);
            int iAccumField3 = iAccumField2 + accumField(i11, 1, iAccumField2 > 0, 2);
            int iAccumField4 = iAccumField3 + accumField(i10, 1, iAccumField3 > 0, 2);
            i12 = 0;
            for (int iAccumField5 = iAccumField4 + accumField(i14, 2, true, iAccumField4 > 0 ? 3 : 0) + 1; iAccumField5 < i; iAccumField5++) {
                cArr[i12] = ' ';
                i12++;
            }
        } else {
            i12 = 0;
        }
        cArr[i12] = c;
        int i16 = i12 + 1;
        boolean z4 = i != 0;
        int iPrintField = printField(cArr, i4, 'd', i16, false, 0);
        int iPrintField2 = printField(cArr, i6, 'h', iPrintField, iPrintField != i16, z4 ? 2 : 0);
        int iPrintField3 = printField(cArr, i11, 'm', iPrintField2, iPrintField2 != i16, z4 ? 2 : 0);
        int iPrintField4 = printField(cArr, i10, 's', iPrintField3, iPrintField3 != i16, z4 ? 2 : 0);
        int iPrintField5 = printField(cArr, i14, 'm', iPrintField4, true, (!z4 || iPrintField4 == i16) ? 0 : 3);
        cArr[iPrintField5] = 's';
        return iPrintField5 + 1;
    }

    public static void formatDuration(long j, StringBuilder sb2) {
        synchronized (sFormatSync) {
            sb2.append(sFormatStr, 0, formatDurationLocked(j, 0));
        }
    }

    public static void formatDuration(long j, PrintWriter printWriter, int i) {
        synchronized (sFormatSync) {
            printWriter.print(new String(sFormatStr, 0, formatDurationLocked(j, i)));
        }
    }

    public static void formatDuration(long j, PrintWriter printWriter) {
        formatDuration(j, printWriter, 0);
    }

    public static void formatDuration(long j, long j6, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            formatDuration(j - j6, printWriter, 0);
        }
    }
}
