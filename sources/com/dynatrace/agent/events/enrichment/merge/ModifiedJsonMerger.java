package com.dynatrace.agent.events.enrichment.merge;

import cj.C1110A;
import cj.w;
import com.dynatrace.agent.events.enrichment.EnrichedJsonContainer;
import com.dynatrace.agent.events.enrichment.EnrichmentAttribute;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.events.enrichment.JsonObjectExtensionsKt;
import com.dynatrace.agent.events.enrichment.sanitation.AttributeRetentionRule;
import com.dynatrace.agent.events.enrichment.sanitation.AttributeSanitizer;
import com.dynatrace.agent.events.enrichment.sanitation.JsonAttribute;
import com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeKt;
import com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeSanitationKt;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.sequences.Sequence;
import org.json.JSONException;
import org.json.JSONObject;
import yj.n;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class ModifiedJsonMerger {
    private int addedAttributes;
    private final AttributeRetentionRule allowedNamespace;
    private final JSONObject baseJson;
    private final AttributeSanitizer[] changedAttributeSanitizers;
    private final List<String> droppedAttributes;
    private final boolean isSessionPropertiesEvent;
    private final AttributeSanitizer[] newAttributeSanitizers;
    private final List<EnrichmentAttribute> overriddenAttributes;

    public ModifiedJsonMerger(EnrichedJsonContainer baseJsonContainer, boolean z4) {
        j.g(baseJsonContainer, "baseJsonContainer");
        this.isSessionPropertiesEvent = z4;
        this.baseJson = baseJsonContainer.getEnrichedJson();
        this.overriddenAttributes = C1110A.W(baseJsonContainer.getOverriddenAttributes());
        this.droppedAttributes = new ArrayList();
        AttributeRetentionRule sessionPropertiesNamespace = z4 ? JsonAttributeSanitationKt.getSessionPropertiesNamespace() : JsonAttributeSanitationKt.getEventPropertiesNamespace();
        this.allowedNamespace = sessionPropertiesNamespace;
        this.changedAttributeSanitizers = new AttributeSanitizer[]{JsonAttributeSanitationKt.removeAllAttributes(new AttributeRetentionRule[]{sessionPropertiesNamespace, JsonAttributeSanitationKt.getFieldsAllowedInModificationApi()}), JsonAttributeSanitationKt.getRemoveNestedJsonObjectAndArrays(), JsonAttributeSanitationKt.getTrimTooLongStringValues()};
        this.newAttributeSanitizers = new AttributeSanitizer[]{JsonAttributeSanitationKt.removeAllAttributes(new AttributeRetentionRule[]{sessionPropertiesNamespace}), JsonAttributeSanitationKt.getRemoveAttributeWithExceedingKeySize(), JsonAttributeSanitationKt.getRemoveAttributesWithInvalidKeys(), JsonAttributeSanitationKt.getRemoveNestedJsonObjectAndArrays(), JsonAttributeSanitationKt.getTrimTooLongStringValues()};
    }

    private final void addNewAttribute(JsonAttribute jsonAttribute) throws JSONException {
        JsonObjectExtensionsKt.put(this.baseJson, jsonAttribute);
        this.addedAttributes++;
    }

    private final void drop(String str) {
        this.droppedAttributes.add(str);
    }

    private final List<EnrichmentAttribute> findRemovedAttributes(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        j.f(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                j.d(next);
                if (isAllowedToBeRemoved(next)) {
                    Object obj = jSONObject.get(next);
                    j.f(obj, "get(...)");
                    arrayList.add(new EnrichmentAttribute(next, obj));
                    arrayList2.add(next);
                    Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "merge modifications: attribute '" + next + "' has been removed by event modifier");
                } else {
                    Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "merge modifications: removing of protected attribute '" + next + "' is not allowed and thus ignored");
                }
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            jSONObject.remove((String) it.next());
        }
        return arrayList;
    }

    private final boolean hasChanged(JsonAttribute jsonAttribute, JSONObject jSONObject) {
        return !j.b(jSONObject.get(jsonAttribute.getKey()), jsonAttribute.getValue());
    }

    private final boolean isAllowedToBeRemoved(String str) {
        return this.isSessionPropertiesEvent ? z.w(str, 2, EventKeys.SESSION_PROPERTIES.NAMESPACE, false) : z.w(str, 2, EventKeys.EVENT_PROPERTIES.NAMESPACE, false);
    }

    private final boolean isNewTo(String str, JSONObject jSONObject) {
        return !jSONObject.has(str);
    }

    private final boolean isTooManyAttributesAdded() {
        return this.addedAttributes >= 50;
    }

    private final void mergeModifiedAttribute(JsonAttribute jsonAttribute) throws JSONException {
        if (hasChanged(jsonAttribute, this.baseJson)) {
            JsonAttribute jsonAttributeApplySanitizers = JsonAttributeKt.applySanitizers(jsonAttribute, this.changedAttributeSanitizers);
            if (jsonAttributeApplySanitizers == null) {
                drop(jsonAttribute.getKey());
                return;
            }
            overwriteAttribute(jsonAttribute.getKey(), jsonAttributeApplySanitizers);
            Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "merge modifications: attribute '" + jsonAttribute.getKey() + "' is overwritten by " + jsonAttributeApplySanitizers);
        }
    }

    private final void mergeNewAttribute(JsonAttribute jsonAttribute) throws JSONException {
        if (isTooManyAttributesAdded()) {
            Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "merge modifications: adding more than 50 attributes using event modifiers is not allowed; dropping: '" + jsonAttribute.getKey() + '\'');
            drop(jsonAttribute.getKey());
            return;
        }
        JsonAttribute jsonAttributeApplySanitizers = JsonAttributeKt.applySanitizers(jsonAttribute, this.newAttributeSanitizers);
        if (jsonAttributeApplySanitizers != null) {
            addNewAttribute(jsonAttributeApplySanitizers);
        } else {
            drop(jsonAttribute.getKey());
        }
    }

    private final void overwriteAttribute(String str, JsonAttribute jsonAttribute) throws JSONException {
        Object obj = this.baseJson.get(str);
        j.f(obj, "get(...)");
        EnrichmentAttribute enrichmentAttribute = new EnrichmentAttribute(str, obj);
        JsonObjectExtensionsKt.put(this.baseJson, jsonAttribute);
        this.overriddenAttributes.add(enrichmentAttribute);
    }

    private final void setHasDroppedFieldsFlag() throws JSONException {
        boolean zOptBoolean = this.baseJson.optBoolean(EventKeys.DT.SUPPORT.API_HAS_DROPPED_CUSTOM_PROPERTIES);
        if (!this.droppedAttributes.isEmpty() || zOptBoolean) {
            this.baseJson.put(EventKeys.DT.SUPPORT.API_HAS_DROPPED_CUSTOM_PROPERTIES, true);
        }
    }

    public final EnrichedJsonContainer merge(JSONObject modifiedJson) {
        j.g(modifiedJson, "modifiedJson");
        this.overriddenAttributes.addAll(findRemovedAttributes(this.baseJson, modifiedJson));
        Iterator<String> itKeys = modifiedJson.keys();
        j.f(itKeys, "keys(...)");
        Sequence sequenceB = n.b(itKeys);
        ArrayList<String> arrayList = new ArrayList();
        Iterator it = sequenceB.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        w.n(arrayList);
        for (String str : arrayList) {
            Object obj = modifiedJson.get(str);
            j.f(obj, "get(...)");
            Object objCopyJsonValue = JsonObjectExtensionsKt.copyJsonValue(obj);
            j.d(str);
            JsonAttribute jsonAttribute = new JsonAttribute(str, objCopyJsonValue);
            if (isNewTo(str, this.baseJson)) {
                mergeNewAttribute(jsonAttribute);
            } else {
                mergeModifiedAttribute(jsonAttribute);
            }
        }
        setHasDroppedFieldsFlag();
        return new EnrichedJsonContainer(this.baseJson, this.overriddenAttributes);
    }
}
