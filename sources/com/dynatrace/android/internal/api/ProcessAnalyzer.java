package com.dynatrace.android.internal.api;

import android.app.Application;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public class ProcessAnalyzer {
    private static final String DYNATRACE_REPLAY_SERVICE = ":dynatrace_replay_service";

    public String getProcessNameOrNull() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            return (String) Class.forName("android.app.ActivityThread").getMethod("currentProcessName", null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean isInternalProcess() {
        String processNameOrNull = getProcessNameOrNull();
        return processNameOrNull != null && processNameOrNull.contains(DYNATRACE_REPLAY_SERVICE);
    }
}
