package com.dynatrace.agent.communication.preprocessing;

import androidx.camera.core.impl.a;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.agent.storage.db.EventRecord;
import defpackage.AbstractC1414e;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class DispatchableData {
    private final List<EventRecord> data;
    private final EndPointInfo endPoint;
    private final boolean isPriorityData;

    public DispatchableData(EndPointInfo endPoint, List<EventRecord> data, boolean z4) {
        j.g(endPoint, "endPoint");
        j.g(data, "data");
        this.endPoint = endPoint;
        this.data = data;
        this.isPriorityData = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DispatchableData copy$default(DispatchableData dispatchableData, EndPointInfo endPointInfo, List list, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            endPointInfo = dispatchableData.endPoint;
        }
        if ((i & 2) != 0) {
            list = dispatchableData.data;
        }
        if ((i & 4) != 0) {
            z4 = dispatchableData.isPriorityData;
        }
        return dispatchableData.copy(endPointInfo, list, z4);
    }

    public final EndPointInfo component1() {
        return this.endPoint;
    }

    public final List<EventRecord> component2() {
        return this.data;
    }

    public final boolean component3() {
        return this.isPriorityData;
    }

    public final DispatchableData copy(EndPointInfo endPoint, List<EventRecord> data, boolean z4) {
        j.g(endPoint, "endPoint");
        j.g(data, "data");
        return new DispatchableData(endPoint, data, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DispatchableData)) {
            return false;
        }
        DispatchableData dispatchableData = (DispatchableData) obj;
        return j.b(this.endPoint, dispatchableData.endPoint) && j.b(this.data, dispatchableData.data) && this.isPriorityData == dispatchableData.isPriorityData;
    }

    public final List<EventRecord> getData() {
        return this.data;
    }

    public final EndPointInfo getEndPoint() {
        return this.endPoint;
    }

    public int hashCode() {
        return AbstractC1414e.d(this.data, this.endPoint.hashCode() * 31, 31) + (this.isPriorityData ? 1231 : 1237);
    }

    public final boolean isPriorityData() {
        return this.isPriorityData;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DispatchableData(endPoint=");
        sb2.append(this.endPoint);
        sb2.append(", data=");
        sb2.append(this.data);
        sb2.append(", isPriorityData=");
        return a.q(sb2, this.isPriorityData, ')');
    }
}
