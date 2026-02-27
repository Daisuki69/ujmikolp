package com.dynatrace.android.ragetap.detection;

/* JADX INFO: loaded from: classes2.dex */
public class TapEventData {
    private final long eventTime;
    private final long timestamp;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f9594x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f9595y;

    public TapEventData(float f, float f3, long j, long j6) {
        this.f9594x = f;
        this.f9595y = f3;
        this.timestamp = j;
        this.eventTime = j6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TapEventData tapEventData = (TapEventData) obj;
            if (Float.compare(tapEventData.f9594x, this.f9594x) == 0 && Float.compare(tapEventData.f9595y, this.f9595y) == 0 && this.timestamp == tapEventData.timestamp && this.eventTime == tapEventData.eventTime) {
                return true;
            }
        }
        return false;
    }

    public long getEventTime() {
        return this.eventTime;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public float getX() {
        return this.f9594x;
    }

    public float getY() {
        return this.f9595y;
    }

    public int hashCode() {
        float f = this.f9594x;
        int iFloatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
        float f3 = this.f9595y;
        int iFloatToIntBits2 = f3 != 0.0f ? Float.floatToIntBits(f3) : 0;
        long j = this.timestamp;
        int i = (((iFloatToIntBits + iFloatToIntBits2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j6 = this.eventTime;
        return i + ((int) (j6 ^ (j6 >>> 32)));
    }

    public String toString() {
        return "TapEventData{x=" + this.f9594x + ", y=" + this.f9595y + ", timestamp=" + this.timestamp + ", eventTime=" + this.eventTime + '}';
    }
}
