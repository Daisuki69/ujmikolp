package com.dynatrace.agent.events.enrichment;

import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseMetricsSupplier implements AttributeSupplier {
    public final String toDeviceOrientation$com_dynatrace_agent_release(int i) {
        if (i == 1) {
            return "portrait";
        }
        if (i != 2) {
            return null;
        }
        return "landscape";
    }

    public final Integer validBatteryLevelOrNull$com_dynatrace_agent_release(Integer num) {
        IntRange intRange = new IntRange(0, 100, 1);
        if (num == null || !intRange.a(num.intValue())) {
            return null;
        }
        return num;
    }

    public final Integer validScreenDimensionOrNull$com_dynatrace_agent_release(int i) {
        if (i >= 0) {
            return Integer.valueOf(i);
        }
        return null;
    }
}
