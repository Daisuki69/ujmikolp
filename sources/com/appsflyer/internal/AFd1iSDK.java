package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.dynatrace.android.agent.Global;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1iSDK extends AFd1nSDK<String> {
    private final AFe1aSDK afRDLog;

    public AFd1iSDK(@NonNull AFe1aSDK aFe1aSDK, @NonNull AFc1zSDK aFc1zSDK) {
        AFd1uSDK aFd1uSDK = aFe1aSDK.afErrorLogForExcManagerOnly;
        AFd1uSDK aFd1uSDK2 = aFd1uSDK == null ? AFd1uSDK.CACHED_EVENT : aFd1uSDK;
        AFd1uSDK[] aFd1uSDKArr = {AFd1uSDK.RC_CDN};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aFe1aSDK.afDebugLog);
        sb2.append(Global.HYPHEN);
        sb2.append(valueOf(aFe1aSDK));
        super(aFd1uSDK2, aFd1uSDKArr, aFc1zSDK, sb2.toString(), aFe1aSDK.afDebugLog);
        this.afRDLog = aFe1aSDK;
    }

    private static String valueOf(AFe1aSDK aFe1aSDK) {
        try {
            return new URL(aFe1aSDK.afInfoLog).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1iSDK<String> AFInAppEventParameterName(String str) {
        String strEncodeToString = Base64.encodeToString(this.afRDLog.AFInAppEventType(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(strEncodeToString)));
        ((AFd1nSDK) this).afDebugLog.values(this.afRDLog.afInfoLog, strEncodeToString);
        return ((AFd1nSDK) this).afInfoLog.AFKeystoreWrapper(this.afRDLog);
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afErrorLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    @Nullable
    public final AppsFlyerRequestListener afInfoLog() {
        return this.afRDLog.AFInAppEventType;
    }
}
