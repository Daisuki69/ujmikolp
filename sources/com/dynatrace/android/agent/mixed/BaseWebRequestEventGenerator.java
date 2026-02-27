package com.dynatrace.android.agent.mixed;

import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseWebRequestEventGenerator {
    private final String name;
    protected String networkProtocolName;
    protected String reasonPhrase;
    protected int statusCode = -1;
    protected String url;

    public BaseWebRequestEventGenerator(String str) {
        this.name = str;
    }

    public JSONObject generateRumRequestEvent() {
        String str;
        if (this.url == null || (str = this.networkProtocolName) == null || str.isEmpty()) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, this.name + " generateRumRequestEvent failed for, url: " + this.url + ", networkProtocolName: " + this.networkProtocolName);
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(EventKeys.Characteristics.HAS_REQUEST, true);
            jSONObject.put(EventKeys.URL.FULL, this.url);
            return populateJson(jSONObject);
        } catch (JSONException unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, this.name + " generateRumRequestEvent failed with exception");
            return null;
        }
    }

    public abstract JSONObject populateJson(JSONObject jSONObject) throws JSONException;

    public void setNetworkProtocolName(String str) {
        this.networkProtocolName = str;
    }

    public void setReasonPhrase(String str) {
        this.reasonPhrase = str;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
