package com.dynatrace.android.agent.mixed;

import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.webkit.ProxyConfig;
import com.dynatrace.agent.events.enrichment.EventKeys;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AutoWebRequestEventGenerator extends BaseWebRequestEventGenerator {
    private Throwable exception;
    private String httpRequestMethod;
    private Map<String, List<String>> requestHeaders;
    private Map<String, List<String>> responseHeaders;
    private WebRequestTraceContext traceContext;

    public AutoWebRequestEventGenerator() {
        super(TtmlNode.TEXT_EMPHASIS_AUTO);
        this.requestHeaders = null;
        this.responseHeaders = null;
        this.traceContext = null;
    }

    private void handleHttp(JSONObject jSONObject) throws JSONException {
        jSONObject.put(EventKeys.NETWORK.PROTOCOL_NAME, ProxyConfig.MATCH_HTTP);
        jSONObject.put(EventKeys.HTTP.REQUEST_METHOD, this.httpRequestMethod);
        int i = this.statusCode;
        if (i > 0) {
            jSONObject.put(EventKeys.HTTP.RESPONSE_STATUS_CODE, i);
        }
        int i4 = this.statusCode;
        if (i4 >= 400 && i4 <= 599) {
            jSONObject.put(EventKeys.Characteristics.HAS_ERROR, true);
            jSONObject.put(EventKeys.Characteristics.HAS_FAILED_REQUEST, true);
        }
        String str = this.reasonPhrase;
        if (str != null) {
            jSONObject.put(EventKeys.HTTP.RESPONSE_REASON_PHRASE, str);
        }
        Map<String, List<String>> map = this.responseHeaders;
        if (map != null) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    List<String> value = entry.getValue();
                    String str2 = "http.response.header." + key.toLowerCase();
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<T> it = value.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb2.append((CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            } else {
                                sb2.append((CharSequence) ", ");
                            }
                        }
                    }
                    jSONObject.put(str2, sb2.toString());
                }
            }
        }
        Map<String, List<String>> map2 = this.requestHeaders;
        if (map2 != null) {
            for (Map.Entry<String, List<String>> entry2 : map2.entrySet()) {
                String key2 = entry2.getKey();
                if (key2 != null) {
                    List<String> value2 = entry2.getValue();
                    String str3 = "http.request.header." + key2.toLowerCase();
                    StringBuilder sb3 = new StringBuilder();
                    Iterator<T> it2 = value2.iterator();
                    if (it2.hasNext()) {
                        while (true) {
                            sb3.append((CharSequence) it2.next());
                            if (!it2.hasNext()) {
                                break;
                            } else {
                                sb3.append((CharSequence) ", ");
                            }
                        }
                    }
                    jSONObject.put(str3, sb3.toString());
                }
            }
        }
    }

    @Override // com.dynatrace.android.agent.mixed.BaseWebRequestEventGenerator
    public JSONObject generateRumRequestEvent() {
        return super.generateRumRequestEvent();
    }

    @Override // com.dynatrace.android.agent.mixed.BaseWebRequestEventGenerator
    public JSONObject populateJson(JSONObject jSONObject) throws JSONException {
        if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(this.networkProtocolName) || ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(this.networkProtocolName)) {
            handleHttp(jSONObject);
        } else {
            jSONObject.put(EventKeys.NETWORK.PROTOCOL_NAME, this.networkProtocolName);
        }
        if (this.exception != null) {
            jSONObject.put(EventKeys.Characteristics.HAS_EXCEPTION, true);
            StringWriter stringWriter = new StringWriter();
            this.exception.printStackTrace(new PrintWriter(stringWriter));
            jSONObject.put(EventKeys.EXCEPTION.STACK_TRACE, stringWriter.toString());
            jSONObject.put(EventKeys.EXCEPTION.TYPE, this.exception.getClass().getName());
            jSONObject.put(EventKeys.EXCEPTION.MESSAGE, this.exception.getMessage());
            jSONObject.put(EventKeys.Characteristics.HAS_ERROR, true);
            jSONObject.put(EventKeys.Characteristics.HAS_FAILED_REQUEST, true);
        }
        WebRequestTraceContext webRequestTraceContext = this.traceContext;
        if (webRequestTraceContext != null) {
            jSONObject.put(EventKeys.TRACE_ID, webRequestTraceContext.getTraceId());
            jSONObject.put(EventKeys.SPAN_ID, this.traceContext.getSpanId());
        }
        return jSONObject;
    }

    public void setException(Throwable th2) {
        this.exception = th2;
    }

    public void setHttpRequestHeaders(Map<String, List<String>> map) {
        this.requestHeaders = map;
    }

    public void setHttpRequestMethod(String str) {
        this.httpRequestMethod = str;
    }

    public void setHttpResponseHeaders(Map<String, List<String>> map) {
        this.responseHeaders = map;
    }

    public void setWebRequestTraceContext(WebRequestTraceContext webRequestTraceContext) {
        this.traceContext = webRequestTraceContext;
    }
}
