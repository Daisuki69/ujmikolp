package com.appsflyer.internal;

import We.s;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.AFd1vSDK.AnonymousClass2;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.dynatrace.android.agent.Global;
import dOYHB6.yFtIp6.svM7M6;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFa1dSDK implements Runnable {
    private static String AFInAppEventType = null;

    @VisibleForTesting
    private static String values = "https://%ssdk-services.%s/validate-android-signature";
    private final Intent AFInAppEventParameterName;
    private WeakReference<Context> AFKeystoreWrapper;
    private String AFLogger;
    private String afDebugLog;
    private String afErrorLog;
    private String afInfoLog;
    private String afRDLog;
    private Map<String, String> afWarnLog;
    private String valueOf;

    static {
        StringBuilder sb2 = new StringBuilder("https://%svalidate.%s/api/v");
        sb2.append(AFb1wSDK.AFInAppEventParameterName);
        sb2.append("/androidevent?buildnumber=6.10.1&app_id=");
        AFInAppEventType = sb2.toString();
    }

    public AFa1dSDK(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, @Nullable Intent intent) {
        this.AFKeystoreWrapper = new WeakReference<>(context);
        this.valueOf = str;
        this.afDebugLog = str2;
        this.afRDLog = str4;
        this.afErrorLog = str5;
        this.afInfoLog = str6;
        this.afWarnLog = map;
        this.AFLogger = str3;
        this.AFInAppEventParameterName = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.valueOf;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.AFKeystoreWrapper.get();
            if (context == null) {
                return;
            }
            HashMap map = new HashMap();
            map.put("public-key", this.afDebugLog);
            map.put("sig-data", this.afRDLog);
            map.put("signature", this.AFLogger);
            Object map2 = new HashMap(map);
            Object obj = this.afWarnLog;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), AFb1wSDK.AFKeystoreWrapper().getHostName()));
            sb2.append(context.getPackageName());
            String string = sb2.toString();
            String string2 = svM7M6.getString(AFb1wSDK.valueOf(context), "referrer", "");
            AFa1tSDK aFf1zSDK = new AFf1zSDK(context);
            aFf1zSDK.AFLogger = string2;
            AFb1wSDK aFb1wSDKAFKeystoreWrapper = AFb1wSDK.AFKeystoreWrapper();
            Map<String, Object> mapAFInAppEventType = aFb1wSDKAFKeystoreWrapper.AFInAppEventType(aFf1zSDK);
            mapAFInAppEventType.put("price", this.afErrorLog);
            mapAFInAppEventType.put("currency", this.afInfoLog);
            mapAFInAppEventType.put("receipt_data", map2);
            if (obj != null) {
                mapAFInAppEventType.put("extra_prms", obj);
            }
            mapAFInAppEventType.putAll(aFb1wSDKAFKeystoreWrapper.valueOf().afWarnLog().AFKeystoreWrapper());
            values(context, (AFf1zSDK) aFf1zSDK.AFKeystoreWrapper((Map<String, ?>) mapAFInAppEventType).AFInAppEventParameterName(string));
            map.put("dev_key", this.valueOf);
            map.put("app_id", context.getPackageName());
            map.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            String string3 = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string3 != null) {
                map.put("advertiserId", string3);
            }
            AFf1wSDK aFf1wSDK = (AFf1wSDK) new AFf1wSDK().AFKeystoreWrapper(map).AFInAppEventParameterName(String.format(values, AppsFlyerLib.getInstance().getHostPrefix(), AFb1wSDK.AFKeystoreWrapper().getHostName()));
            final AFd1hSDK aFd1hSDKValues = values(context, aFf1wSDK);
            aFf1wSDK.AFInAppEventType = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1dSDK.3
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i, @NonNull String str2) {
                    ResponseNetwork responseNetwork;
                    if (i == RequestError.RESPONSE_CODE_FAILURE && (responseNetwork = ((AFd1nSDK) aFd1hSDKValues).afErrorLog) != null) {
                        str2 = responseNetwork.toString();
                    }
                    AFa1dSDK.values(false, AFa1dSDK.this.afRDLog, AFa1dSDK.this.afErrorLog, AFa1dSDK.this.afInfoLog, str2);
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFd1nSDK) aFd1hSDKValues).afErrorLog.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        AFa1dSDK.values(jSONObject.optBoolean("result"), AFa1dSDK.this.afRDLog, AFa1dSDK.this.afErrorLog, AFa1dSDK.this.afInfoLog, jSONObject.toString());
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e)), e);
                        AFa1dSDK.values(false, AFa1dSDK.this.afRDLog, AFa1dSDK.this.afErrorLog, AFa1dSDK.this.afInfoLog, e.getMessage());
                    }
                }
            };
        } catch (Throwable th2) {
            if (AFb1wSDK.values != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th2);
                values(false, this.afRDLog, this.afErrorLog, this.afInfoLog, th2.getMessage());
            }
            AFLogger.afErrorLog(th2.getMessage(), th2);
        }
    }

    private static AFd1hSDK values(Context context, @NonNull AFe1dSDK aFe1dSDK) {
        AFb1wSDK.AFKeystoreWrapper().AFInAppEventType(context);
        AFc1zSDK aFc1zSDKValueOf = AFb1wSDK.AFKeystoreWrapper().valueOf();
        aFe1dSDK.AFKeystoreWrapper(aFc1zSDKValueOf.valueOf().AFInAppEventType.AFKeystoreWrapper("appsFlyerCount", 0));
        AFd1hSDK aFd1hSDK = new AFd1hSDK(aFe1dSDK, aFc1zSDKValueOf);
        AFd1vSDK aFd1vSDKAFLogger = aFc1zSDKValueOf.AFLogger();
        aFd1vSDKAFLogger.values.execute(aFd1vSDKAFLogger.new AnonymousClass2(aFd1hSDK));
        return aFd1hSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void values(boolean z4, String str, String str2, String str3, String str4) {
        if (AFb1wSDK.values != null) {
            StringBuilder sbX = s.x("Validate callback parameters: ", str, Global.BLANK, str2, Global.BLANK);
            sbX.append(str3);
            AFLogger.afDebugLog(sbX.toString());
            if (z4) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFb1wSDK.values.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFb1wSDK.values;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }
}
