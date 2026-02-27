package com.dynatrace.agent.events.enrichment.sanitation;

import java.util.List;
import kotlin.jvm.internal.j;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class SanitationContext {
    private final List<JsonAttribute> droppedAttributes;
    private final JSONObject sanitizedJson;

    public SanitationContext(JSONObject sanitizedJson, List<JsonAttribute> droppedAttributes) {
        j.g(sanitizedJson, "sanitizedJson");
        j.g(droppedAttributes, "droppedAttributes");
        this.sanitizedJson = sanitizedJson;
        this.droppedAttributes = droppedAttributes;
    }

    public final List<JsonAttribute> getDroppedAttributes() {
        return this.droppedAttributes;
    }

    public final JSONObject getSanitizedJson() {
        return this.sanitizedJson;
    }
}
