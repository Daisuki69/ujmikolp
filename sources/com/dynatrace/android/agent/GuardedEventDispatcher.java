package com.dynatrace.android.agent;

import We.s;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.events.EventModifier;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public class GuardedEventDispatcher {
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "GuardedEventDispatcher");
    private RumEventDispatcher eventDispatcher = null;

    public interface GuardedOperation {
        void execute(RumEventDispatcher rumEventDispatcher);
    }

    public boolean addEventModifier(EventModifier eventModifier) {
        RumEventDispatcher rumEventDispatcher = this.eventDispatcher;
        if (rumEventDispatcher != null) {
            return rumEventDispatcher.addEventModifier(eventModifier);
        }
        return false;
    }

    public void executeWithVerification(Session session, GuardedOperation guardedOperation) {
        if (session == null) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "Session object is null");
            }
        } else if (session.isGrailEventsShouldBeCaptured() && session.isActive()) {
            RumEventDispatcher rumEventDispatcher = this.eventDispatcher;
            if (rumEventDispatcher != null) {
                guardedOperation.execute(rumEventDispatcher);
            } else if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "event dispatcher is not available");
            }
        }
    }

    public void initEventDispatcher(RumEventDispatcher rumEventDispatcher) {
        this.eventDispatcher = rumEventDispatcher;
    }

    public boolean removeEventModifier(EventModifier eventModifier) {
        RumEventDispatcher rumEventDispatcher = this.eventDispatcher;
        if (rumEventDispatcher != null) {
            return rumEventDispatcher.removeEventModifier(eventModifier);
        }
        return false;
    }

    public void resetEventDispatcher() {
        this.eventDispatcher = null;
    }
}
