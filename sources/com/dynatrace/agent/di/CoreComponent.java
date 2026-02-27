package com.dynatrace.agent.di;

import Bj.E;
import Bj.H;
import Bj.U;
import Gj.c;
import Ij.d;
import Ij.e;
import We.s;
import android.app.Application;
import com.dynatrace.agent.OneAgentConfiguration;
import com.dynatrace.agent.OneAgentEventDispatcher;
import com.dynatrace.agent.OneAgentStartup;
import com.dynatrace.agent.OneAgentStartupEventDispatcher;
import com.dynatrace.agent.OneAgentStartupImpl;
import com.dynatrace.agent.api.CommunicationManagerBridgeImpl;
import com.dynatrace.agent.api.OneAgentFacade;
import com.dynatrace.agent.api.OneAgentLifecycleManagerBridgeImpl;
import com.dynatrace.agent.api.OneAgentUserInteractionManagerBridgeImpl;
import com.dynatrace.agent.api.ServerDataListenerImpl;
import com.dynatrace.agent.common.connectivity.NetworkConnectivityChecker;
import com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.communication.CommunicationManager;
import com.dynatrace.agent.communication.di.CommunicationModule;
import com.dynatrace.agent.events.EventFlowGovernor;
import com.dynatrace.agent.events.EventThrottler;
import com.dynatrace.agent.exitreason.ExitReasonProcessor;
import com.dynatrace.agent.exitreason.di.ExitReasonModule;
import com.dynatrace.agent.lifecycle.OneAgentLifecycleManager;
import com.dynatrace.agent.lifecycle.callback.CurrentViewTracker;
import com.dynatrace.agent.metrics.MetricsRepository;
import com.dynatrace.agent.metrics.di.MetricsModule;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.agent.storage.db.EventDatabaseDataSource;
import com.dynatrace.agent.storage.di.StorageModule;
import com.dynatrace.agent.storage.memory.DynamicConfigDataSource;
import com.dynatrace.agent.storage.preference.EndPointInfoDataSource;
import com.dynatrace.agent.storage.preference.ServerConfigurationDataSource;
import com.dynatrace.agent.userinteraction.OneAgentUserInteractionManager;
import com.dynatrace.agent.view.ViewContextManager;
import com.dynatrace.agent.view.ViewSummarizer;
import com.dynatrace.android.agent.communication.CommunicationManagerBridge;
import com.dynatrace.android.agent.communication.ServerConfigurationListener;
import com.dynatrace.android.agent.conf.ConfigurationPublisher;
import com.dynatrace.android.agent.lifecycle.OneAgentLifecycleManagerBridge;
import com.dynatrace.android.agent.useraction.OneAgentUserInteractionManagerBridge;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import o5.C1963b;
import okhttp3.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class CoreComponent {
    public static final Holder Holder = new Holder(null);
    private static CoreComponent instance;
    private final EndPointInfo activeEndPointInfo;
    private final CommunicationManager communicationManager;
    private final CommunicationManagerBridge communicationManagerBridge;
    private final NetworkConnectivityChecker connectivityChecker;
    private final E coreCoroutineScope;
    private final EventDatabaseDataSource databaseDataSource;
    private final DynamicConfigDataSource dynamicConfigDataSource;
    private final EndPointInfoDataSource endPointInfoDataSource;
    private final EventFlowGovernor eventFlowGovernor;
    private final EventThrottler eventThrottler;
    private final ExitReasonModule exitReasonModule;
    private final ExitReasonProcessor exitReasonProcessor;
    private final OneAgentLifecycleManager lifecycleManager;
    private final MetricsModule metricsModule;
    private final MetricsRepository metricsRepository;
    private final OneAgentFacade oneAgentFacade;
    private final OneAgentLifecycleManagerBridge oneAgentLifecycleManagerBridge;
    private final OneAgentStartup oneAgentStartup;
    private final OneAgentStartupEventDispatcher oneAgentStartupEventDispatcher;
    private final OneAgentUserInteractionManagerBridge oneAgentUserInteractionManagerBridge;
    private final OneAgentEventDispatcher rumEventDispatcher;
    private final ServerConfigurationDataSource serverConfigurationDataSource;
    private final SessionInformationProvider sessionInformationProvider;
    private final StorageModule storageModule;
    private final OneAgentUserInteractionManager userInteractionManager;
    private final ViewContextManager viewContextManager;
    private final ViewSummarizer viewSummarizer;
    private final CurrentViewTracker viewTracker;

    public static final class Holder {
        public /* synthetic */ Holder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void initComponent$default(Holder holder, OneAgentConfiguration oneAgentConfiguration, TimeProvider timeProvider, ServerConfigurationListener serverConfigurationListener, Call.Factory factory, Application application, SecondGenServiceLocator secondGenServiceLocator, ConfigurationPublisher configurationPublisher, int i, Object obj) {
            if ((i & 8) != 0) {
                factory = null;
            }
            holder.initComponent(oneAgentConfiguration, timeProvider, serverConfigurationListener, factory, application, secondGenServiceLocator, configurationPublisher);
        }

        public final CoreComponent getInstance() {
            return CoreComponent.instance;
        }

        public final void initComponent(OneAgentConfiguration oneAgentConfiguration, TimeProvider timeProvider, ServerConfigurationListener legacyServerConfigurationListener, Call.Factory factory, Application applicationContext, SecondGenServiceLocator secondGenServiceLocator, ConfigurationPublisher configurationPublisher) {
            j.g(oneAgentConfiguration, "oneAgentConfiguration");
            j.g(timeProvider, "timeProvider");
            j.g(legacyServerConfigurationListener, "legacyServerConfigurationListener");
            j.g(applicationContext, "applicationContext");
            j.g(secondGenServiceLocator, "secondGenServiceLocator");
            j.g(configurationPublisher, "configurationPublisher");
            if (CoreComponent.instance == null) {
                CoreComponent.instance = new CoreComponent(oneAgentConfiguration, timeProvider, legacyServerConfigurationListener, factory, applicationContext, secondGenServiceLocator, configurationPublisher, null);
            }
        }

        public final void setTestInstance$com_dynatrace_agent_release(CoreComponent coreComponent) {
            CoreComponent.instance = coreComponent;
        }

        public final void tearDown() {
            Utility.devLog(OneAgentLoggingKt.TAG_START_STOP_AGENT, "tearDown OneAgent");
            try {
                CoreComponent coreComponent = CoreComponent.instance;
                if (coreComponent != null) {
                    coreComponent.tearDown();
                }
                CoreComponent.instance = null;
            } catch (Exception e) {
                CoreComponent.instance = null;
                Utility.devLog(OneAgentLoggingKt.TAG_START_STOP_AGENT, "tearDown OneAgent with exception", e);
            }
        }

        private Holder() {
        }
    }

    public /* synthetic */ CoreComponent(OneAgentConfiguration oneAgentConfiguration, TimeProvider timeProvider, ServerConfigurationListener serverConfigurationListener, Call.Factory factory, Application application, SecondGenServiceLocator secondGenServiceLocator, ConfigurationPublisher configurationPublisher, DefaultConstructorMarker defaultConstructorMarker) {
        this(oneAgentConfiguration, timeProvider, serverConfigurationListener, factory, application, secondGenServiceLocator, configurationPublisher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eventThrottler$lambda$0(SecondGenServiceLocator secondGenServiceLocator, OneAgentConfiguration oneAgentConfiguration, String droppedCount) {
        j.g(droppedCount, "droppedCount");
        SelfMonitoringComponent selfMonitoringComponentLocateSelfMonitoring = secondGenServiceLocator.locateSelfMonitoring();
        StringBuilder sbW = s.w("Dropped ", droppedCount, " events, current limit: ");
        sbW.append(oneAgentConfiguration.getEventThrottlingLimit());
        selfMonitoringComponentLocateSelfMonitoring.reportLogEvent("EventThrottlingGrail", sbW.toString());
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tearDown() {
        this.viewTracker.tearDown();
        this.communicationManager.stopCommunication();
        this.storageModule.tearDown();
        H.i(this.coreCoroutineScope, null);
    }

    public final CommunicationManagerBridge getCommunicationManagerBridge() {
        return this.communicationManagerBridge;
    }

    public final MetricsModule getMetricsModule() {
        return this.metricsModule;
    }

    public final MetricsRepository getMetricsRepository() {
        return this.metricsRepository;
    }

    public final OneAgentFacade getOneAgentFacade() {
        return this.oneAgentFacade;
    }

    public final OneAgentLifecycleManagerBridge getOneAgentLifecycleManagerBridge() {
        return this.oneAgentLifecycleManagerBridge;
    }

    public final OneAgentStartup getOneAgentStartup() {
        return this.oneAgentStartup;
    }

    public final OneAgentStartupEventDispatcher getOneAgentStartupEventDispatcher() {
        return this.oneAgentStartupEventDispatcher;
    }

    public final OneAgentUserInteractionManagerBridge getOneAgentUserInteractionManagerBridge() {
        return this.oneAgentUserInteractionManagerBridge;
    }

    public final OneAgentEventDispatcher getRumEventDispatcher() {
        return this.rumEventDispatcher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CoreComponent(OneAgentConfiguration oneAgentConfiguration, TimeProvider timeProvider, ServerConfigurationListener serverConfigurationListener, Call.Factory factory, Application application, SecondGenServiceLocator secondGenServiceLocator, ConfigurationPublisher configurationPublisher) {
        e eVar = U.f603a;
        c cVarC = H.c(d.f2362a);
        this.coreCoroutineScope = cVarC;
        StorageModule storageModule = new StorageModule(application, cVarC);
        this.storageModule = storageModule;
        NetworkConnectivityCheckerImpl networkConnectivityCheckerImpl = new NetworkConnectivityCheckerImpl(application, cVarC);
        this.connectivityChecker = networkConnectivityCheckerImpl;
        EventDatabaseDataSource eventDatabaseDataSourceProvideEventDatabaseDataSource$com_dynatrace_agent_release = storageModule.provideEventDatabaseDataSource$com_dynatrace_agent_release();
        this.databaseDataSource = eventDatabaseDataSourceProvideEventDatabaseDataSource$com_dynatrace_agent_release;
        ServerConfigurationDataSource serverConfigurationDataSourceProvideServerConfigurationDataSource$com_dynatrace_agent_release = storageModule.provideServerConfigurationDataSource$com_dynatrace_agent_release();
        this.serverConfigurationDataSource = serverConfigurationDataSourceProvideServerConfigurationDataSource$com_dynatrace_agent_release;
        EndPointInfoDataSource endPointInfoDataSourceProvideStartupConfigurationDataSource$com_dynatrace_agent_release = storageModule.provideStartupConfigurationDataSource$com_dynatrace_agent_release();
        this.endPointInfoDataSource = endPointInfoDataSourceProvideStartupConfigurationDataSource$com_dynatrace_agent_release;
        EndPointInfo endPointInfo = new EndPointInfo(oneAgentConfiguration.getApplicationId(), oneAgentConfiguration.getBeaconUrl());
        this.activeEndPointInfo = endPointInfo;
        DynamicConfigDataSource dynamicConfigDataSourceProvideDynamicConfigurationDataSource$com_dynatrace_agent_release = storageModule.provideDynamicConfigurationDataSource$com_dynatrace_agent_release();
        this.dynamicConfigDataSource = dynamicConfigDataSourceProvideDynamicConfigurationDataSource$com_dynatrace_agent_release;
        CommunicationManager communicationManagerProvideCommunicationManager = new CommunicationModule(factory, timeProvider, oneAgentConfiguration.getVersion(), eventDatabaseDataSourceProvideEventDatabaseDataSource$com_dynatrace_agent_release, endPointInfo, new ServerDataListenerImpl(serverConfigurationListener, serverConfigurationDataSourceProvideServerConfigurationDataSource$com_dynatrace_agent_release, dynamicConfigDataSourceProvideDynamicConfigurationDataSource$com_dynatrace_agent_release, configurationPublisher), cVarC, networkConnectivityCheckerImpl).provideCommunicationManager();
        this.communicationManager = communicationManagerProvideCommunicationManager;
        EventFlowGovernor eventFlowGovernor = new EventFlowGovernor(null, cVarC, 1, 0 == true ? 1 : 0);
        this.eventFlowGovernor = eventFlowGovernor;
        SessionInformationProvider sessionInformationProviderLocateSessionInformationProvider = secondGenServiceLocator.locateSessionInformationProvider();
        this.sessionInformationProvider = sessionInformationProviderLocateSessionInformationProvider;
        EventThrottler eventThrottler = new EventThrottler(timeProvider, oneAgentConfiguration.getEventThrottlingLimit(), 60, 60, cVarC, new C1963b(5, secondGenServiceLocator, oneAgentConfiguration));
        this.eventThrottler = eventThrottler;
        MetricsModule metricsModule = new MetricsModule(application, secondGenServiceLocator, storageModule.provideMetricsDataSource$com_dynatrace_agent_release(), cVarC);
        this.metricsModule = metricsModule;
        MetricsRepository metricsRepositoryProvideMetricsRepository$com_dynatrace_agent_release = metricsModule.provideMetricsRepository$com_dynatrace_agent_release();
        this.metricsRepository = metricsRepositoryProvideMetricsRepository$com_dynatrace_agent_release;
        ViewSummarizer viewSummarizer = new ViewSummarizer();
        this.viewSummarizer = viewSummarizer;
        OneAgentEventDispatcher oneAgentEventDispatcher = new OneAgentEventDispatcher(oneAgentConfiguration, timeProvider, eventDatabaseDataSourceProvideEventDatabaseDataSource$com_dynatrace_agent_release, metricsRepositoryProvideMetricsRepository$com_dynatrace_agent_release, cVarC, viewSummarizer, serverConfigurationDataSourceProvideServerConfigurationDataSource$com_dynatrace_agent_release, dynamicConfigDataSourceProvideDynamicConfigurationDataSource$com_dynatrace_agent_release, eventThrottler, eventFlowGovernor, sessionInformationProviderLocateSessionInformationProvider);
        this.rumEventDispatcher = oneAgentEventDispatcher;
        ViewContextManager viewContextManager = new ViewContextManager(eventFlowGovernor, timeProvider, viewSummarizer, oneAgentEventDispatcher);
        this.viewContextManager = viewContextManager;
        OneAgentFacade oneAgentFacade = new OneAgentFacade(sessionInformationProviderLocateSessionInformationProvider, viewContextManager, oneAgentEventDispatcher);
        this.oneAgentFacade = oneAgentFacade;
        CurrentViewTracker currentViewTracker = new CurrentViewTracker(oneAgentFacade, application, oneAgentConfiguration);
        this.viewTracker = currentViewTracker;
        OneAgentStartupEventDispatcher oneAgentStartupEventDispatcher = new OneAgentStartupEventDispatcher(10000L, oneAgentConfiguration, cVarC, oneAgentEventDispatcher, secondGenServiceLocator.locateSelfMonitoring());
        this.oneAgentStartupEventDispatcher = oneAgentStartupEventDispatcher;
        ExitReasonModule exitReasonModule = new ExitReasonModule(application, timeProvider, 0L, oneAgentEventDispatcher, sessionInformationProviderLocateSessionInformationProvider, metricsRepositoryProvideMetricsRepository$com_dynatrace_agent_release, storageModule.provideExitReasonDataSource$com_dynatrace_agent_release(), oneAgentConfiguration.getNativeCrashReporting(), oneAgentConfiguration.getAnrReporting(), 4, null);
        this.exitReasonModule = exitReasonModule;
        ExitReasonProcessor exitReasonProcessorProvideExitReasonProcessor$com_dynatrace_agent_release = exitReasonModule.provideExitReasonProcessor$com_dynatrace_agent_release();
        this.exitReasonProcessor = exitReasonProcessorProvideExitReasonProcessor$com_dynatrace_agent_release;
        this.oneAgentStartup = new OneAgentStartupImpl(communicationManagerProvideCommunicationManager, exitReasonProcessorProvideExitReasonProcessor$com_dynatrace_agent_release, eventDatabaseDataSourceProvideEventDatabaseDataSource$com_dynatrace_agent_release, serverConfigurationDataSourceProvideServerConfigurationDataSource$com_dynatrace_agent_release, endPointInfoDataSourceProvideStartupConfigurationDataSource$com_dynatrace_agent_release, endPointInfo, cVarC, configurationPublisher, metricsRepositoryProvideMetricsRepository$com_dynatrace_agent_release);
        this.communicationManagerBridge = new CommunicationManagerBridgeImpl(communicationManagerProvideCommunicationManager);
        OneAgentLifecycleManager oneAgentLifecycleManagerProvideLifecycleManager = new LifecycleModule(timeProvider, application, oneAgentEventDispatcher, oneAgentStartupEventDispatcher, sessionInformationProviderLocateSessionInformationProvider).provideLifecycleManager();
        this.lifecycleManager = oneAgentLifecycleManagerProvideLifecycleManager;
        this.oneAgentLifecycleManagerBridge = new OneAgentLifecycleManagerBridgeImpl(oneAgentLifecycleManagerProvideLifecycleManager);
        OneAgentUserInteractionManager oneAgentUserInteractionManagerProvideUserInteractionManager = new UserInteractionModule(cVarC, timeProvider, oneAgentEventDispatcher, sessionInformationProviderLocateSessionInformationProvider, serverConfigurationDataSourceProvideServerConfigurationDataSource$com_dynatrace_agent_release).provideUserInteractionManager();
        this.userInteractionManager = oneAgentUserInteractionManagerProvideUserInteractionManager;
        this.oneAgentUserInteractionManagerBridge = new OneAgentUserInteractionManagerBridgeImpl(oneAgentUserInteractionManagerProvideUserInteractionManager);
        currentViewTracker.setUp();
    }

    public /* synthetic */ CoreComponent(OneAgentConfiguration oneAgentConfiguration, TimeProvider timeProvider, ServerConfigurationListener serverConfigurationListener, Call.Factory factory, Application application, SecondGenServiceLocator secondGenServiceLocator, ConfigurationPublisher configurationPublisher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oneAgentConfiguration, timeProvider, serverConfigurationListener, (i & 8) != 0 ? null : factory, application, secondGenServiceLocator, configurationPublisher);
    }
}
