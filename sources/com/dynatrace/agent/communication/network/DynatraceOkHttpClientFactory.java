package com.dynatrace.agent.communication.network;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class DynatraceOkHttpClientFactory {
    public static final DynatraceOkHttpClientFactory INSTANCE = new DynatraceOkHttpClientFactory();

    private DynatraceOkHttpClientFactory() {
    }

    public final OkHttpClient.Builder createOkHttpClientBuilder() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builder.connectTimeout(10L, timeUnit).writeTimeout(15L, timeUnit).readTimeout(15L, timeUnit);
    }
}
