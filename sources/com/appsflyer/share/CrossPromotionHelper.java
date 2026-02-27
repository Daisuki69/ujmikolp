package com.appsflyer.share;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1wSDK;
import com.appsflyer.internal.AFc1zSDK;
import com.appsflyer.internal.AFd1jSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1vSDK.AnonymousClass2;
import com.appsflyer.internal.AFe1oSDK;
import com.appsflyer.internal.AFf1pSDK;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class CrossPromotionHelper {
    private static String AFKeystoreWrapper = "https://%simpression.%s";

    @NonNull
    private static LinkGenerator AFKeystoreWrapper(@NonNull Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFKeystoreWrapper = str3;
        linkGenerator.valueOf = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            key.getClass();
            if (key.equals("app")) {
                AFf1pSDK.AFKeystoreWrapper = value;
            } else if (key.equals("impression")) {
                AFKeystoreWrapper = value;
            }
        }
    }

    private static void valueOf(@NonNull String str, @NonNull Context context, @Nullable AFe1oSDK aFe1oSDK) {
        AFb1wSDK aFb1wSDKAFKeystoreWrapper = AFb1wSDK.AFKeystoreWrapper();
        aFb1wSDKAFKeystoreWrapper.AFInAppEventType(context);
        AFc1zSDK aFc1zSDKValueOf = aFb1wSDKAFKeystoreWrapper.valueOf();
        AFd1jSDK aFd1jSDK = new AFd1jSDK(aFc1zSDKValueOf, str, aFe1oSDK);
        AFd1vSDK aFd1vSDKAFLogger = aFc1zSDKValueOf.AFLogger();
        aFd1vSDKAFLogger.values.execute(aFd1vSDKAFLogger.new AnonymousClass2(aFd1jSDK));
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator linkGeneratorAFKeystoreWrapper = AFKeystoreWrapper(context, str, str2, map, String.format(AFf1pSDK.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1wSDK.AFKeystoreWrapper().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.afInfoLog("SDK is stopped, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        valueOf(linkGeneratorAFKeystoreWrapper.generateLink(), context, new AFe1oSDK(context));
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, Promote Impression is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.afInfoLog("SDK is stopped, Promote Impression is disabled", true);
        } else {
            valueOf(AFKeystoreWrapper(context, str, str2, map, String.format(AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1wSDK.AFKeystoreWrapper().getHostName())).generateLink(), context, null);
        }
    }
}
