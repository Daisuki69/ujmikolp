package com.dynatrace.agent.api;

import com.dynatrace.agent.api.internal.HttpRequestEventBuilderInternal;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public class HttpRequestEventBuilder {
    private static final String NULL_NOT_ALLOWED_MESSAGE = "Event property with key 'null' is not allowed and thus ignored";
    private final HttpRequestEventBuilderInternal internalBuilder;

    public HttpRequestEventBuilder(String str, String str2) {
        this.internalBuilder = new HttpRequestEventBuilderInternal(str == null ? "" : str, str2 == null ? "" : str2);
    }

    public HttpRequestEventBuilder addEventProperty(String str, String str2) {
        if (str != null) {
            this.internalBuilder.addEventProperty(str, str2);
            return this;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, NULL_NOT_ALLOWED_MESSAGE);
        return this;
    }

    public HttpRequestEventBuilderInternal.HttpRequestEvent build() {
        return this.internalBuilder.build();
    }

    public HttpRequestEventBuilder withBytesReceived(int i) {
        this.internalBuilder.withBytesReceived(i);
        return this;
    }

    public HttpRequestEventBuilder withBytesSent(int i) {
        this.internalBuilder.withBytesSent(i);
        return this;
    }

    public HttpRequestEventBuilder withDuration(long j) {
        this.internalBuilder.withDuration(j);
        return this;
    }

    public HttpRequestEventBuilder withReasonPhrase(String str) {
        this.internalBuilder.withReasonPhrase(str);
        return this;
    }

    public HttpRequestEventBuilder withStatusCode(int i) {
        this.internalBuilder.withStatusCode(i);
        return this;
    }

    public HttpRequestEventBuilder withThrowable(Throwable th2) {
        if (th2 != null) {
            this.internalBuilder.withThrowable(th2);
            return this;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "Passing a Throwable with value 'null' is not allowed and thus ignored");
        return this;
    }

    public HttpRequestEventBuilder withTraceparentHeader(String str) {
        if (str != null) {
            this.internalBuilder.withTraceparentHeader(str);
            return this;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "Traceparent header with value 'null' is not allowed and thus ignored");
        return this;
    }

    public HttpRequestEventBuilder addEventProperty(String str, int i) {
        if (str != null) {
            this.internalBuilder.addEventProperty(str, i);
            return this;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, NULL_NOT_ALLOWED_MESSAGE);
        return this;
    }

    public HttpRequestEventBuilder addEventProperty(String str, long j) {
        if (str != null) {
            this.internalBuilder.addEventProperty(str, j);
            return this;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, NULL_NOT_ALLOWED_MESSAGE);
        return this;
    }

    public HttpRequestEventBuilder addEventProperty(String str, double d10) {
        if (str != null) {
            this.internalBuilder.addEventProperty(str, d10);
            return this;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, NULL_NOT_ALLOWED_MESSAGE);
        return this;
    }

    public HttpRequestEventBuilder addEventProperty(String str, boolean z4) {
        if (str != null) {
            this.internalBuilder.addEventProperty(str, z4);
            return this;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, NULL_NOT_ALLOWED_MESSAGE);
        return this;
    }
}
