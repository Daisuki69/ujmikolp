package mx_com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.security.GeneralSecurityException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import mx_com.mixpanel.android.util.MPConstants;
import mx_com.mixpanel.android.util.MPLog;
import mx_com.mixpanel.android.util.OfflineMode;

/* JADX INFO: loaded from: classes7.dex */
public class MPConfig {
    public static boolean DEBUG = false;
    private static final String LOGTAG = "MixpanelAPI.Conf";
    static final String REFERRER_PREFS_NAME = "mx_com.mixpanel.android.mpmetrics.ReferralInfo";
    public static final String VERSION = "7.3.1";
    private static MPConfig sInstance;
    private static final Object sInstanceLock = new Object();
    private final int mBulkUploadLimit;
    private final long mDataExpiration;
    private final boolean mDisableAppOpenEvent;
    private final boolean mDisableExceptionHandler;
    private String mEventsEndpoint;
    private int mFlushBatchSize;
    private final int mFlushInterval;
    private final boolean mFlushOnBackground;
    private String mGroupsEndpoint;
    private int mMaximumDatabaseLimit;
    private final int mMinSessionDuration;
    private final int mMinimumDatabaseLimit;
    private OfflineMode mOfflineMode;
    private String mPeopleEndpoint;
    private final boolean mRemoveLegacyResidualFiles;
    private final String mResourcePackageName;
    private SSLSocketFactory mSSLSocketFactory;
    private final int mSessionTimeoutDuration;
    private boolean mTrackAutomaticEvents = true;
    private boolean mUseIpAddressForGeolocation;

    public static MPConfig getInstance(Context context) {
        synchronized (sInstanceLock) {
            if (sInstance == null) {
                sInstance = readConfig(context.getApplicationContext());
            }
        }
        return sInstance;
    }

    public synchronized void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.mSSLSocketFactory = sSLSocketFactory;
    }

    public synchronized void setOfflineMode(OfflineMode offlineMode) {
        this.mOfflineMode = offlineMode;
    }

    MPConfig(Bundle bundle, Context context) {
        long jFloatValue;
        SSLSocketFactory socketFactory = null;
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            socketFactory = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException e) {
            MPLog.i(LOGTAG, "System has no SSL support. Built-in events editor will not be available", e);
        }
        this.mSSLSocketFactory = socketFactory;
        boolean z4 = bundle.getBoolean("mx_com.mixpanel.android.MPConfig.EnableDebugLogging", false);
        DEBUG = z4;
        if (z4) {
            MPLog.setLevel(2);
        }
        if (bundle.containsKey("mx_com.mixpanel.android.MPConfig.DebugFlushInterval")) {
            MPLog.w(LOGTAG, "We do not support mx_com.mixpanel.android.MPConfig.DebugFlushInterval anymore. There will only be one flush interval. Please, update your AndroidManifest.xml.");
        }
        this.mBulkUploadLimit = bundle.getInt("mx_com.mixpanel.android.MPConfig.BulkUploadLimit", 40);
        this.mFlushInterval = bundle.getInt("mx_com.mixpanel.android.MPConfig.FlushInterval", 60000);
        this.mFlushBatchSize = bundle.getInt("mx_com.mixpanel.android.MPConfig.FlushBatchSize", 50);
        this.mFlushOnBackground = bundle.getBoolean("mx_com.mixpanel.android.MPConfig.FlushOnBackground", true);
        this.mMinimumDatabaseLimit = bundle.getInt("mx_com.mixpanel.android.MPConfig.MinimumDatabaseLimit", 20971520);
        this.mMaximumDatabaseLimit = bundle.getInt("mx_com.mixpanel.android.MPConfig.MaximumDatabaseLimit", Integer.MAX_VALUE);
        this.mResourcePackageName = bundle.getString("mx_com.mixpanel.android.MPConfig.ResourcePackageName");
        this.mDisableAppOpenEvent = bundle.getBoolean("mx_com.mixpanel.android.MPConfig.DisableAppOpenEvent", true);
        this.mDisableExceptionHandler = bundle.getBoolean("mx_com.mixpanel.android.MPConfig.DisableExceptionHandler", false);
        this.mMinSessionDuration = bundle.getInt("mx_com.mixpanel.android.MPConfig.MinimumSessionDuration", 10000);
        this.mSessionTimeoutDuration = bundle.getInt("mx_com.mixpanel.android.MPConfig.SessionTimeoutDuration", Integer.MAX_VALUE);
        this.mUseIpAddressForGeolocation = bundle.getBoolean("mx_com.mixpanel.android.MPConfig.UseIpAddressForGeolocation", true);
        this.mRemoveLegacyResidualFiles = bundle.getBoolean("mx_com.mixpanel.android.MPConfig.RemoveLegacyResidualFiles", false);
        Object obj = bundle.get("mx_com.mixpanel.android.MPConfig.DataExpiration");
        long j = 432000000;
        if (obj != null) {
            try {
                if (obj instanceof Integer) {
                    jFloatValue = ((Integer) obj).intValue();
                } else if (obj instanceof Float) {
                    jFloatValue = (long) ((Float) obj).floatValue();
                } else {
                    throw new NumberFormatException(obj.toString() + " is not a number.");
                }
                j = jFloatValue;
            } catch (Exception e7) {
                MPLog.e(LOGTAG, "Error parsing mx_com.mixpanel.android.MPConfig.DataExpiration meta-data value", e7);
            }
        }
        this.mDataExpiration = j;
        boolean zContainsKey = true ^ bundle.containsKey("mx_com.mixpanel.android.MPConfig.UseIpAddressForGeolocation");
        String string = bundle.getString("mx_com.mixpanel.android.MPConfig.EventsEndpoint");
        if (string != null) {
            setEventsEndpoint(zContainsKey ? string : getEndPointWithIpTrackingParam(string, getUseIpAddressForGeolocation()));
        } else {
            setEventsEndpointWithBaseURL(MPConstants.URL.MIXPANEL_API);
        }
        String string2 = bundle.getString("mx_com.mixpanel.android.MPConfig.PeopleEndpoint");
        if (string2 != null) {
            setPeopleEndpoint(zContainsKey ? string2 : getEndPointWithIpTrackingParam(string2, getUseIpAddressForGeolocation()));
        } else {
            setPeopleEndpointWithBaseURL(MPConstants.URL.MIXPANEL_API);
        }
        String string3 = bundle.getString("mx_com.mixpanel.android.MPConfig.GroupsEndpoint");
        if (string3 != null) {
            setGroupsEndpoint(zContainsKey ? string3 : getEndPointWithIpTrackingParam(string3, getUseIpAddressForGeolocation()));
        } else {
            setGroupsEndpointWithBaseURL(MPConstants.URL.MIXPANEL_API);
        }
        MPLog.v(LOGTAG, toString());
    }

    public int getBulkUploadLimit() {
        return this.mBulkUploadLimit;
    }

    public int getFlushInterval() {
        return this.mFlushInterval;
    }

    public boolean getFlushOnBackground() {
        return this.mFlushOnBackground;
    }

    public int getFlushBatchSize() {
        return this.mFlushBatchSize;
    }

    public void setFlushBatchSize(int i) {
        this.mFlushBatchSize = i;
    }

    public long getDataExpiration() {
        return this.mDataExpiration;
    }

    public int getMinimumDatabaseLimit() {
        return this.mMinimumDatabaseLimit;
    }

    public int getMaximumDatabaseLimit() {
        return this.mMaximumDatabaseLimit;
    }

    public void setMaximumDatabaseLimit(int i) {
        this.mMaximumDatabaseLimit = i;
    }

    public boolean getDisableAppOpenEvent() {
        return this.mDisableAppOpenEvent;
    }

    public String getEventsEndpoint() {
        return this.mEventsEndpoint;
    }

    public boolean getTrackAutomaticEvents() {
        return this.mTrackAutomaticEvents;
    }

    public void setServerURL(String str) {
        setEventsEndpointWithBaseURL(str);
        setPeopleEndpointWithBaseURL(str);
        setGroupsEndpointWithBaseURL(str);
    }

    private String getEndPointWithIpTrackingParam(String str, boolean z4) {
        boolean zContains = str.contains("?ip=");
        String str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        if (zContains) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.substring(0, str.indexOf("?ip=")));
            sb2.append("?ip=");
            if (!z4) {
                str2 = "0";
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("?ip=");
        if (!z4) {
            str2 = "0";
        }
        sb3.append(str2);
        return sb3.toString();
    }

    private void setEventsEndpointWithBaseURL(String str) {
        setEventsEndpoint(getEndPointWithIpTrackingParam(str + MPConstants.URL.EVENT, getUseIpAddressForGeolocation()));
    }

    private void setEventsEndpoint(String str) {
        this.mEventsEndpoint = str;
    }

    public String getPeopleEndpoint() {
        return this.mPeopleEndpoint;
    }

    private void setPeopleEndpointWithBaseURL(String str) {
        setPeopleEndpoint(getEndPointWithIpTrackingParam(str + MPConstants.URL.PEOPLE, getUseIpAddressForGeolocation()));
    }

    private void setPeopleEndpoint(String str) {
        this.mPeopleEndpoint = str;
    }

    public String getGroupsEndpoint() {
        return this.mGroupsEndpoint;
    }

    private void setGroupsEndpointWithBaseURL(String str) {
        setGroupsEndpoint(getEndPointWithIpTrackingParam(str + MPConstants.URL.GROUPS, getUseIpAddressForGeolocation()));
    }

    private void setGroupsEndpoint(String str) {
        this.mGroupsEndpoint = str;
    }

    public int getMinimumSessionDuration() {
        return this.mMinSessionDuration;
    }

    public int getSessionTimeoutDuration() {
        return this.mSessionTimeoutDuration;
    }

    public boolean getDisableExceptionHandler() {
        return this.mDisableExceptionHandler;
    }

    private boolean getUseIpAddressForGeolocation() {
        return this.mUseIpAddressForGeolocation;
    }

    public boolean getRemoveLegacyResidualFiles() {
        return this.mRemoveLegacyResidualFiles;
    }

    public void setUseIpAddressForGeolocation(boolean z4) {
        this.mUseIpAddressForGeolocation = z4;
        setEventsEndpoint(getEndPointWithIpTrackingParam(getEventsEndpoint(), z4));
        setPeopleEndpoint(getEndPointWithIpTrackingParam(getPeopleEndpoint(), z4));
        setGroupsEndpoint(getEndPointWithIpTrackingParam(getGroupsEndpoint(), z4));
    }

    public void setEnableLogging(boolean z4) {
        DEBUG = z4;
        MPLog.setLevel(z4 ? 2 : Integer.MAX_VALUE);
    }

    public void setTrackAutomaticEvents(boolean z4) {
        this.mTrackAutomaticEvents = z4;
    }

    public String getResourcePackageName() {
        return this.mResourcePackageName;
    }

    public synchronized SSLSocketFactory getSSLSocketFactory() {
        return this.mSSLSocketFactory;
    }

    public synchronized OfflineMode getOfflineMode() {
        return this.mOfflineMode;
    }

    static MPConfig readConfig(Context context) {
        String packageName = context.getPackageName();
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(packageName, 128).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
            return new MPConfig(bundle, context);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Can't configure Mixpanel with package name " + packageName, e);
        }
    }

    public String toString() {
        return "Mixpanel (7.3.1) configured with:\n    TrackAutomaticEvents: " + getTrackAutomaticEvents() + "\n    BulkUploadLimit " + getBulkUploadLimit() + "\n    FlushInterval " + getFlushInterval() + "\n    FlushInterval " + getFlushBatchSize() + "\n    DataExpiration " + getDataExpiration() + "\n    MinimumDatabaseLimit " + getMinimumDatabaseLimit() + "\n    MaximumDatabaseLimit " + getMaximumDatabaseLimit() + "\n    DisableAppOpenEvent " + getDisableAppOpenEvent() + "\n    EnableDebugLogging " + DEBUG + "\n    EventsEndpoint " + getEventsEndpoint() + "\n    PeopleEndpoint " + getPeopleEndpoint() + "\n    MinimumSessionDuration: " + getMinimumSessionDuration() + "\n    SessionTimeoutDuration: " + getSessionTimeoutDuration() + "\n    DisableExceptionHandler: " + getDisableExceptionHandler() + "\n    FlushOnBackground: " + getFlushOnBackground();
    }
}
