package com.tencent.could.aicamare.util;

import android.util.Log;
import com.tencent.could.aicamare.callback.CameraLoggerCallBack;

/* JADX INFO: loaded from: classes4.dex */
public class CameraLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static LOG_LEVEL f15536a = LOG_LEVEL.LEVEL_VERBOSE;

    public enum LOG_LEVEL {
        LEVEL_VERBOSE,
        LEVEL_DEBUG,
        LEVEL_INFO,
        LEVEL_WARN,
        LEVEL_ERROR,
        LEVEL_NONE
    }

    public static void a(String str, String str2, CameraLoggerCallBack cameraLoggerCallBack) {
        if (LOG_LEVEL.LEVEL_DEBUG.compareTo(f15536a) >= 0) {
            a(true, str, str2, cameraLoggerCallBack);
        }
    }

    public static void b(String str, String str2, CameraLoggerCallBack cameraLoggerCallBack) {
        if (LOG_LEVEL.LEVEL_ERROR.compareTo(f15536a) >= 0) {
            a(false, str, str2, cameraLoggerCallBack);
        }
    }

    public static void a(boolean z4, String str, String str2, CameraLoggerCallBack cameraLoggerCallBack) {
        StringBuilder sb2 = new StringBuilder();
        if (z4) {
            sb2.append("[ai-camera-debug]");
        } else {
            sb2.append("[ai-camera-error]");
        }
        sb2.append(str2);
        if (cameraLoggerCallBack != null) {
            cameraLoggerCallBack.logger(str, sb2.toString());
        } else {
            Log.d(str, sb2.toString());
        }
    }
}
