package com.dynatrace.android.agent.mixed;

import com.dynatrace.agent.metrics.AppVersion;
import com.dynatrace.agent.metrics.SecondGenMetricsProvider;
import com.dynatrace.android.agent.metrics.AppVersionTracker;
import com.dynatrace.android.agent.metrics.BatteryTracker;

/* JADX INFO: loaded from: classes2.dex */
public class SecondGenMetricsProviderImpl implements SecondGenMetricsProvider {
    private final AppVersionTracker appVersionTracker;
    private final BatteryTracker batteryTracker;

    public SecondGenMetricsProviderImpl(AppVersionTracker appVersionTracker, BatteryTracker batteryTracker) {
        this.appVersionTracker = appVersionTracker;
        this.batteryTracker = batteryTracker;
    }

    @Override // com.dynatrace.agent.metrics.SecondGenMetricsProvider
    public AppVersion appVersion() {
        return this.appVersionTracker.determineAppVersion();
    }

    @Override // com.dynatrace.agent.metrics.SecondGenMetricsProvider
    public int batteryLevel() {
        return this.batteryTracker.captureBatteryLevel();
    }
}
