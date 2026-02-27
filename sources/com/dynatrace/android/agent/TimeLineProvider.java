package com.dynatrace.android.agent;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public class TimeLineProvider {
    public static final DeviceStartTimeProvider DEVICE_START_TIME_PROVIDER;
    public static final TimeLineProvider GLOBAL_TIME_LINE_PROVIDER;
    private final DeviceStartTimeProvider deviceStartTimeProvider;

    static {
        DeviceStartTimeProvider deviceStartTimeProvider = new DeviceStartTimeProvider(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.elapsedRealtimeNanos());
        DEVICE_START_TIME_PROVIDER = deviceStartTimeProvider;
        GLOBAL_TIME_LINE_PROVIDER = new TimeLineProvider(deviceStartTimeProvider);
    }

    private TimeLineProvider(DeviceStartTimeProvider deviceStartTimeProvider) {
        this.deviceStartTimeProvider = deviceStartTimeProvider;
    }

    public static long getSystemTime() {
        return GLOBAL_TIME_LINE_PROVIDER.now();
    }

    public static long getSystemTimeNanos() {
        return GLOBAL_TIME_LINE_PROVIDER.nowNanos();
    }

    public long now() {
        return SystemClock.elapsedRealtime() + this.deviceStartTimeProvider.getDeviceStartTimeMillis();
    }

    public long nowNanos() {
        return SystemClock.elapsedRealtimeNanos() + this.deviceStartTimeProvider.getDeviceStartTimeNanos();
    }
}
