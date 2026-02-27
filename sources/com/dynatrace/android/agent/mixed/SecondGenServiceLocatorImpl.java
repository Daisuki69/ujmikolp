package com.dynatrace.android.agent.mixed;

import android.content.Context;
import androidx.media3.extractor.flv.a;
import com.dynatrace.agent.di.SecondGenServiceLocator;
import com.dynatrace.agent.di.SelfMonitoringComponent;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.metrics.SecondGenMetricsProvider;
import com.dynatrace.android.agent.metrics.AppVersionTracker;
import com.dynatrace.android.agent.metrics.BatteryTracker;
import com.dynatrace.android.agent.util.SdkVersionProviderImpl;

/* JADX INFO: loaded from: classes2.dex */
public class SecondGenServiceLocatorImpl implements SecondGenServiceLocator {
    private final Context context;

    public SecondGenServiceLocatorImpl(Context context) {
        this.context = context;
    }

    @Override // com.dynatrace.agent.di.SecondGenServiceLocator
    public SecondGenMetricsProvider locateMetricsProvider() {
        return new SecondGenMetricsProviderImpl(new AppVersionTracker(this.context, new SdkVersionProviderImpl()), BatteryTracker.generateBatteryTracker(this.context));
    }

    @Override // com.dynatrace.agent.di.SecondGenServiceLocator
    public SelfMonitoringComponent locateSelfMonitoring() {
        return new a(27);
    }

    @Override // com.dynatrace.agent.di.SecondGenServiceLocator
    public SessionInformationProvider locateSessionInformationProvider() {
        return new SessionInformationProviderImpl();
    }
}
