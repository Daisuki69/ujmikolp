package com.dynatrace.android.agent.events.eventsapi;

import androidx.camera.core.impl.a;
import androidx.media3.extractor.metadata.icy.IcyHeaders;

/* JADX INFO: loaded from: classes2.dex */
public class EventWriter {
    private static final String ASSIGN = "=";
    private static final String DELIMITER = "&";
    private static final String EVENT_TYPE = "et=";
    private static final String FORWARD_MESSAGE = "fw";
    private static final String PAYLOAD = "pl";

    public StringBuilder toBeaconString(BizEventSegment bizEventSegment) {
        StringBuilder sbW = a.w("et=");
        sbW.append(bizEventSegment.getEventType().getProtocolId());
        sbW.append("&pl=");
        sbW.append(bizEventSegment.getUrlEncodedJsonPayload());
        sbW.append("&fw=");
        sbW.append(bizEventSegment.getForwardToGrail() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        return sbW;
    }
}
