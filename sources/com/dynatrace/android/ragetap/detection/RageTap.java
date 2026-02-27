package com.dynatrace.android.ragetap.detection;

import We.s;

/* JADX INFO: loaded from: classes2.dex */
public class RageTap {
    private final TapData firstTap;
    private final TapData lastTap;
    private final int numOfTaps;

    public RageTap(TapData tapData, TapData tapData2, int i) {
        this.firstTap = tapData;
        this.lastTap = tapData2;
        this.numOfTaps = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RageTap rageTap = (RageTap) obj;
            if (this.numOfTaps == rageTap.numOfTaps && this.firstTap.equals(rageTap.firstTap) && this.lastTap.equals(rageTap.lastTap)) {
                return true;
            }
        }
        return false;
    }

    public TapData getFirstTap() {
        return this.firstTap;
    }

    public TapData getLastTap() {
        return this.lastTap;
    }

    public int getNumOfTaps() {
        return this.numOfTaps;
    }

    public int hashCode() {
        return ((this.lastTap.hashCode() + (this.firstTap.hashCode() * 31)) * 31) + this.numOfTaps;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RageTap{firstTap=");
        sb2.append(this.firstTap);
        sb2.append(", lastTap=");
        sb2.append(this.lastTap);
        sb2.append(", numOfTaps=");
        return s.m(sb2, this.numOfTaps, '}');
    }
}
