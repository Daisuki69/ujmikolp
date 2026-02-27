package com.dynatrace.android.agent.events.eventsapi;

import com.dynatrace.agent.events.enrichment.EventKeys;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class CopyAttributeFilter implements AttributeFilter {
    private static final String REGEX = "dt\\.agent\\..*";
    private final Pattern overridable_dt_keys = Pattern.compile(REGEX);

    @Override // com.dynatrace.android.agent.events.eventsapi.AttributeFilter
    public boolean keepAttribute(String str) {
        return str.startsWith(EventKeys.DT.NAMESPACE) ? this.overridable_dt_keys.matcher(str).matches() : !str.equals("dt");
    }
}
