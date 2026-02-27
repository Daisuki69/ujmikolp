package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1iSDK {

    @NonNull
    public final String AFInAppEventParameterName;

    @Nullable
    public final AFb1nSDK AFInAppEventType;

    @NonNull
    public final AFf1vSDK AFKeystoreWrapper;
    private final boolean valueOf;

    @NonNull
    public final String values;

    public AFb1iSDK() {
    }

    @Nullable
    public static Uri AFKeystoreWrapper(Activity activity) {
        return activity.getReferrer();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFb1iSDK.class != obj.getClass()) {
            return false;
        }
        AFb1iSDK aFb1iSDK = (AFb1iSDK) obj;
        if (this.valueOf == aFb1iSDK.valueOf && this.AFInAppEventParameterName.equals(aFb1iSDK.AFInAppEventParameterName)) {
            return this.values.equals(aFb1iSDK.values);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.values.hashCode() + ((this.AFInAppEventParameterName.hashCode() + ((this.valueOf ? 1 : 0) * 31)) * 31);
        AFb1nSDK aFb1nSDK = this.AFInAppEventType;
        if (aFb1nSDK == null) {
            return iHashCode;
        }
        return aFb1nSDK.hashCode() + (iHashCode * 31);
    }

    public AFb1iSDK(String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.AFInAppEventParameterName = string;
            this.valueOf = jSONObject.optBoolean("test_mode");
            this.values = str;
            this.AFKeystoreWrapper = string.startsWith("default") ? AFf1vSDK.DEFAULT : AFf1vSDK.CUSTOM;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("features");
            this.AFInAppEventType = jSONObjectOptJSONObject != null ? new AFb1nSDK(jSONObjectOptJSONObject) : null;
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }
}
