package com.dynatrace.agent.metrics;

import Bj.E;
import Bj.H;
import Bj.InterfaceC0156n0;
import android.location.Location;
import bj.AbstractC1039j;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.storage.di.StorageModuleKt;
import com.dynatrace.agent.storage.preference.MetricsData;
import com.dynatrace.agent.storage.preference.MetricsDiskDataSource;
import com.dynatrace.android.agent.util.Utility;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.time.a;
import kotlin.time.b;

/* JADX INFO: loaded from: classes2.dex */
public final class MetricsRepository {
    private static final Companion Companion = new Companion(null);
    private static final int UNKNOWN_SCREEN_DIMENSION = -1;
    private volatile MetricsData cachedMetrics;
    private final E coroutineScope;
    private final long interval;
    private InterfaceC0156n0 job;
    private final MetricsDiskDataSource metricsDataSource;
    private volatile MetricsData metricsFromPreviousSession;
    private final OneAgentMetricsProvider oneAgentMetricsProvider;
    private final SecondGenMetricsProvider secondGenMetricsProvider;
    private final SessionInformationProvider sessionProvider;

    /* JADX INFO: renamed from: com.dynatrace.agent.metrics.MetricsRepository$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.metrics.MetricsRepository$1", f = "MetricsRepository.kt", l = {57}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return MetricsRepository.this.new AnonymousClass1(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            MetricsRepository metricsRepository;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                MetricsRepository metricsRepository2 = MetricsRepository.this;
                MetricsDiskDataSource metricsDiskDataSource = metricsRepository2.metricsDataSource;
                this.L$0 = metricsRepository2;
                this.label = 1;
                Object metrics = metricsDiskDataSource.getMetrics(this);
                if (metrics == enumC1578a) {
                    return enumC1578a;
                }
                metricsRepository = metricsRepository2;
                obj = metrics;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                metricsRepository = (MetricsRepository) this.L$0;
                AbstractC1039j.b(obj);
            }
            metricsRepository.metricsFromPreviousSession = (MetricsData) obj;
            return Unit.f18162a;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ MetricsRepository(MetricsDiskDataSource metricsDiskDataSource, SessionInformationProvider sessionInformationProvider, OneAgentMetricsProvider oneAgentMetricsProvider, SecondGenMetricsProvider secondGenMetricsProvider, long j, E e, DefaultConstructorMarker defaultConstructorMarker) {
        this(metricsDiskDataSource, sessionInformationProvider, oneAgentMetricsProvider, secondGenMetricsProvider, j, e);
    }

    private final MetricsData initializeMetrics() {
        int iDeviceOrientation = this.oneAgentMetricsProvider.deviceOrientation();
        String manufacturer = this.oneAgentMetricsProvider.getManufacturer();
        String model = this.oneAgentMetricsProvider.getModel();
        boolean zIsDeviceRooted = this.oneAgentMetricsProvider.isDeviceRooted();
        String osVersion = this.oneAgentMetricsProvider.getOsVersion();
        String strPackageName = this.oneAgentMetricsProvider.packageName();
        String strNetworkState = this.oneAgentMetricsProvider.networkState();
        return new MetricsData(0, 0, iDeviceOrientation, this.secondGenMetricsProvider.batteryLevel(), null, null, manufacturer, model, zIsDeviceRooted, null, osVersion, strPackageName, this.secondGenMetricsProvider.appVersion(), null, null, strNetworkState, false, false, 221747, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateMetrics(InterfaceC1526a<? super Unit> interfaceC1526a) {
        SessionInformationMetrics sessionInformationMetricsCollectSessionInfo = this.sessionProvider.collectSessionInfo();
        this.cachedMetrics = MetricsData.copy$default(this.cachedMetrics, 0, 0, this.oneAgentMetricsProvider.deviceOrientation(), this.secondGenMetricsProvider.batteryLevel(), null, null, null, null, false, null, null, null, null, sessionInformationMetricsCollectSessionInfo.getInstanceId(), sessionInformationMetricsCollectSessionInfo.getSessionId(), this.oneAgentMetricsProvider.networkState(), sessionInformationMetricsCollectSessionInfo.getCrashReporting(), sessionInformationMetricsCollectSessionInfo.getSessionActive(), 8179, null);
        Utility.devLog(StorageModuleKt.TAG_STORAGE, "updated and stored metrics");
        Object metrics = this.metricsDataSource.setMetrics(this.cachedMetrics, interfaceC1526a);
        return metrics == EnumC1578a.f17050a ? metrics : Unit.f18162a;
    }

    public final MetricsData getCachedMetrics() {
        return this.cachedMetrics;
    }

    public final MetricsData getMetricsFromPreviousSession() {
        return this.metricsFromPreviousSession;
    }

    public final void runPeriodicMetricsUpdate$com_dynatrace_agent_release() {
        stop$com_dynatrace_agent_release();
        this.job = H.w(this.coroutineScope, null, null, new MetricsRepository$runPeriodicMetricsUpdate$1(this, null), 3);
    }

    public final void stop$com_dynatrace_agent_release() {
        InterfaceC0156n0 interfaceC0156n0 = this.job;
        if (interfaceC0156n0 != null) {
            interfaceC0156n0.b(null);
        }
        this.job = null;
    }

    public final void updateLocationMetrics(Location location) {
        this.cachedMetrics = MetricsData.copy$default(this.cachedMetrics, 0, 0, 0, 0, location != null ? Double.valueOf(location.getLatitude()) : null, location != null ? Double.valueOf(location.getLongitude()) : null, null, null, false, null, null, null, null, null, null, null, false, false, 262095, null);
    }

    public final void updateScreenMetrics(OneAgentScreenMetrics oneAgentScreenMetrics) {
        this.cachedMetrics = MetricsData.copy$default(this.cachedMetrics, oneAgentScreenMetrics != null ? oneAgentScreenMetrics.getScreenWidth() : -1, oneAgentScreenMetrics != null ? oneAgentScreenMetrics.getScreenHeight() : -1, 0, 0, null, null, null, null, false, null, null, null, null, null, null, null, false, false, 262140, null);
    }

    private MetricsRepository(MetricsDiskDataSource metricsDataSource, SessionInformationProvider sessionProvider, OneAgentMetricsProvider oneAgentMetricsProvider, SecondGenMetricsProvider secondGenMetricsProvider, long j, E coroutineScope) {
        j.g(metricsDataSource, "metricsDataSource");
        j.g(sessionProvider, "sessionProvider");
        j.g(oneAgentMetricsProvider, "oneAgentMetricsProvider");
        j.g(secondGenMetricsProvider, "secondGenMetricsProvider");
        j.g(coroutineScope, "coroutineScope");
        this.metricsDataSource = metricsDataSource;
        this.sessionProvider = sessionProvider;
        this.oneAgentMetricsProvider = oneAgentMetricsProvider;
        this.secondGenMetricsProvider = secondGenMetricsProvider;
        this.interval = j;
        this.coroutineScope = coroutineScope;
        this.cachedMetrics = initializeMetrics();
        H.w(coroutineScope, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MetricsRepository(MetricsDiskDataSource metricsDiskDataSource, SessionInformationProvider sessionInformationProvider, OneAgentMetricsProvider oneAgentMetricsProvider, SecondGenMetricsProvider secondGenMetricsProvider, long j, E e, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long jE;
        if ((i & 16) != 0) {
            a.C0097a c0097a = a.f18208b;
            jE = b.e(5, Aj.b.f331d);
        } else {
            jE = j;
        }
        this(metricsDiskDataSource, sessionInformationProvider, oneAgentMetricsProvider, secondGenMetricsProvider, jE, e, null);
    }
}
