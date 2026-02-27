package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1lSDK extends AFd1wSDK<Void> {

    @Nullable
    private final AFc1eSDK<String> afDebugLog;
    private final AFb1gSDK afErrorLog;

    @Nullable
    private final Throwable afRDLog;

    public AFe1lSDK(AFd1cSDK aFd1cSDK, AFb1gSDK aFb1gSDK) {
        super(AFd1uSDK.GCDSDK, new AFd1uSDK[]{AFd1uSDK.RC_CDN}, "GCD-CHECK");
        this.afRDLog = aFd1cSDK.afRDLog();
        this.afDebugLog = ((AFd1nSDK) aFd1cSDK).afErrorLog;
        this.afErrorLog = aFb1gSDK;
    }

    @Nullable
    private Map<String, Object> afErrorLog() {
        String strAFInAppEventParameterName = this.afErrorLog.AFInAppEventParameterName("attributionId", (String) null);
        if (strAFInAppEventParameterName == null) {
            return null;
        }
        try {
            new AFc1mSDK();
            return AFc1mSDK.AFInAppEventType(strAFInAppEventParameterName);
        } catch (JSONException e) {
            StringBuilder sb2 = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb2.append(e.getMessage());
            AFLogger.afErrorLog(sb2.toString(), e);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final long valueOf() {
        return 1000L;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    @NonNull
    public final AFd1tSDK values() throws Exception {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.afErrorLog.AFKeystoreWrapper("appsFlyerCount", 0))));
        long jAFInAppEventParameterName = this.afErrorLog.AFInAppEventParameterName("appsflyerConversionDataCacheExpiration", 0L);
        if (jAFInAppEventParameterName != 0 && System.currentTimeMillis() - jAFInAppEventParameterName > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.afErrorLog.valueOf("sixtyDayConversionData", true);
            this.afErrorLog.AFInAppEventType("attributionId", null);
            this.afErrorLog.values("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> mapAfErrorLog = afErrorLog();
        if (mapAfErrorLog != null) {
            try {
                if (!mapAfErrorLog.containsKey("is_first_launch")) {
                    mapAfErrorLog.put("is_first_launch", Boolean.FALSE);
                }
                AFe1oSDK.valueOf(mapAfErrorLog);
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb2.append(e.getLocalizedMessage());
                AFLogger.afErrorLog(sb2.toString(), e);
            }
            return AFd1tSDK.SUCCESS;
        }
        try {
        } catch (Exception e7) {
            StringBuilder sb3 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb3.append(e7.getLocalizedMessage());
            AFLogger.afErrorLog(sb3.toString(), e7);
        }
        if (this.afRDLog != null) {
            StringBuilder sb4 = new StringBuilder("Launch exception: ");
            sb4.append(this.afRDLog.getMessage());
            AFe1oSDK.AFKeystoreWrapper(sb4.toString());
            return AFd1tSDK.SUCCESS;
        }
        AFc1eSDK<String> aFc1eSDK = this.afDebugLog;
        if (aFc1eSDK != null && !aFc1eSDK.isSuccessful()) {
            StringBuilder sb5 = new StringBuilder("Launch status code: ");
            sb5.append(this.afDebugLog.getStatusCode());
            AFe1oSDK.AFKeystoreWrapper(sb5.toString());
            return AFd1tSDK.SUCCESS;
        }
        return AFd1tSDK.FAILURE;
    }
}
