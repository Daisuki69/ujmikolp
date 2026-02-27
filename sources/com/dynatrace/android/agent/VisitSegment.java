package com.dynatrace.android.agent;

import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public class VisitSegment extends CustomSegment {
    private boolean forwardToGrail;

    public VisitSegment(Session session, int i, boolean z4) {
        super("", 5, EventType.VISIT_END, 0L, session, i, z4);
        this.forwardToGrail = z4;
    }

    public static VisitSegment createVisitSegment(Session session, int i, boolean z4) {
        VisitSegment visitSegment = new VisitSegment(session, i, z4);
        visitSegment.updateEndTime(session.getRunningTime());
        return visitSegment;
    }

    @Override // com.dynatrace.android.agent.CustomSegment, com.dynatrace.android.agent.Segment
    public StringBuilder createEventData() {
        StringBuilder sbW = androidx.camera.core.impl.a.w(SegmentConstants.E_ET);
        sbW.append(this.eventType.getProtocolId());
        sbW.append("&it=");
        sbW.append(Utility.getCurrentThreadId());
        sbW.append("&pa=");
        sbW.append(getParentTagId());
        sbW.append("&s0=");
        sbW.append(getLcSeqNum() + 100);
        sbW.append("&t0=");
        sbW.append(getStartTime());
        sbW.append("&fw=");
        sbW.append(this.forwardToGrail ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        return sbW;
    }
}
