package com.dynatrace.android.agent;

import We.s;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.location.Location;
import android.webkit.WebView;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.api.HttpRequestEventBuilder;
import com.dynatrace.agent.api.OneAgentFacade;
import com.dynatrace.agent.events.EventFieldsProvider;
import com.dynatrace.agent.events.EventModifier;
import com.dynatrace.agent.events.error.ErrorEvent;
import com.dynatrace.agent.events.error.ExceptionEventContent;
import com.dynatrace.android.agent.conf.AgentMode;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.conf.DataCollectionLevel;
import com.dynatrace.android.agent.conf.PrivacyRules;
import com.dynatrace.android.agent.conf.UserPrivacyOptions;
import com.dynatrace.android.agent.crash.CrashCatcher;
import com.dynatrace.android.agent.crash.JavaStacktraceProcessor;
import com.dynatrace.android.agent.crash.PlatformType;
import com.dynatrace.android.agent.crash.StacktraceData;
import com.dynatrace.android.agent.crash.StacktraceProcessorFactory;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.mixed.AgentServiceLocatorImpl;
import com.dynatrace.android.agent.mixed.SecondGenServiceLocatorImpl;
import com.dynatrace.android.agent.mixed.SessionInformationGenerator;
import com.dynatrace.android.agent.mixed.TimeProviderFactory;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.internal.api.ProcessAnalyzer;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Dynatrace {
    private static final String HEADER = "x-dynatrace";
    private static final String JS_INTERFACE_NAME = "MobileAgent";
    static final String ILLEGAL_STATE_ERROR = AdkSettings.getADKName() + " not running";
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "Dynatrace");
    private static final Object mOperationPending = new Object();
    private static AtomicBoolean isAlreadyStarted = new AtomicBoolean(false);

    public static boolean addEventModifier(EventModifier eventModifier) {
        if (eventModifier != null) {
            return Core.GUARDED_EVENT_DISPATCHER.addEventModifier(eventModifier);
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "adding a null EventModifier is not allowed");
        return false;
    }

    public static void applyUserPrivacyOptions(UserPrivacyOptions userPrivacyOptions) {
        if (Global.isAlive.get() && AdkSettings.getInstance().getConfiguration().userOptIn) {
            if (!userPrivacyOptions.isCrashReportingOptedIn() && userPrivacyOptions.isCrashReplayOptedIn()) {
                userPrivacyOptions = userPrivacyOptions.newBuilder().withCrashReplayOptedIn(false).build();
                if (Global.DEBUG) {
                    Utility.zlogE(LOGTAG, "CrashReplayOptedIn cannot be true when CrashReportOptIn is false");
                }
            }
            if (userPrivacyOptions.equals(getUserPrivacyOptions())) {
                return;
            }
            AdkSettings.getInstance().preferencesManager.storePrivacySettings(userPrivacyOptions);
            Core.startNewSession(true, new PrivacyRules(userPrivacyOptions));
        }
    }

    public static void createNewSession() {
        if (Global.isAlive.get()) {
            Core.startNewSession(true, Session.currentSession().getPrivacyRules());
        }
    }

    public static void endVisit() {
        if (getCaptureStatus()) {
            Core.endVisit();
        }
    }

    public static DTXAction enterAction(String str) {
        return !Global.isAlive.get() ? NullAction.INSTANCE : DTXActionImpl.createAction(str, null);
    }

    public static void flushEvents() {
        if (Global.isAlive.get()) {
            Core.flushEvents();
        }
    }

    public static boolean getCaptureStatus() {
        if (Global.isAlive.get()) {
            return Core.getCaptureState();
        }
        return false;
    }

    @Deprecated
    public static DataCollectionLevel getDataCollectionLevel() {
        if (Global.isAlive.get()) {
            return getUserPrivacyOptions().getDataCollectionLevel();
        }
        throw new IllegalStateException(ILLEGAL_STATE_ERROR);
    }

    public static String getRequestTag() {
        return !Global.isAlive.get() ? "" : WebReqTag.tagToString(Core.getRequestTag());
    }

    public static String getRequestTagHeader() {
        return HEADER;
    }

    public static UserPrivacyOptions getUserPrivacyOptions() {
        return !Global.isAlive.get() ? PrivacyRules.PRIVACY_MODE_DEACTIVATED.getPrivacySettings() : Session.currentSession().getPrivacyRules().getPrivacySettings();
    }

    public static WebRequestTiming getWebRequestTiming(String str) {
        return new WebRequestTiming(str);
    }

    public static void identifyUser(String str) {
        if (getCaptureStatus()) {
            Session sessionDetermineActiveSession = Session.determineActiveSession(false);
            if (sessionDetermineActiveSession.getPrivacyRules().shouldCollectEvent(EventType.IDENTIFY_USER)) {
                if (str == null || str.isEmpty()) {
                    str = null;
                }
                sessionDetermineActiveSession.setUserTag(str);
                Core.reportUserTag(sessionDetermineActiveSession);
            }
        }
    }

    public static void instrumentWebView(WebView webView) {
        if (webView == null || !AdkSettings.getInstance().hybridApp) {
            return;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new JavascriptAgentInterface(), JS_INTERFACE_NAME);
    }

    public static DTXAction integrateNewAction(String str) {
        if (!Global.isAlive.get()) {
            return NullAction.INSTANCE;
        }
        DTXAutoAction autoAction = DTXAutoAction.getAutoAction();
        if (autoAction != null) {
            return DTXActionImpl.createAction(str, autoAction);
        }
        DTXAutoAction dTXAutoActionCreateAutoAction = DTXAutoAction.createAutoAction(str, Session.determineActiveSession(false), AdkSettings.getInstance().serverId);
        dTXAutoActionCreateAutoAction.startTimer(1000);
        return dTXAutoActionCreateAutoAction;
    }

    public static WebRequestTiming internalGetWebRequestTiming(String str) {
        return new WebRequestTiming(str, false);
    }

    public static void internalReportError(String str, int i) {
        if (str != null && getCaptureStatus()) {
            reportError(str, 9, Session.determineActiveSession(false), String.valueOf(i));
        }
    }

    @Deprecated
    public static boolean isCrashReportingOptedIn() {
        if (Global.isAlive.get()) {
            return getUserPrivacyOptions().isCrashReportingOptedIn();
        }
        throw new IllegalStateException(ILLEGAL_STATE_ERROR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reportError$0(Session session, String str, int i, RumEventDispatcher rumEventDispatcher) {
        PrivacyRules privacyRules = session.getPrivacyRules();
        EventType eventType = EventType.EVENT_API;
        if (!privacyRules.shouldCollectEvent(eventType)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "reportError eventType shouldn't be collected, because of data collection level: " + eventType);
        } else {
            JSONObject jSONObjectGenerateErrorEvent = ErrorEvent.generateErrorEvent(str, i, true);
            if (jSONObjectGenerateErrorEvent != null) {
                rumEventDispatcher.dispatchEvent(jSONObjectGenerateErrorEvent, TimeLineProvider.getSystemTime(), 0L, SessionInformationGenerator.generate(session), true, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reportError$1(Session session, Throwable th2, String str, RumEventDispatcher rumEventDispatcher) {
        PrivacyRules privacyRules = session.getPrivacyRules();
        EventType eventType = EventType.EVENT_API;
        if (!privacyRules.shouldCollectEvent(eventType)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "reportError eventType shouldn't be collected, because of data collection level: " + eventType);
        } else {
            JSONObject jSONObjectErrorExceptionEvent = ErrorEvent.errorExceptionEvent(th2, str, true);
            if (jSONObjectErrorExceptionEvent != null) {
                rumEventDispatcher.dispatchEvent(jSONObjectErrorExceptionEvent, TimeLineProvider.getSystemTime(), 0L, SessionInformationGenerator.generate(session), true, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendExceptionEvent$2(Session session, Throwable th2, EventFieldsProvider eventFieldsProvider, RumEventDispatcher rumEventDispatcher) {
        PrivacyRules privacyRules = session.getPrivacyRules();
        EventType eventType = EventType.EVENT_API;
        if (!privacyRules.shouldCollectEvent(eventType)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "sendExceptionEvent eventType shouldn't be collected, because of data collection level: " + eventType);
        } else {
            ExceptionEventContent exceptionEventContentExceptionEvent = ErrorEvent.exceptionEvent(th2, eventFieldsProvider);
            if (exceptionEventContentExceptionEvent != null) {
                rumEventDispatcher.dispatchEventWithRestrictions(exceptionEventContentExceptionEvent.getCustomerJson(), exceptionEventContentExceptionEvent.getAgentJson(), SessionInformationGenerator.generate(session), null);
            }
        }
    }

    public static void modifyUserAction(UserActionModifier userActionModifier) {
        if (Global.isAlive.get()) {
            Core.modifyUserAction(userActionModifier);
        }
    }

    public static void pause() {
        if (Global.isAlive.get()) {
            Core.flushEvents();
        }
    }

    public static boolean removeEventModifier(EventModifier eventModifier) {
        return Core.GUARDED_EVENT_DISPATCHER.removeEventModifier(eventModifier);
    }

    public static void reportCrash(PlatformType platformType, String str, String str2, String str3) {
        if (platformType == null || str == null) {
            return;
        }
        reportCrash(str, 21, Utility.truncateString(str2, 1000), Utility.truncateString(str3, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH), platformType.getProtocolValue());
    }

    public static void reportError(String str, int i) {
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "reportError, errorName: " + str + ", errorCode: " + i);
        if (str != null && getCaptureStatus()) {
            Session sessionDetermineActiveSession = Session.determineActiveSession(false);
            Core.GUARDED_EVENT_DISPATCHER.executeWithVerification(sessionDetermineActiveSession, new G6.b(sessionDetermineActiveSession, str, i, 6));
            reportError(str, 9, sessionDetermineActiveSession, String.valueOf(i));
        }
    }

    public static void restoreCookies() {
        if (Global.isAlive.get()) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "restore cookies");
            }
            Core.restoreCookies();
        }
    }

    public static void resume() {
        if (Global.isAlive.get()) {
            Core.communicationManager.startTimerLoop(false);
        }
    }

    public static void sendBizEvent(String str, JSONObject jSONObject) {
        if (getCaptureStatus()) {
            Core.sendBizEvent(str, jSONObject);
        }
    }

    public static void sendEvent(JSONObject jSONObject, Object[] objArr) {
        if (!getCaptureStatus()) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "send event not possible, capturing is disabled");
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "send a JSON event to the enrichment pipeline");
            Core.sendEvent(jSONObject, objArr);
        }
    }

    public static void sendExceptionEvent(Throwable th2, EventFieldsProvider eventFieldsProvider) {
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "sendExceptionEvent is executed with fieldsProvider: ".concat(eventFieldsProvider != null ? eventFieldsProvider.getClass().getName() : ""));
        if (getCaptureStatus()) {
            if (th2 == null) {
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "event is rejected, throwable can't be null");
            } else {
                Session sessionDetermineActiveSession = Session.determineActiveSession(false);
                Core.GUARDED_EVENT_DISPATCHER.executeWithVerification(sessionDetermineActiveSession, new Bb.c(22, sessionDetermineActiveSession, th2, eventFieldsProvider));
            }
        }
    }

    public static void sendHttpRequestEvent(HttpRequestEventBuilder httpRequestEventBuilder) {
        OneAgentFacade oneAgentFacade;
        if (Global.isAlive.get() && (oneAgentFacade = Core.oneAgentFacade) != null) {
            oneAgentFacade.sendHttpRequestEvent(httpRequestEventBuilder);
            return;
        }
        StringBuilder sb2 = new StringBuilder("sendHttpRequestEvent can't be executed, isAlive: ");
        sb2.append(Global.isAlive.get());
        sb2.append(" Grail is enabled: ");
        sb2.append(Core.oneAgentFacade != null);
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, sb2.toString());
    }

    public static void sendSessionPropertyEvent(JSONObject jSONObject) {
        if (getCaptureStatus()) {
            Core.sendSessionPropertyEvent(jSONObject);
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "send session property event not possible, capturing is disabled");
        }
    }

    public static void setBeaconHeaders(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            AdkSettings.customBeaconHeaders = null;
            return;
        }
        AdkSettings.customBeaconHeaders = new HashMap(map);
        if (Global.isAlive.get()) {
            Core.communicationManager.scheduleNewBeaconRequest();
        }
    }

    @Deprecated
    public static void setCrashReportingOptedIn(boolean z4) {
        if (!Global.isAlive.get()) {
            throw new IllegalStateException(ILLEGAL_STATE_ERROR);
        }
        applyUserPrivacyOptions(getUserPrivacyOptions().newBuilder().withCrashReportingOptedIn(z4).build());
    }

    @Deprecated
    public static void setDataCollectionLevel(DataCollectionLevel dataCollectionLevel) {
        if (!Global.isAlive.get()) {
            throw new IllegalStateException(ILLEGAL_STATE_ERROR);
        }
        applyUserPrivacyOptions(getUserPrivacyOptions().newBuilder().withDataCollectionLevel(dataCollectionLevel).build());
    }

    public static void setGpsLocation(Location location) {
        if (Global.isAlive.get()) {
            Core.setGpsLocation(location);
        }
    }

    @Deprecated
    public static void shutdown() {
        shutdown(5000L);
    }

    public static void startView(String str) {
        OneAgentFacade oneAgentFacade;
        if (Global.isAlive.get() && (oneAgentFacade = Core.oneAgentFacade) != null) {
            oneAgentFacade.startView(str);
            return;
        }
        StringBuilder sb2 = new StringBuilder("start view can't be executed, isAlive: ");
        sb2.append(Global.isAlive.get());
        sb2.append(" Grail is enabled: ");
        sb2.append(Core.oneAgentFacade != null);
        Utility.devLog(OneAgentLoggingKt.TAG_VIEW, sb2.toString());
    }

    public static void startup(Application application, Configuration configuration) {
        startup(application, null, configuration);
    }

    public static void stopView() {
        OneAgentFacade oneAgentFacade;
        if (Global.isAlive.get() && (oneAgentFacade = Core.oneAgentFacade) != null) {
            oneAgentFacade.stopView();
            return;
        }
        StringBuilder sb2 = new StringBuilder("stop view can't be executed, Grail is enabled: ");
        sb2.append(Core.oneAgentFacade != null);
        Utility.devLog(OneAgentLoggingKt.TAG_VIEW, sb2.toString());
    }

    @Deprecated
    public static void tagRequest(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null || !getCaptureStatus()) {
            return;
        }
        try {
            httpURLConnection.setRequestProperty(getRequestTagHeader(), WebReqTag.tagToString(Core.getRequestTag()));
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogE(LOGTAG, e.toString());
            }
        }
    }

    public static WebRequestTiming getWebRequestTiming(HttpURLConnection httpURLConnection) {
        return new WebRequestTiming(httpURLConnection);
    }

    private static void shutdown(final long j) {
        synchronized (mOperationPending) {
            try {
                if (!isAlreadyStarted.compareAndSet(true, false)) {
                    if (Global.DEBUG) {
                        Utility.zlogD(LOGTAG, "Not initialized - skip shutdown");
                    }
                    return;
                }
                Core.forceCloseActiveActions("agent shutdown");
                CrashCatcher.uninstallUncaughtExceptionHandler();
                CrashCatcher.unregisterUncaughtExceptionListener(Core.getCrashListener());
                Core.communicationManager.stopTimerLoop();
                new Thread() { // from class: com.dynatrace.android.agent.Dynatrace.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        synchronized (Dynatrace.mOperationPending) {
                            Core.shutdown(j);
                        }
                    }
                }.start();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void startup(Activity activity, Configuration configuration) {
        startup((Application) activity.getApplicationContext(), activity, configuration);
    }

    @Deprecated
    public static void startup(Context context, Configuration configuration) {
        if (context instanceof Application) {
            startup((Application) context, configuration);
        } else if (context instanceof Activity) {
            startup((Activity) context, configuration);
        } else {
            startup((Application) context.getApplicationContext(), configuration);
        }
    }

    public static DTXAction enterAction(String str, DTXAction dTXAction) {
        if (Global.isAlive.get() && !(dTXAction instanceof NullAction)) {
            return DTXActionImpl.createAction(str, dTXAction);
        }
        return NullAction.INSTANCE;
    }

    private static void reportCrash(String str, int i, String... strArr) {
        if (getCaptureStatus()) {
            Session sessionDetermineActiveSession = Session.determineActiveSession(false);
            if (sessionDetermineActiveSession.getPrivacyRules().shouldCollectEvent(EventType.CRASH)) {
                Core.addEvent(str, i, 0L, null, sessionDetermineActiveSession, AdkSettings.getInstance().serverId, strArr);
            }
        }
    }

    @Deprecated
    public static void identifyUser(String str, DTXAction dTXAction) {
        identifyUser(str);
    }

    public static void reportError(String str, Throwable th2) {
        StacktraceData stacktraceDataProcess;
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "reportError, errorName: " + str);
        if (str == null) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "event is rejected, name can't be null");
            return;
        }
        if (getCaptureStatus()) {
            Session sessionDetermineActiveSession = Session.determineActiveSession(false);
            if (th2 != null) {
                Core.GUARDED_EVENT_DISPATCHER.executeWithVerification(sessionDetermineActiveSession, new Bb.c(21, sessionDetermineActiveSession, th2, str));
            } else {
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "Grail event is rejected, throwable can't be null");
            }
            int i = AdkSettings.getInstance().getConfiguration().mode == AgentMode.APP_MON ? 10 : Integer.MAX_VALUE;
            if (th2 == null) {
                stacktraceDataProcess = new StacktraceData(null, null, null, PlatformType.JAVA);
            } else {
                stacktraceDataProcess = new JavaStacktraceProcessor(th2, i).process();
            }
            reportError(str, 10, sessionDetermineActiveSession, stacktraceDataProcess.getName(), stacktraceDataProcess.getReason(), stacktraceDataProcess.getStacktrace(), stacktraceDataProcess.getType().getProtocolValue());
        }
    }

    private static void startup(Application application, Activity activity, Configuration configuration) {
        if (application == null || configuration == null) {
            return;
        }
        if (Utility.isIsolatedProcess()) {
            if (configuration.debugLogLevel) {
                Utility.zlogD(LOGTAG, "Isolated service detected. Monitoring deactivated for this process");
            }
        } else {
            if (new ProcessAnalyzer().isInternalProcess()) {
                return;
            }
            synchronized (mOperationPending) {
                if (isAlreadyStarted.get()) {
                    return;
                }
                try {
                    Core.startup(application, activity, configuration, new AgentServiceLocatorImpl(configuration.toOneAgentConfiguration(), new TimeProviderFactory().createTimelineProvider(), application, configuration.httpFactory, new SecondGenServiceLocatorImpl(application)));
                    isAlreadyStarted.set(true);
                } catch (Exception e) {
                    if (Global.DEBUG) {
                        Utility.zlogD(LOGTAG, "unable to start agent", e);
                    }
                }
            }
        }
    }

    public static void reportError(PlatformType platformType, String str, String str2, String str3, String str4) {
        if (platformType == null || str == null) {
            return;
        }
        reportError(str, 20, Session.determineActiveSession(false), Utility.truncateString(str2, 250), Utility.truncateString(str3, 1000), Utility.truncateString(str4, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH), platformType.getProtocolValue());
    }

    private static void reportError(String str, int i, Session session, String... strArr) {
        if (getCaptureStatus()) {
            Core.addEvent(str, i, 0L, null, session, AdkSettings.getInstance().serverId, strArr);
        }
    }
}
