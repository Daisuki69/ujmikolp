package com.dynatrace.agent.communication.network.request;

import com.dynatrace.agent.communication.network.datasource.ConfigRequest;
import kotlin.jvm.internal.j;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigRequestFactory {
    private final String version;

    public ConfigRequestFactory(String version) {
        j.g(version, "version");
        this.version = version;
    }

    public final Request createRequest(ConfigRequest configRequest) {
        j.g(configRequest, "configRequest");
        return new Request.Builder().get().url(HttpUrlExtensionsKt.buildWithQueryChecksum(HttpUrlExtensionsKt.addServerIdParameter(HttpUrlExtensionsKt.addRetryQueryParameters(HttpUrlExtensionsKt.addBaseQueryParameters(HttpUrl.Companion.get(configRequest.getEndPointInfo().getUrl()).newBuilder(), configRequest.getEndPointInfo(), this.version, configRequest.getServerData().getConfig().getRevision()), configRequest.getRetryInfo()), configRequest.getServerId()))).build();
    }
}
