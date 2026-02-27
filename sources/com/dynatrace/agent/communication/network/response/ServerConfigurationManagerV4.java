package com.dynatrace.agent.communication.network.response;

import cj.C1112C;
import cj.C1129o;
import cj.I;
import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.agent.storage.preference.ServerConfigurationV4;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public final class ServerConfigurationManagerV4 {
    private static final Companion Companion = new Companion(null);
    private static final String KEY_APP_CONFIG = "appConfig";
    private static final String KEY_APP_CONFIG_APP_ID = "applicationId";
    private static final String KEY_APP_CONFIG_CAPTURE = "capture";
    private static final String KEY_DYNAMIC_CONFIG = "dynamicConfig";
    private static final String KEY_DYNAMIC_CONFIG_STATE = "state";
    private static final String KEY_ENVIRONMENT_CONFIG = "environmentConfig";
    private static final String KEY_MAX_BEACON_SIZE_KIB = "maxBeaconSizeKib";
    private static final String KEY_MAX_EVENT_SIZE_KIB = "maxEventSizeKib";
    private static final String KEY_REVISION = "revision";
    private static final String KEY_STATUS = "status";

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final int calculateMaxBeaconSizeKib(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectHasAppOrTenantSettings = hasAppOrTenantSettings(KEY_MAX_BEACON_SIZE_KIB, jSONObject, jSONObject2);
        if (jSONObjectHasAppOrTenantSettings != null) {
            return ServerConfigurationManagerV4Kt.getIntOrClosest(jSONObjectHasAppOrTenantSettings, KEY_MAX_BEACON_SIZE_KIB, 256, 10240, 1024);
        }
        return 1024;
    }

    private final int calculateMaxEventSizeKib(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectHasAppOrTenantSettings = hasAppOrTenantSettings(KEY_MAX_EVENT_SIZE_KIB, jSONObject, jSONObject2);
        if (jSONObjectHasAppOrTenantSettings != null) {
            return ServerConfigurationManagerV4Kt.getIntOrClosest(jSONObjectHasAppOrTenantSettings, KEY_MAX_EVENT_SIZE_KIB, 128, 1024, 256);
        }
        return 256;
    }

    private final JSONObject hasAppOrTenantSettings(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2.has(str)) {
            return jSONObject2;
        }
        if (jSONObject.has(str)) {
            return jSONObject;
        }
        return null;
    }

    public final ParsedResponse parseResponseOrNull$com_dynatrace_agent_release(long j, String appId, String json) {
        List arrayList;
        j.g(appId, "appId");
        j.g(json, "json");
        try {
            Object objNextValue = new JSONTokener(json).nextValue();
            j.e(objNextValue, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject = (JSONObject) objNextValue;
            if (!C1129o.p(ServerConfigurationManagerV4Kt.STATUS_VALUES, JsonExtensionKt.getStringOrNull(jSONObject, "status"))) {
                Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config parsing error: unknown status value");
                return null;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(KEY_DYNAMIC_CONFIG);
            AgentState agentStateOrNull = jSONObjectOptJSONObject != null ? ServerConfigurationManagerV4Kt.getAgentStateOrNull(jSONObjectOptJSONObject, KEY_DYNAMIC_CONFIG_STATE) : null;
            if (agentStateOrNull == null) {
                Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config parsing error: unknown agent state");
                return null;
            }
            Long longOrNull = JsonExtensionKt.getLongOrNull(jSONObject, KEY_REVISION);
            if (longOrNull != null && longOrNull.longValue() > j) {
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(KEY_ENVIRONMENT_CONFIG);
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(KEY_APP_CONFIG);
                if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject3 != null) {
                    if (!appId.equals(JsonExtensionKt.getStringOrNull(jSONObjectOptJSONObject3, KEY_APP_CONFIG_APP_ID))) {
                        Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config parsing error: appId mismatch");
                        return null;
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("userInteractionCapture");
                    if (jSONArrayOptJSONArray != null) {
                        IntRange intRangeF = d.f(0, jSONArrayOptJSONArray.length());
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<Integer> it = intRangeF.iterator();
                        while (it.hasNext()) {
                            String strOptString = jSONArrayOptJSONArray.optString(((I) it).nextInt());
                            if (strOptString != null) {
                                arrayList2.add(strOptString);
                            }
                        }
                        arrayList = new ArrayList();
                        for (Object obj : arrayList2) {
                            if (!C2576A.H((String) obj)) {
                                arrayList.add(obj);
                            }
                        }
                    } else {
                        arrayList = C1112C.f9377a;
                    }
                    return new ParsedResponse(agentStateOrNull, new ServerConfigurationV4(longOrNull.longValue(), calculateMaxBeaconSizeKib(jSONObjectOptJSONObject2, jSONObjectOptJSONObject3), calculateMaxEventSizeKib(jSONObjectOptJSONObject2, jSONObjectOptJSONObject3), jSONObjectOptJSONObject3.optBoolean(KEY_APP_CONFIG_CAPTURE, true), arrayList));
                }
                Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config parsing error: invalid config update");
                return null;
            }
            return new ParsedResponse(agentStateOrNull, null);
        } catch (Exception e) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config parsing error: invalid JSON", e);
            return null;
        }
    }
}
