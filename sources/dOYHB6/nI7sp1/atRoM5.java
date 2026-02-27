package dOYHB6.nI7sp1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import dOYHB6.nm8AQ4;
import dOYHB6.speLp8.fChUQ4;

/* JADX INFO: loaded from: classes6.dex */
public class atRoM5 {
    public static boolean getBool(String str, String str2, boolean z4) {
        return fChUQ4.lVVW03(str, str2, z4);
    }

    public static double getDouble(String str, String str2, double d10) {
        return fChUQ4.kMWzc4(str, str2, d10);
    }

    public static int getInt(String str, String str2, int i) {
        return fChUQ4.luCzL7(str, str2, i);
    }

    public static String getString(String str, String str2, String str3) {
        return fChUQ4.cqkqa7(str, str2, str3);
    }

    public static void hsfvW8(String str, String str2, boolean z4) {
        fChUQ4.aS1Zd9(str, str2, z4);
    }

    private static String kAmP85(String str, String str2, String str3) {
        String string;
        Context context = nm8AQ4.get();
        boolean z4 = false;
        if (context == null) {
            string = str3;
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            try {
                string = defaultSharedPreferences.getString(str2, str3);
            } catch (ClassCastException e) {
                string = str3;
            }
            if (defaultSharedPreferences.contains(str2)) {
                z4 = true;
            }
        }
        if (!z4) {
            return getString(str, str2, str3);
        }
        putString(str, str2, string);
        save(str);
        w7GYV1(context, str2);
        return string;
    }

    private static boolean mGp1i4(String str, String str2, boolean z4) {
        boolean z5;
        Context context = nm8AQ4.get();
        boolean z8 = false;
        if (context == null) {
            z5 = z4;
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            try {
                z5 = defaultSharedPreferences.getBoolean(str2, z4);
            } catch (ClassCastException e) {
                z5 = z4;
            }
            if (defaultSharedPreferences.contains(str2)) {
                z8 = true;
            }
        }
        if (!z8) {
            return getBool(str, str2, z4);
        }
        hsfvW8(str, str2, z5);
        save(str);
        w7GYV1(context, str2);
        return z5;
    }

    public static String mrWwF7(String str, String str2, String str3) {
        return kAmP85(str, str2, str3);
    }

    public static void putDouble(String str, String str2, double d10) {
        fChUQ4.bQ5Ra4(str, str2, d10);
    }

    public static void putInt(String str, String str2, int i) {
        fChUQ4.tW2Di6(str, str2, i);
    }

    public static void putString(String str, String str2, String str3) {
        fChUQ4.pvOev4(str, str2, str3);
    }

    public static void remove(String str, String str2) {
        fChUQ4.mgxgW3(str, str2);
    }

    public static void save(String str) {
        fChUQ4.lkwKX8(str);
    }

    private static void w7GYV1(Context context, String str) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    public static boolean xvP6A3(String str, String str2, boolean z4) {
        return mGp1i4(str, str2, z4);
    }
}
