package dOYHB6.yFtIp6;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import dOYHB6.lPFdA1;
import dOYHB6.qOnQ39.qOnQ39;
import dOYHB6.spsrN3.jHyoO3;
import dOYHB6.tiZVw8.numX49;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class iYyaV5 {
    private static String cxAXW5() {
        return numX49.tnTj78("bHfj");
    }

    private static Locale e7tYY6(Context context) {
        Resources system;
        Configuration configuration;
        if (context == null || (system = Resources.getSystem()) == null || (configuration = system.getConfiguration()) == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 24) {
            return configuration.locale;
        }
        LocaleList locales = configuration.getLocales();
        if (locales == null || locales.size() == 0) {
            return null;
        }
        return locales.get(0);
    }

    public static String[] getLocalizedMessage(Context context, String str) {
        byte[] bArrUxZzb2;
        String strTnTj78 = numX49.tnTj78("bHfS");
        if (lPFdA1.isNullOrEmpty(str) || context == null || (bArrUxZzb2 = qOnQ39.uxZzb2(str, null)) == null) {
            return null;
        }
        String str2 = new String(bArrUxZzb2, StandardCharsets.UTF_8);
        if (lPFdA1.isNullOrEmpty(str2)) {
            return null;
        }
        String strIntern = jHyoO3.uLZH83(str2).intern();
        Locale localeE7tYY6 = e7tYY6(context);
        if (localeE7tYY6 == null) {
            return null;
        }
        String language = localeE7tYY6.getLanguage();
        if (lPFdA1.isNullOrEmpty(language)) {
            return null;
        }
        String country = localeE7tYY6.getCountry();
        try {
            JSONObject jSONObject = new JSONObject(strIntern);
            String str3 = language.toLowerCase() + strTnTj78 + country.toLowerCase();
            String string = jSONObject.has(str3) ? jSONObject.getString(str3) : null;
            if (lPFdA1.isNullOrEmpty(string)) {
                String lowerCase = language.toLowerCase();
                String string2 = jSONObject.has(lowerCase) ? jSONObject.getString(lowerCase) : null;
                if (lPFdA1.isNullOrEmpty(string2)) {
                    String str4 = lowerCase + strTnTj78;
                    string = jSONObject.has(str4) ? jSONObject.getString(str4) : null;
                    if (lPFdA1.isNullOrEmpty(string)) {
                        return null;
                    }
                } else {
                    string = string2;
                }
            }
            JSONObject jSONObject2 = new JSONObject(string);
            return new String[]{jSONObject2.getString(lOxmj8()), jSONObject2.getString(cxAXW5())};
        } catch (JSONException e) {
            return null;
        }
    }

    private static String lOxmj8() {
        return numX49.tnTj78("bHfV");
    }
}
