package com.dynatrace.agent.events.enrichment.sanitation;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonAttributeKt {
    public static final JsonAttribute applySanitizers(JsonAttribute jsonAttribute, AttributeSanitizer[] sanitizers) {
        j.g(jsonAttribute, "<this>");
        j.g(sanitizers, "sanitizers");
        for (AttributeSanitizer attributeSanitizer : sanitizers) {
            jsonAttribute = attributeSanitizer.sanitize(jsonAttribute);
            if (jsonAttribute == null) {
                return null;
            }
        }
        return jsonAttribute;
    }
}
