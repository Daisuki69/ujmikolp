package com.dynatrace.android.lifecycle.appstart;

import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.useraction.AppStartPlaceholderSegment;
import com.dynatrace.android.useraction.DTXAutoActionWrapper;

/* JADX INFO: loaded from: classes2.dex */
public interface AppStartAggregator {
    void aggregatePlaceholder(AppStartPlaceholderSegment appStartPlaceholderSegment);

    DTXAutoActionWrapper determineUserAction(String str, MeasurementPoint measurementPoint);
}
