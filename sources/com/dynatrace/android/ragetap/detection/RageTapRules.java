package com.dynatrace.android.ragetap.detection;

import com.dynatrace.android.agent.conf.RageTapConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class RageTapRules {
    private final RageTapConfiguration configuration;

    public RageTapRules(RageTapConfiguration rageTapConfiguration) {
        this.configuration = rageTapConfiguration;
    }

    public boolean exceedsDispersionRadius(TapData tapData, TapData tapData2) {
        float x6 = tapData2.getTapDown().getX() - tapData.getTapDown().getX();
        float y7 = tapData2.getTapDown().getY() - tapData.getTapDown().getY();
        return (y7 * y7) + (x6 * x6) > ((float) (this.configuration.getDispersionRadius() * this.configuration.getDispersionRadius()));
    }

    public boolean exceedsTapDuration(TapData tapData) {
        return tapData.getTapUp().getTimestamp() - tapData.getTapDown().getTimestamp() > ((long) this.configuration.getTapDuration());
    }

    public boolean exceedsTimespanDifference(TapData tapData, TapData tapData2) {
        return exceedsTimespanDifference(tapData, tapData2.getTapDown().getTimestamp());
    }

    public boolean hasMinimumNumberOfTaps(int i) {
        return i >= this.configuration.getMinimumNumberOfTaps();
    }

    public boolean exceedsTimespanDifference(TapData tapData, long j) {
        return j - tapData.getTapUp().getTimestamp() > ((long) this.configuration.getTimespanDifference());
    }
}
