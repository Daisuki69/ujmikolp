package com.tencent.youtu.sdkkitframework.common;

import android.os.Environment;
import androidx.camera.core.impl.a;
import java.io.File;
import java.io.PrintWriter;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class LogWriter {
    public static final String LOGFILE_TAG_NAME = "logfile";
    public static final String LOG_CONFIGFILE_NAME = "log.properties";
    public static LogWriter logWriter;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PrintWriter f15819b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15820d;

    public LogWriter() throws Exception {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStorageDirectory());
        String str = File.separator;
        this.f15818a = a.p(sb2, str, "NativeLog", str, "default.log");
        a();
    }

    public static synchronized LogWriter getLogWriter() {
        try {
            if (logWriter == null) {
                logWriter = new LogWriter();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return logWriter;
    }

    public static void main(String[] strArr) {
        try {
            LogWriter logWriter2 = getLogWriter("./workspace/temp/logger.log", "./workspace");
            logWriter2.log("First log!");
            logWriter2.log("第二个日志信息");
            logWriter2.log("Third log");
            logWriter2.log("第四个日志信息");
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < 1000000; i++) {
                stringBuffer.append("tableaA|device_number|13701010");
                stringBuffer.append(i);
                stringBuffer.append(";\n");
            }
            String string = stringBuffer.toString();
            long jCurrentTimeMillis = System.currentTimeMillis();
            logWriter2.log(string);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            System.out.println("总消耗时间：" + (jCurrentTimeMillis2 - jCurrentTimeMillis));
            logWriter2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() throws java.lang.Exception {
        /*
            r6 = this;
            java.lang.String r0 = "无法打开属性配置文件: log.properties"
            java.lang.String r1 = "日志文件的位置："
            java.lang.String r2 = "init()"
            java.lang.String r3 = "LogWriter"
            com.tencent.youtu.sdkkitframework.common.YtLogger.d(r3, r2)
            java.io.File r2 = new java.io.File
            java.lang.String r4 = r6.f15820d
            r2.<init>(r4)
            boolean r4 = r2.exists()
            if (r4 != 0) goto L1b
            r2.mkdir()
        L1b:
            java.lang.String r2 = r6.c
            if (r2 != 0) goto L51
            java.util.Properties r2 = new java.util.Properties     // Catch: java.io.IOException -> L43
            r2.<init>()     // Catch: java.io.IOException -> L43
            java.lang.Class r4 = r6.getClass()     // Catch: java.io.IOException -> L43
            java.lang.String r5 = "log.properties"
            java.io.InputStream r4 = r4.getResourceAsStream(r5)     // Catch: java.io.IOException -> L43
            if (r4 == 0) goto L3d
            r2.load(r4)     // Catch: java.io.IOException -> L43
            r4.close()     // Catch: java.io.IOException -> L43
            java.lang.String r4 = "logfile"
            java.lang.String r0 = r2.getProperty(r4)     // Catch: java.io.IOException -> L43
            goto L49
        L3d:
            java.io.PrintStream r2 = java.lang.System.err     // Catch: java.io.IOException -> L43
            r2.println(r0)     // Catch: java.io.IOException -> L43
            goto L48
        L43:
            java.io.PrintStream r2 = java.lang.System.err
            r2.println(r0)
        L48:
            r0 = 0
        L49:
            r6.c = r0
            if (r0 != 0) goto L51
            java.lang.String r0 = r6.f15818a
            r6.c = r0
        L51:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "logFileName: "
            r0.<init>(r2)
            java.lang.String r2 = r6.c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.youtu.sdkkitframework.common.YtLogger.d(r3, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r6.c
            r0.<init>(r2)
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch: java.io.IOException -> L8f
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.io.IOException -> L8f
            r4 = 0
            r3.<init>(r0, r4)     // Catch: java.io.IOException -> L8f
            r4 = 1
            r2.<init>(r3, r4)     // Catch: java.io.IOException -> L8f
            r6.f15819b = r2     // Catch: java.io.IOException -> L8f
            java.io.PrintStream r2 = java.lang.System.out     // Catch: java.io.IOException -> L8f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L8f
            r3.<init>(r1)     // Catch: java.io.IOException -> L8f
            java.lang.String r1 = r0.getAbsolutePath()     // Catch: java.io.IOException -> L8f
            r3.append(r1)     // Catch: java.io.IOException -> L8f
            java.lang.String r1 = r3.toString()     // Catch: java.io.IOException -> L8f
            r2.println(r1)     // Catch: java.io.IOException -> L8f
            return
        L8f:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "无法打开日志文件:"
            r2.<init>(r3)
            java.lang.String r0 = r0.getAbsolutePath()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.common.LogWriter.a():void");
    }

    public void close() {
        logWriter = null;
        PrintWriter printWriter = this.f15819b;
        if (printWriter != null) {
            printWriter.close();
        }
    }

    public synchronized void log(String str) {
        this.f15819b.println(new Date() + ": " + str);
    }

    public synchronized void log(Exception exc) {
        this.f15819b.println(new Date() + ": ");
        exc.printStackTrace(this.f15819b);
    }

    public static synchronized LogWriter getLogWriter(String str, String str2) {
        try {
            if (logWriter == null) {
                logWriter = new LogWriter(str, str2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return logWriter;
    }

    public LogWriter(String str, String str2) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStorageDirectory());
        String str3 = File.separator;
        this.f15818a = a.p(sb2, str3, "NativeLog", str3, "default.log");
        this.f15820d = str2;
        this.c = str;
        a();
    }
}
