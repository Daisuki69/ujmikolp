package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1jSDK {
    public final AFb1gSDK AFInAppEventParameterName;
    public long AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper;
    public final long[] AFLogger;
    public long AFVersionDeclaration;
    public final long[] afDebugLog;
    public final long[] afErrorLog;
    public long afInfoLog;
    public long afRDLog;
    public long afWarnLog;
    public final Map<String, Object> valueOf;
    public final Map<String, Object> values;

    public AFe1jSDK(AFb1gSDK aFb1gSDK) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.AFKeystoreWrapper = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.valueOf = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.values = concurrentHashMap3;
        this.AFInAppEventType = 0L;
        this.afInfoLog = 0L;
        this.afErrorLog = new long[2];
        this.AFLogger = new long[2];
        this.afDebugLog = new long[2];
        this.afRDLog = 0L;
        this.afWarnLog = 0L;
        this.AFInAppEventParameterName = aFb1gSDK;
        concurrentHashMap.putAll(AFKeystoreWrapper("first_launch"));
        concurrentHashMap2.putAll(AFKeystoreWrapper("ddl"));
        concurrentHashMap3.putAll(AFKeystoreWrapper("gcd"));
        this.AFVersionDeclaration = aFb1gSDK.AFInAppEventParameterName("prev_session_dur", 0L);
    }

    public final void AFInAppEventParameterName() {
        this.afInfoLog = System.currentTimeMillis();
        if (AFInAppEventType()) {
            long j = this.AFInAppEventType;
            if (j == 0) {
                AFLogger.afInfoLog("Metrics: init ts is missing");
                return;
            }
            this.AFKeystoreWrapper.put("init_to_fg", Long.valueOf(this.afInfoLog - j));
            this.AFInAppEventParameterName.AFInAppEventType("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
        }
    }

    public final boolean AFInAppEventType() {
        return this.AFInAppEventParameterName.AFKeystoreWrapper("appsFlyerCount", 0) == 0;
    }

    public final void AFKeystoreWrapper(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.afWarnLog;
        if (j != 0) {
            this.values.put("net", Long.valueOf(jCurrentTimeMillis - j));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.values.put("retries", Integer.valueOf(i));
        this.AFInAppEventParameterName.AFInAppEventType("gcd", new JSONObject(this.values).toString());
    }

    public final void values(DeepLinkResult deepLinkResult, long j) {
        this.valueOf.put("status", deepLinkResult.getStatus().toString());
        this.valueOf.put("timeout_value", Long.valueOf(j));
        this.AFInAppEventParameterName.AFInAppEventType("ddl", new JSONObject(this.valueOf).toString());
    }

    private Map<String, Object> AFKeystoreWrapper(String str) {
        Map<String, Object> map = Collections.EMPTY_MAP;
        String strAFInAppEventParameterName = this.AFInAppEventParameterName.AFInAppEventParameterName(str, (String) null);
        if (strAFInAppEventParameterName != null) {
            try {
                return AFa1mSDK.valueOf(new JSONObject(strAFInAppEventParameterName));
            } catch (Exception e) {
                AFLogger.afErrorLog("Error while parsing cached json data", e, true);
            }
        }
        return map;
    }

    public final void AFInAppEventParameterName(AFe1kSDK aFe1kSDK) {
        if (AFInAppEventType()) {
            this.AFKeystoreWrapper.put("start_with", aFe1kSDK.toString());
            this.AFInAppEventParameterName.AFInAppEventType("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
        }
    }

    public final void AFInAppEventParameterName(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.afRDLog = jCurrentTimeMillis;
        if (i == 1) {
            long j = this.afInfoLog;
            if (j != 0) {
                this.AFKeystoreWrapper.put("from_fg", Long.valueOf(jCurrentTimeMillis - j));
                this.AFInAppEventParameterName.AFInAppEventType("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: fg ts is missing");
        }
    }
}
