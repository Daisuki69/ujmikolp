package com.dynatrace.agent.events.enrichment;

import cj.r;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.view.ViewContext;
import dj.C1406d;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewContextSupplier implements AttributeSupplier {
    private final ViewContext viewContext;

    public ViewContextSupplier(ViewContext viewContext) {
        j.g(viewContext, "viewContext");
        this.viewContext = viewContext;
    }

    @Override // com.dynatrace.agent.events.enrichment.AttributeSupplier
    public List<EnrichmentAttribute> supply() {
        C1406d c1406dB = r.b();
        AttributeSupplierKt.addAttribute(c1406dB, EventKeys.VIEW.ID, this.viewContext.getId());
        AttributeSupplierKt.addAttribute(c1406dB, EventKeys.VIEW.NAME, this.viewContext.getName());
        return r.a(c1406dB);
    }
}
