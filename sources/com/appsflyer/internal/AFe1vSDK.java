package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1vSDK {
    public static final Charset AFInAppEventParameterName = Charset.forName("UTF-8");
    public AFb1iSDK AFInAppEventType = AFInAppEventType();
    public final AFb1gSDK AFKeystoreWrapper;
    public long valueOf;
    public long values;

    public AFe1vSDK(AFb1gSDK aFb1gSDK) {
        this.AFKeystoreWrapper = aFb1gSDK;
        this.valueOf = aFb1gSDK.AFInAppEventParameterName("af_rc_timestamp", 0L);
        this.values = aFb1gSDK.AFInAppEventParameterName("af_rc_max_age", 0L);
    }

    @Nullable
    private AFb1iSDK AFInAppEventType() {
        String strAFInAppEventParameterName = this.AFKeystoreWrapper.AFInAppEventParameterName("af_remote_config", (String) null);
        if (strAFInAppEventParameterName == null) {
            AFLogger.afDebugLog("CFG: No configuration found in cache");
            return null;
        }
        try {
            return new AFb1iSDK(new String(Base64.decode(strAFInAppEventParameterName, 2), AFInAppEventParameterName));
        } catch (Exception e) {
            AFLogger.afErrorLog("CFG: Error reading malformed configuration from cache, requires fetching from remote again", e, true);
            return null;
        }
    }
}
