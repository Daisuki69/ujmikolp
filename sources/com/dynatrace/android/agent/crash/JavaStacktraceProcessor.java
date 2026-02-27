package com.dynatrace.android.agent.crash;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public class JavaStacktraceProcessor implements StacktraceProcessor {
    private static final String AT = "\tat ";
    private final int maxLength;
    private final int maxLines;
    private final int maxReasonLength;
    private final int maxStacktraceLength;
    private final Throwable throwable;

    public JavaStacktraceProcessor(Throwable th2, int i) {
        this(th2, i, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH, 1000, 250);
    }

    private String generateStackTrace() {
        StringBuilder sb2 = new StringBuilder();
        Throwable cause = this.throwable;
        int length = 0;
        int length2 = 0;
        int i = 0;
        while (true) {
            if (cause == null || length >= this.maxLines || length2 > this.maxStacktraceLength) {
                break;
            }
            if (length > 0) {
                sb2.append("\nCaused by: ");
                length2 += 12;
            }
            String strTrimStackTraceReason = trimStackTraceReason(cause.toString(), i, length > 0);
            String[] strArrSplit = strTrimStackTraceReason.split(Global.NEWLINE);
            if (strArrSplit.length > this.maxLines - length) {
                int i4 = 0;
                while (length < this.maxLines) {
                    if (i4 > 0) {
                        sb2.append(Global.NEWLINE);
                    }
                    sb2.append(strArrSplit[i4]);
                    length2 = sb2.length();
                    length++;
                    i4++;
                }
            } else {
                sb2.append(strTrimStackTraceReason);
                int length3 = sb2.length();
                length += strArrSplit.length;
                int length4 = sb2.length();
                StackTraceElement[] stackTrace = cause.getStackTrace();
                if (stackTrace != null) {
                    int iMin = Math.min(stackTrace.length, this.maxLines - length);
                    i = length3;
                    length2 = length4;
                    int i6 = 0;
                    while (i6 < iMin && length2 < this.maxStacktraceLength) {
                        sb2.append(Global.NEWLINE);
                        sb2.append(AT);
                        sb2.append(stackTrace[i6]);
                        length++;
                        i6++;
                        i = length2;
                        length2 = sb2.length();
                    }
                } else {
                    i = length3;
                    length2 = length4;
                }
                cause = cause.getCause();
            }
        }
        return length2 > this.maxStacktraceLength ? sb2.substring(0, i).trim() : sb2.toString().trim();
    }

    private String trimStackTraceReason(String str, int i, boolean z4) {
        if (str == null) {
            return "";
        }
        int iMin = Math.min(Math.max(0, (this.maxStacktraceLength - i) - (z4 ? 12 : 0)), this.maxReasonLength);
        return str.length() > iMin ? str.substring(0, iMin) : str;
    }

    @Override // com.dynatrace.android.agent.crash.StacktraceProcessor
    public StacktraceData process() {
        return new StacktraceData(Utility.truncateString(this.throwable.getClass().getName(), this.maxLength), Utility.truncateString(this.throwable.toString(), this.maxReasonLength), generateStackTrace(), PlatformType.JAVA);
    }

    public JavaStacktraceProcessor(Throwable th2, int i, int i4, int i6, int i10) {
        this.throwable = th2;
        this.maxLines = i;
        this.maxStacktraceLength = i4;
        this.maxReasonLength = i6;
        this.maxLength = i10;
    }
}
