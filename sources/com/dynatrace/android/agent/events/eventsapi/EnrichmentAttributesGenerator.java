package com.dynatrace.android.agent.events.eventsapi;

import com.dynatrace.agent.events.enrichment.EventKeys;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class EnrichmentAttributesGenerator {
    private static final String EVENT_TYPE_KEY = "event.type";
    public static final long SEND_NOW_PLACEHOLDER = 1000000000000000000L;
    private EventMetrics eventMetrics;
    private long timeStampNanos;

    public long calculateAttributesSize(String str, JSONObject jSONObject) {
        int length;
        int length2 = jSONObject.length();
        if (jSONObject.has(EVENT_TYPE_KEY)) {
            j = (length2 > 1 ? 1L : 0L) + ((long) 13);
            length2--;
            try {
                try {
                    length = ("\"" + jSONObject.getString(EVENT_TYPE_KEY) + "\"").getBytes(StandardCharsets.UTF_8).length;
                } catch (JSONException unused) {
                }
            } catch (JSONException unused2) {
                length = jSONObject.get(EVENT_TYPE_KEY).toString().getBytes(StandardCharsets.UTF_8).length;
            }
            j += (long) length;
        }
        String string = jSONObject.toString();
        Charset charset = StandardCharsets.UTF_8;
        return ((long) ("\"event.type\":\"" + str + "\"").getBytes(charset).length) + ((long) (length2 <= 0 ? 0 : 1)) + (((long) string.getBytes(charset).length) - j);
    }

    public Set<EnrichmentAttribute> generateBizEventAttributes(String str, JSONObject jSONObject) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(EnrichmentAttribute.overridableEnrichmentAttribute("timestamp", Long.valueOf(this.timeStampNanos)));
        treeSet.add(EnrichmentAttribute.overridableEnrichmentAttribute("event.provider", this.eventMetrics.getAppBundle()));
        treeSet.add(EnrichmentAttribute.mandatoryEnrichmentAttribute(EVENT_TYPE_KEY, str));
        treeSet.add(EnrichmentAttribute.mandatoryEnrichmentAttribute("event.kind", "BIZ_EVENT"));
        treeSet.add(EnrichmentAttribute.mandatoryEnrichmentAttribute("dt.rum.custom_attributes_size", Long.valueOf(calculateAttributesSize(str, jSONObject))));
        return insertEventMetricsToAttributes(treeSet, this.eventMetrics);
    }

    public Set<EnrichmentAttribute> generateEventAttributes(String str) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(EnrichmentAttribute.overridableEnrichmentAttribute("timestamp", Long.valueOf(this.timeStampNanos)));
        treeSet.add(EnrichmentAttribute.mandatoryEnrichmentAttribute("event.name", str));
        treeSet.add(EnrichmentAttribute.overridableEnrichmentAttribute("event.kind", "RUM_EVENT"));
        treeSet.add(EnrichmentAttribute.overridableEnrichmentAttribute("event.provider", this.eventMetrics.getAppBundle()));
        return insertEventMetricsToAttributes(treeSet, this.eventMetrics);
    }

    public Set<EnrichmentAttribute> insertEventMetricsToAttributes(Set<EnrichmentAttribute> set, EventMetrics eventMetrics) {
        if (eventMetrics == null) {
            return set;
        }
        set.add(EnrichmentAttribute.mandatoryEnrichmentAttribute(EventKeys.DT.RUM.APPLICATION_ID, eventMetrics.getApplicationId()));
        set.add(EnrichmentAttribute.mandatoryEnrichmentAttribute(EventKeys.DT.RUM.INSTANCE_ID, eventMetrics.getInstanceId()));
        set.add(EnrichmentAttribute.mandatoryEnrichmentAttribute(EventKeys.DT.RUM.SID, eventMetrics.getSessionId()));
        set.add(EnrichmentAttribute.mandatoryEnrichmentAttribute(EventKeys.DT.RUM.SCHEMA_VERSION, eventMetrics.getSchemaVersion()));
        set.add(EnrichmentAttribute.overridableEnrichmentAttribute(EventKeys.DEVICE.MANUFACTURER, eventMetrics.getDeviceManufacturer()));
        set.add(EnrichmentAttribute.overridableEnrichmentAttribute(EventKeys.DEVICE.MODEL_IDENTIFIER, eventMetrics.getDeviceModelIdentifier()));
        set.add(EnrichmentAttribute.overridableEnrichmentAttribute(EventKeys.DEVICE.IS_ROOTED, Boolean.valueOf(eventMetrics.isDeviceRooted())));
        set.add(EnrichmentAttribute.overridableEnrichmentAttribute(EventKeys.OS.NAME, eventMetrics.getOsName()));
        set.add(EnrichmentAttribute.overridableEnrichmentAttribute(EventKeys.OS.VERSION, eventMetrics.getOsVersion()));
        set.add(EnrichmentAttribute.overridableEnrichmentAttribute(EventKeys.APP.VERSION, eventMetrics.getAppVersion()));
        set.add(EnrichmentAttribute.overridableEnrichmentAttribute(EventKeys.APP.SHORT_VERSION, eventMetrics.getAppShortVersion()));
        set.add(EnrichmentAttribute.overridableEnrichmentAttribute(EventKeys.APP.BUNDLE, eventMetrics.getAppBundle()));
        return set;
    }

    public EnrichmentAttributesGenerator withEventMetrics(EventMetrics eventMetrics) {
        this.eventMetrics = eventMetrics;
        return this;
    }

    public EnrichmentAttributesGenerator withTimeStamp(long j) {
        this.timeStampNanos = j;
        return this;
    }
}
