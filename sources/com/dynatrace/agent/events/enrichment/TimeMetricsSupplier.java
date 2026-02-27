package com.dynatrace.agent.events.enrichment;

import cj.r;
import dj.C1406d;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.time.a;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeMetricsSupplier implements AttributeSupplier {
    private final TimeMetrics metrics;

    public TimeMetricsSupplier(TimeMetrics metrics) {
        j.g(metrics, "metrics");
        this.metrics = metrics;
    }

    public final TimeMetrics getMetrics() {
        return this.metrics;
    }

    @Override // com.dynatrace.agent.events.enrichment.AttributeSupplier
    public List<EnrichmentAttribute> supply() {
        C1406d c1406dB = r.b();
        AttributeSupplierKt.addAttribute(c1406dB, EventKeys.START_TIME, Long.valueOf(this.metrics.getStartTime()));
        AttributeSupplierKt.addAttribute(c1406dB, "duration", Long.valueOf(a.d(this.metrics.m168getDurationUwyO8pc())));
        return r.a(c1406dB);
    }
}
