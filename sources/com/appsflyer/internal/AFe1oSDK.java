package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1oSDK {
    public String valueOf;
    public final WeakReference<Context> values;

    public AFe1oSDK() {
    }

    public static void AFKeystoreWrapper(String str) {
        if (AFb1wSDK.AFInAppEventType != null) {
            AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            AFb1wSDK.AFInAppEventType.onConversionDataFail(str);
        }
    }

    public static void valueOf(Map<String, Object> map) {
        if (AFb1wSDK.AFInAppEventType != null) {
            StringBuilder sb2 = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
            sb2.append(map.toString());
            AFLogger.afDebugLog(sb2.toString());
            AFb1wSDK.AFInAppEventType.onConversionDataSuccess(map);
        }
    }

    public AFe1oSDK(Context context) {
        this.values = new WeakReference<>(context);
    }
}
