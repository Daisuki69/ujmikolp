package com.dynatrace.agent.storage.db;

import We.s;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@Entity(tableName = "events")
public final class EventRecord {
    private final String event;
    private final int eventSizeBytes;

    @PrimaryKey(autoGenerate = true)
    private final long id;
    private final boolean isPriorityData;
    private final long timestamp;

    public EventRecord(long j, String event, long j6, boolean z4, int i) {
        j.g(event, "event");
        this.id = j;
        this.event = event;
        this.timestamp = j6;
        this.isPriorityData = z4;
        this.eventSizeBytes = i;
    }

    public static /* synthetic */ EventRecord copy$default(EventRecord eventRecord, long j, String str, long j6, boolean z4, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = eventRecord.id;
        }
        long j7 = j;
        if ((i4 & 2) != 0) {
            str = eventRecord.event;
        }
        String str2 = str;
        if ((i4 & 4) != 0) {
            j6 = eventRecord.timestamp;
        }
        long j9 = j6;
        if ((i4 & 8) != 0) {
            z4 = eventRecord.isPriorityData;
        }
        boolean z5 = z4;
        if ((i4 & 16) != 0) {
            i = eventRecord.eventSizeBytes;
        }
        return eventRecord.copy(j7, str2, j9, z5, i);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.event;
    }

    public final long component3() {
        return this.timestamp;
    }

    public final boolean component4() {
        return this.isPriorityData;
    }

    public final int component5() {
        return this.eventSizeBytes;
    }

    public final EventRecord copy(long j, String event, long j6, boolean z4, int i) {
        j.g(event, "event");
        return new EventRecord(j, event, j6, z4, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventRecord)) {
            return false;
        }
        EventRecord eventRecord = (EventRecord) obj;
        return this.id == eventRecord.id && j.b(this.event, eventRecord.event) && this.timestamp == eventRecord.timestamp && this.isPriorityData == eventRecord.isPriorityData && this.eventSizeBytes == eventRecord.eventSizeBytes;
    }

    public final String getEvent() {
        return this.event;
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
        int iC = AbstractC1414e.c(((int) (j ^ (j >>> 32))) * 31, 31, this.event);
        long j6 = this.timestamp;
        return ((((iC + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.isPriorityData ? 1231 : 1237)) * 31) + this.eventSizeBytes;
    }

    public final boolean isPriorityData() {
        return this.isPriorityData;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord(id=");
        sb2.append(this.id);
        sb2.append(", event=");
        sb2.append(this.event);
        sb2.append(", timestamp=");
        sb2.append(this.timestamp);
        sb2.append(", isPriorityData=");
        sb2.append(this.isPriorityData);
        sb2.append(", eventSizeBytes=");
        return s.m(sb2, this.eventSizeBytes, ')');
    }

    public /* synthetic */ EventRecord(long j, String str, long j6, boolean z4, int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j, str, j6, z4, i);
    }
}
