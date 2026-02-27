package com.dynatrace.android.agent.util;

import We.s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.dynatrace.android.agent.Global;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"SimpleDateFormat"})
public class Utility {
    public static final int GLOBAL_CHAR_LIMIT = 250;
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "Utility");
    private static AtomicInteger eventSeqNumber = new AtomicInteger(1);
    private static AtomicLong nextTagId = new AtomicLong(0);

    public static void devLog(String str, String str2) {
        if (Global.DEBUG) {
            zlogD(str, str2);
        }
    }

    public static int getAppTargetSdk(Context context) {
        ApplicationInfo applicationInfo;
        if (context == null) {
            return 0;
        }
        try {
            applicationInfo = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(0L)) : context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
        } catch (Exception unused) {
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            return applicationInfo.targetSdkVersion;
        }
        return 0;
    }

    public static String getCPUInfo() throws Throwable {
        InputStream inputStream;
        InputStream inputStream2;
        Process processStart;
        String[] strArrSplit;
        String str = "";
        Process process = null;
        inputStream = null;
        InputStream inputStream3 = null;
        Process process2 = null;
        try {
            try {
                processStart = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            inputStream2 = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            inputStream3 = processStart.getInputStream();
            byte[] bArr = new byte[1024];
            String str2 = "";
            while (inputStream3.read(bArr) != -1) {
                str2 = str2 + new String(bArr).trim();
            }
            strArrSplit = str2.split(Global.NEWLINE);
        } catch (IOException unused3) {
            inputStream2 = inputStream3;
            process2 = processStart;
            if (process2 != null) {
                process2.destroy();
            }
            if (inputStream2 != null) {
                inputStream2.close();
            }
            return str;
        } catch (Throwable th3) {
            th = th3;
            inputStream = inputStream3;
            process = processStart;
            if (process != null) {
                process.destroy();
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
        if (strArrSplit != null && strArrSplit.length >= 1) {
            int length = strArrSplit.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String cpuInfo = parseCpuInfo(strArrSplit[i]);
                if (cpuInfo != null) {
                    str = cpuInfo;
                    break;
                }
                i++;
            }
            processStart.destroy();
            inputStream3.close();
            return str;
        }
        processStart.destroy();
        try {
            inputStream3.close();
        } catch (IOException unused5) {
        }
        return "";
    }

    public static long getCurrentThreadId() {
        return Build.VERSION.SDK_INT >= 36 ? Thread.currentThread().threadId() : Thread.currentThread().getId();
    }

    public static int getEventSeqNum() {
        return eventSeqNumber.getAndIncrement();
    }

    public static long getNextTagId() {
        return nextTagId.incrementAndGet();
    }

    @SuppressLint({"DefaultLocale"})
    private static String getThreadId() {
        return String.format("#%d.", Long.valueOf(getCurrentThreadId()));
    }

    public static boolean isIsolatedProcess() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Process.isIsolated();
        }
        try {
            return ((Boolean) Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null)).booleanValue();
        } catch (Exception e) {
            if (!Global.DEBUG) {
                return true;
            }
            zlogD(LOGTAG, "Error occurred determining process isolation state", e);
            return true;
        }
    }

    public static boolean isValidEventName(String str, int i) {
        int length;
        return str != null && (length = str.trim().length()) >= 1 && length <= i;
    }

    private static String parseCpuInfo(String str) {
        String[] strArrSplit;
        String str2;
        String str3;
        if (str != null && (strArrSplit = str.split(Global.COLON)) != null && strArrSplit.length > 1 && (str2 = strArrSplit[0]) != null) {
            if (str2.startsWith("Processor")) {
                String str4 = strArrSplit[1];
                if (str4 == null) {
                    return null;
                }
                return str4.replaceAll(" Processor ", Global.BLANK).trim();
            }
            if (!strArrSplit[0].startsWith("vendor_id") || (str3 = strArrSplit[1]) == null) {
                return null;
            }
            return str3.trim();
        }
        return null;
    }

    public static Float parseFloat(String str, String str2, float f, float f3) {
        Float fValueOf;
        if (str2 == null) {
            return null;
        }
        try {
            fValueOf = Float.valueOf(str2.trim());
            fValueOf.floatValue();
        } catch (NumberFormatException e) {
            if (Global.DEBUG) {
                zlogE(LOGTAG, str, e);
            }
            fValueOf = null;
        }
        if (fValueOf == null || (fValueOf.floatValue() >= f && fValueOf.floatValue() <= f3)) {
            return fValueOf;
        }
        if (!Global.DEBUG) {
            return null;
        }
        zlogD(LOGTAG, str + " value of " + str2 + " is not within the range of " + f + " and " + f3);
        return null;
    }

    public static int parseInt(String str, String str2, int i, int i4, int i6, boolean z4) {
        if (str2 != null && !str2.isEmpty()) {
            try {
                int i10 = Integer.parseInt(str2);
                if (i10 < i) {
                    if (Global.DEBUG) {
                        zlogD(LOGTAG, str + " value of " + str2 + " is not within the range of " + i + " and " + i4);
                    }
                    if (!z4) {
                        return i;
                    }
                } else {
                    if (i10 <= i4) {
                        return i10;
                    }
                    if (Global.DEBUG) {
                        zlogD(LOGTAG, str + " value of " + str2 + " is not within the range of " + i + " and " + i4);
                    }
                    if (!z4) {
                        return i4;
                    }
                }
            } catch (NumberFormatException e) {
                if (Global.DEBUG) {
                    zlogE(LOGTAG, str, e);
                }
            }
        }
        return i6;
    }

    public static Map<String, String> parseKeyValueString(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split("&")) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length != 2) {
                return null;
            }
            map.put(strArrSplit[0], strArrSplit[1]);
        }
        return map;
    }

    public static Long parseLong(String str, String str2, long j, long j6) {
        if (str2 == null) {
            return null;
        }
        try {
            Long lValueOf = Long.valueOf(str2.trim());
            if (lValueOf.longValue() >= j && lValueOf.longValue() <= j6) {
                return lValueOf;
            }
            if (Global.DEBUG) {
                zlogD(LOGTAG, str + " value of " + str2 + " is not within the range of " + j + " and " + j6);
            }
            return null;
        } catch (NumberFormatException e) {
            if (Global.DEBUG) {
                zlogE(LOGTAG, str, e);
            }
            return null;
        }
    }

    public static byte[] readStream(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static void resetEventSeqNum() {
        eventSeqNumber.set(1);
    }

    public static String truncateString(String str, int i) {
        if (str == null) {
            return null;
        }
        return str.length() > i ? str.substring(0, i) : str;
    }

    public static String truncateWebRequest(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(Global.QUESTION);
        if (iIndexOf < 0 || 250 < iIndexOf) {
            iIndexOf = 250;
        }
        return str.length() > iIndexOf ? str.substring(0, iIndexOf) : str;
    }

    public static String urlEncode(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            if (Global.DEBUG) {
                zlogE(LOGTAG, e.toString());
            }
            return str.replaceAll("&", "%26").replaceAll("=", "%3D");
        }
    }

    public static void zlogD(String str, String str2) {
        String strP = s.p(new StringBuilder(), getThreadId(), str2);
        int length = (strP.length() - 1) / 4000;
        int i = 0;
        while (i < length) {
            int i4 = i * 4000;
            i++;
            Log.d(str, strP.substring(i4, i * 4000));
        }
        Log.d(str, strP.substring(i * 4000));
    }

    public static void zlogE(String str, String str2) {
        Log.e(str, getThreadId() + str2);
    }

    public static void zlogI(String str, String str2) {
        Log.i(str, getThreadId() + str2);
    }

    public static void zlogW(String str, String str2) {
        Log.w(str, getThreadId() + str2);
    }

    public static long getThreadId(Thread thread) {
        return Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId();
    }

    public static void zlogE(String str, String str2, Throwable th2) {
        Log.e(str, getThreadId() + str2, th2);
    }

    public static void devLog(String str, String str2, Throwable th2) {
        if (Global.DEBUG) {
            zlogD(str, str2, th2);
        }
    }

    public static void zlogD(String str, String str2, Throwable th2) {
        Log.d(str, getThreadId() + str2, th2);
    }

    public static int parseInt(String str, String str2, int i, int i4, int i6) {
        return parseInt(str, str2, i, i4, i6, false);
    }

    public static int parseInt(Map<String, String> map, String str, int i, int i4, int i6, boolean z4) {
        return parseInt(str, map.get(str), i, i4, i6, z4);
    }

    public static int parseInt(Map<String, String> map, String str, int i, int i4, int i6) {
        return parseInt(str, map.get(str), i, i4, i6);
    }
}
