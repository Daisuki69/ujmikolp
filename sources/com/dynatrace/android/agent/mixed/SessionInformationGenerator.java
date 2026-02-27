package com.dynatrace.android.agent.mixed;

import com.dynatrace.agent.metrics.SessionInformationMetrics;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.data.Session;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionInformationGenerator {
    public static SessionInformationMetrics generate(Session session) {
        return new SessionInformationMetrics(session.visitorId, session.sessionId, session.sequenceNumber, session.isGrailEventsShouldBeCaptured(), session.getPrivacyRules().shouldCollectEvent(EventType.CRASH), session.isActive(), session.getPrivacyRules().shouldCollectEvent(EventType.EVENT_API));
    }
}
