package com.dynatrace.agent;

import com.dynatrace.agent.events.EventModifier;
import com.dynatrace.agent.metrics.SessionInformationMetrics;
import com.dynatrace.agent.storage.preference.MetricsData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface RumEventDispatcher {
    boolean addEventModifier(EventModifier eventModifier);

    void dispatchEvent(JSONObject jSONObject, long j, long j6, SessionInformationMetrics sessionInformationMetrics, boolean z4, Object[] objArr);

    void dispatchEvent(JSONObject jSONObject, long j, SessionInformationMetrics sessionInformationMetrics, MetricsData metricsData);

    void dispatchEvent(JSONObject jSONObject, SessionInformationMetrics sessionInformationMetrics, Object[] objArr);

    void dispatchEventWithRestrictions(JSONObject jSONObject, SessionInformationMetrics sessionInformationMetrics, Object[] objArr);

    void dispatchEventWithRestrictions(JSONObject jSONObject, JSONObject jSONObject2, SessionInformationMetrics sessionInformationMetrics, Object[] objArr);

    void dispatchSessionPropertiesWithRestrictions(JSONObject jSONObject, SessionInformationMetrics sessionInformationMetrics);

    boolean removeEventModifier(EventModifier eventModifier);
}
