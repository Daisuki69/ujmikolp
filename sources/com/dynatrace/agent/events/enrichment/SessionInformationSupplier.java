package com.dynatrace.agent.events.enrichment;

import cj.r;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.metrics.SessionInformationMetrics;
import dj.C1406d;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionInformationSupplier implements AttributeSupplier {
    private final SessionInformationMetrics sessionInformationMetrics;

    public SessionInformationSupplier(SessionInformationMetrics sessionInformationMetrics) {
        j.g(sessionInformationMetrics, "sessionInformationMetrics");
        this.sessionInformationMetrics = sessionInformationMetrics;
    }

    @Override // com.dynatrace.agent.events.enrichment.AttributeSupplier
    public List<EnrichmentAttribute> supply() {
        C1406d c1406dB = r.b();
        AttributeSupplierKt.addAttribute(c1406dB, EventKeys.DT.RUM.INSTANCE_ID, this.sessionInformationMetrics.getInstanceId());
        AttributeSupplierKt.addAttribute(c1406dB, EventKeys.DT.RUM.SID, this.sessionInformationMetrics.getSessionId());
        return r.a(c1406dB);
    }
}
