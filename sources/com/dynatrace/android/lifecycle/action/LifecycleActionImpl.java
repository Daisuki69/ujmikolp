package com.dynatrace.android.lifecycle.action;

import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.lifecycle.event.LifecycleEvent;
import com.dynatrace.android.useraction.LifecyclePlaceholderSegment;
import com.dynatrace.android.useraction.UserAction;
import java.lang.Enum;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class LifecycleActionImpl<T extends Enum<T>> implements LifecycleAction<T> {
    private MeasurementPoint endPoint;
    private final String name;
    private final UserAction parentAction;

    @Deprecated
    private final LifecyclePlaceholderSegment placeholderSegment;
    private final MeasurementPoint startPoint;
    private final Map<T, MeasurementPoint> lifecycleEvents = new HashMap();
    private final AtomicBoolean isFinalized = new AtomicBoolean(false);

    public static class ImmutableData {
        private String name;
        private UserAction parentAction;

        @Deprecated
        private LifecyclePlaceholderSegment placeholderSegment;
        private MeasurementPoint startPoint;

        public String getName() {
            return this.name;
        }

        public UserAction getParentAction() {
            return this.parentAction;
        }

        public LifecyclePlaceholderSegment getPlaceholderSegment() {
            return this.placeholderSegment;
        }

        public MeasurementPoint getStartPoint() {
            return this.startPoint;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setParentAction(UserAction userAction) {
            this.parentAction = userAction;
        }

        @Deprecated
        public void setPlaceholderSegment(LifecyclePlaceholderSegment lifecyclePlaceholderSegment) {
            this.placeholderSegment = lifecyclePlaceholderSegment;
        }

        public void setStartPoint(MeasurementPoint measurementPoint) {
            this.startPoint = measurementPoint;
        }
    }

    public LifecycleActionImpl(ImmutableData immutableData) {
        this.name = immutableData.getName();
        this.startPoint = immutableData.getStartPoint();
        this.parentAction = immutableData.getParentAction();
        this.placeholderSegment = immutableData.getPlaceholderSegment();
    }

    @Override // com.dynatrace.android.lifecycle.action.LifecycleAction
    public void addEvent(LifecycleEvent<T> lifecycleEvent) {
        this.lifecycleEvents.put((T) lifecycleEvent.getEventType(), new MeasurementPoint(lifecycleEvent.getTimestamp(), lifecycleEvent.getSequenceNumber()));
    }

    @Override // com.dynatrace.android.lifecycle.action.LifecycleAction
    public MeasurementPoint getEndPoint() {
        return this.endPoint;
    }

    @Override // com.dynatrace.android.lifecycle.action.LifecycleAction
    public Map<T, MeasurementPoint> getLifecycleEvents() {
        return this.lifecycleEvents;
    }

    @Override // com.dynatrace.android.lifecycle.action.LifecycleAction
    public String getName() {
        return this.name;
    }

    @Override // com.dynatrace.android.lifecycle.action.LifecycleAction
    public UserAction getParentAction() {
        return this.parentAction;
    }

    @Override // com.dynatrace.android.lifecycle.action.LifecycleAction
    public LifecyclePlaceholderSegment getPlaceholderSegment() {
        return this.placeholderSegment;
    }

    @Override // com.dynatrace.android.lifecycle.action.LifecycleAction
    public MeasurementPoint getStartPoint() {
        return this.startPoint;
    }

    @Override // com.dynatrace.android.lifecycle.action.LifecycleAction
    public AtomicBoolean isFinalized() {
        return this.isFinalized;
    }

    @Override // com.dynatrace.android.lifecycle.action.LifecycleAction
    public void setEndPoint(MeasurementPoint measurementPoint) {
        this.endPoint = measurementPoint;
    }

    public String toString() {
        return "LifecycleActionImpl{name='" + this.name + "', startPoint=" + this.startPoint + ", endPoint=" + this.endPoint + ", parentAction=" + this.parentAction + ", lifecycleEvents=" + this.lifecycleEvents + '}';
    }
}
