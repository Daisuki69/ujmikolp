package com.dynatrace.android.agent.events.lifecycle;

import We.s;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.events.lifecycle.DisplaySegment;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.SegmentFactory;
import com.dynatrace.android.lifecycle.SimpleClassNameGenerator;
import com.dynatrace.android.lifecycle.action.LifecycleAction;
import com.dynatrace.android.lifecycle.event.ActivityEventType;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class DisplaySegmentFactory implements SegmentFactory<LifecycleAction<ActivityEventType>, DisplaySegment> {
    private static final String LOG_TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "DisplaySegmentFactory");

    private static MeasurementPoint toRelativeMeasurementPoint(long j, MeasurementPoint measurementPoint) {
        if (measurementPoint == null) {
            return null;
        }
        return new MeasurementPoint(measurementPoint.getTimestamp() - j, measurementPoint.getSequenceNumber());
    }

    @Override // com.dynatrace.android.lifecycle.SegmentFactory
    public DisplaySegment createSegment(LifecycleAction<ActivityEventType> lifecycleAction, Session session, int i) {
        DisplaySegment displaySegmentBuild;
        synchronized (lifecycleAction) {
            try {
                if (Global.DEBUG) {
                    Utility.zlogD(LOG_TAG, "captured lifecycle action: " + lifecycleAction);
                }
                Map<T, MeasurementPoint> lifecycleEvents = lifecycleAction.getLifecycleEvents();
                long sessionStartTime = session.getSessionStartTime();
                long timestamp = lifecycleAction.getStartPoint().getTimestamp();
                MeasurementPoint relativeMeasurementPoint = toRelativeMeasurementPoint(sessionStartTime, lifecycleAction.getStartPoint());
                DisplaySegment.Builder builderWithParentActionId = new DisplaySegment.Builder().withLifecycleOwner(new SimpleClassNameGenerator().customize(lifecycleAction.getName())).withSession(session).withServerId(i).withParentActionId(lifecycleAction.getParentAction() != null ? lifecycleAction.getParentAction().getTagId() : 0L);
                ActivityEventType activityEventType = ActivityEventType.ON_CREATE;
                displaySegmentBuild = builderWithParentActionId.withEventType(lifecycleEvents.containsKey(activityEventType) ? EventType.DISPLAY : EventType.REDISPLAY).withActionCreationPoint(relativeMeasurementPoint).withCreateEvent(toRelativeMeasurementPoint(timestamp, lifecycleEvents.get(activityEventType))).withStartEvent(toRelativeMeasurementPoint(timestamp, lifecycleEvents.get(ActivityEventType.ON_START))).withResumeEvent(toRelativeMeasurementPoint(timestamp, lifecycleEvents.get(ActivityEventType.ON_RESUME))).withEndPoint(toRelativeMeasurementPoint(timestamp, lifecycleAction.getEndPoint())).withForwardToGrail(true).build();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return displaySegmentBuild;
    }
}
