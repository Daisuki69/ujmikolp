package com.dynatrace.agent;

import com.dynatrace.agent.common.InstrumentationFlavor;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class OneAgentConfiguration {
    private final boolean activityMonitoring;
    private final boolean anrReporting;
    private final String applicationId;
    private final boolean applicationMonitoring;
    private final String beaconUrl;
    private final int eventThrottlingLimit;
    private final InstrumentationFlavor instrumentationFlavor;
    private final boolean nativeCrashReporting;
    private final String version;

    public OneAgentConfiguration(String version, String applicationId, String beaconUrl, boolean z4, boolean z5, boolean z8, boolean z9, int i, InstrumentationFlavor instrumentationFlavor) {
        j.g(version, "version");
        j.g(applicationId, "applicationId");
        j.g(beaconUrl, "beaconUrl");
        j.g(instrumentationFlavor, "instrumentationFlavor");
        this.version = version;
        this.applicationId = applicationId;
        this.beaconUrl = beaconUrl;
        this.applicationMonitoring = z4;
        this.activityMonitoring = z5;
        this.nativeCrashReporting = z8;
        this.anrReporting = z9;
        this.eventThrottlingLimit = i;
        this.instrumentationFlavor = instrumentationFlavor;
    }

    public static /* synthetic */ OneAgentConfiguration copy$default(OneAgentConfiguration oneAgentConfiguration, String str, String str2, String str3, boolean z4, boolean z5, boolean z8, boolean z9, int i, InstrumentationFlavor instrumentationFlavor, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = oneAgentConfiguration.version;
        }
        if ((i4 & 2) != 0) {
            str2 = oneAgentConfiguration.applicationId;
        }
        if ((i4 & 4) != 0) {
            str3 = oneAgentConfiguration.beaconUrl;
        }
        if ((i4 & 8) != 0) {
            z4 = oneAgentConfiguration.applicationMonitoring;
        }
        if ((i4 & 16) != 0) {
            z5 = oneAgentConfiguration.activityMonitoring;
        }
        if ((i4 & 32) != 0) {
            z8 = oneAgentConfiguration.nativeCrashReporting;
        }
        if ((i4 & 64) != 0) {
            z9 = oneAgentConfiguration.anrReporting;
        }
        if ((i4 & 128) != 0) {
            i = oneAgentConfiguration.eventThrottlingLimit;
        }
        if ((i4 & 256) != 0) {
            instrumentationFlavor = oneAgentConfiguration.instrumentationFlavor;
        }
        int i6 = i;
        InstrumentationFlavor instrumentationFlavor2 = instrumentationFlavor;
        boolean z10 = z8;
        boolean z11 = z9;
        boolean z12 = z5;
        String str4 = str3;
        return oneAgentConfiguration.copy(str, str2, str4, z4, z12, z10, z11, i6, instrumentationFlavor2);
    }

    public final String component1() {
        return this.version;
    }

    public final String component2() {
        return this.applicationId;
    }

    public final String component3() {
        return this.beaconUrl;
    }

    public final boolean component4() {
        return this.applicationMonitoring;
    }

    public final boolean component5() {
        return this.activityMonitoring;
    }

    public final boolean component6() {
        return this.nativeCrashReporting;
    }

    public final boolean component7() {
        return this.anrReporting;
    }

    public final int component8() {
        return this.eventThrottlingLimit;
    }

    public final InstrumentationFlavor component9() {
        return this.instrumentationFlavor;
    }

    public final OneAgentConfiguration copy(String version, String applicationId, String beaconUrl, boolean z4, boolean z5, boolean z8, boolean z9, int i, InstrumentationFlavor instrumentationFlavor) {
        j.g(version, "version");
        j.g(applicationId, "applicationId");
        j.g(beaconUrl, "beaconUrl");
        j.g(instrumentationFlavor, "instrumentationFlavor");
        return new OneAgentConfiguration(version, applicationId, beaconUrl, z4, z5, z8, z9, i, instrumentationFlavor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OneAgentConfiguration)) {
            return false;
        }
        OneAgentConfiguration oneAgentConfiguration = (OneAgentConfiguration) obj;
        return j.b(this.version, oneAgentConfiguration.version) && j.b(this.applicationId, oneAgentConfiguration.applicationId) && j.b(this.beaconUrl, oneAgentConfiguration.beaconUrl) && this.applicationMonitoring == oneAgentConfiguration.applicationMonitoring && this.activityMonitoring == oneAgentConfiguration.activityMonitoring && this.nativeCrashReporting == oneAgentConfiguration.nativeCrashReporting && this.anrReporting == oneAgentConfiguration.anrReporting && this.eventThrottlingLimit == oneAgentConfiguration.eventThrottlingLimit && this.instrumentationFlavor == oneAgentConfiguration.instrumentationFlavor;
    }

    public final boolean getActivityMonitoring() {
        return this.activityMonitoring;
    }

    public final boolean getAnrReporting() {
        return this.anrReporting;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final boolean getApplicationMonitoring() {
        return this.applicationMonitoring;
    }

    public final String getBeaconUrl() {
        return this.beaconUrl;
    }

    public final int getEventThrottlingLimit() {
        return this.eventThrottlingLimit;
    }

    public final InstrumentationFlavor getInstrumentationFlavor() {
        return this.instrumentationFlavor;
    }

    public final boolean getNativeCrashReporting() {
        return this.nativeCrashReporting;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.instrumentationFlavor.hashCode() + ((((((((((AbstractC1414e.c(AbstractC1414e.c(this.version.hashCode() * 31, 31, this.applicationId), 31, this.beaconUrl) + (this.applicationMonitoring ? 1231 : 1237)) * 31) + (this.activityMonitoring ? 1231 : 1237)) * 31) + (this.nativeCrashReporting ? 1231 : 1237)) * 31) + (this.anrReporting ? 1231 : 1237)) * 31) + this.eventThrottlingLimit) * 31);
    }

    public String toString() {
        return "OneAgentConfiguration(version=" + this.version + ", applicationId=" + this.applicationId + ", beaconUrl=" + this.beaconUrl + ", applicationMonitoring=" + this.applicationMonitoring + ", activityMonitoring=" + this.activityMonitoring + ", nativeCrashReporting=" + this.nativeCrashReporting + ", anrReporting=" + this.anrReporting + ", eventThrottlingLimit=" + this.eventThrottlingLimit + ", instrumentationFlavor=" + this.instrumentationFlavor + ')';
    }
}
