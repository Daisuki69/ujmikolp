package com.dynatrace.android.agent.mixed;

import android.os.SystemClock;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.android.agent.DeviceStartTimeProvider;
import com.dynatrace.android.agent.TimeLineProvider;

/* JADX INFO: loaded from: classes2.dex */
public class TimeProviderFactory {

    public static class SystemTimeProvider implements TimeProvider {
        private final DeviceStartTimeProvider deviceStartTimeProvider;

        @Override // com.dynatrace.agent.common.time.TimeProvider
        public long millisSinceEpoch() {
            return SystemClock.elapsedRealtime() + this.deviceStartTimeProvider.getDeviceStartTimeMillis();
        }

        @Override // com.dynatrace.agent.common.time.TimeProvider
        public long nanosSinceEpoch() {
            return SystemClock.elapsedRealtimeNanos() + this.deviceStartTimeProvider.getDeviceStartTimeNanos();
        }

        private SystemTimeProvider(DeviceStartTimeProvider deviceStartTimeProvider) {
            this.deviceStartTimeProvider = deviceStartTimeProvider;
        }
    }

    public TimeProvider createTimelineProvider() {
        return new SystemTimeProvider(TimeLineProvider.DEVICE_START_TIME_PROVIDER);
    }
}
