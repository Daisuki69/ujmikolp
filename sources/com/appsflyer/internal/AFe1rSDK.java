package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFd1vSDK.AnonymousClass2;
import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1rSDK {

    @VisibleForTesting
    public static String AFInAppEventParameterName;
    public final AFb1gSDK AFKeystoreWrapper;

    static {
        StringBuilder sb2 = new StringBuilder("https://%sregister.%s/api/v");
        sb2.append(AFb1wSDK.AFKeystoreWrapper);
        AFInAppEventParameterName = sb2.toString();
    }

    public AFe1rSDK(@NonNull Context context) {
        this.AFKeystoreWrapper = AFb1wSDK.AFKeystoreWrapper().AFInAppEventParameterName(context);
    }

    public static void AFInAppEventParameterName(String str) {
        AFc1zSDK aFc1zSDKValueOf = AFb1wSDK.AFKeystoreWrapper().valueOf();
        AFd1bSDK aFd1bSDK = new AFd1bSDK(str, aFc1zSDKValueOf);
        AFd1vSDK aFd1vSDKAFLogger = aFc1zSDKValueOf.AFLogger();
        aFd1vSDKAFLogger.values.execute(aFd1vSDKAFLogger.new AnonymousClass2(aFd1bSDK));
    }

    public static boolean AFInAppEventType(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
            return AFa1cSDK.values(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", th2);
            return false;
        }
    }

    public static boolean AFInAppEventType(@NonNull SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("sentRegisterRequestToAF", false);
    }

    @Nullable
    public final AFb1sSDK AFInAppEventType() {
        String string;
        String string2;
        String strAFInAppEventParameterName = this.AFKeystoreWrapper.AFInAppEventParameterName("afUninstallToken", (String) null);
        long jAFInAppEventParameterName = this.AFKeystoreWrapper.AFInAppEventParameterName("afUninstallToken_received_time", 0L);
        boolean zAFKeystoreWrapper = this.AFKeystoreWrapper.AFKeystoreWrapper("afUninstallToken_queued");
        this.AFKeystoreWrapper.valueOf("afUninstallToken_queued", false);
        if (strAFInAppEventParameterName == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            strAFInAppEventParameterName = string2.split(",")[r0.length - 1];
        }
        if (jAFInAppEventParameterName == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit = string.split(",");
            if (strArrSplit.length >= 2) {
                try {
                    jAFInAppEventParameterName = Long.parseLong(strArrSplit[strArrSplit.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (strAFInAppEventParameterName != null) {
            return new AFb1sSDK(strAFInAppEventParameterName, jAFInAppEventParameterName, zAFKeystoreWrapper);
        }
        return null;
    }
}
