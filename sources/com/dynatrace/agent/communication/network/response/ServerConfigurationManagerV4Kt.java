package com.dynatrace.agent.communication.network.response;

import com.dynatrace.agent.communication.api.AgentState;
import io.flutter.plugins.firebase.crashlytics.Constants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ServerConfigurationManagerV4Kt {
    private static final String[] STATUS_VALUES = {"OK", "ERROR"};

    /* JADX INFO: Access modifiers changed from: private */
    public static final AgentState getAgentStateOrNull(JSONObject jSONObject, String str) {
        String stringOrNull = JsonExtensionKt.getStringOrNull(jSONObject, str);
        if (stringOrNull == null) {
            return null;
        }
        int iHashCode = stringOrNull.hashCode();
        if (iHashCode == -1609594047) {
            if (stringOrNull.equals(Constants.ENABLED)) {
                return new AgentState.Enabled(false);
            }
            return null;
        }
        if (iHashCode == 270940796) {
            if (stringOrNull.equals("disabled")) {
                return AgentState.Disabled.INSTANCE;
            }
            return null;
        }
        if (iHashCode == 809657403 && stringOrNull.equals("priority=high")) {
            return new AgentState.Enabled(true);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getIntOrClosest(JSONObject jSONObject, String str, int i, int i4, int i6) {
        Integer intOrNull = JsonExtensionKt.getIntOrNull(jSONObject, str);
        return intOrNull != null ? Math.max(Math.min(intOrNull.intValue(), i4), i) : i6;
    }

    private static /* synthetic */ void getSTATUS_VALUES$annotations() {
    }
}
