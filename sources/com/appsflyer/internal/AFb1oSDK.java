package com.appsflyer.internal;

import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1oSDK {
    public final String AFInAppEventParameterName;
    public final int AFKeystoreWrapper;
    public final int valueOf;

    public AFb1oSDK() {
    }

    @Nullable
    public static JSONObject AFInAppEventParameterName(String str) {
        JSONObject jSONObjectValueOf = AFa1mSDK.valueOf(str);
        if (jSONObjectValueOf != null) {
            try {
                boolean z4 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
                boolean zOptBoolean = jSONObjectValueOf.optBoolean("monitor", false);
                AFb1rSDK level = AFb1wSDK.AFKeystoreWrapper().valueOf().getLevel();
                if (!zOptBoolean || z4) {
                    level.AFKeystoreWrapper();
                    level.AFInAppEventType();
                } else {
                    level.valueOf();
                }
                if (jSONObjectValueOf.has("ol_id")) {
                    String strOptString = jSONObjectValueOf.optString("ol_scheme", null);
                    String strOptString2 = jSONObjectValueOf.optString("ol_domain", null);
                    String strOptString3 = jSONObjectValueOf.optString("ol_ver", null);
                    if (strOptString != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, strOptString);
                    }
                    if (strOptString2 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, strOptString2);
                    }
                    if (strOptString3 != null) {
                        AppsFlyerProperties.getInstance().set("onelinkVersion", strOptString3);
                        return jSONObjectValueOf;
                    }
                }
            } catch (Throwable th2) {
                StringBuilder sb2 = new StringBuilder("Error in handleResponse: ");
                sb2.append(th2.getMessage());
                AFLogger.afErrorLogForExcManagerOnly(sb2.toString(), th2);
                AFb1wSDK.AFKeystoreWrapper().valueOf().getLevel().AFKeystoreWrapper();
                AFb1wSDK.AFKeystoreWrapper().valueOf().getLevel().AFInAppEventType();
            }
        }
        return jSONObjectValueOf;
    }

    public final int hashCode() {
        String str = this.AFInAppEventParameterName;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.AFKeystoreWrapper) * 31) + this.valueOf;
    }

    public final String valueOf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.AFInAppEventParameterName);
            jSONObject.put("min", this.AFKeystoreWrapper);
            jSONObject.put("expire", this.valueOf);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public AFb1oSDK(String str, int i, int i4) {
        this.AFInAppEventParameterName = str;
        this.AFKeystoreWrapper = i;
        this.valueOf = i4;
    }
}
