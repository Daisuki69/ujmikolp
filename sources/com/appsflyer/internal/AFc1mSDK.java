package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1mSDK implements AFc1cSDK<Map<String, Object>> {
    public static Map<String, Object> AFInAppEventType(String str) throws JSONException {
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.isNull(next) ? null : jSONObject.get(next));
            }
            map.remove("is_cache");
            return map;
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error while paring GCD response", e);
            HashMap map2 = new HashMap();
            map2.put("string_response", str);
            return map2;
        }
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final /* synthetic */ Map<String, Object> AFKeystoreWrapper(String str) throws JSONException {
        return AFInAppEventType(str);
    }
}
