package com.tencent.could.huiyansdk.helper;

import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class a implements YtSDKKitFramework.IYtSDKKitFrameworkEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f15656a;

    public a(b bVar) {
        this.f15656a = bVar;
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x018b: MOVE (r5 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:396), block:B:67:0x018b */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFrameworkEvent(java.util.HashMap<java.lang.String, java.lang.Object> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.could.huiyansdk.helper.a.onFrameworkEvent(java.util.HashMap):void");
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener
    public void onNetworkRequestEvent(String str, String str2, HashMap<String, String> map, YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        if (str.contains("getLiveType")) {
            HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.a.f15622a;
            HuiYanBaseCallBack huiYanBaseCallBack = huiYanBaseApi.f15620b;
            if (huiYanBaseCallBack != null) {
                huiYanBaseCallBack.onOperateTimeEvent("GetConfigUseTime", 2, false, "");
            }
            this.f15656a.f15658b = iYtSDKKitNetResponseParser;
            e eVar = e.a.f15688a;
            eVar.a(2, "YouTuSdkHelper", "send call back get live");
            HuiYanBaseCallBack huiYanBaseCallBack2 = huiYanBaseApi.f15620b;
            if (huiYanBaseCallBack2 == null) {
                eVar.a(2, "YouTuSdkHelper", "send get live error, base call back is null");
            } else {
                huiYanBaseCallBack2.a(str2);
            }
        }
        if (str.contains("compare")) {
            this.f15656a.getClass();
            e eVar2 = e.a.f15688a;
            eVar2.a(2, "YouTuSdkHelper", "send live compare result.");
            HuiYanBaseCallBack huiYanBaseCallBack3 = HuiYanBaseApi.a.f15622a.f15620b;
            if (huiYanBaseCallBack3 == null) {
                eVar2.a(2, "YouTuSdkHelper", "send get live error, base call back is null.");
            } else {
                huiYanBaseCallBack3.b(str2);
            }
        }
    }
}
