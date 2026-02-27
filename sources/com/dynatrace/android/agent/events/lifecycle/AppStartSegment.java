package com.dynatrace.android.agent.events.lifecycle;

import com.dynatrace.android.agent.CustomSegment;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public class AppStartSegment extends CustomSegment {
    private final String activityName;
    private final MeasurementPoint endPoint;
    private final boolean forwardToGrail;
    private final MeasurementPoint startPoint;

    public static class Builder {
        private String activityName;
        private MeasurementPoint endPoint;
        private EventType eventType;
        private boolean forwardToGrail;
        private long parentActionId;
        private int serverId;
        private Session session;
        private MeasurementPoint startPoint;

        public AppStartSegment build() {
            return new AppStartSegment(this);
        }

        public Builder withActivityName(String str) {
            this.activityName = str;
            return this;
        }

        public Builder withEndPoint(MeasurementPoint measurementPoint) {
            this.endPoint = measurementPoint;
            return this;
        }

        public Builder withEventType(EventType eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder withForwardToGrail(boolean z4) {
            this.forwardToGrail = z4;
            return this;
        }

        public Builder withParentActionId(long j) {
            this.parentActionId = j;
            return this;
        }

        public Builder withServerId(int i) {
            this.serverId = i;
            return this;
        }

        public Builder withSession(Session session) {
            this.session = session;
            return this;
        }

        public Builder withStartPoint(MeasurementPoint measurementPoint) {
            this.startPoint = measurementPoint;
            return this;
        }
    }

    @Override // com.dynatrace.android.agent.CustomSegment, com.dynatrace.android.agent.Segment
    public StringBuilder createEventData() {
        return new AppStartEventWriter().toBeaconString(this);
    }

    public String getActivityName() {
        return this.activityName;
    }

    public MeasurementPoint getEndPoint() {
        return this.endPoint;
    }

    public boolean getForwardToGrail() {
        return this.forwardToGrail;
    }

    public MeasurementPoint getStartPoint() {
        return this.startPoint;
    }

    private AppStartSegment(Builder builder) {
        super(builder.activityName, 15, builder.session, builder.serverId, builder.forwardToGrail);
        this.activityName = Utility.truncateString(builder.activityName, 250);
        this.eventType = builder.eventType;
        this.lcSeqNum = builder.startPoint.getSequenceNumber();
        this.mEventStartTime = builder.startPoint.getTimestamp();
        this.mParentTagId = builder.parentActionId;
        this.startPoint = builder.startPoint;
        this.endPoint = builder.endPoint;
        this.mFinalized = true;
        this.forwardToGrail = builder.forwardToGrail;
    }
}
