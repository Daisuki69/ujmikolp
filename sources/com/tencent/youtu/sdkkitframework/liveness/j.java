package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class j implements YtSDKKitFramework.IYtSDKKitNetResponseParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NetLivenessReqResultState f16013a;

    public j(NetLivenessReqResultState netLivenessReqResultState) {
        this.f16013a = netLivenessReqResultState;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser
    public void onNetworkResponseEvent(HashMap<String, String> map, Exception exc) {
        CommonUtils.benchMarkEnd("reflect_request_s2");
        CommonUtils.benchMarkBegin("reflect_request_s3");
        YtLogger.i("NetLivenessReqResultState", "handle reflection response");
        NetLivenessReqResultState.a(this.f16013a, map, null);
        CommonUtils.benchMarkEnd("reflect_request_s3");
        NetLivenessReqResultState.a(this.f16013a);
    }
}
