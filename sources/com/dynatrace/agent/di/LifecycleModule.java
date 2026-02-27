package com.dynatrace.agent.di;

import W4.b;
import android.app.Application;
import com.dynatrace.agent.OneAgentStartupEventDispatcher;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.lifecycle.AppStartupManagerImpl;
import com.dynatrace.agent.lifecycle.OneAgentLifecycleManager;
import com.dynatrace.agent.lifecycle.VisibilityManagerImpl;
import com.dynatrace.agent.lifecycle.util.AppStartupLogger;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class LifecycleModule {
    private final Application application;
    private final RumEventDispatcher rumEventDispatcher;
    private final OneAgentStartupEventDispatcher rumStartupEventDispatcher;
    private final SessionInformationProvider sessionInformationProvider;
    private final TimeProvider timeProvider;

    public LifecycleModule(TimeProvider timeProvider, Application application, RumEventDispatcher rumEventDispatcher, OneAgentStartupEventDispatcher rumStartupEventDispatcher, SessionInformationProvider sessionInformationProvider) {
        j.g(timeProvider, "timeProvider");
        j.g(application, "application");
        j.g(rumEventDispatcher, "rumEventDispatcher");
        j.g(rumStartupEventDispatcher, "rumStartupEventDispatcher");
        j.g(sessionInformationProvider, "sessionInformationProvider");
        this.timeProvider = timeProvider;
        this.application = application;
        this.rumEventDispatcher = rumEventDispatcher;
        this.rumStartupEventDispatcher = rumStartupEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
    }

    public final OneAgentLifecycleManager provideLifecycleManager() {
        VisibilityManagerImpl visibilityManagerImpl = new VisibilityManagerImpl(this.timeProvider, this.rumEventDispatcher, this.sessionInformationProvider);
        return new OneAgentLifecycleManager(new AppStartupManagerImpl(this.timeProvider, new AppStartupLogger(), this.rumStartupEventDispatcher, this.sessionInformationProvider, new b(visibilityManagerImpl, 25)), visibilityManagerImpl, this.application);
    }
}
