package com.dynatrace.agent.metrics;

import androidx.camera.core.impl.a;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionInformationMetrics {
    private final boolean crashReporting;
    private final boolean eventReporting;
    private final String instanceId;
    private final boolean isGrailEventsCanBeCaptured;
    private final boolean sessionActive;
    private final String sessionId;

    public SessionInformationMetrics(String instanceId, String sessionId, boolean z4, boolean z5, boolean z8, boolean z9) {
        j.g(instanceId, "instanceId");
        j.g(sessionId, "sessionId");
        this.instanceId = instanceId;
        this.sessionId = sessionId;
        this.isGrailEventsCanBeCaptured = z4;
        this.crashReporting = z5;
        this.sessionActive = z8;
        this.eventReporting = z9;
    }

    public static /* synthetic */ SessionInformationMetrics copy$default(SessionInformationMetrics sessionInformationMetrics, String str, String str2, boolean z4, boolean z5, boolean z8, boolean z9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionInformationMetrics.instanceId;
        }
        if ((i & 2) != 0) {
            str2 = sessionInformationMetrics.sessionId;
        }
        if ((i & 4) != 0) {
            z4 = sessionInformationMetrics.isGrailEventsCanBeCaptured;
        }
        if ((i & 8) != 0) {
            z5 = sessionInformationMetrics.crashReporting;
        }
        if ((i & 16) != 0) {
            z8 = sessionInformationMetrics.sessionActive;
        }
        if ((i & 32) != 0) {
            z9 = sessionInformationMetrics.eventReporting;
        }
        boolean z10 = z8;
        boolean z11 = z9;
        return sessionInformationMetrics.copy(str, str2, z4, z5, z10, z11);
    }

    public final String component1() {
        return this.instanceId;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final boolean component3() {
        return this.isGrailEventsCanBeCaptured;
    }

    public final boolean component4() {
        return this.crashReporting;
    }

    public final boolean component5() {
        return this.sessionActive;
    }

    public final boolean component6() {
        return this.eventReporting;
    }

    public final SessionInformationMetrics copy(String instanceId, String sessionId, boolean z4, boolean z5, boolean z8, boolean z9) {
        j.g(instanceId, "instanceId");
        j.g(sessionId, "sessionId");
        return new SessionInformationMetrics(instanceId, sessionId, z4, z5, z8, z9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionInformationMetrics)) {
            return false;
        }
        SessionInformationMetrics sessionInformationMetrics = (SessionInformationMetrics) obj;
        return j.b(this.instanceId, sessionInformationMetrics.instanceId) && j.b(this.sessionId, sessionInformationMetrics.sessionId) && this.isGrailEventsCanBeCaptured == sessionInformationMetrics.isGrailEventsCanBeCaptured && this.crashReporting == sessionInformationMetrics.crashReporting && this.sessionActive == sessionInformationMetrics.sessionActive && this.eventReporting == sessionInformationMetrics.eventReporting;
    }

    public final boolean getCrashReporting() {
        return this.crashReporting;
    }

    public final boolean getEventReporting() {
        return this.eventReporting;
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final boolean getSessionActive() {
        return this.sessionActive;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return ((((((AbstractC1414e.c(this.instanceId.hashCode() * 31, 31, this.sessionId) + (this.isGrailEventsCanBeCaptured ? 1231 : 1237)) * 31) + (this.crashReporting ? 1231 : 1237)) * 31) + (this.sessionActive ? 1231 : 1237)) * 31) + (this.eventReporting ? 1231 : 1237);
    }

    public final boolean isGrailEventsCanBeCaptured() {
        return this.isGrailEventsCanBeCaptured;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInformationMetrics(instanceId=");
        sb2.append(this.instanceId);
        sb2.append(", sessionId=");
        sb2.append(this.sessionId);
        sb2.append(", isGrailEventsCanBeCaptured=");
        sb2.append(this.isGrailEventsCanBeCaptured);
        sb2.append(", crashReporting=");
        sb2.append(this.crashReporting);
        sb2.append(", sessionActive=");
        sb2.append(this.sessionActive);
        sb2.append(", eventReporting=");
        return a.q(sb2, this.eventReporting, ')');
    }

    public SessionInformationMetrics(long j, int i, int i4, boolean z4, boolean z5, boolean z8, boolean z9) {
        String strValueOf = String.valueOf(j);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j);
        sb2.append('_');
        sb2.append(i);
        sb2.append('-');
        sb2.append(i4);
        this(strValueOf, sb2.toString(), z4, z5, z8, z9);
    }
}
