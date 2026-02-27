package com.dynatrace.agent.communication.preprocessing;

import com.dynatrace.agent.communication.LocalServerData;
import com.dynatrace.agent.communication.RetryManager;
import com.dynatrace.agent.communication.mapper.DbRecordsToRequestBodyMapper;
import com.dynatrace.agent.communication.network.datasource.DataRequest;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ToDataRequestMapper {
    private final DbRecordsToRequestBodyMapper requestBodyMapper;
    private final RetryManager retryManager;

    public ToDataRequestMapper(DbRecordsToRequestBodyMapper requestBodyMapper, RetryManager retryManager) {
        j.g(requestBodyMapper, "requestBodyMapper");
        j.g(retryManager, "retryManager");
        this.requestBodyMapper = requestBodyMapper;
        this.retryManager = retryManager;
    }

    public final DataRequest from(DispatchableData dispatchableData, LocalServerData serverData, Integer num) {
        j.g(dispatchableData, "dispatchableData");
        j.g(serverData, "serverData");
        return new DataRequest(dispatchableData.getEndPoint(), this.requestBodyMapper.map(dispatchableData.getData()), dispatchableData.isPriorityData(), serverData, this.retryManager.get(dispatchableData.getEndPoint()), num);
    }
}
