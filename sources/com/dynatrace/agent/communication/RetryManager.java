package com.dynatrace.agent.communication;

import com.dynatrace.agent.communication.network.model.RetryInfo;
import com.dynatrace.agent.storage.db.EndPointInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class RetryManager {
    private final Map<EndPointInfo, RetryInfo> retryStateByEndpoint = new LinkedHashMap();

    public final void clearRetryState(EndPointInfo endpoint) {
        j.g(endpoint, "endpoint");
        this.retryStateByEndpoint.remove(endpoint);
    }

    public final RetryInfo get(EndPointInfo endpoint) {
        j.g(endpoint, "endpoint");
        return this.retryStateByEndpoint.get(endpoint);
    }

    public final RetryInfo getIncrementedRetryInfo(EndPointInfo endpoint, String reason) {
        j.g(endpoint, "endpoint");
        j.g(reason, "reason");
        RetryInfo retryInfo = this.retryStateByEndpoint.get(endpoint);
        RetryInfo retryInfo2 = new RetryInfo((retryInfo != null ? retryInfo.getCount() : 0) + 1, reason);
        this.retryStateByEndpoint.put(endpoint, retryInfo2);
        return retryInfo2;
    }
}
