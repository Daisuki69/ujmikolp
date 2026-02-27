package com.dynatrace.agent;

import com.dynatrace.agent.events.enrichment.EnrichmentPipelineKt;
import com.dynatrace.agent.storage.preference.MetricsData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9580b;

    public /* synthetic */ c(Object obj, int i) {
        this.f9579a = i;
        this.f9580b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9579a) {
            case 0:
                return EnrichmentPipelineKt.collectStoredMetricsSuppliers((MetricsData) this.f9580b);
            default:
                return OneAgentEventDispatcher.dispatchInternalEvent$lambda$7((OneAgentEventDispatcher) this.f9580b);
        }
    }
}
