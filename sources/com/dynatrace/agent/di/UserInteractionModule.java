package com.dynatrace.agent.di;

import Bj.E;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.storage.preference.ServerConfigurationDataSource;
import com.dynatrace.agent.userinteraction.OneAgentUserInteractionManager;
import com.dynatrace.agent.userinteraction.OneAgentUserInteractionManagerImpl;
import com.dynatrace.agent.userinteraction.handler.UserInteractionHandlerFactoryImpl;
import com.dynatrace.agent.userinteraction.model.TouchUserInteractionComposeGenerator;
import com.dynatrace.agent.userinteraction.model.TouchUserInteractionGeneratorImpl;
import com.dynatrace.agent.userinteraction.model.TouchUserInteractionNativeGenerator;
import com.dynatrace.agent.userinteraction.util.UserInteractionLogger;
import com.dynatrace.agent.userinteraction.util.UserInteractionMaskingValidator;
import com.dynatrace.agent.userinteraction.util.UserInteractionTracker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class UserInteractionModule {
    private final E coroutineScope;
    private final RumEventDispatcher rumEventDispatcher;
    private final ServerConfigurationDataSource serverConfigurationDataSource;
    private final SessionInformationProvider sessionInformationProvider;
    private final TimeProvider timeProvider;

    public UserInteractionModule(E coroutineScope, TimeProvider timeProvider, RumEventDispatcher rumEventDispatcher, SessionInformationProvider sessionInformationProvider, ServerConfigurationDataSource serverConfigurationDataSource) {
        j.g(coroutineScope, "coroutineScope");
        j.g(timeProvider, "timeProvider");
        j.g(rumEventDispatcher, "rumEventDispatcher");
        j.g(sessionInformationProvider, "sessionInformationProvider");
        j.g(serverConfigurationDataSource, "serverConfigurationDataSource");
        this.coroutineScope = coroutineScope;
        this.timeProvider = timeProvider;
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
        this.serverConfigurationDataSource = serverConfigurationDataSource;
    }

    public final OneAgentUserInteractionManager provideUserInteractionManager() {
        return new OneAgentUserInteractionManagerImpl(new UserInteractionHandlerFactoryImpl(this.coroutineScope, new UserInteractionLogger(), new UserInteractionTracker(this.rumEventDispatcher, this.sessionInformationProvider, this.timeProvider), new TouchUserInteractionGeneratorImpl(new TouchUserInteractionNativeGenerator(new UserInteractionMaskingValidator()), new TouchUserInteractionComposeGenerator()), this.serverConfigurationDataSource));
    }
}
