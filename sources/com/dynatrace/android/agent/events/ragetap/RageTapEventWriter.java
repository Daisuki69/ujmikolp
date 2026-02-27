package com.dynatrace.android.agent.events.ragetap;

import androidx.camera.core.impl.a;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public class RageTapEventWriter {
    private static final String ASSIGN = "=";
    private static final String DELIMITER = "&";
    private static final String EVENT_TYPE = "et=";
    private static final String FORWARD_MESSAGE = "fw";
    private static final String NAME = "na";
    private static final String NUMBER_OF_TAPS = "nt";
    private static final String SEQUENCE_NUMBER = "s0";
    private static final String TIME_FIRST_TAP_DOWN = "t0";
    private static final String TIME_LAST_TAP_UP = "t1";

    public StringBuilder toBeaconString(RageTapSegment rageTapSegment) {
        StringBuilder sbW = a.w("et=");
        sbW.append(rageTapSegment.getEventType().getProtocolId());
        if (rageTapSegment.getActivityName() != null) {
            sbW.append("&na=");
            sbW.append(Utility.urlEncode(rageTapSegment.getName()));
        }
        sbW.append("&s0=");
        sbW.append(rageTapSegment.getLcSeqNum());
        sbW.append("&t0=");
        sbW.append(rageTapSegment.getFirstTapDown());
        sbW.append("&t1=");
        sbW.append(rageTapSegment.getLastTapUp());
        sbW.append("&nt=");
        sbW.append(rageTapSegment.getNumOfTaps());
        sbW.append("&fw=");
        sbW.append(rageTapSegment.getForwardToGrail() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        return sbW;
    }
}
