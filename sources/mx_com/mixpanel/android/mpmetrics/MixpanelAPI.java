package mx_com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.camera.video.AudioStats;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Future;
import mx_com.mixpanel.android.mpmetrics.AnalyticsMessages;
import mx_com.mixpanel.android.mpmetrics.SharedPreferencesLoader;
import mx_com.mixpanel.android.util.MPLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MixpanelAPI {
    private static final String APP_LINKS_LOGTAG = "MixpanelAPI.AL";
    private static final String ENGAGE_DATE_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ss";
    private static final String LOGTAG = "MixpanelAPI.API";
    public static final String VERSION = "7.3.1";
    private static final Map<String, Map<Context, MixpanelAPI>> sInstanceMap = new HashMap();
    private static final SharedPreferencesLoader sPrefsLoader = new SharedPreferencesLoader();
    private static Future<SharedPreferences> sReferrerPrefs;
    private final MPConfig mConfig;
    private final Context mContext;
    private final Map<String, String> mDeviceInfo;
    private final Map<String, Long> mEventTimings;
    private final Map<String, GroupImpl> mGroups;
    private final AnalyticsMessages mMessages;
    private MixpanelActivityLifecycleCallbacks mMixpanelActivityLifecycleCallbacks;
    private final PeopleImpl mPeople;
    private final PersistentIdentity mPersistentIdentity;
    private final SessionMetadata mSessionMetadata;
    private final String mToken;
    private final Boolean mTrackAutomaticEvents;

    public interface Group {
        void deleteGroup();

        void remove(String str, Object obj);

        void set(String str, Object obj);

        void set(JSONObject jSONObject);

        void setMap(Map<String, Object> map);

        void setOnce(String str, Object obj);

        void setOnce(JSONObject jSONObject);

        void setOnceMap(Map<String, Object> map);

        void union(String str, JSONArray jSONArray);

        void unset(String str);
    }

    interface InstanceProcessor {
        void process(MixpanelAPI mixpanelAPI);
    }

    public interface People {
        void append(String str, Object obj);

        void clearCharges();

        void deleteUser();

        @Deprecated
        String getDistinctId();

        @Deprecated
        void identify(String str);

        void increment(String str, double d10);

        void increment(Map<String, ? extends Number> map);

        boolean isIdentified();

        void merge(String str, JSONObject jSONObject);

        void remove(String str, Object obj);

        void set(String str, Object obj);

        void set(JSONObject jSONObject);

        void setMap(Map<String, Object> map);

        void setOnce(String str, Object obj);

        void setOnce(JSONObject jSONObject);

        void setOnceMap(Map<String, Object> map);

        void trackCharge(double d10, JSONObject jSONObject);

        void union(String str, JSONArray jSONArray);

        void unset(String str);

        People withIdentity(String str);
    }

    MixpanelAPI(Context context, Future<SharedPreferences> future, String str, boolean z4, JSONObject jSONObject, boolean z5) {
        this(context, future, str, MPConfig.getInstance(context), z4, jSONObject, null, z5);
    }

    MixpanelAPI(Context context, Future<SharedPreferences> future, String str, boolean z4, JSONObject jSONObject, String str2, boolean z5) {
        this(context, future, str, MPConfig.getInstance(context), z4, jSONObject, str2, z5);
    }

    MixpanelAPI(Context context, Future<SharedPreferences> future, String str, MPConfig mPConfig, boolean z4, JSONObject jSONObject, String str2, boolean z5) {
        this.mContext = context;
        this.mToken = str;
        this.mPeople = new PeopleImpl();
        this.mGroups = new HashMap();
        this.mConfig = mPConfig;
        this.mTrackAutomaticEvents = Boolean.valueOf(z5);
        HashMap map = new HashMap();
        map.put("$android_lib_version", "7.3.1");
        map.put("$android_os", EventMetricsAggregator.OS_NAME);
        map.put("$android_os_version", Build.VERSION.RELEASE == null ? "UNKNOWN" : Build.VERSION.RELEASE);
        map.put("$android_manufacturer", Build.MANUFACTURER == null ? "UNKNOWN" : Build.MANUFACTURER);
        map.put("$android_brand", Build.BRAND == null ? "UNKNOWN" : Build.BRAND);
        map.put("$android_model", Build.MODEL != null ? Build.MODEL : "UNKNOWN");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            map.put("$android_app_version", packageInfo.versionName);
            map.put("$android_app_version_code", Integer.toString(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException e) {
            MPLog.e(LOGTAG, "Exception getting app version name", e);
        }
        this.mDeviceInfo = Collections.unmodifiableMap(map);
        this.mSessionMetadata = new SessionMetadata();
        this.mMessages = getAnalyticsMessages();
        PersistentIdentity persistentIdentity = getPersistentIdentity(context, future, str, str2);
        this.mPersistentIdentity = persistentIdentity;
        this.mEventTimings = persistentIdentity.getTimeEvents();
        if (z4 && (hasOptedOutTracking() || !persistentIdentity.hasOptOutFlag(str))) {
            optOutTracking();
        }
        if (jSONObject != null) {
            registerSuperProperties(jSONObject);
        }
        boolean zExists = MPDbAdapter.getInstance(this.mContext).getDatabaseFile().exists();
        registerMixpanelActivityLifecycleCallbacks();
        if (persistentIdentity.isFirstLaunch(zExists, this.mToken) && this.mTrackAutomaticEvents.booleanValue()) {
            track(AutomaticEvents.FIRST_OPEN, null, true);
            persistentIdentity.setHasLaunched(this.mToken);
        }
        if (sendAppOpen() && this.mTrackAutomaticEvents.booleanValue()) {
            track("$app_open", null);
        }
        if (!persistentIdentity.isFirstIntegration(this.mToken)) {
            try {
                sendHttpEvent("Integration", "85053bf24bba75239b16a601d9387e17", str, null, false);
                persistentIdentity.setIsIntegrated(this.mToken);
            } catch (JSONException unused) {
            }
        }
        if (this.mPersistentIdentity.isNewVersion((String) map.get("$android_app_version_code")) && this.mTrackAutomaticEvents.booleanValue()) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(AutomaticEvents.VERSION_UPDATED, map.get("$android_app_version"));
                track(AutomaticEvents.APP_UPDATED, jSONObject2, true);
            } catch (JSONException unused2) {
            }
        }
        if (!this.mConfig.getDisableExceptionHandler()) {
            ExceptionHandler.init();
        }
        if (this.mConfig.getRemoveLegacyResidualFiles()) {
            this.mMessages.removeResidualImageFiles(new File(this.mContext.getApplicationInfo().dataDir));
        }
    }

    private void sendHttpEvent(String str, String str2, String str3, JSONObject jSONObject, boolean z4) throws JSONException {
        String str4;
        String str5;
        JSONObject superProperties = getSuperProperties();
        String str6 = null;
        if (superProperties != null) {
            try {
                str4 = (String) superProperties.get("mp_lib");
                try {
                    str5 = (String) superProperties.get("$lib_version");
                    str6 = str4;
                } catch (JSONException unused) {
                }
            } catch (JSONException unused2) {
                str4 = null;
            }
        } else {
            str5 = null;
        }
        str4 = str6;
        str6 = str5;
        JSONObject jSONObject2 = new JSONObject();
        if (str4 == null) {
            str4 = EventMetricsAggregator.OS_NAME;
        }
        jSONObject2.put("mp_lib", str4);
        jSONObject2.put("distinct_id", str3);
        if (str6 == null) {
            str6 = "7.3.1";
        }
        jSONObject2.put("$lib_version", str6);
        jSONObject2.put("Project Token", str3);
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObject.get(next));
            }
        }
        this.mMessages.eventsMessage(new AnalyticsMessages.EventDescription(str, jSONObject2, str2));
        if (z4) {
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(str, 1);
            jSONObject3.put("$add", jSONObject4);
            jSONObject3.put("$token", str2);
            jSONObject3.put("$distinct_id", str3);
            this.mMessages.peopleMessage(new AnalyticsMessages.PeopleDescription(jSONObject3, str2));
        }
        this.mMessages.postToServer(new AnalyticsMessages.MixpanelDescription(str2));
    }

    public static MixpanelAPI getInstance(Context context, String str, boolean z4) {
        return getInstance(context, str, false, null, null, z4);
    }

    public static MixpanelAPI getInstance(Context context, String str, String str2, boolean z4) {
        return getInstance(context, str, false, null, str2, z4);
    }

    public static MixpanelAPI getInstance(Context context, String str, boolean z4, boolean z5) {
        return getInstance(context, str, z4, null, null, z5);
    }

    public static MixpanelAPI getInstance(Context context, String str, boolean z4, String str2, boolean z5) {
        return getInstance(context, str, z4, null, str2, z5);
    }

    public static MixpanelAPI getInstance(Context context, String str, JSONObject jSONObject, boolean z4) {
        return getInstance(context, str, false, jSONObject, null, z4);
    }

    public static MixpanelAPI getInstance(Context context, String str, JSONObject jSONObject, String str2, boolean z4) {
        return getInstance(context, str, false, jSONObject, str2, z4);
    }

    public static MixpanelAPI getInstance(Context context, String str, boolean z4, JSONObject jSONObject, String str2, boolean z5) {
        MixpanelAPI mixpanelAPI;
        if (str == null || context == null) {
            return null;
        }
        Map<String, Map<Context, MixpanelAPI>> map = sInstanceMap;
        synchronized (map) {
            Context applicationContext = context.getApplicationContext();
            if (sReferrerPrefs == null) {
                sReferrerPrefs = sPrefsLoader.loadPreferences(context, "mx_com.mixpanel.android.mpmetrics.ReferralInfo", null);
            }
            String str3 = str2 != null ? str2 : str;
            Map<Context, MixpanelAPI> map2 = map.get(str3);
            if (map2 == null) {
                map2 = new HashMap<>();
                map.put(str3, map2);
            }
            Map<Context, MixpanelAPI> map3 = map2;
            mixpanelAPI = map3.get(applicationContext);
            if (mixpanelAPI == null && ConfigurationChecker.checkBasicConfiguration(applicationContext)) {
                MixpanelAPI mixpanelAPI2 = new MixpanelAPI(applicationContext, sReferrerPrefs, str, z4, jSONObject, str2, z5);
                registerAppLinksListeners(context, mixpanelAPI2);
                map3.put(applicationContext, mixpanelAPI2);
                mixpanelAPI = mixpanelAPI2;
            }
            checkIntentForInboundAppLink(context);
        }
        return mixpanelAPI;
    }

    public void setUseIpAddressForGeolocation(boolean z4) {
        this.mConfig.setUseIpAddressForGeolocation(z4);
    }

    public void setEnableLogging(boolean z4) {
        this.mConfig.setEnableLogging(z4);
    }

    public void setFlushBatchSize(int i) {
        this.mConfig.setFlushBatchSize(i);
    }

    public int getFlushBatchSize() {
        return this.mConfig.getFlushBatchSize();
    }

    public void setMaximumDatabaseLimit(int i) {
        this.mConfig.setMaximumDatabaseLimit(i);
    }

    public int getMaximumDatabaseLimit() {
        return this.mConfig.getMaximumDatabaseLimit();
    }

    public void setServerURL(String str) {
        this.mConfig.setServerURL(str);
    }

    public Boolean getTrackAutomaticEvents() {
        return this.mTrackAutomaticEvents;
    }

    public void alias(String str, String str2) {
        if (hasOptedOutTracking()) {
            return;
        }
        if (str2 == null) {
            str2 = getDistinctId();
        }
        if (str.equals(str2)) {
            MPLog.w(LOGTAG, "Attempted to alias identical distinct_ids " + str + ". Alias message will not be sent.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("alias", str);
            jSONObject.put("distinct_id", str2);
            track("$create_alias", jSONObject);
        } catch (JSONException e) {
            MPLog.e(LOGTAG, "Failed to alias", e);
        }
        flush();
    }

    public void identify(String str) {
        identify(str, true);
    }

    public void identify(String str, boolean z4) {
        if (hasOptedOutTracking()) {
            return;
        }
        if (str == null) {
            MPLog.e(LOGTAG, "Can't identify with null distinct_id.");
            return;
        }
        synchronized (this.mPersistentIdentity) {
            String eventsDistinctId = this.mPersistentIdentity.getEventsDistinctId();
            if (!str.equals(eventsDistinctId)) {
                if (str.startsWith("$device:")) {
                    MPLog.e(LOGTAG, "Can't identify with '$device:' distinct_id.");
                    return;
                }
                this.mPersistentIdentity.setEventsDistinctId(str);
                this.mPersistentIdentity.setAnonymousIdIfAbsent(eventsDistinctId);
                this.mPersistentIdentity.markEventsUserIdPresent();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("$anon_distinct_id", eventsDistinctId);
                    track("$identify", jSONObject);
                } catch (JSONException unused) {
                    MPLog.e(LOGTAG, "Could not track $identify event");
                }
            }
            if (z4) {
                this.mPeople.identify_people(str);
            }
        }
    }

    public void timeEvent(String str) {
        if (hasOptedOutTracking()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.mEventTimings) {
            this.mEventTimings.put(str, Long.valueOf(jCurrentTimeMillis));
            this.mPersistentIdentity.addTimeEvent(str, Long.valueOf(jCurrentTimeMillis));
        }
    }

    public void clearTimedEvents() {
        synchronized (this.mEventTimings) {
            this.mEventTimings.clear();
            this.mPersistentIdentity.clearTimedEvents();
        }
    }

    public void clearTimedEvent(String str) {
        synchronized (this.mEventTimings) {
            this.mEventTimings.remove(str);
            this.mPersistentIdentity.removeTimedEvent(str);
        }
    }

    public double eventElapsedTime(String str) {
        Long l6;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.mEventTimings) {
            l6 = this.mEventTimings.get(str);
        }
        return l6 == null ? AudioStats.AUDIO_AMPLITUDE_NONE : (jCurrentTimeMillis - l6.longValue()) / 1000;
    }

    public void trackMap(String str, Map<String, Object> map) {
        if (hasOptedOutTracking()) {
            return;
        }
        if (map == null) {
            track(str, null);
            return;
        }
        try {
            track(str, new JSONObject(map));
        } catch (NullPointerException unused) {
            MPLog.w(LOGTAG, "Can't have null keys in the properties of trackMap!");
        }
    }

    public void trackWithGroups(String str, Map<String, Object> map, Map<String, Object> map2) {
        if (hasOptedOutTracking()) {
            return;
        }
        if (map2 == null) {
            trackMap(str, map);
            return;
        }
        if (map == null) {
            trackMap(str, map2);
            return;
        }
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            if (entry.getValue() != null) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        trackMap(str, map);
    }

    public void track(String str, JSONObject jSONObject) {
        if (hasOptedOutTracking()) {
            return;
        }
        track(str, jSONObject, false);
    }

    public void track(String str) {
        if (hasOptedOutTracking()) {
            return;
        }
        track(str, null);
    }

    public void flush() {
        if (hasOptedOutTracking()) {
            return;
        }
        this.mMessages.postToServer(new AnalyticsMessages.MixpanelDescription(this.mToken));
    }

    public JSONObject getSuperProperties() {
        JSONObject jSONObject = new JSONObject();
        this.mPersistentIdentity.addSuperPropertiesToObject(jSONObject);
        return jSONObject;
    }

    public String getDistinctId() {
        return this.mPersistentIdentity.getEventsDistinctId();
    }

    public String getAnonymousId() {
        return this.mPersistentIdentity.getAnonymousId();
    }

    protected String getUserId() {
        return this.mPersistentIdentity.getEventsUserId();
    }

    public void registerSuperPropertiesMap(Map<String, Object> map) {
        if (hasOptedOutTracking()) {
            return;
        }
        if (map == null) {
            MPLog.e(LOGTAG, "registerSuperPropertiesMap does not accept null properties");
            return;
        }
        try {
            registerSuperProperties(new JSONObject(map));
        } catch (NullPointerException unused) {
            MPLog.w(LOGTAG, "Can't have null keys in the properties of registerSuperPropertiesMap");
        }
    }

    public void registerSuperProperties(JSONObject jSONObject) {
        if (hasOptedOutTracking()) {
            return;
        }
        this.mPersistentIdentity.registerSuperProperties(jSONObject);
    }

    public void unregisterSuperProperty(String str) {
        if (hasOptedOutTracking()) {
            return;
        }
        this.mPersistentIdentity.unregisterSuperProperty(str);
    }

    public void registerSuperPropertiesOnceMap(Map<String, Object> map) {
        if (hasOptedOutTracking()) {
            return;
        }
        if (map == null) {
            MPLog.e(LOGTAG, "registerSuperPropertiesOnceMap does not accept null properties");
            return;
        }
        try {
            registerSuperPropertiesOnce(new JSONObject(map));
        } catch (NullPointerException unused) {
            MPLog.w(LOGTAG, "Can't have null keys in the properties of registerSuperPropertiesOnce!");
        }
    }

    public void registerSuperPropertiesOnce(JSONObject jSONObject) {
        if (hasOptedOutTracking()) {
            return;
        }
        this.mPersistentIdentity.registerSuperPropertiesOnce(jSONObject);
    }

    public void clearSuperProperties() {
        this.mPersistentIdentity.clearSuperProperties();
    }

    public void updateSuperProperties(SuperPropertyUpdate superPropertyUpdate) {
        if (hasOptedOutTracking()) {
            return;
        }
        this.mPersistentIdentity.updateSuperProperties(superPropertyUpdate);
    }

    public void setGroup(String str, Object obj) {
        if (hasOptedOutTracking()) {
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(obj);
        setGroup(str, (List<Object>) arrayList);
    }

    public void setGroup(String str, List<Object> list) {
        if (hasOptedOutTracking()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj == null) {
                MPLog.w(LOGTAG, "groupID must be non-null");
            } else {
                jSONArray.put(obj);
            }
        }
        try {
            registerSuperProperties(new JSONObject().put(str, jSONArray));
            this.mPeople.set(str, jSONArray);
        } catch (JSONException unused) {
            MPLog.w(LOGTAG, "groupKey must be non-null");
        }
    }

    public void addGroup(final String str, final Object obj) {
        if (hasOptedOutTracking()) {
            return;
        }
        updateSuperProperties(new SuperPropertyUpdate() { // from class: mx_com.mixpanel.android.mpmetrics.MixpanelAPI.1
            @Override // mx_com.mixpanel.android.mpmetrics.SuperPropertyUpdate
            public JSONObject update(JSONObject jSONObject) {
                try {
                    jSONObject.accumulate(str, obj);
                } catch (JSONException e) {
                    MPLog.e(MixpanelAPI.LOGTAG, "Failed to add groups superProperty", e);
                }
                return jSONObject;
            }
        });
        this.mPeople.union(str, new JSONArray().put(obj));
    }

    public void removeGroup(final String str, final Object obj) {
        if (hasOptedOutTracking()) {
            return;
        }
        updateSuperProperties(new SuperPropertyUpdate() { // from class: mx_com.mixpanel.android.mpmetrics.MixpanelAPI.2
            @Override // mx_com.mixpanel.android.mpmetrics.SuperPropertyUpdate
            public JSONObject update(JSONObject jSONObject) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                    JSONArray jSONArray2 = new JSONArray();
                    if (jSONArray.length() <= 1) {
                        jSONObject.remove(str);
                        MixpanelAPI.this.mPeople.unset(str);
                    } else {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            if (!jSONArray.get(i).equals(obj)) {
                                jSONArray2.put(jSONArray.get(i));
                            }
                        }
                        jSONObject.put(str, jSONArray2);
                        MixpanelAPI.this.mPeople.remove(str, obj);
                    }
                } catch (JSONException unused) {
                    jSONObject.remove(str);
                    MixpanelAPI.this.mPeople.unset(str);
                }
                return jSONObject;
            }
        });
    }

    public People getPeople() {
        return this.mPeople;
    }

    public Group getGroup(String str, Object obj) {
        String strMakeMapKey = makeMapKey(str, obj);
        GroupImpl groupImpl = this.mGroups.get(strMakeMapKey);
        if (groupImpl == null) {
            groupImpl = new GroupImpl(str, obj);
            this.mGroups.put(strMakeMapKey, groupImpl);
        }
        if (groupImpl.mGroupKey.equals(str) && groupImpl.mGroupID.equals(obj)) {
            return groupImpl;
        }
        MPLog.i(LOGTAG, "groups map key collision " + strMakeMapKey);
        GroupImpl groupImpl2 = new GroupImpl(str, obj);
        this.mGroups.put(strMakeMapKey, groupImpl2);
        return groupImpl2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String makeMapKey(String str, Object obj) {
        return str + '_' + obj;
    }

    public void reset() {
        this.mPersistentIdentity.clearPreferences();
        getAnalyticsMessages().clearAnonymousUpdatesMessage(new AnalyticsMessages.MixpanelDescription(this.mToken));
        identify(getDistinctId(), false);
        flush();
    }

    public Map<String, String> getDeviceInfo() {
        return this.mDeviceInfo;
    }

    public void optOutTracking() {
        getAnalyticsMessages().emptyTrackingQueues(new AnalyticsMessages.MixpanelDescription(this.mToken));
        if (getPeople().isIdentified()) {
            getPeople().deleteUser();
            getPeople().clearCharges();
        }
        this.mPersistentIdentity.clearPreferences();
        synchronized (this.mEventTimings) {
            this.mEventTimings.clear();
            this.mPersistentIdentity.clearTimedEvents();
        }
        this.mPersistentIdentity.clearReferrerProperties();
        this.mPersistentIdentity.setOptOutTracking(true, this.mToken);
    }

    public void optInTracking() {
        optInTracking(null, null);
    }

    public void optInTracking(String str) {
        optInTracking(str, null);
    }

    public void optInTracking(String str, JSONObject jSONObject) {
        this.mPersistentIdentity.setOptOutTracking(false, this.mToken);
        if (str != null) {
            identify(str);
        }
        track("$opt_in", jSONObject);
    }

    public boolean hasOptedOutTracking() {
        return this.mPersistentIdentity.getOptOutTracking(this.mToken);
    }

    void registerMixpanelActivityLifecycleCallbacks() {
        if (Build.VERSION.SDK_INT >= 14) {
            if (this.mContext.getApplicationContext() instanceof Application) {
                Application application = (Application) this.mContext.getApplicationContext();
                MixpanelActivityLifecycleCallbacks mixpanelActivityLifecycleCallbacks = new MixpanelActivityLifecycleCallbacks(this, this.mConfig);
                this.mMixpanelActivityLifecycleCallbacks = mixpanelActivityLifecycleCallbacks;
                application.registerActivityLifecycleCallbacks(mixpanelActivityLifecycleCallbacks);
                return;
            }
            MPLog.i(LOGTAG, "Context is not an Application, Mixpanel won't be able to automatically flush on an app background.");
        }
    }

    public boolean isAppInForeground() {
        if (Build.VERSION.SDK_INT >= 14) {
            MixpanelActivityLifecycleCallbacks mixpanelActivityLifecycleCallbacks = this.mMixpanelActivityLifecycleCallbacks;
            if (mixpanelActivityLifecycleCallbacks != null) {
                return mixpanelActivityLifecycleCallbacks.isInForeground();
            }
            return false;
        }
        MPLog.e(LOGTAG, "Your build version is below 14. This method will always return false.");
        return false;
    }

    void onBackground() {
        if (this.mConfig.getFlushOnBackground()) {
            flush();
        }
    }

    void onForeground() {
        this.mSessionMetadata.initSession();
    }

    static void allInstances(InstanceProcessor instanceProcessor) {
        Map<String, Map<Context, MixpanelAPI>> map = sInstanceMap;
        synchronized (map) {
            Iterator<Map<Context, MixpanelAPI>> it = map.values().iterator();
            while (it.hasNext()) {
                Iterator<MixpanelAPI> it2 = it.next().values().iterator();
                while (it2.hasNext()) {
                    instanceProcessor.process(it2.next());
                }
            }
        }
    }

    AnalyticsMessages getAnalyticsMessages() {
        return AnalyticsMessages.getInstance(this.mContext);
    }

    PersistentIdentity getPersistentIdentity(Context context, Future<SharedPreferences> future, String str) {
        return getPersistentIdentity(context, future, str, null);
    }

    PersistentIdentity getPersistentIdentity(Context context, Future<SharedPreferences> future, String str, String str2) {
        SharedPreferencesLoader.OnPrefsLoadedListener onPrefsLoadedListener = new SharedPreferencesLoader.OnPrefsLoadedListener() { // from class: mx_com.mixpanel.android.mpmetrics.MixpanelAPI.3
            @Override // mx_com.mixpanel.android.mpmetrics.SharedPreferencesLoader.OnPrefsLoadedListener
            public void onPrefsLoaded(SharedPreferences sharedPreferences) {
                String peopleDistinctId = PersistentIdentity.getPeopleDistinctId(sharedPreferences);
                if (peopleDistinctId != null) {
                    MixpanelAPI.this.pushWaitingPeopleRecord(peopleDistinctId);
                }
            }
        };
        if (str2 != null) {
            str = str2;
        }
        SharedPreferencesLoader sharedPreferencesLoader = sPrefsLoader;
        return new PersistentIdentity(future, sharedPreferencesLoader.loadPreferences(context, "mx_com.mixpanel.android.mpmetrics.MixpanelAPI_" + str, onPrefsLoadedListener), sharedPreferencesLoader.loadPreferences(context, "mx_com.mixpanel.android.mpmetrics.MixpanelAPI.TimeEvents_" + str, null), sharedPreferencesLoader.loadPreferences(context, "mx_com.mixpanel.android.mpmetrics.Mixpanel", null));
    }

    boolean sendAppOpen() {
        return !this.mConfig.getDisableAppOpenEvent();
    }

    private class PeopleImpl implements People {
        private PeopleImpl() {
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void identify(String str) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            MPLog.w(MixpanelAPI.LOGTAG, "People.identify() is deprecated and calling it is no longer necessary, please use MixpanelAPI.identify() and set 'usePeople' to true instead");
            if (str != null) {
                if (!str.equals(MixpanelAPI.this.mPersistentIdentity.getEventsDistinctId())) {
                    MPLog.w(MixpanelAPI.LOGTAG, "Identifying with a distinct_id different from the one being set by MixpanelAPI.identify() is not supported.");
                    return;
                } else {
                    identify_people(str);
                    return;
                }
            }
            MPLog.e(MixpanelAPI.LOGTAG, "Can't identify with null distinct_id.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void identify_people(String str) {
            synchronized (MixpanelAPI.this.mPersistentIdentity) {
                MixpanelAPI.this.mPersistentIdentity.setPeopleDistinctId(str);
            }
            MixpanelAPI.this.pushWaitingPeopleRecord(str);
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void setMap(Map<String, Object> map) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            if (map == null) {
                MPLog.e(MixpanelAPI.LOGTAG, "setMap does not accept null properties");
                return;
            }
            try {
                set(new JSONObject(map));
            } catch (NullPointerException unused) {
                MPLog.w(MixpanelAPI.LOGTAG, "Can't have null keys in the properties of setMap!");
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void set(JSONObject jSONObject) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(MixpanelAPI.this.mDeviceInfo);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
                MixpanelAPI.this.recordPeopleMessage(stdPeopleMessage("$set", jSONObject2));
            } catch (JSONException e) {
                MPLog.e(MixpanelAPI.LOGTAG, "Exception setting people properties", e);
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void set(String str, Object obj) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                set(new JSONObject().put(str, obj));
            } catch (JSONException e) {
                MPLog.e(MixpanelAPI.LOGTAG, "set", e);
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void setOnceMap(Map<String, Object> map) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            if (map == null) {
                MPLog.e(MixpanelAPI.LOGTAG, "setOnceMap does not accept null properties");
                return;
            }
            try {
                setOnce(new JSONObject(map));
            } catch (NullPointerException unused) {
                MPLog.w(MixpanelAPI.LOGTAG, "Can't have null keys in the properties setOnceMap!");
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void setOnce(JSONObject jSONObject) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                MixpanelAPI.this.recordPeopleMessage(stdPeopleMessage("$set_once", jSONObject));
            } catch (JSONException unused) {
                MPLog.e(MixpanelAPI.LOGTAG, "Exception setting people properties");
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void setOnce(String str, Object obj) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                setOnce(new JSONObject().put(str, obj));
            } catch (JSONException e) {
                MPLog.e(MixpanelAPI.LOGTAG, "set", e);
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void increment(Map<String, ? extends Number> map) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                MixpanelAPI.this.recordPeopleMessage(stdPeopleMessage("$add", new JSONObject(map)));
            } catch (JSONException e) {
                MPLog.e(MixpanelAPI.LOGTAG, "Exception incrementing properties", e);
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void merge(String str, JSONObject jSONObject) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(str, jSONObject);
                MixpanelAPI.this.recordPeopleMessage(stdPeopleMessage("$merge", jSONObject2));
            } catch (JSONException e) {
                MPLog.e(MixpanelAPI.LOGTAG, "Exception merging a property", e);
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void increment(String str, double d10) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            HashMap map = new HashMap();
            map.put(str, Double.valueOf(d10));
            increment(map);
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void append(String str, Object obj) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, obj);
                MixpanelAPI.this.recordPeopleMessage(stdPeopleMessage("$append", jSONObject));
            } catch (JSONException e) {
                MPLog.e(MixpanelAPI.LOGTAG, "Exception appending a property", e);
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void union(String str, JSONArray jSONArray) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, jSONArray);
                MixpanelAPI.this.recordPeopleMessage(stdPeopleMessage("$union", jSONObject));
            } catch (JSONException unused) {
                MPLog.e(MixpanelAPI.LOGTAG, "Exception unioning a property");
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void remove(String str, Object obj) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, obj);
                MixpanelAPI.this.recordPeopleMessage(stdPeopleMessage("$remove", jSONObject));
            } catch (JSONException e) {
                MPLog.e(MixpanelAPI.LOGTAG, "Exception appending a property", e);
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void unset(String str) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(str);
                MixpanelAPI.this.recordPeopleMessage(stdPeopleMessage("$unset", jSONArray));
            } catch (JSONException e) {
                MPLog.e(MixpanelAPI.LOGTAG, "Exception unsetting a property", e);
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void trackCharge(double d10, JSONObject jSONObject) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(MixpanelAPI.ENGAGE_DATE_FORMAT_STRING, Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("$amount", d10);
                jSONObject2.put("$time", simpleDateFormat.format(date));
                if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObject.get(next));
                    }
                }
                append("$transactions", jSONObject2);
            } catch (JSONException e) {
                MPLog.e(MixpanelAPI.LOGTAG, "Exception creating new charge", e);
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void clearCharges() {
            unset("$transactions");
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void deleteUser() {
            try {
                MixpanelAPI.this.recordPeopleMessage(stdPeopleMessage("$delete", JSONObject.NULL));
            } catch (JSONException unused) {
                MPLog.e(MixpanelAPI.LOGTAG, "Exception deleting a user");
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public String getDistinctId() {
            return MixpanelAPI.this.mPersistentIdentity.getPeopleDistinctId();
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public People withIdentity(final String str) {
            if (str == null) {
                return null;
            }
            return new PeopleImpl() { // from class: mx_com.mixpanel.android.mpmetrics.MixpanelAPI.PeopleImpl.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.PeopleImpl, mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
                public String getDistinctId() {
                    return str;
                }

                @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.PeopleImpl, mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
                public void identify(String str2) {
                    throw new RuntimeException("This MixpanelPeople object has a fixed, constant distinctId");
                }
            };
        }

        private JSONObject stdPeopleMessage(String str, Object obj) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            String distinctId = getDistinctId();
            String anonymousId = MixpanelAPI.this.getAnonymousId();
            jSONObject.put(str, obj);
            jSONObject.put("$token", MixpanelAPI.this.mToken);
            jSONObject.put("$time", System.currentTimeMillis());
            jSONObject.put("$had_persisted_distinct_id", MixpanelAPI.this.mPersistentIdentity.getHadPersistedDistinctId());
            if (anonymousId != null) {
                jSONObject.put("$device_id", anonymousId);
            }
            if (distinctId != null) {
                jSONObject.put("$distinct_id", distinctId);
                jSONObject.put("$user_id", distinctId);
            }
            jSONObject.put("$mp_metadata", MixpanelAPI.this.mSessionMetadata.getMetadataForPeople());
            return jSONObject;
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public boolean isIdentified() {
            return getDistinctId() != null;
        }
    }

    private class GroupImpl implements Group {
        private final Object mGroupID;
        private final String mGroupKey;

        public GroupImpl(String str, Object obj) {
            this.mGroupKey = str;
            this.mGroupID = obj;
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.Group
        public void setMap(Map<String, Object> map) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            if (map == null) {
                MPLog.e(MixpanelAPI.LOGTAG, "setMap does not accept null properties");
            } else {
                set(new JSONObject(map));
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.Group
        public void set(JSONObject jSONObject) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
                MixpanelAPI.this.recordGroupMessage(stdGroupMessage("$set", jSONObject2));
            } catch (JSONException e) {
                MPLog.e(MixpanelAPI.LOGTAG, "Exception setting group properties", e);
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.Group
        public void set(String str, Object obj) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                set(new JSONObject().put(str, obj));
            } catch (JSONException e) {
                MPLog.e(MixpanelAPI.LOGTAG, "set", e);
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.Group
        public void setOnceMap(Map<String, Object> map) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            if (map == null) {
                MPLog.e(MixpanelAPI.LOGTAG, "setOnceMap does not accept null properties");
                return;
            }
            try {
                setOnce(new JSONObject(map));
            } catch (NullPointerException unused) {
                MPLog.w(MixpanelAPI.LOGTAG, "Can't have null keys in the properties for setOnceMap!");
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.Group
        public void setOnce(JSONObject jSONObject) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                MixpanelAPI.this.recordGroupMessage(stdGroupMessage("$set_once", jSONObject));
            } catch (JSONException unused) {
                MPLog.e(MixpanelAPI.LOGTAG, "Exception setting group properties");
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.Group
        public void setOnce(String str, Object obj) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                setOnce(new JSONObject().put(str, obj));
            } catch (JSONException e) {
                MPLog.e(MixpanelAPI.LOGTAG, "Property name cannot be null", e);
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.Group
        public void union(String str, JSONArray jSONArray) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, jSONArray);
                MixpanelAPI.this.recordGroupMessage(stdGroupMessage("$union", jSONObject));
            } catch (JSONException e) {
                MPLog.e(MixpanelAPI.LOGTAG, "Exception unioning a property", e);
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.Group
        public void remove(String str, Object obj) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, obj);
                MixpanelAPI.this.recordGroupMessage(stdGroupMessage("$remove", jSONObject));
            } catch (JSONException e) {
                MPLog.e(MixpanelAPI.LOGTAG, "Exception removing a property", e);
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.Group
        public void unset(String str) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(str);
                MixpanelAPI.this.recordGroupMessage(stdGroupMessage("$unset", jSONArray));
            } catch (JSONException e) {
                MPLog.e(MixpanelAPI.LOGTAG, "Exception unsetting a property", e);
            }
        }

        @Override // mx_com.mixpanel.android.mpmetrics.MixpanelAPI.Group
        public void deleteGroup() {
            try {
                MixpanelAPI.this.recordGroupMessage(stdGroupMessage("$delete", JSONObject.NULL));
                MixpanelAPI.this.mGroups.remove(MixpanelAPI.this.makeMapKey(this.mGroupKey, this.mGroupID));
            } catch (JSONException e) {
                MPLog.e(MixpanelAPI.LOGTAG, "Exception deleting a group", e);
            }
        }

        private JSONObject stdGroupMessage(String str, Object obj) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            jSONObject.put("$token", MixpanelAPI.this.mToken);
            jSONObject.put("$time", System.currentTimeMillis());
            jSONObject.put("$group_key", this.mGroupKey);
            jSONObject.put("$group_id", this.mGroupID);
            jSONObject.put("$mp_metadata", MixpanelAPI.this.mSessionMetadata.getMetadataForPeople());
            return jSONObject;
        }
    }

    protected void track(String str, JSONObject jSONObject, boolean z4) {
        Long l6;
        if (hasOptedOutTracking()) {
            return;
        }
        if (!z4 || this.mTrackAutomaticEvents.booleanValue()) {
            synchronized (this.mEventTimings) {
                l6 = this.mEventTimings.get(str);
                this.mEventTimings.remove(str);
                this.mPersistentIdentity.removeTimedEvent(str);
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, String> entry : this.mPersistentIdentity.getReferrerProperties().entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                this.mPersistentIdentity.addSuperPropertiesToObject(jSONObject2);
                double dCurrentTimeMillis = System.currentTimeMillis();
                Double.isNaN(dCurrentTimeMillis);
                double d10 = dCurrentTimeMillis / 1000.0d;
                String distinctId = getDistinctId();
                String anonymousId = getAnonymousId();
                String userId = getUserId();
                jSONObject2.put("time", System.currentTimeMillis());
                jSONObject2.put("distinct_id", distinctId);
                jSONObject2.put("$had_persisted_distinct_id", this.mPersistentIdentity.getHadPersistedDistinctId());
                if (anonymousId != null) {
                    jSONObject2.put("$device_id", anonymousId);
                }
                if (userId != null) {
                    jSONObject2.put("$user_id", userId);
                }
                if (l6 != null) {
                    double dLongValue = l6.longValue();
                    Double.isNaN(dLongValue);
                    jSONObject2.put("$duration", d10 - (dLongValue / 1000.0d));
                }
                if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                }
                this.mMessages.eventsMessage(new AnalyticsMessages.EventDescription(str, jSONObject2, this.mToken, z4, this.mSessionMetadata.getMetadataForEvent()));
            } catch (JSONException e) {
                MPLog.e(LOGTAG, "Exception tracking event " + str, e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordPeopleMessage(JSONObject jSONObject) {
        if (hasOptedOutTracking()) {
            return;
        }
        this.mMessages.peopleMessage(new AnalyticsMessages.PeopleDescription(jSONObject, this.mToken));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordGroupMessage(JSONObject jSONObject) {
        if (hasOptedOutTracking()) {
            return;
        }
        if (jSONObject.has("$group_key") && jSONObject.has("$group_id")) {
            this.mMessages.groupMessage(new AnalyticsMessages.GroupDescription(jSONObject, this.mToken));
        } else {
            MPLog.e(LOGTAG, "Attempt to update group without key and value--this should not happen.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pushWaitingPeopleRecord(String str) {
        this.mMessages.pushAnonymousPeopleMessage(new AnalyticsMessages.PushAnonymousPeopleDescription(str, this.mToken));
    }

    private static void registerAppLinksListeners(Context context, MixpanelAPI mixpanelAPI) {
        try {
            Class<?> cls = Class.forName("mx_androidx.localbroadcastmanager.content.LocalBroadcastManager");
            cls.getMethod("registerReceiver", BroadcastReceiver.class, IntentFilter.class).invoke(cls.getMethod("getInstance", Context.class).invoke(null, context), new BroadcastReceiver() { // from class: mx_com.mixpanel.android.mpmetrics.MixpanelAPI.4
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    JSONObject jSONObject = new JSONObject();
                    Bundle bundleExtra = intent.getBundleExtra("event_args");
                    if (bundleExtra != null) {
                        for (String str : bundleExtra.keySet()) {
                            try {
                                jSONObject.put(str, bundleExtra.get(str));
                            } catch (JSONException e) {
                                MPLog.e(MixpanelAPI.APP_LINKS_LOGTAG, "failed to add key \"" + str + "\" to properties for tracking bolts event", e);
                            }
                        }
                    }
                    MixpanelAPI.this.track("$" + intent.getStringExtra("event_name"), jSONObject);
                }
            }, new IntentFilter("com.parse.bolts.measurement_event"));
        } catch (ClassNotFoundException e) {
            MPLog.d(APP_LINKS_LOGTAG, "To enable App Links tracking, add implementation 'mx_androidx.localbroadcastmanager:localbroadcastmanager:1.0.0': " + e.getMessage());
        } catch (IllegalAccessException e7) {
            MPLog.d(APP_LINKS_LOGTAG, "App Links tracking will not be enabled due to this exception: " + e7.getMessage());
        } catch (NoSuchMethodException e10) {
            MPLog.d(APP_LINKS_LOGTAG, "To enable App Links tracking, add implementation 'mx_androidx.localbroadcastmanager:localbroadcastmanager:1.0.0': " + e10.getMessage());
        } catch (InvocationTargetException e11) {
            MPLog.d(APP_LINKS_LOGTAG, "Failed to invoke LocalBroadcastManager.registerReceiver() -- App Links tracking will not be enabled due to this exception", e11);
        }
    }

    private static void checkIntentForInboundAppLink(Context context) {
        if (context instanceof Activity) {
            try {
                Class.forName("bolts.AppLinks").getMethod("getTargetUrlFromInboundIntent", Context.class, Intent.class).invoke(null, context, ((Activity) context).getIntent());
                return;
            } catch (ClassNotFoundException e) {
                MPLog.d(APP_LINKS_LOGTAG, "Please install the Bolts library >= 1.1.2 to track App Links: " + e.getMessage());
                return;
            } catch (IllegalAccessException e7) {
                MPLog.d(APP_LINKS_LOGTAG, "Unable to detect inbound App Links: " + e7.getMessage());
                return;
            } catch (NoSuchMethodException e10) {
                MPLog.d(APP_LINKS_LOGTAG, "Please install the Bolts library >= 1.1.2 to track App Links: " + e10.getMessage());
                return;
            } catch (InvocationTargetException e11) {
                MPLog.d(APP_LINKS_LOGTAG, "Failed to invoke bolts.AppLinks.getTargetUrlFromInboundIntent() -- Unable to detect inbound App Links", e11);
                return;
            }
        }
        MPLog.d(APP_LINKS_LOGTAG, "Context is not an instance of Activity. To detect inbound App Links, pass an instance of an Activity to getInstance.");
    }

    Context getContext() {
        return this.mContext;
    }
}
