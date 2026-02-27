package dOYHB6;

import Ef.a;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.Global;
import dOYHB6.speLp8.fChUQ4;

/* JADX INFO: loaded from: classes6.dex */
public class mM0wQ9 {
    private static final int STACK_TRACE_LEVELS_UP = 4;
    private static boolean lowLevelLogDisabled;
    private static Boolean lowLevelLogDisabledInitialized = Boolean.FALSE;
    private static final Object initLock = new Object();
    private static boolean loggingDisabled = false;

    public static void d(String str) {
        nativeLog(a.c, null, str, false, null);
    }

    public static void d(String str, String str2) {
        nativeLog(a.c, str, str2, false, null);
    }

    public static void d(String str, String str2, Throwable th2) {
        nativeLog(a.c, str, str2, false, th2);
    }

    public static void d(String str, Throwable th2) {
        nativeLog(a.c, null, str, false, th2);
    }

    public static void e(String str) {
        nativeLog(ExifInterface.LONGITUDE_EAST, null, str, false, null);
    }

    public static void e(String str, String str2) {
        nativeLog(ExifInterface.LONGITUDE_EAST, str, str2, false, null);
    }

    public static void e(String str, String str2, Throwable th2) {
        nativeLog(ExifInterface.LONGITUDE_EAST, str, str2, false, th2);
    }

    public static void e(String str, Throwable th2) {
        nativeLog(ExifInterface.LONGITUDE_EAST, null, str, false, th2);
    }

    private static boolean fooh79() {
        if (!lowLevelLogDisabledInitialized.booleanValue()) {
            synchronized (initLock) {
                lowLevelLogDisabled = fChUQ4.fGzFj1();
                lowLevelLogDisabledInitialized = Boolean.TRUE;
            }
        }
        if (lowLevelLogDisabled) {
            return false;
        }
        return !loggingDisabled;
    }

    public static void gLDiS4(String str, Throwable th2) {
        String stackTraceString = Log.getStackTraceString(th2.getCause());
        String stackTraceString2 = Log.getStackTraceString(th2);
        if (stackTraceString == null || stackTraceString.length() <= 0) {
            stackTraceString = "No inner cause";
        }
        e(str, stackTraceString2 + "\nThe inner Cause is : " + stackTraceString);
    }

    public static void gLDiS4(Throwable th2) {
        String stackTraceString = Log.getStackTraceString(th2.getCause());
        String tag = getTag(Thread.currentThread().getStackTrace()[4]);
        String stackTraceString2 = Log.getStackTraceString(th2);
        if (stackTraceString == null || stackTraceString.length() <= 0) {
            stackTraceString = "No inner cause";
        }
        e(tag, stackTraceString2 + "\nThe inner Cause is : " + stackTraceString);
    }

    private static String getTag(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        int iLastIndexOf = className.lastIndexOf(".");
        return className.substring(iLastIndexOf + 1, (className.length() + (-1)) - iLastIndexOf > 23 ? iLastIndexOf + 24 : className.length());
    }

    public static void i(String str) {
        nativeLog("I", null, str, false, null);
    }

    public static void i(String str, String str2) {
        nativeLog("I", str, str2, false, null);
    }

    public static void i(String str, String str2, Throwable th2) {
        nativeLog("I", str, str2, false, th2);
    }

    public static void i(String str, Throwable th2) {
        nativeLog("I", null, str, false, th2);
    }

    private static void nativeLog(String str, String str2, String str3, boolean z4, Throwable th2) {
        try {
            if (fooh79()) {
                StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
                String fileName = stackTraceElement.getFileName();
                String str4 = fileName == null ? "" : fileName;
                int lineNumber = stackTraceElement.getLineNumber();
                String methodName = stackTraceElement.getMethodName();
                if (th2 != null) {
                    str3 = str3 + Global.NEWLINE + Log.getStackTraceString(th2);
                }
                str3 = str3.replace("%", "%%");
                fChUQ4.b2gqS6(str, str2 == null ? getTag(stackTraceElement) : str2, str4, lineNumber, methodName + "()", z4, str3);
            }
        } catch (UnsatisfiedLinkError e) {
            if (str2 == null) {
                str2 = getTag(Thread.currentThread().getStackTrace()[4]);
            }
            Log.e(str2, str3);
        }
    }

    public static void q3sUN7() {
        loggingDisabled = true;
    }

    public static void rhaCw6() {
        loggingDisabled = false;
    }

    public static void v(String str) {
        nativeLog(a.c, null, str, false, null);
    }

    public static void v(String str, String str2) {
        nativeLog(a.c, str, str2, false, null);
    }

    public static void v(String str, String str2, Throwable th2) {
        nativeLog(a.c, str, str2, false, th2);
    }

    public static void v(String str, Throwable th2) {
        nativeLog(a.c, null, str, false, th2);
    }

    public static void w(String str) {
        nativeLog(ExifInterface.LONGITUDE_WEST, null, str, false, null);
    }

    public static void w(String str, String str2) {
        nativeLog(ExifInterface.LONGITUDE_WEST, str, str2, false, null);
    }

    public static void w(String str, String str2, Throwable th2) {
        nativeLog(ExifInterface.LONGITUDE_WEST, str, str2, false, th2);
    }

    public static void w(String str, Throwable th2) {
        nativeLog(ExifInterface.LONGITUDE_WEST, null, str, false, th2);
    }

    public static void wtf(String str) {
        nativeLog(ExifInterface.LONGITUDE_EAST, null, str, false, null);
    }

    public static void wtf(String str, String str2) {
        nativeLog(ExifInterface.LONGITUDE_EAST, str, str2, false, null);
    }

    public static void wtf(String str, String str2, Throwable th2) {
        nativeLog(ExifInterface.LONGITUDE_EAST, str, str2, false, th2);
    }

    public static void wtf(String str, Throwable th2) {
        nativeLog(ExifInterface.LONGITUDE_EAST, null, str, false, th2);
    }

    public static void xFRsG8(String str) {
        nativeLog(ExifInterface.LONGITUDE_EAST, null, str, true, null);
    }

    public static void xFRsG8(String str, Throwable th2) {
        nativeLog(ExifInterface.LONGITUDE_EAST, null, str, true, th2);
    }

    public static void yLol14(String str) {
        nativeLog(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, null, str, false, null);
    }

    public static void yLol14(String str, String str2) {
        nativeLog(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, str, str2, false, null);
    }

    public static void yLol14(String str, String str2, Throwable th2) {
        nativeLog(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, str, str2, false, th2);
    }

    public static void yLol14(String str, Throwable th2) {
        nativeLog(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, null, str, false, th2);
    }
}
