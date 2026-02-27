package com.dynatrace.android.agent.crash;

import androidx.media3.datasource.cache.c;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public class XamarinStacktraceProcessor implements StacktraceProcessor {
    private static final String EXCEPTION_MSG_DELIMITER = " ---> ";
    private static final String XAMARIN_AT = "  at ";
    private final String exception;
    private final int maxLength;
    private final int maxLines;
    private final int maxReasonLength;
    private final int maxStacktraceSize;

    public XamarinStacktraceProcessor(String str, int i) {
        this(str, i, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH, 1000, 250);
    }

    public static String convertToXamarinOrNull(Throwable th2) {
        while (th2 != null) {
            String message = th2.getMessage();
            if (message != null && isXamarin(message)) {
                return message;
            }
            th2 = th2.getCause();
        }
        return null;
    }

    private String generateReason(String[] strArr, int i) {
        StringBuilder sb2 = new StringBuilder();
        int iIndexOf = strArr[0].indexOf(EXCEPTION_MSG_DELIMITER);
        if (iIndexOf < 0) {
            sb2.append(strArr[0]);
            int i4 = 1;
            while (true) {
                if (i4 < strArr.length && !strArr[i4].startsWith(XAMARIN_AT) && sb2.length() < i) {
                    sb2.append(Global.NEWLINE);
                    int iIndexOf2 = strArr[i4].indexOf(EXCEPTION_MSG_DELIMITER);
                    if (iIndexOf2 >= 0) {
                        sb2.append(strArr[i4].substring(0, iIndexOf2));
                        break;
                    }
                    sb2.append(strArr[i4]);
                    i4++;
                } else {
                    break;
                }
            }
        } else {
            sb2.append(strArr[0].substring(0, iIndexOf));
        }
        return sb2.length() > i ? sb2.substring(0, i) : sb2.toString();
    }

    private String generateStackTrace(String[] strArr) {
        if (strArr.length <= this.maxLines && this.exception.length() <= this.maxStacktraceSize) {
            return this.exception;
        }
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        int iB = 0;
        while (i < Math.min(strArr.length, this.maxLines)) {
            int i4 = i == 0 ? 0 : 1;
            if (c.b(iB, i4, strArr[i]) > this.maxStacktraceSize) {
                break;
            }
            if (i4 > 0) {
                sb2.append(Global.NEWLINE);
            }
            sb2.append(strArr[i]);
            iB = c.b(i4, iB, strArr[i]);
            i++;
        }
        return sb2.toString();
    }

    private static boolean isXamarin(String str) {
        for (String str2 : str.split(Global.NEWLINE)) {
            if (str2.startsWith(XAMARIN_AT)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.dynatrace.android.agent.crash.StacktraceProcessor
    public StacktraceData process() {
        String[] strArrSplit = this.exception.split(Global.NEWLINE);
        if (strArrSplit.length < 1) {
            throw new IllegalArgumentException("no lines");
        }
        if (strArrSplit[0].startsWith(XAMARIN_AT)) {
            throw new IllegalArgumentException("no reason message available");
        }
        int iIndexOf = strArrSplit[0].indexOf(Global.COLON);
        if (iIndexOf >= 0) {
            return new StacktraceData(Utility.truncateString(strArrSplit[0].substring(0, iIndexOf), this.maxLength), generateReason(strArrSplit, this.maxReasonLength), generateStackTrace(strArrSplit), PlatformType.XAMARIN);
        }
        throw new IllegalArgumentException("no exception name available");
    }

    public XamarinStacktraceProcessor(String str, int i, int i4, int i6, int i10) {
        this.exception = str;
        this.maxLines = i;
        this.maxStacktraceSize = i4;
        this.maxReasonLength = i6;
        this.maxLength = i10;
    }
}
