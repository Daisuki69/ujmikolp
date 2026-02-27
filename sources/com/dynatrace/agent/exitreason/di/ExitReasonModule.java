package com.dynatrace.agent.exitreason.di;

import android.content.Context;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.exitreason.ExitReasonProcessor;
import com.dynatrace.agent.exitreason.convertor.ExitReasonConverter;
import com.dynatrace.agent.metrics.MetricsRepository;
import com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ExitReasonModule {
    private final Context context;
    private final DataStoreExitReasonTimestampDataSource exitReasonTimestampDataSource;
    private final boolean isAnrReportingEnabled;
    private final boolean isNativeCrashReportingEnabled;
    private final MetricsRepository metricsRepository;
    private final long retentionTime;
    private final RumEventDispatcher rumEventDispatcher;
    private final SessionInformationProvider sessionInformationProvider;
    private final TimeProvider timeProvider;

    public ExitReasonModule(Context context, TimeProvider timeProvider, long j, RumEventDispatcher rumEventDispatcher, SessionInformationProvider sessionInformationProvider, MetricsRepository metricsRepository, DataStoreExitReasonTimestampDataSource exitReasonTimestampDataSource, boolean z4, boolean z5) {
        j.g(context, "context");
        j.g(timeProvider, "timeProvider");
        j.g(rumEventDispatcher, "rumEventDispatcher");
        j.g(sessionInformationProvider, "sessionInformationProvider");
        j.g(metricsRepository, "metricsRepository");
        j.g(exitReasonTimestampDataSource, "exitReasonTimestampDataSource");
        this.context = context;
        this.timeProvider = timeProvider;
        this.retentionTime = j;
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
        this.metricsRepository = metricsRepository;
        this.exitReasonTimestampDataSource = exitReasonTimestampDataSource;
        this.isNativeCrashReportingEnabled = z4;
        this.isAnrReportingEnabled = z5;
    }

    public final ExitReasonProcessor provideExitReasonProcessor$com_dynatrace_agent_release() {
        return new ExitReasonProcessor(new ExitReasonConverter(), this.exitReasonTimestampDataSource, this.timeProvider, this.retentionTime, this.context, this.rumEventDispatcher, this.sessionInformationProvider, this.metricsRepository, this.isNativeCrashReportingEnabled, this.isAnrReportingEnabled);
    }

    public /* synthetic */ ExitReasonModule(Context context, TimeProvider timeProvider, long j, RumEventDispatcher rumEventDispatcher, SessionInformationProvider sessionInformationProvider, MetricsRepository metricsRepository, DataStoreExitReasonTimestampDataSource dataStoreExitReasonTimestampDataSource, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, timeProvider, (i & 4) != 0 ? 540000L : j, rumEventDispatcher, sessionInformationProvider, metricsRepository, dataStoreExitReasonTimestampDataSource, z4, z5);
    }
}
