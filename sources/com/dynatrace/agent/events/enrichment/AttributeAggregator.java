package com.dynatrace.agent.events.enrichment;

import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class AttributeAggregator {
    private final List<AttributeSupplier> suppliers;

    /* JADX WARN: Multi-variable type inference failed */
    public AttributeAggregator(List<? extends AttributeSupplier> suppliers) {
        j.g(suppliers, "suppliers");
        this.suppliers = suppliers;
    }

    public final Map<String, EnrichmentAttribute> aggregatedAttributes() {
        TreeMap treeMap = new TreeMap();
        Iterator<AttributeSupplier> it = this.suppliers.iterator();
        while (it.hasNext()) {
            for (EnrichmentAttribute enrichmentAttribute : it.next().supply()) {
                if (treeMap.containsKey(enrichmentAttribute.getKey())) {
                    Utility.devLog(OneAgentLoggingKt.TAG_ENRICHMENT, "attribute aggregation: overriding existing attribute " + treeMap.get(enrichmentAttribute.getKey()) + " with " + enrichmentAttribute);
                }
                treeMap.put(enrichmentAttribute.getKey(), enrichmentAttribute);
            }
        }
        return treeMap;
    }
}
