package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class k extends HashMap<String, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f16014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16015b;

    public k(NetLivenessReqResultState netLivenessReqResultState, String str, String str2) {
        this.f16014a = str;
        this.f16015b = str2;
        put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.LIVE_DATA_CB);
        put(StateEvent.Name.SELECT_DATA_S, str);
        put(StateEvent.Name.ACTION_DATA_S, str2);
    }
}
