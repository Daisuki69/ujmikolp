package com.dynatrace.agent.communication;

import com.dynatrace.agent.communication.api.ServerDataUpdate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.time.a;

/* JADX INFO: loaded from: classes2.dex */
public final class CommunicationContext {
    private final CommunicationState commState;
    private final ServerDataUpdate serverData;
    private final long waitingTime;

    public /* synthetic */ CommunicationContext(long j, CommunicationState communicationState, ServerDataUpdate serverDataUpdate, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, communicationState, serverDataUpdate);
    }

    /* JADX INFO: renamed from: copy-KLykuaI$default, reason: not valid java name */
    public static /* synthetic */ CommunicationContext m150copyKLykuaI$default(CommunicationContext communicationContext, long j, CommunicationState communicationState, ServerDataUpdate serverDataUpdate, int i, Object obj) {
        if ((i & 1) != 0) {
            j = communicationContext.waitingTime;
        }
        if ((i & 2) != 0) {
            communicationState = communicationContext.commState;
        }
        if ((i & 4) != 0) {
            serverDataUpdate = communicationContext.serverData;
        }
        return communicationContext.m152copyKLykuaI(j, communicationState, serverDataUpdate);
    }

    /* JADX INFO: renamed from: component1-UwyO8pc, reason: not valid java name */
    public final long m151component1UwyO8pc() {
        return this.waitingTime;
    }

    public final CommunicationState component2() {
        return this.commState;
    }

    public final ServerDataUpdate component3() {
        return this.serverData;
    }

    /* JADX INFO: renamed from: copy-KLykuaI, reason: not valid java name */
    public final CommunicationContext m152copyKLykuaI(long j, CommunicationState commState, ServerDataUpdate serverDataUpdate) {
        j.g(commState, "commState");
        return new CommunicationContext(j, commState, serverDataUpdate, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommunicationContext) {
            CommunicationContext communicationContext = (CommunicationContext) obj;
            long j = this.waitingTime;
            long j6 = communicationContext.waitingTime;
            a.C0097a c0097a = a.f18208b;
            if (j == j6 && j.b(this.commState, communicationContext.commState) && j.b(this.serverData, communicationContext.serverData)) {
                return true;
            }
        }
        return false;
    }

    public final CommunicationState getCommState() {
        return this.commState;
    }

    public final ServerDataUpdate getServerData() {
        return this.serverData;
    }

    /* JADX INFO: renamed from: getWaitingTime-UwyO8pc, reason: not valid java name */
    public final long m153getWaitingTimeUwyO8pc() {
        return this.waitingTime;
    }

    public int hashCode() {
        long j = this.waitingTime;
        a.C0097a c0097a = a.f18208b;
        int iHashCode = (this.commState.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31;
        ServerDataUpdate serverDataUpdate = this.serverData;
        return iHashCode + (serverDataUpdate == null ? 0 : serverDataUpdate.hashCode());
    }

    public String toString() {
        return "CommunicationContext(waitingTime=" + ((Object) a.h(this.waitingTime)) + ", commState=" + this.commState + ", serverData=" + this.serverData + ')';
    }

    private CommunicationContext(long j, CommunicationState commState, ServerDataUpdate serverDataUpdate) {
        j.g(commState, "commState");
        this.waitingTime = j;
        this.commState = commState;
        this.serverData = serverDataUpdate;
    }
}
