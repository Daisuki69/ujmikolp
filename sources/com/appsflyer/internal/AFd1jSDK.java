package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1jSDK extends AFd1nSDK<String> {

    @NonNull
    private final String afRDLog;

    @Nullable
    private final AFe1oSDK getLevel;

    public AFd1jSDK(@NonNull AFc1zSDK aFc1zSDK, @NonNull String str, @Nullable AFe1oSDK aFe1oSDK) {
        super(AFd1uSDK.IMPRESSIONS, new AFd1uSDK[]{AFd1uSDK.RC_CDN}, aFc1zSDK, str);
        this.afRDLog = str;
        this.getLevel = aFe1oSDK;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1iSDK<String> AFInAppEventParameterName(@NonNull String str) {
        return ((AFd1nSDK) this).afInfoLog.valueOf(this.afRDLog);
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1wSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        AFc1eSDK<Result> aFc1eSDK = ((AFd1nSDK) this).afErrorLog;
        if (aFc1eSDK != 0) {
            int statusCode = aFc1eSDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb2 = new StringBuilder("Cross promotion impressions success: ");
                sb2.append(this.afRDLog);
                AFLogger.afInfoLog(sb2.toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                StringBuilder sb3 = new StringBuilder("call to ");
                sb3.append(this.afRDLog);
                sb3.append(" failed: ");
                sb3.append(statusCode);
                AFLogger.afInfoLog(sb3.toString());
                return;
            }
            StringBuilder sb4 = new StringBuilder("Cross promotion redirection success: ");
            sb4.append(this.afRDLog);
            AFLogger.afInfoLog(sb4.toString(), false);
            String strAFInAppEventType = aFc1eSDK.AFInAppEventType(RtspHeaders.LOCATION);
            AFe1oSDK aFe1oSDK = this.getLevel;
            if (aFe1oSDK == null || strAFInAppEventType == null) {
                return;
            }
            aFe1oSDK.valueOf = strAFInAppEventType;
            Context context = aFe1oSDK.values.get();
            if (context != null) {
                try {
                    if (aFe1oSDK.valueOf != null) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFe1oSDK.valueOf)).setFlags(268435456));
                    }
                } catch (Exception e) {
                    AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e)), e);
                }
            }
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
}
