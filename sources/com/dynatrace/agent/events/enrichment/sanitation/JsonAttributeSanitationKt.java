package com.dynatrace.agent.events.enrichment.sanitation;

import We.s;
import ac.m;
import cj.C1128n;
import cj.C1132s;
import cj.r;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.j;
import l9.C1803a;
import org.json.JSONArray;
import org.json.JSONObject;
import v0.C2333a;
import yj.n;
import yj.q;
import zj.C2578C;
import zj.o;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonAttributeSanitationKt {
    public static final int JSON_CUSTOM_FIELD_LIMIT = 50;
    private static final int MAX_ATTRIBUTE_KEY_SIZE = 100;
    private static final int MAX_STRING_VALUE_SIZE = 5000;
    private static final o keyRegex = new o("^[a-zA-Z0-9]+(?:\\.[a-zA-Z][a-zA-Z0-9]*|_[a-zA-Z0-9]+)*$");
    private static final List<String> generationApiFields = r.c("duration");
    private static final List<String> modificationApiFields = C1132s.g(EventKeys.URL.FULL, EventKeys.EXCEPTION.STACK_TRACE);
    private static final AttributeRetentionRule sessionPropertiesNamespace = new df.o(23, (byte) 0);
    private static final AttributeRetentionRule eventPropertiesNamespace = new df.o(24, (byte) 0);
    private static final AttributeRetentionRule fieldsAllowedInGenerationApi = new df.o(25, (byte) 0);
    private static final AttributeRetentionRule fieldsAllowedInModificationApi = new df.o(26, (byte) 0);
    private static final AttributeSanitizer removeNestedJsonObjectAndArrays = new df.o(27, (byte) 0);
    private static final AttributeSanitizer removeAttributeWithExceedingKeySize = new df.o(28, (byte) 0);
    private static final AttributeSanitizer removeAttributesWithInvalidKeys = new df.o(29, (byte) 0);
    private static final AttributeSanitizer trimTooLongStringValues = new C2333a(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean eventPropertiesNamespace$lambda$1(JsonAttribute jsonAttribute) {
        j.g(jsonAttribute, "jsonAttribute");
        return z.w(jsonAttribute.getKey(), 2, EventKeys.EVENT_PROPERTIES.NAMESPACE, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fieldsAllowedInGenerationApi$lambda$2(JsonAttribute jsonAttribute) {
        j.g(jsonAttribute, "jsonAttribute");
        return generationApiFields.contains(jsonAttribute.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fieldsAllowedInModificationApi$lambda$3(JsonAttribute jsonAttribute) {
        j.g(jsonAttribute, "jsonAttribute");
        return modificationApiFields.contains(jsonAttribute.getKey());
    }

    public static final AttributeRetentionRule getEventPropertiesNamespace() {
        return eventPropertiesNamespace;
    }

    public static final AttributeRetentionRule getFieldsAllowedInGenerationApi() {
        return fieldsAllowedInGenerationApi;
    }

    public static final AttributeRetentionRule getFieldsAllowedInModificationApi() {
        return fieldsAllowedInModificationApi;
    }

    public static final List<String> getGenerationApiFields() {
        return generationApiFields;
    }

    public static final List<String> getModificationApiFields() {
        return modificationApiFields;
    }

    public static final AttributeSanitizer getRemoveAttributeWithExceedingKeySize() {
        return removeAttributeWithExceedingKeySize;
    }

    public static final AttributeSanitizer getRemoveAttributesWithInvalidKeys() {
        return removeAttributesWithInvalidKeys;
    }

    public static final AttributeSanitizer getRemoveNestedJsonObjectAndArrays() {
        return removeNestedJsonObjectAndArrays;
    }

    public static final AttributeRetentionRule getSessionPropertiesNamespace() {
        return sessionPropertiesNamespace;
    }

    public static final AttributeSanitizer getTrimTooLongStringValues() {
        return trimTooLongStringValues;
    }

    private static final boolean isPrimitive(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Boolean);
    }

    public static final AttributeSanitizer removeAllAttributes(AttributeRetentionRule[] keep) {
        j.g(keep, "keep");
        return new C1803a(keep, 22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAttribute removeAllAttributes$lambda$9(AttributeRetentionRule[] attributeRetentionRuleArr, JsonAttribute jsonAttribute) {
        j.g(jsonAttribute, "jsonAttribute");
        for (AttributeRetentionRule attributeRetentionRule : attributeRetentionRuleArr) {
            if (attributeRetentionRule.shouldKeep(jsonAttribute)) {
                return jsonAttribute;
            }
        }
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "sanitation: key '" + jsonAttribute.getKey() + "' is outside of allowed namespace and thus dropped");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAttribute removeAttributeWithExceedingKeySize$lambda$5(JsonAttribute jsonAttribute) {
        j.g(jsonAttribute, "jsonAttribute");
        if (jsonAttribute.getKey().length() <= 100) {
            return jsonAttribute;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "sanitation: dropped a key because it was too long; limit: 100; actual length: " + jsonAttribute.getKey().length() + "; key: '" + jsonAttribute.getKey() + '\'');
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAttribute removeAttributesWithInvalidKeys$lambda$6(JsonAttribute jsonAttribute) {
        j.g(jsonAttribute, "jsonAttribute");
        if (keyRegex.d(jsonAttribute.getKey()) != null) {
            return jsonAttribute;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "sanitation: dropped a key because it does not conform to expected pattern; key: " + jsonAttribute.getKey());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAttribute removeNestedJsonObjectAndArrays$lambda$4(JsonAttribute jsonAttribute) {
        j.g(jsonAttribute, "jsonAttribute");
        if (!(jsonAttribute.getValue() instanceof JSONObject) && !(jsonAttribute.getValue() instanceof JSONArray)) {
            return jsonAttribute;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "sanitation: key '" + jsonAttribute.getKey() + "' is a nested object or array and thus dropped");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sessionPropertiesNamespace$lambda$0(JsonAttribute jsonAttribute) {
        j.g(jsonAttribute, "jsonAttribute");
        return z.w(jsonAttribute.getKey(), 2, EventKeys.SESSION_PROPERTIES.NAMESPACE, false);
    }

    public static final SanitationContext trimFields(SanitationContext sanitationContext, String namespace) {
        j.g(sanitationContext, "<this>");
        j.g(namespace, "namespace");
        Iterator<String> itKeys = sanitationContext.getSanitizedJson().keys();
        j.f(itKeys, "keys(...)");
        List listQ = q.q(new C1128n(q.h(n.b(itKeys), new m(namespace, 5)), 5));
        if (listQ.size() > 50) {
            ArrayList arrayList = new ArrayList();
            ListIterator listIterator = listQ.listIterator(50);
            while (listIterator.hasNext()) {
                String str = (String) listIterator.next();
                Object objRemove = sanitationContext.getSanitizedJson().remove(str);
                j.d(objRemove);
                j.d(str);
                arrayList.add(new JsonAttribute(str, objRemove));
            }
            StringBuilder sbW = s.w("sanitation: json contains too many attributes in ", namespace, " namespace : ");
            sbW.append(listQ.size());
            sbW.append("; dropped attributes: ");
            sbW.append(arrayList);
            Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, sbW.toString());
            sanitationContext.getDroppedAttributes().addAll(arrayList);
        }
        return sanitationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean trimFields$lambda$10(String str, String str2) {
        j.d(str2);
        return z.w(str2, 2, str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAttribute trimTooLongStringValues$lambda$7(JsonAttribute jsonAttribute) {
        j.g(jsonAttribute, "jsonAttribute");
        if (!isPrimitive(jsonAttribute.getValue())) {
            String string = jsonAttribute.getValue().toString();
            if (string.length() >= 5000) {
                Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "sanitation: value of key '" + jsonAttribute.getKey() + "' is too long and thus is trimmed; original length: " + string.length() + "; ");
                return new JsonAttribute(jsonAttribute.getKey(), C2578C.e0(5000, string));
            }
        }
        return jsonAttribute;
    }
}
