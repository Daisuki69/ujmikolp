package com.dynatrace.android.agent.conf;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class BuilderUtil {
    public static String getVerifiedBeaconUrl(String str) {
        String strTrimString = trimString(str);
        if (strTrimString == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("^(https?://)?([^\\s/$.?#](?::?[^\\s?]*\\@)?[^\\s/:?]*(?::[\\d]+)?)(?:/|$)([^\\s?]*)").matcher(strTrimString);
        matcher.find();
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        String strGroup3 = matcher.group(3);
        if (strGroup2 == null || strGroup2.isEmpty() || strGroup3 == null || strGroup3.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (strGroup == null) {
            strGroup = "https://";
        }
        sb2.append(strGroup);
        sb2.append(strGroup2);
        if (!strGroup3.isEmpty()) {
            sb2.append("/");
            if (strGroup3.endsWith("/")) {
                sb2.append((CharSequence) strGroup3, 0, strGroup3.length() - 1);
            } else {
                sb2.append(strGroup3);
            }
        }
        return sb2.toString();
    }

    public static String trimString(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() > 0) {
            return strTrim;
        }
        return null;
    }

    public static String[] trimStrings(String str, String str2) {
        if (str == null) {
            return null;
        }
        return trimStrings(str.split(str2));
    }

    public static String[] trimStrings(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                String strTrim = str.trim();
                if (strTrim.length() > 0) {
                    arrayList.add(strTrim);
                }
            }
        }
        if (arrayList.size() > 0) {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }
}
