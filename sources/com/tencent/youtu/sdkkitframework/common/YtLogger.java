package com.tencent.youtu.sdkkitframework.common;

import We.s;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import com.dynatrace.android.agent.Global;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class YtLogger {
    public static final int DEBUG_LEVEL = 4;
    public static final int ERROR_LEVEL = 0;
    public static final int INFO_LEVEL = 2;
    public static final int ONLINE_LEVEL = -1000;
    public static final int VERB_LEVEL = 5;
    public static final int WARN_LEVEL = 1;
    public static String localLogPath;

    @SuppressLint({"SimpleDateFormat"})
    public static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss.SSS");
    public static IYtLoggerListener loggerListener = null;
    public static boolean needLogFile = false;
    public static String keywords = null;
    public static File localFile = null;
    public static int currentLogLevel = 0;
    public static String lastLogMessage = "";
    public static ExecutorService mExecutorService = Executors.newSingleThreadExecutor();

    public interface IYtLoggerListener {
        void log(String str, String str2);
    }

    public static void buildMessageForLocalLogFile(int i, String str, String str2) {
        int i4;
        if (i == 0 || i == 1 || (i4 = currentLogLevel) == 4 || ((i4 == 2 && i != 4) || (i4 == -1000 && i == -1000))) {
            StringBuffer stringBuffer = new StringBuffer();
            if (i == -1000) {
                stringBuffer.append("[ONLINE]");
            } else if (i == 0) {
                stringBuffer.append("[ERROR]");
            } else if (i == 1) {
                stringBuffer.append("[WARN]");
            } else if (i == 2) {
                stringBuffer.append("[INFO]");
            } else if (i == 4) {
                stringBuffer.append("[DEBUG]");
            } else if (i == 5) {
                stringBuffer.append("[VERB]");
            }
            stringBuffer.append(dateFormat.format(new Date()));
            stringBuffer.append("        ");
            stringBuffer.append(str);
            stringBuffer.append("    ");
            stringBuffer.append(str2);
            save2File(stringBuffer.toString());
        }
    }

    public static void d(String str, Object obj) {
        if (currentLogLevel >= 4) {
            showLog(4, str, "[YTLog]-[DEBUG]-" + obj);
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        int i = currentLogLevel;
        if (i >= 0 || i == -1000) {
            showLog(0, str, "[YTLog]-[ERROR]-" + str2, th2);
        }
    }

    public static File getLogFile(String str) {
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        String str2 = dateFormat.format(new Date()) + ".log";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getPath());
        File file2 = new File(s.p(sb2, File.separator, str2));
        if (!file2.exists()) {
            try {
                file2.createNewFile();
                return file2;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return file2;
    }

    public static void i(String str, String str2) {
        if (currentLogLevel >= 2) {
            showLog(2, str, "[YTLog]-[INFO]-" + str2);
        }
    }

    public static void o(String str, Object obj) {
        int i = currentLogLevel;
        if (i == -1000 || i == 4) {
            showLog(-1000, str, "[YTLog]-[ONLINE]-" + System.currentTimeMillis() + Global.HYPHEN + obj);
        }
    }

    public static void save2File(String str) {
        File file = localFile;
        if (file != null) {
            writeFile(file, str);
        }
    }

    public static void setLogLevel(int i) {
        currentLogLevel = i != -1000 ? Math.min(i, Math.max(i, 0)) : -1000;
    }

    public static void setLoggerListener(IYtLoggerListener iYtLoggerListener) {
        loggerListener = iYtLoggerListener;
    }

    public static void setNeedLogFile(boolean z4, String str, String str2) {
        if (TextUtils.isEmpty(localLogPath)) {
            needLogFile = false;
            w("YTLog", "file saved must put path", null);
            return;
        }
        needLogFile = z4;
        if (z4) {
            keywords = str2;
            localLogPath = str;
            localFile = getLogFile(str);
        }
    }

    public static void showLog(int i, String str, String str2, Throwable th2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str2);
        if (th2 != null) {
            stringBuffer.append(Log.getStackTraceString(th2));
        }
        String string = stringBuffer.toString();
        IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log(str, string);
        }
        String str3 = localLogPath;
        if (str3 != null && !"".equals(str3) && needLogFile) {
            buildMessageForLocalLogFile(i, str, string);
        }
        Log.e(str, string);
    }

    public static void v(String str, Object obj) {
        if (currentLogLevel >= 5) {
            showLog(5, str, "[YTLog]-[VERB]-" + obj);
        }
    }

    public static void w(String str, String str2, Throwable th2) {
        int i = currentLogLevel;
        if (i >= 1 || i == -1000) {
            showLog(1, str, "[YTLog]-[WARN]-" + str2, th2);
        }
    }

    public static void writeFile(final File file, final String str) {
        if (TextUtils.isEmpty(keywords) || !str.contains(keywords)) {
            return;
        }
        mExecutorService.submit(new Runnable() { // from class: com.tencent.youtu.sdkkitframework.common.YtLogger.1
            /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() throws java.lang.Throwable {
                /*
                    r7 = this;
                    r0 = 0
                    java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
                    java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
                    java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
                    java.io.File r4 = r1     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
                    r5 = 1
                    r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
                    r2.<init>(r3)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
                    r1.<init>(r2)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
                    java.lang.String r0 = r2     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
                    r1.println(r0)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
                    r1.flush()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
                    r1.close()
                    return
                L1f:
                    r0 = move-exception
                    goto L32
                L21:
                    r0 = move-exception
                    goto L29
                L23:
                    r1 = move-exception
                    goto L35
                L25:
                    r1 = move-exception
                    r6 = r1
                    r1 = r0
                    r0 = r6
                L29:
                    r0.printStackTrace()     // Catch: java.lang.Throwable -> L1f
                    if (r1 == 0) goto L31
                    r1.close()
                L31:
                    return
                L32:
                    r6 = r1
                    r1 = r0
                    r0 = r6
                L35:
                    if (r0 == 0) goto L3a
                    r0.close()
                L3a:
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.common.YtLogger.AnonymousClass1.run():void");
            }
        });
    }

    public static void setNeedLogFile(boolean z4, String str) {
        setNeedLogFile(z4, str, null);
    }

    public static void showLog(int i, String str, String str2) {
        IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log(str, str2);
        }
        String str3 = localLogPath;
        if (str3 != null && !"".equals(str3) && needLogFile) {
            buildMessageForLocalLogFile(i, str, str2);
        }
        if (lastLogMessage.equals(str2)) {
            return;
        }
        lastLogMessage = str2;
        Log.d(str, str2);
    }
}
