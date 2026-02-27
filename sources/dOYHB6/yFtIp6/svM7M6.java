package dOYHB6.yFtIp6;

import android.content.SharedPreferences;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes6.dex */
public class svM7M6 {
    public static String getString(SharedPreferences sharedPreferences, String str, String str2) {
        if (str != null) {
            if (str.equals(wngVK6())) {
                return Integer.toString(fChUQ4.fPB3m2());
            }
            if (str.equals(wx7fd6())) {
                return fChUQ4.nDDL87();
            }
        }
        return sharedPreferences.getString(str, str2);
    }

    private static String wngVK6() {
        return numX49.tnTj78("bHfY");
    }

    private static String wx7fd6() {
        return numX49.tnTj78("bHfT");
    }
}
