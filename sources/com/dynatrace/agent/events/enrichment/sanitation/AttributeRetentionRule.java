package com.dynatrace.agent.events.enrichment.sanitation;

/* JADX INFO: loaded from: classes2.dex */
public interface AttributeRetentionRule {
    boolean shouldKeep(JsonAttribute jsonAttribute);
}
