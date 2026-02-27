package com.dynatrace.android.agent.events.eventsapi;

import com.dynatrace.android.agent.CustomSegment;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.data.Session;

/* JADX INFO: loaded from: classes2.dex */
public class BizEventSegment extends CustomSegment {
    private final String eventName;
    private final boolean forwardToGrail;
    private final String urlEncodedJsonPayload;

    public static class Builder {
        private String eventName;
        private boolean forwardToGrail;
        private int serverId;
        private Session session;
        private String urlEncodedJsonPayload;

        public BizEventSegment build() {
            return new BizEventSegment(this);
        }

        public Builder withEventName(String str) {
            this.eventName = str;
            return this;
        }

        public Builder withForwardToGrail(boolean z4) {
            this.forwardToGrail = z4;
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

        public Builder withUrlEncodedJsonPayload(String str) {
            this.urlEncodedJsonPayload = str;
            return this;
        }
    }

    @Override // com.dynatrace.android.agent.CustomSegment, com.dynatrace.android.agent.Segment
    public StringBuilder createEventData() {
        return new EventWriter().toBeaconString(this);
    }

    public String getEventName() {
        return this.eventName;
    }

    public boolean getForwardToGrail() {
        return this.forwardToGrail;
    }

    public String getUrlEncodedJsonPayload() {
        return this.urlEncodedJsonPayload;
    }

    private BizEventSegment(Builder builder) {
        super(builder.eventName, 17, builder.session, builder.serverId, builder.forwardToGrail);
        this.eventType = EventType.EVENT_BIZ;
        this.mEventStartTime = builder.session.getRunningTime();
        this.eventName = builder.eventName;
        this.urlEncodedJsonPayload = builder.urlEncodedJsonPayload;
        this.mFinalized = true;
        this.forwardToGrail = builder.forwardToGrail;
    }
}
