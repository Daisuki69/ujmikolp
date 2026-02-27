package mx_com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import io.split.android.client.dtos.SerializableEvent;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;
import mx_com.mixpanel.android.util.Base64Coder;
import mx_com.mixpanel.android.util.HttpService;
import mx_com.mixpanel.android.util.LegacyVersionUtils;
import mx_com.mixpanel.android.util.MPLog;
import mx_com.mixpanel.android.util.RemoteService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class AnalyticsMessages {
    private static final int CLEAR_ANONYMOUS_UPDATES = 7;
    private static final int EMPTY_QUEUES = 6;
    private static final int ENQUEUE_EVENTS = 1;
    private static final int ENQUEUE_GROUP = 3;
    private static final int ENQUEUE_PEOPLE = 0;
    private static final int FLUSH_QUEUE = 2;
    private static final int KILL_WORKER = 5;
    private static final String LOGTAG = "MixpanelAPI.Messages";
    private static final int PUSH_ANONYMOUS_PEOPLE_RECORDS = 4;
    private static final int REMOVE_RESIDUAL_IMAGE_FILES = 9;
    private static final int REWRITE_EVENT_PROPERTIES = 8;
    private static final Map<Context, AnalyticsMessages> sInstances = new HashMap();
    protected final MPConfig mConfig;
    protected final Context mContext;
    private final Worker mWorker = createWorker();

    AnalyticsMessages(Context context) {
        this.mContext = context;
        this.mConfig = getConfig(context);
        getPoster().checkIsMixpanelBlocked();
    }

    protected Worker createWorker() {
        return new Worker();
    }

    public static AnalyticsMessages getInstance(Context context) {
        AnalyticsMessages analyticsMessages;
        Map<Context, AnalyticsMessages> map = sInstances;
        synchronized (map) {
            Context applicationContext = context.getApplicationContext();
            if (!map.containsKey(applicationContext)) {
                analyticsMessages = new AnalyticsMessages(applicationContext);
                map.put(applicationContext, analyticsMessages);
            } else {
                analyticsMessages = map.get(applicationContext);
            }
        }
        return analyticsMessages;
    }

    public void eventsMessage(EventDescription eventDescription) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = eventDescription;
        this.mWorker.runMessage(messageObtain);
    }

    public void peopleMessage(PeopleDescription peopleDescription) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        messageObtain.obj = peopleDescription;
        this.mWorker.runMessage(messageObtain);
    }

    public void groupMessage(GroupDescription groupDescription) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        messageObtain.obj = groupDescription;
        this.mWorker.runMessage(messageObtain);
    }

    public void pushAnonymousPeopleMessage(PushAnonymousPeopleDescription pushAnonymousPeopleDescription) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        messageObtain.obj = pushAnonymousPeopleDescription;
        this.mWorker.runMessage(messageObtain);
    }

    public void clearAnonymousUpdatesMessage(MixpanelDescription mixpanelDescription) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        messageObtain.obj = mixpanelDescription;
        this.mWorker.runMessage(messageObtain);
    }

    public void postToServer(MixpanelDescription mixpanelDescription) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = mixpanelDescription.getToken();
        messageObtain.arg1 = 0;
        this.mWorker.runMessage(messageObtain);
    }

    public void emptyTrackingQueues(MixpanelDescription mixpanelDescription) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 6;
        messageObtain.obj = mixpanelDescription;
        this.mWorker.runMessage(messageObtain);
    }

    public void updateEventProperties(UpdateEventsPropertiesDescription updateEventsPropertiesDescription) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 8;
        messageObtain.obj = updateEventsPropertiesDescription;
        this.mWorker.runMessage(messageObtain);
    }

    public void removeResidualImageFiles(File file) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 9;
        messageObtain.obj = file;
        this.mWorker.runMessage(messageObtain);
    }

    public void hardKill() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 5;
        this.mWorker.runMessage(messageObtain);
    }

    boolean isDead() {
        return this.mWorker.isDead();
    }

    protected MPDbAdapter makeDbAdapter(Context context) {
        return MPDbAdapter.getInstance(context);
    }

    protected MPConfig getConfig(Context context) {
        return MPConfig.getInstance(context);
    }

    protected RemoteService getPoster() {
        return new HttpService();
    }

    static class EventDescription extends MixpanelMessageDescription {
        private final String mEventName;
        private final boolean mIsAutomatic;
        private final JSONObject mSessionMetadata;

        public EventDescription(String str, JSONObject jSONObject, String str2) {
            this(str, jSONObject, str2, false, new JSONObject());
        }

        public EventDescription(String str, JSONObject jSONObject, String str2, boolean z4, JSONObject jSONObject2) {
            super(str2, jSONObject);
            this.mEventName = str;
            this.mIsAutomatic = z4;
            this.mSessionMetadata = jSONObject2;
        }

        public String getEventName() {
            return this.mEventName;
        }

        public JSONObject getProperties() {
            return getMessage();
        }

        public JSONObject getSessionMetadata() {
            return this.mSessionMetadata;
        }

        public boolean isAutomatic() {
            return this.mIsAutomatic;
        }
    }

    static class PeopleDescription extends MixpanelMessageDescription {
        public PeopleDescription(JSONObject jSONObject, String str) {
            super(str, jSONObject);
        }

        public String toString() {
            return getMessage().toString();
        }

        public boolean isAnonymous() {
            return !getMessage().has("$distinct_id");
        }
    }

    static class GroupDescription extends MixpanelMessageDescription {
        public GroupDescription(JSONObject jSONObject, String str) {
            super(str, jSONObject);
        }

        public String toString() {
            return getMessage().toString();
        }
    }

    static class PushAnonymousPeopleDescription extends MixpanelDescription {
        private final String mDistinctId;

        public PushAnonymousPeopleDescription(String str, String str2) {
            super(str2);
            this.mDistinctId = str;
        }

        public String toString() {
            return this.mDistinctId;
        }

        public String getDistinctId() {
            return this.mDistinctId;
        }
    }

    static class MixpanelMessageDescription extends MixpanelDescription {
        private final JSONObject mMessage;

        public MixpanelMessageDescription(String str, JSONObject jSONObject) {
            super(str);
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject.get(next).toString();
                    } catch (AssertionError e) {
                        jSONObject.remove(next);
                        MPLog.e(AnalyticsMessages.LOGTAG, "Removing people profile property from update (see https://github.com/mixpanel/mixpanel-android/issues/567)", e);
                    } catch (JSONException unused) {
                    }
                }
            }
            this.mMessage = jSONObject;
        }

        public JSONObject getMessage() {
            return this.mMessage;
        }
    }

    static class UpdateEventsPropertiesDescription extends MixpanelDescription {
        private final Map<String, String> mProps;

        public UpdateEventsPropertiesDescription(String str, Map<String, String> map) {
            super(str);
            this.mProps = map;
        }

        public Map<String, String> getProperties() {
            return this.mProps;
        }
    }

    static class MixpanelDescription {
        private final String mToken;

        public MixpanelDescription(String str) {
            this.mToken = str;
        }

        public String getToken() {
            return this.mToken;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logAboutMessageToMixpanel(String str) {
        MPLog.v(LOGTAG, str + " (Thread " + Thread.currentThread().getId() + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logAboutMessageToMixpanel(String str, Throwable th2) {
        MPLog.v(LOGTAG, str + " (Thread " + Thread.currentThread().getId() + ")", th2);
    }

    class Worker {
        private SystemInformation mSystemInformation;
        private final Object mHandlerLock = new Object();
        private long mFlushCount = 0;
        private long mAveFlushFrequency = 0;
        private long mLastFlushTime = -1;
        private Handler mHandler = restartWorkerThread();

        public Worker() {
        }

        public boolean isDead() {
            boolean z4;
            synchronized (this.mHandlerLock) {
                z4 = this.mHandler == null;
            }
            return z4;
        }

        public void runMessage(Message message) {
            synchronized (this.mHandlerLock) {
                Handler handler = this.mHandler;
                if (handler == null) {
                    AnalyticsMessages.this.logAboutMessageToMixpanel("Dead mixpanel worker dropping a message: " + message.what);
                } else {
                    handler.sendMessage(message);
                }
            }
        }

        protected Handler restartWorkerThread() {
            HandlerThread handlerThread = new HandlerThread("mx_com.mixpanel.android.AnalyticsWorker", 10);
            handlerThread.start();
            return new AnalyticsMessageHandler(handlerThread.getLooper());
        }

        class AnalyticsMessageHandler extends Handler {
            private MPDbAdapter mDbAdapter;
            private int mFailedRetries;
            private final long mFlushInterval;
            private long mTrackEngageRetryAfter;

            public AnalyticsMessageHandler(Looper looper) {
                super(looper);
                this.mDbAdapter = null;
                Worker.this.mSystemInformation = SystemInformation.getInstance(AnalyticsMessages.this.mContext);
                this.mFlushInterval = AnalyticsMessages.this.mConfig.getFlushInterval();
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) throws Throwable {
                String token;
                String token2;
                JSONObject jSONObjectPrepareEventObject;
                if (this.mDbAdapter == null) {
                    MPDbAdapter mPDbAdapterMakeDbAdapter = AnalyticsMessages.this.makeDbAdapter(AnalyticsMessages.this.mContext);
                    this.mDbAdapter = mPDbAdapterMakeDbAdapter;
                    mPDbAdapterMakeDbAdapter.cleanupEvents(System.currentTimeMillis() - AnalyticsMessages.this.mConfig.getDataExpiration(), MPDbAdapter.Table.EVENTS);
                    this.mDbAdapter.cleanupEvents(System.currentTimeMillis() - AnalyticsMessages.this.mConfig.getDataExpiration(), MPDbAdapter.Table.PEOPLE);
                }
                int iPushAnonymousUpdatesToPeopleDb = -3;
                try {
                    if (message.what == 0) {
                        PeopleDescription peopleDescription = (PeopleDescription) message.obj;
                        MPDbAdapter.Table table = peopleDescription.isAnonymous() ? MPDbAdapter.Table.ANONYMOUS_PEOPLE : MPDbAdapter.Table.PEOPLE;
                        AnalyticsMessages.this.logAboutMessageToMixpanel("Queuing people record for sending later");
                        AnalyticsMessages.this.logAboutMessageToMixpanel("    " + peopleDescription.toString());
                        token = peopleDescription.getToken();
                        iPushAnonymousUpdatesToPeopleDb = this.mDbAdapter.addJSON(peopleDescription.getMessage(), token, table);
                        if (peopleDescription.isAnonymous()) {
                            iPushAnonymousUpdatesToPeopleDb = 0;
                        }
                    } else if (message.what == 3) {
                        GroupDescription groupDescription = (GroupDescription) message.obj;
                        AnalyticsMessages.this.logAboutMessageToMixpanel("Queuing group record for sending later");
                        AnalyticsMessages.this.logAboutMessageToMixpanel("    " + groupDescription.toString());
                        token = groupDescription.getToken();
                        iPushAnonymousUpdatesToPeopleDb = this.mDbAdapter.addJSON(groupDescription.getMessage(), token, MPDbAdapter.Table.GROUPS);
                    } else if (message.what == 1) {
                        EventDescription eventDescription = (EventDescription) message.obj;
                        try {
                            jSONObjectPrepareEventObject = prepareEventObject(eventDescription);
                            AnalyticsMessages.this.logAboutMessageToMixpanel("Queuing event for sending later");
                            AnalyticsMessages.this.logAboutMessageToMixpanel("    " + jSONObjectPrepareEventObject.toString());
                            token2 = eventDescription.getToken();
                        } catch (JSONException e) {
                            e = e;
                            token2 = null;
                        }
                        try {
                            iPushAnonymousUpdatesToPeopleDb = this.mDbAdapter.addJSON(jSONObjectPrepareEventObject, token2, MPDbAdapter.Table.EVENTS);
                        } catch (JSONException e7) {
                            e = e7;
                            MPLog.e(AnalyticsMessages.LOGTAG, "Exception tracking event " + eventDescription.getEventName(), e);
                        }
                        token = token2;
                    } else if (message.what == 4) {
                        PushAnonymousPeopleDescription pushAnonymousPeopleDescription = (PushAnonymousPeopleDescription) message.obj;
                        String distinctId = pushAnonymousPeopleDescription.getDistinctId();
                        token = pushAnonymousPeopleDescription.getToken();
                        iPushAnonymousUpdatesToPeopleDb = this.mDbAdapter.pushAnonymousUpdatesToPeopleDb(token, distinctId);
                    } else if (message.what == 7) {
                        token = ((MixpanelDescription) message.obj).getToken();
                        this.mDbAdapter.cleanupAllEvents(MPDbAdapter.Table.ANONYMOUS_PEOPLE, token);
                    } else {
                        if (message.what == 8) {
                            UpdateEventsPropertiesDescription updateEventsPropertiesDescription = (UpdateEventsPropertiesDescription) message.obj;
                            MPLog.d(AnalyticsMessages.LOGTAG, this.mDbAdapter.rewriteEventDataWithProperties(updateEventsPropertiesDescription.getProperties(), updateEventsPropertiesDescription.getToken()) + " stored events were updated with new properties.");
                        } else if (message.what == 2) {
                            AnalyticsMessages.this.logAboutMessageToMixpanel("Flushing queue due to scheduled or forced flush");
                            Worker.this.updateFlushFrequency();
                            token = (String) message.obj;
                            sendAllData(this.mDbAdapter, token);
                        } else if (message.what == 6) {
                            token = ((MixpanelDescription) message.obj).getToken();
                            this.mDbAdapter.cleanupAllEvents(MPDbAdapter.Table.EVENTS, token);
                            this.mDbAdapter.cleanupAllEvents(MPDbAdapter.Table.PEOPLE, token);
                            this.mDbAdapter.cleanupAllEvents(MPDbAdapter.Table.GROUPS, token);
                            this.mDbAdapter.cleanupAllEvents(MPDbAdapter.Table.ANONYMOUS_PEOPLE, token);
                        } else if (message.what == 5) {
                            MPLog.w(AnalyticsMessages.LOGTAG, "Worker received a hard kill. Dumping all events and force-killing. Thread id " + Thread.currentThread().getId());
                            synchronized (Worker.this.mHandlerLock) {
                                this.mDbAdapter.deleteDB();
                                Worker.this.mHandler = null;
                                Looper.myLooper().quit();
                            }
                        } else if (message.what == 9) {
                            LegacyVersionUtils.removeLegacyResidualImageFiles((File) message.obj);
                        } else {
                            MPLog.e(AnalyticsMessages.LOGTAG, "Unexpected message received by Mixpanel worker: " + message);
                        }
                        token = null;
                    }
                    if ((iPushAnonymousUpdatesToPeopleDb >= AnalyticsMessages.this.mConfig.getBulkUploadLimit() || iPushAnonymousUpdatesToPeopleDb == -2) && this.mFailedRetries <= 0 && token != null) {
                        AnalyticsMessages.this.logAboutMessageToMixpanel("Flushing queue due to bulk upload limit (" + iPushAnonymousUpdatesToPeopleDb + ") for project " + token);
                        Worker.this.updateFlushFrequency();
                        sendAllData(this.mDbAdapter, token);
                        return;
                    }
                    if (iPushAnonymousUpdatesToPeopleDb <= 0 || hasMessages(2, token)) {
                        return;
                    }
                    AnalyticsMessages.this.logAboutMessageToMixpanel("Queue depth " + iPushAnonymousUpdatesToPeopleDb + " - Adding flush in " + this.mFlushInterval);
                    if (this.mFlushInterval >= 0) {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 2;
                        messageObtain.obj = token;
                        messageObtain.arg1 = 1;
                        sendMessageDelayed(messageObtain, this.mFlushInterval);
                    }
                } catch (RuntimeException e10) {
                    MPLog.e(AnalyticsMessages.LOGTAG, "Worker threw an unhandled exception", e10);
                    synchronized (Worker.this.mHandlerLock) {
                        Worker.this.mHandler = null;
                        try {
                            Looper.myLooper().quit();
                            MPLog.e(AnalyticsMessages.LOGTAG, "Mixpanel will not process any more analytics messages", e10);
                        } catch (Exception e11) {
                            MPLog.e(AnalyticsMessages.LOGTAG, "Could not halt looper", e11);
                        }
                    }
                }
            }

            protected long getTrackEngageRetryAfter() {
                return this.mTrackEngageRetryAfter;
            }

            private void sendAllData(MPDbAdapter mPDbAdapter, String str) throws Throwable {
                if (!AnalyticsMessages.this.getPoster().isOnline(AnalyticsMessages.this.mContext, AnalyticsMessages.this.mConfig.getOfflineMode())) {
                    AnalyticsMessages.this.logAboutMessageToMixpanel("Not flushing data to Mixpanel because the device is not connected to the internet.");
                    return;
                }
                sendData(mPDbAdapter, str, MPDbAdapter.Table.EVENTS, AnalyticsMessages.this.mConfig.getEventsEndpoint());
                sendData(mPDbAdapter, str, MPDbAdapter.Table.PEOPLE, AnalyticsMessages.this.mConfig.getPeopleEndpoint());
                sendData(mPDbAdapter, str, MPDbAdapter.Table.GROUPS, AnalyticsMessages.this.mConfig.getGroupsEndpoint());
            }

            private void sendData(MPDbAdapter mPDbAdapter, String str, MPDbAdapter.Table table, String str2) throws Throwable {
                RemoteService poster = AnalyticsMessages.this.getPoster();
                String[] strArrGenerateDataString = mPDbAdapter.generateDataString(table, str);
                int i = 0;
                Integer numValueOf = 0;
                if (strArrGenerateDataString != null) {
                    numValueOf = Integer.valueOf(strArrGenerateDataString[2]);
                }
                while (strArrGenerateDataString != null && numValueOf.intValue() > 0) {
                    String str3 = strArrGenerateDataString[i];
                    String str4 = strArrGenerateDataString[1];
                    String strEncodeString = Base64Coder.encodeString(str4);
                    HashMap map = new HashMap();
                    map.put("data", strEncodeString);
                    if (MPConfig.DEBUG) {
                        map.put("verbose", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    }
                    try {
                        try {
                            byte[] bArrPerformRequest = poster.performRequest(str2, map, AnalyticsMessages.this.mConfig.getSSLSocketFactory());
                            if (bArrPerformRequest == null) {
                                try {
                                    AnalyticsMessages.this.logAboutMessageToMixpanel("Response was null, unexpected failure posting to " + str2 + ".");
                                } catch (OutOfMemoryError e) {
                                    e = e;
                                    MPLog.e(AnalyticsMessages.LOGTAG, "Out of memory when posting to " + str2 + ".", e);
                                } catch (MalformedURLException e7) {
                                    e = e7;
                                    MPLog.e(AnalyticsMessages.LOGTAG, "Cannot interpret " + str2 + " as a URL.", e);
                                }
                            } else {
                                try {
                                    String str5 = new String(bArrPerformRequest, "UTF-8");
                                    if (this.mFailedRetries > 0) {
                                        this.mFailedRetries = i;
                                        removeMessages(2, str);
                                    }
                                    AnalyticsMessages.this.logAboutMessageToMixpanel("Successfully posted to " + str2 + ": \n" + str4);
                                    AnalyticsMessages analyticsMessages = AnalyticsMessages.this;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Response was ");
                                    sb2.append(str5);
                                    analyticsMessages.logAboutMessageToMixpanel(sb2.toString());
                                    i = 1;
                                } catch (UnsupportedEncodingException e10) {
                                    throw new RuntimeException("UTF not supported on this platform?", e10);
                                }
                            }
                        } catch (OutOfMemoryError e11) {
                            e = e11;
                            i = 1;
                        } catch (MalformedURLException e12) {
                            e = e12;
                            i = 1;
                        }
                    } catch (SocketTimeoutException e13) {
                        AnalyticsMessages.this.logAboutMessageToMixpanel("Cannot post message to " + str2 + ".", e13);
                        i = 0;
                    } catch (IOException e14) {
                        AnalyticsMessages.this.logAboutMessageToMixpanel("Cannot post message to " + str2 + ".", e14);
                        i = 0;
                    } catch (RemoteService.ServiceUnavailableException e15) {
                        AnalyticsMessages.this.logAboutMessageToMixpanel("Cannot post message to " + str2 + ".", e15);
                        this.mTrackEngageRetryAfter = (long) (e15.getRetryAfter() * 1000);
                        i = 0;
                    }
                    if (i != 0) {
                        AnalyticsMessages.this.logAboutMessageToMixpanel("Not retrying this batch of events, deleting them from DB.");
                        mPDbAdapter.cleanupEvents(str3, table, str);
                        strArrGenerateDataString = mPDbAdapter.generateDataString(table, str);
                        if (strArrGenerateDataString != null) {
                            numValueOf = Integer.valueOf(strArrGenerateDataString[2]);
                        }
                        i = 0;
                    } else {
                        removeMessages(2, str);
                        long jMax = Math.max(((long) Math.pow(2.0d, this.mFailedRetries)) * 60000, this.mTrackEngageRetryAfter);
                        this.mTrackEngageRetryAfter = jMax;
                        this.mTrackEngageRetryAfter = Math.min(jMax, 600000L);
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 2;
                        messageObtain.obj = str;
                        sendMessageDelayed(messageObtain, this.mTrackEngageRetryAfter);
                        this.mFailedRetries++;
                        AnalyticsMessages.this.logAboutMessageToMixpanel("Retrying this batch of events in " + this.mTrackEngageRetryAfter + " ms");
                        return;
                    }
                }
            }

            private JSONObject getDefaultEventProperties() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mp_lib", "android");
                jSONObject.put("$lib_version", "7.3.1");
                jSONObject.put("$os", EventMetricsAggregator.OS_NAME);
                jSONObject.put("$os_version", Build.VERSION.RELEASE == null ? "UNKNOWN" : Build.VERSION.RELEASE);
                jSONObject.put("$manufacturer", Build.MANUFACTURER == null ? "UNKNOWN" : Build.MANUFACTURER);
                jSONObject.put("$brand", Build.BRAND == null ? "UNKNOWN" : Build.BRAND);
                jSONObject.put("$model", Build.MODEL != null ? Build.MODEL : "UNKNOWN");
                DisplayMetrics displayMetrics = Worker.this.mSystemInformation.getDisplayMetrics();
                jSONObject.put("$screen_dpi", displayMetrics.densityDpi);
                jSONObject.put("$screen_height", displayMetrics.heightPixels);
                jSONObject.put("$screen_width", displayMetrics.widthPixels);
                String appVersionName = Worker.this.mSystemInformation.getAppVersionName();
                if (appVersionName != null) {
                    jSONObject.put("$app_version", appVersionName);
                    jSONObject.put("$app_version_string", appVersionName);
                }
                Integer appVersionCode = Worker.this.mSystemInformation.getAppVersionCode();
                if (appVersionCode != null) {
                    String strValueOf = String.valueOf(appVersionCode);
                    jSONObject.put("$app_release", strValueOf);
                    jSONObject.put("$app_build_number", strValueOf);
                }
                Boolean boolValueOf = Boolean.valueOf(Worker.this.mSystemInformation.hasNFC());
                if (boolValueOf != null) {
                    jSONObject.put("$has_nfc", boolValueOf.booleanValue());
                }
                Boolean boolValueOf2 = Boolean.valueOf(Worker.this.mSystemInformation.hasTelephony());
                if (boolValueOf2 != null) {
                    jSONObject.put("$has_telephone", boolValueOf2.booleanValue());
                }
                String currentNetworkOperator = Worker.this.mSystemInformation.getCurrentNetworkOperator();
                if (currentNetworkOperator != null && !currentNetworkOperator.trim().isEmpty()) {
                    jSONObject.put("$carrier", currentNetworkOperator);
                }
                Boolean boolIsWifiConnected = Worker.this.mSystemInformation.isWifiConnected();
                if (boolIsWifiConnected != null) {
                    jSONObject.put("$wifi", boolIsWifiConnected.booleanValue());
                }
                Boolean boolIsBluetoothEnabled = Worker.this.mSystemInformation.isBluetoothEnabled();
                if (boolIsBluetoothEnabled != null) {
                    jSONObject.put("$bluetooth_enabled", boolIsBluetoothEnabled);
                }
                String bluetoothVersion = Worker.this.mSystemInformation.getBluetoothVersion();
                if (bluetoothVersion != null) {
                    jSONObject.put("$bluetooth_version", bluetoothVersion);
                }
                return jSONObject;
            }

            private JSONObject prepareEventObject(EventDescription eventDescription) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                JSONObject properties = eventDescription.getProperties();
                JSONObject defaultEventProperties = getDefaultEventProperties();
                defaultEventProperties.put(MPDbAdapter.KEY_TOKEN, eventDescription.getToken());
                if (properties != null) {
                    Iterator<String> itKeys = properties.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        defaultEventProperties.put(next, properties.get(next));
                    }
                }
                jSONObject.put("event", eventDescription.getEventName());
                jSONObject.put(SerializableEvent.PROPERTIES_FIELD, defaultEventProperties);
                jSONObject.put("$mp_metadata", eventDescription.getSessionMetadata());
                return jSONObject;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateFlushFrequency() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.mFlushCount;
            long j6 = 1 + j;
            long j7 = this.mLastFlushTime;
            if (j7 > 0) {
                long j9 = ((jCurrentTimeMillis - j7) + (this.mAveFlushFrequency * j)) / j6;
                this.mAveFlushFrequency = j9;
                AnalyticsMessages.this.logAboutMessageToMixpanel("Average send frequency approximately " + (j9 / 1000) + " seconds.");
            }
            this.mLastFlushTime = jCurrentTimeMillis;
            this.mFlushCount = j6;
        }
    }

    public long getTrackEngageRetryAfter() {
        return ((Worker.AnalyticsMessageHandler) this.mWorker.mHandler).getTrackEngageRetryAfter();
    }
}
