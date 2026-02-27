package com.google.android.gms.ads;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class zzc {
    public static AdSize zza(int i, int i4, String str) {
        return new AdSize(i, i4, str);
    }

    public static AdSize zzb(int i, int i4) {
        AdSize adSize = new AdSize(i, i4);
        adSize.zzc(true);
        adSize.zzd(i4);
        return adSize;
    }

    public static AdSize zzc(int i, int i4) {
        AdSize adSize = new AdSize(i, i4);
        adSize.zzg(true);
        adSize.zzi(i4);
        return adSize;
    }

    public static boolean zzd(AdSize adSize) {
        return adSize.zzf();
    }

    public static int zze(AdSize adSize) {
        return adSize.zzh();
    }

    public static boolean zzf(AdSize adSize) {
        return adSize.zza();
    }

    public static boolean zzg(AdSize adSize) {
        return adSize.zzb();
    }

    public static int zzh(AdSize adSize) {
        return adSize.zze();
    }
}
