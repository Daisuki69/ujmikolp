package com.dynatrace.android.agent;

import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public class ErrorSegment extends CustomSegment {
    protected String exceptionName;
    protected boolean forwardToGrail;
    protected String platformType;
    protected String reason;
    protected String stacktrace;

    public ErrorSegment(String str, String str2, String str3, String str4, long j, Session session, int i, String str5, boolean z4) {
        this(str, 6, EventType.ERROR_EXCEPTION, str2, str3, str4, j, session, i, str5, z4);
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
        sbW.append(getLcSeqNum());
        sbW.append("&t0=");
        sbW.append(getStartTime());
        appendOptionalValue(sbW, "&rs=", Utility.urlEncode(this.reason));
        appendOptionalValue(sbW, "&ev=", Utility.urlEncode(this.exceptionName));
        appendOptionalValue(sbW, "&st=", Utility.urlEncode(this.stacktrace));
        sbW.append("&tt=");
        sbW.append(this.platformType);
        sbW.append("&fw=");
        sbW.append(this.forwardToGrail ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        return sbW;
    }

    public ErrorSegment(String str, int i, EventType eventType, String str2, String str3, String str4, long j, Session session, int i4, String str5, boolean z4) {
        super(str, i, eventType, j, session, i4, z4);
        this.exceptionName = str2;
        this.reason = str3;
        this.stacktrace = str4;
        this.platformType = str5;
        this.forwardToGrail = z4;
    }
}
