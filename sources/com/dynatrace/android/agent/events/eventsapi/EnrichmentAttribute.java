package com.dynatrace.android.agent.events.eventsapi;

import androidx.camera.core.impl.a;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class EnrichmentAttribute implements Comparable<EnrichmentAttribute> {
    private final boolean addToOverridableKeys;
    private final String key;
    private final OverridingStrategy overridingStrategy;
    private final Object value;
    private static final OverridingStrategy OVERRIDABLE = new OverridingStrategy() { // from class: com.dynatrace.android.agent.events.eventsapi.EnrichmentAttribute.1
        @Override // com.dynatrace.android.agent.events.eventsapi.OverridingStrategy
        public boolean isOverridableBy(Object obj) {
            return true;
        }
    };
    private static final OverridingStrategy NOT_OVERRIDABLE = new OverridingStrategy() { // from class: com.dynatrace.android.agent.events.eventsapi.EnrichmentAttribute.2
        @Override // com.dynatrace.android.agent.events.eventsapi.OverridingStrategy
        public boolean isOverridableBy(Object obj) {
            return false;
        }
    };

    private EnrichmentAttribute(String str, Object obj, OverridingStrategy overridingStrategy, boolean z4) {
        this.key = str;
        this.value = obj;
        this.overridingStrategy = overridingStrategy;
        this.addToOverridableKeys = z4;
    }

    public static EnrichmentAttribute conditionalEnrichmentAttribute(String str, Object obj, OverridingStrategy overridingStrategy, boolean z4) {
        return new EnrichmentAttribute(str, obj, overridingStrategy, z4);
    }

    public static EnrichmentAttribute mandatoryEnrichmentAttribute(String str, Object obj) {
        return new EnrichmentAttribute(str, obj, NOT_OVERRIDABLE, true);
    }

    public static EnrichmentAttribute overridableEnrichmentAttribute(String str, Object obj) {
        return new EnrichmentAttribute(str, obj, OVERRIDABLE, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            EnrichmentAttribute enrichmentAttribute = (EnrichmentAttribute) obj;
            if (Objects.equals(this.key, enrichmentAttribute.key) && Objects.equals(this.value, enrichmentAttribute.value) && Objects.equals(this.overridingStrategy, enrichmentAttribute.overridingStrategy) && this.addToOverridableKeys == enrichmentAttribute.addToOverridableKeys) {
                return true;
            }
        }
        return false;
    }

    public String getKey() {
        return this.key;
    }

    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.key, this.value, this.overridingStrategy, Boolean.valueOf(this.addToOverridableKeys));
    }

    public boolean isOverridableBy(Object obj) {
        return this.overridingStrategy.isOverridableBy(obj);
    }

    public boolean shouldBeAddedToOverridableKeys() {
        return this.addToOverridableKeys;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EnrichmentAttribute{key='");
        sb2.append(this.key);
        sb2.append("', value=");
        sb2.append(this.value);
        sb2.append(", overridingStrategy=");
        sb2.append(this.overridingStrategy);
        sb2.append(", addToOverridableKeys=");
        return a.q(sb2, this.addToOverridableKeys, '}');
    }

    @Override // java.lang.Comparable
    public int compareTo(EnrichmentAttribute enrichmentAttribute) {
        return this.key.compareTo(enrichmentAttribute.key);
    }
}
