package com.tencent.could.component.common.ai.net;

import com.tencent.could.component.common.ai.eventreport.entry.NetWorkParam;

/* JADX INFO: loaded from: classes4.dex */
public interface IHttpRequest {
    void cleanExecute();

    void execute();

    NetWorkParam getNetWorkParam();

    void setListener(CallBackListener callBackListener);

    void setNeedIpBackUrl(boolean z4);

    void setNeedIpBackUrls(boolean z4, int i);

    void setNeedUseDeputy(boolean z4);

    void setNetWorkParam(NetWorkParam netWorkParam);
}
