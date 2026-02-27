package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1pSDK {
    public final double values;

    public AFb1pSDK() {
    }

    public static void AFInAppEventParameterName(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (AFa1sSDK.AFInAppEventParameterName().AFInAppEventParameterName == null) {
            AFInAppEventType(map);
            return;
        }
        try {
            try {
                DeepLink deepLinkValueOf = DeepLink.valueOf(map);
                deepLinkValueOf.valueOf.put("is_deferred", false);
                deepLinkResult = new DeepLinkResult(deepLinkValueOf, null);
            } catch (JSONException e) {
                AFLogger.afErrorLog("[DDL] Error occurred", e, true);
                deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
            }
            AFKeystoreWrapper(deepLinkResult);
        } catch (Throwable th2) {
            AFKeystoreWrapper(new DeepLinkResult(null, null));
            throw th2;
        }
    }

    public static void AFInAppEventType(String str, DeepLinkResult.Error error) {
        if (AFa1sSDK.AFInAppEventParameterName().AFInAppEventParameterName == null) {
            AFInAppEventParameterName(str);
        } else {
            AFLogger.afDebugLog("[DDL] Error occurred: ".concat(String.valueOf(str)));
            AFKeystoreWrapper(new DeepLinkResult(null, error));
        }
    }

    public static void AFKeystoreWrapper(DeepLinkResult deepLinkResult) {
        if (AFa1sSDK.AFInAppEventParameterName().AFInAppEventParameterName == null) {
            AFLogger.afDebugLog("[DDL] skipping, no callback registered");
            return;
        }
        StringBuilder sb2 = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
        sb2.append(deepLinkResult.toString());
        AFLogger.afDebugLog(sb2.toString());
        try {
            AFa1sSDK.AFInAppEventParameterName().AFInAppEventParameterName.onDeepLinking(deepLinkResult);
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
        }
    }

    public AFb1pSDK(double d10) {
        this.values = d10;
    }

    private static void AFInAppEventType(Map<String, String> map) {
        if (AFb1wSDK.AFInAppEventType != null) {
            try {
                StringBuilder sb2 = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb2.append(map.toString());
                AFLogger.afDebugLog(sb2.toString());
                AFb1wSDK.AFInAppEventType.onAppOpenAttribution(map);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }

    private static void AFInAppEventParameterName(String str) {
        if (AFb1wSDK.AFInAppEventType != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                AFb1wSDK.AFInAppEventType.onAttributionFailure(str);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }
}
