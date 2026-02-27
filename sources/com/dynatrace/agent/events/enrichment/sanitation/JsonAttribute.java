package com.dynatrace.agent.events.enrichment.sanitation;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonAttribute {
    private final String key;
    private final Object value;

    public JsonAttribute(String key, Object value) {
        j.g(key, "key");
        j.g(value, "value");
        this.key = key;
        this.value = value;
    }

    public static /* synthetic */ JsonAttribute copy$default(JsonAttribute jsonAttribute, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = jsonAttribute.key;
        }
        if ((i & 2) != 0) {
            obj = jsonAttribute.value;
        }
        return jsonAttribute.copy(str, obj);
    }

    public final String component1() {
        return this.key;
    }

    public final Object component2() {
        return this.value;
    }

    public final JsonAttribute copy(String key, Object value) {
        j.g(key, "key");
        j.g(value, "value");
        return new JsonAttribute(key, value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonAttribute)) {
            return false;
        }
        JsonAttribute jsonAttribute = (JsonAttribute) obj;
        return j.b(this.key, jsonAttribute.key) && j.b(this.value, jsonAttribute.value);
    }

    public final String getKey() {
        return this.key;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    public String toString() {
        return "JsonAttribute(key=" + this.key + ", value=" + this.value + ')';
    }
}
