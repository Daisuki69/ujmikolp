package zj;

/* JADX INFO: loaded from: classes11.dex */
public class y extends x {
    public static Integer f(String str) {
        boolean z4;
        int i;
        int i4;
        kotlin.jvm.internal.j.g(str, "<this>");
        C2579a.a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char cCharAt = str.charAt(0);
        int i10 = kotlin.jvm.internal.j.i(cCharAt, 48);
        int i11 = androidx.media3.common.C.RATE_UNSET_INT;
        if (i10 < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z4 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i11 = Integer.MIN_VALUE;
                z4 = true;
            }
        } else {
            z4 = false;
            i = 0;
        }
        int i12 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i6 < i12 && (i12 != -59652323 || i6 < (i12 = i11 / 10))) || (i4 = i6 * 10) < i11 + iDigit) {
                return null;
            }
            i6 = i4 - iDigit;
            i++;
        }
        return z4 ? Integer.valueOf(i6) : Integer.valueOf(-i6);
    }

    public static Long g(String str) {
        boolean z4;
        kotlin.jvm.internal.j.g(str, "<this>");
        C2579a.a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        int i4 = kotlin.jvm.internal.j.i(cCharAt, 48);
        long j = androidx.media3.common.C.TIME_UNSET;
        if (i4 < 0) {
            z4 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z4 = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z4 = false;
        }
        long j6 = 0;
        long j7 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j6 < j7) {
                if (j7 != -256204778801521550L) {
                    return null;
                }
                j7 = j / ((long) 10);
                if (j6 < j7) {
                    return null;
                }
            }
            long j9 = j6 * ((long) 10);
            long j10 = iDigit;
            if (j9 < j + j10) {
                return null;
            }
            j6 = j9 - j10;
            i++;
        }
        return z4 ? Long.valueOf(j6) : Long.valueOf(-j6);
    }
}
