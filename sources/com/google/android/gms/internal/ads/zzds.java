package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import com.dynatrace.android.agent.Global;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzds {
    private static final Object zza = new Object();

    public static void zza(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.d(str, zzg(str2, null));
        }
    }

    public static void zzb(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.i(str, zzg(str2, null));
        }
    }

    public static void zzc(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.w(str, zzg(str2, null));
        }
    }

    public static void zzd(@Size(max = 23) String str, String str2, @Nullable Throwable th2) {
        synchronized (zza) {
            Log.w(str, zzg(str2, th2));
        }
    }

    public static void zze(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.e(str, zzg(str2, null));
        }
    }

    public static void zzf(@Size(max = 23) String str, String str2, @Nullable Throwable th2) {
        synchronized (zza) {
            Log.e(str, zzg(str2, th2));
        }
    }

    public static String zzg(String str, @Nullable Throwable th2) {
        String strReplace;
        if (th2 != null) {
            synchronized (zza) {
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strReplace2 = strReplace.replace(Global.NEWLINE, "\n  ");
        int length = String.valueOf(str).length();
        return androidx.camera.core.impl.a.p(new StringBuilder(String.valueOf(strReplace2).length() + length + 3 + 1), str, "\n  ", strReplace2, Global.NEWLINE);
    }
}
