package com.appsflyer.internal;

import android.content.pm.PackageItemInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1bSDK {
    private static String valueOf = "230";
    private Bundle AFInAppEventParameterName = null;
    public final AFb1gSDK AFInAppEventType;
    public final AFc1xSDK values;

    public AFb1bSDK(AFc1xSDK aFc1xSDK, AFb1gSDK aFb1gSDK) {
        this.values = aFc1xSDK;
        this.AFInAppEventType = aFb1gSDK;
    }

    public static String valueOf() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    @Nullable
    public final String AFInAppEventParameterName(String str) {
        Object obj;
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = ((PackageItemInfo) this.values.AFKeystoreWrapper.getPackageManager().getApplicationInfo(this.values.AFKeystoreWrapper.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.AFInAppEventParameterName;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Could not load manifest metadata!");
            sb2.append(th2.getMessage());
            AFLogger.afErrorLog(sb2.toString(), th2);
            return null;
        }
    }

    public final boolean AFKeystoreWrapper(String str) {
        String strAFInAppEventParameterName = AFInAppEventParameterName(str);
        if (strAFInAppEventParameterName != null) {
            return Boolean.parseBoolean(strAFInAppEventParameterName);
        }
        return false;
    }

    public final String values() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = AFInAppEventParameterName("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    @Nullable
    public static String AFKeystoreWrapper() {
        StringBuilder sb2 = new StringBuilder("version: 6.10.1 (build ");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
