package com.dynatrace.android.agent.events.ragetap;

import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.events.ragetap.RageTapSegment;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.ragetap.detection.RageTap;

/* JADX INFO: loaded from: classes2.dex */
public class RageTapSegmentFactory {
    public RageTapSegment createSegment(RageTap rageTap, String str, Session session, int i) {
        long sessionStartTime = session.getSessionStartTime();
        long timestamp = rageTap.getFirstTap().getTapDown().getTimestamp() - sessionStartTime;
        return new RageTapSegment.Builder().withActivityName(str).withSession(session).withServerId(i).withSequenceNumber(Utility.getEventSeqNum()).withFirstTapDown(timestamp).withLastTapUp((rageTap.getLastTap().getTapUp().getTimestamp() - timestamp) - sessionStartTime).withNumOfTaps(rageTap.getNumOfTaps()).withForwardToGrail(true).build();
    }
}
