package com.dynatrace.android.internal.api;

import We.s;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.SelfMonitoringSegment;
import com.dynatrace.android.agent.conf.AgentMode;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public class SelfMonitoring {
    private static final String TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "SelfMonitoring");

    public static void reportLogEvent(String str, String str2) {
        if (str == null || str.isEmpty() || !Dynatrace.getCaptureStatus()) {
            return;
        }
        AdkSettings adkSettings = AdkSettings.getInstance();
        if (adkSettings.getServerConfiguration().isSelfmonitoring() && adkSettings.getConfiguration().mode != AgentMode.APP_MON) {
            Session sessionDetermineActiveSessionForInternalEvent = Session.determineActiveSessionForInternalEvent();
            if (sessionDetermineActiveSessionForInternalEvent.isSelfMonitoringLimitReached()) {
                return;
            }
            int i = adkSettings.serverId;
            if (Global.DEBUG) {
                Utility.zlogD(TAG, s.l("Handle self monitoring event name=\"", str, "\" payload=\"", str2, "\""));
            }
            SelfMonitoringSegment selfMonitoringSegment = new SelfMonitoringSegment(str, str2, sessionDetermineActiveSessionForInternalEvent, i);
            Core.getCalloutTable().addOtherEvent();
            Core.saveSegment(selfMonitoringSegment);
            sessionDetermineActiveSessionForInternalEvent.addSelfMonitoringEvent();
        }
    }
}
