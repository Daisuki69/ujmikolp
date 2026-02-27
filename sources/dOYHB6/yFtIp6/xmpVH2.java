package dOYHB6.yFtIp6;

import android.os.Bundle;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
class xmpVH2 {
    xmpVH2() {
    }

    static Bundle mQ1R12(String str) {
        Bundle bundle = new Bundle();
        if (str == null || str.isEmpty()) {
            return bundle;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
            return bundle;
        } catch (JSONException e) {
            return bundle;
        }
    }

    static String vOIdk5(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, JSONObject.wrap(bundle.get(str)));
            } catch (JSONException e) {
            }
        }
        return jSONObject.toString();
    }

    private static String zMmdx0() {
        return xmpVH2.class.getSimpleName();
    }
}
