package com.dynatrace.agent.communication.network.datasource;

import com.dynatrace.agent.communication.LocalServerData;
import com.dynatrace.agent.communication.network.model.RetryInfo;
import com.dynatrace.agent.storage.db.EndPointInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class DataRequest {
    private final String body;
    private final EndPointInfo endPointInfo;
    private final boolean isPriority;
    private final RetryInfo retryInfo;
    private final LocalServerData serverData;
    private final Integer serverId;

    public DataRequest(EndPointInfo endPointInfo, String body, boolean z4, LocalServerData serverData, RetryInfo retryInfo, Integer num) {
        j.g(endPointInfo, "endPointInfo");
        j.g(body, "body");
        j.g(serverData, "serverData");
        this.endPointInfo = endPointInfo;
        this.body = body;
        this.isPriority = z4;
        this.serverData = serverData;
        this.retryInfo = retryInfo;
        this.serverId = num;
    }

    public final String getBody() {
        return this.body;
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

    public final boolean isPriority() {
        return this.isPriority;
    }

    public /* synthetic */ DataRequest(EndPointInfo endPointInfo, String str, boolean z4, LocalServerData localServerData, RetryInfo retryInfo, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(endPointInfo, str, z4, localServerData, retryInfo, (i & 32) != 0 ? null : num);
    }
}
