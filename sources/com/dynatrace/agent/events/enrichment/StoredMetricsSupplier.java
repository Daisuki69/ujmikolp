package com.dynatrace.agent.events.enrichment;

import cj.r;
import com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImplKt;
import com.dynatrace.agent.common.connectivity.NetworkType;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.metrics.AppVersion;
import com.dynatrace.agent.storage.preference.MetricsData;
import dj.C1406d;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class StoredMetricsSupplier extends BaseMetricsSupplier {
    private final MetricsData metricsData;

    public StoredMetricsSupplier(MetricsData metricsData) {
        j.g(metricsData, "metricsData");
        this.metricsData = metricsData;
    }

    private final void addAppMetrics(List<EnrichmentAttribute> list) {
        AppVersion appVersion = this.metricsData.getAppVersion();
        if (appVersion != null) {
            AttributeSupplierKt.addAttribute(list, EventKeys.APP.VERSION, String.valueOf(appVersion.getVersionCode()));
            AttributeSupplierKt.addAttribute(list, EventKeys.APP.SHORT_VERSION, appVersion.getVersionName());
        }
        AttributeSupplierKt.addAttribute(list, EventKeys.APP.BUNDLE, this.metricsData.getBundle());
    }

    private final void addDeviceMetrics(List<EnrichmentAttribute> list) {
        Integer numValidScreenDimensionOrNull$com_dynatrace_agent_release = validScreenDimensionOrNull$com_dynatrace_agent_release(this.metricsData.getDeviceScreenWidth());
        Integer numValidScreenDimensionOrNull$com_dynatrace_agent_release2 = validScreenDimensionOrNull$com_dynatrace_agent_release(this.metricsData.getDeviceScreenHeight());
        if (numValidScreenDimensionOrNull$com_dynatrace_agent_release2 != null && numValidScreenDimensionOrNull$com_dynatrace_agent_release != null) {
            AttributeSupplierKt.addAttribute(list, EventKeys.DEVICE.SCREEN_WIDTH, numValidScreenDimensionOrNull$com_dynatrace_agent_release);
            AttributeSupplierKt.addAttribute(list, EventKeys.DEVICE.SCREEN_HEIGHT, numValidScreenDimensionOrNull$com_dynatrace_agent_release2);
        }
        String deviceManufacturer = this.metricsData.getDeviceManufacturer();
        if (deviceManufacturer == null) {
            deviceManufacturer = "unknown";
        }
        AttributeSupplierKt.addAttribute(list, EventKeys.DEVICE.MANUFACTURER, deviceManufacturer);
        String deviceModelIdentifier = this.metricsData.getDeviceModelIdentifier();
        AttributeSupplierKt.addAttribute(list, EventKeys.DEVICE.MODEL_IDENTIFIER, deviceModelIdentifier != null ? deviceModelIdentifier : "unknown");
        AttributeSupplierKt.addAttribute(list, EventKeys.DEVICE.IS_ROOTED, Boolean.valueOf(this.metricsData.getDeviceIsRooted()));
        AttributeSupplierKt.addAttributeIfValueNotNull(list, EventKeys.DEVICE.ORIENTATION, toDeviceOrientation$com_dynatrace_agent_release(this.metricsData.getDeviceOrientation()));
        AttributeSupplierKt.addAttributeIfValueNotNull(list, EventKeys.DEVICE.BATTERY_LEVEL, validBatteryLevelOrNull$com_dynatrace_agent_release(Integer.valueOf(this.metricsData.getDeviceBatteryLevel())));
    }

    private final void addGeoLocationMetrics(List<EnrichmentAttribute> list) {
        Double locationLatitude = this.metricsData.getLocationLatitude();
        Double locationLongitude = this.metricsData.getLocationLongitude();
        if (locationLatitude == null || locationLongitude == null) {
            return;
        }
        BigDecimal bigDecimal = new BigDecimal(locationLatitude.doubleValue());
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        AttributeSupplierKt.addAttribute(list, EventKeys.GEO.LOCATION_LAT, Double.valueOf(bigDecimal.setScale(2, roundingMode).doubleValue()));
        AttributeSupplierKt.addAttribute(list, EventKeys.GEO.LOCATION_LON, Double.valueOf(new BigDecimal(locationLongitude.doubleValue()).setScale(2, roundingMode).doubleValue()));
    }

    private final void addNetworkType(List<EnrichmentAttribute> list) {
        NetworkType networkTypeOrNull = NetworkConnectivityCheckerImplKt.toNetworkTypeOrNull(this.metricsData.getNetworkType());
        AttributeSupplierKt.addAttributeIfValueNotNull(list, EventKeys.NETWORK.CONNECTION_TYPE, networkTypeOrNull != null ? NetworkTypeExtensionsKt.getStringRepresentation(networkTypeOrNull) : null);
    }

    private final void addOsMetrics(List<EnrichmentAttribute> list) {
        AttributeSupplierKt.addAttribute(list, EventKeys.OS.NAME, this.metricsData.getOsName());
        String osVersion = this.metricsData.getOsVersion();
        if (osVersion == null) {
            osVersion = "unknown";
        }
        AttributeSupplierKt.addAttribute(list, EventKeys.OS.VERSION, osVersion);
    }

    @Override // com.dynatrace.agent.events.enrichment.AttributeSupplier
    public List<EnrichmentAttribute> supply() {
        C1406d c1406dB = r.b();
        addDeviceMetrics(c1406dB);
        addOsMetrics(c1406dB);
        addAppMetrics(c1406dB);
        addGeoLocationMetrics(c1406dB);
        addNetworkType(c1406dB);
        return r.a(c1406dB);
    }
}
