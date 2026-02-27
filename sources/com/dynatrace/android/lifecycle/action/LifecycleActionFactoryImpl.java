package com.dynatrace.android.lifecycle.action;

import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.lifecycle.action.LifecycleActionImpl;
import com.dynatrace.android.lifecycle.event.ActivityEventType;
import com.dynatrace.android.useraction.DTXAutoActionWrapper;
import com.dynatrace.android.useraction.LifecyclePlaceholderSegment;

/* JADX INFO: loaded from: classes2.dex */
public class LifecycleActionFactoryImpl implements LifecycleActionFactory {
    @Override // com.dynatrace.android.lifecycle.action.LifecycleActionFactory
    public LifecycleAction<ActivityEventType> createActivityLifecycleAction(String str, DTXAutoActionWrapper dTXAutoActionWrapper, MeasurementPoint measurementPoint) {
        LifecycleActionImpl.ImmutableData immutableData = new LifecycleActionImpl.ImmutableData();
        immutableData.setName(str);
        immutableData.setStartPoint(measurementPoint);
        immutableData.setParentAction(dTXAutoActionWrapper);
        immutableData.setPlaceholderSegment(new LifecyclePlaceholderSegment(str, dTXAutoActionWrapper));
        return new LifecycleActionImpl(immutableData);
    }
}
