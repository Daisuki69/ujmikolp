package n0;

import D.S;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import java.net.URLDecoder;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static Bundle a(String str, boolean z4) {
        if (str == null) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        try {
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
            urlQuerySanitizer.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
            urlQuerySanitizer.parseUrl(str);
            for (String str2 : urlQuerySanitizer.getParameterSet()) {
                String strD = d(str2, urlQuerySanitizer, false);
                if (strD != null) {
                    if (z4 || str2.equals("wzrk_c2a")) {
                        bundle.putString(str2, strD);
                    } else {
                        bundle.putString(str2, URLDecoder.decode(strD, "UTF-8"));
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }

    public static JSONObject b(Uri uri) {
        JSONObject jSONObject = new JSONObject();
        try {
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
            urlQuerySanitizer.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer.parseUrl(uri.toString());
            String strC = c("source", urlQuerySanitizer);
            String strC2 = c("medium", urlQuerySanitizer);
            String strC3 = c("campaign", urlQuerySanitizer);
            jSONObject.put("us", strC);
            jSONObject.put("um", strC2);
            jSONObject.put("uc", strC3);
            String strD = d("wzrk_".concat("medium"), urlQuerySanitizer, true);
            if (strD != null && strD.matches("^email$|^social$|^search$")) {
                jSONObject.put("wm", strD);
            }
            S.b("Referrer data: " + jSONObject.toString(4));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static String c(String str, UrlQuerySanitizer urlQuerySanitizer) {
        String strD = d("utm_".concat(str), urlQuerySanitizer, true);
        if (strD != null) {
            return strD;
        }
        String strD2 = d("wzrk_".concat(str), urlQuerySanitizer, true);
        if (strD2 != null) {
            return strD2;
        }
        return null;
    }

    public static String d(String str, UrlQuerySanitizer urlQuerySanitizer, boolean z4) {
        if (str != null) {
            try {
                String value = urlQuerySanitizer.getValue(str);
                if (value != null) {
                    return (!z4 || value.length() <= 120) ? value : value.substring(0, 120);
                }
            } catch (Throwable th2) {
                S.o("Couldn't parse the URI", th2);
            }
        }
        return null;
    }
}
