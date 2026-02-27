package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class c extends HashMap<String, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f16005a;

    public c(ActionLivenessState.j jVar, String str) {
        this.f16005a = str;
        put(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE, str);
    }
}
