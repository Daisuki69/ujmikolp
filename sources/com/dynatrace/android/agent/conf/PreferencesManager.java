package com.dynatrace.android.agent.conf;

import We.s;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.camera.core.impl.a;
import androidx.media3.datasource.cache.c;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.comm.RequestExecutor;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.conf.UserPrivacyOptions;
import com.dynatrace.android.agent.util.Utility;
import dOYHB6.yFtIp6.svM7M6;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class PreferencesManager {

    @Deprecated
    private static final String KEY_BEACON = "DTX_BeaconSignal";
    private static final String KEY_DATA_COLLECTION_LEVEL = "DTXDataCollectionLevel";
    private static final String KEY_NEW_VISITOR_SENT = "DTXNewVisitorSent";
    private static final String KEY_OPT_IN_CRASHES = "DTXOptInCrashes";
    private static final String KEY_REPLAY_CRASHES = "DTXCrashReplayOptedIn";
    private static final String KEY_SCREEN_RECORDING = "DTXCScreenRecordOptedIn";
    private static final String KEY_SERVER_CONFIG = "ServerConfig";
    private static final String SHARED_PREFERENCES = "com.dynatrace.android.dtxPref";
    private static final String TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "PreferencesManager");
    private final ServerConfigurationManager serverConfigurationManager;
    private final SharedPreferences sharedPreferences;

    public PreferencesManager(SharedPreferences sharedPreferences, ServerConfigurationManager serverConfigurationManager) {
        this.sharedPreferences = sharedPreferences;
        this.serverConfigurationManager = serverConfigurationManager;
    }

    public static PreferencesManager createPreferencesManager(Context context, ServerConfigurationManager serverConfigurationManager) {
        return new PreferencesManager(context.getSharedPreferences(SHARED_PREFERENCES, 0), serverConfigurationManager);
    }

    private String loadPrefValue(String str, String str2) {
        try {
            return svM7M6.getString(this.sharedPreferences, str, str2);
        } catch (ClassCastException unused) {
            this.sharedPreferences.edit().remove(str).apply();
            return str2;
        }
    }

    private ServerConfiguration prepareConfiguration(ServerConfiguration serverConfiguration, int i, boolean z4) {
        return (serverConfiguration != null ? serverConfiguration.newBuilder() : new ServerConfiguration.Builder().withServerId(i).withGen3Enabled(z4)).withTimestamp(0L).withCapture(1).withMultiplicity(1).withSwitchServer(false).withTrafficControlPercentage(-1).build();
    }

    private ServerConfiguration readConfiguration() {
        if (!this.sharedPreferences.contains(KEY_SERVER_CONFIG)) {
            return null;
        }
        String strLoadPrefValue = loadPrefValue(KEY_SERVER_CONFIG, (String) null);
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "stored configuration: " + strLoadPrefValue);
        }
        try {
            return this.serverConfigurationManager.fromMemory(strLoadPrefValue);
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "can't parse stored configuration", e);
            }
            removeServerConfiguration();
            return null;
        }
    }

    @Deprecated
    public String getBeacon() {
        return loadPrefValue(KEY_BEACON, RequestExecutor.APPMON_DEFAULT_MONITOR);
    }

    public boolean getNewVisitorFlag() {
        return loadPrefValue(KEY_NEW_VISITOR_SENT, true);
    }

    public ServerConfiguration getServerConfiguration(int i, boolean z4) {
        return prepareConfiguration(readConfiguration(), i, z4);
    }

    public UserPrivacyOptions readPrivacySettings() {
        UserPrivacyOptions userPrivacyOptions = PrivacyRules.NO_USER_DEFINED_VALUE;
        try {
            boolean z4 = this.sharedPreferences.getBoolean(KEY_OPT_IN_CRASHES, userPrivacyOptions.isCrashReportingOptedIn());
            DataCollectionLevel dataCollectionLevelValueOf = DataCollectionLevel.valueOf(svM7M6.getString(this.sharedPreferences, KEY_DATA_COLLECTION_LEVEL, userPrivacyOptions.getDataCollectionLevel().name()));
            boolean z5 = this.sharedPreferences.getBoolean(KEY_REPLAY_CRASHES, userPrivacyOptions.isCrashReportingOptedIn());
            if (!z4 && z5) {
                this.sharedPreferences.edit().putBoolean(KEY_REPLAY_CRASHES, false).apply();
                if (Global.DEBUG) {
                    Utility.zlogE(TAG, "CrashReplayOptedIn cannot be true when CrashReportOptIn is false");
                }
                z5 = false;
            }
            UserPrivacyOptions.Builder builderWithCrashReportingOptedIn = new UserPrivacyOptions.Builder().withDataCollectionLevel(dataCollectionLevelValueOf).withCrashReportingOptedIn(z4);
            int i = this.sharedPreferences.getInt(KEY_SCREEN_RECORDING, -1);
            if (i != -1) {
                builderWithCrashReportingOptedIn.withScreenRecordOptedIn(Boolean.valueOf(i == 1));
            } else {
                builderWithCrashReportingOptedIn.withScreenRecordOptedIn(null);
                builderWithCrashReportingOptedIn.withCrashReplayOptedIn(z5);
            }
            return builderWithCrashReportingOptedIn.build();
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "could not read privacy settings", e);
            }
            removePrivacySettings();
            return userPrivacyOptions;
        }
    }

    @Deprecated
    public void removeBeacon() {
        this.sharedPreferences.edit().remove(KEY_BEACON).apply();
    }

    public void removePrivacySettings() {
        this.sharedPreferences.edit().remove(KEY_OPT_IN_CRASHES).remove(KEY_DATA_COLLECTION_LEVEL).remove(KEY_REPLAY_CRASHES).remove(KEY_SCREEN_RECORDING).apply();
    }

    public void removeServerConfiguration() {
        this.sharedPreferences.edit().remove(KEY_SERVER_CONFIG).apply();
    }

    @Deprecated
    public void setBeacon(String str) {
        if (RequestExecutor.APPMON_DEFAULT_MONITOR.equals(str)) {
            removeBeacon();
        } else {
            c.u(this.sharedPreferences, KEY_BEACON, str);
        }
    }

    public void setNewVisitorSent(boolean z4) {
        a.A(this.sharedPreferences, KEY_NEW_VISITOR_SENT, z4);
    }

    public void setServerConfiguration(ServerConfiguration serverConfiguration) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        try {
            editorEdit.putString(KEY_SERVER_CONFIG, this.serverConfigurationManager.generateStorableConfiguration(serverConfiguration));
        } catch (JSONException e) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "unable to generate configuration", e);
            }
            editorEdit.remove(KEY_SERVER_CONFIG);
        }
        editorEdit.apply();
    }

    public void storePrivacySettings(UserPrivacyOptions userPrivacyOptions) {
        SharedPreferences.Editor editorPutBoolean = this.sharedPreferences.edit().putBoolean(KEY_OPT_IN_CRASHES, userPrivacyOptions.isCrashReportingOptedIn()).putString(KEY_DATA_COLLECTION_LEVEL, userPrivacyOptions.getDataCollectionLevel().name()).putBoolean(KEY_REPLAY_CRASHES, userPrivacyOptions.isCrashReplayOptedIn());
        Boolean boolIsScreenRecordOptedIn = userPrivacyOptions.isScreenRecordOptedIn();
        if (boolIsScreenRecordOptedIn == null) {
            editorPutBoolean.putInt(KEY_SCREEN_RECORDING, -1);
        } else {
            editorPutBoolean.putInt(KEY_SCREEN_RECORDING, boolIsScreenRecordOptedIn.booleanValue() ? 1 : 0);
        }
        editorPutBoolean.apply();
    }

    private boolean loadPrefValue(String str, boolean z4) {
        try {
            return this.sharedPreferences.getBoolean(str, z4);
        } catch (ClassCastException unused) {
            this.sharedPreferences.edit().remove(str).apply();
            return z4;
        }
    }
}
