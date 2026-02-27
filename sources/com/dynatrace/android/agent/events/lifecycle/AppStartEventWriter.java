package com.dynatrace.android.agent.events.lifecycle;

import androidx.camera.core.impl.a;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public class AppStartEventWriter {
    private static final String ASSIGN = "=";
    private static final String CURRENT_ACTION_ID = "ca";
    private static final String DELIMITER = "&";
    private static final String EVENT_TYPE = "et=";
    private static final String FORWARD_MESSAGE = "fw";
    private static final String NAME = "na";
    private static final String PARENT_ACTION_ID = "pa";
    private static final String SEQ_NR_ACTION_END = "s1";
    private static final String SEQ_NR_ACTION_START = "s0";
    private static final String THREAD_ID = "it";
    private static final String TIME_ACTION_START = "t0";
    private static final String TIME_DURATION = "t1";

    public StringBuilder toBeaconString(AppStartSegment appStartSegment) {
        MeasurementPoint startPoint = appStartSegment.getStartPoint();
        MeasurementPoint endPoint = appStartSegment.getEndPoint();
        StringBuilder sbW = a.w("et=");
        sbW.append(appStartSegment.getEventType().getProtocolId());
        if (appStartSegment.getActivityName() != null) {
            sbW.append("&na=");
            sbW.append(Utility.urlEncode(appStartSegment.getName()));
        }
        sbW.append("&it=");
        sbW.append(Utility.getCurrentThreadId());
        sbW.append("&ca=");
        sbW.append(appStartSegment.getTagId());
        sbW.append("&pa=");
        sbW.append(appStartSegment.getParentTagId());
        sbW.append("&s0=");
        sbW.append(startPoint.getSequenceNumber());
        sbW.append("&t0=");
        sbW.append(startPoint.getTimestamp());
        sbW.append("&s1=");
        sbW.append(endPoint.getSequenceNumber());
        sbW.append("&t1=");
        sbW.append(endPoint.getTimestamp());
        sbW.append("&fw=");
        sbW.append(appStartSegment.getForwardToGrail() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        return sbW;
    }
}
