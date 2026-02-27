package com.dynatrace.android.agent;

import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public class CrashSegment extends ErrorSegment {
    private boolean sendImmediately;

    public CrashSegment(String str, String str2, String str3, Session session, int i, String str4, boolean z4) {
        super(str, 11, EventType.CRASH, str, str2, str3, 0L, session, i, str4, z4);
        ((ErrorSegment) this).forwardToGrail = z4;
        this.sendImmediately = true;
    }

    @Override // com.dynatrace.android.agent.ErrorSegment, com.dynatrace.android.agent.CustomSegment, com.dynatrace.android.agent.Segment
    public StringBuilder createEventData() {
        StringBuilder sbW = androidx.camera.core.impl.a.w(SegmentConstants.E_ET);
        sbW.append(this.eventType.getProtocolId());
        sbW.append("&na=");
        sbW.append(Utility.urlEncode(getName()));
        sbW.append("&it=");
        sbW.append(Utility.getCurrentThreadId());
        sbW.append("&pa=0&s0=");
        sbW.append(this.lcSeqNum);
        sbW.append("&t0=");
        sbW.append(getStartTime());
        appendOptionalValue(sbW, "&rs=", Utility.urlEncode(this.reason));
        appendOptionalValue(sbW, "&st=", Utility.urlEncode(this.stacktrace));
        sbW.append("&tt=");
        sbW.append(this.platformType);
        sbW.append("&im=");
        sbW.append(this.sendImmediately ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        sbW.append("&fw=");
        sbW.append(((ErrorSegment) this).forwardToGrail ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        return sbW;
    }

    public void setSendImmediately(boolean z4) {
        this.sendImmediately = z4;
    }
}
