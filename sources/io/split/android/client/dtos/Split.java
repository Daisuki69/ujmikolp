package io.split.android.client.dtos;

import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class Split {

    @InterfaceC1498b("algo")
    public int algo;

    @InterfaceC1498b("changeNumber")
    public long changeNumber;

    @InterfaceC1498b("conditions")
    public List<Condition> conditions;

    @InterfaceC1498b("configurations")
    public Map<String, String> configurations;

    @InterfaceC1498b("defaultTreatment")
    public String defaultTreatment;

    @InterfaceC1498b("impressionsDisabled")
    public boolean impressionsDisabled;
    public String json;

    @InterfaceC1498b("killed")
    public boolean killed;

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String name;

    @Nullable
    @InterfaceC1498b("prerequisites")
    public List<Prerequisite> prerequisites;

    @InterfaceC1498b("seed")
    public int seed;

    @Nullable
    @InterfaceC1498b("sets")
    public Set<String> sets;

    @InterfaceC1498b("status")
    public Status status;

    @InterfaceC1498b("trafficAllocation")
    public Integer trafficAllocation;

    @InterfaceC1498b("trafficAllocationSeed")
    public Integer trafficAllocationSeed;

    @InterfaceC1498b(SerializableEvent.TRAFFIC_TYPE_NAME_FIELD)
    public String trafficTypeName;

    public Split() {
        this.impressionsDisabled = false;
        this.json = null;
    }

    public List<Prerequisite> getPrerequisites() {
        List<Prerequisite> list = this.prerequisites;
        return list == null ? new ArrayList() : list;
    }

    public Split(String str, String str2) {
        this.impressionsDisabled = false;
        this.name = str;
        this.json = str2;
    }
}
