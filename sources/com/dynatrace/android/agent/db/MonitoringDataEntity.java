package com.dynatrace.android.agent.db;

import com.dynatrace.android.agent.comm.MonitoringDataPacket;

/* JADX INFO: loaded from: classes2.dex */
public class MonitoringDataEntity {
    public final boolean finished;
    public final long lastRowId;
    public final MonitoringDataPacket monitoringData;
    public final int sequenceNumber;
    public final int serverId;
    public final int sessionId;
    public final long visitorId;

    public MonitoringDataEntity(long j, int i, int i4, int i6, long j6, MonitoringDataPacket monitoringDataPacket, boolean z4) {
        this.visitorId = j;
        this.sessionId = i;
        this.sequenceNumber = i4;
        this.serverId = i6;
        this.lastRowId = j6;
        this.monitoringData = monitoringDataPacket;
        this.finished = z4;
    }
}
