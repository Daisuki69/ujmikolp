package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class l implements YtSDKKitFramework.IYtSDKKitNetResponseParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NetLivenessReqResultState f16016a;

    public l(NetLivenessReqResultState netLivenessReqResultState) {
        this.f16016a = netLivenessReqResultState;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser
    public void onNetworkResponseEvent(HashMap<String, String> map, Exception exc) {
        YtLogger.i("NetLivenessReqResultState", "handle actreflect response");
        NetLivenessReqResultState.a(this.f16016a, map, null);
        NetLivenessReqResultState.a(this.f16016a);
    }
}
