package mx_android.support.v4.app;

import android.app.ActivityManager;

/* JADX INFO: loaded from: classes7.dex */
class ActivityManagerCompatKitKat {
    ActivityManagerCompatKitKat() {
    }

    public static boolean isLowRamDevice(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
