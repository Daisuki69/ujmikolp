package com.dynatrace.android.agent.events.eventsapi;

import com.dynatrace.agent.common.InstrumentationFlavor;
import com.dynatrace.agent.metrics.AppVersion;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Version;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.events.eventsapi.EventMetrics;
import com.dynatrace.android.agent.events.eventsapi.format.Formatter;
import com.dynatrace.android.agent.events.eventsapi.format.IdentityFormatter;
import com.dynatrace.android.agent.events.eventsapi.format.ToStringFormatter;
import com.dynatrace.android.agent.metrics.AndroidMetrics;

/* JADX INFO: loaded from: classes2.dex */
public class EventMetricsAggregator {
    public static final String OS_NAME = "Android";
    public static final String TECHNOLOGY_TYPE = "android";
    private final Formatter<Integer, Integer> batteryLevelFormatter;
    private final Formatter<Integer, String> deviceOrientationFormatter;
    private final Formatter<Long, String> instanceIdFormatter;
    private final Formatter<InstrumentationFlavor, String> instrumentationFlavorFormatter;
    private final Formatter<Session, String> sessionIdFormatter;
    private final Formatter<Long, String> versionCodeFormatter;

    public static class Builder {
        private Formatter<Session, String> sessionIdFormatter = new ToStringFormatter();
        private Formatter<Long, String> instanceIdFormatter = new ToStringFormatter();
        private Formatter<Long, String> versionCodeFormatter = new ToStringFormatter();
        private Formatter<Integer, String> deviceOrientationFormatter = new ToStringFormatter();
        private Formatter<InstrumentationFlavor, String> instrumentationFlavorFormatter = new ToStringFormatter();
        private Formatter<Integer, Integer> batteryLevelFormatter = new IdentityFormatter();

        public EventMetricsAggregator build() {
            return new EventMetricsAggregator(this);
        }

        public Builder withBatteryLevelFormatter(Formatter<Integer, Integer> formatter) {
            this.batteryLevelFormatter = formatter;
            return this;
        }

        public Builder withDeviceOrientationFormatter(Formatter<Integer, String> formatter) {
            this.deviceOrientationFormatter = formatter;
            return this;
        }

        public Builder withInstanceIdFormatter(Formatter<Long, String> formatter) {
            this.instanceIdFormatter = formatter;
            return this;
        }

        public Builder withInstrumentationFlavorFormatter(Formatter<InstrumentationFlavor, String> formatter) {
            this.instrumentationFlavorFormatter = formatter;
            return this;
        }

        public Builder withSessionIdFormatter(Formatter<Session, String> formatter) {
            this.sessionIdFormatter = formatter;
            return this;
        }

        public Builder withVersionCodeFormatter(Formatter<Long, String> formatter) {
            this.versionCodeFormatter = formatter;
            return this;
        }
    }

    public EventMetrics aggregateEventMetrics(Session session, Configuration configuration, AndroidMetrics androidMetrics) {
        EventMetrics.Builder builderWithSchemaVersion = new EventMetrics.Builder().withAgentVersion(Version.getVersion()).withAgentTechnologyType("android").withOsName(OS_NAME).withOsVersion(androidMetrics.osVersion).withDeviceManufacturer(androidMetrics.manufacturer).withDeviceModelIdentifier(androidMetrics.modelId).withDeviceRooted(androidMetrics.deviceRooted).withAppBundle(AdkSettings.applIdentifier).withDeviceBatteryLevel(this.batteryLevelFormatter.format(Integer.valueOf(androidMetrics.batteryLevel))).withWindowOrientation(this.deviceOrientationFormatter.format(Integer.valueOf(androidMetrics.deviceOrientation))).withSessionId(this.sessionIdFormatter.format(session)).withInstanceId(this.instanceIdFormatter.format(Long.valueOf(session.visitorId))).withApplicationId(configuration.applicationId).withAgentFlavor(this.instrumentationFlavorFormatter.format(configuration.instrumentationFlavor)).withSchemaVersion("1.3");
        AppVersion appVersion = androidMetrics.getAppVersion();
        if (appVersion != null) {
            builderWithSchemaVersion.withAppVersion(this.versionCodeFormatter.format(Long.valueOf(appVersion.getVersionCode())));
            builderWithSchemaVersion.withAppShortVersion(appVersion.getVersionName());
        }
        return builderWithSchemaVersion.build();
    }

    private EventMetricsAggregator(Builder builder) {
        this.sessionIdFormatter = builder.sessionIdFormatter;
        this.instanceIdFormatter = builder.instanceIdFormatter;
        this.versionCodeFormatter = builder.versionCodeFormatter;
        this.deviceOrientationFormatter = builder.deviceOrientationFormatter;
        this.instrumentationFlavorFormatter = builder.instrumentationFlavorFormatter;
        this.batteryLevelFormatter = builder.batteryLevelFormatter;
    }
}
