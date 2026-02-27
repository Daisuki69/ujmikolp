package io.split.android.client.dtos;

import g3.InterfaceC1498b;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class SerializableEvent {
    public static final String EVENT_TYPE_FIELD = "eventTypeId";
    public static final String KEY_FIELD = "key";
    public static final String PROPERTIES_FIELD = "properties";
    public static final String TIMESTAMP_FIELD = "timestamp";
    public static final String TRAFFIC_TYPE_NAME_FIELD = "trafficTypeName";
    public static final String VALUE_FIELD = "value";

    @InterfaceC1498b(EVENT_TYPE_FIELD)
    public String eventTypeId;

    @InterfaceC1498b("key")
    public String key;

    @InterfaceC1498b(PROPERTIES_FIELD)
    public Map<String, Object> properties;

    @InterfaceC1498b("timestamp")
    public long timestamp;

    @InterfaceC1498b(TRAFFIC_TYPE_NAME_FIELD)
    public String trafficTypeName;

    @InterfaceC1498b("value")
    public double value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Event event = (Event) obj;
            if (Double.compare(event.value, this.value) == 0 && this.timestamp == event.timestamp && Objects.equals(this.eventTypeId, event.eventTypeId) && Objects.equals(this.trafficTypeName, event.trafficTypeName) && Objects.equals(this.key, event.key) && Objects.equals(this.properties, event.properties)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.eventTypeId, this.trafficTypeName, this.key, Double.valueOf(this.value), Long.valueOf(this.timestamp));
    }
}
