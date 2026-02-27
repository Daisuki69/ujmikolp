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
public final class CachedMetricsSupplier extends BaseMetricsSupplier {
    private final MetricsData metricsCache;

    public CachedMetricsSupplier(MetricsData metricsCache) {
        j.g(metricsCache, "metricsCache");
        this.metricsCache = metricsCache;
    }

    private final void addAppMetrics(List<EnrichmentAttribute> list) {
        AppVersion appVersion = this.metricsCache.getAppVersion();
        if (appVersion != null) {
            AttributeSupplierKt.addAttribute(list, EventKeys.APP.VERSION, String.valueOf(appVersion.getVersionCode()));
            AttributeSupplierKt.addAttribute(list, EventKeys.APP.SHORT_VERSION, appVersion.getVersionName());
        }
        AttributeSupplierKt.addAttribute(list, EventKeys.APP.BUNDLE, this.metricsCache.getBundle());
    }

    private final void addDeviceMetrics(List<EnrichmentAttribute> list) {
        Integer numValidScreenDimensionOrNull$com_dynatrace_agent_release = validScreenDimensionOrNull$com_dynatrace_agent_release(this.metricsCache.getDeviceScreenWidth());
        Integer numValidScreenDimensionOrNull$com_dynatrace_agent_release2 = validScreenDimensionOrNull$com_dynatrace_agent_release(this.metricsCache.getDeviceScreenHeight());
        if (numValidScreenDimensionOrNull$com_dynatrace_agent_release2 != null && numValidScreenDimensionOrNull$com_dynatrace_agent_release != null) {
            AttributeSupplierKt.addAttribute(list, EventKeys.DEVICE.SCREEN_WIDTH, numValidScreenDimensionOrNull$com_dynatrace_agent_release);
            AttributeSupplierKt.addAttribute(list, EventKeys.DEVICE.SCREEN_HEIGHT, numValidScreenDimensionOrNull$com_dynatrace_agent_release2);
        }
        String deviceManufacturer = this.metricsCache.getDeviceManufacturer();
        if (deviceManufacturer == null) {
            deviceManufacturer = "unknown";
        }
        AttributeSupplierKt.addAttribute(list, EventKeys.DEVICE.MANUFACTURER, deviceManufacturer);
        String deviceModelIdentifier = this.metricsCache.getDeviceModelIdentifier();
        AttributeSupplierKt.addAttribute(list, EventKeys.DEVICE.MODEL_IDENTIFIER, deviceModelIdentifier != null ? deviceModelIdentifier : "unknown");
        AttributeSupplierKt.addAttribute(list, EventKeys.DEVICE.IS_ROOTED, Boolean.valueOf(this.metricsCache.getDeviceIsRooted()));
        AttributeSupplierKt.addAttributeIfValueNotNull(list, EventKeys.DEVICE.ORIENTATION, toDeviceOrientation$com_dynatrace_agent_release(this.metricsCache.getDeviceOrientation()));
        AttributeSupplierKt.addAttributeIfValueNotNull(list, EventKeys.DEVICE.BATTERY_LEVEL, validBatteryLevelOrNull$com_dynatrace_agent_release(Integer.valueOf(this.metricsCache.getDeviceBatteryLevel())));
    }

    private final void addGeoLocationMetrics(List<EnrichmentAttribute> list) {
        Double locationLatitude = this.metricsCache.getLocationLatitude();
        Double locationLongitude = this.metricsCache.getLocationLongitude();
        if (locationLatitude == null || locationLongitude == null) {
            return;
        }
        BigDecimal bigDecimal = new BigDecimal(locationLatitude.doubleValue());
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        AttributeSupplierKt.addAttribute(list, EventKeys.GEO.LOCATION_LAT, Double.valueOf(bigDecimal.setScale(2, roundingMode).doubleValue()));
        AttributeSupplierKt.addAttribute(list, EventKeys.GEO.LOCATION_LON, Double.valueOf(new BigDecimal(locationLongitude.doubleValue()).setScale(2, roundingMode).doubleValue()));
    }

    private final void addNetworkType(List<EnrichmentAttribute> list) {
        NetworkType networkTypeOrNull = NetworkConnectivityCheckerImplKt.toNetworkTypeOrNull(this.metricsCache.getNetworkType());
        AttributeSupplierKt.addAttributeIfValueNotNull(list, EventKeys.NETWORK.CONNECTION_TYPE, networkTypeOrNull != null ? NetworkTypeExtensionsKt.getStringRepresentation(networkTypeOrNull) : null);
    }

    private final void addOsMetrics(List<EnrichmentAttribute> list) {
        AttributeSupplierKt.addAttribute(list, EventKeys.OS.NAME, this.metricsCache.getOsName());
        String osVersion = this.metricsCache.getOsVersion();
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
