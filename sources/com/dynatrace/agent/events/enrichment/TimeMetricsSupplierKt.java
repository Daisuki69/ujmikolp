package com.dynatrace.agent.events.enrichment;

import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeMetricsSupplierKt {
    private static final boolean hasInvalidNumber(JSONObject jSONObject, String str) throws JSONException {
        if (!jSONObject.has(str)) {
            return false;
        }
        Object obj = jSONObject.get(str);
        return (!(obj instanceof Long) || ((Number) obj).longValue() < 0) && (!(obj instanceof Integer) || ((long) ((Number) obj).intValue()) < 0);
    }

    public static final boolean hasInvalidTimeMetrics(JSONObject jSONObject) {
        j.g(jSONObject, "<this>");
        if (hasInvalidNumber(jSONObject, EventKeys.START_TIME)) {
            Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "the 'start_time' field in the given JSON is not a valid number or type: '" + jSONObject.get(EventKeys.START_TIME) + '\'');
            return true;
        }
        if (!hasInvalidNumber(jSONObject, "duration")) {
            return false;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "the 'duration' field in the given JSON is not a valid number or type: '" + jSONObject.get("duration") + '\'');
        return true;
    }
}
