package com.dynatrace.agent.communication;

import com.dynatrace.agent.communication.network.response.ResponseResult;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.agent.storage.db.EventRecord;
import gj.InterfaceC1526a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ResponseProcessor {
    /* JADX INFO: renamed from: ageOfLastConfig-UwyO8pc, reason: not valid java name */
    long mo156ageOfLastConfigUwyO8pc();

    Object handleConfigResponse(ResponseResult responseResult, EndPointInfo endPointInfo, RetryManager retryManager, InterfaceC1526a<? super CommunicationContext> interfaceC1526a);

    Object handleDataResponse(ResponseResult responseResult, EndPointInfo endPointInfo, List<EventRecord> list, RetryManager retryManager, boolean z4, InterfaceC1526a<? super CommunicationContext> interfaceC1526a);
}
