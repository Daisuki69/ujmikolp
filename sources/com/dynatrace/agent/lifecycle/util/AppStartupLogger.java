package com.dynatrace.agent.lifecycle.util;

import com.dynatrace.agent.lifecycle.model.AppStartupPhase;
import com.dynatrace.agent.lifecycle.model.AppStartupType;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class AppStartupLogger {
    private final String toDateFormat(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault());
        Date date = new Date();
        date.setTime(j);
        String str = simpleDateFormat.format(date);
        j.f(str, "format(...)");
        return str;
    }

    public final void logApplicationStartup(AppStartupType startupType, long j, long j6) {
        j.g(startupType, "startupType");
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "App startup type " + startupType.name() + " duration: " + (j6 - j) + " ms");
    }

    public final void logApplicationStartupBegin(AppStartupType startupType, long j) {
        j.g(startupType, "startupType");
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "App startup type " + startupType.name() + " begin at " + toDateFormat(j));
    }

    public final void logApplicationStartupCancel(AppStartupType startupType) {
        j.g(startupType, "startupType");
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "App startup type " + startupType.name() + " was not finished");
    }

    public final void logPhase(AppStartupType startupType, AppStartupPhase startupPhase, long j, long j6) {
        j.g(startupType, "startupType");
        j.g(startupPhase, "startupPhase");
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "App startup type " + startupType.name() + " phase " + startupPhase.name() + " [" + toDateFormat(j) + "] -> [" + toDateFormat(j6) + ']');
    }
}
