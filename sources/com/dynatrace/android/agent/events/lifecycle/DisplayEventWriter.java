package com.dynatrace.android.agent.events.lifecycle;

import androidx.camera.core.impl.a;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public class DisplayEventWriter {
    private static final String ASSIGN = "=";
    private static final String CURRENT_ACTION_ID = "ca";
    private static final String DELIMITER = "&";
    private static final String EVENT_TYPE = "et=";
    private static final String FORWARD_MESSAGE = "fw";
    private static final String NAME = "na";
    private static final String PARENT_ACTION_ID = "pa";
    private static final String SEQ_NR_ACTION_START = "s0";
    private static final String SEQ_NR_DURATION = "s4";
    private static final String SEQ_NR_LC_CREATE = "s1";
    private static final String SEQ_NR_LC_RESUME = "s3";
    private static final String SEQ_NR_LC_START = "s2";
    private static final String THREAD_ID = "it";
    private static final String TIME_ACTION_START = "t0";
    private static final String TIME_DURATION = "t4";
    private static final String TIME_LC_CREATE = "t1";
    private static final String TIME_LC_RESUME = "t3";
    private static final String TIME_LC_START = "t2";

    public StringBuilder toBeaconString(DisplaySegment displaySegment) {
        MeasurementPoint actionCreationPoint = displaySegment.getActionCreationPoint();
        MeasurementPoint createEvent = displaySegment.getCreateEvent();
        MeasurementPoint startEvent = displaySegment.getStartEvent();
        MeasurementPoint resumeEvent = displaySegment.getResumeEvent();
        MeasurementPoint endpoint = displaySegment.getEndpoint();
        StringBuilder sbW = a.w("et=");
        sbW.append(displaySegment.getEventType().getProtocolId());
        sbW.append("&na=");
        sbW.append(Utility.urlEncode(displaySegment.getName()));
        sbW.append("&it=");
        sbW.append(Utility.getCurrentThreadId());
        sbW.append("&ca=");
        sbW.append(displaySegment.getTagId());
        sbW.append("&pa=");
        sbW.append(displaySegment.getParentTagId());
        sbW.append("&s0=");
        sbW.append(actionCreationPoint.getSequenceNumber());
        sbW.append("&t0=");
        sbW.append(actionCreationPoint.getTimestamp());
        if (createEvent != null) {
            sbW.append("&s1=");
            sbW.append(createEvent.getSequenceNumber());
            sbW.append("&t1=");
            sbW.append(createEvent.getTimestamp());
        }
        if (startEvent != null) {
            sbW.append("&s2=");
            sbW.append(startEvent.getSequenceNumber());
            sbW.append("&t2=");
            sbW.append(startEvent.getTimestamp());
        }
        if (resumeEvent != null) {
            sbW.append("&s3=");
            sbW.append(resumeEvent.getSequenceNumber());
            sbW.append("&t3=");
            sbW.append(resumeEvent.getTimestamp());
        }
        if (endpoint != null) {
            sbW.append("&s4=");
            sbW.append(endpoint.getSequenceNumber());
            sbW.append("&t4=");
            sbW.append(endpoint.getTimestamp());
        }
        sbW.append("&fw=");
        sbW.append(displaySegment.getForwardToGrail() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        return sbW;
    }
}
