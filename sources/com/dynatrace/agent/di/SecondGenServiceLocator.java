package com.dynatrace.agent.di;

import com.dynatrace.agent.metrics.SecondGenMetricsProvider;

/* JADX INFO: loaded from: classes2.dex */
public interface SecondGenServiceLocator {
    SecondGenMetricsProvider locateMetricsProvider();

    SelfMonitoringComponent locateSelfMonitoring();

    SessionInformationProvider locateSessionInformationProvider();
}
