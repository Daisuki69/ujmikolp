package com.dynatrace.android.lifecycle.action;

import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.lifecycle.event.LifecycleEvent;
import com.dynatrace.android.useraction.LifecyclePlaceholderSegment;
import com.dynatrace.android.useraction.UserAction;
import java.lang.Enum;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public interface LifecycleAction<T extends Enum<T>> {
    void addEvent(LifecycleEvent<T> lifecycleEvent);

    MeasurementPoint getEndPoint();

    Map<T, MeasurementPoint> getLifecycleEvents();

    String getName();

    UserAction getParentAction();

    @Deprecated
    LifecyclePlaceholderSegment getPlaceholderSegment();

    MeasurementPoint getStartPoint();

    AtomicBoolean isFinalized();

    void setEndPoint(MeasurementPoint measurementPoint);
}
