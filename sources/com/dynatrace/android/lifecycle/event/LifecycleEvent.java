package com.dynatrace.android.lifecycle.event;

import We.s;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import java.lang.Enum;

/* JADX INFO: loaded from: classes2.dex */
public class LifecycleEvent<T extends Enum<T>> {
    private final T eventType;
    private final int sequenceNumber;
    private final long timestamp;

    public LifecycleEvent(T t5, MeasurementPoint measurementPoint) {
        this.eventType = t5;
        this.timestamp = measurementPoint.getTimestamp();
        this.sequenceNumber = measurementPoint.getSequenceNumber();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LifecycleEvent lifecycleEvent = (LifecycleEvent) obj;
            if (this.timestamp == lifecycleEvent.timestamp && this.sequenceNumber == lifecycleEvent.sequenceNumber && this.eventType == lifecycleEvent.eventType) {
                return true;
            }
        }
        return false;
    }

    public T getEventType() {
        return this.eventType;
    }

    public int getSequenceNumber() {
        return this.sequenceNumber;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = this.eventType.hashCode() * 31;
        long j = this.timestamp;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.sequenceNumber;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LifecycleEvent{eventType=");
        sb2.append(this.eventType);
        sb2.append(", timestamp=");
        sb2.append(this.timestamp);
        sb2.append(", sequenceNumber=");
        return s.m(sb2, this.sequenceNumber, '}');
    }
}
