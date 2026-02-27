package com.dynatrace.agent;

import Bj.E;
import Bj.H;
import com.dynatrace.agent.communication.CommunicationManager;
import com.dynatrace.agent.exitreason.ExitReasonProcessor;
import com.dynatrace.agent.metrics.MetricsRepository;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.agent.storage.db.EventDatabaseDataSource;
import com.dynatrace.agent.storage.preference.EndPointInfoDataSource;
import com.dynatrace.agent.storage.preference.ServerConfigurationDataSource;
import com.dynatrace.android.agent.conf.ConfigurationPublisher;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class OneAgentStartupImpl implements OneAgentStartup {
    private final EndPointInfo activeEndPoint;
    private final CommunicationManager communicationManager;
    private final ConfigurationPublisher configurationPublisher;
    private final EndPointInfoDataSource endPointInfoDataSource;
    private final EventDatabaseDataSource eventDatabaseDataSource;
    private final ExitReasonProcessor exitReasonProcessor;
    private final E externalScope;
    private final MetricsRepository metricsRepository;
    private final ServerConfigurationDataSource serverConfigurationDataSource;

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentStartupImpl$start$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.OneAgentStartupImpl$start$1", f = "OneAgentStartupImpl.kt", l = {51, 53, 68, 69, 70, 71, 76, 80}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ ServerConfiguration $serverConfigurationV3;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ServerConfiguration serverConfiguration, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$serverConfigurationV3 = serverConfiguration;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return OneAgentStartupImpl.this.new AnonymousClass1(this.$serverConfigurationV3, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[PHI: r6
  0x006e: PHI (r6v9 java.lang.Object) = (r6v8 java.lang.Object), (r6v0 java.lang.Object) binds: [B:18:0x006a, B:12:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x012d A[PHI: r6
  0x012d: PHI (r6v29 com.dynatrace.agent.storage.preference.ServerConfigurationV4) = 
  (r6v28 com.dynatrace.agent.storage.preference.ServerConfigurationV4)
  (r6v30 com.dynatrace.agent.storage.preference.ServerConfigurationV4)
 binds: [B:37:0x012a, B:7:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x014d  */
        @Override // ij.AbstractC1607a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 408
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.OneAgentStartupImpl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public OneAgentStartupImpl(CommunicationManager communicationManager, ExitReasonProcessor exitReasonProcessor, EventDatabaseDataSource eventDatabaseDataSource, ServerConfigurationDataSource serverConfigurationDataSource, EndPointInfoDataSource endPointInfoDataSource, EndPointInfo activeEndPoint, E externalScope, ConfigurationPublisher configurationPublisher, MetricsRepository metricsRepository) {
        j.g(communicationManager, "communicationManager");
        j.g(exitReasonProcessor, "exitReasonProcessor");
        j.g(eventDatabaseDataSource, "eventDatabaseDataSource");
        j.g(serverConfigurationDataSource, "serverConfigurationDataSource");
        j.g(endPointInfoDataSource, "endPointInfoDataSource");
        j.g(activeEndPoint, "activeEndPoint");
        j.g(externalScope, "externalScope");
        j.g(configurationPublisher, "configurationPublisher");
        j.g(metricsRepository, "metricsRepository");
        this.communicationManager = communicationManager;
        this.exitReasonProcessor = exitReasonProcessor;
        this.eventDatabaseDataSource = eventDatabaseDataSource;
        this.serverConfigurationDataSource = serverConfigurationDataSource;
        this.endPointInfoDataSource = endPointInfoDataSource;
        this.activeEndPoint = activeEndPoint;
        this.externalScope = externalScope;
        this.configurationPublisher = configurationPublisher;
        this.metricsRepository = metricsRepository;
    }

    @Override // com.dynatrace.agent.OneAgentStartup
    public void start(ServerConfiguration serverConfigurationV3) {
        j.g(serverConfigurationV3, "serverConfigurationV3");
        H.w(this.externalScope, null, null, new AnonymousClass1(serverConfigurationV3, null), 3);
    }
}
