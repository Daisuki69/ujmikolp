package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class a extends HashMap<String, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActionLivenessState.j f16004a;

    public a(ActionLivenessState.j jVar) {
        this.f16004a = jVar;
        put(StateEvent.Name.ACTION_DETECT_DONE_TYPE, Integer.valueOf(ActionLivenessState.this.f15862g));
        put(StateEvent.Name.ACTION_DETECT_DONE_LAST_COUNT, Integer.valueOf(ActionLivenessState.this.h == null ? 0 : ActionLivenessState.this.h.length - (ActionLivenessState.this.i + 1)));
    }
}
