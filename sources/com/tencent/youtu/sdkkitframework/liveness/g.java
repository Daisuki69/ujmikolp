package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class g extends HashMap<String, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f16010a;

    public g(NetLivenessReqResultState netLivenessReqResultState, String str) {
        this.f16010a = str;
        put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
        put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
        put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
        put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_NETWORK_ERROR));
        put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_NETWORK_ERROR, StringCode.MSG_NET_ERROR, str));
    }
}
