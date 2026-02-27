package com.dynatrace.agent.metrics.di;

import Bj.E;
import android.content.Context;
import com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl;
import com.dynatrace.agent.di.SecondGenServiceLocator;
import com.dynatrace.agent.metrics.MetricsRepository;
import com.dynatrace.agent.metrics.OneAgentMetricsProvider;
import com.dynatrace.agent.storage.preference.MetricsDiskDataSource;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class MetricsModule {
    private final Context context;
    private final E coroutineScope;
    private final MetricsDiskDataSource metricsDataSource;
    private final SecondGenServiceLocator secondGenServiceLocator;

    public MetricsModule(Context context, SecondGenServiceLocator secondGenServiceLocator, MetricsDiskDataSource metricsDataSource, E coroutineScope) {
        j.g(context, "context");
        j.g(secondGenServiceLocator, "secondGenServiceLocator");
        j.g(metricsDataSource, "metricsDataSource");
        j.g(coroutineScope, "coroutineScope");
        this.context = context;
        this.secondGenServiceLocator = secondGenServiceLocator;
        this.metricsDataSource = metricsDataSource;
        this.coroutineScope = coroutineScope;
    }

    public final MetricsRepository provideMetricsRepository$com_dynatrace_agent_release() {
        return new MetricsRepository(this.metricsDataSource, this.secondGenServiceLocator.locateSessionInformationProvider(), new OneAgentMetricsProvider(new NetworkConnectivityCheckerImpl(this.context, this.coroutineScope), this.context, null, 4, null), this.secondGenServiceLocator.locateMetricsProvider(), 0L, this.coroutineScope, 16, null);
    }
}
