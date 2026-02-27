package com.dynatrace.android.agent.events.eventsapi;

import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.dynatrace.android.agent.events.eventsapi.format.BatteryLevelFormatter;
import com.dynatrace.android.agent.events.eventsapi.format.DeviceOrientationFormatter;
import com.dynatrace.android.agent.events.eventsapi.format.InstrumentationFlavorFormatter;
import com.dynatrace.android.agent.events.eventsapi.format.SessionIdFormatter;
import com.dynatrace.android.agent.events.eventsapi.format.ToStringFormatter;

/* JADX INFO: loaded from: classes2.dex */
public final class EventMetricsAggregatorFactory {
    public static EventMetricsAggregator createEventMetricsAggregator() {
        return new EventMetricsAggregator.Builder().withBatteryLevelFormatter(new BatteryLevelFormatter()).withDeviceOrientationFormatter(new DeviceOrientationFormatter()).withInstrumentationFlavorFormatter(new InstrumentationFlavorFormatter()).withSessionIdFormatter(new SessionIdFormatter()).withInstanceIdFormatter(new ToStringFormatter()).withVersionCodeFormatter(new ToStringFormatter()).build();
    }
}
