package com.dynatrace.android.agent.mixed;

import android.app.Application;
import com.dynatrace.agent.OneAgentConfiguration;
import com.dynatrace.agent.OneAgentStartup;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.api.OneAgentFacade;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.agent.di.CoreComponent;
import com.dynatrace.agent.di.SecondGenServiceLocator;
import com.dynatrace.agent.metrics.MetricsRepository;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.communication.CommunicationManagerBridge;
import com.dynatrace.android.agent.communication.ServerConfigurationListener;
import com.dynatrace.android.agent.conf.ConfigurationPublisher;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.lifecycle.OneAgentLifecycleManagerBridge;
import com.dynatrace.android.agent.useraction.OneAgentUserInteractionManagerBridge;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import okhttp3.Call;

/* JADX INFO: loaded from: classes2.dex */
public class AgentServiceLocatorImpl implements AgentServiceLocator {
    private final Application applicationContext;
    private final Call.Factory httpFactory;
    private final OneAgentConfiguration oneAgentConfiguration;
    private final SecondGenServiceLocator secondGenServiceLocator;
    private final TimeProvider timeProvider;

    public AgentServiceLocatorImpl(OneAgentConfiguration oneAgentConfiguration, TimeProvider timeProvider, Application application, Call.Factory factory, SecondGenServiceLocator secondGenServiceLocator) {
        this.oneAgentConfiguration = oneAgentConfiguration;
        this.timeProvider = timeProvider;
        this.applicationContext = application;
        this.httpFactory = factory;
        this.secondGenServiceLocator = secondGenServiceLocator;
    }

    @Override // com.dynatrace.android.agent.mixed.AgentServiceLocator
    public void init(ConfigurationPublisher configurationPublisher) {
        Utility.devLog(OneAgentLoggingKt.TAG_START_STOP_AGENT, "initialize OneAgent, oneAgentConfiguration: " + this.oneAgentConfiguration + " httpFactory: " + this.httpFactory);
        CoreComponent.Holder.initComponent(this.oneAgentConfiguration, this.timeProvider, new ServerConfigurationListener() { // from class: com.dynatrace.android.agent.mixed.AgentServiceLocatorImpl.1
            @Override // com.dynatrace.android.agent.communication.ServerConfigurationListener
            public void onAgentStateChanged(AgentState agentState) {
                Core.applyAgentStateFromOneAgent(agentState);
            }

            @Override // com.dynatrace.android.agent.communication.ServerConfigurationListener
            public void onServerConfigurationChanged(ServerConfiguration serverConfiguration) {
                Core.applyConfigurationFromOneAgent(serverConfiguration);
            }
        }, this.httpFactory, this.applicationContext, this.secondGenServiceLocator, configurationPublisher);
    }

    @Override // com.dynatrace.android.agent.mixed.AgentServiceLocator
    public CommunicationManagerBridge provideCommunicationManagerBridge() {
        return CoreComponent.Holder.getInstance().getCommunicationManagerBridge();
    }

    @Override // com.dynatrace.android.agent.mixed.AgentServiceLocator
    public MetricsRepository provideMetricsRepository() {
        CoreComponent holder = CoreComponent.Holder.getInstance();
        if (holder != null) {
            return holder.getMetricsRepository();
        }
        return null;
    }

    @Override // com.dynatrace.android.agent.mixed.AgentServiceLocator
    public OneAgentFacade provideOneAgentFacade() {
        return CoreComponent.Holder.getInstance().getOneAgentFacade();
    }

    @Override // com.dynatrace.android.agent.mixed.AgentServiceLocator
    public OneAgentLifecycleManagerBridge provideOneAgentLifecycleManagerBridge() {
        return CoreComponent.Holder.getInstance().getOneAgentLifecycleManagerBridge();
    }

    @Override // com.dynatrace.android.agent.mixed.AgentServiceLocator
    public OneAgentStartup provideOneAgentStartup() {
        return CoreComponent.Holder.getInstance().getOneAgentStartup();
    }

    @Override // com.dynatrace.android.agent.mixed.AgentServiceLocator
    public OneAgentUserInteractionManagerBridge provideOneAgentUserInteractionManagerBridge() {
        return CoreComponent.Holder.getInstance().getOneAgentUserInteractionManagerBridge();
    }

    @Override // com.dynatrace.android.agent.mixed.AgentServiceLocator
    public RumEventDispatcher provideRumEventDispatcher() {
        return CoreComponent.Holder.getInstance().getRumEventDispatcher();
    }

    @Override // com.dynatrace.android.agent.mixed.AgentServiceLocator
    public void shutdown() {
        CoreComponent.Holder.tearDown();
    }
}
