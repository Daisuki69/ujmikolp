package com.dynatrace.agent.userinteraction.util;

import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.metrics.SessionInformationMetrics;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import kotlin.jvm.internal.j;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class UserInteractionTracker {
    private final RumEventDispatcher rumEventDispatcher;
    private final SessionInformationProvider sessionInformationProvider;
    private final TimeProvider timeProvider;

    public UserInteractionTracker(RumEventDispatcher rumEventDispatcher, SessionInformationProvider sessionInformationProvider, TimeProvider timeProvider) {
        j.g(rumEventDispatcher, "rumEventDispatcher");
        j.g(sessionInformationProvider, "sessionInformationProvider");
        j.g(timeProvider, "timeProvider");
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
        this.timeProvider = timeProvider;
    }

    public final void track$com_dynatrace_agent_release(JSONObject userInteractionJson) {
        j.g(userInteractionJson, "userInteractionJson");
        SessionInformationMetrics sessionInformationMetricsCollectSessionInfo = this.sessionInformationProvider.collectSessionInfo();
        if (!sessionInformationMetricsCollectSessionInfo.isGrailEventsCanBeCaptured()) {
            Utility.devLog(OneAgentLoggingKt.TAG_USER_INTERACTION, "User Interaction cannot be tracked, isGrailEventsCanBeCaptured == false");
            return;
        }
        if (!sessionInformationMetricsCollectSessionInfo.getSessionActive()) {
            Utility.devLog(OneAgentLoggingKt.TAG_USER_INTERACTION, "User Interaction cannot be tracked, session is disabled");
        } else if (sessionInformationMetricsCollectSessionInfo.getEventReporting()) {
            this.rumEventDispatcher.dispatchEvent(userInteractionJson, this.timeProvider.millisSinceEpoch(), 0L, sessionInformationMetricsCollectSessionInfo, false, null);
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_USER_INTERACTION, "User Interaction event shouldn't be collected, because of data collection is disabled");
        }
    }
}
