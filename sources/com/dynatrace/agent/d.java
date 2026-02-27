package com.dynatrace.agent;

import com.dynatrace.agent.OneAgentEventDispatcher;
import com.dynatrace.agent.events.enrichment.AttributeSupplier;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements AttributeSupplier {
    @Override // com.dynatrace.agent.events.enrichment.AttributeSupplier
    public final List supply() {
        return OneAgentEventDispatcher.C11353.invokeSuspend$lambda$1();
    }
}
