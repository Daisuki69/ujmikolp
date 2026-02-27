package com.dynatrace.agent.communication.network.datasource;

import com.dynatrace.agent.communication.LocalServerData;
import com.dynatrace.agent.communication.network.model.RetryInfo;
import com.dynatrace.agent.storage.db.EndPointInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigRequest {
    private final EndPointInfo endPointInfo;
    private final RetryInfo retryInfo;
    private final LocalServerData serverData;
    private final Integer serverId;

    public ConfigRequest(EndPointInfo endPointInfo, LocalServerData serverData, RetryInfo retryInfo, Integer num) {
        j.g(endPointInfo, "endPointInfo");
        j.g(serverData, "serverData");
        this.endPointInfo = endPointInfo;
        this.serverData = serverData;
        this.retryInfo = retryInfo;
        this.serverId = num;
    }

    public final EndPointInfo getEndPointInfo() {
        return this.endPointInfo;
    }

    public final RetryInfo getRetryInfo() {
        return this.retryInfo;
    }

    public final LocalServerData getServerData() {
        return this.serverData;
    }

    public final Integer getServerId() {
        return this.serverId;
    }

    public /* synthetic */ ConfigRequest(EndPointInfo endPointInfo, LocalServerData localServerData, RetryInfo retryInfo, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(endPointInfo, localServerData, retryInfo, (i & 8) != 0 ? null : num);
    }
}
