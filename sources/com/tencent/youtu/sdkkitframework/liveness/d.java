package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class d extends HashMap<String, Object> {
    public d(ActionLivenessState.j jVar) {
        put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
        put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_ACTION_ENCODE_VIDEO_ERROR));
        put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_ACTION_ENCODE_VIDEO_ERROR, StringCode.MSG_INNER_ERROR, "read video error:400102"));
    }
}
