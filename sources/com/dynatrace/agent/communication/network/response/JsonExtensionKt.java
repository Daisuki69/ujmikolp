package com.dynatrace.agent.communication.network.response;

import kotlin.jvm.internal.j;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonExtensionKt {
    public static final Integer getIntOrNull(JSONObject jSONObject, String name) {
        j.g(jSONObject, "<this>");
        j.g(name, "name");
        return toInteger(jSONObject.opt(name));
    }

    public static final Long getLongOrNull(JSONObject jSONObject, String name) {
        j.g(jSONObject, "<this>");
        j.g(name, "name");
        return toLong(jSONObject.opt(name));
    }

    public static final String getStringOrNull(JSONObject jSONObject, String name) {
        j.g(jSONObject, "<this>");
        j.g(name, "name");
        return toString(jSONObject.opt(name));
    }

    private static final Integer toInteger(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Integer.valueOf((int) Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static final Long toLong(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Long.valueOf((long) Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static final String toString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
