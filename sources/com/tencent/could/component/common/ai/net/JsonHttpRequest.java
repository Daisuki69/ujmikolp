package com.tencent.could.component.common.ai.net;

import com.dynatrace.android.callback.Callback;
import com.tencent.could.component.common.ai.eventreport.entry.NetWorkParam;
import com.tencent.could.component.common.ai.utils.GZipUtils;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes4.dex */
public class JsonHttpRequest implements IHttpRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile CallBackListener f15580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NetWorkParam f15581b;
    public boolean c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15582d = false;
    public boolean e = false;
    public int f = 0;

    public final void a(HttpURLConnection httpURLConnection, NetWorkParam netWorkParam) throws Exception {
        OutputStream outputStream = Callback.getOutputStream(httpURLConnection);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        String requestData = netWorkParam.getRequestData() == null ? null : netWorkParam.getRequestData();
        byte[] bArrCompress = netWorkParam.isGzip() ? GZipUtils.compress(requestData) : requestData.getBytes("UTF-8");
        if (bArrCompress != null) {
            TxNetWorkHelper.getInstance().logDebug("JsonHttpRequest", "start write bytes size: " + bArrCompress.length);
        }
        bufferedOutputStream.write(bArrCompress);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        outputStream.close();
        TxNetWorkHelper.getInstance().logDebug("JsonHttpRequest", "end write bytes!");
    }

    @Override // com.tencent.could.component.common.ai.net.IHttpRequest
    public void cleanExecute() {
        synchronized (JsonHttpRequest.class) {
            try {
                if (this.f15580a != null) {
                    this.f15580a.cleanListener();
                    this.f15580a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd A[Catch: all -> 0x0049, IOException -> 0x004c, TRY_LEAVE, TryCatch #1 {all -> 0x0049, blocks: (B:7:0x0020, B:9:0x002c, B:11:0x0038, B:17:0x0050, B:19:0x0054, B:21:0x0060, B:23:0x0072, B:25:0x0076, B:27:0x007e, B:29:0x0089, B:31:0x0091, B:33:0x00ad, B:35:0x00cd, B:53:0x0155, B:55:0x0182, B:56:0x018a, B:58:0x0190, B:59:0x01a6, B:62:0x01b0, B:63:0x01ba, B:65:0x01c4, B:66:0x01c9, B:68:0x01d3, B:69:0x01d8, B:71:0x01ec, B:72:0x01fa, B:74:0x0202, B:76:0x021c, B:79:0x022d, B:80:0x0247, B:81:0x0248, B:82:0x0262, B:52:0x0145), top: B:86:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0145 A[Catch: all -> 0x0049, IOException -> 0x004c, TRY_ENTER, TryCatch #1 {all -> 0x0049, blocks: (B:7:0x0020, B:9:0x002c, B:11:0x0038, B:17:0x0050, B:19:0x0054, B:21:0x0060, B:23:0x0072, B:25:0x0076, B:27:0x007e, B:29:0x0089, B:31:0x0091, B:33:0x00ad, B:35:0x00cd, B:53:0x0155, B:55:0x0182, B:56:0x018a, B:58:0x0190, B:59:0x01a6, B:62:0x01b0, B:63:0x01ba, B:65:0x01c4, B:66:0x01c9, B:68:0x01d3, B:69:0x01d8, B:71:0x01ec, B:72:0x01fa, B:74:0x0202, B:76:0x021c, B:79:0x022d, B:80:0x0247, B:81:0x0248, B:82:0x0262, B:52:0x0145), top: B:86:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0182 A[Catch: all -> 0x0049, IOException -> 0x004c, TryCatch #1 {all -> 0x0049, blocks: (B:7:0x0020, B:9:0x002c, B:11:0x0038, B:17:0x0050, B:19:0x0054, B:21:0x0060, B:23:0x0072, B:25:0x0076, B:27:0x007e, B:29:0x0089, B:31:0x0091, B:33:0x00ad, B:35:0x00cd, B:53:0x0155, B:55:0x0182, B:56:0x018a, B:58:0x0190, B:59:0x01a6, B:62:0x01b0, B:63:0x01ba, B:65:0x01c4, B:66:0x01c9, B:68:0x01d3, B:69:0x01d8, B:71:0x01ec, B:72:0x01fa, B:74:0x0202, B:76:0x021c, B:79:0x022d, B:80:0x0247, B:81:0x0248, B:82:0x0262, B:52:0x0145), top: B:86:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b0 A[Catch: all -> 0x0049, IOException -> 0x004c, TRY_ENTER, TryCatch #1 {all -> 0x0049, blocks: (B:7:0x0020, B:9:0x002c, B:11:0x0038, B:17:0x0050, B:19:0x0054, B:21:0x0060, B:23:0x0072, B:25:0x0076, B:27:0x007e, B:29:0x0089, B:31:0x0091, B:33:0x00ad, B:35:0x00cd, B:53:0x0155, B:55:0x0182, B:56:0x018a, B:58:0x0190, B:59:0x01a6, B:62:0x01b0, B:63:0x01ba, B:65:0x01c4, B:66:0x01c9, B:68:0x01d3, B:69:0x01d8, B:71:0x01ec, B:72:0x01fa, B:74:0x0202, B:76:0x021c, B:79:0x022d, B:80:0x0247, B:81:0x0248, B:82:0x0262, B:52:0x0145), top: B:86:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c4 A[Catch: all -> 0x0049, IOException -> 0x004c, TryCatch #1 {all -> 0x0049, blocks: (B:7:0x0020, B:9:0x002c, B:11:0x0038, B:17:0x0050, B:19:0x0054, B:21:0x0060, B:23:0x0072, B:25:0x0076, B:27:0x007e, B:29:0x0089, B:31:0x0091, B:33:0x00ad, B:35:0x00cd, B:53:0x0155, B:55:0x0182, B:56:0x018a, B:58:0x0190, B:59:0x01a6, B:62:0x01b0, B:63:0x01ba, B:65:0x01c4, B:66:0x01c9, B:68:0x01d3, B:69:0x01d8, B:71:0x01ec, B:72:0x01fa, B:74:0x0202, B:76:0x021c, B:79:0x022d, B:80:0x0247, B:81:0x0248, B:82:0x0262, B:52:0x0145), top: B:86:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d3 A[Catch: all -> 0x0049, IOException -> 0x004c, TryCatch #1 {all -> 0x0049, blocks: (B:7:0x0020, B:9:0x002c, B:11:0x0038, B:17:0x0050, B:19:0x0054, B:21:0x0060, B:23:0x0072, B:25:0x0076, B:27:0x007e, B:29:0x0089, B:31:0x0091, B:33:0x00ad, B:35:0x00cd, B:53:0x0155, B:55:0x0182, B:56:0x018a, B:58:0x0190, B:59:0x01a6, B:62:0x01b0, B:63:0x01ba, B:65:0x01c4, B:66:0x01c9, B:68:0x01d3, B:69:0x01d8, B:71:0x01ec, B:72:0x01fa, B:74:0x0202, B:76:0x021c, B:79:0x022d, B:80:0x0247, B:81:0x0248, B:82:0x0262, B:52:0x0145), top: B:86:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ec A[Catch: all -> 0x0049, IOException -> 0x004c, TryCatch #1 {all -> 0x0049, blocks: (B:7:0x0020, B:9:0x002c, B:11:0x0038, B:17:0x0050, B:19:0x0054, B:21:0x0060, B:23:0x0072, B:25:0x0076, B:27:0x007e, B:29:0x0089, B:31:0x0091, B:33:0x00ad, B:35:0x00cd, B:53:0x0155, B:55:0x0182, B:56:0x018a, B:58:0x0190, B:59:0x01a6, B:62:0x01b0, B:63:0x01ba, B:65:0x01c4, B:66:0x01c9, B:68:0x01d3, B:69:0x01d8, B:71:0x01ec, B:72:0x01fa, B:74:0x0202, B:76:0x021c, B:79:0x022d, B:80:0x0247, B:81:0x0248, B:82:0x0262, B:52:0x0145), top: B:86:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0202 A[Catch: all -> 0x0049, IOException -> 0x004c, TryCatch #1 {all -> 0x0049, blocks: (B:7:0x0020, B:9:0x002c, B:11:0x0038, B:17:0x0050, B:19:0x0054, B:21:0x0060, B:23:0x0072, B:25:0x0076, B:27:0x007e, B:29:0x0089, B:31:0x0091, B:33:0x00ad, B:35:0x00cd, B:53:0x0155, B:55:0x0182, B:56:0x018a, B:58:0x0190, B:59:0x01a6, B:62:0x01b0, B:63:0x01ba, B:65:0x01c4, B:66:0x01c9, B:68:0x01d3, B:69:0x01d8, B:71:0x01ec, B:72:0x01fa, B:74:0x0202, B:76:0x021c, B:79:0x022d, B:80:0x0247, B:81:0x0248, B:82:0x0262, B:52:0x0145), top: B:86:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022d A[Catch: all -> 0x0049, IOException -> 0x004c, TRY_ENTER, TryCatch #1 {all -> 0x0049, blocks: (B:7:0x0020, B:9:0x002c, B:11:0x0038, B:17:0x0050, B:19:0x0054, B:21:0x0060, B:23:0x0072, B:25:0x0076, B:27:0x007e, B:29:0x0089, B:31:0x0091, B:33:0x00ad, B:35:0x00cd, B:53:0x0155, B:55:0x0182, B:56:0x018a, B:58:0x0190, B:59:0x01a6, B:62:0x01b0, B:63:0x01ba, B:65:0x01c4, B:66:0x01c9, B:68:0x01d3, B:69:0x01d8, B:71:0x01ec, B:72:0x01fa, B:74:0x0202, B:76:0x021c, B:79:0x022d, B:80:0x0247, B:81:0x0248, B:82:0x0262, B:52:0x0145), top: B:86:0x0020 }] */
    @Override // com.tencent.could.component.common.ai.net.IHttpRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.could.component.common.ai.net.JsonHttpRequest.execute():void");
    }

    public CallBackListener getCallBackListener() {
        return this.f15580a;
    }

    @Override // com.tencent.could.component.common.ai.net.IHttpRequest
    public NetWorkParam getNetWorkParam() {
        return this.f15581b;
    }

    @Override // com.tencent.could.component.common.ai.net.IHttpRequest
    public void setListener(CallBackListener callBackListener) {
        this.f15580a = callBackListener;
    }

    @Override // com.tencent.could.component.common.ai.net.IHttpRequest
    public void setNeedIpBackUrl(boolean z4) {
        this.f15582d = z4;
    }

    @Override // com.tencent.could.component.common.ai.net.IHttpRequest
    public void setNeedIpBackUrls(boolean z4, int i) {
        this.e = z4;
        this.f = i;
    }

    @Override // com.tencent.could.component.common.ai.net.IHttpRequest
    public void setNeedUseDeputy(boolean z4) {
        this.c = z4;
    }

    @Override // com.tencent.could.component.common.ai.net.IHttpRequest
    public void setNetWorkParam(NetWorkParam netWorkParam) {
        this.f15581b = netWorkParam;
    }
}
