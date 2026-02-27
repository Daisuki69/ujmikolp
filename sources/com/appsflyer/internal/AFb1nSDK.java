package com.appsflyer.internal;

import androidx.annotation.Nullable;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1nSDK {

    @Nullable
    public final AFb1pSDK AFInAppEventType;

    @Nullable
    public final AFb1oSDK values;

    public AFb1nSDK() {
    }

    public static boolean AFKeystoreWrapper(@Nullable String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean values(@Nullable String str) {
        return str == null || str.length() == 0;
    }

    public final int hashCode() {
        AFb1oSDK aFb1oSDK = this.values;
        if (aFb1oSDK != null) {
            return aFb1oSDK.hashCode();
        }
        return 0;
    }

    public AFb1nSDK(JSONObject jSONObject) {
        AFb1oSDK aFb1oSDK;
        AFb1pSDK aFb1pSDK = null;
        if (jSONObject.has("exc_mngr")) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.getJSONArray("exc_mngr").optJSONObject(0).optJSONObject("data");
                Objects.requireNonNull(jSONObjectOptJSONObject);
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("v1");
                aFb1oSDK = new AFb1oSDK(jSONObjectOptJSONObject2.getString("sdk_ver"), jSONObjectOptJSONObject2.optInt("min", -1), jSONObjectOptJSONObject2.optInt("expire", -1));
            } catch (NullPointerException | JSONException unused) {
                aFb1oSDK = null;
            }
        } else {
            aFb1oSDK = null;
        }
        if (jSONObject.has("meta_data")) {
            try {
                JSONObject jSONObjectOptJSONObject3 = jSONObject.getJSONArray("meta_data").optJSONObject(0).optJSONObject("data");
                Objects.requireNonNull(jSONObjectOptJSONObject3);
                aFb1pSDK = new AFb1pSDK(jSONObjectOptJSONObject3.optJSONObject("v1").optDouble("send_rate", 1.0d));
            } catch (NullPointerException | JSONException unused2) {
            }
        }
        this.values = aFb1oSDK;
        this.AFInAppEventType = aFb1pSDK;
    }
}
