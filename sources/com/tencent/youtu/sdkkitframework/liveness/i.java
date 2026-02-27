package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class i extends HashMap<String, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Exception f16012a;

    public i(NetLivenessReqResultState netLivenessReqResultState, Exception exc) {
        this.f16012a = exc;
        put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
        put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
        put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
        put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_PARAM_ERROR));
        put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_PARAM_ERROR, StringCode.MSG_PARAM_ERROR, exc.getLocalizedMessage()));
    }
}
