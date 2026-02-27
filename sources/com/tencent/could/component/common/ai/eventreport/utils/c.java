package com.tencent.could.component.common.ai.eventreport.utils;

import android.text.TextUtils;
import android.util.Log;
import com.tencent.could.component.common.ai.eventreport.api.EventReportConfig;
import com.tencent.could.component.common.ai.eventreport.api.EventReporter;
import com.tencent.could.component.common.ai.eventreport.entry.ErrorInfo;
import com.tencent.could.component.common.ai.eventreport.entry.NetWorkParam;
import com.tencent.could.component.common.ai.net.HttpMethod;
import com.tencent.could.component.common.ai.net.TXCHttp;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f15547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15548b;
    public final /* synthetic */ String c;

    public c(String str, String str2, String str3) {
        this.f15547a = str;
        this.f15548b = str2;
        this.c = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setAction(this.f15547a);
        errorInfo.setStack(this.f15548b);
        errorInfo.setToken(this.c);
        errorInfo.setDeviceInfo(DeviceInfoUtil.createDeviceInfo());
        EventReportConfig eventReportConfig = EventReporter.getInstance().getEventReportConfig();
        errorInfo.setBusiness(eventReportConfig.getBusiness());
        errorInfo.setVersion(eventReportConfig.getSdkVersion());
        errorInfo.setOrigin(eventReportConfig.getOrigin());
        try {
            String jsonString = errorInfo.toJsonString();
            String errorInfoUrl = eventReportConfig.getErrorInfoUrl();
            if (TextUtils.isEmpty(errorInfoUrl)) {
                return;
            }
            TXCHttp.sendRequest(NetWorkParam.NetWorkParamBuilder.newBuilder().setUrl(errorInfoUrl).setGzip(true).setHttpMethod(HttpMethod.POST).setRequestData(jsonString).createNetWorkParam(), new d());
        } catch (JSONException e) {
            Log.e("NetReportUtil", "doReportErrorInfo change error! e: " + e.getLocalizedMessage());
        }
    }
}
