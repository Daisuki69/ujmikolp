package com.dynatrace.agent.api;

import com.dynatrace.agent.OneAgentEventDispatcher;
import com.dynatrace.agent.api.internal.HttpRequestEventBuilderInternal;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.metrics.SessionInformationMetrics;
import com.dynatrace.agent.view.ViewContextManager;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class OneAgentFacade implements ViewContextApi {
    private final OneAgentEventDispatcher eventDispatcher;
    private final SessionInformationProvider sessionInformationProvider;
    private final ViewContextManager viewContextManager;

    public OneAgentFacade(SessionInformationProvider sessionInformationProvider, ViewContextManager viewContextManager, OneAgentEventDispatcher eventDispatcher) {
        j.g(sessionInformationProvider, "sessionInformationProvider");
        j.g(viewContextManager, "viewContextManager");
        j.g(eventDispatcher, "eventDispatcher");
        this.sessionInformationProvider = sessionInformationProvider;
        this.viewContextManager = viewContextManager;
        this.eventDispatcher = eventDispatcher;
    }

    private final boolean isActiveGrailSession(SessionInformationMetrics sessionInformationMetrics) {
        return sessionInformationMetrics.isGrailEventsCanBeCaptured() && sessionInformationMetrics.getSessionActive();
    }

    public final void sendHttpRequestEvent(HttpRequestEventBuilder httpRequestEventBuilder) {
        j.g(httpRequestEventBuilder, "httpRequestEventBuilder");
        SessionInformationMetrics sessionInformationMetricsCollectSessionInfo = this.sessionInformationProvider.collectSessionInfo();
        if (!isActiveGrailSession(sessionInformationMetricsCollectSessionInfo) || !sessionInformationMetricsCollectSessionInfo.getEventReporting()) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "sendHttpRequestEvent: event cannot be sent on this session, sessionInfo: " + sessionInformationMetricsCollectSessionInfo);
            return;
        }
        HttpRequestEventBuilderInternal.HttpRequestEvent httpRequestEventBuild = httpRequestEventBuilder.build();
        if (httpRequestEventBuild != null) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "sendHttpRequestEvent with request: " + httpRequestEventBuild.getRequest() + " and properties: " + httpRequestEventBuild.getEventProperties());
            this.eventDispatcher.dispatchEventWithRestrictions(httpRequestEventBuild.getEventProperties(), httpRequestEventBuild.getRequest(), sessionInformationMetricsCollectSessionInfo, null);
        }
    }

    @Override // com.dynatrace.agent.api.ViewContextApi
    public void startView(String str) {
        SessionInformationMetrics sessionInformationMetricsCollectSessionInfo = this.sessionInformationProvider.collectSessionInfo();
        if (isActiveGrailSession(sessionInformationMetricsCollectSessionInfo) && str != null && str.length() != 0) {
            this.viewContextManager.storeContext(str);
            return;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_VIEW, "start view can't be executed, sessionInfo: " + sessionInformationMetricsCollectSessionInfo + " name: " + str);
    }

    @Override // com.dynatrace.agent.api.ViewContextApi
    public void stopView() {
        SessionInformationMetrics sessionInformationMetricsCollectSessionInfo = this.sessionInformationProvider.collectSessionInfo();
        if (isActiveGrailSession(sessionInformationMetricsCollectSessionInfo)) {
            this.viewContextManager.clearContext();
            return;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_VIEW, "stop view can't be executed, sessionInfo: " + sessionInformationMetricsCollectSessionInfo);
    }
}
