package com.dynatrace.agent.events.enrichment.sanitation;

import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.events.enrichment.JsonObjectExtensionsKt;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class SanitationStrategiesKt {
    public static final SanitationContext sanitizeRumEvent(JSONObject jSONObject) throws JSONException {
        j.g(jSONObject, "<this>");
        SanitationContext sanitationContextTrimFields = JsonAttributeSanitationKt.trimFields(JsonObjectExtensionsKt.sanitizedDeepCopy(jSONObject, new AttributeSanitizer[]{JsonAttributeSanitationKt.removeAllAttributes(new AttributeRetentionRule[]{JsonAttributeSanitationKt.getFieldsAllowedInGenerationApi(), JsonAttributeSanitationKt.getEventPropertiesNamespace()}), JsonAttributeSanitationKt.getRemoveAttributeWithExceedingKeySize(), JsonAttributeSanitationKt.getRemoveAttributesWithInvalidKeys(), JsonAttributeSanitationKt.getRemoveNestedJsonObjectAndArrays(), JsonAttributeSanitationKt.getTrimTooLongStringValues()}), EventKeys.EVENT_PROPERTIES.NAMESPACE);
        if (!sanitationContextTrimFields.getDroppedAttributes().isEmpty()) {
            sanitationContextTrimFields.getSanitizedJson().put(EventKeys.DT.SUPPORT.API_HAS_DROPPED_CUSTOM_PROPERTIES, true);
        }
        return sanitationContextTrimFields;
    }

    public static final SanitationContext sanitizeSessionProperties(JSONObject jSONObject) throws JSONException {
        j.g(jSONObject, "<this>");
        SanitationContext sanitationContextTrimFields = JsonAttributeSanitationKt.trimFields(JsonObjectExtensionsKt.sanitizedDeepCopy(jSONObject, new AttributeSanitizer[]{JsonAttributeSanitationKt.removeAllAttributes(new AttributeRetentionRule[]{JsonAttributeSanitationKt.getFieldsAllowedInGenerationApi(), JsonAttributeSanitationKt.getSessionPropertiesNamespace()}), JsonAttributeSanitationKt.getRemoveAttributeWithExceedingKeySize(), JsonAttributeSanitationKt.getRemoveAttributesWithInvalidKeys(), JsonAttributeSanitationKt.getRemoveNestedJsonObjectAndArrays(), JsonAttributeSanitationKt.getTrimTooLongStringValues()}), EventKeys.SESSION_PROPERTIES.NAMESPACE);
        if (!sanitationContextTrimFields.getDroppedAttributes().isEmpty()) {
            sanitationContextTrimFields.getSanitizedJson().put(EventKeys.DT.SUPPORT.API_HAS_DROPPED_CUSTOM_PROPERTIES, true);
        }
        return sanitationContextTrimFields;
    }
}
