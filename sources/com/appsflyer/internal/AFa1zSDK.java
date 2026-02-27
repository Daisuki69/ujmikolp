package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1cSDK;
import dOYHB6.yFtIp6.ht2aO8;

/* JADX INFO: loaded from: classes2.dex */
public final class AFa1zSDK implements AFb1cSDK {

    @VisibleForTesting
    private static IntentFilter valueOf = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    @Override // com.appsflyer.internal.AFb1cSDK
    @NonNull
    public final AFb1cSDK.AFa1vSDK valueOf(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent intentRegisterReceiver = ht2aO8.registerReceiver(context, null, valueOf);
            if (intentRegisterReceiver != null) {
                if (2 == intentRegisterReceiver.getIntExtra("status", -1)) {
                    int intExtra = intentRegisterReceiver.getIntExtra("plugged", -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? "other" : "wireless" : "usb" : "ac";
                } else {
                    str = "no";
                }
                int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("Device that failed to register receiver", th2);
        }
        return new AFb1cSDK.AFa1vSDK(f, str);
    }
}
