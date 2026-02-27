package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFf1tSDK extends AFf1oSDK {
    public AFf1tSDK(String str, String str2, Runnable runnable) {
        super(str, str2, runnable);
    }

    public static boolean values(@NonNull Context context) {
        if (AFb1wSDK.AFKeystoreWrapper().AFKeystoreWrapper(AFb1wSDK.valueOf(context), false) <= 0) {
            return true;
        }
        AFLogger.afRDLog("Install referrer will not load, the counter > 1, ");
        return false;
    }
}
