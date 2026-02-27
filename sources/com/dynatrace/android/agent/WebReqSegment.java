package com.dynatrace.android.agent;

import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public class WebReqSegment extends CustomSegment {
    private long endLcSeqNum;
    private boolean forwardToGrail;
    private long receivedBytes;
    protected int respCode;
    protected String respPhrase;
    private long sendBytes;
    private String serverTiming;

    public WebReqSegment(long j, int i, long j6, long j7, int i4, String str, String str2, long j9, long j10, Session session, int i6, String str3, boolean z4) {
        super(str2, 6, EventType.WEB_REQUEST, j, i, j6, j7, session, i6, z4);
        this.respCode = i4;
        this.respPhrase = str;
        this.endLcSeqNum = Utility.getEventSeqNum();
        this.sendBytes = j9;
        this.receivedBytes = j10;
        this.serverTiming = str3;
        this.forwardToGrail = z4;
    }

    @Override // com.dynatrace.android.agent.CustomSegment, com.dynatrace.android.agent.Segment
    public StringBuilder createEventData() {
        StringBuilder sbW = androidx.camera.core.impl.a.w(SegmentConstants.E_ET);
        sbW.append(this.eventType.getProtocolId());
        sbW.append("&na=");
        sbW.append(Utility.urlEncode(getName()));
        sbW.append("&it=");
        sbW.append(Utility.getCurrentThreadId());
        sbW.append("&pa=");
        sbW.append(getParentTagId());
        sbW.append("&s0=");
        sbW.append(this.lcSeqNum);
        sbW.append("&t0=");
        sbW.append(getStartTime());
        sbW.append("&s1=");
        sbW.append(this.endLcSeqNum);
        sbW.append("&t1=");
        sbW.append(getEndTime() - getStartTime());
        if (this.respCode > 0) {
            sbW.append("&rc=");
            sbW.append(this.respCode);
        } else if (this.respPhrase != null) {
            sbW.append("&rc=");
            sbW.append(Utility.urlEncode(this.respPhrase));
        }
        if (this.sendBytes >= 0 && this.receivedBytes >= 0) {
            sbW.append("&bs=");
            sbW.append(this.sendBytes);
            sbW.append("&br=");
            sbW.append(this.receivedBytes);
        }
        if (this.serverTiming != null) {
            sbW.append("&si=");
            sbW.append(Utility.urlEncode(this.serverTiming));
        }
        sbW.append("&fw=");
        sbW.append(this.forwardToGrail ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        return sbW;
    }
}
