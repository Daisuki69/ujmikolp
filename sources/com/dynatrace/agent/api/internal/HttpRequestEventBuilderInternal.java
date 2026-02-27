package com.dynatrace.agent.api.internal;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.webkit.ProxyConfig;
import cj.C1129o;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.events.error.ErrorEvent;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.ranges.IntRange;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
import zj.C2576A;
import zj.C2578C;
import zj.o;
import zj.q;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpRequestEventBuilderInternal {
    private static final int MAX_REASON_PHRASE_LENGTH = 5000;
    private static final String TC_HINT_INVALID = "invalid_header";
    private static final String TC_HINT_SET = "api_set";
    private static final String TC_HINT_UNUSED = "api_unused";
    private Integer bytesReceived;
    private Integer bytesSent;
    private long duration;
    private boolean hasDroppedCustomProperties;
    private boolean hasDroppedTraceparent;
    private boolean hasNfnValues;
    private final Map<String, Object> rawEventProperties;
    private String reasonPhrase;
    private String requestMethod;
    private Integer statusCode;
    private Throwable throwable;
    private String traceparentHeader;
    private final String url;
    private static final Companion Companion = new Companion(null);
    private static final Set<String> ALLOWED_REQUEST_METHODS = C1129o.C(new String[]{ShareTarget.METHOD_GET, "HEAD", ShareTarget.METHOD_POST, "PUT", "DELETE", "CONNECT", "OPTIONS", "TRACE", "PATCH"});
    private static final o STRICT_HTTP_URL_REGEX = new o("^(https?)://[^\\s/$.?#].[^\\s]*$", q.f21494b);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class HttpRequestEvent {
        private final JSONObject eventProperties;
        private final JSONObject request;

        public HttpRequestEvent(JSONObject request, JSONObject eventProperties) {
            j.g(request, "request");
            j.g(eventProperties, "eventProperties");
            this.request = request;
            this.eventProperties = eventProperties;
        }

        public final JSONObject getEventProperties() {
            return this.eventProperties;
        }

        public final JSONObject getRequest() {
            return this.request;
        }
    }

    public HttpRequestEventBuilderInternal(String url, String requestMethod) {
        j.g(url, "url");
        j.g(requestMethod, "requestMethod");
        this.url = url;
        String upperCase = C2576A.b0(requestMethod).toString().toUpperCase(Locale.ROOT);
        j.f(upperCase, "toUpperCase(...)");
        this.requestMethod = upperCase;
        this.rawEventProperties = new LinkedHashMap();
    }

    private final boolean hasValidMandatoryAttributes() {
        boolean z4;
        if (isInvalidUrl(this.url)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder: dropped event since given URL is malformed: '" + this.url + '\'');
            z4 = false;
        } else {
            z4 = true;
        }
        if (!ALLOWED_REQUEST_METHODS.contains(this.requestMethod)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder: dropped event since given Request Method is invalid: '" + this.requestMethod + '\'');
            z4 = false;
        }
        if (this.duration >= 0) {
            return z4;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder: dropped event since given Duration is negative");
        return false;
    }

    private final boolean isInvalidUrl(String str) {
        return !STRICT_HTTP_URL_REGEX.e(str) || HttpUrl.Companion.parse(str) == null;
    }

    private final void putIfTrue(JSONObject jSONObject, String str, boolean z4) throws JSONException {
        if (z4) {
            jSONObject.put(str, z4);
        }
    }

    private final JSONObject putIfValueNotNull(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            return jSONObject.put(str, obj);
        }
        return null;
    }

    private final void putSafeEventProperty(JSONObject jSONObject, String str, Object obj) {
        if (!z.w(str, 2, EventKeys.EVENT_PROPERTIES.NAMESPACE, false)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder: dropped event property '" + str + "' as it did not start with prefix 'event_properties.'");
            this.hasDroppedCustomProperties = true;
            return;
        }
        try {
            if (obj == null) {
                jSONObject.put(str, JSONObject.NULL);
                return;
            }
            if (!(obj instanceof Double)) {
                jSONObject.put(str, obj);
                return;
            }
            if (!Double.isNaN(((Number) obj).doubleValue()) && !Double.isInfinite(((Number) obj).doubleValue())) {
                jSONObject.put(str, ((Number) obj).doubleValue());
                return;
            }
            jSONObject.put(str, JSONObject.NULL);
            this.hasNfnValues = true;
            Unit unit = Unit.f18162a;
        } catch (JSONException unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder: dropped event property '" + str + "' as it could not be parsed into JSON");
            this.hasDroppedCustomProperties = true;
        }
    }

    private final void putTraceparentInformation(JSONObject jSONObject, TraceparentHeader traceparentHeader, boolean z4) throws JSONException {
        if (traceparentHeader != null) {
            jSONObject.put(EventKeys.TRACE_ID, traceparentHeader.getTraceId());
            jSONObject.put(EventKeys.SPAN_ID, traceparentHeader.getParentId());
            jSONObject.put(EventKeys.REQUEST.TRACE_CONTEXT_HINT, TC_HINT_SET);
        } else if (z4) {
            jSONObject.put(EventKeys.REQUEST.TRACE_CONTEXT_HINT, TC_HINT_INVALID);
        } else {
            jSONObject.put(EventKeys.REQUEST.TRACE_CONTEXT_HINT, TC_HINT_UNUSED);
        }
    }

    private final void sanitizeStatusCodeAndReason() {
        if (this.statusCode == null && this.throwable == null) {
            this.statusCode = 0;
        }
        Integer num = this.statusCode;
        if (num != null && num.intValue() < 0) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder: overriding invalid Status Code with 0");
            this.statusCode = 0;
            this.hasDroppedCustomProperties = true;
        }
        String str = this.reasonPhrase;
        if (str == null || str.length() <= 5000) {
            return;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder: trimming too long Reason Phrase to a length of 5000");
        this.reasonPhrase = C2578C.e0(5000, str);
    }

    private final void sanitizeTransmittedBytes() {
        Integer num = this.bytesSent;
        if (num != null && num.intValue() < 0) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder: dropping invalid value for Bytes Sent: '" + this.bytesSent + '\'');
            this.bytesSent = null;
            this.hasDroppedCustomProperties = true;
        }
        Integer num2 = this.bytesReceived;
        if (num2 == null || num2.intValue() >= 0) {
            return;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder: dropping invalid value for Bytes Received: '" + this.bytesReceived + '\'');
        this.bytesReceived = null;
        this.hasDroppedCustomProperties = true;
    }

    public final HttpRequestEventBuilderInternal addEventProperty(String key, String str) {
        j.g(key, "key");
        this.rawEventProperties.put(key, str);
        return this;
    }

    public final HttpRequestEvent build() throws JSONException {
        TraceparentHeader traceparentHeader = null;
        if (!hasValidMandatoryAttributes()) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder dropped invalid event");
            return null;
        }
        sanitizeStatusCodeAndReason();
        sanitizeTransmittedBytes();
        String str = this.traceparentHeader;
        boolean z4 = true;
        if (str != null && (traceparentHeader = TraceparentHeader.Companion.parse(str)) == null) {
            this.hasDroppedTraceparent = true;
        }
        IntRange intRange = new IntRange(YTAGReflectLiveCheckInterface.LightLiveCheckResult.INIT_ERROR, 599, 1);
        Integer num = this.statusCode;
        boolean z5 = (num != null && intRange.a(num.intValue())) || this.throwable != null;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : this.rawEventProperties.entrySet()) {
            putSafeEventProperty(jSONObject, entry.getKey(), entry.getValue());
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(EventKeys.URL.FULL, this.url);
        jSONObject2.put(EventKeys.NETWORK.PROTOCOL_NAME, ProxyConfig.MATCH_HTTP);
        jSONObject2.put(EventKeys.HTTP.REQUEST_METHOD, this.requestMethod);
        jSONObject2.put("duration", this.duration);
        putIfValueNotNull(jSONObject2, EventKeys.HTTP.RESPONSE_STATUS_CODE, this.statusCode);
        putIfValueNotNull(jSONObject2, EventKeys.HTTP.RESPONSE_REASON_PHRASE, this.reasonPhrase);
        putIfValueNotNull(jSONObject2, EventKeys.REQUEST.BYTES_SENT, this.bytesSent);
        putIfValueNotNull(jSONObject2, EventKeys.REQUEST.BYTES_RECEIVED, this.bytesReceived);
        jSONObject2.put(EventKeys.Characteristics.HAS_REQUEST, true);
        jSONObject2.put(EventKeys.Characteristics.IS_API_REPORTED, true);
        putIfTrue(jSONObject2, EventKeys.Characteristics.HAS_FAILED_REQUEST, z5);
        putIfTrue(jSONObject2, EventKeys.Characteristics.HAS_ERROR, z5);
        if (this.throwable != null) {
            jSONObject2.put(EventKeys.Characteristics.HAS_EXCEPTION, true);
            ErrorEvent.ExceptionInfo throwable = ErrorEvent.parseThrowable(this.throwable);
            putIfValueNotNull(jSONObject2, EventKeys.EXCEPTION.STACK_TRACE, throwable.getStacktrace());
            putIfValueNotNull(jSONObject2, EventKeys.EXCEPTION.TYPE, throwable.getClassName());
            putIfValueNotNull(jSONObject2, EventKeys.EXCEPTION.MESSAGE, throwable.getMessage());
        }
        putTraceparentInformation(jSONObject2, traceparentHeader, this.hasDroppedTraceparent);
        if (!this.hasDroppedCustomProperties && !this.hasDroppedTraceparent) {
            z4 = false;
        }
        putIfTrue(jSONObject2, EventKeys.DT.SUPPORT.API_HAS_DROPPED_CUSTOM_PROPERTIES, z4);
        putIfTrue(jSONObject2, EventKeys.DT.SUPPORT.HAS_NFN_VALUES, this.hasNfnValues);
        return new HttpRequestEvent(jSONObject2, jSONObject);
    }

    public final HttpRequestEventBuilderInternal withBytesReceived(int i) {
        this.bytesReceived = Integer.valueOf(i);
        return this;
    }

    public final HttpRequestEventBuilderInternal withBytesSent(int i) {
        this.bytesSent = Integer.valueOf(i);
        return this;
    }

    public final HttpRequestEventBuilderInternal withDuration(long j) {
        this.duration = j;
        return this;
    }

    public final HttpRequestEventBuilderInternal withReasonPhrase(String str) {
        this.reasonPhrase = str;
        return this;
    }

    public final HttpRequestEventBuilderInternal withStatusCode(int i) {
        this.statusCode = Integer.valueOf(i);
        return this;
    }

    public final HttpRequestEventBuilderInternal withThrowable(Throwable throwable) {
        j.g(throwable, "throwable");
        this.throwable = throwable;
        return this;
    }

    public final HttpRequestEventBuilderInternal withTraceparentHeader(String traceparentHeader) {
        j.g(traceparentHeader, "traceparentHeader");
        this.traceparentHeader = traceparentHeader;
        return this;
    }

    public final HttpRequestEventBuilderInternal addEventProperty(String key, int i) {
        j.g(key, "key");
        this.rawEventProperties.put(key, Integer.valueOf(i));
        return this;
    }

    public final HttpRequestEventBuilderInternal addEventProperty(String key, long j) {
        j.g(key, "key");
        this.rawEventProperties.put(key, Long.valueOf(j));
        return this;
    }

    public final HttpRequestEventBuilderInternal addEventProperty(String key, double d10) {
        j.g(key, "key");
        this.rawEventProperties.put(key, Double.valueOf(d10));
        return this;
    }

    public final HttpRequestEventBuilderInternal addEventProperty(String key, boolean z4) {
        j.g(key, "key");
        this.rawEventProperties.put(key, Boolean.valueOf(z4));
        return this;
    }
}
