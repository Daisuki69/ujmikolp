package com.dynatrace.android.agent;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceStartTimeProvider {
    private final long deviceStartTimeMillis;
    private final long deviceStartTimeNanos;

    public DeviceStartTimeProvider(long j, long j6, long j7) {
        this.deviceStartTimeMillis = j - j6;
        this.deviceStartTimeNanos = TimeUnit.MILLISECONDS.toNanos(j) - j7;
    }

    public long getDeviceStartTimeMillis() {
        return this.deviceStartTimeMillis;
    }

    public long getDeviceStartTimeNanos() {
        return this.deviceStartTimeNanos;
    }
}
