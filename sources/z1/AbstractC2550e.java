package z1;

import We.s;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.common.C;
import com.dynatrace.android.agent.Global;
import java.net.UnknownHostException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: z1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2550e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f21352b;
    public static final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f21353d;

    static {
        String str = Build.VERSION.CODENAME;
        int i = "S".equals(str) ? 31 : "R".equals(str) ? 30 : Build.VERSION.SDK_INT;
        f21351a = i;
        String str2 = Build.DEVICE;
        String str3 = Build.MANUFACTURER;
        f21352b = str3;
        String str4 = Build.MODEL;
        c = str4;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str4);
        sb2.append(", ");
        sb2.append(str3);
        f21353d = androidx.camera.core.impl.a.o(sb2, ", ", i);
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int b(int i, int[] iArr) {
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            return -(iBinarySearch + 2);
        }
        do {
            iBinarySearch--;
            if (iBinarySearch < 0) {
                break;
            }
        } while (iArr[iBinarySearch] == i);
        return iBinarySearch;
    }

    public static int c(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 1;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (type != 4 && type != 5) {
                    if (type != 6) {
                        return type != 9 ? 8 : 7;
                    }
                    return 5;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 20:
                    if (f21351a >= 29) {
                    }
                    break;
            }
            return 0;
        }
    }

    public static String d(StringBuilder sb2, Formatter formatter, long j) {
        long j6 = j == C.TIME_UNSET ? 0L : j;
        String str = j6 < 0 ? Global.HYPHEN : "";
        long jAbs = (Math.abs(j6) + 500) / 1000;
        long j7 = jAbs % 60;
        long j9 = (jAbs / 60) % 60;
        long j10 = jAbs / 3600;
        sb2.setLength(0);
        return j10 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j10), Long.valueOf(j9), Long.valueOf(j7)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j9), Long.valueOf(j7)).toString();
    }

    public static String e(String str) {
        String strReplace;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            String strConcat = "Failed to read system property ".concat(str);
            Throwable cause = e;
            while (true) {
                if (cause == null) {
                    strReplace = Log.getStackTraceString(e).trim().replace("\t", "    ");
                    break;
                }
                if (cause instanceof UnknownHostException) {
                    strReplace = "UnknownHostException (no network)";
                    break;
                }
                cause = cause.getCause();
            }
            if (!TextUtils.isEmpty(strReplace)) {
                StringBuilder sbV = s.v(strConcat, "\n  ");
                sbV.append(strReplace.replace(Global.NEWLINE, "\n  "));
                sbV.append('\n');
                strConcat = sbV.toString();
            }
            Log.e("Util", strConcat);
            return null;
        }
    }

    public static String f(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = Global.QUESTION;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("/");
        sb2.append(str2);
        sb2.append(" (Linux;Android ");
        return s.p(sb2, Build.VERSION.RELEASE, ") ExoPlayerLib/2.13.3");
    }

    public static void g(ArrayList arrayList, int i, int i4, int i6) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i10 = (i4 - i) - 1; i10 >= 0; i10--) {
            arrayDeque.addFirst(arrayList.remove(i + i10));
        }
        arrayList.addAll(Math.min(i6, arrayList.size()), arrayDeque);
    }
}
