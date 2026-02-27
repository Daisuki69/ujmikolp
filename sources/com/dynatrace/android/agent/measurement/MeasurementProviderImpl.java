package com.dynatrace.android.agent.measurement;

import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public class MeasurementProviderImpl implements MeasurementProvider {
    private final TimeLineProvider timeLineProvider;

    public MeasurementProviderImpl(TimeLineProvider timeLineProvider) {
        this.timeLineProvider = timeLineProvider;
    }

    @Override // com.dynatrace.android.agent.measurement.MeasurementProvider
    public MeasurementPoint measure() {
        return new MeasurementPoint(this.timeLineProvider.now(), Utility.getEventSeqNum());
    }
}
