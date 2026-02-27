package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.dynatrace.android.agent.Global;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1mSDK extends AFd1nSDK<Map<String, Object>> {
    private static final List<String> afRDLog = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private final AFb1bSDK AFLogger$LogLevel;
    private final AFe1jSDK AFVersionDeclaration;

    @Nullable
    private String AppsFlyer2dXConversionCallback;
    private final AFb1gSDK afErrorLogForExcManagerOnly;

    @Nullable
    private Map<String, Object> afWarnLog;
    private final AFc1pSDK getLevel;

    public AFe1mSDK(@NonNull AFc1zSDK aFc1zSDK) {
        super(AFd1uSDK.GCDSDK, new AFd1uSDK[]{AFd1uSDK.RC_CDN}, aFc1zSDK, "GCD-FETCH");
        this.getLevel = aFc1zSDK.values();
        this.afErrorLogForExcManagerOnly = aFc1zSDK.afDebugLog();
        this.AFVersionDeclaration = aFc1zSDK.afRDLog();
        this.AFLogger$LogLevel = aFc1zSDK.valueOf();
        this.AFInAppEventType.add(AFd1uSDK.CONVERSION);
        this.AFInAppEventType.add(AFd1uSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1wSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1wSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        Map<String, Object> map = this.afWarnLog;
        String str = this.AppsFlyer2dXConversionCallback;
        if (map != null) {
            AFe1oSDK.valueOf(map);
        } else if (str == null || str.isEmpty()) {
            AFe1oSDK.AFKeystoreWrapper("Unknown error");
        } else {
            AFe1oSDK.AFKeystoreWrapper(str);
        }
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afErrorLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    @Nullable
    public final AppsFlyerRequestListener afInfoLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1wSDK
    @NonNull
    public final AFd1tSDK values() throws Exception {
        AFd1tSDK aFd1tSDK;
        if (((AFd1nSDK) this).AFLogger.AFInAppEventParameterName()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.AppsFlyer2dXConversionCallback = "'isStopTracking' enabled";
            throw new AFd1qSDK();
        }
        AFd1tSDK aFd1tSDK2 = AFd1tSDK.FAILURE;
        int i = 0;
        while (i <= 2) {
            boolean z4 = i >= 2;
            this.AFVersionDeclaration.afWarnLog = System.currentTimeMillis();
            try {
                try {
                    try {
                        AFd1tSDK aFd1tSDKValues = super.values();
                        ResponseNetwork responseNetwork = ((AFd1nSDK) this).afErrorLog;
                        if (responseNetwork != null) {
                            int statusCode = responseNetwork.getStatusCode();
                            boolean z5 = statusCode == 403 || statusCode >= 500;
                            if (responseNetwork.isSuccessful() || statusCode == 404) {
                                Map<String, Object> map = (Map) responseNetwork.getBody();
                                int statusCode2 = responseNetwork.getStatusCode();
                                Boolean bool = (Boolean) map.get("iscache");
                                if (statusCode2 == 404) {
                                    map.remove("error_reason");
                                    map.remove("status_code");
                                    map.put("af_status", "Organic");
                                    map.put("af_message", "organic install");
                                }
                                if (bool != null && !bool.booleanValue()) {
                                    this.afErrorLogForExcManagerOnly.values("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                                }
                                if (map.containsKey("af_siteid")) {
                                    if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                        StringBuilder sb2 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                        sb2.append(map.get(AFInAppEventParameterName.AF_CHANNEL));
                                        AFLogger.afDebugLog(sb2.toString());
                                    } else {
                                        AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                    }
                                }
                                map.put("is_first_launch", Boolean.FALSE);
                                this.afErrorLogForExcManagerOnly.AFInAppEventType("attributionId", new JSONObject(map).toString());
                                if (!this.afErrorLogForExcManagerOnly.AFKeystoreWrapper("sixtyDayConversionData")) {
                                    map.put("is_first_launch", Boolean.TRUE);
                                }
                                this.afWarnLog = map;
                                aFd1tSDK = AFd1tSDK.SUCCESS;
                            } else {
                                if (!z4) {
                                    if (!z5) {
                                    }
                                }
                                this.AppsFlyer2dXConversionCallback = "Error connection to server: ".concat(String.valueOf(statusCode));
                                aFd1tSDK = AFd1tSDK.FAILURE;
                            }
                            return aFd1tSDK;
                        }
                        aFd1tSDK2 = aFd1tSDKValues;
                    } catch (AFd1rSDK e) {
                        AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                        this.AppsFlyer2dXConversionCallback = "AppsFlyer dev key is missing";
                        throw e;
                    }
                } catch (Exception e7) {
                    StringBuilder sb3 = new StringBuilder("[GCD] Error: ");
                    sb3.append(e7.getMessage());
                    AFLogger.afErrorLog(sb3.toString(), e7);
                    AFd1tSDK aFd1tSDK3 = AFd1tSDK.FAILURE;
                    if (z4) {
                        this.AppsFlyer2dXConversionCallback = e7.getMessage();
                        throw e7;
                    }
                    this.AFVersionDeclaration.AFKeystoreWrapper(i);
                    AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                    aFd1tSDK2 = aFd1tSDK3;
                }
                i++;
            } finally {
                this.AFVersionDeclaration.AFKeystoreWrapper(i);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
            }
        }
        return aFd1tSDK2;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1iSDK<Map<String, Object>> AFInAppEventParameterName(@NonNull String str) {
        String strConcat;
        String strAFInAppEventParameterName = AFb1wSDK.AFInAppEventParameterName(this.afErrorLogForExcManagerOnly, this.AFLogger$LogLevel.values());
        if (strAFInAppEventParameterName == null || strAFInAppEventParameterName.trim().isEmpty()) {
            strConcat = "";
        } else if (afRDLog.contains(strAFInAppEventParameterName.toLowerCase())) {
            AFLogger.afWarnLog("[GCD] AF detected using redundant Google-Play channel for attribution - " + strAFInAppEventParameterName + ". Using without channel postfix.");
            strConcat = "";
        } else {
            strConcat = Global.HYPHEN.concat(strAFInAppEventParameterName);
        }
        AFc1iSDK<Map<String, Object>> aFc1iSDKValueOf = this.getLevel.valueOf(strConcat, str);
        StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
        sb2.append(aFc1iSDKValueOf.AFKeystoreWrapper.AFInAppEventType());
        AFc1vSDK.AFInAppEventType(sb2.toString());
        return aFc1iSDKValueOf;
    }
}
