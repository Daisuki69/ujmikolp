package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class e implements YtSDKKitFramework.IYtSDKKitNetResponseParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ YtLivenessNetProtoHelper.GetLiveTypeReqData f16006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NetFetchState f16007b;

    public class a extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f16008a;

        public a(e eVar, String str) {
            this.f16008a = str;
            put("ui_error", "Response failed");
            put(StateEvent.Name.UI_TIPS, StringCode.NET_FETCH_FAILED);
            put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_NETWORK_ERROR));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_NETWORK_ERROR, StringCode.NET_FETCH_FAILED, str));
        }
    }

    public e(NetFetchState netFetchState, YtLivenessNetProtoHelper.GetLiveTypeReqData getLiveTypeReqData) {
        this.f16007b = netFetchState;
        this.f16006a = getLiveTypeReqData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNetworkResponseEvent(java.util.HashMap<java.lang.String, java.lang.String> r26, java.lang.Exception r27) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.liveness.e.onNetworkResponseEvent(java.util.HashMap, java.lang.Exception):void");
    }
}
