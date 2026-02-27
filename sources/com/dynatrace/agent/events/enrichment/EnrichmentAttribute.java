package com.dynatrace.agent.events.enrichment;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class EnrichmentAttribute {
    private final String key;
    private final Object value;

    public EnrichmentAttribute(String key, Object value) {
        j.g(key, "key");
        j.g(value, "value");
        this.key = key;
        this.value = value;
    }

    public static /* synthetic */ EnrichmentAttribute copy$default(EnrichmentAttribute enrichmentAttribute, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = enrichmentAttribute.key;
        }
        if ((i & 2) != 0) {
            obj = enrichmentAttribute.value;
        }
        return enrichmentAttribute.copy(str, obj);
    }

    public final String component1() {
        return this.key;
    }

    public final Object component2() {
        return this.value;
    }

    public final EnrichmentAttribute copy(String key, Object value) {
        j.g(key, "key");
        j.g(value, "value");
        return new EnrichmentAttribute(key, value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnrichmentAttribute)) {
            return false;
        }
        EnrichmentAttribute enrichmentAttribute = (EnrichmentAttribute) obj;
        return j.b(this.key, enrichmentAttribute.key) && j.b(this.value, enrichmentAttribute.value);
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
        return "EnrichmentAttribute(key=" + this.key + ", value=" + this.value + ')';
    }
}
