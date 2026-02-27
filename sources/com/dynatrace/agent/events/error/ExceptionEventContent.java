package com.dynatrace.agent.events.error;

import kotlin.jvm.internal.j;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ExceptionEventContent {
    private final JSONObject agentJson;
    private final JSONObject customerJson;

    public ExceptionEventContent(JSONObject agentJson, JSONObject customerJson) {
        j.g(agentJson, "agentJson");
        j.g(customerJson, "customerJson");
        this.agentJson = agentJson;
        this.customerJson = customerJson;
    }

    public static /* synthetic */ ExceptionEventContent copy$default(ExceptionEventContent exceptionEventContent, JSONObject jSONObject, JSONObject jSONObject2, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = exceptionEventContent.agentJson;
        }
        if ((i & 2) != 0) {
            jSONObject2 = exceptionEventContent.customerJson;
        }
        return exceptionEventContent.copy(jSONObject, jSONObject2);
    }

    public final JSONObject component1() {
        return this.agentJson;
    }

    public final JSONObject component2() {
        return this.customerJson;
    }

    public final ExceptionEventContent copy(JSONObject agentJson, JSONObject customerJson) {
        j.g(agentJson, "agentJson");
        j.g(customerJson, "customerJson");
        return new ExceptionEventContent(agentJson, customerJson);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExceptionEventContent)) {
            return false;
        }
        ExceptionEventContent exceptionEventContent = (ExceptionEventContent) obj;
        return j.b(this.agentJson, exceptionEventContent.agentJson) && j.b(this.customerJson, exceptionEventContent.customerJson);
    }

    public final JSONObject getAgentJson() {
        return this.agentJson;
    }

    public final JSONObject getCustomerJson() {
        return this.customerJson;
    }

    public int hashCode() {
        return this.customerJson.hashCode() + (this.agentJson.hashCode() * 31);
    }

    public String toString() {
        return "ExceptionEventContent(agentJson=" + this.agentJson + ", customerJson=" + this.customerJson + ')';
    }
}
