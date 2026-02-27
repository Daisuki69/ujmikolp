package D;

import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.svM7M6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b0 {
    public static boolean a(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        if (!cleverTapInstanceConfig.f9447p) {
            return e(context).getBoolean(n(cleverTapInstanceConfig, str), false);
        }
        boolean z4 = e(context).getBoolean(n(cleverTapInstanceConfig, str), false);
        return !z4 ? context.getSharedPreferences(numX49.tnTj78("PePV"), 0).getBoolean(str, false) : z4;
    }

    public static int b(Context context, int i, String str) {
        return e(context).getInt(str, i);
    }

    public static int c(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        if (!cleverTapInstanceConfig.f9447p) {
            return b(context, 0, n(cleverTapInstanceConfig, str));
        }
        int iB = b(context, -1000, n(cleverTapInstanceConfig, str));
        return iB != -1000 ? iB : context.getSharedPreferences(numX49.tnTj78("PePS"), 0).getInt(str, 0);
    }

    public static long d(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        boolean z4 = cleverTapInstanceConfig.f9447p;
        String strTnTj78 = numX49.tnTj78("PePj");
        if (!z4) {
            return f(context, strTnTj78).getLong(n(cleverTapInstanceConfig, str), 0);
        }
        long j = f(context, strTnTj78).getLong(n(cleverTapInstanceConfig, str), -1000L);
        if (j != -1000) {
            return j;
        }
        return f(context, strTnTj78).getLong(str, 0);
    }

    public static SharedPreferences e(Context context) {
        return context.getSharedPreferences(numX49.tnTj78("PePd"), 0);
    }

    public static SharedPreferences f(Context context, String str) {
        return context.getSharedPreferences(str != null ? numX49.tnTj78("PePi").concat(str) : numX49.tnTj78("PePE"), 0);
    }

    public static String g(Context context, String str, String str2) {
        return svM7M6.getString(e(context), str, str2);
    }

    public static String h(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, String str2) {
        if (!cleverTapInstanceConfig.f9447p) {
            return g(context, n(cleverTapInstanceConfig, str), str2);
        }
        String strG = g(context, n(cleverTapInstanceConfig, str), str2);
        return strG != null ? strG : svM7M6.getString(context.getSharedPreferences(numX49.tnTj78("PePF"), 0), str, str2);
    }

    public static void i(SharedPreferences.Editor editor) {
        try {
            editor.apply();
        } catch (Throwable th2) {
            S.o(numX49.tnTj78("PePH"), th2);
        }
    }

    public static void j(Context context, String str, boolean z4) {
        i(e(context).edit().putBoolean(str, z4));
    }

    public static void k(Context context, int i, String str) {
        i(e(context).edit().putInt(str, i));
    }

    public static void l(Context context, String str, String str2) {
        i(e(context).edit().putString(str, str2));
    }

    public static void m(Context context, String str) {
        i(e(context).edit().remove(str));
    }

    public static String n(CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        StringBuilder sbV = We.s.v(str, numX49.tnTj78("PePO"));
        sbV.append(cleverTapInstanceConfig.f9439a);
        return sbV.toString();
    }

    public static String o(String str, String str2) {
        return androidx.camera.core.impl.a.j(str2, numX49.tnTj78("PePQ"), str);
    }
}
