package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
class zzw {
    private static final zzw zze = new zzw(true, 3, 1, null, null);
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    private zzw(boolean z4, int i, int i4, String str, Throwable th2) {
        this.zza = z4;
        this.zzd = i;
        this.zzb = str;
        this.zzc = th2;
    }

    @Deprecated
    public static zzw zzb() {
        return zze;
    }

    public static zzw zzc(@NonNull String str) {
        return new zzw(false, 1, 5, str, null);
    }

    public static zzw zzd(@NonNull String str, @NonNull Throwable th2) {
        return new zzw(false, 1, 5, str, th2);
    }

    public static zzw zzf(int i) {
        return new zzw(true, i, 1, null, null);
    }

    public static zzw zzg(int i, int i4, @NonNull String str, Throwable th2) {
        return new zzw(false, i, i4, str, th2);
    }

    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.zzc != null) {
            Log.d("GoogleCertificatesRslt", zza(), this.zzc);
        } else {
            Log.d("GoogleCertificatesRslt", zza());
        }
    }
}
