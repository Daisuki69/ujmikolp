package com.dynatrace.android.ragetap.detection;

/* JADX INFO: loaded from: classes2.dex */
public class TapData {
    private final TapEventData tapDown;
    private final TapEventData tapUp;

    public TapData(TapEventData tapEventData, TapEventData tapEventData2) {
        this.tapDown = tapEventData;
        this.tapUp = tapEventData2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TapData tapData = (TapData) obj;
            if (this.tapDown.equals(tapData.tapDown) && this.tapUp.equals(tapData.tapUp)) {
                return true;
            }
        }
        return false;
    }

    public TapEventData getTapDown() {
        return this.tapDown;
    }

    public TapEventData getTapUp() {
        return this.tapUp;
    }

    public int hashCode() {
        return this.tapUp.hashCode() + (this.tapDown.hashCode() * 31);
    }

    public String toString() {
        return "TapData{tapDown=" + this.tapDown + ", tapUp=" + this.tapUp + '}';
    }
}
