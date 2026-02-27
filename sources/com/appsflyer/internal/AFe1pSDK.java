package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1pSDK {
    private static final long valueOf = TimeUnit.HOURS.toSeconds(24);
    private final AFe1vSDK AFKeystoreWrapper;
    private final AFb1bSDK values;

    public AFe1pSDK(AFb1bSDK aFb1bSDK, AFe1vSDK aFe1vSDK) {
        this.values = aFb1bSDK;
        this.AFKeystoreWrapper = aFe1vSDK;
    }

    public final boolean AFInAppEventParameterName() {
        return Boolean.parseBoolean(this.values.AFInAppEventParameterName("com.appsflyer.rc.sandbox"));
    }

    public final boolean AFInAppEventType() {
        return Boolean.parseBoolean(this.values.AFInAppEventParameterName("com.appsflyer.rc.staging"));
    }

    public final long AFKeystoreWrapper() {
        String strAFInAppEventParameterName = this.values.AFInAppEventParameterName("com.appsflyer.rc.cache.max-age-fallback");
        if (strAFInAppEventParameterName == null) {
            return valueOf;
        }
        try {
            return Long.parseLong(strAFInAppEventParameterName);
        } catch (NumberFormatException e) {
            StringBuilder sb2 = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
            sb2.append(e.getMessage());
            AFLogger.afErrorLog(sb2.toString(), e);
            return valueOf;
        }
    }

    public final boolean valueOf() {
        if (this.AFKeystoreWrapper.AFInAppEventType == null) {
            AFLogger.afInfoLog("CFG: active config is missing - fetching from CDN");
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        AFe1vSDK aFe1vSDK = this.AFKeystoreWrapper;
        return jCurrentTimeMillis - aFe1vSDK.valueOf > TimeUnit.SECONDS.toMillis(aFe1vSDK.values);
    }
}
