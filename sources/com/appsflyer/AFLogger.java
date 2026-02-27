package com.appsflyer;

import Ef.a;
import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import com.appsflyer.internal.AFb1eSDK;
import com.appsflyer.internal.AFb1wSDK;

/* JADX INFO: loaded from: classes2.dex */
public class AFLogger {
    private static final long AFInAppEventType = System.currentTimeMillis();

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private int AFInAppEventParameterName;

        LogLevel(int i) {
            this.AFInAppEventParameterName = i;
        }

        public final int getLevel() {
            return this.AFInAppEventParameterName;
        }
    }

    private static boolean AFInAppEventType(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
    }

    public static void AFKeystoreWrapper(String str) {
        if (AFInAppEventType(LogLevel.WARNING)) {
            Log.w("AppsFlyer_6.10.1", valueOf(str, false));
        }
        AFb1wSDK.AFKeystoreWrapper().valueOf().getLevel().AFInAppEventParameterName(ExifInterface.LONGITUDE_WEST, valueOf(str, true));
    }

    public static void afDebugLog(String str) {
        if (AFInAppEventType(LogLevel.DEBUG)) {
            Log.d("AppsFlyer_6.10.1", valueOf(str, false));
        }
        AFb1wSDK.AFKeystoreWrapper().valueOf().getLevel().AFInAppEventParameterName(a.c, valueOf(str, true));
    }

    public static void afErrorLog(String str, Throwable th2, boolean z4, boolean z5, boolean z8) {
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(th2.getClass().getSimpleName());
            sb2.append(" at ");
            sb2.append(th2.getStackTrace()[0].toString());
            str = sb2.toString();
        }
        if (AFInAppEventType(LogLevel.ERROR)) {
            String strValueOf = valueOf(str, false);
            if (z5) {
                Log.e("AppsFlyer_6.10.1", strValueOf, th2);
            } else if (z4) {
                Log.d("AppsFlyer_6.10.1", strValueOf);
            }
        }
        AFb1wSDK.AFKeystoreWrapper().valueOf().getLevel().valueOf(th2);
        Application application = AFb1eSDK.AFInAppEventParameterName;
        if (application != null) {
            SharedPreferences.Editor editorEdit = AFb1wSDK.valueOf(application).edit();
            Application application2 = AFb1eSDK.AFInAppEventParameterName;
            editorEdit.putLong("exception_number", (application2 == null ? -1L : AFb1wSDK.valueOf(application2).getLong("exception_number", 0L)) + 1).apply();
        }
        if (z8) {
            AFb1wSDK.AFKeystoreWrapper().valueOf().onInstallConversionDataLoadedNative().valueOf(th2, str);
        }
    }

    public static void afErrorLogForExcManagerOnly(String str, Throwable th2) {
        afErrorLogForExcManagerOnly(str, th2, false);
    }

    public static void afInfoLog(String str, boolean z4) {
        if (AFInAppEventType(LogLevel.INFO)) {
            Log.i("AppsFlyer_6.10.1", valueOf(str, false));
        }
        if (z4) {
            AFb1wSDK.AFKeystoreWrapper().valueOf().getLevel().AFInAppEventParameterName("I", valueOf(str, true));
        }
    }

    public static void afRDLog(String str) {
        if (AFInAppEventType(LogLevel.VERBOSE)) {
            Log.v("AppsFlyer_6.10.1", valueOf(str, false));
        }
        AFb1wSDK.AFKeystoreWrapper().valueOf().getLevel().AFInAppEventParameterName(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, valueOf(str, true));
    }

    public static void afWarnLog(String str) {
        AFKeystoreWrapper(str);
    }

    @NonNull
    private static String valueOf(String str, boolean z4) {
        if (str == null) {
            str = "null";
        }
        if (!z4 && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(System.currentTimeMillis() - AFInAppEventType);
        sb2.append(") [");
        sb2.append(Thread.currentThread().getName());
        sb2.append("] ");
        sb2.append(str);
        return sb2.toString();
    }

    private static boolean values() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void afErrorLogForExcManagerOnly(String str, Throwable th2, boolean z4) {
        afErrorLog(str, th2, false, false, !z4);
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    public static void valueOf(String str) {
        if (!values()) {
            Log.d("AppsFlyer_6.10.1", valueOf(str, false));
        }
        AFb1wSDK.AFKeystoreWrapper().valueOf().getLevel().AFInAppEventParameterName("F", str);
    }

    public static void afErrorLog(String str, Throwable th2) {
        afErrorLog(str, th2, true, false, true);
    }

    public static void afErrorLog(String str, Throwable th2, boolean z4) {
        afErrorLog(str, th2, true, z4, true);
    }

    public static void afErrorLog(String str, Throwable th2, boolean z4, boolean z5) {
        afErrorLog(str, th2, true, z4, z5);
    }

    @Deprecated
    public static void afErrorLog(Throwable th2) {
        afErrorLogForExcManagerOnly("Unknown", th2);
    }
}
