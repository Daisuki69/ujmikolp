package com.dynatrace.agent.events.enrichment;

import com.dynatrace.agent.events.enrichment.sanitation.AttributeSanitizer;
import com.dynatrace.agent.events.enrichment.sanitation.JsonAttribute;
import com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeKt;
import com.dynatrace.agent.events.enrichment.sanitation.SanitationContext;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yj.C2536a;
import yj.n;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonObjectExtensionsKt {
    public static final Object copyJsonValue(Object value) {
        j.g(value, "value");
        return value instanceof JSONArray ? deepCopy((JSONArray) value) : value instanceof JSONObject ? deepCopy((JSONObject) value) : value;
    }

    public static final JSONArray deepCopy(JSONArray jSONArray) throws JSONException {
        j.g(jSONArray, "<this>");
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            j.f(obj, "get(...)");
            jSONArray2.put(copyJsonValue(obj));
        }
        return jSONArray2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final org.json.JSONObject getMergedStartupEventOrNative(org.json.JSONObject r19, org.json.JSONObject r20, java.util.List<java.lang.String> r21, com.dynatrace.agent.di.SelfMonitoringComponent r22) throws org.json.JSONException {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.String r4 = "nativeEvent"
            kotlin.jvm.internal.j.g(r0, r4)
            java.lang.String r4 = "cpEvent"
            kotlin.jvm.internal.j.g(r1, r4)
            java.lang.String r4 = "cpKeys"
            kotlin.jvm.internal.j.g(r2, r4)
            java.lang.String r4 = "selfMonitoring"
            kotlin.jvm.internal.j.g(r3, r4)
            java.lang.String r4 = "start_time"
            long r5 = r0.optLong(r4)
            long r7 = r1.optLong(r4)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 >= 0) goto L40
            java.lang.String r1 = "Cross Platform app start has a smaller start time "
            java.lang.String r2 = " than native "
            java.lang.StringBuilder r1 = androidx.camera.core.impl.a.s(r7, r1, r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "CrossPlatformStartEventEarly"
            r3.reportLogEvent(r2, r1)
            return r0
        L40:
            java.lang.String r3 = "duration"
            long r9 = r0.optLong(r3)
            long r9 = r9 + r5
            long r11 = r1.optLong(r3)
            long r11 = r11 + r7
            long r7 = r7 - r5
            java.util.Iterator r13 = r1.keys()
            java.lang.String r14 = "keys(...)"
            kotlin.jvm.internal.j.f(r13, r14)
        L56:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L89
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            boolean r15 = r2.contains(r14)
            if (r15 == 0) goto L7d
            kotlin.jvm.internal.j.d(r14)
            java.lang.Long r15 = com.dynatrace.agent.communication.network.response.JsonExtensionKt.getLongOrNull(r1, r14)
            if (r15 == 0) goto L7d
            long r15 = r1.getLong(r14)
            r17 = r7
            long r7 = r15 + r17
            r0.put(r14, r7)
            goto L86
        L7d:
            r17 = r7
            java.lang.Object r7 = r1.get(r14)
            r0.put(r14, r7)
        L86:
            r7 = r17
            goto L56
        L89:
            long r1 = java.lang.Math.max(r9, r11)
            r0.put(r4, r5)
            long r1 = r1 - r5
            r0.put(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.events.enrichment.JsonObjectExtensionsKt.getMergedStartupEventOrNative(org.json.JSONObject, org.json.JSONObject, java.util.List, com.dynatrace.agent.di.SelfMonitoringComponent):org.json.JSONObject");
    }

    public static final boolean hasCharacteristic(JSONObject jSONObject, String key) {
        j.g(jSONObject, "<this>");
        j.g(key, "key");
        try {
            if (jSONObject.has(key)) {
                Object obj = jSONObject.get(key);
                if (obj instanceof Boolean) {
                    return ((Boolean) obj).booleanValue();
                }
            }
        } catch (JSONException unused) {
        }
        return false;
    }

    public static final boolean hasKeyIn(JSONObject jSONObject, String namespace) {
        j.g(jSONObject, "<this>");
        j.g(namespace, "namespace");
        Iterator<String> itKeys = jSONObject.keys();
        j.f(itKeys, "keys(...)");
        for (String str : (C2536a) n.b(itKeys)) {
            j.d(str);
            if (z.w(str, 2, namespace, false)) {
                return true;
            }
        }
        return false;
    }

    public static final JSONObject put(JSONObject jSONObject, JsonAttribute jsonAttribute) throws JSONException {
        j.g(jSONObject, "<this>");
        j.g(jsonAttribute, "jsonAttribute");
        JSONObject jSONObjectPut = jSONObject.put(jsonAttribute.getKey(), jsonAttribute.getValue());
        j.f(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    public static final void putAllAttributesOf(JSONObject jSONObject, JSONObject other) {
        j.g(jSONObject, "<this>");
        j.g(other, "other");
        Iterator<String> itKeys = other.keys();
        j.f(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject.put(next, other.get(next));
        }
    }

    public static final SanitationContext sanitizedDeepCopy(JSONObject jSONObject, AttributeSanitizer[] attributeSanitizers) throws JSONException {
        j.g(jSONObject, "<this>");
        j.g(attributeSanitizers, "attributeSanitizers");
        JSONObject jSONObject2 = new JSONObject();
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        j.f(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            j.d(next);
            Object obj = jSONObject.get(next);
            j.f(obj, "get(...)");
            JsonAttribute jsonAttribute = new JsonAttribute(next, copyJsonValue(obj));
            JsonAttribute jsonAttributeApplySanitizers = JsonAttributeKt.applySanitizers(jsonAttribute, attributeSanitizers);
            if (jsonAttributeApplySanitizers != null) {
                put(jSONObject2, jsonAttributeApplySanitizers);
            } else {
                arrayList.add(jsonAttribute);
            }
        }
        return new SanitationContext(jSONObject2, arrayList);
    }

    public static final JSONObject deepCopy(JSONObject jSONObject) {
        j.g(jSONObject, "<this>");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        j.f(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            j.f(obj, "get(...)");
            jSONObject2.put(next, copyJsonValue(obj));
        }
        return jSONObject2;
    }
}
