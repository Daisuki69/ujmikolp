package com.dynatrace.android.agent.events.eventsapi.format;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.data.Session;

/* JADX INFO: loaded from: classes2.dex */
public class SessionIdFormatter implements Formatter<Session, String> {
    @Override // com.dynatrace.android.agent.events.eventsapi.format.Formatter
    public String format(Session session) {
        return session.visitorId + Global.UNDERSCORE + session.sessionId + Global.HYPHEN + session.sequenceNumber;
    }
}
