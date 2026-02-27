package com.dynatrace.agent.events.enrichment;

import java.util.List;
import kotlin.jvm.internal.j;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AttributeSupplierKt {
    public static final void addAttribute(List<EnrichmentAttribute> list, String key, Object obj) {
        j.g(list, "<this>");
        j.g(key, "key");
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        j.d(obj);
        list.add(new EnrichmentAttribute(key, obj));
    }

    public static final void addAttributeIfValueNotNull(List<EnrichmentAttribute> list, String key, Object obj) {
        j.g(list, "<this>");
        j.g(key, "key");
        if (obj != null) {
            addAttribute(list, key, obj);
        }
    }
}
