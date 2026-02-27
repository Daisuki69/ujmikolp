package com.dynatrace.agent.events.enrichment;

import java.util.List;
import kotlin.jvm.internal.j;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class EnrichedJsonContainer {
    private final JSONObject enrichedJson;
    private final List<EnrichmentAttribute> overriddenAttributes;

    public EnrichedJsonContainer(JSONObject enrichedJson, List<EnrichmentAttribute> overriddenAttributes) {
        j.g(enrichedJson, "enrichedJson");
        j.g(overriddenAttributes, "overriddenAttributes");
        this.enrichedJson = enrichedJson;
        this.overriddenAttributes = overriddenAttributes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnrichedJsonContainer copy$default(EnrichedJsonContainer enrichedJsonContainer, JSONObject jSONObject, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = enrichedJsonContainer.enrichedJson;
        }
        if ((i & 2) != 0) {
            list = enrichedJsonContainer.overriddenAttributes;
        }
        return enrichedJsonContainer.copy(jSONObject, list);
    }

    public final JSONObject component1() {
        return this.enrichedJson;
    }

    public final List<EnrichmentAttribute> component2() {
        return this.overriddenAttributes;
    }

    public final EnrichedJsonContainer copy(JSONObject enrichedJson, List<EnrichmentAttribute> overriddenAttributes) {
        j.g(enrichedJson, "enrichedJson");
        j.g(overriddenAttributes, "overriddenAttributes");
        return new EnrichedJsonContainer(enrichedJson, overriddenAttributes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnrichedJsonContainer)) {
            return false;
        }
        EnrichedJsonContainer enrichedJsonContainer = (EnrichedJsonContainer) obj;
        return j.b(this.enrichedJson, enrichedJsonContainer.enrichedJson) && j.b(this.overriddenAttributes, enrichedJsonContainer.overriddenAttributes);
    }

    public final JSONObject getEnrichedJson() {
        return this.enrichedJson;
    }

    public final List<EnrichmentAttribute> getOverriddenAttributes() {
        return this.overriddenAttributes;
    }

    public int hashCode() {
        return this.overriddenAttributes.hashCode() + (this.enrichedJson.hashCode() * 31);
    }

    public String toString() {
        return "EnrichedJsonContainer(enrichedJson=" + this.enrichedJson + ", overriddenAttributes=" + this.overriddenAttributes + ')';
    }
}
