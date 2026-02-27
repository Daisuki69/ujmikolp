package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class b extends HashMap<String, Object> {
    public b(ActionLivenessState.j jVar) {
        put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
        put(StateEvent.Name.ERROR_CODE, 4194304);
        put("message", CommonUtils.makeMessageJson(4194304, StringCode.MSG_INNER_ERROR, "pose detect error4194304"));
    }
}
