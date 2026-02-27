package com.dynatrace.android.lifecycle;

import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.lifecycle.action.LifecycleAction;
import com.dynatrace.android.lifecycle.event.ActivityEventType;
import com.dynatrace.android.useraction.DTXAutoActionWrapper;
import com.dynatrace.android.useraction.UserAction;

/* JADX INFO: loaded from: classes2.dex */
public interface ActionAggregator {
    void aggregateAction(LifecycleAction<ActivityEventType> lifecycleAction, UserAction userAction, LifecycleController lifecycleController);

    DTXAutoActionWrapper determineUserAction(String str, MeasurementPoint measurementPoint);
}
