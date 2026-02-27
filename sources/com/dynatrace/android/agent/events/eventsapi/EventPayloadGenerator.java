package com.dynatrace.android.agent.events.eventsapi;

import We.s;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class EventPayloadGenerator {
    public static final String DT_OVERRIDDEN_KEYS = "dt.overridden_keys";
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "EventPayloadGenerator");
    private static final int PAYLOAD_SIZE_LIMIT = 16384;
    private final AttributeFilter copyFilter;

    public EventPayloadGenerator(AttributeFilter attributeFilter) {
        this.copyFilter = attributeFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0063 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject enrichPayload(java.util.Set<com.dynatrace.android.agent.events.eventsapi.EnrichmentAttribute> r7, org.json.JSONObject r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.events.eventsapi.EventPayloadGenerator.enrichPayload(java.util.Set, org.json.JSONObject, boolean):org.json.JSONObject");
    }

    public String generatePayload(Set<EnrichmentAttribute> set, JSONObject jSONObject, boolean z4) {
        String string = enrichPayload(set, shallowJsonCopy(jSONObject), z4).toString();
        if (string == null) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "JSON serialization failed.");
            }
            return null;
        }
        if (string.length() <= 16384) {
            return string;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "Event payload size (" + string.length() + " bytes) exceeds the size limit of 16384 bytes");
        }
        return null;
    }

    public JSONObject shallowJsonCopy(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                if (this.copyFilter.keepAttribute(next)) {
                    jSONObject2.put(next, jSONObject.get(next));
                } else if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, "Found reserved attribute \"" + next + "\" in the JSON payload. This attribute is removed from the JSON payload.");
                }
            } catch (JSONException e) {
                if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, "Unexpected JSON error", e);
                }
            }
        }
        return jSONObject2;
    }
}
