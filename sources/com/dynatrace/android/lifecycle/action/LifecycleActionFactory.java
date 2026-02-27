package com.dynatrace.android.lifecycle.action;

import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.lifecycle.event.ActivityEventType;
import com.dynatrace.android.useraction.DTXAutoActionWrapper;

/* JADX INFO: loaded from: classes2.dex */
public interface LifecycleActionFactory {
    LifecycleAction<ActivityEventType> createActivityLifecycleAction(String str, DTXAutoActionWrapper dTXAutoActionWrapper, MeasurementPoint measurementPoint);
}
