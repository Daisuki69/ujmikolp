package com.dynatrace.agent.events.enrichment;

import cj.C1129o;
import cj.r;
import cj.t;
import com.dynatrace.agent.events.EventModifier;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.events.enrichment.merge.ModifiedJsonMerger;
import com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeSanitationKt;
import com.dynatrace.agent.storage.preference.MetricsData;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.paymaya.domain.store.H0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class EnrichmentPipelineKt {
    private static final void addUniqueByKey(List<EnrichmentAttribute> list, EnrichmentAttribute enrichmentAttribute) {
        Iterator<EnrichmentAttribute> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (j.b(it.next().getKey(), enrichmentAttribute.getKey())) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            list.add(enrichmentAttribute);
            return;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "key '" + enrichmentAttribute.getKey() + "' already in overridden keys list. Replacing it.");
        list.set(i, enrichmentAttribute);
    }

    public static final EnrichedJsonContainer applyModifications(EnrichedJsonContainer enrichedJsonContainer, Object[] objArr, ConcurrentLinkedQueue<EventModifier> modifiers) throws JSONException {
        String strW;
        j.g(enrichedJsonContainer, "enrichedJsonContainer");
        j.g(modifiers, "modifiers");
        if (modifiers.isEmpty()) {
            return enrichedJsonContainer;
        }
        StringBuilder sb2 = new StringBuilder("apply modifications: with ");
        sb2.append(modifiers.size());
        sb2.append(" modifier(s); context: ");
        if (objArr == null || (strW = C1129o.w(objArr, ", ", new H0(20), 24)) == null) {
            strW = "null";
        }
        sb2.append(strW);
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, sb2.toString());
        JSONObject jSONObjectDeepCopy = JsonObjectExtensionsKt.deepCopy(enrichedJsonContainer.getEnrichedJson());
        Iterator<EventModifier> it = modifiers.iterator();
        j.f(it, "iterator(...)");
        boolean z4 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventModifier next = it.next();
            try {
                jSONObjectDeepCopy = next.modifyEvent(jSONObjectDeepCopy, objArr);
            } catch (Exception unused) {
                Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "apply modifications: event modifier caused exception. EventModifier: " + z.a(next.getClass()).c());
                z4 = true;
            }
            if (jSONObjectDeepCopy == null) {
                Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "apply modifications: event dropped by event modifier. EventModifier: " + z.a(next.getClass()).c());
                break;
            }
        }
        if (jSONObjectDeepCopy == null) {
            return null;
        }
        EnrichedJsonContainer enrichedJsonContainerMerge = new ModifiedJsonMerger(enrichedJsonContainer, JsonObjectExtensionsKt.hasCharacteristic(enrichedJsonContainer.getEnrichedJson(), EventKeys.Characteristics.HAS_SESSION_PROPERTIES)).merge(jSONObjectDeepCopy);
        if (!z4) {
            return enrichedJsonContainerMerge;
        }
        enrichedJsonContainerMerge.getEnrichedJson().put(EventKeys.DT.SUPPORT.API_HAS_ENRICH_EXCEPTION, true);
        return enrichedJsonContainerMerge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence applyModifications$lambda$3(Object obj) {
        return String.valueOf(obj != null ? obj.getClass().getName() : null);
    }

    public static final List<AttributeSupplier> collectCachedMetricsSuppliers(MetricsData metricsCache) {
        j.g(metricsCache, "metricsCache");
        return r.c(new CachedMetricsSupplier(metricsCache));
    }

    public static final List<AttributeSupplier> collectStoredMetricsSuppliers(MetricsData metricsData) {
        j.g(metricsData, "metricsData");
        return r.c(new StoredMetricsSupplier(metricsData));
    }

    public static final EnrichedJsonContainer enrichJsonWithAttributes(JSONObject inputJson, Map<String, EnrichmentAttribute> enrichmentAttributes) throws JSONException {
        j.g(inputJson, "inputJson");
        j.g(enrichmentAttributes, "enrichmentAttributes");
        JSONObject jSONObjectDeepCopy = JsonObjectExtensionsKt.deepCopy(inputJson);
        List<EnrichmentAttribute> listFindExistingOverriddenKeys = findExistingOverriddenKeys(jSONObjectDeepCopy);
        jSONObjectDeepCopy.remove(EventKeys.DT.SUPPORT.API_OVERRIDDEN_FIELDS);
        for (Map.Entry<String, EnrichmentAttribute> entry : enrichmentAttributes.entrySet()) {
            String key = entry.getKey();
            EnrichmentAttribute value = entry.getValue();
            Object objOpt = jSONObjectDeepCopy.opt(key);
            if (objOpt == null || objOpt.equals(value.getValue())) {
                jSONObjectDeepCopy.put(key, value.getValue());
            } else {
                Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "auto-enrichment value overwritten: " + value + " is overwritten with custom value: " + objOpt);
                if (JsonAttributeSanitationKt.getGenerationApiFields().contains(key)) {
                    addUniqueByKey(listFindExistingOverriddenKeys, value);
                }
            }
        }
        return new EnrichedJsonContainer(jSONObjectDeepCopy, listFindExistingOverriddenKeys);
    }

    public static final JSONObject enrichRumEvent(JSONObject rumEvent, AttributeAggregator overridableAttributeAggregator, AttributeAggregator protectedAttributeAggregator, ConcurrentLinkedQueue<EventModifier> eventModifiers, Object[] objArr) {
        j.g(rumEvent, "rumEvent");
        j.g(overridableAttributeAggregator, "overridableAttributeAggregator");
        j.g(protectedAttributeAggregator, "protectedAttributeAggregator");
        j.g(eventModifiers, "eventModifiers");
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "rum event: " + rumEvent);
        EnrichedJsonContainer enrichedJsonContainerEnrichJsonWithAttributes = enrichJsonWithAttributes(rumEvent, overridableAttributeAggregator.aggregatedAttributes());
        EnrichedJsonContainer enrichedJsonContainerCopy$default = EnrichedJsonContainer.copy$default(enrichedJsonContainerEnrichJsonWithAttributes, integrateProtectedAttributes(enrichedJsonContainerEnrichJsonWithAttributes, protectedAttributeAggregator.aggregatedAttributes()), null, 2, null);
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "rum event after basic enrichment: overridden attributes: " + enrichedJsonContainerEnrichJsonWithAttributes.getOverriddenAttributes() + "; event: " + enrichedJsonContainerEnrichJsonWithAttributes.getEnrichedJson());
        EnrichedJsonContainer enrichedJsonContainerApplyModifications = applyModifications(enrichedJsonContainerCopy$default, objArr, eventModifiers);
        if (enrichedJsonContainerApplyModifications == null) {
            return null;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "rum event after modifications: overridden attributes: " + enrichedJsonContainerApplyModifications.getOverriddenAttributes() + "; event: " + enrichedJsonContainerApplyModifications.getEnrichedJson());
        JSONObject jSONObjectIntegrateOverriddenKeys = integrateOverriddenKeys(enrichedJsonContainerApplyModifications);
        ensureEventPropertiesCharacteristic(jSONObjectIntegrateOverriddenKeys);
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "rum event after full enrichment: " + jSONObjectIntegrateOverriddenKeys);
        return jSONObjectIntegrateOverriddenKeys;
    }

    public static final void ensureEventPropertiesCharacteristic(JSONObject jSONObject) throws JSONException {
        j.g(jSONObject, "<this>");
        if (JsonObjectExtensionsKt.hasKeyIn(jSONObject, EventKeys.EVENT_PROPERTIES.NAMESPACE) && !JsonObjectExtensionsKt.hasCharacteristic(jSONObject, EventKeys.Characteristics.HAS_EVENT_PROPERTIES)) {
            jSONObject.put(EventKeys.Characteristics.HAS_EVENT_PROPERTIES, true);
        } else {
            if (!JsonObjectExtensionsKt.hasCharacteristic(jSONObject, EventKeys.Characteristics.HAS_EVENT_PROPERTIES) || JsonObjectExtensionsKt.hasKeyIn(jSONObject, EventKeys.EVENT_PROPERTIES.NAMESPACE)) {
                return;
            }
            jSONObject.remove(EventKeys.Characteristics.HAS_EVENT_PROPERTIES);
        }
    }

    public static final List<EnrichmentAttribute> findExistingOverriddenKeys(JSONObject json) throws JSONException {
        j.g(json, "json");
        JSONArray jSONArrayOptJSONArray = json.optJSONArray(EventKeys.DT.SUPPORT.API_OVERRIDDEN_FIELDS);
        if (jSONArrayOptJSONArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            if (jSONArrayOptJSONArray.get(i) instanceof String) {
                String string = jSONArrayOptJSONArray.getString(i);
                j.f(string, "getString(...)");
                arrayList.add(new EnrichmentAttribute(string, "unknown"));
            } else {
                Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "dropped existing overridden_key because it was no String: " + jSONArrayOptJSONArray.get(i));
            }
        }
        return arrayList;
    }

    public static final JSONObject integrateOverriddenKeys(EnrichedJsonContainer jsonContainer) throws JSONException {
        j.g(jsonContainer, "jsonContainer");
        JSONObject enrichedJson = jsonContainer.getEnrichedJson();
        if (enrichedJson.remove(EventKeys.DT.SUPPORT.API_OVERRIDDEN_FIELDS) != null) {
            Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "protected attribute integration: encountered key 'dt.support.api.overridden_fields' which is protected and will be removed");
        }
        List<EnrichmentAttribute> overriddenAttributes = jsonContainer.getOverriddenAttributes();
        if (overriddenAttributes.isEmpty()) {
            return enrichedJson;
        }
        List<EnrichmentAttribute> list = overriddenAttributes;
        ArrayList arrayList = new ArrayList(t.l(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((EnrichmentAttribute) it.next()).getKey());
        }
        JSONObject jSONObjectPut = enrichedJson.put(EventKeys.DT.SUPPORT.API_OVERRIDDEN_FIELDS, new JSONArray((Collection) arrayList));
        j.d(jSONObjectPut);
        return jSONObjectPut;
    }

    public static final JSONObject integrateProtectedAttributes(EnrichedJsonContainer jsonContainer, Map<String, EnrichmentAttribute> protectedAttributes) throws JSONException {
        j.g(jsonContainer, "jsonContainer");
        j.g(protectedAttributes, "protectedAttributes");
        JSONObject enrichedJson = jsonContainer.getEnrichedJson();
        for (Map.Entry<String, EnrichmentAttribute> entry : protectedAttributes.entrySet()) {
            String key = entry.getKey();
            EnrichmentAttribute value = entry.getValue();
            if (enrichedJson.has(key)) {
                Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "protected attribute integration: encountered key '" + key + "' which is protected and will be overwritten with " + value);
            }
            enrichedJson.put(key, value.getValue());
        }
        return enrichedJson;
    }
}
