package io.split.android.client.dtos;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RuleBasedSegment {

    @InterfaceC1498b("changeNumber")
    private final long mChangeNumber;

    @InterfaceC1498b("conditions")
    private final List<Condition> mConditions;

    @InterfaceC1498b("excluded")
    private final Excluded mExcluded;

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String mName;

    @InterfaceC1498b("status")
    private final Status mStatus;

    @InterfaceC1498b(SerializableEvent.TRAFFIC_TYPE_NAME_FIELD)
    private final String mTrafficTypeName;

    public RuleBasedSegment(String str, String str2, long j, Status status, List<Condition> list, Excluded excluded) {
        this.mName = str;
        this.mTrafficTypeName = str2;
        this.mChangeNumber = j;
        this.mStatus = status;
        this.mConditions = list;
        this.mExcluded = excluded;
    }

    public long getChangeNumber() {
        return this.mChangeNumber;
    }

    public List<Condition> getConditions() {
        return this.mConditions;
    }

    public Excluded getExcluded() {
        return this.mExcluded;
    }

    public String getName() {
        return this.mName;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public String getTrafficTypeName() {
        return this.mTrafficTypeName;
    }
}
