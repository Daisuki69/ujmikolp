package com.google.android.gms.internal.vision;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes3.dex */
public class zzas {

    @GuardedBy("DirectBootUtils.class")
    private static UserManager zza;
    private static volatile boolean zzb = !zza();

    @GuardedBy("DirectBootUtils.class")
    private static boolean zzc = false;

    private zzas() {
    }

    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @RequiresApi(24)
    @TargetApi(24)
    @GuardedBy("DirectBootUtils.class")
    private static boolean zzb(Context context) {
        boolean z4;
        boolean z5 = true;
        int i = 1;
        while (true) {
            z4 = false;
            if (i > 2) {
                break;
            }
            if (zza == null) {
                zza = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = zza;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z5 = false;
                }
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                zza = null;
                i++;
            }
        }
        z4 = z5;
        if (z4) {
            zza = null;
        }
        return z4;
    }

    @RequiresApi(24)
    @TargetApi(24)
    private static boolean zzc(Context context) {
        if (zzb) {
            return true;
        }
        synchronized (zzas.class) {
            try {
                if (zzb) {
                    return true;
                }
                boolean zZzb = zzb(context);
                if (zZzb) {
                    zzb = zZzb;
                }
                return zZzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean zza(Context context) {
        return !zza() || zzc(context);
    }
}
