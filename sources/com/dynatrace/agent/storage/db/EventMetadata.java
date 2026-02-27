package com.dynatrace.agent.storage.db;

import We.s;

/* JADX INFO: loaded from: classes2.dex */
public final class EventMetadata {
    private final int eventSizeBytes;
    private final long id;
    private final boolean isPriorityData;
    private final long timestamp;

    public EventMetadata(long j, long j6, boolean z4, int i) {
        this.id = j;
        this.timestamp = j6;
        this.isPriorityData = z4;
        this.eventSizeBytes = i;
    }

    public static /* synthetic */ EventMetadata copy$default(EventMetadata eventMetadata, long j, long j6, boolean z4, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = eventMetadata.id;
        }
        long j7 = j;
        if ((i4 & 2) != 0) {
            j6 = eventMetadata.timestamp;
        }
        long j9 = j6;
        if ((i4 & 4) != 0) {
            z4 = eventMetadata.isPriorityData;
        }
        boolean z5 = z4;
        if ((i4 & 8) != 0) {
            i = eventMetadata.eventSizeBytes;
        }
        return eventMetadata.copy(j7, j9, z5, i);
    }

    public final long component1() {
        return this.id;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final boolean component3() {
        return this.isPriorityData;
    }

    public final int component4() {
        return this.eventSizeBytes;
    }

    public final EventMetadata copy(long j, long j6, boolean z4, int i) {
        return new EventMetadata(j, j6, z4, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventMetadata)) {
            return false;
        }
        EventMetadata eventMetadata = (EventMetadata) obj;
        return this.id == eventMetadata.id && this.timestamp == eventMetadata.timestamp && this.isPriorityData == eventMetadata.isPriorityData && this.eventSizeBytes == eventMetadata.eventSizeBytes;
    }

    public final int getEventSizeBytes() {
        return this.eventSizeBytes;
    }

    public final long getId() {
        return this.id;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        long j = this.id;
        long j6 = this.timestamp;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j6 >>> 32) ^ j6))) * 31) + (this.isPriorityData ? 1231 : 1237)) * 31) + this.eventSizeBytes;
    }

    public final boolean isPriorityData() {
        return this.isPriorityData;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EventMetadata(id=");
        sb2.append(this.id);
        sb2.append(", timestamp=");
        sb2.append(this.timestamp);
        sb2.append(", isPriorityData=");
        sb2.append(this.isPriorityData);
        sb2.append(", eventSizeBytes=");
        return s.m(sb2, this.eventSizeBytes, ')');
    }
}
