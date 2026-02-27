package com.dynatrace.agent.events.enrichment;

import cj.r;
import com.dynatrace.agent.events.enrichment.EventKeys;
import dj.C1406d;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtectedAttributesSupplier implements AttributeSupplier {
    public static final Companion Companion = new Companion(null);
    public static final String RUM_SCHEMA_VERSION = "0.22.0";
    private final String agentVersion;
    private final String applicationId;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ProtectedAttributesSupplier(String applicationId, String agentVersion) {
        j.g(applicationId, "applicationId");
        j.g(agentVersion, "agentVersion");
        this.applicationId = applicationId;
        this.agentVersion = agentVersion;
    }

    @Override // com.dynatrace.agent.events.enrichment.AttributeSupplier
    public List<EnrichmentAttribute> supply() {
        C1406d c1406dB = r.b();
        AttributeSupplierKt.addAttributeIfValueNotNull(c1406dB, EventKeys.DT.RUM.SCHEMA_VERSION, RUM_SCHEMA_VERSION);
        AttributeSupplierKt.addAttributeIfValueNotNull(c1406dB, EventKeys.DT.RUM.AGENT_VERSION, this.agentVersion);
        AttributeSupplierKt.addAttributeIfValueNotNull(c1406dB, EventKeys.DT.RUM.AGENT_TYPE, "android");
        AttributeSupplierKt.addAttributeIfValueNotNull(c1406dB, EventKeys.DT.RUM.APPLICATION_ID, this.applicationId);
        return r.a(c1406dB);
    }
}
