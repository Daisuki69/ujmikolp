package com.dynatrace.agent.storage.preference;

import com.dynatrace.agent.metrics.AppVersion;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class MetricsData {
    private final AppVersion appVersion;
    private final String bundle;
    private final boolean crashReportingOptIn;
    private final int deviceBatteryLevel;
    private final boolean deviceIsRooted;
    private final String deviceManufacturer;
    private final String deviceModelIdentifier;
    private final int deviceOrientation;
    private final int deviceScreenHeight;
    private final int deviceScreenWidth;
    private final String instanceId;
    private final Double locationLatitude;
    private final Double locationLongitude;
    private final String networkType;
    private final String osName;
    private final String osVersion;
    private final boolean sessionActive;
    private final String sessionId;

    public MetricsData() {
        this(0, 0, 0, 0, null, null, null, null, false, null, null, null, null, null, null, null, false, false, 262143, null);
    }

    public static /* synthetic */ MetricsData copy$default(MetricsData metricsData, int i, int i4, int i6, int i10, Double d10, Double d11, String str, String str2, boolean z4, String str3, String str4, String str5, AppVersion appVersion, String str6, String str7, String str8, boolean z5, boolean z8, int i11, Object obj) {
        boolean z9;
        boolean z10;
        int i12 = (i11 & 1) != 0 ? metricsData.deviceScreenWidth : i;
        int i13 = (i11 & 2) != 0 ? metricsData.deviceScreenHeight : i4;
        int i14 = (i11 & 4) != 0 ? metricsData.deviceOrientation : i6;
        int i15 = (i11 & 8) != 0 ? metricsData.deviceBatteryLevel : i10;
        Double d12 = (i11 & 16) != 0 ? metricsData.locationLatitude : d10;
        Double d13 = (i11 & 32) != 0 ? metricsData.locationLongitude : d11;
        String str9 = (i11 & 64) != 0 ? metricsData.deviceManufacturer : str;
        String str10 = (i11 & 128) != 0 ? metricsData.deviceModelIdentifier : str2;
        boolean z11 = (i11 & 256) != 0 ? metricsData.deviceIsRooted : z4;
        String str11 = (i11 & 512) != 0 ? metricsData.osName : str3;
        String str12 = (i11 & 1024) != 0 ? metricsData.osVersion : str4;
        String str13 = (i11 & 2048) != 0 ? metricsData.bundle : str5;
        AppVersion appVersion2 = (i11 & 4096) != 0 ? metricsData.appVersion : appVersion;
        String str14 = (i11 & 8192) != 0 ? metricsData.instanceId : str6;
        int i16 = i12;
        String str15 = (i11 & 16384) != 0 ? metricsData.sessionId : str7;
        String str16 = (i11 & 32768) != 0 ? metricsData.networkType : str8;
        boolean z12 = (i11 & 65536) != 0 ? metricsData.crashReportingOptIn : z5;
        if ((i11 & 131072) != 0) {
            z10 = z12;
            z9 = metricsData.sessionActive;
        } else {
            z9 = z8;
            z10 = z12;
        }
        return metricsData.copy(i16, i13, i14, i15, d12, d13, str9, str10, z11, str11, str12, str13, appVersion2, str14, str15, str16, z10, z9);
    }

    public final int component1() {
        return this.deviceScreenWidth;
    }

    public final String component10() {
        return this.osName;
    }

    public final String component11() {
        return this.osVersion;
    }

    public final String component12() {
        return this.bundle;
    }

    public final AppVersion component13() {
        return this.appVersion;
    }

    public final String component14() {
        return this.instanceId;
    }

    public final String component15() {
        return this.sessionId;
    }

    public final String component16() {
        return this.networkType;
    }

    public final boolean component17() {
        return this.crashReportingOptIn;
    }

    public final boolean component18() {
        return this.sessionActive;
    }

    public final int component2() {
        return this.deviceScreenHeight;
    }

    public final int component3() {
        return this.deviceOrientation;
    }

    public final int component4() {
        return this.deviceBatteryLevel;
    }

    public final Double component5() {
        return this.locationLatitude;
    }

    public final Double component6() {
        return this.locationLongitude;
    }

    public final String component7() {
        return this.deviceManufacturer;
    }

    public final String component8() {
        return this.deviceModelIdentifier;
    }

    public final boolean component9() {
        return this.deviceIsRooted;
    }

    public final MetricsData copy(int i, int i4, int i6, int i10, Double d10, Double d11, String str, String str2, boolean z4, String osName, String str3, String str4, AppVersion appVersion, String instanceId, String sessionId, String networkType, boolean z5, boolean z8) {
        j.g(osName, "osName");
        j.g(instanceId, "instanceId");
        j.g(sessionId, "sessionId");
        j.g(networkType, "networkType");
        return new MetricsData(i, i4, i6, i10, d10, d11, str, str2, z4, osName, str3, str4, appVersion, instanceId, sessionId, networkType, z5, z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricsData)) {
            return false;
        }
        MetricsData metricsData = (MetricsData) obj;
        return this.deviceScreenWidth == metricsData.deviceScreenWidth && this.deviceScreenHeight == metricsData.deviceScreenHeight && this.deviceOrientation == metricsData.deviceOrientation && this.deviceBatteryLevel == metricsData.deviceBatteryLevel && j.b(this.locationLatitude, metricsData.locationLatitude) && j.b(this.locationLongitude, metricsData.locationLongitude) && j.b(this.deviceManufacturer, metricsData.deviceManufacturer) && j.b(this.deviceModelIdentifier, metricsData.deviceModelIdentifier) && this.deviceIsRooted == metricsData.deviceIsRooted && j.b(this.osName, metricsData.osName) && j.b(this.osVersion, metricsData.osVersion) && j.b(this.bundle, metricsData.bundle) && j.b(this.appVersion, metricsData.appVersion) && j.b(this.instanceId, metricsData.instanceId) && j.b(this.sessionId, metricsData.sessionId) && j.b(this.networkType, metricsData.networkType) && this.crashReportingOptIn == metricsData.crashReportingOptIn && this.sessionActive == metricsData.sessionActive;
    }

    public final AppVersion getAppVersion() {
        return this.appVersion;
    }

    public final String getBundle() {
        return this.bundle;
    }

    public final boolean getCrashReportingOptIn() {
        return this.crashReportingOptIn;
    }

    public final int getDeviceBatteryLevel() {
        return this.deviceBatteryLevel;
    }

    public final boolean getDeviceIsRooted() {
        return this.deviceIsRooted;
    }

    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public final String getDeviceModelIdentifier() {
        return this.deviceModelIdentifier;
    }

    public final int getDeviceOrientation() {
        return this.deviceOrientation;
    }

    public final int getDeviceScreenHeight() {
        return this.deviceScreenHeight;
    }

    public final int getDeviceScreenWidth() {
        return this.deviceScreenWidth;
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final Double getLocationLatitude() {
        return this.locationLatitude;
    }

    public final Double getLocationLongitude() {
        return this.locationLongitude;
    }

    public final String getNetworkType() {
        return this.networkType;
    }

    public final String getOsName() {
        return this.osName;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final boolean getSessionActive() {
        return this.sessionActive;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int i = ((((((this.deviceScreenWidth * 31) + this.deviceScreenHeight) * 31) + this.deviceOrientation) * 31) + this.deviceBatteryLevel) * 31;
        Double d10 = this.locationLatitude;
        int iHashCode = (i + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.locationLongitude;
        int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str = this.deviceManufacturer;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceModelIdentifier;
        int iC = AbstractC1414e.c((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.deviceIsRooted ? 1231 : 1237)) * 31, 31, this.osName);
        String str3 = this.osVersion;
        int iHashCode4 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bundle;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AppVersion appVersion = this.appVersion;
        return ((AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c((iHashCode5 + (appVersion != null ? appVersion.hashCode() : 0)) * 31, 31, this.instanceId), 31, this.sessionId), 31, this.networkType) + (this.crashReportingOptIn ? 1231 : 1237)) * 31) + (this.sessionActive ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MetricsData(deviceScreenWidth=");
        sb2.append(this.deviceScreenWidth);
        sb2.append(", deviceScreenHeight=");
        sb2.append(this.deviceScreenHeight);
        sb2.append(", deviceOrientation=");
        sb2.append(this.deviceOrientation);
        sb2.append(", deviceBatteryLevel=");
        sb2.append(this.deviceBatteryLevel);
        sb2.append(", locationLatitude=");
        sb2.append(this.locationLatitude);
        sb2.append(", locationLongitude=");
        sb2.append(this.locationLongitude);
        sb2.append(", deviceManufacturer=");
        sb2.append(this.deviceManufacturer);
        sb2.append(", deviceModelIdentifier=");
        sb2.append(this.deviceModelIdentifier);
        sb2.append(", deviceIsRooted=");
        sb2.append(this.deviceIsRooted);
        sb2.append(", osName=");
        sb2.append(this.osName);
        sb2.append(", osVersion=");
        sb2.append(this.osVersion);
        sb2.append(", bundle=");
        sb2.append(this.bundle);
        sb2.append(", appVersion=");
        sb2.append(this.appVersion);
        sb2.append(", instanceId=");
        sb2.append(this.instanceId);
        sb2.append(", sessionId=");
        sb2.append(this.sessionId);
        sb2.append(", networkType=");
        sb2.append(this.networkType);
        sb2.append(", crashReportingOptIn=");
        sb2.append(this.crashReportingOptIn);
        sb2.append(", sessionActive=");
        return androidx.camera.core.impl.a.q(sb2, this.sessionActive, ')');
    }

    public MetricsData(int i, int i4, int i6, int i10, Double d10, Double d11, String str, String str2, boolean z4, String osName, String str3, String str4, AppVersion appVersion, String instanceId, String sessionId, String networkType, boolean z5, boolean z8) {
        j.g(osName, "osName");
        j.g(instanceId, "instanceId");
        j.g(sessionId, "sessionId");
        j.g(networkType, "networkType");
        this.deviceScreenWidth = i;
        this.deviceScreenHeight = i4;
        this.deviceOrientation = i6;
        this.deviceBatteryLevel = i10;
        this.locationLatitude = d10;
        this.locationLongitude = d11;
        this.deviceManufacturer = str;
        this.deviceModelIdentifier = str2;
        this.deviceIsRooted = z4;
        this.osName = osName;
        this.osVersion = str3;
        this.bundle = str4;
        this.appVersion = appVersion;
        this.instanceId = instanceId;
        this.sessionId = sessionId;
        this.networkType = networkType;
        this.crashReportingOptIn = z5;
        this.sessionActive = z8;
    }

    public /* synthetic */ MetricsData(int i, int i4, int i6, int i10, Double d10, Double d11, String str, String str2, boolean z4, String str3, String str4, String str5, AppVersion appVersion, String str6, String str7, String str8, boolean z5, boolean z8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? -1 : i, (i11 & 2) != 0 ? -1 : i4, (i11 & 4) != 0 ? -1 : i6, (i11 & 8) == 0 ? i10 : -1, (i11 & 16) != 0 ? null : d10, (i11 & 32) != 0 ? null : d11, (i11 & 64) != 0 ? null : str, (i11 & 128) != 0 ? null : str2, (i11 & 256) != 0 ? false : z4, (i11 & 512) != 0 ? EventMetricsAggregator.OS_NAME : str3, (i11 & 1024) != 0 ? null : str4, (i11 & 2048) != 0 ? null : str5, (i11 & 4096) == 0 ? appVersion : null, (i11 & 8192) != 0 ? "" : str6, (i11 & 16384) != 0 ? "" : str7, (i11 & 32768) == 0 ? str8 : "", (i11 & 65536) != 0 ? false : z5, (i11 & 131072) != 0 ? false : z8);
    }
}
