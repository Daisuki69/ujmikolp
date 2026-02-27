package com.dynatrace.android.agent.mixed;

import com.dynatrace.agent.OneAgentStartup;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.api.OneAgentFacade;
import com.dynatrace.agent.metrics.MetricsRepository;
import com.dynatrace.android.agent.communication.CommunicationManagerBridge;
import com.dynatrace.android.agent.conf.ConfigurationPublisher;
import com.dynatrace.android.agent.lifecycle.OneAgentLifecycleManagerBridge;
import com.dynatrace.android.agent.useraction.OneAgentUserInteractionManagerBridge;

/* JADX INFO: loaded from: classes2.dex */
public interface AgentServiceLocator {
    void init(ConfigurationPublisher configurationPublisher);

    CommunicationManagerBridge provideCommunicationManagerBridge();

    MetricsRepository provideMetricsRepository();

    OneAgentFacade provideOneAgentFacade();

    OneAgentLifecycleManagerBridge provideOneAgentLifecycleManagerBridge();

    OneAgentStartup provideOneAgentStartup();

    OneAgentUserInteractionManagerBridge provideOneAgentUserInteractionManagerBridge();

    RumEventDispatcher provideRumEventDispatcher();

    void shutdown();
}
