package com.dynatrace.android.agent.measurement;

/* JADX INFO: loaded from: classes2.dex */
public class MeasurementPoint {
    private final int sequenceNumber;
    private final long timestamp;

    public MeasurementPoint(long j, int i) {
        this.timestamp = j;
        this.sequenceNumber = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MeasurementPoint measurementPoint = (MeasurementPoint) obj;
            if (this.sequenceNumber == measurementPoint.sequenceNumber && this.timestamp == measurementPoint.timestamp) {
                return true;
            }
        }
        return false;
    }

    public int getSequenceNumber() {
        return this.sequenceNumber;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int i = this.sequenceNumber * 31;
        long j = this.timestamp;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "MeasurementPoint{sequenceNumber=" + this.sequenceNumber + ", timestamp=" + this.timestamp + '}';
    }
}
