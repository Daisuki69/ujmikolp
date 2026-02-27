package com.dynatrace.android.agent.events.lifecycle;

import com.dynatrace.android.agent.CustomSegment;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.measurement.MeasurementPoint;

/* JADX INFO: loaded from: classes2.dex */
public class DisplaySegment extends CustomSegment {
    private final MeasurementPoint createEvent;
    private final MeasurementPoint endPoint;
    private final boolean forwardToGrail;
    private final MeasurementPoint resumeEvent;
    private final MeasurementPoint startEvent;

    public static class Builder {
        private MeasurementPoint actionCreationPoint;
        private MeasurementPoint createEvent;
        private MeasurementPoint endpoint;
        private EventType eventType;
        private boolean forwardToGrail;
        private String lifecycleOwner;
        private long parentActionId;
        private MeasurementPoint resumeEvent;
        private int serverId;
        private Session session;
        private MeasurementPoint startEvent;

        public DisplaySegment build() {
            return new DisplaySegment(this);
        }

        public Builder withActionCreationPoint(MeasurementPoint measurementPoint) {
            this.actionCreationPoint = measurementPoint;
            return this;
        }

        public Builder withCreateEvent(MeasurementPoint measurementPoint) {
            this.createEvent = measurementPoint;
            return this;
        }

        public Builder withEndPoint(MeasurementPoint measurementPoint) {
            this.endpoint = measurementPoint;
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

        public Builder withLifecycleOwner(String str) {
            this.lifecycleOwner = str;
            return this;
        }

        public Builder withParentActionId(long j) {
            this.parentActionId = j;
            return this;
        }

        public Builder withResumeEvent(MeasurementPoint measurementPoint) {
            this.resumeEvent = measurementPoint;
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

        public Builder withStartEvent(MeasurementPoint measurementPoint) {
            this.startEvent = measurementPoint;
            return this;
        }
    }

    @Override // com.dynatrace.android.agent.CustomSegment, com.dynatrace.android.agent.Segment
    public StringBuilder createEventData() {
        return new DisplayEventWriter().toBeaconString(this);
    }

    public MeasurementPoint getActionCreationPoint() {
        return new MeasurementPoint(getStartTime(), this.lcSeqNum);
    }

    public MeasurementPoint getCreateEvent() {
        return this.createEvent;
    }

    public MeasurementPoint getEndpoint() {
        return this.endPoint;
    }

    public boolean getForwardToGrail() {
        return this.forwardToGrail;
    }

    public MeasurementPoint getResumeEvent() {
        return this.resumeEvent;
    }

    public MeasurementPoint getStartEvent() {
        return this.startEvent;
    }

    @Override // com.dynatrace.android.agent.CustomSegment
    public int getType() {
        return super.getType();
    }

    private DisplaySegment(Builder builder) {
        super(builder.lifecycleOwner, 15, builder.session, builder.serverId, builder.forwardToGrail);
        this.eventType = builder.eventType;
        this.lcSeqNum = builder.actionCreationPoint.getSequenceNumber();
        this.mEventStartTime = builder.actionCreationPoint.getTimestamp();
        this.mParentTagId = builder.parentActionId;
        this.createEvent = builder.createEvent;
        this.startEvent = builder.startEvent;
        this.resumeEvent = builder.resumeEvent;
        this.endPoint = builder.endpoint;
        this.mFinalized = true;
        this.forwardToGrail = builder.forwardToGrail;
    }
}
