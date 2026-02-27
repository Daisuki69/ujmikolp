package com.dynatrace.android.callback;

import We.s;
import android.app.Application;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.AgentUtil;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.DTXAutoAction;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.WebReqTag;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.conf.ConfigurationPreset;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.lifecycle.OneAgentLifecycleManagerBridge;
import com.dynatrace.android.agent.mixed.WebRequestTraceContext;
import com.dynatrace.android.agent.useraction.OneAgentUserInteractionManagerBridge;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.callback.CbConstants;
import java.net.HttpURLConnection;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class CallbackCore {
    private static final String INITIATE = "Initiate ";
    private static final String TOUCH_ON = "Touch on ";
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "CallbackCore");
    static AtomicBoolean isInitialized = new AtomicBoolean(false);
    static Configuration configuration = ConfigurationPreset.generateImproperConfiguration();
    static boolean captureTestData = false;
    private static WeakHashMap<HttpURLConnection, CbWebReqTracker> httpConns = new WeakHashMap<>();
    private static volatile DTXAutoAction currentAutoAction = null;
    private static volatile ListenerActionType currentActionType = null;

    public static class ConnRegistration extends Thread {
        private static HashSet<Integer> requests = new HashSet<>();
        private HttpURLConnection conn;

        /* JADX INFO: Access modifiers changed from: private */
        public CbWebReqTracker register() {
            WeakHashMap weakHashMap;
            CbWebReqTracker cbWebReqTrackerRegisterConn = null;
            try {
                CbWebReqTracker cbWebReqTracker = (CbWebReqTracker) CallbackCore.httpConns.get(this.conn);
                if (cbWebReqTracker != null) {
                    return cbWebReqTracker;
                }
                String strFetchWebReqTag = WebReqTag.fetchWebReqTag(this.conn, Dynatrace.getRequestTagHeader());
                if (strFetchWebReqTag != null) {
                    synchronized (CallbackCore.httpConns) {
                        weakHashMap = new WeakHashMap(CallbackCore.httpConns);
                    }
                    for (Map.Entry entry : weakHashMap.entrySet()) {
                        if (((CbWebReqTracker) entry.getValue()).webReqTag.sameAs(strFetchWebReqTag)) {
                            if (Global.DEBUG) {
                                Utility.zlogD(CallbackCore.LOGTAG, "replace tracking for tag " + strFetchWebReqTag);
                            }
                            CallbackCore.httpConns.remove(entry.getKey());
                            CallbackCore.httpConns.put(this.conn, (CbWebReqTracker) entry.getValue());
                            return (CbWebReqTracker) entry.getValue();
                        }
                    }
                    return null;
                }
            } catch (Exception e) {
                if (Global.DEBUG) {
                    Utility.zlogD(CallbackCore.LOGTAG, "can't access tracking state", e);
                }
            }
            if (requests.contains(Integer.valueOf(this.conn.hashCode()))) {
                return null;
            }
            requests.add(Integer.valueOf(this.conn.hashCode()));
            int i = 0;
            while (true) {
                int i4 = i + 1;
                if (i > 3) {
                    break;
                }
                try {
                    cbWebReqTrackerRegisterConn = CallbackCore.registerConn(this.conn);
                    break;
                } catch (Exception unused) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused2) {
                    }
                    i = i4;
                }
            }
            requests.remove(Integer.valueOf(this.conn.hashCode()));
            return cbWebReqTrackerRegisterConn;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            register();
        }

        private ConnRegistration(HttpURLConnection httpURLConnection) {
            this.conn = httpURLConnection;
        }
    }

    public enum ListenerActionType {
        Clicked,
        ItemClicked,
        ItemSelected,
        MenuItemClick,
        OptionsItemSelected,
        PageSelected,
        SwipeToRefresh
    }

    private CallbackCore() {
    }

    public static CbWebReqTracker addConnection(HttpURLConnection httpURLConnection, boolean z4) {
        if (httpURLConnection != null && Dynatrace.getCaptureStatus() && Session.currentSession().getPrivacyRules().shouldCollectEvent(EventType.WEB_REQUEST)) {
            ConnRegistration connRegistration = new ConnRegistration(httpURLConnection);
            if (z4) {
                return connRegistration.register();
            }
            try {
                httpURLConnection.getURL().toString();
                return connRegistration.register();
            } catch (Exception unused) {
                connRegistration.start();
            }
        }
        return null;
    }

    public static String defaultUserAgent() {
        String property = System.getProperty("http.agent");
        if (property != null) {
            return property;
        }
        return "Java/" + System.getProperty("java.version");
    }

    private static WebReqTag generateWebReqTag(DTXAutoAction dTXAutoAction, HttpURLConnection httpURLConnection) {
        WebReqTag webReqTagInternalTagRequest;
        return (dTXAutoAction == null || (webReqTagInternalTagRequest = AgentUtil.internalTagRequest(dTXAutoAction, httpURLConnection)) == null) ? AgentUtil.getRequestTag() : webReqTagInternalTagRequest;
    }

    private static String getMenuDesc(MenuItem menuItem) {
        if (configuration.namePrivacy) {
            return TOUCH_ON.concat(menuItem.getClass().getSimpleName());
        }
        CharSequence title = menuItem.getTitle();
        if (title == null || title.length() <= 0) {
            return TOUCH_ON.concat(menuItem.getClass().getSimpleName());
        }
        return TOUCH_ON + ((Object) title);
    }

    private static String getViewDesc(View view) {
        if (configuration.namePrivacy) {
            return TOUCH_ON.concat(view.getClass().getSimpleName());
        }
        CharSequence contentDescription = view.getContentDescription();
        if (contentDescription != null && contentDescription.length() > 0) {
            return TOUCH_ON + ((Object) contentDescription);
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int inputType = textView.getInputType();
            if (TextViewHelper.isPasswordInputType(inputType) || TextViewHelper.isVisiblePasswordInputType(inputType)) {
                return "Touch on ****";
            }
            CharSequence text = textView.getText();
            if (text != null && text.length() > 0) {
                return TOUCH_ON + ((Object) text);
            }
        }
        return TOUCH_ON.concat(view.getClass().getSimpleName());
    }

    public static void init(Context context, Configuration configuration2) {
        OneAgentLifecycleManagerBridge oneAgentLifecycleManagerBridge;
        if (context == null) {
            return;
        }
        Application application = (Application) context.getApplicationContext();
        if (isInitialized.getAndSet(true)) {
            return;
        }
        if (AdkSettings.getInstance().getConfiguration() != null) {
            configuration2 = AdkSettings.getInstance().getConfiguration();
        } else if (configuration2 == null) {
            return;
        }
        if (configuration2.debugLogLevel) {
            Global.DEBUG = true;
        }
        configuration = configuration2;
        if (!configuration2.autoStart && Global.DEBUG) {
            Utility.zlogD(LOGTAG, "Runtime properties: " + configuration);
        }
        if (Utility.isIsolatedProcess()) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "Isolated service detected. Monitoring deactivated for this process");
                return;
            }
            return;
        }
        Configuration configuration3 = configuration;
        if (configuration3.autoStart) {
            Dynatrace.startup(application, configuration3);
        }
        if (AdkSettings.getInstance().getContext() == null) {
            try {
                AdkSettings.getInstance().setup(configuration, application);
            } catch (Exception e) {
                if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, "unable to start agent, problem in settings setup", e);
                    return;
                }
                return;
            }
        }
        if (AdkSettings.getInstance().getServerConfiguration().isGen3Enabled() && (oneAgentLifecycleManagerBridge = Core.getOneAgentLifecycleManagerBridge()) != null) {
            oneAgentLifecycleManagerBridge.onAppStart();
        }
        if (configuration.applicationMonitoring) {
            Core.getApplicationStartMonitor().onApplicationStart(TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
        }
    }

    public static void onUserActionEnter(ListenerActionType listenerActionType) {
        onUserActionEnter(listenerActionType, INITIATE + listenerActionType.toString());
    }

    public static void onUserActionExit(ListenerActionType listenerActionType) {
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "onUA: " + listenerActionType + " entry=false");
        }
        if (currentAutoAction == null || currentActionType != listenerActionType) {
            return;
        }
        currentAutoAction.startTimer();
        currentAutoAction = null;
        currentActionType = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CbWebReqTracker registerConn(HttpURLConnection httpURLConnection) {
        DTXAutoAction autoAction;
        WebReqTag webReqTagGenerateWebReqTag;
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "Add WR " + httpURLConnection.getClass().getSimpleName() + " to " + httpURLConnection.getURL().toString());
        }
        if (!isInitialized.get()) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "OneAgent not correctly initialized");
            }
            return null;
        }
        if (!configuration.webRequestTiming || (webReqTagGenerateWebReqTag = generateWebReqTag((autoAction = DTXAutoAction.getAutoAction()), httpURLConnection)) == null) {
            return null;
        }
        CbWebReqTracker cbWebReqTracker = new CbWebReqTracker(autoAction, webReqTagGenerateWebReqTag.getSession());
        if (webReqTagGenerateWebReqTag.getSession().isGrailEventsShouldBeCaptured()) {
            WebRequestTraceContext webRequestTraceContext = new WebRequestTraceContext();
            cbWebReqTracker.setTraceContext(webRequestTraceContext);
            try {
                httpURLConnection.setRequestProperty("traceparent", webRequestTraceContext.getTraceparentId());
            } catch (Exception e) {
                if (Global.DEBUG) {
                    Utility.zlogE(LOGTAG, e.toString());
                }
            }
        }
        synchronized (httpConns) {
            httpConns.put(httpURLConnection, cbWebReqTracker);
        }
        cbWebReqTracker.setWebReqTag(webReqTagGenerateWebReqTag);
        return cbWebReqTracker;
    }

    public static void setWebReqTag(HttpURLConnection httpURLConnection) {
        CbWebReqTracker cbWebReqTracker = httpConns.get(httpURLConnection);
        if (cbWebReqTracker != null) {
            httpURLConnection.setRequestProperty(Dynatrace.getRequestTagHeader(), cbWebReqTracker.webReqTag.toString());
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "webReqState is: " + cbWebReqTracker);
        }
    }

    public static void updateConnection(ConnStateParms connStateParms) {
        HttpURLConnection httpURLConnection = connStateParms.conn;
        if (httpURLConnection == null || !configuration.webRequestTiming) {
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, connStateParms.state + " of " + connStateParms.trackingMethod + " of " + httpURLConnection.getClass().getSimpleName() + " to " + connStateParms.getRequestDesc());
        }
        CbWebReqTracker cbWebReqTracker = httpConns.get(connStateParms.conn);
        if (cbWebReqTracker == null) {
            return;
        }
        if (CbConstants.WrStates.PRE_EXEC == connStateParms.state) {
            cbWebReqTracker.checkForManualTag(WebReqTag.fetchWebReqTag(connStateParms.conn, Dynatrace.getRequestTagHeader()), WebReqTag.fetchWebReqTag(connStateParms.conn, "x-dtc"));
        }
        cbWebReqTracker.procNewState(connStateParms);
        if (cbWebReqTracker.canFinalize) {
            synchronized (httpConns) {
                httpConns.remove(connStateParms.conn);
            }
            cbWebReqTracker.sendEvents(connStateParms);
        }
    }

    public static void onUserActionEnter(ListenerActionType listenerActionType, View view) {
        if (view == null) {
            onUserActionEnter(listenerActionType);
            return;
        }
        onUserActionEnter(listenerActionType, getViewDesc(view));
        OneAgentUserInteractionManagerBridge oneAgentUserInteractionManagerBridge = Core.getOneAgentUserInteractionManagerBridge();
        if (oneAgentUserInteractionManagerBridge != null) {
            oneAgentUserInteractionManagerBridge.onViewClick(view);
        }
    }

    public static void onUserActionEnter(ListenerActionType listenerActionType, MenuItem menuItem) {
        if (menuItem == null) {
            onUserActionEnter(listenerActionType);
        } else {
            onUserActionEnter(listenerActionType, getMenuDesc(menuItem));
        }
    }

    public static void onUserActionEnter(ListenerActionType listenerActionType, String str) {
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "onUA: " + listenerActionType + " entry=true actionName=" + str);
        }
        if (currentAutoAction != null && currentActionType != listenerActionType) {
            currentAutoAction.startTimer(0);
            currentAutoAction = null;
            currentActionType = null;
        }
        if (currentAutoAction == null && Global.isAlive.get()) {
            currentAutoAction = DTXAutoAction.createAutoAction(str, Session.determineActiveSession(false), AdkSettings.getInstance().serverId);
            currentActionType = listenerActionType;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "onUA: " + listenerActionType + " entry=true");
        }
    }
}
