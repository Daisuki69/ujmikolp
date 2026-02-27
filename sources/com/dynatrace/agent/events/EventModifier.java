package com.dynatrace.agent.events;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@FunctionalInterface
public interface EventModifier {
    JSONObject modifyEvent(JSONObject jSONObject, Object[] objArr);
}
