package com.dynatrace.android.agent.mixed;

import androidx.webkit.ProxyConfig;
import com.dynatrace.agent.events.enrichment.EventKeys;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ManualWebRequestEventGenerator extends BaseWebRequestEventGenerator {
    public ManualWebRequestEventGenerator() {
        super("manual");
    }

    private void handleGeneric(JSONObject jSONObject) throws JSONException {
        jSONObject.put(EventKeys.NETWORK.PROTOCOL_NAME, this.networkProtocolName);
    }

    private void handleHttp(JSONObject jSONObject) throws JSONException {
        jSONObject.put(EventKeys.NETWORK.PROTOCOL_NAME, ProxyConfig.MATCH_HTTP);
        int i = this.statusCode;
        if (i >= 400 && i <= 599) {
            jSONObject.put(EventKeys.HTTP.RESPONSE_STATUS_CODE, i);
            jSONObject.put(EventKeys.Characteristics.HAS_ERROR, true);
            jSONObject.put(EventKeys.Characteristics.HAS_FAILED_REQUEST, true);
            String str = this.reasonPhrase;
            if (str != null) {
                jSONObject.put(EventKeys.HTTP.RESPONSE_REASON_PHRASE, str);
                return;
            }
            return;
        }
        if (i < 0 && this.reasonPhrase != null) {
            jSONObject.put(EventKeys.Characteristics.HAS_ERROR, true);
            jSONObject.put(EventKeys.Characteristics.HAS_FAILED_REQUEST, true);
            jSONObject.put(EventKeys.Characteristics.HAS_EXCEPTION, true);
            jSONObject.put(EventKeys.EXCEPTION.MESSAGE, this.reasonPhrase);
            return;
        }
        if (i < 0) {
            jSONObject.put(EventKeys.HTTP.RESPONSE_STATUS_CODE, 0);
            jSONObject.put(EventKeys.HTTP.RESPONSE_REASON_PHRASE, "");
            return;
        }
        jSONObject.put(EventKeys.HTTP.RESPONSE_STATUS_CODE, i);
        String str2 = this.reasonPhrase;
        if (str2 != null) {
            jSONObject.put(EventKeys.HTTP.RESPONSE_REASON_PHRASE, str2);
        }
    }

    private void handleWs(JSONObject jSONObject) throws JSONException {
        jSONObject.put(EventKeys.NETWORK.PROTOCOL_NAME, "ws");
        int i = this.statusCode;
        if (i == 1000 || i == 1001) {
            jSONObject.put(EventKeys.WEBSOCKET.CONNECTION_STATUS_CODE, i);
            return;
        }
        if (i < 1002 || i > 4999) {
            jSONObject.put(EventKeys.Characteristics.HAS_ERROR, true);
            jSONObject.put(EventKeys.Characteristics.HAS_FAILED_REQUEST, true);
        } else {
            jSONObject.put(EventKeys.WEBSOCKET.CONNECTION_STATUS_CODE, i);
            jSONObject.put(EventKeys.Characteristics.HAS_ERROR, true);
            jSONObject.put(EventKeys.Characteristics.HAS_FAILED_REQUEST, true);
        }
    }

    @Override // com.dynatrace.android.agent.mixed.BaseWebRequestEventGenerator
    public JSONObject generateRumRequestEvent() {
        return super.generateRumRequestEvent();
    }

    @Override // com.dynatrace.android.agent.mixed.BaseWebRequestEventGenerator
    public JSONObject populateJson(JSONObject jSONObject) throws JSONException {
        if (this.networkProtocolName.startsWith(ProxyConfig.MATCH_HTTP)) {
            handleHttp(jSONObject);
            return jSONObject;
        }
        if (this.networkProtocolName.startsWith("ws")) {
            handleWs(jSONObject);
            return jSONObject;
        }
        handleGeneric(jSONObject);
        return jSONObject;
    }
}
