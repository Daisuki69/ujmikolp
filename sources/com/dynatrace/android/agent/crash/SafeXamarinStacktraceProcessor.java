package com.dynatrace.android.agent.crash;

import We.s;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
class SafeXamarinStacktraceProcessor implements StacktraceProcessor {
    private static final String TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "SafeXamarinCrashProcessor");
    private final String exception;
    private final int maxLines;
    private final Throwable throwable;

    public SafeXamarinStacktraceProcessor(Throwable th2, String str, int i) {
        this.throwable = th2;
        this.exception = str;
        this.maxLines = i;
    }

    @Override // com.dynatrace.android.agent.crash.StacktraceProcessor
    public StacktraceData process() {
        try {
            return new XamarinStacktraceProcessor(this.exception, this.maxLines).process();
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "invalid Xamarin crash", e);
            }
            return new JavaStacktraceProcessor(this.throwable, this.maxLines).process();
        }
    }
}
