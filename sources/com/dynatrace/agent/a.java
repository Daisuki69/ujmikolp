package com.dynatrace.agent;

import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9577a;

    public /* synthetic */ a(int i) {
        this.f9577a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        switch (this.f9577a) {
            case 0:
                return OneAgentEventDispatcher.dispatchEventWithStrategy$lambda$5(jSONObject);
            case 1:
                return OneAgentEventDispatcher.dispatchEventWithRestrictions$lambda$1(jSONObject);
            default:
                return OneAgentEventDispatcher.dispatchSessionPropertiesWithRestrictions$lambda$0(jSONObject);
        }
    }
}
