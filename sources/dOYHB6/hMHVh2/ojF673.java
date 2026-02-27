package dOYHB6.hMHVh2;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.location.Location;
import android.os.Process;
import dOYHB6.cYHhs8;
import dOYHB6.ewaEX1;
import dOYHB6.lAavc8.gDpfv6;
import dOYHB6.lBzGT9.i5fG65;
import dOYHB6.lBzGT9.z73qw4;
import dOYHB6.lPFdA1;
import dOYHB6.mM0wQ9;
import dOYHB6.nm8AQ4;
import dOYHB6.qOnQ39.qOnQ39;
import dOYHB6.tiZVw8.numX49;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;
import mx_com.mixpanel.android.mpmetrics.MPConfig;
import mx_com.mixpanel.android.mpmetrics.MixpanelAPI;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ojF673 {
    private static final int MAX_INIT_ATTEMPTS = 3;
    private static String trackingIdentity = null;
    private static String trackingToken = null;
    private static String serverAppToken = null;
    private static String serverName = null;
    private static String serverFusedAppToken = null;
    private static MixpanelAPI mixpanelAPIInstance = null;
    private static Context context = null;
    private static final Set<ok2dq0> eventTrackingModifierSet = new HashSet();
    private static final Object initLock = new Object();
    private static int initAttempts = 0;
    private static z73qw4 adLocationProvider = null;

    private static String csJfH9() {
        return numX49.tnTj78("bFkP");
    }

    private static void eT2W90(String str, JSONObject jSONObject) {
        Location lastLocation;
        if (trackingIdentity == null || trackingToken == null) {
            return;
        }
        try {
            identify(trackingIdentity);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            String strOptString = jSONObject.optString("deviceID");
            if (strOptString.isEmpty() || strOptString.equals("no data")) {
                jSONObject.put("deviceID", ewaEX1.utYh22());
            }
            try {
                jSONObject.put("Application", context.getApplicationContext().getPackageName());
                jSONObject.put("Identity", trackingIdentity);
                jSONObject.put("Appdome fusion app token", serverAppToken);
                jSONObject.put("Appdome fusion server name", serverName);
                jSONObject.put("Appdome fusion fused app token", serverFusedAppToken);
                jSONObject.put("isRunningInForeground", s4UnN7().toString());
                synchronized (eventTrackingModifierSet) {
                    Iterator<ok2dq0> it = eventTrackingModifierSet.iterator();
                    while (it.hasNext()) {
                        it.next().updateEventDetails(jSONObject);
                    }
                }
                if (adLocationProvider != null && (lastLocation = adLocationProvider.getLastLocation()) != null) {
                    jSONObject.put("$latitude", lastLocation.getLatitude());
                    jSONObject.put("$longitude", lastLocation.getLongitude());
                }
            } catch (JSONException e) {
            }
            track(str, jSONObject);
            flush();
        } catch (Exception e7) {
            cYHhs8.gWQKs2(e7, false);
        }
    }

    private static boolean ensureInitialized() {
        synchronized (initLock) {
            boolean z4 = true;
            if (mixpanelAPIInstance != null) {
                return true;
            }
            if (initAttempts >= 3) {
                return false;
            }
            qVIva4();
            if (mixpanelAPIInstance == null) {
                z4 = false;
            }
            return z4;
        }
    }

    private static void flush() {
        if (ensureInitialized()) {
            mixpanelAPIInstance.flush();
        }
    }

    private static void gAMhu6(String str, String str2) {
        try {
            eT2W90(str, new JSONObject(str2));
        } catch (JSONException e) {
        }
    }

    private static void identify(String str) {
        if (ensureInitialized()) {
            mixpanelAPIInstance.identify(str);
        }
    }

    private static void init(String str, String str2, String str3, String str4, String str5) {
        trackingIdentity = str;
        trackingToken = str2;
        serverAppToken = str3;
        serverName = str4;
        serverFusedAppToken = str5;
        context = nm8AQ4.get();
        adLocationProvider = i5fG65.getInstance();
        qVIva4();
    }

    private static void qVIva4() {
        synchronized (initLock) {
            if (mixpanelAPIInstance != null) {
                return;
            }
            if (initAttempts >= 3) {
                return;
            }
            if (trackingIdentity != null && trackingToken != null && context != null) {
                initAttempts++;
                SSLSocketFactory sSLSocketFactoryZdOBR1 = gDpfv6.zdOBR1();
                if (sSLSocketFactoryZdOBR1 == null) {
                    mM0wQ9.xFRsG8("could not initialize MixPanel secure connection in order to load MixpanelAPI");
                    return;
                }
                MPConfig mPConfig = MPConfig.getInstance(context);
                mPConfig.setSSLSocketFactory(sSLSocketFactoryZdOBR1);
                String string = qOnQ39.getString(csJfH9(), "");
                if (!lPFdA1.isNullOrEmpty(string)) {
                    mPConfig.setServerURL(string);
                }
                try {
                    mixpanelAPIInstance = MixpanelAPI.getInstance(context, trackingToken, false);
                } catch (OutOfMemoryError e) {
                    mixpanelAPIInstance = null;
                }
            }
        }
    }

    private static Boolean s4UnN7() {
        Context context2 = nm8AQ4.get();
        if (((KeyguardManager) context2.getSystemService(numX49.tnTj78("bFkb"))).isKeyguardLocked()) {
            return false;
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context2.getSystemService(numX49.tnTj78("bFk2"))).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return Boolean.valueOf(runningAppProcessInfo.importance == 100);
            }
        }
        return false;
    }

    public static void sUdhu1(ok2dq0 ok2dq0Var) {
        if (ok2dq0Var == null) {
            return;
        }
        synchronized (eventTrackingModifierSet) {
            eventTrackingModifierSet.add(ok2dq0Var);
        }
    }

    private static void track(String str, JSONObject jSONObject) {
        if (ensureInitialized()) {
            mixpanelAPIInstance.track(str, jSONObject);
        }
    }
}
