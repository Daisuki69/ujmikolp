package com.dynatrace.agent.lifecycle;

import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.lifecycle.model.VisibilityStatus;
import com.dynatrace.agent.metrics.SessionInformationMetrics;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class VisibilityManagerImpl implements VisibilityManager {
    private final Set<Integer> appActivitiesIds;
    private boolean changingConfiguration;
    private final RumEventDispatcher rumEventDispatcher;
    private final SessionInformationProvider sessionInformationProvider;
    private final TimeProvider timeProvider;
    private VisibilityStatus visibilityStatus;

    public VisibilityManagerImpl(TimeProvider timeProvider, RumEventDispatcher rumEventDispatcher, SessionInformationProvider sessionInformationProvider) {
        j.g(timeProvider, "timeProvider");
        j.g(rumEventDispatcher, "rumEventDispatcher");
        j.g(sessionInformationProvider, "sessionInformationProvider");
        this.timeProvider = timeProvider;
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
        this.appActivitiesIds = new LinkedHashSet();
        this.visibilityStatus = VisibilityStatus.BACKGROUND;
    }

    private final void track(VisibilityStatus visibilityStatus) throws JSONException {
        SessionInformationMetrics sessionInformationMetricsCollectSessionInfo = this.sessionInformationProvider.collectSessionInfo();
        if (!sessionInformationMetricsCollectSessionInfo.isGrailEventsCanBeCaptured()) {
            Utility.devLog(OneAgentLoggingKt.TAG_LIFECYCLE, "visibility event cannot be tracked, isGrailEventsCanBeCaptured == false");
            return;
        }
        if (!sessionInformationMetricsCollectSessionInfo.getSessionActive()) {
            Utility.devLog(OneAgentLoggingKt.TAG_LIFECYCLE, "visibility event cannot be tracked, session is disabled");
            return;
        }
        if (!sessionInformationMetricsCollectSessionInfo.getEventReporting()) {
            Utility.devLog(OneAgentLoggingKt.TAG_LIFECYCLE, "visibility event shouldn't be collected, because of data collection is disabled");
            return;
        }
        RumEventDispatcher rumEventDispatcher = this.rumEventDispatcher;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(EventKeys.Characteristics.HAS_VISIBILITY_CHANGE, true);
        jSONObject.put(EventKeys.VISIBILITY.STATE, visibilityStatus.getKeyValue());
        rumEventDispatcher.dispatchEvent(jSONObject, this.timeProvider.millisSinceEpoch(), 0L, sessionInformationMetricsCollectSessionInfo, false, null);
    }

    @Override // com.dynatrace.agent.lifecycle.VisibilityManager
    public VisibilityStatus getVisibilityStatus() {
        return this.visibilityStatus;
    }

    @Override // com.dynatrace.agent.lifecycle.VisibilityManager
    public void onActivityPaused(int i) {
        this.appActivitiesIds.add(Integer.valueOf(i));
    }

    @Override // com.dynatrace.agent.lifecycle.VisibilityManager
    public void onActivityStarted(int i) throws JSONException {
        this.appActivitiesIds.add(Integer.valueOf(i));
        if (this.appActivitiesIds.size() != 1 || this.changingConfiguration) {
            return;
        }
        VisibilityStatus visibilityStatus = VisibilityStatus.FOREGROUND;
        this.visibilityStatus = visibilityStatus;
        track(visibilityStatus);
    }

    @Override // com.dynatrace.agent.lifecycle.VisibilityManager
    public void onActivityStopped(int i, boolean z4) throws JSONException {
        this.changingConfiguration = z4;
        this.appActivitiesIds.remove(Integer.valueOf(i));
        if (!this.appActivitiesIds.isEmpty() || this.changingConfiguration) {
            return;
        }
        VisibilityStatus visibilityStatus = VisibilityStatus.BACKGROUND;
        this.visibilityStatus = visibilityStatus;
        track(visibilityStatus);
    }
}
