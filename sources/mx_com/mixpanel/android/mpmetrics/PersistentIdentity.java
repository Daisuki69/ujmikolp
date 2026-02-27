package mx_com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import mx_com.mixpanel.android.util.MPLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class PersistentIdentity {
    private static final String DELIMITER = ",";
    private static final String LOGTAG = "MixpanelAPI.PIdentity";
    private static Boolean sIsFirstAppLaunch = null;
    private static Integer sPreviousVersionCode = null;
    private static boolean sReferrerPrefsDirty = true;
    private static final Object sReferrerPrefsLock = new Object();
    private String mAnonymousId;
    private String mEventsDistinctId;
    private boolean mEventsUserIdPresent;
    private boolean mHadPersistedDistinctId;
    private Boolean mIsUserOptOut;
    private final Future<SharedPreferences> mLoadReferrerPreferences;
    private final Future<SharedPreferences> mLoadStoredPreferences;
    private final Future<SharedPreferences> mMixpanelPreferences;
    private String mPeopleDistinctId;
    private final Future<SharedPreferences> mTimeEventsPreferences;
    private final Object mSuperPropsLock = new Object();
    private JSONObject mSuperPropertiesCache = null;
    private Map<String, String> mReferrerPropertiesCache = null;
    private boolean mIdentitiesLoaded = false;
    private final SharedPreferences.OnSharedPreferenceChangeListener mReferrerChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: mx_com.mixpanel.android.mpmetrics.PersistentIdentity.1
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            synchronized (PersistentIdentity.sReferrerPrefsLock) {
                PersistentIdentity.this.readReferrerProperties();
                boolean unused = PersistentIdentity.sReferrerPrefsDirty = false;
            }
        }
    };

    public static String getPeopleDistinctId(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("people_distinct_id", null);
    }

    public static void writeReferrerPrefs(Context context, String str, Map<String, String> map) {
        synchronized (sReferrerPrefsLock) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
            editorEdit.clear();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                editorEdit.putString(entry.getKey(), entry.getValue());
            }
            writeEdits(editorEdit);
            sReferrerPrefsDirty = true;
        }
    }

    public PersistentIdentity(Future<SharedPreferences> future, Future<SharedPreferences> future2, Future<SharedPreferences> future3, Future<SharedPreferences> future4) {
        this.mLoadReferrerPreferences = future;
        this.mLoadStoredPreferences = future2;
        this.mTimeEventsPreferences = future3;
        this.mMixpanelPreferences = future4;
    }

    public void addSuperPropertiesToObject(JSONObject jSONObject) {
        synchronized (this.mSuperPropsLock) {
            JSONObject superPropertiesCache = getSuperPropertiesCache();
            Iterator<String> itKeys = superPropertiesCache.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    jSONObject.put(next, superPropertiesCache.get(next));
                } catch (JSONException e) {
                    MPLog.e(LOGTAG, "Object read from one JSON Object cannot be written to another", e);
                }
            }
        }
    }

    public void updateSuperProperties(SuperPropertyUpdate superPropertyUpdate) {
        synchronized (this.mSuperPropsLock) {
            JSONObject superPropertiesCache = getSuperPropertiesCache();
            JSONObject jSONObject = new JSONObject();
            try {
                Iterator<String> itKeys = superPropertiesCache.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, superPropertiesCache.get(next));
                }
                JSONObject jSONObjectUpdate = superPropertyUpdate.update(jSONObject);
                if (jSONObjectUpdate == null) {
                    MPLog.w(LOGTAG, "An update to Mixpanel's super properties returned null, and will have no effect.");
                } else {
                    this.mSuperPropertiesCache = jSONObjectUpdate;
                    storeSuperProperties();
                }
            } catch (JSONException e) {
                MPLog.e(LOGTAG, "Can't copy from one JSONObject to another", e);
            }
        }
    }

    public void registerSuperProperties(JSONObject jSONObject) {
        synchronized (this.mSuperPropsLock) {
            JSONObject superPropertiesCache = getSuperPropertiesCache();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    superPropertiesCache.put(next, jSONObject.get(next));
                } catch (JSONException e) {
                    MPLog.e(LOGTAG, "Exception registering super property.", e);
                }
            }
            storeSuperProperties();
        }
    }

    public void unregisterSuperProperty(String str) {
        synchronized (this.mSuperPropsLock) {
            getSuperPropertiesCache().remove(str);
            storeSuperProperties();
        }
    }

    public void registerSuperPropertiesOnce(JSONObject jSONObject) {
        synchronized (this.mSuperPropsLock) {
            JSONObject superPropertiesCache = getSuperPropertiesCache();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!superPropertiesCache.has(next)) {
                    try {
                        superPropertiesCache.put(next, jSONObject.get(next));
                    } catch (JSONException e) {
                        MPLog.e(LOGTAG, "Exception registering super property.", e);
                    }
                }
            }
            storeSuperProperties();
        }
    }

    public void clearSuperProperties() {
        synchronized (this.mSuperPropsLock) {
            this.mSuperPropertiesCache = new JSONObject();
            storeSuperProperties();
        }
    }

    public Map<String, String> getReferrerProperties() {
        synchronized (sReferrerPrefsLock) {
            if (sReferrerPrefsDirty || this.mReferrerPropertiesCache == null) {
                readReferrerProperties();
                sReferrerPrefsDirty = false;
            }
        }
        return this.mReferrerPropertiesCache;
    }

    public void clearReferrerProperties() {
        synchronized (sReferrerPrefsLock) {
            try {
                try {
                    SharedPreferences.Editor editorEdit = this.mLoadReferrerPreferences.get().edit();
                    editorEdit.clear();
                    writeEdits(editorEdit);
                } catch (ExecutionException e) {
                    MPLog.e(LOGTAG, "Cannot load referrer properties from shared preferences.", e.getCause());
                }
            } catch (InterruptedException e7) {
                MPLog.e(LOGTAG, "Cannot load referrer properties from shared preferences.", e7);
            }
        }
    }

    public synchronized String getAnonymousId() {
        if (!this.mIdentitiesLoaded) {
            readIdentities();
        }
        return this.mAnonymousId;
    }

    public synchronized boolean getHadPersistedDistinctId() {
        if (!this.mIdentitiesLoaded) {
            readIdentities();
        }
        return this.mHadPersistedDistinctId;
    }

    public synchronized String getEventsDistinctId() {
        if (!this.mIdentitiesLoaded) {
            readIdentities();
        }
        return this.mEventsDistinctId;
    }

    public synchronized String getEventsUserId() {
        if (!this.mIdentitiesLoaded) {
            readIdentities();
        }
        if (!this.mEventsUserIdPresent) {
            return null;
        }
        return this.mEventsDistinctId;
    }

    public synchronized void setAnonymousIdIfAbsent(String str) {
        if (!this.mIdentitiesLoaded) {
            readIdentities();
        }
        if (this.mAnonymousId != null) {
            return;
        }
        this.mAnonymousId = str;
        this.mHadPersistedDistinctId = true;
        writeIdentities();
    }

    public synchronized void setEventsDistinctId(String str) {
        if (!this.mIdentitiesLoaded) {
            readIdentities();
        }
        this.mEventsDistinctId = str;
        writeIdentities();
    }

    public synchronized void markEventsUserIdPresent() {
        if (!this.mIdentitiesLoaded) {
            readIdentities();
        }
        this.mEventsUserIdPresent = true;
        writeIdentities();
    }

    public synchronized String getPeopleDistinctId() {
        if (!this.mIdentitiesLoaded) {
            readIdentities();
        }
        return this.mPeopleDistinctId;
    }

    public synchronized void setPeopleDistinctId(String str) {
        if (!this.mIdentitiesLoaded) {
            readIdentities();
        }
        this.mPeopleDistinctId = str;
        writeIdentities();
    }

    public synchronized void clearPreferences() {
        try {
            SharedPreferences.Editor editorEdit = this.mLoadStoredPreferences.get().edit();
            editorEdit.clear();
            writeEdits(editorEdit);
            readSuperProperties();
            readIdentities();
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getCause());
        } catch (ExecutionException e7) {
            throw new RuntimeException(e7.getCause());
        }
    }

    public void clearTimedEvents() {
        try {
            SharedPreferences.Editor editorEdit = this.mTimeEventsPreferences.get().edit();
            editorEdit.clear();
            writeEdits(editorEdit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e7) {
            e7.printStackTrace();
        }
    }

    public Map<String, Long> getTimeEvents() {
        HashMap map = new HashMap();
        try {
            for (Map.Entry<String, ?> entry : this.mTimeEventsPreferences.get().getAll().entrySet()) {
                map.put(entry.getKey(), Long.valueOf(entry.getValue().toString()));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e7) {
            e7.printStackTrace();
        }
        return map;
    }

    public void removeTimedEvent(String str) {
        try {
            SharedPreferences.Editor editorEdit = this.mTimeEventsPreferences.get().edit();
            editorEdit.remove(str);
            writeEdits(editorEdit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e7) {
            e7.printStackTrace();
        }
    }

    public void addTimeEvent(String str, Long l6) {
        try {
            SharedPreferences.Editor editorEdit = this.mTimeEventsPreferences.get().edit();
            editorEdit.putLong(str, l6.longValue());
            writeEdits(editorEdit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e7) {
            e7.printStackTrace();
        }
    }

    public synchronized boolean isFirstIntegration(String str) {
        boolean z4;
        z4 = false;
        try {
            z4 = this.mMixpanelPreferences.get().getBoolean(str, false);
        } catch (InterruptedException e) {
            MPLog.e(LOGTAG, "Couldn't read internal Mixpanel from shared preferences.", e);
        } catch (ExecutionException e7) {
            MPLog.e(LOGTAG, "Couldn't read internal Mixpanel shared preferences.", e7.getCause());
        }
        return z4;
    }

    public synchronized void setIsIntegrated(String str) {
        try {
            try {
                SharedPreferences.Editor editorEdit = this.mMixpanelPreferences.get().edit();
                editorEdit.putBoolean(str, true);
                writeEdits(editorEdit);
            } catch (ExecutionException e) {
                MPLog.e(LOGTAG, "Couldn't write internal Mixpanel shared preferences.", e.getCause());
            }
        } catch (InterruptedException e7) {
            MPLog.e(LOGTAG, "Couldn't write internal Mixpanel from shared preferences.", e7);
        }
    }

    public synchronized boolean isNewVersion(String str) {
        if (str == null) {
            return false;
        }
        Integer numValueOf = Integer.valueOf(str);
        try {
            try {
                if (sPreviousVersionCode == null) {
                    Integer numValueOf2 = Integer.valueOf(this.mMixpanelPreferences.get().getInt("latest_version_code", -1));
                    sPreviousVersionCode = numValueOf2;
                    if (numValueOf2.intValue() == -1) {
                        sPreviousVersionCode = numValueOf;
                        SharedPreferences.Editor editorEdit = this.mMixpanelPreferences.get().edit();
                        editorEdit.putInt("latest_version_code", numValueOf.intValue());
                        writeEdits(editorEdit);
                    }
                }
                if (sPreviousVersionCode.intValue() < numValueOf.intValue()) {
                    SharedPreferences.Editor editorEdit2 = this.mMixpanelPreferences.get().edit();
                    editorEdit2.putInt("latest_version_code", numValueOf.intValue());
                    writeEdits(editorEdit2);
                    return true;
                }
            } catch (InterruptedException e) {
                MPLog.e(LOGTAG, "Couldn't write internal Mixpanel from shared preferences.", e);
            }
        } catch (ExecutionException e7) {
            MPLog.e(LOGTAG, "Couldn't write internal Mixpanel shared preferences.", e7.getCause());
        }
        return false;
    }

    public synchronized boolean isFirstLaunch(boolean z4, String str) {
        if (sIsFirstAppLaunch == null) {
            try {
                if (this.mMixpanelPreferences.get().getBoolean("has_launched_" + str, false)) {
                    sIsFirstAppLaunch = false;
                } else {
                    Boolean boolValueOf = Boolean.valueOf(!z4);
                    sIsFirstAppLaunch = boolValueOf;
                    if (!boolValueOf.booleanValue()) {
                        setHasLaunched(str);
                    }
                }
            } catch (InterruptedException unused) {
                sIsFirstAppLaunch = false;
            } catch (ExecutionException unused2) {
                sIsFirstAppLaunch = false;
            }
        }
        return sIsFirstAppLaunch.booleanValue();
    }

    public synchronized void setHasLaunched(String str) {
        try {
            try {
                SharedPreferences.Editor editorEdit = this.mMixpanelPreferences.get().edit();
                editorEdit.putBoolean("has_launched_" + str, true);
                writeEdits(editorEdit);
            } catch (ExecutionException e) {
                MPLog.e(LOGTAG, "Couldn't write internal Mixpanel shared preferences.", e.getCause());
            }
        } catch (InterruptedException e7) {
            MPLog.e(LOGTAG, "Couldn't write internal Mixpanel shared preferences.", e7);
        }
    }

    public synchronized void setOptOutTracking(boolean z4, String str) {
        this.mIsUserOptOut = Boolean.valueOf(z4);
        writeOptOutFlag(str);
    }

    public synchronized boolean getOptOutTracking(String str) {
        if (this.mIsUserOptOut == null) {
            readOptOutFlag(str);
        }
        return this.mIsUserOptOut.booleanValue();
    }

    private JSONObject getSuperPropertiesCache() {
        if (this.mSuperPropertiesCache == null) {
            readSuperProperties();
        }
        return this.mSuperPropertiesCache;
    }

    private void readSuperProperties() {
        JSONObject jSONObject;
        try {
            try {
                try {
                    try {
                        String string = this.mLoadStoredPreferences.get().getString("super_properties", WeJson.EMPTY_MAP);
                        MPLog.v(LOGTAG, "Loading Super Properties " + string);
                        this.mSuperPropertiesCache = new JSONObject(string);
                    } catch (ExecutionException e) {
                        MPLog.e(LOGTAG, "Cannot load superProperties from SharedPreferences.", e.getCause());
                        if (this.mSuperPropertiesCache == null) {
                            jSONObject = new JSONObject();
                            this.mSuperPropertiesCache = jSONObject;
                        }
                    }
                } catch (JSONException unused) {
                    MPLog.e(LOGTAG, "Cannot parse stored superProperties");
                    storeSuperProperties();
                    if (this.mSuperPropertiesCache == null) {
                        jSONObject = new JSONObject();
                        this.mSuperPropertiesCache = jSONObject;
                    }
                }
            } catch (InterruptedException e7) {
                MPLog.e(LOGTAG, "Cannot load superProperties from SharedPreferences.", e7);
                if (this.mSuperPropertiesCache == null) {
                    jSONObject = new JSONObject();
                    this.mSuperPropertiesCache = jSONObject;
                }
            }
        } catch (Throwable th2) {
            if (this.mSuperPropertiesCache == null) {
                this.mSuperPropertiesCache = new JSONObject();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readReferrerProperties() {
        this.mReferrerPropertiesCache = new HashMap();
        try {
            SharedPreferences sharedPreferences = this.mLoadReferrerPreferences.get();
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this.mReferrerChangeListener);
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.mReferrerChangeListener);
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                this.mReferrerPropertiesCache.put(entry.getKey(), entry.getValue().toString());
            }
        } catch (InterruptedException e) {
            MPLog.e(LOGTAG, "Cannot load referrer properties from shared preferences.", e);
        } catch (ExecutionException e7) {
            MPLog.e(LOGTAG, "Cannot load referrer properties from shared preferences.", e7.getCause());
        }
    }

    private void storeSuperProperties() {
        JSONObject jSONObject = this.mSuperPropertiesCache;
        if (jSONObject == null) {
            MPLog.e(LOGTAG, "storeSuperProperties should not be called with uninitialized superPropertiesCache.");
            return;
        }
        String string = jSONObject.toString();
        MPLog.v(LOGTAG, "Storing Super Properties " + string);
        try {
            SharedPreferences.Editor editorEdit = this.mLoadStoredPreferences.get().edit();
            editorEdit.putString("super_properties", string);
            writeEdits(editorEdit);
        } catch (InterruptedException e) {
            MPLog.e(LOGTAG, "Cannot store superProperties in shared preferences.", e);
        } catch (ExecutionException e7) {
            MPLog.e(LOGTAG, "Cannot store superProperties in shared preferences.", e7.getCause());
        }
    }

    private void readIdentities() {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = this.mLoadStoredPreferences.get();
        } catch (InterruptedException e) {
            MPLog.e(LOGTAG, "Cannot read distinct ids from sharedPreferences.", e);
            sharedPreferences = null;
        } catch (ExecutionException e7) {
            MPLog.e(LOGTAG, "Cannot read distinct ids from sharedPreferences.", e7.getCause());
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            return;
        }
        this.mEventsDistinctId = sharedPreferences.getString("events_distinct_id", null);
        this.mEventsUserIdPresent = sharedPreferences.getBoolean("events_user_id_present", false);
        this.mPeopleDistinctId = sharedPreferences.getString("people_distinct_id", null);
        this.mAnonymousId = sharedPreferences.getString("anonymous_id", null);
        this.mHadPersistedDistinctId = sharedPreferences.getBoolean("had_persisted_distinct_id", false);
        if (this.mEventsDistinctId == null) {
            this.mAnonymousId = UUID.randomUUID().toString();
            this.mEventsDistinctId = "$device:" + this.mAnonymousId;
            this.mEventsUserIdPresent = false;
            writeIdentities();
        }
        this.mIdentitiesLoaded = true;
    }

    private void readOptOutFlag(String str) {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = this.mMixpanelPreferences.get();
        } catch (InterruptedException e) {
            MPLog.e(LOGTAG, "Cannot read opt out flag from sharedPreferences.", e);
            sharedPreferences = null;
        } catch (ExecutionException e7) {
            MPLog.e(LOGTAG, "Cannot read opt out flag from sharedPreferences.", e7.getCause());
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            return;
        }
        this.mIsUserOptOut = Boolean.valueOf(sharedPreferences.getBoolean("opt_out_" + str, false));
    }

    private void writeOptOutFlag(String str) {
        try {
            SharedPreferences.Editor editorEdit = this.mMixpanelPreferences.get().edit();
            editorEdit.putBoolean("opt_out_" + str, this.mIsUserOptOut.booleanValue());
            writeEdits(editorEdit);
        } catch (InterruptedException e) {
            MPLog.e(LOGTAG, "Can't write opt-out shared preferences.", e);
        } catch (ExecutionException e7) {
            MPLog.e(LOGTAG, "Can't write opt-out shared preferences.", e7.getCause());
        }
    }

    protected void removeOptOutFlag(String str) {
        try {
            SharedPreferences.Editor editorEdit = this.mMixpanelPreferences.get().edit();
            editorEdit.clear();
            writeEdits(editorEdit);
        } catch (InterruptedException e) {
            MPLog.e(LOGTAG, "Can't remove opt-out shared preferences.", e);
        } catch (ExecutionException e7) {
            MPLog.e(LOGTAG, "Can't remove opt-out shared preferences.", e7.getCause());
        }
    }

    protected boolean hasOptOutFlag(String str) {
        try {
            return this.mMixpanelPreferences.get().contains("opt_out_" + str);
        } catch (InterruptedException e) {
            MPLog.e(LOGTAG, "Can't read opt-out shared preferences.", e);
            return false;
        } catch (ExecutionException e7) {
            MPLog.e(LOGTAG, "Can't read opt-out shared preferences.", e7.getCause());
            return false;
        }
    }

    private void writeIdentities() {
        try {
            SharedPreferences.Editor editorEdit = this.mLoadStoredPreferences.get().edit();
            editorEdit.putString("events_distinct_id", this.mEventsDistinctId);
            editorEdit.putBoolean("events_user_id_present", this.mEventsUserIdPresent);
            editorEdit.putString("people_distinct_id", this.mPeopleDistinctId);
            editorEdit.putString("anonymous_id", this.mAnonymousId);
            editorEdit.putBoolean("had_persisted_distinct_id", this.mHadPersistedDistinctId);
            writeEdits(editorEdit);
        } catch (InterruptedException e) {
            MPLog.e(LOGTAG, "Can't write distinct ids to shared preferences.", e);
        } catch (ExecutionException e7) {
            MPLog.e(LOGTAG, "Can't write distinct ids to shared preferences.", e7.getCause());
        }
    }

    private static void writeEdits(SharedPreferences.Editor editor) {
        editor.apply();
    }
}
