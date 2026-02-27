package com.dynatrace.agent.communication.network.datasource;

import com.dynatrace.agent.communication.network.response.ResponseResult;
import gj.InterfaceC1526a;

/* JADX INFO: loaded from: classes2.dex */
public interface NetworkDataSource {
    Object executeConfigRequest(ConfigRequest configRequest, InterfaceC1526a<? super ResponseResult> interfaceC1526a);

    Object executeDataRequest(DataRequest dataRequest, InterfaceC1526a<? super ResponseResult> interfaceC1526a);
}
