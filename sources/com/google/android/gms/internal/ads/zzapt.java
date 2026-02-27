package com.google.android.gms.internal.ads;

import android.util.Log;
import androidx.camera.core.CameraInfo;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzapt {
    public static final String zza = "Volley";
    public static final boolean zzb = Log.isLoggable("Volley", 2);
    private static final String zzc = zzapt.class.getName();

    public static void zza(String str, Object... objArr) {
        if (zzb) {
            Log.v(zza, zze(str, objArr));
        }
    }

    public static void zzb(String str, Object... objArr) {
        Log.d(zza, zze(str, objArr));
    }

    public static void zzc(String str, Object... objArr) {
        Log.e(zza, zze(str, objArr));
    }

    public static void zzd(Throwable th2, String str, Object... objArr) {
        Log.e(zza, zze(str, objArr), th2);
    }

    private static String zze(String str, Object... objArr) {
        String strQ;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                strQ = CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
                break;
            }
            if (!stackTrace[i].getClassName().equals(zzc)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                strQ = We.s.q(new StringBuilder(androidx.media3.datasource.cache.c.c(1, strSubstring2) + String.valueOf(methodName).length()), strSubstring2, ".", methodName);
                break;
            }
            i++;
        }
        Locale locale = Locale.US;
        long id = Thread.currentThread().getId();
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(id);
        sb2.append("] ");
        sb2.append(strQ);
        return We.s.p(sb2, ": ", str2);
    }
}
