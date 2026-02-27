package com.dynatrace.android.agent.crash;

import com.dynatrace.agent.common.InstrumentationFlavor;

/* JADX INFO: loaded from: classes2.dex */
public class StacktraceProcessorFactory {

    @Deprecated
    public static final int ERROR_STACKTRACE_LINES = 10;
    public static final int MAX_REASON_LENGTH = 1000;
    public static final int MAX_STACKTRACE_LENGTH = 128000;
    public static final int STACKTRACE_LINES = Integer.MAX_VALUE;

    public StacktraceProcessor determineCrashProcessor(Throwable th2, InstrumentationFlavor instrumentationFlavor) {
        String strConvertToXamarinOrNull;
        return ((instrumentationFlavor == InstrumentationFlavor.XAMARIN || instrumentationFlavor == InstrumentationFlavor.MAUI) && (strConvertToXamarinOrNull = XamarinStacktraceProcessor.convertToXamarinOrNull(th2)) != null) ? new SafeXamarinStacktraceProcessor(th2, strConvertToXamarinOrNull, Integer.MAX_VALUE) : new JavaStacktraceProcessor(th2, Integer.MAX_VALUE);
    }
}
