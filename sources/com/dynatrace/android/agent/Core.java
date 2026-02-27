package com.dynatrace.android.agent;

import Rg.g;
import We.s;
import android.app.Activity;
import android.app.Application;
import android.location.Location;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.dynatrace.agent.OneAgentStartup;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.api.OneAgentFacade;
import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.agent.events.EventThrottler;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.metrics.MetricsRepository;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.GuardedEventDispatcher;
import com.dynatrace.android.agent.communication.CommunicationManagerBridge;
import com.dynatrace.android.agent.conf.AgentMode;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.conf.ConfigurationFactory;
import com.dynatrace.android.agent.conf.ConfigurationPublisher;
import com.dynatrace.android.agent.conf.InitialServerIdProvider;
import com.dynatrace.android.agent.conf.PrivacyRules;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.cookie.CookieHandler;
import com.dynatrace.android.agent.crash.CrashCatcher;
import com.dynatrace.android.agent.crash.CrashListener;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.data.SessionParameterStore;
import com.dynatrace.android.agent.data.SessionParameterUtil;
import com.dynatrace.android.agent.db.DataAccessObject;
import com.dynatrace.android.agent.db.DatabaseWriteQueue;
import com.dynatrace.android.agent.events.eventsapi.BizEventSegment;
import com.dynatrace.android.agent.events.eventsapi.CopyAttributeFilter;
import com.dynatrace.android.agent.events.eventsapi.EnrichmentAttributesGenerator;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregatorFactory;
import com.dynatrace.android.agent.events.eventsapi.EventPayloadGenerator;
import com.dynatrace.android.agent.events.eventsapi.EventPayloadUtility;
import com.dynatrace.android.agent.events.ragetap.RageTapObserver;
import com.dynatrace.android.agent.lifecycle.OneAgentLifecycleManagerBridge;
import com.dynatrace.android.agent.metrics.AndroidMetrics;
import com.dynatrace.android.agent.mixed.AgentServiceLocator;
import com.dynatrace.android.agent.mixed.SessionInformationGenerator;
import com.dynatrace.android.agent.mixed.TimeProviderFactory;
import com.dynatrace.android.agent.useraction.OneAgentUserInteractionManagerBridge;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.internal.api.SelfMonitoring;
import com.dynatrace.android.lifecycle.ActivityLifecycleMonitor;
import com.dynatrace.android.lifecycle.activitytracking.ActiveActivityMonitor;
import com.dynatrace.android.lifecycle.appstart.ApplicationStartMonitor;
import com.dynatrace.android.lifecycle.appstate.ApplicationStateMonitor;
import com.dynatrace.android.ragetap.detection.RageTapDetector;
import com.dynatrace.android.ragetap.measure.TapMonitorFactory;
import com.dynatrace.android.window.OnKeyEventListener;
import com.dynatrace.android.window.OnTouchEventListener;
import com.dynatrace.android.window.WindowCallbackMonitor;
import com.dynatrace.android.window.WindowListenerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Core {
    public static final int DEFAULT_PURGE_DATA_TIMEOUT_MS = 540000;
    private static final int DEFAULT_SEND_EVENT_TIMEOUT_TICKS = 12;
    static final int FLUSH_WAIT_TIME_MS = 5000;
    static final int SECONDS_PER_TICK = 10;
    private static CookieHandler cookieHandler;
    public static DataAccessObject dao;
    private static final String TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "Core");
    private static final ActivityLifecycleMonitor ACTIVITY_LIFECYCLE_MONITOR = new ActivityLifecycleMonitor();
    private static final ApplicationStartMonitor APPLICATION_START_MONITOR = new ApplicationStartMonitor();
    private static final ApplicationStateMonitor APPLICATION_STATE_MONITOR = new ApplicationStateMonitor();
    private static final ActiveActivityMonitor ACTIVE_ACTIVITY_MONITOR = new ActiveActivityMonitor();
    private static final WindowCallbackMonitor WINDOW_CALLBACK_MONITOR = new WindowCallbackMonitor();
    public static final GuardedEventDispatcher GUARDED_EVENT_DISPATCHER = new GuardedEventDispatcher();
    private static final ConfigurationPublisher CONFIGURATION_PUBLISHER = new ConfigurationPublisher();
    private static BasicSegment basicSegment = null;
    private static long mSendEventTimeoutTicks = 12;
    private static CalloutTable mCalloutTable = new CalloutTable(12);
    static CommunicationManager communicationManager = new CommunicationManager(mCalloutTable);
    static OneAgentFacade oneAgentFacade = null;
    private static AtomicBoolean isFirstStartup = new AtomicBoolean(true);
    private static AdkSettings adk = AdkSettings.getInstance();
    private static CrashReporter crashReporter = new CrashReporter(communicationManager);
    private static RageTapDetector rageTapDetector = null;
    private static CommunicationManagerBridge communicationManagerBridge = null;
    private static OneAgentLifecycleManagerBridge oneAgentLifecycleManagerBridge = null;
    private static OneAgentUserInteractionManagerBridge oneAgentUserInteractionManagerBridge = null;
    private static OneAgentStartup oneAgentStartup = null;
    private static AgentServiceLocator currentLocator = null;
    private static EventThrottler eventThrottler = null;
    private static SessionParameterStore sessionParameterStore = null;

    /* JADX INFO: renamed from: com.dynatrace.android.agent.Core$1, reason: invalid class name */
    public class AnonymousClass1 implements WindowListenerFactory {
        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$generateOnTouchEventListener$0(View view, MotionEvent motionEvent) {
            Core.oneAgentUserInteractionManagerBridge.onMotionEvent(view, motionEvent);
        }

        @Override // com.dynatrace.android.window.WindowListenerFactory
        public OnKeyEventListener generateOnKeyEventListener() {
            return null;
        }

        @Override // com.dynatrace.android.window.WindowListenerFactory
        public OnTouchEventListener generateOnTouchEventListener(Window window) {
            final View rootView = window.getDecorView().getRootView();
            return new OnTouchEventListener() { // from class: com.dynatrace.android.agent.b
                @Override // com.dynatrace.android.window.OnTouchEventListener
                public final void onTouchEvent(MotionEvent motionEvent) {
                    Core.AnonymousClass1.lambda$generateOnTouchEventListener$0(rootView, motionEvent);
                }
            };
        }
    }

    public static CustomSegment addEvent(String str, int i, long j, DTXActionImpl dTXActionImpl, Session session, int i4, String... strArr) {
        CustomSegment customSegment = dTXActionImpl;
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "Handle event name=" + str + " type=" + i);
        }
        long j6 = j < 0 ? 0L : j;
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    if (str == null || str.isEmpty()) {
                        return null;
                    }
                    customSegment = new CustomSegment(str, 4, EventType.NAMED_EVENT, j6, session, i4, true);
                    mCalloutTable.addOtherEvent();
                } else if (i == 20) {
                    if (str == null || str.isEmpty()) {
                        return null;
                    }
                    customSegment = new ErrorSegment(str, strArr[0], strArr[1], strArr[2], j6, session, i4, strArr[3], true);
                    mCalloutTable.addOtherEvent();
                } else if (i != 21) {
                    switch (i) {
                        case 6:
                            if (str == null || str.isEmpty()) {
                                return null;
                            }
                            customSegment = new CustomSegment(str, 6, EventType.VALUE_INT64, j6, session, i4, true);
                            customSegment.mValue = Utility.truncateString(strArr[0], 250);
                            mCalloutTable.addOtherEvent();
                            break;
                        case 7:
                            if (str == null || str.isEmpty()) {
                                return null;
                            }
                            customSegment = new CustomSegment(str, 6, EventType.VALUE_DOUBLE, j6, session, i4, true);
                            customSegment.mValue = Utility.truncateString(strArr[0], 250);
                            mCalloutTable.addOtherEvent();
                            break;
                        case 8:
                            if (str == null || str.isEmpty()) {
                                return null;
                            }
                            customSegment = new CustomSegment(str, 6, EventType.VALUE_STRING, j6, session, i4, true);
                            customSegment.mValue = Utility.truncateString(strArr[0], 250);
                            mCalloutTable.addOtherEvent();
                            break;
                        case 9:
                            if (str == null || str.isEmpty()) {
                                return null;
                            }
                            customSegment = new CustomSegment(str, 6, EventType.ERROR_INT, j6, session, i4, true ^ session.isGrailEventsShouldBeCaptured());
                            customSegment.mValue = Utility.truncateString(strArr[0], 250);
                            mCalloutTable.addOtherEvent();
                            break;
                        case 10:
                            if (str == null || str.isEmpty()) {
                                return null;
                            }
                            customSegment = new ErrorSegment(str, strArr[0], strArr[1], strArr[2], j6, session, i4, strArr[3], !session.isGrailEventsShouldBeCaptured());
                            mCalloutTable.addOtherEvent();
                            break;
                        case 11:
                            if (str == null || str.isEmpty()) {
                                return null;
                            }
                            customSegment = new CrashSegment(str, strArr[0], strArr[1], session, i4, strArr[2], !session.isGrailEventsShouldBeCaptured());
                            mCalloutTable.addOtherEvent();
                            CrashCatcher.notifyListeners(strArr[2], str, strArr[0], strArr[1]);
                            break;
                        case 12:
                            customSegment = new CustomSegment(str, 12, EventType.IDENTIFY_USER, j6, session, i4, true ^ session.isGrailEventsShouldBeCaptured());
                            mCalloutTable.addOtherEvent();
                            break;
                        default:
                            if (Global.DEBUG) {
                                Utility.zlogD(TAG, String.format("addEvent invalid type: %d", Integer.valueOf(i)));
                            }
                            customSegment = null;
                            break;
                    }
                } else {
                    if (str == null || str.isEmpty()) {
                        return null;
                    }
                    customSegment = new CrashSegment(str, strArr[0], strArr[1], session, i4, strArr[2], true);
                    mCalloutTable.addOtherEvent();
                    CrashCatcher.notifyListeners(strArr[2], str, strArr[0], strArr[1]);
                }
            } else if (customSegment != null) {
                customSegment.updateEndTime();
            }
        } else if (customSegment != null) {
            mCalloutTable.addActionEvent(customSegment);
        }
        saveSegment(customSegment, i);
        return customSegment;
    }

    public static void applyAgentStateFromOneAgent(AgentState agentState) {
        communicationManager.handleAgentStateReceivedFromOneAgent(agentState);
    }

    public static void applyConfigurationFromOneAgent(ServerConfiguration serverConfiguration) {
        communicationManager.handleConfigReceivedFromOneAgent(serverConfiguration);
    }

    public static void applyServerConfiguration(ServerConfiguration serverConfiguration) {
        adk.switchServerConfiguration(serverConfiguration);
        long sendIntervalSec = (serverConfiguration.getSendIntervalSec() + 9) / 10;
        mSendEventTimeoutTicks = sendIntervalSec;
        mCalloutTable.changeSendEventTimeout(sendIntervalSec);
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "Send event timeout set to: " + sendIntervalSec + " ticks");
        }
        if (serverConfiguration.isSwitchServer()) {
            int serverId = serverConfiguration.getServerId();
            AdkSettings.getInstance().serverId = serverId;
            CommunicationManagerBridge communicationManagerBridge2 = communicationManagerBridge;
            if (communicationManagerBridge2 != null) {
                communicationManagerBridge2.updateServerId(serverId);
            }
        }
    }

    private static JSONObject createIdentifyUserEvent(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.length() > 250) {
                str = str.substring(0, 250);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(EventKeys.DT.RUM.USER_TAG, str);
                jSONObject.put(EventKeys.DT.SUPPORT.LEGACY_API_REPORTED, true);
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "identifyUser event was generated: " + jSONObject);
                return jSONObject;
            } catch (JSONException unused) {
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "identifyUser event can't be generated");
            }
        }
        return null;
    }

    public static void endVisit() {
        Session sessionDetermineActiveSession = Session.determineActiveSession(true);
        int i = AdkSettings.getInstance().serverId;
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "Ending current visit of session " + sessionDetermineActiveSession.sessionId);
        }
        saveSegment(VisitSegment.createVisitSegment(sessionDetermineActiveSession, i, true));
        startNewSession(true, sessionDetermineActiveSession.getPrivacyRules());
    }

    public static void flushEvents() {
        if (dao == null) {
            return;
        }
        DatabaseWriteQueue.getInstance().flushQueue();
        mCalloutTable.purge();
        communicationManager.flushEvents();
    }

    public static void forceCloseActiveActions(String str) {
        if (Global.DEBUG) {
            Utility.zlogD(TAG, Thread.currentThread().getName() + " ... force closed actions due to " + str);
        }
        ActionThreadLocal.closeAll();
        DTXAutoAction.closeAll();
    }

    public static ApplicationStartMonitor getApplicationStartMonitor() {
        return APPLICATION_START_MONITOR;
    }

    public static CalloutTable getCalloutTable() {
        return mCalloutTable;
    }

    public static boolean getCaptureState() {
        return communicationManager.isUemActive();
    }

    public static ConfigurationPublisher getConfigurationPublisher() {
        return CONFIGURATION_PUBLISHER;
    }

    public static CrashListener getCrashListener() {
        return crashReporter;
    }

    public static String getOcvbString(Session session) {
        return basicSegment.createEventData(session).toString();
    }

    public static OneAgentLifecycleManagerBridge getOneAgentLifecycleManagerBridge() {
        return oneAgentLifecycleManagerBridge;
    }

    public static OneAgentUserInteractionManagerBridge getOneAgentUserInteractionManagerBridge() {
        return oneAgentUserInteractionManagerBridge;
    }

    public static WebReqTag getRequestTag() {
        int i;
        Session sessionDetermineActiveSession;
        WebReqTag webReqTag;
        long tagId;
        long j;
        if (!communicationManager.isUemActive()) {
            return null;
        }
        DTXActionImpl currentAction = ActionThreadLocal.getCurrentAction();
        if (currentAction == null) {
            currentAction = DTXAutoAction.getAutoAction();
        }
        if (currentAction != null) {
            tagId = currentAction.getTagId();
            sessionDetermineActiveSession = currentAction.session;
            i = currentAction.serverId;
            webReqTag = currentAction.getInternalRequestTag();
        } else {
            i = 0;
            sessionDetermineActiveSession = null;
            webReqTag = null;
            tagId = 0;
        }
        if (webReqTag == null) {
            sessionDetermineActiveSession = Session.determineActiveSession(false);
            i = AdkSettings.getInstance().serverId;
            webReqTag = new WebReqTag(0L, i, sessionDetermineActiveSession);
            j = 0;
        } else {
            j = tagId;
        }
        Session session = sessionDetermineActiveSession;
        int i4 = i;
        if (!session.getPrivacyRules().shouldCollectEvent(EventType.WEB_REQUEST)) {
            return null;
        }
        CustomSegment customSegment = new CustomSegment(webReqTag.toString(), 100, EventType.PLACEHOLDER, j, session, i4, true);
        if (j == 0) {
            DTXActionImpl.addOrphanEvent(customSegment);
        } else {
            currentAction.addChildEvent(customSegment);
        }
        if (Global.DEBUG) {
            Utility.zlogD(TAG, String.format("Added an event %s id=%d pid=%d", customSegment.getName(), Long.valueOf(customSegment.getTagId()), Long.valueOf(customSegment.getParentTagId())));
        }
        return webReqTag;
    }

    public static void handleTrafficLimitationForCookies(Session session) {
        if (AdkSettings.getInstance().hybridApp) {
            cookieHandler.onTrafficControlUpdate(session);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reportUserTag$0(Session session, RumEventDispatcher rumEventDispatcher) {
        JSONObject jSONObjectCreateIdentifyUserEvent = createIdentifyUserEvent(session.getUserTag());
        if (jSONObjectCreateIdentifyUserEvent != null) {
            rumEventDispatcher.dispatchEvent(jSONObjectCreateIdentifyUserEvent, TimeLineProvider.getSystemTime(), 0L, SessionInformationGenerator.generate(session), true, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendEvent$2(Session session, JSONObject jSONObject, Object[] objArr, RumEventDispatcher rumEventDispatcher) {
        PrivacyRules privacyRules = session.getPrivacyRules();
        EventType eventType = EventType.EVENT_API;
        if (privacyRules.shouldCollectEvent(eventType)) {
            rumEventDispatcher.dispatchEventWithRestrictions(jSONObject, SessionInformationGenerator.generate(session), objArr);
            return;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "sendEvent eventType shouldn't be collected, because of data collection level: " + eventType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendSessionPropertyEvent$3(Session session, JSONObject jSONObject, RumEventDispatcher rumEventDispatcher) {
        if (session.getPrivacyRules().shouldCollectEvent(EventType.EVENT_API)) {
            rumEventDispatcher.dispatchSessionPropertiesWithRestrictions(jSONObject, SessionInformationGenerator.generate(session));
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "sendSessionPropertyEvent shouldn't be collected because of data collection level");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit lambda$startup$1(String str) {
        SelfMonitoring.reportLogEvent("EventThrottling", str);
        return Unit.f18162a;
    }

    public static void modifyUserAction(UserActionModifier userActionModifier) {
        DTXAutoAction autoAction = DTXAutoAction.getAutoAction();
        if (autoAction != null) {
            userActionModifier.modify(new ExposedUserAction(autoAction));
        } else if (Global.DEBUG) {
            Utility.zlogD(TAG, "Cannot modify UserAction since there is none pending");
        }
    }

    public static void persistEventCmn(CustomSegment customSegment) {
        if (customSegment.session.getPrivacyRules().shouldCollectEvent(customSegment.getEventType())) {
            EventThrottler eventThrottler2 = eventThrottler;
            if (eventThrottler2 == null || !eventThrottler2.acceptEvent(customSegment.eventType.getProtocolId())) {
                if (Global.DEBUG) {
                    Utility.zlogD(TAG, "Dropped event due to throttling");
                }
            } else {
                String string = customSegment.createEventData().toString();
                basicSegment.update(false);
                String ocvbString = getOcvbString(customSegment.session);
                if (Global.DEBUG) {
                    Utility.zlogD(TAG, String.format("Store %dbytes", Integer.valueOf(string.length() + ocvbString.length())));
                }
                DatabaseWriteQueue.getInstance().accept(new DatabaseWriteQueue.DatabaseRecord(ocvbString, string, customSegment.session, customSegment.getEventType().getProtocolId(), customSegment.getStartTime(), customSegment.getServerId(), AdkSettings.appIdEncoded));
            }
        }
    }

    public static void removeFromCalloutTable(CustomSegment customSegment) {
        mCalloutTable.removeActionSendEvent(customSegment);
    }

    public static void reportUserTag(final Session session) {
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "reportUserTag, session: " + session.getUserTag());
        addEvent(session.getUserTag(), 12, 0L, null, session, AdkSettings.getInstance().serverId, new String[0]);
        GUARDED_EVENT_DISPATCHER.executeWithVerification(session, new GuardedEventDispatcher.GuardedOperation() { // from class: com.dynatrace.android.agent.a
            @Override // com.dynatrace.android.agent.GuardedEventDispatcher.GuardedOperation
            public final void execute(RumEventDispatcher rumEventDispatcher) {
                Core.lambda$reportUserTag$0(session, rumEventDispatcher);
            }
        });
    }

    public static synchronized void resetLifecycleData() {
        forceCloseActiveActions("resetLifecycle");
        Utility.resetEventSeqNum();
    }

    public static void restoreCookies() {
        if (AdkSettings.getInstance().hybridApp) {
            cookieHandler.restoreCookies();
        }
    }

    public static void saveSegment(CustomSegment customSegment) {
        saveSegment(customSegment, customSegment.getType());
    }

    public static void sendBizEvent(String str, JSONObject jSONObject) {
        long systemTimeNanos = TimeLineProvider.getSystemTimeNanos();
        if (jSONObject == null) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "Cannot send biz event whose attributes are 'null'");
            }
        } else if (str == null || str.isEmpty()) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "Cannot send biz event whose type is 'null' or empty");
            }
        } else {
            Session sessionDetermineActiveSessionForInternalEvent = Session.determineActiveSessionForInternalEvent();
            storeBizEvent(str, sessionDetermineActiveSessionForInternalEvent, new EventPayloadGenerator(new CopyAttributeFilter()).generatePayload(new EnrichmentAttributesGenerator().withTimeStamp(systemTimeNanos).withEventMetrics(EventMetricsAggregatorFactory.createEventMetricsAggregator().aggregateEventMetrics(sessionDetermineActiveSessionForInternalEvent, AdkSettings.getInstance().getConfiguration(), AndroidMetrics.getInstance())).generateBizEventAttributes(str, jSONObject), jSONObject, false));
        }
    }

    public static void sendEvent(JSONObject jSONObject, Object[] objArr) {
        if (jSONObject == null) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "cannot use 'null' fields for sendEvent");
        } else {
            Session sessionDetermineActiveSessionForInternalEvent = Session.determineActiveSessionForInternalEvent();
            GUARDED_EVENT_DISPATCHER.executeWithVerification(sessionDetermineActiveSessionForInternalEvent, new Bb.c(19, sessionDetermineActiveSessionForInternalEvent, jSONObject, objArr));
        }
    }

    public static void sendSessionPropertyEvent(JSONObject jSONObject) {
        if (jSONObject == null) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "cannot use 'null' properties for sendSessionPropertyEvent");
        } else {
            Session sessionDetermineActiveSessionForInternalEvent = Session.determineActiveSessionForInternalEvent();
            GUARDED_EVENT_DISPATCHER.executeWithVerification(sessionDetermineActiveSessionForInternalEvent, new androidx.camera.lifecycle.a(20, sessionDetermineActiveSessionForInternalEvent, jSONObject));
        }
    }

    public static void setGpsLocation(Location location) {
        MetricsRepository metricsRepositoryProvideMetricsRepository;
        if (Global.DEBUG && location != null) {
            Utility.zlogD(TAG, "SetGpsCoord Lat:" + location.getLatitude() + " Lon:" + location.getLongitude());
        }
        AndroidMetrics.getInstance().setGpsLocation(location);
        AgentServiceLocator agentServiceLocator = currentLocator;
        if (agentServiceLocator == null || (metricsRepositoryProvideMetricsRepository = agentServiceLocator.provideMetricsRepository()) == null) {
            return;
        }
        metricsRepositoryProvideMetricsRepository.updateLocationMetrics(location);
    }

    public static synchronized void shutdown(long j) {
        try {
            Global.isAlive.set(false);
            SessionParameterStore sessionParameterStore2 = sessionParameterStore;
            if (sessionParameterStore2 != null) {
                sessionParameterStore2.flush();
            }
            Application application = (Application) AdkSettings.getInstance().getContext();
            APPLICATION_STATE_MONITOR.stopMonitoring(application);
            APPLICATION_START_MONITOR.onAgentShutdown(application);
            OneAgentLifecycleManagerBridge oneAgentLifecycleManagerBridge2 = oneAgentLifecycleManagerBridge;
            if (oneAgentLifecycleManagerBridge2 != null) {
                oneAgentLifecycleManagerBridge2.onAgentShutdown();
            }
            AgentServiceLocator agentServiceLocator = currentLocator;
            if (agentServiceLocator != null) {
                agentServiceLocator.shutdown();
            }
            ACTIVITY_LIFECYCLE_MONITOR.stopMonitoring(application);
            ACTIVE_ACTIVITY_MONITOR.stopMonitoring(application);
            WINDOW_CALLBACK_MONITOR.stopMonitoring(application);
            rageTapDetector = null;
            DatabaseWriteQueue.getInstance().stopThread();
            communicationManager.shutdown(j);
            currentLocator = null;
            GUARDED_EVENT_DISPATCHER.resetEventDispatcher();
            oneAgentStartup = null;
            communicationManagerBridge = null;
            oneAgentLifecycleManagerBridge = null;
            oneAgentFacade = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void startNewSession(boolean z4, PrivacyRules privacyRules) {
        startNewSession(z4, privacyRules, TimeLineProvider.getSystemTime());
    }

    public static void startup(Application application, Activity activity, Configuration configuration, AgentServiceLocator agentServiceLocator) {
        PrivacyRules privacyRules;
        AgentStateListener agentStateListenerGenerateAgentStateListener;
        OneAgentLifecycleManagerBridge oneAgentLifecycleManagerBridge2;
        currentLocator = agentServiceLocator;
        if (configuration.debugLogLevel) {
            Global.DEBUG = true;
        }
        if (Global.DEBUG) {
            String str = TAG;
            Utility.zlogD(str, "startup configuration: " + configuration);
            Utility.zlogI(str, String.format("%s %s Target API %d Android API %d", AdkSettings.getADKName(), Version.getFullVersion(), Integer.valueOf(Utility.getAppTargetSdk(application)), Integer.valueOf(Build.VERSION.SDK_INT)));
            if (activity != null) {
                Utility.zlogD(str, "agent started within activity '" + activity.getClass().getName() + "'");
            }
        }
        SessionParameterStore sessionParameterStore2 = new SessionParameterStore(application);
        sessionParameterStore = sessionParameterStore2;
        sessionParameterStore2.preload();
        DTXAutoAction.setAutoInstrProperties(configuration);
        adk.setup(configuration, application);
        ServerConfiguration serverConfiguration = adk.preferencesManager.getServerConfiguration(new InitialServerIdProvider().getDefaultServerId(configuration), configuration.startupWithGrailEnabled);
        if (serverConfiguration.isGen3Enabled()) {
            currentLocator.init(CONFIGURATION_PUBLISHER);
            GUARDED_EVENT_DISPATCHER.initEventDispatcher(agentServiceLocator.provideRumEventDispatcher());
            oneAgentStartup = agentServiceLocator.provideOneAgentStartup();
            communicationManagerBridge = agentServiceLocator.provideCommunicationManagerBridge();
            oneAgentLifecycleManagerBridge = agentServiceLocator.provideOneAgentLifecycleManagerBridge();
            if (ConfigurationFactory.isUserInteractionEnabled()) {
                oneAgentUserInteractionManagerBridge = agentServiceLocator.provideOneAgentUserInteractionManagerBridge();
            }
            oneAgentFacade = agentServiceLocator.provideOneAgentFacade();
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_START_STOP_AGENT, "RUM powered by Grail deactivated");
        }
        eventThrottler = new EventThrottler(new TimeProviderFactory().createTimelineProvider(), configuration.eventThrottlingLimit, new g(28));
        applyServerConfiguration(serverConfiguration);
        if (configuration.userOptIn) {
            privacyRules = new PrivacyRules(adk.preferencesManager.readPrivacySettings());
        } else {
            adk.preferencesManager.removePrivacySettings();
            privacyRules = PrivacyRules.PRIVACY_MODE_DEACTIVATED;
        }
        AdkSettings.appIdEncoded = configuration.appIdEncoded;
        AndroidMetrics.getInstance();
        if (isFirstStartup.get()) {
            Session.startNewSessionIfNeeded(privacyRules, serverConfiguration.isGen3Enabled());
        } else {
            Utility.resetEventSeqNum();
            Session.startNewSession(privacyRules, serverConfiguration.isGen3Enabled());
        }
        HashMap map = new HashMap();
        map.put(ConfigurationPublisher.ConfigChange.IS_3RDGEN_ENABLED, Boolean.valueOf(serverConfiguration.isGen3Enabled()));
        CONFIGURATION_PUBLISHER.notify(map);
        DataAccessObject dataAccessObject = new DataAccessObject(application);
        dao = dataAccessObject;
        dataAccessObject.deleteEventsWithMismatchAppId(configuration.appIdEncoded);
        SessionReplayComponentProvider sessionReplayComponentProvider = configuration.sessionReplayComponentProvider;
        boolean z4 = sessionReplayComponentProvider != null;
        if (z4) {
            agentStateListenerGenerateAgentStateListener = sessionReplayComponentProvider.generateAgentStateListener();
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "set new agent state listener: " + agentStateListenerGenerateAgentStateListener);
            }
            adk.setAgentStateListener(agentStateListenerGenerateAgentStateListener);
        } else {
            agentStateListenerGenerateAgentStateListener = null;
        }
        basicSegment = new BasicSegment(configuration.instrumentationFlavor);
        DatabaseWriteQueue.getInstance().start();
        mCalloutTable.changeSendEventTimeout(mSendEventTimeoutTicks);
        communicationManager.startup(dao, configuration, agentStateListenerGenerateAgentStateListener, communicationManagerBridge);
        if (configuration.crashReporting) {
            CrashCatcher.installUncaughtExceptionHandler();
            CrashCatcher.registerUncaughtExceptionListener(getCrashListener());
        }
        if (agentStateListenerGenerateAgentStateListener != null) {
            agentStateListenerGenerateAgentStateListener.onAgentStarted(application, configuration, adk.getServerConfiguration(), privacyRules);
        }
        if (configuration.activityMonitoring) {
            ACTIVITY_LIFECYCLE_MONITOR.startMonitoring(application, TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
        }
        ACTIVE_ACTIVITY_MONITOR.startMonitoring(application);
        if (configuration.applicationMonitoring) {
            APPLICATION_START_MONITOR.onAgentStart(application, TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
        }
        APPLICATION_STATE_MONITOR.startMonitoring(application);
        if (serverConfiguration.isGen3Enabled() && (oneAgentLifecycleManagerBridge2 = oneAgentLifecycleManagerBridge) != null) {
            oneAgentLifecycleManagerBridge2.onAppStart();
        }
        ArrayList arrayList = new ArrayList();
        if (z4) {
            arrayList.add(configuration.sessionReplayComponentProvider.generateWindowListenerFactory());
        }
        if (serverConfiguration.isGen3Enabled() && oneAgentUserInteractionManagerBridge != null) {
            arrayList.add(new AnonymousClass1());
        }
        if (configuration.isRageTapDetectionEnabled) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new RageTapObserver());
            if (z4) {
                arrayList2.add(configuration.sessionReplayComponentProvider.generateRageTapListener());
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
            TimeLineProvider timeLineProvider = TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER;
            rageTapDetector = new RageTapDetector(arrayList2, scheduledExecutorServiceNewScheduledThreadPool, timeLineProvider);
            arrayList.add(new TapMonitorFactory(rageTapDetector, timeLineProvider));
        }
        WINDOW_CALLBACK_MONITOR.startMonitoring(application, activity, arrayList);
        if (configuration.hybridApp) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            String[] strArr = configuration.monitoredDomains;
            if (strArr != null) {
                Collections.addAll(hashSet, strArr);
            }
            String[] strArr2 = configuration.monitoredHttpsDomains;
            if (strArr2 != null) {
                Collections.addAll(hashSet2, strArr2);
            }
            if (configuration.mode == AgentMode.APP_MON) {
                if (configuration.getServerUrl().startsWith("https://")) {
                    hashSet2.add(configuration.getServerUrl());
                } else {
                    hashSet.add(configuration.getServerUrl());
                }
            }
            if (configuration.fileDomainCookies) {
                hashSet.add("file://");
            }
            cookieHandler = new CookieHandler(hashSet, hashSet2, configuration.fileDomainCookies, configuration.mode);
        }
        startNewSession(false, privacyRules);
        OneAgentStartup oneAgentStartup2 = oneAgentStartup;
        if (oneAgentStartup2 != null) {
            oneAgentStartup2.start(serverConfiguration);
        }
        communicationManager.startTimerLoop(true);
        Global.isAlive.set(true);
        isFirstStartup.set(false);
    }

    public static void storeBizEvent(String str, Session session, String str2) {
        if (str2 != null) {
            BizEventSegment bizEventSegmentBuild = new BizEventSegment.Builder().withSession(session).withServerId(adk.serverId).withEventName(str).withUrlEncodedJsonPayload(EventPayloadUtility.replacePlaceholderWithMacro(Utility.urlEncode(str2))).withForwardToGrail(true).build();
            getCalloutTable().addOtherEvent();
            saveSegment(bizEventSegmentBuild);
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "Event \"" + str + "\" has been discarded");
        }
    }

    private static void saveSegment(CustomSegment customSegment, int i) {
        if (customSegment != null && customSegment.isFinalized() && customSegment.isEnabled()) {
            if (basicSegment != null) {
                persistEventCmn(customSegment);
                if (CustomSegment.firstSendOccurred.get() == 0) {
                    CustomSegment.firstSendOccurred.set(1);
                }
            } else if (Global.DEBUG) {
                Utility.zlogD(TAG, "discarded");
            }
            if (i == 2) {
                mCalloutTable.removeActionSendEvent(customSegment);
            }
        }
    }

    public static void startNewSession(boolean z4, PrivacyRules privacyRules, long j) {
        long jGenerateVisitorId;
        boolean z5;
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "new session with " + privacyRules.getPrivacySettings().toString());
        }
        if (privacyRules.keepVisitorId()) {
            int sessionId = sessionParameterStore.getSessionId() + 1;
            jGenerateVisitorId = sessionParameterStore.getVisitorId();
            if (jGenerateVisitorId == 0) {
                jGenerateVisitorId = SessionParameterUtil.generateVisitorId();
                z5 = true;
            } else {
                z5 = false;
            }
            Session sessionCurrentSession = Session.currentSession();
            i = (sessionCurrentSession == null || sessionCurrentSession.visitorId == jGenerateVisitorId) ? 0 : 1;
            if (z5 || (z4 && i != 0)) {
                AdkSettings.getInstance().setNewVisitorSent(false);
            }
            sessionParameterStore.update(sessionId, jGenerateVisitorId);
            i = sessionId;
        } else {
            jGenerateVisitorId = SessionParameterUtil.generateVisitorId();
            sessionParameterStore.update(0, 0L);
            AdkSettings.getInstance().setNewVisitorSent(true);
            setGpsLocation(null);
        }
        Session sessionStartNewSession = z4 ? Session.startNewSession(privacyRules, j) : Session.startNewSessionIfNeeded(privacyRules);
        sessionStartNewSession.visitorId = jGenerateVisitorId;
        sessionStartNewSession.sessionId = i;
        if (!z4) {
            sessionStartNewSession.internalSetPrivacyRules(privacyRules);
        }
        startNewSession(sessionStartNewSession, z4);
    }

    public static void startNewSession(Session session, boolean z4) {
        RageTapDetector rageTapDetector2;
        if (z4) {
            resetLifecycleData();
        }
        ServerConfiguration serverConfiguration = AdkSettings.getInstance().getServerConfiguration();
        int serverId = serverConfiguration.getServerId();
        AdkSettings.getInstance().serverId = serverId;
        CommunicationManagerBridge communicationManagerBridge2 = communicationManagerBridge;
        if (communicationManagerBridge2 != null) {
            communicationManagerBridge2.updateServerId(serverId);
        }
        basicSegment.update(true);
        if (AdkSettings.getInstance().hybridApp) {
            if (!z4) {
                cookieHandler.onAgentStart();
            }
            cookieHandler.onSessionStart(session, AdkSettings.appIdEncoded);
        }
        if (AdkSettings.getInstance().getConfiguration().isRageTapDetectionEnabled && (rageTapDetector2 = rageTapDetector) != null) {
            rageTapDetector2.onNewSession(session);
        }
        PrivacyRules privacyRules = session.getPrivacyRules();
        EventType eventType = EventType.ACTION_AUTO_LOADING_APP;
        if (privacyRules.shouldCollectEvent(eventType)) {
            DTXAutoAction dTXAutoAction = new DTXAutoAction(Global.LOADING + AdkSettings.applName, session, serverId, true);
            dTXAutoAction.updateEndTime();
            dTXAutoAction.endActionSequenceNum = Utility.getEventSeqNum();
            dTXAutoAction.eventType = eventType;
            saveSegment(dTXAutoAction);
        }
        communicationManager.startNewSession(session);
        flushEvents();
        AgentStateListener agentStateListener = adk.getAgentStateListener();
        if (agentStateListener != null) {
            agentStateListener.onNewSessionStarted(serverConfiguration, session, serverId, new SrBeaconParamListener());
        }
        HashMap map = new HashMap();
        map.put(ConfigurationPublisher.ConfigChange.IS_3RDGEN_ENABLED, Boolean.valueOf(session.isGrailEventsShouldBeCaptured()));
        CONFIGURATION_PUBLISHER.notify(map);
    }
}
